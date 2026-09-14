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
 * Indicates the level of shipping service to which the shipping rate information applies.&lt;br/&gt;&lt;br/&gt;Available shipping categories are:&lt;ul&gt;&lt;li&gt;&lt;b&gt;ONE_DAY&lt;/b&gt;: &lt;i&gt;This option is not supported when &lt;b&gt;shippingOptionType&lt;/b&gt; is INTERNATIONAL.&lt;/i&gt; &lt;/li&gt;&lt;li&gt;&lt;b&gt;EXPEDITED&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;STANDARD&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;ECONOMY&lt;/b&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;EXPRESS&lt;/b&gt;: &lt;i&gt;This option is supported only when &lt;b&gt;MarketplaceId&lt;/b&gt; is &lt;code&gt;EBAY_DE&lt;/code&gt; (Germany)&lt;/i&gt;&lt;/li&gt;&lt;/ul&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ShippingCategoryEnum implements ValuedEnum {
    ONE_DAY("ONE_DAY"),
    EXPEDITED("EXPEDITED"),
    STANDARD("STANDARD"),
    ECONOMY("ECONOMY"),
    EXPRESS("EXPRESS");
    public final String value;
    ShippingCategoryEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ShippingCategoryEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ONE_DAY": return ONE_DAY;
            case "EXPEDITED": return EXPEDITED;
            case "STANDARD": return STANDARD;
            case "ECONOMY": return ECONOMY;
            case "EXPRESS": return EXPRESS;
            default: return null;
        }
    }
}
