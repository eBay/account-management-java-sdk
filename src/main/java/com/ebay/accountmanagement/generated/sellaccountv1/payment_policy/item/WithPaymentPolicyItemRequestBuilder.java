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

package com.ebay.accountmanagement.generated.sellaccountv1.payment_policy.item;

import com.ebay.accountmanagement.generated.sellaccountv1.models.PaymentPolicy;
import com.ebay.accountmanagement.generated.sellaccountv1.models.PaymentPolicyRequest;
import com.ebay.accountmanagement.generated.sellaccountv1.models.SetPaymentPolicyResponse;
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
 * Builds and executes requests for operations under /payment_policy/{payment_policy_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithPaymentPolicyItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithPaymentPolicyItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPaymentPolicyItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_policy/{payment_policy_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithPaymentPolicyItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPaymentPolicyItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_policy/{payment_policy_id}", rawUrl);
    }
    /**
     * This method deletes a payment policy. Supply the ID of the policy you want to delete in the &lt;b&gt;paymentPolicyId&lt;/b&gt; path parameter. 
     */
    public void delete() {
        delete(null);
    }
    /**
     * This method deletes a payment policy. Supply the ID of the policy you want to delete in the &lt;b&gt;paymentPolicyId&lt;/b&gt; path parameter. 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method retrieves the complete details of a payment policy. Supply the ID of the policy you want to retrieve using the &lt;b&gt;paymentPolicyId&lt;/b&gt; path parameter.
     * @return a {@link PaymentPolicy}
     */
    @jakarta.annotation.Nullable
    public PaymentPolicy get() {
        return get(null);
    }
    /**
     * This method retrieves the complete details of a payment policy. Supply the ID of the policy you want to retrieve using the &lt;b&gt;paymentPolicyId&lt;/b&gt; path parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PaymentPolicy}
     */
    @jakarta.annotation.Nullable
    public PaymentPolicy get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PaymentPolicy::createFromDiscriminatorValue);
    }
    /**
     * This method updates an existing payment policy. Specify the policy you want to update using the &lt;b&gt;payment_policy_id&lt;/b&gt; path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.
     * @param body This root container defines a seller&apos;s payment business policy for a specific marketplace and category group. This type is used when creating or updating a payment business policy.
     * @return a {@link SetPaymentPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public SetPaymentPolicyResponse put(@jakarta.annotation.Nonnull final PaymentPolicyRequest body) {
        return put(body, null);
    }
    /**
     * This method updates an existing payment policy. Specify the policy you want to update using the &lt;b&gt;payment_policy_id&lt;/b&gt; path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.
     * @param body This root container defines a seller&apos;s payment business policy for a specific marketplace and category group. This type is used when creating or updating a payment business policy.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SetPaymentPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public SetPaymentPolicyResponse put(@jakarta.annotation.Nonnull final PaymentPolicyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SetPaymentPolicyResponse::createFromDiscriminatorValue);
    }
    /**
     * This method deletes a payment policy. Supply the ID of the policy you want to delete in the &lt;b&gt;paymentPolicyId&lt;/b&gt; path parameter. 
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * This method deletes a payment policy. Supply the ID of the policy you want to delete in the &lt;b&gt;paymentPolicyId&lt;/b&gt; path parameter. 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * This method retrieves the complete details of a payment policy. Supply the ID of the policy you want to retrieve using the &lt;b&gt;paymentPolicyId&lt;/b&gt; path parameter.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the complete details of a payment policy. Supply the ID of the policy you want to retrieve using the &lt;b&gt;paymentPolicyId&lt;/b&gt; path parameter.
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
     * This method updates an existing payment policy. Specify the policy you want to update using the &lt;b&gt;payment_policy_id&lt;/b&gt; path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.
     * @param body This root container defines a seller&apos;s payment business policy for a specific marketplace and category group. This type is used when creating or updating a payment business policy.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final PaymentPolicyRequest body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * This method updates an existing payment policy. Specify the policy you want to update using the &lt;b&gt;payment_policy_id&lt;/b&gt; path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.
     * @param body This root container defines a seller&apos;s payment business policy for a specific marketplace and category group. This type is used when creating or updating a payment business policy.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final PaymentPolicyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithPaymentPolicyItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPaymentPolicyItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithPaymentPolicyItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
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
