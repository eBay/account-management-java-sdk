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

import com.ebay.accountmanagement.clients.graphql.ApolloClientFactory;
import com.ebay.accountmanagement.clients.graphql.BearerTokenInterceptor;
import com.ebay.accountmanagement.clients.graphql.DynamicGraphQLClient;
import com.ebay.accountmanagement.clients.graphql.EBayGraphQLClient;
import com.ebay.accountmanagement.clients.rest.AccountV1Client;
import com.ebay.accountmanagement.clients.rest.AccountV2Client;
import com.ebay.accountmanagement.clients.rest.FinancesClient;
import com.ebay.accountmanagement.configuration.KiotaAuthProvider;
import com.ebay.accountmanagement.configuration.AccountManagementConfiguration;
import com.ebay.accountmanagement.generated.accountv1.AccountV1ApiClient;
import com.ebay.accountmanagement.generated.accountv2.AccountV2ApiClient;
import com.ebay.accountmanagement.generated.finances.FinancesApiClient;
import com.microsoft.kiota.authentication.BaseBearerTokenAuthenticationProvider;
import com.microsoft.kiota.http.OkHttpRequestAdapter;
import okhttp3.OkHttpClient;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/**
 * Main facade for the Account Management SDK.
 */
public final class AccountManagementClient implements Closeable {
    private final OkHttpClient sharedHttpClient;
    private final OkHttpClient apolloHttpClient;

    public final AccountV1Client accountV1;
    public final AccountV2Client accountV2;
    public final FinancesClient finances;
    public final EBayGraphQLClient graphQL;

    public AccountManagementClient(AccountManagementConfiguration config) {
        this.sharedHttpClient = new OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build();

        var authProvider = new BaseBearerTokenAuthenticationProvider(new KiotaAuthProvider(config));

        var accountV1Adapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        accountV1Adapter.setBaseUrl(config.getAccountV1BaseUrl());
        this.accountV1 = new AccountV1Client(new AccountV1ApiClient(accountV1Adapter), config);

        var accountV2Adapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        accountV2Adapter.setBaseUrl(config.getAccountV2BaseUrl());
        this.accountV2 = new AccountV2Client(new AccountV2ApiClient(accountV2Adapter), config);

        var financesAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        financesAdapter.setBaseUrl(config.getFinancesBaseUrl());
        this.finances = new FinancesClient(new FinancesApiClient(financesAdapter), config);

        this.apolloHttpClient = new OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .addInterceptor(new BearerTokenInterceptor(config))
            .build();
        var apolloClient = ApolloClientFactory.create(
            config.getGraphQLBaseUrl(),
            apolloHttpClient
        );

        this.graphQL = new EBayGraphQLClient(
            apolloClient,
            new DynamicGraphQLClient(sharedHttpClient, config),
            config
        );
    }

    @Override
    public void close() {
        sharedHttpClient.dispatcher().executorService().shutdown();
        sharedHttpClient.connectionPool().evictAll();
        apolloHttpClient.dispatcher().executorService().shutdown();
        apolloHttpClient.connectionPool().evictAll();
    }
}
