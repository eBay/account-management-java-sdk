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

package com.ebay.accountmanagement.generated.sellaccountv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SalesTaxInput implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This parameter specifies the two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; code of the country for which a sales-tax table entry is to be created or updated.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales-tax tables are available only for the US and Canada marketplaces. Therefore, the only supported values are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;US&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CA&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     */
    private String countryCode;
    /**
     * This parameter specifies the ID of the tax jurisdiction for which a sales-tax table entry is to be created or updated.&lt;br&gt;&lt;br&gt;Valid jurisdiction IDs can be retrieved using the &lt;a href=&quot;/api-docs/sell/metadata/resources/country/methods/getSalesTaxJurisdictions&quot; target=&quot;_blank &quot;&gt;getSalesTaxJurisdiction&lt;/a&gt; method of the Metadata API.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When &lt;code&gt;countryCode&lt;/code&gt; is set to &lt;code&gt;US&lt;/code&gt;, the only supported values for &lt;code&gt;jurisdictionId&lt;/code&gt; are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;AS&lt;/code&gt; (American Samoa)&lt;/li&gt;&lt;li&gt;&lt;code&gt;GU&lt;/code&gt; (Guam)&lt;/li&gt;&lt;li&gt;&lt;code&gt;MP&lt;/code&gt; (Northern Mariana Islands)&lt;/li&gt;&lt;li&gt;&lt;code&gt;PW&lt;/code&gt; (Palau)&lt;/li&gt;&lt;li&gt;&lt;code&gt;VI&lt;/code&gt; (US Virgin Islands)&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     */
    private String salesTaxJurisdictionId;
    /**
     * This parameter specifies the sales tax rate for the specified &lt;b&gt;salesTaxJurisdictionId&lt;/b&gt;. When applicable to an order, this sales tax rate will be applied to the sales price. The &lt;b&gt;shippingAndHandlingTaxed&lt;/b&gt; value indicates whether or not sales tax is also applied to shipping and handling charges&lt;br&gt;&lt;br&gt;Although it is a string, a percentage value is set here, such as &lt;code&gt;7.75&lt;/code&gt;.
     */
    private String salesTaxPercentage;
    /**
     * This parameter is set to &lt;code&gt;true&lt;/code&gt; if the seller wishes to apply sales tax to shipping and handling charges and not just the total sales price of an order. Otherwise, this parameter&apos;s value should be set to &lt;code&gt;false&lt;/code&gt;.
     */
    private Boolean shippingAndHandlingTaxed;
    /**
     * Instantiates a new {@link SalesTaxInput} and sets the default values.
     */
    public SalesTaxInput() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SalesTaxInput}
     */
    @jakarta.annotation.Nonnull
    public static SalesTaxInput createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SalesTaxInput();
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
     * Gets the countryCode property value. This parameter specifies the two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; code of the country for which a sales-tax table entry is to be created or updated.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales-tax tables are available only for the US and Canada marketplaces. Therefore, the only supported values are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;US&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CA&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
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
        deserializerMap.put("salesTaxJurisdictionId", (n) -> { this.setSalesTaxJurisdictionId(n.getStringValue()); });
        deserializerMap.put("salesTaxPercentage", (n) -> { this.setSalesTaxPercentage(n.getStringValue()); });
        deserializerMap.put("shippingAndHandlingTaxed", (n) -> { this.setShippingAndHandlingTaxed(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the salesTaxJurisdictionId property value. This parameter specifies the ID of the tax jurisdiction for which a sales-tax table entry is to be created or updated.&lt;br&gt;&lt;br&gt;Valid jurisdiction IDs can be retrieved using the &lt;a href=&quot;/api-docs/sell/metadata/resources/country/methods/getSalesTaxJurisdictions&quot; target=&quot;_blank &quot;&gt;getSalesTaxJurisdiction&lt;/a&gt; method of the Metadata API.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When &lt;code&gt;countryCode&lt;/code&gt; is set to &lt;code&gt;US&lt;/code&gt;, the only supported values for &lt;code&gt;jurisdictionId&lt;/code&gt; are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;AS&lt;/code&gt; (American Samoa)&lt;/li&gt;&lt;li&gt;&lt;code&gt;GU&lt;/code&gt; (Guam)&lt;/li&gt;&lt;li&gt;&lt;code&gt;MP&lt;/code&gt; (Northern Mariana Islands)&lt;/li&gt;&lt;li&gt;&lt;code&gt;PW&lt;/code&gt; (Palau)&lt;/li&gt;&lt;li&gt;&lt;code&gt;VI&lt;/code&gt; (US Virgin Islands)&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSalesTaxJurisdictionId() {
        return this.salesTaxJurisdictionId;
    }
    /**
     * Gets the salesTaxPercentage property value. This parameter specifies the sales tax rate for the specified &lt;b&gt;salesTaxJurisdictionId&lt;/b&gt;. When applicable to an order, this sales tax rate will be applied to the sales price. The &lt;b&gt;shippingAndHandlingTaxed&lt;/b&gt; value indicates whether or not sales tax is also applied to shipping and handling charges&lt;br&gt;&lt;br&gt;Although it is a string, a percentage value is set here, such as &lt;code&gt;7.75&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSalesTaxPercentage() {
        return this.salesTaxPercentage;
    }
    /**
     * Gets the shippingAndHandlingTaxed property value. This parameter is set to &lt;code&gt;true&lt;/code&gt; if the seller wishes to apply sales tax to shipping and handling charges and not just the total sales price of an order. Otherwise, this parameter&apos;s value should be set to &lt;code&gt;false&lt;/code&gt;.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShippingAndHandlingTaxed() {
        return this.shippingAndHandlingTaxed;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("countryCode", this.getCountryCode());
        writer.writeStringValue("salesTaxJurisdictionId", this.getSalesTaxJurisdictionId());
        writer.writeStringValue("salesTaxPercentage", this.getSalesTaxPercentage());
        writer.writeBooleanValue("shippingAndHandlingTaxed", this.getShippingAndHandlingTaxed());
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
     * Sets the countryCode property value. This parameter specifies the two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; code of the country for which a sales-tax table entry is to be created or updated.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales-tax tables are available only for the US and Canada marketplaces. Therefore, the only supported values are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;US&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CA&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @param value Value to set for the countryCode property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final String value) {
        this.countryCode = value;
    }
    /**
     * Sets the salesTaxJurisdictionId property value. This parameter specifies the ID of the tax jurisdiction for which a sales-tax table entry is to be created or updated.&lt;br&gt;&lt;br&gt;Valid jurisdiction IDs can be retrieved using the &lt;a href=&quot;/api-docs/sell/metadata/resources/country/methods/getSalesTaxJurisdictions&quot; target=&quot;_blank &quot;&gt;getSalesTaxJurisdiction&lt;/a&gt; method of the Metadata API.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When &lt;code&gt;countryCode&lt;/code&gt; is set to &lt;code&gt;US&lt;/code&gt;, the only supported values for &lt;code&gt;jurisdictionId&lt;/code&gt; are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;AS&lt;/code&gt; (American Samoa)&lt;/li&gt;&lt;li&gt;&lt;code&gt;GU&lt;/code&gt; (Guam)&lt;/li&gt;&lt;li&gt;&lt;code&gt;MP&lt;/code&gt; (Northern Mariana Islands)&lt;/li&gt;&lt;li&gt;&lt;code&gt;PW&lt;/code&gt; (Palau)&lt;/li&gt;&lt;li&gt;&lt;code&gt;VI&lt;/code&gt; (US Virgin Islands)&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @param value Value to set for the salesTaxJurisdictionId property.
     */
    public void setSalesTaxJurisdictionId(@jakarta.annotation.Nullable final String value) {
        this.salesTaxJurisdictionId = value;
    }
    /**
     * Sets the salesTaxPercentage property value. This parameter specifies the sales tax rate for the specified &lt;b&gt;salesTaxJurisdictionId&lt;/b&gt;. When applicable to an order, this sales tax rate will be applied to the sales price. The &lt;b&gt;shippingAndHandlingTaxed&lt;/b&gt; value indicates whether or not sales tax is also applied to shipping and handling charges&lt;br&gt;&lt;br&gt;Although it is a string, a percentage value is set here, such as &lt;code&gt;7.75&lt;/code&gt;.
     * @param value Value to set for the salesTaxPercentage property.
     */
    public void setSalesTaxPercentage(@jakarta.annotation.Nullable final String value) {
        this.salesTaxPercentage = value;
    }
    /**
     * Sets the shippingAndHandlingTaxed property value. This parameter is set to &lt;code&gt;true&lt;/code&gt; if the seller wishes to apply sales tax to shipping and handling charges and not just the total sales price of an order. Otherwise, this parameter&apos;s value should be set to &lt;code&gt;false&lt;/code&gt;.
     * @param value Value to set for the shippingAndHandlingTaxed property.
     */
    public void setShippingAndHandlingTaxed(@jakarta.annotation.Nullable final Boolean value) {
        this.shippingAndHandlingTaxed = value;
    }
}
