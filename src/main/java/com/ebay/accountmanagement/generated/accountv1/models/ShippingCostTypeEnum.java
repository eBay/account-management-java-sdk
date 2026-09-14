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
 * This enumerated type defines the shipping cost models. | - **CALCULATED**: This value indicates that calculated shipping is used by the seller. With calculated shipping, the shipping cost varies according to the shipping location and the size and weight of the package. - **FLAT_RATE**: This value indicates that flat-rate shipping is used by the seller. With flat-rate shipping, the shipping cost will be the same for all buyers, or buyers within a specified region if the seller uses shipping rate tables. - **NOT_SPECIFIED**: This value indicates that the shipping cost type has not been specified.
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
