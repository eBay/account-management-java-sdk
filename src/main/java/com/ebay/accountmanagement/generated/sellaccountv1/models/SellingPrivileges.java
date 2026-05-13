package com.ebay.accountmanagement.generated.sellaccountv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the base response of the &lt;b&gt;getPrivileges&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SellingPrivileges implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If this field is returned as &lt;code&gt;true&lt;/code&gt;, the seller&apos;s registration is completed. If this field is returned as &lt;code&gt;false&lt;/code&gt;, the registration process is not complete.
     */
    private Boolean sellerRegistrationCompleted;
    /**
     * Type used by the &lt;b&gt;sellingLimit&lt;/b&gt; container, a container that lists the monthly cap for the quantity of items sold and total sales amount allowed for the seller&apos;s account.
     */
    private SellingLimit sellingLimit;
    /**
     * Instantiates a new {@link SellingPrivileges} and sets the default values.
     */
    public SellingPrivileges() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SellingPrivileges}
     */
    @jakarta.annotation.Nonnull
    public static SellingPrivileges createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SellingPrivileges();
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
        deserializerMap.put("sellerRegistrationCompleted", (n) -> { this.setSellerRegistrationCompleted(n.getBooleanValue()); });
        deserializerMap.put("sellingLimit", (n) -> { this.setSellingLimit(n.getObjectValue(SellingLimit::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sellerRegistrationCompleted property value. If this field is returned as &lt;code&gt;true&lt;/code&gt;, the seller&apos;s registration is completed. If this field is returned as &lt;code&gt;false&lt;/code&gt;, the registration process is not complete.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSellerRegistrationCompleted() {
        return this.sellerRegistrationCompleted;
    }
    /**
     * Gets the sellingLimit property value. Type used by the &lt;b&gt;sellingLimit&lt;/b&gt; container, a container that lists the monthly cap for the quantity of items sold and total sales amount allowed for the seller&apos;s account.
     * @return a {@link SellingLimit}
     */
    @jakarta.annotation.Nullable
    public SellingLimit getSellingLimit() {
        return this.sellingLimit;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("sellerRegistrationCompleted", this.getSellerRegistrationCompleted());
        writer.writeObjectValue("sellingLimit", this.getSellingLimit());
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
     * Sets the sellerRegistrationCompleted property value. If this field is returned as &lt;code&gt;true&lt;/code&gt;, the seller&apos;s registration is completed. If this field is returned as &lt;code&gt;false&lt;/code&gt;, the registration process is not complete.
     * @param value Value to set for the sellerRegistrationCompleted property.
     */
    public void setSellerRegistrationCompleted(@jakarta.annotation.Nullable final Boolean value) {
        this.sellerRegistrationCompleted = value;
    }
    /**
     * Sets the sellingLimit property value. Type used by the &lt;b&gt;sellingLimit&lt;/b&gt; container, a container that lists the monthly cap for the quantity of items sold and total sales amount allowed for the seller&apos;s account.
     * @param value Value to set for the sellingLimit property.
     */
    public void setSellingLimit(@jakarta.annotation.Nullable final SellingLimit value) {
        this.sellingLimit = value;
    }
}
