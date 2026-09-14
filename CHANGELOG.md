# ChangeLog

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
| `setUserPreferencesAsync` | `(UntypedNode, String, String, RequestOptions)` | `(SetUserPreferencesRequest, String, String, RequestOptions)` |

`FinancesClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `getOrderEarningsAsync` | `(String, String, String, String, String, String, RequestOptions)` | `(String[], Integer, Integer, String[], String, String, RequestOptions)` |
| `getOrderEarningsSummaryAsync` | `(String, String, String, RequestOptions)` | `(String[], String, String, RequestOptions)` |
| `getPayoutsAsync` | `(String, String, String, String, String, String, RequestOptions)` | `(String[], Integer, Integer, String[], String, String, RequestOptions)` |
| `getPayoutSummaryAsync` | `(String, String, String, RequestOptions)` | `(String[], String, String, RequestOptions)` |
| `getTransactionsAsync` | `(String, String, String, String, String, String, RequestOptions)` | `(String[], Integer, Integer, String[], String, String, RequestOptions)` |
| `getTransactionSummaryAsync` | `(String, String, String, RequestOptions)` | `(String[], String, String, RequestOptions)` |

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
