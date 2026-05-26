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

package com.ebay.accountmanagement.generated.sellaccountv1.rate_table;

import com.ebay.accountmanagement.generated.sellaccountv1.models.RateTableResponse;
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
 * Builds and executes requests for operations under /rate_table
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RateTableRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link RateTableRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RateTableRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/rate_table{?country_code*}", pathParameters);
    }
    /**
     * Instantiates a new {@link RateTableRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RateTableRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/rate_table{?country_code*}", rawUrl);
    }
    /**
     * This method retrieves a seller&apos;s &lt;i&gt;shipping rate tables&lt;/i&gt; for the country specified in the &lt;b&gt;country_code&lt;/b&gt; query parameter. If you call this method without specifying a country code, the call returns all of the seller&apos;s shipping rate tables.  &lt;br&gt;&lt;br&gt;The method&apos;s response includes a &lt;b&gt;rateTableId&lt;/b&gt; for each table defined by the seller. This &lt;b&gt;rateTableId&lt;/b&gt; value is used in add/revise item call or in create/update fulfillment business policy call to specify the shipping rate table to use for that policy&apos;s domestic or international shipping options. &lt;br&gt;&lt;br&gt;This call currently supports getting rate tables related to the following marketplaces: United States, Canada, United Kingdom, Germany, Australia, France, Italy, and Spain.  &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Rate tables created with the Trading API might not have been assigned a &lt;b&gt;rateTableId&lt;/b&gt; at the time of their creation. This method can assign and return &lt;b&gt;rateTableId&lt;/b&gt; values for rate tables with missing IDs if you make a request using the &lt;b&gt;country_code&lt;/b&gt; where the seller has defined rate tables.&lt;/span&gt;  &lt;br&gt;&lt;br&gt;Sellers can define up to 40 shipping rate tables for their account, which lets them set up different rate tables for each of the marketplaces they sell into. Go to &lt;a href=&quot;https://www.ebay.com/ship/rt &quot;&gt;Shipping rate tables&lt;/a&gt; in  &lt;b&gt;My eBay&lt;/b&gt; to create and update rate tables.
     * @return a {@link RateTableResponse}
     */
    @jakarta.annotation.Nullable
    public RateTableResponse get() {
        return get(null);
    }
    /**
     * This method retrieves a seller&apos;s &lt;i&gt;shipping rate tables&lt;/i&gt; for the country specified in the &lt;b&gt;country_code&lt;/b&gt; query parameter. If you call this method without specifying a country code, the call returns all of the seller&apos;s shipping rate tables.  &lt;br&gt;&lt;br&gt;The method&apos;s response includes a &lt;b&gt;rateTableId&lt;/b&gt; for each table defined by the seller. This &lt;b&gt;rateTableId&lt;/b&gt; value is used in add/revise item call or in create/update fulfillment business policy call to specify the shipping rate table to use for that policy&apos;s domestic or international shipping options. &lt;br&gt;&lt;br&gt;This call currently supports getting rate tables related to the following marketplaces: United States, Canada, United Kingdom, Germany, Australia, France, Italy, and Spain.  &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Rate tables created with the Trading API might not have been assigned a &lt;b&gt;rateTableId&lt;/b&gt; at the time of their creation. This method can assign and return &lt;b&gt;rateTableId&lt;/b&gt; values for rate tables with missing IDs if you make a request using the &lt;b&gt;country_code&lt;/b&gt; where the seller has defined rate tables.&lt;/span&gt;  &lt;br&gt;&lt;br&gt;Sellers can define up to 40 shipping rate tables for their account, which lets them set up different rate tables for each of the marketplaces they sell into. Go to &lt;a href=&quot;https://www.ebay.com/ship/rt &quot;&gt;Shipping rate tables&lt;/a&gt; in  &lt;b&gt;My eBay&lt;/b&gt; to create and update rate tables.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RateTableResponse}
     */
    @jakarta.annotation.Nullable
    public RateTableResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, RateTableResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves a seller&apos;s &lt;i&gt;shipping rate tables&lt;/i&gt; for the country specified in the &lt;b&gt;country_code&lt;/b&gt; query parameter. If you call this method without specifying a country code, the call returns all of the seller&apos;s shipping rate tables.  &lt;br&gt;&lt;br&gt;The method&apos;s response includes a &lt;b&gt;rateTableId&lt;/b&gt; for each table defined by the seller. This &lt;b&gt;rateTableId&lt;/b&gt; value is used in add/revise item call or in create/update fulfillment business policy call to specify the shipping rate table to use for that policy&apos;s domestic or international shipping options. &lt;br&gt;&lt;br&gt;This call currently supports getting rate tables related to the following marketplaces: United States, Canada, United Kingdom, Germany, Australia, France, Italy, and Spain.  &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Rate tables created with the Trading API might not have been assigned a &lt;b&gt;rateTableId&lt;/b&gt; at the time of their creation. This method can assign and return &lt;b&gt;rateTableId&lt;/b&gt; values for rate tables with missing IDs if you make a request using the &lt;b&gt;country_code&lt;/b&gt; where the seller has defined rate tables.&lt;/span&gt;  &lt;br&gt;&lt;br&gt;Sellers can define up to 40 shipping rate tables for their account, which lets them set up different rate tables for each of the marketplaces they sell into. Go to &lt;a href=&quot;https://www.ebay.com/ship/rt &quot;&gt;Shipping rate tables&lt;/a&gt; in  &lt;b&gt;My eBay&lt;/b&gt; to create and update rate tables.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves a seller&apos;s &lt;i&gt;shipping rate tables&lt;/i&gt; for the country specified in the &lt;b&gt;country_code&lt;/b&gt; query parameter. If you call this method without specifying a country code, the call returns all of the seller&apos;s shipping rate tables.  &lt;br&gt;&lt;br&gt;The method&apos;s response includes a &lt;b&gt;rateTableId&lt;/b&gt; for each table defined by the seller. This &lt;b&gt;rateTableId&lt;/b&gt; value is used in add/revise item call or in create/update fulfillment business policy call to specify the shipping rate table to use for that policy&apos;s domestic or international shipping options. &lt;br&gt;&lt;br&gt;This call currently supports getting rate tables related to the following marketplaces: United States, Canada, United Kingdom, Germany, Australia, France, Italy, and Spain.  &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Rate tables created with the Trading API might not have been assigned a &lt;b&gt;rateTableId&lt;/b&gt; at the time of their creation. This method can assign and return &lt;b&gt;rateTableId&lt;/b&gt; values for rate tables with missing IDs if you make a request using the &lt;b&gt;country_code&lt;/b&gt; where the seller has defined rate tables.&lt;/span&gt;  &lt;br&gt;&lt;br&gt;Sellers can define up to 40 shipping rate tables for their account, which lets them set up different rate tables for each of the marketplaces they sell into. Go to &lt;a href=&quot;https://www.ebay.com/ship/rt &quot;&gt;Shipping rate tables&lt;/a&gt; in  &lt;b&gt;My eBay&lt;/b&gt; to create and update rate tables.
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
     * @return a {@link RateTableRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RateTableRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RateTableRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method retrieves a seller&apos;s &lt;i&gt;shipping rate tables&lt;/i&gt; for the country specified in the &lt;b&gt;country_code&lt;/b&gt; query parameter. If you call this method without specifying a country code, the call returns all of the seller&apos;s shipping rate tables.  &lt;br&gt;&lt;br&gt;The method&apos;s response includes a &lt;b&gt;rateTableId&lt;/b&gt; for each table defined by the seller. This &lt;b&gt;rateTableId&lt;/b&gt; value is used in add/revise item call or in create/update fulfillment business policy call to specify the shipping rate table to use for that policy&apos;s domestic or international shipping options. &lt;br&gt;&lt;br&gt;This call currently supports getting rate tables related to the following marketplaces: United States, Canada, United Kingdom, Germany, Australia, France, Italy, and Spain.  &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Rate tables created with the Trading API might not have been assigned a &lt;b&gt;rateTableId&lt;/b&gt; at the time of their creation. This method can assign and return &lt;b&gt;rateTableId&lt;/b&gt; values for rate tables with missing IDs if you make a request using the &lt;b&gt;country_code&lt;/b&gt; where the seller has defined rate tables.&lt;/span&gt;  &lt;br&gt;&lt;br&gt;Sellers can define up to 40 shipping rate tables for their account, which lets them set up different rate tables for each of the marketplaces they sell into. Go to &lt;a href=&quot;https://www.ebay.com/ship/rt &quot;&gt;Shipping rate tables&lt;/a&gt; in  &lt;b&gt;My eBay&lt;/b&gt; to create and update rate tables.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter specifies the two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; code of country for which you want shipping rate table information. If you do not specify a country code, the request returns all of the seller&apos;s defined shipping rate tables for all eBay marketplaces. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum
         */
        @jakarta.annotation.Nullable
        public String countryCode;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("country_code", countryCode);
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
