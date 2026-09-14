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

package com.ebay.accountmanagement.generated.accountv2.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * This enum type defines the available options for handling combined payments when a seller allows multiple line items from the same buyer to be paid for with a single payment. See &lt;code&gt;CombinedPaymentOptionEnum&lt;/code&gt; for a description of each value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CombinedPaymentOptionEnum implements ValuedEnum {
    NO_COMBINED_PAYMENT("NO_COMBINED_PAYMENT"),
    DISCOUNT_SPECIFIED("DISCOUNT_SPECIFIED"),
    SPECIFY_DISCOUNT_LATER("SPECIFY_DISCOUNT_LATER");
    public final String value;
    CombinedPaymentOptionEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CombinedPaymentOptionEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NO_COMBINED_PAYMENT": return NO_COMBINED_PAYMENT;
            case "DISCOUNT_SPECIFIED": return DISCOUNT_SPECIFIED;
            case "SPECIFY_DISCOUNT_LATER": return SPECIFY_DISCOUNT_LATER;
            default: return null;
        }
    }
}
