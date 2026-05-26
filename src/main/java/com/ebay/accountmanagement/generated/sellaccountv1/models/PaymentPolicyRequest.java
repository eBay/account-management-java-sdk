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
 * This root container defines a seller&apos;s payment business policy for a specific marketplace and category group. This type is used when creating or updating a payment business policy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentPolicyRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container is used to specify whether the payment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
     */
    private java.util.List<CategoryType> categoryTypes;
    /**
     * This type is used to specify/indicate that an initial deposit is required for a motor vehicle listing.
     */
    private Deposit deposit;
    /**
     * A seller-defined description of the payment business policy. This description is only for the seller&apos;s use, and is not exposed on any eBay pages.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
     */
    private String description;
    /**
     * A type used to specify a period of time using a specified time-measurement unit. Payment, return, and fulfillment business policies all use this type to specify time windows.&lt;br&gt;&lt;br&gt;Whenever a container that uses this type is used in a request, both of these fields are required. Similarly, whenever a container that uses this type is returned in a response, both of these fields are always returned.
     */
    private TimeDuration fullPaymentDueIn;
    /**
     * This field should be included and set to &lt;code&gt;true&lt;/code&gt; if the seller wants to require immediate payment from the buyer for: &lt;ul&gt;&lt;li&gt;A fixed-price item&lt;/li&gt;&lt;li&gt;An auction item where the buyer is using the &apos;Buy it Now&apos; option&lt;/li&gt;&lt;li&gt;A deposit for a motor vehicle listing&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; False
     */
    private Boolean immediatePay;
    /**
     * The ID of the eBay marketplace to which this payment business policy applies. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String marketplaceId;
    /**
     * A seller-defined name for this payment business policy. Names must be unique for policies assigned to the same marketplace.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 64
     */
    private String name;
    /**
     * &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; DO NOT USE THIS FIELD. Payment instructions are no longer supported by payment business policies.&lt;/p&gt;A free-form string field that allows sellers to add detailed payment instructions to their listings.
     */
    private String paymentInstructions;
    /**
     * &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field applies only when the seller needs to specify one or more offline payment methods. eBay now manages the electronic payment options available to buyers to pay for the item.&lt;/p&gt;This array is used to specify one or more offline payment methods that will be accepted for payment that occurs off of eBay&apos;s platform.
     */
    private java.util.List<PaymentMethod> paymentMethods;
    /**
     * Instantiates a new {@link PaymentPolicyRequest} and sets the default values.
     */
    public PaymentPolicyRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PaymentPolicyRequest}
     */
    @jakarta.annotation.Nonnull
    public static PaymentPolicyRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaymentPolicyRequest();
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
     * Gets the categoryTypes property value. This container is used to specify whether the payment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
     * @return a {@link java.util.List<CategoryType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CategoryType> getCategoryTypes() {
        return this.categoryTypes;
    }
    /**
     * Gets the deposit property value. This type is used to specify/indicate that an initial deposit is required for a motor vehicle listing.
     * @return a {@link Deposit}
     */
    @jakarta.annotation.Nullable
    public Deposit getDeposit() {
        return this.deposit;
    }
    /**
     * Gets the description property value. A seller-defined description of the payment business policy. This description is only for the seller&apos;s use, and is not exposed on any eBay pages.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("categoryTypes", (n) -> { this.setCategoryTypes(n.getCollectionOfObjectValues(CategoryType::createFromDiscriminatorValue)); });
        deserializerMap.put("deposit", (n) -> { this.setDeposit(n.getObjectValue(Deposit::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("fullPaymentDueIn", (n) -> { this.setFullPaymentDueIn(n.getObjectValue(TimeDuration::createFromDiscriminatorValue)); });
        deserializerMap.put("immediatePay", (n) -> { this.setImmediatePay(n.getBooleanValue()); });
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("paymentInstructions", (n) -> { this.setPaymentInstructions(n.getStringValue()); });
        deserializerMap.put("paymentMethods", (n) -> { this.setPaymentMethods(n.getCollectionOfObjectValues(PaymentMethod::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fullPaymentDueIn property value. A type used to specify a period of time using a specified time-measurement unit. Payment, return, and fulfillment business policies all use this type to specify time windows.&lt;br&gt;&lt;br&gt;Whenever a container that uses this type is used in a request, both of these fields are required. Similarly, whenever a container that uses this type is returned in a response, both of these fields are always returned.
     * @return a {@link TimeDuration}
     */
    @jakarta.annotation.Nullable
    public TimeDuration getFullPaymentDueIn() {
        return this.fullPaymentDueIn;
    }
    /**
     * Gets the immediatePay property value. This field should be included and set to &lt;code&gt;true&lt;/code&gt; if the seller wants to require immediate payment from the buyer for: &lt;ul&gt;&lt;li&gt;A fixed-price item&lt;/li&gt;&lt;li&gt;An auction item where the buyer is using the &apos;Buy it Now&apos; option&lt;/li&gt;&lt;li&gt;A deposit for a motor vehicle listing&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; False
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getImmediatePay() {
        return this.immediatePay;
    }
    /**
     * Gets the marketplaceId property value. The ID of the eBay marketplace to which this payment business policy applies. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Gets the name property value. A seller-defined name for this payment business policy. Names must be unique for policies assigned to the same marketplace.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 64
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the paymentInstructions property value. &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; DO NOT USE THIS FIELD. Payment instructions are no longer supported by payment business policies.&lt;/p&gt;A free-form string field that allows sellers to add detailed payment instructions to their listings.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaymentInstructions() {
        return this.paymentInstructions;
    }
    /**
     * Gets the paymentMethods property value. &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field applies only when the seller needs to specify one or more offline payment methods. eBay now manages the electronic payment options available to buyers to pay for the item.&lt;/p&gt;This array is used to specify one or more offline payment methods that will be accepted for payment that occurs off of eBay&apos;s platform.
     * @return a {@link java.util.List<PaymentMethod>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("categoryTypes", this.getCategoryTypes());
        writer.writeObjectValue("deposit", this.getDeposit());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("fullPaymentDueIn", this.getFullPaymentDueIn());
        writer.writeBooleanValue("immediatePay", this.getImmediatePay());
        writer.writeStringValue("marketplaceId", this.getMarketplaceId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("paymentInstructions", this.getPaymentInstructions());
        writer.writeCollectionOfObjectValues("paymentMethods", this.getPaymentMethods());
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
     * Sets the categoryTypes property value. This container is used to specify whether the payment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
     * @param value Value to set for the categoryTypes property.
     */
    public void setCategoryTypes(@jakarta.annotation.Nullable final java.util.List<CategoryType> value) {
        this.categoryTypes = value;
    }
    /**
     * Sets the deposit property value. This type is used to specify/indicate that an initial deposit is required for a motor vehicle listing.
     * @param value Value to set for the deposit property.
     */
    public void setDeposit(@jakarta.annotation.Nullable final Deposit value) {
        this.deposit = value;
    }
    /**
     * Sets the description property value. A seller-defined description of the payment business policy. This description is only for the seller&apos;s use, and is not exposed on any eBay pages.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the fullPaymentDueIn property value. A type used to specify a period of time using a specified time-measurement unit. Payment, return, and fulfillment business policies all use this type to specify time windows.&lt;br&gt;&lt;br&gt;Whenever a container that uses this type is used in a request, both of these fields are required. Similarly, whenever a container that uses this type is returned in a response, both of these fields are always returned.
     * @param value Value to set for the fullPaymentDueIn property.
     */
    public void setFullPaymentDueIn(@jakarta.annotation.Nullable final TimeDuration value) {
        this.fullPaymentDueIn = value;
    }
    /**
     * Sets the immediatePay property value. This field should be included and set to &lt;code&gt;true&lt;/code&gt; if the seller wants to require immediate payment from the buyer for: &lt;ul&gt;&lt;li&gt;A fixed-price item&lt;/li&gt;&lt;li&gt;An auction item where the buyer is using the &apos;Buy it Now&apos; option&lt;/li&gt;&lt;li&gt;A deposit for a motor vehicle listing&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; False
     * @param value Value to set for the immediatePay property.
     */
    public void setImmediatePay(@jakarta.annotation.Nullable final Boolean value) {
        this.immediatePay = value;
    }
    /**
     * Sets the marketplaceId property value. The ID of the eBay marketplace to which this payment business policy applies. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final String value) {
        this.marketplaceId = value;
    }
    /**
     * Sets the name property value. A seller-defined name for this payment business policy. Names must be unique for policies assigned to the same marketplace.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 64
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the paymentInstructions property value. &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; DO NOT USE THIS FIELD. Payment instructions are no longer supported by payment business policies.&lt;/p&gt;A free-form string field that allows sellers to add detailed payment instructions to their listings.
     * @param value Value to set for the paymentInstructions property.
     */
    public void setPaymentInstructions(@jakarta.annotation.Nullable final String value) {
        this.paymentInstructions = value;
    }
    /**
     * Sets the paymentMethods property value. &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field applies only when the seller needs to specify one or more offline payment methods. eBay now manages the electronic payment options available to buyers to pay for the item.&lt;/p&gt;This array is used to specify one or more offline payment methods that will be accepted for payment that occurs off of eBay&apos;s platform.
     * @param value Value to set for the paymentMethods property.
     */
    public void setPaymentMethods(@jakarta.annotation.Nullable final java.util.List<PaymentMethod> value) {
        this.paymentMethods = value;
    }
}
