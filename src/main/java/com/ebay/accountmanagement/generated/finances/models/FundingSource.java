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

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the source of funds used to finance a transfer, such as available seller funds, a credit card, or a bank account.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FundingSource implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The brand name of the credit card or the name of the financial institution that is the source of payment. This field may not be populated for other funding sources.
     */
    private String brand;
    /**
     * This field provides a note about the funding source. If the seller&apos;s credit card or bank account is the funding source, this field might contain the last four digits of the credit card or bank account. This field may also be returned as null.
     */
    private String memo;
    /**
     * The string value returned here indicates the funding source. Possible values include the following:&lt;ul&gt;&lt;li&gt;&lt;code&gt;AVAILABLE_FUNDS&lt;/code&gt;: transfer is funded with seller payout funds&lt;/li&gt;&lt;li&gt;&lt;code&gt;CREDIT_CARD&lt;/code&gt;: transfer is funded with seller&apos;s credit card&lt;/li&gt;&lt;li&gt;&lt;code&gt;BANK&lt;/code&gt;: transfer is funded with a direct debit to seller&apos;s bank account on file with eBay&lt;/li&gt;&lt;li&gt;&lt;code&gt;PAY_UPON_INVOICE&lt;/code&gt;: eBay will bill the seller for the transfer on the monthly invoice&lt;/li&gt;&lt;/ul&gt;
     */
    private String type;
    /**
     * Instantiates a new {@link FundingSource} and sets the default values.
     */
    public FundingSource() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FundingSource}
     */
    @jakarta.annotation.Nonnull
    public static FundingSource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FundingSource();
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
     * Gets the brand property value. The brand name of the credit card or the name of the financial institution that is the source of payment. This field may not be populated for other funding sources.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrand() {
        return this.brand;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("brand", (n) -> { this.setBrand(n.getStringValue()); });
        deserializerMap.put("memo", (n) -> { this.setMemo(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the memo property value. This field provides a note about the funding source. If the seller&apos;s credit card or bank account is the funding source, this field might contain the last four digits of the credit card or bank account. This field may also be returned as null.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMemo() {
        return this.memo;
    }
    /**
     * Gets the type property value. The string value returned here indicates the funding source. Possible values include the following:&lt;ul&gt;&lt;li&gt;&lt;code&gt;AVAILABLE_FUNDS&lt;/code&gt;: transfer is funded with seller payout funds&lt;/li&gt;&lt;li&gt;&lt;code&gt;CREDIT_CARD&lt;/code&gt;: transfer is funded with seller&apos;s credit card&lt;/li&gt;&lt;li&gt;&lt;code&gt;BANK&lt;/code&gt;: transfer is funded with a direct debit to seller&apos;s bank account on file with eBay&lt;/li&gt;&lt;li&gt;&lt;code&gt;PAY_UPON_INVOICE&lt;/code&gt;: eBay will bill the seller for the transfer on the monthly invoice&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("brand", this.getBrand());
        writer.writeStringValue("memo", this.getMemo());
        writer.writeStringValue("type", this.getType());
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
     * Sets the brand property value. The brand name of the credit card or the name of the financial institution that is the source of payment. This field may not be populated for other funding sources.
     * @param value Value to set for the brand property.
     */
    public void setBrand(@jakarta.annotation.Nullable final String value) {
        this.brand = value;
    }
    /**
     * Sets the memo property value. This field provides a note about the funding source. If the seller&apos;s credit card or bank account is the funding source, this field might contain the last four digits of the credit card or bank account. This field may also be returned as null.
     * @param value Value to set for the memo property.
     */
    public void setMemo(@jakarta.annotation.Nullable final String value) {
        this.memo = value;
    }
    /**
     * Sets the type property value. The string value returned here indicates the funding source. Possible values include the following:&lt;ul&gt;&lt;li&gt;&lt;code&gt;AVAILABLE_FUNDS&lt;/code&gt;: transfer is funded with seller payout funds&lt;/li&gt;&lt;li&gt;&lt;code&gt;CREDIT_CARD&lt;/code&gt;: transfer is funded with seller&apos;s credit card&lt;/li&gt;&lt;li&gt;&lt;code&gt;BANK&lt;/code&gt;: transfer is funded with a direct debit to seller&apos;s bank account on file with eBay&lt;/li&gt;&lt;li&gt;&lt;code&gt;PAY_UPON_INVOICE&lt;/code&gt;: eBay will bill the seller for the transfer on the monthly invoice&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
