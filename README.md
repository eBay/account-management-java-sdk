# eBay Account Management Java SDK

A production-ready Java SDK for eBay Account Management APIs, providing unified access to Sell Account V1, Sell Account V2, and Sell Finances V1 REST APIs plus GraphQL support.

## Features

- **Sell Account V1 API**: Account policies, programs, sales tax, and seller settings (36 operations)
- **Sell Account V2 API**: Rate tables, payout settings, combined shipping rules, and user preferences (14 operations)
- **Sell Finances V1 API**: Transactions, payouts, order earnings, and financial summaries (11 operations)
- **GraphQL Support**: Dynamic client for arbitrary GraphQL queries against the eBay Graph
- **Strong Typing**: Internal Kiota-generated types with public client wrappers
- **Per-call Overrides**: Pass per-request headers and access tokens alongside SDK-wide defaults

## Architecture

```
src/main/java/com/ebay/accountmanagement/
├── generated/                         # Kiota-generated REST clients (internal)
│   ├── sellaccountv1/
│   ├── sellaccountv2/
│   └── sellfinancesv1/
├── clients/
│   ├── rest/
│   │   ├── SellAccountV1Client.java   # REST client wrappers (public API)
│   │   ├── SellAccountV2Client.java
│   │   └── SellFinancesV1Client.java
│   └── graphql/
│       └── DynamicGraphQLClient.java  # GraphQL escape hatch
├── configuration/                     # SDK configuration and auth
├── exceptions/                        # SDK exceptions
└── AccountManagementClient.java       # Main SDK facade
```

## Requirements

- Java 17+
- Gradle

## Installation

```kotlin
dependencies {
    implementation("com.ebay:account-management-java-sdk:1.0.0")
}
```

## Quick Start

```java
var config = new AccountManagementConfiguration();
config.setAccessToken("your-oauth-token");

try (var sdk = new AccountManagementClient(config)) {
    // Sell Account V1
    var policies = sdk.sellAccountV1.getFulfillmentPoliciesAsync("EBAY_US", null, null).join();

    // Sell Account V2
    var shippingRules = sdk.sellAccountV2.getCombinedShippingRulesAsync(null, null).join();

    // Sell Finances
    var payouts = sdk.sellFinances.getPayoutsAsync(null, "20", "0", null, null, null).join();

    // GraphQL
    String query = "query { userBiddingActivity(input: {}) { auctions { itemId } } }";
    JsonNode data = sdk.graphQL.dynamic().executeRawUnsafe(query, null, null, null);
}
```

Per-request headers and tokens can be passed to any method:

```java
var options = new RequestOptions();
options.addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");

sdk.sellAccountV1.getFulfillmentPoliciesAsync("EBAY_US", "per-call-token", options).join();
```

## API Operations

### Sell Account V1 API

| Method | Description |
|---|---|
| `getCustomPoliciesAsync` | Get all custom policies by type |
| `createCustomPolicyAsync` | Create a custom policy |
| `getCustomPolicyAsync` | Get a custom policy by ID |
| `updateCustomPolicyAsync` | Update a custom policy |
| `getFulfillmentPoliciesAsync` | Get all fulfillment policies for a marketplace |
| `createFulfillmentPolicyAsync` | Create a fulfillment policy |
| `getFulfillmentPolicyAsync` | Get a fulfillment policy by ID |
| `updateFulfillmentPolicyAsync` | Update a fulfillment policy |
| `deleteFulfillmentPolicyAsync` | Delete a fulfillment policy |
| `getFulfillmentPolicyByNameAsync` | Get a fulfillment policy by name |
| `getPaymentPoliciesAsync` | Get all payment policies for a marketplace |
| `createPaymentPolicyAsync` | Create a payment policy |
| `getPaymentPolicyAsync` | Get a payment policy by ID |
| `updatePaymentPolicyAsync` | Update a payment policy |
| `deletePaymentPolicyAsync` | Delete a payment policy |
| `getPaymentPolicyByNameAsync` | Get a payment policy by name |
| `getReturnPoliciesAsync` | Get all return policies for a marketplace |
| `createReturnPolicyAsync` | Create a return policy |
| `getReturnPolicyAsync` | Get a return policy by ID |
| `updateReturnPolicyAsync` | Update a return policy |
| `deleteReturnPolicyAsync` | Delete a return policy |
| `getReturnPolicyByNameAsync` | Get a return policy by name |
| `getSalesTaxTableAsync` | Get the sales tax table for a country |
| `getSalesTaxAsync` | Get sales tax for a jurisdiction |
| `createOrReplaceSalesTaxAsync` | Create or replace sales tax for a jurisdiction |
| `deleteSalesTaxAsync` | Delete sales tax for a jurisdiction |
| `bulkCreateOrReplaceSalesTaxAsync` | Bulk create or replace sales tax entries |
| `getAdvertisingEligibilityAsync` | Get advertising eligibility by program type |
| `getKycAsync` | Get KYC status |
| `getPrivilegesAsync` | Get seller selling privileges |
| `getOptedInProgramsAsync` | Get programs the seller is opted into |
| `optInToProgramAsync` | Opt in to a seller program |
| `optOutOfProgramAsync` | Opt out of a seller program |
| `getRateTablesAsync` | Get shipping rate tables |
| `getPaymentsProgramOnboardingAsync` | Get payments program onboarding status |
| `getSubscriptionAsync` | Get store subscription status |

### Sell Account V2 API

| Method | Description |
|---|---|
| `getRateTableAsync` | Get a rate table by ID |
| `updateShippingCostAsync` | Update shipping costs for a rate table |
| `getPayoutSettingsAsync` | Get payout settings |
| `updatePayoutPercentageAsync` | Update payout percentage |
| `getCombinedShippingRulesAsync` | Get combined shipping rules |
| `createCalculatedShippingRulesAsync` | Create calculated shipping rules |
| `createFlatShippingRulesAsync` | Create flat shipping rules |
| `createPromotionalShippingRuleAsync` | Create a promotional shipping rule |
| `updateCalculatedShippingRulesAsync` | Update calculated shipping rules |
| `updateCombinedPaymentsAsync` | Update combined payment rules |
| `updateFlatShippingRulesAsync` | Update flat shipping rules |
| `updatePromotionalShippingRuleAsync` | Update the promotional shipping rule |
| `getUserPreferencesAsync` | Get user preferences |
| `setUserPreferencesAsync` | Set user preferences |

### Sell Finances V1 API

| Method | Description |
|---|---|
| `getBillingActivitiesAsync` | Get billing activities with filtering and pagination |
| `getOrderEarningsAsync` | Get order earnings with filtering and pagination |
| `getOrderEarningsByIdAsync` | Get order earnings for a specific order |
| `getOrderEarningsSummaryAsync` | Get order earnings summary |
| `getPayoutAsync` | Get a specific payout by ID |
| `getPayoutsAsync` | Get payouts with filtering and pagination |
| `getPayoutSummaryAsync` | Get payout summary |
| `getSellerFundsSummaryAsync` | Get seller funds summary |
| `getTransactionsAsync` | Get transactions with filtering and pagination |
| `getTransactionSummaryAsync` | Get transaction summary |
| `getTransferAsync` | Get a specific transfer by ID |

### GraphQL API

```java
String query = """
    query {
      userBiddingActivity(input: {}) {
        auctions {
          itemId
          auctionDataSummary { currentPrice { value currency } }
        }
      }
    }
    """;

JsonNode data = sdk.graphQL.dynamic().executeRawUnsafe(query, null, null, null);
```

> **Warning:** Never interpolate user input directly into the query string — always pass dynamic values through `variables` to avoid GraphQL injection.

## Error Handling

```java
try {
    var policies = sdk.sellAccountV1.getFulfillmentPoliciesAsync("EBAY_US", null, null).join();
} catch (GraphQLException ex) {
    System.err.println("GraphQL errors: " + ex.getErrors());
} catch (AccountManagementException ex) {
    System.err.println("SDK error: " + ex.getMessage());
}
```

## Configuration Options

| Property | Default | Description |
|---|---|---|
| `sellAccountV1BaseUrl` | `https://api.ebay.com/sell/account/v1` | Sell Account V1 base URL |
| `sellAccountV2BaseUrl` | `https://api.ebay.com/sell/account/v2` | Sell Account V2 base URL |
| `sellFinancesV1BaseUrl` | `https://apiz.ebay.com/sell/finances/v1` | Sell Finances V1 base URL |
| `graphQLBaseUrl` | `https://api.ebay.com/graphql` | GraphQL API endpoint |
| `accessToken` | `null` | Static fallback token; per-call token takes precedence |
| `defaultRequestOptions` | `RequestOptions()` | Default headers applied to all SDK calls |
| `diagnosticLogging` | `false` | Enable diagnostic request/response logging |

## Regenerating the SDK

```bash
./generate.sh
./gradlew build
```

## Development

```bash
./gradlew build    # Build
./gradlew test     # Run tests
./gradlew publish  # Publish
```

## Specs

- `sell_account_v1_oas3.yaml` — Sell Account V1
- `sell_account_v2_oas3.yaml` — Sell Account V2
- `sell_finances_v1_oas3.yaml` — Sell Finances V1
- `eBay_Graph.graphqls` — eBay Graph schema

## Dependencies

- **microsoft-kiota-bundle**: REST client generation and runtime
- **apollo-runtime**: Apollo Kotlin GraphQL client
- **okhttp3**: Shared HTTP client
- **jackson-databind**: JSON handling for the dynamic GraphQL client
- **kotlinx-coroutines-jdk8**: Kotlin coroutines / `CompletableFuture` integration
- **slf4j-api**: Logging facade

## License

Apache 2.0 © 2026 eBay Inc. See [LICENSE](LICENSE) for details.
