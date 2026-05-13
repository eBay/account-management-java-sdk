package com.ebay.accountmanagement.generated.sellfinancesv1.payout.item;

import com.ebay.accountmanagement.generated.sellfinancesv1.models.Payout;
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
 * Builds and executes requests for operations under /payout/{payout_Id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithPayoutItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithPayoutItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPayoutItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payout/{payout_Id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithPayoutItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPayoutItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payout/{payout_Id}", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;This method retrieves details on a specific seller payout. The unique identifier of the payout is passed in as a path parameter at the end of the call URI. &lt;br&gt;&lt;br&gt;The &lt;b&gt;getPayouts&lt;/b&gt; method can be used to retrieve the unique identifier of a payout, or the user can check Seller Hub.&lt;br&gt;&lt;br&gt;For split-payout cases, which are &lt;b&gt;only&lt;/b&gt; available to sellers in mainland China, this method will return the &lt;b&gt;payoutPercentage&lt;/b&gt; for the specified payout. This value indicates the current payout percentage allocated to a payment instrument. This method will also return the &lt;b&gt;convertedToCurrency&lt;/b&gt; and &lt;b&gt;convertedToValue&lt;/b&gt; response fields in CNY value. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In split-payout cases, this method will only return details on an individual payout, also known as a true(actual) payoutid. If a user inputs a &lt;b&gt;payoutReference&lt;/b&gt; id as a path parameter, the call will fail and the &lt;b&gt;404 not found&lt;/b&gt; status code will be returned.&lt;br&gt;For more information on split payouts, see &lt;a href=&quot;/api-docs/split-payout/playbook.html&quot; target=&quot;_blank&quot;&gt;Mainland China Split Payout Playbook&lt;/a&gt;.&lt;/span&gt;
     * @return a {@link Payout}
     */
    @jakarta.annotation.Nullable
    public Payout get() {
        return get(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;This method retrieves details on a specific seller payout. The unique identifier of the payout is passed in as a path parameter at the end of the call URI. &lt;br&gt;&lt;br&gt;The &lt;b&gt;getPayouts&lt;/b&gt; method can be used to retrieve the unique identifier of a payout, or the user can check Seller Hub.&lt;br&gt;&lt;br&gt;For split-payout cases, which are &lt;b&gt;only&lt;/b&gt; available to sellers in mainland China, this method will return the &lt;b&gt;payoutPercentage&lt;/b&gt; for the specified payout. This value indicates the current payout percentage allocated to a payment instrument. This method will also return the &lt;b&gt;convertedToCurrency&lt;/b&gt; and &lt;b&gt;convertedToValue&lt;/b&gt; response fields in CNY value. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In split-payout cases, this method will only return details on an individual payout, also known as a true(actual) payoutid. If a user inputs a &lt;b&gt;payoutReference&lt;/b&gt; id as a path parameter, the call will fail and the &lt;b&gt;404 not found&lt;/b&gt; status code will be returned.&lt;br&gt;For more information on split payouts, see &lt;a href=&quot;/api-docs/split-payout/playbook.html&quot; target=&quot;_blank&quot;&gt;Mainland China Split Payout Playbook&lt;/a&gt;.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Payout}
     */
    @jakarta.annotation.Nullable
    public Payout get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Payout::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;This method retrieves details on a specific seller payout. The unique identifier of the payout is passed in as a path parameter at the end of the call URI. &lt;br&gt;&lt;br&gt;The &lt;b&gt;getPayouts&lt;/b&gt; method can be used to retrieve the unique identifier of a payout, or the user can check Seller Hub.&lt;br&gt;&lt;br&gt;For split-payout cases, which are &lt;b&gt;only&lt;/b&gt; available to sellers in mainland China, this method will return the &lt;b&gt;payoutPercentage&lt;/b&gt; for the specified payout. This value indicates the current payout percentage allocated to a payment instrument. This method will also return the &lt;b&gt;convertedToCurrency&lt;/b&gt; and &lt;b&gt;convertedToValue&lt;/b&gt; response fields in CNY value. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In split-payout cases, this method will only return details on an individual payout, also known as a true(actual) payoutid. If a user inputs a &lt;b&gt;payoutReference&lt;/b&gt; id as a path parameter, the call will fail and the &lt;b&gt;404 not found&lt;/b&gt; status code will be returned.&lt;br&gt;For more information on split payouts, see &lt;a href=&quot;/api-docs/split-payout/playbook.html&quot; target=&quot;_blank&quot;&gt;Mainland China Split Payout Playbook&lt;/a&gt;.&lt;/span&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;This method retrieves details on a specific seller payout. The unique identifier of the payout is passed in as a path parameter at the end of the call URI. &lt;br&gt;&lt;br&gt;The &lt;b&gt;getPayouts&lt;/b&gt; method can be used to retrieve the unique identifier of a payout, or the user can check Seller Hub.&lt;br&gt;&lt;br&gt;For split-payout cases, which are &lt;b&gt;only&lt;/b&gt; available to sellers in mainland China, this method will return the &lt;b&gt;payoutPercentage&lt;/b&gt; for the specified payout. This value indicates the current payout percentage allocated to a payment instrument. This method will also return the &lt;b&gt;convertedToCurrency&lt;/b&gt; and &lt;b&gt;convertedToValue&lt;/b&gt; response fields in CNY value. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In split-payout cases, this method will only return details on an individual payout, also known as a true(actual) payoutid. If a user inputs a &lt;b&gt;payoutReference&lt;/b&gt; id as a path parameter, the call will fail and the &lt;b&gt;404 not found&lt;/b&gt; status code will be returned.&lt;br&gt;For more information on split payouts, see &lt;a href=&quot;/api-docs/split-payout/playbook.html&quot; target=&quot;_blank&quot;&gt;Mainland China Split Payout Playbook&lt;/a&gt;.&lt;/span&gt;
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
     * @return a {@link WithPayoutItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPayoutItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithPayoutItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
