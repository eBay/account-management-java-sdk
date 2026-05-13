package com.ebay.accountmanagement.generated.sellaccountv2.combined_shipping_rules;

import com.ebay.accountmanagement.generated.sellaccountv2.combined_shipping_rules.create_calculated_shipping_rules.CreateCalculatedShippingRulesRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv2.combined_shipping_rules.create_flat_shipping_rules.CreateFlatShippingRulesRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv2.combined_shipping_rules.create_promotional_shipping_rule.CreatePromotionalShippingRuleRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv2.combined_shipping_rules.update_calculated_shipping_rules.UpdateCalculatedShippingRulesRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv2.combined_shipping_rules.update_combined_payments.UpdateCombinedPaymentsRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv2.combined_shipping_rules.update_flat_shipping_rules.UpdateFlatShippingRulesRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv2.combined_shipping_rules.update_promotional_shipping_rule.UpdatePromotionalShippingRuleRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv2.models.GetCombinedShippingRulesPublicApiResponse;
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
 * Builds and executes requests for operations under /combined_shipping_rules
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CombinedShippingRulesRequestBuilder extends BaseRequestBuilder {
    /**
     * The create_calculated_shipping_rules property
     * @return a {@link CreateCalculatedShippingRulesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateCalculatedShippingRulesRequestBuilder createCalculatedShippingRules() {
        return new CreateCalculatedShippingRulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The create_flat_shipping_rules property
     * @return a {@link CreateFlatShippingRulesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateFlatShippingRulesRequestBuilder createFlatShippingRules() {
        return new CreateFlatShippingRulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The create_promotional_shipping_rule property
     * @return a {@link CreatePromotionalShippingRuleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreatePromotionalShippingRuleRequestBuilder createPromotionalShippingRule() {
        return new CreatePromotionalShippingRuleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The update_calculated_shipping_rules property
     * @return a {@link UpdateCalculatedShippingRulesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateCalculatedShippingRulesRequestBuilder updateCalculatedShippingRules() {
        return new UpdateCalculatedShippingRulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The update_combined_payments property
     * @return a {@link UpdateCombinedPaymentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateCombinedPaymentsRequestBuilder updateCombinedPayments() {
        return new UpdateCombinedPaymentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The update_flat_shipping_rules property
     * @return a {@link UpdateFlatShippingRulesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateFlatShippingRulesRequestBuilder updateFlatShippingRules() {
        return new UpdateFlatShippingRulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The update_promotional_shipping_rule property
     * @return a {@link UpdatePromotionalShippingRuleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdatePromotionalShippingRuleRequestBuilder updatePromotionalShippingRule() {
        return new UpdatePromotionalShippingRuleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link CombinedShippingRulesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CombinedShippingRulesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/combined_shipping_rules", pathParameters);
    }
    /**
     * Instantiates a new {@link CombinedShippingRulesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CombinedShippingRulesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/combined_shipping_rules", rawUrl);
    }
    /**
     * This method retrieves all existing combined shipping rule configurations defined by the authenticated seller, including calculated, flat, and promotional types.
     * @return a {@link GetCombinedShippingRulesPublicApiResponse}
     */
    @jakarta.annotation.Nullable
    public GetCombinedShippingRulesPublicApiResponse get() {
        return get(null);
    }
    /**
     * This method retrieves all existing combined shipping rule configurations defined by the authenticated seller, including calculated, flat, and promotional types.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetCombinedShippingRulesPublicApiResponse}
     */
    @jakarta.annotation.Nullable
    public GetCombinedShippingRulesPublicApiResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetCombinedShippingRulesPublicApiResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves all existing combined shipping rule configurations defined by the authenticated seller, including calculated, flat, and promotional types.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves all existing combined shipping rule configurations defined by the authenticated seller, including calculated, flat, and promotional types.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link CombinedShippingRulesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CombinedShippingRulesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CombinedShippingRulesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
