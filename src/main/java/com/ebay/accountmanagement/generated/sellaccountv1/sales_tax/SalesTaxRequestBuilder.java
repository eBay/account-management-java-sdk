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

package com.ebay.accountmanagement.generated.sellaccountv1.sales_tax;

import com.ebay.accountmanagement.generated.sellaccountv1.models.SalesTaxes;
import com.ebay.accountmanagement.generated.sellaccountv1.sales_tax.item.WithCountryCodeItemRequestBuilder;
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
 * Builds and executes requests for operations under /sales_tax
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SalesTaxRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.accountmanagement.generated.sellaccountv1.sales_tax.item collection
     * @param countryCode This path parameter specifies the two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; code for the country whose sales tax table you want to retrieve.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales-tax tables are available only for the US and Canada marketplaces. Therefore, the only supported values are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;US&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CA&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @return a {@link WithCountryCodeItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCountryCodeItemRequestBuilder byCountryCode(@jakarta.annotation.Nonnull final String countryCode) {
        Objects.requireNonNull(countryCode);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("countryCode", countryCode);
        return new WithCountryCodeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link SalesTaxRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SalesTaxRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sales_tax?country_code={country_code}", pathParameters);
    }
    /**
     * Instantiates a new {@link SalesTaxRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SalesTaxRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sales_tax?country_code={country_code}", rawUrl);
    }
    /**
     * Use this call to retrieve all sales tax table entries that the seller has defined for a specific country. All four response fields will be returned for each tax jurisdiction that matches the search criteria. If no sales tax rates are defined for the specified, a &lt;code&gt;204 No Content&lt;/code&gt; status code is returned with no response payload.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales-tax tables are only available for the US (EBAY_US) and Canada (EBAY_CA) marketplaces.&lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; In the US, eBay now calculates, collects, and remits sales tax to the proper taxing authorities in all 50 states and Washington, DC. Sellers can no longer specify sales-tax rates for these jurisdictions using a tax table.&lt;br&gt;&lt;br&gt;However, sellers may continue to use a sales-tax table to set rates for the following US territories:&lt;ul&gt;&lt;li&gt;American Samoa (AS)&lt;/li&gt;&lt;li&gt;Guam (GU)&lt;/li&gt;&lt;li&gt;Northern Mariana Islands (MP)&lt;/li&gt;&lt;li&gt;Palau (PW)&lt;/li&gt;&lt;li&gt;US Virgin Islands (VI)&lt;/li&gt;&lt;/ul&gt;For additional information, refer to &lt;a href=&quot;https://www.ebay.com/help/selling/fees-credits-invoices/taxes-import-charges?id=4121 &quot; target=&quot;_blank&quot;&gt;Taxes and import charges&lt;/a&gt;.&lt;/p&gt;&lt;/div&gt;
     * @return a {@link SalesTaxes}
     */
    @jakarta.annotation.Nullable
    public SalesTaxes get() {
        return get(null);
    }
    /**
     * Use this call to retrieve all sales tax table entries that the seller has defined for a specific country. All four response fields will be returned for each tax jurisdiction that matches the search criteria. If no sales tax rates are defined for the specified, a &lt;code&gt;204 No Content&lt;/code&gt; status code is returned with no response payload.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales-tax tables are only available for the US (EBAY_US) and Canada (EBAY_CA) marketplaces.&lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; In the US, eBay now calculates, collects, and remits sales tax to the proper taxing authorities in all 50 states and Washington, DC. Sellers can no longer specify sales-tax rates for these jurisdictions using a tax table.&lt;br&gt;&lt;br&gt;However, sellers may continue to use a sales-tax table to set rates for the following US territories:&lt;ul&gt;&lt;li&gt;American Samoa (AS)&lt;/li&gt;&lt;li&gt;Guam (GU)&lt;/li&gt;&lt;li&gt;Northern Mariana Islands (MP)&lt;/li&gt;&lt;li&gt;Palau (PW)&lt;/li&gt;&lt;li&gt;US Virgin Islands (VI)&lt;/li&gt;&lt;/ul&gt;For additional information, refer to &lt;a href=&quot;https://www.ebay.com/help/selling/fees-credits-invoices/taxes-import-charges?id=4121 &quot; target=&quot;_blank&quot;&gt;Taxes and import charges&lt;/a&gt;.&lt;/p&gt;&lt;/div&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SalesTaxes}
     */
    @jakarta.annotation.Nullable
    public SalesTaxes get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SalesTaxes::createFromDiscriminatorValue);
    }
    /**
     * Use this call to retrieve all sales tax table entries that the seller has defined for a specific country. All four response fields will be returned for each tax jurisdiction that matches the search criteria. If no sales tax rates are defined for the specified, a &lt;code&gt;204 No Content&lt;/code&gt; status code is returned with no response payload.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales-tax tables are only available for the US (EBAY_US) and Canada (EBAY_CA) marketplaces.&lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; In the US, eBay now calculates, collects, and remits sales tax to the proper taxing authorities in all 50 states and Washington, DC. Sellers can no longer specify sales-tax rates for these jurisdictions using a tax table.&lt;br&gt;&lt;br&gt;However, sellers may continue to use a sales-tax table to set rates for the following US territories:&lt;ul&gt;&lt;li&gt;American Samoa (AS)&lt;/li&gt;&lt;li&gt;Guam (GU)&lt;/li&gt;&lt;li&gt;Northern Mariana Islands (MP)&lt;/li&gt;&lt;li&gt;Palau (PW)&lt;/li&gt;&lt;li&gt;US Virgin Islands (VI)&lt;/li&gt;&lt;/ul&gt;For additional information, refer to &lt;a href=&quot;https://www.ebay.com/help/selling/fees-credits-invoices/taxes-import-charges?id=4121 &quot; target=&quot;_blank&quot;&gt;Taxes and import charges&lt;/a&gt;.&lt;/p&gt;&lt;/div&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Use this call to retrieve all sales tax table entries that the seller has defined for a specific country. All four response fields will be returned for each tax jurisdiction that matches the search criteria. If no sales tax rates are defined for the specified, a &lt;code&gt;204 No Content&lt;/code&gt; status code is returned with no response payload.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales-tax tables are only available for the US (EBAY_US) and Canada (EBAY_CA) marketplaces.&lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; In the US, eBay now calculates, collects, and remits sales tax to the proper taxing authorities in all 50 states and Washington, DC. Sellers can no longer specify sales-tax rates for these jurisdictions using a tax table.&lt;br&gt;&lt;br&gt;However, sellers may continue to use a sales-tax table to set rates for the following US territories:&lt;ul&gt;&lt;li&gt;American Samoa (AS)&lt;/li&gt;&lt;li&gt;Guam (GU)&lt;/li&gt;&lt;li&gt;Northern Mariana Islands (MP)&lt;/li&gt;&lt;li&gt;Palau (PW)&lt;/li&gt;&lt;li&gt;US Virgin Islands (VI)&lt;/li&gt;&lt;/ul&gt;For additional information, refer to &lt;a href=&quot;https://www.ebay.com/help/selling/fees-credits-invoices/taxes-import-charges?id=4121 &quot; target=&quot;_blank&quot;&gt;Taxes and import charges&lt;/a&gt;.&lt;/p&gt;&lt;/div&gt;
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
     * @return a {@link SalesTaxRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SalesTaxRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SalesTaxRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Use this call to retrieve all sales tax table entries that the seller has defined for a specific country. All four response fields will be returned for each tax jurisdiction that matches the search criteria. If no sales tax rates are defined for the specified, a &lt;code&gt;204 No Content&lt;/code&gt; status code is returned with no response payload.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales-tax tables are only available for the US (EBAY_US) and Canada (EBAY_CA) marketplaces.&lt;/span&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; In the US, eBay now calculates, collects, and remits sales tax to the proper taxing authorities in all 50 states and Washington, DC. Sellers can no longer specify sales-tax rates for these jurisdictions using a tax table.&lt;br&gt;&lt;br&gt;However, sellers may continue to use a sales-tax table to set rates for the following US territories:&lt;ul&gt;&lt;li&gt;American Samoa (AS)&lt;/li&gt;&lt;li&gt;Guam (GU)&lt;/li&gt;&lt;li&gt;Northern Mariana Islands (MP)&lt;/li&gt;&lt;li&gt;Palau (PW)&lt;/li&gt;&lt;li&gt;US Virgin Islands (VI)&lt;/li&gt;&lt;/ul&gt;For additional information, refer to &lt;a href=&quot;https://www.ebay.com/help/selling/fees-credits-invoices/taxes-import-charges?id=4121 &quot; target=&quot;_blank&quot;&gt;Taxes and import charges&lt;/a&gt;.&lt;/p&gt;&lt;/div&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This path parameter specifies the two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; code for the country whose tax table you want to retrieve.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales-tax tables are available only for the US and Canada marketplaces. Therefore, the only supported values are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;US&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CA&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt; For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum
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
