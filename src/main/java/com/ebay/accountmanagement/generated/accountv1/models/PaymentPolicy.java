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
 * This type is used by the &lt;b&gt;paymentPolicy&lt;/b&gt; response container, a container which defines a seller&apos;s payment business policy for a specific marketplace.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentPolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container indicates whether the payment policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
     */
    private java.util.List<CategoryType> categoryTypes;
    /**
     * This container is applicable only if the &lt;b&gt;categoryTypes.name&lt;/b&gt; field is set to &lt;code&gt;MOTORS_VEHICLES&lt;/code&gt;, and is only returned if the seller requires an initial deposit on motor vehicles.&lt;br&gt;&lt;br&gt;The container shows the amount due for the deposit and when it is due (within 1-3 days after commitment to purchase, unless the listing requires immediate payment). &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The due date that is specified in the &lt;b&gt;deposit&lt;/b&gt; container will be overridden if the payment business policy requires immediate payment (in this case, for the deposit), and the buyer commits to purchasing the motor vehicle through a fixed-price listing or through the &apos;Buy it Now&apos; option of an auction listing. &lt;/p&gt;
     */
    private Deposit deposit;
    /**
     * A seller-defined description of the payment policy. This description is only for the seller&apos;s use, and is not exposed on any eBay pages.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
     */
    private String description;
    /**
     * This container applies to motor vehicles listings only and indicates when a final payment for the vehicle is due. This value is always returned if &lt;b&gt;categoryTypes&lt;/b&gt; is set to &lt;code&gt;MOTORS_VEHICLES&lt;/code&gt;. &lt;br&gt;&lt;br&gt;This container indicates the number of days that a buyer has to make their full payment to the seller and close the remaining balance on a motor vehicle transaction. The period starts when the buyer commits to buy. The valid values, as specified with &lt;b&gt;TimeDuration&lt;/b&gt;, are:&lt;ul&gt;&lt;li&gt;3 DAYS&lt;/li&gt;&lt;li&gt;7 DAYS (the default)&lt;/li&gt;&lt;li&gt;10 DAYS&lt;/li&gt;&lt;li&gt;14 DAYS&lt;/li&gt;&lt;/ul&gt;A &lt;code&gt;MOTORS_VEHICLES&lt;/code&gt;) payment business policy must specify at least one of the following &lt;b&gt;paymentMethods&lt;/b&gt; values for the final payment: &lt;ul&gt; &lt;li&gt;CASH_ON_PICKUP&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This payment method is only available to sellers outside the US.&lt;/span&gt;&lt;/li&gt; &lt;li&gt;CASHIER_CHECK&lt;/li&gt; &lt;li&gt;MONEY_ORDER&lt;/li&gt;&lt;li&gt;PERSONAL_CHECK&lt;/li&gt;&lt;/ul&gt;
     */
    private TimeDuration fullPaymentDueIn;
    /**
     * If this field is returned as &lt;code&gt;true&lt;/code&gt;, immediate payment is required from the buyer for: &lt;ul&gt;&lt;li&gt;A fixed-price item&lt;/li&gt;&lt;li&gt;An auction item where the buyer uses the &apos;Buy it Now&apos; option&lt;/li&gt;&lt;li&gt;A deposit for a motor vehicle listing&lt;/li&gt;&lt;/ul&gt;It is possible for the seller to set this field as &lt;code&gt;true&lt;/code&gt; in the payment business policy, but it will not apply in some scenarios. For example, immediate payment is not applicable for auction listings that have a winning bidder, for buyer purchases that involve the Best Offer feature, or for transactions that happen offline between the buyer and seller.
     */
    private Boolean immediatePay;
    /**
     * The ID of the eBay marketplace to which the payment business policy applies.
     */
    private MarketplaceIdEnum marketplaceId;
    /**
     * A seller-defined name for this payment policy. Names must be unique for policies assigned to the same marketplace. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 64
     */
    private String name;
    /**
     * Although this field may be returned for some older payment business policies, payment instructions are no longer supported by payment business policies. If this field is returned, it can be ignored and these payment instructions will not appear in any listings that use the corresponding business policy. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 1000
     */
    private String paymentInstructions;
    /**
     * This container is returned to show the payment methods that are accepted for the payment business policy.  &lt;br&gt;&lt;br&gt;Sellers do not have to specify any electronic payment methods for listings, so this array will often be returned empty unless the payment business policy is intended for motor vehicle listings or other items in categories where offline payments are required or supported. 
     */
    private java.util.List<PaymentMethod> paymentMethods;
    /**
     * A unique eBay-assigned ID for a payment business policy. This ID is generated when the policy is created.
     */
    private String paymentPolicyId;
    /**
     * Instantiates a new {@link PaymentPolicy} and sets the default values.
     */
    public PaymentPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PaymentPolicy}
     */
    @jakarta.annotation.Nonnull
    public static PaymentPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaymentPolicy();
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
     * Gets the categoryTypes property value. This container indicates whether the payment policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
     * @return a {@link java.util.List<CategoryType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CategoryType> getCategoryTypes() {
        return this.categoryTypes;
    }
    /**
     * Gets the deposit property value. This container is applicable only if the &lt;b&gt;categoryTypes.name&lt;/b&gt; field is set to &lt;code&gt;MOTORS_VEHICLES&lt;/code&gt;, and is only returned if the seller requires an initial deposit on motor vehicles.&lt;br&gt;&lt;br&gt;The container shows the amount due for the deposit and when it is due (within 1-3 days after commitment to purchase, unless the listing requires immediate payment). &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The due date that is specified in the &lt;b&gt;deposit&lt;/b&gt; container will be overridden if the payment business policy requires immediate payment (in this case, for the deposit), and the buyer commits to purchasing the motor vehicle through a fixed-price listing or through the &apos;Buy it Now&apos; option of an auction listing. &lt;/p&gt;
     * @return a {@link Deposit}
     */
    @jakarta.annotation.Nullable
    public Deposit getDeposit() {
        return this.deposit;
    }
    /**
     * Gets the description property value. A seller-defined description of the payment policy. This description is only for the seller&apos;s use, and is not exposed on any eBay pages.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("categoryTypes", (n) -> { this.setCategoryTypes(n.getCollectionOfObjectValues(CategoryType::createFromDiscriminatorValue)); });
        deserializerMap.put("deposit", (n) -> { this.setDeposit(n.getObjectValue(Deposit::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("fullPaymentDueIn", (n) -> { this.setFullPaymentDueIn(n.getObjectValue(TimeDuration::createFromDiscriminatorValue)); });
        deserializerMap.put("immediatePay", (n) -> { this.setImmediatePay(n.getBooleanValue()); });
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getEnumValue(MarketplaceIdEnum::forValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("paymentInstructions", (n) -> { this.setPaymentInstructions(n.getStringValue()); });
        deserializerMap.put("paymentMethods", (n) -> { this.setPaymentMethods(n.getCollectionOfObjectValues(PaymentMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("paymentPolicyId", (n) -> { this.setPaymentPolicyId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fullPaymentDueIn property value. This container applies to motor vehicles listings only and indicates when a final payment for the vehicle is due. This value is always returned if &lt;b&gt;categoryTypes&lt;/b&gt; is set to &lt;code&gt;MOTORS_VEHICLES&lt;/code&gt;. &lt;br&gt;&lt;br&gt;This container indicates the number of days that a buyer has to make their full payment to the seller and close the remaining balance on a motor vehicle transaction. The period starts when the buyer commits to buy. The valid values, as specified with &lt;b&gt;TimeDuration&lt;/b&gt;, are:&lt;ul&gt;&lt;li&gt;3 DAYS&lt;/li&gt;&lt;li&gt;7 DAYS (the default)&lt;/li&gt;&lt;li&gt;10 DAYS&lt;/li&gt;&lt;li&gt;14 DAYS&lt;/li&gt;&lt;/ul&gt;A &lt;code&gt;MOTORS_VEHICLES&lt;/code&gt;) payment business policy must specify at least one of the following &lt;b&gt;paymentMethods&lt;/b&gt; values for the final payment: &lt;ul&gt; &lt;li&gt;CASH_ON_PICKUP&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This payment method is only available to sellers outside the US.&lt;/span&gt;&lt;/li&gt; &lt;li&gt;CASHIER_CHECK&lt;/li&gt; &lt;li&gt;MONEY_ORDER&lt;/li&gt;&lt;li&gt;PERSONAL_CHECK&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link TimeDuration}
     */
    @jakarta.annotation.Nullable
    public TimeDuration getFullPaymentDueIn() {
        return this.fullPaymentDueIn;
    }
    /**
     * Gets the immediatePay property value. If this field is returned as &lt;code&gt;true&lt;/code&gt;, immediate payment is required from the buyer for: &lt;ul&gt;&lt;li&gt;A fixed-price item&lt;/li&gt;&lt;li&gt;An auction item where the buyer uses the &apos;Buy it Now&apos; option&lt;/li&gt;&lt;li&gt;A deposit for a motor vehicle listing&lt;/li&gt;&lt;/ul&gt;It is possible for the seller to set this field as &lt;code&gt;true&lt;/code&gt; in the payment business policy, but it will not apply in some scenarios. For example, immediate payment is not applicable for auction listings that have a winning bidder, for buyer purchases that involve the Best Offer feature, or for transactions that happen offline between the buyer and seller.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getImmediatePay() {
        return this.immediatePay;
    }
    /**
     * Gets the marketplaceId property value. The ID of the eBay marketplace to which the payment business policy applies.
     * @return a {@link MarketplaceIdEnum}
     */
    @jakarta.annotation.Nullable
    public MarketplaceIdEnum getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Gets the name property value. A seller-defined name for this payment policy. Names must be unique for policies assigned to the same marketplace. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 64
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the paymentInstructions property value. Although this field may be returned for some older payment business policies, payment instructions are no longer supported by payment business policies. If this field is returned, it can be ignored and these payment instructions will not appear in any listings that use the corresponding business policy. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 1000
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaymentInstructions() {
        return this.paymentInstructions;
    }
    /**
     * Gets the paymentMethods property value. This container is returned to show the payment methods that are accepted for the payment business policy.  &lt;br&gt;&lt;br&gt;Sellers do not have to specify any electronic payment methods for listings, so this array will often be returned empty unless the payment business policy is intended for motor vehicle listings or other items in categories where offline payments are required or supported. 
     * @return a {@link java.util.List<PaymentMethod>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }
    /**
     * Gets the paymentPolicyId property value. A unique eBay-assigned ID for a payment business policy. This ID is generated when the policy is created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaymentPolicyId() {
        return this.paymentPolicyId;
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
        writer.writeEnumValue("marketplaceId", this.getMarketplaceId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("paymentInstructions", this.getPaymentInstructions());
        writer.writeCollectionOfObjectValues("paymentMethods", this.getPaymentMethods());
        writer.writeStringValue("paymentPolicyId", this.getPaymentPolicyId());
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
     * Sets the categoryTypes property value. This container indicates whether the payment policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
     * @param value Value to set for the categoryTypes property.
     */
    public void setCategoryTypes(@jakarta.annotation.Nullable final java.util.List<CategoryType> value) {
        this.categoryTypes = value;
    }
    /**
     * Sets the deposit property value. This container is applicable only if the &lt;b&gt;categoryTypes.name&lt;/b&gt; field is set to &lt;code&gt;MOTORS_VEHICLES&lt;/code&gt;, and is only returned if the seller requires an initial deposit on motor vehicles.&lt;br&gt;&lt;br&gt;The container shows the amount due for the deposit and when it is due (within 1-3 days after commitment to purchase, unless the listing requires immediate payment). &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The due date that is specified in the &lt;b&gt;deposit&lt;/b&gt; container will be overridden if the payment business policy requires immediate payment (in this case, for the deposit), and the buyer commits to purchasing the motor vehicle through a fixed-price listing or through the &apos;Buy it Now&apos; option of an auction listing. &lt;/p&gt;
     * @param value Value to set for the deposit property.
     */
    public void setDeposit(@jakarta.annotation.Nullable final Deposit value) {
        this.deposit = value;
    }
    /**
     * Sets the description property value. A seller-defined description of the payment policy. This description is only for the seller&apos;s use, and is not exposed on any eBay pages.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the fullPaymentDueIn property value. This container applies to motor vehicles listings only and indicates when a final payment for the vehicle is due. This value is always returned if &lt;b&gt;categoryTypes&lt;/b&gt; is set to &lt;code&gt;MOTORS_VEHICLES&lt;/code&gt;. &lt;br&gt;&lt;br&gt;This container indicates the number of days that a buyer has to make their full payment to the seller and close the remaining balance on a motor vehicle transaction. The period starts when the buyer commits to buy. The valid values, as specified with &lt;b&gt;TimeDuration&lt;/b&gt;, are:&lt;ul&gt;&lt;li&gt;3 DAYS&lt;/li&gt;&lt;li&gt;7 DAYS (the default)&lt;/li&gt;&lt;li&gt;10 DAYS&lt;/li&gt;&lt;li&gt;14 DAYS&lt;/li&gt;&lt;/ul&gt;A &lt;code&gt;MOTORS_VEHICLES&lt;/code&gt;) payment business policy must specify at least one of the following &lt;b&gt;paymentMethods&lt;/b&gt; values for the final payment: &lt;ul&gt; &lt;li&gt;CASH_ON_PICKUP&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This payment method is only available to sellers outside the US.&lt;/span&gt;&lt;/li&gt; &lt;li&gt;CASHIER_CHECK&lt;/li&gt; &lt;li&gt;MONEY_ORDER&lt;/li&gt;&lt;li&gt;PERSONAL_CHECK&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the fullPaymentDueIn property.
     */
    public void setFullPaymentDueIn(@jakarta.annotation.Nullable final TimeDuration value) {
        this.fullPaymentDueIn = value;
    }
    /**
     * Sets the immediatePay property value. If this field is returned as &lt;code&gt;true&lt;/code&gt;, immediate payment is required from the buyer for: &lt;ul&gt;&lt;li&gt;A fixed-price item&lt;/li&gt;&lt;li&gt;An auction item where the buyer uses the &apos;Buy it Now&apos; option&lt;/li&gt;&lt;li&gt;A deposit for a motor vehicle listing&lt;/li&gt;&lt;/ul&gt;It is possible for the seller to set this field as &lt;code&gt;true&lt;/code&gt; in the payment business policy, but it will not apply in some scenarios. For example, immediate payment is not applicable for auction listings that have a winning bidder, for buyer purchases that involve the Best Offer feature, or for transactions that happen offline between the buyer and seller.
     * @param value Value to set for the immediatePay property.
     */
    public void setImmediatePay(@jakarta.annotation.Nullable final Boolean value) {
        this.immediatePay = value;
    }
    /**
     * Sets the marketplaceId property value. The ID of the eBay marketplace to which the payment business policy applies.
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final MarketplaceIdEnum value) {
        this.marketplaceId = value;
    }
    /**
     * Sets the name property value. A seller-defined name for this payment policy. Names must be unique for policies assigned to the same marketplace. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 64
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the paymentInstructions property value. Although this field may be returned for some older payment business policies, payment instructions are no longer supported by payment business policies. If this field is returned, it can be ignored and these payment instructions will not appear in any listings that use the corresponding business policy. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 1000
     * @param value Value to set for the paymentInstructions property.
     */
    public void setPaymentInstructions(@jakarta.annotation.Nullable final String value) {
        this.paymentInstructions = value;
    }
    /**
     * Sets the paymentMethods property value. This container is returned to show the payment methods that are accepted for the payment business policy.  &lt;br&gt;&lt;br&gt;Sellers do not have to specify any electronic payment methods for listings, so this array will often be returned empty unless the payment business policy is intended for motor vehicle listings or other items in categories where offline payments are required or supported. 
     * @param value Value to set for the paymentMethods property.
     */
    public void setPaymentMethods(@jakarta.annotation.Nullable final java.util.List<PaymentMethod> value) {
        this.paymentMethods = value;
    }
    /**
     * Sets the paymentPolicyId property value. A unique eBay-assigned ID for a payment business policy. This ID is generated when the policy is created.
     * @param value Value to set for the paymentPolicyId property.
     */
    public void setPaymentPolicyId(@jakarta.annotation.Nullable final String value) {
        this.paymentPolicyId = value;
    }
}
