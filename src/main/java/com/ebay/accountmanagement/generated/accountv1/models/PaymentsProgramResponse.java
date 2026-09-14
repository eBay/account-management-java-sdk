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
 * The response object containing the sellers status with regards to the specified payment program.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentsProgramResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This enumerated type contains a list of the standard codes that represent each of the eBay marketplaces. | - **EBAY_AT**: eBay Austria (ebay.at) - **EBAY_AU**: eBay Australia (ebay.com/au) - **EBAY_BE**: eBay Belgium (ebay.com/sch/Belgium) - **EBAY_CA**: eBay Canada (English) (ebay.ca) - **EBAY_CH**: eBay Switzerland (ebay.ch) - **EBAY_CN**: eBay China (ebay.com/sch/China) - **EBAY_CZ**: eBay Czech Republic (ebay.com/sch/Czech-Republic) - **EBAY_DE**: eBay Germany (ebay.de) - **EBAY_DK**: eBay Denmark (ebay.com/sch/Denmark) - **EBAY_ES**: eBay Spain (ebay.es) - **EBAY_FI**: eBay Finland (ebay.com/sch/Finland) - **EBAY_FR**: eBay France (ebay.fr) - **EBAY_GB**: eBay UK (ebay.co.uk) - **EBAY_GR**: eBay Greece (ebay.com/sch/Greece) - **EBAY_HK**: eBay Hong Kong (ebay.com.hk) - **EBAY_HU**: eBay Hungary (ebay.com/sch/Hungary) - **EBAY_ID**: eBay Indonesia (id.ebay.com) - **EBAY_IE**: eBay Ireland (ebay.ie) - **EBAY_IL**: eBay Israel (ebay.com/sch/Israel) - **EBAY_IN**: eBay India (ebay.in)&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; eBay India is no longer a functioning eBay marketplace.&lt;/span&gt; - **EBAY_IT**: eBay Italy (ebay.it) - **EBAY_JP**: eBay Japan (ebay.co.jp) - **EBAY_MY**: eBay Malaysia (ebay.com/my) - **EBAY_NL**: eBay Netherlands (ebay.nl) - **EBAY_NO**: eBay Norway (ebay.com/sch/Norway) - **EBAY_NZ**: eBay New Zealand (ebay.com/sch/New-Zealand) - **EBAY_PE**: eBay Peru (ebay.com/sch/Peru) - **EBAY_PH**: eBay Philippines (ebay.ph) - **EBAY_PL**: eBay Poland (ebay.pl) - **EBAY_PR**: eBay Puerto Rico (ebay.com/sch/Puerto-Rico) - **EBAY_PT**: eBay Portugal (ebay.com/sch/Portugal) - **EBAY_RU**: eBay Russia (ebay.com/sch/Russia) - **EBAY_SE**: eBay Sweden (ebay.com/sch/Sweden) - **EBAY_SG**: eBay Singapore (ebay.com/sg) - **EBAY_TH**: eBay Thailand (export.ebay.co.th) - **EBAY_TW**: eBay Taiwan (ebay.com/tw) - **EBAY_US**: eBay US (ebay.com) - **EBAY_VN**: eBay Vietnam (ebay.vn) - **EBAY_ZA**: eBay South Africa (ebay.com/sch/South-Africa) - **EBAY_HALF_US**: This enumeration value is no longer applicable as the Half.com site no longer exists. - **EBAY_MOTORS_US**: eBay Motors US (ebay.com/motors)
     */
    private MarketplaceIdEnum marketplaceId;
    /**
     * This enumerated type defines the supported payment programs. | - **EBAY_PAYMENTS**: This value indicates the eBay-managed payments program.
     */
    private PaymentsProgramType paymentsProgramType;
    /**
     * This enumerated type defines the different possible statuses relating to whether or not a seller is opted-in to a payments program. | - **OPTED_IN**: Status indicating the seller is opted-in to the associated payment program. - **NOT_OPTED_IN**: Status indicating the seller is not opted-in to the associated payment program.
     */
    private PaymentsProgramStatus status;
    /**
     * If returned as &lt;code&gt;true&lt;/code&gt;, the seller was at one point opted-in to the associated payment program, but they later opted out of the program. A value of &lt;code&gt;false&lt;/code&gt; indicates the seller never opted-in to the program or if they did opt-in to the program, they never opted-out of it.  &lt;br&gt;&lt;br&gt;It&apos;s important to note that the setting of this field does not indicate the seller&apos;s current status regarding the payment program. It is possible for this field to return &lt;code&gt;true&lt;/code&gt; while the &lt;b&gt;status&lt;/b&gt; field returns &lt;code&gt;OPTED_IN&lt;/code&gt;.
     */
    private Boolean wasPreviouslyOptedIn;
    /**
     * Instantiates a new {@link PaymentsProgramResponse} and sets the default values.
     */
    public PaymentsProgramResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PaymentsProgramResponse}
     */
    @jakarta.annotation.Nonnull
    public static PaymentsProgramResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaymentsProgramResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getEnumValue(MarketplaceIdEnum::forValue)); });
        deserializerMap.put("paymentsProgramType", (n) -> { this.setPaymentsProgramType(n.getEnumValue(PaymentsProgramType::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(PaymentsProgramStatus::forValue)); });
        deserializerMap.put("wasPreviouslyOptedIn", (n) -> { this.setWasPreviouslyOptedIn(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the marketplaceId property value. This enumerated type contains a list of the standard codes that represent each of the eBay marketplaces. | - **EBAY_AT**: eBay Austria (ebay.at) - **EBAY_AU**: eBay Australia (ebay.com/au) - **EBAY_BE**: eBay Belgium (ebay.com/sch/Belgium) - **EBAY_CA**: eBay Canada (English) (ebay.ca) - **EBAY_CH**: eBay Switzerland (ebay.ch) - **EBAY_CN**: eBay China (ebay.com/sch/China) - **EBAY_CZ**: eBay Czech Republic (ebay.com/sch/Czech-Republic) - **EBAY_DE**: eBay Germany (ebay.de) - **EBAY_DK**: eBay Denmark (ebay.com/sch/Denmark) - **EBAY_ES**: eBay Spain (ebay.es) - **EBAY_FI**: eBay Finland (ebay.com/sch/Finland) - **EBAY_FR**: eBay France (ebay.fr) - **EBAY_GB**: eBay UK (ebay.co.uk) - **EBAY_GR**: eBay Greece (ebay.com/sch/Greece) - **EBAY_HK**: eBay Hong Kong (ebay.com.hk) - **EBAY_HU**: eBay Hungary (ebay.com/sch/Hungary) - **EBAY_ID**: eBay Indonesia (id.ebay.com) - **EBAY_IE**: eBay Ireland (ebay.ie) - **EBAY_IL**: eBay Israel (ebay.com/sch/Israel) - **EBAY_IN**: eBay India (ebay.in)&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; eBay India is no longer a functioning eBay marketplace.&lt;/span&gt; - **EBAY_IT**: eBay Italy (ebay.it) - **EBAY_JP**: eBay Japan (ebay.co.jp) - **EBAY_MY**: eBay Malaysia (ebay.com/my) - **EBAY_NL**: eBay Netherlands (ebay.nl) - **EBAY_NO**: eBay Norway (ebay.com/sch/Norway) - **EBAY_NZ**: eBay New Zealand (ebay.com/sch/New-Zealand) - **EBAY_PE**: eBay Peru (ebay.com/sch/Peru) - **EBAY_PH**: eBay Philippines (ebay.ph) - **EBAY_PL**: eBay Poland (ebay.pl) - **EBAY_PR**: eBay Puerto Rico (ebay.com/sch/Puerto-Rico) - **EBAY_PT**: eBay Portugal (ebay.com/sch/Portugal) - **EBAY_RU**: eBay Russia (ebay.com/sch/Russia) - **EBAY_SE**: eBay Sweden (ebay.com/sch/Sweden) - **EBAY_SG**: eBay Singapore (ebay.com/sg) - **EBAY_TH**: eBay Thailand (export.ebay.co.th) - **EBAY_TW**: eBay Taiwan (ebay.com/tw) - **EBAY_US**: eBay US (ebay.com) - **EBAY_VN**: eBay Vietnam (ebay.vn) - **EBAY_ZA**: eBay South Africa (ebay.com/sch/South-Africa) - **EBAY_HALF_US**: This enumeration value is no longer applicable as the Half.com site no longer exists. - **EBAY_MOTORS_US**: eBay Motors US (ebay.com/motors)
     * @return a {@link MarketplaceIdEnum}
     */
    @jakarta.annotation.Nullable
    public MarketplaceIdEnum getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Gets the paymentsProgramType property value. This enumerated type defines the supported payment programs. | - **EBAY_PAYMENTS**: This value indicates the eBay-managed payments program.
     * @return a {@link PaymentsProgramType}
     */
    @jakarta.annotation.Nullable
    public PaymentsProgramType getPaymentsProgramType() {
        return this.paymentsProgramType;
    }
    /**
     * Gets the status property value. This enumerated type defines the different possible statuses relating to whether or not a seller is opted-in to a payments program. | - **OPTED_IN**: Status indicating the seller is opted-in to the associated payment program. - **NOT_OPTED_IN**: Status indicating the seller is not opted-in to the associated payment program.
     * @return a {@link PaymentsProgramStatus}
     */
    @jakarta.annotation.Nullable
    public PaymentsProgramStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the wasPreviouslyOptedIn property value. If returned as &lt;code&gt;true&lt;/code&gt;, the seller was at one point opted-in to the associated payment program, but they later opted out of the program. A value of &lt;code&gt;false&lt;/code&gt; indicates the seller never opted-in to the program or if they did opt-in to the program, they never opted-out of it.  &lt;br&gt;&lt;br&gt;It&apos;s important to note that the setting of this field does not indicate the seller&apos;s current status regarding the payment program. It is possible for this field to return &lt;code&gt;true&lt;/code&gt; while the &lt;b&gt;status&lt;/b&gt; field returns &lt;code&gt;OPTED_IN&lt;/code&gt;.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWasPreviouslyOptedIn() {
        return this.wasPreviouslyOptedIn;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("marketplaceId", this.getMarketplaceId());
        writer.writeEnumValue("paymentsProgramType", this.getPaymentsProgramType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeBooleanValue("wasPreviouslyOptedIn", this.getWasPreviouslyOptedIn());
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
     * Sets the marketplaceId property value. This enumerated type contains a list of the standard codes that represent each of the eBay marketplaces. | - **EBAY_AT**: eBay Austria (ebay.at) - **EBAY_AU**: eBay Australia (ebay.com/au) - **EBAY_BE**: eBay Belgium (ebay.com/sch/Belgium) - **EBAY_CA**: eBay Canada (English) (ebay.ca) - **EBAY_CH**: eBay Switzerland (ebay.ch) - **EBAY_CN**: eBay China (ebay.com/sch/China) - **EBAY_CZ**: eBay Czech Republic (ebay.com/sch/Czech-Republic) - **EBAY_DE**: eBay Germany (ebay.de) - **EBAY_DK**: eBay Denmark (ebay.com/sch/Denmark) - **EBAY_ES**: eBay Spain (ebay.es) - **EBAY_FI**: eBay Finland (ebay.com/sch/Finland) - **EBAY_FR**: eBay France (ebay.fr) - **EBAY_GB**: eBay UK (ebay.co.uk) - **EBAY_GR**: eBay Greece (ebay.com/sch/Greece) - **EBAY_HK**: eBay Hong Kong (ebay.com.hk) - **EBAY_HU**: eBay Hungary (ebay.com/sch/Hungary) - **EBAY_ID**: eBay Indonesia (id.ebay.com) - **EBAY_IE**: eBay Ireland (ebay.ie) - **EBAY_IL**: eBay Israel (ebay.com/sch/Israel) - **EBAY_IN**: eBay India (ebay.in)&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; eBay India is no longer a functioning eBay marketplace.&lt;/span&gt; - **EBAY_IT**: eBay Italy (ebay.it) - **EBAY_JP**: eBay Japan (ebay.co.jp) - **EBAY_MY**: eBay Malaysia (ebay.com/my) - **EBAY_NL**: eBay Netherlands (ebay.nl) - **EBAY_NO**: eBay Norway (ebay.com/sch/Norway) - **EBAY_NZ**: eBay New Zealand (ebay.com/sch/New-Zealand) - **EBAY_PE**: eBay Peru (ebay.com/sch/Peru) - **EBAY_PH**: eBay Philippines (ebay.ph) - **EBAY_PL**: eBay Poland (ebay.pl) - **EBAY_PR**: eBay Puerto Rico (ebay.com/sch/Puerto-Rico) - **EBAY_PT**: eBay Portugal (ebay.com/sch/Portugal) - **EBAY_RU**: eBay Russia (ebay.com/sch/Russia) - **EBAY_SE**: eBay Sweden (ebay.com/sch/Sweden) - **EBAY_SG**: eBay Singapore (ebay.com/sg) - **EBAY_TH**: eBay Thailand (export.ebay.co.th) - **EBAY_TW**: eBay Taiwan (ebay.com/tw) - **EBAY_US**: eBay US (ebay.com) - **EBAY_VN**: eBay Vietnam (ebay.vn) - **EBAY_ZA**: eBay South Africa (ebay.com/sch/South-Africa) - **EBAY_HALF_US**: This enumeration value is no longer applicable as the Half.com site no longer exists. - **EBAY_MOTORS_US**: eBay Motors US (ebay.com/motors)
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final MarketplaceIdEnum value) {
        this.marketplaceId = value;
    }
    /**
     * Sets the paymentsProgramType property value. This enumerated type defines the supported payment programs. | - **EBAY_PAYMENTS**: This value indicates the eBay-managed payments program.
     * @param value Value to set for the paymentsProgramType property.
     */
    public void setPaymentsProgramType(@jakarta.annotation.Nullable final PaymentsProgramType value) {
        this.paymentsProgramType = value;
    }
    /**
     * Sets the status property value. This enumerated type defines the different possible statuses relating to whether or not a seller is opted-in to a payments program. | - **OPTED_IN**: Status indicating the seller is opted-in to the associated payment program. - **NOT_OPTED_IN**: Status indicating the seller is not opted-in to the associated payment program.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final PaymentsProgramStatus value) {
        this.status = value;
    }
    /**
     * Sets the wasPreviouslyOptedIn property value. If returned as &lt;code&gt;true&lt;/code&gt;, the seller was at one point opted-in to the associated payment program, but they later opted out of the program. A value of &lt;code&gt;false&lt;/code&gt; indicates the seller never opted-in to the program or if they did opt-in to the program, they never opted-out of it.  &lt;br&gt;&lt;br&gt;It&apos;s important to note that the setting of this field does not indicate the seller&apos;s current status regarding the payment program. It is possible for this field to return &lt;code&gt;true&lt;/code&gt; while the &lt;b&gt;status&lt;/b&gt; field returns &lt;code&gt;OPTED_IN&lt;/code&gt;.
     * @param value Value to set for the wasPreviouslyOptedIn property.
     */
    public void setWasPreviouslyOptedIn(@jakarta.annotation.Nullable final Boolean value) {
        this.wasPreviouslyOptedIn = value;
    }
}
