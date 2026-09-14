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

package com.ebay.accountmanagement.generated.accountv2.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This container is used to change the combined payment option. Sellers have the option to combine multiple line items from the same buyer into a combined invoice that can be paid for with one payment. See CombinedPaymentOptionEnum for a description of each value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CombinedPaymentPreferencesType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This enum type defines the available options for handling combined payments when a seller allows multiple line items from the same buyer to be paid for with a single payment. See &lt;code&gt;CombinedPaymentOptionEnum&lt;/code&gt; for a description of each value.
     */
    private CombinedPaymentOptionEnum combinedPaymentOption;
    /**
     * Instantiates a new {@link CombinedPaymentPreferencesType} and sets the default values.
     */
    public CombinedPaymentPreferencesType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CombinedPaymentPreferencesType}
     */
    @jakarta.annotation.Nonnull
    public static CombinedPaymentPreferencesType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CombinedPaymentPreferencesType();
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
     * Gets the combinedPaymentOption property value. This enum type defines the available options for handling combined payments when a seller allows multiple line items from the same buyer to be paid for with a single payment. See &lt;code&gt;CombinedPaymentOptionEnum&lt;/code&gt; for a description of each value.
     * @return a {@link CombinedPaymentOptionEnum}
     */
    @jakarta.annotation.Nullable
    public CombinedPaymentOptionEnum getCombinedPaymentOption() {
        return this.combinedPaymentOption;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("combinedPaymentOption", (n) -> { this.setCombinedPaymentOption(n.getEnumValue(CombinedPaymentOptionEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("combinedPaymentOption", this.getCombinedPaymentOption());
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
     * Sets the combinedPaymentOption property value. This enum type defines the available options for handling combined payments when a seller allows multiple line items from the same buyer to be paid for with a single payment. See &lt;code&gt;CombinedPaymentOptionEnum&lt;/code&gt; for a description of each value.
     * @param value Value to set for the combinedPaymentOption property.
     */
    public void setCombinedPaymentOption(@jakarta.annotation.Nullable final CombinedPaymentOptionEnum value) {
        this.combinedPaymentOption = value;
    }
}
