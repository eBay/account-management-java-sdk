package com.ebay.accountmanagement.generated.sellaccountv1.return_policy.item;

import com.ebay.accountmanagement.generated.sellaccountv1.models.ReturnPolicy;
import com.ebay.accountmanagement.generated.sellaccountv1.models.ReturnPolicyRequest;
import com.ebay.accountmanagement.generated.sellaccountv1.models.SetReturnPolicyResponse;
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
 * Builds and executes requests for operations under /return_policy/{return_policy_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithReturnPolicyItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithReturnPolicyItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithReturnPolicyItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/return_policy/{return_policy_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithReturnPolicyItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithReturnPolicyItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/return_policy/{return_policy_id}", rawUrl);
    }
    /**
     * This method deletes a return policy. Supply the ID of the policy you want to delete in the &lt;b&gt;returnPolicyId&lt;/b&gt; path parameter.
     */
    public void delete() {
        delete(null);
    }
    /**
     * This method deletes a return policy. Supply the ID of the policy you want to delete in the &lt;b&gt;returnPolicyId&lt;/b&gt; path parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method retrieves the complete details of the return policy specified by the &lt;b&gt;returnPolicyId&lt;/b&gt; path parameter.
     * @return a {@link ReturnPolicy}
     */
    @jakarta.annotation.Nullable
    public ReturnPolicy get() {
        return get(null);
    }
    /**
     * This method retrieves the complete details of the return policy specified by the &lt;b&gt;returnPolicyId&lt;/b&gt; path parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ReturnPolicy}
     */
    @jakarta.annotation.Nullable
    public ReturnPolicy get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ReturnPolicy::createFromDiscriminatorValue);
    }
    /**
     * This method updates an existing return policy. Specify the policy you want to update using the &lt;b&gt;return_policy_id&lt;/b&gt; path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.
     * @param body This root container defines a seller&apos;s return business policy for a specific marketplace and category group. This type is used when creating or updating a return business policy.
     * @return a {@link SetReturnPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public SetReturnPolicyResponse put(@jakarta.annotation.Nonnull final ReturnPolicyRequest body) {
        return put(body, null);
    }
    /**
     * This method updates an existing return policy. Specify the policy you want to update using the &lt;b&gt;return_policy_id&lt;/b&gt; path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.
     * @param body This root container defines a seller&apos;s return business policy for a specific marketplace and category group. This type is used when creating or updating a return business policy.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SetReturnPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public SetReturnPolicyResponse put(@jakarta.annotation.Nonnull final ReturnPolicyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SetReturnPolicyResponse::createFromDiscriminatorValue);
    }
    /**
     * This method deletes a return policy. Supply the ID of the policy you want to delete in the &lt;b&gt;returnPolicyId&lt;/b&gt; path parameter.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * This method deletes a return policy. Supply the ID of the policy you want to delete in the &lt;b&gt;returnPolicyId&lt;/b&gt; path parameter.
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
     * This method retrieves the complete details of the return policy specified by the &lt;b&gt;returnPolicyId&lt;/b&gt; path parameter.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the complete details of the return policy specified by the &lt;b&gt;returnPolicyId&lt;/b&gt; path parameter.
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
     * This method updates an existing return policy. Specify the policy you want to update using the &lt;b&gt;return_policy_id&lt;/b&gt; path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.
     * @param body This root container defines a seller&apos;s return business policy for a specific marketplace and category group. This type is used when creating or updating a return business policy.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ReturnPolicyRequest body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * This method updates an existing return policy. Specify the policy you want to update using the &lt;b&gt;return_policy_id&lt;/b&gt; path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.
     * @param body This root container defines a seller&apos;s return business policy for a specific marketplace and category group. This type is used when creating or updating a return business policy.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ReturnPolicyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a {@link WithReturnPolicyItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithReturnPolicyItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithReturnPolicyItemRequestBuilder(rawUrl, requestAdapter);
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
