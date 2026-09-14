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
 * This type is used to express the details of one of the following monetary transactions: a buyer&apos;s payment for an order, a refund to the buyer for a returned item or cancelled order, or a credit issued by eBay to the seller&apos;s account.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Transaction implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container shows the dollar value and currency type of the monetary transaction. This field is always returned even when eBay has yet to initiate a payout for the order.
     */
    private Amount amount;
    /**
     * The enumeration value returned in this field indicates if the monetary transaction amount is a (&lt;code&gt;CREDIT&lt;/code&gt;) or a (&lt;code&gt;DEBIT&lt;/code&gt;) to the seller&apos;s account.
     */
    private BookingEntryEnum bookingEntry;
    /**
     * This is the unique eBay user ID for the buyer who purchased the order. This field is not returned for &lt;code&gt;TRANSFER&lt;/code&gt; monetary transaction types.
     */
    private Buyer buyer;
    /**
     * This is the amount of sales tax that has been collected by eBay for an order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales tax applies only to &lt;code&gt;SALE&lt;/code&gt; and &lt;code&gt;REFUND&lt;/code&gt; transactions (&lt;b&gt;transactionType&lt;/b&gt;).&lt;/span&gt;
     */
    private Amount eBayCollectedTaxAmount;
    /**
     * This container stores information about region-specific fees that are charged to sellers.
     */
    private FeeJurisdiction feeJurisdiction;
    /**
     * The enumeration value returned in this field indicates the type of fee that was deducted from the seller payout.
     */
    private FeeTypeEnum feeType;
    /**
     * The unique identifier of the eBay order associated with the monetary transaction.
     */
    private String orderId;
    /**
     * This array either shows the order line item transactional fees related to a &lt;code&gt;SALE&lt;/code&gt; transaction and deducted from the payout associated with that order, or it shows the transactional fee credits going back to the seller in the case of a &lt;code&gt;REFUND&lt;/code&gt; transaction.
     */
    private java.util.List<OrderLineItem> orderLineItems;
    /**
     * This string value indicates the entity that is processing the payment.
     */
    private String paymentsEntity;
    /**
     * This container provides the payout details for a split-payout case. This container is only returned for split-payout use cases.
     */
    private PayoutDetails payoutDetails;
    /**
     * The unique identifier of the seller payout associated with the monetary transaction.
     */
    private String payoutId;
    /**
     * This field contains reference information for the transaction fee. This includes an ID and the type of ID provided (such as item ID).
     */
    private java.util.List<Reference> references;
    /**
     * The Sales Record Number associated with a sales order. Sales Record Numbers are Selling Manager/Selling Manager Pro identifiers that are created at order checkout.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For all orders originating after February 1, 2020, a value of &lt;code&gt;0&lt;/code&gt; will be returned in this field. The Sales Record Number field has also been removed from Seller Hub. Instead of &lt;strong&gt;salesRecordReference&lt;/strong&gt;, depend on &lt;strong&gt;orderId&lt;/strong&gt; instead as the identifier of the order. The &lt;strong&gt;salesRecordReference&lt;/strong&gt; field has been scheduled for deprecation, and a date for when this field will no longer be returned at all will be announced soon.&lt;/span&gt;
     */
    private String salesRecordReference;
    /**
     * This array shows the tax type and amount applicable to the transaction. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, this array is only returned for tax charged against a purchased eBay shipping label.&lt;/span&gt;
     */
    private java.util.List<Tax> taxes;
    /**
     * This amount is the total amount of selling fees paid for order.
     */
    private Amount totalFeeAmount;
    /**
     * This amount is the total amount for the order before selling fees are deducted from the seller payout associated with the order.
     */
    private Amount totalFeeBasisAmount;
    /**
     * This timestamp indicates when the monetary transaction (order purchase, buyer refund, seller credit) occurred. The following (UTC) format is used: &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. For example, &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;.
     */
    private String transactionDate;
    /**
     * Sales tax collected by eBay, applicable only for SALE and REFUND.
     */
    private Amount transactionEbayCollectedTaxAmount;
    /**
     * This field, when combined with the &lt;a href=&quot;#response.transactions.transactionType&quot; &gt;transactionType&lt;/a&gt; field, provide a unique identifier of the monetary transaction.
     */
    private String transactionId;
    /**
     * This field applies to shipping label transactions, sales transactions where payout is on hold, and non-sale charge fees.
     */
    private String transactionMemo;
    /**
     * This enumeration value indicates the current status of the seller payout associated with the monetary transaction.
     */
    private TransactionStatusEnum transactionStatus;
    /**
     * This enumeration value indicates the type of monetary transaction.
     */
    private TransactionTypeEnum transactionType;
    /**
     * Instantiates a new {@link Transaction} and sets the default values.
     */
    public Transaction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Transaction}
     */
    @jakarta.annotation.Nonnull
    public static Transaction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Transaction();
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
     * Gets the amount property value. This container shows the dollar value and currency type of the monetary transaction. This field is always returned even when eBay has yet to initiate a payout for the order.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAmount() {
        return this.amount;
    }
    /**
     * Gets the bookingEntry property value. The enumeration value returned in this field indicates if the monetary transaction amount is a (&lt;code&gt;CREDIT&lt;/code&gt;) or a (&lt;code&gt;DEBIT&lt;/code&gt;) to the seller&apos;s account.
     * @return a {@link BookingEntryEnum}
     */
    @jakarta.annotation.Nullable
    public BookingEntryEnum getBookingEntry() {
        return this.bookingEntry;
    }
    /**
     * Gets the buyer property value. This is the unique eBay user ID for the buyer who purchased the order. This field is not returned for &lt;code&gt;TRANSFER&lt;/code&gt; monetary transaction types.
     * @return a {@link Buyer}
     */
    @jakarta.annotation.Nullable
    public Buyer getBuyer() {
        return this.buyer;
    }
    /**
     * Gets the eBayCollectedTaxAmount property value. This is the amount of sales tax that has been collected by eBay for an order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales tax applies only to &lt;code&gt;SALE&lt;/code&gt; and &lt;code&gt;REFUND&lt;/code&gt; transactions (&lt;b&gt;transactionType&lt;/b&gt;).&lt;/span&gt;
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getEBayCollectedTaxAmount() {
        return this.eBayCollectedTaxAmount;
    }
    /**
     * Gets the feeJurisdiction property value. This container stores information about region-specific fees that are charged to sellers.
     * @return a {@link FeeJurisdiction}
     */
    @jakarta.annotation.Nullable
    public FeeJurisdiction getFeeJurisdiction() {
        return this.feeJurisdiction;
    }
    /**
     * Gets the feeType property value. The enumeration value returned in this field indicates the type of fee that was deducted from the seller payout.
     * @return a {@link FeeTypeEnum}
     */
    @jakarta.annotation.Nullable
    public FeeTypeEnum getFeeType() {
        return this.feeType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(22);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("bookingEntry", (n) -> { this.setBookingEntry(n.getEnumValue(BookingEntryEnum::forValue)); });
        deserializerMap.put("buyer", (n) -> { this.setBuyer(n.getObjectValue(Buyer::createFromDiscriminatorValue)); });
        deserializerMap.put("eBayCollectedTaxAmount", (n) -> { this.setEBayCollectedTaxAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("feeJurisdiction", (n) -> { this.setFeeJurisdiction(n.getObjectValue(FeeJurisdiction::createFromDiscriminatorValue)); });
        deserializerMap.put("feeType", (n) -> { this.setFeeType(n.getEnumValue(FeeTypeEnum::forValue)); });
        deserializerMap.put("orderId", (n) -> { this.setOrderId(n.getStringValue()); });
        deserializerMap.put("orderLineItems", (n) -> { this.setOrderLineItems(n.getCollectionOfObjectValues(OrderLineItem::createFromDiscriminatorValue)); });
        deserializerMap.put("paymentsEntity", (n) -> { this.setPaymentsEntity(n.getStringValue()); });
        deserializerMap.put("payoutDetails", (n) -> { this.setPayoutDetails(n.getObjectValue(PayoutDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("payoutId", (n) -> { this.setPayoutId(n.getStringValue()); });
        deserializerMap.put("references", (n) -> { this.setReferences(n.getCollectionOfObjectValues(Reference::createFromDiscriminatorValue)); });
        deserializerMap.put("salesRecordReference", (n) -> { this.setSalesRecordReference(n.getStringValue()); });
        deserializerMap.put("taxes", (n) -> { this.setTaxes(n.getCollectionOfObjectValues(Tax::createFromDiscriminatorValue)); });
        deserializerMap.put("totalFeeAmount", (n) -> { this.setTotalFeeAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("totalFeeBasisAmount", (n) -> { this.setTotalFeeBasisAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("transactionDate", (n) -> { this.setTransactionDate(n.getStringValue()); });
        deserializerMap.put("ebayCollectedTaxAmount", (n) -> { this.setTransactionEbayCollectedTaxAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("transactionId", (n) -> { this.setTransactionId(n.getStringValue()); });
        deserializerMap.put("transactionMemo", (n) -> { this.setTransactionMemo(n.getStringValue()); });
        deserializerMap.put("transactionStatus", (n) -> { this.setTransactionStatus(n.getEnumValue(TransactionStatusEnum::forValue)); });
        deserializerMap.put("transactionType", (n) -> { this.setTransactionType(n.getEnumValue(TransactionTypeEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the orderId property value. The unique identifier of the eBay order associated with the monetary transaction.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Gets the orderLineItems property value. This array either shows the order line item transactional fees related to a &lt;code&gt;SALE&lt;/code&gt; transaction and deducted from the payout associated with that order, or it shows the transactional fee credits going back to the seller in the case of a &lt;code&gt;REFUND&lt;/code&gt; transaction.
     * @return a {@link java.util.List<OrderLineItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrderLineItem> getOrderLineItems() {
        return this.orderLineItems;
    }
    /**
     * Gets the paymentsEntity property value. This string value indicates the entity that is processing the payment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaymentsEntity() {
        return this.paymentsEntity;
    }
    /**
     * Gets the payoutDetails property value. This container provides the payout details for a split-payout case. This container is only returned for split-payout use cases.
     * @return a {@link PayoutDetails}
     */
    @jakarta.annotation.Nullable
    public PayoutDetails getPayoutDetails() {
        return this.payoutDetails;
    }
    /**
     * Gets the payoutId property value. The unique identifier of the seller payout associated with the monetary transaction.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPayoutId() {
        return this.payoutId;
    }
    /**
     * Gets the references property value. This field contains reference information for the transaction fee. This includes an ID and the type of ID provided (such as item ID).
     * @return a {@link java.util.List<Reference>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Reference> getReferences() {
        return this.references;
    }
    /**
     * Gets the salesRecordReference property value. The Sales Record Number associated with a sales order. Sales Record Numbers are Selling Manager/Selling Manager Pro identifiers that are created at order checkout.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For all orders originating after February 1, 2020, a value of &lt;code&gt;0&lt;/code&gt; will be returned in this field. The Sales Record Number field has also been removed from Seller Hub. Instead of &lt;strong&gt;salesRecordReference&lt;/strong&gt;, depend on &lt;strong&gt;orderId&lt;/strong&gt; instead as the identifier of the order. The &lt;strong&gt;salesRecordReference&lt;/strong&gt; field has been scheduled for deprecation, and a date for when this field will no longer be returned at all will be announced soon.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSalesRecordReference() {
        return this.salesRecordReference;
    }
    /**
     * Gets the taxes property value. This array shows the tax type and amount applicable to the transaction. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, this array is only returned for tax charged against a purchased eBay shipping label.&lt;/span&gt;
     * @return a {@link java.util.List<Tax>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Tax> getTaxes() {
        return this.taxes;
    }
    /**
     * Gets the totalFeeAmount property value. This amount is the total amount of selling fees paid for order.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTotalFeeAmount() {
        return this.totalFeeAmount;
    }
    /**
     * Gets the totalFeeBasisAmount property value. This amount is the total amount for the order before selling fees are deducted from the seller payout associated with the order.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTotalFeeBasisAmount() {
        return this.totalFeeBasisAmount;
    }
    /**
     * Gets the transactionDate property value. This timestamp indicates when the monetary transaction (order purchase, buyer refund, seller credit) occurred. The following (UTC) format is used: &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. For example, &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransactionDate() {
        return this.transactionDate;
    }
    /**
     * Gets the ebayCollectedTaxAmount property value. Sales tax collected by eBay, applicable only for SALE and REFUND.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTransactionEbayCollectedTaxAmount() {
        return this.transactionEbayCollectedTaxAmount;
    }
    /**
     * Gets the transactionId property value. This field, when combined with the &lt;a href=&quot;#response.transactions.transactionType&quot; &gt;transactionType&lt;/a&gt; field, provide a unique identifier of the monetary transaction.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransactionId() {
        return this.transactionId;
    }
    /**
     * Gets the transactionMemo property value. This field applies to shipping label transactions, sales transactions where payout is on hold, and non-sale charge fees.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransactionMemo() {
        return this.transactionMemo;
    }
    /**
     * Gets the transactionStatus property value. This enumeration value indicates the current status of the seller payout associated with the monetary transaction.
     * @return a {@link TransactionStatusEnum}
     */
    @jakarta.annotation.Nullable
    public TransactionStatusEnum getTransactionStatus() {
        return this.transactionStatus;
    }
    /**
     * Gets the transactionType property value. This enumeration value indicates the type of monetary transaction.
     * @return a {@link TransactionTypeEnum}
     */
    @jakarta.annotation.Nullable
    public TransactionTypeEnum getTransactionType() {
        return this.transactionType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeEnumValue("bookingEntry", this.getBookingEntry());
        writer.writeObjectValue("buyer", this.getBuyer());
        writer.writeObjectValue("eBayCollectedTaxAmount", this.getEBayCollectedTaxAmount());
        writer.writeObjectValue("feeJurisdiction", this.getFeeJurisdiction());
        writer.writeEnumValue("feeType", this.getFeeType());
        writer.writeStringValue("orderId", this.getOrderId());
        writer.writeCollectionOfObjectValues("orderLineItems", this.getOrderLineItems());
        writer.writeStringValue("paymentsEntity", this.getPaymentsEntity());
        writer.writeObjectValue("payoutDetails", this.getPayoutDetails());
        writer.writeStringValue("payoutId", this.getPayoutId());
        writer.writeCollectionOfObjectValues("references", this.getReferences());
        writer.writeStringValue("salesRecordReference", this.getSalesRecordReference());
        writer.writeCollectionOfObjectValues("taxes", this.getTaxes());
        writer.writeObjectValue("totalFeeAmount", this.getTotalFeeAmount());
        writer.writeObjectValue("totalFeeBasisAmount", this.getTotalFeeBasisAmount());
        writer.writeStringValue("transactionDate", this.getTransactionDate());
        writer.writeObjectValue("ebayCollectedTaxAmount", this.getTransactionEbayCollectedTaxAmount());
        writer.writeStringValue("transactionId", this.getTransactionId());
        writer.writeStringValue("transactionMemo", this.getTransactionMemo());
        writer.writeEnumValue("transactionStatus", this.getTransactionStatus());
        writer.writeEnumValue("transactionType", this.getTransactionType());
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
     * Sets the amount property value. This container shows the dollar value and currency type of the monetary transaction. This field is always returned even when eBay has yet to initiate a payout for the order.
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Amount value) {
        this.amount = value;
    }
    /**
     * Sets the bookingEntry property value. The enumeration value returned in this field indicates if the monetary transaction amount is a (&lt;code&gt;CREDIT&lt;/code&gt;) or a (&lt;code&gt;DEBIT&lt;/code&gt;) to the seller&apos;s account.
     * @param value Value to set for the bookingEntry property.
     */
    public void setBookingEntry(@jakarta.annotation.Nullable final BookingEntryEnum value) {
        this.bookingEntry = value;
    }
    /**
     * Sets the buyer property value. This is the unique eBay user ID for the buyer who purchased the order. This field is not returned for &lt;code&gt;TRANSFER&lt;/code&gt; monetary transaction types.
     * @param value Value to set for the buyer property.
     */
    public void setBuyer(@jakarta.annotation.Nullable final Buyer value) {
        this.buyer = value;
    }
    /**
     * Sets the eBayCollectedTaxAmount property value. This is the amount of sales tax that has been collected by eBay for an order.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales tax applies only to &lt;code&gt;SALE&lt;/code&gt; and &lt;code&gt;REFUND&lt;/code&gt; transactions (&lt;b&gt;transactionType&lt;/b&gt;).&lt;/span&gt;
     * @param value Value to set for the eBayCollectedTaxAmount property.
     */
    public void setEBayCollectedTaxAmount(@jakarta.annotation.Nullable final Amount value) {
        this.eBayCollectedTaxAmount = value;
    }
    /**
     * Sets the feeJurisdiction property value. This container stores information about region-specific fees that are charged to sellers.
     * @param value Value to set for the feeJurisdiction property.
     */
    public void setFeeJurisdiction(@jakarta.annotation.Nullable final FeeJurisdiction value) {
        this.feeJurisdiction = value;
    }
    /**
     * Sets the feeType property value. The enumeration value returned in this field indicates the type of fee that was deducted from the seller payout.
     * @param value Value to set for the feeType property.
     */
    public void setFeeType(@jakarta.annotation.Nullable final FeeTypeEnum value) {
        this.feeType = value;
    }
    /**
     * Sets the orderId property value. The unique identifier of the eBay order associated with the monetary transaction.
     * @param value Value to set for the orderId property.
     */
    public void setOrderId(@jakarta.annotation.Nullable final String value) {
        this.orderId = value;
    }
    /**
     * Sets the orderLineItems property value. This array either shows the order line item transactional fees related to a &lt;code&gt;SALE&lt;/code&gt; transaction and deducted from the payout associated with that order, or it shows the transactional fee credits going back to the seller in the case of a &lt;code&gt;REFUND&lt;/code&gt; transaction.
     * @param value Value to set for the orderLineItems property.
     */
    public void setOrderLineItems(@jakarta.annotation.Nullable final java.util.List<OrderLineItem> value) {
        this.orderLineItems = value;
    }
    /**
     * Sets the paymentsEntity property value. This string value indicates the entity that is processing the payment.
     * @param value Value to set for the paymentsEntity property.
     */
    public void setPaymentsEntity(@jakarta.annotation.Nullable final String value) {
        this.paymentsEntity = value;
    }
    /**
     * Sets the payoutDetails property value. This container provides the payout details for a split-payout case. This container is only returned for split-payout use cases.
     * @param value Value to set for the payoutDetails property.
     */
    public void setPayoutDetails(@jakarta.annotation.Nullable final PayoutDetails value) {
        this.payoutDetails = value;
    }
    /**
     * Sets the payoutId property value. The unique identifier of the seller payout associated with the monetary transaction.
     * @param value Value to set for the payoutId property.
     */
    public void setPayoutId(@jakarta.annotation.Nullable final String value) {
        this.payoutId = value;
    }
    /**
     * Sets the references property value. This field contains reference information for the transaction fee. This includes an ID and the type of ID provided (such as item ID).
     * @param value Value to set for the references property.
     */
    public void setReferences(@jakarta.annotation.Nullable final java.util.List<Reference> value) {
        this.references = value;
    }
    /**
     * Sets the salesRecordReference property value. The Sales Record Number associated with a sales order. Sales Record Numbers are Selling Manager/Selling Manager Pro identifiers that are created at order checkout.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For all orders originating after February 1, 2020, a value of &lt;code&gt;0&lt;/code&gt; will be returned in this field. The Sales Record Number field has also been removed from Seller Hub. Instead of &lt;strong&gt;salesRecordReference&lt;/strong&gt;, depend on &lt;strong&gt;orderId&lt;/strong&gt; instead as the identifier of the order. The &lt;strong&gt;salesRecordReference&lt;/strong&gt; field has been scheduled for deprecation, and a date for when this field will no longer be returned at all will be announced soon.&lt;/span&gt;
     * @param value Value to set for the salesRecordReference property.
     */
    public void setSalesRecordReference(@jakarta.annotation.Nullable final String value) {
        this.salesRecordReference = value;
    }
    /**
     * Sets the taxes property value. This array shows the tax type and amount applicable to the transaction. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, this array is only returned for tax charged against a purchased eBay shipping label.&lt;/span&gt;
     * @param value Value to set for the taxes property.
     */
    public void setTaxes(@jakarta.annotation.Nullable final java.util.List<Tax> value) {
        this.taxes = value;
    }
    /**
     * Sets the totalFeeAmount property value. This amount is the total amount of selling fees paid for order.
     * @param value Value to set for the totalFeeAmount property.
     */
    public void setTotalFeeAmount(@jakarta.annotation.Nullable final Amount value) {
        this.totalFeeAmount = value;
    }
    /**
     * Sets the totalFeeBasisAmount property value. This amount is the total amount for the order before selling fees are deducted from the seller payout associated with the order.
     * @param value Value to set for the totalFeeBasisAmount property.
     */
    public void setTotalFeeBasisAmount(@jakarta.annotation.Nullable final Amount value) {
        this.totalFeeBasisAmount = value;
    }
    /**
     * Sets the transactionDate property value. This timestamp indicates when the monetary transaction (order purchase, buyer refund, seller credit) occurred. The following (UTC) format is used: &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. For example, &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;.
     * @param value Value to set for the transactionDate property.
     */
    public void setTransactionDate(@jakarta.annotation.Nullable final String value) {
        this.transactionDate = value;
    }
    /**
     * Sets the ebayCollectedTaxAmount property value. Sales tax collected by eBay, applicable only for SALE and REFUND.
     * @param value Value to set for the ebayCollectedTaxAmount property.
     */
    public void setTransactionEbayCollectedTaxAmount(@jakarta.annotation.Nullable final Amount value) {
        this.transactionEbayCollectedTaxAmount = value;
    }
    /**
     * Sets the transactionId property value. This field, when combined with the &lt;a href=&quot;#response.transactions.transactionType&quot; &gt;transactionType&lt;/a&gt; field, provide a unique identifier of the monetary transaction.
     * @param value Value to set for the transactionId property.
     */
    public void setTransactionId(@jakarta.annotation.Nullable final String value) {
        this.transactionId = value;
    }
    /**
     * Sets the transactionMemo property value. This field applies to shipping label transactions, sales transactions where payout is on hold, and non-sale charge fees.
     * @param value Value to set for the transactionMemo property.
     */
    public void setTransactionMemo(@jakarta.annotation.Nullable final String value) {
        this.transactionMemo = value;
    }
    /**
     * Sets the transactionStatus property value. This enumeration value indicates the current status of the seller payout associated with the monetary transaction.
     * @param value Value to set for the transactionStatus property.
     */
    public void setTransactionStatus(@jakarta.annotation.Nullable final TransactionStatusEnum value) {
        this.transactionStatus = value;
    }
    /**
     * Sets the transactionType property value. This enumeration value indicates the type of monetary transaction.
     * @param value Value to set for the transactionType property.
     */
    public void setTransactionType(@jakarta.annotation.Nullable final TransactionTypeEnum value) {
        this.transactionType = value;
    }
}
