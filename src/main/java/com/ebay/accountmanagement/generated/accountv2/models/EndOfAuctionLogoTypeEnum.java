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
 * This enum indicates the type of logo that is used in the email that is sent to winning bidders. See EndOfAuctionLogoTypeEnum type for descriptions of the different logo types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EndOfAuctionLogoTypeEnum implements ValuedEnum {
    WINNING_BIDDER_NOTICE("WINNING_BIDDER_NOTICE"),
    STORE("STORE"),
    CUSTOMIZED("CUSTOMIZED"),
    NONE("NONE");
    public final String value;
    EndOfAuctionLogoTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EndOfAuctionLogoTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "WINNING_BIDDER_NOTICE": return WINNING_BIDDER_NOTICE;
            case "STORE": return STORE;
            case "CUSTOMIZED": return CUSTOMIZED;
            case "NONE": return NONE;
            default: return null;
        }
    }
}
