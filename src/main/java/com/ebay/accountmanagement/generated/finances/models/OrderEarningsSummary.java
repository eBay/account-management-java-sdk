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
 * The base response type for the &lt;b&gt;getOrderEarningsSummary&lt;/b&gt; method, which includes aggregate order earnings, expenses, gross amount, and order count for orders created within the date range and included in the summary.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrderEarningsSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The aggregate amount of expenses for all orders included in the summary.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Expenses are always in the seller&apos;s payout currency. Conversion-related fields (such as &lt;b&gt;exchangeRate&lt;/b&gt;) in this container do not apply to the &lt;b&gt;order_earnings&lt;/b&gt; resource.&lt;/span&gt;&lt;/p&gt;
     */
    private Amount expenses;
    /**
     * The aggregate gross amount for all orders included in the order earnings summary. This amount equals the item subtotal plus shipping and handling, and any seller-collected taxes paid by the buyer, minus any seller-offered discount.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Gross amount is always in the seller&apos;s payout currency. Conversion-related fields (such as &lt;b&gt;exchangeRate&lt;/b&gt;) in this container do not apply to the &lt;b&gt;order_earnings&lt;/b&gt; resource.&lt;/span&gt;&lt;/p&gt;
     */
    private Amount grossAmount;
    /**
     * The total number of orders included in the summary.
     */
    private Long orderCount;
    /**
     * The aggregate earnings amount for all orders included in the summary, which includes the amount of order earnings after deducting expenses and any refunds from the gross amount.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Order earnings are always in the seller&apos;s payout currency. Conversion-related fields (such as &lt;b&gt;exchangeRate&lt;/b&gt;) in this container do not apply to the &lt;b&gt;order_earnings&lt;/b&gt; resource.&lt;/span&gt;&lt;/p&gt;
     */
    private Amount orderEarnings;
    /**
     * The aggregate amount of all refunds issued for the orders included in the summary.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Refunds include gross refunds, gross claims, and gross payment disputes.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Refunds are always in the seller&apos;s payout currency. Conversion-related fields (such as &lt;b&gt;exchangeRate&lt;/b&gt;) in this container do not apply to the &lt;b&gt;order_earnings&lt;/b&gt; resource.&lt;/span&gt;&lt;/p&gt;
     */
    private Amount refunds;
    /**
     * Instantiates a new {@link OrderEarningsSummary} and sets the default values.
     */
    public OrderEarningsSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrderEarningsSummary}
     */
    @jakarta.annotation.Nonnull
    public static OrderEarningsSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrderEarningsSummary();
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
     * Gets the expenses property value. The aggregate amount of expenses for all orders included in the summary.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Expenses are always in the seller&apos;s payout currency. Conversion-related fields (such as &lt;b&gt;exchangeRate&lt;/b&gt;) in this container do not apply to the &lt;b&gt;order_earnings&lt;/b&gt; resource.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getExpenses() {
        return this.expenses;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("expenses", (n) -> { this.setExpenses(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("grossAmount", (n) -> { this.setGrossAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("orderCount", (n) -> { this.setOrderCount(n.getLongValue()); });
        deserializerMap.put("orderEarnings", (n) -> { this.setOrderEarnings(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("refunds", (n) -> { this.setRefunds(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the grossAmount property value. The aggregate gross amount for all orders included in the order earnings summary. This amount equals the item subtotal plus shipping and handling, and any seller-collected taxes paid by the buyer, minus any seller-offered discount.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Gross amount is always in the seller&apos;s payout currency. Conversion-related fields (such as &lt;b&gt;exchangeRate&lt;/b&gt;) in this container do not apply to the &lt;b&gt;order_earnings&lt;/b&gt; resource.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getGrossAmount() {
        return this.grossAmount;
    }
    /**
     * Gets the orderCount property value. The total number of orders included in the summary.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getOrderCount() {
        return this.orderCount;
    }
    /**
     * Gets the orderEarnings property value. The aggregate earnings amount for all orders included in the summary, which includes the amount of order earnings after deducting expenses and any refunds from the gross amount.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Order earnings are always in the seller&apos;s payout currency. Conversion-related fields (such as &lt;b&gt;exchangeRate&lt;/b&gt;) in this container do not apply to the &lt;b&gt;order_earnings&lt;/b&gt; resource.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getOrderEarnings() {
        return this.orderEarnings;
    }
    /**
     * Gets the refunds property value. The aggregate amount of all refunds issued for the orders included in the summary.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Refunds include gross refunds, gross claims, and gross payment disputes.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Refunds are always in the seller&apos;s payout currency. Conversion-related fields (such as &lt;b&gt;exchangeRate&lt;/b&gt;) in this container do not apply to the &lt;b&gt;order_earnings&lt;/b&gt; resource.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getRefunds() {
        return this.refunds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("expenses", this.getExpenses());
        writer.writeObjectValue("grossAmount", this.getGrossAmount());
        writer.writeLongValue("orderCount", this.getOrderCount());
        writer.writeObjectValue("orderEarnings", this.getOrderEarnings());
        writer.writeObjectValue("refunds", this.getRefunds());
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
     * Sets the expenses property value. The aggregate amount of expenses for all orders included in the summary.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Expenses are always in the seller&apos;s payout currency. Conversion-related fields (such as &lt;b&gt;exchangeRate&lt;/b&gt;) in this container do not apply to the &lt;b&gt;order_earnings&lt;/b&gt; resource.&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the expenses property.
     */
    public void setExpenses(@jakarta.annotation.Nullable final Amount value) {
        this.expenses = value;
    }
    /**
     * Sets the grossAmount property value. The aggregate gross amount for all orders included in the order earnings summary. This amount equals the item subtotal plus shipping and handling, and any seller-collected taxes paid by the buyer, minus any seller-offered discount.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Gross amount is always in the seller&apos;s payout currency. Conversion-related fields (such as &lt;b&gt;exchangeRate&lt;/b&gt;) in this container do not apply to the &lt;b&gt;order_earnings&lt;/b&gt; resource.&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the grossAmount property.
     */
    public void setGrossAmount(@jakarta.annotation.Nullable final Amount value) {
        this.grossAmount = value;
    }
    /**
     * Sets the orderCount property value. The total number of orders included in the summary.
     * @param value Value to set for the orderCount property.
     */
    public void setOrderCount(@jakarta.annotation.Nullable final Long value) {
        this.orderCount = value;
    }
    /**
     * Sets the orderEarnings property value. The aggregate earnings amount for all orders included in the summary, which includes the amount of order earnings after deducting expenses and any refunds from the gross amount.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Order earnings are always in the seller&apos;s payout currency. Conversion-related fields (such as &lt;b&gt;exchangeRate&lt;/b&gt;) in this container do not apply to the &lt;b&gt;order_earnings&lt;/b&gt; resource.&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the orderEarnings property.
     */
    public void setOrderEarnings(@jakarta.annotation.Nullable final Amount value) {
        this.orderEarnings = value;
    }
    /**
     * Sets the refunds property value. The aggregate amount of all refunds issued for the orders included in the summary.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Refunds include gross refunds, gross claims, and gross payment disputes.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Refunds are always in the seller&apos;s payout currency. Conversion-related fields (such as &lt;b&gt;exchangeRate&lt;/b&gt;) in this container do not apply to the &lt;b&gt;order_earnings&lt;/b&gt; resource.&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the refunds property.
     */
    public void setRefunds(@jakarta.annotation.Nullable final Amount value) {
        this.refunds = value;
    }
}
