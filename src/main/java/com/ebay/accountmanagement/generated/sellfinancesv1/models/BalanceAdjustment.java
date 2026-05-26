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

package com.ebay.accountmanagement.generated.sellfinancesv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the &lt;b&gt;balanceAdjustment&lt;/b&gt; container, which shows the seller payout balance that will be applied toward the charges outlined in the &lt;b&gt;charges&lt;/b&gt; array.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BalanceAdjustment implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount adjustmentAmount;
    /**
     * The enumeration value returned here indicates if the charge is a &lt;code&gt;DEBIT&lt;/code&gt; or a &lt;code&gt;CREDIT&lt;/code&gt; to the seller. Generally, all transfer transaction types are going to be &lt;code&gt;DEBIT&lt;/code&gt;, since the money is being tranferred from the seller to eBay. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String adjustmentType;
    /**
     * Instantiates a new {@link BalanceAdjustment} and sets the default values.
     */
    public BalanceAdjustment() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BalanceAdjustment}
     */
    @jakarta.annotation.Nonnull
    public static BalanceAdjustment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BalanceAdjustment();
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
     * Gets the adjustmentType property value. The enumeration value returned here indicates if the charge is a &lt;code&gt;DEBIT&lt;/code&gt; or a &lt;code&gt;CREDIT&lt;/code&gt; to the seller. Generally, all transfer transaction types are going to be &lt;code&gt;DEBIT&lt;/code&gt;, since the money is being tranferred from the seller to eBay. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdjustmentType() {
        return this.adjustmentType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("adjustmentAmount", (n) -> { this.setAdjustmentAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("adjustmentType", (n) -> { this.setAdjustmentType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("adjustmentAmount", this.getAdjustmentAmount());
        writer.writeStringValue("adjustmentType", this.getAdjustmentType());
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
     * Sets the adjustmentType property value. The enumeration value returned here indicates if the charge is a &lt;code&gt;DEBIT&lt;/code&gt; or a &lt;code&gt;CREDIT&lt;/code&gt; to the seller. Generally, all transfer transaction types are going to be &lt;code&gt;DEBIT&lt;/code&gt;, since the money is being tranferred from the seller to eBay. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the adjustmentType property.
     */
    public void setAdjustmentType(@jakarta.annotation.Nullable final String value) {
        this.adjustmentType = value;
    }
}
