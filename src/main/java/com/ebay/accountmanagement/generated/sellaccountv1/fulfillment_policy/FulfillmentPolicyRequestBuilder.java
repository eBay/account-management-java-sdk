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

package com.ebay.accountmanagement.generated.sellaccountv1.fulfillment_policy;

import com.ebay.accountmanagement.generated.sellaccountv1.fulfillment_policy.get_by_policy_name.GetByPolicyNameRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv1.fulfillment_policy.item.WithFulfillmentPolicyItemRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv1.models.FulfillmentPolicyResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Builds and executes requests for operations under /fulfillment_policy
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FulfillmentPolicyRequestBuilder extends BaseRequestBuilder {
    /**
     * The EmptyPathSegment property
     * @return a {@link EmptyPathSegmentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EmptyPathSegmentRequestBuilder emptyPathSegment() {
        return new EmptyPathSegmentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_by_policy_name property
     * @return a {@link GetByPolicyNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetByPolicyNameRequestBuilder getByPolicyName() {
        return new GetByPolicyNameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.ebay.accountmanagement.generated.sellaccountv1.fulfillment_policy.item collection
     * @param fulfillmentPolicyId This path parameter specifies the ID of the fulfillment policy you want to retrieve.&lt;br&gt;&lt;br&gt; This ID can be retrieved for a fulfillment policy by using the &lt;a href=&quot;/api-docs/sell/account/resources/fulfillment_policy/methods/getFulfillmentPolicies&quot; target=&quot;_blank &quot;&gt;getFulfillmentPolicies&lt;/a&gt; method.
     * @return a {@link WithFulfillmentPolicyItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithFulfillmentPolicyItemRequestBuilder byFulfillmentPolicyId(@jakarta.annotation.Nonnull final String fulfillmentPolicyId) {
        Objects.requireNonNull(fulfillmentPolicyId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("fulfillmentPolicyId", fulfillmentPolicyId);
        return new WithFulfillmentPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link FulfillmentPolicyRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FulfillmentPolicyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/fulfillment_policy?marketplace_id={marketplace_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link FulfillmentPolicyRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FulfillmentPolicyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/fulfillment_policy?marketplace_id={marketplace_id}", rawUrl);
    }
    /**
     * This method retrieves all the fulfillment policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.
     * @return a {@link FulfillmentPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public FulfillmentPolicyResponse get() {
        return get(null);
    }
    /**
     * This method retrieves all the fulfillment policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link FulfillmentPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public FulfillmentPolicyResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, FulfillmentPolicyResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves all the fulfillment policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves all the fulfillment policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link FulfillmentPolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FulfillmentPolicyRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new FulfillmentPolicyRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method retrieves all the fulfillment policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter specifies the eBay marketplace of the policies you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
         */
        @jakarta.annotation.Nullable
        public String marketplaceId;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("marketplace_id", marketplaceId);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
