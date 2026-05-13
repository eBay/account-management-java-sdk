package com.ebay.accountmanagement.generated.sellaccountv2.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This container represents the list of locations that the seller wants to exclude from shipping.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SellerExcludeShipToLocationPreferencesType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array shows the list of locations that the seller does not ship to. Excluded locations may include continents and large geographical areas. For example, &apos;Middle East&apos;, individual countries represented by two-letter codes, or special locations within a country such as &apos;Alaska/Hawaii&apos; or &apos;PO Box&apos;.
     */
    private java.util.List<String> excludeShipToLocations;
    /**
     * Instantiates a new {@link SellerExcludeShipToLocationPreferencesType} and sets the default values.
     */
    public SellerExcludeShipToLocationPreferencesType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SellerExcludeShipToLocationPreferencesType}
     */
    @jakarta.annotation.Nonnull
    public static SellerExcludeShipToLocationPreferencesType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SellerExcludeShipToLocationPreferencesType();
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
     * Gets the excludeShipToLocations property value. This array shows the list of locations that the seller does not ship to. Excluded locations may include continents and large geographical areas. For example, &apos;Middle East&apos;, individual countries represented by two-letter codes, or special locations within a country such as &apos;Alaska/Hawaii&apos; or &apos;PO Box&apos;.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludeShipToLocations() {
        return this.excludeShipToLocations;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("excludeShipToLocations", (n) -> { this.setExcludeShipToLocations(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("excludeShipToLocations", this.getExcludeShipToLocations());
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
     * Sets the excludeShipToLocations property value. This array shows the list of locations that the seller does not ship to. Excluded locations may include continents and large geographical areas. For example, &apos;Middle East&apos;, individual countries represented by two-letter codes, or special locations within a country such as &apos;Alaska/Hawaii&apos; or &apos;PO Box&apos;.
     * @param value Value to set for the excludeShipToLocations property.
     */
    public void setExcludeShipToLocations(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.excludeShipToLocations = value;
    }
}
