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
 * An enumerated type defining the supported credit card brand names. &lt;br&gt;&lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: This enumeration type and the values defined in it are no longer applicable, since eBay now controls all electronic payment methods available for a marketplace, and a seller never has to specify any electronic payment methods. &lt;/span&gt; | - **AMERICAN_EXPRESS**: American Express card - **DISCOVER**: Discover card - **MASTERCARD**: MasterCard - **VISA**: Visa card
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PaymentInstrumentBrandEnum implements ValuedEnum {
    AMERICAN_EXPRESS("AMERICAN_EXPRESS"),
    DISCOVER("DISCOVER"),
    MASTERCARD("MASTERCARD"),
    VISA("VISA");
    public final String value;
    PaymentInstrumentBrandEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PaymentInstrumentBrandEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "AMERICAN_EXPRESS": return AMERICAN_EXPRESS;
            case "DISCOVER": return DISCOVER;
            case "MASTERCARD": return MASTERCARD;
            case "VISA": return VISA;
            default: return null;
        }
    }
}
