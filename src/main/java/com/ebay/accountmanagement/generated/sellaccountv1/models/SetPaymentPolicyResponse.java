package com.ebay.accountmanagement.generated.sellaccountv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Complex type that that gets populated with a response containing a payment policy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SetPaymentPolicyResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container indicates whether the payment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
     */
    private java.util.List<CategoryType> categoryTypes;
    /**
     * This type is used to specify/indicate that an initial deposit is required for a motor vehicle listing.
     */
    private Deposit deposit;
    /**
     * A seller-defined description of the payment business policy. This description is only for the seller&apos;s use, and is not exposed on any eBay pages. This field is returned if set for the policy. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
     */
    private String description;
    /**
     * A type used to specify a period of time using a specified time-measurement unit. Payment, return, and fulfillment business policies all use this type to specify time windows.&lt;br&gt;&lt;br&gt;Whenever a container that uses this type is used in a request, both of these fields are required. Similarly, whenever a container that uses this type is returned in a response, both of these fields are always returned.
     */
    private TimeDuration fullPaymentDueIn;
    /**
     * The value returned in this field will reflect the value set by the seller in the &lt;b&gt;immediatePay&lt;/b&gt; request field. A value of &lt;code&gt;true&lt;/code&gt; indicates that immediate payment is required from the buyer for: &lt;ul&gt;&lt;li&gt;A fixed-price item&lt;/li&gt;&lt;li&gt;An auction item where the buyer is using the &apos;Buy it Now&apos; option&lt;/li&gt;&lt;li&gt;A deposit for a motor vehicle listing&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;It is possible for the seller to set this field as &lt;code&gt;true&lt;/code&gt; in the payment business policy, but it will not apply in some scenarios. For example, immediate payment is not applicable for auction listings that have a winning bidder, for buyer purchases that involve the Best Offer feature, or for transactions that happen offline between the buyer and seller.
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
     * &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; NO LONGER SUPPORTED. Although this field may be returned for some older payment business policies, payment instructions are no longer supported by payment business policies. If this field is returned, it can be ignored and these payment instructions will not appear in any listings that use the corresponding business policy.&lt;/p&gt;A free-form string field that allows sellers to add detailed payment instructions to their listings.
     */
    private String paymentInstructions;
    /**
     * This array shows the available payment methods that the seller has set for the payment business policy.&lt;br&gt;&lt;br&gt;Sellers do not have to specify any electronic payment methods for listings, so this array will often be returned empty unless the payment business policy is intended for motor vehicle listings or other items in categories where offline payments are required or supported.
     */
    private java.util.List<PaymentMethod> paymentMethods;
    /**
     * A unique eBay-assigned ID for a payment business policy. This ID is generated when the policy is created.
     */
    private String paymentPolicyId;
    /**
     * An array of one or more errors or warnings that were generated during the processing of the request. If there were no issues with the request, this array will return empty.
     */
    private java.util.List<Error> warnings;
    /**
     * Instantiates a new {@link SetPaymentPolicyResponse} and sets the default values.
     */
    public SetPaymentPolicyResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SetPaymentPolicyResponse}
     */
    @jakarta.annotation.Nonnull
    public static SetPaymentPolicyResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetPaymentPolicyResponse();
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
     * Gets the categoryTypes property value. This container indicates whether the payment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
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
     * Gets the description property value. A seller-defined description of the payment business policy. This description is only for the seller&apos;s use, and is not exposed on any eBay pages. This field is returned if set for the policy. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("categoryTypes", (n) -> { this.setCategoryTypes(n.getCollectionOfObjectValues(CategoryType::createFromDiscriminatorValue)); });
        deserializerMap.put("deposit", (n) -> { this.setDeposit(n.getObjectValue(Deposit::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("fullPaymentDueIn", (n) -> { this.setFullPaymentDueIn(n.getObjectValue(TimeDuration::createFromDiscriminatorValue)); });
        deserializerMap.put("immediatePay", (n) -> { this.setImmediatePay(n.getBooleanValue()); });
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("paymentInstructions", (n) -> { this.setPaymentInstructions(n.getStringValue()); });
        deserializerMap.put("paymentMethods", (n) -> { this.setPaymentMethods(n.getCollectionOfObjectValues(PaymentMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("paymentPolicyId", (n) -> { this.setPaymentPolicyId(n.getStringValue()); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getCollectionOfObjectValues(Error::createFromDiscriminatorValue)); });
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
     * Gets the immediatePay property value. The value returned in this field will reflect the value set by the seller in the &lt;b&gt;immediatePay&lt;/b&gt; request field. A value of &lt;code&gt;true&lt;/code&gt; indicates that immediate payment is required from the buyer for: &lt;ul&gt;&lt;li&gt;A fixed-price item&lt;/li&gt;&lt;li&gt;An auction item where the buyer is using the &apos;Buy it Now&apos; option&lt;/li&gt;&lt;li&gt;A deposit for a motor vehicle listing&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;It is possible for the seller to set this field as &lt;code&gt;true&lt;/code&gt; in the payment business policy, but it will not apply in some scenarios. For example, immediate payment is not applicable for auction listings that have a winning bidder, for buyer purchases that involve the Best Offer feature, or for transactions that happen offline between the buyer and seller.
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
     * Gets the paymentInstructions property value. &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; NO LONGER SUPPORTED. Although this field may be returned for some older payment business policies, payment instructions are no longer supported by payment business policies. If this field is returned, it can be ignored and these payment instructions will not appear in any listings that use the corresponding business policy.&lt;/p&gt;A free-form string field that allows sellers to add detailed payment instructions to their listings.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaymentInstructions() {
        return this.paymentInstructions;
    }
    /**
     * Gets the paymentMethods property value. This array shows the available payment methods that the seller has set for the payment business policy.&lt;br&gt;&lt;br&gt;Sellers do not have to specify any electronic payment methods for listings, so this array will often be returned empty unless the payment business policy is intended for motor vehicle listings or other items in categories where offline payments are required or supported.
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
     * Gets the warnings property value. An array of one or more errors or warnings that were generated during the processing of the request. If there were no issues with the request, this array will return empty.
     * @return a {@link java.util.List<Error>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Error> getWarnings() {
        return this.warnings;
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
        writer.writeStringValue("paymentPolicyId", this.getPaymentPolicyId());
        writer.writeCollectionOfObjectValues("warnings", this.getWarnings());
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
     * Sets the categoryTypes property value. This container indicates whether the payment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
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
     * Sets the description property value. A seller-defined description of the payment business policy. This description is only for the seller&apos;s use, and is not exposed on any eBay pages. This field is returned if set for the policy. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
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
     * Sets the immediatePay property value. The value returned in this field will reflect the value set by the seller in the &lt;b&gt;immediatePay&lt;/b&gt; request field. A value of &lt;code&gt;true&lt;/code&gt; indicates that immediate payment is required from the buyer for: &lt;ul&gt;&lt;li&gt;A fixed-price item&lt;/li&gt;&lt;li&gt;An auction item where the buyer is using the &apos;Buy it Now&apos; option&lt;/li&gt;&lt;li&gt;A deposit for a motor vehicle listing&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;It is possible for the seller to set this field as &lt;code&gt;true&lt;/code&gt; in the payment business policy, but it will not apply in some scenarios. For example, immediate payment is not applicable for auction listings that have a winning bidder, for buyer purchases that involve the Best Offer feature, or for transactions that happen offline between the buyer and seller.
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
     * Sets the paymentInstructions property value. &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; NO LONGER SUPPORTED. Although this field may be returned for some older payment business policies, payment instructions are no longer supported by payment business policies. If this field is returned, it can be ignored and these payment instructions will not appear in any listings that use the corresponding business policy.&lt;/p&gt;A free-form string field that allows sellers to add detailed payment instructions to their listings.
     * @param value Value to set for the paymentInstructions property.
     */
    public void setPaymentInstructions(@jakarta.annotation.Nullable final String value) {
        this.paymentInstructions = value;
    }
    /**
     * Sets the paymentMethods property value. This array shows the available payment methods that the seller has set for the payment business policy.&lt;br&gt;&lt;br&gt;Sellers do not have to specify any electronic payment methods for listings, so this array will often be returned empty unless the payment business policy is intended for motor vehicle listings or other items in categories where offline payments are required or supported.
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
    /**
     * Sets the warnings property value. An array of one or more errors or warnings that were generated during the processing of the request. If there were no issues with the request, this array will return empty.
     * @param value Value to set for the warnings property.
     */
    public void setWarnings(@jakarta.annotation.Nullable final java.util.List<Error> value) {
        this.warnings = value;
    }
}
