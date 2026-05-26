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

package com.ebay.accountmanagement.generated.sellaccountv1.custom_policy.item;

import com.ebay.accountmanagement.generated.sellaccountv1.models.CustomPolicy;
import com.ebay.accountmanagement.generated.sellaccountv1.models.CustomPolicyRequest;
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
 * Builds and executes requests for operations under /custom_policy/{custom_policy_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithCustomPolicyItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithCustomPolicyItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCustomPolicyItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/custom_policy/{custom_policy_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithCustomPolicyItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCustomPolicyItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/custom_policy/{custom_policy_id}", rawUrl);
    }
    /**
     * This method retrieves the custom policy specified by the &lt;b&gt;custom_policy_id&lt;/b&gt; path parameter.
     * @return a {@link CustomPolicy}
     */
    @jakarta.annotation.Nullable
    public CustomPolicy get() {
        return get(null);
    }
    /**
     * This method retrieves the custom policy specified by the &lt;b&gt;custom_policy_id&lt;/b&gt; path parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CustomPolicy}
     */
    @jakarta.annotation.Nullable
    public CustomPolicy get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CustomPolicy::createFromDiscriminatorValue);
    }
    /**
     * This method updates an existing custom policy specified by the &lt;b&gt;custom_policy_id&lt;/b&gt; path parameter. Since this method overwrites the policy&apos;s &lt;b&gt;name&lt;/b&gt;, &lt;b&gt;label&lt;/b&gt;, and &lt;b&gt;description&lt;/b&gt; fields, always include the complete and current text of all three policy fields in the request payload, even if they are not being updated.&lt;br/&gt; &lt;br/&gt;For example, the value for the &lt;b&gt;label&lt;/b&gt; field is to be updated, but the &lt;b&gt;name&lt;/b&gt; and &lt;b&gt;description&lt;/b&gt; values will remain unchanged. The existing &lt;b&gt;name&lt;/b&gt; and &lt;b&gt;description&lt;/b&gt; values, as they are defined in the current policy, must also be passed in. &lt;br/&gt;&lt;br/&gt;A successful policy update call returns an HTTP status code of &lt;b&gt;204 No Content&lt;/b&gt;.
     * @param body The request body
     */
    public void put(@jakarta.annotation.Nonnull final CustomPolicyRequest body) {
        put(body, null);
    }
    /**
     * This method updates an existing custom policy specified by the &lt;b&gt;custom_policy_id&lt;/b&gt; path parameter. Since this method overwrites the policy&apos;s &lt;b&gt;name&lt;/b&gt;, &lt;b&gt;label&lt;/b&gt;, and &lt;b&gt;description&lt;/b&gt; fields, always include the complete and current text of all three policy fields in the request payload, even if they are not being updated.&lt;br/&gt; &lt;br/&gt;For example, the value for the &lt;b&gt;label&lt;/b&gt; field is to be updated, but the &lt;b&gt;name&lt;/b&gt; and &lt;b&gt;description&lt;/b&gt; values will remain unchanged. The existing &lt;b&gt;name&lt;/b&gt; and &lt;b&gt;description&lt;/b&gt; values, as they are defined in the current policy, must also be passed in. &lt;br/&gt;&lt;br/&gt;A successful policy update call returns an HTTP status code of &lt;b&gt;204 No Content&lt;/b&gt;.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void put(@jakarta.annotation.Nonnull final CustomPolicyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method retrieves the custom policy specified by the &lt;b&gt;custom_policy_id&lt;/b&gt; path parameter.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the custom policy specified by the &lt;b&gt;custom_policy_id&lt;/b&gt; path parameter.
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
     * This method updates an existing custom policy specified by the &lt;b&gt;custom_policy_id&lt;/b&gt; path parameter. Since this method overwrites the policy&apos;s &lt;b&gt;name&lt;/b&gt;, &lt;b&gt;label&lt;/b&gt;, and &lt;b&gt;description&lt;/b&gt; fields, always include the complete and current text of all three policy fields in the request payload, even if they are not being updated.&lt;br/&gt; &lt;br/&gt;For example, the value for the &lt;b&gt;label&lt;/b&gt; field is to be updated, but the &lt;b&gt;name&lt;/b&gt; and &lt;b&gt;description&lt;/b&gt; values will remain unchanged. The existing &lt;b&gt;name&lt;/b&gt; and &lt;b&gt;description&lt;/b&gt; values, as they are defined in the current policy, must also be passed in. &lt;br/&gt;&lt;br/&gt;A successful policy update call returns an HTTP status code of &lt;b&gt;204 No Content&lt;/b&gt;.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final CustomPolicyRequest body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * This method updates an existing custom policy specified by the &lt;b&gt;custom_policy_id&lt;/b&gt; path parameter. Since this method overwrites the policy&apos;s &lt;b&gt;name&lt;/b&gt;, &lt;b&gt;label&lt;/b&gt;, and &lt;b&gt;description&lt;/b&gt; fields, always include the complete and current text of all three policy fields in the request payload, even if they are not being updated.&lt;br/&gt; &lt;br/&gt;For example, the value for the &lt;b&gt;label&lt;/b&gt; field is to be updated, but the &lt;b&gt;name&lt;/b&gt; and &lt;b&gt;description&lt;/b&gt; values will remain unchanged. The existing &lt;b&gt;name&lt;/b&gt; and &lt;b&gt;description&lt;/b&gt; values, as they are defined in the current policy, must also be passed in. &lt;br/&gt;&lt;br/&gt;A successful policy update call returns an HTTP status code of &lt;b&gt;204 No Content&lt;/b&gt;.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final CustomPolicyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithCustomPolicyItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCustomPolicyItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithCustomPolicyItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
