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
 * This type is used by the request payload of the &lt;b&gt;updateShippingCost&lt;/b&gt; method to pass updated shipping cost information for a rate table identified by &lt;b&gt;rateTableId&lt;/b&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RateTableUpdate implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array of rate objects for which &lt;b&gt;shippingCost&lt;/b&gt; and/or &lt;b&gt;additionalCost&lt;/b&gt; are to be updated.
     */
    private java.util.List<RateUpdate> rates;
    /**
     * Instantiates a new {@link RateTableUpdate} and sets the default values.
     */
    public RateTableUpdate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RateTableUpdate}
     */
    @jakarta.annotation.Nonnull
    public static RateTableUpdate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RateTableUpdate();
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
        deserializerMap.put("rates", (n) -> { this.setRates(n.getCollectionOfObjectValues(RateUpdate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the rates property value. An array of rate objects for which &lt;b&gt;shippingCost&lt;/b&gt; and/or &lt;b&gt;additionalCost&lt;/b&gt; are to be updated.
     * @return a {@link java.util.List<RateUpdate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RateUpdate> getRates() {
        return this.rates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("rates", this.getRates());
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
     * Sets the rates property value. An array of rate objects for which &lt;b&gt;shippingCost&lt;/b&gt; and/or &lt;b&gt;additionalCost&lt;/b&gt; are to be updated.
     * @param value Value to set for the rates property.
     */
    public void setRates(@jakarta.annotation.Nullable final java.util.List<RateUpdate> value) {
        this.rates = value;
    }
}
