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

package com.ebay.accountmanagement.generated.accountv2.user_preferences;

import com.ebay.accountmanagement.generated.accountv2.models.GetUserPreferencesResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /user_preferences
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserPreferencesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UserPreferencesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserPreferencesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/user_preferences{?fieldgroups*}", pathParameters);
    }
    /**
     * Instantiates a new {@link UserPreferencesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserPreferencesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/user_preferences{?fieldgroups*}", rawUrl);
    }
    /**
     * This method retrieves the seller&apos;s preferences for a specific eBay marketplace, such as combined payment preferences, same-day shipping cutoff time, excluded shipping locations, and opt-in status for Business Policies and Out-of-Stock control. The &lt;b&gt;fieldgroups&lt;/b&gt; query parameter specifies the type of seller preferences to retrieve. If &lt;b&gt;fieldgroups&lt;/b&gt; = &lt;code&gt;ALL&lt;/code&gt; or the parameter is omitted, all the supported seller preferences are returned. To retrieve only specific preferences, include the &lt;b&gt;fieldgroups&lt;/b&gt; parameter with one or more supported values, delimited by commas.
     * @return a {@link GetUserPreferencesResponse}
     */
    @jakarta.annotation.Nullable
    public GetUserPreferencesResponse get() {
        return get(null);
    }
    /**
     * This method retrieves the seller&apos;s preferences for a specific eBay marketplace, such as combined payment preferences, same-day shipping cutoff time, excluded shipping locations, and opt-in status for Business Policies and Out-of-Stock control. The &lt;b&gt;fieldgroups&lt;/b&gt; query parameter specifies the type of seller preferences to retrieve. If &lt;b&gt;fieldgroups&lt;/b&gt; = &lt;code&gt;ALL&lt;/code&gt; or the parameter is omitted, all the supported seller preferences are returned. To retrieve only specific preferences, include the &lt;b&gt;fieldgroups&lt;/b&gt; parameter with one or more supported values, delimited by commas.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetUserPreferencesResponse}
     */
    @jakarta.annotation.Nullable
    public GetUserPreferencesResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetUserPreferencesResponse::createFromDiscriminatorValue);
    }
    /**
     * This method is used to modify one or more preferences for a seller on a specific marketplace. The preferences that can be modified include combined payment preferences, same-day shipping cutoff time, and opt-in status for Business Policies and Out-of-stock control. This is a PATCH operation, so you only need to include the fields that correspond to the preferences/settings that you are changing.
     * @param body The request body
     */
    public void patch(@jakarta.annotation.Nonnull final UntypedNode body) {
        patch(body, null);
    }
    /**
     * This method is used to modify one or more preferences for a seller on a specific marketplace. The preferences that can be modified include combined payment preferences, same-day shipping cutoff time, and opt-in status for Business Policies and Out-of-stock control. This is a PATCH operation, so you only need to include the fields that correspond to the preferences/settings that you are changing.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void patch(@jakarta.annotation.Nonnull final UntypedNode body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method retrieves the seller&apos;s preferences for a specific eBay marketplace, such as combined payment preferences, same-day shipping cutoff time, excluded shipping locations, and opt-in status for Business Policies and Out-of-Stock control. The &lt;b&gt;fieldgroups&lt;/b&gt; query parameter specifies the type of seller preferences to retrieve. If &lt;b&gt;fieldgroups&lt;/b&gt; = &lt;code&gt;ALL&lt;/code&gt; or the parameter is omitted, all the supported seller preferences are returned. To retrieve only specific preferences, include the &lt;b&gt;fieldgroups&lt;/b&gt; parameter with one or more supported values, delimited by commas.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the seller&apos;s preferences for a specific eBay marketplace, such as combined payment preferences, same-day shipping cutoff time, excluded shipping locations, and opt-in status for Business Policies and Out-of-Stock control. The &lt;b&gt;fieldgroups&lt;/b&gt; query parameter specifies the type of seller preferences to retrieve. If &lt;b&gt;fieldgroups&lt;/b&gt; = &lt;code&gt;ALL&lt;/code&gt; or the parameter is omitted, all the supported seller preferences are returned. To retrieve only specific preferences, include the &lt;b&gt;fieldgroups&lt;/b&gt; parameter with one or more supported values, delimited by commas.
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
     * This method is used to modify one or more preferences for a seller on a specific marketplace. The preferences that can be modified include combined payment preferences, same-day shipping cutoff time, and opt-in status for Business Policies and Out-of-stock control. This is a PATCH operation, so you only need to include the fields that correspond to the preferences/settings that you are changing.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UntypedNode body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * This method is used to modify one or more preferences for a seller on a specific marketplace. The preferences that can be modified include combined payment preferences, same-day shipping cutoff time, and opt-in status for Business Policies and Out-of-stock control. This is a PATCH operation, so you only need to include the fields that correspond to the preferences/settings that you are changing.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UntypedNode body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.setContentFromScalar(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UserPreferencesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserPreferencesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UserPreferencesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method retrieves the seller&apos;s preferences for a specific eBay marketplace, such as combined payment preferences, same-day shipping cutoff time, excluded shipping locations, and opt-in status for Business Policies and Out-of-Stock control. The &lt;b&gt;fieldgroups&lt;/b&gt; query parameter specifies the type of seller preferences to retrieve. If &lt;b&gt;fieldgroups&lt;/b&gt; = &lt;code&gt;ALL&lt;/code&gt; or the parameter is omitted, all the supported seller preferences are returned. To retrieve only specific preferences, include the &lt;b&gt;fieldgroups&lt;/b&gt; parameter with one or more supported values, delimited by commas.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The &lt;b&gt;fieldgroups&lt;/b&gt; query parameter specifies the type of seller preferences to retrieve. &lt;br&gt;&lt;br&gt;If &lt;b&gt;fieldgroups&lt;/b&gt;=&lt;code&gt;ALL&lt;/code&gt; or is omitted, all the supported seller preferences are returned. &lt;br&gt;&lt;br&gt;To retrieve specific seller preferences, include the &lt;b&gt;fieldgroups&lt;/b&gt; parameter and specify one or more values, with each value delimited by a comma. &lt;br&gt;&lt;br&gt;For example, &lt;code&gt;fieldgroups = SHIPPING_CARRIER_RATE,COMBINED_PAYMENT&lt;/code&gt;. &lt;br&gt;&lt;br&gt;The value can be &lt;code&gt;ALL&lt;/code&gt; or any combination of the following (comma-separated):&lt;br&gt;&lt;code&gt;COMBINED_PAYMENT&lt;/code&gt;, &lt;code&gt;DISPATCH_CUTOFF_TIME&lt;/code&gt;, &lt;code&gt;EMAIL_SHIPMENT_TRACKING_NUMBER&lt;/code&gt;, &lt;code&gt;END_OF_AUCTION_EMAIL&lt;/code&gt;, &lt;code&gt;GLOBAL_SHIPPING_PROGRAM&lt;/code&gt;, &lt;code&gt;GLOBAL_SHIPPING_PROGRAM_LISTING&lt;/code&gt;, &lt;code&gt;ITEMS_AWAITING_PAYMENT&lt;/code&gt;, &lt;code&gt;OUT_OF_STOCK_CONTROL SELLER_PROFILE&lt;/code&gt;, &lt;code&gt;OVERRIDE_GSP_SERVICE_WITH_INTL_SERVICE&lt;/code&gt;, &lt;code&gt;PICKUP_DROPOFF_SELLER&lt;/code&gt;, &lt;code&gt;PURCHASE_REMINDER_EMAIL&lt;/code&gt;, &lt;code&gt;REQUIRED_SHIP_PHONE_NUMBER&lt;/code&gt;, &lt;code&gt;SELLER_EXCLUDE_SHIP_TO_LOCATION&lt;/code&gt;, &lt;code&gt;SHIPPING_CARRIER_RATE&lt;/code&gt;
         */
        @jakarta.annotation.Nullable
        public String fieldgroups;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("fieldgroups", fieldgroups);
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
