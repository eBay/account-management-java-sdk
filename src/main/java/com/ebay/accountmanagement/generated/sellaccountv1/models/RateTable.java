package com.ebay.accountmanagement.generated.sellaccountv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to provide details about each shipping rate table that is returned in the &lt;b&gt;getRateTables&lt;/b&gt; response.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RateTable implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; country code representing the eBay marketplace where the shipping rate table is defined. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String countryCode;
    /**
     * This enumeration value returned here indicates whether the shipping rate table is a domestic or international shipping rate table. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:ShippingOptionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String locality;
    /**
     * The seller-defined name for the shipping rate table.
     */
    private String name;
    /**
     * A unique eBay-assigned ID for a seller&apos;s shipping rate table. These &lt;b&gt;rateTableId&lt;/b&gt; values are used to associate shipping rate tables to fulfillment business policies or directly to listings through an add/revise/relist call in the Trading API.
     */
    private String rateTableId;
    /**
     * Instantiates a new {@link RateTable} and sets the default values.
     */
    public RateTable() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RateTable}
     */
    @jakarta.annotation.Nonnull
    public static RateTable createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RateTable();
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
     * Gets the countryCode property value. A two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; country code representing the eBay marketplace where the shipping rate table is defined. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("countryCode", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("locality", (n) -> { this.setLocality(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("rateTableId", (n) -> { this.setRateTableId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the locality property value. This enumeration value returned here indicates whether the shipping rate table is a domestic or international shipping rate table. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:ShippingOptionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocality() {
        return this.locality;
    }
    /**
     * Gets the name property value. The seller-defined name for the shipping rate table.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the rateTableId property value. A unique eBay-assigned ID for a seller&apos;s shipping rate table. These &lt;b&gt;rateTableId&lt;/b&gt; values are used to associate shipping rate tables to fulfillment business policies or directly to listings through an add/revise/relist call in the Trading API.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRateTableId() {
        return this.rateTableId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("countryCode", this.getCountryCode());
        writer.writeStringValue("locality", this.getLocality());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("rateTableId", this.getRateTableId());
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
     * Sets the countryCode property value. A two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; country code representing the eBay marketplace where the shipping rate table is defined. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the countryCode property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final String value) {
        this.countryCode = value;
    }
    /**
     * Sets the locality property value. This enumeration value returned here indicates whether the shipping rate table is a domestic or international shipping rate table. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:ShippingOptionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the locality property.
     */
    public void setLocality(@jakarta.annotation.Nullable final String value) {
        this.locality = value;
    }
    /**
     * Sets the name property value. The seller-defined name for the shipping rate table.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the rateTableId property value. A unique eBay-assigned ID for a seller&apos;s shipping rate table. These &lt;b&gt;rateTableId&lt;/b&gt; values are used to associate shipping rate tables to fulfillment business policies or directly to listings through an add/revise/relist call in the Trading API.
     * @param value Value to set for the rateTableId property.
     */
    public void setRateTableId(@jakarta.annotation.Nullable final String value) {
        this.rateTableId = value;
    }
}
