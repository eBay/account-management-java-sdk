# ChangeLog

## 0.3.0 (11/26/2026)

### Added

- Local mock servers: a base URL may use plain `http` when its host is a loopback host (`127.0.0.1`, `::1` or `localhost`) that you also pass in `allowedHosts`, for example `List.of("127.0.0.1")`. Every other host still requires `https`. `AccountManagementConfiguration.LOOPBACK_HOSTS` lists the loopback hosts.

### Changed

- Updated the `account-v1` OpenAPI document to the latest definitions.
- Updated the GraphQL schema to the latest definitions.
- `AccountManagementConfiguration.isTrustedUrl` and the auth provider and GraphQL clients apply the same rule.
- Hosts are compared lowercased and without IPv6 brackets, so `[::1]` and `::1` match.
- A rejected base URL now says whether the scheme or the host is not trusted.

## 0.2.3 (10/28/2026)

### Dependencies

- Bumped `com.fasterxml.jackson.core:jackson-databind` from 2.22.3 to 2.22.4 to fix CVE-2026-110879 (GHSA-m8xf-2cr7-77ph), a critical `PolymorphicTypeValidator` bypass via generic type arguments that allows arbitrary class instantiation.

## 0.2.2 (10/14/2026)

### Dependencies

- DCCOMICS-21031: Bumped transitive `com.google.guava:guava` from 33.4.0-jre to 33.7.2-jre for Error Prone and NullAway to fix CVE-2026-102554 (SNYK-JAVA-COMGOOGLEGUAVA-20825054), an allocation of resources without limits vulnerability during deserialization.

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
