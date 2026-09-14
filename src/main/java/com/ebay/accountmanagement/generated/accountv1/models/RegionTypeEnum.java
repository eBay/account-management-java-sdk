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
 * This enumerated type defines shipping region types.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; These enumeration values are not currently being used by fulfillment policy methods, but may be used in the future.&lt;/span&gt; | - **COUNTRY**: A single country. - **COUNTRY_REGION**: A domestic region or special location within a country. In the US, these domestic region/special location include &apos;Alaska/Hawaii&apos; and &apos;PO Box&apos;. - **STATE_OR_PROVINCE**: A state or province, such as California (CA) or New York (NY) in the US, or British Columbia (BC) or Ontario (ON) in Canada. - **WORLD_REGION**: A world region, such as Europe, the Middle East, or Southeast Asia. - **WORLDWIDE**: The entire world as we know it.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RegionTypeEnum implements ValuedEnum {
    COUNTRY("COUNTRY"),
    COUNTRY_REGION("COUNTRY_REGION"),
    STATE_OR_PROVINCE("STATE_OR_PROVINCE"),
    WORLD_REGION("WORLD_REGION"),
    WORLDWIDE("WORLDWIDE");
    public final String value;
    RegionTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RegionTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "COUNTRY": return COUNTRY;
            case "COUNTRY_REGION": return COUNTRY_REGION;
            case "STATE_OR_PROVINCE": return STATE_OR_PROVINCE;
            case "WORLD_REGION": return WORLD_REGION;
            case "WORLDWIDE": return WORLDWIDE;
            default: return null;
        }
    }
}
