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

package com.ebay.accountmanagement.generated.sellaccountv1.custom_policy;

import com.ebay.accountmanagement.generated.sellaccountv1.custom_policy.item.WithCustomPolicyItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /custom_policy
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomPolicyRequestBuilder extends BaseRequestBuilder {
    /**
     * The EmptyPathSegment property
     * @return a {@link EmptyPathSegmentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EmptyPathSegmentRequestBuilder emptyPathSegment() {
        return new EmptyPathSegmentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.ebay.accountmanagement.generated.sellaccountv1.custom_policy.item collection
     * @param custom_policy_id This path parameter is the unique identifier of the custom policy to retrieve.&lt;br&gt;&lt;br&gt; This ID can be retrieved for a custom policy by using the &lt;a href=&quot;/api-docs/sell/account/resources/custom_policy/methods/getCustomPolicies&quot; target=&quot;_blank &quot;&gt;getCustomPolicies&lt;/a&gt; method.
     * @return a {@link WithCustomPolicyItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCustomPolicyItemRequestBuilder byCustom_policy_id(@jakarta.annotation.Nonnull final String custom_policy_id) {
        Objects.requireNonNull(custom_policy_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("custom_policy_id", custom_policy_id);
        return new WithCustomPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CustomPolicyRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CustomPolicyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/custom_policy", pathParameters);
    }
    /**
     * Instantiates a new {@link CustomPolicyRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CustomPolicyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/custom_policy", rawUrl);
    }
}
