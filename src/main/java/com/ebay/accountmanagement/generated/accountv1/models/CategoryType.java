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
 * The category type discerns whether the policy applies to motor vehicle listings, or to any other items except motor vehicle listings. &lt;br&gt;&lt;br&gt;Each business policy can be associated with either or both categories (&apos;MOTORS_VEHICLES&apos; and &apos;ALL_EXCLUDING_MOTORS_VEHICLES&apos;); however, return business policies are not applicable for motor vehicle listings.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CategoryType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field has been deprecated and is no longer used.&lt;ul&gt;&lt;li&gt;Do not include this field in any &lt;b&gt;create&lt;/b&gt; or &lt;b&gt;update&lt;/b&gt; method.&lt;/li&gt;&lt;li&gt;This field may be returned within the payload of a &lt;b&gt;get&lt;/b&gt; method, but it can be ignored.&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     */
    private Boolean defaultEscaped;
    /**
     * An enum type that describes the category type (motor vehicles or non-motor vehicles). | - **MOTORS_VEHICLES**: This values indicates that the business policy applies to motor vehicle listings. - **ALL_EXCLUDING_MOTORS_VEHICLES**: This values indicates that the business policy applies to all listings besides motor vehicle listings.
     */
    private CategoryTypeEnum name;
    /**
     * Instantiates a new {@link CategoryType} and sets the default values.
     */
    public CategoryType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CategoryType}
     */
    @jakarta.annotation.Nonnull
    public static CategoryType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CategoryType();
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
     * Gets the default property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field has been deprecated and is no longer used.&lt;ul&gt;&lt;li&gt;Do not include this field in any &lt;b&gt;create&lt;/b&gt; or &lt;b&gt;update&lt;/b&gt; method.&lt;/li&gt;&lt;li&gt;This field may be returned within the payload of a &lt;b&gt;get&lt;/b&gt; method, but it can be ignored.&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDefault() {
        return this.defaultEscaped;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("default", (n) -> { this.setDefault(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getEnumValue(CategoryTypeEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. An enum type that describes the category type (motor vehicles or non-motor vehicles). | - **MOTORS_VEHICLES**: This values indicates that the business policy applies to motor vehicle listings. - **ALL_EXCLUDING_MOTORS_VEHICLES**: This values indicates that the business policy applies to all listings besides motor vehicle listings.
     * @return a {@link CategoryTypeEnum}
     */
    @jakarta.annotation.Nullable
    public CategoryTypeEnum getName() {
        return this.name;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("default", this.getDefault());
        writer.writeEnumValue("name", this.getName());
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
     * Sets the default property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field has been deprecated and is no longer used.&lt;ul&gt;&lt;li&gt;Do not include this field in any &lt;b&gt;create&lt;/b&gt; or &lt;b&gt;update&lt;/b&gt; method.&lt;/li&gt;&lt;li&gt;This field may be returned within the payload of a &lt;b&gt;get&lt;/b&gt; method, but it can be ignored.&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @param value Value to set for the default property.
     */
    public void setDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.defaultEscaped = value;
    }
    /**
     * Sets the name property value. An enum type that describes the category type (motor vehicles or non-motor vehicles). | - **MOTORS_VEHICLES**: This values indicates that the business policy applies to motor vehicle listings. - **ALL_EXCLUDING_MOTORS_VEHICLES**: This values indicates that the business policy applies to all listings besides motor vehicle listings.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final CategoryTypeEnum value) {
        this.name = value;
    }
}
