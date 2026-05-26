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

package com.ebay.accountmanagement.generated.sellaccountv1.bulk_create_or_replace_sales_tax;

import com.ebay.accountmanagement.generated.sellaccountv1.models.BulkSalesTaxInput;
import com.ebay.accountmanagement.generated.sellaccountv1.models.UpdatedSalesTaxResponse;
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
 * Builds and executes requests for operations under /bulk_create_or_replace_sales_tax
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkCreateOrReplaceSalesTaxRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link BulkCreateOrReplaceSalesTaxRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkCreateOrReplaceSalesTaxRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/bulk_create_or_replace_sales_tax", pathParameters);
    }
    /**
     * Instantiates a new {@link BulkCreateOrReplaceSalesTaxRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkCreateOrReplaceSalesTaxRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/bulk_create_or_replace_sales_tax", rawUrl);
    }
    /**
     * This method creates or updates multiple sales-tax table entries.&lt;br&gt;&lt;br&gt;&lt;i&gt;Sales-tax tables&lt;/i&gt; can be set up for countries that support different &lt;i&gt;tax jurisdictions&lt;/i&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales-tax tables are only available for the US (EBAY_US) and Canada (EBAY_CA) marketplaces.&lt;/span&gt;&lt;br&gt;Each sales-tax table entry comprises the following parameters:&lt;ul&gt;&lt;li&gt;&lt;code&gt;countryCode&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;jurisdictionId&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;salesTaxPercentage&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;shippingAndHandlingTaxed&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;Valid jurisdiction IDs are retrieved using &lt;b&gt;&lt;a href=&quot;/api-docs/sell/metadata/resources/country/methods/getSalesTaxJurisdictions&quot; target=&quot;_blank&quot;&gt;getSalesTaxJurisdictions&lt;/a&gt;&lt;/b&gt; in the Metadata API.&lt;br&gt;&lt;br&gt;For details about using this call, refer to &lt;a href=&quot;/api-docs/sell/static/seller-accounts/tax-tables.html&quot;&gt;Establishing sales-tax tables&lt;/a&gt;.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; In the US, eBay now calculates, collects, and remits sales tax to the proper taxing authorities in all 50 states and Washington, DC. Sellers can no longer specify sales-tax rates for these jurisdictions using a tax table.&lt;br&gt;&lt;br&gt;However, sellers may continue to use a sales-tax table to set rates for the following US territories:&lt;ul&gt;&lt;li&gt;American Samoa (AS)&lt;/li&gt;&lt;li&gt;Guam (GU)&lt;/li&gt;&lt;li&gt;Northern Mariana Islands (MP)&lt;/li&gt;&lt;li&gt;Palau (PW)&lt;/li&gt;&lt;li&gt;US Virgin Islands (VI)&lt;/li&gt;&lt;/ul&gt;For additional information, refer to &lt;a href=&quot;https://www.ebay.com/help/selling/fees-credits-invoices/taxes-import-charges?id=4121 &quot; target=&quot;_blank&quot;&gt;Taxes and import charges&lt;/a&gt;.&lt;/p&gt;&lt;/div&gt;
     * @param body The request body
     * @return a {@link UpdatedSalesTaxResponse}
     */
    @jakarta.annotation.Nullable
    public UpdatedSalesTaxResponse post(@jakarta.annotation.Nonnull final BulkSalesTaxInput body) {
        return post(body, null);
    }
    /**
     * This method creates or updates multiple sales-tax table entries.&lt;br&gt;&lt;br&gt;&lt;i&gt;Sales-tax tables&lt;/i&gt; can be set up for countries that support different &lt;i&gt;tax jurisdictions&lt;/i&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales-tax tables are only available for the US (EBAY_US) and Canada (EBAY_CA) marketplaces.&lt;/span&gt;&lt;br&gt;Each sales-tax table entry comprises the following parameters:&lt;ul&gt;&lt;li&gt;&lt;code&gt;countryCode&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;jurisdictionId&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;salesTaxPercentage&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;shippingAndHandlingTaxed&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;Valid jurisdiction IDs are retrieved using &lt;b&gt;&lt;a href=&quot;/api-docs/sell/metadata/resources/country/methods/getSalesTaxJurisdictions&quot; target=&quot;_blank&quot;&gt;getSalesTaxJurisdictions&lt;/a&gt;&lt;/b&gt; in the Metadata API.&lt;br&gt;&lt;br&gt;For details about using this call, refer to &lt;a href=&quot;/api-docs/sell/static/seller-accounts/tax-tables.html&quot;&gt;Establishing sales-tax tables&lt;/a&gt;.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; In the US, eBay now calculates, collects, and remits sales tax to the proper taxing authorities in all 50 states and Washington, DC. Sellers can no longer specify sales-tax rates for these jurisdictions using a tax table.&lt;br&gt;&lt;br&gt;However, sellers may continue to use a sales-tax table to set rates for the following US territories:&lt;ul&gt;&lt;li&gt;American Samoa (AS)&lt;/li&gt;&lt;li&gt;Guam (GU)&lt;/li&gt;&lt;li&gt;Northern Mariana Islands (MP)&lt;/li&gt;&lt;li&gt;Palau (PW)&lt;/li&gt;&lt;li&gt;US Virgin Islands (VI)&lt;/li&gt;&lt;/ul&gt;For additional information, refer to &lt;a href=&quot;https://www.ebay.com/help/selling/fees-credits-invoices/taxes-import-charges?id=4121 &quot; target=&quot;_blank&quot;&gt;Taxes and import charges&lt;/a&gt;.&lt;/p&gt;&lt;/div&gt;
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UpdatedSalesTaxResponse}
     */
    @jakarta.annotation.Nullable
    public UpdatedSalesTaxResponse post(@jakarta.annotation.Nonnull final BulkSalesTaxInput body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, UpdatedSalesTaxResponse::createFromDiscriminatorValue);
    }
    /**
     * This method creates or updates multiple sales-tax table entries.&lt;br&gt;&lt;br&gt;&lt;i&gt;Sales-tax tables&lt;/i&gt; can be set up for countries that support different &lt;i&gt;tax jurisdictions&lt;/i&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales-tax tables are only available for the US (EBAY_US) and Canada (EBAY_CA) marketplaces.&lt;/span&gt;&lt;br&gt;Each sales-tax table entry comprises the following parameters:&lt;ul&gt;&lt;li&gt;&lt;code&gt;countryCode&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;jurisdictionId&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;salesTaxPercentage&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;shippingAndHandlingTaxed&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;Valid jurisdiction IDs are retrieved using &lt;b&gt;&lt;a href=&quot;/api-docs/sell/metadata/resources/country/methods/getSalesTaxJurisdictions&quot; target=&quot;_blank&quot;&gt;getSalesTaxJurisdictions&lt;/a&gt;&lt;/b&gt; in the Metadata API.&lt;br&gt;&lt;br&gt;For details about using this call, refer to &lt;a href=&quot;/api-docs/sell/static/seller-accounts/tax-tables.html&quot;&gt;Establishing sales-tax tables&lt;/a&gt;.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; In the US, eBay now calculates, collects, and remits sales tax to the proper taxing authorities in all 50 states and Washington, DC. Sellers can no longer specify sales-tax rates for these jurisdictions using a tax table.&lt;br&gt;&lt;br&gt;However, sellers may continue to use a sales-tax table to set rates for the following US territories:&lt;ul&gt;&lt;li&gt;American Samoa (AS)&lt;/li&gt;&lt;li&gt;Guam (GU)&lt;/li&gt;&lt;li&gt;Northern Mariana Islands (MP)&lt;/li&gt;&lt;li&gt;Palau (PW)&lt;/li&gt;&lt;li&gt;US Virgin Islands (VI)&lt;/li&gt;&lt;/ul&gt;For additional information, refer to &lt;a href=&quot;https://www.ebay.com/help/selling/fees-credits-invoices/taxes-import-charges?id=4121 &quot; target=&quot;_blank&quot;&gt;Taxes and import charges&lt;/a&gt;.&lt;/p&gt;&lt;/div&gt;
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkSalesTaxInput body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method creates or updates multiple sales-tax table entries.&lt;br&gt;&lt;br&gt;&lt;i&gt;Sales-tax tables&lt;/i&gt; can be set up for countries that support different &lt;i&gt;tax jurisdictions&lt;/i&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales-tax tables are only available for the US (EBAY_US) and Canada (EBAY_CA) marketplaces.&lt;/span&gt;&lt;br&gt;Each sales-tax table entry comprises the following parameters:&lt;ul&gt;&lt;li&gt;&lt;code&gt;countryCode&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;jurisdictionId&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;salesTaxPercentage&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;shippingAndHandlingTaxed&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;Valid jurisdiction IDs are retrieved using &lt;b&gt;&lt;a href=&quot;/api-docs/sell/metadata/resources/country/methods/getSalesTaxJurisdictions&quot; target=&quot;_blank&quot;&gt;getSalesTaxJurisdictions&lt;/a&gt;&lt;/b&gt; in the Metadata API.&lt;br&gt;&lt;br&gt;For details about using this call, refer to &lt;a href=&quot;/api-docs/sell/static/seller-accounts/tax-tables.html&quot;&gt;Establishing sales-tax tables&lt;/a&gt;.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; In the US, eBay now calculates, collects, and remits sales tax to the proper taxing authorities in all 50 states and Washington, DC. Sellers can no longer specify sales-tax rates for these jurisdictions using a tax table.&lt;br&gt;&lt;br&gt;However, sellers may continue to use a sales-tax table to set rates for the following US territories:&lt;ul&gt;&lt;li&gt;American Samoa (AS)&lt;/li&gt;&lt;li&gt;Guam (GU)&lt;/li&gt;&lt;li&gt;Northern Mariana Islands (MP)&lt;/li&gt;&lt;li&gt;Palau (PW)&lt;/li&gt;&lt;li&gt;US Virgin Islands (VI)&lt;/li&gt;&lt;/ul&gt;For additional information, refer to &lt;a href=&quot;https://www.ebay.com/help/selling/fees-credits-invoices/taxes-import-charges?id=4121 &quot; target=&quot;_blank&quot;&gt;Taxes and import charges&lt;/a&gt;.&lt;/p&gt;&lt;/div&gt;
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkSalesTaxInput body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link BulkCreateOrReplaceSalesTaxRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkCreateOrReplaceSalesTaxRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BulkCreateOrReplaceSalesTaxRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
