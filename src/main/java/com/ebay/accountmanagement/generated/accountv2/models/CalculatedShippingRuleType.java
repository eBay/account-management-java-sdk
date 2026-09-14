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
 * This type describes calculated discount rules determining total shipping cost reductions for combined items.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CalculatedShippingRuleType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array lists the discount rules applied to combined shipments, detailing calculation methods and rule identifiers. &lt;br&gt;&lt;br&gt;When used by a create call, there won&apos;t be any rule ID.
     */
    private java.util.List<CombinedShippingRule> combinedShippingRules;
    /**
     * This container defines the type of combined-shipping rule applied to calculate discounts, such as weight-based, percentage-based, or flat-rate models.
     */
    private CombinedShippingRuleTypeEnum combinedShippingRuleType;
    /**
     * Instantiates a new {@link CalculatedShippingRuleType} and sets the default values.
     */
    public CalculatedShippingRuleType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CalculatedShippingRuleType}
     */
    @jakarta.annotation.Nonnull
    public static CalculatedShippingRuleType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CalculatedShippingRuleType();
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
     * Gets the combinedShippingRules property value. This array lists the discount rules applied to combined shipments, detailing calculation methods and rule identifiers. &lt;br&gt;&lt;br&gt;When used by a create call, there won&apos;t be any rule ID.
     * @return a {@link java.util.List<CombinedShippingRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CombinedShippingRule> getCombinedShippingRules() {
        return this.combinedShippingRules;
    }
    /**
     * Gets the combinedShippingRuleType property value. This container defines the type of combined-shipping rule applied to calculate discounts, such as weight-based, percentage-based, or flat-rate models.
     * @return a {@link CombinedShippingRuleTypeEnum}
     */
    @jakarta.annotation.Nullable
    public CombinedShippingRuleTypeEnum getCombinedShippingRuleType() {
        return this.combinedShippingRuleType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("combinedShippingRules", (n) -> { this.setCombinedShippingRules(n.getCollectionOfObjectValues(CombinedShippingRule::createFromDiscriminatorValue)); });
        deserializerMap.put("combinedShippingRuleType", (n) -> { this.setCombinedShippingRuleType(n.getEnumValue(CombinedShippingRuleTypeEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("combinedShippingRules", this.getCombinedShippingRules());
        writer.writeEnumValue("combinedShippingRuleType", this.getCombinedShippingRuleType());
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
     * Sets the combinedShippingRules property value. This array lists the discount rules applied to combined shipments, detailing calculation methods and rule identifiers. &lt;br&gt;&lt;br&gt;When used by a create call, there won&apos;t be any rule ID.
     * @param value Value to set for the combinedShippingRules property.
     */
    public void setCombinedShippingRules(@jakarta.annotation.Nullable final java.util.List<CombinedShippingRule> value) {
        this.combinedShippingRules = value;
    }
    /**
     * Sets the combinedShippingRuleType property value. This container defines the type of combined-shipping rule applied to calculate discounts, such as weight-based, percentage-based, or flat-rate models.
     * @param value Value to set for the combinedShippingRuleType property.
     */
    public void setCombinedShippingRuleType(@jakarta.annotation.Nullable final CombinedShippingRuleTypeEnum value) {
        this.combinedShippingRuleType = value;
    }
}
