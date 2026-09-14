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

package com.ebay.accountmanagement.generated.accountv1.payment_policy;

import com.ebay.accountmanagement.generated.accountv1.models.Error;
import com.ebay.accountmanagement.generated.accountv1.models.PaymentPolicyRequest;
import com.ebay.accountmanagement.generated.accountv1.models.PaymentPolicyResponse;
import com.ebay.accountmanagement.generated.accountv1.models.SetPaymentPolicyResponse;
import com.ebay.accountmanagement.generated.accountv1.payment_policy.get_by_policy_name.GetByPolicyNameRequestBuilder;
import com.ebay.accountmanagement.generated.accountv1.payment_policy.item.WithPaymentPolicyItemRequestBuilder;
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
 * Builds and executes requests for operations under /payment_policy
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentPolicyRequestBuilder extends BaseRequestBuilder {
    /**
     * The get_by_policy_name property
     * @return a {@link GetByPolicyNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetByPolicyNameRequestBuilder getByPolicyName() {
        return new GetByPolicyNameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.ebay.accountmanagement.generated.accountv1.payment_policy.item collection
     * @param payment_policy_id This path parameter specifies the ID of the payment policy you want to retrieve. &lt;br&gt;&lt;br&gt; This ID can be retrieved for a payment policy by using the &lt;a href=&quot;/develop/api/sell/account_api_v1#sell-account_api_v1-payment_policy-getpaymentpolicies&quot; target=&quot;_blank &quot;&gt;getPaymentPolices&lt;/a&gt; method.
     * @return a {@link WithPaymentPolicyItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPaymentPolicyItemRequestBuilder byPayment_policy_id(@jakarta.annotation.Nonnull final String payment_policy_id) {
        Objects.requireNonNull(payment_policy_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("payment_policy_id", payment_policy_id);
        return new WithPaymentPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link PaymentPolicyRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PaymentPolicyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_policy", pathParameters);
    }
    /**
     * Instantiates a new {@link PaymentPolicyRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PaymentPolicyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_policy", rawUrl);
    }
    /**
     * This method retrieves all the payment business policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.
     * @return a {@link PaymentPolicyResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PaymentPolicyResponse get() {
        return get(null);
    }
    /**
     * This method retrieves all the payment business policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PaymentPolicyResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PaymentPolicyResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PaymentPolicyResponse::createFromDiscriminatorValue);
    }
    /**
     * This method creates a new payment policy where the policy encapsulates seller&apos;s terms for order payments. &lt;br&gt;&lt;br&gt;A successful request returns the &lt;b&gt;getPaymentPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href=&quot;/api-docs/sell/static/seller-accounts/business-policies.html&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;
     * @param body This root container defines a seller&apos;s payment business policy for a specific marketplace and category group. This type is used when creating or updating a payment business policy.
     * @return a {@link SetPaymentPolicyResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public SetPaymentPolicyResponse post(@jakarta.annotation.Nonnull final PaymentPolicyRequest body) {
        return post(body, null);
    }
    /**
     * This method creates a new payment policy where the policy encapsulates seller&apos;s terms for order payments. &lt;br&gt;&lt;br&gt;A successful request returns the &lt;b&gt;getPaymentPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href=&quot;/api-docs/sell/static/seller-accounts/business-policies.html&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;
     * @param body This root container defines a seller&apos;s payment business policy for a specific marketplace and category group. This type is used when creating or updating a payment business policy.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SetPaymentPolicyResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public SetPaymentPolicyResponse post(@jakarta.annotation.Nonnull final PaymentPolicyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SetPaymentPolicyResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves all the payment business policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves all the payment business policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, "{+baseurl}/payment_policy?marketplace_id={marketplace_id}", pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * This method creates a new payment policy where the policy encapsulates seller&apos;s terms for order payments. &lt;br&gt;&lt;br&gt;A successful request returns the &lt;b&gt;getPaymentPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href=&quot;/api-docs/sell/static/seller-accounts/business-policies.html&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;
     * @param body This root container defines a seller&apos;s payment business policy for a specific marketplace and category group. This type is used when creating or updating a payment business policy.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PaymentPolicyRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method creates a new payment policy where the policy encapsulates seller&apos;s terms for order payments. &lt;br&gt;&lt;br&gt;A successful request returns the &lt;b&gt;getPaymentPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href=&quot;/api-docs/sell/static/seller-accounts/business-policies.html&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;
     * @param body This root container defines a seller&apos;s payment business policy for a specific marketplace and category group. This type is used when creating or updating a payment business policy.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PaymentPolicyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link PaymentPolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PaymentPolicyRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PaymentPolicyRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method retrieves all the payment business policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter specifies the eBay marketplace of the policies you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/develop/api/sell/account_api_v1#sell-account_api_v1-payment_policy-getpaymentpolicies.marketplaceidenum
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
