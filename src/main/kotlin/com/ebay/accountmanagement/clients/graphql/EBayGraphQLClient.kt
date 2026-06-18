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

import com.ebay.accountmanagement.configuration.AccountManagementConfiguration
import com.ebay.accountmanagement.configuration.TokenContext
import com.ebay.accountmanagement.exceptions.GraphQLException
import com.ebay.accountmanagement.generated.graphql.UserQuery
import com.ebay.accountmanagement.generated.graphql.UserBiddingActivityQuery
import com.ebay.accountmanagement.generated.graphql.type.UserBiddingActivityInput
import com.apollographql.apollo.ApolloClient
import kotlinx.coroutines.future.future
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import java.util.concurrent.CompletableFuture

/**
 * Typed GraphQL client for eBay Account Management operations.
 * Uses Apollo Kotlin for strongly-typed GraphQL queries.
 */
class EBayGraphQLClient @JvmOverloads constructor(
    private val apolloClient: ApolloClient,
    private val dynamicClient: com.ebay.accountmanagement.clients.graphql.DynamicGraphQLClient,
    private val config: AccountManagementConfiguration,
    private val scope: CoroutineScope = CoroutineScope(Dispatchers.IO)
) {
    /**
     * Retrieve identity information for the authenticated user.
     * Requires: https://api.ebay.com/oauth/api_scope/commerce.identity.readonly
     */
    suspend fun userAsync(accessToken: String? = null): UserQuery.User? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(UserQuery()).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.user
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    /**
     * Retrieve bidding activity for the authenticated user.
     */
    suspend fun userBiddingActivityAsync(
        input: UserBiddingActivityInput,
        accessToken: String? = null
    ): UserBiddingActivityQuery.UserBiddingActivity? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(UserBiddingActivityQuery(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.userBiddingActivity
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    // Java-friendly CompletableFuture variants
    fun userFuture(accessToken: String?) =
        scope.future { userAsync(accessToken) }

    fun userBiddingActivityFuture(input: UserBiddingActivityInput, accessToken: String?) =
        scope.future { userBiddingActivityAsync(input, accessToken) }

    /**
     * Escape hatch for arbitrary GraphQL queries. Use with caution.
     *
     * WARNING: The caller is responsible for ensuring the query string is not constructed
     * from untrusted user input. Passing user-controlled strings here can enable
     * GraphQL injection attacks. Prefer the typed query methods (userAsync, etc.) instead.
     */
    fun executeRawUnsafe(query: String, variables: Any?, accessToken: String?, requestOptions: com.ebay.accountmanagement.configuration.RequestOptions? = null) =
        dynamicClient.executeRawUnsafe(query, variables, accessToken, requestOptions)
}
