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
    private java.util.List<String> brands;
    /**
     * This array is only applicable for listings supporting offline payment methods. See the &lt;b&gt;PaymentMethodTypeEnum&lt;/b&gt; type for supported offline payment method enum values. If offline payments are enabled for the policy, provide at least one offline payment method.&lt;/p&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:PaymentMethodTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String paymentMethodType;
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
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBrands() {
        return this.brands;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("brands", (n) -> { this.setBrands(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("paymentMethodType", (n) -> { this.setPaymentMethodType(n.getStringValue()); });
        deserializerMap.put("recipientAccountReference", (n) -> { this.setRecipientAccountReference(n.getObjectValue(RecipientAccountReference::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the paymentMethodType property value. This array is only applicable for listings supporting offline payment methods. See the &lt;b&gt;PaymentMethodTypeEnum&lt;/b&gt; type for supported offline payment method enum values. If offline payments are enabled for the policy, provide at least one offline payment method.&lt;/p&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:PaymentMethodTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaymentMethodType() {
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
        writer.writeCollectionOfPrimitiveValues("brands", this.getBrands());
        writer.writeStringValue("paymentMethodType", this.getPaymentMethodType());
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
    public void setBrands(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.brands = value;
    }
    /**
     * Sets the paymentMethodType property value. This array is only applicable for listings supporting offline payment methods. See the &lt;b&gt;PaymentMethodTypeEnum&lt;/b&gt; type for supported offline payment method enum values. If offline payments are enabled for the policy, provide at least one offline payment method.&lt;/p&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:PaymentMethodTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the paymentMethodType property.
     */
    public void setPaymentMethodType(@jakarta.annotation.Nullable final String value) {
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
