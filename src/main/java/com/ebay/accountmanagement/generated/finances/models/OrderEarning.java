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
 * This type defines the earnings details for a single order. It includes information associated with the order, such as an informatiuon about the buyer, an order summary, and an order earnings summary.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrderEarning implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type defines identifying information about the buyer associated with an order.
     */
    private BuyerWithId buyer;
    /**
     * The date the order was created and payment was successful.
     */
    private String orderCreationDate;
    /**
     * This type defines a summarized view of earnings information derived from one order. It defines fields that provides a summarized view of earnings information derived from one order including aggregated financial values for gross amount, expenses, earnings, and refunds. 
     */
    private EarningsSummary orderEarningsSummary;
    /**
     * The unique identifier of the order.
     */
    private String orderId;
    /**
     * The date when the order was last modified.
     */
    private String orderLastModifiedDate;
    /**
     * This type provides order cost details, including line item subtotal, shipping and handling, seller-collected taxes, and any seller applied discounts. Always provided in the listing currency.
     */
    private OrderSummary orderSummary;
    /**
     * Instantiates a new {@link OrderEarning} and sets the default values.
     */
    public OrderEarning() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrderEarning}
     */
    @jakarta.annotation.Nonnull
    public static OrderEarning createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrderEarning();
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
     * Gets the buyer property value. This type defines identifying information about the buyer associated with an order.
     * @return a {@link BuyerWithId}
     */
    @jakarta.annotation.Nullable
    public BuyerWithId getBuyer() {
        return this.buyer;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("buyer", (n) -> { this.setBuyer(n.getObjectValue(BuyerWithId::createFromDiscriminatorValue)); });
        deserializerMap.put("orderCreationDate", (n) -> { this.setOrderCreationDate(n.getStringValue()); });
        deserializerMap.put("orderEarningsSummary", (n) -> { this.setOrderEarningsSummary(n.getObjectValue(EarningsSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("orderId", (n) -> { this.setOrderId(n.getStringValue()); });
        deserializerMap.put("orderLastModifiedDate", (n) -> { this.setOrderLastModifiedDate(n.getStringValue()); });
        deserializerMap.put("orderSummary", (n) -> { this.setOrderSummary(n.getObjectValue(OrderSummary::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the orderCreationDate property value. The date the order was created and payment was successful.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrderCreationDate() {
        return this.orderCreationDate;
    }
    /**
     * Gets the orderEarningsSummary property value. This type defines a summarized view of earnings information derived from one order. It defines fields that provides a summarized view of earnings information derived from one order including aggregated financial values for gross amount, expenses, earnings, and refunds. 
     * @return a {@link EarningsSummary}
     */
    @jakarta.annotation.Nullable
    public EarningsSummary getOrderEarningsSummary() {
        return this.orderEarningsSummary;
    }
    /**
     * Gets the orderId property value. The unique identifier of the order.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Gets the orderLastModifiedDate property value. The date when the order was last modified.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrderLastModifiedDate() {
        return this.orderLastModifiedDate;
    }
    /**
     * Gets the orderSummary property value. This type provides order cost details, including line item subtotal, shipping and handling, seller-collected taxes, and any seller applied discounts. Always provided in the listing currency.
     * @return a {@link OrderSummary}
     */
    @jakarta.annotation.Nullable
    public OrderSummary getOrderSummary() {
        return this.orderSummary;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("buyer", this.getBuyer());
        writer.writeStringValue("orderCreationDate", this.getOrderCreationDate());
        writer.writeObjectValue("orderEarningsSummary", this.getOrderEarningsSummary());
        writer.writeStringValue("orderId", this.getOrderId());
        writer.writeStringValue("orderLastModifiedDate", this.getOrderLastModifiedDate());
        writer.writeObjectValue("orderSummary", this.getOrderSummary());
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
     * Sets the buyer property value. This type defines identifying information about the buyer associated with an order.
     * @param value Value to set for the buyer property.
     */
    public void setBuyer(@jakarta.annotation.Nullable final BuyerWithId value) {
        this.buyer = value;
    }
    /**
     * Sets the orderCreationDate property value. The date the order was created and payment was successful.
     * @param value Value to set for the orderCreationDate property.
     */
    public void setOrderCreationDate(@jakarta.annotation.Nullable final String value) {
        this.orderCreationDate = value;
    }
    /**
     * Sets the orderEarningsSummary property value. This type defines a summarized view of earnings information derived from one order. It defines fields that provides a summarized view of earnings information derived from one order including aggregated financial values for gross amount, expenses, earnings, and refunds. 
     * @param value Value to set for the orderEarningsSummary property.
     */
    public void setOrderEarningsSummary(@jakarta.annotation.Nullable final EarningsSummary value) {
        this.orderEarningsSummary = value;
    }
    /**
     * Sets the orderId property value. The unique identifier of the order.
     * @param value Value to set for the orderId property.
     */
    public void setOrderId(@jakarta.annotation.Nullable final String value) {
        this.orderId = value;
    }
    /**
     * Sets the orderLastModifiedDate property value. The date when the order was last modified.
     * @param value Value to set for the orderLastModifiedDate property.
     */
    public void setOrderLastModifiedDate(@jakarta.annotation.Nullable final String value) {
        this.orderLastModifiedDate = value;
    }
    /**
     * Sets the orderSummary property value. This type provides order cost details, including line item subtotal, shipping and handling, seller-collected taxes, and any seller applied discounts. Always provided in the listing currency.
     * @param value Value to set for the orderSummary property.
     */
    public void setOrderSummary(@jakarta.annotation.Nullable final OrderSummary value) {
        this.orderSummary = value;
    }
}
