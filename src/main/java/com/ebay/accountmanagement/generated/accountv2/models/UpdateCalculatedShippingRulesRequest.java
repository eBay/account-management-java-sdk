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
 * This type is used to update calculated shipping rules.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateCalculatedShippingRulesRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container specifies the calculated handling rule that determines how handling fees are automatically computed based on order weight, quantity, or value in a combined shipment.
     */
    private CalculatedHandlingRuleType calculatedHandlingRule;
    /**
     * This container defines the calculated shipping rule that determines shipping costs or discounts based on factors such as total weight, price, or item count in a combined order.
     */
    private CalculatedShippingRuleType calculatedShippingRule;
    /**
     * This enumerated value specifies the duration within which multiple unpaid orders may be combined into a single invoice, represented by one of the values in &lt;a href=&quot;/develop/api/sell/account_api_v2#sell-account_api_v2-combined_shipping_rules-getcombinedshippingrules.getcombinedshippingrulesresponse.combinedduration&quot; target=&quot;_blank&quot;&gt;CombinedPaymentPeriodEnum&lt;/a&gt;.
     */
    private CombinedPaymentPeriodEnum combinedDuration;
    /**
     * Instantiates a new {@link UpdateCalculatedShippingRulesRequest} and sets the default values.
     */
    public UpdateCalculatedShippingRulesRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateCalculatedShippingRulesRequest}
     */
    @jakarta.annotation.Nonnull
    public static UpdateCalculatedShippingRulesRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateCalculatedShippingRulesRequest();
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
     * Gets the calculatedHandlingRule property value. This container specifies the calculated handling rule that determines how handling fees are automatically computed based on order weight, quantity, or value in a combined shipment.
     * @return a {@link CalculatedHandlingRuleType}
     */
    @jakarta.annotation.Nullable
    public CalculatedHandlingRuleType getCalculatedHandlingRule() {
        return this.calculatedHandlingRule;
    }
    /**
     * Gets the calculatedShippingRule property value. This container defines the calculated shipping rule that determines shipping costs or discounts based on factors such as total weight, price, or item count in a combined order.
     * @return a {@link CalculatedShippingRuleType}
     */
    @jakarta.annotation.Nullable
    public CalculatedShippingRuleType getCalculatedShippingRule() {
        return this.calculatedShippingRule;
    }
    /**
     * Gets the combinedDuration property value. This enumerated value specifies the duration within which multiple unpaid orders may be combined into a single invoice, represented by one of the values in &lt;a href=&quot;/develop/api/sell/account_api_v2#sell-account_api_v2-combined_shipping_rules-getcombinedshippingrules.getcombinedshippingrulesresponse.combinedduration&quot; target=&quot;_blank&quot;&gt;CombinedPaymentPeriodEnum&lt;/a&gt;.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("calculatedHandlingRule", (n) -> { this.setCalculatedHandlingRule(n.getObjectValue(CalculatedHandlingRuleType::createFromDiscriminatorValue)); });
        deserializerMap.put("calculatedShippingRule", (n) -> { this.setCalculatedShippingRule(n.getObjectValue(CalculatedShippingRuleType::createFromDiscriminatorValue)); });
        deserializerMap.put("combinedDuration", (n) -> { this.setCombinedDuration(n.getEnumValue(CombinedPaymentPeriodEnum::forValue)); });
        return deserializerMap;
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
     * Sets the calculatedHandlingRule property value. This container specifies the calculated handling rule that determines how handling fees are automatically computed based on order weight, quantity, or value in a combined shipment.
     * @param value Value to set for the calculatedHandlingRule property.
     */
    public void setCalculatedHandlingRule(@jakarta.annotation.Nullable final CalculatedHandlingRuleType value) {
        this.calculatedHandlingRule = value;
    }
    /**
     * Sets the calculatedShippingRule property value. This container defines the calculated shipping rule that determines shipping costs or discounts based on factors such as total weight, price, or item count in a combined order.
     * @param value Value to set for the calculatedShippingRule property.
     */
    public void setCalculatedShippingRule(@jakarta.annotation.Nullable final CalculatedShippingRuleType value) {
        this.calculatedShippingRule = value;
    }
    /**
     * Sets the combinedDuration property value. This enumerated value specifies the duration within which multiple unpaid orders may be combined into a single invoice, represented by one of the values in &lt;a href=&quot;/develop/api/sell/account_api_v2#sell-account_api_v2-combined_shipping_rules-getcombinedshippingrules.getcombinedshippingrulesresponse.combinedduration&quot; target=&quot;_blank&quot;&gt;CombinedPaymentPeriodEnum&lt;/a&gt;.
     * @param value Value to set for the combinedDuration property.
     */
    public void setCombinedDuration(@jakarta.annotation.Nullable final CombinedPaymentPeriodEnum value) {
        this.combinedDuration = value;
    }
}
