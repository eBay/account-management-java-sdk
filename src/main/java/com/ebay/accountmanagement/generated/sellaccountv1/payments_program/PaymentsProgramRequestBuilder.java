package com.ebay.accountmanagement.generated.sellaccountv1.payments_program;

import com.ebay.accountmanagement.generated.sellaccountv1.payments_program.item.WithMarketplaceItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /payments_program
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentsProgramRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.accountmanagement.generated.sellaccountv1.payments_program.item collection
     * @param marketplace_id This path parameter specifies the eBay marketplace of the payments program for which you want to retrieve the seller&apos;s status.
     * @return a {@link WithMarketplaceItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithMarketplaceItemRequestBuilder byMarketplace_id(@jakarta.annotation.Nonnull final String marketplace_id) {
        Objects.requireNonNull(marketplace_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("marketplace_id", marketplace_id);
        return new WithMarketplaceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link PaymentsProgramRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PaymentsProgramRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payments_program", pathParameters);
    }
    /**
     * Instantiates a new {@link PaymentsProgramRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PaymentsProgramRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payments_program", rawUrl);
    }
}
