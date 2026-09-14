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
 * This type is the base response type of the &lt;strong&gt;getTransactionSummary&lt;/strong&gt; method, and based on the filters that are used in the &lt;strong&gt;getTransactionSummary&lt;/strong&gt; call URI, the response may include total count and amount of the seller&apos;s sales and credits, total count and amount of buyer refunds, and total count and amount of seller payment holds.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TransactionSummaryResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Total adjustment amount for given payee within a specified period.
     */
    private Amount adjustmentAmount;
    /**
     * The credit debit sign indicator for adjustment.
     */
    private BookingEntryEnum adjustmentBookingEntry;
    /**
     * Total adjustment count for given payee within a specified period.
     */
    private Long adjustmentCount;
    /**
     * The total balance transfer amount for given payee within the specified period.
     */
    private Amount balanceTransferAmount;
    /**
     * The credit debit sign indicator for the balance transfer.
     */
    private BookingEntryEnum balanceTransferBookingEntry;
    /**
     * The total balance transfer count for given payee within the specified period.
     */
    private Long balanceTransferCount;
    /**
     * This amount is the total dollar value of all the seller&apos;s sales and/or credits that match the input criteria.
     */
    private Amount creditAmount;
    /**
     * The enumeration value indicates whether the dollar amount in the &lt;strong&gt;creditAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     */
    private BookingEntryEnum creditBookingEntry;
    /**
     * This integer value indicates the total number of the seller&apos;s sales and/or credits that match the input criteria.
     */
    private Long creditCount;
    /**
     * This amount is the total dollar value associated with any existing payment disputes.
     */
    private Amount disputeAmount;
    /**
     * The enumeration value indicates whether the dollar amount in the &lt;strong&gt;disputeAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     */
    private BookingEntryEnum disputeBookingEntry;
    /**
     * This integer value indicates the total number of payment disputes.
     */
    private Long disputeCount;
    /**
     * The sum of all &lt;code&gt;LOAN_REPAYMENT&lt;/code&gt; transactions (i.e., debit and credit,) that match the input criteria.
     */
    private Amount loanRepaymentAmount;
    /**
     * The enumeration value indicates whether the &lt;code&gt;loanRepaymentAmount&lt;/code&gt; is a &lt;code&gt;DEBIT&lt;/code&gt; against, or a &lt;code&gt;CREDIT&lt;/code&gt; to, the sellers&apos;s account.
     */
    private BookingEntryEnum loanRepaymentBookingEntry;
    /**
     * This integer value indicates the total number of &lt;code&gt;LOAN_REPAYMENT&lt;/code&gt; transactions.
     */
    private Long loanRepaymentCount;
    /**
     * The total non-sale charge amount for given payee within a specified period.
     */
    private Amount nonSaleChargeAmount;
    /**
     * The credit/debit sign indicator for the non-sale charge.
     */
    private BookingEntryEnum nonSaleChargeBookingEntry;
    /**
     * The total non-sale charge count for given payee within a specified period.
     */
    private Long nonSaleChargeCount;
    /**
     * This amount is the total dollar value of order sales where the associated funds are on hold.
     */
    private Amount onHoldAmount;
    /**
     * The enumeration value indicates whether the dollar amount in the &lt;strong&gt;onHoldAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     */
    private BookingEntryEnum onHoldBookingEntry;
    /**
     * This integer value indicates the total number of order sales where the associated funds are on hold.
     */
    private Long onHoldCount;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;code&gt;PURCHASE&lt;/code&gt; transaction type is currently only applicable in the US marketplace.&lt;/span&gt;&lt;br&gt;This amount is the total dollar value of all the purchases that have been initiated by a seller using spendable funds.
     */
    private Amount purchaseAmount;
    /**
     * This enumeration value indicates whether the dollar amount in the &lt;b&gt;purchase&lt;/b&gt; field is a charge (debit) to the seller or a credit.
     */
    private BookingEntryEnum purchaseBookingEntry;
    /**
     * This integer value indicates the total number of purchases initiated by a seller using spendable funds.
     */
    private Long purchaseCount;
    /**
     * This amount is the total dollar value of buyer refunds that match the input criteria.
     */
    private Amount refundAmount;
    /**
     * The enumeration value indicates whether the dollar amount in the &lt;strong&gt;refundAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     */
    private BookingEntryEnum refundBookingEntry;
    /**
     * This integer value indicates the total number of buyer refunds that match the input criteria.
     */
    private Long refundCount;
    /**
     * This is the total dollar value of the eBay shipping labels purchased by the seller.
     */
    private Amount shippingLabelAmount;
    /**
     * The enumeration value indicates whether the dollar amount in the &lt;strong&gt;shippingLabelAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     */
    private BookingEntryEnum shippingLabelBookingEntry;
    /**
     * This is the total number of eBay shipping labels purchased by the seller.
     */
    private Long shippingLabelCount;
    /**
     * This amount is the total dollar value of buyer refund transfers that match the input criteria.
     */
    private Amount transferAmount;
    /**
     * The enumeration value indicates whether the dollar amount in the &lt;strong&gt;transferAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     */
    private BookingEntryEnum transferBookingEntry;
    /**
     * This integer value indicates the total number of buyer refund transfers that match the input criteria.
     */
    private Long transferCount;
    /**
     * This amount is the total dollar value of on-demand payouts (withdrawals) that match the input criteria.
     */
    private Amount withdrawalAmount;
    /**
     * The enumeration value indicates whether the dollar amount in the &lt;strong&gt;withdrawalAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     */
    private BookingEntryEnum withdrawalBookingEntry;
    /**
     * This integer value indicates the total number of on-demand payouts (withdrawals) that match the input criteria.
     */
    private Long withdrawalCount;
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
     * Gets the adjustmentAmount property value. Total adjustment amount for given payee within a specified period.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAdjustmentAmount() {
        return this.adjustmentAmount;
    }
    /**
     * Gets the adjustmentBookingEntry property value. The credit debit sign indicator for adjustment.
     * @return a {@link BookingEntryEnum}
     */
    @jakarta.annotation.Nullable
    public BookingEntryEnum getAdjustmentBookingEntry() {
        return this.adjustmentBookingEntry;
    }
    /**
     * Gets the adjustmentCount property value. Total adjustment count for given payee within a specified period.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getAdjustmentCount() {
        return this.adjustmentCount;
    }
    /**
     * Gets the balanceTransferAmount property value. The total balance transfer amount for given payee within the specified period.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getBalanceTransferAmount() {
        return this.balanceTransferAmount;
    }
    /**
     * Gets the balanceTransferBookingEntry property value. The credit debit sign indicator for the balance transfer.
     * @return a {@link BookingEntryEnum}
     */
    @jakarta.annotation.Nullable
    public BookingEntryEnum getBalanceTransferBookingEntry() {
        return this.balanceTransferBookingEntry;
    }
    /**
     * Gets the balanceTransferCount property value. The total balance transfer count for given payee within the specified period.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getBalanceTransferCount() {
        return this.balanceTransferCount;
    }
    /**
     * Gets the creditAmount property value. This amount is the total dollar value of all the seller&apos;s sales and/or credits that match the input criteria.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getCreditAmount() {
        return this.creditAmount;
    }
    /**
     * Gets the creditBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;creditAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     * @return a {@link BookingEntryEnum}
     */
    @jakarta.annotation.Nullable
    public BookingEntryEnum getCreditBookingEntry() {
        return this.creditBookingEntry;
    }
    /**
     * Gets the creditCount property value. This integer value indicates the total number of the seller&apos;s sales and/or credits that match the input criteria.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCreditCount() {
        return this.creditCount;
    }
    /**
     * Gets the disputeAmount property value. This amount is the total dollar value associated with any existing payment disputes.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getDisputeAmount() {
        return this.disputeAmount;
    }
    /**
     * Gets the disputeBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;disputeAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     * @return a {@link BookingEntryEnum}
     */
    @jakarta.annotation.Nullable
    public BookingEntryEnum getDisputeBookingEntry() {
        return this.disputeBookingEntry;
    }
    /**
     * Gets the disputeCount property value. This integer value indicates the total number of payment disputes.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getDisputeCount() {
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
        deserializerMap.put("adjustmentBookingEntry", (n) -> { this.setAdjustmentBookingEntry(n.getEnumValue(BookingEntryEnum::forValue)); });
        deserializerMap.put("adjustmentCount", (n) -> { this.setAdjustmentCount(n.getLongValue()); });
        deserializerMap.put("balanceTransferAmount", (n) -> { this.setBalanceTransferAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("balanceTransferBookingEntry", (n) -> { this.setBalanceTransferBookingEntry(n.getEnumValue(BookingEntryEnum::forValue)); });
        deserializerMap.put("balanceTransferCount", (n) -> { this.setBalanceTransferCount(n.getLongValue()); });
        deserializerMap.put("creditAmount", (n) -> { this.setCreditAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("creditBookingEntry", (n) -> { this.setCreditBookingEntry(n.getEnumValue(BookingEntryEnum::forValue)); });
        deserializerMap.put("creditCount", (n) -> { this.setCreditCount(n.getLongValue()); });
        deserializerMap.put("disputeAmount", (n) -> { this.setDisputeAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("disputeBookingEntry", (n) -> { this.setDisputeBookingEntry(n.getEnumValue(BookingEntryEnum::forValue)); });
        deserializerMap.put("disputeCount", (n) -> { this.setDisputeCount(n.getLongValue()); });
        deserializerMap.put("loanRepaymentAmount", (n) -> { this.setLoanRepaymentAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("loanRepaymentBookingEntry", (n) -> { this.setLoanRepaymentBookingEntry(n.getEnumValue(BookingEntryEnum::forValue)); });
        deserializerMap.put("loanRepaymentCount", (n) -> { this.setLoanRepaymentCount(n.getLongValue()); });
        deserializerMap.put("nonSaleChargeAmount", (n) -> { this.setNonSaleChargeAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("nonSaleChargeBookingEntry", (n) -> { this.setNonSaleChargeBookingEntry(n.getEnumValue(BookingEntryEnum::forValue)); });
        deserializerMap.put("nonSaleChargeCount", (n) -> { this.setNonSaleChargeCount(n.getLongValue()); });
        deserializerMap.put("onHoldAmount", (n) -> { this.setOnHoldAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("onHoldBookingEntry", (n) -> { this.setOnHoldBookingEntry(n.getEnumValue(BookingEntryEnum::forValue)); });
        deserializerMap.put("onHoldCount", (n) -> { this.setOnHoldCount(n.getLongValue()); });
        deserializerMap.put("purchaseAmount", (n) -> { this.setPurchaseAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("purchaseBookingEntry", (n) -> { this.setPurchaseBookingEntry(n.getEnumValue(BookingEntryEnum::forValue)); });
        deserializerMap.put("purchaseCount", (n) -> { this.setPurchaseCount(n.getLongValue()); });
        deserializerMap.put("refundAmount", (n) -> { this.setRefundAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("refundBookingEntry", (n) -> { this.setRefundBookingEntry(n.getEnumValue(BookingEntryEnum::forValue)); });
        deserializerMap.put("refundCount", (n) -> { this.setRefundCount(n.getLongValue()); });
        deserializerMap.put("shippingLabelAmount", (n) -> { this.setShippingLabelAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("shippingLabelBookingEntry", (n) -> { this.setShippingLabelBookingEntry(n.getEnumValue(BookingEntryEnum::forValue)); });
        deserializerMap.put("shippingLabelCount", (n) -> { this.setShippingLabelCount(n.getLongValue()); });
        deserializerMap.put("transferAmount", (n) -> { this.setTransferAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("transferBookingEntry", (n) -> { this.setTransferBookingEntry(n.getEnumValue(BookingEntryEnum::forValue)); });
        deserializerMap.put("transferCount", (n) -> { this.setTransferCount(n.getLongValue()); });
        deserializerMap.put("withdrawalAmount", (n) -> { this.setWithdrawalAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("withdrawalBookingEntry", (n) -> { this.setWithdrawalBookingEntry(n.getEnumValue(BookingEntryEnum::forValue)); });
        deserializerMap.put("withdrawalCount", (n) -> { this.setWithdrawalCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the loanRepaymentAmount property value. The sum of all &lt;code&gt;LOAN_REPAYMENT&lt;/code&gt; transactions (i.e., debit and credit,) that match the input criteria.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getLoanRepaymentAmount() {
        return this.loanRepaymentAmount;
    }
    /**
     * Gets the loanRepaymentBookingEntry property value. The enumeration value indicates whether the &lt;code&gt;loanRepaymentAmount&lt;/code&gt; is a &lt;code&gt;DEBIT&lt;/code&gt; against, or a &lt;code&gt;CREDIT&lt;/code&gt; to, the sellers&apos;s account.
     * @return a {@link BookingEntryEnum}
     */
    @jakarta.annotation.Nullable
    public BookingEntryEnum getLoanRepaymentBookingEntry() {
        return this.loanRepaymentBookingEntry;
    }
    /**
     * Gets the loanRepaymentCount property value. This integer value indicates the total number of &lt;code&gt;LOAN_REPAYMENT&lt;/code&gt; transactions.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getLoanRepaymentCount() {
        return this.loanRepaymentCount;
    }
    /**
     * Gets the nonSaleChargeAmount property value. The total non-sale charge amount for given payee within a specified period.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getNonSaleChargeAmount() {
        return this.nonSaleChargeAmount;
    }
    /**
     * Gets the nonSaleChargeBookingEntry property value. The credit/debit sign indicator for the non-sale charge.
     * @return a {@link BookingEntryEnum}
     */
    @jakarta.annotation.Nullable
    public BookingEntryEnum getNonSaleChargeBookingEntry() {
        return this.nonSaleChargeBookingEntry;
    }
    /**
     * Gets the nonSaleChargeCount property value. The total non-sale charge count for given payee within a specified period.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getNonSaleChargeCount() {
        return this.nonSaleChargeCount;
    }
    /**
     * Gets the onHoldAmount property value. This amount is the total dollar value of order sales where the associated funds are on hold.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getOnHoldAmount() {
        return this.onHoldAmount;
    }
    /**
     * Gets the onHoldBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;onHoldAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     * @return a {@link BookingEntryEnum}
     */
    @jakarta.annotation.Nullable
    public BookingEntryEnum getOnHoldBookingEntry() {
        return this.onHoldBookingEntry;
    }
    /**
     * Gets the onHoldCount property value. This integer value indicates the total number of order sales where the associated funds are on hold.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getOnHoldCount() {
        return this.onHoldCount;
    }
    /**
     * Gets the purchaseAmount property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;code&gt;PURCHASE&lt;/code&gt; transaction type is currently only applicable in the US marketplace.&lt;/span&gt;&lt;br&gt;This amount is the total dollar value of all the purchases that have been initiated by a seller using spendable funds.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getPurchaseAmount() {
        return this.purchaseAmount;
    }
    /**
     * Gets the purchaseBookingEntry property value. This enumeration value indicates whether the dollar amount in the &lt;b&gt;purchase&lt;/b&gt; field is a charge (debit) to the seller or a credit.
     * @return a {@link BookingEntryEnum}
     */
    @jakarta.annotation.Nullable
    public BookingEntryEnum getPurchaseBookingEntry() {
        return this.purchaseBookingEntry;
    }
    /**
     * Gets the purchaseCount property value. This integer value indicates the total number of purchases initiated by a seller using spendable funds.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPurchaseCount() {
        return this.purchaseCount;
    }
    /**
     * Gets the refundAmount property value. This amount is the total dollar value of buyer refunds that match the input criteria.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getRefundAmount() {
        return this.refundAmount;
    }
    /**
     * Gets the refundBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;refundAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     * @return a {@link BookingEntryEnum}
     */
    @jakarta.annotation.Nullable
    public BookingEntryEnum getRefundBookingEntry() {
        return this.refundBookingEntry;
    }
    /**
     * Gets the refundCount property value. This integer value indicates the total number of buyer refunds that match the input criteria.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getRefundCount() {
        return this.refundCount;
    }
    /**
     * Gets the shippingLabelAmount property value. This is the total dollar value of the eBay shipping labels purchased by the seller.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getShippingLabelAmount() {
        return this.shippingLabelAmount;
    }
    /**
     * Gets the shippingLabelBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;shippingLabelAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     * @return a {@link BookingEntryEnum}
     */
    @jakarta.annotation.Nullable
    public BookingEntryEnum getShippingLabelBookingEntry() {
        return this.shippingLabelBookingEntry;
    }
    /**
     * Gets the shippingLabelCount property value. This is the total number of eBay shipping labels purchased by the seller.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getShippingLabelCount() {
        return this.shippingLabelCount;
    }
    /**
     * Gets the transferAmount property value. This amount is the total dollar value of buyer refund transfers that match the input criteria.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTransferAmount() {
        return this.transferAmount;
    }
    /**
     * Gets the transferBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;transferAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     * @return a {@link BookingEntryEnum}
     */
    @jakarta.annotation.Nullable
    public BookingEntryEnum getTransferBookingEntry() {
        return this.transferBookingEntry;
    }
    /**
     * Gets the transferCount property value. This integer value indicates the total number of buyer refund transfers that match the input criteria.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTransferCount() {
        return this.transferCount;
    }
    /**
     * Gets the withdrawalAmount property value. This amount is the total dollar value of on-demand payouts (withdrawals) that match the input criteria.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getWithdrawalAmount() {
        return this.withdrawalAmount;
    }
    /**
     * Gets the withdrawalBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;withdrawalAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     * @return a {@link BookingEntryEnum}
     */
    @jakarta.annotation.Nullable
    public BookingEntryEnum getWithdrawalBookingEntry() {
        return this.withdrawalBookingEntry;
    }
    /**
     * Gets the withdrawalCount property value. This integer value indicates the total number of on-demand payouts (withdrawals) that match the input criteria.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getWithdrawalCount() {
        return this.withdrawalCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("adjustmentAmount", this.getAdjustmentAmount());
        writer.writeEnumValue("adjustmentBookingEntry", this.getAdjustmentBookingEntry());
        writer.writeLongValue("adjustmentCount", this.getAdjustmentCount());
        writer.writeObjectValue("balanceTransferAmount", this.getBalanceTransferAmount());
        writer.writeEnumValue("balanceTransferBookingEntry", this.getBalanceTransferBookingEntry());
        writer.writeLongValue("balanceTransferCount", this.getBalanceTransferCount());
        writer.writeObjectValue("creditAmount", this.getCreditAmount());
        writer.writeEnumValue("creditBookingEntry", this.getCreditBookingEntry());
        writer.writeLongValue("creditCount", this.getCreditCount());
        writer.writeObjectValue("disputeAmount", this.getDisputeAmount());
        writer.writeEnumValue("disputeBookingEntry", this.getDisputeBookingEntry());
        writer.writeLongValue("disputeCount", this.getDisputeCount());
        writer.writeObjectValue("loanRepaymentAmount", this.getLoanRepaymentAmount());
        writer.writeEnumValue("loanRepaymentBookingEntry", this.getLoanRepaymentBookingEntry());
        writer.writeLongValue("loanRepaymentCount", this.getLoanRepaymentCount());
        writer.writeObjectValue("nonSaleChargeAmount", this.getNonSaleChargeAmount());
        writer.writeEnumValue("nonSaleChargeBookingEntry", this.getNonSaleChargeBookingEntry());
        writer.writeLongValue("nonSaleChargeCount", this.getNonSaleChargeCount());
        writer.writeObjectValue("onHoldAmount", this.getOnHoldAmount());
        writer.writeEnumValue("onHoldBookingEntry", this.getOnHoldBookingEntry());
        writer.writeLongValue("onHoldCount", this.getOnHoldCount());
        writer.writeObjectValue("purchaseAmount", this.getPurchaseAmount());
        writer.writeEnumValue("purchaseBookingEntry", this.getPurchaseBookingEntry());
        writer.writeLongValue("purchaseCount", this.getPurchaseCount());
        writer.writeObjectValue("refundAmount", this.getRefundAmount());
        writer.writeEnumValue("refundBookingEntry", this.getRefundBookingEntry());
        writer.writeLongValue("refundCount", this.getRefundCount());
        writer.writeObjectValue("shippingLabelAmount", this.getShippingLabelAmount());
        writer.writeEnumValue("shippingLabelBookingEntry", this.getShippingLabelBookingEntry());
        writer.writeLongValue("shippingLabelCount", this.getShippingLabelCount());
        writer.writeObjectValue("transferAmount", this.getTransferAmount());
        writer.writeEnumValue("transferBookingEntry", this.getTransferBookingEntry());
        writer.writeLongValue("transferCount", this.getTransferCount());
        writer.writeObjectValue("withdrawalAmount", this.getWithdrawalAmount());
        writer.writeEnumValue("withdrawalBookingEntry", this.getWithdrawalBookingEntry());
        writer.writeLongValue("withdrawalCount", this.getWithdrawalCount());
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
     * Sets the adjustmentAmount property value. Total adjustment amount for given payee within a specified period.
     * @param value Value to set for the adjustmentAmount property.
     */
    public void setAdjustmentAmount(@jakarta.annotation.Nullable final Amount value) {
        this.adjustmentAmount = value;
    }
    /**
     * Sets the adjustmentBookingEntry property value. The credit debit sign indicator for adjustment.
     * @param value Value to set for the adjustmentBookingEntry property.
     */
    public void setAdjustmentBookingEntry(@jakarta.annotation.Nullable final BookingEntryEnum value) {
        this.adjustmentBookingEntry = value;
    }
    /**
     * Sets the adjustmentCount property value. Total adjustment count for given payee within a specified period.
     * @param value Value to set for the adjustmentCount property.
     */
    public void setAdjustmentCount(@jakarta.annotation.Nullable final Long value) {
        this.adjustmentCount = value;
    }
    /**
     * Sets the balanceTransferAmount property value. The total balance transfer amount for given payee within the specified period.
     * @param value Value to set for the balanceTransferAmount property.
     */
    public void setBalanceTransferAmount(@jakarta.annotation.Nullable final Amount value) {
        this.balanceTransferAmount = value;
    }
    /**
     * Sets the balanceTransferBookingEntry property value. The credit debit sign indicator for the balance transfer.
     * @param value Value to set for the balanceTransferBookingEntry property.
     */
    public void setBalanceTransferBookingEntry(@jakarta.annotation.Nullable final BookingEntryEnum value) {
        this.balanceTransferBookingEntry = value;
    }
    /**
     * Sets the balanceTransferCount property value. The total balance transfer count for given payee within the specified period.
     * @param value Value to set for the balanceTransferCount property.
     */
    public void setBalanceTransferCount(@jakarta.annotation.Nullable final Long value) {
        this.balanceTransferCount = value;
    }
    /**
     * Sets the creditAmount property value. This amount is the total dollar value of all the seller&apos;s sales and/or credits that match the input criteria.
     * @param value Value to set for the creditAmount property.
     */
    public void setCreditAmount(@jakarta.annotation.Nullable final Amount value) {
        this.creditAmount = value;
    }
    /**
     * Sets the creditBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;creditAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     * @param value Value to set for the creditBookingEntry property.
     */
    public void setCreditBookingEntry(@jakarta.annotation.Nullable final BookingEntryEnum value) {
        this.creditBookingEntry = value;
    }
    /**
     * Sets the creditCount property value. This integer value indicates the total number of the seller&apos;s sales and/or credits that match the input criteria.
     * @param value Value to set for the creditCount property.
     */
    public void setCreditCount(@jakarta.annotation.Nullable final Long value) {
        this.creditCount = value;
    }
    /**
     * Sets the disputeAmount property value. This amount is the total dollar value associated with any existing payment disputes.
     * @param value Value to set for the disputeAmount property.
     */
    public void setDisputeAmount(@jakarta.annotation.Nullable final Amount value) {
        this.disputeAmount = value;
    }
    /**
     * Sets the disputeBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;disputeAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     * @param value Value to set for the disputeBookingEntry property.
     */
    public void setDisputeBookingEntry(@jakarta.annotation.Nullable final BookingEntryEnum value) {
        this.disputeBookingEntry = value;
    }
    /**
     * Sets the disputeCount property value. This integer value indicates the total number of payment disputes.
     * @param value Value to set for the disputeCount property.
     */
    public void setDisputeCount(@jakarta.annotation.Nullable final Long value) {
        this.disputeCount = value;
    }
    /**
     * Sets the loanRepaymentAmount property value. The sum of all &lt;code&gt;LOAN_REPAYMENT&lt;/code&gt; transactions (i.e., debit and credit,) that match the input criteria.
     * @param value Value to set for the loanRepaymentAmount property.
     */
    public void setLoanRepaymentAmount(@jakarta.annotation.Nullable final Amount value) {
        this.loanRepaymentAmount = value;
    }
    /**
     * Sets the loanRepaymentBookingEntry property value. The enumeration value indicates whether the &lt;code&gt;loanRepaymentAmount&lt;/code&gt; is a &lt;code&gt;DEBIT&lt;/code&gt; against, or a &lt;code&gt;CREDIT&lt;/code&gt; to, the sellers&apos;s account.
     * @param value Value to set for the loanRepaymentBookingEntry property.
     */
    public void setLoanRepaymentBookingEntry(@jakarta.annotation.Nullable final BookingEntryEnum value) {
        this.loanRepaymentBookingEntry = value;
    }
    /**
     * Sets the loanRepaymentCount property value. This integer value indicates the total number of &lt;code&gt;LOAN_REPAYMENT&lt;/code&gt; transactions.
     * @param value Value to set for the loanRepaymentCount property.
     */
    public void setLoanRepaymentCount(@jakarta.annotation.Nullable final Long value) {
        this.loanRepaymentCount = value;
    }
    /**
     * Sets the nonSaleChargeAmount property value. The total non-sale charge amount for given payee within a specified period.
     * @param value Value to set for the nonSaleChargeAmount property.
     */
    public void setNonSaleChargeAmount(@jakarta.annotation.Nullable final Amount value) {
        this.nonSaleChargeAmount = value;
    }
    /**
     * Sets the nonSaleChargeBookingEntry property value. The credit/debit sign indicator for the non-sale charge.
     * @param value Value to set for the nonSaleChargeBookingEntry property.
     */
    public void setNonSaleChargeBookingEntry(@jakarta.annotation.Nullable final BookingEntryEnum value) {
        this.nonSaleChargeBookingEntry = value;
    }
    /**
     * Sets the nonSaleChargeCount property value. The total non-sale charge count for given payee within a specified period.
     * @param value Value to set for the nonSaleChargeCount property.
     */
    public void setNonSaleChargeCount(@jakarta.annotation.Nullable final Long value) {
        this.nonSaleChargeCount = value;
    }
    /**
     * Sets the onHoldAmount property value. This amount is the total dollar value of order sales where the associated funds are on hold.
     * @param value Value to set for the onHoldAmount property.
     */
    public void setOnHoldAmount(@jakarta.annotation.Nullable final Amount value) {
        this.onHoldAmount = value;
    }
    /**
     * Sets the onHoldBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;onHoldAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     * @param value Value to set for the onHoldBookingEntry property.
     */
    public void setOnHoldBookingEntry(@jakarta.annotation.Nullable final BookingEntryEnum value) {
        this.onHoldBookingEntry = value;
    }
    /**
     * Sets the onHoldCount property value. This integer value indicates the total number of order sales where the associated funds are on hold.
     * @param value Value to set for the onHoldCount property.
     */
    public void setOnHoldCount(@jakarta.annotation.Nullable final Long value) {
        this.onHoldCount = value;
    }
    /**
     * Sets the purchaseAmount property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;code&gt;PURCHASE&lt;/code&gt; transaction type is currently only applicable in the US marketplace.&lt;/span&gt;&lt;br&gt;This amount is the total dollar value of all the purchases that have been initiated by a seller using spendable funds.
     * @param value Value to set for the purchaseAmount property.
     */
    public void setPurchaseAmount(@jakarta.annotation.Nullable final Amount value) {
        this.purchaseAmount = value;
    }
    /**
     * Sets the purchaseBookingEntry property value. This enumeration value indicates whether the dollar amount in the &lt;b&gt;purchase&lt;/b&gt; field is a charge (debit) to the seller or a credit.
     * @param value Value to set for the purchaseBookingEntry property.
     */
    public void setPurchaseBookingEntry(@jakarta.annotation.Nullable final BookingEntryEnum value) {
        this.purchaseBookingEntry = value;
    }
    /**
     * Sets the purchaseCount property value. This integer value indicates the total number of purchases initiated by a seller using spendable funds.
     * @param value Value to set for the purchaseCount property.
     */
    public void setPurchaseCount(@jakarta.annotation.Nullable final Long value) {
        this.purchaseCount = value;
    }
    /**
     * Sets the refundAmount property value. This amount is the total dollar value of buyer refunds that match the input criteria.
     * @param value Value to set for the refundAmount property.
     */
    public void setRefundAmount(@jakarta.annotation.Nullable final Amount value) {
        this.refundAmount = value;
    }
    /**
     * Sets the refundBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;refundAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     * @param value Value to set for the refundBookingEntry property.
     */
    public void setRefundBookingEntry(@jakarta.annotation.Nullable final BookingEntryEnum value) {
        this.refundBookingEntry = value;
    }
    /**
     * Sets the refundCount property value. This integer value indicates the total number of buyer refunds that match the input criteria.
     * @param value Value to set for the refundCount property.
     */
    public void setRefundCount(@jakarta.annotation.Nullable final Long value) {
        this.refundCount = value;
    }
    /**
     * Sets the shippingLabelAmount property value. This is the total dollar value of the eBay shipping labels purchased by the seller.
     * @param value Value to set for the shippingLabelAmount property.
     */
    public void setShippingLabelAmount(@jakarta.annotation.Nullable final Amount value) {
        this.shippingLabelAmount = value;
    }
    /**
     * Sets the shippingLabelBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;shippingLabelAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     * @param value Value to set for the shippingLabelBookingEntry property.
     */
    public void setShippingLabelBookingEntry(@jakarta.annotation.Nullable final BookingEntryEnum value) {
        this.shippingLabelBookingEntry = value;
    }
    /**
     * Sets the shippingLabelCount property value. This is the total number of eBay shipping labels purchased by the seller.
     * @param value Value to set for the shippingLabelCount property.
     */
    public void setShippingLabelCount(@jakarta.annotation.Nullable final Long value) {
        this.shippingLabelCount = value;
    }
    /**
     * Sets the transferAmount property value. This amount is the total dollar value of buyer refund transfers that match the input criteria.
     * @param value Value to set for the transferAmount property.
     */
    public void setTransferAmount(@jakarta.annotation.Nullable final Amount value) {
        this.transferAmount = value;
    }
    /**
     * Sets the transferBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;transferAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     * @param value Value to set for the transferBookingEntry property.
     */
    public void setTransferBookingEntry(@jakarta.annotation.Nullable final BookingEntryEnum value) {
        this.transferBookingEntry = value;
    }
    /**
     * Sets the transferCount property value. This integer value indicates the total number of buyer refund transfers that match the input criteria.
     * @param value Value to set for the transferCount property.
     */
    public void setTransferCount(@jakarta.annotation.Nullable final Long value) {
        this.transferCount = value;
    }
    /**
     * Sets the withdrawalAmount property value. This amount is the total dollar value of on-demand payouts (withdrawals) that match the input criteria.
     * @param value Value to set for the withdrawalAmount property.
     */
    public void setWithdrawalAmount(@jakarta.annotation.Nullable final Amount value) {
        this.withdrawalAmount = value;
    }
    /**
     * Sets the withdrawalBookingEntry property value. The enumeration value indicates whether the dollar amount in the &lt;strong&gt;withdrawalAmount&lt;/strong&gt; field is a charge (debit) to the seller or a credit.
     * @param value Value to set for the withdrawalBookingEntry property.
     */
    public void setWithdrawalBookingEntry(@jakarta.annotation.Nullable final BookingEntryEnum value) {
        this.withdrawalBookingEntry = value;
    }
    /**
     * Sets the withdrawalCount property value. This integer value indicates the total number of on-demand payouts (withdrawals) that match the input criteria.
     * @param value Value to set for the withdrawalCount property.
     */
    public void setWithdrawalCount(@jakarta.annotation.Nullable final Long value) {
        this.withdrawalCount = value;
    }
}
