package com.ebay.accountmanagement.generated.sellaccountv2.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This container represents the seller&apos;s preferences for the list of items that are awaiting payment.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetItemsAwaitingPaymentPreferencesType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This boolean indicates if the item should be automatically relisted.
     */
    private Boolean autoRelist;
    /**
     * This integer indicates the delay in days before cancelling the buyer&amp;#x27;s commitment.
     */
    private Integer delayBeforeCancellingCommitment;
    /**
     * This string returns the list of sellers excluded from unpaid item assistance.
     */
    private java.util.List<String> excludedUsers;
    /**
     * This boolean indicates if the unpaid item assistance is opted in.
     */
    private Boolean optInStatus;
    /**
     * Instantiates a new {@link GetItemsAwaitingPaymentPreferencesType} and sets the default values.
     */
    public GetItemsAwaitingPaymentPreferencesType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetItemsAwaitingPaymentPreferencesType}
     */
    @jakarta.annotation.Nonnull
    public static GetItemsAwaitingPaymentPreferencesType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetItemsAwaitingPaymentPreferencesType();
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
     * Gets the autoRelist property value. This boolean indicates if the item should be automatically relisted.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoRelist() {
        return this.autoRelist;
    }
    /**
     * Gets the delayBeforeCancellingCommitment property value. This integer indicates the delay in days before cancelling the buyer&amp;#x27;s commitment.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDelayBeforeCancellingCommitment() {
        return this.delayBeforeCancellingCommitment;
    }
    /**
     * Gets the excludedUsers property value. This string returns the list of sellers excluded from unpaid item assistance.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("autoRelist", (n) -> { this.setAutoRelist(n.getBooleanValue()); });
        deserializerMap.put("delayBeforeCancellingCommitment", (n) -> { this.setDelayBeforeCancellingCommitment(n.getIntegerValue()); });
        deserializerMap.put("excludedUsers", (n) -> { this.setExcludedUsers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("optInStatus", (n) -> { this.setOptInStatus(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the optInStatus property value. This boolean indicates if the unpaid item assistance is opted in.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOptInStatus() {
        return this.optInStatus;
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
     * Sets the autoRelist property value. This boolean indicates if the item should be automatically relisted.
     * @param value Value to set for the autoRelist property.
     */
    public void setAutoRelist(@jakarta.annotation.Nullable final Boolean value) {
        this.autoRelist = value;
    }
    /**
     * Sets the delayBeforeCancellingCommitment property value. This integer indicates the delay in days before cancelling the buyer&amp;#x27;s commitment.
     * @param value Value to set for the delayBeforeCancellingCommitment property.
     */
    public void setDelayBeforeCancellingCommitment(@jakarta.annotation.Nullable final Integer value) {
        this.delayBeforeCancellingCommitment = value;
    }
    /**
     * Sets the excludedUsers property value. This string returns the list of sellers excluded from unpaid item assistance.
     * @param value Value to set for the excludedUsers property.
     */
    public void setExcludedUsers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.excludedUsers = value;
    }
    /**
     * Sets the optInStatus property value. This boolean indicates if the unpaid item assistance is opted in.
     * @param value Value to set for the optInStatus property.
     */
    public void setOptInStatus(@jakarta.annotation.Nullable final Boolean value) {
        this.optInStatus = value;
    }
}
