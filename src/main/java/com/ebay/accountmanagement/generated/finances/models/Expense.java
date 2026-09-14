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
 * This type defines provides the total expenses associated with an order. Expenses represent cost components that reduce the seller&apos;s gross earnings and may include deductions such as marketplace fees, eBay shipping labels, and donations, applied during order processing.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Expense implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field shows the three-letter currency code that represents the currency used for all of the order expenses.
     */
    private CurrencyCodeEnum currency;
    /**
     * This array shows the amount(s) of one or more donations that are submitted to eBay charity organizations for one or more orders. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Donations are always tied to specific items. When an item is listed with a charity contribution (for example, 10%), the donation is calculated per item at the time of sale. Order earnings factor in only the items within the order that are eligible for donation.&lt;/span&gt;&lt;/p&gt;
     */
    private java.util.List<OrderEarningFee> donations;
    /**
     * This array shows the type and amount(s) of marketplace fees that were charged against one or more orders.
     */
    private java.util.List<OrderEarningFee> marketplaceFees;
    /**
     * This container shows the total amount paid by the seller for eBay shipping labels for one or more orders.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Charges and credits for shipping labels purchased with non-eBay payment methods (for example, PayPal) are excluded from the order earnings calculation.&lt;/span&gt;&lt;/p&gt;
     */
    private Amount shippingLabels;
    /**
     * This field shows the total expenses including charges and credits associated for one or more orders based on the order creation time period chosen.
     */
    private String value;
    /**
     * Instantiates a new {@link Expense} and sets the default values.
     */
    public Expense() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Expense}
     */
    @jakarta.annotation.Nonnull
    public static Expense createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Expense();
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
     * Gets the currency property value. This field shows the three-letter currency code that represents the currency used for all of the order expenses.
     * @return a {@link CurrencyCodeEnum}
     */
    @jakarta.annotation.Nullable
    public CurrencyCodeEnum getCurrency() {
        return this.currency;
    }
    /**
     * Gets the donations property value. This array shows the amount(s) of one or more donations that are submitted to eBay charity organizations for one or more orders. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Donations are always tied to specific items. When an item is listed with a charity contribution (for example, 10%), the donation is calculated per item at the time of sale. Order earnings factor in only the items within the order that are eligible for donation.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link java.util.List<OrderEarningFee>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrderEarningFee> getDonations() {
        return this.donations;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getEnumValue(CurrencyCodeEnum::forValue)); });
        deserializerMap.put("donations", (n) -> { this.setDonations(n.getCollectionOfObjectValues(OrderEarningFee::createFromDiscriminatorValue)); });
        deserializerMap.put("marketplaceFees", (n) -> { this.setMarketplaceFees(n.getCollectionOfObjectValues(OrderEarningFee::createFromDiscriminatorValue)); });
        deserializerMap.put("shippingLabels", (n) -> { this.setShippingLabels(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the marketplaceFees property value. This array shows the type and amount(s) of marketplace fees that were charged against one or more orders.
     * @return a {@link java.util.List<OrderEarningFee>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrderEarningFee> getMarketplaceFees() {
        return this.marketplaceFees;
    }
    /**
     * Gets the shippingLabels property value. This container shows the total amount paid by the seller for eBay shipping labels for one or more orders.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Charges and credits for shipping labels purchased with non-eBay payment methods (for example, PayPal) are excluded from the order earnings calculation.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getShippingLabels() {
        return this.shippingLabels;
    }
    /**
     * Gets the value property value. This field shows the total expenses including charges and credits associated for one or more orders based on the order creation time period chosen.
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
        writer.writeCollectionOfObjectValues("donations", this.getDonations());
        writer.writeCollectionOfObjectValues("marketplaceFees", this.getMarketplaceFees());
        writer.writeObjectValue("shippingLabels", this.getShippingLabels());
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
     * Sets the currency property value. This field shows the three-letter currency code that represents the currency used for all of the order expenses.
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final CurrencyCodeEnum value) {
        this.currency = value;
    }
    /**
     * Sets the donations property value. This array shows the amount(s) of one or more donations that are submitted to eBay charity organizations for one or more orders. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Donations are always tied to specific items. When an item is listed with a charity contribution (for example, 10%), the donation is calculated per item at the time of sale. Order earnings factor in only the items within the order that are eligible for donation.&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the donations property.
     */
    public void setDonations(@jakarta.annotation.Nullable final java.util.List<OrderEarningFee> value) {
        this.donations = value;
    }
    /**
     * Sets the marketplaceFees property value. This array shows the type and amount(s) of marketplace fees that were charged against one or more orders.
     * @param value Value to set for the marketplaceFees property.
     */
    public void setMarketplaceFees(@jakarta.annotation.Nullable final java.util.List<OrderEarningFee> value) {
        this.marketplaceFees = value;
    }
    /**
     * Sets the shippingLabels property value. This container shows the total amount paid by the seller for eBay shipping labels for one or more orders.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Charges and credits for shipping labels purchased with non-eBay payment methods (for example, PayPal) are excluded from the order earnings calculation.&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the shippingLabels property.
     */
    public void setShippingLabels(@jakarta.annotation.Nullable final Amount value) {
        this.shippingLabels = value;
    }
    /**
     * Sets the value property value. This field shows the total expenses including charges and credits associated for one or more orders based on the order creation time period chosen.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
