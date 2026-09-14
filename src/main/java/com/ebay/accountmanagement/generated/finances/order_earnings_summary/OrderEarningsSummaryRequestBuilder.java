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

package com.ebay.accountmanagement.generated.finances.order_earnings_summary;

import com.ebay.accountmanagement.generated.finances.models.Error;
import com.ebay.accountmanagement.generated.finances.models.OrderEarningsSummary;
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
 * Builds and executes requests for operations under /order_earnings_summary
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrderEarningsSummaryRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link OrderEarningsSummaryRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrderEarningsSummaryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/order_earnings_summary{?filter*}", pathParameters);
    }
    /**
     * Instantiates a new {@link OrderEarningsSummaryRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrderEarningsSummaryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/order_earnings_summary{?filter*}", rawUrl);
    }
    /**
     * This method returns a summarized view of order earnings information for one or more orders associated with a seller account. The method retrieves aggregated data for order earnings after deducting expenses and refunds from the gross amount. You can use this method for high-level financial reporting workflows.&lt;br&gt;&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Expenses include fees, shipping labels, and donations. Refunds include gross refunds, gross claims, and gross payment disputes.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Only charges and credits tied to the order are shown, and they appear in near real time for orders created within the selected order creation time window.&lt;/span&gt;&lt;/p&gt;The response can be filtered by using the &lt;code&gt;filter&lt;/code&gt; parameter. This parameter allows consumers to restrict the summary results returned by the method based on supported filtering criteria.&lt;br/&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Access to the &lt;b&gt;order_earnings&lt;/b&gt; resource is currently limited to only US, China, or Hong&amp;nbsp;Kong sellers who meet the following criteria and also request access: &lt;br&gt;&lt;br&gt;- US sellers with the country of residence set to &lt;code&gt;US&lt;/code&gt; and having a payout currency in &lt;code&gt;USD&lt;/code&gt;.&lt;br&gt;&lt;br&gt;- Hong Kong or China sellers having the country of residence set to &lt;code&gt;HK&lt;/code&gt; or &lt;code&gt;CN&lt;/code&gt; and the payout currency set to &lt;code&gt;USD&lt;/code&gt; have access.&lt;br&gt;&lt;br&gt;To request access, submit an &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;application growth check&lt;/a&gt; to have the required &lt;a href=&quot;#h3-oauth-scope&quot;&gt;OAuth scope&lt;/a&gt; added to your app. After submission, you can use the same &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;growth check&lt;/a&gt; link to track the status of the request. &lt;br&gt;&lt;br&gt;eBay plans on expanding this to other markets in the future.&lt;/span&gt;&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all Finances API methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt; The Finances API does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link OrderEarningsSummary}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 401 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public OrderEarningsSummary get() {
        return get(null);
    }
    /**
     * This method returns a summarized view of order earnings information for one or more orders associated with a seller account. The method retrieves aggregated data for order earnings after deducting expenses and refunds from the gross amount. You can use this method for high-level financial reporting workflows.&lt;br&gt;&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Expenses include fees, shipping labels, and donations. Refunds include gross refunds, gross claims, and gross payment disputes.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Only charges and credits tied to the order are shown, and they appear in near real time for orders created within the selected order creation time window.&lt;/span&gt;&lt;/p&gt;The response can be filtered by using the &lt;code&gt;filter&lt;/code&gt; parameter. This parameter allows consumers to restrict the summary results returned by the method based on supported filtering criteria.&lt;br/&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Access to the &lt;b&gt;order_earnings&lt;/b&gt; resource is currently limited to only US, China, or Hong&amp;nbsp;Kong sellers who meet the following criteria and also request access: &lt;br&gt;&lt;br&gt;- US sellers with the country of residence set to &lt;code&gt;US&lt;/code&gt; and having a payout currency in &lt;code&gt;USD&lt;/code&gt;.&lt;br&gt;&lt;br&gt;- Hong Kong or China sellers having the country of residence set to &lt;code&gt;HK&lt;/code&gt; or &lt;code&gt;CN&lt;/code&gt; and the payout currency set to &lt;code&gt;USD&lt;/code&gt; have access.&lt;br&gt;&lt;br&gt;To request access, submit an &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;application growth check&lt;/a&gt; to have the required &lt;a href=&quot;#h3-oauth-scope&quot;&gt;OAuth scope&lt;/a&gt; added to your app. After submission, you can use the same &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;growth check&lt;/a&gt; link to track the status of the request. &lt;br&gt;&lt;br&gt;eBay plans on expanding this to other markets in the future.&lt;/span&gt;&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all Finances API methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt; The Finances API does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OrderEarningsSummary}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 401 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public OrderEarningsSummary get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("401", Error::createFromDiscriminatorValue);
        errorMapping.put("403", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OrderEarningsSummary::createFromDiscriminatorValue);
    }
    /**
     * This method returns a summarized view of order earnings information for one or more orders associated with a seller account. The method retrieves aggregated data for order earnings after deducting expenses and refunds from the gross amount. You can use this method for high-level financial reporting workflows.&lt;br&gt;&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Expenses include fees, shipping labels, and donations. Refunds include gross refunds, gross claims, and gross payment disputes.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Only charges and credits tied to the order are shown, and they appear in near real time for orders created within the selected order creation time window.&lt;/span&gt;&lt;/p&gt;The response can be filtered by using the &lt;code&gt;filter&lt;/code&gt; parameter. This parameter allows consumers to restrict the summary results returned by the method based on supported filtering criteria.&lt;br/&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Access to the &lt;b&gt;order_earnings&lt;/b&gt; resource is currently limited to only US, China, or Hong&amp;nbsp;Kong sellers who meet the following criteria and also request access: &lt;br&gt;&lt;br&gt;- US sellers with the country of residence set to &lt;code&gt;US&lt;/code&gt; and having a payout currency in &lt;code&gt;USD&lt;/code&gt;.&lt;br&gt;&lt;br&gt;- Hong Kong or China sellers having the country of residence set to &lt;code&gt;HK&lt;/code&gt; or &lt;code&gt;CN&lt;/code&gt; and the payout currency set to &lt;code&gt;USD&lt;/code&gt; have access.&lt;br&gt;&lt;br&gt;To request access, submit an &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;application growth check&lt;/a&gt; to have the required &lt;a href=&quot;#h3-oauth-scope&quot;&gt;OAuth scope&lt;/a&gt; added to your app. After submission, you can use the same &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;growth check&lt;/a&gt; link to track the status of the request. &lt;br&gt;&lt;br&gt;eBay plans on expanding this to other markets in the future.&lt;/span&gt;&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all Finances API methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt; The Finances API does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method returns a summarized view of order earnings information for one or more orders associated with a seller account. The method retrieves aggregated data for order earnings after deducting expenses and refunds from the gross amount. You can use this method for high-level financial reporting workflows.&lt;br&gt;&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Expenses include fees, shipping labels, and donations. Refunds include gross refunds, gross claims, and gross payment disputes.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Only charges and credits tied to the order are shown, and they appear in near real time for orders created within the selected order creation time window.&lt;/span&gt;&lt;/p&gt;The response can be filtered by using the &lt;code&gt;filter&lt;/code&gt; parameter. This parameter allows consumers to restrict the summary results returned by the method based on supported filtering criteria.&lt;br/&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Access to the &lt;b&gt;order_earnings&lt;/b&gt; resource is currently limited to only US, China, or Hong&amp;nbsp;Kong sellers who meet the following criteria and also request access: &lt;br&gt;&lt;br&gt;- US sellers with the country of residence set to &lt;code&gt;US&lt;/code&gt; and having a payout currency in &lt;code&gt;USD&lt;/code&gt;.&lt;br&gt;&lt;br&gt;- Hong Kong or China sellers having the country of residence set to &lt;code&gt;HK&lt;/code&gt; or &lt;code&gt;CN&lt;/code&gt; and the payout currency set to &lt;code&gt;USD&lt;/code&gt; have access.&lt;br&gt;&lt;br&gt;To request access, submit an &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;application growth check&lt;/a&gt; to have the required &lt;a href=&quot;#h3-oauth-scope&quot;&gt;OAuth scope&lt;/a&gt; added to your app. After submission, you can use the same &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;growth check&lt;/a&gt; link to track the status of the request. &lt;br&gt;&lt;br&gt;eBay plans on expanding this to other markets in the future.&lt;/span&gt;&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all Finances API methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt; The Finances API does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;/p&gt;
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
     * @return a {@link OrderEarningsSummaryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrderEarningsSummaryRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OrderEarningsSummaryRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method returns a summarized view of order earnings information for one or more orders associated with a seller account. The method retrieves aggregated data for order earnings after deducting expenses and refunds from the gross amount. You can use this method for high-level financial reporting workflows.&lt;br&gt;&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Expenses include fees, shipping labels, and donations. Refunds include gross refunds, gross claims, and gross payment disputes.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Only charges and credits tied to the order are shown, and they appear in near real time for orders created within the selected order creation time window.&lt;/span&gt;&lt;/p&gt;The response can be filtered by using the &lt;code&gt;filter&lt;/code&gt; parameter. This parameter allows consumers to restrict the summary results returned by the method based on supported filtering criteria.&lt;br/&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Access to the &lt;b&gt;order_earnings&lt;/b&gt; resource is currently limited to only US, China, or Hong&amp;nbsp;Kong sellers who meet the following criteria and also request access: &lt;br&gt;&lt;br&gt;- US sellers with the country of residence set to &lt;code&gt;US&lt;/code&gt; and having a payout currency in &lt;code&gt;USD&lt;/code&gt;.&lt;br&gt;&lt;br&gt;- Hong Kong or China sellers having the country of residence set to &lt;code&gt;HK&lt;/code&gt; or &lt;code&gt;CN&lt;/code&gt; and the payout currency set to &lt;code&gt;USD&lt;/code&gt; have access.&lt;br&gt;&lt;br&gt;To request access, submit an &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;application growth check&lt;/a&gt; to have the required &lt;a href=&quot;#h3-oauth-scope&quot;&gt;OAuth scope&lt;/a&gt; added to your app. After submission, you can use the same &lt;a href=&quot;/api-docs/static/gs_request-an-application-growth.html&quot; target=&quot;_blank&quot;&gt;growth check&lt;/a&gt; link to track the status of the request. &lt;br&gt;&lt;br&gt;eBay plans on expanding this to other markets in the future.&lt;/span&gt;&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all Finances API methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt; The Finances API does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;/p&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This parameter can be used to filter orders created within a specified date range. The filter uses the &lt;code&gt;orderCreationDate&lt;/code&gt; field, which works similarly to the &lt;code&gt;transactionDate&lt;/code&gt; filter used by the Transactions API. Currently, &lt;code&gt;orderCreationDate&lt;/code&gt; is the only supported filter value.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;All dates must be input using UTC format (&lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;) and should be adjusted accordingly for the local timezone of the user.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;b&gt;Default&lt;/b&gt;: If no value is specified, results from the past year will be returned.&lt;/p&gt; 
         */
        @jakarta.annotation.Nullable
        public String[] filter;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("filter", filter);
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
