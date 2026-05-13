package com.ebay.accountmanagement.generated.sellaccountv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Complex type that that gets populated with a response containing a fulfillment policy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SetFulfillmentPolicyResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container indicates whether the fulfillment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
     */
    private java.util.List<CategoryType> categoryTypes;
    /**
     * A seller-defined description of the fulfillment policy. This description is only for the seller&apos;s use, and is not exposed on any eBay pages. This field is returned if set for the policy. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
     */
    private String description;
    /**
     * If returned as &lt;code&gt;true&lt;/code&gt;, the seller offers freight shipping. Freight shipping can be used for large items over 150 lbs.
     */
    private Boolean freightShipping;
    /**
     * A unique eBay-assigned ID for a fulfillment business policy. This ID is generated when the policy is created.
     */
    private String fulfillmentPolicyId;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: This field is only applicable for the eBay United Kingdom marketplace (&lt;code&gt;EBAY_GB&lt;/code&gt;).&lt;/span&gt;&lt;br&gt;This field is included and set to &lt;code&gt;true&lt;/code&gt; if the seller wants to use the Global Shipping Program for international shipments. See the &lt;a href=&quot;https://pages.ebay.com/help/sell/shipping-globally.html &quot;&gt;Global Shipping Program&lt;/a&gt; help topic for more details and requirements on the Global Shipping Program.&lt;br&gt;&lt;br&gt;A seller can use a combination of the Global Shipping Program and other international shipping services. &lt;br&gt;&lt;br&gt;If set to &lt;code&gt;false&lt;/code&gt; or if the field is omitted, the seller has to manually specifying individual international shipping services (if the seller ships internationally), as described in &lt;a href=&quot;https://developer.ebay.com/api-docs/sell/static/seller-accounts/ht_shipping-worldwide.html &quot;&gt;Setting up worldwide shipping&lt;/a&gt;. &lt;br&gt;&lt;br&gt;Sellers opt in or out of the Global Shipping Program through the Shipping preferences in My eBay.&lt;br&gt;&lt;br&gt;eBay International Shipping is an account level setting; no field needs to be set in a Fulfillment business policy to enable eBay International Shipping. If a US seller&apos;s account is opted in to eBay International Shipping, this shipping option will be enabled automatically for all listings where international shipping is available. A US seller who is opted in to eBay International Shipping can also specify individual international shipping service options for a Fulfillment business policy.&lt;/span&gt;
     */
    private Boolean globalShipping;
    /**
     * A type used to specify a period of time using a specified time-measurement unit. Payment, return, and fulfillment business policies all use this type to specify time windows.&lt;br&gt;&lt;br&gt;Whenever a container that uses this type is used in a request, both of these fields are required. Similarly, whenever a container that uses this type is returned in a response, both of these fields are always returned.
     */
    private TimeDuration handlingTime;
    /**
     * If returned as &lt;code&gt;true&lt;/code&gt;, local pickup is available for items using this policy.
     */
    private Boolean localPickup;
    /**
     * The ID of the eBay marketplace to which this fulfillment business policy applies. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String marketplaceId;
    /**
     * A seller-defined name for this fulfillment business policy. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 64
     */
    private String name;
    /**
     * If returned as &lt;code&gt;true&lt;/code&gt;, the seller offers the &quot;Click and Collect&quot; option. &lt;br&gt;&lt;br&gt;Currently, &quot;Click and Collect&quot; is available only to large retail merchants the eBay AU, UK, DE, FR, and IT marketplaces.
     */
    private Boolean pickupDropOff;
    /**
     * This array is used to provide detailed information on the domestic and international shipping options available for the policy. A separate &lt;b&gt;ShippingOption&lt;/b&gt; object covers domestic shipping service options and international shipping service options (if the seller ships to international locations). &lt;br&gt;&lt;br&gt;The &lt;b&gt;optionType&lt;/b&gt; field indicates whether the &lt;b&gt;ShippingOption&lt;/b&gt; object applies to domestic or international shipping, and the &lt;b&gt;costType&lt;/b&gt; field indicates whether flat-rate shipping or calculated shipping will be used. &lt;p&gt;A separate &lt;b&gt;ShippingServices&lt;/b&gt; object is used to specify cost and other details for every available domestic and international shipping service option. &lt;/p&gt;
     */
    private java.util.List<ShippingOption> shippingOptions;
    /**
     * This type consists of the &lt;b&gt;regionIncluded&lt;/b&gt; and &lt;b&gt;regionExcluded&lt;/b&gt; arrays, which indicate the areas to where the seller does and doesn&apos;t ship.
     */
    private RegionSet shipToLocations;
    /**
     * An array of one or more errors or warnings that were generated during the processing of the request. If there were no issues with the request, this array will return empty.
     */
    private java.util.List<Error> warnings;
    /**
     * Instantiates a new {@link SetFulfillmentPolicyResponse} and sets the default values.
     */
    public SetFulfillmentPolicyResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SetFulfillmentPolicyResponse}
     */
    @jakarta.annotation.Nonnull
    public static SetFulfillmentPolicyResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetFulfillmentPolicyResponse();
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
     * Gets the categoryTypes property value. This container indicates whether the fulfillment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
     * @return a {@link java.util.List<CategoryType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CategoryType> getCategoryTypes() {
        return this.categoryTypes;
    }
    /**
     * Gets the description property value. A seller-defined description of the fulfillment policy. This description is only for the seller&apos;s use, and is not exposed on any eBay pages. This field is returned if set for the policy. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("categoryTypes", (n) -> { this.setCategoryTypes(n.getCollectionOfObjectValues(CategoryType::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("freightShipping", (n) -> { this.setFreightShipping(n.getBooleanValue()); });
        deserializerMap.put("fulfillmentPolicyId", (n) -> { this.setFulfillmentPolicyId(n.getStringValue()); });
        deserializerMap.put("globalShipping", (n) -> { this.setGlobalShipping(n.getBooleanValue()); });
        deserializerMap.put("handlingTime", (n) -> { this.setHandlingTime(n.getObjectValue(TimeDuration::createFromDiscriminatorValue)); });
        deserializerMap.put("localPickup", (n) -> { this.setLocalPickup(n.getBooleanValue()); });
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("pickupDropOff", (n) -> { this.setPickupDropOff(n.getBooleanValue()); });
        deserializerMap.put("shippingOptions", (n) -> { this.setShippingOptions(n.getCollectionOfObjectValues(ShippingOption::createFromDiscriminatorValue)); });
        deserializerMap.put("shipToLocations", (n) -> { this.setShipToLocations(n.getObjectValue(RegionSet::createFromDiscriminatorValue)); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getCollectionOfObjectValues(Error::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the freightShipping property value. If returned as &lt;code&gt;true&lt;/code&gt;, the seller offers freight shipping. Freight shipping can be used for large items over 150 lbs.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFreightShipping() {
        return this.freightShipping;
    }
    /**
     * Gets the fulfillmentPolicyId property value. A unique eBay-assigned ID for a fulfillment business policy. This ID is generated when the policy is created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFulfillmentPolicyId() {
        return this.fulfillmentPolicyId;
    }
    /**
     * Gets the globalShipping property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: This field is only applicable for the eBay United Kingdom marketplace (&lt;code&gt;EBAY_GB&lt;/code&gt;).&lt;/span&gt;&lt;br&gt;This field is included and set to &lt;code&gt;true&lt;/code&gt; if the seller wants to use the Global Shipping Program for international shipments. See the &lt;a href=&quot;https://pages.ebay.com/help/sell/shipping-globally.html &quot;&gt;Global Shipping Program&lt;/a&gt; help topic for more details and requirements on the Global Shipping Program.&lt;br&gt;&lt;br&gt;A seller can use a combination of the Global Shipping Program and other international shipping services. &lt;br&gt;&lt;br&gt;If set to &lt;code&gt;false&lt;/code&gt; or if the field is omitted, the seller has to manually specifying individual international shipping services (if the seller ships internationally), as described in &lt;a href=&quot;https://developer.ebay.com/api-docs/sell/static/seller-accounts/ht_shipping-worldwide.html &quot;&gt;Setting up worldwide shipping&lt;/a&gt;. &lt;br&gt;&lt;br&gt;Sellers opt in or out of the Global Shipping Program through the Shipping preferences in My eBay.&lt;br&gt;&lt;br&gt;eBay International Shipping is an account level setting; no field needs to be set in a Fulfillment business policy to enable eBay International Shipping. If a US seller&apos;s account is opted in to eBay International Shipping, this shipping option will be enabled automatically for all listings where international shipping is available. A US seller who is opted in to eBay International Shipping can also specify individual international shipping service options for a Fulfillment business policy.&lt;/span&gt;
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
     * Gets the localPickup property value. If returned as &lt;code&gt;true&lt;/code&gt;, local pickup is available for items using this policy.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalPickup() {
        return this.localPickup;
    }
    /**
     * Gets the marketplaceId property value. The ID of the eBay marketplace to which this fulfillment business policy applies. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Gets the name property value. A seller-defined name for this fulfillment business policy. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 64
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the pickupDropOff property value. If returned as &lt;code&gt;true&lt;/code&gt;, the seller offers the &quot;Click and Collect&quot; option. &lt;br&gt;&lt;br&gt;Currently, &quot;Click and Collect&quot; is available only to large retail merchants the eBay AU, UK, DE, FR, and IT marketplaces.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPickupDropOff() {
        return this.pickupDropOff;
    }
    /**
     * Gets the shippingOptions property value. This array is used to provide detailed information on the domestic and international shipping options available for the policy. A separate &lt;b&gt;ShippingOption&lt;/b&gt; object covers domestic shipping service options and international shipping service options (if the seller ships to international locations). &lt;br&gt;&lt;br&gt;The &lt;b&gt;optionType&lt;/b&gt; field indicates whether the &lt;b&gt;ShippingOption&lt;/b&gt; object applies to domestic or international shipping, and the &lt;b&gt;costType&lt;/b&gt; field indicates whether flat-rate shipping or calculated shipping will be used. &lt;p&gt;A separate &lt;b&gt;ShippingServices&lt;/b&gt; object is used to specify cost and other details for every available domestic and international shipping service option. &lt;/p&gt;
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
     * Gets the warnings property value. An array of one or more errors or warnings that were generated during the processing of the request. If there were no issues with the request, this array will return empty.
     * @return a {@link java.util.List<Error>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Error> getWarnings() {
        return this.warnings;
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
        writer.writeStringValue("fulfillmentPolicyId", this.getFulfillmentPolicyId());
        writer.writeBooleanValue("globalShipping", this.getGlobalShipping());
        writer.writeObjectValue("handlingTime", this.getHandlingTime());
        writer.writeBooleanValue("localPickup", this.getLocalPickup());
        writer.writeStringValue("marketplaceId", this.getMarketplaceId());
        writer.writeStringValue("name", this.getName());
        writer.writeBooleanValue("pickupDropOff", this.getPickupDropOff());
        writer.writeCollectionOfObjectValues("shippingOptions", this.getShippingOptions());
        writer.writeObjectValue("shipToLocations", this.getShipToLocations());
        writer.writeCollectionOfObjectValues("warnings", this.getWarnings());
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
     * Sets the categoryTypes property value. This container indicates whether the fulfillment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
     * @param value Value to set for the categoryTypes property.
     */
    public void setCategoryTypes(@jakarta.annotation.Nullable final java.util.List<CategoryType> value) {
        this.categoryTypes = value;
    }
    /**
     * Sets the description property value. A seller-defined description of the fulfillment policy. This description is only for the seller&apos;s use, and is not exposed on any eBay pages. This field is returned if set for the policy. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the freightShipping property value. If returned as &lt;code&gt;true&lt;/code&gt;, the seller offers freight shipping. Freight shipping can be used for large items over 150 lbs.
     * @param value Value to set for the freightShipping property.
     */
    public void setFreightShipping(@jakarta.annotation.Nullable final Boolean value) {
        this.freightShipping = value;
    }
    /**
     * Sets the fulfillmentPolicyId property value. A unique eBay-assigned ID for a fulfillment business policy. This ID is generated when the policy is created.
     * @param value Value to set for the fulfillmentPolicyId property.
     */
    public void setFulfillmentPolicyId(@jakarta.annotation.Nullable final String value) {
        this.fulfillmentPolicyId = value;
    }
    /**
     * Sets the globalShipping property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: This field is only applicable for the eBay United Kingdom marketplace (&lt;code&gt;EBAY_GB&lt;/code&gt;).&lt;/span&gt;&lt;br&gt;This field is included and set to &lt;code&gt;true&lt;/code&gt; if the seller wants to use the Global Shipping Program for international shipments. See the &lt;a href=&quot;https://pages.ebay.com/help/sell/shipping-globally.html &quot;&gt;Global Shipping Program&lt;/a&gt; help topic for more details and requirements on the Global Shipping Program.&lt;br&gt;&lt;br&gt;A seller can use a combination of the Global Shipping Program and other international shipping services. &lt;br&gt;&lt;br&gt;If set to &lt;code&gt;false&lt;/code&gt; or if the field is omitted, the seller has to manually specifying individual international shipping services (if the seller ships internationally), as described in &lt;a href=&quot;https://developer.ebay.com/api-docs/sell/static/seller-accounts/ht_shipping-worldwide.html &quot;&gt;Setting up worldwide shipping&lt;/a&gt;. &lt;br&gt;&lt;br&gt;Sellers opt in or out of the Global Shipping Program through the Shipping preferences in My eBay.&lt;br&gt;&lt;br&gt;eBay International Shipping is an account level setting; no field needs to be set in a Fulfillment business policy to enable eBay International Shipping. If a US seller&apos;s account is opted in to eBay International Shipping, this shipping option will be enabled automatically for all listings where international shipping is available. A US seller who is opted in to eBay International Shipping can also specify individual international shipping service options for a Fulfillment business policy.&lt;/span&gt;
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
     * Sets the localPickup property value. If returned as &lt;code&gt;true&lt;/code&gt;, local pickup is available for items using this policy.
     * @param value Value to set for the localPickup property.
     */
    public void setLocalPickup(@jakarta.annotation.Nullable final Boolean value) {
        this.localPickup = value;
    }
    /**
     * Sets the marketplaceId property value. The ID of the eBay marketplace to which this fulfillment business policy applies. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final String value) {
        this.marketplaceId = value;
    }
    /**
     * Sets the name property value. A seller-defined name for this fulfillment business policy. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 64
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the pickupDropOff property value. If returned as &lt;code&gt;true&lt;/code&gt;, the seller offers the &quot;Click and Collect&quot; option. &lt;br&gt;&lt;br&gt;Currently, &quot;Click and Collect&quot; is available only to large retail merchants the eBay AU, UK, DE, FR, and IT marketplaces.
     * @param value Value to set for the pickupDropOff property.
     */
    public void setPickupDropOff(@jakarta.annotation.Nullable final Boolean value) {
        this.pickupDropOff = value;
    }
    /**
     * Sets the shippingOptions property value. This array is used to provide detailed information on the domestic and international shipping options available for the policy. A separate &lt;b&gt;ShippingOption&lt;/b&gt; object covers domestic shipping service options and international shipping service options (if the seller ships to international locations). &lt;br&gt;&lt;br&gt;The &lt;b&gt;optionType&lt;/b&gt; field indicates whether the &lt;b&gt;ShippingOption&lt;/b&gt; object applies to domestic or international shipping, and the &lt;b&gt;costType&lt;/b&gt; field indicates whether flat-rate shipping or calculated shipping will be used. &lt;p&gt;A separate &lt;b&gt;ShippingServices&lt;/b&gt; object is used to specify cost and other details for every available domestic and international shipping service option. &lt;/p&gt;
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
    /**
     * Sets the warnings property value. An array of one or more errors or warnings that were generated during the processing of the request. If there were no issues with the request, this array will return empty.
     * @param value Value to set for the warnings property.
     */
    public void setWarnings(@jakarta.annotation.Nullable final java.util.List<Error> value) {
        this.warnings = value;
    }
}
