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
 * This field is returned for NON_SALE_CHARGE transactions that contain non-transactional seller fees.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Reference implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The identifier of the transaction as specified by the &lt;strong&gt;referenceType&lt;/strong&gt;. For example, with a &lt;strong&gt;referenceType&lt;/strong&gt; of &lt;strong&gt;item_id&lt;/strong&gt;, the &lt;strong&gt;referenceId&lt;/strong&gt; refers to a unique item. This item may have several &lt;code&gt;NON_SALE_CHARGE&lt;/code&gt; transactions.
     */
    private String referenceId;
    /**
     * An enumeration value that identifies the reference type associated with the &lt;strong&gt;referenceId&lt;/strong&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:ReferenceTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String referenceType;
    /**
     * Instantiates a new {@link Reference} and sets the default values.
     */
    public Reference() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Reference}
     */
    @jakarta.annotation.Nonnull
    public static Reference createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Reference();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("referenceId", (n) -> { this.setReferenceId(n.getStringValue()); });
        deserializerMap.put("referenceType", (n) -> { this.setReferenceType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the referenceId property value. The identifier of the transaction as specified by the &lt;strong&gt;referenceType&lt;/strong&gt;. For example, with a &lt;strong&gt;referenceType&lt;/strong&gt; of &lt;strong&gt;item_id&lt;/strong&gt;, the &lt;strong&gt;referenceId&lt;/strong&gt; refers to a unique item. This item may have several &lt;code&gt;NON_SALE_CHARGE&lt;/code&gt; transactions.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReferenceId() {
        return this.referenceId;
    }
    /**
     * Gets the referenceType property value. An enumeration value that identifies the reference type associated with the &lt;strong&gt;referenceId&lt;/strong&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:ReferenceTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReferenceType() {
        return this.referenceType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("referenceId", this.getReferenceId());
        writer.writeStringValue("referenceType", this.getReferenceType());
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
     * Sets the referenceId property value. The identifier of the transaction as specified by the &lt;strong&gt;referenceType&lt;/strong&gt;. For example, with a &lt;strong&gt;referenceType&lt;/strong&gt; of &lt;strong&gt;item_id&lt;/strong&gt;, the &lt;strong&gt;referenceId&lt;/strong&gt; refers to a unique item. This item may have several &lt;code&gt;NON_SALE_CHARGE&lt;/code&gt; transactions.
     * @param value Value to set for the referenceId property.
     */
    public void setReferenceId(@jakarta.annotation.Nullable final String value) {
        this.referenceId = value;
    }
    /**
     * Sets the referenceType property value. An enumeration value that identifies the reference type associated with the &lt;strong&gt;referenceId&lt;/strong&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:ReferenceTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the referenceType property.
     */
    public void setReferenceType(@jakarta.annotation.Nullable final String value) {
        this.referenceType = value;
    }
}
