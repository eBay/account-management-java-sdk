package com.ebay.accountmanagement.generated.sellaccountv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to return the list of new and updated sales-tax table entries.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdatedSalesTaxResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The array of new and updated sales-tax table entries.
     */
    private java.util.List<UpdatedSalesTaxEntry> updatedSalesTaxEntries;
    /**
     * Instantiates a new {@link UpdatedSalesTaxResponse} and sets the default values.
     */
    public UpdatedSalesTaxResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdatedSalesTaxResponse}
     */
    @jakarta.annotation.Nonnull
    public static UpdatedSalesTaxResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdatedSalesTaxResponse();
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
        deserializerMap.put("updatedSalesTaxEntries", (n) -> { this.setUpdatedSalesTaxEntries(n.getCollectionOfObjectValues(UpdatedSalesTaxEntry::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the updatedSalesTaxEntries property value. The array of new and updated sales-tax table entries.
     * @return a {@link java.util.List<UpdatedSalesTaxEntry>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UpdatedSalesTaxEntry> getUpdatedSalesTaxEntries() {
        return this.updatedSalesTaxEntries;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("updatedSalesTaxEntries", this.getUpdatedSalesTaxEntries());
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
     * Sets the updatedSalesTaxEntries property value. The array of new and updated sales-tax table entries.
     * @param value Value to set for the updatedSalesTaxEntries property.
     */
    public void setUpdatedSalesTaxEntries(@jakarta.annotation.Nullable final java.util.List<UpdatedSalesTaxEntry> value) {
        this.updatedSalesTaxEntries = value;
    }
}
