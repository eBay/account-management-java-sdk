package com.ebay.accountmanagement.clients.graphql

import com.ebay.accountmanagement.configuration.AccountManagementConfiguration
import com.ebay.accountmanagement.configuration.TokenContext
import okhttp3.Interceptor
import okhttp3.Response

internal class BearerTokenInterceptor(private val config: AccountManagementConfiguration) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val token = TokenContext.CURRENT.get()
            ?: config.accessToken
            ?: error("No access token. Pass accessToken per-call or set AccountManagementConfiguration.accessToken.")
        return chain.proceed(
            chain.request().newBuilder()
                .header("Authorization", "Bearer $token")
                .build()
        )
    }
}
