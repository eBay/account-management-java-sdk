package com.ebay.accountmanagement.generated.sellaccountv2;

import com.ebay.accountmanagement.generated.sellaccountv2.combined_shipping_rules.CombinedShippingRulesRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv2.payout_settings.PayoutSettingsRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv2.rate_table.RateTableRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv2.user_preferences.UserPreferencesRequestBuilder;
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
public class SellAccountV2ApiClient extends BaseRequestBuilder {
    /**
     * The combined_shipping_rules property
     * @return a {@link CombinedShippingRulesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CombinedShippingRulesRequestBuilder combinedShippingRules() {
        return new CombinedShippingRulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The payout_settings property
     * @return a {@link PayoutSettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PayoutSettingsRequestBuilder payoutSettings() {
        return new PayoutSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The rate_table property
     * @return a {@link RateTableRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RateTableRequestBuilder rateTable() {
        return new RateTableRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The user_preferences property
     * @return a {@link UserPreferencesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserPreferencesRequestBuilder userPreferences() {
        return new UserPreferencesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link SellAccountV2ApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SellAccountV2ApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
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
            requestAdapter.setBaseUrl("https://api.ebay.com{basePath}");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
