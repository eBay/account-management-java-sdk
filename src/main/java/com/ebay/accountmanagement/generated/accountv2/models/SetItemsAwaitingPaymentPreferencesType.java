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
 * This container represents the seller&apos;s preferences for the items that are awaiting payment.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SetItemsAwaitingPaymentPreferencesType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This boolean field is included if the seller wishes to toggle the setting that controls whether or not the line item should be automatically relisted when cancelled. For this field to be set to &lt;code&gt;true&lt;/code&gt;, the &lt;code&gt;optInStatus&lt;/code&gt; field should also be &lt;code&gt;true&lt;/code&gt;. &lt;/br&gt; &lt;b&gt;Note&lt;/b&gt;: If the line item was part of an auction listing or a single-quantity fixed price listing, a new listing will actually be created. If the line item was part of a multiple-quantity fixed price listing, eBay will only adjust the quantity based on the cancelled line items quantity.
     */
    private Boolean autoRelist;
    /**
     * This integer field is included if the seller wishes to set or change the number of business days without payment that must elapse before the line item is cancelled. This is a required field if the optInStatus field is &lt;code&gt;true&lt;/code&gt;. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: The supported integer values (representing business days) varies by eBay marketplace.
     */
    private Integer delayBeforeCancellingCommitment;
    /**
     * This array is used if the seller wishes to exclude one or more eBay users from the unpaid item assistance mechanism. The seller would need to manually cancel any unpaid line items for all users on this list. This array will not be returned if there are no users on the excluded users list. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: The eBay public username is used for each excluded user, and a comma is used to delimit each user in the array.
     */
    private java.util.List<String> excludedUsers;
    /**
     * This boolean field is included if the seller wishes to toggle the setting that controls whether or not the seller is opted into the unpaid item assistance mechanism. If the seller is not opted in, no other fields under &lt;code&gt;itemsAwaitingPaymentPreferences&lt;/code&gt; are applicable.
     */
    private Boolean optInStatus;
    /**
     * This boolean field is included and set to &lt;code&gt;true&lt;/code&gt; if the seller wishes to remove all eBay users from the current excluded users list. If this field is included and set to &lt;code&gt;true&lt;/code&gt;, the &lt;code&gt;excludedUsers&lt;/code&gt; array should not be included.
     */
    private Boolean removeAllExcludedUsers;
    /**
     * Instantiates a new {@link SetItemsAwaitingPaymentPreferencesType} and sets the default values.
     */
    public SetItemsAwaitingPaymentPreferencesType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SetItemsAwaitingPaymentPreferencesType}
     */
    @jakarta.annotation.Nonnull
    public static SetItemsAwaitingPaymentPreferencesType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetItemsAwaitingPaymentPreferencesType();
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
     * Gets the autoRelist property value. This boolean field is included if the seller wishes to toggle the setting that controls whether or not the line item should be automatically relisted when cancelled. For this field to be set to &lt;code&gt;true&lt;/code&gt;, the &lt;code&gt;optInStatus&lt;/code&gt; field should also be &lt;code&gt;true&lt;/code&gt;. &lt;/br&gt; &lt;b&gt;Note&lt;/b&gt;: If the line item was part of an auction listing or a single-quantity fixed price listing, a new listing will actually be created. If the line item was part of a multiple-quantity fixed price listing, eBay will only adjust the quantity based on the cancelled line items quantity.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoRelist() {
        return this.autoRelist;
    }
    /**
     * Gets the delayBeforeCancellingCommitment property value. This integer field is included if the seller wishes to set or change the number of business days without payment that must elapse before the line item is cancelled. This is a required field if the optInStatus field is &lt;code&gt;true&lt;/code&gt;. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: The supported integer values (representing business days) varies by eBay marketplace.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDelayBeforeCancellingCommitment() {
        return this.delayBeforeCancellingCommitment;
    }
    /**
     * Gets the excludedUsers property value. This array is used if the seller wishes to exclude one or more eBay users from the unpaid item assistance mechanism. The seller would need to manually cancel any unpaid line items for all users on this list. This array will not be returned if there are no users on the excluded users list. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: The eBay public username is used for each excluded user, and a comma is used to delimit each user in the array.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludedUsers() {
        return this.excludedUsers;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("autoRelist", (n) -> { this.setAutoRelist(n.getBooleanValue()); });
        deserializerMap.put("delayBeforeCancellingCommitment", (n) -> { this.setDelayBeforeCancellingCommitment(n.getIntegerValue()); });
        deserializerMap.put("excludedUsers", (n) -> { this.setExcludedUsers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("optInStatus", (n) -> { this.setOptInStatus(n.getBooleanValue()); });
        deserializerMap.put("removeAllExcludedUsers", (n) -> { this.setRemoveAllExcludedUsers(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the optInStatus property value. This boolean field is included if the seller wishes to toggle the setting that controls whether or not the seller is opted into the unpaid item assistance mechanism. If the seller is not opted in, no other fields under &lt;code&gt;itemsAwaitingPaymentPreferences&lt;/code&gt; are applicable.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOptInStatus() {
        return this.optInStatus;
    }
    /**
     * Gets the removeAllExcludedUsers property value. This boolean field is included and set to &lt;code&gt;true&lt;/code&gt; if the seller wishes to remove all eBay users from the current excluded users list. If this field is included and set to &lt;code&gt;true&lt;/code&gt;, the &lt;code&gt;excludedUsers&lt;/code&gt; array should not be included.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRemoveAllExcludedUsers() {
        return this.removeAllExcludedUsers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("autoRelist", this.getAutoRelist());
        writer.writeIntegerValue("delayBeforeCancellingCommitment", this.getDelayBeforeCancellingCommitment());
        writer.writeCollectionOfPrimitiveValues("excludedUsers", this.getExcludedUsers());
        writer.writeBooleanValue("optInStatus", this.getOptInStatus());
        writer.writeBooleanValue("removeAllExcludedUsers", this.getRemoveAllExcludedUsers());
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
     * Sets the autoRelist property value. This boolean field is included if the seller wishes to toggle the setting that controls whether or not the line item should be automatically relisted when cancelled. For this field to be set to &lt;code&gt;true&lt;/code&gt;, the &lt;code&gt;optInStatus&lt;/code&gt; field should also be &lt;code&gt;true&lt;/code&gt;. &lt;/br&gt; &lt;b&gt;Note&lt;/b&gt;: If the line item was part of an auction listing or a single-quantity fixed price listing, a new listing will actually be created. If the line item was part of a multiple-quantity fixed price listing, eBay will only adjust the quantity based on the cancelled line items quantity.
     * @param value Value to set for the autoRelist property.
     */
    public void setAutoRelist(@jakarta.annotation.Nullable final Boolean value) {
        this.autoRelist = value;
    }
    /**
     * Sets the delayBeforeCancellingCommitment property value. This integer field is included if the seller wishes to set or change the number of business days without payment that must elapse before the line item is cancelled. This is a required field if the optInStatus field is &lt;code&gt;true&lt;/code&gt;. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: The supported integer values (representing business days) varies by eBay marketplace.
     * @param value Value to set for the delayBeforeCancellingCommitment property.
     */
    public void setDelayBeforeCancellingCommitment(@jakarta.annotation.Nullable final Integer value) {
        this.delayBeforeCancellingCommitment = value;
    }
    /**
     * Sets the excludedUsers property value. This array is used if the seller wishes to exclude one or more eBay users from the unpaid item assistance mechanism. The seller would need to manually cancel any unpaid line items for all users on this list. This array will not be returned if there are no users on the excluded users list. &lt;/br&gt;&lt;b&gt;Note&lt;/b&gt;: The eBay public username is used for each excluded user, and a comma is used to delimit each user in the array.
     * @param value Value to set for the excludedUsers property.
     */
    public void setExcludedUsers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.excludedUsers = value;
    }
    /**
     * Sets the optInStatus property value. This boolean field is included if the seller wishes to toggle the setting that controls whether or not the seller is opted into the unpaid item assistance mechanism. If the seller is not opted in, no other fields under &lt;code&gt;itemsAwaitingPaymentPreferences&lt;/code&gt; are applicable.
     * @param value Value to set for the optInStatus property.
     */
    public void setOptInStatus(@jakarta.annotation.Nullable final Boolean value) {
        this.optInStatus = value;
    }
    /**
     * Sets the removeAllExcludedUsers property value. This boolean field is included and set to &lt;code&gt;true&lt;/code&gt; if the seller wishes to remove all eBay users from the current excluded users list. If this field is included and set to &lt;code&gt;true&lt;/code&gt;, the &lt;code&gt;excludedUsers&lt;/code&gt; array should not be included.
     * @param value Value to set for the removeAllExcludedUsers property.
     */
    public void setRemoveAllExcludedUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.removeAllExcludedUsers = value;
    }
}
