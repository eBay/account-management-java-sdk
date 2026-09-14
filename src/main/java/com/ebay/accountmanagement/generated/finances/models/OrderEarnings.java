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
 * The base response type of the &lt;b&gt;getOrderEarnings&lt;/b&gt; method, which includes pagination output fields and a collection of orders that match the request criteria.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrderEarnings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The URI for the current page of results.
     */
    private String href;
    /**
     * The maximum number of order earnings records returned in a single page of results.
     */
    private Long limit;
    /**
     * The URI for the next page of results. This field is only returned if there is a next page of results to retrieve.
     */
    private String next;
    /**
     * The number of order earnings records skipped before returning the current page of results.
     */
    private Long offset;
    /**
     * The list of order earnings records returned in the current page of results. This array will be returned as empty if no orders match the request criteria.
     */
    private java.util.List<OrderEarning> orders;
    /**
     * The URI for the previous page of results. This field is only returned if there is a previous page of results to retrieve.
     */
    private String prev;
    /**
     * The total number of order earnings records that match the request criteria.
     */
    private Long total;
    /**
     * Instantiates a new {@link OrderEarnings} and sets the default values.
     */
    public OrderEarnings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrderEarnings}
     */
    @jakarta.annotation.Nonnull
    public static OrderEarnings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrderEarnings();
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
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getLongValue()); });
        deserializerMap.put("next", (n) -> { this.setNext(n.getStringValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getLongValue()); });
        deserializerMap.put("orders", (n) -> { this.setOrders(n.getCollectionOfObjectValues(OrderEarning::createFromDiscriminatorValue)); });
        deserializerMap.put("prev", (n) -> { this.setPrev(n.getStringValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the href property value. The URI for the current page of results.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHref() {
        return this.href;
    }
    /**
     * Gets the limit property value. The maximum number of order earnings records returned in a single page of results.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getLimit() {
        return this.limit;
    }
    /**
     * Gets the next property value. The URI for the next page of results. This field is only returned if there is a next page of results to retrieve.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNext() {
        return this.next;
    }
    /**
     * Gets the offset property value. The number of order earnings records skipped before returning the current page of results.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getOffset() {
        return this.offset;
    }
    /**
     * Gets the orders property value. The list of order earnings records returned in the current page of results. This array will be returned as empty if no orders match the request criteria.
     * @return a {@link java.util.List<OrderEarning>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrderEarning> getOrders() {
        return this.orders;
    }
    /**
     * Gets the prev property value. The URI for the previous page of results. This field is only returned if there is a previous page of results to retrieve.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrev() {
        return this.prev;
    }
    /**
     * Gets the total property value. The total number of order earnings records that match the request criteria.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotal() {
        return this.total;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("href", this.getHref());
        writer.writeLongValue("limit", this.getLimit());
        writer.writeStringValue("next", this.getNext());
        writer.writeLongValue("offset", this.getOffset());
        writer.writeCollectionOfObjectValues("orders", this.getOrders());
        writer.writeStringValue("prev", this.getPrev());
        writer.writeLongValue("total", this.getTotal());
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
     * Sets the href property value. The URI for the current page of results.
     * @param value Value to set for the href property.
     */
    public void setHref(@jakarta.annotation.Nullable final String value) {
        this.href = value;
    }
    /**
     * Sets the limit property value. The maximum number of order earnings records returned in a single page of results.
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Long value) {
        this.limit = value;
    }
    /**
     * Sets the next property value. The URI for the next page of results. This field is only returned if there is a next page of results to retrieve.
     * @param value Value to set for the next property.
     */
    public void setNext(@jakarta.annotation.Nullable final String value) {
        this.next = value;
    }
    /**
     * Sets the offset property value. The number of order earnings records skipped before returning the current page of results.
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Long value) {
        this.offset = value;
    }
    /**
     * Sets the orders property value. The list of order earnings records returned in the current page of results. This array will be returned as empty if no orders match the request criteria.
     * @param value Value to set for the orders property.
     */
    public void setOrders(@jakarta.annotation.Nullable final java.util.List<OrderEarning> value) {
        this.orders = value;
    }
    /**
     * Sets the prev property value. The URI for the previous page of results. This field is only returned if there is a previous page of results to retrieve.
     * @param value Value to set for the prev property.
     */
    public void setPrev(@jakarta.annotation.Nullable final String value) {
        this.prev = value;
    }
    /**
     * Sets the total property value. The total number of order earnings records that match the request criteria.
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Long value) {
        this.total = value;
    }
}
