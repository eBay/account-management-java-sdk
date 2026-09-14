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

package com.ebay.accountmanagement.generated.accountv2.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the request fields for the seller preferences configuration for eBay services.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SetUserPreferencesRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container is included if the seller wishes to allow combined invoices if the buyer has multiple unpaid orders from the same seller.
     */
    private CombinedPaymentPreferencesType combinedPaymentPreferences;
    /**
     * This container is included if the seller wishes to set or modify the order cut-off time for same-day shipping.
     */
    private DispatchCutoffTimePreferencesType dispatchCutoffTimePreference;
    /**
     * This field is included if the seller wishes to enable or disable the setting that will automatically email the buyer with the tracking number when it becomes available.
     */
    private Boolean emailShipmentTrackingNumberPreference;
    /**
     * This container is included if the seller wishes to change one or more of the end of auction email preferences.
     */
    private EndOfAuctionEmailPreferencesType endOfAuctionEmailPreferences;
    /**
     * This boolean field is included if the seller wishes to toggle the setting that controls whether or not the sellers new listings on the eBay UK marketplace will automatically use the Global Shipping Program for international shipping. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: The Global Shipping Program is only available for the eBay UK marketplace, and the seller must be opted into the program, that is &lt;code&gt;offerGlobalShippingProgramPreference = true&lt;/code&gt;
     */
    private Boolean globalShippingProgramListingPreference;
    /**
     * This container is included if the seller wishes to change one or more of the items awaiting payment preferences.
     */
    private SetItemsAwaitingPaymentPreferencesType itemsAwaitingPaymentPreferences;
    /**
     * This boolean field is included if the seller wishes to toggle the setting that controls whether or not the seller is opted into the Out-of-Stock feature. With this feature, a multiple quantity fixed price listing that runs out of stock will be hidden from eBay search but kept alive. Once the sellers add quantity to the listing, the listing will become active and available again.
     */
    private Boolean outOfStockControlPreference;
    /**
     * This boolean field is included if the seller wishes to toggle the setting that controls whether or not the buyer is expected to provide a shipping phone number upon checkout. Some shipping carriers require the receiver&apos;s phone number.
     */
    private Boolean purchaseReminderEmailPreferences;
    /**
     * This boolean indicates whether the seller wishes to require phone numbers for shipping or not.
     */
    private Boolean requiredShipPhoneNumberPreference;
    /**
     * This container is included if the seller wishes to add or modify a FedEx, UPS, and/or US Post Office shipping rate type that is available to the seller. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: This container is only applicable to the eBay US marketplace.
     */
    private ShippingCarrierRatePreferencesType shippingCarrierRatePreferences;
    /**
     * Instantiates a new {@link SetUserPreferencesRequest} and sets the default values.
     */
    public SetUserPreferencesRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SetUserPreferencesRequest}
     */
    @jakarta.annotation.Nonnull
    public static SetUserPreferencesRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetUserPreferencesRequest();
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
     * Gets the combinedPaymentPreferences property value. This container is included if the seller wishes to allow combined invoices if the buyer has multiple unpaid orders from the same seller.
     * @return a {@link CombinedPaymentPreferencesType}
     */
    @jakarta.annotation.Nullable
    public CombinedPaymentPreferencesType getCombinedPaymentPreferences() {
        return this.combinedPaymentPreferences;
    }
    /**
     * Gets the dispatchCutoffTimePreference property value. This container is included if the seller wishes to set or modify the order cut-off time for same-day shipping.
     * @return a {@link DispatchCutoffTimePreferencesType}
     */
    @jakarta.annotation.Nullable
    public DispatchCutoffTimePreferencesType getDispatchCutoffTimePreference() {
        return this.dispatchCutoffTimePreference;
    }
    /**
     * Gets the emailShipmentTrackingNumberPreference property value. This field is included if the seller wishes to enable or disable the setting that will automatically email the buyer with the tracking number when it becomes available.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEmailShipmentTrackingNumberPreference() {
        return this.emailShipmentTrackingNumberPreference;
    }
    /**
     * Gets the endOfAuctionEmailPreferences property value. This container is included if the seller wishes to change one or more of the end of auction email preferences.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("combinedPaymentPreferences", (n) -> { this.setCombinedPaymentPreferences(n.getObjectValue(CombinedPaymentPreferencesType::createFromDiscriminatorValue)); });
        deserializerMap.put("dispatchCutoffTimePreference", (n) -> { this.setDispatchCutoffTimePreference(n.getObjectValue(DispatchCutoffTimePreferencesType::createFromDiscriminatorValue)); });
        deserializerMap.put("emailShipmentTrackingNumberPreference", (n) -> { this.setEmailShipmentTrackingNumberPreference(n.getBooleanValue()); });
        deserializerMap.put("endOfAuctionEmailPreferences", (n) -> { this.setEndOfAuctionEmailPreferences(n.getObjectValue(EndOfAuctionEmailPreferencesType::createFromDiscriminatorValue)); });
        deserializerMap.put("globalShippingProgramListingPreference", (n) -> { this.setGlobalShippingProgramListingPreference(n.getBooleanValue()); });
        deserializerMap.put("itemsAwaitingPaymentPreferences", (n) -> { this.setItemsAwaitingPaymentPreferences(n.getObjectValue(SetItemsAwaitingPaymentPreferencesType::createFromDiscriminatorValue)); });
        deserializerMap.put("outOfStockControlPreference", (n) -> { this.setOutOfStockControlPreference(n.getBooleanValue()); });
        deserializerMap.put("purchaseReminderEmailPreferences", (n) -> { this.setPurchaseReminderEmailPreferences(n.getBooleanValue()); });
        deserializerMap.put("requiredShipPhoneNumberPreference", (n) -> { this.setRequiredShipPhoneNumberPreference(n.getBooleanValue()); });
        deserializerMap.put("shippingCarrierRatePreferences", (n) -> { this.setShippingCarrierRatePreferences(n.getObjectValue(ShippingCarrierRatePreferencesType::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the globalShippingProgramListingPreference property value. This boolean field is included if the seller wishes to toggle the setting that controls whether or not the sellers new listings on the eBay UK marketplace will automatically use the Global Shipping Program for international shipping. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: The Global Shipping Program is only available for the eBay UK marketplace, and the seller must be opted into the program, that is &lt;code&gt;offerGlobalShippingProgramPreference = true&lt;/code&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getGlobalShippingProgramListingPreference() {
        return this.globalShippingProgramListingPreference;
    }
    /**
     * Gets the itemsAwaitingPaymentPreferences property value. This container is included if the seller wishes to change one or more of the items awaiting payment preferences.
     * @return a {@link SetItemsAwaitingPaymentPreferencesType}
     */
    @jakarta.annotation.Nullable
    public SetItemsAwaitingPaymentPreferencesType getItemsAwaitingPaymentPreferences() {
        return this.itemsAwaitingPaymentPreferences;
    }
    /**
     * Gets the outOfStockControlPreference property value. This boolean field is included if the seller wishes to toggle the setting that controls whether or not the seller is opted into the Out-of-Stock feature. With this feature, a multiple quantity fixed price listing that runs out of stock will be hidden from eBay search but kept alive. Once the sellers add quantity to the listing, the listing will become active and available again.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOutOfStockControlPreference() {
        return this.outOfStockControlPreference;
    }
    /**
     * Gets the purchaseReminderEmailPreferences property value. This boolean field is included if the seller wishes to toggle the setting that controls whether or not the buyer is expected to provide a shipping phone number upon checkout. Some shipping carriers require the receiver&apos;s phone number.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPurchaseReminderEmailPreferences() {
        return this.purchaseReminderEmailPreferences;
    }
    /**
     * Gets the requiredShipPhoneNumberPreference property value. This boolean indicates whether the seller wishes to require phone numbers for shipping or not.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequiredShipPhoneNumberPreference() {
        return this.requiredShipPhoneNumberPreference;
    }
    /**
     * Gets the shippingCarrierRatePreferences property value. This container is included if the seller wishes to add or modify a FedEx, UPS, and/or US Post Office shipping rate type that is available to the seller. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: This container is only applicable to the eBay US marketplace.
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
        writer.writeBooleanValue("outOfStockControlPreference", this.getOutOfStockControlPreference());
        writer.writeBooleanValue("purchaseReminderEmailPreferences", this.getPurchaseReminderEmailPreferences());
        writer.writeBooleanValue("requiredShipPhoneNumberPreference", this.getRequiredShipPhoneNumberPreference());
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
     * Sets the combinedPaymentPreferences property value. This container is included if the seller wishes to allow combined invoices if the buyer has multiple unpaid orders from the same seller.
     * @param value Value to set for the combinedPaymentPreferences property.
     */
    public void setCombinedPaymentPreferences(@jakarta.annotation.Nullable final CombinedPaymentPreferencesType value) {
        this.combinedPaymentPreferences = value;
    }
    /**
     * Sets the dispatchCutoffTimePreference property value. This container is included if the seller wishes to set or modify the order cut-off time for same-day shipping.
     * @param value Value to set for the dispatchCutoffTimePreference property.
     */
    public void setDispatchCutoffTimePreference(@jakarta.annotation.Nullable final DispatchCutoffTimePreferencesType value) {
        this.dispatchCutoffTimePreference = value;
    }
    /**
     * Sets the emailShipmentTrackingNumberPreference property value. This field is included if the seller wishes to enable or disable the setting that will automatically email the buyer with the tracking number when it becomes available.
     * @param value Value to set for the emailShipmentTrackingNumberPreference property.
     */
    public void setEmailShipmentTrackingNumberPreference(@jakarta.annotation.Nullable final Boolean value) {
        this.emailShipmentTrackingNumberPreference = value;
    }
    /**
     * Sets the endOfAuctionEmailPreferences property value. This container is included if the seller wishes to change one or more of the end of auction email preferences.
     * @param value Value to set for the endOfAuctionEmailPreferences property.
     */
    public void setEndOfAuctionEmailPreferences(@jakarta.annotation.Nullable final EndOfAuctionEmailPreferencesType value) {
        this.endOfAuctionEmailPreferences = value;
    }
    /**
     * Sets the globalShippingProgramListingPreference property value. This boolean field is included if the seller wishes to toggle the setting that controls whether or not the sellers new listings on the eBay UK marketplace will automatically use the Global Shipping Program for international shipping. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: The Global Shipping Program is only available for the eBay UK marketplace, and the seller must be opted into the program, that is &lt;code&gt;offerGlobalShippingProgramPreference = true&lt;/code&gt;
     * @param value Value to set for the globalShippingProgramListingPreference property.
     */
    public void setGlobalShippingProgramListingPreference(@jakarta.annotation.Nullable final Boolean value) {
        this.globalShippingProgramListingPreference = value;
    }
    /**
     * Sets the itemsAwaitingPaymentPreferences property value. This container is included if the seller wishes to change one or more of the items awaiting payment preferences.
     * @param value Value to set for the itemsAwaitingPaymentPreferences property.
     */
    public void setItemsAwaitingPaymentPreferences(@jakarta.annotation.Nullable final SetItemsAwaitingPaymentPreferencesType value) {
        this.itemsAwaitingPaymentPreferences = value;
    }
    /**
     * Sets the outOfStockControlPreference property value. This boolean field is included if the seller wishes to toggle the setting that controls whether or not the seller is opted into the Out-of-Stock feature. With this feature, a multiple quantity fixed price listing that runs out of stock will be hidden from eBay search but kept alive. Once the sellers add quantity to the listing, the listing will become active and available again.
     * @param value Value to set for the outOfStockControlPreference property.
     */
    public void setOutOfStockControlPreference(@jakarta.annotation.Nullable final Boolean value) {
        this.outOfStockControlPreference = value;
    }
    /**
     * Sets the purchaseReminderEmailPreferences property value. This boolean field is included if the seller wishes to toggle the setting that controls whether or not the buyer is expected to provide a shipping phone number upon checkout. Some shipping carriers require the receiver&apos;s phone number.
     * @param value Value to set for the purchaseReminderEmailPreferences property.
     */
    public void setPurchaseReminderEmailPreferences(@jakarta.annotation.Nullable final Boolean value) {
        this.purchaseReminderEmailPreferences = value;
    }
    /**
     * Sets the requiredShipPhoneNumberPreference property value. This boolean indicates whether the seller wishes to require phone numbers for shipping or not.
     * @param value Value to set for the requiredShipPhoneNumberPreference property.
     */
    public void setRequiredShipPhoneNumberPreference(@jakarta.annotation.Nullable final Boolean value) {
        this.requiredShipPhoneNumberPreference = value;
    }
    /**
     * Sets the shippingCarrierRatePreferences property value. This container is included if the seller wishes to add or modify a FedEx, UPS, and/or US Post Office shipping rate type that is available to the seller. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: This container is only applicable to the eBay US marketplace.
     * @param value Value to set for the shippingCarrierRatePreferences property.
     */
    public void setShippingCarrierRatePreferences(@jakarta.annotation.Nullable final ShippingCarrierRatePreferencesType value) {
        this.shippingCarrierRatePreferences = value;
    }
}
