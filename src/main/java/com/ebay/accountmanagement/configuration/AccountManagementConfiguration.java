package com.ebay.accountmanagement.configuration;

import java.net.URI;
import java.util.Set;
import java.util.HashSet;

/**
 * Configuration for the Account Management SDK.
 * Provides base URLs for each API and optional fallback access token.
 */
public final class AccountManagementConfiguration {
    // Base URLs for each API
    private String sellAccountV1BaseUrl = "https://api.ebay.com";
    private String sellAccountV2BaseUrl = "https://api.ebay.com";
    private String sellFinancesV1BaseUrl = "https://apiz.ebay.com";
    private String graphQLBaseUrl = "https://api.ebay.com/graphql";

    private String accessToken;  // static fallback; per-call token takes precedence
    private boolean diagnosticLogging = false;

    /**
     * Default request options (headers) applied to all SDK calls.
     * Per-call RequestOptions will override these.
     */
    private RequestOptions defaultRequestOptions = new RequestOptions();

    // Getters and setters
    public String getSellAccountV1BaseUrl() { return sellAccountV1BaseUrl; }
    public void setSellAccountV1BaseUrl(String sellAccountV1BaseUrl) { this.sellAccountV1BaseUrl = sellAccountV1BaseUrl; }

    public String getSellAccountV2BaseUrl() { return sellAccountV2BaseUrl; }
    public void setSellAccountV2BaseUrl(String sellAccountV2BaseUrl) { this.sellAccountV2BaseUrl = sellAccountV2BaseUrl; }

    public String getSellFinancesV1BaseUrl() { return sellFinancesV1BaseUrl; }
    public void setSellFinancesV1BaseUrl(String sellFinancesV1BaseUrl) { this.sellFinancesV1BaseUrl = sellFinancesV1BaseUrl; }

    public String getGraphQLBaseUrl() { return graphQLBaseUrl; }
    public void setGraphQLBaseUrl(String graphQLBaseUrl) { this.graphQLBaseUrl = graphQLBaseUrl; }

    public String getAccessToken() { return accessToken; }
    public void setAccessToken(String accessToken) { this.accessToken = accessToken; }

    public boolean isDiagnosticLogging() { return diagnosticLogging; }
    public void setDiagnosticLogging(boolean diagnosticLogging) { this.diagnosticLogging = diagnosticLogging; }

    public RequestOptions getDefaultRequestOptions() { return defaultRequestOptions; }
    public void setDefaultRequestOptions(RequestOptions defaultRequestOptions) { this.defaultRequestOptions = defaultRequestOptions; }

    /**
     * All hostnames tokens may be sent to; used by AllowedHostsValidator.
     */
    public Set<String> getAllowedHosts() {
        Set<String> hosts = new HashSet<>();
        hosts.add(extractHost(sellAccountV1BaseUrl));
        hosts.add(extractHost(sellAccountV2BaseUrl));
        hosts.add(extractHost(sellFinancesV1BaseUrl));
        hosts.add(extractHost(graphQLBaseUrl));
        return hosts;
    }

    private String extractHost(String url) {
        try {
            return URI.create(url).getHost();
        } catch (Exception e) {
            return "api.ebay.com"; // fallback
        }
    }
}
