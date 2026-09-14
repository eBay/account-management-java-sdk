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

package com.ebay.accountmanagement.generated.accountv2.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type represents the request schema for creating promotional shipping rules with combined payment durations.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreatePromotionalShippingRuleRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container specifies the time window during which multiple unpaid orders can be combined into a single payment or invoice, represented by using one of the values in &lt;a href=&quot;/develop/api/sell/account_api_v2#sell-account_api_v2-combined_shipping_rules-getcombinedshippingrules.getcombinedshippingrulesresponse.combinedduration&quot; target=&quot;_blank&quot;&gt;CombinedPaymentPeriodEnum&lt;/a&gt;.
     */
    private CombinedPaymentPeriodEnum combinedDuration;
    /**
     * This container defines the promotional combined-shipping rule that offers discounts or free shipping based on order value, item count, or other qualifying conditions.
     */
    private PromotionalShippingRuleType promotionalShippingRule;
    /**
     * Instantiates a new {@link CreatePromotionalShippingRuleRequest} and sets the default values.
     */
    public CreatePromotionalShippingRuleRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreatePromotionalShippingRuleRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreatePromotionalShippingRuleRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreatePromotionalShippingRuleRequest();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the combinedDuration property value. This container specifies the time window during which multiple unpaid orders can be combined into a single payment or invoice, represented by using one of the values in &lt;a href=&quot;/develop/api/sell/account_api_v2#sell-account_api_v2-combined_shipping_rules-getcombinedshippingrules.getcombinedshippingrulesresponse.combinedduration&quot; target=&quot;_blank&quot;&gt;CombinedPaymentPeriodEnum&lt;/a&gt;.
     * @return a {@link CombinedPaymentPeriodEnum}
     */
    @jakarta.annotation.Nullable
    public CombinedPaymentPeriodEnum getCombinedDuration() {
        return this.combinedDuration;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("combinedDuration", (n) -> { this.setCombinedDuration(n.getEnumValue(CombinedPaymentPeriodEnum::forValue)); });
        deserializerMap.put("promotionalShippingRule", (n) -> { this.setPromotionalShippingRule(n.getObjectValue(PromotionalShippingRuleType::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the promotionalShippingRule property value. This container defines the promotional combined-shipping rule that offers discounts or free shipping based on order value, item count, or other qualifying conditions.
     * @return a {@link PromotionalShippingRuleType}
     */
    @jakarta.annotation.Nullable
    public PromotionalShippingRuleType getPromotionalShippingRule() {
        return this.promotionalShippingRule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("combinedDuration", this.getCombinedDuration());
        writer.writeObjectValue("promotionalShippingRule", this.getPromotionalShippingRule());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the combinedDuration property value. This container specifies the time window during which multiple unpaid orders can be combined into a single payment or invoice, represented by using one of the values in &lt;a href=&quot;/develop/api/sell/account_api_v2#sell-account_api_v2-combined_shipping_rules-getcombinedshippingrules.getcombinedshippingrulesresponse.combinedduration&quot; target=&quot;_blank&quot;&gt;CombinedPaymentPeriodEnum&lt;/a&gt;.
     * @param value Value to set for the combinedDuration property.
     */
    public void setCombinedDuration(@jakarta.annotation.Nullable final CombinedPaymentPeriodEnum value) {
        this.combinedDuration = value;
    }
    /**
     * Sets the promotionalShippingRule property value. This container defines the promotional combined-shipping rule that offers discounts or free shipping based on order value, item count, or other qualifying conditions.
     * @param value Value to set for the promotionalShippingRule property.
     */
    public void setPromotionalShippingRule(@jakarta.annotation.Nullable final PromotionalShippingRuleType value) {
        this.promotionalShippingRule = value;
    }
}
