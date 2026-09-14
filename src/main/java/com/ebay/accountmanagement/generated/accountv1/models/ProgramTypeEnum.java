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
 * This enumerated type defines the supported seller programs. | - **OUT_OF_STOCK_CONTROL**: If a seller&apos;s account is opted in to the out-of-stock control program, active fixed-price listings will be kept &apos;alive&apos; (but not surfaced in search results) even when the quantity for the listing has been depleted to 0. This feature allows the seller to update/revise the listing with more quantity, and prevents the seller from having to relist the item. - **PARTNER_MOTORS_DEALER**: The Partner Motors Program that sellers can participate in by opting-in to the program. Sellers must be registered business users to opt-in to this program. - **SELLING_POLICY_MANAGEMENT**: If a seller&apos;s account is opted in to this program, sellers can associate business policies (payment, return policy, fulfillment) to their listings. Being opted in to business policies is a requirement for using the &lt;strong&gt;Inventory API&lt;/strong&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProgramTypeEnum implements ValuedEnum {
    OUT_OF_STOCK_CONTROL("OUT_OF_STOCK_CONTROL"),
    PARTNER_MOTORS_DEALER("PARTNER_MOTORS_DEALER"),
    SELLING_POLICY_MANAGEMENT("SELLING_POLICY_MANAGEMENT");
    public final String value;
    ProgramTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProgramTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "OUT_OF_STOCK_CONTROL": return OUT_OF_STOCK_CONTROL;
            case "PARTNER_MOTORS_DEALER": return PARTNER_MOTORS_DEALER;
            case "SELLING_POLICY_MANAGEMENT": return SELLING_POLICY_MANAGEMENT;
            default: return null;
        }
    }
}
