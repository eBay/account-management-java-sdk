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
 * An enumeration type that defines the supported payment methods.&lt;br&gt;&lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: eBay manages all electronic payment methods that are available to buyers, so sellers only need to specify one or more offline payment methods for listings that support or require payment that occurs off of the eBay platform. All electronic payment method enum values are no longer applicable, and are marked as such. &lt;/span&gt; | - **CASH_IN_PERSON**: This enumeration value indicates that the payment method will be cash, and the transaction will occur in-person. - **CASH_ON_DELIVERY**: This enumeration value indicates that the payment method will be cash, and the transaction will occur after the item is delivered to the buyer. - **CASH_ON_PICKUP**: This enumeration value indicates that the payment method will be cash, and the transaction will occur when the buyer picks up the item. - **CASHIER_CHECK**: This enumeration value indicates that the payment method will be a Cashier Check. - **CREDIT_CARD**: This payment method is no longer valid. - **ESCROW**: This enumeration value indicates that escrow was used as the payment method to pay for the order. This form of payment is used for high-value orders. - **INTEGRATED_MERCHANT_CREDIT_CARD**: This payment method is no longer valid. - **LOAN_CHECK**: This payment method is no longer valid. - **MONEY_ORDER**: This enumeration value indicates that the payment method will be by a Money Order. - **PAISA_PAY**: This payment method is no longer valid. - **PAISA_PAY_ESCROW**: This payment method is no longer valid. - **PAISA_PAY_ESCROW_EMI**: This payment method is no longer valid. - **PAYPAL**: This payment method is no longer valid. - **PERSONAL_CHECK**: This enumeration value indicates that the payment method will be a Personal check. - **OTHER**: This enumeration value indicates that the seller is offering an offline payment method not otherwise covered.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PaymentMethodTypeEnum implements ValuedEnum {
    CASH_IN_PERSON("CASH_IN_PERSON"),
    CASH_ON_DELIVERY("CASH_ON_DELIVERY"),
    CASH_ON_PICKUP("CASH_ON_PICKUP"),
    CASHIER_CHECK("CASHIER_CHECK"),
    CREDIT_CARD("CREDIT_CARD"),
    ESCROW("ESCROW"),
    INTEGRATED_MERCHANT_CREDIT_CARD("INTEGRATED_MERCHANT_CREDIT_CARD"),
    LOAN_CHECK("LOAN_CHECK"),
    MONEY_ORDER("MONEY_ORDER"),
    PAISA_PAY("PAISA_PAY"),
    PAISA_PAY_ESCROW("PAISA_PAY_ESCROW"),
    PAISA_PAY_ESCROW_EMI("PAISA_PAY_ESCROW_EMI"),
    PAYPAL("PAYPAL"),
    PERSONAL_CHECK("PERSONAL_CHECK"),
    OTHER("OTHER");
    public final String value;
    PaymentMethodTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PaymentMethodTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CASH_IN_PERSON": return CASH_IN_PERSON;
            case "CASH_ON_DELIVERY": return CASH_ON_DELIVERY;
            case "CASH_ON_PICKUP": return CASH_ON_PICKUP;
            case "CASHIER_CHECK": return CASHIER_CHECK;
            case "CREDIT_CARD": return CREDIT_CARD;
            case "ESCROW": return ESCROW;
            case "INTEGRATED_MERCHANT_CREDIT_CARD": return INTEGRATED_MERCHANT_CREDIT_CARD;
            case "LOAN_CHECK": return LOAN_CHECK;
            case "MONEY_ORDER": return MONEY_ORDER;
            case "PAISA_PAY": return PAISA_PAY;
            case "PAISA_PAY_ESCROW": return PAISA_PAY_ESCROW;
            case "PAISA_PAY_ESCROW_EMI": return PAISA_PAY_ESCROW_EMI;
            case "PAYPAL": return PAYPAL;
            case "PERSONAL_CHECK": return PERSONAL_CHECK;
            case "OTHER": return OTHER;
            default: return null;
        }
    }
}
