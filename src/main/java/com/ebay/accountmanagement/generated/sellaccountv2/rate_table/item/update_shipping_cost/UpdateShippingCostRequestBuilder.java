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

package com.ebay.accountmanagement.generated.sellaccountv2.rate_table.item.update_shipping_cost;

import com.ebay.accountmanagement.generated.sellaccountv2.models.RateTableUpdate;
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
 * Builds and executes requests for operations under /rate_table/{rate_table_id}/update_shipping_cost
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateShippingCostRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UpdateShippingCostRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateShippingCostRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/rate_table/{rate_table_id}/update_shipping_cost", pathParameters);
    }
    /**
     * Instantiates a new {@link UpdateShippingCostRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateShippingCostRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/rate_table/{rate_table_id}/update_shipping_cost", rawUrl);
    }
    /**
     * This method allows sellers to update &lt;b&gt;shippingCost&lt;/b&gt; and/or &lt;b&gt;additionalCost&lt;/b&gt; information for an existing shipping rate table identified by the &lt;b&gt;rate_table_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;A successful call returns an HTTP status code of &lt;b&gt;204 No Content&lt;/b&gt;.
     * @param body This type is used by the request payload of the &lt;b&gt;updateShippingCost&lt;/b&gt; method to pass updated shipping cost information for a rate table identified by &lt;b&gt;rateTableId&lt;/b&gt;.
     */
    public void post(@jakarta.annotation.Nonnull final RateTableUpdate body) {
        post(body, null);
    }
    /**
     * This method allows sellers to update &lt;b&gt;shippingCost&lt;/b&gt; and/or &lt;b&gt;additionalCost&lt;/b&gt; information for an existing shipping rate table identified by the &lt;b&gt;rate_table_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;A successful call returns an HTTP status code of &lt;b&gt;204 No Content&lt;/b&gt;.
     * @param body This type is used by the request payload of the &lt;b&gt;updateShippingCost&lt;/b&gt; method to pass updated shipping cost information for a rate table identified by &lt;b&gt;rateTableId&lt;/b&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nonnull final RateTableUpdate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method allows sellers to update &lt;b&gt;shippingCost&lt;/b&gt; and/or &lt;b&gt;additionalCost&lt;/b&gt; information for an existing shipping rate table identified by the &lt;b&gt;rate_table_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;A successful call returns an HTTP status code of &lt;b&gt;204 No Content&lt;/b&gt;.
     * @param body This type is used by the request payload of the &lt;b&gt;updateShippingCost&lt;/b&gt; method to pass updated shipping cost information for a rate table identified by &lt;b&gt;rateTableId&lt;/b&gt;.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RateTableUpdate body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method allows sellers to update &lt;b&gt;shippingCost&lt;/b&gt; and/or &lt;b&gt;additionalCost&lt;/b&gt; information for an existing shipping rate table identified by the &lt;b&gt;rate_table_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;A successful call returns an HTTP status code of &lt;b&gt;204 No Content&lt;/b&gt;.
     * @param body This type is used by the request payload of the &lt;b&gt;updateShippingCost&lt;/b&gt; method to pass updated shipping cost information for a rate table identified by &lt;b&gt;rateTableId&lt;/b&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RateTableUpdate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UpdateShippingCostRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateShippingCostRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UpdateShippingCostRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
