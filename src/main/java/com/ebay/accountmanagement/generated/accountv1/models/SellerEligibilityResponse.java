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

package com.ebay.accountmanagement.generated.accountv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that is used to provide the seller&apos;s eligibility status for an eBay advertising program.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SellerEligibilityResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The eBay advertising program for which a seller may be eligible.
     */
    private AdvertisingProgramEnum programType;
    /**
     * The reason why a seller is ineligible for the specified eBay advertising program.&lt;br /&gt;&lt;br /&gt;This field is only returned if the seller is ineligible for the eBay advertising program.
     */
    private SellerIneligibleReasonEnum reason;
    /**
     * The seller eligibility status for the specified eBay advertising program.
     */
    private SellerEligibilityEnum status;
    /**
     * Instantiates a new {@link SellerEligibilityResponse} and sets the default values.
     */
    public SellerEligibilityResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SellerEligibilityResponse}
     */
    @jakarta.annotation.Nonnull
    public static SellerEligibilityResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SellerEligibilityResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("programType", (n) -> { this.setProgramType(n.getEnumValue(AdvertisingProgramEnum::forValue)); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getEnumValue(SellerIneligibleReasonEnum::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SellerEligibilityEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the programType property value. The eBay advertising program for which a seller may be eligible.
     * @return a {@link AdvertisingProgramEnum}
     */
    @jakarta.annotation.Nullable
    public AdvertisingProgramEnum getProgramType() {
        return this.programType;
    }
    /**
     * Gets the reason property value. The reason why a seller is ineligible for the specified eBay advertising program.&lt;br /&gt;&lt;br /&gt;This field is only returned if the seller is ineligible for the eBay advertising program.
     * @return a {@link SellerIneligibleReasonEnum}
     */
    @jakarta.annotation.Nullable
    public SellerIneligibleReasonEnum getReason() {
        return this.reason;
    }
    /**
     * Gets the status property value. The seller eligibility status for the specified eBay advertising program.
     * @return a {@link SellerEligibilityEnum}
     */
    @jakarta.annotation.Nullable
    public SellerEligibilityEnum getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("programType", this.getProgramType());
        writer.writeEnumValue("reason", this.getReason());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the programType property value. The eBay advertising program for which a seller may be eligible.
     * @param value Value to set for the programType property.
     */
    public void setProgramType(@jakarta.annotation.Nullable final AdvertisingProgramEnum value) {
        this.programType = value;
    }
    /**
     * Sets the reason property value. The reason why a seller is ineligible for the specified eBay advertising program.&lt;br /&gt;&lt;br /&gt;This field is only returned if the seller is ineligible for the eBay advertising program.
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final SellerIneligibleReasonEnum value) {
        this.reason = value;
    }
    /**
     * Sets the status property value. The seller eligibility status for the specified eBay advertising program.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SellerEligibilityEnum value) {
        this.status = value;
    }
}
