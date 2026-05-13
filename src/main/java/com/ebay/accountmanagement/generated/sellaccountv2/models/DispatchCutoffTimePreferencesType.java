package com.ebay.accountmanagement.generated.sellaccountv2.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This container is used to change the order cut-off time for same-day shipping.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DispatchCutoffTimePreferencesType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field indicates the dispatch cut-off time in Zulu format (&lt;code&gt;HH:mm:ss.SSSZ&lt;/code&gt;) - 24-hour format with milliseconds and Z timezone indicator. &lt;/br&gt; &lt;b&gt;Note&lt;/b&gt;: Despite the Z that is returned in the timestamp, the cut-off time is actually based on the default timezone of the eBay marketplace for the seller. &lt;/br&gt; &lt;b&gt;Note&lt;/b&gt;: If an eBay listing supports same-day shipping, and an order is paid for before the cut-off time, the seller is expected to ship the order out that same business day.
     */
    private String cutoffTime;
    /**
     * Instantiates a new {@link DispatchCutoffTimePreferencesType} and sets the default values.
     */
    public DispatchCutoffTimePreferencesType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DispatchCutoffTimePreferencesType}
     */
    @jakarta.annotation.Nonnull
    public static DispatchCutoffTimePreferencesType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DispatchCutoffTimePreferencesType();
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
     * Gets the cutoffTime property value. This field indicates the dispatch cut-off time in Zulu format (&lt;code&gt;HH:mm:ss.SSSZ&lt;/code&gt;) - 24-hour format with milliseconds and Z timezone indicator. &lt;/br&gt; &lt;b&gt;Note&lt;/b&gt;: Despite the Z that is returned in the timestamp, the cut-off time is actually based on the default timezone of the eBay marketplace for the seller. &lt;/br&gt; &lt;b&gt;Note&lt;/b&gt;: If an eBay listing supports same-day shipping, and an order is paid for before the cut-off time, the seller is expected to ship the order out that same business day.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCutoffTime() {
        return this.cutoffTime;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("cutoffTime", (n) -> { this.setCutoffTime(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cutoffTime", this.getCutoffTime());
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
     * Sets the cutoffTime property value. This field indicates the dispatch cut-off time in Zulu format (&lt;code&gt;HH:mm:ss.SSSZ&lt;/code&gt;) - 24-hour format with milliseconds and Z timezone indicator. &lt;/br&gt; &lt;b&gt;Note&lt;/b&gt;: Despite the Z that is returned in the timestamp, the cut-off time is actually based on the default timezone of the eBay marketplace for the seller. &lt;/br&gt; &lt;b&gt;Note&lt;/b&gt;: If an eBay listing supports same-day shipping, and an order is paid for before the cut-off time, the seller is expected to ship the order out that same business day.
     * @param value Value to set for the cutoffTime property.
     */
    public void setCutoffTime(@jakarta.annotation.Nullable final String value) {
        this.cutoffTime = value;
    }
}
