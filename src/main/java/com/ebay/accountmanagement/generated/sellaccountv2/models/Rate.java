package com.ebay.accountmanagement.generated.sellaccountv2.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This container details shipping rate information identified by a unique rate ID. A successful call returns the requested shipping rate information.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Rate implements AdditionalDataHolder, Parsable {
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount additionalCost;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier for rate information.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This is a string that is automatically assigned by the system when a rate object is created.&lt;/span&gt;
     */
    private String rateId;
    /**
     * Indicates the level of shipping service to which the shipping rate information applies.&lt;br/&gt;&lt;br/&gt;Available shipping categories are:&lt;ul&gt;&lt;li&gt;&lt;b&gt;ONE_DAY&lt;/b&gt;: &lt;i&gt;This option is not supported when &lt;b&gt;shippingOptionType&lt;/b&gt; is INTERNATIONAL.&lt;/i&gt; &lt;/li&gt;&lt;li&gt;&lt;b&gt;EXPEDITED&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;STANDARD&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;ECONOMY&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;EXPRESS&lt;/b&gt;: &lt;i&gt;This option is supported only when &lt;b&gt;MarketplaceId&lt;/b&gt; is &lt;code&gt;EBAY_DE&lt;/code&gt; (Germany)&lt;/i&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:ShippingCategoryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String shippingCategory;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount shippingCost;
    /**
     * An array of Region names to which the shipping rate information applies.&lt;br/&gt;&lt;br/&gt;Returned values may be:&lt;ul&gt;&lt;li&gt;Geographical Regions (e.g., &lt;code&gt;Worldwide&lt;/code&gt;, &lt;code&gt;Europe&lt;/code&gt;, and &lt;code&gt;Middle East&lt;/code&gt;)&lt;/li&gt;&lt;li&gt;Individual countries identified by a two-letter code such as &lt;code&gt;US&lt;/code&gt; (United States), &lt;code&gt;CA&lt;/code&gt; (Canada), and &lt;code&gt;GB&lt;/code&gt; (United Kingdom)&lt;/li&gt;&lt;li&gt;US states and/or Canadian provinces identified by a two-letter code such as &lt;code&gt;NY&lt;/code&gt; (New York) or &lt;code&gt;SK&lt;/code&gt; (Saskatchewan)&lt;/li&gt;&lt;li&gt;Domestic Regions such as &lt;code&gt;AK/HI&lt;/code&gt; (Alaska/Hawaii)&lt;/li&gt;&lt;/ul&gt;
     */
    private java.util.List<String> shippingRegionNames;
    /**
     * An enum value that indicates the shipping service used for the specified shipping rate. These enum values align with &lt;b&gt;ShippingService&lt;/b&gt; metadata returned by a &lt;b&gt;GeteBayDetails&lt;/b&gt; call with &lt;b&gt;DetailName&lt;/b&gt; set to &lt;code&gt;shippingServiceDetails&lt;/code&gt;.
     */
    private String shippingServiceCode;
    /**
     * Instantiates a new {@link Rate} and sets the default values.
     */
    public Rate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Rate}
     */
    @jakarta.annotation.Nonnull
    public static Rate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Rate();
    }
    /**
     * Gets the additionalCost property value. A complex type that describes the value of a monetary amount as represented by a global currency.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("additionalCost", (n) -> { this.setAdditionalCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("rateId", (n) -> { this.setRateId(n.getStringValue()); });
        deserializerMap.put("shippingCategory", (n) -> { this.setShippingCategory(n.getStringValue()); });
        deserializerMap.put("shippingCost", (n) -> { this.setShippingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("shippingRegionNames", (n) -> { this.setShippingRegionNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("shippingServiceCode", (n) -> { this.setShippingServiceCode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the rateId property value. The unique identifier for rate information.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This is a string that is automatically assigned by the system when a rate object is created.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRateId() {
        return this.rateId;
    }
    /**
     * Gets the shippingCategory property value. Indicates the level of shipping service to which the shipping rate information applies.&lt;br/&gt;&lt;br/&gt;Available shipping categories are:&lt;ul&gt;&lt;li&gt;&lt;b&gt;ONE_DAY&lt;/b&gt;: &lt;i&gt;This option is not supported when &lt;b&gt;shippingOptionType&lt;/b&gt; is INTERNATIONAL.&lt;/i&gt; &lt;/li&gt;&lt;li&gt;&lt;b&gt;EXPEDITED&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;STANDARD&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;ECONOMY&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;EXPRESS&lt;/b&gt;: &lt;i&gt;This option is supported only when &lt;b&gt;MarketplaceId&lt;/b&gt; is &lt;code&gt;EBAY_DE&lt;/code&gt; (Germany)&lt;/i&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:ShippingCategoryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingCategory() {
        return this.shippingCategory;
    }
    /**
     * Gets the shippingCost property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getShippingCost() {
        return this.shippingCost;
    }
    /**
     * Gets the shippingRegionNames property value. An array of Region names to which the shipping rate information applies.&lt;br/&gt;&lt;br/&gt;Returned values may be:&lt;ul&gt;&lt;li&gt;Geographical Regions (e.g., &lt;code&gt;Worldwide&lt;/code&gt;, &lt;code&gt;Europe&lt;/code&gt;, and &lt;code&gt;Middle East&lt;/code&gt;)&lt;/li&gt;&lt;li&gt;Individual countries identified by a two-letter code such as &lt;code&gt;US&lt;/code&gt; (United States), &lt;code&gt;CA&lt;/code&gt; (Canada), and &lt;code&gt;GB&lt;/code&gt; (United Kingdom)&lt;/li&gt;&lt;li&gt;US states and/or Canadian provinces identified by a two-letter code such as &lt;code&gt;NY&lt;/code&gt; (New York) or &lt;code&gt;SK&lt;/code&gt; (Saskatchewan)&lt;/li&gt;&lt;li&gt;Domestic Regions such as &lt;code&gt;AK/HI&lt;/code&gt; (Alaska/Hawaii)&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getShippingRegionNames() {
        return this.shippingRegionNames;
    }
    /**
     * Gets the shippingServiceCode property value. An enum value that indicates the shipping service used for the specified shipping rate. These enum values align with &lt;b&gt;ShippingService&lt;/b&gt; metadata returned by a &lt;b&gt;GeteBayDetails&lt;/b&gt; call with &lt;b&gt;DetailName&lt;/b&gt; set to &lt;code&gt;shippingServiceDetails&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingServiceCode() {
        return this.shippingServiceCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("additionalCost", this.getAdditionalCost());
        writer.writeStringValue("rateId", this.getRateId());
        writer.writeStringValue("shippingCategory", this.getShippingCategory());
        writer.writeObjectValue("shippingCost", this.getShippingCost());
        writer.writeCollectionOfPrimitiveValues("shippingRegionNames", this.getShippingRegionNames());
        writer.writeStringValue("shippingServiceCode", this.getShippingServiceCode());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalCost property value. A complex type that describes the value of a monetary amount as represented by a global currency.
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
     * Sets the rateId property value. The unique identifier for rate information.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This is a string that is automatically assigned by the system when a rate object is created.&lt;/span&gt;
     * @param value Value to set for the rateId property.
     */
    public void setRateId(@jakarta.annotation.Nullable final String value) {
        this.rateId = value;
    }
    /**
     * Sets the shippingCategory property value. Indicates the level of shipping service to which the shipping rate information applies.&lt;br/&gt;&lt;br/&gt;Available shipping categories are:&lt;ul&gt;&lt;li&gt;&lt;b&gt;ONE_DAY&lt;/b&gt;: &lt;i&gt;This option is not supported when &lt;b&gt;shippingOptionType&lt;/b&gt; is INTERNATIONAL.&lt;/i&gt; &lt;/li&gt;&lt;li&gt;&lt;b&gt;EXPEDITED&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;STANDARD&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;ECONOMY&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;EXPRESS&lt;/b&gt;: &lt;i&gt;This option is supported only when &lt;b&gt;MarketplaceId&lt;/b&gt; is &lt;code&gt;EBAY_DE&lt;/code&gt; (Germany)&lt;/i&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:ShippingCategoryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the shippingCategory property.
     */
    public void setShippingCategory(@jakarta.annotation.Nullable final String value) {
        this.shippingCategory = value;
    }
    /**
     * Sets the shippingCost property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the shippingCost property.
     */
    public void setShippingCost(@jakarta.annotation.Nullable final Amount value) {
        this.shippingCost = value;
    }
    /**
     * Sets the shippingRegionNames property value. An array of Region names to which the shipping rate information applies.&lt;br/&gt;&lt;br/&gt;Returned values may be:&lt;ul&gt;&lt;li&gt;Geographical Regions (e.g., &lt;code&gt;Worldwide&lt;/code&gt;, &lt;code&gt;Europe&lt;/code&gt;, and &lt;code&gt;Middle East&lt;/code&gt;)&lt;/li&gt;&lt;li&gt;Individual countries identified by a two-letter code such as &lt;code&gt;US&lt;/code&gt; (United States), &lt;code&gt;CA&lt;/code&gt; (Canada), and &lt;code&gt;GB&lt;/code&gt; (United Kingdom)&lt;/li&gt;&lt;li&gt;US states and/or Canadian provinces identified by a two-letter code such as &lt;code&gt;NY&lt;/code&gt; (New York) or &lt;code&gt;SK&lt;/code&gt; (Saskatchewan)&lt;/li&gt;&lt;li&gt;Domestic Regions such as &lt;code&gt;AK/HI&lt;/code&gt; (Alaska/Hawaii)&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the shippingRegionNames property.
     */
    public void setShippingRegionNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.shippingRegionNames = value;
    }
    /**
     * Sets the shippingServiceCode property value. An enum value that indicates the shipping service used for the specified shipping rate. These enum values align with &lt;b&gt;ShippingService&lt;/b&gt; metadata returned by a &lt;b&gt;GeteBayDetails&lt;/b&gt; call with &lt;b&gt;DetailName&lt;/b&gt; set to &lt;code&gt;shippingServiceDetails&lt;/code&gt;.
     * @param value Value to set for the shippingServiceCode property.
     */
    public void setShippingServiceCode(@jakarta.annotation.Nullable final String value) {
        this.shippingServiceCode = value;
    }
}
