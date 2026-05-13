package com.ebay.accountmanagement.clients.rest;

import com.ebay.accountmanagement.configuration.AccountManagementConfiguration;
import com.ebay.accountmanagement.configuration.RequestOptions;
import com.ebay.accountmanagement.configuration.TokenContext;
import com.ebay.accountmanagement.generated.sellaccountv1.SellAccountV1ApiClient;
import com.ebay.accountmanagement.generated.sellaccountv1.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Sell Account V1 API.
 * Provides methods to manage account policies, programs, and settings.
 */
public final class SellAccountV1Client {
    private final SellAccountV1ApiClient kiota;
    private final AccountManagementConfiguration config;

    public SellAccountV1Client(SellAccountV1ApiClient kiota, AccountManagementConfiguration config) {
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

    // ── Custom Policy ─────────────────────────────────────────────────────

    /**
     * Get custom policies for the authenticated seller.
     */
    public CompletableFuture<CustomPolicyResponse> getCustomPoliciesAsync(
            String policyTypes, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.customPolicy().emptyPathSegment().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (policyTypes != null) {
                    config.queryParameters.policyTypes = policyTypes;
                }
            });
        });
    }

    /**
     * Create a new custom policy.
     */
    public CompletableFuture<com.ebay.accountmanagement.generated.sellaccountv1.custom_policy.PostResponse> createCustomPolicyAsync(
            CustomPolicyCreateRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.customPolicy().emptyPathSegment().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Get a specific custom policy by ID.
     */
    public CompletableFuture<CustomPolicy> getCustomPolicyAsync(
            String customPolicyId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.customPolicy().byCustom_policy_id(customPolicyId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Update a custom policy.
     */
    public CompletableFuture<Void> updateCustomPolicyAsync(
            String customPolicyId, CustomPolicyRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.customPolicy().byCustom_policy_id(customPolicyId).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    // ── Fulfillment Policy ────────────────────────────────────────────────

    /**
     * Create a fulfillment policy.
     */
    public CompletableFuture<SetFulfillmentPolicyResponse> createFulfillmentPolicyAsync(
            FulfillmentPolicyRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.fulfillmentPolicy().emptyPathSegment().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Get a specific fulfillment policy by ID.
     */
    public CompletableFuture<FulfillmentPolicy> getFulfillmentPolicyAsync(
            String fulfillmentPolicyId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.fulfillmentPolicy().byFulfillmentPolicyId(fulfillmentPolicyId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Update a fulfillment policy.
     */
    public CompletableFuture<SetFulfillmentPolicyResponse> updateFulfillmentPolicyAsync(
            String fulfillmentPolicyId, FulfillmentPolicyRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.fulfillmentPolicy().byFulfillmentPolicyId(fulfillmentPolicyId).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Delete a fulfillment policy.
     */
    public CompletableFuture<Void> deleteFulfillmentPolicyAsync(
            String fulfillmentPolicyId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.fulfillmentPolicy().byFulfillmentPolicyId(fulfillmentPolicyId).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    /**
     * Get all fulfillment policies for a marketplace.
     */
    public CompletableFuture<FulfillmentPolicyResponse> getFulfillmentPoliciesAsync(
            String marketplaceId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.fulfillmentPolicy().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (marketplaceId != null) {
                    config.queryParameters.marketplaceId = marketplaceId;
                }
            });
        });
    }

    /**
     * Get a fulfillment policy by name.
     */
    public CompletableFuture<FulfillmentPolicy> getFulfillmentPolicyByNameAsync(
            String marketplaceId, String name, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.fulfillmentPolicy().getByPolicyName().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (marketplaceId != null) {
                    config.queryParameters.marketplaceId = marketplaceId;
                }
                if (name != null) {
                    config.queryParameters.name = name;
                }
            });
        });
    }

    // ── Payment Policy ────────────────────────────────────────────────────

    /**
     * Get all payment policies for a marketplace.
     */
    public CompletableFuture<PaymentPolicyResponse> getPaymentPoliciesAsync(
            String marketplaceId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentPolicy().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (marketplaceId != null) {
                    config.queryParameters.marketplaceId = marketplaceId;
                }
            });
        });
    }

    /**
     * Create a payment policy.
     */
    public CompletableFuture<SetPaymentPolicyResponse> createPaymentPolicyAsync(
            PaymentPolicyRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentPolicy().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Get a specific payment policy by ID.
     */
    public CompletableFuture<PaymentPolicy> getPaymentPolicyAsync(
            String paymentPolicyId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentPolicy().byPayment_policy_id(paymentPolicyId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Update a payment policy.
     */
    public CompletableFuture<SetPaymentPolicyResponse> updatePaymentPolicyAsync(
            String paymentPolicyId, PaymentPolicyRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentPolicy().byPayment_policy_id(paymentPolicyId).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Delete a payment policy.
     */
    public CompletableFuture<Void> deletePaymentPolicyAsync(
            String paymentPolicyId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.paymentPolicy().byPayment_policy_id(paymentPolicyId).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    /**
     * Get a payment policy by name.
     */
    public CompletableFuture<PaymentPolicy> getPaymentPolicyByNameAsync(
            String marketplaceId, String name, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentPolicy().getByPolicyName().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (marketplaceId != null) {
                    config.queryParameters.marketplaceId = marketplaceId;
                }
                if (name != null) {
                    config.queryParameters.name = name;
                }
            });
        });
    }

    // ── Return Policy ─────────────────────────────────────────────────────

    /**
     * Get all return policies for a marketplace.
     */
    public CompletableFuture<ReturnPolicyResponse> getReturnPoliciesAsync(
            String marketplaceId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.returnPolicy().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (marketplaceId != null) {
                    config.queryParameters.marketplaceId = marketplaceId;
                }
            });
        });
    }

    /**
     * Create a return policy.
     */
    public CompletableFuture<SetReturnPolicyResponse> createReturnPolicyAsync(
            ReturnPolicyRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.returnPolicy().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Get a specific return policy by ID.
     */
    public CompletableFuture<ReturnPolicy> getReturnPolicyAsync(
            String returnPolicyId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.returnPolicy().byReturn_policy_id(returnPolicyId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Update a return policy.
     */
    public CompletableFuture<SetReturnPolicyResponse> updateReturnPolicyAsync(
            String returnPolicyId, ReturnPolicyRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.returnPolicy().byReturn_policy_id(returnPolicyId).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Delete a return policy.
     */
    public CompletableFuture<Void> deleteReturnPolicyAsync(
            String returnPolicyId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.returnPolicy().byReturn_policy_id(returnPolicyId).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    /**
     * Get a return policy by name.
     */
    public CompletableFuture<ReturnPolicy> getReturnPolicyByNameAsync(
            String marketplaceId, String name, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.returnPolicy().getByPolicyName().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (marketplaceId != null) {
                    config.queryParameters.marketplaceId = marketplaceId;
                }
                if (name != null) {
                    config.queryParameters.name = name;
                }
            });
        });
    }

    // ── Sales Tax ─────────────────────────────────────────────────────────

    /**
     * Get sales tax table for a country.
     */
    public CompletableFuture<SalesTaxes> getSalesTaxTableAsync(
            String countryCode, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.salesTax().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (countryCode != null) {
                    config.queryParameters.countryCode = countryCode;
                }
            });
        });
    }

    /**
     * Get sales tax for a jurisdiction.
     */
    public CompletableFuture<SalesTax> getSalesTaxAsync(
            String countryCode, String jurisdictionId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.salesTax().byCountryCode(countryCode).byJurisdictionId(jurisdictionId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Create or replace sales tax for a jurisdiction.
     */
    public CompletableFuture<Void> createOrReplaceSalesTaxAsync(
            String countryCode, String jurisdictionId, SalesTaxBase body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.salesTax().byCountryCode(countryCode).byJurisdictionId(jurisdictionId).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    /**
     * Delete sales tax for a jurisdiction.
     */
    public CompletableFuture<Void> deleteSalesTaxAsync(
            String countryCode, String jurisdictionId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.salesTax().byCountryCode(countryCode).byJurisdictionId(jurisdictionId).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    /**
     * Bulk create or replace sales tax.
     */
    public CompletableFuture<Void> bulkCreateOrReplaceSalesTaxAsync(
            BulkSalesTaxInput body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.bulkCreateOrReplaceSalesTax().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    // ── Other endpoints ───────────────────────────────────────────────────

    /**
     * Get advertising eligibility.
     */
    public CompletableFuture<SellerEligibilityMultiProgramResponse> getAdvertisingEligibilityAsync(
            String programTypes, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.advertisingEligibility().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (programTypes != null) {
                    config.queryParameters.programTypes = programTypes;
                }
            });
        });
    }

    /**
     * Get KYC status.
     */
    public CompletableFuture<KycResponse> getKycAsync(String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.kyc().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Get privileges.
     */
    public CompletableFuture<SellingPrivileges> getPrivilegesAsync(String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.privilege().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Get opted-in programs.
     */
    public CompletableFuture<Programs> getOptedInProgramsAsync(String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.program().getOptedInPrograms().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Opt in to a program.
     */
    public CompletableFuture<Object> optInToProgramAsync(
            Program body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.program().optIn().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Opt out of a program.
     */
    public CompletableFuture<Object> optOutOfProgramAsync(
            Program body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.program().optOut().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Get rate tables.
     */
    public CompletableFuture<RateTableResponse> getRateTablesAsync(
            String countryCode, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.rateTable().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (countryCode != null) {
                    config.queryParameters.countryCode = countryCode;
                }
            });
        });
    }

    /**
     * Get payments program onboarding status.
     */
    public CompletableFuture<PaymentsProgramOnboardingResponse> getPaymentsProgramOnboardingAsync(
            String marketplaceId, String paymentsProgramType, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentsProgram().byMarketplace_id(marketplaceId).byPayments_program_type(paymentsProgramType).onboarding().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Get subscription status.
     */
    public CompletableFuture<SubscriptionResponse> getSubscriptionAsync(
            String limit, String continuationToken, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.subscription().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (limit != null) {
                    config.queryParameters.limit = limit;
                }
                if (continuationToken != null) {
                    config.queryParameters.continuationToken = continuationToken;
                }
            });
        });
    }
}
