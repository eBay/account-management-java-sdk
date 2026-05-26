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

package com.ebay.accountmanagement.generated.sellaccountv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomPolicyRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Contains the seller specified policy and policy terms.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Always supply this field. If this field is not specified, any previous value is removed. Call the &lt;a href=&quot;/api-docs/sell/account/resources/custom_policy/methods/getCustomPolicy&quot;&gt;getCustomPolicy&lt;/a&gt; method to return the present field value for this policy.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 15,000
     */
    private String description;
    /**
     * Customer-facing label shown on View Item pages for items to which the policy applies. This seller-defined string is displayed as a system-generated hyperlink pointing to seller specified policy information.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Always supply this field. If this field is not specified, any previous value is removed. Call the &lt;a href=&quot;/api-docs/sell/account/resources/custom_policy/methods/getCustomPolicy&quot;&gt;getCustomPolicy&lt;/a&gt; method to return the present field value for this policy.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 65
     */
    private String label;
    /**
     * The seller-defined name for the custom policy. Names must be unique for policies assigned to the same seller and policy type.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is visible only to the seller. &lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Always supply this field. If this field is not specified, any previous value is removed. Call the &lt;a href=&quot;/api-docs/sell/account/resources/custom_policy/methods/getCustomPolicy&quot;&gt;getCustomPolicy&lt;/a&gt; method to return the present field value for this policy.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 65
     */
    private String name;
    /**
     * Instantiates a new {@link CustomPolicyRequest} and sets the default values.
     */
    public CustomPolicyRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomPolicyRequest}
     */
    @jakarta.annotation.Nonnull
    public static CustomPolicyRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomPolicyRequest();
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
     * Gets the description property value. Contains the seller specified policy and policy terms.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Always supply this field. If this field is not specified, any previous value is removed. Call the &lt;a href=&quot;/api-docs/sell/account/resources/custom_policy/methods/getCustomPolicy&quot;&gt;getCustomPolicy&lt;/a&gt; method to return the present field value for this policy.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 15,000
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the label property value. Customer-facing label shown on View Item pages for items to which the policy applies. This seller-defined string is displayed as a system-generated hyperlink pointing to seller specified policy information.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Always supply this field. If this field is not specified, any previous value is removed. Call the &lt;a href=&quot;/api-docs/sell/account/resources/custom_policy/methods/getCustomPolicy&quot;&gt;getCustomPolicy&lt;/a&gt; method to return the present field value for this policy.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 65
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the name property value. The seller-defined name for the custom policy. Names must be unique for policies assigned to the same seller and policy type.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is visible only to the seller. &lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Always supply this field. If this field is not specified, any previous value is removed. Call the &lt;a href=&quot;/api-docs/sell/account/resources/custom_policy/methods/getCustomPolicy&quot;&gt;getCustomPolicy&lt;/a&gt; method to return the present field value for this policy.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 65
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("label", this.getLabel());
        writer.writeStringValue("name", this.getName());
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
     * Sets the description property value. Contains the seller specified policy and policy terms.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Always supply this field. If this field is not specified, any previous value is removed. Call the &lt;a href=&quot;/api-docs/sell/account/resources/custom_policy/methods/getCustomPolicy&quot;&gt;getCustomPolicy&lt;/a&gt; method to return the present field value for this policy.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 15,000
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the label property value. Customer-facing label shown on View Item pages for items to which the policy applies. This seller-defined string is displayed as a system-generated hyperlink pointing to seller specified policy information.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Always supply this field. If this field is not specified, any previous value is removed. Call the &lt;a href=&quot;/api-docs/sell/account/resources/custom_policy/methods/getCustomPolicy&quot;&gt;getCustomPolicy&lt;/a&gt; method to return the present field value for this policy.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 65
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the name property value. The seller-defined name for the custom policy. Names must be unique for policies assigned to the same seller and policy type.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is visible only to the seller. &lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Always supply this field. If this field is not specified, any previous value is removed. Call the &lt;a href=&quot;/api-docs/sell/account/resources/custom_policy/methods/getCustomPolicy&quot;&gt;getCustomPolicy&lt;/a&gt; method to return the present field value for this policy.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 65
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
}
