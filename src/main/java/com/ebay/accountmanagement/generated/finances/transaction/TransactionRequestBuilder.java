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

package com.ebay.accountmanagement.generated.finances.transaction;

import com.ebay.accountmanagement.generated.finances.models.Transactions;
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
 * Builds and executes requests for operations under /transaction
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TransactionRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link TransactionRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TransactionRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/transaction{?filter*,limit*,offset*,sort*}", pathParameters);
    }
    /**
     * Instantiates a new {@link TransactionRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TransactionRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/transaction{?filter*,limit*,offset*,sort*}", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;The &lt;b&gt;getTransactions&lt;/b&gt; method allows a seller to retrieve information about one or more of their monetary transactions.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For a complete list of transaction types, refer to &lt;a href=&quot;/api-docs/sell/finances/types/pay:TransactionTypeEnum &quot; target=&quot;_blank &quot;&gt;TransactionTypeEnum&lt;/a&gt;.&lt;/span&gt;&lt;br&gt;Numerous input filters are available which can be used individually or combined to refine the data that are returned. For example:&lt;ul&gt;&lt;li&gt;&lt;code&gt;SALE&lt;/code&gt; transactions for August 15, 2022;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RETURN&lt;/code&gt; transactions for the month of January, 2021;&lt;/li&gt;&lt;li&gt;Transactions currently in a &lt;code&gt;transactionStatus&lt;/code&gt; equal to &lt;code&gt;FUNDS_ON_HOLD&lt;/code&gt;.&lt;/li&gt;&lt;/ul&gt;Refer to the &lt;a href=&quot;#uri.filter &quot;&gt;filter&lt;/a&gt; field for additional information about each filter and its use.&lt;br&gt;&lt;br&gt;Pagination and sort query parameters are also provided that allow users to further control how monetary transactions are displayed in the response.&lt;br&gt;&lt;br&gt;If no monetary transactions match the input criteria, an http status code of &lt;em&gt;204 No Content&lt;/em&gt; is returned with no response payload. &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; Only monetary transactions that have occurred within the last five years can be retrieved.
     * @return a {@link Transactions}
     */
    @jakarta.annotation.Nullable
    public Transactions get() {
        return get(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;The &lt;b&gt;getTransactions&lt;/b&gt; method allows a seller to retrieve information about one or more of their monetary transactions.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For a complete list of transaction types, refer to &lt;a href=&quot;/api-docs/sell/finances/types/pay:TransactionTypeEnum &quot; target=&quot;_blank &quot;&gt;TransactionTypeEnum&lt;/a&gt;.&lt;/span&gt;&lt;br&gt;Numerous input filters are available which can be used individually or combined to refine the data that are returned. For example:&lt;ul&gt;&lt;li&gt;&lt;code&gt;SALE&lt;/code&gt; transactions for August 15, 2022;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RETURN&lt;/code&gt; transactions for the month of January, 2021;&lt;/li&gt;&lt;li&gt;Transactions currently in a &lt;code&gt;transactionStatus&lt;/code&gt; equal to &lt;code&gt;FUNDS_ON_HOLD&lt;/code&gt;.&lt;/li&gt;&lt;/ul&gt;Refer to the &lt;a href=&quot;#uri.filter &quot;&gt;filter&lt;/a&gt; field for additional information about each filter and its use.&lt;br&gt;&lt;br&gt;Pagination and sort query parameters are also provided that allow users to further control how monetary transactions are displayed in the response.&lt;br&gt;&lt;br&gt;If no monetary transactions match the input criteria, an http status code of &lt;em&gt;204 No Content&lt;/em&gt; is returned with no response payload. &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; Only monetary transactions that have occurred within the last five years can be retrieved.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Transactions}
     */
    @jakarta.annotation.Nullable
    public Transactions get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Transactions::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;The &lt;b&gt;getTransactions&lt;/b&gt; method allows a seller to retrieve information about one or more of their monetary transactions.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For a complete list of transaction types, refer to &lt;a href=&quot;/api-docs/sell/finances/types/pay:TransactionTypeEnum &quot; target=&quot;_blank &quot;&gt;TransactionTypeEnum&lt;/a&gt;.&lt;/span&gt;&lt;br&gt;Numerous input filters are available which can be used individually or combined to refine the data that are returned. For example:&lt;ul&gt;&lt;li&gt;&lt;code&gt;SALE&lt;/code&gt; transactions for August 15, 2022;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RETURN&lt;/code&gt; transactions for the month of January, 2021;&lt;/li&gt;&lt;li&gt;Transactions currently in a &lt;code&gt;transactionStatus&lt;/code&gt; equal to &lt;code&gt;FUNDS_ON_HOLD&lt;/code&gt;.&lt;/li&gt;&lt;/ul&gt;Refer to the &lt;a href=&quot;#uri.filter &quot;&gt;filter&lt;/a&gt; field for additional information about each filter and its use.&lt;br&gt;&lt;br&gt;Pagination and sort query parameters are also provided that allow users to further control how monetary transactions are displayed in the response.&lt;br&gt;&lt;br&gt;If no monetary transactions match the input criteria, an http status code of &lt;em&gt;204 No Content&lt;/em&gt; is returned with no response payload. &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; Only monetary transactions that have occurred within the last five years can be retrieved.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;The &lt;b&gt;getTransactions&lt;/b&gt; method allows a seller to retrieve information about one or more of their monetary transactions.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For a complete list of transaction types, refer to &lt;a href=&quot;/api-docs/sell/finances/types/pay:TransactionTypeEnum &quot; target=&quot;_blank &quot;&gt;TransactionTypeEnum&lt;/a&gt;.&lt;/span&gt;&lt;br&gt;Numerous input filters are available which can be used individually or combined to refine the data that are returned. For example:&lt;ul&gt;&lt;li&gt;&lt;code&gt;SALE&lt;/code&gt; transactions for August 15, 2022;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RETURN&lt;/code&gt; transactions for the month of January, 2021;&lt;/li&gt;&lt;li&gt;Transactions currently in a &lt;code&gt;transactionStatus&lt;/code&gt; equal to &lt;code&gt;FUNDS_ON_HOLD&lt;/code&gt;.&lt;/li&gt;&lt;/ul&gt;Refer to the &lt;a href=&quot;#uri.filter &quot;&gt;filter&lt;/a&gt; field for additional information about each filter and its use.&lt;br&gt;&lt;br&gt;Pagination and sort query parameters are also provided that allow users to further control how monetary transactions are displayed in the response.&lt;br&gt;&lt;br&gt;If no monetary transactions match the input criteria, an http status code of &lt;em&gt;204 No Content&lt;/em&gt; is returned with no response payload. &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; Only monetary transactions that have occurred within the last five years can be retrieved.
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
     * @return a {@link TransactionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TransactionRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TransactionRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;The &lt;b&gt;getTransactions&lt;/b&gt; method allows a seller to retrieve information about one or more of their monetary transactions.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For a complete list of transaction types, refer to &lt;a href=&quot;/api-docs/sell/finances/types/pay:TransactionTypeEnum &quot; target=&quot;_blank &quot;&gt;TransactionTypeEnum&lt;/a&gt;.&lt;/span&gt;&lt;br&gt;Numerous input filters are available which can be used individually or combined to refine the data that are returned. For example:&lt;ul&gt;&lt;li&gt;&lt;code&gt;SALE&lt;/code&gt; transactions for August 15, 2022;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RETURN&lt;/code&gt; transactions for the month of January, 2021;&lt;/li&gt;&lt;li&gt;Transactions currently in a &lt;code&gt;transactionStatus&lt;/code&gt; equal to &lt;code&gt;FUNDS_ON_HOLD&lt;/code&gt;.&lt;/li&gt;&lt;/ul&gt;Refer to the &lt;a href=&quot;#uri.filter &quot;&gt;filter&lt;/a&gt; field for additional information about each filter and its use.&lt;br&gt;&lt;br&gt;Pagination and sort query parameters are also provided that allow users to further control how monetary transactions are displayed in the response.&lt;br&gt;&lt;br&gt;If no monetary transactions match the input criteria, an http status code of &lt;em&gt;204 No Content&lt;/em&gt; is returned with no response payload. &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; Only monetary transactions that have occurred within the last five years can be retrieved.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Numerous filters are available for the &lt;strong&gt;getTransactions&lt;/strong&gt; method, and these filters are discussed below. One or more of these filter types can be used. If none of these filters are used, all monetary transactions occurring within the last five years are returned:&lt;ul&gt;&lt;li&gt;&lt;b&gt;transactionDate&lt;/b&gt;: search for monetary transactions that occurred within a specific range of dates.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; All dates must be input using UTC format (&lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;) and should be adjusted accordingly for the local timezone of the user.&lt;/span&gt;&lt;br&gt;Below is the proper syntax to use if filtering by a date range: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/transaction?filter=transactionDate:[2024-10-23T00:00:01.000Z..2024-11-09T00:00:01.000Z]&lt;/code&gt;&lt;br&gt;&lt;br&gt;Only payouts from the last five years can be retrieved, so make sure the starting date is less than five years in the past from the present time. Also, the maximum date range that can be specified through this date filter is 36 months, so make sure your specified date range is no more than 36 months.&lt;/li&gt;  &lt;li&gt;&lt;b&gt;transactionType&lt;/b&gt;: search for a specific type of monetary transaction. For supported &lt;b&gt;transactionType&lt;/b&gt; values, see &lt;a href=&quot;/api-docs/sell/finances/types/pay:TransactionTypeEnum&quot; target=&quot;_blank &quot;&gt;TransactionTypeEnum&lt;/a&gt;.&lt;br&gt;&lt;br&gt;Below is the proper syntax to use if filtering by a monetary transaction type: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/transaction?filter=transactionType:{SALE}&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;transactionStatus&lt;/b&gt;: this filter type is only applicable for sales orders, and allows the user to filter seller payouts in a particular state. For supported &lt;b&gt;transactionStatus&lt;/b&gt; values, see &lt;a href=&quot;/api-docs/sell/finances/types/pay:TransactionStatusEnum&quot; target=&quot;_blank &quot;&gt;TransactionStatusEnum&lt;/a&gt;.&lt;br&gt;&lt;br&gt;Below is the proper syntax to use if filtering by transaction status: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/transaction?filter=transactionStatus:{PAYOUT}&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;buyerUsername&lt;/b&gt;: the eBay username or user ID of the buyer involved in the monetary transaction. Only monetary transactions involving this buyer are returned. Below is the proper syntax to use if filtering by a specific eBay buyer: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/transaction?filter=buyerUsername:{buyer1234}&lt;/code&gt; &lt;/li&gt;&lt;li&gt;&lt;b&gt;payoutId&lt;/b&gt;: the unique identifier of a seller payout. This value is auto-generated by eBay once the seller payout is set to be processed. Only monetary transactions involving this Payout ID are returned. Below is the proper syntax to use if filtering by a specific Payout ID: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/transaction?filter=payoutId:{5********8}&lt;/code&gt;  &lt;/li&gt;&lt;li&gt;&lt;b&gt;transactionId&lt;/b&gt;: use this field  &lt;b&gt;transactionId&lt;/b&gt; and also &lt;b&gt;transactionType&lt;/b&gt; to filter for a unique identifier of a monetary transaction, or an error will occur. For a sales order, the &lt;b&gt;orderId&lt;/b&gt; filter should be used instead. Only the monetary transaction defined by the identifier is returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This filter cannot be used alone; the &lt;b&gt;transactionType&lt;/b&gt; must also be specified when filtering by transaction ID.&lt;/span&gt;&lt;br&gt;Below is the proper syntax to use if filtering by a specific transaction ID: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/transaction?filter=transactionId:{0*-0***0-3***3}&amp;filter=transactionType:{SALE}&lt;/code&gt; &lt;/li&gt;&lt;li&gt;&lt;b&gt;orderId&lt;/b&gt;: the unique identifier of a sales order. Only monetary transaction(s) associated with this &lt;b&gt;orderId&lt;/b&gt; value are returned.&lt;br&gt;&lt;br&gt;For any other monetary transaction, the &lt;b&gt;transactionId&lt;/b&gt; filter should be used instead.&lt;br&gt;&lt;br&gt;Below is the proper syntax to use if filtering by a specific order ID:&lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/transaction?filter=orderId:{0*-0***0-3***3}&lt;/code&gt; &lt;/li&gt;&lt;li&gt;&lt;b&gt;payoutReference&lt;/b&gt;: returns the monetary transactions associated with the &lt;b&gt;payoutReference&lt;/b&gt;. By using this ID as a filter parameter, the user will be able to track all monetary transactions associated with both sibling payouts, including sales and refunds, if any. This filter is &lt;b&gt;only&lt;/b&gt; supported for sellers in Mainland China. Below is the proper syntax to use if filtering by &lt;b&gt;payoutReference&lt;/b&gt;: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/transaction?filter=payoutReference:{5*******3}&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/finances/types/cos:FilterField
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * The number of monetary transactions to return per page of the result set. Use this parameter in conjunction with the &lt;b&gt;offset&lt;/b&gt; parameter to control the pagination of the output. &lt;br&gt;&lt;br&gt; For example, if &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the method retrieves monetary transactions 11 thru 20 from the result set. &lt;br&gt;&lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt; &lt;br&gt;&lt;br&gt; &lt;b&gt;Maximum:&lt;/b&gt;&lt;code&gt; 1000&lt;/code&gt; &lt;br&gt; &lt;b&gt;Default:&lt;/b&gt;&lt;code&gt; 20&lt;/code&gt;
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * This integer value indicates the actual position that the first monetary transaction returned on the current page has in the results set. So, if you wanted to view the 11th monetary transaction of the result set, you would set the &lt;strong&gt;offset&lt;/strong&gt; value in the request to &lt;code&gt;10&lt;/code&gt;. &lt;br&gt;&lt;br&gt;In the request, you can use the &lt;b&gt;offset&lt;/b&gt; parameter in conjunction with the &lt;b&gt;limit&lt;/b&gt; parameter to control the pagination of the output. For example, if &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;30&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the method retrieves transactions 31 thru 40 from the resulting collection of transactions. &lt;br&gt;&lt;br&gt; To avoid poor response time, use &lt;b&gt;offset&lt;/b&gt; values of less than &lt;code&gt;5000&lt;/code&gt;. &lt;br&gt;&lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;0&lt;/code&gt; (zero)
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * By default, monetary transactions that match the input criteria are sorted in descending order according to the transaction date (i.e, most recent transactions returned first).&lt;br&gt;&lt;br&gt;To view transactions in ascending order instead (i.e., oldest transactions first), you would include the &lt;b&gt;sort&lt;/b&gt; query parameter and set its value to &lt;code&gt;transactionDate&lt;/code&gt;. Below is the proper syntax to use if filtering by a transaction date range in ascending order:&lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/transaction?filter=transactionDate:[2023-10-01T00:00:01.000Z..2023-10-12T00:00:01.000Z]&amp;sort=transactionDate&lt;/code&gt;&lt;br&gt;&lt;br&gt;Transactions can only be sorted according to transaction date. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/finances/types/cos:SortField
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
