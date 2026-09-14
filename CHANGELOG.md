# ChangeLog

## 1.0.0 (09/14/2026)

**Breaking changes**
- The following clients were removed:
  - `SellAccountV1Client`
  - `SellAccountV2Client`
  - `SellFinancesV1Client`
- The following members were removed from `AccountManagementClient`:
  - `sellAccountV1`
  - `sellAccountV2`
  - `sellFinances`

- The following clients were added:
  - `AccountV1Client`
  - `AccountV2Client`
  - `FinancesClient`
- The following operations were added to `EBayGraphQLClient`:
  - `addToWatchListAsync`
  - `createOrReplaceUserNoteAsync`
  - `deleteUserNoteAsync`
  - `itemBiddingActivityAsync`
  - `removeAllFromWatchListAsync`
  - `removeFromWatchListAsync`
  - `userCustomListsAsync`
  - `userWatchListAsync`
- The following members were added to `AccountManagementClient`:
  - `accountV1`
  - `accountV2`
  - `finances`
