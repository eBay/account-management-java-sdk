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
 * This enumeration value indicates the current status of the seller payout associated with the monetary transaction.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TransactionStatusEnum implements ValuedEnum {
    FUNDS_ON_HOLD("FUNDS_ON_HOLD"),
    FUNDS_PROCESSING("FUNDS_PROCESSING"),
    FUNDS_AVAILABLE_FOR_PAYOUT("FUNDS_AVAILABLE_FOR_PAYOUT"),
    PAYOUT("PAYOUT"),
    COMPLETED("COMPLETED"),
    FAILED("FAILED");
    public final String value;
    TransactionStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TransactionStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "FUNDS_ON_HOLD": return FUNDS_ON_HOLD;
            case "FUNDS_PROCESSING": return FUNDS_PROCESSING;
            case "FUNDS_AVAILABLE_FOR_PAYOUT": return FUNDS_AVAILABLE_FOR_PAYOUT;
            case "PAYOUT": return PAYOUT;
            case "COMPLETED": return COMPLETED;
            case "FAILED": return FAILED;
            default: return null;
        }
    }
}
