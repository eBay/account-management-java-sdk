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
