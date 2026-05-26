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
 * This type is used by the &lt;b&gt;transferDetail&lt;/b&gt; container, which provides more details about the transfer and the charge(s) associated with the transfer.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TransferDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used by the &lt;b&gt;balanceAdjustment&lt;/b&gt; container, which shows the seller payout balance that will be applied toward the charges outlined in the &lt;b&gt;charges&lt;/b&gt; array.
     */
    private BalanceAdjustment balanceAdjustment;
    /**
     * This container is an array of one or more charges related to the transfer. Charges can be related to an order cancellation, order return, case, payment dispute, etc.
     */
    private java.util.List<Charge> charges;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount totalChargeNetAmount;
    /**
     * Instantiates a new {@link TransferDetail} and sets the default values.
     */
    public TransferDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TransferDetail}
     */
    @jakarta.annotation.Nonnull
    public static TransferDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TransferDetail();
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
     * Gets the balanceAdjustment property value. This type is used by the &lt;b&gt;balanceAdjustment&lt;/b&gt; container, which shows the seller payout balance that will be applied toward the charges outlined in the &lt;b&gt;charges&lt;/b&gt; array.
     * @return a {@link BalanceAdjustment}
     */
    @jakarta.annotation.Nullable
    public BalanceAdjustment getBalanceAdjustment() {
        return this.balanceAdjustment;
    }
    /**
     * Gets the charges property value. This container is an array of one or more charges related to the transfer. Charges can be related to an order cancellation, order return, case, payment dispute, etc.
     * @return a {@link java.util.List<Charge>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Charge> getCharges() {
        return this.charges;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("balanceAdjustment", (n) -> { this.setBalanceAdjustment(n.getObjectValue(BalanceAdjustment::createFromDiscriminatorValue)); });
        deserializerMap.put("charges", (n) -> { this.setCharges(n.getCollectionOfObjectValues(Charge::createFromDiscriminatorValue)); });
        deserializerMap.put("totalChargeNetAmount", (n) -> { this.setTotalChargeNetAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the totalChargeNetAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTotalChargeNetAmount() {
        return this.totalChargeNetAmount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("balanceAdjustment", this.getBalanceAdjustment());
        writer.writeCollectionOfObjectValues("charges", this.getCharges());
        writer.writeObjectValue("totalChargeNetAmount", this.getTotalChargeNetAmount());
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
     * Sets the balanceAdjustment property value. This type is used by the &lt;b&gt;balanceAdjustment&lt;/b&gt; container, which shows the seller payout balance that will be applied toward the charges outlined in the &lt;b&gt;charges&lt;/b&gt; array.
     * @param value Value to set for the balanceAdjustment property.
     */
    public void setBalanceAdjustment(@jakarta.annotation.Nullable final BalanceAdjustment value) {
        this.balanceAdjustment = value;
    }
    /**
     * Sets the charges property value. This container is an array of one or more charges related to the transfer. Charges can be related to an order cancellation, order return, case, payment dispute, etc.
     * @param value Value to set for the charges property.
     */
    public void setCharges(@jakarta.annotation.Nullable final java.util.List<Charge> value) {
        this.charges = value;
    }
    /**
     * Sets the totalChargeNetAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the totalChargeNetAmount property.
     */
    public void setTotalChargeNetAmount(@jakarta.annotation.Nullable final Amount value) {
        this.totalChargeNetAmount = value;
    }
}
