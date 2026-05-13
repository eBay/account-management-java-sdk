package com.ebay.accountmanagement.generated.sellaccountv2.combined_shipping_rules.update_calculated_shipping_rules;

import com.ebay.accountmanagement.generated.sellaccountv2.models.UpdateCalculatedShippingRulesRequest;
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
 * Builds and executes requests for operations under /combined_shipping_rules/update_calculated_shipping_rules
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateCalculatedShippingRulesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UpdateCalculatedShippingRulesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateCalculatedShippingRulesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/combined_shipping_rules/update_calculated_shipping_rules", pathParameters);
    }
    /**
     * Instantiates a new {@link UpdateCalculatedShippingRulesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateCalculatedShippingRulesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/combined_shipping_rules/update_calculated_shipping_rules", rawUrl);
    }
    /**
     * This method updates previously defined calculated shipping rules to modify discount percentages, weight offsets, or amount parameters for the seller.
     * @param body This type is used to update calculated shipping rules.
     */
    public void post(@jakarta.annotation.Nonnull final UpdateCalculatedShippingRulesRequest body) {
        post(body, null);
    }
    /**
     * This method updates previously defined calculated shipping rules to modify discount percentages, weight offsets, or amount parameters for the seller.
     * @param body This type is used to update calculated shipping rules.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nonnull final UpdateCalculatedShippingRulesRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method updates previously defined calculated shipping rules to modify discount percentages, weight offsets, or amount parameters for the seller.
     * @param body This type is used to update calculated shipping rules.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateCalculatedShippingRulesRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method updates previously defined calculated shipping rules to modify discount percentages, weight offsets, or amount parameters for the seller.
     * @param body This type is used to update calculated shipping rules.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateCalculatedShippingRulesRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UpdateCalculatedShippingRulesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateCalculatedShippingRulesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UpdateCalculatedShippingRulesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
