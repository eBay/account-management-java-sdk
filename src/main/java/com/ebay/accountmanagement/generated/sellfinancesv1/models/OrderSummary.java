package com.ebay.accountmanagement.generated.sellfinancesv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type provides order cost details, including line item subtotal, shipping and handling, seller-collected taxes, and any seller applied discounts. Always provided in the listing currency.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrderSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount discounts;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount itemSubtotal;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount sellerCollectedTaxes;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount shippingAndHandlingCosts;
    /**
     * Instantiates a new {@link OrderSummary} and sets the default values.
     */
    public OrderSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrderSummary}
     */
    @jakarta.annotation.Nonnull
    public static OrderSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrderSummary();
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
     * Gets the discounts property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getDiscounts() {
        return this.discounts;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("discounts", (n) -> { this.setDiscounts(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("itemSubtotal", (n) -> { this.setItemSubtotal(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("sellerCollectedTaxes", (n) -> { this.setSellerCollectedTaxes(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("shippingAndHandlingCosts", (n) -> { this.setShippingAndHandlingCosts(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the itemSubtotal property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getItemSubtotal() {
        return this.itemSubtotal;
    }
    /**
     * Gets the sellerCollectedTaxes property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getSellerCollectedTaxes() {
        return this.sellerCollectedTaxes;
    }
    /**
     * Gets the shippingAndHandlingCosts property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getShippingAndHandlingCosts() {
        return this.shippingAndHandlingCosts;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("discounts", this.getDiscounts());
        writer.writeObjectValue("itemSubtotal", this.getItemSubtotal());
        writer.writeObjectValue("sellerCollectedTaxes", this.getSellerCollectedTaxes());
        writer.writeObjectValue("shippingAndHandlingCosts", this.getShippingAndHandlingCosts());
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
     * Sets the discounts property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the discounts property.
     */
    public void setDiscounts(@jakarta.annotation.Nullable final Amount value) {
        this.discounts = value;
    }
    /**
     * Sets the itemSubtotal property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the itemSubtotal property.
     */
    public void setItemSubtotal(@jakarta.annotation.Nullable final Amount value) {
        this.itemSubtotal = value;
    }
    /**
     * Sets the sellerCollectedTaxes property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the sellerCollectedTaxes property.
     */
    public void setSellerCollectedTaxes(@jakarta.annotation.Nullable final Amount value) {
        this.sellerCollectedTaxes = value;
    }
    /**
     * Sets the shippingAndHandlingCosts property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the shippingAndHandlingCosts property.
     */
    public void setShippingAndHandlingCosts(@jakarta.annotation.Nullable final Amount value) {
        this.shippingAndHandlingCosts = value;
    }
}
