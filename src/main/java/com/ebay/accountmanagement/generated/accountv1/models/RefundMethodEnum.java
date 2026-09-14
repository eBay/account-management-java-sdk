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
 * This enumerated type defines the supported refund types for buyer returns. | - **MERCHANDISE_CREDIT**: &lt;strong&gt;Do not use/No longer supported.&lt;/strong&gt; - **MONEY_BACK**: This enumeration value indicates that the buyer will get their money back (refund) for a returned item.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RefundMethodEnum implements ValuedEnum {
    MERCHANDISE_CREDIT("MERCHANDISE_CREDIT"),
    MONEY_BACK("MONEY_BACK");
    public final String value;
    RefundMethodEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RefundMethodEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "MERCHANDISE_CREDIT": return MERCHANDISE_CREDIT;
            case "MONEY_BACK": return MONEY_BACK;
            default: return null;
        }
    }
}
