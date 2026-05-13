package com.ebay.accountmanagement.generated.sellaccountv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to define specific shipping regions. There are four &apos;levels&apos; of shipping regions, including large geographical regions (like &apos;Asia&apos;, &apos;Europe&apos;, or &apos;Middle East&apos;), individual countries, US states or Canadian provinces, and special locations/domestic regions within a country (like &apos;Alaska/Hawaii&apos; or &apos;PO Box&apos;).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Region implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A string that indicates the name of a region, as defined by eBay. A &quot;region&quot; can be either a &apos;world region&apos; (e.g., the &quot;Middle East&quot; or &quot;Southeast Asia&quot;), a country (represented with a two-letter country code), a state or province (represented with a two-letter code), or a special domestic region within a country. &lt;br&gt;&lt;br&gt;The &lt;a href=&quot;/devzone/xml/docs/reference/ebay/GeteBayDetails.html&quot;&gt;GeteBayDetails&lt;/a&gt; call in the Trading API can be used to retrieve the world regions and special domestic regions within a specific country. To get these enumeration values, call &lt;b&gt;GeteBayDetails&lt;/b&gt; with the &lt;b&gt;DetailName&lt;/b&gt; value set to &lt;b&gt;ExcludeShippingLocationDetails&lt;/b&gt;.
     */
    private String regionName;
    /**
     * Reserved for future use. &lt;!--The region&apos;s type, which can be one of the following: &apos;COUNTRY&apos;, &apos;COUNTRY_REGION&apos;, &apos;STATE_OR_PROVINCE&apos;, &apos;WORLD_REGION&apos;, or &apos;WORLDWIDE&apos;.--&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/ba:RegionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String regionType;
    /**
     * Instantiates a new {@link Region} and sets the default values.
     */
    public Region() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Region}
     */
    @jakarta.annotation.Nonnull
    public static Region createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Region();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("regionName", (n) -> { this.setRegionName(n.getStringValue()); });
        deserializerMap.put("regionType", (n) -> { this.setRegionType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the regionName property value. A string that indicates the name of a region, as defined by eBay. A &quot;region&quot; can be either a &apos;world region&apos; (e.g., the &quot;Middle East&quot; or &quot;Southeast Asia&quot;), a country (represented with a two-letter country code), a state or province (represented with a two-letter code), or a special domestic region within a country. &lt;br&gt;&lt;br&gt;The &lt;a href=&quot;/devzone/xml/docs/reference/ebay/GeteBayDetails.html&quot;&gt;GeteBayDetails&lt;/a&gt; call in the Trading API can be used to retrieve the world regions and special domestic regions within a specific country. To get these enumeration values, call &lt;b&gt;GeteBayDetails&lt;/b&gt; with the &lt;b&gt;DetailName&lt;/b&gt; value set to &lt;b&gt;ExcludeShippingLocationDetails&lt;/b&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegionName() {
        return this.regionName;
    }
    /**
     * Gets the regionType property value. Reserved for future use. &lt;!--The region&apos;s type, which can be one of the following: &apos;COUNTRY&apos;, &apos;COUNTRY_REGION&apos;, &apos;STATE_OR_PROVINCE&apos;, &apos;WORLD_REGION&apos;, or &apos;WORLDWIDE&apos;.--&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/ba:RegionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegionType() {
        return this.regionType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("regionName", this.getRegionName());
        writer.writeStringValue("regionType", this.getRegionType());
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
     * Sets the regionName property value. A string that indicates the name of a region, as defined by eBay. A &quot;region&quot; can be either a &apos;world region&apos; (e.g., the &quot;Middle East&quot; or &quot;Southeast Asia&quot;), a country (represented with a two-letter country code), a state or province (represented with a two-letter code), or a special domestic region within a country. &lt;br&gt;&lt;br&gt;The &lt;a href=&quot;/devzone/xml/docs/reference/ebay/GeteBayDetails.html&quot;&gt;GeteBayDetails&lt;/a&gt; call in the Trading API can be used to retrieve the world regions and special domestic regions within a specific country. To get these enumeration values, call &lt;b&gt;GeteBayDetails&lt;/b&gt; with the &lt;b&gt;DetailName&lt;/b&gt; value set to &lt;b&gt;ExcludeShippingLocationDetails&lt;/b&gt;.
     * @param value Value to set for the regionName property.
     */
    public void setRegionName(@jakarta.annotation.Nullable final String value) {
        this.regionName = value;
    }
    /**
     * Sets the regionType property value. Reserved for future use. &lt;!--The region&apos;s type, which can be one of the following: &apos;COUNTRY&apos;, &apos;COUNTRY_REGION&apos;, &apos;STATE_OR_PROVINCE&apos;, &apos;WORLD_REGION&apos;, or &apos;WORLDWIDE&apos;.--&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/ba:RegionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the regionType property.
     */
    public void setRegionType(@jakarta.annotation.Nullable final String value) {
        this.regionType = value;
    }
}
