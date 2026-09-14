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

package com.ebay.accountmanagement.generated.accountv1.custom_policy;

import com.ebay.accountmanagement.generated.accountv1.models.CustomPolicyCreateRequest;
import com.ebay.accountmanagement.generated.accountv1.models.CustomPolicyResponse;
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
 * Builds and executes requests for operations under /custom_policy/
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmptyPathSegmentRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link EmptyPathSegmentRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EmptyPathSegmentRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/custom_policy/{?policy_types*}", pathParameters);
    }
    /**
     * Instantiates a new {@link EmptyPathSegmentRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EmptyPathSegmentRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/custom_policy/{?policy_types*}", rawUrl);
    }
    /**
     * This method retrieves the list of custom policies defined for a seller&apos;s account. To limit the returned custom policies, specify the &lt;b&gt;policy_types&lt;/b&gt; query parameter.
     * @return a {@link CustomPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public CustomPolicyResponse get() {
        return get(null);
    }
    /**
     * This method retrieves the list of custom policies defined for a seller&apos;s account. To limit the returned custom policies, specify the &lt;b&gt;policy_types&lt;/b&gt; query parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CustomPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public CustomPolicyResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CustomPolicyResponse::createFromDiscriminatorValue);
    }
    /**
     * This method creates a new custom policy that specifies the seller&apos;s terms for complying with local governmental regulations. Each Custom Policy targets a &lt;b&gt;policyType&lt;/b&gt;. Multiple policies may be created as using the following custom policy types:&lt;ul&gt;&lt;li&gt;PRODUCT_COMPLIANCE: Product Compliance policies disclose product information as required for regulatory compliance. &lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; A maximum of 60 Product Compliance policies per seller may be created.&lt;/span&gt;&lt;/li&gt;&lt;li&gt;TAKE_BACK: Takeback policies describe the seller&apos;s legal obligation to take back a previously purchased item when the buyer purchases a new one. &lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; A maximum of 18 Takeback policies per seller may be created.&lt;/span&gt;&lt;/li&gt;&lt;/ul&gt;A successful create policy call returns an HTTP status code of &lt;b&gt;201 Created&lt;/b&gt; with the system-generated policy ID included in the Location response header.
     * @param body This type is used by the request payload of the createCustomPolicy method to define a new custom policy for a specific marketplace.
     * @return a {@link PostResponse}
     */
    @jakarta.annotation.Nullable
    public PostResponse post(@jakarta.annotation.Nonnull final CustomPolicyCreateRequest body) {
        return post(body, null);
    }
    /**
     * This method creates a new custom policy that specifies the seller&apos;s terms for complying with local governmental regulations. Each Custom Policy targets a &lt;b&gt;policyType&lt;/b&gt;. Multiple policies may be created as using the following custom policy types:&lt;ul&gt;&lt;li&gt;PRODUCT_COMPLIANCE: Product Compliance policies disclose product information as required for regulatory compliance. &lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; A maximum of 60 Product Compliance policies per seller may be created.&lt;/span&gt;&lt;/li&gt;&lt;li&gt;TAKE_BACK: Takeback policies describe the seller&apos;s legal obligation to take back a previously purchased item when the buyer purchases a new one. &lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; A maximum of 18 Takeback policies per seller may be created.&lt;/span&gt;&lt;/li&gt;&lt;/ul&gt;A successful create policy call returns an HTTP status code of &lt;b&gt;201 Created&lt;/b&gt; with the system-generated policy ID included in the Location response header.
     * @param body This type is used by the request payload of the createCustomPolicy method to define a new custom policy for a specific marketplace.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PostResponse}
     */
    @jakarta.annotation.Nullable
    public PostResponse post(@jakarta.annotation.Nonnull final CustomPolicyCreateRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PostResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves the list of custom policies defined for a seller&apos;s account. To limit the returned custom policies, specify the &lt;b&gt;policy_types&lt;/b&gt; query parameter.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the list of custom policies defined for a seller&apos;s account. To limit the returned custom policies, specify the &lt;b&gt;policy_types&lt;/b&gt; query parameter.
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
     * This method creates a new custom policy that specifies the seller&apos;s terms for complying with local governmental regulations. Each Custom Policy targets a &lt;b&gt;policyType&lt;/b&gt;. Multiple policies may be created as using the following custom policy types:&lt;ul&gt;&lt;li&gt;PRODUCT_COMPLIANCE: Product Compliance policies disclose product information as required for regulatory compliance. &lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; A maximum of 60 Product Compliance policies per seller may be created.&lt;/span&gt;&lt;/li&gt;&lt;li&gt;TAKE_BACK: Takeback policies describe the seller&apos;s legal obligation to take back a previously purchased item when the buyer purchases a new one. &lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; A maximum of 18 Takeback policies per seller may be created.&lt;/span&gt;&lt;/li&gt;&lt;/ul&gt;A successful create policy call returns an HTTP status code of &lt;b&gt;201 Created&lt;/b&gt; with the system-generated policy ID included in the Location response header.
     * @param body This type is used by the request payload of the createCustomPolicy method to define a new custom policy for a specific marketplace.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CustomPolicyCreateRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method creates a new custom policy that specifies the seller&apos;s terms for complying with local governmental regulations. Each Custom Policy targets a &lt;b&gt;policyType&lt;/b&gt;. Multiple policies may be created as using the following custom policy types:&lt;ul&gt;&lt;li&gt;PRODUCT_COMPLIANCE: Product Compliance policies disclose product information as required for regulatory compliance. &lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; A maximum of 60 Product Compliance policies per seller may be created.&lt;/span&gt;&lt;/li&gt;&lt;li&gt;TAKE_BACK: Takeback policies describe the seller&apos;s legal obligation to take back a previously purchased item when the buyer purchases a new one. &lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; A maximum of 18 Takeback policies per seller may be created.&lt;/span&gt;&lt;/li&gt;&lt;/ul&gt;A successful create policy call returns an HTTP status code of &lt;b&gt;201 Created&lt;/b&gt; with the system-generated policy ID included in the Location response header.
     * @param body This type is used by the request payload of the createCustomPolicy method to define a new custom policy for a specific marketplace.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CustomPolicyCreateRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link EmptyPathSegmentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EmptyPathSegmentRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EmptyPathSegmentRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method retrieves the list of custom policies defined for a seller&apos;s account. To limit the returned custom policies, specify the &lt;b&gt;policy_types&lt;/b&gt; query parameter.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter specifies the type of custom policies to be returned.&lt;br&gt;&lt;br&gt;Multiple policy types may be requested in a single call by providing a comma-delimited set of all policy types to be returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Omitting this query parameter from a request will also return policies of all policy types.&lt;/span&gt;&lt;br&gt; See the &lt;a href=&quot;/api-docs/sell/account/types/api:CustomPolicyTypeEnum&quot; target=&quot;_blank &quot;&gt;CustomPolicyTypeEnum&lt;/a&gt; type for a list of supported values.
         */
        @jakarta.annotation.Nullable
        public String policyTypes;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("policy_types", policyTypes);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
