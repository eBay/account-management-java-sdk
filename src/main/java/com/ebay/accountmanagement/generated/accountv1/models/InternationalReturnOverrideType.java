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
     * This field sets/indicates if the seller offers replacement items to the buyer in the case of an international return. The buyer must be willing to accept a replacement item; otherwise, the seller will need to issue a refund for a return. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:ReturnMethodEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String returnMethod;
    /**
     * A type used to specify a period of time using a specified time-measurement unit. Payment, return, and fulfillment business policies all use this type to specify time windows.&lt;br&gt;&lt;br&gt;Whenever a container that uses this type is used in a request, both of these fields are required. Similarly, whenever a container that uses this type is returned in a response, both of these fields are always returned.
     */
    private TimeDuration returnPeriod;
    /**
     * If set to &lt;code&gt;true&lt;/code&gt;, the seller accepts international returns. If set to &lt;code&gt;false&lt;/code&gt;, the seller does not accept international returns.  &lt;br&gt;&lt;br&gt;This field is conditionally required if the seller chooses to have a separate international return policy.
     */
    private Boolean returnsAccepted;
    /**
     * This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either &lt;code&gt;BUYER&lt;/code&gt; or &lt;code&gt;SELLER&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;Depending on the return policy and specifics of the return, either the buyer or the seller can be responsible for the return shipping costs. Note that the seller is always responsible for return shipping costs for &apos;significantly not as described&apos; (SNAD) issues.  &lt;br&gt;&lt;br&gt;This field is conditionally required if the &lt;b&gt;internationalOverride.returnsAccepted&lt;/b&gt; field is set to &lt;code&gt;true&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:ReturnShippingCostPayerEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String returnShippingCostPayer;
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
        deserializerMap.put("returnMethod", (n) -> { this.setReturnMethod(n.getStringValue()); });
        deserializerMap.put("returnPeriod", (n) -> { this.setReturnPeriod(n.getObjectValue(TimeDuration::createFromDiscriminatorValue)); });
        deserializerMap.put("returnsAccepted", (n) -> { this.setReturnsAccepted(n.getBooleanValue()); });
        deserializerMap.put("returnShippingCostPayer", (n) -> { this.setReturnShippingCostPayer(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the returnMethod property value. This field sets/indicates if the seller offers replacement items to the buyer in the case of an international return. The buyer must be willing to accept a replacement item; otherwise, the seller will need to issue a refund for a return. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:ReturnMethodEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReturnMethod() {
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
     * Gets the returnShippingCostPayer property value. This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either &lt;code&gt;BUYER&lt;/code&gt; or &lt;code&gt;SELLER&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;Depending on the return policy and specifics of the return, either the buyer or the seller can be responsible for the return shipping costs. Note that the seller is always responsible for return shipping costs for &apos;significantly not as described&apos; (SNAD) issues.  &lt;br&gt;&lt;br&gt;This field is conditionally required if the &lt;b&gt;internationalOverride.returnsAccepted&lt;/b&gt; field is set to &lt;code&gt;true&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:ReturnShippingCostPayerEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReturnShippingCostPayer() {
        return this.returnShippingCostPayer;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("returnMethod", this.getReturnMethod());
        writer.writeObjectValue("returnPeriod", this.getReturnPeriod());
        writer.writeBooleanValue("returnsAccepted", this.getReturnsAccepted());
        writer.writeStringValue("returnShippingCostPayer", this.getReturnShippingCostPayer());
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
     * Sets the returnMethod property value. This field sets/indicates if the seller offers replacement items to the buyer in the case of an international return. The buyer must be willing to accept a replacement item; otherwise, the seller will need to issue a refund for a return. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:ReturnMethodEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the returnMethod property.
     */
    public void setReturnMethod(@jakarta.annotation.Nullable final String value) {
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
     * Sets the returnShippingCostPayer property value. This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either &lt;code&gt;BUYER&lt;/code&gt; or &lt;code&gt;SELLER&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;Depending on the return policy and specifics of the return, either the buyer or the seller can be responsible for the return shipping costs. Note that the seller is always responsible for return shipping costs for &apos;significantly not as described&apos; (SNAD) issues.  &lt;br&gt;&lt;br&gt;This field is conditionally required if the &lt;b&gt;internationalOverride.returnsAccepted&lt;/b&gt; field is set to &lt;code&gt;true&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:ReturnShippingCostPayerEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the returnShippingCostPayer property.
     */
    public void setReturnShippingCostPayer(@jakarta.annotation.Nullable final String value) {
        this.returnShippingCostPayer = value;
    }
}
