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
 * The status of a payout instrument. Valid payout instrument statuses include:&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;PENDING:&lt;/code&gt; This status indicates that the account must be verified before it can be used.&lt;/li&gt;&lt;li&gt;&lt;code&gt;ACTIVE:&lt;/code&gt;This status indicates that payouts are enabled on this account.&lt;/li&gt;&lt;li&gt;&lt;code&gt;VERIFICATION_FAILED:&lt;/code&gt; This status indicates that verification has failed for this account and payouts are disabled.&lt;/li&gt;&lt;li&gt;&lt;code&gt;INACTIVE:&lt;/code&gt; This status indicates that this account has become inactive and payouts are disabled.&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;See &lt;b&gt;InstrumentStatusEnum&lt;/b&gt; for more details on each instrument status value.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Payment accounts can only receive payouts if the status of a payout instrument is &lt;code&gt;ACTIVE&lt;/code&gt;.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InstrumentStatusEnum implements ValuedEnum {
    PENDING("PENDING"),
    ACTIVE("ACTIVE"),
    VERIFICATION_FAILED("VERIFICATION_FAILED"),
    INACTIVE("INACTIVE");
    public final String value;
    InstrumentStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InstrumentStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PENDING": return PENDING;
            case "ACTIVE": return ACTIVE;
            case "VERIFICATION_FAILED": return VERIFICATION_FAILED;
            case "INACTIVE": return INACTIVE;
            default: return null;
        }
    }
}
