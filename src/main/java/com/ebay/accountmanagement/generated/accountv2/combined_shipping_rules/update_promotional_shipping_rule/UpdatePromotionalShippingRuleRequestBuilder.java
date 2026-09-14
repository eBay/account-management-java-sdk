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

package com.ebay.accountmanagement.generated.accountv2.combined_shipping_rules.update_promotional_shipping_rule;

import com.ebay.accountmanagement.generated.accountv2.models.UpdatePromotionalShippingRuleRequest;
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
 * Builds and executes requests for operations under /combined_shipping_rules/update_promotional_shipping_rule
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdatePromotionalShippingRuleRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UpdatePromotionalShippingRuleRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdatePromotionalShippingRuleRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/combined_shipping_rules/update_promotional_shipping_rule", pathParameters);
    }
    /**
     * Instantiates a new {@link UpdatePromotionalShippingRuleRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdatePromotionalShippingRuleRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/combined_shipping_rules/update_promotional_shipping_rule", rawUrl);
    }
    /**
     * This method updates an existing promotional shipping rule to adjust discount thresholds, eligibility criteria, or duration for the seller.
     * @param body This type defines a request to update promotional shipping rule.
     */
    public void post(@jakarta.annotation.Nonnull final UpdatePromotionalShippingRuleRequest body) {
        post(body, null);
    }
    /**
     * This method updates an existing promotional shipping rule to adjust discount thresholds, eligibility criteria, or duration for the seller.
     * @param body This type defines a request to update promotional shipping rule.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nonnull final UpdatePromotionalShippingRuleRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method updates an existing promotional shipping rule to adjust discount thresholds, eligibility criteria, or duration for the seller.
     * @param body This type defines a request to update promotional shipping rule.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdatePromotionalShippingRuleRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method updates an existing promotional shipping rule to adjust discount thresholds, eligibility criteria, or duration for the seller.
     * @param body This type defines a request to update promotional shipping rule.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdatePromotionalShippingRuleRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UpdatePromotionalShippingRuleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdatePromotionalShippingRuleRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UpdatePromotionalShippingRuleRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
