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
 * This type defines the flat-rate combined-shipping rule, which applies a fixed shipping cost for multiple items shipped together.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FlatShippingRuleType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array specifies the type of combined-shipping rule applied, such as flat-rate or cost-based.
     */
    private java.util.List<CombinedShippingRule> combinedShippingRules;
    /**
     * This container defines the type of discount rule applied (e.g., percentage-based, fixed-rate). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:CombinedShippingRuleTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String combinedShippingRuleType;
    /**
     * Instantiates a new {@link FlatShippingRuleType} and sets the default values.
     */
    public FlatShippingRuleType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FlatShippingRuleType}
     */
    @jakarta.annotation.Nonnull
    public static FlatShippingRuleType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FlatShippingRuleType();
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
     * Gets the combinedShippingRules property value. This array specifies the type of combined-shipping rule applied, such as flat-rate or cost-based.
     * @return a {@link java.util.List<CombinedShippingRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CombinedShippingRule> getCombinedShippingRules() {
        return this.combinedShippingRules;
    }
    /**
     * Gets the combinedShippingRuleType property value. This container defines the type of discount rule applied (e.g., percentage-based, fixed-rate). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:CombinedShippingRuleTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCombinedShippingRuleType() {
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
        deserializerMap.put("combinedShippingRuleType", (n) -> { this.setCombinedShippingRuleType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("combinedShippingRules", this.getCombinedShippingRules());
        writer.writeStringValue("combinedShippingRuleType", this.getCombinedShippingRuleType());
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
     * Sets the combinedShippingRules property value. This array specifies the type of combined-shipping rule applied, such as flat-rate or cost-based.
     * @param value Value to set for the combinedShippingRules property.
     */
    public void setCombinedShippingRules(@jakarta.annotation.Nullable final java.util.List<CombinedShippingRule> value) {
        this.combinedShippingRules = value;
    }
    /**
     * Sets the combinedShippingRuleType property value. This container defines the type of discount rule applied (e.g., percentage-based, fixed-rate). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:CombinedShippingRuleTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the combinedShippingRuleType property.
     */
    public void setCombinedShippingRuleType(@jakarta.annotation.Nullable final String value) {
        this.combinedShippingRuleType = value;
    }
}
