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
 * The region serviced by the shipping rate table. Valid values are:&lt;ul&gt;&lt;li&gt;&lt;b&gt;DOMESTIC&lt;/b&gt;: Indicates that the shipping rate table applies to shipping destinations within the country in which an item has been listed (i.e., the &lt;i&gt;source&lt;/i&gt; country).&lt;/li&gt;&lt;li&gt;&lt;b&gt;INTERNATIONAL&lt;/b&gt;: Indicates that the shipping rate table applies to shipping destinations outside of the country in which an item has been listed.&lt;/li&gt;&lt;/ul&gt;
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
