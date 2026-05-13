package com.ebay.accountmanagement.generated.sellaccountv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the &lt;b&gt;shippingOptions&lt;/b&gt; array, which is used to provide detailed information on the domestic and international shipping options available for the policy. A separate &lt;b&gt;ShippingOption&lt;/b&gt; object covers domestic shipping service options and international shipping service options (if the seller ships to international locations).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingOption implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field defines whether the shipping cost model is &lt;code&gt;FLAT_RATE&lt;/code&gt; (the same rate for all buyers, or buyers within a region if shipping rate tables are used) or &lt;code&gt;CALCULATED&lt;/code&gt; (the shipping rate varies by the ship-to location and size and weight of the package). &lt;br&gt;&lt;br&gt;This field is conditionally required if any shipping service options are specified (domestic and/or international). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:ShippingCostTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String costType;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
     */
    private Amount insuranceFee;
    /**
     * This field has been deprecated. &lt;br&gt;&lt;br&gt;Shipping insurance is offered only via a shipping carrier&apos;s shipping services and is no longer available via eBay shipping policies.
     */
    private Boolean insuranceOffered;
    /**
     * This field is used to indicate if the corresponding shipping service options (under &lt;b&gt;shippingServices&lt;/b&gt; array) are domestic or international shipping service options. This field is conditionally required if any shipping service options are specified (domestic and/or international). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:ShippingOptionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String optionType;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
     */
    private Amount packageHandlingCost;
    /**
     * This field is used if the seller wants to associate a domestic or international shipping rate table to the fulfillment business policy. The &lt;a href=&quot;/api-docs/sell/account/resources/rate_table/methods/getRateTables&quot;&gt;getRateTables&lt;/a&gt; method can be used to retrieve shipping rate table IDs.&lt;br&gt;&lt;br&gt;With domestic and international shipping rate tables, the seller can set different shipping costs based on shipping regions and shipping speed/level of service (one-day, expedited, standard, economy). There are also options to add additional per-weight and handling charges.&lt;br&gt;&lt;br&gt;Sellers need to be careful that shipping rate tables match the corresponding shipping service options. In other words, a domestic shipping rate table must not be specified in the same container where international shipping service options are being specified, and vice versa, and the shipping speed/level of service of the provided shipping service options should match the shipping speed/level of service options that are defined in the shipping rate tables. &lt;br&gt;&lt;br&gt;For example, if the corresponding shipping rate table defines costs for one-day shipping services, there should be at least one one-day shipping service option specified under the &lt;b&gt;shippingServices&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;This field is returned if set.
     */
    private String rateTableId;
    /**
     * This field is the unique identifier of a seller&apos;s domestic or international shipping discount profile. If a buyer satisfies the requirements of the discount rule, this buyer will receive a shipping discount for the order. &lt;br&gt;&lt;br&gt;The seller can create and manage shipping discount profiles using (Get/Set) &lt;b&gt;ShippingDiscountProfiles&lt;/b&gt; calls in the &lt;b&gt;Trading API&lt;/b&gt; or through the &lt;b&gt;Shipping Preferences&lt;/b&gt; in &lt;b&gt;My eBay&lt;/b&gt;.
     */
    private String shippingDiscountProfileId;
    /**
     * This boolean indicates whether or not the seller has set up a promotional shipping discount that will be available to buyers who satisfy the requirements of the shipping discount rule. &lt;br&gt;&lt;br&gt;The seller can create and manage shipping promotional discounts using (Get/Set) &lt;b&gt;ShippingDiscountProfiles&lt;/b&gt; calls in the &lt;b&gt;Trading API&lt;/b&gt; or through the &lt;b&gt;Shipping Preferences&lt;/b&gt; in &lt;b&gt;My eBay&lt;/b&gt;.
     */
    private Boolean shippingPromotionOffered;
    /**
     * This array consists of the domestic or international shipping services options that are defined for the policy. The shipping service options defined under this array should match what is set in the corresponding &lt;b&gt;shippingOptions.optionType&lt;/b&gt; field (which controls whether domestic or international shipping service options are being defined). If a shipping rate table is being used, the specified shipping service options should also match the shipping rate table settings (domestic or international, shipping speed/level of service, etc.) &lt;br&gt;&lt;br&gt;Sellers can specify up to four domestic shipping services and up to five international shipping service options by using separate &lt;b&gt;shippingService&lt;/b&gt; containers for each. If the seller is using the Global Shipping Program as an international option, only a total of four international shipping service options (including GSP) can be offered. &lt;br&gt;&lt;br&gt; See &lt;a href=&quot;/api-docs/sell/static/seller-accounts/ht_shipping-setting-shipping-carrier-and-service-values.html&quot; target=&quot;_blank&quot;&gt;How to set up shipping carrier and shipping service values&lt;/a&gt;. &lt;br&gt;&lt;br&gt;To use the eBay standard envelope service (eSE), see &lt;a href=&quot;/api-docs/sell/static/seller-accounts/using-the-ebay-standard-envelope-service.html&quot; target=&quot;_blank&quot;&gt;Using eBay standard envelope (eSE) service&lt;/a&gt;.&lt;br&gt;&lt;br&gt;This array is conditionally required if the seller is offering one or more domestic and/or international shipping service options.
     */
    private java.util.List<ShippingService> shippingServices;
    /**
     * Instantiates a new {@link ShippingOption} and sets the default values.
     */
    public ShippingOption() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShippingOption}
     */
    @jakarta.annotation.Nonnull
    public static ShippingOption createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShippingOption();
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
     * Gets the costType property value. This field defines whether the shipping cost model is &lt;code&gt;FLAT_RATE&lt;/code&gt; (the same rate for all buyers, or buyers within a region if shipping rate tables are used) or &lt;code&gt;CALCULATED&lt;/code&gt; (the shipping rate varies by the ship-to location and size and weight of the package). &lt;br&gt;&lt;br&gt;This field is conditionally required if any shipping service options are specified (domestic and/or international). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:ShippingCostTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCostType() {
        return this.costType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("costType", (n) -> { this.setCostType(n.getStringValue()); });
        deserializerMap.put("insuranceFee", (n) -> { this.setInsuranceFee(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("insuranceOffered", (n) -> { this.setInsuranceOffered(n.getBooleanValue()); });
        deserializerMap.put("optionType", (n) -> { this.setOptionType(n.getStringValue()); });
        deserializerMap.put("packageHandlingCost", (n) -> { this.setPackageHandlingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("rateTableId", (n) -> { this.setRateTableId(n.getStringValue()); });
        deserializerMap.put("shippingDiscountProfileId", (n) -> { this.setShippingDiscountProfileId(n.getStringValue()); });
        deserializerMap.put("shippingPromotionOffered", (n) -> { this.setShippingPromotionOffered(n.getBooleanValue()); });
        deserializerMap.put("shippingServices", (n) -> { this.setShippingServices(n.getCollectionOfObjectValues(ShippingService::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the insuranceFee property value. A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getInsuranceFee() {
        return this.insuranceFee;
    }
    /**
     * Gets the insuranceOffered property value. This field has been deprecated. &lt;br&gt;&lt;br&gt;Shipping insurance is offered only via a shipping carrier&apos;s shipping services and is no longer available via eBay shipping policies.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getInsuranceOffered() {
        return this.insuranceOffered;
    }
    /**
     * Gets the optionType property value. This field is used to indicate if the corresponding shipping service options (under &lt;b&gt;shippingServices&lt;/b&gt; array) are domestic or international shipping service options. This field is conditionally required if any shipping service options are specified (domestic and/or international). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:ShippingOptionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOptionType() {
        return this.optionType;
    }
    /**
     * Gets the packageHandlingCost property value. A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getPackageHandlingCost() {
        return this.packageHandlingCost;
    }
    /**
     * Gets the rateTableId property value. This field is used if the seller wants to associate a domestic or international shipping rate table to the fulfillment business policy. The &lt;a href=&quot;/api-docs/sell/account/resources/rate_table/methods/getRateTables&quot;&gt;getRateTables&lt;/a&gt; method can be used to retrieve shipping rate table IDs.&lt;br&gt;&lt;br&gt;With domestic and international shipping rate tables, the seller can set different shipping costs based on shipping regions and shipping speed/level of service (one-day, expedited, standard, economy). There are also options to add additional per-weight and handling charges.&lt;br&gt;&lt;br&gt;Sellers need to be careful that shipping rate tables match the corresponding shipping service options. In other words, a domestic shipping rate table must not be specified in the same container where international shipping service options are being specified, and vice versa, and the shipping speed/level of service of the provided shipping service options should match the shipping speed/level of service options that are defined in the shipping rate tables. &lt;br&gt;&lt;br&gt;For example, if the corresponding shipping rate table defines costs for one-day shipping services, there should be at least one one-day shipping service option specified under the &lt;b&gt;shippingServices&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;This field is returned if set.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRateTableId() {
        return this.rateTableId;
    }
    /**
     * Gets the shippingDiscountProfileId property value. This field is the unique identifier of a seller&apos;s domestic or international shipping discount profile. If a buyer satisfies the requirements of the discount rule, this buyer will receive a shipping discount for the order. &lt;br&gt;&lt;br&gt;The seller can create and manage shipping discount profiles using (Get/Set) &lt;b&gt;ShippingDiscountProfiles&lt;/b&gt; calls in the &lt;b&gt;Trading API&lt;/b&gt; or through the &lt;b&gt;Shipping Preferences&lt;/b&gt; in &lt;b&gt;My eBay&lt;/b&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingDiscountProfileId() {
        return this.shippingDiscountProfileId;
    }
    /**
     * Gets the shippingPromotionOffered property value. This boolean indicates whether or not the seller has set up a promotional shipping discount that will be available to buyers who satisfy the requirements of the shipping discount rule. &lt;br&gt;&lt;br&gt;The seller can create and manage shipping promotional discounts using (Get/Set) &lt;b&gt;ShippingDiscountProfiles&lt;/b&gt; calls in the &lt;b&gt;Trading API&lt;/b&gt; or through the &lt;b&gt;Shipping Preferences&lt;/b&gt; in &lt;b&gt;My eBay&lt;/b&gt;.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShippingPromotionOffered() {
        return this.shippingPromotionOffered;
    }
    /**
     * Gets the shippingServices property value. This array consists of the domestic or international shipping services options that are defined for the policy. The shipping service options defined under this array should match what is set in the corresponding &lt;b&gt;shippingOptions.optionType&lt;/b&gt; field (which controls whether domestic or international shipping service options are being defined). If a shipping rate table is being used, the specified shipping service options should also match the shipping rate table settings (domestic or international, shipping speed/level of service, etc.) &lt;br&gt;&lt;br&gt;Sellers can specify up to four domestic shipping services and up to five international shipping service options by using separate &lt;b&gt;shippingService&lt;/b&gt; containers for each. If the seller is using the Global Shipping Program as an international option, only a total of four international shipping service options (including GSP) can be offered. &lt;br&gt;&lt;br&gt; See &lt;a href=&quot;/api-docs/sell/static/seller-accounts/ht_shipping-setting-shipping-carrier-and-service-values.html&quot; target=&quot;_blank&quot;&gt;How to set up shipping carrier and shipping service values&lt;/a&gt;. &lt;br&gt;&lt;br&gt;To use the eBay standard envelope service (eSE), see &lt;a href=&quot;/api-docs/sell/static/seller-accounts/using-the-ebay-standard-envelope-service.html&quot; target=&quot;_blank&quot;&gt;Using eBay standard envelope (eSE) service&lt;/a&gt;.&lt;br&gt;&lt;br&gt;This array is conditionally required if the seller is offering one or more domestic and/or international shipping service options.
     * @return a {@link java.util.List<ShippingService>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ShippingService> getShippingServices() {
        return this.shippingServices;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("costType", this.getCostType());
        writer.writeObjectValue("insuranceFee", this.getInsuranceFee());
        writer.writeBooleanValue("insuranceOffered", this.getInsuranceOffered());
        writer.writeStringValue("optionType", this.getOptionType());
        writer.writeObjectValue("packageHandlingCost", this.getPackageHandlingCost());
        writer.writeStringValue("rateTableId", this.getRateTableId());
        writer.writeStringValue("shippingDiscountProfileId", this.getShippingDiscountProfileId());
        writer.writeBooleanValue("shippingPromotionOffered", this.getShippingPromotionOffered());
        writer.writeCollectionOfObjectValues("shippingServices", this.getShippingServices());
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
     * Sets the costType property value. This field defines whether the shipping cost model is &lt;code&gt;FLAT_RATE&lt;/code&gt; (the same rate for all buyers, or buyers within a region if shipping rate tables are used) or &lt;code&gt;CALCULATED&lt;/code&gt; (the shipping rate varies by the ship-to location and size and weight of the package). &lt;br&gt;&lt;br&gt;This field is conditionally required if any shipping service options are specified (domestic and/or international). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:ShippingCostTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the costType property.
     */
    public void setCostType(@jakarta.annotation.Nullable final String value) {
        this.costType = value;
    }
    /**
     * Sets the insuranceFee property value. A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
     * @param value Value to set for the insuranceFee property.
     */
    public void setInsuranceFee(@jakarta.annotation.Nullable final Amount value) {
        this.insuranceFee = value;
    }
    /**
     * Sets the insuranceOffered property value. This field has been deprecated. &lt;br&gt;&lt;br&gt;Shipping insurance is offered only via a shipping carrier&apos;s shipping services and is no longer available via eBay shipping policies.
     * @param value Value to set for the insuranceOffered property.
     */
    public void setInsuranceOffered(@jakarta.annotation.Nullable final Boolean value) {
        this.insuranceOffered = value;
    }
    /**
     * Sets the optionType property value. This field is used to indicate if the corresponding shipping service options (under &lt;b&gt;shippingServices&lt;/b&gt; array) are domestic or international shipping service options. This field is conditionally required if any shipping service options are specified (domestic and/or international). For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:ShippingOptionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the optionType property.
     */
    public void setOptionType(@jakarta.annotation.Nullable final String value) {
        this.optionType = value;
    }
    /**
     * Sets the packageHandlingCost property value. A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
     * @param value Value to set for the packageHandlingCost property.
     */
    public void setPackageHandlingCost(@jakarta.annotation.Nullable final Amount value) {
        this.packageHandlingCost = value;
    }
    /**
     * Sets the rateTableId property value. This field is used if the seller wants to associate a domestic or international shipping rate table to the fulfillment business policy. The &lt;a href=&quot;/api-docs/sell/account/resources/rate_table/methods/getRateTables&quot;&gt;getRateTables&lt;/a&gt; method can be used to retrieve shipping rate table IDs.&lt;br&gt;&lt;br&gt;With domestic and international shipping rate tables, the seller can set different shipping costs based on shipping regions and shipping speed/level of service (one-day, expedited, standard, economy). There are also options to add additional per-weight and handling charges.&lt;br&gt;&lt;br&gt;Sellers need to be careful that shipping rate tables match the corresponding shipping service options. In other words, a domestic shipping rate table must not be specified in the same container where international shipping service options are being specified, and vice versa, and the shipping speed/level of service of the provided shipping service options should match the shipping speed/level of service options that are defined in the shipping rate tables. &lt;br&gt;&lt;br&gt;For example, if the corresponding shipping rate table defines costs for one-day shipping services, there should be at least one one-day shipping service option specified under the &lt;b&gt;shippingServices&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;This field is returned if set.
     * @param value Value to set for the rateTableId property.
     */
    public void setRateTableId(@jakarta.annotation.Nullable final String value) {
        this.rateTableId = value;
    }
    /**
     * Sets the shippingDiscountProfileId property value. This field is the unique identifier of a seller&apos;s domestic or international shipping discount profile. If a buyer satisfies the requirements of the discount rule, this buyer will receive a shipping discount for the order. &lt;br&gt;&lt;br&gt;The seller can create and manage shipping discount profiles using (Get/Set) &lt;b&gt;ShippingDiscountProfiles&lt;/b&gt; calls in the &lt;b&gt;Trading API&lt;/b&gt; or through the &lt;b&gt;Shipping Preferences&lt;/b&gt; in &lt;b&gt;My eBay&lt;/b&gt;.
     * @param value Value to set for the shippingDiscountProfileId property.
     */
    public void setShippingDiscountProfileId(@jakarta.annotation.Nullable final String value) {
        this.shippingDiscountProfileId = value;
    }
    /**
     * Sets the shippingPromotionOffered property value. This boolean indicates whether or not the seller has set up a promotional shipping discount that will be available to buyers who satisfy the requirements of the shipping discount rule. &lt;br&gt;&lt;br&gt;The seller can create and manage shipping promotional discounts using (Get/Set) &lt;b&gt;ShippingDiscountProfiles&lt;/b&gt; calls in the &lt;b&gt;Trading API&lt;/b&gt; or through the &lt;b&gt;Shipping Preferences&lt;/b&gt; in &lt;b&gt;My eBay&lt;/b&gt;.
     * @param value Value to set for the shippingPromotionOffered property.
     */
    public void setShippingPromotionOffered(@jakarta.annotation.Nullable final Boolean value) {
        this.shippingPromotionOffered = value;
    }
    /**
     * Sets the shippingServices property value. This array consists of the domestic or international shipping services options that are defined for the policy. The shipping service options defined under this array should match what is set in the corresponding &lt;b&gt;shippingOptions.optionType&lt;/b&gt; field (which controls whether domestic or international shipping service options are being defined). If a shipping rate table is being used, the specified shipping service options should also match the shipping rate table settings (domestic or international, shipping speed/level of service, etc.) &lt;br&gt;&lt;br&gt;Sellers can specify up to four domestic shipping services and up to five international shipping service options by using separate &lt;b&gt;shippingService&lt;/b&gt; containers for each. If the seller is using the Global Shipping Program as an international option, only a total of four international shipping service options (including GSP) can be offered. &lt;br&gt;&lt;br&gt; See &lt;a href=&quot;/api-docs/sell/static/seller-accounts/ht_shipping-setting-shipping-carrier-and-service-values.html&quot; target=&quot;_blank&quot;&gt;How to set up shipping carrier and shipping service values&lt;/a&gt;. &lt;br&gt;&lt;br&gt;To use the eBay standard envelope service (eSE), see &lt;a href=&quot;/api-docs/sell/static/seller-accounts/using-the-ebay-standard-envelope-service.html&quot; target=&quot;_blank&quot;&gt;Using eBay standard envelope (eSE) service&lt;/a&gt;.&lt;br&gt;&lt;br&gt;This array is conditionally required if the seller is offering one or more domestic and/or international shipping service options.
     * @param value Value to set for the shippingServices property.
     */
    public void setShippingServices(@jakarta.annotation.Nullable final java.util.List<ShippingService> value) {
        this.shippingServices = value;
    }
}
