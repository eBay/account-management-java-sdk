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

package com.ebay.accountmanagement.generated.finances.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the jurisdiction information associated with a fee, identifying the geographic or regulatory region under which the fee is applied.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeeJurisdiction implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of the region to which the fee applies.&lt;br/&gt;&lt;br/&gt;The set of valid &lt;b&gt;regionName&lt;/b&gt; values returned is determined by the corresponding &lt;b&gt;regionType&lt;/b&gt; value.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Currently supported &lt;b&gt;regionName&lt;/b&gt; values are standard two-character country or state codes.&lt;br/&gt;&lt;br/&gt;Typical examples include:&lt;ul&gt;&lt;li&gt;&lt;b&gt;MX&lt;/b&gt; (Mexico)&lt;/li&gt;&lt;li&gt;&lt;b&gt;IN&lt;/b&gt; (India)&lt;/li&gt;&lt;li&gt;&lt;b&gt;US&lt;/b&gt; (United States)&lt;/li&gt;&lt;li&gt;&lt;b&gt;CA&lt;/b&gt; (California)&lt;/li&gt;&lt;li&gt;&lt;b&gt;VT&lt;/b&gt; (Vermont)&lt;/li&gt;&lt;li&gt;&lt;b&gt;ME&lt;/b&gt; (Maine)&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     */
    private String regionName;
    /**
     * This enumeration value indicates the type of region that the fee jurisdiction represents, such as a country or a state. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:RegionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String regionType;
    /**
     * Instantiates a new {@link FeeJurisdiction} and sets the default values.
     */
    public FeeJurisdiction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FeeJurisdiction}
     */
    @jakarta.annotation.Nonnull
    public static FeeJurisdiction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeeJurisdiction();
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
        deserializerMap.put("regionName", (n) -> { this.setRegionName(n.getStringValue()); });
        deserializerMap.put("regionType", (n) -> { this.setRegionType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the regionName property value. The name of the region to which the fee applies.&lt;br/&gt;&lt;br/&gt;The set of valid &lt;b&gt;regionName&lt;/b&gt; values returned is determined by the corresponding &lt;b&gt;regionType&lt;/b&gt; value.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Currently supported &lt;b&gt;regionName&lt;/b&gt; values are standard two-character country or state codes.&lt;br/&gt;&lt;br/&gt;Typical examples include:&lt;ul&gt;&lt;li&gt;&lt;b&gt;MX&lt;/b&gt; (Mexico)&lt;/li&gt;&lt;li&gt;&lt;b&gt;IN&lt;/b&gt; (India)&lt;/li&gt;&lt;li&gt;&lt;b&gt;US&lt;/b&gt; (United States)&lt;/li&gt;&lt;li&gt;&lt;b&gt;CA&lt;/b&gt; (California)&lt;/li&gt;&lt;li&gt;&lt;b&gt;VT&lt;/b&gt; (Vermont)&lt;/li&gt;&lt;li&gt;&lt;b&gt;ME&lt;/b&gt; (Maine)&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegionName() {
        return this.regionName;
    }
    /**
     * Gets the regionType property value. This enumeration value indicates the type of region that the fee jurisdiction represents, such as a country or a state. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:RegionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegionType() {
        return this.regionType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("regionName", this.getRegionName());
        writer.writeStringValue("regionType", this.getRegionType());
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
     * Sets the regionName property value. The name of the region to which the fee applies.&lt;br/&gt;&lt;br/&gt;The set of valid &lt;b&gt;regionName&lt;/b&gt; values returned is determined by the corresponding &lt;b&gt;regionType&lt;/b&gt; value.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Currently supported &lt;b&gt;regionName&lt;/b&gt; values are standard two-character country or state codes.&lt;br/&gt;&lt;br/&gt;Typical examples include:&lt;ul&gt;&lt;li&gt;&lt;b&gt;MX&lt;/b&gt; (Mexico)&lt;/li&gt;&lt;li&gt;&lt;b&gt;IN&lt;/b&gt; (India)&lt;/li&gt;&lt;li&gt;&lt;b&gt;US&lt;/b&gt; (United States)&lt;/li&gt;&lt;li&gt;&lt;b&gt;CA&lt;/b&gt; (California)&lt;/li&gt;&lt;li&gt;&lt;b&gt;VT&lt;/b&gt; (Vermont)&lt;/li&gt;&lt;li&gt;&lt;b&gt;ME&lt;/b&gt; (Maine)&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @param value Value to set for the regionName property.
     */
    public void setRegionName(@jakarta.annotation.Nullable final String value) {
        this.regionName = value;
    }
    /**
     * Sets the regionType property value. This enumeration value indicates the type of region that the fee jurisdiction represents, such as a country or a state. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/pay:RegionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the regionType property.
     */
    public void setRegionType(@jakarta.annotation.Nullable final String value) {
        this.regionType = value;
    }
}
