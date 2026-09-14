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
 * This enumerated type lists the types of details that may be needed for a KYC check. | - **COMPANY_DETAILS**: This enumeration value indicates that the seller is required to provide information about their company. More information about the check is shown in the &lt;strong&gt;detailMessage&lt;/strong&gt; and other applicable, corresponding fields. - **INDIVIDUAL_DETAILS**: This enumeration value indicates that the seller is required to provide personal information. More information about the check is shown in the &lt;strong&gt;detailMessage&lt;/strong&gt; and other applicable, corresponding fields. - **BANK_DETAILS**: This enumeration value indicates that the seller is required to provide information about their bank. More information about the check is shown in the &lt;strong&gt;detailMessage&lt;/strong&gt; and other applicable, corresponding fields.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DetailsType implements ValuedEnum {
    COMPANY_DETAILS("COMPANY_DETAILS"),
    INDIVIDUAL_DETAILS("INDIVIDUAL_DETAILS"),
    BANK_DETAILS("BANK_DETAILS");
    public final String value;
    DetailsType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DetailsType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "COMPANY_DETAILS": return COMPANY_DETAILS;
            case "INDIVIDUAL_DETAILS": return INDIVIDUAL_DETAILS;
            case "BANK_DETAILS": return BANK_DETAILS;
            default: return null;
        }
    }
}
