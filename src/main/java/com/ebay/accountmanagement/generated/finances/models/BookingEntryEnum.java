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
 * The enumeration value returned in this field indicates if the monetary transaction amount is a (&lt;code&gt;CREDIT&lt;/code&gt;) or a (&lt;code&gt;DEBIT&lt;/code&gt;) to the seller&apos;s account.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BookingEntryEnum implements ValuedEnum {
    CREDIT("CREDIT"),
    DEBIT("DEBIT");
    public final String value;
    BookingEntryEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BookingEntryEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CREDIT": return CREDIT;
            case "DEBIT": return DEBIT;
            default: return null;
        }
    }
}
