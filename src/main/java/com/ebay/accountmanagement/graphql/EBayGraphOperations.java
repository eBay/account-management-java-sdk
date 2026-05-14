package com.ebay.accountmanagement.graphql;

/**
 * GraphQL query and mutation constants for eBay Graph API.
 */
public final class EBayGraphOperations {

    public static final String USER = """
        query User {
            user {
                userId
                username
                newUser
                userIdChanged
                userIdLastChangedAt
                userCreatedAt
                registrationMarketPlace
                individualIdentityProfile {
                    email
                    firstName
                    lastName
                    middleName
                    profileAddress {
                        addressLine1
                        addressLine2
                        city
                        stateOrProvince
                        postalCode
                        countryCode
                    }
                    primaryPhone {
                        phoneNumber
                        phoneNumberType
                        countryCode
                        dialCode
                    }
                }
                publicUserProfile {
                    businessName
                    firstName
                    lastName
                    email
                    fax
                    legalInvoiceProvided
                    phone {
                        phoneNumber
                        phoneNumberType
                        countryCode
                        dialCode
                    }
                }
            }
        }
        """;

    public static final String USER_BIDDING_ACTIVITY = """
        query UserBiddingActivity($input: UserBiddingActivityInput!) {
            userBiddingActivity(input: $input) {
                auctions {
                    itemId
                    auctionDataSummary {
                        leadingBid {
                            bidAmount {
                                original {
                                    currency
                                    value
                                }
                                converted {
                                    currency
                                    value
                                }
                            }
                            bidder {
                                userId
                            }
                        }
                    }
                }
                paginationOutput {
                    nextCursor
                    previousCursor
                }
            }
        }
        """;

    public static final String ADD_TO_WATCH_LIST = """
        mutation AddToWatchList($input: AddToWatchListInput!) {
            addToWatchList(input: $input) {
                __typename
                ... on AddToWatchListFailure {
                    errorCode
                    errorMessage
                    failedItems {
                        item {
                            itemId
                        }
                        reason
                    }
                    watchListCount
                    watchListMaximum
                }
                ... on AddToWatchListPartialFailure {
                    addedItems {
                        itemId
                    }
                    errorCode
                    failedItems {
                        item {
                            itemId
                        }
                        reason
                    }
                    errorMessage
                    watchListCount
                    watchListMaximum
                }
                ... on AddToWatchListSuccess {
                    addedItems {
                        itemId
                    }
                    watchListCount
                    watchListMaximum
                }
            }
        }
        """;

    public static final String CREATE_OR_REPLACE_USER_NOTE = """
        mutation CreateOrReplaceUserNote($input: CreateOrReplaceUserNoteInput) {
            createOrReplaceUserNote(input: $input) {
                __typename
                ... on CreateOrReplaceUserNoteSuccess {
                    userNote {
                        note
                        orderLineItemId
                    }
                }
                ... on ReferenceArgumentsNotFound {
                    argumentNames
                    errorCode
                    errorMessage
                }
            }
        }
        """;

    public static final String DELETE_USER_NOTE = """
        mutation DeleteUserNote($input: DeleteUserNoteInput) {
            deleteUserNote(input: $input) {
                __typename
                ... on DeleteUserNoteSuccess {
                    userNote {
                        note
                        orderLineItemId
                    }
                }
                ... on ReferenceArgumentsNotFound {
                    argumentNames
                    errorCode
                    errorMessage
                }
            }
        }
        """;

    public static final String ITEM_BIDDING_ACTIVITY = """
        query ItemBiddingActivity($input: ItemBiddingActivityInput!, $activeBidHistoryRecords_paginationInput: PageInfoInput, $cancelledBidHistoryRecords_paginationInput: PageInfoInput, $retractedBidHistoryRecords_paginationInput: PageInfoInput) {
            itemBiddingActivity(input: $input) {
                itemBiddingActivity {
                    activeBidHistoryRecords(paginationInput: $activeBidHistoryRecords_paginationInput) {
                        bidHistoryRecords {
                            bidAmount {
                                converted {
                                    currency
                                    value
                                }
                                original {
                                    currency
                                    value
                                }
                            }
                        }
                        paginationOutput {
                            nextCursor
                            previousCursor
                        }
                    }
                    cancelledBidHistoryRecords(paginationInput: $cancelledBidHistoryRecords_paginationInput) {
                        paginationOutput {
                            nextCursor
                            previousCursor
                        }
                        bidHistoryRecords {
                            bidder {
                                userId
                                username
                            }
                            bidAmount {
                                converted {
                                    currency
                                    value
                                }
                                original {
                                    currency
                                    value
                                }
                            }
                        }
                    }
                    retractedBidHistoryRecords(paginationInput: $retractedBidHistoryRecords_paginationInput) {
                        paginationOutput {
                            nextCursor
                            previousCursor
                        }
                        bidHistoryRecords {
                            bidAmount {
                                converted {
                                    currency
                                    value
                                }
                                original {
                                    currency
                                    value
                                }
                            }
                        }
                    }
                    leadingBid {
                        buyerBiddingSummary {
                            bidsWithSellerPercentage
                            itemBids {
                                bidCount
                                mostRecentBidAt
                            }
                            totalBidCount
                            retractedBidCount
                            uniqueListingCategoryBidCount
                            uniqueSellerBidCount
                        }
                        bidder {
                            username
                            userId
                            shippingZone {
                                countryCode
                                postalCode
                                stateOrProvince
                            }
                        }
                        bidAmount {
                            converted {
                                currency
                                value
                            }
                            original {
                                currency
                                value
                            }
                        }
                        bidMetadata {
                            placedAt
                        }
                    }
                    reservePriceMet
                    bidStatistics {
                        userSubmittedBidCount
                    }
                }
            }
        }
        """;

    public static final String REMOVE_ALL_FROM_WATCH_LIST = """
        mutation RemoveAllFromWatchList {
            removeAllFromWatchList {
                __typename
                ... on RemoveAllFromWatchListSuccess {
                    numberOfItemsUnwatched
                }
            }
        }
        """;

    public static final String REMOVE_FROM_WATCH_LIST = """
        mutation RemoveFromWatchList($input: RemoveFromWatchListInput!) {
            removeFromWatchList(input: $input) {
                __typename
                ... on RemoveFromWatchListFailure {
                    errorCode
                    failedItems {
                        item {
                            itemId
                        }
                        reason
                    }
                    errorMessage
                    watchListCount
                    watchListMaximum
                }
                ... on RemoveFromWatchListPartialFailure {
                    errorCode
                    errorMessage
                    failedItems {
                        item {
                            itemId
                        }
                        reason
                    }
                    numberOfItemsUnwatched
                    removedItems {
                        itemId
                    }
                    watchListCount
                    watchListMaximum
                }
                ... on RemoveFromWatchListSuccess {
                    numberOfItemsUnwatched
                    watchListCount
                    removedItems {
                        itemId
                    }
                    watchListMaximum
                }
            }
        }
        """;

    public static final String USER_CUSTOM_LISTS = """
        query UserCustomLists($input: UserCustomListsInput) {
            userCustomLists(input: $input) {
                __typename
                ... on UserCustomListsFailure {
                    errorCode
                    errorMessage
                    failedCustomLists {
                        customListId
                        reason
                    }
                }
                ... on UserCustomListsPartialFailure {
                    customLists {
                        customListId
                        itemCount
                        items {
                            pagination {
                                nextCursor
                                previousCursor
                            }
                            results {
                                addedAt
                                item {
                                    itemId
                                }
                            }
                        }
                        name
                    }
                    errorCode
                    errorMessage
                    failedCustomLists {
                        customListId
                        reason
                    }
                    totalCount
                }
                ... on UserCustomListsSuccess {
                    customLists {
                        customListId
                        itemCount
                        items {
                            pagination {
                                nextCursor
                                previousCursor
                            }
                            results {
                                addedAt
                                item {
                                    itemId
                                }
                            }
                        }
                        name
                    }
                    totalCount
                }
            }
        }
        """;

    public static final String USER_WATCH_LIST = """
        query UserWatchList($input: UserWatchListInput) {
            userWatchList(input: $input) {
                items {
                    item {
                        itemId
                        userNotes {
                            note
                            orderLineItemId
                        }
                    }
                    startedWatchingAt
                    startedWatchingPrice {
                        original {
                            currency
                            value
                        }
                    }
                }
                pagination {
                    nextCursor
                    previousCursor
                }
                watchListCount
                watchListMaximum
            }
        }
        """;

    private EBayGraphOperations() {
        // Utility class
    }
}
