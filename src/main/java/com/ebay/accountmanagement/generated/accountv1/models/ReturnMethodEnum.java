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
 * This enumerated type lists the return options (other than &apos;money back&apos;) that a seller may offer to the buyer for a return request. | - **EXCHANGE**: &lt;strong&gt;Do not use/No longer supported.&lt;/strong&gt; - **REPLACEMENT**: This value indicates that the seller offers a replacement (identical) item as an alternative to &apos;money back&apos; when the buyer is returning an item.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ReturnMethodEnum implements ValuedEnum {
    EXCHANGE("EXCHANGE"),
    REPLACEMENT("REPLACEMENT");
    public final String value;
    ReturnMethodEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ReturnMethodEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "EXCHANGE": return EXCHANGE;
            case "REPLACEMENT": return REPLACEMENT;
            default: return null;
        }
    }
}
