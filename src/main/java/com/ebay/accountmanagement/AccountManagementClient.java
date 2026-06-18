// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.accountmanagement;

import com.apollographql.apollo.ApolloClient;
import com.ebay.accountmanagement.clients.graphql.ApolloClientFactory;
import com.ebay.accountmanagement.clients.graphql.DynamicGraphQLClient;
import com.ebay.accountmanagement.clients.graphql.EBayGraphQLClient;
import com.ebay.accountmanagement.clients.rest.SellAccountV1Client;
import com.ebay.accountmanagement.clients.rest.SellAccountV2Client;
import com.ebay.accountmanagement.clients.rest.SellFinancesV1Client;
import com.ebay.accountmanagement.configuration.AccountManagementConfiguration;
import com.ebay.accountmanagement.configuration.KiotaAuthProvider;
import com.ebay.accountmanagement.generated.sellaccountv1.SellAccountV1ApiClient;
import com.ebay.accountmanagement.generated.sellaccountv2.SellAccountV2ApiClient;
import com.ebay.accountmanagement.generated.sellfinancesv1.SellFinancesV1ApiClient;
import com.microsoft.kiota.authentication.BaseBearerTokenAuthenticationProvider;
import com.microsoft.kiota.http.OkHttpRequestAdapter;
import okhttp3.OkHttpClient;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/**
 * Main facade for the Account Management SDK.
 * Provides unified access to Sell Account V1, Sell Account V2, Sell Finances V1 APIs, and eBay Graph (GraphQL).
 *
 * <pre>{@code
 * var config = new AccountManagementConfiguration();
 * config.setAccessToken("your-token");
 *
 * try (var sdk = new AccountManagementClient(config)) {
 *     // REST API
 *     var policies = sdk.sellAccountV1.getFulfillmentPoliciesAsync("EBAY_US", null, null).join();
 *
 *     // GraphQL API
 *     var user = sdk.graphQL.userAsync(null, null).join();
 *     System.out.println(user);
 * }
 * }</pre>
 */
public final class AccountManagementClient implements Closeable {
    private final OkHttpClient sharedHttpClient;
    // SEC-004: Apollo OkHttpClient stored as private final field so it can be closed
    private final ApolloClient apolloClient;

    public final SellAccountV1Client sellAccountV1;
    public final SellAccountV2Client sellAccountV2;
    public final SellFinancesV1Client sellFinances;
    public final EBayGraphQLClient graphQL;

    public AccountManagementClient(AccountManagementConfiguration config) {
        // Shared OkHttpClient for all REST clients
        this.sharedHttpClient = new OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build();

        var authProvider = new BaseBearerTokenAuthenticationProvider(new KiotaAuthProvider(config));

        // Sell Account V1 API client
        var sellAccountV1Adapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        sellAccountV1Adapter.setBaseUrl(config.getSellAccountV1BaseUrl());
        this.sellAccountV1 = new SellAccountV1Client(new SellAccountV1ApiClient(sellAccountV1Adapter), config);

        // Sell Account V2 API client
        var sellAccountV2Adapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        sellAccountV2Adapter.setBaseUrl(config.getSellAccountV2BaseUrl());
        this.sellAccountV2 = new SellAccountV2Client(new SellAccountV2ApiClient(sellAccountV2Adapter), config);

        // Sell Finances V1 API client
        var sellFinancesV1Adapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        sellFinancesV1Adapter.setBaseUrl(config.getSellFinancesV1BaseUrl());
        this.sellFinances = new SellFinancesV1Client(new SellFinancesV1ApiClient(sellFinancesV1Adapter), config);

        // GraphQL client with Apollo Kotlin — store as field for proper lifecycle management
        this.apolloClient = ApolloClientFactory.create(sharedHttpClient, config);
        var dynamicClient = new DynamicGraphQLClient(sharedHttpClient, config);
        this.graphQL = new EBayGraphQLClient(apolloClient, dynamicClient, config);
    }

    @Override
    public void close() {
        apolloClient.close();
        sharedHttpClient.dispatcher().executorService().shutdown();
        sharedHttpClient.connectionPool().evictAll();
    }
}
