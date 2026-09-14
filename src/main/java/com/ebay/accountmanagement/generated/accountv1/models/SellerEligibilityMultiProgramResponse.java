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
 * The base response of the &lt;b&gt;getAdvertisingEligibility&lt;/b&gt; method that contains the seller eligibility information for one or more advertising programs.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SellerEligibilityMultiProgramResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array of response fields that define the seller eligibility for eBay advertising programs.
     */
    private java.util.List<SellerEligibilityResponse> advertisingEligibility;
    /**
     * Instantiates a new {@link SellerEligibilityMultiProgramResponse} and sets the default values.
     */
    public SellerEligibilityMultiProgramResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SellerEligibilityMultiProgramResponse}
     */
    @jakarta.annotation.Nonnull
    public static SellerEligibilityMultiProgramResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SellerEligibilityMultiProgramResponse();
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
     * Gets the advertisingEligibility property value. An array of response fields that define the seller eligibility for eBay advertising programs.
     * @return a {@link java.util.List<SellerEligibilityResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SellerEligibilityResponse> getAdvertisingEligibility() {
        return this.advertisingEligibility;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("advertisingEligibility", (n) -> { this.setAdvertisingEligibility(n.getCollectionOfObjectValues(SellerEligibilityResponse::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("advertisingEligibility", this.getAdvertisingEligibility());
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
     * Sets the advertisingEligibility property value. An array of response fields that define the seller eligibility for eBay advertising programs.
     * @param value Value to set for the advertisingEligibility property.
     */
    public void setAdvertisingEligibility(@jakarta.annotation.Nullable final java.util.List<SellerEligibilityResponse> value) {
        this.advertisingEligibility = value;
    }
}
