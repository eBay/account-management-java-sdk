package com.ebay.accountmanagement.generated.sellaccountv2.rate_table;

import com.ebay.accountmanagement.generated.sellaccountv2.rate_table.item.WithRateTableItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /rate_table
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RateTableRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.accountmanagement.generated.sellaccountv2.rate_table.item collection
     * @param rate_table_id This path parameter is the unique identifier for the shipping rate table to retrieve.&lt;br/&gt;&lt;br/&gt; Use the &lt;a href=&quot;/api-docs/sell/account/resources/rate_table/methods/getRateTables&quot; target=&quot;_blank&quot;&gt;getRateTables&lt;/a&gt; method of the &lt;a href=&quot;/api-docs/sell/account/static/overview.html &quot; target=&quot;_blank&quot;&gt;Account API v1&lt;/a&gt; to retrieve rate table IDs.
     * @return a {@link WithRateTableItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithRateTableItemRequestBuilder byRate_table_id(@jakarta.annotation.Nonnull final String rate_table_id) {
        Objects.requireNonNull(rate_table_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("rate_table_id", rate_table_id);
        return new WithRateTableItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link RateTableRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RateTableRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/rate_table", pathParameters);
    }
    /**
     * Instantiates a new {@link RateTableRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RateTableRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/rate_table", rawUrl);
    }
}
