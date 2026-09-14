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

package com.ebay.accountmanagement.generated.accountv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This root container defines a seller&apos;s fulfillment policy for a specific marketplace and category group. This type is used when creating or updating a fulfillment business policy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FulfillmentPolicyRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container is used to specify whether the fulfillment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
     */
    private java.util.List<CategoryType> categoryTypes;
    /**
     * A seller-defined description of the fulfillment policy. This description is only for the seller&apos;s use, and is not exposed on any eBay pages.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
     */
    private String description;
    /**
     * This field is included and set to &lt;code&gt;true&lt;/code&gt; if freight shipping is available for the item. Freight shipping can be used for large items over 150 lbs.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: false
     */
    private Boolean freightShipping;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: This field is only applicable for the eBay United Kingdom marketplace (&lt;code&gt;EBAY_GB&lt;/code&gt;).&lt;/span&gt;&lt;br&gt;This field is included and set to &lt;code&gt;true&lt;/code&gt; if the seller wants to use the Global Shipping Program for international shipments. See the &lt;a href=&quot;https://pages.ebay.com/help/sell/shipping-globally.html &quot;&gt;Global Shipping Program&lt;/a&gt; help topic for more details and requirements on the Global Shipping Program.&lt;br&gt;&lt;br&gt;A seller can use a combination of the Global Shipping Program and other international shipping services. &lt;br&gt;&lt;br&gt;If set to &lt;code&gt;false&lt;/code&gt; or if the field is omitted, the seller has to manually specifying individual international shipping services (if the seller ships internationally), as described in &lt;a href=&quot;https://developer.ebay.com/api-docs/sell/static/seller-accounts/ht_shipping-worldwide.html &quot;&gt;Setting up worldwide shipping&lt;/a&gt;. &lt;br&gt;&lt;br&gt;Sellers opt in or out of the Global Shipping Program through the Shipping preferences in My eBay.&lt;br&gt;&lt;br&gt;eBay International Shipping is an account level setting; no field needs to be set in a Fulfillment business policy to enable eBay International Shipping. If a US seller&apos;s account is opted in to eBay International Shipping, this shipping option will be enabled automatically for all listings where international shipping is available. A US seller who is opted in to eBay International Shipping can also specify individual international shipping service options for a Fulfillment business policy.&lt;p&gt;&lt;b&gt;Default&lt;/b&gt;: false&lt;/p&gt;
     */
    private Boolean globalShipping;
    /**
     * A type used to specify a period of time using a specified time-measurement unit. Payment, return, and fulfillment business policies all use this type to specify time windows.&lt;br&gt;&lt;br&gt;Whenever a container that uses this type is used in a request, both of these fields are required. Similarly, whenever a container that uses this type is returned in a response, both of these fields are always returned.
     */
    private TimeDuration handlingTime;
    /**
     * This field should be included and set to &lt;code&gt;true&lt;/code&gt; if local pickup is one of the fulfillment options available to the buyer. It is possible for the seller to make local pickup and some shipping service options available to the buyer.&lt;br&gt;&lt;br&gt;With local pickup, the buyer and seller make arrangements for pickup time and location.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: &lt;code&gt;false&lt;/code&gt;
     */
    private Boolean localPickup;
    /**
     * The ID of the eBay marketplace to which this fulfillment policy applies. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String marketplaceId;
    /**
     * A seller-defined name for this fulfillment policy. Names must be unique for policies assigned to the same marketplace. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 64
     */
    private String name;
    /**
     * This field should be included and set to &lt;code&gt;true&lt;/code&gt; if the seller offers the &quot;Click and Collect&quot; feature for an item. &lt;p&gt;To enable &quot;Click and Collect&quot; on a listing, a seller must be eligible for Click and Collect. Currently, Click and Collect is available to only large retail merchants selling in the eBay AU, UK, DE, FR, and IT marketplaces.&lt;/p&gt;  &lt;p&gt;In addition to setting this field to &lt;code&gt;true&lt;/code&gt;, the merchant must also do the following to enable the &quot;Click and Collect&quot; option on a listing: &lt;ul&gt;&lt;li&gt;Have inventory for the product at one or more physical stores tied to the merchant&apos;s account. &lt;p&gt;Sellers can use the &lt;b&gt;createInventoryLocation&lt;/b&gt; method in the Inventory API to associate physical stores to their account and they can then add inventory to specific store locations.&lt;/p&gt;&lt;/li&gt;&lt;li&gt;Set an immediate payment requirement on the item. The immediate payment feature requires the seller to: &lt;ul&gt;&lt;li&gt;Set the &lt;b&gt;immediatePay&lt;/b&gt; flag in the payment policy to &apos;true&apos;.&lt;/li&gt;&lt;li&gt;Have a valid store location with a complete street address.&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;When a merchant successfully lists an item with Click and Collect, prospective buyers within a reasonable distance from one of the merchant&apos;s stores (that has stock available) will see the &quot;Available for Click and Collect&quot; option on the listing, along with information on the closest store that has the item.&lt;/p&gt;&lt;b&gt;Default&lt;/b&gt;: false
     */
    private Boolean pickupDropOff;
    /**
     * This array is used to provide detailed information on the domestic and international shipping options available for the policy. &lt;br&gt;&lt;br&gt;A separate &lt;b&gt;ShippingOption&lt;/b&gt; object is required for domestic shipping service options and for international shipping service options (if the seller ships to international locations). &lt;ul&gt;&lt;li&gt;The &lt;b&gt;optionType&lt;/b&gt; field is used to indicate whether the &lt;b&gt;ShippingOption&lt;/b&gt; object applies to domestic or international shipping, and the &lt;b&gt;costType&lt;/b&gt; field is used to indicate whether flat-rate shipping or calculated shipping will be used.&lt;/li&gt; &lt;li&gt;The &lt;b&gt;rateTableId&lt;/b&gt; field can be used to associate a defined shipping rate table to the policy, and the &lt;b&gt;packageHandlingCost&lt;/b&gt; container can be used to set a handling charge for the policy.&lt;/li&gt;&lt;/ul&gt; &lt;p&gt;A separate &lt;b&gt;ShippingServices&lt;/b&gt; object will be used to specify cost and other details for every available domestic and international shipping service option. &lt;/p&gt;
     */
    private java.util.List<ShippingOption> shippingOptions;
    /**
     * This type consists of the &lt;b&gt;regionIncluded&lt;/b&gt; and &lt;b&gt;regionExcluded&lt;/b&gt; arrays, which indicate the areas to where the seller does and doesn&apos;t ship.
     */
    private RegionSet shipToLocations;
    /**
     * Instantiates a new {@link FulfillmentPolicyRequest} and sets the default values.
     */
    public FulfillmentPolicyRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FulfillmentPolicyRequest}
     */
    @jakarta.annotation.Nonnull
    public static FulfillmentPolicyRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FulfillmentPolicyRequest();
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
     * Gets the categoryTypes property value. This container is used to specify whether the fulfillment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
     * @return a {@link java.util.List<CategoryType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CategoryType> getCategoryTypes() {
        return this.categoryTypes;
    }
    /**
     * Gets the description property value. A seller-defined description of the fulfillment policy. This description is only for the seller&apos;s use, and is not exposed on any eBay pages.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("categoryTypes", (n) -> { this.setCategoryTypes(n.getCollectionOfObjectValues(CategoryType::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("freightShipping", (n) -> { this.setFreightShipping(n.getBooleanValue()); });
        deserializerMap.put("globalShipping", (n) -> { this.setGlobalShipping(n.getBooleanValue()); });
        deserializerMap.put("handlingTime", (n) -> { this.setHandlingTime(n.getObjectValue(TimeDuration::createFromDiscriminatorValue)); });
        deserializerMap.put("localPickup", (n) -> { this.setLocalPickup(n.getBooleanValue()); });
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("pickupDropOff", (n) -> { this.setPickupDropOff(n.getBooleanValue()); });
        deserializerMap.put("shippingOptions", (n) -> { this.setShippingOptions(n.getCollectionOfObjectValues(ShippingOption::createFromDiscriminatorValue)); });
        deserializerMap.put("shipToLocations", (n) -> { this.setShipToLocations(n.getObjectValue(RegionSet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the freightShipping property value. This field is included and set to &lt;code&gt;true&lt;/code&gt; if freight shipping is available for the item. Freight shipping can be used for large items over 150 lbs.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: false
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFreightShipping() {
        return this.freightShipping;
    }
    /**
     * Gets the globalShipping property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: This field is only applicable for the eBay United Kingdom marketplace (&lt;code&gt;EBAY_GB&lt;/code&gt;).&lt;/span&gt;&lt;br&gt;This field is included and set to &lt;code&gt;true&lt;/code&gt; if the seller wants to use the Global Shipping Program for international shipments. See the &lt;a href=&quot;https://pages.ebay.com/help/sell/shipping-globally.html &quot;&gt;Global Shipping Program&lt;/a&gt; help topic for more details and requirements on the Global Shipping Program.&lt;br&gt;&lt;br&gt;A seller can use a combination of the Global Shipping Program and other international shipping services. &lt;br&gt;&lt;br&gt;If set to &lt;code&gt;false&lt;/code&gt; or if the field is omitted, the seller has to manually specifying individual international shipping services (if the seller ships internationally), as described in &lt;a href=&quot;https://developer.ebay.com/api-docs/sell/static/seller-accounts/ht_shipping-worldwide.html &quot;&gt;Setting up worldwide shipping&lt;/a&gt;. &lt;br&gt;&lt;br&gt;Sellers opt in or out of the Global Shipping Program through the Shipping preferences in My eBay.&lt;br&gt;&lt;br&gt;eBay International Shipping is an account level setting; no field needs to be set in a Fulfillment business policy to enable eBay International Shipping. If a US seller&apos;s account is opted in to eBay International Shipping, this shipping option will be enabled automatically for all listings where international shipping is available. A US seller who is opted in to eBay International Shipping can also specify individual international shipping service options for a Fulfillment business policy.&lt;p&gt;&lt;b&gt;Default&lt;/b&gt;: false&lt;/p&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getGlobalShipping() {
        return this.globalShipping;
    }
    /**
     * Gets the handlingTime property value. A type used to specify a period of time using a specified time-measurement unit. Payment, return, and fulfillment business policies all use this type to specify time windows.&lt;br&gt;&lt;br&gt;Whenever a container that uses this type is used in a request, both of these fields are required. Similarly, whenever a container that uses this type is returned in a response, both of these fields are always returned.
     * @return a {@link TimeDuration}
     */
    @jakarta.annotation.Nullable
    public TimeDuration getHandlingTime() {
        return this.handlingTime;
    }
    /**
     * Gets the localPickup property value. This field should be included and set to &lt;code&gt;true&lt;/code&gt; if local pickup is one of the fulfillment options available to the buyer. It is possible for the seller to make local pickup and some shipping service options available to the buyer.&lt;br&gt;&lt;br&gt;With local pickup, the buyer and seller make arrangements for pickup time and location.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: &lt;code&gt;false&lt;/code&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalPickup() {
        return this.localPickup;
    }
    /**
     * Gets the marketplaceId property value. The ID of the eBay marketplace to which this fulfillment policy applies. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Gets the name property value. A seller-defined name for this fulfillment policy. Names must be unique for policies assigned to the same marketplace. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 64
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the pickupDropOff property value. This field should be included and set to &lt;code&gt;true&lt;/code&gt; if the seller offers the &quot;Click and Collect&quot; feature for an item. &lt;p&gt;To enable &quot;Click and Collect&quot; on a listing, a seller must be eligible for Click and Collect. Currently, Click and Collect is available to only large retail merchants selling in the eBay AU, UK, DE, FR, and IT marketplaces.&lt;/p&gt;  &lt;p&gt;In addition to setting this field to &lt;code&gt;true&lt;/code&gt;, the merchant must also do the following to enable the &quot;Click and Collect&quot; option on a listing: &lt;ul&gt;&lt;li&gt;Have inventory for the product at one or more physical stores tied to the merchant&apos;s account. &lt;p&gt;Sellers can use the &lt;b&gt;createInventoryLocation&lt;/b&gt; method in the Inventory API to associate physical stores to their account and they can then add inventory to specific store locations.&lt;/p&gt;&lt;/li&gt;&lt;li&gt;Set an immediate payment requirement on the item. The immediate payment feature requires the seller to: &lt;ul&gt;&lt;li&gt;Set the &lt;b&gt;immediatePay&lt;/b&gt; flag in the payment policy to &apos;true&apos;.&lt;/li&gt;&lt;li&gt;Have a valid store location with a complete street address.&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;When a merchant successfully lists an item with Click and Collect, prospective buyers within a reasonable distance from one of the merchant&apos;s stores (that has stock available) will see the &quot;Available for Click and Collect&quot; option on the listing, along with information on the closest store that has the item.&lt;/p&gt;&lt;b&gt;Default&lt;/b&gt;: false
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPickupDropOff() {
        return this.pickupDropOff;
    }
    /**
     * Gets the shippingOptions property value. This array is used to provide detailed information on the domestic and international shipping options available for the policy. &lt;br&gt;&lt;br&gt;A separate &lt;b&gt;ShippingOption&lt;/b&gt; object is required for domestic shipping service options and for international shipping service options (if the seller ships to international locations). &lt;ul&gt;&lt;li&gt;The &lt;b&gt;optionType&lt;/b&gt; field is used to indicate whether the &lt;b&gt;ShippingOption&lt;/b&gt; object applies to domestic or international shipping, and the &lt;b&gt;costType&lt;/b&gt; field is used to indicate whether flat-rate shipping or calculated shipping will be used.&lt;/li&gt; &lt;li&gt;The &lt;b&gt;rateTableId&lt;/b&gt; field can be used to associate a defined shipping rate table to the policy, and the &lt;b&gt;packageHandlingCost&lt;/b&gt; container can be used to set a handling charge for the policy.&lt;/li&gt;&lt;/ul&gt; &lt;p&gt;A separate &lt;b&gt;ShippingServices&lt;/b&gt; object will be used to specify cost and other details for every available domestic and international shipping service option. &lt;/p&gt;
     * @return a {@link java.util.List<ShippingOption>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ShippingOption> getShippingOptions() {
        return this.shippingOptions;
    }
    /**
     * Gets the shipToLocations property value. This type consists of the &lt;b&gt;regionIncluded&lt;/b&gt; and &lt;b&gt;regionExcluded&lt;/b&gt; arrays, which indicate the areas to where the seller does and doesn&apos;t ship.
     * @return a {@link RegionSet}
     */
    @jakarta.annotation.Nullable
    public RegionSet getShipToLocations() {
        return this.shipToLocations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("categoryTypes", this.getCategoryTypes());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("freightShipping", this.getFreightShipping());
        writer.writeBooleanValue("globalShipping", this.getGlobalShipping());
        writer.writeObjectValue("handlingTime", this.getHandlingTime());
        writer.writeBooleanValue("localPickup", this.getLocalPickup());
        writer.writeStringValue("marketplaceId", this.getMarketplaceId());
        writer.writeStringValue("name", this.getName());
        writer.writeBooleanValue("pickupDropOff", this.getPickupDropOff());
        writer.writeCollectionOfObjectValues("shippingOptions", this.getShippingOptions());
        writer.writeObjectValue("shipToLocations", this.getShipToLocations());
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
     * Sets the categoryTypes property value. This container is used to specify whether the fulfillment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
     * @param value Value to set for the categoryTypes property.
     */
    public void setCategoryTypes(@jakarta.annotation.Nullable final java.util.List<CategoryType> value) {
        this.categoryTypes = value;
    }
    /**
     * Sets the description property value. A seller-defined description of the fulfillment policy. This description is only for the seller&apos;s use, and is not exposed on any eBay pages.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the freightShipping property value. This field is included and set to &lt;code&gt;true&lt;/code&gt; if freight shipping is available for the item. Freight shipping can be used for large items over 150 lbs.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: false
     * @param value Value to set for the freightShipping property.
     */
    public void setFreightShipping(@jakarta.annotation.Nullable final Boolean value) {
        this.freightShipping = value;
    }
    /**
     * Sets the globalShipping property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: This field is only applicable for the eBay United Kingdom marketplace (&lt;code&gt;EBAY_GB&lt;/code&gt;).&lt;/span&gt;&lt;br&gt;This field is included and set to &lt;code&gt;true&lt;/code&gt; if the seller wants to use the Global Shipping Program for international shipments. See the &lt;a href=&quot;https://pages.ebay.com/help/sell/shipping-globally.html &quot;&gt;Global Shipping Program&lt;/a&gt; help topic for more details and requirements on the Global Shipping Program.&lt;br&gt;&lt;br&gt;A seller can use a combination of the Global Shipping Program and other international shipping services. &lt;br&gt;&lt;br&gt;If set to &lt;code&gt;false&lt;/code&gt; or if the field is omitted, the seller has to manually specifying individual international shipping services (if the seller ships internationally), as described in &lt;a href=&quot;https://developer.ebay.com/api-docs/sell/static/seller-accounts/ht_shipping-worldwide.html &quot;&gt;Setting up worldwide shipping&lt;/a&gt;. &lt;br&gt;&lt;br&gt;Sellers opt in or out of the Global Shipping Program through the Shipping preferences in My eBay.&lt;br&gt;&lt;br&gt;eBay International Shipping is an account level setting; no field needs to be set in a Fulfillment business policy to enable eBay International Shipping. If a US seller&apos;s account is opted in to eBay International Shipping, this shipping option will be enabled automatically for all listings where international shipping is available. A US seller who is opted in to eBay International Shipping can also specify individual international shipping service options for a Fulfillment business policy.&lt;p&gt;&lt;b&gt;Default&lt;/b&gt;: false&lt;/p&gt;
     * @param value Value to set for the globalShipping property.
     */
    public void setGlobalShipping(@jakarta.annotation.Nullable final Boolean value) {
        this.globalShipping = value;
    }
    /**
     * Sets the handlingTime property value. A type used to specify a period of time using a specified time-measurement unit. Payment, return, and fulfillment business policies all use this type to specify time windows.&lt;br&gt;&lt;br&gt;Whenever a container that uses this type is used in a request, both of these fields are required. Similarly, whenever a container that uses this type is returned in a response, both of these fields are always returned.
     * @param value Value to set for the handlingTime property.
     */
    public void setHandlingTime(@jakarta.annotation.Nullable final TimeDuration value) {
        this.handlingTime = value;
    }
    /**
     * Sets the localPickup property value. This field should be included and set to &lt;code&gt;true&lt;/code&gt; if local pickup is one of the fulfillment options available to the buyer. It is possible for the seller to make local pickup and some shipping service options available to the buyer.&lt;br&gt;&lt;br&gt;With local pickup, the buyer and seller make arrangements for pickup time and location.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: &lt;code&gt;false&lt;/code&gt;
     * @param value Value to set for the localPickup property.
     */
    public void setLocalPickup(@jakarta.annotation.Nullable final Boolean value) {
        this.localPickup = value;
    }
    /**
     * Sets the marketplaceId property value. The ID of the eBay marketplace to which this fulfillment policy applies. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final String value) {
        this.marketplaceId = value;
    }
    /**
     * Sets the name property value. A seller-defined name for this fulfillment policy. Names must be unique for policies assigned to the same marketplace. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 64
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the pickupDropOff property value. This field should be included and set to &lt;code&gt;true&lt;/code&gt; if the seller offers the &quot;Click and Collect&quot; feature for an item. &lt;p&gt;To enable &quot;Click and Collect&quot; on a listing, a seller must be eligible for Click and Collect. Currently, Click and Collect is available to only large retail merchants selling in the eBay AU, UK, DE, FR, and IT marketplaces.&lt;/p&gt;  &lt;p&gt;In addition to setting this field to &lt;code&gt;true&lt;/code&gt;, the merchant must also do the following to enable the &quot;Click and Collect&quot; option on a listing: &lt;ul&gt;&lt;li&gt;Have inventory for the product at one or more physical stores tied to the merchant&apos;s account. &lt;p&gt;Sellers can use the &lt;b&gt;createInventoryLocation&lt;/b&gt; method in the Inventory API to associate physical stores to their account and they can then add inventory to specific store locations.&lt;/p&gt;&lt;/li&gt;&lt;li&gt;Set an immediate payment requirement on the item. The immediate payment feature requires the seller to: &lt;ul&gt;&lt;li&gt;Set the &lt;b&gt;immediatePay&lt;/b&gt; flag in the payment policy to &apos;true&apos;.&lt;/li&gt;&lt;li&gt;Have a valid store location with a complete street address.&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;When a merchant successfully lists an item with Click and Collect, prospective buyers within a reasonable distance from one of the merchant&apos;s stores (that has stock available) will see the &quot;Available for Click and Collect&quot; option on the listing, along with information on the closest store that has the item.&lt;/p&gt;&lt;b&gt;Default&lt;/b&gt;: false
     * @param value Value to set for the pickupDropOff property.
     */
    public void setPickupDropOff(@jakarta.annotation.Nullable final Boolean value) {
        this.pickupDropOff = value;
    }
    /**
     * Sets the shippingOptions property value. This array is used to provide detailed information on the domestic and international shipping options available for the policy. &lt;br&gt;&lt;br&gt;A separate &lt;b&gt;ShippingOption&lt;/b&gt; object is required for domestic shipping service options and for international shipping service options (if the seller ships to international locations). &lt;ul&gt;&lt;li&gt;The &lt;b&gt;optionType&lt;/b&gt; field is used to indicate whether the &lt;b&gt;ShippingOption&lt;/b&gt; object applies to domestic or international shipping, and the &lt;b&gt;costType&lt;/b&gt; field is used to indicate whether flat-rate shipping or calculated shipping will be used.&lt;/li&gt; &lt;li&gt;The &lt;b&gt;rateTableId&lt;/b&gt; field can be used to associate a defined shipping rate table to the policy, and the &lt;b&gt;packageHandlingCost&lt;/b&gt; container can be used to set a handling charge for the policy.&lt;/li&gt;&lt;/ul&gt; &lt;p&gt;A separate &lt;b&gt;ShippingServices&lt;/b&gt; object will be used to specify cost and other details for every available domestic and international shipping service option. &lt;/p&gt;
     * @param value Value to set for the shippingOptions property.
     */
    public void setShippingOptions(@jakarta.annotation.Nullable final java.util.List<ShippingOption> value) {
        this.shippingOptions = value;
    }
    /**
     * Sets the shipToLocations property value. This type consists of the &lt;b&gt;regionIncluded&lt;/b&gt; and &lt;b&gt;regionExcluded&lt;/b&gt; arrays, which indicate the areas to where the seller does and doesn&apos;t ship.
     * @param value Value to set for the shipToLocations property.
     */
    public void setShipToLocations(@jakarta.annotation.Nullable final RegionSet value) {
        this.shipToLocations = value;
    }
}
