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
 * This enumeration value indicates the status of the present onboarding step. | - **NOT_STARTED**: This enumeration value indicates that the present step has not started. - **IN_PROGRESS**: This enumeration value indicates that the present step has started but has not completed. - **COMPLETED**: This enumeration value indicates that the present step has completed.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PaymentsProgramOnboardingStepStatus implements ValuedEnum {
    NOT_STARTED("NOT_STARTED"),
    IN_PROGRESS("IN_PROGRESS"),
    COMPLETED("COMPLETED");
    public final String value;
    PaymentsProgramOnboardingStepStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PaymentsProgramOnboardingStepStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NOT_STARTED": return NOT_STARTED;
            case "IN_PROGRESS": return IN_PROGRESS;
            case "COMPLETED": return COMPLETED;
            default: return null;
        }
    }
}
