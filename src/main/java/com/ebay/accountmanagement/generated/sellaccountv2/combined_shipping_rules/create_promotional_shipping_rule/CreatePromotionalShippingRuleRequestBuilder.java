package com.ebay.accountmanagement.generated.sellaccountv2.combined_shipping_rules.create_promotional_shipping_rule;

import com.ebay.accountmanagement.generated.sellaccountv2.models.CreatePromotionalShippingRuleRequest;
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
 * Builds and executes requests for operations under /combined_shipping_rules/create_promotional_shipping_rule
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreatePromotionalShippingRuleRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CreatePromotionalShippingRuleRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreatePromotionalShippingRuleRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/combined_shipping_rules/create_promotional_shipping_rule", pathParameters);
    }
    /**
     * Instantiates a new {@link CreatePromotionalShippingRuleRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreatePromotionalShippingRuleRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/combined_shipping_rules/create_promotional_shipping_rule", rawUrl);
    }
    /**
     * This method defines promotional shipping rules such as discounts or free-shipping thresholds, configurable by marketplace for the seller.
     * @param body This type represents the request schema for creating promotional shipping rules with combined payment durations.
     */
    public void post(@jakarta.annotation.Nonnull final CreatePromotionalShippingRuleRequest body) {
        post(body, null);
    }
    /**
     * This method defines promotional shipping rules such as discounts or free-shipping thresholds, configurable by marketplace for the seller.
     * @param body This type represents the request schema for creating promotional shipping rules with combined payment durations.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nonnull final CreatePromotionalShippingRuleRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method defines promotional shipping rules such as discounts or free-shipping thresholds, configurable by marketplace for the seller.
     * @param body This type represents the request schema for creating promotional shipping rules with combined payment durations.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreatePromotionalShippingRuleRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method defines promotional shipping rules such as discounts or free-shipping thresholds, configurable by marketplace for the seller.
     * @param body This type represents the request schema for creating promotional shipping rules with combined payment durations.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreatePromotionalShippingRuleRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link CreatePromotionalShippingRuleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreatePromotionalShippingRuleRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CreatePromotionalShippingRuleRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
