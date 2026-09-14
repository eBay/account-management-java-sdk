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
 * This type is used to represent a promotional shipping rule set up by the seller on an eBay marketplace.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PromotionalShippingRuleType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field specifies the type of combined-shipping rule applied, such as flat-rate or cost-based, as defined in the &lt;a href=&quot;/develop/api/sell/account_api_v2#sell-account_api_v2-combined_shipping_rules-getcombinedshippingrules.flatshippingruletype.combinedshippingruletype&quot; target=&quot;_blank&quot;&gt;CombinedShippingRuleTypeEnum&lt;/a&gt;.
     */
    private CombinedShippingRuleTypeEnum combinedShippingRuleType;
    /**
     * This integer indicates the quantity of items that must be purchased by the buyer in order for that buyer to qualify for the promotional discount.
     */
    private Integer itemCount;
    /**
     * This container specifies the minimum order amount required to qualify for the associated discount or promotional rule.
     */
    private Amount orderAmount;
    /**
     * This container represents the total shipping cost or discounted shipping charge for the combined order.
     */
    private Amount shippingCost;
    /**
     * Instantiates a new {@link PromotionalShippingRuleType} and sets the default values.
     */
    public PromotionalShippingRuleType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PromotionalShippingRuleType}
     */
    @jakarta.annotation.Nonnull
    public static PromotionalShippingRuleType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PromotionalShippingRuleType();
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
     * Gets the combinedShippingRuleType property value. This field specifies the type of combined-shipping rule applied, such as flat-rate or cost-based, as defined in the &lt;a href=&quot;/develop/api/sell/account_api_v2#sell-account_api_v2-combined_shipping_rules-getcombinedshippingrules.flatshippingruletype.combinedshippingruletype&quot; target=&quot;_blank&quot;&gt;CombinedShippingRuleTypeEnum&lt;/a&gt;.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("combinedShippingRuleType", (n) -> { this.setCombinedShippingRuleType(n.getEnumValue(CombinedShippingRuleTypeEnum::forValue)); });
        deserializerMap.put("itemCount", (n) -> { this.setItemCount(n.getIntegerValue()); });
        deserializerMap.put("orderAmount", (n) -> { this.setOrderAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("shippingCost", (n) -> { this.setShippingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the itemCount property value. This integer indicates the quantity of items that must be purchased by the buyer in order for that buyer to qualify for the promotional discount.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getItemCount() {
        return this.itemCount;
    }
    /**
     * Gets the orderAmount property value. This container specifies the minimum order amount required to qualify for the associated discount or promotional rule.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getOrderAmount() {
        return this.orderAmount;
    }
    /**
     * Gets the shippingCost property value. This container represents the total shipping cost or discounted shipping charge for the combined order.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getShippingCost() {
        return this.shippingCost;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("combinedShippingRuleType", this.getCombinedShippingRuleType());
        writer.writeIntegerValue("itemCount", this.getItemCount());
        writer.writeObjectValue("orderAmount", this.getOrderAmount());
        writer.writeObjectValue("shippingCost", this.getShippingCost());
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
     * Sets the combinedShippingRuleType property value. This field specifies the type of combined-shipping rule applied, such as flat-rate or cost-based, as defined in the &lt;a href=&quot;/develop/api/sell/account_api_v2#sell-account_api_v2-combined_shipping_rules-getcombinedshippingrules.flatshippingruletype.combinedshippingruletype&quot; target=&quot;_blank&quot;&gt;CombinedShippingRuleTypeEnum&lt;/a&gt;.
     * @param value Value to set for the combinedShippingRuleType property.
     */
    public void setCombinedShippingRuleType(@jakarta.annotation.Nullable final CombinedShippingRuleTypeEnum value) {
        this.combinedShippingRuleType = value;
    }
    /**
     * Sets the itemCount property value. This integer indicates the quantity of items that must be purchased by the buyer in order for that buyer to qualify for the promotional discount.
     * @param value Value to set for the itemCount property.
     */
    public void setItemCount(@jakarta.annotation.Nullable final Integer value) {
        this.itemCount = value;
    }
    /**
     * Sets the orderAmount property value. This container specifies the minimum order amount required to qualify for the associated discount or promotional rule.
     * @param value Value to set for the orderAmount property.
     */
    public void setOrderAmount(@jakarta.annotation.Nullable final Amount value) {
        this.orderAmount = value;
    }
    /**
     * Sets the shippingCost property value. This container represents the total shipping cost or discounted shipping charge for the combined order.
     * @param value Value to set for the shippingCost property.
     */
    public void setShippingCost(@jakarta.annotation.Nullable final Amount value) {
        this.shippingCost = value;
    }
}
