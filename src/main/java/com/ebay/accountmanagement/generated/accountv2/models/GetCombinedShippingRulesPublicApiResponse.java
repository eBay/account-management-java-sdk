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
 * The base response type of the getCombinedShippingRules method. &lt;br&gt;&lt;br&gt;All of a seller&apos;s calculated, flat, and promotional shipping discount rules defined for an eBay marketplace will be returned in the response, along with the current combined duration value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetCombinedShippingRulesPublicApiResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container will show one or more calculated shipping rules set up for that seller on that ebay marketplace.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This will not be returned if a calculated handling rule is not set up for that seller on that eBay marketplace
     */
    private CalculatedHandlingRuleType calculatedHandlingRule;
    /**
     * This container specifies the type of combined-shipping rule applied, such as flat-rate, weight-based, or cost-based.
     */
    private CalculatedShippingRuleType calculatedShippingRule;
    /**
     * This field is represented by one of the values in the &lt;a href=&quot;/develop/api/sell/account_api_v2#sell-account_api_v2-combined_shipping_rules-getcombinedshippingrules.getcombinedshippingrulesresponse.combinedduration&quot; target=&quot;_blank&quot;&gt;CombinedPaymentPeriodEnum&lt;/a&gt;.
     */
    private CombinedPaymentPeriodEnum combinedDuration;
    /**
     * This container will show one or more flat shipping rules set up for that seller on that ebay marketplace.
     */
    private FlatShippingRuleType flatShippingRule;
    /**
     * This container shows the promotional shipping rule that is currently set up on the seller&apos;s account for the eBay marketplace. &lt;br&gt;&lt;br&gt;This container will not be returned if no promotional shipping rule is currently set up on the seller&apos;s account for the eBay marketplace.
     */
    private PromotionalShippingRuleType promotionalShippingRule;
    /**
     * Instantiates a new {@link GetCombinedShippingRulesPublicApiResponse} and sets the default values.
     */
    public GetCombinedShippingRulesPublicApiResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetCombinedShippingRulesPublicApiResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetCombinedShippingRulesPublicApiResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetCombinedShippingRulesPublicApiResponse();
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
     * Gets the calculatedHandlingRule property value. This container will show one or more calculated shipping rules set up for that seller on that ebay marketplace.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This will not be returned if a calculated handling rule is not set up for that seller on that eBay marketplace
     * @return a {@link CalculatedHandlingRuleType}
     */
    @jakarta.annotation.Nullable
    public CalculatedHandlingRuleType getCalculatedHandlingRule() {
        return this.calculatedHandlingRule;
    }
    /**
     * Gets the calculatedShippingRule property value. This container specifies the type of combined-shipping rule applied, such as flat-rate, weight-based, or cost-based.
     * @return a {@link CalculatedShippingRuleType}
     */
    @jakarta.annotation.Nullable
    public CalculatedShippingRuleType getCalculatedShippingRule() {
        return this.calculatedShippingRule;
    }
    /**
     * Gets the combinedDuration property value. This field is represented by one of the values in the &lt;a href=&quot;/develop/api/sell/account_api_v2#sell-account_api_v2-combined_shipping_rules-getcombinedshippingrules.getcombinedshippingrulesresponse.combinedduration&quot; target=&quot;_blank&quot;&gt;CombinedPaymentPeriodEnum&lt;/a&gt;.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("calculatedHandlingRule", (n) -> { this.setCalculatedHandlingRule(n.getObjectValue(CalculatedHandlingRuleType::createFromDiscriminatorValue)); });
        deserializerMap.put("calculatedShippingRule", (n) -> { this.setCalculatedShippingRule(n.getObjectValue(CalculatedShippingRuleType::createFromDiscriminatorValue)); });
        deserializerMap.put("combinedDuration", (n) -> { this.setCombinedDuration(n.getEnumValue(CombinedPaymentPeriodEnum::forValue)); });
        deserializerMap.put("flatShippingRule", (n) -> { this.setFlatShippingRule(n.getObjectValue(FlatShippingRuleType::createFromDiscriminatorValue)); });
        deserializerMap.put("promotionalShippingRule", (n) -> { this.setPromotionalShippingRule(n.getObjectValue(PromotionalShippingRuleType::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the flatShippingRule property value. This container will show one or more flat shipping rules set up for that seller on that ebay marketplace.
     * @return a {@link FlatShippingRuleType}
     */
    @jakarta.annotation.Nullable
    public FlatShippingRuleType getFlatShippingRule() {
        return this.flatShippingRule;
    }
    /**
     * Gets the promotionalShippingRule property value. This container shows the promotional shipping rule that is currently set up on the seller&apos;s account for the eBay marketplace. &lt;br&gt;&lt;br&gt;This container will not be returned if no promotional shipping rule is currently set up on the seller&apos;s account for the eBay marketplace.
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
        writer.writeObjectValue("calculatedHandlingRule", this.getCalculatedHandlingRule());
        writer.writeObjectValue("calculatedShippingRule", this.getCalculatedShippingRule());
        writer.writeEnumValue("combinedDuration", this.getCombinedDuration());
        writer.writeObjectValue("flatShippingRule", this.getFlatShippingRule());
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
     * Sets the calculatedHandlingRule property value. This container will show one or more calculated shipping rules set up for that seller on that ebay marketplace.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This will not be returned if a calculated handling rule is not set up for that seller on that eBay marketplace
     * @param value Value to set for the calculatedHandlingRule property.
     */
    public void setCalculatedHandlingRule(@jakarta.annotation.Nullable final CalculatedHandlingRuleType value) {
        this.calculatedHandlingRule = value;
    }
    /**
     * Sets the calculatedShippingRule property value. This container specifies the type of combined-shipping rule applied, such as flat-rate, weight-based, or cost-based.
     * @param value Value to set for the calculatedShippingRule property.
     */
    public void setCalculatedShippingRule(@jakarta.annotation.Nullable final CalculatedShippingRuleType value) {
        this.calculatedShippingRule = value;
    }
    /**
     * Sets the combinedDuration property value. This field is represented by one of the values in the &lt;a href=&quot;/develop/api/sell/account_api_v2#sell-account_api_v2-combined_shipping_rules-getcombinedshippingrules.getcombinedshippingrulesresponse.combinedduration&quot; target=&quot;_blank&quot;&gt;CombinedPaymentPeriodEnum&lt;/a&gt;.
     * @param value Value to set for the combinedDuration property.
     */
    public void setCombinedDuration(@jakarta.annotation.Nullable final CombinedPaymentPeriodEnum value) {
        this.combinedDuration = value;
    }
    /**
     * Sets the flatShippingRule property value. This container will show one or more flat shipping rules set up for that seller on that ebay marketplace.
     * @param value Value to set for the flatShippingRule property.
     */
    public void setFlatShippingRule(@jakarta.annotation.Nullable final FlatShippingRuleType value) {
        this.flatShippingRule = value;
    }
    /**
     * Sets the promotionalShippingRule property value. This container shows the promotional shipping rule that is currently set up on the seller&apos;s account for the eBay marketplace. &lt;br&gt;&lt;br&gt;This container will not be returned if no promotional shipping rule is currently set up on the seller&apos;s account for the eBay marketplace.
     * @param value Value to set for the promotionalShippingRule property.
     */
    public void setPromotionalShippingRule(@jakarta.annotation.Nullable final PromotionalShippingRuleType value) {
        this.promotionalShippingRule = value;
    }
}
