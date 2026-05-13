package com.ebay.accountmanagement.generated.sellaccountv2.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This container defines the updated shipping cost information for a rate object identified by &lt;b&gt;rateId&lt;/b&gt;.&lt;br/&gt;&lt;br/&gt;To view a list of all rate objects and corresponding &lt;b&gt;rateID&lt;/b&gt; values, issue &lt;b&gt;getRateTable&lt;/b&gt; for the rate table identified by &lt;b&gt;rateTableId&lt;/b&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RateUpdate implements AdditionalDataHolder, Parsable {
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount additionalCost;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The identifier for the rate object.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This is a string automatically assigned by the system when the rate object is created. It cannot be changed or updated.&lt;/span&gt;
     */
    private String rateId;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount shippingCost;
    /**
     * Instantiates a new {@link RateUpdate} and sets the default values.
     */
    public RateUpdate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RateUpdate}
     */
    @jakarta.annotation.Nonnull
    public static RateUpdate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RateUpdate();
    }
    /**
     * Gets the additionalCost property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAdditionalCost() {
        return this.additionalCost;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("additionalCost", (n) -> { this.setAdditionalCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("rateId", (n) -> { this.setRateId(n.getStringValue()); });
        deserializerMap.put("shippingCost", (n) -> { this.setShippingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the rateId property value. The identifier for the rate object.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This is a string automatically assigned by the system when the rate object is created. It cannot be changed or updated.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRateId() {
        return this.rateId;
    }
    /**
     * Gets the shippingCost property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getShippingCost() {
        return this.shippingCost;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("additionalCost", this.getAdditionalCost());
        writer.writeStringValue("rateId", this.getRateId());
        writer.writeObjectValue("shippingCost", this.getShippingCost());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalCost property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the additionalCost property.
     */
    public void setAdditionalCost(@jakarta.annotation.Nullable final Amount value) {
        this.additionalCost = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the rateId property value. The identifier for the rate object.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This is a string automatically assigned by the system when the rate object is created. It cannot be changed or updated.&lt;/span&gt;
     * @param value Value to set for the rateId property.
     */
    public void setRateId(@jakarta.annotation.Nullable final String value) {
        this.rateId = value;
    }
    /**
     * Sets the shippingCost property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the shippingCost property.
     */
    public void setShippingCost(@jakarta.annotation.Nullable final Amount value) {
        this.shippingCost = value;
    }
}
