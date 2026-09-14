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
 * This enumerated type specifies the time-measurement unit that&apos;s used to express a time span. | - **YEAR**: This value indicates that the time measurement unit used is based on a number of years. This enum is not currently used by the Account API v1. - **MONTH**: This value indicates that the time measurement unit used is based on a number of months. This enum is not currently used by the Account API v1. - **DAY**: This value indicates that the time measurement unit used is based on a number of days. This enum is used for handling time in fulfillment business policies, for &lt;strong&gt;fullPaymentDueIn&lt;/strong&gt; field for motor vehicle listing payment business policies, and for the return period for return business policies. - **HOUR**: This value indicates that the time measurement unit used is based on a number of hours. This enum is used for a motor vehicle deposit due date for motor vehicle listing payment business policies. - **CALENDAR_DAY**: This value indicates that the time measurement unit used is based on a number of calendar days, including Saturday and Sunday. This time measurement unit does not exclude holidays. This enum is not currently used by the Account API v1. - **BUSINESS_DAY**: This value indicates that the time measurement unit used is based on a number of business days or &apos;working days&apos;. This generally excludes Sunday and all holidays (for the marketplace) in the time duration and, depending on the location, can include or exclude Saturday. This enum is not currently used by the Account API v1. - **MINUTE**: This value indicates that the time measurement unit used is based on a number of minutes. This enum is not currently used by the Account API v1. - **SECOND**: This value indicates that the time measurement unit used is based on a number of seconds. This enum is not currently used by the Account API v1. - **MILLISECOND**: This value indicates that the time measurement unit used is based on a number of milliseconds. This enum is not currently used by the Account API v1.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TimeDurationUnitEnum implements ValuedEnum {
    YEAR("YEAR"),
    MONTH("MONTH"),
    DAY("DAY"),
    HOUR("HOUR"),
    CALENDAR_DAY("CALENDAR_DAY"),
    BUSINESS_DAY("BUSINESS_DAY"),
    MINUTE("MINUTE"),
    SECOND("SECOND"),
    MILLISECOND("MILLISECOND");
    public final String value;
    TimeDurationUnitEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TimeDurationUnitEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "YEAR": return YEAR;
            case "MONTH": return MONTH;
            case "DAY": return DAY;
            case "HOUR": return HOUR;
            case "CALENDAR_DAY": return CALENDAR_DAY;
            case "BUSINESS_DAY": return BUSINESS_DAY;
            case "MINUTE": return MINUTE;
            case "SECOND": return SECOND;
            case "MILLISECOND": return MILLISECOND;
            default: return null;
        }
    }
}
