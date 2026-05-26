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

package com.ebay.accountmanagement.generated.sellfinancesv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is the base response type of the &lt;strong&gt;getPayouts&lt;/strong&gt; method, and contains an array of one or more payouts (that match the input criteria), the total count of payouts in the response, and various pagination data for the results set.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Payouts implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The URI of the &lt;b&gt;getPayouts&lt;/b&gt; call request that produced the current page of the result set.
     */
    private String href;
    /**
     * The maximum number of payouts that may be returned per page of the result set. The &lt;strong&gt;limit&lt;/strong&gt; value can be passed in as a query parameter, or if omitted, its value defaults to &lt;code&gt;20&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If this is the last or only page of the result set, the page may contain fewer payouts than the &lt;strong&gt;limit&lt;/strong&gt; value.  To determine the number of pages in a result set, divide the &lt;b&gt;total&lt;/b&gt; value (total number of payouts matching input criteria) by this &lt;strong&gt;limit&lt;/strong&gt; value, and then round up to the next integer. For example, if the &lt;b&gt;total&lt;/b&gt; value was &lt;code&gt;120&lt;/code&gt; (120 total payouts) and the &lt;strong&gt;limit&lt;/strong&gt; value was &lt;code&gt;50&lt;/code&gt; (show 50 payouts per page), the total number of pages in the result set is three, so the seller would have to make three separate &lt;strong&gt;getPayouts&lt;/strong&gt; calls to view all payouts matching the input criteria. &lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; &lt;code&gt;200&lt;/code&gt; &lt;br&gt; &lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;20&lt;/code&gt;
     */
    private Integer limit;
    /**
     * The &lt;b&gt;getPayouts&lt;/b&gt; call URI to use if you wish to view the next page of the result set. &lt;br&gt;&lt;br&gt;This field is only returned if there is a next page of results to view based on the current input criteria.
     */
    private String next;
    /**
     * This integer value indicates the actual position that the first payout returned on the current page has in the results set. So, if you wanted to view the 11th payout of the result set, you would set the &lt;strong&gt;offset&lt;/strong&gt; value in the request to &lt;code&gt;10&lt;/code&gt;. &lt;br&gt;&lt;br&gt;In the request, you can use the &lt;b&gt;offset&lt;/b&gt; parameter in conjunction with the &lt;b&gt;limit&lt;/b&gt; parameter to control the pagination of the output. For example, if &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;30&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the call retrieves payouts 31 thru 40 from the resulting collection of payouts. &lt;br&gt;&lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;0&lt;/code&gt; (zero)
     */
    private Integer offset;
    /**
     * An array of one or more payouts that match the input criteria. Details for each payout include the unique identifier of the payout, the status of the payout, the amount of the payout, and the number of monetary transactions associated with the payout.
     */
    private java.util.List<Payout> payouts;
    /**
     * The &lt;b&gt;getPayouts&lt;/b&gt; call URI to use if you wish to view the previous page of the result set. &lt;br&gt;&lt;br&gt;This field is only returned if there is a previous page of results to view based on the current input criteria.
     */
    private String prev;
    /**
     * This integer value is the total number of payouts in the results set based on the current input criteria. Based on the total number of payouts that match the criteria, and on the &lt;strong&gt;limit&lt;/strong&gt; and &lt;strong&gt;offset&lt;/strong&gt; values, there may be additional pages in the results set.
     */
    private Integer total;
    /**
     * Instantiates a new {@link Payouts} and sets the default values.
     */
    public Payouts() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Payouts}
     */
    @jakarta.annotation.Nonnull
    public static Payouts createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Payouts();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("href", (n) -> { this.setHref(n.getStringValue()); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("next", (n) -> { this.setNext(n.getStringValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        deserializerMap.put("payouts", (n) -> { this.setPayouts(n.getCollectionOfObjectValues(Payout::createFromDiscriminatorValue)); });
        deserializerMap.put("prev", (n) -> { this.setPrev(n.getStringValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the href property value. The URI of the &lt;b&gt;getPayouts&lt;/b&gt; call request that produced the current page of the result set.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHref() {
        return this.href;
    }
    /**
     * Gets the limit property value. The maximum number of payouts that may be returned per page of the result set. The &lt;strong&gt;limit&lt;/strong&gt; value can be passed in as a query parameter, or if omitted, its value defaults to &lt;code&gt;20&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If this is the last or only page of the result set, the page may contain fewer payouts than the &lt;strong&gt;limit&lt;/strong&gt; value.  To determine the number of pages in a result set, divide the &lt;b&gt;total&lt;/b&gt; value (total number of payouts matching input criteria) by this &lt;strong&gt;limit&lt;/strong&gt; value, and then round up to the next integer. For example, if the &lt;b&gt;total&lt;/b&gt; value was &lt;code&gt;120&lt;/code&gt; (120 total payouts) and the &lt;strong&gt;limit&lt;/strong&gt; value was &lt;code&gt;50&lt;/code&gt; (show 50 payouts per page), the total number of pages in the result set is three, so the seller would have to make three separate &lt;strong&gt;getPayouts&lt;/strong&gt; calls to view all payouts matching the input criteria. &lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; &lt;code&gt;200&lt;/code&gt; &lt;br&gt; &lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;20&lt;/code&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the next property value. The &lt;b&gt;getPayouts&lt;/b&gt; call URI to use if you wish to view the next page of the result set. &lt;br&gt;&lt;br&gt;This field is only returned if there is a next page of results to view based on the current input criteria.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNext() {
        return this.next;
    }
    /**
     * Gets the offset property value. This integer value indicates the actual position that the first payout returned on the current page has in the results set. So, if you wanted to view the 11th payout of the result set, you would set the &lt;strong&gt;offset&lt;/strong&gt; value in the request to &lt;code&gt;10&lt;/code&gt;. &lt;br&gt;&lt;br&gt;In the request, you can use the &lt;b&gt;offset&lt;/b&gt; parameter in conjunction with the &lt;b&gt;limit&lt;/b&gt; parameter to control the pagination of the output. For example, if &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;30&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the call retrieves payouts 31 thru 40 from the resulting collection of payouts. &lt;br&gt;&lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;0&lt;/code&gt; (zero)
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Gets the payouts property value. An array of one or more payouts that match the input criteria. Details for each payout include the unique identifier of the payout, the status of the payout, the amount of the payout, and the number of monetary transactions associated with the payout.
     * @return a {@link java.util.List<Payout>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Payout> getPayouts() {
        return this.payouts;
    }
    /**
     * Gets the prev property value. The &lt;b&gt;getPayouts&lt;/b&gt; call URI to use if you wish to view the previous page of the result set. &lt;br&gt;&lt;br&gt;This field is only returned if there is a previous page of results to view based on the current input criteria.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrev() {
        return this.prev;
    }
    /**
     * Gets the total property value. This integer value is the total number of payouts in the results set based on the current input criteria. Based on the total number of payouts that match the criteria, and on the &lt;strong&gt;limit&lt;/strong&gt; and &lt;strong&gt;offset&lt;/strong&gt; values, there may be additional pages in the results set.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotal() {
        return this.total;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("href", this.getHref());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeStringValue("next", this.getNext());
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeCollectionOfObjectValues("payouts", this.getPayouts());
        writer.writeStringValue("prev", this.getPrev());
        writer.writeIntegerValue("total", this.getTotal());
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
     * Sets the href property value. The URI of the &lt;b&gt;getPayouts&lt;/b&gt; call request that produced the current page of the result set.
     * @param value Value to set for the href property.
     */
    public void setHref(@jakarta.annotation.Nullable final String value) {
        this.href = value;
    }
    /**
     * Sets the limit property value. The maximum number of payouts that may be returned per page of the result set. The &lt;strong&gt;limit&lt;/strong&gt; value can be passed in as a query parameter, or if omitted, its value defaults to &lt;code&gt;20&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If this is the last or only page of the result set, the page may contain fewer payouts than the &lt;strong&gt;limit&lt;/strong&gt; value.  To determine the number of pages in a result set, divide the &lt;b&gt;total&lt;/b&gt; value (total number of payouts matching input criteria) by this &lt;strong&gt;limit&lt;/strong&gt; value, and then round up to the next integer. For example, if the &lt;b&gt;total&lt;/b&gt; value was &lt;code&gt;120&lt;/code&gt; (120 total payouts) and the &lt;strong&gt;limit&lt;/strong&gt; value was &lt;code&gt;50&lt;/code&gt; (show 50 payouts per page), the total number of pages in the result set is three, so the seller would have to make three separate &lt;strong&gt;getPayouts&lt;/strong&gt; calls to view all payouts matching the input criteria. &lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; &lt;code&gt;200&lt;/code&gt; &lt;br&gt; &lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;20&lt;/code&gt;
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the next property value. The &lt;b&gt;getPayouts&lt;/b&gt; call URI to use if you wish to view the next page of the result set. &lt;br&gt;&lt;br&gt;This field is only returned if there is a next page of results to view based on the current input criteria.
     * @param value Value to set for the next property.
     */
    public void setNext(@jakarta.annotation.Nullable final String value) {
        this.next = value;
    }
    /**
     * Sets the offset property value. This integer value indicates the actual position that the first payout returned on the current page has in the results set. So, if you wanted to view the 11th payout of the result set, you would set the &lt;strong&gt;offset&lt;/strong&gt; value in the request to &lt;code&gt;10&lt;/code&gt;. &lt;br&gt;&lt;br&gt;In the request, you can use the &lt;b&gt;offset&lt;/b&gt; parameter in conjunction with the &lt;b&gt;limit&lt;/b&gt; parameter to control the pagination of the output. For example, if &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;30&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the call retrieves payouts 31 thru 40 from the resulting collection of payouts. &lt;br&gt;&lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;0&lt;/code&gt; (zero)
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
    /**
     * Sets the payouts property value. An array of one or more payouts that match the input criteria. Details for each payout include the unique identifier of the payout, the status of the payout, the amount of the payout, and the number of monetary transactions associated with the payout.
     * @param value Value to set for the payouts property.
     */
    public void setPayouts(@jakarta.annotation.Nullable final java.util.List<Payout> value) {
        this.payouts = value;
    }
    /**
     * Sets the prev property value. The &lt;b&gt;getPayouts&lt;/b&gt; call URI to use if you wish to view the previous page of the result set. &lt;br&gt;&lt;br&gt;This field is only returned if there is a previous page of results to view based on the current input criteria.
     * @param value Value to set for the prev property.
     */
    public void setPrev(@jakarta.annotation.Nullable final String value) {
        this.prev = value;
    }
    /**
     * Sets the total property value. This integer value is the total number of payouts in the results set based on the current input criteria. Based on the total number of payouts that match the criteria, and on the &lt;strong&gt;limit&lt;/strong&gt; and &lt;strong&gt;offset&lt;/strong&gt; values, there may be additional pages in the results set.
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Integer value) {
        this.total = value;
    }
}
