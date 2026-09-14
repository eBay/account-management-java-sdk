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

package com.ebay.accountmanagement.generated.finances.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * This enumeration value indicates the current status of the seller payout. For a successful payout, the value returned will be &lt;code&gt;SUCCEEDED&lt;/code&gt;. See the &lt;strong&gt;PayoutStatusEnum&lt;/strong&gt; type for more details on each payout status value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PayoutStatusEnum implements ValuedEnum {
    INITIATED("INITIATED"),
    SUCCEEDED("SUCCEEDED"),
    REVERSED("REVERSED"),
    RETRYABLE_FAILED("RETRYABLE_FAILED"),
    TERMINAL_FAILED("TERMINAL_FAILED");
    public final String value;
    PayoutStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PayoutStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "INITIATED": return INITIATED;
            case "SUCCEEDED": return SUCCEEDED;
            case "REVERSED": return REVERSED;
            case "RETRYABLE_FAILED": return RETRYABLE_FAILED;
            case "TERMINAL_FAILED": return TERMINAL_FAILED;
            default: return null;
        }
    }
}
