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
import com.ebay.accountmanagement.configuration.RequestOptions
import com.ebay.accountmanagement.exceptions.GraphQLException
import com.ebay.accountmanagement.generated.graphql.*
import com.ebay.accountmanagement.generated.graphql.type.*
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Optional
import kotlinx.coroutines.future.future
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

class EBayGraphQLClient @JvmOverloads internal constructor(
    private val apolloClient: ApolloClient,
    private val dynamicClient: DynamicGraphQLClient,
    private val config: AccountManagementConfiguration,
    private val scope: CoroutineScope = CoroutineScope(Dispatchers.IO)
) {

    suspend fun addToWatchListAsync(
        input: AddToWatchListInput,
        accessToken: String? = null
    ): AddToWatchListMutation.AddToWatchList? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(AddToWatchListMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.addToWatchList
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun createOrReplaceUserNoteAsync(
        input: CreateOrReplaceUserNoteInput?,
        accessToken: String? = null
    ): CreateOrReplaceUserNoteMutation.CreateOrReplaceUserNote? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(CreateOrReplaceUserNoteMutation(Optional.presentIfNotNull(input))).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.createOrReplaceUserNote
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun deleteUserNoteAsync(
        input: DeleteUserNoteInput?,
        accessToken: String? = null
    ): DeleteUserNoteMutation.DeleteUserNote? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(DeleteUserNoteMutation(Optional.presentIfNotNull(input))).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.deleteUserNote
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun itemBiddingActivityAsync(
        input: ItemBiddingActivityInput,
        activeBidHistoryRecords_paginationInput: PageInfoInput?,
        cancelledBidHistoryRecords_paginationInput: PageInfoInput?,
        retractedBidHistoryRecords_paginationInput: PageInfoInput?,
        accessToken: String? = null
    ): ItemBiddingActivityQuery.ItemBiddingActivity? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(ItemBiddingActivityQuery(input, Optional.presentIfNotNull(activeBidHistoryRecords_paginationInput), Optional.presentIfNotNull(cancelledBidHistoryRecords_paginationInput), Optional.presentIfNotNull(retractedBidHistoryRecords_paginationInput))).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.itemBiddingActivity
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun removeAllFromWatchListAsync(
        accessToken: String? = null
    ): RemoveAllFromWatchListMutation.RemoveAllFromWatchList? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(RemoveAllFromWatchListMutation()).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.removeAllFromWatchList
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun removeFromWatchListAsync(
        input: RemoveFromWatchListInput,
        accessToken: String? = null
    ): RemoveFromWatchListMutation.RemoveFromWatchList? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(RemoveFromWatchListMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.removeFromWatchList
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun userAsync(
        accessToken: String? = null
    ): UserQuery.User? {
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

    suspend fun userCustomListsAsync(
        input: UserCustomListsInput?,
        accessToken: String? = null
    ): UserCustomListsQuery.UserCustomLists? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(UserCustomListsQuery(Optional.presentIfNotNull(input))).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.userCustomLists
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun userWatchListAsync(
        input: UserWatchListInput?,
        accessToken: String? = null
    ): UserWatchListQuery.UserWatchList? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(UserWatchListQuery(Optional.presentIfNotNull(input))).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.userWatchList
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    fun addToWatchListFuture(input: AddToWatchListInput, accessToken: String?) =
        scope.future { addToWatchListAsync(input, accessToken) }

    fun createOrReplaceUserNoteFuture(input: CreateOrReplaceUserNoteInput?, accessToken: String?) =
        scope.future { createOrReplaceUserNoteAsync(input, accessToken) }

    fun deleteUserNoteFuture(input: DeleteUserNoteInput?, accessToken: String?) =
        scope.future { deleteUserNoteAsync(input, accessToken) }

    fun itemBiddingActivityFuture(input: ItemBiddingActivityInput, activeBidHistoryRecords_paginationInput: PageInfoInput?, cancelledBidHistoryRecords_paginationInput: PageInfoInput?, retractedBidHistoryRecords_paginationInput: PageInfoInput?, accessToken: String?) =
        scope.future { itemBiddingActivityAsync(input, activeBidHistoryRecords_paginationInput, cancelledBidHistoryRecords_paginationInput, retractedBidHistoryRecords_paginationInput, accessToken) }

    fun removeAllFromWatchListFuture(accessToken: String?) =
        scope.future { removeAllFromWatchListAsync(accessToken) }

    fun removeFromWatchListFuture(input: RemoveFromWatchListInput, accessToken: String?) =
        scope.future { removeFromWatchListAsync(input, accessToken) }

    fun userFuture(accessToken: String?) =
        scope.future { userAsync(accessToken) }

    fun userBiddingActivityFuture(input: UserBiddingActivityInput, accessToken: String?) =
        scope.future { userBiddingActivityAsync(input, accessToken) }

    fun userCustomListsFuture(input: UserCustomListsInput?, accessToken: String?) =
        scope.future { userCustomListsAsync(input, accessToken) }

    fun userWatchListFuture(input: UserWatchListInput?, accessToken: String?) =
        scope.future { userWatchListAsync(input, accessToken) }

    /**
     * Execute an arbitrary GraphQL query or mutation (escape hatch).
     *
     * **WARNING — GraphQL injection risk.** Never interpolate user-supplied input
     * directly into the query string. Always pass dynamic values via [variables]
     * so the server handles escaping.
     */
    fun executeRawUnsafe(
        query: String,
        variables: Any?,
        accessToken: String?,
        requestOptions: RequestOptions? = null
    ) = dynamicClient.executeRawUnsafe(query, variables, accessToken, requestOptions)
}
