package com.ebay.accountmanagement.generated.sellfinancesv1.transfer;

import com.ebay.accountmanagement.generated.sellfinancesv1.transfer.item.WithTransferItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /transfer
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TransferRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.accountmanagement.generated.sellfinancesv1.transfer.item collection
     * @param transfer_Id This path parameter is used to specify the unique identifier of the &lt;code&gt;TRANSFER&lt;/code&gt; transaction type you wish to retrieve.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/finances/resources/transaction/methods/getTransactions&quot; target=&quot;_blank &quot;&gt;getTransactions&lt;/a&gt; method to retrieve this value by setting the &lt;b&gt;transactionType&lt;/b&gt; filter to &lt;code&gt;TRANSFER&lt;/code&gt;. The &lt;b&gt;transfer_id&lt;/b&gt; value will then be returned in the &lt;b&gt;transaction_id&lt;/b&gt; field of the response.
     * @return a {@link WithTransferItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithTransferItemRequestBuilder byTransfer_Id(@jakarta.annotation.Nonnull final String transfer_Id) {
        Objects.requireNonNull(transfer_Id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("transfer_Id", transfer_Id);
        return new WithTransferItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link TransferRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TransferRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/transfer", pathParameters);
    }
    /**
     * Instantiates a new {@link TransferRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TransferRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/transfer", rawUrl);
    }
}
