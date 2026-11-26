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
 * This type is used by the &lt;b&gt;shippingServices&lt;/b&gt; array, an array that provides details about every domestic and international shipping service option that is defined for the policy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingService implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container is used by the seller to cover the use case when a single buyer purchases multiple quantities of the same line item. This cost cannot exceed the corresponding &lt;b&gt;shippingCost&lt;/b&gt; value. A seller will generally set this field when he/she wants to pass on a shipping discount to the buyer if that buyer purchases multiple quantities of a line item. &lt;br&gt;&lt;br&gt;The seller can ship multiple quantities of the line item in the same package and pass on the shipping savings to the buyer.&lt;br&gt;&lt;br&gt;If this field is not set, and a buyer purchases multiple quantities of an item, the seller can technically charge the same cost set in the &lt;b&gt;shippingCost&lt;/b&gt; container for each individual item, but in general, it behooves both the seller and the buyer (and saves both parties money) if they discuss combined shipping.&lt;br&gt;&lt;br&gt;This field is not applicable to auction listings or single-quantity, fixed-price listings.&lt;br&gt;&lt;br&gt;This container is returned if set.
     */
    private Amount additionalShippingCost;
    /**
     * This field should be included and set to &lt;code&gt;true&lt;/code&gt; for a motor vehicle listing if it will be the buyer&apos;s responsibility to pick up the purchased motor vehicle after full payment is made. &lt;br&gt;&lt;br&gt;This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. &lt;br&gt;&lt;br&gt;This field is returned if set.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: false
     */
    private Boolean buyerResponsibleForPickup;
    /**
     * This field should be included and set to &lt;code&gt;true&lt;/code&gt; for a motor vehicle listing if it will be the buyer&apos;s responsibility to arrange for shipment of a motor vehicle. &lt;br&gt;&lt;br&gt;This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. &lt;br&gt;&lt;br&gt;This field is returned if set.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: false
     */
    private Boolean buyerResponsibleForShipping;
    /**
     * This field is included and set to &lt;code&gt;true&lt;/code&gt; if the seller offers a free domestic shipping option to the buyer. &lt;br&gt;&lt;br&gt;This field can only be included and set to &lt;code&gt;true&lt;/code&gt; for the first domestic shipping service option specified in the &lt;b&gt;shippingServices&lt;/b&gt; array (it is ignored if set for subsequent shipping services or for any international shipping service option). &lt;br&gt;&lt;br&gt;The first specified shipping service option has a &lt;b&gt;sortOrder&lt;/b&gt; value of &lt;code&gt;1&lt;/code&gt; or if the &lt;b&gt;sortOrderId&lt;/b&gt; field is not used, it is the shipping service option that&apos;s specified first in the &lt;b&gt;shippingServices&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;This container is returned if set.
     */
    private Boolean freeShipping;
    /**
     * This field sets/indicates the shipping carrier, such as &lt;code&gt;USPS&lt;/code&gt;, &lt;code&gt;FedEx&lt;/code&gt;, or &lt;code&gt;UPS&lt;/code&gt;. Although this field uses the &lt;b&gt;string&lt;/b&gt; type, the seller must pass in a pre-defined enumeration value here. &lt;br&gt;&lt;br&gt;For a full list of shipping carrier enum values for a specified eBay marketplace, the &lt;a href=&quot;/devzone/xml/docs/reference/ebay/GeteBayDetails.html&quot;&gt;GeteBayDetails&lt;/a&gt; call of the &lt;b&gt;Trading API&lt;/b&gt; can be used, and the &lt;b&gt;DetailName&lt;/b&gt; field&apos;s value should be set to &lt;code&gt;ShippingCarrierDetails&lt;/code&gt;. The enum values for each shipping carriers can be found in each &lt;b&gt;ShippingCarrierDetails.ShippingCarrier&lt;/b&gt; field in the response payload.&lt;br&gt;&lt;br&gt; This field is actually optional, as the shipping carrier is also tied into the &lt;b&gt;shippingServiceCode&lt;/b&gt; enum value, and that field is required for every specified shipping service option.&lt;br&gt;&lt;br&gt;This field is returned if set.
     */
    private String shippingCarrierCode;
    /**
     * This container is used to set the shipping cost to ship one item using the corresponding shipping service option. This container is conditionally required if the seller is using flat-rate shipping and is not using a domestic or international shipping rate table. &lt;br&gt;&lt;br&gt;This container is not necessary for calculated shipping, since eBay will calculate the shipping cost and display it in the View Item page based off of the potential buyer&apos;s ship-to location.&lt;br&gt;&lt;br&gt;This value is automatically set to &lt;code&gt;0.0&lt;/code&gt; for the first specified domestic shipping service option and if the corresponding &lt;b&gt;freeShipping&lt;/b&gt; field is set to &lt;code&gt;true&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;This container is returned if set for the policy.
     */
    private Amount shippingCost;
    /**
     * This field sets/indicates the domestic or international shipping service option, such as &lt;code&gt;USPSPriority&lt;/code&gt;, &lt;code&gt;FedEx2Day&lt;/code&gt;, or &lt;code&gt;UPS3rdDay&lt;/code&gt;. Although this field uses the &lt;b&gt;string&lt;/b&gt; type, the seller must pass in a pre-defined enumeration value here. &lt;br&gt;&lt;br&gt;For a full list of shipping service option enum values for a specified eBay marketplace, the &lt;a href=&quot;/devzone/xml/docs/reference/ebay/GeteBayDetails.html&quot;&gt;GeteBayDetails&lt;/a&gt; call of the &lt;b&gt;Trading API&lt;/b&gt; can be used, and the &lt;b&gt;DetailName&lt;/b&gt; field&apos;s value should be set to &lt;code&gt;ShippingServiceDetails&lt;/code&gt;. &lt;br&gt;&lt;br&gt;The enum values for each shipping service option can be found in each &lt;b&gt;ShippingServiceDetails.ShippingService&lt;/b&gt; field in the response payload. The seller must make sure that the shipping service option is still valid, which is indicated by a &lt;code&gt;true&lt;/code&gt; value in the corresponding &lt;b&gt;ValidForSellingFlow&lt;/b&gt; boolean field. International shipping service options are typically returned at the top of the response payload, and are indicated by an &lt;b&gt;InternationalService&lt;/b&gt; boolean field that reads &lt;code&gt;true&lt;/code&gt;. &lt;br&gt;&lt;br&gt;The &lt;b&gt;InternationalService&lt;/b&gt; boolean field is not returned at all for domestic shipping service options. &lt;br&gt;&lt;br&gt; This field is required for every specified shipping service option.
     */
    private String shippingServiceCode;
    /**
     * This container is used to set the ship-to locations applicable to the corresponding shipping service option. Although the &lt;b&gt;regionExcluded&lt;/b&gt; container is defined for &lt;b&gt;RegionSet&lt;/b&gt; type and could technically be used here, it is recommened that only the &lt;b&gt;regionIncluded&lt;/b&gt; container be used at the shipping service level. The excluded shipping regions (if any) can instead be set up in the top-level &lt;b&gt;regionExcluded&lt;/b&gt; container. &lt;br&gt;&lt;br&gt;The &lt;b&gt;regionIncluded&lt;/b&gt; and &lt;b&gt;regionExcluded&lt;/b&gt; containers define the geographical regions/countries/states or provinces/domestic regions where the seller does and doesn&apos;t ship to with this fulfillment policy.&lt;br&gt;&lt;br&gt;To retrieve the valid geographical shipping region values, two-digit country values, or special domestic regions for an eBay marketplace, call &lt;a href=&quot;/devzone/xml/docs/reference/ebay/GeteBayDetails.html&quot;&gt;GeteBayDetails&lt;/a&gt; with &lt;b&gt;DetailName&lt;/b&gt; value set to &lt;code&gt;ExcludeShippingLocationDetails&lt;/code&gt;, then review the &lt;b&gt;ExcludeShippingLocationDetails&lt;/b&gt; containers in the response for the strings you use in the &lt;b&gt;regionIncluded.regionName&lt;/b&gt; field. &lt;ul&gt;&lt;li&gt;For valid geographical region names, look for the &lt;code&gt;ExcludeShippingLocationDetails&lt;/code&gt; containers in the &lt;b&gt;GeteBayDetails&lt;/b&gt; response where the &lt;b&gt;Region&lt;/b&gt; value is &lt;code&gt;Worldwide&lt;/code&gt;, and the valid values will be shown in the corresponding &lt;b&gt;Location&lt;/b&gt; fields.&lt;/li&gt; &lt;li&gt;For valid two-digit country codes, look for &lt;code&gt;ExcludeShippingLocationDetails&lt;/code&gt; in the &lt;b&gt;GeteBayDetails&lt;/b&gt; response where the &lt;b&gt;Region&lt;/b&gt; value is one of the defined geographical regions, and the valid values will be shown in the corresponding &lt;b&gt;Location&lt;/b&gt; fields. Alternatively, you can find the two-digit country code values in the &lt;a href=&quot;/api-docs/sell/account/types/ba:CountryCodeEnum&quot;&gt;CountryCodeEnum&lt;/a&gt; type definition.&lt;/li&gt;  &lt;li&gt;For valid domestic region values, look for &lt;code&gt;ExcludeShippingLocationDetails&lt;/code&gt; in the &lt;b&gt;GeteBayDetails&lt;/b&gt; response where the &lt;b&gt;Region&lt;/b&gt; value is either &lt;code&gt;Domestic Location&lt;/code&gt; or &lt;code&gt;Additional Locations&lt;/code&gt;, and the valid values will be shown in the corresponding &lt;b&gt;Location&lt;/b&gt; fields.&lt;/li&gt;&lt;/ul&gt; The &lt;code&gt;STATE_OR_PROVINCE&lt;/code&gt; region type is only applicable to the US and Canada, and valid values for US states are the same &lt;a href=&quot;https://about.usps.com/who-we-are/postal-history/state-abbreviations.htm &quot;&gt;two-digit abbreviations&lt;/a&gt; used by the United States Postal Service, and valid values for Canadian provinces and territories are the same &lt;a href=&quot;https://www.canadapost-postescanada.ca/cpc/en/support/articles/addressing-guidelines/symbols-and-abbreviations.page &quot;&gt;two-digit abbreviations&lt;/a&gt; used by the Canada Post.
     */
    private RegionSet shipToLocations;
    /**
     * The integer value set in this field controls the order of the corresponding domestic or international shipping service option in the View Item and Checkout pages. &lt;br&gt;&lt;br&gt;If the &lt;b&gt;sortOrder&lt;/b&gt; field is not supplied, the order of domestic and international shipping service options is determined by the order in which they are listed in the API call. &lt;br&gt;&lt;br&gt;&lt;b&gt;Minimum&lt;/b&gt;: 1&lt;br&gt;&lt;b&gt;Maximum&lt;/b&gt;: 4 (for domestic shipping service) or 5 (for international shipping service).
     */
    private Integer sortOrder;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note: DO NOT USE THIS FIELD.&lt;/strong&gt; Shipping surcharges for domestic shipping service options can no longer be set with fulfillment business policies, except through shipping rate tables. &lt;br&gt;&lt;br&gt;To do this, a seller would set up a surcharge-based shipping rate table and specify the surcharge in that table. Then, the seller would need to associate this shipping rate table to the fulfillment business policy by specifying the unique ID of the shipping rate table through the &lt;b&gt;shippingOptions.rateTableId&lt;/b&gt; field.&lt;/span&gt;&lt;br&gt;Shipping surcharges cannot be applied at all to international shipping service options.
     */
    private Amount surcharge;
    /**
     * Instantiates a new {@link ShippingService} and sets the default values.
     */
    public ShippingService() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShippingService}
     */
    @jakarta.annotation.Nonnull
    public static ShippingService createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShippingService();
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
     * Gets the additionalShippingCost property value. This container is used by the seller to cover the use case when a single buyer purchases multiple quantities of the same line item. This cost cannot exceed the corresponding &lt;b&gt;shippingCost&lt;/b&gt; value. A seller will generally set this field when he/she wants to pass on a shipping discount to the buyer if that buyer purchases multiple quantities of a line item. &lt;br&gt;&lt;br&gt;The seller can ship multiple quantities of the line item in the same package and pass on the shipping savings to the buyer.&lt;br&gt;&lt;br&gt;If this field is not set, and a buyer purchases multiple quantities of an item, the seller can technically charge the same cost set in the &lt;b&gt;shippingCost&lt;/b&gt; container for each individual item, but in general, it behooves both the seller and the buyer (and saves both parties money) if they discuss combined shipping.&lt;br&gt;&lt;br&gt;This field is not applicable to auction listings or single-quantity, fixed-price listings.&lt;br&gt;&lt;br&gt;This container is returned if set.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAdditionalShippingCost() {
        return this.additionalShippingCost;
    }
    /**
     * Gets the buyerResponsibleForPickup property value. This field should be included and set to &lt;code&gt;true&lt;/code&gt; for a motor vehicle listing if it will be the buyer&apos;s responsibility to pick up the purchased motor vehicle after full payment is made. &lt;br&gt;&lt;br&gt;This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. &lt;br&gt;&lt;br&gt;This field is returned if set.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: false
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBuyerResponsibleForPickup() {
        return this.buyerResponsibleForPickup;
    }
    /**
     * Gets the buyerResponsibleForShipping property value. This field should be included and set to &lt;code&gt;true&lt;/code&gt; for a motor vehicle listing if it will be the buyer&apos;s responsibility to arrange for shipment of a motor vehicle. &lt;br&gt;&lt;br&gt;This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. &lt;br&gt;&lt;br&gt;This field is returned if set.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: false
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBuyerResponsibleForShipping() {
        return this.buyerResponsibleForShipping;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("additionalShippingCost", (n) -> { this.setAdditionalShippingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("buyerResponsibleForPickup", (n) -> { this.setBuyerResponsibleForPickup(n.getBooleanValue()); });
        deserializerMap.put("buyerResponsibleForShipping", (n) -> { this.setBuyerResponsibleForShipping(n.getBooleanValue()); });
        deserializerMap.put("freeShipping", (n) -> { this.setFreeShipping(n.getBooleanValue()); });
        deserializerMap.put("shippingCarrierCode", (n) -> { this.setShippingCarrierCode(n.getStringValue()); });
        deserializerMap.put("shippingCost", (n) -> { this.setShippingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("shippingServiceCode", (n) -> { this.setShippingServiceCode(n.getStringValue()); });
        deserializerMap.put("shipToLocations", (n) -> { this.setShipToLocations(n.getObjectValue(RegionSet::createFromDiscriminatorValue)); });
        deserializerMap.put("sortOrder", (n) -> { this.setSortOrder(n.getIntegerValue()); });
        deserializerMap.put("surcharge", (n) -> { this.setSurcharge(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the freeShipping property value. This field is included and set to &lt;code&gt;true&lt;/code&gt; if the seller offers a free domestic shipping option to the buyer. &lt;br&gt;&lt;br&gt;This field can only be included and set to &lt;code&gt;true&lt;/code&gt; for the first domestic shipping service option specified in the &lt;b&gt;shippingServices&lt;/b&gt; array (it is ignored if set for subsequent shipping services or for any international shipping service option). &lt;br&gt;&lt;br&gt;The first specified shipping service option has a &lt;b&gt;sortOrder&lt;/b&gt; value of &lt;code&gt;1&lt;/code&gt; or if the &lt;b&gt;sortOrderId&lt;/b&gt; field is not used, it is the shipping service option that&apos;s specified first in the &lt;b&gt;shippingServices&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;This container is returned if set.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFreeShipping() {
        return this.freeShipping;
    }
    /**
     * Gets the shippingCarrierCode property value. This field sets/indicates the shipping carrier, such as &lt;code&gt;USPS&lt;/code&gt;, &lt;code&gt;FedEx&lt;/code&gt;, or &lt;code&gt;UPS&lt;/code&gt;. Although this field uses the &lt;b&gt;string&lt;/b&gt; type, the seller must pass in a pre-defined enumeration value here. &lt;br&gt;&lt;br&gt;For a full list of shipping carrier enum values for a specified eBay marketplace, the &lt;a href=&quot;/devzone/xml/docs/reference/ebay/GeteBayDetails.html&quot;&gt;GeteBayDetails&lt;/a&gt; call of the &lt;b&gt;Trading API&lt;/b&gt; can be used, and the &lt;b&gt;DetailName&lt;/b&gt; field&apos;s value should be set to &lt;code&gt;ShippingCarrierDetails&lt;/code&gt;. The enum values for each shipping carriers can be found in each &lt;b&gt;ShippingCarrierDetails.ShippingCarrier&lt;/b&gt; field in the response payload.&lt;br&gt;&lt;br&gt; This field is actually optional, as the shipping carrier is also tied into the &lt;b&gt;shippingServiceCode&lt;/b&gt; enum value, and that field is required for every specified shipping service option.&lt;br&gt;&lt;br&gt;This field is returned if set.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingCarrierCode() {
        return this.shippingCarrierCode;
    }
    /**
     * Gets the shippingCost property value. This container is used to set the shipping cost to ship one item using the corresponding shipping service option. This container is conditionally required if the seller is using flat-rate shipping and is not using a domestic or international shipping rate table. &lt;br&gt;&lt;br&gt;This container is not necessary for calculated shipping, since eBay will calculate the shipping cost and display it in the View Item page based off of the potential buyer&apos;s ship-to location.&lt;br&gt;&lt;br&gt;This value is automatically set to &lt;code&gt;0.0&lt;/code&gt; for the first specified domestic shipping service option and if the corresponding &lt;b&gt;freeShipping&lt;/b&gt; field is set to &lt;code&gt;true&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;This container is returned if set for the policy.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getShippingCost() {
        return this.shippingCost;
    }
    /**
     * Gets the shippingServiceCode property value. This field sets/indicates the domestic or international shipping service option, such as &lt;code&gt;USPSPriority&lt;/code&gt;, &lt;code&gt;FedEx2Day&lt;/code&gt;, or &lt;code&gt;UPS3rdDay&lt;/code&gt;. Although this field uses the &lt;b&gt;string&lt;/b&gt; type, the seller must pass in a pre-defined enumeration value here. &lt;br&gt;&lt;br&gt;For a full list of shipping service option enum values for a specified eBay marketplace, the &lt;a href=&quot;/devzone/xml/docs/reference/ebay/GeteBayDetails.html&quot;&gt;GeteBayDetails&lt;/a&gt; call of the &lt;b&gt;Trading API&lt;/b&gt; can be used, and the &lt;b&gt;DetailName&lt;/b&gt; field&apos;s value should be set to &lt;code&gt;ShippingServiceDetails&lt;/code&gt;. &lt;br&gt;&lt;br&gt;The enum values for each shipping service option can be found in each &lt;b&gt;ShippingServiceDetails.ShippingService&lt;/b&gt; field in the response payload. The seller must make sure that the shipping service option is still valid, which is indicated by a &lt;code&gt;true&lt;/code&gt; value in the corresponding &lt;b&gt;ValidForSellingFlow&lt;/b&gt; boolean field. International shipping service options are typically returned at the top of the response payload, and are indicated by an &lt;b&gt;InternationalService&lt;/b&gt; boolean field that reads &lt;code&gt;true&lt;/code&gt;. &lt;br&gt;&lt;br&gt;The &lt;b&gt;InternationalService&lt;/b&gt; boolean field is not returned at all for domestic shipping service options. &lt;br&gt;&lt;br&gt; This field is required for every specified shipping service option.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingServiceCode() {
        return this.shippingServiceCode;
    }
    /**
     * Gets the shipToLocations property value. This container is used to set the ship-to locations applicable to the corresponding shipping service option. Although the &lt;b&gt;regionExcluded&lt;/b&gt; container is defined for &lt;b&gt;RegionSet&lt;/b&gt; type and could technically be used here, it is recommened that only the &lt;b&gt;regionIncluded&lt;/b&gt; container be used at the shipping service level. The excluded shipping regions (if any) can instead be set up in the top-level &lt;b&gt;regionExcluded&lt;/b&gt; container. &lt;br&gt;&lt;br&gt;The &lt;b&gt;regionIncluded&lt;/b&gt; and &lt;b&gt;regionExcluded&lt;/b&gt; containers define the geographical regions/countries/states or provinces/domestic regions where the seller does and doesn&apos;t ship to with this fulfillment policy.&lt;br&gt;&lt;br&gt;To retrieve the valid geographical shipping region values, two-digit country values, or special domestic regions for an eBay marketplace, call &lt;a href=&quot;/devzone/xml/docs/reference/ebay/GeteBayDetails.html&quot;&gt;GeteBayDetails&lt;/a&gt; with &lt;b&gt;DetailName&lt;/b&gt; value set to &lt;code&gt;ExcludeShippingLocationDetails&lt;/code&gt;, then review the &lt;b&gt;ExcludeShippingLocationDetails&lt;/b&gt; containers in the response for the strings you use in the &lt;b&gt;regionIncluded.regionName&lt;/b&gt; field. &lt;ul&gt;&lt;li&gt;For valid geographical region names, look for the &lt;code&gt;ExcludeShippingLocationDetails&lt;/code&gt; containers in the &lt;b&gt;GeteBayDetails&lt;/b&gt; response where the &lt;b&gt;Region&lt;/b&gt; value is &lt;code&gt;Worldwide&lt;/code&gt;, and the valid values will be shown in the corresponding &lt;b&gt;Location&lt;/b&gt; fields.&lt;/li&gt; &lt;li&gt;For valid two-digit country codes, look for &lt;code&gt;ExcludeShippingLocationDetails&lt;/code&gt; in the &lt;b&gt;GeteBayDetails&lt;/b&gt; response where the &lt;b&gt;Region&lt;/b&gt; value is one of the defined geographical regions, and the valid values will be shown in the corresponding &lt;b&gt;Location&lt;/b&gt; fields. Alternatively, you can find the two-digit country code values in the &lt;a href=&quot;/api-docs/sell/account/types/ba:CountryCodeEnum&quot;&gt;CountryCodeEnum&lt;/a&gt; type definition.&lt;/li&gt;  &lt;li&gt;For valid domestic region values, look for &lt;code&gt;ExcludeShippingLocationDetails&lt;/code&gt; in the &lt;b&gt;GeteBayDetails&lt;/b&gt; response where the &lt;b&gt;Region&lt;/b&gt; value is either &lt;code&gt;Domestic Location&lt;/code&gt; or &lt;code&gt;Additional Locations&lt;/code&gt;, and the valid values will be shown in the corresponding &lt;b&gt;Location&lt;/b&gt; fields.&lt;/li&gt;&lt;/ul&gt; The &lt;code&gt;STATE_OR_PROVINCE&lt;/code&gt; region type is only applicable to the US and Canada, and valid values for US states are the same &lt;a href=&quot;https://about.usps.com/who-we-are/postal-history/state-abbreviations.htm &quot;&gt;two-digit abbreviations&lt;/a&gt; used by the United States Postal Service, and valid values for Canadian provinces and territories are the same &lt;a href=&quot;https://www.canadapost-postescanada.ca/cpc/en/support/articles/addressing-guidelines/symbols-and-abbreviations.page &quot;&gt;two-digit abbreviations&lt;/a&gt; used by the Canada Post.
     * @return a {@link RegionSet}
     */
    @jakarta.annotation.Nullable
    public RegionSet getShipToLocations() {
        return this.shipToLocations;
    }
    /**
     * Gets the sortOrder property value. The integer value set in this field controls the order of the corresponding domestic or international shipping service option in the View Item and Checkout pages. &lt;br&gt;&lt;br&gt;If the &lt;b&gt;sortOrder&lt;/b&gt; field is not supplied, the order of domestic and international shipping service options is determined by the order in which they are listed in the API call. &lt;br&gt;&lt;br&gt;&lt;b&gt;Minimum&lt;/b&gt;: 1&lt;br&gt;&lt;b&gt;Maximum&lt;/b&gt;: 4 (for domestic shipping service) or 5 (for international shipping service).
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSortOrder() {
        return this.sortOrder;
    }
    /**
     * Gets the surcharge property value. &lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note: DO NOT USE THIS FIELD.&lt;/strong&gt; Shipping surcharges for domestic shipping service options can no longer be set with fulfillment business policies, except through shipping rate tables. &lt;br&gt;&lt;br&gt;To do this, a seller would set up a surcharge-based shipping rate table and specify the surcharge in that table. Then, the seller would need to associate this shipping rate table to the fulfillment business policy by specifying the unique ID of the shipping rate table through the &lt;b&gt;shippingOptions.rateTableId&lt;/b&gt; field.&lt;/span&gt;&lt;br&gt;Shipping surcharges cannot be applied at all to international shipping service options.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getSurcharge() {
        return this.surcharge;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("additionalShippingCost", this.getAdditionalShippingCost());
        writer.writeBooleanValue("buyerResponsibleForPickup", this.getBuyerResponsibleForPickup());
        writer.writeBooleanValue("buyerResponsibleForShipping", this.getBuyerResponsibleForShipping());
        writer.writeBooleanValue("freeShipping", this.getFreeShipping());
        writer.writeStringValue("shippingCarrierCode", this.getShippingCarrierCode());
        writer.writeObjectValue("shippingCost", this.getShippingCost());
        writer.writeStringValue("shippingServiceCode", this.getShippingServiceCode());
        writer.writeObjectValue("shipToLocations", this.getShipToLocations());
        writer.writeIntegerValue("sortOrder", this.getSortOrder());
        writer.writeObjectValue("surcharge", this.getSurcharge());
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
     * Sets the additionalShippingCost property value. This container is used by the seller to cover the use case when a single buyer purchases multiple quantities of the same line item. This cost cannot exceed the corresponding &lt;b&gt;shippingCost&lt;/b&gt; value. A seller will generally set this field when he/she wants to pass on a shipping discount to the buyer if that buyer purchases multiple quantities of a line item. &lt;br&gt;&lt;br&gt;The seller can ship multiple quantities of the line item in the same package and pass on the shipping savings to the buyer.&lt;br&gt;&lt;br&gt;If this field is not set, and a buyer purchases multiple quantities of an item, the seller can technically charge the same cost set in the &lt;b&gt;shippingCost&lt;/b&gt; container for each individual item, but in general, it behooves both the seller and the buyer (and saves both parties money) if they discuss combined shipping.&lt;br&gt;&lt;br&gt;This field is not applicable to auction listings or single-quantity, fixed-price listings.&lt;br&gt;&lt;br&gt;This container is returned if set.
     * @param value Value to set for the additionalShippingCost property.
     */
    public void setAdditionalShippingCost(@jakarta.annotation.Nullable final Amount value) {
        this.additionalShippingCost = value;
    }
    /**
     * Sets the buyerResponsibleForPickup property value. This field should be included and set to &lt;code&gt;true&lt;/code&gt; for a motor vehicle listing if it will be the buyer&apos;s responsibility to pick up the purchased motor vehicle after full payment is made. &lt;br&gt;&lt;br&gt;This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. &lt;br&gt;&lt;br&gt;This field is returned if set.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: false
     * @param value Value to set for the buyerResponsibleForPickup property.
     */
    public void setBuyerResponsibleForPickup(@jakarta.annotation.Nullable final Boolean value) {
        this.buyerResponsibleForPickup = value;
    }
    /**
     * Sets the buyerResponsibleForShipping property value. This field should be included and set to &lt;code&gt;true&lt;/code&gt; for a motor vehicle listing if it will be the buyer&apos;s responsibility to arrange for shipment of a motor vehicle. &lt;br&gt;&lt;br&gt;This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. &lt;br&gt;&lt;br&gt;This field is returned if set.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: false
     * @param value Value to set for the buyerResponsibleForShipping property.
     */
    public void setBuyerResponsibleForShipping(@jakarta.annotation.Nullable final Boolean value) {
        this.buyerResponsibleForShipping = value;
    }
    /**
     * Sets the freeShipping property value. This field is included and set to &lt;code&gt;true&lt;/code&gt; if the seller offers a free domestic shipping option to the buyer. &lt;br&gt;&lt;br&gt;This field can only be included and set to &lt;code&gt;true&lt;/code&gt; for the first domestic shipping service option specified in the &lt;b&gt;shippingServices&lt;/b&gt; array (it is ignored if set for subsequent shipping services or for any international shipping service option). &lt;br&gt;&lt;br&gt;The first specified shipping service option has a &lt;b&gt;sortOrder&lt;/b&gt; value of &lt;code&gt;1&lt;/code&gt; or if the &lt;b&gt;sortOrderId&lt;/b&gt; field is not used, it is the shipping service option that&apos;s specified first in the &lt;b&gt;shippingServices&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;This container is returned if set.
     * @param value Value to set for the freeShipping property.
     */
    public void setFreeShipping(@jakarta.annotation.Nullable final Boolean value) {
        this.freeShipping = value;
    }
    /**
     * Sets the shippingCarrierCode property value. This field sets/indicates the shipping carrier, such as &lt;code&gt;USPS&lt;/code&gt;, &lt;code&gt;FedEx&lt;/code&gt;, or &lt;code&gt;UPS&lt;/code&gt;. Although this field uses the &lt;b&gt;string&lt;/b&gt; type, the seller must pass in a pre-defined enumeration value here. &lt;br&gt;&lt;br&gt;For a full list of shipping carrier enum values for a specified eBay marketplace, the &lt;a href=&quot;/devzone/xml/docs/reference/ebay/GeteBayDetails.html&quot;&gt;GeteBayDetails&lt;/a&gt; call of the &lt;b&gt;Trading API&lt;/b&gt; can be used, and the &lt;b&gt;DetailName&lt;/b&gt; field&apos;s value should be set to &lt;code&gt;ShippingCarrierDetails&lt;/code&gt;. The enum values for each shipping carriers can be found in each &lt;b&gt;ShippingCarrierDetails.ShippingCarrier&lt;/b&gt; field in the response payload.&lt;br&gt;&lt;br&gt; This field is actually optional, as the shipping carrier is also tied into the &lt;b&gt;shippingServiceCode&lt;/b&gt; enum value, and that field is required for every specified shipping service option.&lt;br&gt;&lt;br&gt;This field is returned if set.
     * @param value Value to set for the shippingCarrierCode property.
     */
    public void setShippingCarrierCode(@jakarta.annotation.Nullable final String value) {
        this.shippingCarrierCode = value;
    }
    /**
     * Sets the shippingCost property value. This container is used to set the shipping cost to ship one item using the corresponding shipping service option. This container is conditionally required if the seller is using flat-rate shipping and is not using a domestic or international shipping rate table. &lt;br&gt;&lt;br&gt;This container is not necessary for calculated shipping, since eBay will calculate the shipping cost and display it in the View Item page based off of the potential buyer&apos;s ship-to location.&lt;br&gt;&lt;br&gt;This value is automatically set to &lt;code&gt;0.0&lt;/code&gt; for the first specified domestic shipping service option and if the corresponding &lt;b&gt;freeShipping&lt;/b&gt; field is set to &lt;code&gt;true&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;This container is returned if set for the policy.
     * @param value Value to set for the shippingCost property.
     */
    public void setShippingCost(@jakarta.annotation.Nullable final Amount value) {
        this.shippingCost = value;
    }
    /**
     * Sets the shippingServiceCode property value. This field sets/indicates the domestic or international shipping service option, such as &lt;code&gt;USPSPriority&lt;/code&gt;, &lt;code&gt;FedEx2Day&lt;/code&gt;, or &lt;code&gt;UPS3rdDay&lt;/code&gt;. Although this field uses the &lt;b&gt;string&lt;/b&gt; type, the seller must pass in a pre-defined enumeration value here. &lt;br&gt;&lt;br&gt;For a full list of shipping service option enum values for a specified eBay marketplace, the &lt;a href=&quot;/devzone/xml/docs/reference/ebay/GeteBayDetails.html&quot;&gt;GeteBayDetails&lt;/a&gt; call of the &lt;b&gt;Trading API&lt;/b&gt; can be used, and the &lt;b&gt;DetailName&lt;/b&gt; field&apos;s value should be set to &lt;code&gt;ShippingServiceDetails&lt;/code&gt;. &lt;br&gt;&lt;br&gt;The enum values for each shipping service option can be found in each &lt;b&gt;ShippingServiceDetails.ShippingService&lt;/b&gt; field in the response payload. The seller must make sure that the shipping service option is still valid, which is indicated by a &lt;code&gt;true&lt;/code&gt; value in the corresponding &lt;b&gt;ValidForSellingFlow&lt;/b&gt; boolean field. International shipping service options are typically returned at the top of the response payload, and are indicated by an &lt;b&gt;InternationalService&lt;/b&gt; boolean field that reads &lt;code&gt;true&lt;/code&gt;. &lt;br&gt;&lt;br&gt;The &lt;b&gt;InternationalService&lt;/b&gt; boolean field is not returned at all for domestic shipping service options. &lt;br&gt;&lt;br&gt; This field is required for every specified shipping service option.
     * @param value Value to set for the shippingServiceCode property.
     */
    public void setShippingServiceCode(@jakarta.annotation.Nullable final String value) {
        this.shippingServiceCode = value;
    }
    /**
     * Sets the shipToLocations property value. This container is used to set the ship-to locations applicable to the corresponding shipping service option. Although the &lt;b&gt;regionExcluded&lt;/b&gt; container is defined for &lt;b&gt;RegionSet&lt;/b&gt; type and could technically be used here, it is recommened that only the &lt;b&gt;regionIncluded&lt;/b&gt; container be used at the shipping service level. The excluded shipping regions (if any) can instead be set up in the top-level &lt;b&gt;regionExcluded&lt;/b&gt; container. &lt;br&gt;&lt;br&gt;The &lt;b&gt;regionIncluded&lt;/b&gt; and &lt;b&gt;regionExcluded&lt;/b&gt; containers define the geographical regions/countries/states or provinces/domestic regions where the seller does and doesn&apos;t ship to with this fulfillment policy.&lt;br&gt;&lt;br&gt;To retrieve the valid geographical shipping region values, two-digit country values, or special domestic regions for an eBay marketplace, call &lt;a href=&quot;/devzone/xml/docs/reference/ebay/GeteBayDetails.html&quot;&gt;GeteBayDetails&lt;/a&gt; with &lt;b&gt;DetailName&lt;/b&gt; value set to &lt;code&gt;ExcludeShippingLocationDetails&lt;/code&gt;, then review the &lt;b&gt;ExcludeShippingLocationDetails&lt;/b&gt; containers in the response for the strings you use in the &lt;b&gt;regionIncluded.regionName&lt;/b&gt; field. &lt;ul&gt;&lt;li&gt;For valid geographical region names, look for the &lt;code&gt;ExcludeShippingLocationDetails&lt;/code&gt; containers in the &lt;b&gt;GeteBayDetails&lt;/b&gt; response where the &lt;b&gt;Region&lt;/b&gt; value is &lt;code&gt;Worldwide&lt;/code&gt;, and the valid values will be shown in the corresponding &lt;b&gt;Location&lt;/b&gt; fields.&lt;/li&gt; &lt;li&gt;For valid two-digit country codes, look for &lt;code&gt;ExcludeShippingLocationDetails&lt;/code&gt; in the &lt;b&gt;GeteBayDetails&lt;/b&gt; response where the &lt;b&gt;Region&lt;/b&gt; value is one of the defined geographical regions, and the valid values will be shown in the corresponding &lt;b&gt;Location&lt;/b&gt; fields. Alternatively, you can find the two-digit country code values in the &lt;a href=&quot;/api-docs/sell/account/types/ba:CountryCodeEnum&quot;&gt;CountryCodeEnum&lt;/a&gt; type definition.&lt;/li&gt;  &lt;li&gt;For valid domestic region values, look for &lt;code&gt;ExcludeShippingLocationDetails&lt;/code&gt; in the &lt;b&gt;GeteBayDetails&lt;/b&gt; response where the &lt;b&gt;Region&lt;/b&gt; value is either &lt;code&gt;Domestic Location&lt;/code&gt; or &lt;code&gt;Additional Locations&lt;/code&gt;, and the valid values will be shown in the corresponding &lt;b&gt;Location&lt;/b&gt; fields.&lt;/li&gt;&lt;/ul&gt; The &lt;code&gt;STATE_OR_PROVINCE&lt;/code&gt; region type is only applicable to the US and Canada, and valid values for US states are the same &lt;a href=&quot;https://about.usps.com/who-we-are/postal-history/state-abbreviations.htm &quot;&gt;two-digit abbreviations&lt;/a&gt; used by the United States Postal Service, and valid values for Canadian provinces and territories are the same &lt;a href=&quot;https://www.canadapost-postescanada.ca/cpc/en/support/articles/addressing-guidelines/symbols-and-abbreviations.page &quot;&gt;two-digit abbreviations&lt;/a&gt; used by the Canada Post.
     * @param value Value to set for the shipToLocations property.
     */
    public void setShipToLocations(@jakarta.annotation.Nullable final RegionSet value) {
        this.shipToLocations = value;
    }
    /**
     * Sets the sortOrder property value. The integer value set in this field controls the order of the corresponding domestic or international shipping service option in the View Item and Checkout pages. &lt;br&gt;&lt;br&gt;If the &lt;b&gt;sortOrder&lt;/b&gt; field is not supplied, the order of domestic and international shipping service options is determined by the order in which they are listed in the API call. &lt;br&gt;&lt;br&gt;&lt;b&gt;Minimum&lt;/b&gt;: 1&lt;br&gt;&lt;b&gt;Maximum&lt;/b&gt;: 4 (for domestic shipping service) or 5 (for international shipping service).
     * @param value Value to set for the sortOrder property.
     */
    public void setSortOrder(@jakarta.annotation.Nullable final Integer value) {
        this.sortOrder = value;
    }
    /**
     * Sets the surcharge property value. &lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note: DO NOT USE THIS FIELD.&lt;/strong&gt; Shipping surcharges for domestic shipping service options can no longer be set with fulfillment business policies, except through shipping rate tables. &lt;br&gt;&lt;br&gt;To do this, a seller would set up a surcharge-based shipping rate table and specify the surcharge in that table. Then, the seller would need to associate this shipping rate table to the fulfillment business policy by specifying the unique ID of the shipping rate table through the &lt;b&gt;shippingOptions.rateTableId&lt;/b&gt; field.&lt;/span&gt;&lt;br&gt;Shipping surcharges cannot be applied at all to international shipping service options.
     * @param value Value to set for the surcharge property.
     */
    public void setSurcharge(@jakarta.annotation.Nullable final Amount value) {
        this.surcharge = value;
    }
}
