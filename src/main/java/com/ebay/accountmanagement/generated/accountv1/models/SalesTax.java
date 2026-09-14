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
 * This type is used to provide sales tax settings for a specific tax jurisdiction.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SalesTax implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This enumerated type lists the two-letter &lt;a href=&quot;https://www.iso.org/iso/country_codes&quot; target=&quot;_blank&quot;&gt;ISO 3166&amp;#8209;1 Alpha&amp;#8209;2&lt;/a&gt; code representing a country. | - **AD**: Andorra - **AE**: United Arab Emirates - **AF**: Afghanistan - **AG**: Antigua and Barbuda - **AI**: Anguilla - **AL**: Albania - **AM**: Armenia - **AN**: Netherlands Antilles - **AO**: Angola - **AQ**: Antarctica - **AR**: Argentina - **AS**: American Samoa - **AT**: Austria - **AU**: Australia - **AW**: Aruba - **AX**: Aland Islands - **AZ**: Azerbaijan - **BA**: Bosnia and Herzegovina - **BB**: Barbados - **BD**: Bangladesh - **BE**: Belgium - **BF**: Burkina Faso - **BG**: Bulgaria - **BH**: Bahrain - **BI**: Burundi - **BJ**: Benin - **BL**: Saint Barthelemy - **BM**: Bermuda - **BN**: Brunei Darussalam - **BO**: Bolivia - **BQ**: Bonaire, Sint Eustatius, and Saba - **BR**: Brazil - **BS**: Bahamas - **BT**: Bhutan - **BV**: Bouvet Island - **BW**: Botswana - **BY**: Belarus - **BZ**: Belize - **CA**: Canada - **CC**: Cocos (Keeling) Islands - **CD**: The Democratic Republic of the Congo - **CF**: Central African Republic - **CG**: Congo - **CH**: Switzerland - **CI**: Cote d&apos;Ivoire - **CK**: Cook Islands - **CL**: Chile - **CM**: Cameroon - **CN**: China - **CO**: Colombia - **CR**: Costa Rica - **CU**: Cuba - **CV**: Cape Verde - **CW**: Curacao - **CX**: Christmas Island - **CY**: Cyprus - **CZ**: Czech Republic - **DE**: Germany - **DJ**: Djibouti - **DK**: Denmark - **DM**: Dominica - **DO**: Dominican Republic - **DZ**: Algeria - **EC**: Ecuador - **EE**: Estonia - **EG**: Egypt - **EH**: Western Sahara - **ER**: Eritrea - **ES**: Spain - **ET**: Ethiopia - **FI**: Finland - **FJ**: Fiji - **FK**: Falkland Islands (Malvinas) - **FM**: Federated States of Micronesia - **FO**: Faroe Islands - **FR**: France - **GA**: Gabon - **GB**: United Kingdom - **GD**: Grenada - **GE**: Georgia - **GF**: French Guiana - **GG**: Guernsey - **GH**: Ghana - **GI**: Gibraltar - **GL**: Greenland - **GM**: Gambia - **GN**: Guinea - **GP**: Guadeloupe - **GQ**: Equatorial Guinea - **GR**: Greece - **GS**: South Georgia and the South Sandwich Islands - **GT**: Guatemala - **GU**: Guam - **GW**: Guinea-Bissau - **GY**: Guyana - **HK**: Hong Kong - **HM**: Heard Island and McDonald Islands - **HN**: Honduras - **HR**: Croatia - **HT**: Haiti - **HU**: Hungary - **ID**: Indonesia - **IE**: Ireland - **IL**: Israel - **IM**: Isle of Man - **IN**: India - **IO**: British Indian Ocean Territory - **IQ**: Iraq - **IR**: Islamic Republic of Iran - **IS**: Iceland - **IT**: Italy - **JE**: Jersey - **JM**: Jamaica - **JO**: Jordan - **JP**: Japan - **KE**: Kenya - **KG**: Kyrgyzstan - **KH**: Cambodia - **KI**: Kiribati - **KM**: Comoros - **KN**: Saint Kitts and Nevis - **KP**: Democratic People&apos;s Republic of Korea - **KR**: Republic of Korea - **KW**: Kuwait - **KY**: Cayman Islands - **KZ**: Kazakhstan - **LA**: Lao People&apos;s Democratic Republic - **LB**: Lebanon - **LC**: Saint Lucia - **LI**: Liechtenstein - **LK**: Sri Lanka - **LR**: Liberia - **LS**: Lesotho - **LT**: Lithuania - **LU**: Luxembourg - **LV**: Latvia - **LY**: Libyan Arab Jamahiriya - **MA**: Morocco - **MC**: Monaco - **MD**: Republic of Moldova - **ME**: Montenegro - **MF**: Saint Martin (French part) - **MG**: Madagascar - **MH**: Marshall Islands - **MK**: The Former Yugoslav Republic of Macedonia - **ML**: Mali - **MM**: Myanmar - **MN**: Mongolia - **MO**: Macao - **MP**: Northern Mariana Islands - **MQ**: Martinique - **MR**: Mauritania - **MS**: Montserrat - **MT**: Malta - **MU**: Mauritius - **MV**: Maldives - **MW**: Malawi - **MX**: Mexico - **MY**: Malaysia - **MZ**: Mozambique - **NA**: Namibia - **NC**: New Caledonia - **NE**: Niger - **NF**: Norfolk Island - **NG**: Nigeria - **NI**: Nicaragua - **NL**: Netherlands - **NO**: Norway - **NP**: Nepal - **NR**: Nauru - **NU**: Niue - **NZ**: New Zealand - **OM**: Oman - **PA**: Panama - **PE**: Peru - **PF**: French Polynesia. Includes Tahiti - **PG**: Papua New Guinea - **PH**: Philippines - **PK**: Pakistan - **PL**: Poland - **PM**: Saint Pierre and Miquelon - **PN**: Pitcairn - **PR**: Puerto Rico - **PS**: Palestinian territory Occupied - **PT**: Portugal - **PW**: Palau - **PY**: Paraguay - **QA**: Qatar - **RE**: Reunion - **RO**: Romania - **RS**: Serbia - **RU**: Russian Federation - **RW**: Rwanda - **SA**: Saudi Arabia - **SB**: Solomon Islands - **SC**: Seychelles - **SD**: Sudan - **SE**: Sweden - **SG**: Singapore - **SH**: Saint Helena - **SI**: Slovenia - **SJ**: Svalbard and Jan Mayen - **SK**: Slovakia - **SL**: Sierra Leone - **SM**: San Marino - **SN**: Senegal - **SO**: Somalia - **SR**: Suriname - **ST**: Sao Tome and Principe - **SV**: El Salvador - **SX**: Sint Maarten (Dutch part) - **SY**: Syrian Arab Republic - **SZ**: Swaziland - **TC**: Turks and Caicos Islands - **TD**: Chad - **TF**: French Southern Territories - **TG**: Togo - **TH**: Thailand - **TJ**: Tajikistan - **TK**: Tokelau - **TL**: Timor-Leste - **TM**: Turkmenistan - **TN**: Tunisia - **TO**: Tonga - **TR**: Turkey - **TT**: Trinidad and Tobago - **TV**: Tuvalu - **TW**: Taiwan - **TZ**: Tanzania - **UA**: Ukraine - **UG**: Uganda - **UM**: United States Minor Outlying Islands - **US**: United States - **UY**: Uruguay - **UZ**: Uzbekistan - **VA**: Holy See (Vatican City state) - **VC**: Saint Vincent and the Grenadines - **VE**: Venezuela - **VG**: British Virgin Islands - **VI**: the U.S. Virgin Islands - **VN**: Vietnam - **VU**: Vanuatu - **WF**: Wallis and Futuna - **WS**: Samoa - **YE**: Yemen - **YT**: Mayotte - **ZA**: South Africa - **ZM**: Zambia - **ZW**: Zimbabwe
     */
    private CountryCodeEnum countryCode;
    /**
     * A unique ID that identifies the sales tax jurisdiction to which the sales tax rate applies.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When the returned &lt;code&gt;countryCode&lt;/code&gt; is &lt;code&gt;US&lt;/code&gt;, the only supported return values for &lt;code&gt;salesTaxJurisdictionId&lt;/code&gt; are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;AS&lt;/code&gt; (American Samoa)&lt;/li&gt;&lt;li&gt;&lt;code&gt;GU&lt;/code&gt; (Guam&lt;/li&gt;&lt;li&gt;&lt;code&gt;MP&lt;/code&gt; Northern Mariana Islands&lt;/li&gt;&lt;li&gt;&lt;code&gt;PW (Palau)&lt;/li&gt;&lt;li&gt;&lt;code&gt;VI&lt;/code&gt; (US Virgin Islands)&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     */
    private String salesTaxJurisdictionId;
    /**
     * The sales tax rate that will be applied to sales price. The &lt;b&gt;shippingAndHandlingTaxed&lt;/b&gt; value will indicate whether or not sales tax is also applied to shipping and handling charges&lt;br&gt;&lt;br&gt;Although it is a string, a percentage value is returned here, such as &lt;code&gt;7.75&lt;/code&gt;
     */
    private String salesTaxPercentage;
    /**
     * If returned as &lt;code&gt;true&lt;/code&gt;, sales tax is also applied to shipping and handling charges, and not just the total sales price of the order.
     */
    private Boolean shippingAndHandlingTaxed;
    /**
     * Instantiates a new {@link SalesTax} and sets the default values.
     */
    public SalesTax() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SalesTax}
     */
    @jakarta.annotation.Nonnull
    public static SalesTax createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SalesTax();
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
     * Gets the countryCode property value. This enumerated type lists the two-letter &lt;a href=&quot;https://www.iso.org/iso/country_codes&quot; target=&quot;_blank&quot;&gt;ISO 3166&amp;#8209;1 Alpha&amp;#8209;2&lt;/a&gt; code representing a country. | - **AD**: Andorra - **AE**: United Arab Emirates - **AF**: Afghanistan - **AG**: Antigua and Barbuda - **AI**: Anguilla - **AL**: Albania - **AM**: Armenia - **AN**: Netherlands Antilles - **AO**: Angola - **AQ**: Antarctica - **AR**: Argentina - **AS**: American Samoa - **AT**: Austria - **AU**: Australia - **AW**: Aruba - **AX**: Aland Islands - **AZ**: Azerbaijan - **BA**: Bosnia and Herzegovina - **BB**: Barbados - **BD**: Bangladesh - **BE**: Belgium - **BF**: Burkina Faso - **BG**: Bulgaria - **BH**: Bahrain - **BI**: Burundi - **BJ**: Benin - **BL**: Saint Barthelemy - **BM**: Bermuda - **BN**: Brunei Darussalam - **BO**: Bolivia - **BQ**: Bonaire, Sint Eustatius, and Saba - **BR**: Brazil - **BS**: Bahamas - **BT**: Bhutan - **BV**: Bouvet Island - **BW**: Botswana - **BY**: Belarus - **BZ**: Belize - **CA**: Canada - **CC**: Cocos (Keeling) Islands - **CD**: The Democratic Republic of the Congo - **CF**: Central African Republic - **CG**: Congo - **CH**: Switzerland - **CI**: Cote d&apos;Ivoire - **CK**: Cook Islands - **CL**: Chile - **CM**: Cameroon - **CN**: China - **CO**: Colombia - **CR**: Costa Rica - **CU**: Cuba - **CV**: Cape Verde - **CW**: Curacao - **CX**: Christmas Island - **CY**: Cyprus - **CZ**: Czech Republic - **DE**: Germany - **DJ**: Djibouti - **DK**: Denmark - **DM**: Dominica - **DO**: Dominican Republic - **DZ**: Algeria - **EC**: Ecuador - **EE**: Estonia - **EG**: Egypt - **EH**: Western Sahara - **ER**: Eritrea - **ES**: Spain - **ET**: Ethiopia - **FI**: Finland - **FJ**: Fiji - **FK**: Falkland Islands (Malvinas) - **FM**: Federated States of Micronesia - **FO**: Faroe Islands - **FR**: France - **GA**: Gabon - **GB**: United Kingdom - **GD**: Grenada - **GE**: Georgia - **GF**: French Guiana - **GG**: Guernsey - **GH**: Ghana - **GI**: Gibraltar - **GL**: Greenland - **GM**: Gambia - **GN**: Guinea - **GP**: Guadeloupe - **GQ**: Equatorial Guinea - **GR**: Greece - **GS**: South Georgia and the South Sandwich Islands - **GT**: Guatemala - **GU**: Guam - **GW**: Guinea-Bissau - **GY**: Guyana - **HK**: Hong Kong - **HM**: Heard Island and McDonald Islands - **HN**: Honduras - **HR**: Croatia - **HT**: Haiti - **HU**: Hungary - **ID**: Indonesia - **IE**: Ireland - **IL**: Israel - **IM**: Isle of Man - **IN**: India - **IO**: British Indian Ocean Territory - **IQ**: Iraq - **IR**: Islamic Republic of Iran - **IS**: Iceland - **IT**: Italy - **JE**: Jersey - **JM**: Jamaica - **JO**: Jordan - **JP**: Japan - **KE**: Kenya - **KG**: Kyrgyzstan - **KH**: Cambodia - **KI**: Kiribati - **KM**: Comoros - **KN**: Saint Kitts and Nevis - **KP**: Democratic People&apos;s Republic of Korea - **KR**: Republic of Korea - **KW**: Kuwait - **KY**: Cayman Islands - **KZ**: Kazakhstan - **LA**: Lao People&apos;s Democratic Republic - **LB**: Lebanon - **LC**: Saint Lucia - **LI**: Liechtenstein - **LK**: Sri Lanka - **LR**: Liberia - **LS**: Lesotho - **LT**: Lithuania - **LU**: Luxembourg - **LV**: Latvia - **LY**: Libyan Arab Jamahiriya - **MA**: Morocco - **MC**: Monaco - **MD**: Republic of Moldova - **ME**: Montenegro - **MF**: Saint Martin (French part) - **MG**: Madagascar - **MH**: Marshall Islands - **MK**: The Former Yugoslav Republic of Macedonia - **ML**: Mali - **MM**: Myanmar - **MN**: Mongolia - **MO**: Macao - **MP**: Northern Mariana Islands - **MQ**: Martinique - **MR**: Mauritania - **MS**: Montserrat - **MT**: Malta - **MU**: Mauritius - **MV**: Maldives - **MW**: Malawi - **MX**: Mexico - **MY**: Malaysia - **MZ**: Mozambique - **NA**: Namibia - **NC**: New Caledonia - **NE**: Niger - **NF**: Norfolk Island - **NG**: Nigeria - **NI**: Nicaragua - **NL**: Netherlands - **NO**: Norway - **NP**: Nepal - **NR**: Nauru - **NU**: Niue - **NZ**: New Zealand - **OM**: Oman - **PA**: Panama - **PE**: Peru - **PF**: French Polynesia. Includes Tahiti - **PG**: Papua New Guinea - **PH**: Philippines - **PK**: Pakistan - **PL**: Poland - **PM**: Saint Pierre and Miquelon - **PN**: Pitcairn - **PR**: Puerto Rico - **PS**: Palestinian territory Occupied - **PT**: Portugal - **PW**: Palau - **PY**: Paraguay - **QA**: Qatar - **RE**: Reunion - **RO**: Romania - **RS**: Serbia - **RU**: Russian Federation - **RW**: Rwanda - **SA**: Saudi Arabia - **SB**: Solomon Islands - **SC**: Seychelles - **SD**: Sudan - **SE**: Sweden - **SG**: Singapore - **SH**: Saint Helena - **SI**: Slovenia - **SJ**: Svalbard and Jan Mayen - **SK**: Slovakia - **SL**: Sierra Leone - **SM**: San Marino - **SN**: Senegal - **SO**: Somalia - **SR**: Suriname - **ST**: Sao Tome and Principe - **SV**: El Salvador - **SX**: Sint Maarten (Dutch part) - **SY**: Syrian Arab Republic - **SZ**: Swaziland - **TC**: Turks and Caicos Islands - **TD**: Chad - **TF**: French Southern Territories - **TG**: Togo - **TH**: Thailand - **TJ**: Tajikistan - **TK**: Tokelau - **TL**: Timor-Leste - **TM**: Turkmenistan - **TN**: Tunisia - **TO**: Tonga - **TR**: Turkey - **TT**: Trinidad and Tobago - **TV**: Tuvalu - **TW**: Taiwan - **TZ**: Tanzania - **UA**: Ukraine - **UG**: Uganda - **UM**: United States Minor Outlying Islands - **US**: United States - **UY**: Uruguay - **UZ**: Uzbekistan - **VA**: Holy See (Vatican City state) - **VC**: Saint Vincent and the Grenadines - **VE**: Venezuela - **VG**: British Virgin Islands - **VI**: the U.S. Virgin Islands - **VN**: Vietnam - **VU**: Vanuatu - **WF**: Wallis and Futuna - **WS**: Samoa - **YE**: Yemen - **YT**: Mayotte - **ZA**: South Africa - **ZM**: Zambia - **ZW**: Zimbabwe
     * @return a {@link CountryCodeEnum}
     */
    @jakarta.annotation.Nullable
    public CountryCodeEnum getCountryCode() {
        return this.countryCode;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("countryCode", (n) -> { this.setCountryCode(n.getEnumValue(CountryCodeEnum::forValue)); });
        deserializerMap.put("salesTaxJurisdictionId", (n) -> { this.setSalesTaxJurisdictionId(n.getStringValue()); });
        deserializerMap.put("salesTaxPercentage", (n) -> { this.setSalesTaxPercentage(n.getStringValue()); });
        deserializerMap.put("shippingAndHandlingTaxed", (n) -> { this.setShippingAndHandlingTaxed(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the salesTaxJurisdictionId property value. A unique ID that identifies the sales tax jurisdiction to which the sales tax rate applies.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When the returned &lt;code&gt;countryCode&lt;/code&gt; is &lt;code&gt;US&lt;/code&gt;, the only supported return values for &lt;code&gt;salesTaxJurisdictionId&lt;/code&gt; are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;AS&lt;/code&gt; (American Samoa)&lt;/li&gt;&lt;li&gt;&lt;code&gt;GU&lt;/code&gt; (Guam&lt;/li&gt;&lt;li&gt;&lt;code&gt;MP&lt;/code&gt; Northern Mariana Islands&lt;/li&gt;&lt;li&gt;&lt;code&gt;PW (Palau)&lt;/li&gt;&lt;li&gt;&lt;code&gt;VI&lt;/code&gt; (US Virgin Islands)&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSalesTaxJurisdictionId() {
        return this.salesTaxJurisdictionId;
    }
    /**
     * Gets the salesTaxPercentage property value. The sales tax rate that will be applied to sales price. The &lt;b&gt;shippingAndHandlingTaxed&lt;/b&gt; value will indicate whether or not sales tax is also applied to shipping and handling charges&lt;br&gt;&lt;br&gt;Although it is a string, a percentage value is returned here, such as &lt;code&gt;7.75&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSalesTaxPercentage() {
        return this.salesTaxPercentage;
    }
    /**
     * Gets the shippingAndHandlingTaxed property value. If returned as &lt;code&gt;true&lt;/code&gt;, sales tax is also applied to shipping and handling charges, and not just the total sales price of the order.
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
        writer.writeEnumValue("countryCode", this.getCountryCode());
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
     * Sets the countryCode property value. This enumerated type lists the two-letter &lt;a href=&quot;https://www.iso.org/iso/country_codes&quot; target=&quot;_blank&quot;&gt;ISO 3166&amp;#8209;1 Alpha&amp;#8209;2&lt;/a&gt; code representing a country. | - **AD**: Andorra - **AE**: United Arab Emirates - **AF**: Afghanistan - **AG**: Antigua and Barbuda - **AI**: Anguilla - **AL**: Albania - **AM**: Armenia - **AN**: Netherlands Antilles - **AO**: Angola - **AQ**: Antarctica - **AR**: Argentina - **AS**: American Samoa - **AT**: Austria - **AU**: Australia - **AW**: Aruba - **AX**: Aland Islands - **AZ**: Azerbaijan - **BA**: Bosnia and Herzegovina - **BB**: Barbados - **BD**: Bangladesh - **BE**: Belgium - **BF**: Burkina Faso - **BG**: Bulgaria - **BH**: Bahrain - **BI**: Burundi - **BJ**: Benin - **BL**: Saint Barthelemy - **BM**: Bermuda - **BN**: Brunei Darussalam - **BO**: Bolivia - **BQ**: Bonaire, Sint Eustatius, and Saba - **BR**: Brazil - **BS**: Bahamas - **BT**: Bhutan - **BV**: Bouvet Island - **BW**: Botswana - **BY**: Belarus - **BZ**: Belize - **CA**: Canada - **CC**: Cocos (Keeling) Islands - **CD**: The Democratic Republic of the Congo - **CF**: Central African Republic - **CG**: Congo - **CH**: Switzerland - **CI**: Cote d&apos;Ivoire - **CK**: Cook Islands - **CL**: Chile - **CM**: Cameroon - **CN**: China - **CO**: Colombia - **CR**: Costa Rica - **CU**: Cuba - **CV**: Cape Verde - **CW**: Curacao - **CX**: Christmas Island - **CY**: Cyprus - **CZ**: Czech Republic - **DE**: Germany - **DJ**: Djibouti - **DK**: Denmark - **DM**: Dominica - **DO**: Dominican Republic - **DZ**: Algeria - **EC**: Ecuador - **EE**: Estonia - **EG**: Egypt - **EH**: Western Sahara - **ER**: Eritrea - **ES**: Spain - **ET**: Ethiopia - **FI**: Finland - **FJ**: Fiji - **FK**: Falkland Islands (Malvinas) - **FM**: Federated States of Micronesia - **FO**: Faroe Islands - **FR**: France - **GA**: Gabon - **GB**: United Kingdom - **GD**: Grenada - **GE**: Georgia - **GF**: French Guiana - **GG**: Guernsey - **GH**: Ghana - **GI**: Gibraltar - **GL**: Greenland - **GM**: Gambia - **GN**: Guinea - **GP**: Guadeloupe - **GQ**: Equatorial Guinea - **GR**: Greece - **GS**: South Georgia and the South Sandwich Islands - **GT**: Guatemala - **GU**: Guam - **GW**: Guinea-Bissau - **GY**: Guyana - **HK**: Hong Kong - **HM**: Heard Island and McDonald Islands - **HN**: Honduras - **HR**: Croatia - **HT**: Haiti - **HU**: Hungary - **ID**: Indonesia - **IE**: Ireland - **IL**: Israel - **IM**: Isle of Man - **IN**: India - **IO**: British Indian Ocean Territory - **IQ**: Iraq - **IR**: Islamic Republic of Iran - **IS**: Iceland - **IT**: Italy - **JE**: Jersey - **JM**: Jamaica - **JO**: Jordan - **JP**: Japan - **KE**: Kenya - **KG**: Kyrgyzstan - **KH**: Cambodia - **KI**: Kiribati - **KM**: Comoros - **KN**: Saint Kitts and Nevis - **KP**: Democratic People&apos;s Republic of Korea - **KR**: Republic of Korea - **KW**: Kuwait - **KY**: Cayman Islands - **KZ**: Kazakhstan - **LA**: Lao People&apos;s Democratic Republic - **LB**: Lebanon - **LC**: Saint Lucia - **LI**: Liechtenstein - **LK**: Sri Lanka - **LR**: Liberia - **LS**: Lesotho - **LT**: Lithuania - **LU**: Luxembourg - **LV**: Latvia - **LY**: Libyan Arab Jamahiriya - **MA**: Morocco - **MC**: Monaco - **MD**: Republic of Moldova - **ME**: Montenegro - **MF**: Saint Martin (French part) - **MG**: Madagascar - **MH**: Marshall Islands - **MK**: The Former Yugoslav Republic of Macedonia - **ML**: Mali - **MM**: Myanmar - **MN**: Mongolia - **MO**: Macao - **MP**: Northern Mariana Islands - **MQ**: Martinique - **MR**: Mauritania - **MS**: Montserrat - **MT**: Malta - **MU**: Mauritius - **MV**: Maldives - **MW**: Malawi - **MX**: Mexico - **MY**: Malaysia - **MZ**: Mozambique - **NA**: Namibia - **NC**: New Caledonia - **NE**: Niger - **NF**: Norfolk Island - **NG**: Nigeria - **NI**: Nicaragua - **NL**: Netherlands - **NO**: Norway - **NP**: Nepal - **NR**: Nauru - **NU**: Niue - **NZ**: New Zealand - **OM**: Oman - **PA**: Panama - **PE**: Peru - **PF**: French Polynesia. Includes Tahiti - **PG**: Papua New Guinea - **PH**: Philippines - **PK**: Pakistan - **PL**: Poland - **PM**: Saint Pierre and Miquelon - **PN**: Pitcairn - **PR**: Puerto Rico - **PS**: Palestinian territory Occupied - **PT**: Portugal - **PW**: Palau - **PY**: Paraguay - **QA**: Qatar - **RE**: Reunion - **RO**: Romania - **RS**: Serbia - **RU**: Russian Federation - **RW**: Rwanda - **SA**: Saudi Arabia - **SB**: Solomon Islands - **SC**: Seychelles - **SD**: Sudan - **SE**: Sweden - **SG**: Singapore - **SH**: Saint Helena - **SI**: Slovenia - **SJ**: Svalbard and Jan Mayen - **SK**: Slovakia - **SL**: Sierra Leone - **SM**: San Marino - **SN**: Senegal - **SO**: Somalia - **SR**: Suriname - **ST**: Sao Tome and Principe - **SV**: El Salvador - **SX**: Sint Maarten (Dutch part) - **SY**: Syrian Arab Republic - **SZ**: Swaziland - **TC**: Turks and Caicos Islands - **TD**: Chad - **TF**: French Southern Territories - **TG**: Togo - **TH**: Thailand - **TJ**: Tajikistan - **TK**: Tokelau - **TL**: Timor-Leste - **TM**: Turkmenistan - **TN**: Tunisia - **TO**: Tonga - **TR**: Turkey - **TT**: Trinidad and Tobago - **TV**: Tuvalu - **TW**: Taiwan - **TZ**: Tanzania - **UA**: Ukraine - **UG**: Uganda - **UM**: United States Minor Outlying Islands - **US**: United States - **UY**: Uruguay - **UZ**: Uzbekistan - **VA**: Holy See (Vatican City state) - **VC**: Saint Vincent and the Grenadines - **VE**: Venezuela - **VG**: British Virgin Islands - **VI**: the U.S. Virgin Islands - **VN**: Vietnam - **VU**: Vanuatu - **WF**: Wallis and Futuna - **WS**: Samoa - **YE**: Yemen - **YT**: Mayotte - **ZA**: South Africa - **ZM**: Zambia - **ZW**: Zimbabwe
     * @param value Value to set for the countryCode property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final CountryCodeEnum value) {
        this.countryCode = value;
    }
    /**
     * Sets the salesTaxJurisdictionId property value. A unique ID that identifies the sales tax jurisdiction to which the sales tax rate applies.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When the returned &lt;code&gt;countryCode&lt;/code&gt; is &lt;code&gt;US&lt;/code&gt;, the only supported return values for &lt;code&gt;salesTaxJurisdictionId&lt;/code&gt; are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;AS&lt;/code&gt; (American Samoa)&lt;/li&gt;&lt;li&gt;&lt;code&gt;GU&lt;/code&gt; (Guam&lt;/li&gt;&lt;li&gt;&lt;code&gt;MP&lt;/code&gt; Northern Mariana Islands&lt;/li&gt;&lt;li&gt;&lt;code&gt;PW (Palau)&lt;/li&gt;&lt;li&gt;&lt;code&gt;VI&lt;/code&gt; (US Virgin Islands)&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @param value Value to set for the salesTaxJurisdictionId property.
     */
    public void setSalesTaxJurisdictionId(@jakarta.annotation.Nullable final String value) {
        this.salesTaxJurisdictionId = value;
    }
    /**
     * Sets the salesTaxPercentage property value. The sales tax rate that will be applied to sales price. The &lt;b&gt;shippingAndHandlingTaxed&lt;/b&gt; value will indicate whether or not sales tax is also applied to shipping and handling charges&lt;br&gt;&lt;br&gt;Although it is a string, a percentage value is returned here, such as &lt;code&gt;7.75&lt;/code&gt;
     * @param value Value to set for the salesTaxPercentage property.
     */
    public void setSalesTaxPercentage(@jakarta.annotation.Nullable final String value) {
        this.salesTaxPercentage = value;
    }
    /**
     * Sets the shippingAndHandlingTaxed property value. If returned as &lt;code&gt;true&lt;/code&gt;, sales tax is also applied to shipping and handling charges, and not just the total sales price of the order.
     * @param value Value to set for the shippingAndHandlingTaxed property.
     */
    public void setShippingAndHandlingTaxed(@jakarta.annotation.Nullable final Boolean value) {
        this.shippingAndHandlingTaxed = value;
    }
}
