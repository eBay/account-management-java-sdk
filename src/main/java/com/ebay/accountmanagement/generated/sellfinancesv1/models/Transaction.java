package com.ebay.accountmanagement.generated.sellfinancesv1.models;

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
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount amount;
    /**
     * The enumeration value returned in this field indicates if the monetary transaction amount is a (&lt;code&gt;CREDIT&lt;/code&gt;) or a (&lt;code&gt;DEBIT&lt;/code&gt;) to the seller&apos;s account. Typically, the &lt;code&gt;SALE&lt;/code&gt; and &lt;code&gt;CREDIT&lt;/code&gt; transaction types are credits to the seller&apos;s account, and the &lt;code&gt;REFUND&lt;/code&gt;, &lt;code&gt;DISPUTE&lt;/code&gt;, &lt;code&gt;SHIPPING_LABEL&lt;/code&gt;, and &lt;code&gt;TRANSFER&lt;/code&gt; transaction types are debits to the seller&apos;s account. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String bookingEntry;
    /**
     * This type is used to express details about the buyer associated with an order. At this time, the only field in this type is the eBay user ID of the buyer, but more fields may get added at a later date.
     */
    private Buyer buyer;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount eBayCollectedTaxAmount;
    /**
     * This type defines the jurisdiction information associated with a fee, identifying the geographic or regulatory region under which the fee is applied.
     */
    private FeeJurisdiction feeJurisdiction;
    /**
     * The enumeration value returned in this field indicates the type of fee that was deducted from the seller payout. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/api:FeeTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String feeType;
    /**
     * The unique identifier of the eBay order associated with the monetary transaction.
     */
    private String orderId;
    /**
     * This array either shows the order line item transactional fees related to a &lt;code&gt;SALE&lt;/code&gt; transaction and deducted from the payout associated with that order, or it shows the transactional fee credits going back to the seller in the case of a &lt;code&gt;REFUND&lt;/code&gt; transaction.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; In certain circumstances, transactional fees like &lt;code&gt;FINAL_VALUE_FEE&lt;/code&gt; and &lt;code&gt;FINAL_VALUE_FEE_FIXED_PER_ORDER&lt;/code&gt; are not deducted from a seller payout, but instead they are billed to the seller&apos;s account as &quot;non-sale charges&quot;. When this happens, the &lt;code&gt;SALE&lt;/code&gt; transaction entity will not have these fees under the &lt;b&gt;orderLineItems&lt;/b&gt; array, but they will appear as separate &lt;code&gt;NON_SALE_CHARGE&lt;/code&gt; transactions. When this happens, and you want to see those transactional fees for the order, one thing you can do is make another call to &lt;b&gt;getTransactions&lt;/b&gt; and filter against the &lt;b&gt;orderId&lt;/b&gt;. In the response, you will see the &lt;code&gt;SALE&lt;/code&gt; transaction and the &lt;code&gt;NON_SALE_CHARGE&lt;/code&gt; transactions applied against the order. See &lt;a href=&quot;/api-docs/sell/finances/resources/transaction/methods/getTransactions#s0-1-28-4-7-5-6-Gettransactionalfeesforanorder-5&quot; &gt;Sample 6: Get transactional fees for an order&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/finances/resources/transaction/methods/getTransactions#s0-1-28-4-7-5-6-Getnon-salechargesforanorder-9&quot;&gt;Sample 10: Get non-sale charges for an order&lt;/a&gt; for examples.
     */
    private java.util.List<OrderLineItem> orderLineItems;
    /**
     * This string value indicates the entity that is processing the payment.
     */
    private String paymentsEntity;
    /**
     * This type provide payout details for a split-payout case. This type is only applicable for split payouts.
     */
    private PayoutDetails payoutDetails;
    /**
     * The unique identifier of the seller payout associated with the monetary transaction. This identifier is generated once eBay begins processing the payout for the corresponding order. This field will not be returned if eBay has not yet begun processing the payout for an order.&lt;br&gt;&lt;br&gt;This value can be used by the &lt;b&gt;filter&lt;/b&gt; query parameter to get monetary transactions associated with the true(actual) payout associated with the &lt;b&gt;PayoutId&lt;/b&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In case of a split payout, always pick the first true(actual) payout id.&lt;/span&gt; 
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
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount totalFeeAmount;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount totalFeeBasisAmount;
    /**
     * This timestamp indicates when the monetary transaction (order purchase, buyer refund, seller credit) occurred. The following (UTC) format is used: &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. For example, &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;.
     */
    private String transactionDate;
    /**
     * This field, when combined with the &lt;a href=&quot;#response.transactions.transactionType&quot; &gt;transactionType&lt;/a&gt; field, provide a unique identifier of the monetary transaction. A monetary transaction can be a sales order, an order refund to the buyer, a credit to the seller&apos;s account, a debit to the seller for the purchase of a shipping label, or a transaction where eBay recouped money from the seller if the seller lost a buyer-initiated payment dispute.
     */
    private String transactionId;
    /**
     * This field applies to shipping label transactions, sales transactions where payout is on hold, and non-sale charge fees. The following are examples of how the field is used for each transaction type:&lt;ul&gt;&lt;li&gt;&lt;b&gt;Shipping label purchase&lt;/b&gt;: the &lt;b&gt;transactionMemo&lt;/b&gt; field gives details about a purchase, a refund, or a price adjustment to the cost of the shipping label.&lt;/li&gt;&lt;li&gt;&lt;b&gt;Sales transactions with funds on hold&lt;/b&gt;: the &lt;b&gt;transactionMemo&lt;/b&gt; field provides information on the reason for the hold or when the hold will be released (e.g., &quot;Funds on hold. Estimated release on Jun 1&quot;).&lt;/li&gt;&lt;li&gt;&lt;b&gt;Non-sale charge fees&lt;/b&gt;: the &lt;b&gt;transactionMemo&lt;/b&gt; field will provide the type of fee that was charged, such as Promoted Offsite Fee.&lt;/li&gt;&lt;/ul&gt;This field is only returned if applicable/available.
     */
    private String transactionMemo;
    /**
     * This enumeration value indicates the current status of the seller payout associated with the monetary transaction. See the &lt;code&gt;TransactionStatusEnum&lt;/code&gt; type for more information on the different states. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:TransactionStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String transactionStatus;
    /**
     * This enumeration value indicates the type of monetary transaction. Examples of monetary transactions include a buyer&apos;s payment for an order, a refund to the buyer for a returned item or cancelled order, or a credit issued by eBay to the seller&apos;s account. For a complete list of monetary transaction types within the &lt;strong&gt;Finances API&lt;/strong&gt;, see the &lt;a href=&quot;/api-docs/sell/finances/types/pay:TransactionTypeEnum&quot;&gt;TransactionTypeEnum&lt;/a&gt; type. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:TransactionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String transactionType;
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
     * Gets the amount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAmount() {
        return this.amount;
    }
    /**
     * Gets the bookingEntry property value. The enumeration value returned in this field indicates if the monetary transaction amount is a (&lt;code&gt;CREDIT&lt;/code&gt;) or a (&lt;code&gt;DEBIT&lt;/code&gt;) to the seller&apos;s account. Typically, the &lt;code&gt;SALE&lt;/code&gt; and &lt;code&gt;CREDIT&lt;/code&gt; transaction types are credits to the seller&apos;s account, and the &lt;code&gt;REFUND&lt;/code&gt;, &lt;code&gt;DISPUTE&lt;/code&gt;, &lt;code&gt;SHIPPING_LABEL&lt;/code&gt;, and &lt;code&gt;TRANSFER&lt;/code&gt; transaction types are debits to the seller&apos;s account. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBookingEntry() {
        return this.bookingEntry;
    }
    /**
     * Gets the buyer property value. This type is used to express details about the buyer associated with an order. At this time, the only field in this type is the eBay user ID of the buyer, but more fields may get added at a later date.
     * @return a {@link Buyer}
     */
    @jakarta.annotation.Nullable
    public Buyer getBuyer() {
        return this.buyer;
    }
    /**
     * Gets the eBayCollectedTaxAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getEBayCollectedTaxAmount() {
        return this.eBayCollectedTaxAmount;
    }
    /**
     * Gets the feeJurisdiction property value. This type defines the jurisdiction information associated with a fee, identifying the geographic or regulatory region under which the fee is applied.
     * @return a {@link FeeJurisdiction}
     */
    @jakarta.annotation.Nullable
    public FeeJurisdiction getFeeJurisdiction() {
        return this.feeJurisdiction;
    }
    /**
     * Gets the feeType property value. The enumeration value returned in this field indicates the type of fee that was deducted from the seller payout. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/api:FeeTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeeType() {
        return this.feeType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(21);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("bookingEntry", (n) -> { this.setBookingEntry(n.getStringValue()); });
        deserializerMap.put("buyer", (n) -> { this.setBuyer(n.getObjectValue(Buyer::createFromDiscriminatorValue)); });
        deserializerMap.put("eBayCollectedTaxAmount", (n) -> { this.setEBayCollectedTaxAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("feeJurisdiction", (n) -> { this.setFeeJurisdiction(n.getObjectValue(FeeJurisdiction::createFromDiscriminatorValue)); });
        deserializerMap.put("feeType", (n) -> { this.setFeeType(n.getStringValue()); });
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
        deserializerMap.put("transactionId", (n) -> { this.setTransactionId(n.getStringValue()); });
        deserializerMap.put("transactionMemo", (n) -> { this.setTransactionMemo(n.getStringValue()); });
        deserializerMap.put("transactionStatus", (n) -> { this.setTransactionStatus(n.getStringValue()); });
        deserializerMap.put("transactionType", (n) -> { this.setTransactionType(n.getStringValue()); });
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
     * Gets the orderLineItems property value. This array either shows the order line item transactional fees related to a &lt;code&gt;SALE&lt;/code&gt; transaction and deducted from the payout associated with that order, or it shows the transactional fee credits going back to the seller in the case of a &lt;code&gt;REFUND&lt;/code&gt; transaction.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; In certain circumstances, transactional fees like &lt;code&gt;FINAL_VALUE_FEE&lt;/code&gt; and &lt;code&gt;FINAL_VALUE_FEE_FIXED_PER_ORDER&lt;/code&gt; are not deducted from a seller payout, but instead they are billed to the seller&apos;s account as &quot;non-sale charges&quot;. When this happens, the &lt;code&gt;SALE&lt;/code&gt; transaction entity will not have these fees under the &lt;b&gt;orderLineItems&lt;/b&gt; array, but they will appear as separate &lt;code&gt;NON_SALE_CHARGE&lt;/code&gt; transactions. When this happens, and you want to see those transactional fees for the order, one thing you can do is make another call to &lt;b&gt;getTransactions&lt;/b&gt; and filter against the &lt;b&gt;orderId&lt;/b&gt;. In the response, you will see the &lt;code&gt;SALE&lt;/code&gt; transaction and the &lt;code&gt;NON_SALE_CHARGE&lt;/code&gt; transactions applied against the order. See &lt;a href=&quot;/api-docs/sell/finances/resources/transaction/methods/getTransactions#s0-1-28-4-7-5-6-Gettransactionalfeesforanorder-5&quot; &gt;Sample 6: Get transactional fees for an order&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/finances/resources/transaction/methods/getTransactions#s0-1-28-4-7-5-6-Getnon-salechargesforanorder-9&quot;&gt;Sample 10: Get non-sale charges for an order&lt;/a&gt; for examples.
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
     * Gets the payoutDetails property value. This type provide payout details for a split-payout case. This type is only applicable for split payouts.
     * @return a {@link PayoutDetails}
     */
    @jakarta.annotation.Nullable
    public PayoutDetails getPayoutDetails() {
        return this.payoutDetails;
    }
    /**
     * Gets the payoutId property value. The unique identifier of the seller payout associated with the monetary transaction. This identifier is generated once eBay begins processing the payout for the corresponding order. This field will not be returned if eBay has not yet begun processing the payout for an order.&lt;br&gt;&lt;br&gt;This value can be used by the &lt;b&gt;filter&lt;/b&gt; query parameter to get monetary transactions associated with the true(actual) payout associated with the &lt;b&gt;PayoutId&lt;/b&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In case of a split payout, always pick the first true(actual) payout id.&lt;/span&gt; 
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
     * Gets the totalFeeAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTotalFeeAmount() {
        return this.totalFeeAmount;
    }
    /**
     * Gets the totalFeeBasisAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
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
     * Gets the transactionId property value. This field, when combined with the &lt;a href=&quot;#response.transactions.transactionType&quot; &gt;transactionType&lt;/a&gt; field, provide a unique identifier of the monetary transaction. A monetary transaction can be a sales order, an order refund to the buyer, a credit to the seller&apos;s account, a debit to the seller for the purchase of a shipping label, or a transaction where eBay recouped money from the seller if the seller lost a buyer-initiated payment dispute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransactionId() {
        return this.transactionId;
    }
    /**
     * Gets the transactionMemo property value. This field applies to shipping label transactions, sales transactions where payout is on hold, and non-sale charge fees. The following are examples of how the field is used for each transaction type:&lt;ul&gt;&lt;li&gt;&lt;b&gt;Shipping label purchase&lt;/b&gt;: the &lt;b&gt;transactionMemo&lt;/b&gt; field gives details about a purchase, a refund, or a price adjustment to the cost of the shipping label.&lt;/li&gt;&lt;li&gt;&lt;b&gt;Sales transactions with funds on hold&lt;/b&gt;: the &lt;b&gt;transactionMemo&lt;/b&gt; field provides information on the reason for the hold or when the hold will be released (e.g., &quot;Funds on hold. Estimated release on Jun 1&quot;).&lt;/li&gt;&lt;li&gt;&lt;b&gt;Non-sale charge fees&lt;/b&gt;: the &lt;b&gt;transactionMemo&lt;/b&gt; field will provide the type of fee that was charged, such as Promoted Offsite Fee.&lt;/li&gt;&lt;/ul&gt;This field is only returned if applicable/available.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransactionMemo() {
        return this.transactionMemo;
    }
    /**
     * Gets the transactionStatus property value. This enumeration value indicates the current status of the seller payout associated with the monetary transaction. See the &lt;code&gt;TransactionStatusEnum&lt;/code&gt; type for more information on the different states. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:TransactionStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransactionStatus() {
        return this.transactionStatus;
    }
    /**
     * Gets the transactionType property value. This enumeration value indicates the type of monetary transaction. Examples of monetary transactions include a buyer&apos;s payment for an order, a refund to the buyer for a returned item or cancelled order, or a credit issued by eBay to the seller&apos;s account. For a complete list of monetary transaction types within the &lt;strong&gt;Finances API&lt;/strong&gt;, see the &lt;a href=&quot;/api-docs/sell/finances/types/pay:TransactionTypeEnum&quot;&gt;TransactionTypeEnum&lt;/a&gt; type. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:TransactionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransactionType() {
        return this.transactionType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeStringValue("bookingEntry", this.getBookingEntry());
        writer.writeObjectValue("buyer", this.getBuyer());
        writer.writeObjectValue("eBayCollectedTaxAmount", this.getEBayCollectedTaxAmount());
        writer.writeObjectValue("feeJurisdiction", this.getFeeJurisdiction());
        writer.writeStringValue("feeType", this.getFeeType());
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
        writer.writeStringValue("transactionId", this.getTransactionId());
        writer.writeStringValue("transactionMemo", this.getTransactionMemo());
        writer.writeStringValue("transactionStatus", this.getTransactionStatus());
        writer.writeStringValue("transactionType", this.getTransactionType());
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
     * Sets the amount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Amount value) {
        this.amount = value;
    }
    /**
     * Sets the bookingEntry property value. The enumeration value returned in this field indicates if the monetary transaction amount is a (&lt;code&gt;CREDIT&lt;/code&gt;) or a (&lt;code&gt;DEBIT&lt;/code&gt;) to the seller&apos;s account. Typically, the &lt;code&gt;SALE&lt;/code&gt; and &lt;code&gt;CREDIT&lt;/code&gt; transaction types are credits to the seller&apos;s account, and the &lt;code&gt;REFUND&lt;/code&gt;, &lt;code&gt;DISPUTE&lt;/code&gt;, &lt;code&gt;SHIPPING_LABEL&lt;/code&gt;, and &lt;code&gt;TRANSFER&lt;/code&gt; transaction types are debits to the seller&apos;s account. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the bookingEntry property.
     */
    public void setBookingEntry(@jakarta.annotation.Nullable final String value) {
        this.bookingEntry = value;
    }
    /**
     * Sets the buyer property value. This type is used to express details about the buyer associated with an order. At this time, the only field in this type is the eBay user ID of the buyer, but more fields may get added at a later date.
     * @param value Value to set for the buyer property.
     */
    public void setBuyer(@jakarta.annotation.Nullable final Buyer value) {
        this.buyer = value;
    }
    /**
     * Sets the eBayCollectedTaxAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the eBayCollectedTaxAmount property.
     */
    public void setEBayCollectedTaxAmount(@jakarta.annotation.Nullable final Amount value) {
        this.eBayCollectedTaxAmount = value;
    }
    /**
     * Sets the feeJurisdiction property value. This type defines the jurisdiction information associated with a fee, identifying the geographic or regulatory region under which the fee is applied.
     * @param value Value to set for the feeJurisdiction property.
     */
    public void setFeeJurisdiction(@jakarta.annotation.Nullable final FeeJurisdiction value) {
        this.feeJurisdiction = value;
    }
    /**
     * Sets the feeType property value. The enumeration value returned in this field indicates the type of fee that was deducted from the seller payout. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/api:FeeTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the feeType property.
     */
    public void setFeeType(@jakarta.annotation.Nullable final String value) {
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
     * Sets the orderLineItems property value. This array either shows the order line item transactional fees related to a &lt;code&gt;SALE&lt;/code&gt; transaction and deducted from the payout associated with that order, or it shows the transactional fee credits going back to the seller in the case of a &lt;code&gt;REFUND&lt;/code&gt; transaction.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; In certain circumstances, transactional fees like &lt;code&gt;FINAL_VALUE_FEE&lt;/code&gt; and &lt;code&gt;FINAL_VALUE_FEE_FIXED_PER_ORDER&lt;/code&gt; are not deducted from a seller payout, but instead they are billed to the seller&apos;s account as &quot;non-sale charges&quot;. When this happens, the &lt;code&gt;SALE&lt;/code&gt; transaction entity will not have these fees under the &lt;b&gt;orderLineItems&lt;/b&gt; array, but they will appear as separate &lt;code&gt;NON_SALE_CHARGE&lt;/code&gt; transactions. When this happens, and you want to see those transactional fees for the order, one thing you can do is make another call to &lt;b&gt;getTransactions&lt;/b&gt; and filter against the &lt;b&gt;orderId&lt;/b&gt;. In the response, you will see the &lt;code&gt;SALE&lt;/code&gt; transaction and the &lt;code&gt;NON_SALE_CHARGE&lt;/code&gt; transactions applied against the order. See &lt;a href=&quot;/api-docs/sell/finances/resources/transaction/methods/getTransactions#s0-1-28-4-7-5-6-Gettransactionalfeesforanorder-5&quot; &gt;Sample 6: Get transactional fees for an order&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/finances/resources/transaction/methods/getTransactions#s0-1-28-4-7-5-6-Getnon-salechargesforanorder-9&quot;&gt;Sample 10: Get non-sale charges for an order&lt;/a&gt; for examples.
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
     * Sets the payoutDetails property value. This type provide payout details for a split-payout case. This type is only applicable for split payouts.
     * @param value Value to set for the payoutDetails property.
     */
    public void setPayoutDetails(@jakarta.annotation.Nullable final PayoutDetails value) {
        this.payoutDetails = value;
    }
    /**
     * Sets the payoutId property value. The unique identifier of the seller payout associated with the monetary transaction. This identifier is generated once eBay begins processing the payout for the corresponding order. This field will not be returned if eBay has not yet begun processing the payout for an order.&lt;br&gt;&lt;br&gt;This value can be used by the &lt;b&gt;filter&lt;/b&gt; query parameter to get monetary transactions associated with the true(actual) payout associated with the &lt;b&gt;PayoutId&lt;/b&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In case of a split payout, always pick the first true(actual) payout id.&lt;/span&gt; 
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
     * Sets the totalFeeAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the totalFeeAmount property.
     */
    public void setTotalFeeAmount(@jakarta.annotation.Nullable final Amount value) {
        this.totalFeeAmount = value;
    }
    /**
     * Sets the totalFeeBasisAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
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
     * Sets the transactionId property value. This field, when combined with the &lt;a href=&quot;#response.transactions.transactionType&quot; &gt;transactionType&lt;/a&gt; field, provide a unique identifier of the monetary transaction. A monetary transaction can be a sales order, an order refund to the buyer, a credit to the seller&apos;s account, a debit to the seller for the purchase of a shipping label, or a transaction where eBay recouped money from the seller if the seller lost a buyer-initiated payment dispute.
     * @param value Value to set for the transactionId property.
     */
    public void setTransactionId(@jakarta.annotation.Nullable final String value) {
        this.transactionId = value;
    }
    /**
     * Sets the transactionMemo property value. This field applies to shipping label transactions, sales transactions where payout is on hold, and non-sale charge fees. The following are examples of how the field is used for each transaction type:&lt;ul&gt;&lt;li&gt;&lt;b&gt;Shipping label purchase&lt;/b&gt;: the &lt;b&gt;transactionMemo&lt;/b&gt; field gives details about a purchase, a refund, or a price adjustment to the cost of the shipping label.&lt;/li&gt;&lt;li&gt;&lt;b&gt;Sales transactions with funds on hold&lt;/b&gt;: the &lt;b&gt;transactionMemo&lt;/b&gt; field provides information on the reason for the hold or when the hold will be released (e.g., &quot;Funds on hold. Estimated release on Jun 1&quot;).&lt;/li&gt;&lt;li&gt;&lt;b&gt;Non-sale charge fees&lt;/b&gt;: the &lt;b&gt;transactionMemo&lt;/b&gt; field will provide the type of fee that was charged, such as Promoted Offsite Fee.&lt;/li&gt;&lt;/ul&gt;This field is only returned if applicable/available.
     * @param value Value to set for the transactionMemo property.
     */
    public void setTransactionMemo(@jakarta.annotation.Nullable final String value) {
        this.transactionMemo = value;
    }
    /**
     * Sets the transactionStatus property value. This enumeration value indicates the current status of the seller payout associated with the monetary transaction. See the &lt;code&gt;TransactionStatusEnum&lt;/code&gt; type for more information on the different states. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:TransactionStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the transactionStatus property.
     */
    public void setTransactionStatus(@jakarta.annotation.Nullable final String value) {
        this.transactionStatus = value;
    }
    /**
     * Sets the transactionType property value. This enumeration value indicates the type of monetary transaction. Examples of monetary transactions include a buyer&apos;s payment for an order, a refund to the buyer for a returned item or cancelled order, or a credit issued by eBay to the seller&apos;s account. For a complete list of monetary transaction types within the &lt;strong&gt;Finances API&lt;/strong&gt;, see the &lt;a href=&quot;/api-docs/sell/finances/types/pay:TransactionTypeEnum&quot;&gt;TransactionTypeEnum&lt;/a&gt; type. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:TransactionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the transactionType property.
     */
    public void setTransactionType(@jakarta.annotation.Nullable final String value) {
        this.transactionType = value;
    }
}
