package com.ebay.accountmanagement.generated.sellaccountv1.payments_program.item;

import com.ebay.accountmanagement.generated.sellaccountv1.payments_program.item.item.WithPaymentsProgramTypeItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /payments_program/{marketplace_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithMarketplaceItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.accountmanagement.generated.sellaccountv1.payments_program.item.item collection
     * @param payments_program_type This path parameter specifies the payments program whose status is returned by the call.
     * @return a {@link WithPaymentsProgramTypeItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPaymentsProgramTypeItemRequestBuilder byPayments_program_type(@jakarta.annotation.Nonnull final String payments_program_type) {
        Objects.requireNonNull(payments_program_type);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("payments_program_type", payments_program_type);
        return new WithPaymentsProgramTypeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithMarketplaceItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithMarketplaceItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payments_program/{marketplace_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithMarketplaceItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithMarketplaceItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payments_program/{marketplace_id}", rawUrl);
    }
}
