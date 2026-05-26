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

package com.ebay.accountmanagement.generated.sellaccountv2.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This container defines a discount profile schema for combined shipping, including rule IDs, names, and applicable weight or amount reductions.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is not applicable for the create rule use case.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CombinedShippingRule implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field represents the unique identifier for the combined-shipping discount profile, &lt;br&gt;&lt;br&gt;used to reference or update a specific rule configuration.
     */
    private String combinedShippingRuleId;
    /**
     * This field specifies the unique name identifying the combined shipping discount profile within the sellers account. This name is configured by the seller and can have a maximum of XX characters.
     */
    private String combinedShippingRuleName;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount eachAdditionalAmount;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount eachAdditionalAmountOffShippingCost;
    /**
     * This integer specifies the percentage discount applied to the total shipping cost for each additional item in the combined order.
     */
    private Double eachAdditionalPercentOffShippingCost;
    /**
     * This field specifies the unique ID that links this combined-shipping rule to another related rule in the sellers account.
     */
    private String mappedCombinedShippingRuleId;
    /**
     * This type displays measurement type with value, unit, and measurement system.
     */
    private MeasureType weightOffTotalWeight;
    /**
     * Instantiates a new {@link CombinedShippingRule} and sets the default values.
     */
    public CombinedShippingRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CombinedShippingRule}
     */
    @jakarta.annotation.Nonnull
    public static CombinedShippingRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CombinedShippingRule();
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
     * Gets the combinedShippingRuleId property value. This field represents the unique identifier for the combined-shipping discount profile, &lt;br&gt;&lt;br&gt;used to reference or update a specific rule configuration.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCombinedShippingRuleId() {
        return this.combinedShippingRuleId;
    }
    /**
     * Gets the combinedShippingRuleName property value. This field specifies the unique name identifying the combined shipping discount profile within the sellers account. This name is configured by the seller and can have a maximum of XX characters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCombinedShippingRuleName() {
        return this.combinedShippingRuleName;
    }
    /**
     * Gets the eachAdditionalAmount property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getEachAdditionalAmount() {
        return this.eachAdditionalAmount;
    }
    /**
     * Gets the eachAdditionalAmountOffShippingCost property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getEachAdditionalAmountOffShippingCost() {
        return this.eachAdditionalAmountOffShippingCost;
    }
    /**
     * Gets the eachAdditionalPercentOffShippingCost property value. This integer specifies the percentage discount applied to the total shipping cost for each additional item in the combined order.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("combinedShippingRuleId", (n) -> { this.setCombinedShippingRuleId(n.getStringValue()); });
        deserializerMap.put("combinedShippingRuleName", (n) -> { this.setCombinedShippingRuleName(n.getStringValue()); });
        deserializerMap.put("eachAdditionalAmount", (n) -> { this.setEachAdditionalAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("eachAdditionalAmountOffShippingCost", (n) -> { this.setEachAdditionalAmountOffShippingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("eachAdditionalPercentOffShippingCost", (n) -> { this.setEachAdditionalPercentOffShippingCost(n.getDoubleValue()); });
        deserializerMap.put("mappedCombinedShippingRuleId", (n) -> { this.setMappedCombinedShippingRuleId(n.getStringValue()); });
        deserializerMap.put("weightOffTotalWeight", (n) -> { this.setWeightOffTotalWeight(n.getObjectValue(MeasureType::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the mappedCombinedShippingRuleId property value. This field specifies the unique ID that links this combined-shipping rule to another related rule in the sellers account.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMappedCombinedShippingRuleId() {
        return this.mappedCombinedShippingRuleId;
    }
    /**
     * Gets the weightOffTotalWeight property value. This type displays measurement type with value, unit, and measurement system.
     * @return a {@link MeasureType}
     */
    @jakarta.annotation.Nullable
    public MeasureType getWeightOffTotalWeight() {
        return this.weightOffTotalWeight;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("combinedShippingRuleId", this.getCombinedShippingRuleId());
        writer.writeStringValue("combinedShippingRuleName", this.getCombinedShippingRuleName());
        writer.writeObjectValue("eachAdditionalAmount", this.getEachAdditionalAmount());
        writer.writeObjectValue("eachAdditionalAmountOffShippingCost", this.getEachAdditionalAmountOffShippingCost());
        writer.writeDoubleValue("eachAdditionalPercentOffShippingCost", this.getEachAdditionalPercentOffShippingCost());
        writer.writeStringValue("mappedCombinedShippingRuleId", this.getMappedCombinedShippingRuleId());
        writer.writeObjectValue("weightOffTotalWeight", this.getWeightOffTotalWeight());
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
     * Sets the combinedShippingRuleId property value. This field represents the unique identifier for the combined-shipping discount profile, &lt;br&gt;&lt;br&gt;used to reference or update a specific rule configuration.
     * @param value Value to set for the combinedShippingRuleId property.
     */
    public void setCombinedShippingRuleId(@jakarta.annotation.Nullable final String value) {
        this.combinedShippingRuleId = value;
    }
    /**
     * Sets the combinedShippingRuleName property value. This field specifies the unique name identifying the combined shipping discount profile within the sellers account. This name is configured by the seller and can have a maximum of XX characters.
     * @param value Value to set for the combinedShippingRuleName property.
     */
    public void setCombinedShippingRuleName(@jakarta.annotation.Nullable final String value) {
        this.combinedShippingRuleName = value;
    }
    /**
     * Sets the eachAdditionalAmount property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the eachAdditionalAmount property.
     */
    public void setEachAdditionalAmount(@jakarta.annotation.Nullable final Amount value) {
        this.eachAdditionalAmount = value;
    }
    /**
     * Sets the eachAdditionalAmountOffShippingCost property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the eachAdditionalAmountOffShippingCost property.
     */
    public void setEachAdditionalAmountOffShippingCost(@jakarta.annotation.Nullable final Amount value) {
        this.eachAdditionalAmountOffShippingCost = value;
    }
    /**
     * Sets the eachAdditionalPercentOffShippingCost property value. This integer specifies the percentage discount applied to the total shipping cost for each additional item in the combined order.
     * @param value Value to set for the eachAdditionalPercentOffShippingCost property.
     */
    public void setEachAdditionalPercentOffShippingCost(@jakarta.annotation.Nullable final Double value) {
        this.eachAdditionalPercentOffShippingCost = value;
    }
    /**
     * Sets the mappedCombinedShippingRuleId property value. This field specifies the unique ID that links this combined-shipping rule to another related rule in the sellers account.
     * @param value Value to set for the mappedCombinedShippingRuleId property.
     */
    public void setMappedCombinedShippingRuleId(@jakarta.annotation.Nullable final String value) {
        this.mappedCombinedShippingRuleId = value;
    }
    /**
     * Sets the weightOffTotalWeight property value. This type displays measurement type with value, unit, and measurement system.
     * @param value Value to set for the weightOffTotalWeight property.
     */
    public void setWeightOffTotalWeight(@jakarta.annotation.Nullable final MeasureType value) {
        this.weightOffTotalWeight = value;
    }
}
