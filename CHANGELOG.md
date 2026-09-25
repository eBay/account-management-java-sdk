# ChangeLog

## 0.2.1 (09/25/2026)

### Dependencies

- Bumped `com.fasterxml.jackson.core:jackson-databind` from 2.22.2 to 2.22.3.


## 0.2.0 (09/14/2026)

### Breaking changes

#### Renamed clients and members

| Previous | Current |
| --- | --- |
| `SellAccountV1Client` | `AccountV1Client` |
| `SellAccountV2Client` | `AccountV2Client` |
| `SellFinancesV1Client` | `FinancesClient` |
| `AccountManagementClient.sellAccountV1` | `AccountManagementClient.accountV1` |
| `AccountManagementClient.sellAccountV2` | `AccountManagementClient.accountV2` |
| `AccountManagementClient.sellFinances` | `AccountManagementClient.finances` |

The renamed `AccountV1Client` also renames operations that retain the same generated request path:

| Previous | Current |
| --- | --- |
| `getKycAsync` | `getKYCAsync` |
| `getSalesTaxTableAsync` | `getSalesTaxesAsync` |

#### Changed signatures

`AccountV2Client`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `setUserPreferencesAsync` | `(UntypedNode body, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` | `(SetUserPreferencesRequest body, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |

`FinancesClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `getOrderEarningsAsync` | `(String filter, String limit, String offset, String sort, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` | `(String[] filter, Integer limit, Integer offset, String[] sort, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |
| `getOrderEarningsSummaryAsync` | `(String filter, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` | `(String[] filter, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |
| `getPayoutsAsync` | `(String filter, String limit, String offset, String sort, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` | `(String[] filter, Integer limit, Integer offset, String[] sort, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |
| `getPayoutSummaryAsync` | `(String filter, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` | `(String[] filter, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |
| `getTransactionsAsync` | `(String filter, String limit, String offset, String sort, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` | `(String[] filter, Integer limit, Integer offset, String[] sort, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |
| `getTransactionSummaryAsync` | `(String filter, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` | `(String[] filter, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |

### Added

- `AccountV1Client.getPaymentsProgramAsync`.
#### `EBayGraphQLClient`

- `addToWatchListAsync`
- `createOrReplaceUserNoteAsync`
- `deleteUserNoteAsync`
- `itemBiddingActivityAsync`
- `removeAllFromWatchListAsync`
- `removeFromWatchListAsync`
- `userCustomListsAsync`
- `userWatchListAsync`