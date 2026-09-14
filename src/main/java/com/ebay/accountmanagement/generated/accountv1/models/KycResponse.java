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
 * This is the base response type of the &lt;b&gt;getKYC&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KycResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array contains one or more KYC checks required from a managed payments seller. The seller may need to provide more documentation and/or information about themselves, their company, or the bank account they are using for seller payouts.&lt;br/&gt;&lt;br/&gt;If no KYC checks are currently required from the seller, this array is not returned, and the seller only receives a &lt;code&gt;204 No Content&lt;/code&gt; HTTP status code.
     */
    private java.util.List<KycCheck> kycChecks;
    /**
     * Instantiates a new {@link KycResponse} and sets the default values.
     */
    public KycResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link KycResponse}
     */
    @jakarta.annotation.Nonnull
    public static KycResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KycResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("kycChecks", (n) -> { this.setKycChecks(n.getCollectionOfObjectValues(KycCheck::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the kycChecks property value. This array contains one or more KYC checks required from a managed payments seller. The seller may need to provide more documentation and/or information about themselves, their company, or the bank account they are using for seller payouts.&lt;br/&gt;&lt;br/&gt;If no KYC checks are currently required from the seller, this array is not returned, and the seller only receives a &lt;code&gt;204 No Content&lt;/code&gt; HTTP status code.
     * @return a {@link java.util.List<KycCheck>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<KycCheck> getKycChecks() {
        return this.kycChecks;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("kycChecks", this.getKycChecks());
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
     * Sets the kycChecks property value. This array contains one or more KYC checks required from a managed payments seller. The seller may need to provide more documentation and/or information about themselves, their company, or the bank account they are using for seller payouts.&lt;br/&gt;&lt;br/&gt;If no KYC checks are currently required from the seller, this array is not returned, and the seller only receives a &lt;code&gt;204 No Content&lt;/code&gt; HTTP status code.
     * @param value Value to set for the kycChecks property.
     */
    public void setKycChecks(@jakarta.annotation.Nullable final java.util.List<KycCheck> value) {
        this.kycChecks = value;
    }
}
