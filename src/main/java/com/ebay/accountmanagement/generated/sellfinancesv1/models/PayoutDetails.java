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
 * This type provide payout details for a split-payout case. This type is only applicable for split payouts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PayoutDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array indicates the list of true(actual) payout ids associated with a split payout. These values can be used as a path parameter for the &lt;b&gt;getPayout&lt;/b&gt; method to retrieve details on the associated payouts.
     */
    private java.util.List<String> payoutIds;
    /**
     * This field contains the unique identifier for the Payout Reference. In split-payout cases, this is the unique identifier reference (not true payout). This field is only returned and will show the associated true(actual) payout id(s) when sellers in Mainland China enable split payouts between a Payoneer account and/or a bank account.  This value can be used by the &lt;b&gt;filter&lt;/b&gt; query parameter of the &lt;b&gt;getPayouts&lt;/b&gt; method to get the monetary details of each true(actual) payout associated with the payoutReference. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;Split-payout functionality will &lt;b&gt;only&lt;/b&gt; be available to mainland China sellers.&lt;/span&gt;
     */
    private String payoutReference;
    /**
     * Instantiates a new {@link PayoutDetails} and sets the default values.
     */
    public PayoutDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PayoutDetails}
     */
    @jakarta.annotation.Nonnull
    public static PayoutDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PayoutDetails();
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
        deserializerMap.put("payoutIds", (n) -> { this.setPayoutIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("payoutReference", (n) -> { this.setPayoutReference(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the payoutIds property value. This array indicates the list of true(actual) payout ids associated with a split payout. These values can be used as a path parameter for the &lt;b&gt;getPayout&lt;/b&gt; method to retrieve details on the associated payouts.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPayoutIds() {
        return this.payoutIds;
    }
    /**
     * Gets the payoutReference property value. This field contains the unique identifier for the Payout Reference. In split-payout cases, this is the unique identifier reference (not true payout). This field is only returned and will show the associated true(actual) payout id(s) when sellers in Mainland China enable split payouts between a Payoneer account and/or a bank account.  This value can be used by the &lt;b&gt;filter&lt;/b&gt; query parameter of the &lt;b&gt;getPayouts&lt;/b&gt; method to get the monetary details of each true(actual) payout associated with the payoutReference. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;Split-payout functionality will &lt;b&gt;only&lt;/b&gt; be available to mainland China sellers.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPayoutReference() {
        return this.payoutReference;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("payoutIds", this.getPayoutIds());
        writer.writeStringValue("payoutReference", this.getPayoutReference());
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
     * Sets the payoutIds property value. This array indicates the list of true(actual) payout ids associated with a split payout. These values can be used as a path parameter for the &lt;b&gt;getPayout&lt;/b&gt; method to retrieve details on the associated payouts.
     * @param value Value to set for the payoutIds property.
     */
    public void setPayoutIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.payoutIds = value;
    }
    /**
     * Sets the payoutReference property value. This field contains the unique identifier for the Payout Reference. In split-payout cases, this is the unique identifier reference (not true payout). This field is only returned and will show the associated true(actual) payout id(s) when sellers in Mainland China enable split payouts between a Payoneer account and/or a bank account.  This value can be used by the &lt;b&gt;filter&lt;/b&gt; query parameter of the &lt;b&gt;getPayouts&lt;/b&gt; method to get the monetary details of each true(actual) payout associated with the payoutReference. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;Split-payout functionality will &lt;b&gt;only&lt;/b&gt; be available to mainland China sellers.&lt;/span&gt;
     * @param value Value to set for the payoutReference property.
     */
    public void setPayoutReference(@jakarta.annotation.Nullable final String value) {
        this.payoutReference = value;
    }
}
