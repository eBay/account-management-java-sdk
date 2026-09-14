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
 * This enumerated type defines whether the corresponding shipping service options are domestic or international shipping service options. a region that is either domestic (within the country from where the item is listed or shipped) or international (a country outside the country from where the item is listed or shipped). | - **DOMESTIC**: This value indicates that the corresponding shipping service options are domestic shipping service options. - **INTERNATIONAL**: This value indicates that the corresponding shipping service options are international shipping service options.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ShippingOptionTypeEnum implements ValuedEnum {
    DOMESTIC("DOMESTIC"),
    INTERNATIONAL("INTERNATIONAL");
    public final String value;
    ShippingOptionTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ShippingOptionTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DOMESTIC": return DOMESTIC;
            case "INTERNATIONAL": return INTERNATIONAL;
            default: return null;
        }
    }
}
