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
 * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: This type is no longer applicable. eBay now controls all electronic payment methods available for a marketplace, and a seller never has to specify any electronic payment methods.&lt;/span&gt; | - **PAYPAL_EMAIL**: This is the PayPal email address of the seller.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RecipientAccountReferenceTypeEnum implements ValuedEnum {
    PAYPAL_EMAIL("PAYPAL_EMAIL");
    public final String value;
    RecipientAccountReferenceTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RecipientAccountReferenceTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PAYPAL_EMAIL": return PAYPAL_EMAIL;
            default: return null;
        }
    }
}
