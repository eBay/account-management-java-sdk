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
 * This type is used to specify/indicate that an initial deposit is required for a motor vehicle listing.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Deposit implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This value indicates the initial deposit amount required from the buyer in order to purchase a motor vehicle. This value can be as high as $2,000.00 if immediate payment is not required, and up to $500.00 if immediate payment is required.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max&lt;/b&gt;: &lt;code&gt;2000.0&lt;/code&gt;
     */
    private Amount amount;
    /**
     * This value indicates the number of hours that the buyer has (after they commit to buy) to pay the initial deposit on a motor vehicle. Valid &lt;b&gt;dueIn&lt;/b&gt; times are 24, 48, and 72 hours. &lt;code&gt;HOUR&lt;/code&gt; is set as the &lt;b&gt;unit&lt;/b&gt; value, and &lt;code&gt;24&lt;/code&gt;, &lt;code&gt;48&lt;/code&gt; or &lt;code&gt;72&lt;/code&gt; are set in the &lt;b&gt;value&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: The &lt;b&gt;dueIn&lt;/b&gt; value is overridden if the seller has set the motor vehicle listing to require immediate payment. If the listing requires immediate payment, the buyer must pay the deposit immediately in order to be eligible to purchase the motor vehicle.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Minimum:&lt;/b&gt; 24 (hours)&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 72 (hours)&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 48 (hours)
     */
    private TimeDuration dueIn;
    /**
     * This array is no longer applicable and should not be used since eBay now manages the electronic payment options available to buyers to pay the deposit.
     */
    private java.util.List<PaymentMethod> paymentMethods;
    /**
     * Instantiates a new {@link Deposit} and sets the default values.
     */
    public Deposit() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Deposit}
     */
    @jakarta.annotation.Nonnull
    public static Deposit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Deposit();
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
     * Gets the amount property value. This value indicates the initial deposit amount required from the buyer in order to purchase a motor vehicle. This value can be as high as $2,000.00 if immediate payment is not required, and up to $500.00 if immediate payment is required.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max&lt;/b&gt;: &lt;code&gt;2000.0&lt;/code&gt;
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAmount() {
        return this.amount;
    }
    /**
     * Gets the dueIn property value. This value indicates the number of hours that the buyer has (after they commit to buy) to pay the initial deposit on a motor vehicle. Valid &lt;b&gt;dueIn&lt;/b&gt; times are 24, 48, and 72 hours. &lt;code&gt;HOUR&lt;/code&gt; is set as the &lt;b&gt;unit&lt;/b&gt; value, and &lt;code&gt;24&lt;/code&gt;, &lt;code&gt;48&lt;/code&gt; or &lt;code&gt;72&lt;/code&gt; are set in the &lt;b&gt;value&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: The &lt;b&gt;dueIn&lt;/b&gt; value is overridden if the seller has set the motor vehicle listing to require immediate payment. If the listing requires immediate payment, the buyer must pay the deposit immediately in order to be eligible to purchase the motor vehicle.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Minimum:&lt;/b&gt; 24 (hours)&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 72 (hours)&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 48 (hours)
     * @return a {@link TimeDuration}
     */
    @jakarta.annotation.Nullable
    public TimeDuration getDueIn() {
        return this.dueIn;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("dueIn", (n) -> { this.setDueIn(n.getObjectValue(TimeDuration::createFromDiscriminatorValue)); });
        deserializerMap.put("paymentMethods", (n) -> { this.setPaymentMethods(n.getCollectionOfObjectValues(PaymentMethod::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the paymentMethods property value. This array is no longer applicable and should not be used since eBay now manages the electronic payment options available to buyers to pay the deposit.
     * @return a {@link java.util.List<PaymentMethod>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeObjectValue("dueIn", this.getDueIn());
        writer.writeCollectionOfObjectValues("paymentMethods", this.getPaymentMethods());
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
     * Sets the amount property value. This value indicates the initial deposit amount required from the buyer in order to purchase a motor vehicle. This value can be as high as $2,000.00 if immediate payment is not required, and up to $500.00 if immediate payment is required.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max&lt;/b&gt;: &lt;code&gt;2000.0&lt;/code&gt;
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Amount value) {
        this.amount = value;
    }
    /**
     * Sets the dueIn property value. This value indicates the number of hours that the buyer has (after they commit to buy) to pay the initial deposit on a motor vehicle. Valid &lt;b&gt;dueIn&lt;/b&gt; times are 24, 48, and 72 hours. &lt;code&gt;HOUR&lt;/code&gt; is set as the &lt;b&gt;unit&lt;/b&gt; value, and &lt;code&gt;24&lt;/code&gt;, &lt;code&gt;48&lt;/code&gt; or &lt;code&gt;72&lt;/code&gt; are set in the &lt;b&gt;value&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: The &lt;b&gt;dueIn&lt;/b&gt; value is overridden if the seller has set the motor vehicle listing to require immediate payment. If the listing requires immediate payment, the buyer must pay the deposit immediately in order to be eligible to purchase the motor vehicle.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Minimum:&lt;/b&gt; 24 (hours)&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 72 (hours)&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 48 (hours)
     * @param value Value to set for the dueIn property.
     */
    public void setDueIn(@jakarta.annotation.Nullable final TimeDuration value) {
        this.dueIn = value;
    }
    /**
     * Sets the paymentMethods property value. This array is no longer applicable and should not be used since eBay now manages the electronic payment options available to buyers to pay the deposit.
     * @param value Value to set for the paymentMethods property.
     */
    public void setPaymentMethods(@jakarta.annotation.Nullable final java.util.List<PaymentMethod> value) {
        this.paymentMethods = value;
    }
}
