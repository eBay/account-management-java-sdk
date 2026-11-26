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
 * This field defines whether the shipping cost model is &lt;code&gt;FLAT_RATE&lt;/code&gt; (the same rate for all buyers, or buyers within a region if shipping rate tables are used) or &lt;code&gt;CALCULATED&lt;/code&gt; (the shipping rate varies by the ship-to location and size and weight of the package). &lt;br&gt;&lt;br&gt;This field is conditionally required if any shipping service options are specified (domestic and/or international).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ShippingCostTypeEnum implements ValuedEnum {
    CALCULATED("CALCULATED"),
    FLAT_RATE("FLAT_RATE"),
    NOT_SPECIFIED("NOT_SPECIFIED");
    public final String value;
    ShippingCostTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ShippingCostTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CALCULATED": return CALCULATED;
            case "FLAT_RATE": return FLAT_RATE;
            case "NOT_SPECIFIED": return NOT_SPECIFIED;
            default: return null;
        }
    }
}
