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
 * This type is used by the &lt;b&gt;paymentMethods&lt;/b&gt; container, which is used by the seller to specify one or more offline payment methods. &lt;br&gt;&lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: eBay now controls all electronic payment methods available for a marketplace, so a seller will no longer use this type to specify any electronic payment methods.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentMethod implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: This array is no longer applicable and should not be used. eBay now controls all electronic payment methods available for a marketplace, and a seller never has to specify any electronic payment methods, including any credit card brands accepted. &lt;/span&gt;
     */
    private java.util.List<PaymentInstrumentBrandEnum> brands;
    /**
     * An enumeration type that defines the supported payment methods.&lt;br&gt;&lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: eBay manages all electronic payment methods that are available to buyers, so sellers only need to specify one or more offline payment methods for listings that support or require payment that occurs off of the eBay platform. All electronic payment method enum values are no longer applicable, and are marked as such. &lt;/span&gt; | - **CASH_IN_PERSON**: This enumeration value indicates that the payment method will be cash, and the transaction will occur in-person. - **CASH_ON_DELIVERY**: This enumeration value indicates that the payment method will be cash, and the transaction will occur after the item is delivered to the buyer. - **CASH_ON_PICKUP**: This enumeration value indicates that the payment method will be cash, and the transaction will occur when the buyer picks up the item. - **CASHIER_CHECK**: This enumeration value indicates that the payment method will be a Cashier Check. - **CREDIT_CARD**: This payment method is no longer valid. - **ESCROW**: This enumeration value indicates that escrow was used as the payment method to pay for the order. This form of payment is used for high-value orders. - **INTEGRATED_MERCHANT_CREDIT_CARD**: This payment method is no longer valid. - **LOAN_CHECK**: This payment method is no longer valid. - **MONEY_ORDER**: This enumeration value indicates that the payment method will be by a Money Order. - **PAISA_PAY**: This payment method is no longer valid. - **PAISA_PAY_ESCROW**: This payment method is no longer valid. - **PAISA_PAY_ESCROW_EMI**: This payment method is no longer valid. - **PAYPAL**: This payment method is no longer valid. - **PERSONAL_CHECK**: This enumeration value indicates that the payment method will be a Personal check. - **OTHER**: This enumeration value indicates that the seller is offering an offline payment method not otherwise covered.
     */
    private PaymentMethodTypeEnum paymentMethodType;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: This type is no longer applicable. eBay now controls all electronic payment methods available for a marketplace, and a seller never has to specify any electronic payment methods.&lt;/span&gt;
     */
    private RecipientAccountReference recipientAccountReference;
    /**
     * Instantiates a new {@link PaymentMethod} and sets the default values.
     */
    public PaymentMethod() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PaymentMethod}
     */
    @jakarta.annotation.Nonnull
    public static PaymentMethod createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaymentMethod();
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
     * Gets the brands property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: This array is no longer applicable and should not be used. eBay now controls all electronic payment methods available for a marketplace, and a seller never has to specify any electronic payment methods, including any credit card brands accepted. &lt;/span&gt;
     * @return a {@link java.util.List<PaymentInstrumentBrandEnum>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PaymentInstrumentBrandEnum> getBrands() {
        return this.brands;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("brands", (n) -> { this.setBrands(n.getCollectionOfEnumValues(PaymentInstrumentBrandEnum::forValue)); });
        deserializerMap.put("paymentMethodType", (n) -> { this.setPaymentMethodType(n.getEnumValue(PaymentMethodTypeEnum::forValue)); });
        deserializerMap.put("recipientAccountReference", (n) -> { this.setRecipientAccountReference(n.getObjectValue(RecipientAccountReference::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the paymentMethodType property value. An enumeration type that defines the supported payment methods.&lt;br&gt;&lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: eBay manages all electronic payment methods that are available to buyers, so sellers only need to specify one or more offline payment methods for listings that support or require payment that occurs off of the eBay platform. All electronic payment method enum values are no longer applicable, and are marked as such. &lt;/span&gt; | - **CASH_IN_PERSON**: This enumeration value indicates that the payment method will be cash, and the transaction will occur in-person. - **CASH_ON_DELIVERY**: This enumeration value indicates that the payment method will be cash, and the transaction will occur after the item is delivered to the buyer. - **CASH_ON_PICKUP**: This enumeration value indicates that the payment method will be cash, and the transaction will occur when the buyer picks up the item. - **CASHIER_CHECK**: This enumeration value indicates that the payment method will be a Cashier Check. - **CREDIT_CARD**: This payment method is no longer valid. - **ESCROW**: This enumeration value indicates that escrow was used as the payment method to pay for the order. This form of payment is used for high-value orders. - **INTEGRATED_MERCHANT_CREDIT_CARD**: This payment method is no longer valid. - **LOAN_CHECK**: This payment method is no longer valid. - **MONEY_ORDER**: This enumeration value indicates that the payment method will be by a Money Order. - **PAISA_PAY**: This payment method is no longer valid. - **PAISA_PAY_ESCROW**: This payment method is no longer valid. - **PAISA_PAY_ESCROW_EMI**: This payment method is no longer valid. - **PAYPAL**: This payment method is no longer valid. - **PERSONAL_CHECK**: This enumeration value indicates that the payment method will be a Personal check. - **OTHER**: This enumeration value indicates that the seller is offering an offline payment method not otherwise covered.
     * @return a {@link PaymentMethodTypeEnum}
     */
    @jakarta.annotation.Nullable
    public PaymentMethodTypeEnum getPaymentMethodType() {
        return this.paymentMethodType;
    }
    /**
     * Gets the recipientAccountReference property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: This type is no longer applicable. eBay now controls all electronic payment methods available for a marketplace, and a seller never has to specify any electronic payment methods.&lt;/span&gt;
     * @return a {@link RecipientAccountReference}
     */
    @jakarta.annotation.Nullable
    public RecipientAccountReference getRecipientAccountReference() {
        return this.recipientAccountReference;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfEnumValues("brands", this.getBrands());
        writer.writeEnumValue("paymentMethodType", this.getPaymentMethodType());
        writer.writeObjectValue("recipientAccountReference", this.getRecipientAccountReference());
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
     * Sets the brands property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: This array is no longer applicable and should not be used. eBay now controls all electronic payment methods available for a marketplace, and a seller never has to specify any electronic payment methods, including any credit card brands accepted. &lt;/span&gt;
     * @param value Value to set for the brands property.
     */
    public void setBrands(@jakarta.annotation.Nullable final java.util.List<PaymentInstrumentBrandEnum> value) {
        this.brands = value;
    }
    /**
     * Sets the paymentMethodType property value. An enumeration type that defines the supported payment methods.&lt;br&gt;&lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: eBay manages all electronic payment methods that are available to buyers, so sellers only need to specify one or more offline payment methods for listings that support or require payment that occurs off of the eBay platform. All electronic payment method enum values are no longer applicable, and are marked as such. &lt;/span&gt; | - **CASH_IN_PERSON**: This enumeration value indicates that the payment method will be cash, and the transaction will occur in-person. - **CASH_ON_DELIVERY**: This enumeration value indicates that the payment method will be cash, and the transaction will occur after the item is delivered to the buyer. - **CASH_ON_PICKUP**: This enumeration value indicates that the payment method will be cash, and the transaction will occur when the buyer picks up the item. - **CASHIER_CHECK**: This enumeration value indicates that the payment method will be a Cashier Check. - **CREDIT_CARD**: This payment method is no longer valid. - **ESCROW**: This enumeration value indicates that escrow was used as the payment method to pay for the order. This form of payment is used for high-value orders. - **INTEGRATED_MERCHANT_CREDIT_CARD**: This payment method is no longer valid. - **LOAN_CHECK**: This payment method is no longer valid. - **MONEY_ORDER**: This enumeration value indicates that the payment method will be by a Money Order. - **PAISA_PAY**: This payment method is no longer valid. - **PAISA_PAY_ESCROW**: This payment method is no longer valid. - **PAISA_PAY_ESCROW_EMI**: This payment method is no longer valid. - **PAYPAL**: This payment method is no longer valid. - **PERSONAL_CHECK**: This enumeration value indicates that the payment method will be a Personal check. - **OTHER**: This enumeration value indicates that the seller is offering an offline payment method not otherwise covered.
     * @param value Value to set for the paymentMethodType property.
     */
    public void setPaymentMethodType(@jakarta.annotation.Nullable final PaymentMethodTypeEnum value) {
        this.paymentMethodType = value;
    }
    /**
     * Sets the recipientAccountReference property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: This type is no longer applicable. eBay now controls all electronic payment methods available for a marketplace, and a seller never has to specify any electronic payment methods.&lt;/span&gt;
     * @param value Value to set for the recipientAccountReference property.
     */
    public void setRecipientAccountReference(@jakarta.annotation.Nullable final RecipientAccountReference value) {
        this.recipientAccountReference = value;
    }
}
