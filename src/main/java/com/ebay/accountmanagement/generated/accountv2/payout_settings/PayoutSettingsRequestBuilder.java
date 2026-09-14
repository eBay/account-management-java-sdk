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

package com.ebay.accountmanagement.generated.accountv2.payout_settings;

import com.ebay.accountmanagement.generated.accountv2.models.PayoutSettingsResponse;
import com.ebay.accountmanagement.generated.accountv2.payout_settings.update_percentage.UpdatePercentageRequestBuilder;
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
 * Builds and executes requests for operations under /payout_settings
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PayoutSettingsRequestBuilder extends BaseRequestBuilder {
    /**
     * The update_percentage property
     * @return a {@link UpdatePercentageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdatePercentageRequestBuilder updatePercentage() {
        return new UpdatePercentageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link PayoutSettingsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PayoutSettingsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payout_settings", pathParameters);
    }
    /**
     * Instantiates a new {@link PayoutSettingsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PayoutSettingsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payout_settings", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Split-payout functionality is &lt;b&gt;only&lt;/b&gt; available to mainland China sellers, who can split payouts between their Payoneer account and bank account. Card payouts are not currently available for sellers in mainland China.&lt;/p&gt;&lt;/div&gt;&lt;br/&gt;This method returns details on two payment instruments defined on a seller&apos;s account, including the ID, type, status, nickname, last four digits of the account number, and payout percentage for the instruments.&lt;br/&gt;&lt;br/&gt;Using the &lt;b&gt;instrumentId&lt;/b&gt; returned with this method, sellers can makes changes to the payout split of the instruments with the &lt;b&gt;updatePayoutPercentage&lt;/b&gt; method. Note that the &lt;b&gt;instrumentStatus&lt;/b&gt; of a payment instrument, also returned using this method, must be &lt;code&gt;ACTIVE&lt;/code&gt; in order to do split payouts on that payment instrument.
     * @return a {@link PayoutSettingsResponse}
     */
    @jakarta.annotation.Nullable
    public PayoutSettingsResponse get() {
        return get(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Split-payout functionality is &lt;b&gt;only&lt;/b&gt; available to mainland China sellers, who can split payouts between their Payoneer account and bank account. Card payouts are not currently available for sellers in mainland China.&lt;/p&gt;&lt;/div&gt;&lt;br/&gt;This method returns details on two payment instruments defined on a seller&apos;s account, including the ID, type, status, nickname, last four digits of the account number, and payout percentage for the instruments.&lt;br/&gt;&lt;br/&gt;Using the &lt;b&gt;instrumentId&lt;/b&gt; returned with this method, sellers can makes changes to the payout split of the instruments with the &lt;b&gt;updatePayoutPercentage&lt;/b&gt; method. Note that the &lt;b&gt;instrumentStatus&lt;/b&gt; of a payment instrument, also returned using this method, must be &lt;code&gt;ACTIVE&lt;/code&gt; in order to do split payouts on that payment instrument.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PayoutSettingsResponse}
     */
    @jakarta.annotation.Nullable
    public PayoutSettingsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PayoutSettingsResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Split-payout functionality is &lt;b&gt;only&lt;/b&gt; available to mainland China sellers, who can split payouts between their Payoneer account and bank account. Card payouts are not currently available for sellers in mainland China.&lt;/p&gt;&lt;/div&gt;&lt;br/&gt;This method returns details on two payment instruments defined on a seller&apos;s account, including the ID, type, status, nickname, last four digits of the account number, and payout percentage for the instruments.&lt;br/&gt;&lt;br/&gt;Using the &lt;b&gt;instrumentId&lt;/b&gt; returned with this method, sellers can makes changes to the payout split of the instruments with the &lt;b&gt;updatePayoutPercentage&lt;/b&gt; method. Note that the &lt;b&gt;instrumentStatus&lt;/b&gt; of a payment instrument, also returned using this method, must be &lt;code&gt;ACTIVE&lt;/code&gt; in order to do split payouts on that payment instrument.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Split-payout functionality is &lt;b&gt;only&lt;/b&gt; available to mainland China sellers, who can split payouts between their Payoneer account and bank account. Card payouts are not currently available for sellers in mainland China.&lt;/p&gt;&lt;/div&gt;&lt;br/&gt;This method returns details on two payment instruments defined on a seller&apos;s account, including the ID, type, status, nickname, last four digits of the account number, and payout percentage for the instruments.&lt;br/&gt;&lt;br/&gt;Using the &lt;b&gt;instrumentId&lt;/b&gt; returned with this method, sellers can makes changes to the payout split of the instruments with the &lt;b&gt;updatePayoutPercentage&lt;/b&gt; method. Note that the &lt;b&gt;instrumentStatus&lt;/b&gt; of a payment instrument, also returned using this method, must be &lt;code&gt;ACTIVE&lt;/code&gt; in order to do split payouts on that payment instrument.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link PayoutSettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PayoutSettingsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PayoutSettingsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
