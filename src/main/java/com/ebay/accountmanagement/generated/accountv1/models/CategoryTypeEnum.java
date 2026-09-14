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
 * An enum type that describes the category type (motor vehicles or non-motor vehicles). | - **MOTORS_VEHICLES**: This values indicates that the business policy applies to motor vehicle listings. - **ALL_EXCLUDING_MOTORS_VEHICLES**: This values indicates that the business policy applies to all listings besides motor vehicle listings.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CategoryTypeEnum implements ValuedEnum {
    MOTORS_VEHICLES("MOTORS_VEHICLES"),
    ALL_EXCLUDING_MOTORS_VEHICLES("ALL_EXCLUDING_MOTORS_VEHICLES");
    public final String value;
    CategoryTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CategoryTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "MOTORS_VEHICLES": return MOTORS_VEHICLES;
            case "ALL_EXCLUDING_MOTORS_VEHICLES": return ALL_EXCLUDING_MOTORS_VEHICLES;
            default: return null;
        }
    }
}
