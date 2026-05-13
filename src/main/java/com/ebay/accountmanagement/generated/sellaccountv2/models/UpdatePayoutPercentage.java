package com.ebay.accountmanagement.generated.sellaccountv2.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type allows the user to change the payout percentages for two active payment instruments.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdatePayoutPercentage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique reference identifier for a payout instrument. This value is returned in the &lt;a href=&quot;/api-docs/sell/account/v2/resources/payout_settings/methods/getPayoutSettings&quot; target=&quot;_blank &quot;&gt;getPayoutSettings&lt;/a&gt; response and is needed to change split-payout percentages through an &lt;b&gt;updatePayoutPercentage&lt;/b&gt; request.
     */
    private String instrumentId;
    /**
     * The user-defined payout percentage allocated to this instrument. For example, &lt;code&gt;50&lt;/code&gt; indicates that 50% of the payout goes to this instrument.&lt;br/&gt;&lt;br/&gt;The split-payout percentage &lt;b&gt;must&lt;/b&gt; be a positive integer value from 0-100. The values of two instruments &lt;b&gt;must&lt;/b&gt; always add up to 100%. If the values do not equal 100, the call will fail.
     */
    private String payoutPercentage;
    /**
     * Instantiates a new {@link UpdatePayoutPercentage} and sets the default values.
     */
    public UpdatePayoutPercentage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdatePayoutPercentage}
     */
    @jakarta.annotation.Nonnull
    public static UpdatePayoutPercentage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdatePayoutPercentage();
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
        deserializerMap.put("instrumentId", (n) -> { this.setInstrumentId(n.getStringValue()); });
        deserializerMap.put("payoutPercentage", (n) -> { this.setPayoutPercentage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the instrumentId property value. The unique reference identifier for a payout instrument. This value is returned in the &lt;a href=&quot;/api-docs/sell/account/v2/resources/payout_settings/methods/getPayoutSettings&quot; target=&quot;_blank &quot;&gt;getPayoutSettings&lt;/a&gt; response and is needed to change split-payout percentages through an &lt;b&gt;updatePayoutPercentage&lt;/b&gt; request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInstrumentId() {
        return this.instrumentId;
    }
    /**
     * Gets the payoutPercentage property value. The user-defined payout percentage allocated to this instrument. For example, &lt;code&gt;50&lt;/code&gt; indicates that 50% of the payout goes to this instrument.&lt;br/&gt;&lt;br/&gt;The split-payout percentage &lt;b&gt;must&lt;/b&gt; be a positive integer value from 0-100. The values of two instruments &lt;b&gt;must&lt;/b&gt; always add up to 100%. If the values do not equal 100, the call will fail.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPayoutPercentage() {
        return this.payoutPercentage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("instrumentId", this.getInstrumentId());
        writer.writeStringValue("payoutPercentage", this.getPayoutPercentage());
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
     * Sets the instrumentId property value. The unique reference identifier for a payout instrument. This value is returned in the &lt;a href=&quot;/api-docs/sell/account/v2/resources/payout_settings/methods/getPayoutSettings&quot; target=&quot;_blank &quot;&gt;getPayoutSettings&lt;/a&gt; response and is needed to change split-payout percentages through an &lt;b&gt;updatePayoutPercentage&lt;/b&gt; request.
     * @param value Value to set for the instrumentId property.
     */
    public void setInstrumentId(@jakarta.annotation.Nullable final String value) {
        this.instrumentId = value;
    }
    /**
     * Sets the payoutPercentage property value. The user-defined payout percentage allocated to this instrument. For example, &lt;code&gt;50&lt;/code&gt; indicates that 50% of the payout goes to this instrument.&lt;br/&gt;&lt;br/&gt;The split-payout percentage &lt;b&gt;must&lt;/b&gt; be a positive integer value from 0-100. The values of two instruments &lt;b&gt;must&lt;/b&gt; always add up to 100%. If the values do not equal 100, the call will fail.
     * @param value Value to set for the payoutPercentage property.
     */
    public void setPayoutPercentage(@jakarta.annotation.Nullable final String value) {
        this.payoutPercentage = value;
    }
}
