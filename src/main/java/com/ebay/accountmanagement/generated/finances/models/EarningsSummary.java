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
 * This type defines a summarized view of earnings information derived from one order. It defines fields that provides a summarized view of earnings information derived from one order including aggregated financial values for gross amount, expenses, earnings, and refunds. 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EarningsSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type defines provides the total expenses associated with an order. Expenses represent cost components that reduce the seller&apos;s gross earnings and may include deductions such as marketplace fees, eBay shipping labels, and donations, applied during order processing.
     */
    private Expense expenses;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount grossAmount;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount orderEarnings;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount refunds;
    /**
     * Instantiates a new {@link EarningsSummary} and sets the default values.
     */
    public EarningsSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EarningsSummary}
     */
    @jakarta.annotation.Nonnull
    public static EarningsSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EarningsSummary();
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
     * Gets the expenses property value. This type defines provides the total expenses associated with an order. Expenses represent cost components that reduce the seller&apos;s gross earnings and may include deductions such as marketplace fees, eBay shipping labels, and donations, applied during order processing.
     * @return a {@link Expense}
     */
    @jakarta.annotation.Nullable
    public Expense getExpenses() {
        return this.expenses;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("expenses", (n) -> { this.setExpenses(n.getObjectValue(Expense::createFromDiscriminatorValue)); });
        deserializerMap.put("grossAmount", (n) -> { this.setGrossAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("orderEarnings", (n) -> { this.setOrderEarnings(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("refunds", (n) -> { this.setRefunds(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the grossAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getGrossAmount() {
        return this.grossAmount;
    }
    /**
     * Gets the orderEarnings property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getOrderEarnings() {
        return this.orderEarnings;
    }
    /**
     * Gets the refunds property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
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
     * Sets the expenses property value. This type defines provides the total expenses associated with an order. Expenses represent cost components that reduce the seller&apos;s gross earnings and may include deductions such as marketplace fees, eBay shipping labels, and donations, applied during order processing.
     * @param value Value to set for the expenses property.
     */
    public void setExpenses(@jakarta.annotation.Nullable final Expense value) {
        this.expenses = value;
    }
    /**
     * Sets the grossAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the grossAmount property.
     */
    public void setGrossAmount(@jakarta.annotation.Nullable final Amount value) {
        this.grossAmount = value;
    }
    /**
     * Sets the orderEarnings property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the orderEarnings property.
     */
    public void setOrderEarnings(@jakarta.annotation.Nullable final Amount value) {
        this.orderEarnings = value;
    }
    /**
     * Sets the refunds property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the refunds property.
     */
    public void setRefunds(@jakarta.annotation.Nullable final Amount value) {
        this.refunds = value;
    }
}
