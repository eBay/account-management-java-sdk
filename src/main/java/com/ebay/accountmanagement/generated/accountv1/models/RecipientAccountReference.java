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
 * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: This type is no longer applicable. eBay now controls all electronic payment methods available for a marketplace, and a seller never has to specify any electronic payment methods.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecipientAccountReference implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: DO NOT USE THIS FIELD. eBay now controls all electronic payment methods available for a marketplace, and a seller never has to specify any electronic payment methods.&lt;/span&gt;
     */
    private String referenceId;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: DO NOT USE THIS FIELD. eBay now controls all electronic payment methods available for a marketplace, and a seller never has to specify any electronic payment methods.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:RecipientAccountReferenceTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String referenceType;
    /**
     * Instantiates a new {@link RecipientAccountReference} and sets the default values.
     */
    public RecipientAccountReference() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RecipientAccountReference}
     */
    @jakarta.annotation.Nonnull
    public static RecipientAccountReference createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecipientAccountReference();
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
     * Gets the referenceId property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: DO NOT USE THIS FIELD. eBay now controls all electronic payment methods available for a marketplace, and a seller never has to specify any electronic payment methods.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReferenceId() {
        return this.referenceId;
    }
    /**
     * Gets the referenceType property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: DO NOT USE THIS FIELD. eBay now controls all electronic payment methods available for a marketplace, and a seller never has to specify any electronic payment methods.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:RecipientAccountReferenceTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
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
     * Sets the referenceId property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: DO NOT USE THIS FIELD. eBay now controls all electronic payment methods available for a marketplace, and a seller never has to specify any electronic payment methods.&lt;/span&gt;
     * @param value Value to set for the referenceId property.
     */
    public void setReferenceId(@jakarta.annotation.Nullable final String value) {
        this.referenceId = value;
    }
    /**
     * Sets the referenceType property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: DO NOT USE THIS FIELD. eBay now controls all electronic payment methods available for a marketplace, and a seller never has to specify any electronic payment methods.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:RecipientAccountReferenceTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the referenceType property.
     */
    public void setReferenceType(@jakarta.annotation.Nullable final String value) {
        this.referenceType = value;
    }
}
