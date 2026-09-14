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

package com.ebay.accountmanagement.generated.finances.payout_summary;

import com.ebay.accountmanagement.generated.finances.models.PayoutSummaryResponse;
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
 * Builds and executes requests for operations under /payout_summary
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PayoutSummaryRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link PayoutSummaryRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PayoutSummaryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payout_summary{?filter*}", pathParameters);
    }
    /**
     * Instantiates a new {@link PayoutSummaryRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PayoutSummaryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payout_summary{?filter*}", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;This method is used to retrieve cumulative values for payouts in a particular state, or all states. The metadata in the response includes total payouts, the total number of monetary transactions (sales, refunds, credits) associated with those payouts, and the total dollar value of all payouts.&lt;br&gt;&lt;br&gt;If the &lt;b&gt;filter&lt;/b&gt; query parameter is used to filter by payout status, only one payout status value may be used. If the &lt;b&gt;filter&lt;/b&gt; query parameter is not used to filter by a specific payout status, cumulative values for payouts in all states are returned.&lt;br&gt;&lt;br&gt;The user can also use the &lt;b&gt;filter&lt;/b&gt; query parameter to specify a date range, and then only payouts that were processed within that date range are considered. &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; getPayoutSummary will only return data on payouts that occurred less than five years in the past.
     * @return a {@link PayoutSummaryResponse}
     */
    @jakarta.annotation.Nullable
    public PayoutSummaryResponse get() {
        return get(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;This method is used to retrieve cumulative values for payouts in a particular state, or all states. The metadata in the response includes total payouts, the total number of monetary transactions (sales, refunds, credits) associated with those payouts, and the total dollar value of all payouts.&lt;br&gt;&lt;br&gt;If the &lt;b&gt;filter&lt;/b&gt; query parameter is used to filter by payout status, only one payout status value may be used. If the &lt;b&gt;filter&lt;/b&gt; query parameter is not used to filter by a specific payout status, cumulative values for payouts in all states are returned.&lt;br&gt;&lt;br&gt;The user can also use the &lt;b&gt;filter&lt;/b&gt; query parameter to specify a date range, and then only payouts that were processed within that date range are considered. &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; getPayoutSummary will only return data on payouts that occurred less than five years in the past.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PayoutSummaryResponse}
     */
    @jakarta.annotation.Nullable
    public PayoutSummaryResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PayoutSummaryResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;This method is used to retrieve cumulative values for payouts in a particular state, or all states. The metadata in the response includes total payouts, the total number of monetary transactions (sales, refunds, credits) associated with those payouts, and the total dollar value of all payouts.&lt;br&gt;&lt;br&gt;If the &lt;b&gt;filter&lt;/b&gt; query parameter is used to filter by payout status, only one payout status value may be used. If the &lt;b&gt;filter&lt;/b&gt; query parameter is not used to filter by a specific payout status, cumulative values for payouts in all states are returned.&lt;br&gt;&lt;br&gt;The user can also use the &lt;b&gt;filter&lt;/b&gt; query parameter to specify a date range, and then only payouts that were processed within that date range are considered. &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; getPayoutSummary will only return data on payouts that occurred less than five years in the past.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;This method is used to retrieve cumulative values for payouts in a particular state, or all states. The metadata in the response includes total payouts, the total number of monetary transactions (sales, refunds, credits) associated with those payouts, and the total dollar value of all payouts.&lt;br&gt;&lt;br&gt;If the &lt;b&gt;filter&lt;/b&gt; query parameter is used to filter by payout status, only one payout status value may be used. If the &lt;b&gt;filter&lt;/b&gt; query parameter is not used to filter by a specific payout status, cumulative values for payouts in all states are returned.&lt;br&gt;&lt;br&gt;The user can also use the &lt;b&gt;filter&lt;/b&gt; query parameter to specify a date range, and then only payouts that were processed within that date range are considered. &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; getPayoutSummary will only return data on payouts that occurred less than five years in the past.
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
     * @return a {@link PayoutSummaryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PayoutSummaryRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PayoutSummaryRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;This method is used to retrieve cumulative values for payouts in a particular state, or all states. The metadata in the response includes total payouts, the total number of monetary transactions (sales, refunds, credits) associated with those payouts, and the total dollar value of all payouts.&lt;br&gt;&lt;br&gt;If the &lt;b&gt;filter&lt;/b&gt; query parameter is used to filter by payout status, only one payout status value may be used. If the &lt;b&gt;filter&lt;/b&gt; query parameter is not used to filter by a specific payout status, cumulative values for payouts in all states are returned.&lt;br&gt;&lt;br&gt;The user can also use the &lt;b&gt;filter&lt;/b&gt; query parameter to specify a date range, and then only payouts that were processed within that date range are considered. &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; getPayoutSummary will only return data on payouts that occurred less than five years in the past.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The two filter types that can be used here are discussed below. One or both of these filter types can be used. If none of these filters are used, the data returned in the response will reflect all payouts in all states that have occurred within the last five years:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;b&gt;payoutDate&lt;/b&gt;: consider payouts processed within a specific range of dates. The date format to use is &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. Below is the proper syntax to use if filtering by a date range: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/payout_summary?filter=payoutDate:[2024-12-17T00:00:01.000Z..2024-12-24T00:00:01.000Z]&lt;/code&gt;&lt;br&gt;&lt;br&gt;Only payouts from the last five years can be retrieved, so make sure the starting date is less than five years in the past from the present time. Also, the maximum date range that can be specified through this date filter is 36 months, so make sure your specified date range is no more than 36 months.&lt;/li&gt; &lt;li&gt;&lt;b&gt;payoutStatus&lt;/b&gt;: consider only the payouts in a particular state. Only one payout state can be specified with this filter. For supported &lt;b&gt;payoutStatus&lt;/b&gt; values, see &lt;a href=&quot;/api-docs/sell/finances/types/pay:PayoutStatusEnum&quot; target=&quot;_blank &quot;&gt;PayoutStatusEnum&lt;/a&gt;.&lt;br&gt;&lt;br&gt;Below is the proper syntax to use if filtering by payout status: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/payout_summary?filter=payoutStatus:{SUCCEEDED}&lt;/code&gt;&lt;/ul&gt;&lt;br&gt;If both the &lt;b&gt;payoutDate&lt;/b&gt; and &lt;b&gt;payoutStatus&lt;/b&gt; filters are used, only the payouts that satisfy both criteria are considered in the results. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/finances/types/cos:FilterField
         */
        @jakarta.annotation.Nullable
        public String filter;
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
