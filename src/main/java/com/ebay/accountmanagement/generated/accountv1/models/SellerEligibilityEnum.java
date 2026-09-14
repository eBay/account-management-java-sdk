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
 * This enumerated type defines the seller eligibility status for a specified eBay advertising program. | - **ELIGIBLE**: This value indicates that the seller is eligible for the specified eBay advertising program. - **INELIGIBLE**: This value indicates that the seller is ineligible for the specified eBay advertising program.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SellerEligibilityEnum implements ValuedEnum {
    ELIGIBLE("ELIGIBLE"),
    INELIGIBLE("INELIGIBLE");
    public final String value;
    SellerEligibilityEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SellerEligibilityEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ELIGIBLE": return ELIGIBLE;
            case "INELIGIBLE": return INELIGIBLE;
            default: return null;
        }
    }
}
