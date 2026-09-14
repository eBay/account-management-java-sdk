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
 * Type used by the payments program onboarding response
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentsProgramOnboardingResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This enumeration value indicates the eligibility of payment onboarding for the registered site. | - **ELIGIBLE_TO_ONBOARD**: This enumeration value indicates that the seller can start or continue the onboarding process. When starting the onboarding process, the first step in the registration process is returned in the steps array with a &lt;strong&gt;status&lt;/strong&gt; of &lt;code&gt;NOT_STARTED&lt;code&gt;. A link in the webUrl field opens a page for the seller to complete the first step. When the seller has completed all steps, the payments capability becomes available to the seller. - **NOT_ELIGIBLE**: This enumeration value indicates that the seller&apos;s marketplace supports eBay managed payments, but the seller is not yet eligible. Eligibility is determined by eBay daily. Check onboardingStatus regularly. - **PREBOARDED**: This enumeration value indicates that the seller has completed all the necessary onboarding steps for eBay managed payments. The seller must wait for eBay to activate eBay managed payments for their account. - **ONBOARDED**: This enumeration value indicates that the seller is fully onboarded and that eBay managed payments has been activated on the seller&apos;s account.
     */
    private PaymentsProgramOnboardingStatus onboardingStatus;
    /**
     * An array of the active process steps for payment onboarding and the status of each step. This array includes the step &lt;strong&gt;name&lt;/strong&gt;, step &lt;strong&gt;status&lt;/strong&gt;, and a &lt;strong&gt;webUrl&lt;/strong&gt; to the &lt;code&gt;IN_PROGRESS&lt;/code&gt; step. The step names are returned in sequential order. 
     */
    private java.util.List<PaymentsProgramOnboardingSteps> steps;
    /**
     * Instantiates a new {@link PaymentsProgramOnboardingResponse} and sets the default values.
     */
    public PaymentsProgramOnboardingResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PaymentsProgramOnboardingResponse}
     */
    @jakarta.annotation.Nonnull
    public static PaymentsProgramOnboardingResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaymentsProgramOnboardingResponse();
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
        deserializerMap.put("onboardingStatus", (n) -> { this.setOnboardingStatus(n.getEnumValue(PaymentsProgramOnboardingStatus::forValue)); });
        deserializerMap.put("steps", (n) -> { this.setSteps(n.getCollectionOfObjectValues(PaymentsProgramOnboardingSteps::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the onboardingStatus property value. This enumeration value indicates the eligibility of payment onboarding for the registered site. | - **ELIGIBLE_TO_ONBOARD**: This enumeration value indicates that the seller can start or continue the onboarding process. When starting the onboarding process, the first step in the registration process is returned in the steps array with a &lt;strong&gt;status&lt;/strong&gt; of &lt;code&gt;NOT_STARTED&lt;code&gt;. A link in the webUrl field opens a page for the seller to complete the first step. When the seller has completed all steps, the payments capability becomes available to the seller. - **NOT_ELIGIBLE**: This enumeration value indicates that the seller&apos;s marketplace supports eBay managed payments, but the seller is not yet eligible. Eligibility is determined by eBay daily. Check onboardingStatus regularly. - **PREBOARDED**: This enumeration value indicates that the seller has completed all the necessary onboarding steps for eBay managed payments. The seller must wait for eBay to activate eBay managed payments for their account. - **ONBOARDED**: This enumeration value indicates that the seller is fully onboarded and that eBay managed payments has been activated on the seller&apos;s account.
     * @return a {@link PaymentsProgramOnboardingStatus}
     */
    @jakarta.annotation.Nullable
    public PaymentsProgramOnboardingStatus getOnboardingStatus() {
        return this.onboardingStatus;
    }
    /**
     * Gets the steps property value. An array of the active process steps for payment onboarding and the status of each step. This array includes the step &lt;strong&gt;name&lt;/strong&gt;, step &lt;strong&gt;status&lt;/strong&gt;, and a &lt;strong&gt;webUrl&lt;/strong&gt; to the &lt;code&gt;IN_PROGRESS&lt;/code&gt; step. The step names are returned in sequential order. 
     * @return a {@link java.util.List<PaymentsProgramOnboardingSteps>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PaymentsProgramOnboardingSteps> getSteps() {
        return this.steps;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("onboardingStatus", this.getOnboardingStatus());
        writer.writeCollectionOfObjectValues("steps", this.getSteps());
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
     * Sets the onboardingStatus property value. This enumeration value indicates the eligibility of payment onboarding for the registered site. | - **ELIGIBLE_TO_ONBOARD**: This enumeration value indicates that the seller can start or continue the onboarding process. When starting the onboarding process, the first step in the registration process is returned in the steps array with a &lt;strong&gt;status&lt;/strong&gt; of &lt;code&gt;NOT_STARTED&lt;code&gt;. A link in the webUrl field opens a page for the seller to complete the first step. When the seller has completed all steps, the payments capability becomes available to the seller. - **NOT_ELIGIBLE**: This enumeration value indicates that the seller&apos;s marketplace supports eBay managed payments, but the seller is not yet eligible. Eligibility is determined by eBay daily. Check onboardingStatus regularly. - **PREBOARDED**: This enumeration value indicates that the seller has completed all the necessary onboarding steps for eBay managed payments. The seller must wait for eBay to activate eBay managed payments for their account. - **ONBOARDED**: This enumeration value indicates that the seller is fully onboarded and that eBay managed payments has been activated on the seller&apos;s account.
     * @param value Value to set for the onboardingStatus property.
     */
    public void setOnboardingStatus(@jakarta.annotation.Nullable final PaymentsProgramOnboardingStatus value) {
        this.onboardingStatus = value;
    }
    /**
     * Sets the steps property value. An array of the active process steps for payment onboarding and the status of each step. This array includes the step &lt;strong&gt;name&lt;/strong&gt;, step &lt;strong&gt;status&lt;/strong&gt;, and a &lt;strong&gt;webUrl&lt;/strong&gt; to the &lt;code&gt;IN_PROGRESS&lt;/code&gt; step. The step names are returned in sequential order. 
     * @param value Value to set for the steps property.
     */
    public void setSteps(@jakarta.annotation.Nullable final java.util.List<PaymentsProgramOnboardingSteps> value) {
        this.steps = value;
    }
}
