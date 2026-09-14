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
 * This container defines the type of combined-shipping rule applied to calculate discounts, such as weight-based, percentage-based, or flat-rate models.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CombinedShippingRuleTypeEnum implements ValuedEnum {
    COMBINED_ITEM_WEIGHT("COMBINED_ITEM_WEIGHT"),
    EACH_ADDITIONAL_AMOUNT("EACH_ADDITIONAL_AMOUNT"),
    EACH_ADDITIONAL_AMOUNT_OFF("EACH_ADDITIONAL_AMOUNT_OFF"),
    EACH_ADDITIONAL_PERCENT_OFF("EACH_ADDITIONAL_PERCENT_OFF"),
    INDIVIDUAL_ITEM_WEIGHT("INDIVIDUAL_ITEM_WEIGHT"),
    MAXIMUM_SHIPPING_COST_PER_ORDER("MAXIMUM_SHIPPING_COST_PER_ORDER"),
    SHIPPING_COST_X_FOR_AMOUNT_Y("SHIPPING_COST_X_FOR_AMOUNT_Y"),
    SHIPPING_COST_X_FOR_ITEM_COUNT_N("SHIPPING_COST_X_FOR_ITEM_COUNT_N"),
    WEIGHT_OFF("WEIGHT_OFF");
    public final String value;
    CombinedShippingRuleTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CombinedShippingRuleTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "COMBINED_ITEM_WEIGHT": return COMBINED_ITEM_WEIGHT;
            case "EACH_ADDITIONAL_AMOUNT": return EACH_ADDITIONAL_AMOUNT;
            case "EACH_ADDITIONAL_AMOUNT_OFF": return EACH_ADDITIONAL_AMOUNT_OFF;
            case "EACH_ADDITIONAL_PERCENT_OFF": return EACH_ADDITIONAL_PERCENT_OFF;
            case "INDIVIDUAL_ITEM_WEIGHT": return INDIVIDUAL_ITEM_WEIGHT;
            case "MAXIMUM_SHIPPING_COST_PER_ORDER": return MAXIMUM_SHIPPING_COST_PER_ORDER;
            case "SHIPPING_COST_X_FOR_AMOUNT_Y": return SHIPPING_COST_X_FOR_AMOUNT_Y;
            case "SHIPPING_COST_X_FOR_ITEM_COUNT_N": return SHIPPING_COST_X_FOR_ITEM_COUNT_N;
            case "WEIGHT_OFF": return WEIGHT_OFF;
            default: return null;
        }
    }
}
