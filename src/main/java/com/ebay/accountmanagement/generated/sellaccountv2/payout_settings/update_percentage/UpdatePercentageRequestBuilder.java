package com.ebay.accountmanagement.generated.sellaccountv2.payout_settings.update_percentage;

import com.ebay.accountmanagement.generated.sellaccountv2.models.UpdatePayoutPercentageRequest;
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
 * Builds and executes requests for operations under /payout_settings/update_percentage
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdatePercentageRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UpdatePercentageRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdatePercentageRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payout_settings/update_percentage", pathParameters);
    }
    /**
     * Instantiates a new {@link UpdatePercentageRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdatePercentageRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payout_settings/update_percentage", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;  Split-payout functionality is &lt;b&gt;only&lt;/b&gt; available to mainland China sellers, who can split payouts between their Payoneer account and bank account. Card payouts are not currently available for sellers in mainland China.&lt;/p&gt;&lt;/div&gt;&lt;br/&gt;This method allows sellers in mainland China to configure the split-payout percentage for two payout instruments available for seller payouts. For example, a seller can split payouts to have 70% of the payout go to a bank account and 30% go to a Payoneer account.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The split-payout percentage &lt;b&gt;must&lt;/b&gt; always add up to 100%. If the values do not equal 100, the call will fail. Instruments cannot be added/removed using Finance and Account APIs. &lt;/span&gt;&lt;br/&gt;Users can specify the payout instruments being updated by using the &lt;b&gt;instrumentId&lt;/b&gt; associated with each payment instrument in the request payload. This value is returned by using the &lt;b&gt;getPayoutSettings&lt;/b&gt; method. Users can specify the percentage of the payout allocated to each instrument using the &lt;b&gt;payoutPercentage&lt;/b&gt; request field. This value must be a whole number and cannot exceed 100.&lt;br&gt;&lt;br&gt; For more details on configuring split-payout percentages, see &lt;a href=&quot;/api-docs/split-payout/playbook.html&quot; target=&quot;_blank &quot;&gt;Mainland China Split Payout Playbook.&lt;/a&gt; 
     * @param body This type is used by the request payload of the &lt;b&gt;updatePayoutPercentage&lt;/b&gt; method to allow a seller to configure the split-payout percentages for two payout instruments.
     */
    public void post(@jakarta.annotation.Nonnull final UpdatePayoutPercentageRequest body) {
        post(body, null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;  Split-payout functionality is &lt;b&gt;only&lt;/b&gt; available to mainland China sellers, who can split payouts between their Payoneer account and bank account. Card payouts are not currently available for sellers in mainland China.&lt;/p&gt;&lt;/div&gt;&lt;br/&gt;This method allows sellers in mainland China to configure the split-payout percentage for two payout instruments available for seller payouts. For example, a seller can split payouts to have 70% of the payout go to a bank account and 30% go to a Payoneer account.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The split-payout percentage &lt;b&gt;must&lt;/b&gt; always add up to 100%. If the values do not equal 100, the call will fail. Instruments cannot be added/removed using Finance and Account APIs. &lt;/span&gt;&lt;br/&gt;Users can specify the payout instruments being updated by using the &lt;b&gt;instrumentId&lt;/b&gt; associated with each payment instrument in the request payload. This value is returned by using the &lt;b&gt;getPayoutSettings&lt;/b&gt; method. Users can specify the percentage of the payout allocated to each instrument using the &lt;b&gt;payoutPercentage&lt;/b&gt; request field. This value must be a whole number and cannot exceed 100.&lt;br&gt;&lt;br&gt; For more details on configuring split-payout percentages, see &lt;a href=&quot;/api-docs/split-payout/playbook.html&quot; target=&quot;_blank &quot;&gt;Mainland China Split Payout Playbook.&lt;/a&gt; 
     * @param body This type is used by the request payload of the &lt;b&gt;updatePayoutPercentage&lt;/b&gt; method to allow a seller to configure the split-payout percentages for two payout instruments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nonnull final UpdatePayoutPercentageRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;  Split-payout functionality is &lt;b&gt;only&lt;/b&gt; available to mainland China sellers, who can split payouts between their Payoneer account and bank account. Card payouts are not currently available for sellers in mainland China.&lt;/p&gt;&lt;/div&gt;&lt;br/&gt;This method allows sellers in mainland China to configure the split-payout percentage for two payout instruments available for seller payouts. For example, a seller can split payouts to have 70% of the payout go to a bank account and 30% go to a Payoneer account.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The split-payout percentage &lt;b&gt;must&lt;/b&gt; always add up to 100%. If the values do not equal 100, the call will fail. Instruments cannot be added/removed using Finance and Account APIs. &lt;/span&gt;&lt;br/&gt;Users can specify the payout instruments being updated by using the &lt;b&gt;instrumentId&lt;/b&gt; associated with each payment instrument in the request payload. This value is returned by using the &lt;b&gt;getPayoutSettings&lt;/b&gt; method. Users can specify the percentage of the payout allocated to each instrument using the &lt;b&gt;payoutPercentage&lt;/b&gt; request field. This value must be a whole number and cannot exceed 100.&lt;br&gt;&lt;br&gt; For more details on configuring split-payout percentages, see &lt;a href=&quot;/api-docs/split-payout/playbook.html&quot; target=&quot;_blank &quot;&gt;Mainland China Split Payout Playbook.&lt;/a&gt; 
     * @param body This type is used by the request payload of the &lt;b&gt;updatePayoutPercentage&lt;/b&gt; method to allow a seller to configure the split-payout percentages for two payout instruments.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdatePayoutPercentageRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;  Split-payout functionality is &lt;b&gt;only&lt;/b&gt; available to mainland China sellers, who can split payouts between their Payoneer account and bank account. Card payouts are not currently available for sellers in mainland China.&lt;/p&gt;&lt;/div&gt;&lt;br/&gt;This method allows sellers in mainland China to configure the split-payout percentage for two payout instruments available for seller payouts. For example, a seller can split payouts to have 70% of the payout go to a bank account and 30% go to a Payoneer account.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The split-payout percentage &lt;b&gt;must&lt;/b&gt; always add up to 100%. If the values do not equal 100, the call will fail. Instruments cannot be added/removed using Finance and Account APIs. &lt;/span&gt;&lt;br/&gt;Users can specify the payout instruments being updated by using the &lt;b&gt;instrumentId&lt;/b&gt; associated with each payment instrument in the request payload. This value is returned by using the &lt;b&gt;getPayoutSettings&lt;/b&gt; method. Users can specify the percentage of the payout allocated to each instrument using the &lt;b&gt;payoutPercentage&lt;/b&gt; request field. This value must be a whole number and cannot exceed 100.&lt;br&gt;&lt;br&gt; For more details on configuring split-payout percentages, see &lt;a href=&quot;/api-docs/split-payout/playbook.html&quot; target=&quot;_blank &quot;&gt;Mainland China Split Payout Playbook.&lt;/a&gt; 
     * @param body This type is used by the request payload of the &lt;b&gt;updatePayoutPercentage&lt;/b&gt; method to allow a seller to configure the split-payout percentages for two payout instruments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdatePayoutPercentageRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UpdatePercentageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdatePercentageRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UpdatePercentageRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
