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
 * This type is used to define specific shipping regions. There are four &apos;levels&apos; of shipping regions, including large geographical regions (like &apos;Asia&apos;, &apos;Europe&apos;, or &apos;Middle East&apos;), individual countries, US states or Canadian provinces, and special locations/domestic regions within a country (like &apos;Alaska/Hawaii&apos; or &apos;PO Box&apos;).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Region implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A string that indicates the name of a region, as defined by eBay. A &quot;region&quot; can be either a &apos;world region&apos; (e.g., the &quot;Middle East&quot; or &quot;Southeast Asia&quot;), a country (represented with a two-letter country code), a state or province (represented with a two-letter code), or a special domestic region within a country. &lt;br&gt;&lt;br&gt;The &lt;a href=&quot;/devzone/xml/docs/reference/ebay/GeteBayDetails.html&quot;&gt;GeteBayDetails&lt;/a&gt; call in the Trading API can be used to retrieve the world regions and special domestic regions within a specific country. To get these enumeration values, call &lt;b&gt;GeteBayDetails&lt;/b&gt; with the &lt;b&gt;DetailName&lt;/b&gt; value set to &lt;b&gt;ExcludeShippingLocationDetails&lt;/b&gt;.
     */
    private String regionName;
    /**
     * This enumerated type defines shipping region types.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; These enumeration values are not currently being used by fulfillment policy methods, but may be used in the future.&lt;/span&gt; | - **COUNTRY**: A single country. - **COUNTRY_REGION**: A domestic region or special location within a country. In the US, these domestic region/special location include &apos;Alaska/Hawaii&apos; and &apos;PO Box&apos;. - **STATE_OR_PROVINCE**: A state or province, such as California (CA) or New York (NY) in the US, or British Columbia (BC) or Ontario (ON) in Canada. - **WORLD_REGION**: A world region, such as Europe, the Middle East, or Southeast Asia. - **WORLDWIDE**: The entire world as we know it.
     */
    private RegionTypeEnum regionType;
    /**
     * Instantiates a new {@link Region} and sets the default values.
     */
    public Region() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Region}
     */
    @jakarta.annotation.Nonnull
    public static Region createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Region();
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
        deserializerMap.put("regionType", (n) -> { this.setRegionType(n.getEnumValue(RegionTypeEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the regionName property value. A string that indicates the name of a region, as defined by eBay. A &quot;region&quot; can be either a &apos;world region&apos; (e.g., the &quot;Middle East&quot; or &quot;Southeast Asia&quot;), a country (represented with a two-letter country code), a state or province (represented with a two-letter code), or a special domestic region within a country. &lt;br&gt;&lt;br&gt;The &lt;a href=&quot;/devzone/xml/docs/reference/ebay/GeteBayDetails.html&quot;&gt;GeteBayDetails&lt;/a&gt; call in the Trading API can be used to retrieve the world regions and special domestic regions within a specific country. To get these enumeration values, call &lt;b&gt;GeteBayDetails&lt;/b&gt; with the &lt;b&gt;DetailName&lt;/b&gt; value set to &lt;b&gt;ExcludeShippingLocationDetails&lt;/b&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegionName() {
        return this.regionName;
    }
    /**
     * Gets the regionType property value. This enumerated type defines shipping region types.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; These enumeration values are not currently being used by fulfillment policy methods, but may be used in the future.&lt;/span&gt; | - **COUNTRY**: A single country. - **COUNTRY_REGION**: A domestic region or special location within a country. In the US, these domestic region/special location include &apos;Alaska/Hawaii&apos; and &apos;PO Box&apos;. - **STATE_OR_PROVINCE**: A state or province, such as California (CA) or New York (NY) in the US, or British Columbia (BC) or Ontario (ON) in Canada. - **WORLD_REGION**: A world region, such as Europe, the Middle East, or Southeast Asia. - **WORLDWIDE**: The entire world as we know it.
     * @return a {@link RegionTypeEnum}
     */
    @jakarta.annotation.Nullable
    public RegionTypeEnum getRegionType() {
        return this.regionType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("regionName", this.getRegionName());
        writer.writeEnumValue("regionType", this.getRegionType());
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
     * Sets the regionName property value. A string that indicates the name of a region, as defined by eBay. A &quot;region&quot; can be either a &apos;world region&apos; (e.g., the &quot;Middle East&quot; or &quot;Southeast Asia&quot;), a country (represented with a two-letter country code), a state or province (represented with a two-letter code), or a special domestic region within a country. &lt;br&gt;&lt;br&gt;The &lt;a href=&quot;/devzone/xml/docs/reference/ebay/GeteBayDetails.html&quot;&gt;GeteBayDetails&lt;/a&gt; call in the Trading API can be used to retrieve the world regions and special domestic regions within a specific country. To get these enumeration values, call &lt;b&gt;GeteBayDetails&lt;/b&gt; with the &lt;b&gt;DetailName&lt;/b&gt; value set to &lt;b&gt;ExcludeShippingLocationDetails&lt;/b&gt;.
     * @param value Value to set for the regionName property.
     */
    public void setRegionName(@jakarta.annotation.Nullable final String value) {
        this.regionName = value;
    }
    /**
     * Sets the regionType property value. This enumerated type defines shipping region types.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; These enumeration values are not currently being used by fulfillment policy methods, but may be used in the future.&lt;/span&gt; | - **COUNTRY**: A single country. - **COUNTRY_REGION**: A domestic region or special location within a country. In the US, these domestic region/special location include &apos;Alaska/Hawaii&apos; and &apos;PO Box&apos;. - **STATE_OR_PROVINCE**: A state or province, such as California (CA) or New York (NY) in the US, or British Columbia (BC) or Ontario (ON) in Canada. - **WORLD_REGION**: A world region, such as Europe, the Middle East, or Southeast Asia. - **WORLDWIDE**: The entire world as we know it.
     * @param value Value to set for the regionType property.
     */
    public void setRegionType(@jakarta.annotation.Nullable final RegionTypeEnum value) {
        this.regionType = value;
    }
}
