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
 * An enumerated type that defines the eBay advertising program for which a seller may be eligible. | - **PROMOTED_LISTINGS_STANDARD**: This value indicates that the eBay advertising program is Promoted Listings general campaign strategy (formerly Promoted Listings Standard (PLS)). - **PROMOTED_LISTINGS_ADVANCED**: This value indicates that the eBay advertising program is Promoted listings priority campaign strategy (formerly Promoted Listings Advanced (PLA)). - **OFFSITE_ADS**: This value indicates that the eBay advertising program is Promoted Listings Promoted Offsite (formerly Offsite Ads).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AdvertisingProgramEnum implements ValuedEnum {
    PROMOTED_LISTINGS_STANDARD("PROMOTED_LISTINGS_STANDARD"),
    PROMOTED_LISTINGS_ADVANCED("PROMOTED_LISTINGS_ADVANCED"),
    OFFSITE_ADS("OFFSITE_ADS");
    public final String value;
    AdvertisingProgramEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AdvertisingProgramEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PROMOTED_LISTINGS_STANDARD": return PROMOTED_LISTINGS_STANDARD;
            case "PROMOTED_LISTINGS_ADVANCED": return PROMOTED_LISTINGS_ADVANCED;
            case "OFFSITE_ADS": return OFFSITE_ADS;
            default: return null;
        }
    }
}
