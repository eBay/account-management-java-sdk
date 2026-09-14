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
 * A type that is used to provide the seller&apos;s eligibility status for an eBay advertising program.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SellerEligibilityResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The eBay advertising program for which a seller may be eligible. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/plser:AdvertisingProgramEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String programType;
    /**
     * The reason why a seller is ineligible for the specified eBay advertising program.&lt;br /&gt;&lt;br /&gt;This field is only returned if the seller is ineligible for the eBay advertising program. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/plser:SellerIneligibleReasonEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String reason;
    /**
     * The seller eligibility status for the specified eBay advertising program. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/cmlib:SellerEligibilityEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String status;
    /**
     * Instantiates a new {@link SellerEligibilityResponse} and sets the default values.
     */
    public SellerEligibilityResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SellerEligibilityResponse}
     */
    @jakarta.annotation.Nonnull
    public static SellerEligibilityResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SellerEligibilityResponse();
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
        deserializerMap.put("programType", (n) -> { this.setProgramType(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the programType property value. The eBay advertising program for which a seller may be eligible. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/plser:AdvertisingProgramEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProgramType() {
        return this.programType;
    }
    /**
     * Gets the reason property value. The reason why a seller is ineligible for the specified eBay advertising program.&lt;br /&gt;&lt;br /&gt;This field is only returned if the seller is ineligible for the eBay advertising program. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/plser:SellerIneligibleReasonEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Gets the status property value. The seller eligibility status for the specified eBay advertising program. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/cmlib:SellerEligibilityEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("programType", this.getProgramType());
        writer.writeStringValue("reason", this.getReason());
        writer.writeStringValue("status", this.getStatus());
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
     * Sets the programType property value. The eBay advertising program for which a seller may be eligible. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/plser:AdvertisingProgramEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the programType property.
     */
    public void setProgramType(@jakarta.annotation.Nullable final String value) {
        this.programType = value;
    }
    /**
     * Sets the reason property value. The reason why a seller is ineligible for the specified eBay advertising program.&lt;br /&gt;&lt;br /&gt;This field is only returned if the seller is ineligible for the eBay advertising program. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/plser:SellerIneligibleReasonEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.reason = value;
    }
    /**
     * Sets the status property value. The seller eligibility status for the specified eBay advertising program. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/cmlib:SellerEligibilityEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
}
