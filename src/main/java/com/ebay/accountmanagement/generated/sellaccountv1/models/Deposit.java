package com.ebay.accountmanagement.generated.sellaccountv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to specify/indicate that an initial deposit is required for a motor vehicle listing.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Deposit implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
     */
    private Amount amount;
    /**
     * A type used to specify a period of time using a specified time-measurement unit. Payment, return, and fulfillment business policies all use this type to specify time windows.&lt;br&gt;&lt;br&gt;Whenever a container that uses this type is used in a request, both of these fields are required. Similarly, whenever a container that uses this type is returned in a response, both of these fields are always returned.
     */
    private TimeDuration dueIn;
    /**
     * This array is no longer applicable and should not be used since eBay now manages the electronic payment options available to buyers to pay the deposit.
     */
    private java.util.List<PaymentMethod> paymentMethods;
    /**
     * Instantiates a new {@link Deposit} and sets the default values.
     */
    public Deposit() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Deposit}
     */
    @jakarta.annotation.Nonnull
    public static Deposit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Deposit();
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
     * Gets the amount property value. A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAmount() {
        return this.amount;
    }
    /**
     * Gets the dueIn property value. A type used to specify a period of time using a specified time-measurement unit. Payment, return, and fulfillment business policies all use this type to specify time windows.&lt;br&gt;&lt;br&gt;Whenever a container that uses this type is used in a request, both of these fields are required. Similarly, whenever a container that uses this type is returned in a response, both of these fields are always returned.
     * @return a {@link TimeDuration}
     */
    @jakarta.annotation.Nullable
    public TimeDuration getDueIn() {
        return this.dueIn;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("dueIn", (n) -> { this.setDueIn(n.getObjectValue(TimeDuration::createFromDiscriminatorValue)); });
        deserializerMap.put("paymentMethods", (n) -> { this.setPaymentMethods(n.getCollectionOfObjectValues(PaymentMethod::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the paymentMethods property value. This array is no longer applicable and should not be used since eBay now manages the electronic payment options available to buyers to pay the deposit.
     * @return a {@link java.util.List<PaymentMethod>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeObjectValue("dueIn", this.getDueIn());
        writer.writeCollectionOfObjectValues("paymentMethods", this.getPaymentMethods());
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
     * Sets the amount property value. A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Amount value) {
        this.amount = value;
    }
    /**
     * Sets the dueIn property value. A type used to specify a period of time using a specified time-measurement unit. Payment, return, and fulfillment business policies all use this type to specify time windows.&lt;br&gt;&lt;br&gt;Whenever a container that uses this type is used in a request, both of these fields are required. Similarly, whenever a container that uses this type is returned in a response, both of these fields are always returned.
     * @param value Value to set for the dueIn property.
     */
    public void setDueIn(@jakarta.annotation.Nullable final TimeDuration value) {
        this.dueIn = value;
    }
    /**
     * Sets the paymentMethods property value. This array is no longer applicable and should not be used since eBay now manages the electronic payment options available to buyers to pay the deposit.
     * @param value Value to set for the paymentMethods property.
     */
    public void setPaymentMethods(@jakarta.annotation.Nullable final java.util.List<PaymentMethod> value) {
        this.paymentMethods = value;
    }
}
