package com.ebay.accountmanagement.generated.sellfinancesv1;

import com.ebay.accountmanagement.generated.sellfinancesv1.billing_activity.BillingActivityRequestBuilder;
import com.ebay.accountmanagement.generated.sellfinancesv1.order_earnings_summary.OrderEarningsSummaryRequestBuilder;
import com.ebay.accountmanagement.generated.sellfinancesv1.order_earnings.OrderEarningsRequestBuilder;
import com.ebay.accountmanagement.generated.sellfinancesv1.payout_summary.PayoutSummaryRequestBuilder;
import com.ebay.accountmanagement.generated.sellfinancesv1.payout.PayoutRequestBuilder;
import com.ebay.accountmanagement.generated.sellfinancesv1.seller_funds_summary.SellerFundsSummaryRequestBuilder;
import com.ebay.accountmanagement.generated.sellfinancesv1.transaction_summary.TransactionSummaryRequestBuilder;
import com.ebay.accountmanagement.generated.sellfinancesv1.transaction.TransactionRequestBuilder;
import com.ebay.accountmanagement.generated.sellfinancesv1.transfer.TransferRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SellFinancesV1ApiClient extends BaseRequestBuilder {
    /**
     * The billing_activity property
     * @return a {@link BillingActivityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BillingActivityRequestBuilder billingActivity() {
        return new BillingActivityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The order_earnings property
     * @return a {@link OrderEarningsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrderEarningsRequestBuilder orderEarnings() {
        return new OrderEarningsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The order_earnings_summary property
     * @return a {@link OrderEarningsSummaryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrderEarningsSummaryRequestBuilder orderEarningsSummary() {
        return new OrderEarningsSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The payout property
     * @return a {@link PayoutRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PayoutRequestBuilder payout() {
        return new PayoutRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The payout_summary property
     * @return a {@link PayoutSummaryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PayoutSummaryRequestBuilder payoutSummary() {
        return new PayoutSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The seller_funds_summary property
     * @return a {@link SellerFundsSummaryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SellerFundsSummaryRequestBuilder sellerFundsSummary() {
        return new SellerFundsSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The transaction property
     * @return a {@link TransactionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TransactionRequestBuilder transaction() {
        return new TransactionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The transaction_summary property
     * @return a {@link TransactionSummaryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TransactionSummaryRequestBuilder transactionSummary() {
        return new TransactionSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The transfer property
     * @return a {@link TransferRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TransferRequestBuilder transfer() {
        return new TransferRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link SellFinancesV1ApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SellFinancesV1ApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://apiz.ebay.com{basePath}");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
