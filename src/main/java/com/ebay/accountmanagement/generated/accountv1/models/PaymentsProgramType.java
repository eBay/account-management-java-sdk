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
 * This enumerated type defines the supported payment programs. | - **EBAY_PAYMENTS**: This value indicates the eBay-managed payments program.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PaymentsProgramType implements ValuedEnum {
    EBAY_PAYMENTS("EBAY_PAYMENTS");
    public final String value;
    PaymentsProgramType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PaymentsProgramType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "EBAY_PAYMENTS": return EBAY_PAYMENTS;
            default: return null;
        }
    }
}
