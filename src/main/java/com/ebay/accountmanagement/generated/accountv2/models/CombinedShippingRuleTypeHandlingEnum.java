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
 * This enumeration value specifies the type of combined-shipping rule applied to handling fees (for example, weight-based, flat-rate, or percentage-based calculation method). 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CombinedShippingRuleTypeHandlingEnum implements ValuedEnum {
    COMBINED_HANDLING_FEE("COMBINED_HANDLING_FEE"),
    EACH_ADDITIONAL_AMOUNT("EACH_ADDITIONAL_AMOUNT"),
    EACH_ADDITIONAL_AMOUNT_OFF("EACH_ADDITIONAL_AMOUNT_OFF"),
    EACH_ADDITIONAL_PERCENT_OFF("EACH_ADDITIONAL_PERCENT_OFF"),
    INDIVIDUAL_HANDLING_FEE("INDIVIDUAL_HANDLING_FEE");
    public final String value;
    CombinedShippingRuleTypeHandlingEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CombinedShippingRuleTypeHandlingEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "COMBINED_HANDLING_FEE": return COMBINED_HANDLING_FEE;
            case "EACH_ADDITIONAL_AMOUNT": return EACH_ADDITIONAL_AMOUNT;
            case "EACH_ADDITIONAL_AMOUNT_OFF": return EACH_ADDITIONAL_AMOUNT_OFF;
            case "EACH_ADDITIONAL_PERCENT_OFF": return EACH_ADDITIONAL_PERCENT_OFF;
            case "INDIVIDUAL_HANDLING_FEE": return INDIVIDUAL_HANDLING_FEE;
            default: return null;
        }
    }
}
