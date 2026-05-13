package com.ebay.accountmanagement.generated.sellfinancesv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * BillingActivityLineItem
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BillingActivityLineItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount amount;
    /**
     * This timestamp indicates the date/time when eBay processed the transaction.
     */
    private String billingTransactionDate;
    /**
     * This field provides a unique identifier of the billing transaction. If a seller wants to view details on a specific billing transaction, they can use the &lt;b&gt;actvityId&lt;/b&gt; filter and pass in a specific &lt;b&gt;billingTransactionId&lt;/b&gt; value.
     */
    private String billingTransactionId;
    /**
     * The value returned in this field will indicate if the billing transaction is a debit against the seller&apos;s account, or a credit. A debit is much more prevalent than a credit, but sometimes a listing fee will get reversed and they will get a credit for this fee. Possible values:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;DEBIT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CREDIT&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private String bookingEntry;
    /**
     * This field describes the type of fee associated with the transaction. An example value is  &lt;code&gt;FinalValueFeeFixedFeePerOrder&lt;/code&gt;.
     */
    private String feeType;
    /**
     * This field contains the human-readable description of the fee type associated with the transaction. For example, &lt;code&gt;Final Value Fee&lt;/code&gt;.
     */
    private String feeTypeDescription;
    /**
     * The unique identifier of the eBay listing associated with the billing transaction. This field is returned if the fee is associated with a listing.
     */
    private String listingId;
    /**
     * The unique identifier of the eBay order associated with the billing transaction. This field is returned if the fee is associated with an order.
     */
    private String orderId;
    /**
     * A list of seller promotional offers applicable for the billing transaction.
     */
    private java.util.List<DiscountDetail> promotionalOffers;
    /**
     * Instantiates a new {@link BillingActivityLineItem} and sets the default values.
     */
    public BillingActivityLineItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BillingActivityLineItem}
     */
    @jakarta.annotation.Nonnull
    public static BillingActivityLineItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BillingActivityLineItem();
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
     * Gets the amount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAmount() {
        return this.amount;
    }
    /**
     * Gets the billingTransactionDate property value. This timestamp indicates the date/time when eBay processed the transaction.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBillingTransactionDate() {
        return this.billingTransactionDate;
    }
    /**
     * Gets the billingTransactionId property value. This field provides a unique identifier of the billing transaction. If a seller wants to view details on a specific billing transaction, they can use the &lt;b&gt;actvityId&lt;/b&gt; filter and pass in a specific &lt;b&gt;billingTransactionId&lt;/b&gt; value.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBillingTransactionId() {
        return this.billingTransactionId;
    }
    /**
     * Gets the bookingEntry property value. The value returned in this field will indicate if the billing transaction is a debit against the seller&apos;s account, or a credit. A debit is much more prevalent than a credit, but sometimes a listing fee will get reversed and they will get a credit for this fee. Possible values:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;DEBIT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CREDIT&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBookingEntry() {
        return this.bookingEntry;
    }
    /**
     * Gets the feeType property value. This field describes the type of fee associated with the transaction. An example value is  &lt;code&gt;FinalValueFeeFixedFeePerOrder&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeeType() {
        return this.feeType;
    }
    /**
     * Gets the feeTypeDescription property value. This field contains the human-readable description of the fee type associated with the transaction. For example, &lt;code&gt;Final Value Fee&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeeTypeDescription() {
        return this.feeTypeDescription;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("billingTransactionDate", (n) -> { this.setBillingTransactionDate(n.getStringValue()); });
        deserializerMap.put("billingTransactionId", (n) -> { this.setBillingTransactionId(n.getStringValue()); });
        deserializerMap.put("bookingEntry", (n) -> { this.setBookingEntry(n.getStringValue()); });
        deserializerMap.put("feeType", (n) -> { this.setFeeType(n.getStringValue()); });
        deserializerMap.put("feeTypeDescription", (n) -> { this.setFeeTypeDescription(n.getStringValue()); });
        deserializerMap.put("listingId", (n) -> { this.setListingId(n.getStringValue()); });
        deserializerMap.put("orderId", (n) -> { this.setOrderId(n.getStringValue()); });
        deserializerMap.put("promotionalOffers", (n) -> { this.setPromotionalOffers(n.getCollectionOfObjectValues(DiscountDetail::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the listingId property value. The unique identifier of the eBay listing associated with the billing transaction. This field is returned if the fee is associated with a listing.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingId() {
        return this.listingId;
    }
    /**
     * Gets the orderId property value. The unique identifier of the eBay order associated with the billing transaction. This field is returned if the fee is associated with an order.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Gets the promotionalOffers property value. A list of seller promotional offers applicable for the billing transaction.
     * @return a {@link java.util.List<DiscountDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DiscountDetail> getPromotionalOffers() {
        return this.promotionalOffers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeStringValue("billingTransactionDate", this.getBillingTransactionDate());
        writer.writeStringValue("billingTransactionId", this.getBillingTransactionId());
        writer.writeStringValue("bookingEntry", this.getBookingEntry());
        writer.writeStringValue("feeType", this.getFeeType());
        writer.writeStringValue("feeTypeDescription", this.getFeeTypeDescription());
        writer.writeStringValue("listingId", this.getListingId());
        writer.writeStringValue("orderId", this.getOrderId());
        writer.writeCollectionOfObjectValues("promotionalOffers", this.getPromotionalOffers());
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
     * Sets the amount property value. This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Amount value) {
        this.amount = value;
    }
    /**
     * Sets the billingTransactionDate property value. This timestamp indicates the date/time when eBay processed the transaction.
     * @param value Value to set for the billingTransactionDate property.
     */
    public void setBillingTransactionDate(@jakarta.annotation.Nullable final String value) {
        this.billingTransactionDate = value;
    }
    /**
     * Sets the billingTransactionId property value. This field provides a unique identifier of the billing transaction. If a seller wants to view details on a specific billing transaction, they can use the &lt;b&gt;actvityId&lt;/b&gt; filter and pass in a specific &lt;b&gt;billingTransactionId&lt;/b&gt; value.
     * @param value Value to set for the billingTransactionId property.
     */
    public void setBillingTransactionId(@jakarta.annotation.Nullable final String value) {
        this.billingTransactionId = value;
    }
    /**
     * Sets the bookingEntry property value. The value returned in this field will indicate if the billing transaction is a debit against the seller&apos;s account, or a credit. A debit is much more prevalent than a credit, but sometimes a listing fee will get reversed and they will get a credit for this fee. Possible values:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;DEBIT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CREDIT&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the bookingEntry property.
     */
    public void setBookingEntry(@jakarta.annotation.Nullable final String value) {
        this.bookingEntry = value;
    }
    /**
     * Sets the feeType property value. This field describes the type of fee associated with the transaction. An example value is  &lt;code&gt;FinalValueFeeFixedFeePerOrder&lt;/code&gt;.
     * @param value Value to set for the feeType property.
     */
    public void setFeeType(@jakarta.annotation.Nullable final String value) {
        this.feeType = value;
    }
    /**
     * Sets the feeTypeDescription property value. This field contains the human-readable description of the fee type associated with the transaction. For example, &lt;code&gt;Final Value Fee&lt;/code&gt;.
     * @param value Value to set for the feeTypeDescription property.
     */
    public void setFeeTypeDescription(@jakarta.annotation.Nullable final String value) {
        this.feeTypeDescription = value;
    }
    /**
     * Sets the listingId property value. The unique identifier of the eBay listing associated with the billing transaction. This field is returned if the fee is associated with a listing.
     * @param value Value to set for the listingId property.
     */
    public void setListingId(@jakarta.annotation.Nullable final String value) {
        this.listingId = value;
    }
    /**
     * Sets the orderId property value. The unique identifier of the eBay order associated with the billing transaction. This field is returned if the fee is associated with an order.
     * @param value Value to set for the orderId property.
     */
    public void setOrderId(@jakarta.annotation.Nullable final String value) {
        this.orderId = value;
    }
    /**
     * Sets the promotionalOffers property value. A list of seller promotional offers applicable for the billing transaction.
     * @param value Value to set for the promotionalOffers property.
     */
    public void setPromotionalOffers(@jakarta.annotation.Nullable final java.util.List<DiscountDetail> value) {
        this.promotionalOffers = value;
    }
}
