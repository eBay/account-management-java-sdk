package com.ebay.accountmanagement.generated.sellaccountv1.return_policy;

import com.ebay.accountmanagement.generated.sellaccountv1.models.ReturnPolicyRequest;
import com.ebay.accountmanagement.generated.sellaccountv1.models.ReturnPolicyResponse;
import com.ebay.accountmanagement.generated.sellaccountv1.models.SetReturnPolicyResponse;
import com.ebay.accountmanagement.generated.sellaccountv1.return_policy.get_by_policy_name.GetByPolicyNameRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv1.return_policy.item.WithReturnPolicyItemRequestBuilder;
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
 * Builds and executes requests for operations under /return_policy
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReturnPolicyRequestBuilder extends BaseRequestBuilder {
    /**
     * The get_by_policy_name property
     * @return a {@link GetByPolicyNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetByPolicyNameRequestBuilder getByPolicyName() {
        return new GetByPolicyNameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.ebay.accountmanagement.generated.sellaccountv1.return_policy.item collection
     * @param return_policy_id This path parameter specifies the unique identifier of the return policy you want to retrieve. &lt;br&gt;&lt;br&gt; This ID can be retrieved for a return policy by using the &lt;a href=&quot;/api-docs/sell/account/resources/return_policy/methods/getReturnPolicies&quot; target=&quot;_blank &quot;&gt;getReturnPolicies&lt;/a&gt; method.
     * @return a {@link WithReturnPolicyItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithReturnPolicyItemRequestBuilder byReturn_policy_id(@jakarta.annotation.Nonnull final String return_policy_id) {
        Objects.requireNonNull(return_policy_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("return_policy_id", return_policy_id);
        return new WithReturnPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ReturnPolicyRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReturnPolicyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/return_policy?marketplace_id={marketplace_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link ReturnPolicyRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReturnPolicyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/return_policy?marketplace_id={marketplace_id}", rawUrl);
    }
    /**
     * This method retrieves all the return policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.
     * @return a {@link ReturnPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public ReturnPolicyResponse get() {
        return get(null);
    }
    /**
     * This method retrieves all the return policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ReturnPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public ReturnPolicyResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ReturnPolicyResponse::createFromDiscriminatorValue);
    }
    /**
     * This method creates a new return policy where the policy encapsulates seller&apos;s terms for returning items.  &lt;br&gt;&lt;br&gt;Each policy targets a specific marketplace, and you can create multiple policies for each marketplace. Return policies are not applicable to motor-vehicle listings.&lt;br&gt;&lt;br&gt;A successful request returns the &lt;b&gt;getReturnPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href=&quot;/api-docs/sell/static/seller-accounts/business-policies.html&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;
     * @param body This root container defines a seller&apos;s return business policy for a specific marketplace and category group. This type is used when creating or updating a return business policy.
     * @return a {@link SetReturnPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public SetReturnPolicyResponse post(@jakarta.annotation.Nonnull final ReturnPolicyRequest body) {
        return post(body, null);
    }
    /**
     * This method creates a new return policy where the policy encapsulates seller&apos;s terms for returning items.  &lt;br&gt;&lt;br&gt;Each policy targets a specific marketplace, and you can create multiple policies for each marketplace. Return policies are not applicable to motor-vehicle listings.&lt;br&gt;&lt;br&gt;A successful request returns the &lt;b&gt;getReturnPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href=&quot;/api-docs/sell/static/seller-accounts/business-policies.html&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;
     * @param body This root container defines a seller&apos;s return business policy for a specific marketplace and category group. This type is used when creating or updating a return business policy.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SetReturnPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public SetReturnPolicyResponse post(@jakarta.annotation.Nonnull final ReturnPolicyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SetReturnPolicyResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves all the return policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves all the return policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.
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
     * This method creates a new return policy where the policy encapsulates seller&apos;s terms for returning items.  &lt;br&gt;&lt;br&gt;Each policy targets a specific marketplace, and you can create multiple policies for each marketplace. Return policies are not applicable to motor-vehicle listings.&lt;br&gt;&lt;br&gt;A successful request returns the &lt;b&gt;getReturnPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href=&quot;/api-docs/sell/static/seller-accounts/business-policies.html&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;
     * @param body This root container defines a seller&apos;s return business policy for a specific marketplace and category group. This type is used when creating or updating a return business policy.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ReturnPolicyRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method creates a new return policy where the policy encapsulates seller&apos;s terms for returning items.  &lt;br&gt;&lt;br&gt;Each policy targets a specific marketplace, and you can create multiple policies for each marketplace. Return policies are not applicable to motor-vehicle listings.&lt;br&gt;&lt;br&gt;A successful request returns the &lt;b&gt;getReturnPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href=&quot;/api-docs/sell/static/seller-accounts/business-policies.html&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;
     * @param body This root container defines a seller&apos;s return business policy for a specific marketplace and category group. This type is used when creating or updating a return business policy.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ReturnPolicyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, "{+baseurl}/return_policy", pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ReturnPolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReturnPolicyRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ReturnPolicyRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method retrieves all the return policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter specifies the ID of the eBay marketplace of the policies you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
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
