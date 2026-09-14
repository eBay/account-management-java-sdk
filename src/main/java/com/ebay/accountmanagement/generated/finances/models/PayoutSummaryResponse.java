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
 * This type is the base response type of the &lt;strong&gt;getPayoutSummary&lt;/strong&gt; method, and contains the total count of seller payouts (that match the input criteria), the total count of monetary transactions (order payment, buyer refunds, or seller credits) associated with those payouts, and the total value of those seller payouts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PayoutSummaryResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount amount;
    /**
     * This integer value indicates the total count of payouts to the seller that match the input criteria. This field is always returned, even if there are no payouts that match the input criteria (its value will show &lt;code&gt;0&lt;/code&gt;).
     */
    private Integer payoutCount;
    /**
     * This integer value indicates the total count of monetary transactions (order payments, buyer refunds, and seller credits) associated with the payouts that match the input criteria. This field is always returned, even if there are no payouts that match the input criteria (its value will show &lt;code&gt;0&lt;/code&gt;). If there is at least one payout that matches the input criteria, the value in this field will be at least &lt;code&gt;1&lt;/code&gt;.
     */
    private Integer transactionCount;
    /**
     * Instantiates a new {@link PayoutSummaryResponse} and sets the default values.
     */
    public PayoutSummaryResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PayoutSummaryResponse}
     */
    @jakarta.annotation.Nonnull
    public static PayoutSummaryResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PayoutSummaryResponse();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("payoutCount", (n) -> { this.setPayoutCount(n.getIntegerValue()); });
        deserializerMap.put("transactionCount", (n) -> { this.setTransactionCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the payoutCount property value. This integer value indicates the total count of payouts to the seller that match the input criteria. This field is always returned, even if there are no payouts that match the input criteria (its value will show &lt;code&gt;0&lt;/code&gt;).
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPayoutCount() {
        return this.payoutCount;
    }
    /**
     * Gets the transactionCount property value. This integer value indicates the total count of monetary transactions (order payments, buyer refunds, and seller credits) associated with the payouts that match the input criteria. This field is always returned, even if there are no payouts that match the input criteria (its value will show &lt;code&gt;0&lt;/code&gt;). If there is at least one payout that matches the input criteria, the value in this field will be at least &lt;code&gt;1&lt;/code&gt;.
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
        writer.writeIntegerValue("payoutCount", this.getPayoutCount());
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
     * Sets the payoutCount property value. This integer value indicates the total count of payouts to the seller that match the input criteria. This field is always returned, even if there are no payouts that match the input criteria (its value will show &lt;code&gt;0&lt;/code&gt;).
     * @param value Value to set for the payoutCount property.
     */
    public void setPayoutCount(@jakarta.annotation.Nullable final Integer value) {
        this.payoutCount = value;
    }
    /**
     * Sets the transactionCount property value. This integer value indicates the total count of monetary transactions (order payments, buyer refunds, and seller credits) associated with the payouts that match the input criteria. This field is always returned, even if there are no payouts that match the input criteria (its value will show &lt;code&gt;0&lt;/code&gt;). If there is at least one payout that matches the input criteria, the value in this field will be at least &lt;code&gt;1&lt;/code&gt;.
     * @param value Value to set for the transactionCount property.
     */
    public void setTransactionCount(@jakarta.annotation.Nullable final Integer value) {
        this.transactionCount = value;
    }
}
