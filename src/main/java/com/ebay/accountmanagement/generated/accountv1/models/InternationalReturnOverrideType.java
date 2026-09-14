// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.accountmanagement.generated.accountv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the fields for a seller&apos;s international return policy. Sellers have the ability to set separate domestic and international return policies, but if an international return policy is not set, the same return policy settings specified for the domestic return policy are also used for returns for international buyers. 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InternationalReturnOverrideType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This enumerated type lists the return options (other than &apos;money back&apos;) that a seller may offer to the buyer for a return request. | - **EXCHANGE**: &lt;strong&gt;Do not use/No longer supported.&lt;/strong&gt; - **REPLACEMENT**: This value indicates that the seller offers a replacement (identical) item as an alternative to &apos;money back&apos; when the buyer is returning an item.
     */
    private ReturnMethodEnum returnMethod;
    /**
     * A type used to specify a period of time using a specified time-measurement unit. Payment, return, and fulfillment business policies all use this type to specify time windows.&lt;br&gt;&lt;br&gt;Whenever a container that uses this type is used in a request, both of these fields are required. Similarly, whenever a container that uses this type is returned in a response, both of these fields are always returned.
     */
    private TimeDuration returnPeriod;
    /**
     * If set to &lt;code&gt;true&lt;/code&gt;, the seller accepts international returns. If set to &lt;code&gt;false&lt;/code&gt;, the seller does not accept international returns.  &lt;br&gt;&lt;br&gt;This field is conditionally required if the seller chooses to have a separate international return policy.
     */
    private Boolean returnsAccepted;
    /**
     * This enumerated type defines who is responsible for the return shipping cost. Note that the seller is always responsible for the return shipping cost of SNAD-related returns. | - **BUYER**: Return shipping cost paid by BUYER. - **SELLER**: Return shipping cost paid by SELLER.
     */
    private ReturnShippingCostPayerEnum returnShippingCostPayer;
    /**
     * Instantiates a new {@link InternationalReturnOverrideType} and sets the default values.
     */
    public InternationalReturnOverrideType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InternationalReturnOverrideType}
     */
    @jakarta.annotation.Nonnull
    public static InternationalReturnOverrideType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InternationalReturnOverrideType();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("returnMethod", (n) -> { this.setReturnMethod(n.getEnumValue(ReturnMethodEnum::forValue)); });
        deserializerMap.put("returnPeriod", (n) -> { this.setReturnPeriod(n.getObjectValue(TimeDuration::createFromDiscriminatorValue)); });
        deserializerMap.put("returnsAccepted", (n) -> { this.setReturnsAccepted(n.getBooleanValue()); });
        deserializerMap.put("returnShippingCostPayer", (n) -> { this.setReturnShippingCostPayer(n.getEnumValue(ReturnShippingCostPayerEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the returnMethod property value. This enumerated type lists the return options (other than &apos;money back&apos;) that a seller may offer to the buyer for a return request. | - **EXCHANGE**: &lt;strong&gt;Do not use/No longer supported.&lt;/strong&gt; - **REPLACEMENT**: This value indicates that the seller offers a replacement (identical) item as an alternative to &apos;money back&apos; when the buyer is returning an item.
     * @return a {@link ReturnMethodEnum}
     */
    @jakarta.annotation.Nullable
    public ReturnMethodEnum getReturnMethod() {
        return this.returnMethod;
    }
    /**
     * Gets the returnPeriod property value. A type used to specify a period of time using a specified time-measurement unit. Payment, return, and fulfillment business policies all use this type to specify time windows.&lt;br&gt;&lt;br&gt;Whenever a container that uses this type is used in a request, both of these fields are required. Similarly, whenever a container that uses this type is returned in a response, both of these fields are always returned.
     * @return a {@link TimeDuration}
     */
    @jakarta.annotation.Nullable
    public TimeDuration getReturnPeriod() {
        return this.returnPeriod;
    }
    /**
     * Gets the returnsAccepted property value. If set to &lt;code&gt;true&lt;/code&gt;, the seller accepts international returns. If set to &lt;code&gt;false&lt;/code&gt;, the seller does not accept international returns.  &lt;br&gt;&lt;br&gt;This field is conditionally required if the seller chooses to have a separate international return policy.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getReturnsAccepted() {
        return this.returnsAccepted;
    }
    /**
     * Gets the returnShippingCostPayer property value. This enumerated type defines who is responsible for the return shipping cost. Note that the seller is always responsible for the return shipping cost of SNAD-related returns. | - **BUYER**: Return shipping cost paid by BUYER. - **SELLER**: Return shipping cost paid by SELLER.
     * @return a {@link ReturnShippingCostPayerEnum}
     */
    @jakarta.annotation.Nullable
    public ReturnShippingCostPayerEnum getReturnShippingCostPayer() {
        return this.returnShippingCostPayer;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("returnMethod", this.getReturnMethod());
        writer.writeObjectValue("returnPeriod", this.getReturnPeriod());
        writer.writeBooleanValue("returnsAccepted", this.getReturnsAccepted());
        writer.writeEnumValue("returnShippingCostPayer", this.getReturnShippingCostPayer());
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
     * Sets the returnMethod property value. This enumerated type lists the return options (other than &apos;money back&apos;) that a seller may offer to the buyer for a return request. | - **EXCHANGE**: &lt;strong&gt;Do not use/No longer supported.&lt;/strong&gt; - **REPLACEMENT**: This value indicates that the seller offers a replacement (identical) item as an alternative to &apos;money back&apos; when the buyer is returning an item.
     * @param value Value to set for the returnMethod property.
     */
    public void setReturnMethod(@jakarta.annotation.Nullable final ReturnMethodEnum value) {
        this.returnMethod = value;
    }
    /**
     * Sets the returnPeriod property value. A type used to specify a period of time using a specified time-measurement unit. Payment, return, and fulfillment business policies all use this type to specify time windows.&lt;br&gt;&lt;br&gt;Whenever a container that uses this type is used in a request, both of these fields are required. Similarly, whenever a container that uses this type is returned in a response, both of these fields are always returned.
     * @param value Value to set for the returnPeriod property.
     */
    public void setReturnPeriod(@jakarta.annotation.Nullable final TimeDuration value) {
        this.returnPeriod = value;
    }
    /**
     * Sets the returnsAccepted property value. If set to &lt;code&gt;true&lt;/code&gt;, the seller accepts international returns. If set to &lt;code&gt;false&lt;/code&gt;, the seller does not accept international returns.  &lt;br&gt;&lt;br&gt;This field is conditionally required if the seller chooses to have a separate international return policy.
     * @param value Value to set for the returnsAccepted property.
     */
    public void setReturnsAccepted(@jakarta.annotation.Nullable final Boolean value) {
        this.returnsAccepted = value;
    }
    /**
     * Sets the returnShippingCostPayer property value. This enumerated type defines who is responsible for the return shipping cost. Note that the seller is always responsible for the return shipping cost of SNAD-related returns. | - **BUYER**: Return shipping cost paid by BUYER. - **SELLER**: Return shipping cost paid by SELLER.
     * @param value Value to set for the returnShippingCostPayer property.
     */
    public void setReturnShippingCostPayer(@jakarta.annotation.Nullable final ReturnShippingCostPayerEnum value) {
        this.returnShippingCostPayer = value;
    }
}
