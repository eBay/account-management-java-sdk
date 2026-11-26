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
 * This type is used by the &lt;b&gt;returnPolicy&lt;/b&gt; response container, a container which defines a seller&apos;s return business policy for a specific marketplace.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReturnPolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container indicates which category group that the return policy applies to.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: Return business policies are not applicable to motor vehicle listings, so the &lt;b&gt;categoryTypes.name&lt;/b&gt; value will always be &lt;code&gt;ALL_EXCLUDING_MOTORS_VEHICLES&lt;/code&gt; for return business policies.&lt;/span&gt;
     */
    private java.util.List<CategoryType> categoryTypes;
    /**
     * A seller-defined description of the return business policy. This description is only for the seller&apos;s use, and is not exposed on any eBay pages.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
     */
    private String description;
    /**
     * &lt;p class=&quot;tablenote&quot;&gt;&lt;span  style=&quot;color: #dd1e31;&quot;&gt;&lt;b&gt;Important!&lt;/b&gt;&lt;/span&gt; This field is deprecated, since eBay no longer supports extended holiday returns. Any value supplied in this field is neither read nor returned.&lt;/p&gt; 
     */
    private Boolean extendedHolidayReturnsOffered;
    /**
     * This container shows the seller&apos;s international return policy settings. This container is only returned if the seller has set a separate international return policy for the business policy. International return policies are optional, even if the seller ships to international locations. If a separate international return policy is not set, all of the domestic return policy settings also apply to international orders.
     */
    private InternationalReturnOverrideType internationalOverride;
    /**
     * The ID of the eBay marketplace to which this return business policy applies.
     */
    private MarketplaceIdEnum marketplaceId;
    /**
     * A seller-defined name for this return business policy. Names must be unique for policies assigned to the same marketplace.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 64
     */
    private String name;
    /**
     * This field indicates the refund method offered by the seller. Its value will be &lt;code&gt;MONEY_BACK&lt;/code&gt; unless the seller is enabled for &lt;b&gt;Click and Collect&lt;/b&gt;, and then it might be &lt;code&gt;MERCHANDISE_CREDIT&lt;/code&gt;. Getting their money back for returned items is always an option for buyers, regardless of what the seller sets in this field.
     */
    private RefundMethodEnum refundMethod;
    /**
     * &lt;p class=&quot;tablenote&quot;&gt;&lt;span  style=&quot;color: #dd1e31;&quot;&gt;&lt;b&gt;Important!&lt;/b&gt;&lt;/span&gt; This field is deprecated, since eBay no longer allows sellers to charge a restocking fee for buyer remorse returns. If this field is included, it is ignored and it is no longer returned.&lt;/p&gt;
     */
    private String restockingFeePercentage;
    /**
     * This text-based field provides more details on seller-specified return instructions. This field is only returned if set for the return business policy.&lt;br&gt;&lt;p class=&quot;tablenote&quot;&gt;&lt;span  style=&quot;color: #dd1e31;&quot;&gt;&lt;b&gt;Important!&lt;/b&gt;&lt;/span&gt; This field is no longer supported on many eBay marketplaces. To see if a marketplace and eBay category does support this field, call &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getreturnpolicies&quot;&gt;getReturnPolicies&lt;/a&gt; method of the &lt;b&gt;Metadata API&lt;/b&gt;. Then you will look for the &lt;b&gt;policyDescriptionEnabled&lt;/b&gt; field with a value of &lt;code&gt;true&lt;/code&gt; for the eBay category.&lt;/span&gt;&lt;/p&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 5000 (8000 for DE)
     */
    private String returnInstructions;
    /**
     * This field is only returned if the seller is willing to offer a replacement item as an alternative to &apos;Money Back&apos;.
     */
    private ReturnMethodEnum returnMethod;
    /**
     * This container indicates the number of calendar days that the buyer has to return an item. The return period begins when the item is marked &quot;delivered&quot; at the buyer&apos;s specified ship-to location.  &lt;br&gt;&lt;br&gt;Most categories support 30-day and 60-day return periods.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: Unless the seller has set a separate international return policy through the &lt;b&gt;internationalOverride&lt;/b&gt; container, this return period will be valid for domestic and international returns (if the seller ships internationally).&lt;/span&gt;
     */
    private TimeDuration returnPeriod;
    /**
     * A unique eBay-assigned ID for a return business policy. This ID is generated when the policy is created.
     */
    private String returnPolicyId;
    /**
     * If this field is returned as &lt;code&gt;true&lt;/code&gt;, the seller accepts returns. If set to &lt;code&gt;false&lt;/code&gt;, the seller does not accept returns.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Top-Rated sellers must accept item returns and the &lt;b&gt;handlingTime&lt;/b&gt; should be set to zero days or one day for a listing to receive a Top-Rated Plus badge on the View Item or search result pages. For more information on eBay&apos;s Top-Rated seller program, see &lt;a href=&quot;https://pages.ebay.com/help/sell/top-rated.html &quot;&gt;Becoming a Top Rated Seller and qualifying for Top Rated Plus benefits&lt;/a&gt;.&lt;/span&gt;
     */
    private Boolean returnsAccepted;
    /**
     * This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either &lt;code&gt;BUYER&lt;/code&gt; or &lt;code&gt;SELLER&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;Depending on the return policy and specifics of the return, either the buyer or the seller can be responsible for the return shipping costs. Note that the seller is always responsible for return shipping costs for SNAD-related issues.
     */
    private ReturnShippingCostPayerEnum returnShippingCostPayer;
    /**
     * Instantiates a new {@link ReturnPolicy} and sets the default values.
     */
    public ReturnPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReturnPolicy}
     */
    @jakarta.annotation.Nonnull
    public static ReturnPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReturnPolicy();
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
     * Gets the categoryTypes property value. This container indicates which category group that the return policy applies to.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: Return business policies are not applicable to motor vehicle listings, so the &lt;b&gt;categoryTypes.name&lt;/b&gt; value will always be &lt;code&gt;ALL_EXCLUDING_MOTORS_VEHICLES&lt;/code&gt; for return business policies.&lt;/span&gt;
     * @return a {@link java.util.List<CategoryType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CategoryType> getCategoryTypes() {
        return this.categoryTypes;
    }
    /**
     * Gets the description property value. A seller-defined description of the return business policy. This description is only for the seller&apos;s use, and is not exposed on any eBay pages.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the extendedHolidayReturnsOffered property value. &lt;p class=&quot;tablenote&quot;&gt;&lt;span  style=&quot;color: #dd1e31;&quot;&gt;&lt;b&gt;Important!&lt;/b&gt;&lt;/span&gt; This field is deprecated, since eBay no longer supports extended holiday returns. Any value supplied in this field is neither read nor returned.&lt;/p&gt; 
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getExtendedHolidayReturnsOffered() {
        return this.extendedHolidayReturnsOffered;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("categoryTypes", (n) -> { this.setCategoryTypes(n.getCollectionOfObjectValues(CategoryType::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("extendedHolidayReturnsOffered", (n) -> { this.setExtendedHolidayReturnsOffered(n.getBooleanValue()); });
        deserializerMap.put("internationalOverride", (n) -> { this.setInternationalOverride(n.getObjectValue(InternationalReturnOverrideType::createFromDiscriminatorValue)); });
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getEnumValue(MarketplaceIdEnum::forValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("refundMethod", (n) -> { this.setRefundMethod(n.getEnumValue(RefundMethodEnum::forValue)); });
        deserializerMap.put("restockingFeePercentage", (n) -> { this.setRestockingFeePercentage(n.getStringValue()); });
        deserializerMap.put("returnInstructions", (n) -> { this.setReturnInstructions(n.getStringValue()); });
        deserializerMap.put("returnMethod", (n) -> { this.setReturnMethod(n.getEnumValue(ReturnMethodEnum::forValue)); });
        deserializerMap.put("returnPeriod", (n) -> { this.setReturnPeriod(n.getObjectValue(TimeDuration::createFromDiscriminatorValue)); });
        deserializerMap.put("returnPolicyId", (n) -> { this.setReturnPolicyId(n.getStringValue()); });
        deserializerMap.put("returnsAccepted", (n) -> { this.setReturnsAccepted(n.getBooleanValue()); });
        deserializerMap.put("returnShippingCostPayer", (n) -> { this.setReturnShippingCostPayer(n.getEnumValue(ReturnShippingCostPayerEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the internationalOverride property value. This container shows the seller&apos;s international return policy settings. This container is only returned if the seller has set a separate international return policy for the business policy. International return policies are optional, even if the seller ships to international locations. If a separate international return policy is not set, all of the domestic return policy settings also apply to international orders.
     * @return a {@link InternationalReturnOverrideType}
     */
    @jakarta.annotation.Nullable
    public InternationalReturnOverrideType getInternationalOverride() {
        return this.internationalOverride;
    }
    /**
     * Gets the marketplaceId property value. The ID of the eBay marketplace to which this return business policy applies.
     * @return a {@link MarketplaceIdEnum}
     */
    @jakarta.annotation.Nullable
    public MarketplaceIdEnum getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Gets the name property value. A seller-defined name for this return business policy. Names must be unique for policies assigned to the same marketplace.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 64
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the refundMethod property value. This field indicates the refund method offered by the seller. Its value will be &lt;code&gt;MONEY_BACK&lt;/code&gt; unless the seller is enabled for &lt;b&gt;Click and Collect&lt;/b&gt;, and then it might be &lt;code&gt;MERCHANDISE_CREDIT&lt;/code&gt;. Getting their money back for returned items is always an option for buyers, regardless of what the seller sets in this field.
     * @return a {@link RefundMethodEnum}
     */
    @jakarta.annotation.Nullable
    public RefundMethodEnum getRefundMethod() {
        return this.refundMethod;
    }
    /**
     * Gets the restockingFeePercentage property value. &lt;p class=&quot;tablenote&quot;&gt;&lt;span  style=&quot;color: #dd1e31;&quot;&gt;&lt;b&gt;Important!&lt;/b&gt;&lt;/span&gt; This field is deprecated, since eBay no longer allows sellers to charge a restocking fee for buyer remorse returns. If this field is included, it is ignored and it is no longer returned.&lt;/p&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRestockingFeePercentage() {
        return this.restockingFeePercentage;
    }
    /**
     * Gets the returnInstructions property value. This text-based field provides more details on seller-specified return instructions. This field is only returned if set for the return business policy.&lt;br&gt;&lt;p class=&quot;tablenote&quot;&gt;&lt;span  style=&quot;color: #dd1e31;&quot;&gt;&lt;b&gt;Important!&lt;/b&gt;&lt;/span&gt; This field is no longer supported on many eBay marketplaces. To see if a marketplace and eBay category does support this field, call &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getreturnpolicies&quot;&gt;getReturnPolicies&lt;/a&gt; method of the &lt;b&gt;Metadata API&lt;/b&gt;. Then you will look for the &lt;b&gt;policyDescriptionEnabled&lt;/b&gt; field with a value of &lt;code&gt;true&lt;/code&gt; for the eBay category.&lt;/span&gt;&lt;/p&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 5000 (8000 for DE)
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReturnInstructions() {
        return this.returnInstructions;
    }
    /**
     * Gets the returnMethod property value. This field is only returned if the seller is willing to offer a replacement item as an alternative to &apos;Money Back&apos;.
     * @return a {@link ReturnMethodEnum}
     */
    @jakarta.annotation.Nullable
    public ReturnMethodEnum getReturnMethod() {
        return this.returnMethod;
    }
    /**
     * Gets the returnPeriod property value. This container indicates the number of calendar days that the buyer has to return an item. The return period begins when the item is marked &quot;delivered&quot; at the buyer&apos;s specified ship-to location.  &lt;br&gt;&lt;br&gt;Most categories support 30-day and 60-day return periods.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: Unless the seller has set a separate international return policy through the &lt;b&gt;internationalOverride&lt;/b&gt; container, this return period will be valid for domestic and international returns (if the seller ships internationally).&lt;/span&gt;
     * @return a {@link TimeDuration}
     */
    @jakarta.annotation.Nullable
    public TimeDuration getReturnPeriod() {
        return this.returnPeriod;
    }
    /**
     * Gets the returnPolicyId property value. A unique eBay-assigned ID for a return business policy. This ID is generated when the policy is created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReturnPolicyId() {
        return this.returnPolicyId;
    }
    /**
     * Gets the returnsAccepted property value. If this field is returned as &lt;code&gt;true&lt;/code&gt;, the seller accepts returns. If set to &lt;code&gt;false&lt;/code&gt;, the seller does not accept returns.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Top-Rated sellers must accept item returns and the &lt;b&gt;handlingTime&lt;/b&gt; should be set to zero days or one day for a listing to receive a Top-Rated Plus badge on the View Item or search result pages. For more information on eBay&apos;s Top-Rated seller program, see &lt;a href=&quot;https://pages.ebay.com/help/sell/top-rated.html &quot;&gt;Becoming a Top Rated Seller and qualifying for Top Rated Plus benefits&lt;/a&gt;.&lt;/span&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getReturnsAccepted() {
        return this.returnsAccepted;
    }
    /**
     * Gets the returnShippingCostPayer property value. This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either &lt;code&gt;BUYER&lt;/code&gt; or &lt;code&gt;SELLER&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;Depending on the return policy and specifics of the return, either the buyer or the seller can be responsible for the return shipping costs. Note that the seller is always responsible for return shipping costs for SNAD-related issues.
     * @return a {@link ReturnShippingCostPayerEnum}
     */
    @jakarta.annotation.Nullable
    public ReturnShippingCostPayerEnum getReturnShippingCostPayer() {
        return this.returnShippingCostPayer;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("categoryTypes", this.getCategoryTypes());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("extendedHolidayReturnsOffered", this.getExtendedHolidayReturnsOffered());
        writer.writeObjectValue("internationalOverride", this.getInternationalOverride());
        writer.writeEnumValue("marketplaceId", this.getMarketplaceId());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("refundMethod", this.getRefundMethod());
        writer.writeStringValue("restockingFeePercentage", this.getRestockingFeePercentage());
        writer.writeStringValue("returnInstructions", this.getReturnInstructions());
        writer.writeEnumValue("returnMethod", this.getReturnMethod());
        writer.writeObjectValue("returnPeriod", this.getReturnPeriod());
        writer.writeStringValue("returnPolicyId", this.getReturnPolicyId());
        writer.writeBooleanValue("returnsAccepted", this.getReturnsAccepted());
        writer.writeEnumValue("returnShippingCostPayer", this.getReturnShippingCostPayer());
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
     * Sets the categoryTypes property value. This container indicates which category group that the return policy applies to.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: Return business policies are not applicable to motor vehicle listings, so the &lt;b&gt;categoryTypes.name&lt;/b&gt; value will always be &lt;code&gt;ALL_EXCLUDING_MOTORS_VEHICLES&lt;/code&gt; for return business policies.&lt;/span&gt;
     * @param value Value to set for the categoryTypes property.
     */
    public void setCategoryTypes(@jakarta.annotation.Nullable final java.util.List<CategoryType> value) {
        this.categoryTypes = value;
    }
    /**
     * Sets the description property value. A seller-defined description of the return business policy. This description is only for the seller&apos;s use, and is not exposed on any eBay pages.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the extendedHolidayReturnsOffered property value. &lt;p class=&quot;tablenote&quot;&gt;&lt;span  style=&quot;color: #dd1e31;&quot;&gt;&lt;b&gt;Important!&lt;/b&gt;&lt;/span&gt; This field is deprecated, since eBay no longer supports extended holiday returns. Any value supplied in this field is neither read nor returned.&lt;/p&gt; 
     * @param value Value to set for the extendedHolidayReturnsOffered property.
     */
    public void setExtendedHolidayReturnsOffered(@jakarta.annotation.Nullable final Boolean value) {
        this.extendedHolidayReturnsOffered = value;
    }
    /**
     * Sets the internationalOverride property value. This container shows the seller&apos;s international return policy settings. This container is only returned if the seller has set a separate international return policy for the business policy. International return policies are optional, even if the seller ships to international locations. If a separate international return policy is not set, all of the domestic return policy settings also apply to international orders.
     * @param value Value to set for the internationalOverride property.
     */
    public void setInternationalOverride(@jakarta.annotation.Nullable final InternationalReturnOverrideType value) {
        this.internationalOverride = value;
    }
    /**
     * Sets the marketplaceId property value. The ID of the eBay marketplace to which this return business policy applies.
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final MarketplaceIdEnum value) {
        this.marketplaceId = value;
    }
    /**
     * Sets the name property value. A seller-defined name for this return business policy. Names must be unique for policies assigned to the same marketplace.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 64
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the refundMethod property value. This field indicates the refund method offered by the seller. Its value will be &lt;code&gt;MONEY_BACK&lt;/code&gt; unless the seller is enabled for &lt;b&gt;Click and Collect&lt;/b&gt;, and then it might be &lt;code&gt;MERCHANDISE_CREDIT&lt;/code&gt;. Getting their money back for returned items is always an option for buyers, regardless of what the seller sets in this field.
     * @param value Value to set for the refundMethod property.
     */
    public void setRefundMethod(@jakarta.annotation.Nullable final RefundMethodEnum value) {
        this.refundMethod = value;
    }
    /**
     * Sets the restockingFeePercentage property value. &lt;p class=&quot;tablenote&quot;&gt;&lt;span  style=&quot;color: #dd1e31;&quot;&gt;&lt;b&gt;Important!&lt;/b&gt;&lt;/span&gt; This field is deprecated, since eBay no longer allows sellers to charge a restocking fee for buyer remorse returns. If this field is included, it is ignored and it is no longer returned.&lt;/p&gt;
     * @param value Value to set for the restockingFeePercentage property.
     */
    public void setRestockingFeePercentage(@jakarta.annotation.Nullable final String value) {
        this.restockingFeePercentage = value;
    }
    /**
     * Sets the returnInstructions property value. This text-based field provides more details on seller-specified return instructions. This field is only returned if set for the return business policy.&lt;br&gt;&lt;p class=&quot;tablenote&quot;&gt;&lt;span  style=&quot;color: #dd1e31;&quot;&gt;&lt;b&gt;Important!&lt;/b&gt;&lt;/span&gt; This field is no longer supported on many eBay marketplaces. To see if a marketplace and eBay category does support this field, call &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getreturnpolicies&quot;&gt;getReturnPolicies&lt;/a&gt; method of the &lt;b&gt;Metadata API&lt;/b&gt;. Then you will look for the &lt;b&gt;policyDescriptionEnabled&lt;/b&gt; field with a value of &lt;code&gt;true&lt;/code&gt; for the eBay category.&lt;/span&gt;&lt;/p&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 5000 (8000 for DE)
     * @param value Value to set for the returnInstructions property.
     */
    public void setReturnInstructions(@jakarta.annotation.Nullable final String value) {
        this.returnInstructions = value;
    }
    /**
     * Sets the returnMethod property value. This field is only returned if the seller is willing to offer a replacement item as an alternative to &apos;Money Back&apos;.
     * @param value Value to set for the returnMethod property.
     */
    public void setReturnMethod(@jakarta.annotation.Nullable final ReturnMethodEnum value) {
        this.returnMethod = value;
    }
    /**
     * Sets the returnPeriod property value. This container indicates the number of calendar days that the buyer has to return an item. The return period begins when the item is marked &quot;delivered&quot; at the buyer&apos;s specified ship-to location.  &lt;br&gt;&lt;br&gt;Most categories support 30-day and 60-day return periods.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: Unless the seller has set a separate international return policy through the &lt;b&gt;internationalOverride&lt;/b&gt; container, this return period will be valid for domestic and international returns (if the seller ships internationally).&lt;/span&gt;
     * @param value Value to set for the returnPeriod property.
     */
    public void setReturnPeriod(@jakarta.annotation.Nullable final TimeDuration value) {
        this.returnPeriod = value;
    }
    /**
     * Sets the returnPolicyId property value. A unique eBay-assigned ID for a return business policy. This ID is generated when the policy is created.
     * @param value Value to set for the returnPolicyId property.
     */
    public void setReturnPolicyId(@jakarta.annotation.Nullable final String value) {
        this.returnPolicyId = value;
    }
    /**
     * Sets the returnsAccepted property value. If this field is returned as &lt;code&gt;true&lt;/code&gt;, the seller accepts returns. If set to &lt;code&gt;false&lt;/code&gt;, the seller does not accept returns.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Top-Rated sellers must accept item returns and the &lt;b&gt;handlingTime&lt;/b&gt; should be set to zero days or one day for a listing to receive a Top-Rated Plus badge on the View Item or search result pages. For more information on eBay&apos;s Top-Rated seller program, see &lt;a href=&quot;https://pages.ebay.com/help/sell/top-rated.html &quot;&gt;Becoming a Top Rated Seller and qualifying for Top Rated Plus benefits&lt;/a&gt;.&lt;/span&gt;
     * @param value Value to set for the returnsAccepted property.
     */
    public void setReturnsAccepted(@jakarta.annotation.Nullable final Boolean value) {
        this.returnsAccepted = value;
    }
    /**
     * Sets the returnShippingCostPayer property value. This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either &lt;code&gt;BUYER&lt;/code&gt; or &lt;code&gt;SELLER&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;Depending on the return policy and specifics of the return, either the buyer or the seller can be responsible for the return shipping costs. Note that the seller is always responsible for return shipping costs for SNAD-related issues.
     * @param value Value to set for the returnShippingCostPayer property.
     */
    public void setReturnShippingCostPayer(@jakarta.annotation.Nullable final ReturnShippingCostPayerEnum value) {
        this.returnShippingCostPayer = value;
    }
}
