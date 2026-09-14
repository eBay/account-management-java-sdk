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
 * An enumeration type that defines the supported types of Custom Policies. | - **PRODUCT_COMPLIANCE**: This enumeration value indicates that the custom policy is a product compliance policy. - **TAKE_BACK**: This enumeration value indicates that the custom policy is a product takeback policy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CustomPolicyTypeEnum implements ValuedEnum {
    PRODUCT_COMPLIANCE("PRODUCT_COMPLIANCE"),
    TAKE_BACK("TAKE_BACK");
    public final String value;
    CustomPolicyTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CustomPolicyTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PRODUCT_COMPLIANCE": return PRODUCT_COMPLIANCE;
            case "TAKE_BACK": return TAKE_BACK;
            default: return null;
        }
    }
}
