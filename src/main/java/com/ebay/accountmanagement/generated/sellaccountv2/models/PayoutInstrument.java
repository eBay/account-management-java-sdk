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

package com.ebay.accountmanagement.generated.sellaccountv2.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to provide details about one or two of the seller&apos;s accounts that are enabled to receive payouts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PayoutInstrument implements AdditionalDataHolder, Parsable {
    /**
     * The last four digits of the account that the seller uses to receive payouts. This may be the last four digits of a bank account or a payment processor account such as Payoneer.
     */
    private String accountLastFourDigits;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique reference identifier for a payout instrument. The &lt;b&gt;instrumentId&lt;/b&gt; is needed to change the split-payout percentages through an &lt;b&gt;updatePayoutPercentage&lt;/b&gt; request.
     */
    private String instrumentId;
    /**
     * The status of a payout instrument. Valid payout instrument statuses include:&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;PENDING:&lt;/code&gt; This status indicates that the account must be verified before it can be used.&lt;/li&gt;&lt;li&gt;&lt;code&gt;ACTIVE:&lt;/code&gt;This status indicates that payouts are enabled on this account.&lt;/li&gt;&lt;li&gt;&lt;code&gt;VERIFICATION_FAILED:&lt;/code&gt; This status indicates that verification has failed for this account and payouts are disabled.&lt;/li&gt;&lt;li&gt;&lt;code&gt;INACTIVE:&lt;/code&gt; This status indicates that this account has become inactive and payouts are disabled.&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;See &lt;b&gt;InstrumentStatusEnum&lt;/b&gt; for more details on each instrument status value.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Payment accounts can only receive payouts if the status of a payout instrument is &lt;code&gt;ACTIVE&lt;/code&gt;.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/sel:InstrumentStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String instrumentStatus;
    /**
     * The type of account that received payouts. The value returned in this field may be:&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;BANK&lt;/code&gt;: Indicates that the payout was made to a seller&apos;s bank account.&lt;/li&gt;&lt;li&gt;&lt;code&gt;CARD&lt;/code&gt; (&lt;b&gt;Not Currently Available&lt;/b&gt;): Indicates that the payout went to a seller&apos;s debit card.&lt;/li&gt;&lt;li&gt;The name of a digital wallet provider or payment processor (e.g., &lt;code&gt;PAYONEER&lt;/code&gt;)&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Only Payoneer is currently supported for sellers in mainland China. Card payouts are not currently available for sellers in mainland China.&lt;/span&gt; 
     */
    private String instrumentType;
    /**
     * When &lt;b&gt;instrumentType&lt;/b&gt; returns &lt;code&gt;BANK&lt;/code&gt;, this value is the seller-provided nickname that the seller uses to represent the bank account that receives the payout.&lt;br/&gt;&lt;br/&gt;When &lt;b&gt;instrumentType&lt;/b&gt; returns &lt;code&gt;CARD&lt;/code&gt;, this value is the debit card network for the debit card that receives the payout.&lt;br/&gt;&lt;br/&gt;When &lt;b&gt;instrumentType&lt;/b&gt; returns a provider of digital wallet or payment processing services, the value returned is the name of the service provider (e.g., &lt;code&gt;PAYONEER&lt;/code&gt;)&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Only Payoneer is currently supported for sellers in mainland China. Card payouts are not currently available for sellers in mainland China.&lt;/span&gt;
     */
    private String nickname;
    /**
     * The current payout percentage allocated to an instrument. For example, &lt;code&gt;50&lt;/code&gt; indicates that 50% of the payout goes to the instrument.
     */
    private String payoutPercentage;
    /**
     * Instantiates a new {@link PayoutInstrument} and sets the default values.
     */
    public PayoutInstrument() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PayoutInstrument}
     */
    @jakarta.annotation.Nonnull
    public static PayoutInstrument createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PayoutInstrument();
    }
    /**
     * Gets the accountLastFourDigits property value. The last four digits of the account that the seller uses to receive payouts. This may be the last four digits of a bank account or a payment processor account such as Payoneer.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccountLastFourDigits() {
        return this.accountLastFourDigits;
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("accountLastFourDigits", (n) -> { this.setAccountLastFourDigits(n.getStringValue()); });
        deserializerMap.put("instrumentId", (n) -> { this.setInstrumentId(n.getStringValue()); });
        deserializerMap.put("instrumentStatus", (n) -> { this.setInstrumentStatus(n.getStringValue()); });
        deserializerMap.put("instrumentType", (n) -> { this.setInstrumentType(n.getStringValue()); });
        deserializerMap.put("nickname", (n) -> { this.setNickname(n.getStringValue()); });
        deserializerMap.put("payoutPercentage", (n) -> { this.setPayoutPercentage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the instrumentId property value. The unique reference identifier for a payout instrument. The &lt;b&gt;instrumentId&lt;/b&gt; is needed to change the split-payout percentages through an &lt;b&gt;updatePayoutPercentage&lt;/b&gt; request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInstrumentId() {
        return this.instrumentId;
    }
    /**
     * Gets the instrumentStatus property value. The status of a payout instrument. Valid payout instrument statuses include:&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;PENDING:&lt;/code&gt; This status indicates that the account must be verified before it can be used.&lt;/li&gt;&lt;li&gt;&lt;code&gt;ACTIVE:&lt;/code&gt;This status indicates that payouts are enabled on this account.&lt;/li&gt;&lt;li&gt;&lt;code&gt;VERIFICATION_FAILED:&lt;/code&gt; This status indicates that verification has failed for this account and payouts are disabled.&lt;/li&gt;&lt;li&gt;&lt;code&gt;INACTIVE:&lt;/code&gt; This status indicates that this account has become inactive and payouts are disabled.&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;See &lt;b&gt;InstrumentStatusEnum&lt;/b&gt; for more details on each instrument status value.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Payment accounts can only receive payouts if the status of a payout instrument is &lt;code&gt;ACTIVE&lt;/code&gt;.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/sel:InstrumentStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInstrumentStatus() {
        return this.instrumentStatus;
    }
    /**
     * Gets the instrumentType property value. The type of account that received payouts. The value returned in this field may be:&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;BANK&lt;/code&gt;: Indicates that the payout was made to a seller&apos;s bank account.&lt;/li&gt;&lt;li&gt;&lt;code&gt;CARD&lt;/code&gt; (&lt;b&gt;Not Currently Available&lt;/b&gt;): Indicates that the payout went to a seller&apos;s debit card.&lt;/li&gt;&lt;li&gt;The name of a digital wallet provider or payment processor (e.g., &lt;code&gt;PAYONEER&lt;/code&gt;)&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Only Payoneer is currently supported for sellers in mainland China. Card payouts are not currently available for sellers in mainland China.&lt;/span&gt; 
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInstrumentType() {
        return this.instrumentType;
    }
    /**
     * Gets the nickname property value. When &lt;b&gt;instrumentType&lt;/b&gt; returns &lt;code&gt;BANK&lt;/code&gt;, this value is the seller-provided nickname that the seller uses to represent the bank account that receives the payout.&lt;br/&gt;&lt;br/&gt;When &lt;b&gt;instrumentType&lt;/b&gt; returns &lt;code&gt;CARD&lt;/code&gt;, this value is the debit card network for the debit card that receives the payout.&lt;br/&gt;&lt;br/&gt;When &lt;b&gt;instrumentType&lt;/b&gt; returns a provider of digital wallet or payment processing services, the value returned is the name of the service provider (e.g., &lt;code&gt;PAYONEER&lt;/code&gt;)&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Only Payoneer is currently supported for sellers in mainland China. Card payouts are not currently available for sellers in mainland China.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNickname() {
        return this.nickname;
    }
    /**
     * Gets the payoutPercentage property value. The current payout percentage allocated to an instrument. For example, &lt;code&gt;50&lt;/code&gt; indicates that 50% of the payout goes to the instrument.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPayoutPercentage() {
        return this.payoutPercentage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("accountLastFourDigits", this.getAccountLastFourDigits());
        writer.writeStringValue("instrumentId", this.getInstrumentId());
        writer.writeStringValue("instrumentStatus", this.getInstrumentStatus());
        writer.writeStringValue("instrumentType", this.getInstrumentType());
        writer.writeStringValue("nickname", this.getNickname());
        writer.writeStringValue("payoutPercentage", this.getPayoutPercentage());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accountLastFourDigits property value. The last four digits of the account that the seller uses to receive payouts. This may be the last four digits of a bank account or a payment processor account such as Payoneer.
     * @param value Value to set for the accountLastFourDigits property.
     */
    public void setAccountLastFourDigits(@jakarta.annotation.Nullable final String value) {
        this.accountLastFourDigits = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the instrumentId property value. The unique reference identifier for a payout instrument. The &lt;b&gt;instrumentId&lt;/b&gt; is needed to change the split-payout percentages through an &lt;b&gt;updatePayoutPercentage&lt;/b&gt; request.
     * @param value Value to set for the instrumentId property.
     */
    public void setInstrumentId(@jakarta.annotation.Nullable final String value) {
        this.instrumentId = value;
    }
    /**
     * Sets the instrumentStatus property value. The status of a payout instrument. Valid payout instrument statuses include:&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;PENDING:&lt;/code&gt; This status indicates that the account must be verified before it can be used.&lt;/li&gt;&lt;li&gt;&lt;code&gt;ACTIVE:&lt;/code&gt;This status indicates that payouts are enabled on this account.&lt;/li&gt;&lt;li&gt;&lt;code&gt;VERIFICATION_FAILED:&lt;/code&gt; This status indicates that verification has failed for this account and payouts are disabled.&lt;/li&gt;&lt;li&gt;&lt;code&gt;INACTIVE:&lt;/code&gt; This status indicates that this account has become inactive and payouts are disabled.&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;See &lt;b&gt;InstrumentStatusEnum&lt;/b&gt; for more details on each instrument status value.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Payment accounts can only receive payouts if the status of a payout instrument is &lt;code&gt;ACTIVE&lt;/code&gt;.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/sel:InstrumentStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the instrumentStatus property.
     */
    public void setInstrumentStatus(@jakarta.annotation.Nullable final String value) {
        this.instrumentStatus = value;
    }
    /**
     * Sets the instrumentType property value. The type of account that received payouts. The value returned in this field may be:&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;BANK&lt;/code&gt;: Indicates that the payout was made to a seller&apos;s bank account.&lt;/li&gt;&lt;li&gt;&lt;code&gt;CARD&lt;/code&gt; (&lt;b&gt;Not Currently Available&lt;/b&gt;): Indicates that the payout went to a seller&apos;s debit card.&lt;/li&gt;&lt;li&gt;The name of a digital wallet provider or payment processor (e.g., &lt;code&gt;PAYONEER&lt;/code&gt;)&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Only Payoneer is currently supported for sellers in mainland China. Card payouts are not currently available for sellers in mainland China.&lt;/span&gt; 
     * @param value Value to set for the instrumentType property.
     */
    public void setInstrumentType(@jakarta.annotation.Nullable final String value) {
        this.instrumentType = value;
    }
    /**
     * Sets the nickname property value. When &lt;b&gt;instrumentType&lt;/b&gt; returns &lt;code&gt;BANK&lt;/code&gt;, this value is the seller-provided nickname that the seller uses to represent the bank account that receives the payout.&lt;br/&gt;&lt;br/&gt;When &lt;b&gt;instrumentType&lt;/b&gt; returns &lt;code&gt;CARD&lt;/code&gt;, this value is the debit card network for the debit card that receives the payout.&lt;br/&gt;&lt;br/&gt;When &lt;b&gt;instrumentType&lt;/b&gt; returns a provider of digital wallet or payment processing services, the value returned is the name of the service provider (e.g., &lt;code&gt;PAYONEER&lt;/code&gt;)&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Only Payoneer is currently supported for sellers in mainland China. Card payouts are not currently available for sellers in mainland China.&lt;/span&gt;
     * @param value Value to set for the nickname property.
     */
    public void setNickname(@jakarta.annotation.Nullable final String value) {
        this.nickname = value;
    }
    /**
     * Sets the payoutPercentage property value. The current payout percentage allocated to an instrument. For example, &lt;code&gt;50&lt;/code&gt; indicates that 50% of the payout goes to the instrument.
     * @param value Value to set for the payoutPercentage property.
     */
    public void setPayoutPercentage(@jakarta.annotation.Nullable final String value) {
        this.payoutPercentage = value;
    }
}
