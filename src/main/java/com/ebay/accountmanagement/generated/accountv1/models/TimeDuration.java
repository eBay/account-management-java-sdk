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

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type used to specify a period of time using a specified time-measurement unit. Payment, return, and fulfillment business policies all use this type to specify time windows.&lt;br&gt;&lt;br&gt;Whenever a container that uses this type is used in a request, both of these fields are required. Similarly, whenever a container that uses this type is returned in a response, both of these fields are always returned.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TimeDuration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This enumerated type specifies the time-measurement unit that&apos;s used to express a time span. | - **YEAR**: This value indicates that the time measurement unit used is based on a number of years. This enum is not currently used by the Account API v1. - **MONTH**: This value indicates that the time measurement unit used is based on a number of months. This enum is not currently used by the Account API v1. - **DAY**: This value indicates that the time measurement unit used is based on a number of days. This enum is used for handling time in fulfillment business policies, for &lt;strong&gt;fullPaymentDueIn&lt;/strong&gt; field for motor vehicle listing payment business policies, and for the return period for return business policies. - **HOUR**: This value indicates that the time measurement unit used is based on a number of hours. This enum is used for a motor vehicle deposit due date for motor vehicle listing payment business policies. - **CALENDAR_DAY**: This value indicates that the time measurement unit used is based on a number of calendar days, including Saturday and Sunday. This time measurement unit does not exclude holidays. This enum is not currently used by the Account API v1. - **BUSINESS_DAY**: This value indicates that the time measurement unit used is based on a number of business days or &apos;working days&apos;. This generally excludes Sunday and all holidays (for the marketplace) in the time duration and, depending on the location, can include or exclude Saturday. This enum is not currently used by the Account API v1. - **MINUTE**: This value indicates that the time measurement unit used is based on a number of minutes. This enum is not currently used by the Account API v1. - **SECOND**: This value indicates that the time measurement unit used is based on a number of seconds. This enum is not currently used by the Account API v1. - **MILLISECOND**: This value indicates that the time measurement unit used is based on a number of milliseconds. This enum is not currently used by the Account API v1.
     */
    private TimeDurationUnitEnum unit;
    /**
     * An integer that represents an amount of time, as measured by the time-measurement unit specified in the &lt;b&gt;unit&lt;/b&gt; field.
     */
    private Integer value;
    /**
     * Instantiates a new {@link TimeDuration} and sets the default values.
     */
    public TimeDuration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TimeDuration}
     */
    @jakarta.annotation.Nonnull
    public static TimeDuration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeDuration();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("unit", (n) -> { this.setUnit(n.getEnumValue(TimeDurationUnitEnum::forValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the unit property value. This enumerated type specifies the time-measurement unit that&apos;s used to express a time span. | - **YEAR**: This value indicates that the time measurement unit used is based on a number of years. This enum is not currently used by the Account API v1. - **MONTH**: This value indicates that the time measurement unit used is based on a number of months. This enum is not currently used by the Account API v1. - **DAY**: This value indicates that the time measurement unit used is based on a number of days. This enum is used for handling time in fulfillment business policies, for &lt;strong&gt;fullPaymentDueIn&lt;/strong&gt; field for motor vehicle listing payment business policies, and for the return period for return business policies. - **HOUR**: This value indicates that the time measurement unit used is based on a number of hours. This enum is used for a motor vehicle deposit due date for motor vehicle listing payment business policies. - **CALENDAR_DAY**: This value indicates that the time measurement unit used is based on a number of calendar days, including Saturday and Sunday. This time measurement unit does not exclude holidays. This enum is not currently used by the Account API v1. - **BUSINESS_DAY**: This value indicates that the time measurement unit used is based on a number of business days or &apos;working days&apos;. This generally excludes Sunday and all holidays (for the marketplace) in the time duration and, depending on the location, can include or exclude Saturday. This enum is not currently used by the Account API v1. - **MINUTE**: This value indicates that the time measurement unit used is based on a number of minutes. This enum is not currently used by the Account API v1. - **SECOND**: This value indicates that the time measurement unit used is based on a number of seconds. This enum is not currently used by the Account API v1. - **MILLISECOND**: This value indicates that the time measurement unit used is based on a number of milliseconds. This enum is not currently used by the Account API v1.
     * @return a {@link TimeDurationUnitEnum}
     */
    @jakarta.annotation.Nullable
    public TimeDurationUnitEnum getUnit() {
        return this.unit;
    }
    /**
     * Gets the value property value. An integer that represents an amount of time, as measured by the time-measurement unit specified in the &lt;b&gt;unit&lt;/b&gt; field.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("unit", this.getUnit());
        writer.writeIntegerValue("value", this.getValue());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the unit property value. This enumerated type specifies the time-measurement unit that&apos;s used to express a time span. | - **YEAR**: This value indicates that the time measurement unit used is based on a number of years. This enum is not currently used by the Account API v1. - **MONTH**: This value indicates that the time measurement unit used is based on a number of months. This enum is not currently used by the Account API v1. - **DAY**: This value indicates that the time measurement unit used is based on a number of days. This enum is used for handling time in fulfillment business policies, for &lt;strong&gt;fullPaymentDueIn&lt;/strong&gt; field for motor vehicle listing payment business policies, and for the return period for return business policies. - **HOUR**: This value indicates that the time measurement unit used is based on a number of hours. This enum is used for a motor vehicle deposit due date for motor vehicle listing payment business policies. - **CALENDAR_DAY**: This value indicates that the time measurement unit used is based on a number of calendar days, including Saturday and Sunday. This time measurement unit does not exclude holidays. This enum is not currently used by the Account API v1. - **BUSINESS_DAY**: This value indicates that the time measurement unit used is based on a number of business days or &apos;working days&apos;. This generally excludes Sunday and all holidays (for the marketplace) in the time duration and, depending on the location, can include or exclude Saturday. This enum is not currently used by the Account API v1. - **MINUTE**: This value indicates that the time measurement unit used is based on a number of minutes. This enum is not currently used by the Account API v1. - **SECOND**: This value indicates that the time measurement unit used is based on a number of seconds. This enum is not currently used by the Account API v1. - **MILLISECOND**: This value indicates that the time measurement unit used is based on a number of milliseconds. This enum is not currently used by the Account API v1.
     * @param value Value to set for the unit property.
     */
    public void setUnit(@jakarta.annotation.Nullable final TimeDurationUnitEnum value) {
        this.unit = value;
    }
    /**
     * Sets the value property value. An integer that represents an amount of time, as measured by the time-measurement unit specified in the &lt;b&gt;unit&lt;/b&gt; field.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Integer value) {
        this.value = value;
    }
}
