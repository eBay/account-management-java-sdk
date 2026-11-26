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
 * This field indicates the refund method offered by the seller. Its value will be &lt;code&gt;MONEY_BACK&lt;/code&gt; unless the seller is enabled for &lt;b&gt;Click and Collect&lt;/b&gt;, and then it might be &lt;code&gt;MERCHANDISE_CREDIT&lt;/code&gt;. Getting their money back for returned items is always an option for buyers, regardless of what the seller sets in this field.
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
