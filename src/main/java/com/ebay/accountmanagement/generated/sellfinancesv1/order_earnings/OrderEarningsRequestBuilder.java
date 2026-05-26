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

package com.ebay.accountmanagement.generated.sellfinancesv1.order_earnings;

import com.ebay.accountmanagement.generated.sellfinancesv1.models.OrderEarnings;
import com.ebay.accountmanagement.generated.sellfinancesv1.order_earnings.item.WithOrderItemRequestBuilder;
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
 * Builds and executes requests for operations under /order_earnings
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrderEarningsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.accountmanagement.generated.sellfinancesv1.order_earnings.item collection
     * @param order_id This path parameter identifies the specific order for which earnings information is requested.
     * @return a {@link WithOrderItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithOrderItemRequestBuilder byOrder_id(@jakarta.annotation.Nonnull final String order_id) {
        Objects.requireNonNull(order_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("order_id", order_id);
        return new WithOrderItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link OrderEarningsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrderEarningsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/order_earnings{?filter*,limit*,offset*,sort*}", pathParameters);
    }
    /**
     * Instantiates a new {@link OrderEarningsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrderEarningsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/order_earnings{?filter*,limit*,offset*,sort*}", rawUrl);
    }
    /**
     * This method returns detailed order-level financial data for each order associated with a seller account. The returned order-level financial data includes order earnings, gross amount, expenses, and refunds. Order earnings includes earnings after deducting expenses and refunds from the gross amount. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Expenses include fees, shipping labels, and donations. Refunds include gross refunds, gross claims, and gross payment disputes.&lt;/span&gt;&lt;/p&gt;The financial data for orders will be returned as filtered based on the order&apos;s creation date. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Only charges and credits tied to the order are shown, and they appear in near real time for orders created within the selected order creation time window.&lt;/span&gt;&lt;/p&gt;Pagination is supported through the &lt;code&gt;limit&lt;/code&gt; and &lt;code&gt;offset&lt;/code&gt; parameters. These parameters can be used to control the number of records returned in a single response and to retrieve subsequent pages of results when the result set spans multiple pages.&lt;br/&gt;&lt;br/&gt;The response can be filtered by using the &lt;code&gt;filter&lt;/code&gt; parameter. This parameter allows consumers to restrict the results returned by the method based on supported filtering criteria.&lt;br/&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Access to the &lt;b&gt;order_earnings&lt;/b&gt; resource is currently limited to only US, China, or Hong&amp;nbsp;Kong sellers who meet the following criteria and also request access: &lt;br&gt;&lt;br&gt;- US sellers with the country of residence set to &lt;code&gt;US&lt;/code&gt; and having a payout currency in &lt;code&gt;USD&lt;/code&gt;.&lt;br&gt;&lt;br&gt;- Hong Kong or China sellers having the country of residence set to &lt;code&gt;HK&lt;/code&gt; or &lt;code&gt;CN&lt;/code&gt; and the payout currency set to &lt;code&gt;USD&lt;/code&gt; have access.&lt;br&gt;&lt;br&gt;To request access, submit an &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;application growth check&lt;/a&gt; to have the required &lt;a href=&quot;#h3-oauth-scope&quot;&gt;OAuth scope&lt;/a&gt; added to your app. After submission, you can use the same &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;growth check&lt;/a&gt; link to track the status of the request. &lt;br&gt;&lt;br&gt;eBay plans on expanding this to other markets in the future.&lt;/span&gt;&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all Finances API methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt; The Finances API does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link OrderEarnings}
     */
    @jakarta.annotation.Nullable
    public OrderEarnings get() {
        return get(null);
    }
    /**
     * This method returns detailed order-level financial data for each order associated with a seller account. The returned order-level financial data includes order earnings, gross amount, expenses, and refunds. Order earnings includes earnings after deducting expenses and refunds from the gross amount. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Expenses include fees, shipping labels, and donations. Refunds include gross refunds, gross claims, and gross payment disputes.&lt;/span&gt;&lt;/p&gt;The financial data for orders will be returned as filtered based on the order&apos;s creation date. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Only charges and credits tied to the order are shown, and they appear in near real time for orders created within the selected order creation time window.&lt;/span&gt;&lt;/p&gt;Pagination is supported through the &lt;code&gt;limit&lt;/code&gt; and &lt;code&gt;offset&lt;/code&gt; parameters. These parameters can be used to control the number of records returned in a single response and to retrieve subsequent pages of results when the result set spans multiple pages.&lt;br/&gt;&lt;br/&gt;The response can be filtered by using the &lt;code&gt;filter&lt;/code&gt; parameter. This parameter allows consumers to restrict the results returned by the method based on supported filtering criteria.&lt;br/&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Access to the &lt;b&gt;order_earnings&lt;/b&gt; resource is currently limited to only US, China, or Hong&amp;nbsp;Kong sellers who meet the following criteria and also request access: &lt;br&gt;&lt;br&gt;- US sellers with the country of residence set to &lt;code&gt;US&lt;/code&gt; and having a payout currency in &lt;code&gt;USD&lt;/code&gt;.&lt;br&gt;&lt;br&gt;- Hong Kong or China sellers having the country of residence set to &lt;code&gt;HK&lt;/code&gt; or &lt;code&gt;CN&lt;/code&gt; and the payout currency set to &lt;code&gt;USD&lt;/code&gt; have access.&lt;br&gt;&lt;br&gt;To request access, submit an &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;application growth check&lt;/a&gt; to have the required &lt;a href=&quot;#h3-oauth-scope&quot;&gt;OAuth scope&lt;/a&gt; added to your app. After submission, you can use the same &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;growth check&lt;/a&gt; link to track the status of the request. &lt;br&gt;&lt;br&gt;eBay plans on expanding this to other markets in the future.&lt;/span&gt;&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all Finances API methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt; The Finances API does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OrderEarnings}
     */
    @jakarta.annotation.Nullable
    public OrderEarnings get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, OrderEarnings::createFromDiscriminatorValue);
    }
    /**
     * This method returns detailed order-level financial data for each order associated with a seller account. The returned order-level financial data includes order earnings, gross amount, expenses, and refunds. Order earnings includes earnings after deducting expenses and refunds from the gross amount. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Expenses include fees, shipping labels, and donations. Refunds include gross refunds, gross claims, and gross payment disputes.&lt;/span&gt;&lt;/p&gt;The financial data for orders will be returned as filtered based on the order&apos;s creation date. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Only charges and credits tied to the order are shown, and they appear in near real time for orders created within the selected order creation time window.&lt;/span&gt;&lt;/p&gt;Pagination is supported through the &lt;code&gt;limit&lt;/code&gt; and &lt;code&gt;offset&lt;/code&gt; parameters. These parameters can be used to control the number of records returned in a single response and to retrieve subsequent pages of results when the result set spans multiple pages.&lt;br/&gt;&lt;br/&gt;The response can be filtered by using the &lt;code&gt;filter&lt;/code&gt; parameter. This parameter allows consumers to restrict the results returned by the method based on supported filtering criteria.&lt;br/&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Access to the &lt;b&gt;order_earnings&lt;/b&gt; resource is currently limited to only US, China, or Hong&amp;nbsp;Kong sellers who meet the following criteria and also request access: &lt;br&gt;&lt;br&gt;- US sellers with the country of residence set to &lt;code&gt;US&lt;/code&gt; and having a payout currency in &lt;code&gt;USD&lt;/code&gt;.&lt;br&gt;&lt;br&gt;- Hong Kong or China sellers having the country of residence set to &lt;code&gt;HK&lt;/code&gt; or &lt;code&gt;CN&lt;/code&gt; and the payout currency set to &lt;code&gt;USD&lt;/code&gt; have access.&lt;br&gt;&lt;br&gt;To request access, submit an &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;application growth check&lt;/a&gt; to have the required &lt;a href=&quot;#h3-oauth-scope&quot;&gt;OAuth scope&lt;/a&gt; added to your app. After submission, you can use the same &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;growth check&lt;/a&gt; link to track the status of the request. &lt;br&gt;&lt;br&gt;eBay plans on expanding this to other markets in the future.&lt;/span&gt;&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all Finances API methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt; The Finances API does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method returns detailed order-level financial data for each order associated with a seller account. The returned order-level financial data includes order earnings, gross amount, expenses, and refunds. Order earnings includes earnings after deducting expenses and refunds from the gross amount. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Expenses include fees, shipping labels, and donations. Refunds include gross refunds, gross claims, and gross payment disputes.&lt;/span&gt;&lt;/p&gt;The financial data for orders will be returned as filtered based on the order&apos;s creation date. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Only charges and credits tied to the order are shown, and they appear in near real time for orders created within the selected order creation time window.&lt;/span&gt;&lt;/p&gt;Pagination is supported through the &lt;code&gt;limit&lt;/code&gt; and &lt;code&gt;offset&lt;/code&gt; parameters. These parameters can be used to control the number of records returned in a single response and to retrieve subsequent pages of results when the result set spans multiple pages.&lt;br/&gt;&lt;br/&gt;The response can be filtered by using the &lt;code&gt;filter&lt;/code&gt; parameter. This parameter allows consumers to restrict the results returned by the method based on supported filtering criteria.&lt;br/&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Access to the &lt;b&gt;order_earnings&lt;/b&gt; resource is currently limited to only US, China, or Hong&amp;nbsp;Kong sellers who meet the following criteria and also request access: &lt;br&gt;&lt;br&gt;- US sellers with the country of residence set to &lt;code&gt;US&lt;/code&gt; and having a payout currency in &lt;code&gt;USD&lt;/code&gt;.&lt;br&gt;&lt;br&gt;- Hong Kong or China sellers having the country of residence set to &lt;code&gt;HK&lt;/code&gt; or &lt;code&gt;CN&lt;/code&gt; and the payout currency set to &lt;code&gt;USD&lt;/code&gt; have access.&lt;br&gt;&lt;br&gt;To request access, submit an &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;application growth check&lt;/a&gt; to have the required &lt;a href=&quot;#h3-oauth-scope&quot;&gt;OAuth scope&lt;/a&gt; added to your app. After submission, you can use the same &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;growth check&lt;/a&gt; link to track the status of the request. &lt;br&gt;&lt;br&gt;eBay plans on expanding this to other markets in the future.&lt;/span&gt;&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all Finances API methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt; The Finances API does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;/p&gt;
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
     * @return a {@link OrderEarningsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrderEarningsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OrderEarningsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method returns detailed order-level financial data for each order associated with a seller account. The returned order-level financial data includes order earnings, gross amount, expenses, and refunds. Order earnings includes earnings after deducting expenses and refunds from the gross amount. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Expenses include fees, shipping labels, and donations. Refunds include gross refunds, gross claims, and gross payment disputes.&lt;/span&gt;&lt;/p&gt;The financial data for orders will be returned as filtered based on the order&apos;s creation date. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Only charges and credits tied to the order are shown, and they appear in near real time for orders created within the selected order creation time window.&lt;/span&gt;&lt;/p&gt;Pagination is supported through the &lt;code&gt;limit&lt;/code&gt; and &lt;code&gt;offset&lt;/code&gt; parameters. These parameters can be used to control the number of records returned in a single response and to retrieve subsequent pages of results when the result set spans multiple pages.&lt;br/&gt;&lt;br/&gt;The response can be filtered by using the &lt;code&gt;filter&lt;/code&gt; parameter. This parameter allows consumers to restrict the results returned by the method based on supported filtering criteria.&lt;br/&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Access to the &lt;b&gt;order_earnings&lt;/b&gt; resource is currently limited to only US, China, or Hong&amp;nbsp;Kong sellers who meet the following criteria and also request access: &lt;br&gt;&lt;br&gt;- US sellers with the country of residence set to &lt;code&gt;US&lt;/code&gt; and having a payout currency in &lt;code&gt;USD&lt;/code&gt;.&lt;br&gt;&lt;br&gt;- Hong Kong or China sellers having the country of residence set to &lt;code&gt;HK&lt;/code&gt; or &lt;code&gt;CN&lt;/code&gt; and the payout currency set to &lt;code&gt;USD&lt;/code&gt; have access.&lt;br&gt;&lt;br&gt;To request access, submit an &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;application growth check&lt;/a&gt; to have the required &lt;a href=&quot;#h3-oauth-scope&quot;&gt;OAuth scope&lt;/a&gt; added to your app. After submission, you can use the same &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;growth check&lt;/a&gt; link to track the status of the request. &lt;br&gt;&lt;br&gt;eBay plans on expanding this to other markets in the future.&lt;/span&gt;&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all Finances API methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt; The Finances API does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;/p&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This parameter can be used to filter orders created within a specified date range. The filter uses the &lt;code&gt;orderCreationDate&lt;/code&gt; field, which works similarly to the &lt;code&gt;transactionDate&lt;/code&gt; filter used by the Transactions API. Currently, &lt;code&gt;orderCreationDate&lt;/code&gt; is the only supported filter value. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;All dates must be input using UTC format (&lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;) and should be adjusted accordingly for the local timezone of the user.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;b&gt;Default&lt;/b&gt;: If no value is specified, results from the past year will be returned.&lt;/p&gt; For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/finances/types/cos:FilterField
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * This parameter configures the number of orders to return per page of the result set. Use this parameter in conjunction with the &lt;b&gt;offset&lt;/b&gt; parameter to control the pagination of the output. &lt;br&gt;&lt;br&gt; For example, if &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the method retrieves orders 11 thru 20 from the result set. &lt;br&gt;&lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first page in the results set has an offset value of &lt;code&gt;0&lt;/code&gt;. &lt;/span&gt; &lt;br&gt;&lt;br&gt; &lt;b&gt;Maximum:&lt;/b&gt; &lt;code&gt;200&lt;/code&gt; &lt;br&gt; &lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;20&lt;/code&gt;
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * This parameter can be used to specify the number of records to skip before returning results. This parameter is commonly used with the &lt;code&gt;limit&lt;/code&gt; parameter to retrieve the next page of results.&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 10,000&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 0
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * This parameter can be used to specify the sort order of the results. Currently, sorting is supported by order creation date. &lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; Results returned in ascending order sorted by &lt;b&gt;orderCreationDate&lt;/b&gt;, with earliest creation date first. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/finances/types/cos:SortField
         */
        @jakarta.annotation.Nullable
        public String sort;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("filter", filter);
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            allQueryParams.put("sort", sort);
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
