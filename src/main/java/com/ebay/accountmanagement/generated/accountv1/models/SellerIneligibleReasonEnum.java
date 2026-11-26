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
 * The reason why a seller is ineligible for the specified eBay advertising program.&lt;br /&gt;&lt;br /&gt;This field is only returned if the seller is ineligible for the eBay advertising program.
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
