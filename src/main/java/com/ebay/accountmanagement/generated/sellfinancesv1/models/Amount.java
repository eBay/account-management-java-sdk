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

package com.ebay.accountmanagement.generated.sellfinancesv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Amount implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code representing the currency of the amount in the &lt;b&gt; convertedFromValue&lt;/b&gt; field. This value is the pre-conversion currency.&lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/ba:CurrencyCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String convertedFromCurrency;
    /**
     * The monetary amount before any conversion is performed, in the currency specified by the &lt;b&gt; convertedFromCurrency&lt;/b&gt; field. This value is the pre-conversion amount. The &lt;b&gt; value&lt;/b&gt; field contains the converted amount of this value, in the currency specified by the &lt;b&gt; currency&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay.
     */
    private String convertedFromValue;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is only applicable for Mainland China sellers with an available CNY Bank payment instrument. This response can &lt;b&gt;only&lt;/b&gt; have a value of &lt;code&gt;CNY&lt;/code&gt;.&lt;/span&gt;The three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code representing the currency of the amount in the &lt;b&gt;convertedToValue&lt;/b&gt; field. &lt;br/&gt;&lt;br/&gt;This field is only returned for payouts to bank accounts when currency conversion was applied by eBay. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/ba:CurrencyCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String convertedToCurrency;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is only applicable for Mainland China sellers with an available CNY Bank payment instrument. This response &lt;b&gt;only&lt;/b&gt; returns value in CNY.&lt;/span&gt;The monetary value after any conversion is performed, in the currency specified by the &lt;b&gt;convertedToCurrency&lt;/b&gt; field. This value is the converted amount. &lt;br/&gt;&lt;br/&gt;The field is only returned for payouts to bank accounts when currency conversion was applied by eBay.
     */
    private String convertedToValue;
    /**
     * A three-letter ISO 4217 code that indicates the currency of the amount in the &lt;b&gt;value&lt;/b&gt; field. This field is always returned with any container using &lt;b&gt;Amount&lt;/b&gt; type. &lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: The currency of the authenticated user&apos;s country. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/ba:CurrencyCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String currency;
    /**
     * The exchange rate used for the monetary conversion. This field shows the exchange rate used to convert the dollar value in the &lt;b&gt;value&lt;/b&gt; field from the dollar value in the &lt;b&gt;convertedFromValue&lt;/b&gt; field.&lt;br&gt;&lt;br&gt; For sellers in mainland China, this field shows the exchange rate to convert the dollar value in the &lt;b&gt;value&lt;/b&gt; field to the CNY value in the &lt;b&gt;convertedToValue&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;This field is only returned when eBay does a currency version, and a currency conversion is generally needed if the buyer is viewing, or has purchased an item on an international site. &lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay.
     */
    private String exchangeRate;
    /**
     * The monetary amount, in the currency specified by the &lt;b&gt;currency&lt;/b&gt; field. This field is always returned with any container using &lt;b&gt;Amount&lt;/b&gt; type.
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
     * Gets the convertedFromCurrency property value. The three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code representing the currency of the amount in the &lt;b&gt; convertedFromValue&lt;/b&gt; field. This value is the pre-conversion currency.&lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/ba:CurrencyCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConvertedFromCurrency() {
        return this.convertedFromCurrency;
    }
    /**
     * Gets the convertedFromValue property value. The monetary amount before any conversion is performed, in the currency specified by the &lt;b&gt; convertedFromCurrency&lt;/b&gt; field. This value is the pre-conversion amount. The &lt;b&gt; value&lt;/b&gt; field contains the converted amount of this value, in the currency specified by the &lt;b&gt; currency&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConvertedFromValue() {
        return this.convertedFromValue;
    }
    /**
     * Gets the convertedToCurrency property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is only applicable for Mainland China sellers with an available CNY Bank payment instrument. This response can &lt;b&gt;only&lt;/b&gt; have a value of &lt;code&gt;CNY&lt;/code&gt;.&lt;/span&gt;The three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code representing the currency of the amount in the &lt;b&gt;convertedToValue&lt;/b&gt; field. &lt;br/&gt;&lt;br/&gt;This field is only returned for payouts to bank accounts when currency conversion was applied by eBay. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/ba:CurrencyCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConvertedToCurrency() {
        return this.convertedToCurrency;
    }
    /**
     * Gets the convertedToValue property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is only applicable for Mainland China sellers with an available CNY Bank payment instrument. This response &lt;b&gt;only&lt;/b&gt; returns value in CNY.&lt;/span&gt;The monetary value after any conversion is performed, in the currency specified by the &lt;b&gt;convertedToCurrency&lt;/b&gt; field. This value is the converted amount. &lt;br/&gt;&lt;br/&gt;The field is only returned for payouts to bank accounts when currency conversion was applied by eBay.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConvertedToValue() {
        return this.convertedToValue;
    }
    /**
     * Gets the currency property value. A three-letter ISO 4217 code that indicates the currency of the amount in the &lt;b&gt;value&lt;/b&gt; field. This field is always returned with any container using &lt;b&gt;Amount&lt;/b&gt; type. &lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: The currency of the authenticated user&apos;s country. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/ba:CurrencyCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrency() {
        return this.currency;
    }
    /**
     * Gets the exchangeRate property value. The exchange rate used for the monetary conversion. This field shows the exchange rate used to convert the dollar value in the &lt;b&gt;value&lt;/b&gt; field from the dollar value in the &lt;b&gt;convertedFromValue&lt;/b&gt; field.&lt;br&gt;&lt;br&gt; For sellers in mainland China, this field shows the exchange rate to convert the dollar value in the &lt;b&gt;value&lt;/b&gt; field to the CNY value in the &lt;b&gt;convertedToValue&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;This field is only returned when eBay does a currency version, and a currency conversion is generally needed if the buyer is viewing, or has purchased an item on an international site. &lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExchangeRate() {
        return this.exchangeRate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("convertedFromCurrency", (n) -> { this.setConvertedFromCurrency(n.getStringValue()); });
        deserializerMap.put("convertedFromValue", (n) -> { this.setConvertedFromValue(n.getStringValue()); });
        deserializerMap.put("convertedToCurrency", (n) -> { this.setConvertedToCurrency(n.getStringValue()); });
        deserializerMap.put("convertedToValue", (n) -> { this.setConvertedToValue(n.getStringValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("exchangeRate", (n) -> { this.setExchangeRate(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The monetary amount, in the currency specified by the &lt;b&gt;currency&lt;/b&gt; field. This field is always returned with any container using &lt;b&gt;Amount&lt;/b&gt; type.
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
        writer.writeStringValue("convertedFromCurrency", this.getConvertedFromCurrency());
        writer.writeStringValue("convertedFromValue", this.getConvertedFromValue());
        writer.writeStringValue("convertedToCurrency", this.getConvertedToCurrency());
        writer.writeStringValue("convertedToValue", this.getConvertedToValue());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeStringValue("exchangeRate", this.getExchangeRate());
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
     * Sets the convertedFromCurrency property value. The three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code representing the currency of the amount in the &lt;b&gt; convertedFromValue&lt;/b&gt; field. This value is the pre-conversion currency.&lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/ba:CurrencyCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the convertedFromCurrency property.
     */
    public void setConvertedFromCurrency(@jakarta.annotation.Nullable final String value) {
        this.convertedFromCurrency = value;
    }
    /**
     * Sets the convertedFromValue property value. The monetary amount before any conversion is performed, in the currency specified by the &lt;b&gt; convertedFromCurrency&lt;/b&gt; field. This value is the pre-conversion amount. The &lt;b&gt; value&lt;/b&gt; field contains the converted amount of this value, in the currency specified by the &lt;b&gt; currency&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay.
     * @param value Value to set for the convertedFromValue property.
     */
    public void setConvertedFromValue(@jakarta.annotation.Nullable final String value) {
        this.convertedFromValue = value;
    }
    /**
     * Sets the convertedToCurrency property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is only applicable for Mainland China sellers with an available CNY Bank payment instrument. This response can &lt;b&gt;only&lt;/b&gt; have a value of &lt;code&gt;CNY&lt;/code&gt;.&lt;/span&gt;The three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code representing the currency of the amount in the &lt;b&gt;convertedToValue&lt;/b&gt; field. &lt;br/&gt;&lt;br/&gt;This field is only returned for payouts to bank accounts when currency conversion was applied by eBay. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/ba:CurrencyCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the convertedToCurrency property.
     */
    public void setConvertedToCurrency(@jakarta.annotation.Nullable final String value) {
        this.convertedToCurrency = value;
    }
    /**
     * Sets the convertedToValue property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is only applicable for Mainland China sellers with an available CNY Bank payment instrument. This response &lt;b&gt;only&lt;/b&gt; returns value in CNY.&lt;/span&gt;The monetary value after any conversion is performed, in the currency specified by the &lt;b&gt;convertedToCurrency&lt;/b&gt; field. This value is the converted amount. &lt;br/&gt;&lt;br/&gt;The field is only returned for payouts to bank accounts when currency conversion was applied by eBay.
     * @param value Value to set for the convertedToValue property.
     */
    public void setConvertedToValue(@jakarta.annotation.Nullable final String value) {
        this.convertedToValue = value;
    }
    /**
     * Sets the currency property value. A three-letter ISO 4217 code that indicates the currency of the amount in the &lt;b&gt;value&lt;/b&gt; field. This field is always returned with any container using &lt;b&gt;Amount&lt;/b&gt; type. &lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: The currency of the authenticated user&apos;s country. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/ba:CurrencyCodeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the exchangeRate property value. The exchange rate used for the monetary conversion. This field shows the exchange rate used to convert the dollar value in the &lt;b&gt;value&lt;/b&gt; field from the dollar value in the &lt;b&gt;convertedFromValue&lt;/b&gt; field.&lt;br&gt;&lt;br&gt; For sellers in mainland China, this field shows the exchange rate to convert the dollar value in the &lt;b&gt;value&lt;/b&gt; field to the CNY value in the &lt;b&gt;convertedToValue&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;This field is only returned when eBay does a currency version, and a currency conversion is generally needed if the buyer is viewing, or has purchased an item on an international site. &lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay.
     * @param value Value to set for the exchangeRate property.
     */
    public void setExchangeRate(@jakarta.annotation.Nullable final String value) {
        this.exchangeRate = value;
    }
    /**
     * Sets the value property value. The monetary amount, in the currency specified by the &lt;b&gt;currency&lt;/b&gt; field. This field is always returned with any container using &lt;b&gt;Amount&lt;/b&gt; type.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
