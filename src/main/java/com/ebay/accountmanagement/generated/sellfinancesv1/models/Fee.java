package com.ebay.accountmanagement.generated.sellfinancesv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used for provide information about a fee that is charged against an order.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Fee implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to express the dollar value and currency used for any transaction retrieved with the &lt;strong&gt;Finances API&lt;/strong&gt;, including an order total, a seller payout, a buyer refund, or a seller credit.
     */
    private Amount amount;
    /**
     * This type defines the jurisdiction information associated with a fee, identifying the geographic or regulatory region under which the fee is applied.
     */
    private FeeJurisdiction feeJurisdiction;
    /**
     * A descriptive message that provides additional context about the fee applied to the order.
     */
    private String feeMemo;
    /**
     * The enumeration value returned here indicates the type of fee that was deducted from the seller payout. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/api:FeeTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String feeType;
    /**
     * Instantiates a new {@link Fee} and sets the default values.
     */
    public Fee() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Fee}
     */
    @jakarta.annotation.Nonnull
    public static Fee createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Fee();
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
     * Gets the feeJurisdiction property value. This type defines the jurisdiction information associated with a fee, identifying the geographic or regulatory region under which the fee is applied.
     * @return a {@link FeeJurisdiction}
     */
    @jakarta.annotation.Nullable
    public FeeJurisdiction getFeeJurisdiction() {
        return this.feeJurisdiction;
    }
    /**
     * Gets the feeMemo property value. A descriptive message that provides additional context about the fee applied to the order.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeeMemo() {
        return this.feeMemo;
    }
    /**
     * Gets the feeType property value. The enumeration value returned here indicates the type of fee that was deducted from the seller payout. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/api:FeeTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeeType() {
        return this.feeType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("feeJurisdiction", (n) -> { this.setFeeJurisdiction(n.getObjectValue(FeeJurisdiction::createFromDiscriminatorValue)); });
        deserializerMap.put("feeMemo", (n) -> { this.setFeeMemo(n.getStringValue()); });
        deserializerMap.put("feeType", (n) -> { this.setFeeType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeObjectValue("feeJurisdiction", this.getFeeJurisdiction());
        writer.writeStringValue("feeMemo", this.getFeeMemo());
        writer.writeStringValue("feeType", this.getFeeType());
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
     * Sets the feeJurisdiction property value. This type defines the jurisdiction information associated with a fee, identifying the geographic or regulatory region under which the fee is applied.
     * @param value Value to set for the feeJurisdiction property.
     */
    public void setFeeJurisdiction(@jakarta.annotation.Nullable final FeeJurisdiction value) {
        this.feeJurisdiction = value;
    }
    /**
     * Sets the feeMemo property value. A descriptive message that provides additional context about the fee applied to the order.
     * @param value Value to set for the feeMemo property.
     */
    public void setFeeMemo(@jakarta.annotation.Nullable final String value) {
        this.feeMemo = value;
    }
    /**
     * Sets the feeType property value. The enumeration value returned here indicates the type of fee that was deducted from the seller payout. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/finances/types/api:FeeTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the feeType property.
     */
    public void setFeeType(@jakarta.annotation.Nullable final String value) {
        this.feeType = value;
    }
}
