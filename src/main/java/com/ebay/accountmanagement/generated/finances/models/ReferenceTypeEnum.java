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

package com.ebay.accountmanagement.generated.finances.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An enumeration value that identifies the reference type associated with the &lt;strong&gt;referenceId&lt;/strong&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ReferenceTypeEnum implements ValuedEnum {
    INVOICE("INVOICE"),
    ITEM_ID("ITEM_ID"),
    ORDER_ID("ORDER_ID"),
    CASE_ID("CASE_ID"),
    CANCELLATION_ID("CANCELLATION_ID"),
    REFUND_ID("REFUND_ID"),
    RETURN_ID("RETURN_ID"),
    PAYMENTS_DISPUTE_ID("PAYMENTS_DISPUTE_ID"),
    PAYOUT_ID("PAYOUT_ID"),
    LOAN_REPAYMENT_ID("LOAN_REPAYMENT_ID"),
    PSNAD_ID("PSNAD_ID");
    public final String value;
    ReferenceTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ReferenceTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "INVOICE": return INVOICE;
            case "ITEM_ID": return ITEM_ID;
            case "ORDER_ID": return ORDER_ID;
            case "CASE_ID": return CASE_ID;
            case "CANCELLATION_ID": return CANCELLATION_ID;
            case "REFUND_ID": return REFUND_ID;
            case "RETURN_ID": return RETURN_ID;
            case "PAYMENTS_DISPUTE_ID": return PAYMENTS_DISPUTE_ID;
            case "PAYOUT_ID": return PAYOUT_ID;
            case "LOAN_REPAYMENT_ID": return LOAN_REPAYMENT_ID;
            case "PSNAD_ID": return PSNAD_ID;
            default: return null;
        }
    }
}
