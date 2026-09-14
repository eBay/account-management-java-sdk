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
 * This enumerated type defines who is responsible for the return shipping cost. Note that the seller is always responsible for the return shipping cost of SNAD-related returns. | - **BUYER**: Return shipping cost paid by BUYER. - **SELLER**: Return shipping cost paid by SELLER.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ReturnShippingCostPayerEnum implements ValuedEnum {
    BUYER("BUYER"),
    SELLER("SELLER");
    public final String value;
    ReturnShippingCostPayerEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ReturnShippingCostPayerEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "BUYER": return BUYER;
            case "SELLER": return SELLER;
            default: return null;
        }
    }
}
