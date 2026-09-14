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
 * This enumerated type defines the reason why a seller is ineligible for an eBay advertising program. | - **NOT_ENOUGH_ACTIVITY**: This value indicates that the seller is ineligible for the eBay advertising program due to lack of activity.&lt;br&gt;&lt;br&gt;New accounts take a few weeks to become eligible for eBay Promoted Listings. If the seller account is in good standing (Above Standard or Top Rated), the account should become eligible within a few weeks. - **NOT_IN_GOOD_STANDING**: This value indicates that the seller is ineligible for the eBay advertising program because their account is not currently in good standing.&lt;br&gt;&lt;br&gt;Below Standard sellers cannot use eBay advertising programs to create new campaigns or edit their existing campaigns. Existing campaigns will be paused by the system. - **RESTRICTED**: This value indicates that the seller is currently restricted from using the corresponding eBay advertising program.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SellerIneligibleReasonEnum implements ValuedEnum {
    NOT_ENOUGH_ACTIVITY("NOT_ENOUGH_ACTIVITY"),
    NOT_IN_GOOD_STANDING("NOT_IN_GOOD_STANDING"),
    RESTRICTED("RESTRICTED");
    public final String value;
    SellerIneligibleReasonEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SellerIneligibleReasonEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NOT_ENOUGH_ACTIVITY": return NOT_ENOUGH_ACTIVITY;
            case "NOT_IN_GOOD_STANDING": return NOT_IN_GOOD_STANDING;
            case "RESTRICTED": return RESTRICTED;
            default: return null;
        }
    }
}
