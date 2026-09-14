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
 * This container defines the updated shipping cost information for a rate object identified by &lt;b&gt;rateId&lt;/b&gt;.&lt;br/&gt;&lt;br/&gt;To view a list of all rate objects and corresponding &lt;b&gt;rateID&lt;/b&gt; values, issue &lt;b&gt;getRateTable&lt;/b&gt; for the rate table identified by &lt;b&gt;rateTableId&lt;/b&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RateUpdate implements AdditionalDataHolder, Parsable {
    /**
     * An additional shipping cost added to the base shipping rate (i.e., &lt;b&gt;shippingCost&lt;/b&gt;).&lt;br/&gt;&lt;br/&gt;This amount applies only to the following &lt;b&gt;rateTableBasis&lt;/b&gt; options:&lt;ul&gt;&lt;li&gt;&lt;b&gt;WEIGHT&lt;/b&gt;: This is a cost per unit weight and is calculated using the weight of the item(s) being shipped.&lt;/li&gt;&lt;li&gt;&lt;b&gt;SURCHARGE&lt;/b&gt;: This is a flat amount that is added to the base shipping rate.&lt;/li&gt;&lt;/ul&gt;This field is returned only when it is applicable to the specified rate ID.
     */
    private Amount additionalCost;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The identifier for the rate object.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This is a string automatically assigned by the system when the rate object is created. It cannot be changed or updated.&lt;/span&gt;
     */
    private String rateId;
    /**
     * This is the base shipping rate for an item.&lt;br/&gt;&lt;br/&gt;This amount applies only to the following &lt;b&gt;rateTableBasis&lt;/b&gt; options:&lt;ul&gt;&lt;li&gt;&lt;b&gt;ITEM&lt;/b&gt;: This is a flat rate shipping cost per item being shipped.&lt;/li&gt;&lt;li&gt;&lt;b&gt;WEIGHT&lt;/b&gt;: This is a cost per unit weight and is calculated using the weight of the item(s) being shipped.&lt;/li&gt;&lt;/ul&gt;
     */
    private Amount shippingCost;
    /**
     * Instantiates a new {@link RateUpdate} and sets the default values.
     */
    public RateUpdate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RateUpdate}
     */
    @jakarta.annotation.Nonnull
    public static RateUpdate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RateUpdate();
    }
    /**
     * Gets the additionalCost property value. An additional shipping cost added to the base shipping rate (i.e., &lt;b&gt;shippingCost&lt;/b&gt;).&lt;br/&gt;&lt;br/&gt;This amount applies only to the following &lt;b&gt;rateTableBasis&lt;/b&gt; options:&lt;ul&gt;&lt;li&gt;&lt;b&gt;WEIGHT&lt;/b&gt;: This is a cost per unit weight and is calculated using the weight of the item(s) being shipped.&lt;/li&gt;&lt;li&gt;&lt;b&gt;SURCHARGE&lt;/b&gt;: This is a flat amount that is added to the base shipping rate.&lt;/li&gt;&lt;/ul&gt;This field is returned only when it is applicable to the specified rate ID.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAdditionalCost() {
        return this.additionalCost;
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("additionalCost", (n) -> { this.setAdditionalCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("rateId", (n) -> { this.setRateId(n.getStringValue()); });
        deserializerMap.put("shippingCost", (n) -> { this.setShippingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the rateId property value. The identifier for the rate object.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This is a string automatically assigned by the system when the rate object is created. It cannot be changed or updated.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRateId() {
        return this.rateId;
    }
    /**
     * Gets the shippingCost property value. This is the base shipping rate for an item.&lt;br/&gt;&lt;br/&gt;This amount applies only to the following &lt;b&gt;rateTableBasis&lt;/b&gt; options:&lt;ul&gt;&lt;li&gt;&lt;b&gt;ITEM&lt;/b&gt;: This is a flat rate shipping cost per item being shipped.&lt;/li&gt;&lt;li&gt;&lt;b&gt;WEIGHT&lt;/b&gt;: This is a cost per unit weight and is calculated using the weight of the item(s) being shipped.&lt;/li&gt;&lt;/ul&gt;
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
        writer.writeObjectValue("additionalCost", this.getAdditionalCost());
        writer.writeStringValue("rateId", this.getRateId());
        writer.writeObjectValue("shippingCost", this.getShippingCost());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalCost property value. An additional shipping cost added to the base shipping rate (i.e., &lt;b&gt;shippingCost&lt;/b&gt;).&lt;br/&gt;&lt;br/&gt;This amount applies only to the following &lt;b&gt;rateTableBasis&lt;/b&gt; options:&lt;ul&gt;&lt;li&gt;&lt;b&gt;WEIGHT&lt;/b&gt;: This is a cost per unit weight and is calculated using the weight of the item(s) being shipped.&lt;/li&gt;&lt;li&gt;&lt;b&gt;SURCHARGE&lt;/b&gt;: This is a flat amount that is added to the base shipping rate.&lt;/li&gt;&lt;/ul&gt;This field is returned only when it is applicable to the specified rate ID.
     * @param value Value to set for the additionalCost property.
     */
    public void setAdditionalCost(@jakarta.annotation.Nullable final Amount value) {
        this.additionalCost = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the rateId property value. The identifier for the rate object.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This is a string automatically assigned by the system when the rate object is created. It cannot be changed or updated.&lt;/span&gt;
     * @param value Value to set for the rateId property.
     */
    public void setRateId(@jakarta.annotation.Nullable final String value) {
        this.rateId = value;
    }
    /**
     * Sets the shippingCost property value. This is the base shipping rate for an item.&lt;br/&gt;&lt;br/&gt;This amount applies only to the following &lt;b&gt;rateTableBasis&lt;/b&gt; options:&lt;ul&gt;&lt;li&gt;&lt;b&gt;ITEM&lt;/b&gt;: This is a flat rate shipping cost per item being shipped.&lt;/li&gt;&lt;li&gt;&lt;b&gt;WEIGHT&lt;/b&gt;: This is a cost per unit weight and is calculated using the weight of the item(s) being shipped.&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the shippingCost property.
     */
    public void setShippingCost(@jakarta.annotation.Nullable final Amount value) {
        this.shippingCost = value;
    }
}
