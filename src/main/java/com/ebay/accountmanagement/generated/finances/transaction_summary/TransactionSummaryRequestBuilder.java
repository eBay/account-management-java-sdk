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

package com.ebay.accountmanagement.generated.finances.transaction_summary;

import com.ebay.accountmanagement.generated.finances.models.TransactionSummaryResponse;
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
 * Builds and executes requests for operations under /transaction_summary
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TransactionSummaryRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link TransactionSummaryRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TransactionSummaryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/transaction_summary{?filter*}", pathParameters);
    }
    /**
     * Instantiates a new {@link TransactionSummaryRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TransactionSummaryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/transaction_summary{?filter*}", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;The &lt;b&gt;getTransactionSummary&lt;/b&gt; method retrieves cumulative information for monetary transactions. If applicable, the number of payments with a &lt;code&gt;transactionStatus&lt;/code&gt; equal to &lt;code&gt;FUNDS_ON_HOLD&lt;/code&gt; and the total monetary amount of these on-hold payments are also returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For a complete list of transaction types, refer to &lt;a href=&quot;/api-docs/sell/finances/types/pay:TransactionTypeEnum &quot; target=&quot;_blank &quot;&gt;TransactionTypeEnum&lt;/a&gt;.&lt;/span&gt;&lt;br&gt;Refer to the &lt;a href=&quot;#uri.filter &quot;&gt;filter&lt;/a&gt; field for additional information about each filter and its use.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Unless a &lt;code&gt;transactionType&lt;/code&gt; filter is used to retrieve a specific type of transaction (e.g., &lt;code&gt;SALE&lt;/code&gt;, &lt;code&gt;REFUND&lt;/code&gt;, etc.,) the &lt;a href=&quot;#response.creditCount&quot;&gt;creditCount&lt;/a&gt; and &lt;a href=&quot;#response.creditAmount&quot;&gt;creditAmount&lt;/a&gt; response fields both include &lt;i&gt;order sales&lt;/i&gt; and &lt;i&gt;seller credits&lt;/i&gt; information. That is, the &lt;b&gt;count&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields do not distinguish between these two types monetary transactions.&lt;/span&gt; &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; getTransactionSummary will only return data on transactions that occurred less than five years in the past.
     * @return a {@link TransactionSummaryResponse}
     */
    @jakarta.annotation.Nullable
    public TransactionSummaryResponse get() {
        return get(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;The &lt;b&gt;getTransactionSummary&lt;/b&gt; method retrieves cumulative information for monetary transactions. If applicable, the number of payments with a &lt;code&gt;transactionStatus&lt;/code&gt; equal to &lt;code&gt;FUNDS_ON_HOLD&lt;/code&gt; and the total monetary amount of these on-hold payments are also returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For a complete list of transaction types, refer to &lt;a href=&quot;/api-docs/sell/finances/types/pay:TransactionTypeEnum &quot; target=&quot;_blank &quot;&gt;TransactionTypeEnum&lt;/a&gt;.&lt;/span&gt;&lt;br&gt;Refer to the &lt;a href=&quot;#uri.filter &quot;&gt;filter&lt;/a&gt; field for additional information about each filter and its use.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Unless a &lt;code&gt;transactionType&lt;/code&gt; filter is used to retrieve a specific type of transaction (e.g., &lt;code&gt;SALE&lt;/code&gt;, &lt;code&gt;REFUND&lt;/code&gt;, etc.,) the &lt;a href=&quot;#response.creditCount&quot;&gt;creditCount&lt;/a&gt; and &lt;a href=&quot;#response.creditAmount&quot;&gt;creditAmount&lt;/a&gt; response fields both include &lt;i&gt;order sales&lt;/i&gt; and &lt;i&gt;seller credits&lt;/i&gt; information. That is, the &lt;b&gt;count&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields do not distinguish between these two types monetary transactions.&lt;/span&gt; &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; getTransactionSummary will only return data on transactions that occurred less than five years in the past.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link TransactionSummaryResponse}
     */
    @jakarta.annotation.Nullable
    public TransactionSummaryResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, TransactionSummaryResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;The &lt;b&gt;getTransactionSummary&lt;/b&gt; method retrieves cumulative information for monetary transactions. If applicable, the number of payments with a &lt;code&gt;transactionStatus&lt;/code&gt; equal to &lt;code&gt;FUNDS_ON_HOLD&lt;/code&gt; and the total monetary amount of these on-hold payments are also returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For a complete list of transaction types, refer to &lt;a href=&quot;/api-docs/sell/finances/types/pay:TransactionTypeEnum &quot; target=&quot;_blank &quot;&gt;TransactionTypeEnum&lt;/a&gt;.&lt;/span&gt;&lt;br&gt;Refer to the &lt;a href=&quot;#uri.filter &quot;&gt;filter&lt;/a&gt; field for additional information about each filter and its use.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Unless a &lt;code&gt;transactionType&lt;/code&gt; filter is used to retrieve a specific type of transaction (e.g., &lt;code&gt;SALE&lt;/code&gt;, &lt;code&gt;REFUND&lt;/code&gt;, etc.,) the &lt;a href=&quot;#response.creditCount&quot;&gt;creditCount&lt;/a&gt; and &lt;a href=&quot;#response.creditAmount&quot;&gt;creditAmount&lt;/a&gt; response fields both include &lt;i&gt;order sales&lt;/i&gt; and &lt;i&gt;seller credits&lt;/i&gt; information. That is, the &lt;b&gt;count&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields do not distinguish between these two types monetary transactions.&lt;/span&gt; &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; getTransactionSummary will only return data on transactions that occurred less than five years in the past.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;The &lt;b&gt;getTransactionSummary&lt;/b&gt; method retrieves cumulative information for monetary transactions. If applicable, the number of payments with a &lt;code&gt;transactionStatus&lt;/code&gt; equal to &lt;code&gt;FUNDS_ON_HOLD&lt;/code&gt; and the total monetary amount of these on-hold payments are also returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For a complete list of transaction types, refer to &lt;a href=&quot;/api-docs/sell/finances/types/pay:TransactionTypeEnum &quot; target=&quot;_blank &quot;&gt;TransactionTypeEnum&lt;/a&gt;.&lt;/span&gt;&lt;br&gt;Refer to the &lt;a href=&quot;#uri.filter &quot;&gt;filter&lt;/a&gt; field for additional information about each filter and its use.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Unless a &lt;code&gt;transactionType&lt;/code&gt; filter is used to retrieve a specific type of transaction (e.g., &lt;code&gt;SALE&lt;/code&gt;, &lt;code&gt;REFUND&lt;/code&gt;, etc.,) the &lt;a href=&quot;#response.creditCount&quot;&gt;creditCount&lt;/a&gt; and &lt;a href=&quot;#response.creditAmount&quot;&gt;creditAmount&lt;/a&gt; response fields both include &lt;i&gt;order sales&lt;/i&gt; and &lt;i&gt;seller credits&lt;/i&gt; information. That is, the &lt;b&gt;count&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields do not distinguish between these two types monetary transactions.&lt;/span&gt; &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; getTransactionSummary will only return data on transactions that occurred less than five years in the past.
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
     * @return a {@link TransactionSummaryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TransactionSummaryRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TransactionSummaryRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;The &lt;b&gt;getTransactionSummary&lt;/b&gt; method retrieves cumulative information for monetary transactions. If applicable, the number of payments with a &lt;code&gt;transactionStatus&lt;/code&gt; equal to &lt;code&gt;FUNDS_ON_HOLD&lt;/code&gt; and the total monetary amount of these on-hold payments are also returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For a complete list of transaction types, refer to &lt;a href=&quot;/api-docs/sell/finances/types/pay:TransactionTypeEnum &quot; target=&quot;_blank &quot;&gt;TransactionTypeEnum&lt;/a&gt;.&lt;/span&gt;&lt;br&gt;Refer to the &lt;a href=&quot;#uri.filter &quot;&gt;filter&lt;/a&gt; field for additional information about each filter and its use.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Unless a &lt;code&gt;transactionType&lt;/code&gt; filter is used to retrieve a specific type of transaction (e.g., &lt;code&gt;SALE&lt;/code&gt;, &lt;code&gt;REFUND&lt;/code&gt;, etc.,) the &lt;a href=&quot;#response.creditCount&quot;&gt;creditCount&lt;/a&gt; and &lt;a href=&quot;#response.creditAmount&quot;&gt;creditAmount&lt;/a&gt; response fields both include &lt;i&gt;order sales&lt;/i&gt; and &lt;i&gt;seller credits&lt;/i&gt; information. That is, the &lt;b&gt;count&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields do not distinguish between these two types monetary transactions.&lt;/span&gt; &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; getTransactionSummary will only return data on transactions that occurred less than five years in the past.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Numerous filters are available for the &lt;strong&gt;getTransactionSummary&lt;/strong&gt; method, and these filters are discussed below. One or more of these filter types can be used. The &lt;b&gt;transactionStatus&lt;/b&gt; filter must be used. All other filters are optional. &lt;ul&gt;&lt;li&gt;&lt;b&gt;transactionStatus&lt;/b&gt;: the data returned in the response pertains to the sales, payouts, and transfer status set. For supported &lt;b&gt;transactionStatus&lt;/b&gt; values, see &lt;a href=&quot;/api-docs/sell/finances/types/pay:TransactionStatusEnum&quot; target=&quot;_blank &quot;&gt;TransactionStatusEnum&lt;/a&gt;. &lt;br&gt;&lt;br&gt;Below is the proper syntax to use when setting up the &lt;b&gt;transactionStatus&lt;/b&gt; filter: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/transaction_summary?filter=transactionStatus:&amp;#123;PAYOUT&amp;#125;&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;transactionDate&lt;/b&gt;: only consider monetary transactions that occurred within a specific range of dates.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; All dates must be input using UTC format (&lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;) and should be adjusted accordingly for the local timezone of the user.&lt;/span&gt;&lt;br&gt;&lt;br&gt;Below is the proper syntax to use if filtering by a date range: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/transaction_summary?filter=transactionDate:&amp;#91;2024-10-23T00:00:01.000Z..2024-11-09T00:00:01.000Z&amp;#93;&lt;/code&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt;Only monetary transactions from the last five years can be retrieved, so make sure the starting date is less than five years in the past from the present time. Also, the maximum date range that can be specified through this date filter is 36 months, so make sure your specified date range is no more than 36 months.&lt;/li&gt;  &lt;li&gt;&lt;b&gt;transactionType&lt;/b&gt;: only consider a specific type of monetary transaction. For supported &lt;b&gt;transactionType&lt;/b&gt; values, see &lt;a href=&quot;/api-docs/sell/finances/types/pay:TransactionTypeEnum&quot; target=&quot;_blank &quot;&gt;TransactionTypeEnum&lt;/a&gt;.&lt;br&gt;&lt;br&gt;Below is the proper syntax to use if filtering by a monetary transaction type: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/transaction_summary?filter=transactionType:{SALE}&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;buyerUsername&lt;/b&gt;: only consider monetary transactions involving a specific buyer (specified with the buyer&apos;s eBay username or user ID). Below is the proper syntax to use if filtering by a specific eBay buyer: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/transaction_summary?filter=buyerUsername:&amp;#123;buyer1234&amp;#125;&lt;/code&gt; &lt;/li&gt;&lt;li&gt;&lt;b&gt;payoutId&lt;/b&gt;: only consider monetary transactions related to a specific seller payout (identified with a Payout ID). This value is auto-generated by eBay once the seller payout is set to be processed. Below is the proper syntax to use if filtering by a specific Payout ID: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/transaction_summary?filter=payoutId:&amp;#123;5********8&amp;#125;&lt;/code&gt;  &lt;/li&gt;&lt;li&gt;&lt;b&gt;transactionId&lt;/b&gt;: the unique identifier of a monetary transaction. For a sales order, the &lt;b&gt;orderId&lt;/b&gt; filter should be used instead. Only the monetary transaction(s) associated with this &lt;b&gt;transactionId&lt;/b&gt; value are returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This filter cannot be used alone; the &lt;b&gt;transactionType&lt;/b&gt; must also be specified when filtering by transaction ID.&lt;/span&gt;&lt;br&gt;&lt;br&gt;Below is the proper syntax to use if filtering by a specific transaction ID: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/transaction_summary?filter=transactionId:{0*-0***0-3***3}&amp;filter=transactionType:{SALE}&lt;/code&gt; &lt;/li&gt;&lt;li&gt;&lt;b&gt;orderId&lt;/b&gt;: the unique identifier of a sales order. For any other monetary transaction, the &lt;b&gt;transactionId&lt;/b&gt; filter should be used instead. Only the monetary transaction(s) associated with this &lt;b&gt;orderId&lt;/b&gt; value are returned. Below is the proper syntax to use if filtering by a specific order ID: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/transaction_summary?filter=orderId:{0*-0***0-3***3}&lt;/code&gt; &lt;/li&gt;&lt;/ul&gt; For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/finances/types/cos:FilterField
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
