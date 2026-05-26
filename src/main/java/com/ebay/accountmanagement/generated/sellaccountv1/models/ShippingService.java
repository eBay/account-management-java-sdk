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
 * This type is used by the &lt;b&gt;shippingServices&lt;/b&gt; array, an array that provides details about every domestic and international shipping service option that is defined for the policy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingService implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
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
     * A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
     */
    private Amount shippingCost;
    /**
     * This field sets/indicates the domestic or international shipping service option, such as &lt;code&gt;USPSPriority&lt;/code&gt;, &lt;code&gt;FedEx2Day&lt;/code&gt;, or &lt;code&gt;UPS3rdDay&lt;/code&gt;. Although this field uses the &lt;b&gt;string&lt;/b&gt; type, the seller must pass in a pre-defined enumeration value here. &lt;br&gt;&lt;br&gt;For a full list of shipping service option enum values for a specified eBay marketplace, the &lt;a href=&quot;/devzone/xml/docs/reference/ebay/GeteBayDetails.html&quot;&gt;GeteBayDetails&lt;/a&gt; call of the &lt;b&gt;Trading API&lt;/b&gt; can be used, and the &lt;b&gt;DetailName&lt;/b&gt; field&apos;s value should be set to &lt;code&gt;ShippingServiceDetails&lt;/code&gt;. &lt;br&gt;&lt;br&gt;The enum values for each shipping service option can be found in each &lt;b&gt;ShippingServiceDetails.ShippingService&lt;/b&gt; field in the response payload. The seller must make sure that the shipping service option is still valid, which is indicated by a &lt;code&gt;true&lt;/code&gt; value in the corresponding &lt;b&gt;ValidForSellingFlow&lt;/b&gt; boolean field. International shipping service options are typically returned at the top of the response payload, and are indicated by an &lt;b&gt;InternationalService&lt;/b&gt; boolean field that reads &lt;code&gt;true&lt;/code&gt;. &lt;br&gt;&lt;br&gt;The &lt;b&gt;InternationalService&lt;/b&gt; boolean field is not returned at all for domestic shipping service options. &lt;br&gt;&lt;br&gt; This field is required for every specified shipping service option.
     */
    private String shippingServiceCode;
    /**
     * This type consists of the &lt;b&gt;regionIncluded&lt;/b&gt; and &lt;b&gt;regionExcluded&lt;/b&gt; arrays, which indicate the areas to where the seller does and doesn&apos;t ship.
     */
    private RegionSet shipToLocations;
    /**
     * The integer value set in this field controls the order of the corresponding domestic or international shipping service option in the View Item and Checkout pages. &lt;br&gt;&lt;br&gt;If the &lt;b&gt;sortOrder&lt;/b&gt; field is not supplied, the order of domestic and international shipping service options is determined by the order in which they are listed in the API call. &lt;br&gt;&lt;br&gt;&lt;b&gt;Min&lt;/b&gt;: 1. &lt;b&gt;Max&lt;/b&gt;: 4 (for domestic shipping service) or 5 (for international shipping service).
     */
    private Integer sortOrder;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
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
     * Gets the additionalShippingCost property value. A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
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
     * Gets the shippingCost property value. A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
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
     * Gets the shipToLocations property value. This type consists of the &lt;b&gt;regionIncluded&lt;/b&gt; and &lt;b&gt;regionExcluded&lt;/b&gt; arrays, which indicate the areas to where the seller does and doesn&apos;t ship.
     * @return a {@link RegionSet}
     */
    @jakarta.annotation.Nullable
    public RegionSet getShipToLocations() {
        return this.shipToLocations;
    }
    /**
     * Gets the sortOrder property value. The integer value set in this field controls the order of the corresponding domestic or international shipping service option in the View Item and Checkout pages. &lt;br&gt;&lt;br&gt;If the &lt;b&gt;sortOrder&lt;/b&gt; field is not supplied, the order of domestic and international shipping service options is determined by the order in which they are listed in the API call. &lt;br&gt;&lt;br&gt;&lt;b&gt;Min&lt;/b&gt;: 1. &lt;b&gt;Max&lt;/b&gt;: 4 (for domestic shipping service) or 5 (for international shipping service).
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSortOrder() {
        return this.sortOrder;
    }
    /**
     * Gets the surcharge property value. A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
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
     * Sets the additionalShippingCost property value. A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
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
     * Sets the shippingCost property value. A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
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
     * Sets the shipToLocations property value. This type consists of the &lt;b&gt;regionIncluded&lt;/b&gt; and &lt;b&gt;regionExcluded&lt;/b&gt; arrays, which indicate the areas to where the seller does and doesn&apos;t ship.
     * @param value Value to set for the shipToLocations property.
     */
    public void setShipToLocations(@jakarta.annotation.Nullable final RegionSet value) {
        this.shipToLocations = value;
    }
    /**
     * Sets the sortOrder property value. The integer value set in this field controls the order of the corresponding domestic or international shipping service option in the View Item and Checkout pages. &lt;br&gt;&lt;br&gt;If the &lt;b&gt;sortOrder&lt;/b&gt; field is not supplied, the order of domestic and international shipping service options is determined by the order in which they are listed in the API call. &lt;br&gt;&lt;br&gt;&lt;b&gt;Min&lt;/b&gt;: 1. &lt;b&gt;Max&lt;/b&gt;: 4 (for domestic shipping service) or 5 (for international shipping service).
     * @param value Value to set for the sortOrder property.
     */
    public void setSortOrder(@jakarta.annotation.Nullable final Integer value) {
        this.sortOrder = value;
    }
    /**
     * Sets the surcharge property value. A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
     * @param value Value to set for the surcharge property.
     */
    public void setSurcharge(@jakarta.annotation.Nullable final Amount value) {
        this.surcharge = value;
    }
}
