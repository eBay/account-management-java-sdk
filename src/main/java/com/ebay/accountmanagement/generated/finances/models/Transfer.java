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
 * This type is the base response type used by &lt;code&gt;TRANSFER&lt;/code&gt; transaction type that is returned in the response.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Transfer implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type defines the source of funds used to finance a transfer, such as available seller funds, a credit card, or a bank account.
     */
    private FundingSource fundingSource;
    /**
     * This timestamp indicates the date/time of the transfer. The following (UTC) format is used: &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. For example, &lt;code&gt;2020-08-04T19:09:02.768Z&lt;/code&gt;
     */
    private String transactionDate;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount transferAmount;
    /**
     * This type is used by the &lt;b&gt;transferDetail&lt;/b&gt; container, which provides more details about the transfer and the charge(s) associated with the transfer.
     */
    private TransferDetail transferDetail;
    /**
     * The unique identifier of the &lt;code&gt;TRANSFER&lt;/code&gt; transaction type. This is the same value that was passed into the end of the call URI.
     */
    private String transferId;
    /**
     * Instantiates a new {@link Transfer} and sets the default values.
     */
    public Transfer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Transfer}
     */
    @jakarta.annotation.Nonnull
    public static Transfer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Transfer();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("fundingSource", (n) -> { this.setFundingSource(n.getObjectValue(FundingSource::createFromDiscriminatorValue)); });
        deserializerMap.put("transactionDate", (n) -> { this.setTransactionDate(n.getStringValue()); });
        deserializerMap.put("transferAmount", (n) -> { this.setTransferAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("transferDetail", (n) -> { this.setTransferDetail(n.getObjectValue(TransferDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("transferId", (n) -> { this.setTransferId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fundingSource property value. This type defines the source of funds used to finance a transfer, such as available seller funds, a credit card, or a bank account.
     * @return a {@link FundingSource}
     */
    @jakarta.annotation.Nullable
    public FundingSource getFundingSource() {
        return this.fundingSource;
    }
    /**
     * Gets the transactionDate property value. This timestamp indicates the date/time of the transfer. The following (UTC) format is used: &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. For example, &lt;code&gt;2020-08-04T19:09:02.768Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransactionDate() {
        return this.transactionDate;
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
     * Gets the transferDetail property value. This type is used by the &lt;b&gt;transferDetail&lt;/b&gt; container, which provides more details about the transfer and the charge(s) associated with the transfer.
     * @return a {@link TransferDetail}
     */
    @jakarta.annotation.Nullable
    public TransferDetail getTransferDetail() {
        return this.transferDetail;
    }
    /**
     * Gets the transferId property value. The unique identifier of the &lt;code&gt;TRANSFER&lt;/code&gt; transaction type. This is the same value that was passed into the end of the call URI.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransferId() {
        return this.transferId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("fundingSource", this.getFundingSource());
        writer.writeStringValue("transactionDate", this.getTransactionDate());
        writer.writeObjectValue("transferAmount", this.getTransferAmount());
        writer.writeObjectValue("transferDetail", this.getTransferDetail());
        writer.writeStringValue("transferId", this.getTransferId());
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
     * Sets the fundingSource property value. This type defines the source of funds used to finance a transfer, such as available seller funds, a credit card, or a bank account.
     * @param value Value to set for the fundingSource property.
     */
    public void setFundingSource(@jakarta.annotation.Nullable final FundingSource value) {
        this.fundingSource = value;
    }
    /**
     * Sets the transactionDate property value. This timestamp indicates the date/time of the transfer. The following (UTC) format is used: &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. For example, &lt;code&gt;2020-08-04T19:09:02.768Z&lt;/code&gt;
     * @param value Value to set for the transactionDate property.
     */
    public void setTransactionDate(@jakarta.annotation.Nullable final String value) {
        this.transactionDate = value;
    }
    /**
     * Sets the transferAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the transferAmount property.
     */
    public void setTransferAmount(@jakarta.annotation.Nullable final Amount value) {
        this.transferAmount = value;
    }
    /**
     * Sets the transferDetail property value. This type is used by the &lt;b&gt;transferDetail&lt;/b&gt; container, which provides more details about the transfer and the charge(s) associated with the transfer.
     * @param value Value to set for the transferDetail property.
     */
    public void setTransferDetail(@jakarta.annotation.Nullable final TransferDetail value) {
        this.transferDetail = value;
    }
    /**
     * Sets the transferId property value. The unique identifier of the &lt;code&gt;TRANSFER&lt;/code&gt; transaction type. This is the same value that was passed into the end of the call URI.
     * @param value Value to set for the transferId property.
     */
    public void setTransferId(@jakarta.annotation.Nullable final String value) {
        this.transferId = value;
    }
}
