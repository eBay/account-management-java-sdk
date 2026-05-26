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
import com.ebay.accountmanagement.generated.sellaccountv2.SellAccountV2ApiClient;
import com.ebay.accountmanagement.generated.sellaccountv2.models.*;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Sell Account V2 API.
 * Provides methods to manage shipping rules, rate tables, payout settings, and user preferences.
 */
public final class SellAccountV2Client {
    private final SellAccountV2ApiClient kiota;
    private final AccountManagementConfiguration config;

    public SellAccountV2Client(SellAccountV2ApiClient kiota, AccountManagementConfiguration config) {
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

    // ── Rate Table ────────────────────────────────────────────────────────

    /**
     * Get a rate table by ID.
     */
    public CompletableFuture<RateTableDetails> getRateTableAsync(
            String rateTableId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.rateTable().byRate_table_id(rateTableId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Update shipping cost for a rate table.
     */
    public CompletableFuture<Void> updateShippingCostAsync(
            String rateTableId, RateTableUpdate body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.rateTable().byRate_table_id(rateTableId).updateShippingCost().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    // ── Payout Settings ───────────────────────────────────────────────────

    /**
     * Get payout settings.
     */
    public CompletableFuture<PayoutSettingsResponse> getPayoutSettingsAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.payoutSettings().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Update payout percentage.
     */
    public CompletableFuture<Void> updatePayoutPercentageAsync(
            UpdatePayoutPercentageRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.payoutSettings().updatePercentage().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    // ── Combined Shipping Rules ───────────────────────────────────────────

    /**
     * Create calculated shipping rules.
     */
    public CompletableFuture<Void> createCalculatedShippingRulesAsync(
            CreateCalculatedShippingRulesRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.combinedShippingRules().createCalculatedShippingRules().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    /**
     * Create flat shipping rules.
     */
    public CompletableFuture<Void> createFlatShippingRulesAsync(
            CreateFlatShippingRulesRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.combinedShippingRules().createFlatShippingRules().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    /**
     * Create promotional shipping rule.
     */
    public CompletableFuture<Void> createPromotionalShippingRuleAsync(
            CreatePromotionalShippingRuleRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.combinedShippingRules().createPromotionalShippingRule().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    /**
     * Get combined shipping rules.
     */
    public CompletableFuture<GetCombinedShippingRulesPublicApiResponse> getCombinedShippingRulesAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.combinedShippingRules().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Update calculated shipping rules.
     */
    public CompletableFuture<Void> updateCalculatedShippingRulesAsync(
            UpdateCalculatedShippingRulesRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.combinedShippingRules().updateCalculatedShippingRules().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    /**
     * Update combined payments.
     */
    public CompletableFuture<Void> updateCombinedPaymentsAsync(
            UpdateCombinedPaymentsRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.combinedShippingRules().updateCombinedPayments().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    /**
     * Update flat shipping rules.
     */
    public CompletableFuture<Void> updateFlatShippingRulesAsync(
            UpdateFlatShippingRulesRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.combinedShippingRules().updateFlatShippingRules().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    /**
     * Update promotional shipping rule.
     */
    public CompletableFuture<Void> updatePromotionalShippingRuleAsync(
            UpdatePromotionalShippingRuleRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.combinedShippingRules().updatePromotionalShippingRule().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    // ── User Preferences ──────────────────────────────────────────────────

    /**
     * Get user preferences.
     */
    public CompletableFuture<GetUserPreferencesResponse> getUserPreferencesAsync(
            String fieldgroups, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.userPreferences().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (fieldgroups != null) {
                    config.queryParameters.fieldgroups = fieldgroups;
                }
            });
        });
    }

    /**
     * Set user preferences.
     */
    public CompletableFuture<Void> setUserPreferencesAsync(
            UntypedNode body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.userPreferences().patch(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }
}
