package com.ebay.accountmanagement.generated.sellfinancesv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to show the fees and donations that are deducted from a seller payout for each line item in an order.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrderLineItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The list of donations applied to the line item.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;Currently, this array is only returned if the seller chooses to donate a percentage of the sales proceeds to a charitable organization registered with the eBay for Charity program.&lt;/span&gt;
     */
    private java.util.List<Fee> donations;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount feeBasisAmount;
    /**
     * The unique identifier of an order line item.
     */
    private String lineItemId;
    /**
     * An array of all fees accrued for the order line item and deducted from a seller payout.
     */
    private java.util.List<Fee> marketplaceFees;
    /**
     * Instantiates a new {@link OrderLineItem} and sets the default values.
     */
    public OrderLineItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrderLineItem}
     */
    @jakarta.annotation.Nonnull
    public static OrderLineItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrderLineItem();
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
     * Gets the donations property value. The list of donations applied to the line item.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;Currently, this array is only returned if the seller chooses to donate a percentage of the sales proceeds to a charitable organization registered with the eBay for Charity program.&lt;/span&gt;
     * @return a {@link java.util.List<Fee>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Fee> getDonations() {
        return this.donations;
    }
    /**
     * Gets the feeBasisAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getFeeBasisAmount() {
        return this.feeBasisAmount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("donations", (n) -> { this.setDonations(n.getCollectionOfObjectValues(Fee::createFromDiscriminatorValue)); });
        deserializerMap.put("feeBasisAmount", (n) -> { this.setFeeBasisAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("lineItemId", (n) -> { this.setLineItemId(n.getStringValue()); });
        deserializerMap.put("marketplaceFees", (n) -> { this.setMarketplaceFees(n.getCollectionOfObjectValues(Fee::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lineItemId property value. The unique identifier of an order line item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }
    /**
     * Gets the marketplaceFees property value. An array of all fees accrued for the order line item and deducted from a seller payout.
     * @return a {@link java.util.List<Fee>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Fee> getMarketplaceFees() {
        return this.marketplaceFees;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("donations", this.getDonations());
        writer.writeObjectValue("feeBasisAmount", this.getFeeBasisAmount());
        writer.writeStringValue("lineItemId", this.getLineItemId());
        writer.writeCollectionOfObjectValues("marketplaceFees", this.getMarketplaceFees());
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
     * Sets the donations property value. The list of donations applied to the line item.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;Currently, this array is only returned if the seller chooses to donate a percentage of the sales proceeds to a charitable organization registered with the eBay for Charity program.&lt;/span&gt;
     * @param value Value to set for the donations property.
     */
    public void setDonations(@jakarta.annotation.Nullable final java.util.List<Fee> value) {
        this.donations = value;
    }
    /**
     * Sets the feeBasisAmount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the feeBasisAmount property.
     */
    public void setFeeBasisAmount(@jakarta.annotation.Nullable final Amount value) {
        this.feeBasisAmount = value;
    }
    /**
     * Sets the lineItemId property value. The unique identifier of an order line item.
     * @param value Value to set for the lineItemId property.
     */
    public void setLineItemId(@jakarta.annotation.Nullable final String value) {
        this.lineItemId = value;
    }
    /**
     * Sets the marketplaceFees property value. An array of all fees accrued for the order line item and deducted from a seller payout.
     * @param value Value to set for the marketplaceFees property.
     */
    public void setMarketplaceFees(@jakarta.annotation.Nullable final java.util.List<Fee> value) {
        this.marketplaceFees = value;
    }
}
