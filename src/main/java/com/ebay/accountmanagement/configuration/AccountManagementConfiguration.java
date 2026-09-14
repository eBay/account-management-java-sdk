// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.accountmanagement.configuration;

import jakarta.annotation.Nullable;
import java.net.URI;
import java.util.Set;
import java.util.HashSet;

/**
 * Configuration for the Account Management SDK.
 * Provides base URLs for each API and optional fallback access token.
 */
public final class AccountManagementConfiguration {
    // Base URLs for each API — private final to prevent URL tampering after construction
    private final String sellAccountV1BaseUrl;
    private final String sellAccountV2BaseUrl;
    private final String sellFinancesV1BaseUrl;
    private final String graphQLBaseUrl;

    private @Nullable String accessToken;  // static fallback; per-call token takes precedence
    private boolean diagnosticLogging = false;

    /**
     * Default request options (headers) applied to all SDK calls.
     * Per-call RequestOptions will override these.
     */
    private RequestOptions defaultRequestOptions = new RequestOptions();

    /**
     * Default constructor using eBay production endpoints.
     */
    public AccountManagementConfiguration() {
        this.sellAccountV1BaseUrl = "https://api.ebay.com/sell/account/v1";
        this.sellAccountV2BaseUrl = "https://api.ebay.com/sell/account/v2";
        this.sellFinancesV1BaseUrl = "https://apiz.ebay.com/sell/finances/v1";
        this.graphQLBaseUrl = "https://api.ebay.com/graphql";
    }

    /**
     * Constructor for custom endpoints (e.g. sandbox). All URLs are validated against the allowed-host list.
     */
    public AccountManagementConfiguration(
            String sellAccountV1BaseUrl,
            String sellAccountV2BaseUrl,
            String sellFinancesV1BaseUrl,
            String graphQLBaseUrl) {
        // Validate using a temporary default instance to populate the allowed list first
        AccountManagementConfiguration defaults = new AccountManagementConfiguration();
        Set<String> allowed = defaults.getAllowedHosts();
        this.sellAccountV1BaseUrl = validateHost(sellAccountV1BaseUrl, allowed);
        this.sellAccountV2BaseUrl = validateHost(sellAccountV2BaseUrl, allowed);
        this.sellFinancesV1BaseUrl = validateHost(sellFinancesV1BaseUrl, allowed);
        this.graphQLBaseUrl = validateHost(graphQLBaseUrl, allowed);
    }

    private static String validateHost(String url, Set<String> allowedHosts) {
        try {
            String host = new URI(url).getHost();
            if (host == null || !allowedHosts.contains(host)) {
                throw new IllegalArgumentException("URL host not in allowed list: " + url);
            }
        } catch (java.net.URISyntaxException e) {
            throw new IllegalArgumentException("Invalid URL: " + url, e);
        }
        return url;
    }

    // Getters — no public setters for URL fields
    public String getSellAccountV1BaseUrl() { return sellAccountV1BaseUrl; }
    public String getSellAccountV2BaseUrl() { return sellAccountV2BaseUrl; }
    public String getSellFinancesV1BaseUrl() { return sellFinancesV1BaseUrl; }
    public String getGraphQLBaseUrl() { return graphQLBaseUrl; }

    /**
     * Sets the fallback access token used when no per-call token is supplied.
     *
     * <p><strong>Security note:</strong> Access tokens stored as plain {@code String} objects
     * remain on the Java heap until garbage-collected and cannot be zeroed out early.
     * Prefer per-call token passing via the {@code accessToken} parameter on each client method
     * to limit the token's lifetime in memory.</p>
     */
    public void setAccessToken(@Nullable String accessToken) { this.accessToken = accessToken; }
    public @Nullable String getAccessToken() { return accessToken; }

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
