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
 * This type is used to express the details of one seller payout that is returned with the &lt;strong&gt;getPayout&lt;/strong&gt; or &lt;strong&gt;getPayouts&lt;/strong&gt; methods.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Payout implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount amount;
    /**
     * This field contains additional information provided by the bank and passed on by the payment processor; e.g., the manner in which the transaction will appear on the seller&apos;s bank statement. The field is returned only when provided by the bank and processor.
     */
    private String bankReference;
    /**
     * This timestamp indicates the date/time when eBay last attempted to process a seller payout but it failed. This field is only returned if a seller payout fails, and the &lt;strong&gt;payoutStatus&lt;/strong&gt; value shows &lt;code&gt;RETRYABLE_FAILED&lt;/code&gt; or &lt;code&gt;TERMINAL_FAILED&lt;/code&gt;. A seller can filter on the &lt;b&gt;lastAttemptedPayoutDate&lt;/b&gt; in a &lt;b&gt;getPayouts&lt;/b&gt; request.
     */
    private String lastAttemptedPayoutDate;
    /**
     * This timestamp indicates when the seller payout began processing. The following format is used: &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. For example, &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;. This field is still returned even if the payout was pending but failed (&lt;strong&gt;payoutStatus&lt;/strong&gt; value shows &lt;code&gt;RETRYABLE_FAILED&lt;/code&gt; or &lt;code&gt;TERMINAL_FAILED&lt;/code&gt;).
     */
    private String payoutDate;
    /**
     * The unique identifier of the seller payout. This identifier is generated once eBay begins processing the payout to the seller&apos;s bank account.
     */
    private String payoutId;
    /**
     * This type is used to provide details about one or two of the seller&apos;s accounts that are enabled to receive payouts.
     */
    private PayoutInstrument payoutInstrument;
    /**
     * This field contains information provided by upstream components, based on internal and external commitments. A typical message would contain the expected arrival time of the payout.
     */
    private String payoutMemo;
    /**
     * This field contains the unique identifier for the Payout Reference. In split-payout cases, this is the unique identifier reference (not true payout). This field is only returned and will show the associated true(actual) payout id(s) when sellers in Mainland China enable split payouts between a Payoneer account and/or a bank account. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;Split-payout functionality will &lt;b&gt;only&lt;/b&gt; be available to mainland China sellers.&lt;/span&gt;
     */
    private String payoutReference;
    /**
     * This enumeration value indicates the current status of the seller payout. For a successful payout, the value returned will be &lt;code&gt;SUCCEEDED&lt;/code&gt;. See the &lt;strong&gt;PayoutStatusEnum&lt;/strong&gt; type for more details on each payout status value. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:PayoutStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String payoutStatus;
    /**
     * This field provides more details about the current status of payout. The description returned here will correspond with enumeration value returned in the &lt;strong&gt;payoutStatus&lt;/strong&gt; field. The following shows what description text might appear based on the different &lt;strong&gt;payoutStatus&lt;/strong&gt; values:&lt;ul&gt;&lt;li&gt;&lt;code&gt;INITIATED&lt;/code&gt;: &lt;em&gt;Preparing to send&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;SUCCEEDED&lt;/code&gt;: &lt;em&gt;Funds sent&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;REVERSED&lt;/code&gt;: &lt;em&gt;Waiting to retry : Money rejected by seller&apos;s bank&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RETRYABLE_FAILED&lt;/code&gt;: &lt;em&gt;Waiting to retry&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;TERMINAL_FAILED&lt;/code&gt;: &lt;em&gt;Payout failed&lt;/em&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private String payoutStatusDescription;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount totalAmount;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount totalFee;
    /**
     * This array indicates all payout fees associated with a payout, including the fee type, amount, value, and currency.
     */
    private java.util.List<Fee> totalFeeDetails;
    /**
     * This integer value indicates the number of monetary transactions (all orders, refunds, and credits, etc.) that have occurred with the corresponding payout. Its value should always be at least &lt;code&gt;1&lt;/code&gt;, since there is at least one order per seller payout.&lt;br/&gt;&lt;br/&gt;For split payouts, each of the two sibling payouts would be considered its own transaction. Because of this, if a seller had a payout for one order, but split the order between two accounts, the value would be &lt;code&gt;2&lt;/code&gt; instead of &lt;code&gt;1&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;Split-payout functionality is &lt;b&gt;only&lt;/b&gt; applicable to mainland China sellers. &lt;/span&gt;
     */
    private Integer transactionCount;
    /**
     * Instantiates a new {@link Payout} and sets the default values.
     */
    public Payout() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Payout}
     */
    @jakarta.annotation.Nonnull
    public static Payout createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Payout();
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
     * Gets the bankReference property value. This field contains additional information provided by the bank and passed on by the payment processor; e.g., the manner in which the transaction will appear on the seller&apos;s bank statement. The field is returned only when provided by the bank and processor.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBankReference() {
        return this.bankReference;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("bankReference", (n) -> { this.setBankReference(n.getStringValue()); });
        deserializerMap.put("lastAttemptedPayoutDate", (n) -> { this.setLastAttemptedPayoutDate(n.getStringValue()); });
        deserializerMap.put("payoutDate", (n) -> { this.setPayoutDate(n.getStringValue()); });
        deserializerMap.put("payoutId", (n) -> { this.setPayoutId(n.getStringValue()); });
        deserializerMap.put("payoutInstrument", (n) -> { this.setPayoutInstrument(n.getObjectValue(PayoutInstrument::createFromDiscriminatorValue)); });
        deserializerMap.put("payoutMemo", (n) -> { this.setPayoutMemo(n.getStringValue()); });
        deserializerMap.put("payoutReference", (n) -> { this.setPayoutReference(n.getStringValue()); });
        deserializerMap.put("payoutStatus", (n) -> { this.setPayoutStatus(n.getStringValue()); });
        deserializerMap.put("payoutStatusDescription", (n) -> { this.setPayoutStatusDescription(n.getStringValue()); });
        deserializerMap.put("totalAmount", (n) -> { this.setTotalAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("totalFee", (n) -> { this.setTotalFee(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("totalFeeDetails", (n) -> { this.setTotalFeeDetails(n.getCollectionOfObjectValues(Fee::createFromDiscriminatorValue)); });
        deserializerMap.put("transactionCount", (n) -> { this.setTransactionCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastAttemptedPayoutDate property value. This timestamp indicates the date/time when eBay last attempted to process a seller payout but it failed. This field is only returned if a seller payout fails, and the &lt;strong&gt;payoutStatus&lt;/strong&gt; value shows &lt;code&gt;RETRYABLE_FAILED&lt;/code&gt; or &lt;code&gt;TERMINAL_FAILED&lt;/code&gt;. A seller can filter on the &lt;b&gt;lastAttemptedPayoutDate&lt;/b&gt; in a &lt;b&gt;getPayouts&lt;/b&gt; request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastAttemptedPayoutDate() {
        return this.lastAttemptedPayoutDate;
    }
    /**
     * Gets the payoutDate property value. This timestamp indicates when the seller payout began processing. The following format is used: &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. For example, &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;. This field is still returned even if the payout was pending but failed (&lt;strong&gt;payoutStatus&lt;/strong&gt; value shows &lt;code&gt;RETRYABLE_FAILED&lt;/code&gt; or &lt;code&gt;TERMINAL_FAILED&lt;/code&gt;).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPayoutDate() {
        return this.payoutDate;
    }
    /**
     * Gets the payoutId property value. The unique identifier of the seller payout. This identifier is generated once eBay begins processing the payout to the seller&apos;s bank account.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPayoutId() {
        return this.payoutId;
    }
    /**
     * Gets the payoutInstrument property value. This type is used to provide details about one or two of the seller&apos;s accounts that are enabled to receive payouts.
     * @return a {@link PayoutInstrument}
     */
    @jakarta.annotation.Nullable
    public PayoutInstrument getPayoutInstrument() {
        return this.payoutInstrument;
    }
    /**
     * Gets the payoutMemo property value. This field contains information provided by upstream components, based on internal and external commitments. A typical message would contain the expected arrival time of the payout.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPayoutMemo() {
        return this.payoutMemo;
    }
    /**
     * Gets the payoutReference property value. This field contains the unique identifier for the Payout Reference. In split-payout cases, this is the unique identifier reference (not true payout). This field is only returned and will show the associated true(actual) payout id(s) when sellers in Mainland China enable split payouts between a Payoneer account and/or a bank account. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;Split-payout functionality will &lt;b&gt;only&lt;/b&gt; be available to mainland China sellers.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPayoutReference() {
        return this.payoutReference;
    }
    /**
     * Gets the payoutStatus property value. This enumeration value indicates the current status of the seller payout. For a successful payout, the value returned will be &lt;code&gt;SUCCEEDED&lt;/code&gt;. See the &lt;strong&gt;PayoutStatusEnum&lt;/strong&gt; type for more details on each payout status value. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:PayoutStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPayoutStatus() {
        return this.payoutStatus;
    }
    /**
     * Gets the payoutStatusDescription property value. This field provides more details about the current status of payout. The description returned here will correspond with enumeration value returned in the &lt;strong&gt;payoutStatus&lt;/strong&gt; field. The following shows what description text might appear based on the different &lt;strong&gt;payoutStatus&lt;/strong&gt; values:&lt;ul&gt;&lt;li&gt;&lt;code&gt;INITIATED&lt;/code&gt;: &lt;em&gt;Preparing to send&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;SUCCEEDED&lt;/code&gt;: &lt;em&gt;Funds sent&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;REVERSED&lt;/code&gt;: &lt;em&gt;Waiting to retry : Money rejected by seller&apos;s bank&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RETRYABLE_FAILED&lt;/code&gt;: &lt;em&gt;Waiting to retry&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;TERMINAL_FAILED&lt;/code&gt;: &lt;em&gt;Payout failed&lt;/em&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPayoutStatusDescription() {
        return this.payoutStatusDescription;
    }
    /**
     * Gets the totalAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTotalAmount() {
        return this.totalAmount;
    }
    /**
     * Gets the totalFee property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTotalFee() {
        return this.totalFee;
    }
    /**
     * Gets the totalFeeDetails property value. This array indicates all payout fees associated with a payout, including the fee type, amount, value, and currency.
     * @return a {@link java.util.List<Fee>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Fee> getTotalFeeDetails() {
        return this.totalFeeDetails;
    }
    /**
     * Gets the transactionCount property value. This integer value indicates the number of monetary transactions (all orders, refunds, and credits, etc.) that have occurred with the corresponding payout. Its value should always be at least &lt;code&gt;1&lt;/code&gt;, since there is at least one order per seller payout.&lt;br/&gt;&lt;br/&gt;For split payouts, each of the two sibling payouts would be considered its own transaction. Because of this, if a seller had a payout for one order, but split the order between two accounts, the value would be &lt;code&gt;2&lt;/code&gt; instead of &lt;code&gt;1&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;Split-payout functionality is &lt;b&gt;only&lt;/b&gt; applicable to mainland China sellers. &lt;/span&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTransactionCount() {
        return this.transactionCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeStringValue("bankReference", this.getBankReference());
        writer.writeStringValue("lastAttemptedPayoutDate", this.getLastAttemptedPayoutDate());
        writer.writeStringValue("payoutDate", this.getPayoutDate());
        writer.writeStringValue("payoutId", this.getPayoutId());
        writer.writeObjectValue("payoutInstrument", this.getPayoutInstrument());
        writer.writeStringValue("payoutMemo", this.getPayoutMemo());
        writer.writeStringValue("payoutReference", this.getPayoutReference());
        writer.writeStringValue("payoutStatus", this.getPayoutStatus());
        writer.writeStringValue("payoutStatusDescription", this.getPayoutStatusDescription());
        writer.writeObjectValue("totalAmount", this.getTotalAmount());
        writer.writeObjectValue("totalFee", this.getTotalFee());
        writer.writeCollectionOfObjectValues("totalFeeDetails", this.getTotalFeeDetails());
        writer.writeIntegerValue("transactionCount", this.getTransactionCount());
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
     * Sets the bankReference property value. This field contains additional information provided by the bank and passed on by the payment processor; e.g., the manner in which the transaction will appear on the seller&apos;s bank statement. The field is returned only when provided by the bank and processor.
     * @param value Value to set for the bankReference property.
     */
    public void setBankReference(@jakarta.annotation.Nullable final String value) {
        this.bankReference = value;
    }
    /**
     * Sets the lastAttemptedPayoutDate property value. This timestamp indicates the date/time when eBay last attempted to process a seller payout but it failed. This field is only returned if a seller payout fails, and the &lt;strong&gt;payoutStatus&lt;/strong&gt; value shows &lt;code&gt;RETRYABLE_FAILED&lt;/code&gt; or &lt;code&gt;TERMINAL_FAILED&lt;/code&gt;. A seller can filter on the &lt;b&gt;lastAttemptedPayoutDate&lt;/b&gt; in a &lt;b&gt;getPayouts&lt;/b&gt; request.
     * @param value Value to set for the lastAttemptedPayoutDate property.
     */
    public void setLastAttemptedPayoutDate(@jakarta.annotation.Nullable final String value) {
        this.lastAttemptedPayoutDate = value;
    }
    /**
     * Sets the payoutDate property value. This timestamp indicates when the seller payout began processing. The following format is used: &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. For example, &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;. This field is still returned even if the payout was pending but failed (&lt;strong&gt;payoutStatus&lt;/strong&gt; value shows &lt;code&gt;RETRYABLE_FAILED&lt;/code&gt; or &lt;code&gt;TERMINAL_FAILED&lt;/code&gt;).
     * @param value Value to set for the payoutDate property.
     */
    public void setPayoutDate(@jakarta.annotation.Nullable final String value) {
        this.payoutDate = value;
    }
    /**
     * Sets the payoutId property value. The unique identifier of the seller payout. This identifier is generated once eBay begins processing the payout to the seller&apos;s bank account.
     * @param value Value to set for the payoutId property.
     */
    public void setPayoutId(@jakarta.annotation.Nullable final String value) {
        this.payoutId = value;
    }
    /**
     * Sets the payoutInstrument property value. This type is used to provide details about one or two of the seller&apos;s accounts that are enabled to receive payouts.
     * @param value Value to set for the payoutInstrument property.
     */
    public void setPayoutInstrument(@jakarta.annotation.Nullable final PayoutInstrument value) {
        this.payoutInstrument = value;
    }
    /**
     * Sets the payoutMemo property value. This field contains information provided by upstream components, based on internal and external commitments. A typical message would contain the expected arrival time of the payout.
     * @param value Value to set for the payoutMemo property.
     */
    public void setPayoutMemo(@jakarta.annotation.Nullable final String value) {
        this.payoutMemo = value;
    }
    /**
     * Sets the payoutReference property value. This field contains the unique identifier for the Payout Reference. In split-payout cases, this is the unique identifier reference (not true payout). This field is only returned and will show the associated true(actual) payout id(s) when sellers in Mainland China enable split payouts between a Payoneer account and/or a bank account. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;Split-payout functionality will &lt;b&gt;only&lt;/b&gt; be available to mainland China sellers.&lt;/span&gt;
     * @param value Value to set for the payoutReference property.
     */
    public void setPayoutReference(@jakarta.annotation.Nullable final String value) {
        this.payoutReference = value;
    }
    /**
     * Sets the payoutStatus property value. This enumeration value indicates the current status of the seller payout. For a successful payout, the value returned will be &lt;code&gt;SUCCEEDED&lt;/code&gt;. See the &lt;strong&gt;PayoutStatusEnum&lt;/strong&gt; type for more details on each payout status value. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:PayoutStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the payoutStatus property.
     */
    public void setPayoutStatus(@jakarta.annotation.Nullable final String value) {
        this.payoutStatus = value;
    }
    /**
     * Sets the payoutStatusDescription property value. This field provides more details about the current status of payout. The description returned here will correspond with enumeration value returned in the &lt;strong&gt;payoutStatus&lt;/strong&gt; field. The following shows what description text might appear based on the different &lt;strong&gt;payoutStatus&lt;/strong&gt; values:&lt;ul&gt;&lt;li&gt;&lt;code&gt;INITIATED&lt;/code&gt;: &lt;em&gt;Preparing to send&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;SUCCEEDED&lt;/code&gt;: &lt;em&gt;Funds sent&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;REVERSED&lt;/code&gt;: &lt;em&gt;Waiting to retry : Money rejected by seller&apos;s bank&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RETRYABLE_FAILED&lt;/code&gt;: &lt;em&gt;Waiting to retry&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;TERMINAL_FAILED&lt;/code&gt;: &lt;em&gt;Payout failed&lt;/em&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the payoutStatusDescription property.
     */
    public void setPayoutStatusDescription(@jakarta.annotation.Nullable final String value) {
        this.payoutStatusDescription = value;
    }
    /**
     * Sets the totalAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the totalAmount property.
     */
    public void setTotalAmount(@jakarta.annotation.Nullable final Amount value) {
        this.totalAmount = value;
    }
    /**
     * Sets the totalFee property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the totalFee property.
     */
    public void setTotalFee(@jakarta.annotation.Nullable final Amount value) {
        this.totalFee = value;
    }
    /**
     * Sets the totalFeeDetails property value. This array indicates all payout fees associated with a payout, including the fee type, amount, value, and currency.
     * @param value Value to set for the totalFeeDetails property.
     */
    public void setTotalFeeDetails(@jakarta.annotation.Nullable final java.util.List<Fee> value) {
        this.totalFeeDetails = value;
    }
    /**
     * Sets the transactionCount property value. This integer value indicates the number of monetary transactions (all orders, refunds, and credits, etc.) that have occurred with the corresponding payout. Its value should always be at least &lt;code&gt;1&lt;/code&gt;, since there is at least one order per seller payout.&lt;br/&gt;&lt;br/&gt;For split payouts, each of the two sibling payouts would be considered its own transaction. Because of this, if a seller had a payout for one order, but split the order between two accounts, the value would be &lt;code&gt;2&lt;/code&gt; instead of &lt;code&gt;1&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;Split-payout functionality is &lt;b&gt;only&lt;/b&gt; applicable to mainland China sellers. &lt;/span&gt;
     * @param value Value to set for the transactionCount property.
     */
    public void setTransactionCount(@jakarta.annotation.Nullable final Integer value) {
        this.transactionCount = value;
    }
}
