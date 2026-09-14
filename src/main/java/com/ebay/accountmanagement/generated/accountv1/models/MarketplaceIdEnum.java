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
 * This enumerated type contains a list of the standard codes that represent each of the eBay marketplaces. | - **EBAY_AT**: eBay Austria (ebay.at) - **EBAY_AU**: eBay Australia (ebay.com/au) - **EBAY_BE**: eBay Belgium (ebay.com/sch/Belgium) - **EBAY_CA**: eBay Canada (English) (ebay.ca) - **EBAY_CH**: eBay Switzerland (ebay.ch) - **EBAY_CN**: eBay China (ebay.com/sch/China) - **EBAY_CZ**: eBay Czech Republic (ebay.com/sch/Czech-Republic) - **EBAY_DE**: eBay Germany (ebay.de) - **EBAY_DK**: eBay Denmark (ebay.com/sch/Denmark) - **EBAY_ES**: eBay Spain (ebay.es) - **EBAY_FI**: eBay Finland (ebay.com/sch/Finland) - **EBAY_FR**: eBay France (ebay.fr) - **EBAY_GB**: eBay UK (ebay.co.uk) - **EBAY_GR**: eBay Greece (ebay.com/sch/Greece) - **EBAY_HK**: eBay Hong Kong (ebay.com.hk) - **EBAY_HU**: eBay Hungary (ebay.com/sch/Hungary) - **EBAY_ID**: eBay Indonesia (id.ebay.com) - **EBAY_IE**: eBay Ireland (ebay.ie) - **EBAY_IL**: eBay Israel (ebay.com/sch/Israel) - **EBAY_IN**: eBay India (ebay.in)&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; eBay India is no longer a functioning eBay marketplace.&lt;/span&gt; - **EBAY_IT**: eBay Italy (ebay.it) - **EBAY_JP**: eBay Japan (ebay.co.jp) - **EBAY_MY**: eBay Malaysia (ebay.com/my) - **EBAY_NL**: eBay Netherlands (ebay.nl) - **EBAY_NO**: eBay Norway (ebay.com/sch/Norway) - **EBAY_NZ**: eBay New Zealand (ebay.com/sch/New-Zealand) - **EBAY_PE**: eBay Peru (ebay.com/sch/Peru) - **EBAY_PH**: eBay Philippines (ebay.ph) - **EBAY_PL**: eBay Poland (ebay.pl) - **EBAY_PR**: eBay Puerto Rico (ebay.com/sch/Puerto-Rico) - **EBAY_PT**: eBay Portugal (ebay.com/sch/Portugal) - **EBAY_RU**: eBay Russia (ebay.com/sch/Russia) - **EBAY_SE**: eBay Sweden (ebay.com/sch/Sweden) - **EBAY_SG**: eBay Singapore (ebay.com/sg) - **EBAY_TH**: eBay Thailand (export.ebay.co.th) - **EBAY_TW**: eBay Taiwan (ebay.com/tw) - **EBAY_US**: eBay US (ebay.com) - **EBAY_VN**: eBay Vietnam (ebay.vn) - **EBAY_ZA**: eBay South Africa (ebay.com/sch/South-Africa) - **EBAY_HALF_US**: This enumeration value is no longer applicable as the Half.com site no longer exists. - **EBAY_MOTORS_US**: eBay Motors US (ebay.com/motors)
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MarketplaceIdEnum implements ValuedEnum {
    EBAY_AT("EBAY_AT"),
    EBAY_AU("EBAY_AU"),
    EBAY_BE("EBAY_BE"),
    EBAY_CA("EBAY_CA"),
    EBAY_CH("EBAY_CH"),
    EBAY_CN("EBAY_CN"),
    EBAY_CZ("EBAY_CZ"),
    EBAY_DE("EBAY_DE"),
    EBAY_DK("EBAY_DK"),
    EBAY_ES("EBAY_ES"),
    EBAY_FI("EBAY_FI"),
    EBAY_FR("EBAY_FR"),
    EBAY_GB("EBAY_GB"),
    EBAY_GR("EBAY_GR"),
    EBAY_HK("EBAY_HK"),
    EBAY_HU("EBAY_HU"),
    EBAY_ID("EBAY_ID"),
    EBAY_IE("EBAY_IE"),
    EBAY_IL("EBAY_IL"),
    EBAY_IN("EBAY_IN"),
    EBAY_IT("EBAY_IT"),
    EBAY_JP("EBAY_JP"),
    EBAY_MY("EBAY_MY"),
    EBAY_NL("EBAY_NL"),
    EBAY_NO("EBAY_NO"),
    EBAY_NZ("EBAY_NZ"),
    EBAY_PE("EBAY_PE"),
    EBAY_PH("EBAY_PH"),
    EBAY_PL("EBAY_PL"),
    EBAY_PR("EBAY_PR"),
    EBAY_PT("EBAY_PT"),
    EBAY_RU("EBAY_RU"),
    EBAY_SE("EBAY_SE"),
    EBAY_SG("EBAY_SG"),
    EBAY_TH("EBAY_TH"),
    EBAY_TW("EBAY_TW"),
    EBAY_US("EBAY_US"),
    EBAY_VN("EBAY_VN"),
    EBAY_ZA("EBAY_ZA"),
    EBAY_HALF_US("EBAY_HALF_US"),
    EBAY_MOTORS_US("EBAY_MOTORS_US");
    public final String value;
    MarketplaceIdEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MarketplaceIdEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "EBAY_AT": return EBAY_AT;
            case "EBAY_AU": return EBAY_AU;
            case "EBAY_BE": return EBAY_BE;
            case "EBAY_CA": return EBAY_CA;
            case "EBAY_CH": return EBAY_CH;
            case "EBAY_CN": return EBAY_CN;
            case "EBAY_CZ": return EBAY_CZ;
            case "EBAY_DE": return EBAY_DE;
            case "EBAY_DK": return EBAY_DK;
            case "EBAY_ES": return EBAY_ES;
            case "EBAY_FI": return EBAY_FI;
            case "EBAY_FR": return EBAY_FR;
            case "EBAY_GB": return EBAY_GB;
            case "EBAY_GR": return EBAY_GR;
            case "EBAY_HK": return EBAY_HK;
            case "EBAY_HU": return EBAY_HU;
            case "EBAY_ID": return EBAY_ID;
            case "EBAY_IE": return EBAY_IE;
            case "EBAY_IL": return EBAY_IL;
            case "EBAY_IN": return EBAY_IN;
            case "EBAY_IT": return EBAY_IT;
            case "EBAY_JP": return EBAY_JP;
            case "EBAY_MY": return EBAY_MY;
            case "EBAY_NL": return EBAY_NL;
            case "EBAY_NO": return EBAY_NO;
            case "EBAY_NZ": return EBAY_NZ;
            case "EBAY_PE": return EBAY_PE;
            case "EBAY_PH": return EBAY_PH;
            case "EBAY_PL": return EBAY_PL;
            case "EBAY_PR": return EBAY_PR;
            case "EBAY_PT": return EBAY_PT;
            case "EBAY_RU": return EBAY_RU;
            case "EBAY_SE": return EBAY_SE;
            case "EBAY_SG": return EBAY_SG;
            case "EBAY_TH": return EBAY_TH;
            case "EBAY_TW": return EBAY_TW;
            case "EBAY_US": return EBAY_US;
            case "EBAY_VN": return EBAY_VN;
            case "EBAY_ZA": return EBAY_ZA;
            case "EBAY_HALF_US": return EBAY_HALF_US;
            case "EBAY_MOTORS_US": return EBAY_MOTORS_US;
            default: return null;
        }
    }
}
