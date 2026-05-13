package com.ebay.accountmanagement.generated.sellfinancesv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to express details about the buyer associated with an order. At this time, the only field in this type is the eBay user ID of the buyer, but more fields may get added at a later date.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Buyer implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The eBay user ID of the order&apos;s buyer.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     */
    private String username;
    /**
     * Instantiates a new {@link Buyer} and sets the default values.
     */
    public Buyer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Buyer}
     */
    @jakarta.annotation.Nonnull
    public static Buyer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Buyer();
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
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the username property value. The eBay user ID of the order&apos;s buyer.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUsername() {
        return this.username;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("username", this.getUsername());
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
     * Sets the username property value. The eBay user ID of the order&apos;s buyer.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
