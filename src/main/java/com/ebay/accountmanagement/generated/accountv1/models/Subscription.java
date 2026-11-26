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
 * This type is used by the &lt;strong&gt;getSubscription&lt;/strong&gt; response container, which defines the subscription types and levels for the seller account.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Subscription implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The marketplace with which the subscription is associated.
     */
    private MarketplaceIdEnum marketplaceId;
    /**
     * The subscription ID.
     */
    private String subscriptionId;
    /**
     * The subscription level. For example, subscription levels for an eBay store include Starter, Basic, Featured, Anchor, and Enterprise levels.
     */
    private String subscriptionLevel;
    /**
     * The kind of entity with which the subscription is associated, such as an eBay store.
     */
    private SubscriptionTypeEnum subscriptionType;
    /**
     * The term of the subscription plan (typically in months).
     */
    private TimeDuration term;
    /**
     * Instantiates a new {@link Subscription} and sets the default values.
     */
    public Subscription() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Subscription}
     */
    @jakarta.annotation.Nonnull
    public static Subscription createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Subscription();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getEnumValue(MarketplaceIdEnum::forValue)); });
        deserializerMap.put("subscriptionId", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        deserializerMap.put("subscriptionLevel", (n) -> { this.setSubscriptionLevel(n.getStringValue()); });
        deserializerMap.put("subscriptionType", (n) -> { this.setSubscriptionType(n.getEnumValue(SubscriptionTypeEnum::forValue)); });
        deserializerMap.put("term", (n) -> { this.setTerm(n.getObjectValue(TimeDuration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the marketplaceId property value. The marketplace with which the subscription is associated.
     * @return a {@link MarketplaceIdEnum}
     */
    @jakarta.annotation.Nullable
    public MarketplaceIdEnum getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Gets the subscriptionId property value. The subscription ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * Gets the subscriptionLevel property value. The subscription level. For example, subscription levels for an eBay store include Starter, Basic, Featured, Anchor, and Enterprise levels.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionLevel() {
        return this.subscriptionLevel;
    }
    /**
     * Gets the subscriptionType property value. The kind of entity with which the subscription is associated, such as an eBay store.
     * @return a {@link SubscriptionTypeEnum}
     */
    @jakarta.annotation.Nullable
    public SubscriptionTypeEnum getSubscriptionType() {
        return this.subscriptionType;
    }
    /**
     * Gets the term property value. The term of the subscription plan (typically in months).
     * @return a {@link TimeDuration}
     */
    @jakarta.annotation.Nullable
    public TimeDuration getTerm() {
        return this.term;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("marketplaceId", this.getMarketplaceId());
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
        writer.writeStringValue("subscriptionLevel", this.getSubscriptionLevel());
        writer.writeEnumValue("subscriptionType", this.getSubscriptionType());
        writer.writeObjectValue("term", this.getTerm());
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
     * Sets the marketplaceId property value. The marketplace with which the subscription is associated.
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final MarketplaceIdEnum value) {
        this.marketplaceId = value;
    }
    /**
     * Sets the subscriptionId property value. The subscription ID.
     * @param value Value to set for the subscriptionId property.
     */
    public void setSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.subscriptionId = value;
    }
    /**
     * Sets the subscriptionLevel property value. The subscription level. For example, subscription levels for an eBay store include Starter, Basic, Featured, Anchor, and Enterprise levels.
     * @param value Value to set for the subscriptionLevel property.
     */
    public void setSubscriptionLevel(@jakarta.annotation.Nullable final String value) {
        this.subscriptionLevel = value;
    }
    /**
     * Sets the subscriptionType property value. The kind of entity with which the subscription is associated, such as an eBay store.
     * @param value Value to set for the subscriptionType property.
     */
    public void setSubscriptionType(@jakarta.annotation.Nullable final SubscriptionTypeEnum value) {
        this.subscriptionType = value;
    }
    /**
     * Sets the term property value. The term of the subscription plan (typically in months).
     * @param value Value to set for the term property.
     */
    public void setTerm(@jakarta.annotation.Nullable final TimeDuration value) {
        this.term = value;
    }
}
