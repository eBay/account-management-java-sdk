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

    private EBayGraphOperations() {
        // Utility class
    }
}
