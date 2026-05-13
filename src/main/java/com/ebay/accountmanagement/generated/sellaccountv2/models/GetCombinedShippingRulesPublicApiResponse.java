package com.ebay.accountmanagement.generated.sellaccountv2.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The base response type of the getCombinedShippingRules method. &lt;br&gt;&lt;br&gt;All of a seller&apos;s calculated, flat, and promotional shipping discount rules defined for an eBay marketplace will be returned in the response, along with the current combined duration value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetCombinedShippingRulesPublicApiResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type defines the structure for calculated handling fee discounts applicable when combining multiple orders.
     */
    private CalculatedHandlingRuleType calculatedHandlingRule;
    /**
     * This type describes calculated discount rules determining total shipping cost reductions for combined items.
     */
    private CalculatedShippingRuleType calculatedShippingRule;
    /**
     * This field is represented by one of the values in the CombinedPaymentPeriodEnum type. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:CombinedPaymentPeriodEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String combinedDuration;
    /**
     * This type defines the flat-rate combined-shipping rule, which applies a fixed shipping cost for multiple items shipped together.
     */
    private FlatShippingRuleType flatShippingRule;
    /**
     * This type is used to represent a promotional shipping rule set up by the seller on an eBay marketplace.
     */
    private PromotionalShippingRuleType promotionalShippingRule;
    /**
     * Instantiates a new {@link GetCombinedShippingRulesPublicApiResponse} and sets the default values.
     */
    public GetCombinedShippingRulesPublicApiResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetCombinedShippingRulesPublicApiResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetCombinedShippingRulesPublicApiResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetCombinedShippingRulesPublicApiResponse();
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
     * Gets the calculatedHandlingRule property value. This type defines the structure for calculated handling fee discounts applicable when combining multiple orders.
     * @return a {@link CalculatedHandlingRuleType}
     */
    @jakarta.annotation.Nullable
    public CalculatedHandlingRuleType getCalculatedHandlingRule() {
        return this.calculatedHandlingRule;
    }
    /**
     * Gets the calculatedShippingRule property value. This type describes calculated discount rules determining total shipping cost reductions for combined items.
     * @return a {@link CalculatedShippingRuleType}
     */
    @jakarta.annotation.Nullable
    public CalculatedShippingRuleType getCalculatedShippingRule() {
        return this.calculatedShippingRule;
    }
    /**
     * Gets the combinedDuration property value. This field is represented by one of the values in the CombinedPaymentPeriodEnum type. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:CombinedPaymentPeriodEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCombinedDuration() {
        return this.combinedDuration;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("calculatedHandlingRule", (n) -> { this.setCalculatedHandlingRule(n.getObjectValue(CalculatedHandlingRuleType::createFromDiscriminatorValue)); });
        deserializerMap.put("calculatedShippingRule", (n) -> { this.setCalculatedShippingRule(n.getObjectValue(CalculatedShippingRuleType::createFromDiscriminatorValue)); });
        deserializerMap.put("combinedDuration", (n) -> { this.setCombinedDuration(n.getStringValue()); });
        deserializerMap.put("flatShippingRule", (n) -> { this.setFlatShippingRule(n.getObjectValue(FlatShippingRuleType::createFromDiscriminatorValue)); });
        deserializerMap.put("promotionalShippingRule", (n) -> { this.setPromotionalShippingRule(n.getObjectValue(PromotionalShippingRuleType::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the flatShippingRule property value. This type defines the flat-rate combined-shipping rule, which applies a fixed shipping cost for multiple items shipped together.
     * @return a {@link FlatShippingRuleType}
     */
    @jakarta.annotation.Nullable
    public FlatShippingRuleType getFlatShippingRule() {
        return this.flatShippingRule;
    }
    /**
     * Gets the promotionalShippingRule property value. This type is used to represent a promotional shipping rule set up by the seller on an eBay marketplace.
     * @return a {@link PromotionalShippingRuleType}
     */
    @jakarta.annotation.Nullable
    public PromotionalShippingRuleType getPromotionalShippingRule() {
        return this.promotionalShippingRule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("calculatedHandlingRule", this.getCalculatedHandlingRule());
        writer.writeObjectValue("calculatedShippingRule", this.getCalculatedShippingRule());
        writer.writeStringValue("combinedDuration", this.getCombinedDuration());
        writer.writeObjectValue("flatShippingRule", this.getFlatShippingRule());
        writer.writeObjectValue("promotionalShippingRule", this.getPromotionalShippingRule());
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
     * Sets the calculatedHandlingRule property value. This type defines the structure for calculated handling fee discounts applicable when combining multiple orders.
     * @param value Value to set for the calculatedHandlingRule property.
     */
    public void setCalculatedHandlingRule(@jakarta.annotation.Nullable final CalculatedHandlingRuleType value) {
        this.calculatedHandlingRule = value;
    }
    /**
     * Sets the calculatedShippingRule property value. This type describes calculated discount rules determining total shipping cost reductions for combined items.
     * @param value Value to set for the calculatedShippingRule property.
     */
    public void setCalculatedShippingRule(@jakarta.annotation.Nullable final CalculatedShippingRuleType value) {
        this.calculatedShippingRule = value;
    }
    /**
     * Sets the combinedDuration property value. This field is represented by one of the values in the CombinedPaymentPeriodEnum type. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:CombinedPaymentPeriodEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the combinedDuration property.
     */
    public void setCombinedDuration(@jakarta.annotation.Nullable final String value) {
        this.combinedDuration = value;
    }
    /**
     * Sets the flatShippingRule property value. This type defines the flat-rate combined-shipping rule, which applies a fixed shipping cost for multiple items shipped together.
     * @param value Value to set for the flatShippingRule property.
     */
    public void setFlatShippingRule(@jakarta.annotation.Nullable final FlatShippingRuleType value) {
        this.flatShippingRule = value;
    }
    /**
     * Sets the promotionalShippingRule property value. This type is used to represent a promotional shipping rule set up by the seller on an eBay marketplace.
     * @param value Value to set for the promotionalShippingRule property.
     */
    public void setPromotionalShippingRule(@jakarta.annotation.Nullable final PromotionalShippingRuleType value) {
        this.promotionalShippingRule = value;
    }
}
