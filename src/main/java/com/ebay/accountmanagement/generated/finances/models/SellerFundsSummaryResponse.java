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
 * This type is used by the response payload of the &lt;strong&gt;getSellerFundsSummary&lt;/strong&gt; method. All of the funds returned in  &lt;strong&gt;getSellerFundsSummary&lt;/strong&gt; are funds that have not yet been paid to the seller through a seller payout. If there are no funds that are pending, on hold, or being processed for the seller&apos;s account, no response payload is returned, and an http status code of &lt;code&gt;204 - No Content&lt;/code&gt; is returned instead.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SellerFundsSummaryResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field represents the total amount of order funds that are available for a payout, but processing for a seller payout has not yet begun. If a seller wants to get more details on sales transactions that have yet to be processed, the seller can use the &lt;strong&gt;getTransactions&lt;/strong&gt; method, and use the &lt;strong&gt;transactionStatus&lt;/strong&gt; filter with its value set to &lt;code&gt;FUNDS_AVAILABLE_FOR_PAYOUT&lt;/code&gt;.&lt;br&gt;&lt;br&gt;This container will return 0.0 with the appropriate payout currency if there are no funds available to be processed for a payout.
     */
    private Amount availableFunds;
    /**
     * This field represents the total amount of order funds on hold. Seller payment holds can occur for different reasons. If a seller wants to get more details on sales transactions where funds are currently on hold, the seller can use the &lt;strong&gt;getTransactions&lt;/strong&gt; method, and use the &lt;strong&gt;transactionStatus&lt;/strong&gt; filter with its value set to &lt;code&gt;FUNDS_ON_HOLD&lt;/code&gt;.&lt;br&gt;&lt;br&gt;This container will return 0.0 with the appropriate payout currency if there are no seller payment holds that will eventually be processed for a payout.
     */
    private Amount fundsOnHold;
    /**
     * This field represents the total amount of order funds being prepared and processed for a seller payout. If a seller wants to get more details on sales transactions that are being processed, the seller can use the &lt;strong&gt;getTransactions&lt;/strong&gt; method, and use the &lt;strong&gt;transactionStatus&lt;/strong&gt; filter with its value set to &lt;code&gt;FUNDS_PROCESSING&lt;/code&gt;.&lt;br&gt;&lt;br&gt;This container will return 0.0 with the appropriate payout currency if there are no funds available to be processed for a payout.
     */
    private Amount processingFunds;
    /**
     * This field represents the total amount of order funds still due to be distributed to the seller through a seller payout. This field should equal the sum of the amounts returned in the following fields:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;b&gt;processingFunds&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;availableFunds&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;fundsOnHold&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;If no payout funds are due to the seller, a &lt;code&gt;204 - No Content&lt;/code&gt;  status code will be returned along with an empty payload.
     */
    private Amount totalFunds;
    /**
     * Instantiates a new {@link SellerFundsSummaryResponse} and sets the default values.
     */
    public SellerFundsSummaryResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SellerFundsSummaryResponse}
     */
    @jakarta.annotation.Nonnull
    public static SellerFundsSummaryResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SellerFundsSummaryResponse();
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
     * Gets the availableFunds property value. This field represents the total amount of order funds that are available for a payout, but processing for a seller payout has not yet begun. If a seller wants to get more details on sales transactions that have yet to be processed, the seller can use the &lt;strong&gt;getTransactions&lt;/strong&gt; method, and use the &lt;strong&gt;transactionStatus&lt;/strong&gt; filter with its value set to &lt;code&gt;FUNDS_AVAILABLE_FOR_PAYOUT&lt;/code&gt;.&lt;br&gt;&lt;br&gt;This container will return 0.0 with the appropriate payout currency if there are no funds available to be processed for a payout.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAvailableFunds() {
        return this.availableFunds;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("availableFunds", (n) -> { this.setAvailableFunds(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("fundsOnHold", (n) -> { this.setFundsOnHold(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("processingFunds", (n) -> { this.setProcessingFunds(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("totalFunds", (n) -> { this.setTotalFunds(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fundsOnHold property value. This field represents the total amount of order funds on hold. Seller payment holds can occur for different reasons. If a seller wants to get more details on sales transactions where funds are currently on hold, the seller can use the &lt;strong&gt;getTransactions&lt;/strong&gt; method, and use the &lt;strong&gt;transactionStatus&lt;/strong&gt; filter with its value set to &lt;code&gt;FUNDS_ON_HOLD&lt;/code&gt;.&lt;br&gt;&lt;br&gt;This container will return 0.0 with the appropriate payout currency if there are no seller payment holds that will eventually be processed for a payout.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getFundsOnHold() {
        return this.fundsOnHold;
    }
    /**
     * Gets the processingFunds property value. This field represents the total amount of order funds being prepared and processed for a seller payout. If a seller wants to get more details on sales transactions that are being processed, the seller can use the &lt;strong&gt;getTransactions&lt;/strong&gt; method, and use the &lt;strong&gt;transactionStatus&lt;/strong&gt; filter with its value set to &lt;code&gt;FUNDS_PROCESSING&lt;/code&gt;.&lt;br&gt;&lt;br&gt;This container will return 0.0 with the appropriate payout currency if there are no funds available to be processed for a payout.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getProcessingFunds() {
        return this.processingFunds;
    }
    /**
     * Gets the totalFunds property value. This field represents the total amount of order funds still due to be distributed to the seller through a seller payout. This field should equal the sum of the amounts returned in the following fields:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;b&gt;processingFunds&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;availableFunds&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;fundsOnHold&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;If no payout funds are due to the seller, a &lt;code&gt;204 - No Content&lt;/code&gt;  status code will be returned along with an empty payload.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTotalFunds() {
        return this.totalFunds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("availableFunds", this.getAvailableFunds());
        writer.writeObjectValue("fundsOnHold", this.getFundsOnHold());
        writer.writeObjectValue("processingFunds", this.getProcessingFunds());
        writer.writeObjectValue("totalFunds", this.getTotalFunds());
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
     * Sets the availableFunds property value. This field represents the total amount of order funds that are available for a payout, but processing for a seller payout has not yet begun. If a seller wants to get more details on sales transactions that have yet to be processed, the seller can use the &lt;strong&gt;getTransactions&lt;/strong&gt; method, and use the &lt;strong&gt;transactionStatus&lt;/strong&gt; filter with its value set to &lt;code&gt;FUNDS_AVAILABLE_FOR_PAYOUT&lt;/code&gt;.&lt;br&gt;&lt;br&gt;This container will return 0.0 with the appropriate payout currency if there are no funds available to be processed for a payout.
     * @param value Value to set for the availableFunds property.
     */
    public void setAvailableFunds(@jakarta.annotation.Nullable final Amount value) {
        this.availableFunds = value;
    }
    /**
     * Sets the fundsOnHold property value. This field represents the total amount of order funds on hold. Seller payment holds can occur for different reasons. If a seller wants to get more details on sales transactions where funds are currently on hold, the seller can use the &lt;strong&gt;getTransactions&lt;/strong&gt; method, and use the &lt;strong&gt;transactionStatus&lt;/strong&gt; filter with its value set to &lt;code&gt;FUNDS_ON_HOLD&lt;/code&gt;.&lt;br&gt;&lt;br&gt;This container will return 0.0 with the appropriate payout currency if there are no seller payment holds that will eventually be processed for a payout.
     * @param value Value to set for the fundsOnHold property.
     */
    public void setFundsOnHold(@jakarta.annotation.Nullable final Amount value) {
        this.fundsOnHold = value;
    }
    /**
     * Sets the processingFunds property value. This field represents the total amount of order funds being prepared and processed for a seller payout. If a seller wants to get more details on sales transactions that are being processed, the seller can use the &lt;strong&gt;getTransactions&lt;/strong&gt; method, and use the &lt;strong&gt;transactionStatus&lt;/strong&gt; filter with its value set to &lt;code&gt;FUNDS_PROCESSING&lt;/code&gt;.&lt;br&gt;&lt;br&gt;This container will return 0.0 with the appropriate payout currency if there are no funds available to be processed for a payout.
     * @param value Value to set for the processingFunds property.
     */
    public void setProcessingFunds(@jakarta.annotation.Nullable final Amount value) {
        this.processingFunds = value;
    }
    /**
     * Sets the totalFunds property value. This field represents the total amount of order funds still due to be distributed to the seller through a seller payout. This field should equal the sum of the amounts returned in the following fields:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;b&gt;processingFunds&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;availableFunds&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;fundsOnHold&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;If no payout funds are due to the seller, a &lt;code&gt;204 - No Content&lt;/code&gt;  status code will be returned along with an empty payload.
     * @param value Value to set for the totalFunds property.
     */
    public void setTotalFunds(@jakarta.annotation.Nullable final Amount value) {
        this.totalFunds = value;
    }
}
