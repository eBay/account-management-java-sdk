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
 * The seller program to opt in to when part of an &lt;b&gt;optInToProgram&lt;/b&gt; request, or out of when part of an  &lt;b&gt;optOutOfProgram&lt;/b&gt; request. When returned in an &lt;b&gt;getOptedInPrograms&lt;/b&gt; response, a separate &lt;b&gt;programType&lt;/b&gt; field is returned for each seller program that the seller is opted in to.
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
