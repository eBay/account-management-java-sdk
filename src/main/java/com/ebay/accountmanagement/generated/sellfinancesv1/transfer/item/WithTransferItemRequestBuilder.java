package com.ebay.accountmanagement.generated.sellfinancesv1.transfer.item;

import com.ebay.accountmanagement.generated.sellfinancesv1.models.Transfer;
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
 * Builds and executes requests for operations under /transfer/{transfer_Id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithTransferItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithTransferItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTransferItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/transfer/{transfer_Id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithTransferItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTransferItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/transfer/{transfer_Id}", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;This method retrieves detailed information regarding a &lt;code&gt;TRANSFER&lt;/code&gt; transaction type. A &lt;code&gt;TRANSFER&lt;/code&gt; is a  monetary transaction type that involves a seller transferring money to eBay for reimbursement of one or more charges. For example, when a seller reimburses eBay for a buyer refund.&lt;br&gt;&lt;br&gt;If an ID is passed into the URI that is an identifier for another transaction type, this call will return an http status code of &lt;code&gt;404 Not found&lt;/code&gt;.
     * @return a {@link Transfer}
     */
    @jakarta.annotation.Nullable
    public Transfer get() {
        return get(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;This method retrieves detailed information regarding a &lt;code&gt;TRANSFER&lt;/code&gt; transaction type. A &lt;code&gt;TRANSFER&lt;/code&gt; is a  monetary transaction type that involves a seller transferring money to eBay for reimbursement of one or more charges. For example, when a seller reimburses eBay for a buyer refund.&lt;br&gt;&lt;br&gt;If an ID is passed into the URI that is an identifier for another transaction type, this call will return an http status code of &lt;code&gt;404 Not found&lt;/code&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Transfer}
     */
    @jakarta.annotation.Nullable
    public Transfer get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Transfer::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;This method retrieves detailed information regarding a &lt;code&gt;TRANSFER&lt;/code&gt; transaction type. A &lt;code&gt;TRANSFER&lt;/code&gt; is a  monetary transaction type that involves a seller transferring money to eBay for reimbursement of one or more charges. For example, when a seller reimburses eBay for a buyer refund.&lt;br&gt;&lt;br&gt;If an ID is passed into the URI that is an identifier for another transaction type, this call will return an http status code of &lt;code&gt;404 Not found&lt;/code&gt;.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all &lt;b&gt;Finances API&lt;/b&gt; methods. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis &quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  The &lt;b&gt;Finances API&lt;/b&gt; does not support &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/multi-user-account-access&quot; target=&quot;_blank&quot;&gt;Team Access&lt;/a&gt;. Financial information, such as payouts or transactions, is only returned for the user that makes the call. You cannot use any of the methods in this API to return financial information for another user.&lt;/span&gt;&lt;br&gt;This method retrieves detailed information regarding a &lt;code&gt;TRANSFER&lt;/code&gt; transaction type. A &lt;code&gt;TRANSFER&lt;/code&gt; is a  monetary transaction type that involves a seller transferring money to eBay for reimbursement of one or more charges. For example, when a seller reimburses eBay for a buyer refund.&lt;br&gt;&lt;br&gt;If an ID is passed into the URI that is an identifier for another transaction type, this call will return an http status code of &lt;code&gt;404 Not found&lt;/code&gt;.
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
     * @return a {@link WithTransferItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithTransferItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithTransferItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
