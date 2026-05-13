package com.ebay.accountmanagement.generated.sellaccountv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the base request of the &lt;b&gt;createOrReplaceSalesTax&lt;/b&gt;. 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SalesTaxBase implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field is used to set the sales tax rate for the tax jurisdiction set in the call URI. When applicable to an order, this sales tax rate will be applied to sales price. The &lt;b&gt;shippingAndHandlingTaxed&lt;/b&gt; value will indicate whether or not sales tax is also applied to shipping and handling charges&lt;br&gt;&lt;br&gt;Although it is a string, a percentage value is set here, such as &lt;code&gt;7.75&lt;/code&gt;.
     */
    private String salesTaxPercentage;
    /**
     * This field is set to &lt;code&gt;true&lt;/code&gt; if the seller wishes to apply sales tax to shipping and handling charges, and not just the total sales price of the order. Otherwise, this field&apos;s value should be set to &lt;code&gt;false&lt;/code&gt;.
     */
    private Boolean shippingAndHandlingTaxed;
    /**
     * Instantiates a new {@link SalesTaxBase} and sets the default values.
     */
    public SalesTaxBase() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SalesTaxBase}
     */
    @jakarta.annotation.Nonnull
    public static SalesTaxBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SalesTaxBase();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("salesTaxPercentage", (n) -> { this.setSalesTaxPercentage(n.getStringValue()); });
        deserializerMap.put("shippingAndHandlingTaxed", (n) -> { this.setShippingAndHandlingTaxed(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the salesTaxPercentage property value. This field is used to set the sales tax rate for the tax jurisdiction set in the call URI. When applicable to an order, this sales tax rate will be applied to sales price. The &lt;b&gt;shippingAndHandlingTaxed&lt;/b&gt; value will indicate whether or not sales tax is also applied to shipping and handling charges&lt;br&gt;&lt;br&gt;Although it is a string, a percentage value is set here, such as &lt;code&gt;7.75&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSalesTaxPercentage() {
        return this.salesTaxPercentage;
    }
    /**
     * Gets the shippingAndHandlingTaxed property value. This field is set to &lt;code&gt;true&lt;/code&gt; if the seller wishes to apply sales tax to shipping and handling charges, and not just the total sales price of the order. Otherwise, this field&apos;s value should be set to &lt;code&gt;false&lt;/code&gt;.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShippingAndHandlingTaxed() {
        return this.shippingAndHandlingTaxed;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("salesTaxPercentage", this.getSalesTaxPercentage());
        writer.writeBooleanValue("shippingAndHandlingTaxed", this.getShippingAndHandlingTaxed());
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
     * Sets the salesTaxPercentage property value. This field is used to set the sales tax rate for the tax jurisdiction set in the call URI. When applicable to an order, this sales tax rate will be applied to sales price. The &lt;b&gt;shippingAndHandlingTaxed&lt;/b&gt; value will indicate whether or not sales tax is also applied to shipping and handling charges&lt;br&gt;&lt;br&gt;Although it is a string, a percentage value is set here, such as &lt;code&gt;7.75&lt;/code&gt;.
     * @param value Value to set for the salesTaxPercentage property.
     */
    public void setSalesTaxPercentage(@jakarta.annotation.Nullable final String value) {
        this.salesTaxPercentage = value;
    }
    /**
     * Sets the shippingAndHandlingTaxed property value. This field is set to &lt;code&gt;true&lt;/code&gt; if the seller wishes to apply sales tax to shipping and handling charges, and not just the total sales price of the order. Otherwise, this field&apos;s value should be set to &lt;code&gt;false&lt;/code&gt;.
     * @param value Value to set for the shippingAndHandlingTaxed property.
     */
    public void setShippingAndHandlingTaxed(@jakarta.annotation.Nullable final Boolean value) {
        this.shippingAndHandlingTaxed = value;
    }
}
