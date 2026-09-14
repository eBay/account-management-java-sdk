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
 * The rate calculation type provides three methods of calculating the shipping cost based on the seller&apos;s selection/input:&lt;ul&gt;&lt;li&gt;&lt;b&gt;ITEM&lt;/b&gt;: Specifies the flat rate shipping cost that buyers in the specified shipping region will pay. When this option is selected, information specified in the rate table overrides all shipping options/costs that are specified at the listing level. Buyers in the specified regions will only see the services provided in the rate table. Buyers in other regions that are not specified in the rate table will see the shipping services associated with the listing.&lt;/li&gt;&lt;li&gt;&lt;b&gt;WEIGHT&lt;/b&gt;: Seller can provide minimum shipping cost and an additional shipping cost per pound. The additional cost will be calculated based on the weight the seller provide at the time of listing. Buyers will see the total shipping cost and wont see these calculations.  Buyers in the specified regions will only see the services provided in the rate table. Buyers in other regions that were not specified in the rate table, will see the shipping services associated with the listing.&lt;/li&gt;&lt;li&gt;&lt;b&gt;SURCHARGE&lt;/b&gt;: Lists surcharges for buyers within specified regions, or indicates a flat amount added to the shipping cost specified within an item&apos;s listing. Buyers will see only the total shipping cost as well as shipping services associated with the item&apos;s listing. If a SURCHARGE is specified in the rate table for certain regions, buyers in those regions will see the (shipping cost + SURCHARGE) total.&lt;/li&gt;&lt;/ul&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ShippingRateCalculationEnum implements ValuedEnum {
    ITEM("ITEM"),
    WEIGHT("WEIGHT"),
    SURCHARGE("SURCHARGE");
    public final String value;
    ShippingRateCalculationEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ShippingRateCalculationEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ITEM": return ITEM;
            case "WEIGHT": return WEIGHT;
            case "SURCHARGE": return SURCHARGE;
            default: return null;
        }
    }
}
