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

package com.ebay.accountmanagement.generated.sellaccountv2.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the responses for the getUserPreferences method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetUserPreferencesResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container is used to change the combined payment option. Sellers have the option to combine multiple line items from the same buyer into a combined invoice that can be paid for with one payment. See CombinedPaymentOptionEnum for a description of each value.
     */
    private CombinedPaymentPreferencesType combinedPaymentPreferences;
    /**
     * This container is used to change the order cut-off time for same-day shipping.
     */
    private DispatchCutoffTimePreferencesType dispatchCutoffTimePreference;
    /**
     * This boolean field indicates whether or not the sellers account is configured to automatically send an email to buyers with the shipment tracking number for an order.
     */
    private Boolean emailShipmentTrackingNumberPreference;
    /**
     * This container shows the seller&apos;s preferences for the end-of-auction email sent to the winning bidder.
     */
    private EndOfAuctionEmailPreferencesType endOfAuctionEmailPreferences;
    /**
     * This boolean field indicates whether or not the sellers new listings on the eBay marketplace will automatically use the Global Shipping Program for international shipping. This field is returned when the &lt;code&gt;GLOBAL_SHIPPING_PROGRAM&lt;/code&gt; value is included through the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter or when &lt;b&gt;fieldgroups&lt;/b&gt;=&lt;code&gt;ALL&lt;/code&gt;. &lt;/br&gt; &lt;b&gt;Note&lt;/b&gt;: The Global Shipping Program is only available for the eBay UK marketplace, and the seller must be opted into the program.
     */
    private Boolean globalShippingProgramListingPreference;
    /**
     * This container represents the seller&apos;s preferences for the list of items that are awaiting payment.
     */
    private GetItemsAwaitingPaymentPreferencesType itemsAwaitingPaymentPreferences;
    /**
     * This boolean field indicates whether or not the seller is opted into the Global Shipping Program on the eBay marketplace. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: The Global Shipping Program is only available for the eBay UK marketplace.
     */
    private Boolean offerGlobalShippingProgramPreference;
    /**
     * This boolean field indicates whether or not the seller is opted into the Out-of-Stock feature. With this feature, a multiple quantity fixed price listing that runs out of stock will be hidden from eBay search but kept alive. Once the sellers add quantity to the listing, the listing will become active and available again.
     */
    private Boolean outOfStockControlPreference;
    /**
     * This boolean field indicates whether or not the seller specifies an international shipping service to a particular country for a given listing, the specified service will take precedence and be the listing&apos;s default international shipping option for buyers in that country, rather than the Global Shipping Program. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: The Global Shipping Program is only available for the eBay UK marketplace.
     */
    private Boolean overrideGspServiceWithIntlServicePreference;
    /**
     * This boolean field indicates whether or not the seller is opted into the Click &amp; Collect feature. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: The Click &amp; Collect feature is only available on the eBay UK, Australia, and Germany marketplaces.
     */
    private Boolean pickupDropoffSellerPreference;
    /**
     * This boolean field indicates whether or not the sellers account is configured to have eBay send occasional purchase reminder emails for unpaid line items.
     */
    private Boolean purchaseReminderEmailPreferences;
    /**
     * This boolean field indicates whether or not the buyer is required to provide a shipping phone number during checkout.
     */
    private Boolean requiredShipPhoneNumberPreference;
    /**
     * This container represents the list of locations that the seller wants to exclude from shipping.
     */
    private SellerExcludeShipToLocationPreferencesType sellerExcludeShipToLocationPreferences;
    /**
     * This container indicates whether or not the seller is opted into Business Policies. If a seller is opted into Business Policies, they must use Payment,Return, and Shipping business policies instead of individual payment, return, and shipping fields.
     */
    private SellerProfilePreferencesType sellerProfilePreferences;
    /**
     * This field is included if the seller wishes to add or modify the shipping carrier rate type that is available to the seller. This field is only returned if set. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: This container is only applicable to the eBay US marketplace.
     */
    private ShippingCarrierRatePreferencesType shippingCarrierRatePreferences;
    /**
     * Instantiates a new {@link GetUserPreferencesResponse} and sets the default values.
     */
    public GetUserPreferencesResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetUserPreferencesResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetUserPreferencesResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetUserPreferencesResponse();
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
     * Gets the combinedPaymentPreferences property value. This container is used to change the combined payment option. Sellers have the option to combine multiple line items from the same buyer into a combined invoice that can be paid for with one payment. See CombinedPaymentOptionEnum for a description of each value.
     * @return a {@link CombinedPaymentPreferencesType}
     */
    @jakarta.annotation.Nullable
    public CombinedPaymentPreferencesType getCombinedPaymentPreferences() {
        return this.combinedPaymentPreferences;
    }
    /**
     * Gets the dispatchCutoffTimePreference property value. This container is used to change the order cut-off time for same-day shipping.
     * @return a {@link DispatchCutoffTimePreferencesType}
     */
    @jakarta.annotation.Nullable
    public DispatchCutoffTimePreferencesType getDispatchCutoffTimePreference() {
        return this.dispatchCutoffTimePreference;
    }
    /**
     * Gets the emailShipmentTrackingNumberPreference property value. This boolean field indicates whether or not the sellers account is configured to automatically send an email to buyers with the shipment tracking number for an order.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEmailShipmentTrackingNumberPreference() {
        return this.emailShipmentTrackingNumberPreference;
    }
    /**
     * Gets the endOfAuctionEmailPreferences property value. This container shows the seller&apos;s preferences for the end-of-auction email sent to the winning bidder.
     * @return a {@link EndOfAuctionEmailPreferencesType}
     */
    @jakarta.annotation.Nullable
    public EndOfAuctionEmailPreferencesType getEndOfAuctionEmailPreferences() {
        return this.endOfAuctionEmailPreferences;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("combinedPaymentPreferences", (n) -> { this.setCombinedPaymentPreferences(n.getObjectValue(CombinedPaymentPreferencesType::createFromDiscriminatorValue)); });
        deserializerMap.put("dispatchCutoffTimePreference", (n) -> { this.setDispatchCutoffTimePreference(n.getObjectValue(DispatchCutoffTimePreferencesType::createFromDiscriminatorValue)); });
        deserializerMap.put("emailShipmentTrackingNumberPreference", (n) -> { this.setEmailShipmentTrackingNumberPreference(n.getBooleanValue()); });
        deserializerMap.put("endOfAuctionEmailPreferences", (n) -> { this.setEndOfAuctionEmailPreferences(n.getObjectValue(EndOfAuctionEmailPreferencesType::createFromDiscriminatorValue)); });
        deserializerMap.put("globalShippingProgramListingPreference", (n) -> { this.setGlobalShippingProgramListingPreference(n.getBooleanValue()); });
        deserializerMap.put("itemsAwaitingPaymentPreferences", (n) -> { this.setItemsAwaitingPaymentPreferences(n.getObjectValue(GetItemsAwaitingPaymentPreferencesType::createFromDiscriminatorValue)); });
        deserializerMap.put("offerGlobalShippingProgramPreference", (n) -> { this.setOfferGlobalShippingProgramPreference(n.getBooleanValue()); });
        deserializerMap.put("outOfStockControlPreference", (n) -> { this.setOutOfStockControlPreference(n.getBooleanValue()); });
        deserializerMap.put("overrideGspServiceWithIntlServicePreference", (n) -> { this.setOverrideGspServiceWithIntlServicePreference(n.getBooleanValue()); });
        deserializerMap.put("pickupDropoffSellerPreference", (n) -> { this.setPickupDropoffSellerPreference(n.getBooleanValue()); });
        deserializerMap.put("purchaseReminderEmailPreferences", (n) -> { this.setPurchaseReminderEmailPreferences(n.getBooleanValue()); });
        deserializerMap.put("requiredShipPhoneNumberPreference", (n) -> { this.setRequiredShipPhoneNumberPreference(n.getBooleanValue()); });
        deserializerMap.put("sellerExcludeShipToLocationPreferences", (n) -> { this.setSellerExcludeShipToLocationPreferences(n.getObjectValue(SellerExcludeShipToLocationPreferencesType::createFromDiscriminatorValue)); });
        deserializerMap.put("sellerProfilePreferences", (n) -> { this.setSellerProfilePreferences(n.getObjectValue(SellerProfilePreferencesType::createFromDiscriminatorValue)); });
        deserializerMap.put("shippingCarrierRatePreferences", (n) -> { this.setShippingCarrierRatePreferences(n.getObjectValue(ShippingCarrierRatePreferencesType::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the globalShippingProgramListingPreference property value. This boolean field indicates whether or not the sellers new listings on the eBay marketplace will automatically use the Global Shipping Program for international shipping. This field is returned when the &lt;code&gt;GLOBAL_SHIPPING_PROGRAM&lt;/code&gt; value is included through the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter or when &lt;b&gt;fieldgroups&lt;/b&gt;=&lt;code&gt;ALL&lt;/code&gt;. &lt;/br&gt; &lt;b&gt;Note&lt;/b&gt;: The Global Shipping Program is only available for the eBay UK marketplace, and the seller must be opted into the program.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getGlobalShippingProgramListingPreference() {
        return this.globalShippingProgramListingPreference;
    }
    /**
     * Gets the itemsAwaitingPaymentPreferences property value. This container represents the seller&apos;s preferences for the list of items that are awaiting payment.
     * @return a {@link GetItemsAwaitingPaymentPreferencesType}
     */
    @jakarta.annotation.Nullable
    public GetItemsAwaitingPaymentPreferencesType getItemsAwaitingPaymentPreferences() {
        return this.itemsAwaitingPaymentPreferences;
    }
    /**
     * Gets the offerGlobalShippingProgramPreference property value. This boolean field indicates whether or not the seller is opted into the Global Shipping Program on the eBay marketplace. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: The Global Shipping Program is only available for the eBay UK marketplace.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOfferGlobalShippingProgramPreference() {
        return this.offerGlobalShippingProgramPreference;
    }
    /**
     * Gets the outOfStockControlPreference property value. This boolean field indicates whether or not the seller is opted into the Out-of-Stock feature. With this feature, a multiple quantity fixed price listing that runs out of stock will be hidden from eBay search but kept alive. Once the sellers add quantity to the listing, the listing will become active and available again.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOutOfStockControlPreference() {
        return this.outOfStockControlPreference;
    }
    /**
     * Gets the overrideGspServiceWithIntlServicePreference property value. This boolean field indicates whether or not the seller specifies an international shipping service to a particular country for a given listing, the specified service will take precedence and be the listing&apos;s default international shipping option for buyers in that country, rather than the Global Shipping Program. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: The Global Shipping Program is only available for the eBay UK marketplace.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOverrideGspServiceWithIntlServicePreference() {
        return this.overrideGspServiceWithIntlServicePreference;
    }
    /**
     * Gets the pickupDropoffSellerPreference property value. This boolean field indicates whether or not the seller is opted into the Click &amp; Collect feature. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: The Click &amp; Collect feature is only available on the eBay UK, Australia, and Germany marketplaces.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPickupDropoffSellerPreference() {
        return this.pickupDropoffSellerPreference;
    }
    /**
     * Gets the purchaseReminderEmailPreferences property value. This boolean field indicates whether or not the sellers account is configured to have eBay send occasional purchase reminder emails for unpaid line items.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPurchaseReminderEmailPreferences() {
        return this.purchaseReminderEmailPreferences;
    }
    /**
     * Gets the requiredShipPhoneNumberPreference property value. This boolean field indicates whether or not the buyer is required to provide a shipping phone number during checkout.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequiredShipPhoneNumberPreference() {
        return this.requiredShipPhoneNumberPreference;
    }
    /**
     * Gets the sellerExcludeShipToLocationPreferences property value. This container represents the list of locations that the seller wants to exclude from shipping.
     * @return a {@link SellerExcludeShipToLocationPreferencesType}
     */
    @jakarta.annotation.Nullable
    public SellerExcludeShipToLocationPreferencesType getSellerExcludeShipToLocationPreferences() {
        return this.sellerExcludeShipToLocationPreferences;
    }
    /**
     * Gets the sellerProfilePreferences property value. This container indicates whether or not the seller is opted into Business Policies. If a seller is opted into Business Policies, they must use Payment,Return, and Shipping business policies instead of individual payment, return, and shipping fields.
     * @return a {@link SellerProfilePreferencesType}
     */
    @jakarta.annotation.Nullable
    public SellerProfilePreferencesType getSellerProfilePreferences() {
        return this.sellerProfilePreferences;
    }
    /**
     * Gets the shippingCarrierRatePreferences property value. This field is included if the seller wishes to add or modify the shipping carrier rate type that is available to the seller. This field is only returned if set. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: This container is only applicable to the eBay US marketplace.
     * @return a {@link ShippingCarrierRatePreferencesType}
     */
    @jakarta.annotation.Nullable
    public ShippingCarrierRatePreferencesType getShippingCarrierRatePreferences() {
        return this.shippingCarrierRatePreferences;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("combinedPaymentPreferences", this.getCombinedPaymentPreferences());
        writer.writeObjectValue("dispatchCutoffTimePreference", this.getDispatchCutoffTimePreference());
        writer.writeBooleanValue("emailShipmentTrackingNumberPreference", this.getEmailShipmentTrackingNumberPreference());
        writer.writeObjectValue("endOfAuctionEmailPreferences", this.getEndOfAuctionEmailPreferences());
        writer.writeBooleanValue("globalShippingProgramListingPreference", this.getGlobalShippingProgramListingPreference());
        writer.writeObjectValue("itemsAwaitingPaymentPreferences", this.getItemsAwaitingPaymentPreferences());
        writer.writeBooleanValue("offerGlobalShippingProgramPreference", this.getOfferGlobalShippingProgramPreference());
        writer.writeBooleanValue("outOfStockControlPreference", this.getOutOfStockControlPreference());
        writer.writeBooleanValue("overrideGspServiceWithIntlServicePreference", this.getOverrideGspServiceWithIntlServicePreference());
        writer.writeBooleanValue("pickupDropoffSellerPreference", this.getPickupDropoffSellerPreference());
        writer.writeBooleanValue("purchaseReminderEmailPreferences", this.getPurchaseReminderEmailPreferences());
        writer.writeBooleanValue("requiredShipPhoneNumberPreference", this.getRequiredShipPhoneNumberPreference());
        writer.writeObjectValue("sellerExcludeShipToLocationPreferences", this.getSellerExcludeShipToLocationPreferences());
        writer.writeObjectValue("sellerProfilePreferences", this.getSellerProfilePreferences());
        writer.writeObjectValue("shippingCarrierRatePreferences", this.getShippingCarrierRatePreferences());
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
     * Sets the combinedPaymentPreferences property value. This container is used to change the combined payment option. Sellers have the option to combine multiple line items from the same buyer into a combined invoice that can be paid for with one payment. See CombinedPaymentOptionEnum for a description of each value.
     * @param value Value to set for the combinedPaymentPreferences property.
     */
    public void setCombinedPaymentPreferences(@jakarta.annotation.Nullable final CombinedPaymentPreferencesType value) {
        this.combinedPaymentPreferences = value;
    }
    /**
     * Sets the dispatchCutoffTimePreference property value. This container is used to change the order cut-off time for same-day shipping.
     * @param value Value to set for the dispatchCutoffTimePreference property.
     */
    public void setDispatchCutoffTimePreference(@jakarta.annotation.Nullable final DispatchCutoffTimePreferencesType value) {
        this.dispatchCutoffTimePreference = value;
    }
    /**
     * Sets the emailShipmentTrackingNumberPreference property value. This boolean field indicates whether or not the sellers account is configured to automatically send an email to buyers with the shipment tracking number for an order.
     * @param value Value to set for the emailShipmentTrackingNumberPreference property.
     */
    public void setEmailShipmentTrackingNumberPreference(@jakarta.annotation.Nullable final Boolean value) {
        this.emailShipmentTrackingNumberPreference = value;
    }
    /**
     * Sets the endOfAuctionEmailPreferences property value. This container shows the seller&apos;s preferences for the end-of-auction email sent to the winning bidder.
     * @param value Value to set for the endOfAuctionEmailPreferences property.
     */
    public void setEndOfAuctionEmailPreferences(@jakarta.annotation.Nullable final EndOfAuctionEmailPreferencesType value) {
        this.endOfAuctionEmailPreferences = value;
    }
    /**
     * Sets the globalShippingProgramListingPreference property value. This boolean field indicates whether or not the sellers new listings on the eBay marketplace will automatically use the Global Shipping Program for international shipping. This field is returned when the &lt;code&gt;GLOBAL_SHIPPING_PROGRAM&lt;/code&gt; value is included through the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter or when &lt;b&gt;fieldgroups&lt;/b&gt;=&lt;code&gt;ALL&lt;/code&gt;. &lt;/br&gt; &lt;b&gt;Note&lt;/b&gt;: The Global Shipping Program is only available for the eBay UK marketplace, and the seller must be opted into the program.
     * @param value Value to set for the globalShippingProgramListingPreference property.
     */
    public void setGlobalShippingProgramListingPreference(@jakarta.annotation.Nullable final Boolean value) {
        this.globalShippingProgramListingPreference = value;
    }
    /**
     * Sets the itemsAwaitingPaymentPreferences property value. This container represents the seller&apos;s preferences for the list of items that are awaiting payment.
     * @param value Value to set for the itemsAwaitingPaymentPreferences property.
     */
    public void setItemsAwaitingPaymentPreferences(@jakarta.annotation.Nullable final GetItemsAwaitingPaymentPreferencesType value) {
        this.itemsAwaitingPaymentPreferences = value;
    }
    /**
     * Sets the offerGlobalShippingProgramPreference property value. This boolean field indicates whether or not the seller is opted into the Global Shipping Program on the eBay marketplace. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: The Global Shipping Program is only available for the eBay UK marketplace.
     * @param value Value to set for the offerGlobalShippingProgramPreference property.
     */
    public void setOfferGlobalShippingProgramPreference(@jakarta.annotation.Nullable final Boolean value) {
        this.offerGlobalShippingProgramPreference = value;
    }
    /**
     * Sets the outOfStockControlPreference property value. This boolean field indicates whether or not the seller is opted into the Out-of-Stock feature. With this feature, a multiple quantity fixed price listing that runs out of stock will be hidden from eBay search but kept alive. Once the sellers add quantity to the listing, the listing will become active and available again.
     * @param value Value to set for the outOfStockControlPreference property.
     */
    public void setOutOfStockControlPreference(@jakarta.annotation.Nullable final Boolean value) {
        this.outOfStockControlPreference = value;
    }
    /**
     * Sets the overrideGspServiceWithIntlServicePreference property value. This boolean field indicates whether or not the seller specifies an international shipping service to a particular country for a given listing, the specified service will take precedence and be the listing&apos;s default international shipping option for buyers in that country, rather than the Global Shipping Program. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: The Global Shipping Program is only available for the eBay UK marketplace.
     * @param value Value to set for the overrideGspServiceWithIntlServicePreference property.
     */
    public void setOverrideGspServiceWithIntlServicePreference(@jakarta.annotation.Nullable final Boolean value) {
        this.overrideGspServiceWithIntlServicePreference = value;
    }
    /**
     * Sets the pickupDropoffSellerPreference property value. This boolean field indicates whether or not the seller is opted into the Click &amp; Collect feature. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: The Click &amp; Collect feature is only available on the eBay UK, Australia, and Germany marketplaces.
     * @param value Value to set for the pickupDropoffSellerPreference property.
     */
    public void setPickupDropoffSellerPreference(@jakarta.annotation.Nullable final Boolean value) {
        this.pickupDropoffSellerPreference = value;
    }
    /**
     * Sets the purchaseReminderEmailPreferences property value. This boolean field indicates whether or not the sellers account is configured to have eBay send occasional purchase reminder emails for unpaid line items.
     * @param value Value to set for the purchaseReminderEmailPreferences property.
     */
    public void setPurchaseReminderEmailPreferences(@jakarta.annotation.Nullable final Boolean value) {
        this.purchaseReminderEmailPreferences = value;
    }
    /**
     * Sets the requiredShipPhoneNumberPreference property value. This boolean field indicates whether or not the buyer is required to provide a shipping phone number during checkout.
     * @param value Value to set for the requiredShipPhoneNumberPreference property.
     */
    public void setRequiredShipPhoneNumberPreference(@jakarta.annotation.Nullable final Boolean value) {
        this.requiredShipPhoneNumberPreference = value;
    }
    /**
     * Sets the sellerExcludeShipToLocationPreferences property value. This container represents the list of locations that the seller wants to exclude from shipping.
     * @param value Value to set for the sellerExcludeShipToLocationPreferences property.
     */
    public void setSellerExcludeShipToLocationPreferences(@jakarta.annotation.Nullable final SellerExcludeShipToLocationPreferencesType value) {
        this.sellerExcludeShipToLocationPreferences = value;
    }
    /**
     * Sets the sellerProfilePreferences property value. This container indicates whether or not the seller is opted into Business Policies. If a seller is opted into Business Policies, they must use Payment,Return, and Shipping business policies instead of individual payment, return, and shipping fields.
     * @param value Value to set for the sellerProfilePreferences property.
     */
    public void setSellerProfilePreferences(@jakarta.annotation.Nullable final SellerProfilePreferencesType value) {
        this.sellerProfilePreferences = value;
    }
    /**
     * Sets the shippingCarrierRatePreferences property value. This field is included if the seller wishes to add or modify the shipping carrier rate type that is available to the seller. This field is only returned if set. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: This container is only applicable to the eBay US marketplace.
     * @param value Value to set for the shippingCarrierRatePreferences property.
     */
    public void setShippingCarrierRatePreferences(@jakarta.annotation.Nullable final ShippingCarrierRatePreferencesType value) {
        this.shippingCarrierRatePreferences = value;
    }
}
