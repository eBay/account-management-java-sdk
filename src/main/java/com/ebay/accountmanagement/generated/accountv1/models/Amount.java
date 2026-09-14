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
 * A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Amount implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This enumerated type lists the three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code representing the supported world currencies. | - **AED**: United Arab Emirates dirham - **AFN**: Afghan afghani - **ALL**: Albanian lek - **AMD**: Armenian dram - **ANG**: Netherlands Antillean guilder - **AOA**: Angolan kwanza - **ARS**: Argentine peso - **AUD**: Australian dollar - **AWG**: Aruban florin - **AZN**: Azerbaijani manat - **BAM**: Bosnia and Herzegovina convertible mark - **BBD**: Barbados dollar - **BDT**: Bangladeshi taka - **BGN**: Bulgarian lev - **BHD**: Bahraini dinar - **BIF**: Burundian franc - **BMD**: Bermudian dollar - **BND**: Brunei dollar - **BOB**: Bolivian Boliviano - **BRL**: Brazilian real - **BSD**: Bahamian dollar - **BTN**: Bhutanese ngultrum - **BWP**: Botswana pula - **BYR**: Belarusian ruble - **BZD**: Belize dollar - **CAD**: Canadian dollar - **CDF**: Congolese franc - **CHF**: Swiss franc - **CLP**: Chilean peso - **CNY**: Chinese yuan renminbi - **COP**: Colombian peso - **CRC**: Costa Rican colon - **CUP**: Cuban peso - **CVE**: Cape Verde escudo - **CZK**: Czech koruna - **DJF**: Djiboutian franc - **DKK**: Danish krone - **DOP**: Dominican peso - **DZD**: Algerian dinar - **EGP**: Egyptian pound - **ERN**: Eritrean nakfa - **ETB**: Ethiopian birr - **EUR**: European Union euro - **FJD**: Fiji dollar - **FKP**: Falkland Islands pound - **GBP**: British pound sterling - **GEL**: Georgian lari - **GHS**: Ghanaian cedi - **GIP**: Gibraltar pound - **GMD**: Gambian dalasi - **GNF**: Guinean franc - **GTQ**: Guatemalan quetzal - **GYD**: Guyanese dollar - **HKD**: Hong Kong dollar - **HNL**: Honduran lempira - **HRK**: Croatian kuna - **HTG**: Haitian gourde - **HUF**: Hungarian forint - **IDR**: Indonesian rupiah - **ILS**: Israeli new shekel - **INR**: Indian rupee - **IQD**: Iraqi dinar - **IRR**: Iranian rial - **ISK**: Icelandic krona - **JMD**: Jamaican dollar - **JOD**: Jordanian dinar - **JPY**: Japanese yen - **KES**: Kenyan shilling - **KGS**: Kyrgyzstani som - **KHR**: Cambodian riel - **KMF**: Comoro franc - **KPW**: North Korean won - **KRW**: South Korean won - **KWD**: Kuwaiti dinar - **KYD**: Cayman Islands dollar - **KZT**: Kazakhstani tenge - **LAK**: Lao kip - **LBP**: Lebanese pound - **LKR**: Sri Lankan rupee - **LRD**: Liberian dollar - **LSL**: Lesotho loti - **LTL**: Lithuanian litas - **LYD**: Libyan dinar - **MAD**: Moroccan dirham - **MDL**: Moldovan leu - **MGA**: Malagasy ariary - **MKD**: Macedonian denar - **MMK**: Myanmar kyat - **MNT**: Mongolian tugrik - **MOP**: Macanese pataca - **MRO**: Mauritanian ouguiya - **MUR**: Mauritian rupee - **MVR**: Maldivian rufiyaa - **MWK**: Malawian kwacha - **MXN**: Mexican peso - **MYR**: Malaysian ringgit - **MZN**: Mozambican metical - **NAD**: Namibian dollar - **NGN**: Nigerian naira - **NIO**: Nicaraguan cordoba oro - **NOK**: Norwegian krone - **NPR**: Nepalese rupee - **NZD**: New Zealand dollar - **OMR**: Omani rial - **PAB**: Panamanian balboa - **PEN**: Peruvian sol - **PGK**: Papua New Guinean kina - **PHP**: Philippine peso - **PKR**: Pakistani rupee - **PLN**: Polish zloty - **PYG**: Paraguayan guarani - **QAR**: Qatari riyal - **RON**: Romanian leu - **RSD**: Serbian dinar - **RUB**: Russian ruble - **RWF**: Rwandan franc - **SAR**: Saudi riyal - **SBD**: Solomon Islands dollar - **SCR**: Seychelles rupee - **SDG**: Sudanese pound - **SEK**: Swedish krona - **SGD**: Singapore dollar - **SHP**: Saint Helena pound - **SLL**: Sierra Leonean leone - **SOS**: Somali shilling - **SRD**: Surinamese dollar - **STD**: Sao Tome and Principe dobra - **SYP**: Syrian pound - **SZL**: Swazi lilangeni - **THB**: Thai baht - **TJS**: Tajikistani somoni - **TMT**: Turkmenistani manat - **TND**: Tunisian dinar - **TOP**: Tongan pa&apos;anga - **TRY**: Turkish lira - **TTD**: Trinidad and Tobago dollar - **TWD**: New Taiwan dollar - **TZS**: Tanzanian shilling - **UAH**: Ukrainian hryvnia - **UGX**: Ugandan shilling - **USD**: United States dollar - **UYU**: Uruguayan peso - **UZS**: Uzbekistani som - **VEF**: Venezuelan bolivar - **VND**: Vietnamese dong - **VUV**: Vanuatu vatu - **WST**: Samoan tala - **XAF**: CFA franc BEAC - **XCD**: East Caribbean dollar - **XOF**: CFA franc BCEAO - **XPF**: CFP franc - **YER**: Yemeni rial - **ZAR**: South African rand - **ZMW**: Zambian kwacha - **ZWL**: Zimbabwean dollar
     */
    private CurrencyCodeEnum currency;
    /**
     * The monetary amount in the specified &lt;b&gt;currency&lt;/b&gt;.
     */
    private String value;
    /**
     * Instantiates a new {@link Amount} and sets the default values.
     */
    public Amount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nonnull
    public static Amount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Amount();
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
     * Gets the currency property value. This enumerated type lists the three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code representing the supported world currencies. | - **AED**: United Arab Emirates dirham - **AFN**: Afghan afghani - **ALL**: Albanian lek - **AMD**: Armenian dram - **ANG**: Netherlands Antillean guilder - **AOA**: Angolan kwanza - **ARS**: Argentine peso - **AUD**: Australian dollar - **AWG**: Aruban florin - **AZN**: Azerbaijani manat - **BAM**: Bosnia and Herzegovina convertible mark - **BBD**: Barbados dollar - **BDT**: Bangladeshi taka - **BGN**: Bulgarian lev - **BHD**: Bahraini dinar - **BIF**: Burundian franc - **BMD**: Bermudian dollar - **BND**: Brunei dollar - **BOB**: Bolivian Boliviano - **BRL**: Brazilian real - **BSD**: Bahamian dollar - **BTN**: Bhutanese ngultrum - **BWP**: Botswana pula - **BYR**: Belarusian ruble - **BZD**: Belize dollar - **CAD**: Canadian dollar - **CDF**: Congolese franc - **CHF**: Swiss franc - **CLP**: Chilean peso - **CNY**: Chinese yuan renminbi - **COP**: Colombian peso - **CRC**: Costa Rican colon - **CUP**: Cuban peso - **CVE**: Cape Verde escudo - **CZK**: Czech koruna - **DJF**: Djiboutian franc - **DKK**: Danish krone - **DOP**: Dominican peso - **DZD**: Algerian dinar - **EGP**: Egyptian pound - **ERN**: Eritrean nakfa - **ETB**: Ethiopian birr - **EUR**: European Union euro - **FJD**: Fiji dollar - **FKP**: Falkland Islands pound - **GBP**: British pound sterling - **GEL**: Georgian lari - **GHS**: Ghanaian cedi - **GIP**: Gibraltar pound - **GMD**: Gambian dalasi - **GNF**: Guinean franc - **GTQ**: Guatemalan quetzal - **GYD**: Guyanese dollar - **HKD**: Hong Kong dollar - **HNL**: Honduran lempira - **HRK**: Croatian kuna - **HTG**: Haitian gourde - **HUF**: Hungarian forint - **IDR**: Indonesian rupiah - **ILS**: Israeli new shekel - **INR**: Indian rupee - **IQD**: Iraqi dinar - **IRR**: Iranian rial - **ISK**: Icelandic krona - **JMD**: Jamaican dollar - **JOD**: Jordanian dinar - **JPY**: Japanese yen - **KES**: Kenyan shilling - **KGS**: Kyrgyzstani som - **KHR**: Cambodian riel - **KMF**: Comoro franc - **KPW**: North Korean won - **KRW**: South Korean won - **KWD**: Kuwaiti dinar - **KYD**: Cayman Islands dollar - **KZT**: Kazakhstani tenge - **LAK**: Lao kip - **LBP**: Lebanese pound - **LKR**: Sri Lankan rupee - **LRD**: Liberian dollar - **LSL**: Lesotho loti - **LTL**: Lithuanian litas - **LYD**: Libyan dinar - **MAD**: Moroccan dirham - **MDL**: Moldovan leu - **MGA**: Malagasy ariary - **MKD**: Macedonian denar - **MMK**: Myanmar kyat - **MNT**: Mongolian tugrik - **MOP**: Macanese pataca - **MRO**: Mauritanian ouguiya - **MUR**: Mauritian rupee - **MVR**: Maldivian rufiyaa - **MWK**: Malawian kwacha - **MXN**: Mexican peso - **MYR**: Malaysian ringgit - **MZN**: Mozambican metical - **NAD**: Namibian dollar - **NGN**: Nigerian naira - **NIO**: Nicaraguan cordoba oro - **NOK**: Norwegian krone - **NPR**: Nepalese rupee - **NZD**: New Zealand dollar - **OMR**: Omani rial - **PAB**: Panamanian balboa - **PEN**: Peruvian sol - **PGK**: Papua New Guinean kina - **PHP**: Philippine peso - **PKR**: Pakistani rupee - **PLN**: Polish zloty - **PYG**: Paraguayan guarani - **QAR**: Qatari riyal - **RON**: Romanian leu - **RSD**: Serbian dinar - **RUB**: Russian ruble - **RWF**: Rwandan franc - **SAR**: Saudi riyal - **SBD**: Solomon Islands dollar - **SCR**: Seychelles rupee - **SDG**: Sudanese pound - **SEK**: Swedish krona - **SGD**: Singapore dollar - **SHP**: Saint Helena pound - **SLL**: Sierra Leonean leone - **SOS**: Somali shilling - **SRD**: Surinamese dollar - **STD**: Sao Tome and Principe dobra - **SYP**: Syrian pound - **SZL**: Swazi lilangeni - **THB**: Thai baht - **TJS**: Tajikistani somoni - **TMT**: Turkmenistani manat - **TND**: Tunisian dinar - **TOP**: Tongan pa&apos;anga - **TRY**: Turkish lira - **TTD**: Trinidad and Tobago dollar - **TWD**: New Taiwan dollar - **TZS**: Tanzanian shilling - **UAH**: Ukrainian hryvnia - **UGX**: Ugandan shilling - **USD**: United States dollar - **UYU**: Uruguayan peso - **UZS**: Uzbekistani som - **VEF**: Venezuelan bolivar - **VND**: Vietnamese dong - **VUV**: Vanuatu vatu - **WST**: Samoan tala - **XAF**: CFA franc BEAC - **XCD**: East Caribbean dollar - **XOF**: CFA franc BCEAO - **XPF**: CFP franc - **YER**: Yemeni rial - **ZAR**: South African rand - **ZMW**: Zambian kwacha - **ZWL**: Zimbabwean dollar
     * @return a {@link CurrencyCodeEnum}
     */
    @jakarta.annotation.Nullable
    public CurrencyCodeEnum getCurrency() {
        return this.currency;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getEnumValue(CurrencyCodeEnum::forValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The monetary amount in the specified &lt;b&gt;currency&lt;/b&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("currency", this.getCurrency());
        writer.writeStringValue("value", this.getValue());
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
     * Sets the currency property value. This enumerated type lists the three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code representing the supported world currencies. | - **AED**: United Arab Emirates dirham - **AFN**: Afghan afghani - **ALL**: Albanian lek - **AMD**: Armenian dram - **ANG**: Netherlands Antillean guilder - **AOA**: Angolan kwanza - **ARS**: Argentine peso - **AUD**: Australian dollar - **AWG**: Aruban florin - **AZN**: Azerbaijani manat - **BAM**: Bosnia and Herzegovina convertible mark - **BBD**: Barbados dollar - **BDT**: Bangladeshi taka - **BGN**: Bulgarian lev - **BHD**: Bahraini dinar - **BIF**: Burundian franc - **BMD**: Bermudian dollar - **BND**: Brunei dollar - **BOB**: Bolivian Boliviano - **BRL**: Brazilian real - **BSD**: Bahamian dollar - **BTN**: Bhutanese ngultrum - **BWP**: Botswana pula - **BYR**: Belarusian ruble - **BZD**: Belize dollar - **CAD**: Canadian dollar - **CDF**: Congolese franc - **CHF**: Swiss franc - **CLP**: Chilean peso - **CNY**: Chinese yuan renminbi - **COP**: Colombian peso - **CRC**: Costa Rican colon - **CUP**: Cuban peso - **CVE**: Cape Verde escudo - **CZK**: Czech koruna - **DJF**: Djiboutian franc - **DKK**: Danish krone - **DOP**: Dominican peso - **DZD**: Algerian dinar - **EGP**: Egyptian pound - **ERN**: Eritrean nakfa - **ETB**: Ethiopian birr - **EUR**: European Union euro - **FJD**: Fiji dollar - **FKP**: Falkland Islands pound - **GBP**: British pound sterling - **GEL**: Georgian lari - **GHS**: Ghanaian cedi - **GIP**: Gibraltar pound - **GMD**: Gambian dalasi - **GNF**: Guinean franc - **GTQ**: Guatemalan quetzal - **GYD**: Guyanese dollar - **HKD**: Hong Kong dollar - **HNL**: Honduran lempira - **HRK**: Croatian kuna - **HTG**: Haitian gourde - **HUF**: Hungarian forint - **IDR**: Indonesian rupiah - **ILS**: Israeli new shekel - **INR**: Indian rupee - **IQD**: Iraqi dinar - **IRR**: Iranian rial - **ISK**: Icelandic krona - **JMD**: Jamaican dollar - **JOD**: Jordanian dinar - **JPY**: Japanese yen - **KES**: Kenyan shilling - **KGS**: Kyrgyzstani som - **KHR**: Cambodian riel - **KMF**: Comoro franc - **KPW**: North Korean won - **KRW**: South Korean won - **KWD**: Kuwaiti dinar - **KYD**: Cayman Islands dollar - **KZT**: Kazakhstani tenge - **LAK**: Lao kip - **LBP**: Lebanese pound - **LKR**: Sri Lankan rupee - **LRD**: Liberian dollar - **LSL**: Lesotho loti - **LTL**: Lithuanian litas - **LYD**: Libyan dinar - **MAD**: Moroccan dirham - **MDL**: Moldovan leu - **MGA**: Malagasy ariary - **MKD**: Macedonian denar - **MMK**: Myanmar kyat - **MNT**: Mongolian tugrik - **MOP**: Macanese pataca - **MRO**: Mauritanian ouguiya - **MUR**: Mauritian rupee - **MVR**: Maldivian rufiyaa - **MWK**: Malawian kwacha - **MXN**: Mexican peso - **MYR**: Malaysian ringgit - **MZN**: Mozambican metical - **NAD**: Namibian dollar - **NGN**: Nigerian naira - **NIO**: Nicaraguan cordoba oro - **NOK**: Norwegian krone - **NPR**: Nepalese rupee - **NZD**: New Zealand dollar - **OMR**: Omani rial - **PAB**: Panamanian balboa - **PEN**: Peruvian sol - **PGK**: Papua New Guinean kina - **PHP**: Philippine peso - **PKR**: Pakistani rupee - **PLN**: Polish zloty - **PYG**: Paraguayan guarani - **QAR**: Qatari riyal - **RON**: Romanian leu - **RSD**: Serbian dinar - **RUB**: Russian ruble - **RWF**: Rwandan franc - **SAR**: Saudi riyal - **SBD**: Solomon Islands dollar - **SCR**: Seychelles rupee - **SDG**: Sudanese pound - **SEK**: Swedish krona - **SGD**: Singapore dollar - **SHP**: Saint Helena pound - **SLL**: Sierra Leonean leone - **SOS**: Somali shilling - **SRD**: Surinamese dollar - **STD**: Sao Tome and Principe dobra - **SYP**: Syrian pound - **SZL**: Swazi lilangeni - **THB**: Thai baht - **TJS**: Tajikistani somoni - **TMT**: Turkmenistani manat - **TND**: Tunisian dinar - **TOP**: Tongan pa&apos;anga - **TRY**: Turkish lira - **TTD**: Trinidad and Tobago dollar - **TWD**: New Taiwan dollar - **TZS**: Tanzanian shilling - **UAH**: Ukrainian hryvnia - **UGX**: Ugandan shilling - **USD**: United States dollar - **UYU**: Uruguayan peso - **UZS**: Uzbekistani som - **VEF**: Venezuelan bolivar - **VND**: Vietnamese dong - **VUV**: Vanuatu vatu - **WST**: Samoan tala - **XAF**: CFA franc BEAC - **XCD**: East Caribbean dollar - **XOF**: CFA franc BCEAO - **XPF**: CFP franc - **YER**: Yemeni rial - **ZAR**: South African rand - **ZMW**: Zambian kwacha - **ZWL**: Zimbabwean dollar
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final CurrencyCodeEnum value) {
        this.currency = value;
    }
    /**
     * Sets the value property value. The monetary amount in the specified &lt;b&gt;currency&lt;/b&gt;.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
