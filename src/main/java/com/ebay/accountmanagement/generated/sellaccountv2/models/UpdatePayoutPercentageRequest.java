package com.ebay.accountmanagement.generated.sellaccountv2.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the request payload of the &lt;b&gt;updatePayoutPercentage&lt;/b&gt; method to allow a seller to configure the split-payout percentages for two payout instruments.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdatePayoutPercentageRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array allows the seller to set the payout split percentages for two accounts enabled to receive payouts.
     */
    private java.util.List<UpdatePayoutPercentage> payoutInstruments;
    /**
     * Instantiates a new {@link UpdatePayoutPercentageRequest} and sets the default values.
     */
    public UpdatePayoutPercentageRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdatePayoutPercentageRequest}
     */
    @jakarta.annotation.Nonnull
    public static UpdatePayoutPercentageRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdatePayoutPercentageRequest();
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
        deserializerMap.put("payoutInstruments", (n) -> { this.setPayoutInstruments(n.getCollectionOfObjectValues(UpdatePayoutPercentage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the payoutInstruments property value. This array allows the seller to set the payout split percentages for two accounts enabled to receive payouts.
     * @return a {@link java.util.List<UpdatePayoutPercentage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UpdatePayoutPercentage> getPayoutInstruments() {
        return this.payoutInstruments;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("payoutInstruments", this.getPayoutInstruments());
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
     * Sets the payoutInstruments property value. This array allows the seller to set the payout split percentages for two accounts enabled to receive payouts.
     * @param value Value to set for the payoutInstruments property.
     */
    public void setPayoutInstruments(@jakarta.annotation.Nullable final java.util.List<UpdatePayoutPercentage> value) {
        this.payoutInstruments = value;
    }
}
