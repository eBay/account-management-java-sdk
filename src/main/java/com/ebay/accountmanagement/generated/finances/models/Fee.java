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
 * This type is used for provide information about a fee that is charged against an order.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Fee implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The monetary amount charged for the fee.
     */
    private Amount amount;
    /**
     * This type defines the jurisdiction associated with a fee. It identifies the geographic or regulatory context under which a specific fee is applied to an order.
     */
    private FeeJurisdiction feeJurisdiction;
    /**
     * A descriptive message that provides additional context about the fee applied to the order.
     */
    private String feeMemo;
    /**
     * The enumeration value returned here indicates the type of fee that was deducted from the seller payout.
     */
    private FeeTypeEnum feeType;
    /**
     * Instantiates a new {@link Fee} and sets the default values.
     */
    public Fee() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Fee}
     */
    @jakarta.annotation.Nonnull
    public static Fee createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Fee();
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
     * Gets the amount property value. The monetary amount charged for the fee.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAmount() {
        return this.amount;
    }
    /**
     * Gets the feeJurisdiction property value. This type defines the jurisdiction associated with a fee. It identifies the geographic or regulatory context under which a specific fee is applied to an order.
     * @return a {@link FeeJurisdiction}
     */
    @jakarta.annotation.Nullable
    public FeeJurisdiction getFeeJurisdiction() {
        return this.feeJurisdiction;
    }
    /**
     * Gets the feeMemo property value. A descriptive message that provides additional context about the fee applied to the order.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeeMemo() {
        return this.feeMemo;
    }
    /**
     * Gets the feeType property value. The enumeration value returned here indicates the type of fee that was deducted from the seller payout.
     * @return a {@link FeeTypeEnum}
     */
    @jakarta.annotation.Nullable
    public FeeTypeEnum getFeeType() {
        return this.feeType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("feeJurisdiction", (n) -> { this.setFeeJurisdiction(n.getObjectValue(FeeJurisdiction::createFromDiscriminatorValue)); });
        deserializerMap.put("feeMemo", (n) -> { this.setFeeMemo(n.getStringValue()); });
        deserializerMap.put("feeType", (n) -> { this.setFeeType(n.getEnumValue(FeeTypeEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeObjectValue("feeJurisdiction", this.getFeeJurisdiction());
        writer.writeStringValue("feeMemo", this.getFeeMemo());
        writer.writeEnumValue("feeType", this.getFeeType());
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
     * Sets the amount property value. The monetary amount charged for the fee.
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Amount value) {
        this.amount = value;
    }
    /**
     * Sets the feeJurisdiction property value. This type defines the jurisdiction associated with a fee. It identifies the geographic or regulatory context under which a specific fee is applied to an order.
     * @param value Value to set for the feeJurisdiction property.
     */
    public void setFeeJurisdiction(@jakarta.annotation.Nullable final FeeJurisdiction value) {
        this.feeJurisdiction = value;
    }
    /**
     * Sets the feeMemo property value. A descriptive message that provides additional context about the fee applied to the order.
     * @param value Value to set for the feeMemo property.
     */
    public void setFeeMemo(@jakarta.annotation.Nullable final String value) {
        this.feeMemo = value;
    }
    /**
     * Sets the feeType property value. The enumeration value returned here indicates the type of fee that was deducted from the seller payout.
     * @param value Value to set for the feeType property.
     */
    public void setFeeType(@jakarta.annotation.Nullable final FeeTypeEnum value) {
        this.feeType = value;
    }
}
