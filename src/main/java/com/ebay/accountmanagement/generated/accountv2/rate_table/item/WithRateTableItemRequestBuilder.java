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

package com.ebay.accountmanagement.generated.accountv2.rate_table.item;

import com.ebay.accountmanagement.generated.accountv2.models.RateTableDetails;
import com.ebay.accountmanagement.generated.accountv2.rate_table.item.update_shipping_cost.UpdateShippingCostRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /rate_table/{rate_table_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithRateTableItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The update_shipping_cost property
     * @return a {@link UpdateShippingCostRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateShippingCostRequestBuilder updateShippingCost() {
        return new UpdateShippingCostRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithRateTableItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithRateTableItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/rate_table/{rate_table_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithRateTableItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithRateTableItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/rate_table/{rate_table_id}", rawUrl);
    }
    /**
     * This method retrieves an existing rate table identified by the &lt;b&gt;rate_table_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Shipping rate tables are currently supported by the following marketplaces: United States, Canada, United Kingdom, Germany, Australia, France, Italy, and Spain. A successful call returns detailed information for the specified shipping rate table.
     * @return a {@link RateTableDetails}
     */
    @jakarta.annotation.Nullable
    public RateTableDetails get() {
        return get(null);
    }
    /**
     * This method retrieves an existing rate table identified by the &lt;b&gt;rate_table_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Shipping rate tables are currently supported by the following marketplaces: United States, Canada, United Kingdom, Germany, Australia, France, Italy, and Spain. A successful call returns detailed information for the specified shipping rate table.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RateTableDetails}
     */
    @jakarta.annotation.Nullable
    public RateTableDetails get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, RateTableDetails::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves an existing rate table identified by the &lt;b&gt;rate_table_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Shipping rate tables are currently supported by the following marketplaces: United States, Canada, United Kingdom, Germany, Australia, France, Italy, and Spain. A successful call returns detailed information for the specified shipping rate table.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves an existing rate table identified by the &lt;b&gt;rate_table_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Shipping rate tables are currently supported by the following marketplaces: United States, Canada, United Kingdom, Germany, Australia, France, Italy, and Spain. A successful call returns detailed information for the specified shipping rate table.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithRateTableItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithRateTableItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithRateTableItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
