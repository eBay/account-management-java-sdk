package com.ebay.accountmanagement.generated.sellaccountv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkSalesTaxInput implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The array of sales-tax table entries to be created or updated.
     */
    private java.util.List<SalesTaxInput> salesTaxInputList;
    /**
     * Instantiates a new {@link BulkSalesTaxInput} and sets the default values.
     */
    public BulkSalesTaxInput() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BulkSalesTaxInput}
     */
    @jakarta.annotation.Nonnull
    public static BulkSalesTaxInput createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkSalesTaxInput();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("salesTaxInputList", (n) -> { this.setSalesTaxInputList(n.getCollectionOfObjectValues(SalesTaxInput::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the salesTaxInputList property value. The array of sales-tax table entries to be created or updated.
     * @return a {@link java.util.List<SalesTaxInput>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SalesTaxInput> getSalesTaxInputList() {
        return this.salesTaxInputList;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("salesTaxInputList", this.getSalesTaxInputList());
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
     * Sets the salesTaxInputList property value. The array of sales-tax table entries to be created or updated.
     * @param value Value to set for the salesTaxInputList property.
     */
    public void setSalesTaxInputList(@jakarta.annotation.Nullable final java.util.List<SalesTaxInput> value) {
        this.salesTaxInputList = value;
    }
}
