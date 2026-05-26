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

package com.ebay.accountmanagement.clients.rest;

import com.ebay.accountmanagement.configuration.AccountManagementConfiguration;
import com.ebay.accountmanagement.configuration.RequestOptions;
import com.ebay.accountmanagement.configuration.TokenContext;
import com.ebay.accountmanagement.generated.sellfinancesv1.SellFinancesV1ApiClient;
import com.ebay.accountmanagement.generated.sellfinancesv1.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Sell Finances V1 API.
 * Provides methods to retrieve financial data including transactions, payouts, and earnings.
 */
public final class SellFinancesV1Client {
    private final SellFinancesV1ApiClient kiota;
    private final AccountManagementConfiguration config;

    public SellFinancesV1Client(SellFinancesV1ApiClient kiota, AccountManagementConfiguration config) {
        this.kiota = kiota;
        this.config = config;
    }

    /**
     * Merges default headers from config with per-call headers.
     * Per-call headers override defaults.
     */
    private Map<String, String> mergedHeaders(RequestOptions requestOptions) {
        Map<String, String> headers = new HashMap<>(config.getDefaultRequestOptions().getHeaders());
        if (requestOptions != null) {
            headers.putAll(requestOptions.getHeaders());
        }
        return headers;
    }

    // ── Billing Activity ──────────────────────────────────────────────────

    /**
     * Get billing activities.
     */
    public CompletableFuture<BillingActivityResponse> getBillingActivitiesAsync(
            String filter, String limit, String offset, String sort, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.billingActivity().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) {
                    config.queryParameters.filter = filter;
                }
                if (limit != null) {
                    config.queryParameters.limit = limit;
                }
                if (offset != null) {
                    config.queryParameters.offset = offset;
                }
                if (sort != null) {
                    config.queryParameters.sort = sort;
                }
            });
        });
    }

    // ── Order Earnings ────────────────────────────────────────────────────

    /**
     * Get order earnings.
     */
    public CompletableFuture<OrderEarnings> getOrderEarningsAsync(
            String filter, String limit, String offset, String sort, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.orderEarnings().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) {
                    config.queryParameters.filter = filter;
                }
                if (limit != null) {
                    config.queryParameters.limit = limit;
                }
                if (offset != null) {
                    config.queryParameters.offset = offset;
                }
                if (sort != null) {
                    config.queryParameters.sort = sort;
                }
            });
        });
    }

    /**
     * Get order earnings by ID.
     */
    public CompletableFuture<OrderEarning> getOrderEarningsByIdAsync(
            String orderId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.orderEarnings().byOrder_id(orderId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Get order earnings summary.
     */
    public CompletableFuture<OrderEarningsSummary> getOrderEarningsSummaryAsync(
            String filter, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.orderEarningsSummary().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) {
                    config.queryParameters.filter = filter;
                }
            });
        });
    }

    // ── Payout ────────────────────────────────────────────────────────────

    /**
     * Get a payout by ID.
     */
    public CompletableFuture<Payout> getPayoutAsync(
            String payoutId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.payout().byPayout_Id(payoutId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Get payouts.
     */
    public CompletableFuture<Payouts> getPayoutsAsync(
            String filter, String limit, String offset, String sort, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.payout().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) {
                    config.queryParameters.filter = filter;
                }
                if (limit != null) {
                    config.queryParameters.limit = limit;
                }
                if (offset != null) {
                    config.queryParameters.offset = offset;
                }
                if (sort != null) {
                    config.queryParameters.sort = sort;
                }
            });
        });
    }

    /**
     * Get payout summary.
     */
    public CompletableFuture<PayoutSummaryResponse> getPayoutSummaryAsync(
            String filter, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.payoutSummary().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) {
                    config.queryParameters.filter = filter;
                }
            });
        });
    }

    // ── Seller Funds Summary ──────────────────────────────────────────────

    /**
     * Get seller funds summary.
     */
    public CompletableFuture<SellerFundsSummaryResponse> getSellerFundsSummaryAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.sellerFundsSummary().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    // ── Transactions ──────────────────────────────────────────────────────

    /**
     * Get transactions.
     */
    public CompletableFuture<Transactions> getTransactionsAsync(
            String filter, String limit, String offset, String sort, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.transaction().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) {
                    config.queryParameters.filter = filter;
                }
                if (limit != null) {
                    config.queryParameters.limit = limit;
                }
                if (offset != null) {
                    config.queryParameters.offset = offset;
                }
                if (sort != null) {
                    config.queryParameters.sort = sort;
                }
            });
        });
    }

    /**
     * Get transaction summary.
     */
    public CompletableFuture<TransactionSummaryResponse> getTransactionSummaryAsync(
            String filter, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.transactionSummary().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) {
                    config.queryParameters.filter = filter;
                }
            });
        });
    }

    // ── Transfer ──────────────────────────────────────────────────────────

    /**
     * Get a transfer by ID.
     */
    public CompletableFuture<Transfer> getTransferAsync(
            String transferId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.transfer().byTransfer_Id(transferId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }
}
