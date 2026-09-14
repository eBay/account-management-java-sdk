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
     * The ID of the eBay marketplace to which the payment program applies. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String marketplaceId;
    /**
     * This parameter specifies the payment program whose status is returned by the call.  &lt;br&gt;&lt;br&gt;Currently the only supported payments program is &lt;code&gt;EBAY_PAYMENTS&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramType&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String paymentsProgramType;
    /**
     * The enumeration value returned in this field indicates whether or not the seller&apos;s account is enabled for the payments program. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramStatus&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String status;
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
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getStringValue()); });
        deserializerMap.put("paymentsProgramType", (n) -> { this.setPaymentsProgramType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("wasPreviouslyOptedIn", (n) -> { this.setWasPreviouslyOptedIn(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the marketplaceId property value. The ID of the eBay marketplace to which the payment program applies. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Gets the paymentsProgramType property value. This parameter specifies the payment program whose status is returned by the call.  &lt;br&gt;&lt;br&gt;Currently the only supported payments program is &lt;code&gt;EBAY_PAYMENTS&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramType&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaymentsProgramType() {
        return this.paymentsProgramType;
    }
    /**
     * Gets the status property value. The enumeration value returned in this field indicates whether or not the seller&apos;s account is enabled for the payments program. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramStatus&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
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
        writer.writeStringValue("marketplaceId", this.getMarketplaceId());
        writer.writeStringValue("paymentsProgramType", this.getPaymentsProgramType());
        writer.writeStringValue("status", this.getStatus());
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
     * Sets the marketplaceId property value. The ID of the eBay marketplace to which the payment program applies. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final String value) {
        this.marketplaceId = value;
    }
    /**
     * Sets the paymentsProgramType property value. This parameter specifies the payment program whose status is returned by the call.  &lt;br&gt;&lt;br&gt;Currently the only supported payments program is &lt;code&gt;EBAY_PAYMENTS&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramType&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the paymentsProgramType property.
     */
    public void setPaymentsProgramType(@jakarta.annotation.Nullable final String value) {
        this.paymentsProgramType = value;
    }
    /**
     * Sets the status property value. The enumeration value returned in this field indicates whether or not the seller&apos;s account is enabled for the payments program. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramStatus&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
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
