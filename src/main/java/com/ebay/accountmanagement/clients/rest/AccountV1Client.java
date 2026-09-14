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
import com.ebay.accountmanagement.generated.accountv1.AccountV1ApiClient;
import com.ebay.accountmanagement.generated.accountv1.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.io.InputStream;
import com.microsoft.kiota.serialization.UntypedNode;

public final class AccountV1Client {
    private final AccountV1ApiClient kiota;
    private final AccountManagementConfiguration config;

    public AccountV1Client(AccountV1ApiClient kiota, AccountManagementConfiguration config) {
        this.kiota = kiota;
        this.config = config;
    }

    private Map<String, String> mergedHeaders(RequestOptions requestOptions) {
        Map<String, String> headers = new HashMap<>(config.getDefaultRequestOptions().getHeaders());
        if (requestOptions != null) {
            headers.putAll(requestOptions.getHeaders());
        }
        return headers;
    }

    public CompletableFuture<CustomPolicyResponse> getCustomPoliciesAsync(
            String policyTypes, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.customPolicy().emptyPathSegment().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (policyTypes != null) config.queryParameters.policyTypes = policyTypes;
            });
        }));
    }

    public CompletableFuture<Void> createCustomPolicyAsync(
            CustomPolicyCreateRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.customPolicy().emptyPathSegment().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<CustomPolicy> getCustomPolicyAsync(
            String customPolicyId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.customPolicy().byCustom_policy_id(Params.requireValid("customPolicyId", customPolicyId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> updateCustomPolicyAsync(
            String customPolicyId, CustomPolicyRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.customPolicy().byCustom_policy_id(Params.requireValid("customPolicyId", customPolicyId)).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<SetFulfillmentPolicyResponse> createFulfillmentPolicyAsync(
            FulfillmentPolicyRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.fulfillmentPolicy().emptyPathSegment().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<FulfillmentPolicy> getFulfillmentPolicyAsync(
            String fulfillmentPolicyId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.fulfillmentPolicy().byFulfillmentPolicyId(Params.requireValid("fulfillmentPolicyId", fulfillmentPolicyId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<SetFulfillmentPolicyResponse> updateFulfillmentPolicyAsync(
            String fulfillmentPolicyId, FulfillmentPolicyRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.fulfillmentPolicy().byFulfillmentPolicyId(Params.requireValid("fulfillmentPolicyId", fulfillmentPolicyId)).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> deleteFulfillmentPolicyAsync(
            String fulfillmentPolicyId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.fulfillmentPolicy().byFulfillmentPolicyId(Params.requireValid("fulfillmentPolicyId", fulfillmentPolicyId)).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<FulfillmentPolicyResponse> getFulfillmentPoliciesAsync(
            String marketplaceId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.fulfillmentPolicy().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (marketplaceId != null) config.queryParameters.marketplaceId = marketplaceId;
            });
        }));
    }

    public CompletableFuture<FulfillmentPolicy> getFulfillmentPolicyByNameAsync(
            String marketplaceId, String name, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.fulfillmentPolicy().getByPolicyName().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (marketplaceId != null) config.queryParameters.marketplaceId = marketplaceId;
                if (name != null) config.queryParameters.name = name;
            });
        }));
    }

    public CompletableFuture<PaymentPolicyResponse> getPaymentPoliciesAsync(
            String marketplaceId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentPolicy().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (marketplaceId != null) config.queryParameters.marketplaceId = marketplaceId;
            });
        }));
    }

    public CompletableFuture<SetPaymentPolicyResponse> createPaymentPolicyAsync(
            PaymentPolicyRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentPolicy().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<PaymentPolicy> getPaymentPolicyAsync(
            String paymentPolicyId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentPolicy().byPayment_policy_id(Params.requireValid("paymentPolicyId", paymentPolicyId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<SetPaymentPolicyResponse> updatePaymentPolicyAsync(
            String paymentPolicyId, PaymentPolicyRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentPolicy().byPayment_policy_id(Params.requireValid("paymentPolicyId", paymentPolicyId)).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> deletePaymentPolicyAsync(
            String paymentPolicyId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.paymentPolicy().byPayment_policy_id(Params.requireValid("paymentPolicyId", paymentPolicyId)).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<PaymentPolicy> getPaymentPolicyByNameAsync(
            String marketplaceId, String name, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentPolicy().getByPolicyName().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (marketplaceId != null) config.queryParameters.marketplaceId = marketplaceId;
                if (name != null) config.queryParameters.name = name;
            });
        }));
    }

    public CompletableFuture<PaymentsProgramResponse> getPaymentsProgramAsync(
            String marketplaceId, String paymentsProgramType, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentsProgram().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).byPayments_program_type(Params.requireValid("paymentsProgramType", paymentsProgramType)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<PaymentsProgramOnboardingResponse> getPaymentsProgramOnboardingAsync(
            String marketplaceId, String paymentsProgramType, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.paymentsProgram().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).byPayments_program_type(Params.requireValid("paymentsProgramType", paymentsProgramType)).onboarding().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<SellingPrivileges> getPrivilegesAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.privilege().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Programs> getOptedInProgramsAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.program().getOptedInPrograms().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> optInToProgramAsync(
            Program body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.program().optIn().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> optOutOfProgramAsync(
            Program body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.program().optOut().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<RateTableResponse> getRateTablesAsync(
            String countryCode, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.rateTable().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (countryCode != null) config.queryParameters.countryCode = countryCode;
            });
        }));
    }

    public CompletableFuture<ReturnPolicyResponse> getReturnPoliciesAsync(
            String marketplaceId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.returnPolicy().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (marketplaceId != null) config.queryParameters.marketplaceId = marketplaceId;
            });
        }));
    }

    public CompletableFuture<SetReturnPolicyResponse> createReturnPolicyAsync(
            ReturnPolicyRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.returnPolicy().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<ReturnPolicy> getReturnPolicyAsync(
            String returnPolicyId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.returnPolicy().byReturn_policy_id(Params.requireValid("returnPolicyId", returnPolicyId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<SetReturnPolicyResponse> updateReturnPolicyAsync(
            String returnPolicyId, ReturnPolicyRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.returnPolicy().byReturn_policy_id(Params.requireValid("returnPolicyId", returnPolicyId)).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> deleteReturnPolicyAsync(
            String returnPolicyId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.returnPolicy().byReturn_policy_id(Params.requireValid("returnPolicyId", returnPolicyId)).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<ReturnPolicy> getReturnPolicyByNameAsync(
            String marketplaceId, String name, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.returnPolicy().getByPolicyName().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (marketplaceId != null) config.queryParameters.marketplaceId = marketplaceId;
                if (name != null) config.queryParameters.name = name;
            });
        }));
    }

    public CompletableFuture<UpdatedSalesTaxResponse> bulkCreateOrReplaceSalesTaxAsync(
            BulkSalesTaxInput body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.bulkCreateOrReplaceSalesTax().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<SalesTax> getSalesTaxAsync(
            String countryCode, String jurisdictionId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.salesTax().byCountryCode(Params.requireValid("countryCode", countryCode)).byJurisdictionId(Params.requireValid("jurisdictionId", jurisdictionId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> createOrReplaceSalesTaxAsync(
            String countryCode, String jurisdictionId, SalesTaxBase body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.salesTax().byCountryCode(Params.requireValid("countryCode", countryCode)).byJurisdictionId(Params.requireValid("jurisdictionId", jurisdictionId)).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> deleteSalesTaxAsync(
            String countryCode, String jurisdictionId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.salesTax().byCountryCode(Params.requireValid("countryCode", countryCode)).byJurisdictionId(Params.requireValid("jurisdictionId", jurisdictionId)).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<SalesTaxes> getSalesTaxesAsync(
            String countryCode, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.salesTax().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (countryCode != null) config.queryParameters.countryCode = countryCode;
            });
        }));
    }

    public CompletableFuture<SubscriptionResponse> getSubscriptionAsync(
            String limit, String continuationToken, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.subscription().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (limit != null) config.queryParameters.limit = limit;
                if (continuationToken != null) config.queryParameters.continuationToken = continuationToken;
            });
        }));
    }

    public CompletableFuture<KycResponse> getKYCAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.kyc().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<SellerEligibilityMultiProgramResponse> getAdvertisingEligibilityAsync(
            String programTypes, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.advertisingEligibility().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (programTypes != null) config.queryParameters.programTypes = programTypes;
                if (xEBAYCMARKETPLACEID != null) config.headers.add("X-EBAY-C-MARKETPLACE-ID", xEBAYCMARKETPLACEID);
            });
        }));
    }
}
