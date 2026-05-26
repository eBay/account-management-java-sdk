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
/**
 * This container stores the array of sales-tax table entries that have been created or updated.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdatedSalesTaxEntry implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; code of the country associated with the sales-tax table entry.
     */
    private String countryCode;
    /**
     * The ID of the tax jurisdiction associated with the sales-tax table entry.
     */
    private String jurisdictionId;
    /**
     * The HTTP status code for the call.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The system returns one HTTP status code regardless of the number of sales-tax table entries provided. Therefore, the same HTTP &lt;code&gt;statusCode&lt;/code&gt; will be listed for all sales-tax table entries returned in the payload.&lt;/span&gt;
     */
    private Integer statusCode;
    /**
     * Instantiates a new {@link UpdatedSalesTaxEntry} and sets the default values.
     */
    public UpdatedSalesTaxEntry() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdatedSalesTaxEntry}
     */
    @jakarta.annotation.Nonnull
    public static UpdatedSalesTaxEntry createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdatedSalesTaxEntry();
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
     * Gets the countryCode property value. The two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; code of the country associated with the sales-tax table entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("countryCode", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("jurisdictionId", (n) -> { this.setJurisdictionId(n.getStringValue()); });
        deserializerMap.put("statusCode", (n) -> { this.setStatusCode(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the jurisdictionId property value. The ID of the tax jurisdiction associated with the sales-tax table entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJurisdictionId() {
        return this.jurisdictionId;
    }
    /**
     * Gets the statusCode property value. The HTTP status code for the call.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The system returns one HTTP status code regardless of the number of sales-tax table entries provided. Therefore, the same HTTP &lt;code&gt;statusCode&lt;/code&gt; will be listed for all sales-tax table entries returned in the payload.&lt;/span&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getStatusCode() {
        return this.statusCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("countryCode", this.getCountryCode());
        writer.writeStringValue("jurisdictionId", this.getJurisdictionId());
        writer.writeIntegerValue("statusCode", this.getStatusCode());
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
     * Sets the countryCode property value. The two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; code of the country associated with the sales-tax table entry.
     * @param value Value to set for the countryCode property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final String value) {
        this.countryCode = value;
    }
    /**
     * Sets the jurisdictionId property value. The ID of the tax jurisdiction associated with the sales-tax table entry.
     * @param value Value to set for the jurisdictionId property.
     */
    public void setJurisdictionId(@jakarta.annotation.Nullable final String value) {
        this.jurisdictionId = value;
    }
    /**
     * Sets the statusCode property value. The HTTP status code for the call.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The system returns one HTTP status code regardless of the number of sales-tax table entries provided. Therefore, the same HTTP &lt;code&gt;statusCode&lt;/code&gt; will be listed for all sales-tax table entries returned in the payload.&lt;/span&gt;
     * @param value Value to set for the statusCode property.
     */
    public void setStatusCode(@jakarta.annotation.Nullable final Integer value) {
        this.statusCode = value;
    }
}
