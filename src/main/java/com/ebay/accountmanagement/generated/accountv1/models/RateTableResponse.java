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
 * This type is the base response of the &lt;b&gt;getRateTables&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RateTableResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array of all shipping rate tables defined for a marketplace (or all marketplaces if no &lt;b&gt;country_code&lt;/b&gt; query parameter is used). This array will be returned as empty if the seller has no defined shipping rate tables for the specified marketplace.
     */
    private java.util.List<RateTable> rateTables;
    /**
     * Instantiates a new {@link RateTableResponse} and sets the default values.
     */
    public RateTableResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RateTableResponse}
     */
    @jakarta.annotation.Nonnull
    public static RateTableResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RateTableResponse();
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
        deserializerMap.put("rateTables", (n) -> { this.setRateTables(n.getCollectionOfObjectValues(RateTable::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the rateTables property value. An array of all shipping rate tables defined for a marketplace (or all marketplaces if no &lt;b&gt;country_code&lt;/b&gt; query parameter is used). This array will be returned as empty if the seller has no defined shipping rate tables for the specified marketplace.
     * @return a {@link java.util.List<RateTable>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RateTable> getRateTables() {
        return this.rateTables;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("rateTables", this.getRateTables());
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
     * Sets the rateTables property value. An array of all shipping rate tables defined for a marketplace (or all marketplaces if no &lt;b&gt;country_code&lt;/b&gt; query parameter is used). This array will be returned as empty if the seller has no defined shipping rate tables for the specified marketplace.
     * @param value Value to set for the rateTables property.
     */
    public void setRateTables(@jakarta.annotation.Nullable final java.util.List<RateTable> value) {
        this.rateTables = value;
    }
}
