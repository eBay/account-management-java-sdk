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

import com.ebay.accountmanagement.generated.sellaccountv1.models.FulfillmentPolicyRequest;
import com.ebay.accountmanagement.generated.sellaccountv1.models.SetFulfillmentPolicyResponse;
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
 * Builds and executes requests for operations under /fulfillment_policy/
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmptyPathSegmentRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link EmptyPathSegmentRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EmptyPathSegmentRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/fulfillment_policy/", pathParameters);
    }
    /**
     * Instantiates a new {@link EmptyPathSegmentRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EmptyPathSegmentRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/fulfillment_policy/", rawUrl);
    }
    /**
     * This method creates a new fulfillment policy for an eBay marketplace where the policy encapsulates seller&apos;s terms for fulfilling item purchases. Fulfillment policies include the shipment options that the seller offers to buyers.  &lt;br&gt;&lt;br&gt;A successful request returns the &lt;b&gt;getFulfillmentPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href=&quot;/api-docs/sell/static/seller-accounts/business-policies.html&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;
     * @param body This root container defines a seller&apos;s fulfillment policy for a specific marketplace and category group. This type is used when creating or updating a fulfillment business policy.
     * @return a {@link SetFulfillmentPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public SetFulfillmentPolicyResponse post(@jakarta.annotation.Nonnull final FulfillmentPolicyRequest body) {
        return post(body, null);
    }
    /**
     * This method creates a new fulfillment policy for an eBay marketplace where the policy encapsulates seller&apos;s terms for fulfilling item purchases. Fulfillment policies include the shipment options that the seller offers to buyers.  &lt;br&gt;&lt;br&gt;A successful request returns the &lt;b&gt;getFulfillmentPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href=&quot;/api-docs/sell/static/seller-accounts/business-policies.html&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;
     * @param body This root container defines a seller&apos;s fulfillment policy for a specific marketplace and category group. This type is used when creating or updating a fulfillment business policy.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SetFulfillmentPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public SetFulfillmentPolicyResponse post(@jakarta.annotation.Nonnull final FulfillmentPolicyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SetFulfillmentPolicyResponse::createFromDiscriminatorValue);
    }
    /**
     * This method creates a new fulfillment policy for an eBay marketplace where the policy encapsulates seller&apos;s terms for fulfilling item purchases. Fulfillment policies include the shipment options that the seller offers to buyers.  &lt;br&gt;&lt;br&gt;A successful request returns the &lt;b&gt;getFulfillmentPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href=&quot;/api-docs/sell/static/seller-accounts/business-policies.html&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;
     * @param body This root container defines a seller&apos;s fulfillment policy for a specific marketplace and category group. This type is used when creating or updating a fulfillment business policy.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final FulfillmentPolicyRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method creates a new fulfillment policy for an eBay marketplace where the policy encapsulates seller&apos;s terms for fulfilling item purchases. Fulfillment policies include the shipment options that the seller offers to buyers.  &lt;br&gt;&lt;br&gt;A successful request returns the &lt;b&gt;getFulfillmentPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href=&quot;/api-docs/sell/static/seller-accounts/business-policies.html&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;
     * @param body This root container defines a seller&apos;s fulfillment policy for a specific marketplace and category group. This type is used when creating or updating a fulfillment business policy.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final FulfillmentPolicyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
