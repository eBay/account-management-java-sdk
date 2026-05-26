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

package com.ebay.accountmanagement.clients.graphql

import com.apollographql.apollo.ApolloClient
import com.ebay.accountmanagement.configuration.AccountManagementConfiguration
import okhttp3.OkHttpClient

/**
 * Factory for creating configured Apollo GraphQL clients.
 */
object ApolloClientFactory {

    /**
     * Creates an ApolloClient configured for eBay GraphQL API.
     *
     * @param httpClient Shared OkHttpClient instance
     * @param config SDK configuration
     * @return Configured ApolloClient instance
     */
    @JvmStatic
    fun create(httpClient: OkHttpClient, config: AccountManagementConfiguration): ApolloClient {
        val authenticatedClient = httpClient.newBuilder()
            .addInterceptor(BearerTokenInterceptor(config))
            .build()

        return ApolloClient.Builder()
            .serverUrl(config.graphQLBaseUrl)
            .httpEngine(com.apollographql.apollo.network.http.DefaultHttpEngine(authenticatedClient))
            .build()
    }
}
