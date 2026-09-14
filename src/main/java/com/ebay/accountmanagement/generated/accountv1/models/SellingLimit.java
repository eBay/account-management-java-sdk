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
 * Type used by the &lt;b&gt;sellingLimit&lt;/b&gt; container, a container that lists the monthly cap for the quantity of items sold and total sales amount allowed for the seller&apos;s account.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SellingLimit implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
     */
    private Amount amount;
    /**
     * This field shows the monthly cap for total quantity sold allowed for the seller&apos;s account. This field may not be returned if a seller does not have a monthly cap for total quantity sold.
     */
    private Integer quantity;
    /**
     * Instantiates a new {@link SellingLimit} and sets the default values.
     */
    public SellingLimit() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SellingLimit}
     */
    @jakarta.annotation.Nonnull
    public static SellingLimit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SellingLimit();
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
     * Gets the amount property value. A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("quantity", (n) -> { this.setQuantity(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the quantity property value. This field shows the monthly cap for total quantity sold allowed for the seller&apos;s account. This field may not be returned if a seller does not have a monthly cap for total quantity sold.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getQuantity() {
        return this.quantity;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeIntegerValue("quantity", this.getQuantity());
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
     * Sets the amount property value. A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Amount value) {
        this.amount = value;
    }
    /**
     * Sets the quantity property value. This field shows the monthly cap for total quantity sold allowed for the seller&apos;s account. This field may not be returned if a seller does not have a monthly cap for total quantity sold.
     * @param value Value to set for the quantity property.
     */
    public void setQuantity(@jakarta.annotation.Nullable final Integer value) {
        this.quantity = value;
    }
}
