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

package com.ebay.accountmanagement.generated.finances.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the &lt;b&gt;charge&lt;/b&gt; container, which is an array of one or more charges related to the transfer.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Charge implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of an order cancellation. This field is only applicable and returned if the charge is related to an order  cancellation.
     */
    private String cancellationId;
    /**
     * The unique identifier of a case filed against an order. This field is only applicable and returned if the charge is related to a case filed against an order.
     */
    private String caseId;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount chargeNetAmount;
    /**
     * The unique identifier of an Item Not Received (INR) inquiry filed against an order. This field is only applicable and returned if the charge is related to has an INR inquiry filed against the order.
     */
    private String inquiryId;
    /**
     * The unique identifier of the order that is associated with the charge.
     */
    private String orderId;
    /**
     * The unique identifier of a third-party payment dispute filed against an order. This occurs when the buyer files a dispute against the order with their payment provider, and then the dispute comes into eBay&apos;s system. This field is only applicable and returned if the charge is related to a third-party payment dispute filed against an order.
     */
    private String paymentDisputeId;
    /**
     * The unique identifier of a buyer refund associated with the charge.
     */
    private String refundId;
    /**
     * The unique identifier of an order return. This field is only applicable and returned if the charge is related to an order that was returned by the buyer.
     */
    private String returnId;
    /**
     * Instantiates a new {@link Charge} and sets the default values.
     */
    public Charge() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Charge}
     */
    @jakarta.annotation.Nonnull
    public static Charge createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Charge();
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
     * Gets the cancellationId property value. The unique identifier of an order cancellation. This field is only applicable and returned if the charge is related to an order  cancellation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCancellationId() {
        return this.cancellationId;
    }
    /**
     * Gets the caseId property value. The unique identifier of a case filed against an order. This field is only applicable and returned if the charge is related to a case filed against an order.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCaseId() {
        return this.caseId;
    }
    /**
     * Gets the chargeNetAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getChargeNetAmount() {
        return this.chargeNetAmount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("cancellationId", (n) -> { this.setCancellationId(n.getStringValue()); });
        deserializerMap.put("caseId", (n) -> { this.setCaseId(n.getStringValue()); });
        deserializerMap.put("chargeNetAmount", (n) -> { this.setChargeNetAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("inquiryId", (n) -> { this.setInquiryId(n.getStringValue()); });
        deserializerMap.put("orderId", (n) -> { this.setOrderId(n.getStringValue()); });
        deserializerMap.put("paymentDisputeId", (n) -> { this.setPaymentDisputeId(n.getStringValue()); });
        deserializerMap.put("refundId", (n) -> { this.setRefundId(n.getStringValue()); });
        deserializerMap.put("returnId", (n) -> { this.setReturnId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inquiryId property value. The unique identifier of an Item Not Received (INR) inquiry filed against an order. This field is only applicable and returned if the charge is related to has an INR inquiry filed against the order.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInquiryId() {
        return this.inquiryId;
    }
    /**
     * Gets the orderId property value. The unique identifier of the order that is associated with the charge.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Gets the paymentDisputeId property value. The unique identifier of a third-party payment dispute filed against an order. This occurs when the buyer files a dispute against the order with their payment provider, and then the dispute comes into eBay&apos;s system. This field is only applicable and returned if the charge is related to a third-party payment dispute filed against an order.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaymentDisputeId() {
        return this.paymentDisputeId;
    }
    /**
     * Gets the refundId property value. The unique identifier of a buyer refund associated with the charge.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRefundId() {
        return this.refundId;
    }
    /**
     * Gets the returnId property value. The unique identifier of an order return. This field is only applicable and returned if the charge is related to an order that was returned by the buyer.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReturnId() {
        return this.returnId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cancellationId", this.getCancellationId());
        writer.writeStringValue("caseId", this.getCaseId());
        writer.writeObjectValue("chargeNetAmount", this.getChargeNetAmount());
        writer.writeStringValue("inquiryId", this.getInquiryId());
        writer.writeStringValue("orderId", this.getOrderId());
        writer.writeStringValue("paymentDisputeId", this.getPaymentDisputeId());
        writer.writeStringValue("refundId", this.getRefundId());
        writer.writeStringValue("returnId", this.getReturnId());
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
     * Sets the cancellationId property value. The unique identifier of an order cancellation. This field is only applicable and returned if the charge is related to an order  cancellation.
     * @param value Value to set for the cancellationId property.
     */
    public void setCancellationId(@jakarta.annotation.Nullable final String value) {
        this.cancellationId = value;
    }
    /**
     * Sets the caseId property value. The unique identifier of a case filed against an order. This field is only applicable and returned if the charge is related to a case filed against an order.
     * @param value Value to set for the caseId property.
     */
    public void setCaseId(@jakarta.annotation.Nullable final String value) {
        this.caseId = value;
    }
    /**
     * Sets the chargeNetAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the chargeNetAmount property.
     */
    public void setChargeNetAmount(@jakarta.annotation.Nullable final Amount value) {
        this.chargeNetAmount = value;
    }
    /**
     * Sets the inquiryId property value. The unique identifier of an Item Not Received (INR) inquiry filed against an order. This field is only applicable and returned if the charge is related to has an INR inquiry filed against the order.
     * @param value Value to set for the inquiryId property.
     */
    public void setInquiryId(@jakarta.annotation.Nullable final String value) {
        this.inquiryId = value;
    }
    /**
     * Sets the orderId property value. The unique identifier of the order that is associated with the charge.
     * @param value Value to set for the orderId property.
     */
    public void setOrderId(@jakarta.annotation.Nullable final String value) {
        this.orderId = value;
    }
    /**
     * Sets the paymentDisputeId property value. The unique identifier of a third-party payment dispute filed against an order. This occurs when the buyer files a dispute against the order with their payment provider, and then the dispute comes into eBay&apos;s system. This field is only applicable and returned if the charge is related to a third-party payment dispute filed against an order.
     * @param value Value to set for the paymentDisputeId property.
     */
    public void setPaymentDisputeId(@jakarta.annotation.Nullable final String value) {
        this.paymentDisputeId = value;
    }
    /**
     * Sets the refundId property value. The unique identifier of a buyer refund associated with the charge.
     * @param value Value to set for the refundId property.
     */
    public void setRefundId(@jakarta.annotation.Nullable final String value) {
        this.refundId = value;
    }
    /**
     * Sets the returnId property value. The unique identifier of an order return. This field is only applicable and returned if the charge is related to an order that was returned by the buyer.
     * @param value Value to set for the returnId property.
     */
    public void setReturnId(@jakarta.annotation.Nullable final String value) {
        this.returnId = value;
    }
}
