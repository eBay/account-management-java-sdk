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

package com.ebay.accountmanagement.generated.sellaccountv1;

import com.ebay.accountmanagement.generated.sellaccountv1.advertising_eligibility.AdvertisingEligibilityRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv1.bulk_create_or_replace_sales_tax.BulkCreateOrReplaceSalesTaxRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv1.custom_policy.CustomPolicyRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv1.fulfillment_policy.FulfillmentPolicyRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv1.kyc.KycRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv1.payment_policy.PaymentPolicyRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv1.payments_program.PaymentsProgramRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv1.privilege.PrivilegeRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv1.program.ProgramRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv1.rate_table.RateTableRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv1.return_policy.ReturnPolicyRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv1.sales_tax.SalesTaxRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv1.subscription.SubscriptionRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SellAccountV1ApiClient extends BaseRequestBuilder {
    /**
     * The advertising_eligibility property
     * @return a {@link AdvertisingEligibilityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdvertisingEligibilityRequestBuilder advertisingEligibility() {
        return new AdvertisingEligibilityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_create_or_replace_sales_tax property
     * @return a {@link BulkCreateOrReplaceSalesTaxRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkCreateOrReplaceSalesTaxRequestBuilder bulkCreateOrReplaceSalesTax() {
        return new BulkCreateOrReplaceSalesTaxRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The custom_policy property
     * @return a {@link CustomPolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CustomPolicyRequestBuilder customPolicy() {
        return new CustomPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The fulfillment_policy property
     * @return a {@link FulfillmentPolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FulfillmentPolicyRequestBuilder fulfillmentPolicy() {
        return new FulfillmentPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The kyc property
     * @return a {@link KycRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public KycRequestBuilder kyc() {
        return new KycRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The payment_policy property
     * @return a {@link PaymentPolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PaymentPolicyRequestBuilder paymentPolicy() {
        return new PaymentPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The payments_program property
     * @return a {@link PaymentsProgramRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PaymentsProgramRequestBuilder paymentsProgram() {
        return new PaymentsProgramRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The privilege property
     * @return a {@link PrivilegeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrivilegeRequestBuilder privilege() {
        return new PrivilegeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The program property
     * @return a {@link ProgramRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProgramRequestBuilder program() {
        return new ProgramRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The rate_table property
     * @return a {@link RateTableRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RateTableRequestBuilder rateTable() {
        return new RateTableRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The return_policy property
     * @return a {@link ReturnPolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReturnPolicyRequestBuilder returnPolicy() {
        return new ReturnPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The sales_tax property
     * @return a {@link SalesTaxRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SalesTaxRequestBuilder salesTax() {
        return new SalesTaxRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The subscription property
     * @return a {@link SubscriptionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscriptionRequestBuilder subscription() {
        return new SubscriptionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link SellAccountV1ApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SellAccountV1ApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://api.ebay.com{basePath}");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
