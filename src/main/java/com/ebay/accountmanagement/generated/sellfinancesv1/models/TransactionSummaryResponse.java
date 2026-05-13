package com.ebay.accountmanagement.generated.sellfinancesv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is the base response type of the &lt;strong&gt;getTransactionSummary&lt;/strong&gt; method, and based on the filters that are used in the &lt;strong&gt;getTransactionSummary&lt;/strong&gt; call URI, the response may include  total count and amount of the seller&apos;s sales and credits, total count and amount of buyer refunds, and total count and amount of seller payment holds.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TransactionSummaryResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount adjustmentAmount;
    /**
     * The credit debit sign indicator for adjustment. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String adjustmentBookingEntry;
    /**
     * Total adjustment count for given payee within a specified period.
     */
    private Integer adjustmentCount;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount balanceTransferAmount;
    /**
     * The credit debit sign indicator for the balance transfer. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String balanceTransferBookingEntry;
    /**
     * The total balance transfer count for given payee within the specified period.
     */
    private Integer balanceTransferCount;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount creditAmount;
    /**
     * The enumeration value indicates whether the dollar amount in the &lt;strong&gt;creditAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;CREDIT&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String creditBookingEntry;
    /**
     * This integer value indicates the total number of the seller&apos;s sales and/or credits that match the input criteria. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Unless the &lt;b&gt;transactionType&lt;/b&gt; filter is used in the request to retrieve a specific type of monetary transaction (sale, buyer refund, or seller credit), the &lt;b&gt;creditCount&lt;/b&gt; and &lt;b&gt;creditAmount&lt;/b&gt; fields account for both order sales and seller credits (the count and value is not distinguished between the two monetary transaction types).&lt;/span&gt;&lt;br&gt;&lt;br&gt;This field is generally returned, even if &lt;code&gt;0&lt;/code&gt;, but it will not be returned if a &lt;strong&gt;transactionType&lt;/strong&gt; filter is used, and its value is set to either &lt;code&gt;REFUND&lt;/code&gt;, &lt;code&gt;DISPUTE&lt;/code&gt;, or &lt;code&gt;SHIPPING_LABEL&lt;/code&gt;.
     */
    private Integer creditCount;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount disputeAmount;
    /**
     * The enumeration value indicates whether the dollar amount in the &lt;strong&gt;disputeAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;DEBIT&lt;/code&gt;, but its possible that &lt;code&gt;CREDIT&lt;/code&gt; could be returned if the seller contested one or more payment disputes and won the dispute. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String disputeBookingEntry;
    /**
     * This integer value indicates the total number of payment disputes that have been initiated by one or more buyers. Only the orders that match the input criteria are considered. The Payment Disputes methods in the Fulfillment API can be used by the seller to retrieve more information about any payment disputes. &lt;br&gt;&lt;br&gt;This field is generally returned, even if &lt;code&gt;0&lt;/code&gt;, but it will not be returned if a &lt;strong&gt;transactionType&lt;/strong&gt; filter is used, and its value is set to any value other than &lt;code&gt;DISPUTE&lt;/code&gt;.
     */
    private Integer disputeCount;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount loanRepaymentAmount;
    /**
     * The enumeration value indicates whether the &lt;code&gt;loanRepaymentAmount&lt;/code&gt; is a &lt;code&gt;DEBIT&lt;/code&gt; against, or a &lt;code&gt;CREDIT&lt;/code&gt; to, the sellers&apos;s account.&lt;br&gt;&lt;br&gt;For most &lt;code&gt;loanRepaymentAmount&lt;/code&gt; transactions, &lt;code&gt;loanRepaymentBookingEntry&lt;/code&gt; will be &lt;b&gt;DEBIT&lt;/b&gt;. However, if a loan repayment transaction is reversed, that transaction will be shown as a &lt;b&gt;CREDIT&lt;/b&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String loanRepaymentBookingEntry;
    /**
     * This integer value indicates the total number of &lt;code&gt;LOAN_REPAYMENT&lt;/code&gt; transactions (i.e., &lt;code&gt;DEBIT&lt;/code&gt; and &lt;code&gt;CREDIT&lt;/code&gt;,) that match the input criteria.&lt;br&gt;&lt;br&gt;This field is generally returned even if it equals &lt;b&gt;0&lt;/b&gt;. However it will not be returned if a &lt;code&gt;transactionType&lt;/code&gt; filter is used and its value has been set to any enumeration value other than &lt;code&gt;LOAN_REPAYMENT&lt;/code&gt;.
     */
    private Integer loanRepaymentCount;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount nonSaleChargeAmount;
    /**
     * The credit/debit sign indicator for the non-sale charge. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String nonSaleChargeBookingEntry;
    /**
     * The total non-sale charge count for given payee within a specified period.
     */
    private Integer nonSaleChargeCount;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount onHoldAmount;
    /**
     * The enumeration value indicates whether the dollar amount in the &lt;strong&gt;onHoldAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;CREDIT&lt;/code&gt;, since on-hold funds should eventually be released as part of a payout to the seller once the hold is cleared. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String onHoldBookingEntry;
    /**
     * This integer value indicates the total number of order sales where the associated funds are on hold. Only the orders that match the input criteria are considered.&lt;br&gt;&lt;br&gt;This field is generally returned, even if &lt;code&gt;0&lt;/code&gt;, but it will not be returned if a &lt;strong&gt;transactionStatus&lt;/strong&gt; filter is used, and its value is set to any value other than &lt;code&gt;FUNDS_ON_HOLD&lt;/code&gt;.
     */
    private Integer onHoldCount;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount purchaseAmount;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;code&gt;PURCHASE&lt;/code&gt; transaction type is currently only applicable in the US marketplace.&lt;/span&gt;&lt;br&gt;This enumeration value indicates whether the dollar amount in the &lt;b&gt;purchase&lt;/b&gt; field is a charge (debit) to the seller or a credit. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String purchaseBookingEntry;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;code&gt;PURCHASE&lt;/code&gt; transaction type is currently only applicable in the US marketplace.&lt;/span&gt;&lt;br&gt;This integer value indicates the total number of purchases that have been initiated by a seller using spendable funds that match the input criteria.&lt;br&gt;&lt;br&gt;This field is generally returned, even if it equals &lt;code&gt;0&lt;/code&gt;. However, it will not be returned if a &lt;code&gt;transactionType&lt;/code&gt; filter is used and its value has been set to any enumeration value other than &lt;code&gt;PURCHASE&lt;/code&gt;.
     */
    private Integer purchaseCount;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount refundAmount;
    /**
     * The enumeration value indicates whether the dollar amount in the &lt;strong&gt;refundAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;DEBIT&lt;/code&gt; since this a refund from the seller to the buyer. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String refundBookingEntry;
    /**
     * This integer value indicates the total number of buyer refunds that match the input criteria. &lt;br&gt;&lt;br&gt;This field is generally returned, even if &lt;code&gt;0&lt;/code&gt;, but it will not be returned if a &lt;strong&gt;transactionType&lt;/strong&gt; filter is used, and its value is set to any value other than &lt;code&gt;REFUND&lt;/code&gt;.
     */
    private Integer refundCount;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount shippingLabelAmount;
    /**
     * The enumeration value indicates whether the dollar amount in the &lt;strong&gt;shippingLabelAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;DEBIT&lt;/code&gt;, as eBay will charge the seller when eBay shipping labels are purchased, but it can be &lt;code&gt;CREDIT&lt;/code&gt; if the seller was refunded for a shipping label or was possibly overcharged for a shipping label. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; eBay SHIPPING_LABEL transactions paid through PayPal are not currently supported by the Finances API, so those transactions will not be reflected in this field.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String shippingLabelBookingEntry;
    /**
     * This is the total number of eBay shipping labels purchased by the seller. The count returned here may depend on the specified input criteria.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; eBay SHIPPING_LABEL transactions paid through PayPal are not currently supported by the Finances API, so those transactions will not be reflected in the count returned in this container.&lt;/span&gt;
     */
    private Integer shippingLabelCount;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount transferAmount;
    /**
     * The enumeration value indicates whether the dollar amount in the &lt;strong&gt;transferAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;DEBIT&lt;/code&gt; since this a seller reimbursement to eBay for buyer refunds. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String transferBookingEntry;
    /**
     * This integer value indicates the total number of buyer refund transfers that match the input criteria. &lt;br&gt;&lt;br&gt;This field is generally returned, even if &lt;code&gt;0&lt;/code&gt;, but it will not be returned if a &lt;strong&gt;transactionType&lt;/strong&gt; filter is used, and its value is set to any value other than &lt;code&gt;TRANSFER&lt;/code&gt;.
     */
    private Integer transferCount;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount withdrawalAmount;
    /**
     * The enumeration value indicates whether the dollar amount in the &lt;strong&gt;withdrawalAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;DEBIT&lt;/code&gt; since this transaction involves a debit to the seller&apos;s available payout funds. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String withdrawalBookingEntry;
    /**
     * This integer value indicates the total number of on-demand payouts (withdrawals) that match the input criteria. &lt;br&gt;&lt;br&gt;This field is generally returned, even if &lt;code&gt;0&lt;/code&gt;, but it will not be returned if a &lt;strong&gt;transactionType&lt;/strong&gt; filter is used, and its value is set to any value other than &lt;code&gt;WITHDRAWAL&lt;/code&gt;.
     */
    private Integer withdrawalCount;
    /**
     * Instantiates a new {@link TransactionSummaryResponse} and sets the default values.
     */
    public TransactionSummaryResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TransactionSummaryResponse}
     */
    @jakarta.annotation.Nonnull
    public static TransactionSummaryResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TransactionSummaryResponse();
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
     * Gets the adjustmentAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAdjustmentAmount() {
        return this.adjustmentAmount;
    }
    /**
     * Gets the adjustmentBookingEntry property value. The credit debit sign indicator for adjustment. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdjustmentBookingEntry() {
        return this.adjustmentBookingEntry;
    }
    /**
     * Gets the adjustmentCount property value. Total adjustment count for given payee within a specified period.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAdjustmentCount() {
        return this.adjustmentCount;
    }
    /**
     * Gets the balanceTransferAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getBalanceTransferAmount() {
        return this.balanceTransferAmount;
    }
    /**
     * Gets the balanceTransferBookingEntry property value. The credit debit sign indicator for the balance transfer. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBalanceTransferBookingEntry() {
        return this.balanceTransferBookingEntry;
    }
    /**
     * Gets the balanceTransferCount property value. The total balance transfer count for given payee within the specified period.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBalanceTransferCount() {
        return this.balanceTransferCount;
    }
    /**
     * Gets the creditAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getCreditAmount() {
        return this.creditAmount;
    }
    /**
     * Gets the creditBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;creditAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;CREDIT&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreditBookingEntry() {
        return this.creditBookingEntry;
    }
    /**
     * Gets the creditCount property value. This integer value indicates the total number of the seller&apos;s sales and/or credits that match the input criteria. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Unless the &lt;b&gt;transactionType&lt;/b&gt; filter is used in the request to retrieve a specific type of monetary transaction (sale, buyer refund, or seller credit), the &lt;b&gt;creditCount&lt;/b&gt; and &lt;b&gt;creditAmount&lt;/b&gt; fields account for both order sales and seller credits (the count and value is not distinguished between the two monetary transaction types).&lt;/span&gt;&lt;br&gt;&lt;br&gt;This field is generally returned, even if &lt;code&gt;0&lt;/code&gt;, but it will not be returned if a &lt;strong&gt;transactionType&lt;/strong&gt; filter is used, and its value is set to either &lt;code&gt;REFUND&lt;/code&gt;, &lt;code&gt;DISPUTE&lt;/code&gt;, or &lt;code&gt;SHIPPING_LABEL&lt;/code&gt;.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCreditCount() {
        return this.creditCount;
    }
    /**
     * Gets the disputeAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getDisputeAmount() {
        return this.disputeAmount;
    }
    /**
     * Gets the disputeBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;disputeAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;DEBIT&lt;/code&gt;, but its possible that &lt;code&gt;CREDIT&lt;/code&gt; could be returned if the seller contested one or more payment disputes and won the dispute. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisputeBookingEntry() {
        return this.disputeBookingEntry;
    }
    /**
     * Gets the disputeCount property value. This integer value indicates the total number of payment disputes that have been initiated by one or more buyers. Only the orders that match the input criteria are considered. The Payment Disputes methods in the Fulfillment API can be used by the seller to retrieve more information about any payment disputes. &lt;br&gt;&lt;br&gt;This field is generally returned, even if &lt;code&gt;0&lt;/code&gt;, but it will not be returned if a &lt;strong&gt;transactionType&lt;/strong&gt; filter is used, and its value is set to any value other than &lt;code&gt;DISPUTE&lt;/code&gt;.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDisputeCount() {
        return this.disputeCount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(36);
        deserializerMap.put("adjustmentAmount", (n) -> { this.setAdjustmentAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("adjustmentBookingEntry", (n) -> { this.setAdjustmentBookingEntry(n.getStringValue()); });
        deserializerMap.put("adjustmentCount", (n) -> { this.setAdjustmentCount(n.getIntegerValue()); });
        deserializerMap.put("balanceTransferAmount", (n) -> { this.setBalanceTransferAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("balanceTransferBookingEntry", (n) -> { this.setBalanceTransferBookingEntry(n.getStringValue()); });
        deserializerMap.put("balanceTransferCount", (n) -> { this.setBalanceTransferCount(n.getIntegerValue()); });
        deserializerMap.put("creditAmount", (n) -> { this.setCreditAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("creditBookingEntry", (n) -> { this.setCreditBookingEntry(n.getStringValue()); });
        deserializerMap.put("creditCount", (n) -> { this.setCreditCount(n.getIntegerValue()); });
        deserializerMap.put("disputeAmount", (n) -> { this.setDisputeAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("disputeBookingEntry", (n) -> { this.setDisputeBookingEntry(n.getStringValue()); });
        deserializerMap.put("disputeCount", (n) -> { this.setDisputeCount(n.getIntegerValue()); });
        deserializerMap.put("loanRepaymentAmount", (n) -> { this.setLoanRepaymentAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("loanRepaymentBookingEntry", (n) -> { this.setLoanRepaymentBookingEntry(n.getStringValue()); });
        deserializerMap.put("loanRepaymentCount", (n) -> { this.setLoanRepaymentCount(n.getIntegerValue()); });
        deserializerMap.put("nonSaleChargeAmount", (n) -> { this.setNonSaleChargeAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("nonSaleChargeBookingEntry", (n) -> { this.setNonSaleChargeBookingEntry(n.getStringValue()); });
        deserializerMap.put("nonSaleChargeCount", (n) -> { this.setNonSaleChargeCount(n.getIntegerValue()); });
        deserializerMap.put("onHoldAmount", (n) -> { this.setOnHoldAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("onHoldBookingEntry", (n) -> { this.setOnHoldBookingEntry(n.getStringValue()); });
        deserializerMap.put("onHoldCount", (n) -> { this.setOnHoldCount(n.getIntegerValue()); });
        deserializerMap.put("purchaseAmount", (n) -> { this.setPurchaseAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("purchaseBookingEntry", (n) -> { this.setPurchaseBookingEntry(n.getStringValue()); });
        deserializerMap.put("purchaseCount", (n) -> { this.setPurchaseCount(n.getIntegerValue()); });
        deserializerMap.put("refundAmount", (n) -> { this.setRefundAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("refundBookingEntry", (n) -> { this.setRefundBookingEntry(n.getStringValue()); });
        deserializerMap.put("refundCount", (n) -> { this.setRefundCount(n.getIntegerValue()); });
        deserializerMap.put("shippingLabelAmount", (n) -> { this.setShippingLabelAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("shippingLabelBookingEntry", (n) -> { this.setShippingLabelBookingEntry(n.getStringValue()); });
        deserializerMap.put("shippingLabelCount", (n) -> { this.setShippingLabelCount(n.getIntegerValue()); });
        deserializerMap.put("transferAmount", (n) -> { this.setTransferAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("transferBookingEntry", (n) -> { this.setTransferBookingEntry(n.getStringValue()); });
        deserializerMap.put("transferCount", (n) -> { this.setTransferCount(n.getIntegerValue()); });
        deserializerMap.put("withdrawalAmount", (n) -> { this.setWithdrawalAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("withdrawalBookingEntry", (n) -> { this.setWithdrawalBookingEntry(n.getStringValue()); });
        deserializerMap.put("withdrawalCount", (n) -> { this.setWithdrawalCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the loanRepaymentAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getLoanRepaymentAmount() {
        return this.loanRepaymentAmount;
    }
    /**
     * Gets the loanRepaymentBookingEntry property value. The enumeration value indicates whether the &lt;code&gt;loanRepaymentAmount&lt;/code&gt; is a &lt;code&gt;DEBIT&lt;/code&gt; against, or a &lt;code&gt;CREDIT&lt;/code&gt; to, the sellers&apos;s account.&lt;br&gt;&lt;br&gt;For most &lt;code&gt;loanRepaymentAmount&lt;/code&gt; transactions, &lt;code&gt;loanRepaymentBookingEntry&lt;/code&gt; will be &lt;b&gt;DEBIT&lt;/b&gt;. However, if a loan repayment transaction is reversed, that transaction will be shown as a &lt;b&gt;CREDIT&lt;/b&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLoanRepaymentBookingEntry() {
        return this.loanRepaymentBookingEntry;
    }
    /**
     * Gets the loanRepaymentCount property value. This integer value indicates the total number of &lt;code&gt;LOAN_REPAYMENT&lt;/code&gt; transactions (i.e., &lt;code&gt;DEBIT&lt;/code&gt; and &lt;code&gt;CREDIT&lt;/code&gt;,) that match the input criteria.&lt;br&gt;&lt;br&gt;This field is generally returned even if it equals &lt;b&gt;0&lt;/b&gt;. However it will not be returned if a &lt;code&gt;transactionType&lt;/code&gt; filter is used and its value has been set to any enumeration value other than &lt;code&gt;LOAN_REPAYMENT&lt;/code&gt;.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLoanRepaymentCount() {
        return this.loanRepaymentCount;
    }
    /**
     * Gets the nonSaleChargeAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getNonSaleChargeAmount() {
        return this.nonSaleChargeAmount;
    }
    /**
     * Gets the nonSaleChargeBookingEntry property value. The credit/debit sign indicator for the non-sale charge. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNonSaleChargeBookingEntry() {
        return this.nonSaleChargeBookingEntry;
    }
    /**
     * Gets the nonSaleChargeCount property value. The total non-sale charge count for given payee within a specified period.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNonSaleChargeCount() {
        return this.nonSaleChargeCount;
    }
    /**
     * Gets the onHoldAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getOnHoldAmount() {
        return this.onHoldAmount;
    }
    /**
     * Gets the onHoldBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;onHoldAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;CREDIT&lt;/code&gt;, since on-hold funds should eventually be released as part of a payout to the seller once the hold is cleared. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOnHoldBookingEntry() {
        return this.onHoldBookingEntry;
    }
    /**
     * Gets the onHoldCount property value. This integer value indicates the total number of order sales where the associated funds are on hold. Only the orders that match the input criteria are considered.&lt;br&gt;&lt;br&gt;This field is generally returned, even if &lt;code&gt;0&lt;/code&gt;, but it will not be returned if a &lt;strong&gt;transactionStatus&lt;/strong&gt; filter is used, and its value is set to any value other than &lt;code&gt;FUNDS_ON_HOLD&lt;/code&gt;.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOnHoldCount() {
        return this.onHoldCount;
    }
    /**
     * Gets the purchaseAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getPurchaseAmount() {
        return this.purchaseAmount;
    }
    /**
     * Gets the purchaseBookingEntry property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;code&gt;PURCHASE&lt;/code&gt; transaction type is currently only applicable in the US marketplace.&lt;/span&gt;&lt;br&gt;This enumeration value indicates whether the dollar amount in the &lt;b&gt;purchase&lt;/b&gt; field is a charge (debit) to the seller or a credit. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPurchaseBookingEntry() {
        return this.purchaseBookingEntry;
    }
    /**
     * Gets the purchaseCount property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;code&gt;PURCHASE&lt;/code&gt; transaction type is currently only applicable in the US marketplace.&lt;/span&gt;&lt;br&gt;This integer value indicates the total number of purchases that have been initiated by a seller using spendable funds that match the input criteria.&lt;br&gt;&lt;br&gt;This field is generally returned, even if it equals &lt;code&gt;0&lt;/code&gt;. However, it will not be returned if a &lt;code&gt;transactionType&lt;/code&gt; filter is used and its value has been set to any enumeration value other than &lt;code&gt;PURCHASE&lt;/code&gt;.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPurchaseCount() {
        return this.purchaseCount;
    }
    /**
     * Gets the refundAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getRefundAmount() {
        return this.refundAmount;
    }
    /**
     * Gets the refundBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;refundAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;DEBIT&lt;/code&gt; since this a refund from the seller to the buyer. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRefundBookingEntry() {
        return this.refundBookingEntry;
    }
    /**
     * Gets the refundCount property value. This integer value indicates the total number of buyer refunds that match the input criteria. &lt;br&gt;&lt;br&gt;This field is generally returned, even if &lt;code&gt;0&lt;/code&gt;, but it will not be returned if a &lt;strong&gt;transactionType&lt;/strong&gt; filter is used, and its value is set to any value other than &lt;code&gt;REFUND&lt;/code&gt;.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRefundCount() {
        return this.refundCount;
    }
    /**
     * Gets the shippingLabelAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getShippingLabelAmount() {
        return this.shippingLabelAmount;
    }
    /**
     * Gets the shippingLabelBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;shippingLabelAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;DEBIT&lt;/code&gt;, as eBay will charge the seller when eBay shipping labels are purchased, but it can be &lt;code&gt;CREDIT&lt;/code&gt; if the seller was refunded for a shipping label or was possibly overcharged for a shipping label. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; eBay SHIPPING_LABEL transactions paid through PayPal are not currently supported by the Finances API, so those transactions will not be reflected in this field.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingLabelBookingEntry() {
        return this.shippingLabelBookingEntry;
    }
    /**
     * Gets the shippingLabelCount property value. This is the total number of eBay shipping labels purchased by the seller. The count returned here may depend on the specified input criteria.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; eBay SHIPPING_LABEL transactions paid through PayPal are not currently supported by the Finances API, so those transactions will not be reflected in the count returned in this container.&lt;/span&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getShippingLabelCount() {
        return this.shippingLabelCount;
    }
    /**
     * Gets the transferAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTransferAmount() {
        return this.transferAmount;
    }
    /**
     * Gets the transferBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;transferAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;DEBIT&lt;/code&gt; since this a seller reimbursement to eBay for buyer refunds. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransferBookingEntry() {
        return this.transferBookingEntry;
    }
    /**
     * Gets the transferCount property value. This integer value indicates the total number of buyer refund transfers that match the input criteria. &lt;br&gt;&lt;br&gt;This field is generally returned, even if &lt;code&gt;0&lt;/code&gt;, but it will not be returned if a &lt;strong&gt;transactionType&lt;/strong&gt; filter is used, and its value is set to any value other than &lt;code&gt;TRANSFER&lt;/code&gt;.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTransferCount() {
        return this.transferCount;
    }
    /**
     * Gets the withdrawalAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getWithdrawalAmount() {
        return this.withdrawalAmount;
    }
    /**
     * Gets the withdrawalBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;withdrawalAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;DEBIT&lt;/code&gt; since this transaction involves a debit to the seller&apos;s available payout funds. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWithdrawalBookingEntry() {
        return this.withdrawalBookingEntry;
    }
    /**
     * Gets the withdrawalCount property value. This integer value indicates the total number of on-demand payouts (withdrawals) that match the input criteria. &lt;br&gt;&lt;br&gt;This field is generally returned, even if &lt;code&gt;0&lt;/code&gt;, but it will not be returned if a &lt;strong&gt;transactionType&lt;/strong&gt; filter is used, and its value is set to any value other than &lt;code&gt;WITHDRAWAL&lt;/code&gt;.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWithdrawalCount() {
        return this.withdrawalCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("adjustmentAmount", this.getAdjustmentAmount());
        writer.writeStringValue("adjustmentBookingEntry", this.getAdjustmentBookingEntry());
        writer.writeIntegerValue("adjustmentCount", this.getAdjustmentCount());
        writer.writeObjectValue("balanceTransferAmount", this.getBalanceTransferAmount());
        writer.writeStringValue("balanceTransferBookingEntry", this.getBalanceTransferBookingEntry());
        writer.writeIntegerValue("balanceTransferCount", this.getBalanceTransferCount());
        writer.writeObjectValue("creditAmount", this.getCreditAmount());
        writer.writeStringValue("creditBookingEntry", this.getCreditBookingEntry());
        writer.writeIntegerValue("creditCount", this.getCreditCount());
        writer.writeObjectValue("disputeAmount", this.getDisputeAmount());
        writer.writeStringValue("disputeBookingEntry", this.getDisputeBookingEntry());
        writer.writeIntegerValue("disputeCount", this.getDisputeCount());
        writer.writeObjectValue("loanRepaymentAmount", this.getLoanRepaymentAmount());
        writer.writeStringValue("loanRepaymentBookingEntry", this.getLoanRepaymentBookingEntry());
        writer.writeIntegerValue("loanRepaymentCount", this.getLoanRepaymentCount());
        writer.writeObjectValue("nonSaleChargeAmount", this.getNonSaleChargeAmount());
        writer.writeStringValue("nonSaleChargeBookingEntry", this.getNonSaleChargeBookingEntry());
        writer.writeIntegerValue("nonSaleChargeCount", this.getNonSaleChargeCount());
        writer.writeObjectValue("onHoldAmount", this.getOnHoldAmount());
        writer.writeStringValue("onHoldBookingEntry", this.getOnHoldBookingEntry());
        writer.writeIntegerValue("onHoldCount", this.getOnHoldCount());
        writer.writeObjectValue("purchaseAmount", this.getPurchaseAmount());
        writer.writeStringValue("purchaseBookingEntry", this.getPurchaseBookingEntry());
        writer.writeIntegerValue("purchaseCount", this.getPurchaseCount());
        writer.writeObjectValue("refundAmount", this.getRefundAmount());
        writer.writeStringValue("refundBookingEntry", this.getRefundBookingEntry());
        writer.writeIntegerValue("refundCount", this.getRefundCount());
        writer.writeObjectValue("shippingLabelAmount", this.getShippingLabelAmount());
        writer.writeStringValue("shippingLabelBookingEntry", this.getShippingLabelBookingEntry());
        writer.writeIntegerValue("shippingLabelCount", this.getShippingLabelCount());
        writer.writeObjectValue("transferAmount", this.getTransferAmount());
        writer.writeStringValue("transferBookingEntry", this.getTransferBookingEntry());
        writer.writeIntegerValue("transferCount", this.getTransferCount());
        writer.writeObjectValue("withdrawalAmount", this.getWithdrawalAmount());
        writer.writeStringValue("withdrawalBookingEntry", this.getWithdrawalBookingEntry());
        writer.writeIntegerValue("withdrawalCount", this.getWithdrawalCount());
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
     * Sets the adjustmentAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the adjustmentAmount property.
     */
    public void setAdjustmentAmount(@jakarta.annotation.Nullable final Amount value) {
        this.adjustmentAmount = value;
    }
    /**
     * Sets the adjustmentBookingEntry property value. The credit debit sign indicator for adjustment. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the adjustmentBookingEntry property.
     */
    public void setAdjustmentBookingEntry(@jakarta.annotation.Nullable final String value) {
        this.adjustmentBookingEntry = value;
    }
    /**
     * Sets the adjustmentCount property value. Total adjustment count for given payee within a specified period.
     * @param value Value to set for the adjustmentCount property.
     */
    public void setAdjustmentCount(@jakarta.annotation.Nullable final Integer value) {
        this.adjustmentCount = value;
    }
    /**
     * Sets the balanceTransferAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the balanceTransferAmount property.
     */
    public void setBalanceTransferAmount(@jakarta.annotation.Nullable final Amount value) {
        this.balanceTransferAmount = value;
    }
    /**
     * Sets the balanceTransferBookingEntry property value. The credit debit sign indicator for the balance transfer. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the balanceTransferBookingEntry property.
     */
    public void setBalanceTransferBookingEntry(@jakarta.annotation.Nullable final String value) {
        this.balanceTransferBookingEntry = value;
    }
    /**
     * Sets the balanceTransferCount property value. The total balance transfer count for given payee within the specified period.
     * @param value Value to set for the balanceTransferCount property.
     */
    public void setBalanceTransferCount(@jakarta.annotation.Nullable final Integer value) {
        this.balanceTransferCount = value;
    }
    /**
     * Sets the creditAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the creditAmount property.
     */
    public void setCreditAmount(@jakarta.annotation.Nullable final Amount value) {
        this.creditAmount = value;
    }
    /**
     * Sets the creditBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;creditAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;CREDIT&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the creditBookingEntry property.
     */
    public void setCreditBookingEntry(@jakarta.annotation.Nullable final String value) {
        this.creditBookingEntry = value;
    }
    /**
     * Sets the creditCount property value. This integer value indicates the total number of the seller&apos;s sales and/or credits that match the input criteria. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Unless the &lt;b&gt;transactionType&lt;/b&gt; filter is used in the request to retrieve a specific type of monetary transaction (sale, buyer refund, or seller credit), the &lt;b&gt;creditCount&lt;/b&gt; and &lt;b&gt;creditAmount&lt;/b&gt; fields account for both order sales and seller credits (the count and value is not distinguished between the two monetary transaction types).&lt;/span&gt;&lt;br&gt;&lt;br&gt;This field is generally returned, even if &lt;code&gt;0&lt;/code&gt;, but it will not be returned if a &lt;strong&gt;transactionType&lt;/strong&gt; filter is used, and its value is set to either &lt;code&gt;REFUND&lt;/code&gt;, &lt;code&gt;DISPUTE&lt;/code&gt;, or &lt;code&gt;SHIPPING_LABEL&lt;/code&gt;.
     * @param value Value to set for the creditCount property.
     */
    public void setCreditCount(@jakarta.annotation.Nullable final Integer value) {
        this.creditCount = value;
    }
    /**
     * Sets the disputeAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the disputeAmount property.
     */
    public void setDisputeAmount(@jakarta.annotation.Nullable final Amount value) {
        this.disputeAmount = value;
    }
    /**
     * Sets the disputeBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;disputeAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;DEBIT&lt;/code&gt;, but its possible that &lt;code&gt;CREDIT&lt;/code&gt; could be returned if the seller contested one or more payment disputes and won the dispute. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the disputeBookingEntry property.
     */
    public void setDisputeBookingEntry(@jakarta.annotation.Nullable final String value) {
        this.disputeBookingEntry = value;
    }
    /**
     * Sets the disputeCount property value. This integer value indicates the total number of payment disputes that have been initiated by one or more buyers. Only the orders that match the input criteria are considered. The Payment Disputes methods in the Fulfillment API can be used by the seller to retrieve more information about any payment disputes. &lt;br&gt;&lt;br&gt;This field is generally returned, even if &lt;code&gt;0&lt;/code&gt;, but it will not be returned if a &lt;strong&gt;transactionType&lt;/strong&gt; filter is used, and its value is set to any value other than &lt;code&gt;DISPUTE&lt;/code&gt;.
     * @param value Value to set for the disputeCount property.
     */
    public void setDisputeCount(@jakarta.annotation.Nullable final Integer value) {
        this.disputeCount = value;
    }
    /**
     * Sets the loanRepaymentAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the loanRepaymentAmount property.
     */
    public void setLoanRepaymentAmount(@jakarta.annotation.Nullable final Amount value) {
        this.loanRepaymentAmount = value;
    }
    /**
     * Sets the loanRepaymentBookingEntry property value. The enumeration value indicates whether the &lt;code&gt;loanRepaymentAmount&lt;/code&gt; is a &lt;code&gt;DEBIT&lt;/code&gt; against, or a &lt;code&gt;CREDIT&lt;/code&gt; to, the sellers&apos;s account.&lt;br&gt;&lt;br&gt;For most &lt;code&gt;loanRepaymentAmount&lt;/code&gt; transactions, &lt;code&gt;loanRepaymentBookingEntry&lt;/code&gt; will be &lt;b&gt;DEBIT&lt;/b&gt;. However, if a loan repayment transaction is reversed, that transaction will be shown as a &lt;b&gt;CREDIT&lt;/b&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the loanRepaymentBookingEntry property.
     */
    public void setLoanRepaymentBookingEntry(@jakarta.annotation.Nullable final String value) {
        this.loanRepaymentBookingEntry = value;
    }
    /**
     * Sets the loanRepaymentCount property value. This integer value indicates the total number of &lt;code&gt;LOAN_REPAYMENT&lt;/code&gt; transactions (i.e., &lt;code&gt;DEBIT&lt;/code&gt; and &lt;code&gt;CREDIT&lt;/code&gt;,) that match the input criteria.&lt;br&gt;&lt;br&gt;This field is generally returned even if it equals &lt;b&gt;0&lt;/b&gt;. However it will not be returned if a &lt;code&gt;transactionType&lt;/code&gt; filter is used and its value has been set to any enumeration value other than &lt;code&gt;LOAN_REPAYMENT&lt;/code&gt;.
     * @param value Value to set for the loanRepaymentCount property.
     */
    public void setLoanRepaymentCount(@jakarta.annotation.Nullable final Integer value) {
        this.loanRepaymentCount = value;
    }
    /**
     * Sets the nonSaleChargeAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the nonSaleChargeAmount property.
     */
    public void setNonSaleChargeAmount(@jakarta.annotation.Nullable final Amount value) {
        this.nonSaleChargeAmount = value;
    }
    /**
     * Sets the nonSaleChargeBookingEntry property value. The credit/debit sign indicator for the non-sale charge. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the nonSaleChargeBookingEntry property.
     */
    public void setNonSaleChargeBookingEntry(@jakarta.annotation.Nullable final String value) {
        this.nonSaleChargeBookingEntry = value;
    }
    /**
     * Sets the nonSaleChargeCount property value. The total non-sale charge count for given payee within a specified period.
     * @param value Value to set for the nonSaleChargeCount property.
     */
    public void setNonSaleChargeCount(@jakarta.annotation.Nullable final Integer value) {
        this.nonSaleChargeCount = value;
    }
    /**
     * Sets the onHoldAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the onHoldAmount property.
     */
    public void setOnHoldAmount(@jakarta.annotation.Nullable final Amount value) {
        this.onHoldAmount = value;
    }
    /**
     * Sets the onHoldBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;onHoldAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;CREDIT&lt;/code&gt;, since on-hold funds should eventually be released as part of a payout to the seller once the hold is cleared. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the onHoldBookingEntry property.
     */
    public void setOnHoldBookingEntry(@jakarta.annotation.Nullable final String value) {
        this.onHoldBookingEntry = value;
    }
    /**
     * Sets the onHoldCount property value. This integer value indicates the total number of order sales where the associated funds are on hold. Only the orders that match the input criteria are considered.&lt;br&gt;&lt;br&gt;This field is generally returned, even if &lt;code&gt;0&lt;/code&gt;, but it will not be returned if a &lt;strong&gt;transactionStatus&lt;/strong&gt; filter is used, and its value is set to any value other than &lt;code&gt;FUNDS_ON_HOLD&lt;/code&gt;.
     * @param value Value to set for the onHoldCount property.
     */
    public void setOnHoldCount(@jakarta.annotation.Nullable final Integer value) {
        this.onHoldCount = value;
    }
    /**
     * Sets the purchaseAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the purchaseAmount property.
     */
    public void setPurchaseAmount(@jakarta.annotation.Nullable final Amount value) {
        this.purchaseAmount = value;
    }
    /**
     * Sets the purchaseBookingEntry property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;code&gt;PURCHASE&lt;/code&gt; transaction type is currently only applicable in the US marketplace.&lt;/span&gt;&lt;br&gt;This enumeration value indicates whether the dollar amount in the &lt;b&gt;purchase&lt;/b&gt; field is a charge (debit) to the seller or a credit. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the purchaseBookingEntry property.
     */
    public void setPurchaseBookingEntry(@jakarta.annotation.Nullable final String value) {
        this.purchaseBookingEntry = value;
    }
    /**
     * Sets the purchaseCount property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;code&gt;PURCHASE&lt;/code&gt; transaction type is currently only applicable in the US marketplace.&lt;/span&gt;&lt;br&gt;This integer value indicates the total number of purchases that have been initiated by a seller using spendable funds that match the input criteria.&lt;br&gt;&lt;br&gt;This field is generally returned, even if it equals &lt;code&gt;0&lt;/code&gt;. However, it will not be returned if a &lt;code&gt;transactionType&lt;/code&gt; filter is used and its value has been set to any enumeration value other than &lt;code&gt;PURCHASE&lt;/code&gt;.
     * @param value Value to set for the purchaseCount property.
     */
    public void setPurchaseCount(@jakarta.annotation.Nullable final Integer value) {
        this.purchaseCount = value;
    }
    /**
     * Sets the refundAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the refundAmount property.
     */
    public void setRefundAmount(@jakarta.annotation.Nullable final Amount value) {
        this.refundAmount = value;
    }
    /**
     * Sets the refundBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;refundAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;DEBIT&lt;/code&gt; since this a refund from the seller to the buyer. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the refundBookingEntry property.
     */
    public void setRefundBookingEntry(@jakarta.annotation.Nullable final String value) {
        this.refundBookingEntry = value;
    }
    /**
     * Sets the refundCount property value. This integer value indicates the total number of buyer refunds that match the input criteria. &lt;br&gt;&lt;br&gt;This field is generally returned, even if &lt;code&gt;0&lt;/code&gt;, but it will not be returned if a &lt;strong&gt;transactionType&lt;/strong&gt; filter is used, and its value is set to any value other than &lt;code&gt;REFUND&lt;/code&gt;.
     * @param value Value to set for the refundCount property.
     */
    public void setRefundCount(@jakarta.annotation.Nullable final Integer value) {
        this.refundCount = value;
    }
    /**
     * Sets the shippingLabelAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the shippingLabelAmount property.
     */
    public void setShippingLabelAmount(@jakarta.annotation.Nullable final Amount value) {
        this.shippingLabelAmount = value;
    }
    /**
     * Sets the shippingLabelBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;shippingLabelAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;DEBIT&lt;/code&gt;, as eBay will charge the seller when eBay shipping labels are purchased, but it can be &lt;code&gt;CREDIT&lt;/code&gt; if the seller was refunded for a shipping label or was possibly overcharged for a shipping label. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; eBay SHIPPING_LABEL transactions paid through PayPal are not currently supported by the Finances API, so those transactions will not be reflected in this field.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the shippingLabelBookingEntry property.
     */
    public void setShippingLabelBookingEntry(@jakarta.annotation.Nullable final String value) {
        this.shippingLabelBookingEntry = value;
    }
    /**
     * Sets the shippingLabelCount property value. This is the total number of eBay shipping labels purchased by the seller. The count returned here may depend on the specified input criteria.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; eBay SHIPPING_LABEL transactions paid through PayPal are not currently supported by the Finances API, so those transactions will not be reflected in the count returned in this container.&lt;/span&gt;
     * @param value Value to set for the shippingLabelCount property.
     */
    public void setShippingLabelCount(@jakarta.annotation.Nullable final Integer value) {
        this.shippingLabelCount = value;
    }
    /**
     * Sets the transferAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the transferAmount property.
     */
    public void setTransferAmount(@jakarta.annotation.Nullable final Amount value) {
        this.transferAmount = value;
    }
    /**
     * Sets the transferBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;transferAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;DEBIT&lt;/code&gt; since this a seller reimbursement to eBay for buyer refunds. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the transferBookingEntry property.
     */
    public void setTransferBookingEntry(@jakarta.annotation.Nullable final String value) {
        this.transferBookingEntry = value;
    }
    /**
     * Sets the transferCount property value. This integer value indicates the total number of buyer refund transfers that match the input criteria. &lt;br&gt;&lt;br&gt;This field is generally returned, even if &lt;code&gt;0&lt;/code&gt;, but it will not be returned if a &lt;strong&gt;transactionType&lt;/strong&gt; filter is used, and its value is set to any value other than &lt;code&gt;TRANSFER&lt;/code&gt;.
     * @param value Value to set for the transferCount property.
     */
    public void setTransferCount(@jakarta.annotation.Nullable final Integer value) {
        this.transferCount = value;
    }
    /**
     * Sets the withdrawalAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the withdrawalAmount property.
     */
    public void setWithdrawalAmount(@jakarta.annotation.Nullable final Amount value) {
        this.withdrawalAmount = value;
    }
    /**
     * Sets the withdrawalBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;withdrawalAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit. Typically, the enumeration value returned here will be &lt;code&gt;DEBIT&lt;/code&gt; since this transaction involves a debit to the seller&apos;s available payout funds. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the withdrawalBookingEntry property.
     */
    public void setWithdrawalBookingEntry(@jakarta.annotation.Nullable final String value) {
        this.withdrawalBookingEntry = value;
    }
    /**
     * Sets the withdrawalCount property value. This integer value indicates the total number of on-demand payouts (withdrawals) that match the input criteria. &lt;br&gt;&lt;br&gt;This field is generally returned, even if &lt;code&gt;0&lt;/code&gt;, but it will not be returned if a &lt;strong&gt;transactionType&lt;/strong&gt; filter is used, and its value is set to any value other than &lt;code&gt;WITHDRAWAL&lt;/code&gt;.
     * @param value Value to set for the withdrawalCount property.
     */
    public void setWithdrawalCount(@jakarta.annotation.Nullable final Integer value) {
        this.withdrawalCount = value;
    }
}
