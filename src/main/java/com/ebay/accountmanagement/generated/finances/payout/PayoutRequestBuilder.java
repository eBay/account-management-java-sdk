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

package com.ebay.accountmanagement.generated.finances.payout;

import com.ebay.accountmanagement.generated.finances.models.Payouts;
import com.ebay.accountmanagement.generated.finances.payout.item.WithPayoutItemRequestBuilder;
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
 * Builds and executes requests for operations under /payout
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PayoutRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.accountmanagement.generated.finances.payout.item collection
     * @param payout_Id This path parameter is used to specify the unique identifier of the payout being retrieved. &lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/finances/resources/payout/methods/getPayouts&quot; target=&quot;_blank &quot;&gt;getPayouts&lt;/a&gt; method to retrieve payout IDs, or check Seller Hub to get the payout ID. 
     * @return a {@link WithPayoutItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPayoutItemRequestBuilder byPayout_Id(@jakarta.annotation.Nonnull final String payout_Id) {
        Objects.requireNonNull(payout_Id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("payout_Id", payout_Id);
        return new WithPayoutItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link PayoutRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PayoutRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payout{?filter*,limit*,offset*,sort*}", pathParameters);
    }
    /**
     * Instantiates a new {@link PayoutRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PayoutRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payout{?filter*,limit*,offset*,sort*}", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;This method is used to retrieve the details of one or more seller payouts. By using the &lt;b&gt;filter&lt;/b&gt; query parameter, users can retrieve payouts processed within a specific date range, and/or they can retrieve payouts in a specific state.&lt;br&gt;&lt;br&gt;There are also pagination and sort query parameters that allow users to control the payouts that are returned in the response.&lt;br&gt;&lt;br&gt;If no payouts match the input criteria, an empty payload is returned.&lt;br&gt;&lt;br&gt;For split-payout cases, which are &lt;b&gt;only&lt;/b&gt; available to sellers in mainland China, this method will return the &lt;b&gt;payoutPercentage&lt;/b&gt; for the specified payout. This value indicates the current payout percentage allocated to a payout instrument. This method will also return the &lt;b&gt;convertedToCurrency&lt;/b&gt; and &lt;b&gt;convertedTo&lt;/b&gt; response fields set to CNY value and the &lt;b&gt;payoutReference&lt;/b&gt;, the unique identifier reference (not true payout). &lt;br&gt;&lt;br&gt;By using the &lt;b&gt;filter&lt;/b&gt; query parameter, users can retrieve the two true(actual) payouts associated with a &lt;b&gt;payoutReference&lt;/b&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For more information on split payouts, see &lt;a href=&quot;/api-docs/split-payout/playbook.html&quot; target=&quot;_blank&quot;&gt;Mainland China Split Payout Playbook&lt;/a&gt;.&lt;/span&gt; &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; Only payouts less than 5 years in the past can be retrieved.
     * @return a {@link Payouts}
     */
    @jakarta.annotation.Nullable
    public Payouts get() {
        return get(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;This method is used to retrieve the details of one or more seller payouts. By using the &lt;b&gt;filter&lt;/b&gt; query parameter, users can retrieve payouts processed within a specific date range, and/or they can retrieve payouts in a specific state.&lt;br&gt;&lt;br&gt;There are also pagination and sort query parameters that allow users to control the payouts that are returned in the response.&lt;br&gt;&lt;br&gt;If no payouts match the input criteria, an empty payload is returned.&lt;br&gt;&lt;br&gt;For split-payout cases, which are &lt;b&gt;only&lt;/b&gt; available to sellers in mainland China, this method will return the &lt;b&gt;payoutPercentage&lt;/b&gt; for the specified payout. This value indicates the current payout percentage allocated to a payout instrument. This method will also return the &lt;b&gt;convertedToCurrency&lt;/b&gt; and &lt;b&gt;convertedTo&lt;/b&gt; response fields set to CNY value and the &lt;b&gt;payoutReference&lt;/b&gt;, the unique identifier reference (not true payout). &lt;br&gt;&lt;br&gt;By using the &lt;b&gt;filter&lt;/b&gt; query parameter, users can retrieve the two true(actual) payouts associated with a &lt;b&gt;payoutReference&lt;/b&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For more information on split payouts, see &lt;a href=&quot;/api-docs/split-payout/playbook.html&quot; target=&quot;_blank&quot;&gt;Mainland China Split Payout Playbook&lt;/a&gt;.&lt;/span&gt; &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; Only payouts less than 5 years in the past can be retrieved.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Payouts}
     */
    @jakarta.annotation.Nullable
    public Payouts get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Payouts::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;This method is used to retrieve the details of one or more seller payouts. By using the &lt;b&gt;filter&lt;/b&gt; query parameter, users can retrieve payouts processed within a specific date range, and/or they can retrieve payouts in a specific state.&lt;br&gt;&lt;br&gt;There are also pagination and sort query parameters that allow users to control the payouts that are returned in the response.&lt;br&gt;&lt;br&gt;If no payouts match the input criteria, an empty payload is returned.&lt;br&gt;&lt;br&gt;For split-payout cases, which are &lt;b&gt;only&lt;/b&gt; available to sellers in mainland China, this method will return the &lt;b&gt;payoutPercentage&lt;/b&gt; for the specified payout. This value indicates the current payout percentage allocated to a payout instrument. This method will also return the &lt;b&gt;convertedToCurrency&lt;/b&gt; and &lt;b&gt;convertedTo&lt;/b&gt; response fields set to CNY value and the &lt;b&gt;payoutReference&lt;/b&gt;, the unique identifier reference (not true payout). &lt;br&gt;&lt;br&gt;By using the &lt;b&gt;filter&lt;/b&gt; query parameter, users can retrieve the two true(actual) payouts associated with a &lt;b&gt;payoutReference&lt;/b&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For more information on split payouts, see &lt;a href=&quot;/api-docs/split-payout/playbook.html&quot; target=&quot;_blank&quot;&gt;Mainland China Split Payout Playbook&lt;/a&gt;.&lt;/span&gt; &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; Only payouts less than 5 years in the past can be retrieved.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;This method is used to retrieve the details of one or more seller payouts. By using the &lt;b&gt;filter&lt;/b&gt; query parameter, users can retrieve payouts processed within a specific date range, and/or they can retrieve payouts in a specific state.&lt;br&gt;&lt;br&gt;There are also pagination and sort query parameters that allow users to control the payouts that are returned in the response.&lt;br&gt;&lt;br&gt;If no payouts match the input criteria, an empty payload is returned.&lt;br&gt;&lt;br&gt;For split-payout cases, which are &lt;b&gt;only&lt;/b&gt; available to sellers in mainland China, this method will return the &lt;b&gt;payoutPercentage&lt;/b&gt; for the specified payout. This value indicates the current payout percentage allocated to a payout instrument. This method will also return the &lt;b&gt;convertedToCurrency&lt;/b&gt; and &lt;b&gt;convertedTo&lt;/b&gt; response fields set to CNY value and the &lt;b&gt;payoutReference&lt;/b&gt;, the unique identifier reference (not true payout). &lt;br&gt;&lt;br&gt;By using the &lt;b&gt;filter&lt;/b&gt; query parameter, users can retrieve the two true(actual) payouts associated with a &lt;b&gt;payoutReference&lt;/b&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For more information on split payouts, see &lt;a href=&quot;/api-docs/split-payout/playbook.html&quot; target=&quot;_blank&quot;&gt;Mainland China Split Payout Playbook&lt;/a&gt;.&lt;/span&gt; &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; Only payouts less than 5 years in the past can be retrieved.
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
     * @return a {@link PayoutRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PayoutRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PayoutRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;This method is used to retrieve the details of one or more seller payouts. By using the &lt;b&gt;filter&lt;/b&gt; query parameter, users can retrieve payouts processed within a specific date range, and/or they can retrieve payouts in a specific state.&lt;br&gt;&lt;br&gt;There are also pagination and sort query parameters that allow users to control the payouts that are returned in the response.&lt;br&gt;&lt;br&gt;If no payouts match the input criteria, an empty payload is returned.&lt;br&gt;&lt;br&gt;For split-payout cases, which are &lt;b&gt;only&lt;/b&gt; available to sellers in mainland China, this method will return the &lt;b&gt;payoutPercentage&lt;/b&gt; for the specified payout. This value indicates the current payout percentage allocated to a payout instrument. This method will also return the &lt;b&gt;convertedToCurrency&lt;/b&gt; and &lt;b&gt;convertedTo&lt;/b&gt; response fields set to CNY value and the &lt;b&gt;payoutReference&lt;/b&gt;, the unique identifier reference (not true payout). &lt;br&gt;&lt;br&gt;By using the &lt;b&gt;filter&lt;/b&gt; query parameter, users can retrieve the two true(actual) payouts associated with a &lt;b&gt;payoutReference&lt;/b&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For more information on split payouts, see &lt;a href=&quot;/api-docs/split-payout/playbook.html&quot; target=&quot;_blank&quot;&gt;Mainland China Split Payout Playbook&lt;/a&gt;.&lt;/span&gt; &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; Only payouts less than 5 years in the past can be retrieved.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The filter types that can be used here are discussed below. If none of these filters are used, all payouts in all states from within the last five years are returned:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;b&gt;payoutDate&lt;/b&gt;: search for payouts within a specific range of dates. The date format to use is &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. Below is the proper syntax to use if filtering by a date range: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/payout?filter=payoutDate:[2024-12-17T00:00:01.000Z..2024-12-24T00:00:01.000Z]&lt;/code&gt;&lt;br&gt;&lt;br&gt;Only payouts from the last five years can be retrieved, so make sure the starting date is less than five years in the past from the present time. Also, the maximum date range that can be specified through this date filter is 36 months, so make sure your specified date range is no more than 36 months.&lt;/li&gt;&lt;li&gt;&lt;b&gt;lastAttemptedPayoutDate&lt;/b&gt;: search for attempted payouts that failed within a specific range of dates. In order to use this filter, the &lt;b&gt;payoutStatus&lt;/b&gt; filter must also be used and its value must be set to &lt;code&gt;RETRYABLE_FAILED&lt;/code&gt;. The date format to use is &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. The same syntax and requirements applicable to the &lt;b&gt;payoutDate&lt;/b&gt; filter also apply to the &lt;b&gt;lastAttemptedPayoutDate&lt;/b&gt; filter. &lt;br&gt;&lt;br&gt;This filter is only applicable (and will return results) if one or more seller payouts have failed, but are retryable.&lt;/li&gt; &lt;li&gt;&lt;b&gt;payoutStatus&lt;/b&gt;: search for payouts in a particular state. Only one payout state can be specified with this filter. For supported &lt;b&gt;payoutStatus&lt;/b&gt; values, see &lt;a href=&quot;/api-docs/sell/finances/types/pay:PayoutStatusEnum&quot; target=&quot;_blank &quot;&gt;PayoutStatusEnum&lt;/a&gt;.&lt;br&gt;&lt;br&gt;Below is the proper syntax to use if filtering by payout status: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/payout?filter=payoutStatus:{SUCCEEDED}&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;payoutReference&lt;/b&gt;: returns  the two true (actual) payouts associated with the payoutReference id. This parameter can support up to 200 &lt;b&gt;payoutReference&lt;/b&gt; inputs. This filter is &lt;b&gt;only&lt;/b&gt; supported for mainland China sellers. Below is the proper syntax to use if filtering by a specific &lt;b&gt;payoutReference&lt;/b&gt;:&lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/payout?filter=payoutReference:{5********3}&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;If both the &lt;b&gt;payoutDate&lt;/b&gt; and &lt;b&gt;payoutStatus&lt;/b&gt; filters are used, payouts must satisfy both criteria to be returned. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/finances/types/cos:FilterField
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * The number of payouts to return per page of the result set. Use this parameter in conjunction with the &lt;b&gt;offset&lt;/b&gt; parameter to control the pagination of the output. &lt;br&gt;&lt;br&gt; For example, if &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the method retrieves payouts 11 thru 20 from the result set. &lt;br&gt;&lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first payout in the results set has an offset value of &lt;code&gt;0&lt;/code&gt;. &lt;/span&gt; &lt;br&gt;&lt;br&gt; &lt;b&gt;Maximum:&lt;/b&gt; &lt;code&gt;200&lt;/code&gt; &lt;br&gt; &lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;20&lt;/code&gt;
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * This integer value indicates the actual position that the first payout returned on the current page has in the results set. So, if you wanted to view the 11th payout of the result set, you would set the &lt;strong&gt;offset&lt;/strong&gt; value in the request to &lt;code&gt;10&lt;/code&gt;. &lt;br&gt;&lt;br&gt;In the request, you can use the &lt;b&gt;offset&lt;/b&gt; parameter in conjunction with the &lt;b&gt;limit&lt;/b&gt; parameter to control the pagination of the output. For example, if &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;30&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the method retrieves payouts 31 thru 40 from the resulting collection of payouts.&lt;br&gt;&lt;br&gt;To avoid poor response time, use &lt;b&gt;offset&lt;/b&gt; values of less than &lt;code&gt;5000&lt;/code&gt;.&lt;br&gt;&lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first payout in the results set has an offset value of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;0&lt;/code&gt; (zero)
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * By default, payouts or failed payouts that match the input criteria are sorted in descending order according to the payout date/last attempted payout date (i.e., most recent payouts returned first).&lt;br&gt;&lt;br&gt;To view payouts in ascending order instead (i.e., oldest payouts/attempted payouts first,) you would include the &lt;b&gt;sort&lt;/b&gt; query parameter, and then set the value of its &lt;b&gt;field&lt;/b&gt; parameter to &lt;code&gt;payoutDate&lt;/code&gt; or &lt;code&gt;lastAttemptedPayoutDate&lt;/code&gt; (if searching for failed, retryable payouts). Below is the proper syntax to use if filtering by a payout date range in ascending order:&lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/payout?filter=payoutDate:[2018-12-17T00:00:01.000Z..2018-12-24T00:00:01.000Z]&amp;sort=payoutDate&lt;/code&gt;&lt;br&gt;&lt;br&gt;Payouts can only be sorted according to payout date, and can not be sorted by payout status. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/finances/types/cos:SortField
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
