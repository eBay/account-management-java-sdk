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
 * This type defines the structure for calculated handling fee discounts applicable when combining multiple orders.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CalculatedHandlingRuleType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This enumeration value specifies the type of combined-shipping rule applied to handling fees (for example, weight-based, flat-rate, or percentage-based calculation method). 
     */
    private CombinedShippingRuleTypeHandlingEnum combinedShippingRuleType;
    /**
     * This container specifies the additional monetary charge applied for each extra item included in a combined shipment.
     */
    private Amount eachAdditionalAmount;
    /**
     * This container represents the fixed monetary discount deducted from the total shipping cost for each additional item in a combined shipment.
     */
    private Amount eachAdditionalAmountOffShippingCost;
    /**
     * This integer specifies the percentage discount applied to the total shipping cost for each additional item in a combined shipment.
     */
    private Double eachAdditionalPercentOffShippingCost;
    /**
     * This container represents the handling fee charged for processing a combined order, if applicable.
     */
    private Amount orderHandlingAmount;
    /**
     * Instantiates a new {@link CalculatedHandlingRuleType} and sets the default values.
     */
    public CalculatedHandlingRuleType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CalculatedHandlingRuleType}
     */
    @jakarta.annotation.Nonnull
    public static CalculatedHandlingRuleType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CalculatedHandlingRuleType();
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
     * Gets the combinedShippingRuleType property value. This enumeration value specifies the type of combined-shipping rule applied to handling fees (for example, weight-based, flat-rate, or percentage-based calculation method). 
     * @return a {@link CombinedShippingRuleTypeHandlingEnum}
     */
    @jakarta.annotation.Nullable
    public CombinedShippingRuleTypeHandlingEnum getCombinedShippingRuleType() {
        return this.combinedShippingRuleType;
    }
    /**
     * Gets the eachAdditionalAmount property value. This container specifies the additional monetary charge applied for each extra item included in a combined shipment.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getEachAdditionalAmount() {
        return this.eachAdditionalAmount;
    }
    /**
     * Gets the eachAdditionalAmountOffShippingCost property value. This container represents the fixed monetary discount deducted from the total shipping cost for each additional item in a combined shipment.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getEachAdditionalAmountOffShippingCost() {
        return this.eachAdditionalAmountOffShippingCost;
    }
    /**
     * Gets the eachAdditionalPercentOffShippingCost property value. This integer specifies the percentage discount applied to the total shipping cost for each additional item in a combined shipment.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getEachAdditionalPercentOffShippingCost() {
        return this.eachAdditionalPercentOffShippingCost;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("combinedShippingRuleType", (n) -> { this.setCombinedShippingRuleType(n.getEnumValue(CombinedShippingRuleTypeHandlingEnum::forValue)); });
        deserializerMap.put("eachAdditionalAmount", (n) -> { this.setEachAdditionalAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("eachAdditionalAmountOffShippingCost", (n) -> { this.setEachAdditionalAmountOffShippingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("eachAdditionalPercentOffShippingCost", (n) -> { this.setEachAdditionalPercentOffShippingCost(n.getDoubleValue()); });
        deserializerMap.put("orderHandlingAmount", (n) -> { this.setOrderHandlingAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the orderHandlingAmount property value. This container represents the handling fee charged for processing a combined order, if applicable.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getOrderHandlingAmount() {
        return this.orderHandlingAmount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("combinedShippingRuleType", this.getCombinedShippingRuleType());
        writer.writeObjectValue("eachAdditionalAmount", this.getEachAdditionalAmount());
        writer.writeObjectValue("eachAdditionalAmountOffShippingCost", this.getEachAdditionalAmountOffShippingCost());
        writer.writeDoubleValue("eachAdditionalPercentOffShippingCost", this.getEachAdditionalPercentOffShippingCost());
        writer.writeObjectValue("orderHandlingAmount", this.getOrderHandlingAmount());
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
     * Sets the combinedShippingRuleType property value. This enumeration value specifies the type of combined-shipping rule applied to handling fees (for example, weight-based, flat-rate, or percentage-based calculation method). 
     * @param value Value to set for the combinedShippingRuleType property.
     */
    public void setCombinedShippingRuleType(@jakarta.annotation.Nullable final CombinedShippingRuleTypeHandlingEnum value) {
        this.combinedShippingRuleType = value;
    }
    /**
     * Sets the eachAdditionalAmount property value. This container specifies the additional monetary charge applied for each extra item included in a combined shipment.
     * @param value Value to set for the eachAdditionalAmount property.
     */
    public void setEachAdditionalAmount(@jakarta.annotation.Nullable final Amount value) {
        this.eachAdditionalAmount = value;
    }
    /**
     * Sets the eachAdditionalAmountOffShippingCost property value. This container represents the fixed monetary discount deducted from the total shipping cost for each additional item in a combined shipment.
     * @param value Value to set for the eachAdditionalAmountOffShippingCost property.
     */
    public void setEachAdditionalAmountOffShippingCost(@jakarta.annotation.Nullable final Amount value) {
        this.eachAdditionalAmountOffShippingCost = value;
    }
    /**
     * Sets the eachAdditionalPercentOffShippingCost property value. This integer specifies the percentage discount applied to the total shipping cost for each additional item in a combined shipment.
     * @param value Value to set for the eachAdditionalPercentOffShippingCost property.
     */
    public void setEachAdditionalPercentOffShippingCost(@jakarta.annotation.Nullable final Double value) {
        this.eachAdditionalPercentOffShippingCost = value;
    }
    /**
     * Sets the orderHandlingAmount property value. This container represents the handling fee charged for processing a combined order, if applicable.
     * @param value Value to set for the orderHandlingAmount property.
     */
    public void setOrderHandlingAmount(@jakarta.annotation.Nullable final Amount value) {
        this.orderHandlingAmount = value;
    }
}
