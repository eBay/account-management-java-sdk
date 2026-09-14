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

package com.ebay.accountmanagement.generated.accountv1.fulfillment_policy.get_by_policy_name;

import com.ebay.accountmanagement.generated.accountv1.models.Error;
import com.ebay.accountmanagement.generated.accountv1.models.FulfillmentPolicy;
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
 * Builds and executes requests for operations under /fulfillment_policy/get_by_policy_name
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetByPolicyNameRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetByPolicyNameRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetByPolicyNameRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/fulfillment_policy/get_by_policy_name?marketplace_id={marketplace_id}&name={name}", pathParameters);
    }
    /**
     * Instantiates a new {@link GetByPolicyNameRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetByPolicyNameRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/fulfillment_policy/get_by_policy_name?marketplace_id={marketplace_id}&name={name}", rawUrl);
    }
    /**
     * This method retrieves the details for a specific fulfillment policy. In the request, supply both the policy &lt;code&gt;name&lt;/code&gt; and its associated &lt;code&gt;marketplace_id&lt;/code&gt; as query parameters.
     * @return a {@link FulfillmentPolicy}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public FulfillmentPolicy get() {
        return get(null);
    }
    /**
     * This method retrieves the details for a specific fulfillment policy. In the request, supply both the policy &lt;code&gt;name&lt;/code&gt; and its associated &lt;code&gt;marketplace_id&lt;/code&gt; as query parameters.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link FulfillmentPolicy}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public FulfillmentPolicy get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, FulfillmentPolicy::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves the details for a specific fulfillment policy. In the request, supply both the policy &lt;code&gt;name&lt;/code&gt; and its associated &lt;code&gt;marketplace_id&lt;/code&gt; as query parameters.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the details for a specific fulfillment policy. In the request, supply both the policy &lt;code&gt;name&lt;/code&gt; and its associated &lt;code&gt;marketplace_id&lt;/code&gt; as query parameters.
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
     * @return a {@link GetByPolicyNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetByPolicyNameRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetByPolicyNameRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method retrieves the details for a specific fulfillment policy. In the request, supply both the policy &lt;code&gt;name&lt;/code&gt; and its associated &lt;code&gt;marketplace_id&lt;/code&gt; as query parameters.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter specifies the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/develop/api/sell/account_api_v1#sell-account_api_v1-fulfillment_policy-getfulfillmentpolicybyname.marketplaceidenum
         */
        @jakarta.annotation.Nullable
        public String marketplaceId;
        /**
         * This query parameter specifies the seller-defined name of the fulfillment policy you want to retrieve.&lt;br&gt;&lt;br&gt;This value can be retrieved for a fulfillment policy by using the &lt;a href=&quot;/develop/api/sell/account_api_v1#sell-account_api_v1-fulfillment_policy-getfulfillmentpolicies&quot; target=&quot;_blank &quot;&gt;getFulfillmentPolicies&lt;/a&gt; method.
         */
        @jakarta.annotation.Nullable
        public String name;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("marketplace_id", marketplaceId);
            allQueryParams.put("name", name);
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
