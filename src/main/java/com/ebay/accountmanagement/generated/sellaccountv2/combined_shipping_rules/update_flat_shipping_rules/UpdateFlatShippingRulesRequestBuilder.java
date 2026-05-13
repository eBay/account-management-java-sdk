package com.ebay.accountmanagement.generated.sellaccountv2.combined_shipping_rules.update_flat_shipping_rules;

import com.ebay.accountmanagement.generated.sellaccountv2.models.UpdateFlatShippingRulesRequest;
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
 * Builds and executes requests for operations under /combined_shipping_rules/update_flat_shipping_rules
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateFlatShippingRulesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UpdateFlatShippingRulesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateFlatShippingRulesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/combined_shipping_rules/update_flat_shipping_rules", pathParameters);
    }
    /**
     * Instantiates a new {@link UpdateFlatShippingRulesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateFlatShippingRulesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/combined_shipping_rules/update_flat_shipping_rules", rawUrl);
    }
    /**
     * This method updates existing shipping rules.
     * @param body This type defines a request to update flat shipping rules.
     */
    public void post(@jakarta.annotation.Nonnull final UpdateFlatShippingRulesRequest body) {
        post(body, null);
    }
    /**
     * This method updates existing shipping rules.
     * @param body This type defines a request to update flat shipping rules.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nonnull final UpdateFlatShippingRulesRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method updates existing shipping rules.
     * @param body This type defines a request to update flat shipping rules.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateFlatShippingRulesRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method updates existing shipping rules.
     * @param body This type defines a request to update flat shipping rules.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateFlatShippingRulesRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UpdateFlatShippingRulesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateFlatShippingRulesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UpdateFlatShippingRulesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
