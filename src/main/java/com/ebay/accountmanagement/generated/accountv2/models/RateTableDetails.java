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
 * This container includes all information pertaining to a shipping rate table. A successful call returns the requested shipping rate information.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RateTableDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Identifies the eBay marketplace to which the shipping rate table applies.
     */
    private MarketplaceIdEnum marketplaceId;
    /**
     * The seller-defined name for the shipping rate table. Names must be unique for each table assigned to the same seller, shippingOptionType, and eBay marketplace.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Max length:&lt;/b&gt; 50
     */
    private String name;
    /**
     * An array of rate objects associated with the specified shipping rate table. Each rate object is identified by a unique system-generated ID and defines specific shipping rate information.
     */
    private java.util.List<Rate> rates;
    /**
     * The rate calculation type provides three methods of calculating the shipping cost based on the seller&apos;s selection/input:&lt;ul&gt;&lt;li&gt;&lt;b&gt;ITEM&lt;/b&gt;: Specifies the flat rate shipping cost that buyers in the specified shipping region will pay. When this option is selected, information specified in the rate table overrides all shipping options/costs that are specified at the listing level. Buyers in the specified regions will only see the services provided in the rate table. Buyers in other regions that are not specified in the rate table will see the shipping services associated with the listing.&lt;/li&gt;&lt;li&gt;&lt;b&gt;WEIGHT&lt;/b&gt;: Seller can provide minimum shipping cost and an additional shipping cost per pound. The additional cost will be calculated based on the weight the seller provide at the time of listing. Buyers will see the total shipping cost and wont see these calculations.  Buyers in the specified regions will only see the services provided in the rate table. Buyers in other regions that were not specified in the rate table, will see the shipping services associated with the listing.&lt;/li&gt;&lt;li&gt;&lt;b&gt;SURCHARGE&lt;/b&gt;: Lists surcharges for buyers within specified regions, or indicates a flat amount added to the shipping cost specified within an item&apos;s listing. Buyers will see only the total shipping cost as well as shipping services associated with the item&apos;s listing. If a SURCHARGE is specified in the rate table for certain regions, buyers in those regions will see the (shipping cost + SURCHARGE) total.&lt;/li&gt;&lt;/ul&gt;
     */
    private ShippingRateCalculationEnum rateTableBasis;
    /**
     * A unique, system-generated ID assigned to the shipping rate table when it is initially created.
     */
    private String rateTableId;
    /**
     * The region serviced by the shipping rate table. Valid values are:&lt;ul&gt;&lt;li&gt;&lt;b&gt;DOMESTIC&lt;/b&gt;: Indicates that the shipping rate table applies to shipping destinations within the country in which an item has been listed (i.e., the &lt;i&gt;source&lt;/i&gt; country).&lt;/li&gt;&lt;li&gt;&lt;b&gt;INTERNATIONAL&lt;/b&gt;: Indicates that the shipping rate table applies to shipping destinations outside of the country in which an item has been listed.&lt;/li&gt;&lt;/ul&gt;
     */
    private ShippingOptionTypeEnum shippingOptionType;
    /**
     * Instantiates a new {@link RateTableDetails} and sets the default values.
     */
    public RateTableDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RateTableDetails}
     */
    @jakarta.annotation.Nonnull
    public static RateTableDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RateTableDetails();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getEnumValue(MarketplaceIdEnum::forValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("rates", (n) -> { this.setRates(n.getCollectionOfObjectValues(Rate::createFromDiscriminatorValue)); });
        deserializerMap.put("rateTableBasis", (n) -> { this.setRateTableBasis(n.getEnumValue(ShippingRateCalculationEnum::forValue)); });
        deserializerMap.put("rateTableId", (n) -> { this.setRateTableId(n.getStringValue()); });
        deserializerMap.put("shippingOptionType", (n) -> { this.setShippingOptionType(n.getEnumValue(ShippingOptionTypeEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the marketplaceId property value. Identifies the eBay marketplace to which the shipping rate table applies.
     * @return a {@link MarketplaceIdEnum}
     */
    @jakarta.annotation.Nullable
    public MarketplaceIdEnum getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Gets the name property value. The seller-defined name for the shipping rate table. Names must be unique for each table assigned to the same seller, shippingOptionType, and eBay marketplace.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Max length:&lt;/b&gt; 50
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the rates property value. An array of rate objects associated with the specified shipping rate table. Each rate object is identified by a unique system-generated ID and defines specific shipping rate information.
     * @return a {@link java.util.List<Rate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Rate> getRates() {
        return this.rates;
    }
    /**
     * Gets the rateTableBasis property value. The rate calculation type provides three methods of calculating the shipping cost based on the seller&apos;s selection/input:&lt;ul&gt;&lt;li&gt;&lt;b&gt;ITEM&lt;/b&gt;: Specifies the flat rate shipping cost that buyers in the specified shipping region will pay. When this option is selected, information specified in the rate table overrides all shipping options/costs that are specified at the listing level. Buyers in the specified regions will only see the services provided in the rate table. Buyers in other regions that are not specified in the rate table will see the shipping services associated with the listing.&lt;/li&gt;&lt;li&gt;&lt;b&gt;WEIGHT&lt;/b&gt;: Seller can provide minimum shipping cost and an additional shipping cost per pound. The additional cost will be calculated based on the weight the seller provide at the time of listing. Buyers will see the total shipping cost and wont see these calculations.  Buyers in the specified regions will only see the services provided in the rate table. Buyers in other regions that were not specified in the rate table, will see the shipping services associated with the listing.&lt;/li&gt;&lt;li&gt;&lt;b&gt;SURCHARGE&lt;/b&gt;: Lists surcharges for buyers within specified regions, or indicates a flat amount added to the shipping cost specified within an item&apos;s listing. Buyers will see only the total shipping cost as well as shipping services associated with the item&apos;s listing. If a SURCHARGE is specified in the rate table for certain regions, buyers in those regions will see the (shipping cost + SURCHARGE) total.&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link ShippingRateCalculationEnum}
     */
    @jakarta.annotation.Nullable
    public ShippingRateCalculationEnum getRateTableBasis() {
        return this.rateTableBasis;
    }
    /**
     * Gets the rateTableId property value. A unique, system-generated ID assigned to the shipping rate table when it is initially created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRateTableId() {
        return this.rateTableId;
    }
    /**
     * Gets the shippingOptionType property value. The region serviced by the shipping rate table. Valid values are:&lt;ul&gt;&lt;li&gt;&lt;b&gt;DOMESTIC&lt;/b&gt;: Indicates that the shipping rate table applies to shipping destinations within the country in which an item has been listed (i.e., the &lt;i&gt;source&lt;/i&gt; country).&lt;/li&gt;&lt;li&gt;&lt;b&gt;INTERNATIONAL&lt;/b&gt;: Indicates that the shipping rate table applies to shipping destinations outside of the country in which an item has been listed.&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link ShippingOptionTypeEnum}
     */
    @jakarta.annotation.Nullable
    public ShippingOptionTypeEnum getShippingOptionType() {
        return this.shippingOptionType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("marketplaceId", this.getMarketplaceId());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("rates", this.getRates());
        writer.writeEnumValue("rateTableBasis", this.getRateTableBasis());
        writer.writeStringValue("rateTableId", this.getRateTableId());
        writer.writeEnumValue("shippingOptionType", this.getShippingOptionType());
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
     * Sets the marketplaceId property value. Identifies the eBay marketplace to which the shipping rate table applies.
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final MarketplaceIdEnum value) {
        this.marketplaceId = value;
    }
    /**
     * Sets the name property value. The seller-defined name for the shipping rate table. Names must be unique for each table assigned to the same seller, shippingOptionType, and eBay marketplace.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Max length:&lt;/b&gt; 50
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the rates property value. An array of rate objects associated with the specified shipping rate table. Each rate object is identified by a unique system-generated ID and defines specific shipping rate information.
     * @param value Value to set for the rates property.
     */
    public void setRates(@jakarta.annotation.Nullable final java.util.List<Rate> value) {
        this.rates = value;
    }
    /**
     * Sets the rateTableBasis property value. The rate calculation type provides three methods of calculating the shipping cost based on the seller&apos;s selection/input:&lt;ul&gt;&lt;li&gt;&lt;b&gt;ITEM&lt;/b&gt;: Specifies the flat rate shipping cost that buyers in the specified shipping region will pay. When this option is selected, information specified in the rate table overrides all shipping options/costs that are specified at the listing level. Buyers in the specified regions will only see the services provided in the rate table. Buyers in other regions that are not specified in the rate table will see the shipping services associated with the listing.&lt;/li&gt;&lt;li&gt;&lt;b&gt;WEIGHT&lt;/b&gt;: Seller can provide minimum shipping cost and an additional shipping cost per pound. The additional cost will be calculated based on the weight the seller provide at the time of listing. Buyers will see the total shipping cost and wont see these calculations.  Buyers in the specified regions will only see the services provided in the rate table. Buyers in other regions that were not specified in the rate table, will see the shipping services associated with the listing.&lt;/li&gt;&lt;li&gt;&lt;b&gt;SURCHARGE&lt;/b&gt;: Lists surcharges for buyers within specified regions, or indicates a flat amount added to the shipping cost specified within an item&apos;s listing. Buyers will see only the total shipping cost as well as shipping services associated with the item&apos;s listing. If a SURCHARGE is specified in the rate table for certain regions, buyers in those regions will see the (shipping cost + SURCHARGE) total.&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the rateTableBasis property.
     */
    public void setRateTableBasis(@jakarta.annotation.Nullable final ShippingRateCalculationEnum value) {
        this.rateTableBasis = value;
    }
    /**
     * Sets the rateTableId property value. A unique, system-generated ID assigned to the shipping rate table when it is initially created.
     * @param value Value to set for the rateTableId property.
     */
    public void setRateTableId(@jakarta.annotation.Nullable final String value) {
        this.rateTableId = value;
    }
    /**
     * Sets the shippingOptionType property value. The region serviced by the shipping rate table. Valid values are:&lt;ul&gt;&lt;li&gt;&lt;b&gt;DOMESTIC&lt;/b&gt;: Indicates that the shipping rate table applies to shipping destinations within the country in which an item has been listed (i.e., the &lt;i&gt;source&lt;/i&gt; country).&lt;/li&gt;&lt;li&gt;&lt;b&gt;INTERNATIONAL&lt;/b&gt;: Indicates that the shipping rate table applies to shipping destinations outside of the country in which an item has been listed.&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the shippingOptionType property.
     */
    public void setShippingOptionType(@jakarta.annotation.Nullable final ShippingOptionTypeEnum value) {
        this.shippingOptionType = value;
    }
}
