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

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * This enumeration value indicates the eligibility of payment onboarding for the registered site. | - **ELIGIBLE_TO_ONBOARD**: This enumeration value indicates that the seller can start or continue the onboarding process. When starting the onboarding process, the first step in the registration process is returned in the steps array with a &lt;strong&gt;status&lt;/strong&gt; of &lt;code&gt;NOT_STARTED&lt;code&gt;. A link in the webUrl field opens a page for the seller to complete the first step. When the seller has completed all steps, the payments capability becomes available to the seller. - **NOT_ELIGIBLE**: This enumeration value indicates that the seller&apos;s marketplace supports eBay managed payments, but the seller is not yet eligible. Eligibility is determined by eBay daily. Check onboardingStatus regularly. - **PREBOARDED**: This enumeration value indicates that the seller has completed all the necessary onboarding steps for eBay managed payments. The seller must wait for eBay to activate eBay managed payments for their account. - **ONBOARDED**: This enumeration value indicates that the seller is fully onboarded and that eBay managed payments has been activated on the seller&apos;s account.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PaymentsProgramOnboardingStatus implements ValuedEnum {
    ELIGIBLE_TO_ONBOARD("ELIGIBLE_TO_ONBOARD"),
    NOT_ELIGIBLE("NOT_ELIGIBLE"),
    PREBOARDED("PREBOARDED"),
    ONBOARDED("ONBOARDED");
    public final String value;
    PaymentsProgramOnboardingStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PaymentsProgramOnboardingStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ELIGIBLE_TO_ONBOARD": return ELIGIBLE_TO_ONBOARD;
            case "NOT_ELIGIBLE": return NOT_ELIGIBLE;
            case "PREBOARDED": return PREBOARDED;
            case "ONBOARDED": return ONBOARDED;
            default: return null;
        }
    }
}
