package com.ebay.accountmanagement.generated.sellaccountv1.advertising_eligibility;

import com.ebay.accountmanagement.generated.sellaccountv1.models.SellerEligibilityMultiProgramResponse;
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
 * Builds and executes requests for operations under /advertising_eligibility
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdvertisingEligibilityRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link AdvertisingEligibilityRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdvertisingEligibilityRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/advertising_eligibility{?program_types*}", pathParameters);
    }
    /**
     * Instantiates a new {@link AdvertisingEligibilityRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdvertisingEligibilityRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/advertising_eligibility{?program_types*}", rawUrl);
    }
    /**
     * This method allows developers to check the seller eligibility status for eBay advertising programs.
     * @return a {@link SellerEligibilityMultiProgramResponse}
     */
    @jakarta.annotation.Nullable
    public SellerEligibilityMultiProgramResponse get() {
        return get(null);
    }
    /**
     * This method allows developers to check the seller eligibility status for eBay advertising programs.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SellerEligibilityMultiProgramResponse}
     */
    @jakarta.annotation.Nullable
    public SellerEligibilityMultiProgramResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SellerEligibilityMultiProgramResponse::createFromDiscriminatorValue);
    }
    /**
     * This method allows developers to check the seller eligibility status for eBay advertising programs.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method allows developers to check the seller eligibility status for eBay advertising programs.
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
     * @return a {@link AdvertisingEligibilityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdvertisingEligibilityRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AdvertisingEligibilityRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method allows developers to check the seller eligibility status for eBay advertising programs.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * A comma-separated list of eBay advertising programs for which eligibility status will be returned.&lt;br&gt;&lt;br&gt; See the &lt;a href=&quot;/api-docs/sell/account/types/plser:AdvertisingProgramEnum&quot; target=&quot;_blank&quot;&gt; AdvertisingProgramEnum&lt;/a&gt; type for a list of supported values.&lt;br&gt;&lt;br&gt;If no programs are specified, the results will be returned for all programs.
         */
        @jakarta.annotation.Nullable
        public String programTypes;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("program_types", programTypes);
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
