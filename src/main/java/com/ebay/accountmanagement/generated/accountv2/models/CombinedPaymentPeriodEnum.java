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
 * This field is represented by one of the values in the &lt;a href=&quot;/develop/api/sell/account_api_v2#sell-account_api_v2-combined_shipping_rules-getcombinedshippingrules.getcombinedshippingrulesresponse.combinedduration&quot; target=&quot;_blank&quot;&gt;CombinedPaymentPeriodEnum&lt;/a&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CombinedPaymentPeriodEnum implements ValuedEnum {
    DAYS_14("DAYS_14"),
    DAYS_3("DAYS_3"),
    DAYS_30("DAYS_30"),
    DAYS_5("DAYS_5"),
    DAYS_7("DAYS_7"),
    INELIGIBLE("INELIGIBLE");
    public final String value;
    CombinedPaymentPeriodEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CombinedPaymentPeriodEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DAYS_14": return DAYS_14;
            case "DAYS_3": return DAYS_3;
            case "DAYS_30": return DAYS_30;
            case "DAYS_5": return DAYS_5;
            case "DAYS_7": return DAYS_7;
            case "INELIGIBLE": return INELIGIBLE;
            default: return null;
        }
    }
}
