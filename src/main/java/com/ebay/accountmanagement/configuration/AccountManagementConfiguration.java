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
import java.util.HashSet;
import java.util.Set;

public final class AccountManagementConfiguration {
    private @Nullable String accessToken;
    private RequestOptions defaultRequestOptions = new RequestOptions();

    private final String accountV1BaseUrl;
    private final String accountV2BaseUrl;
    private final String financesBaseUrl;
    private final String graphQLBaseUrl;

    public AccountManagementConfiguration() {
        this.accountV1BaseUrl = "https://api.ebay.com/sell/account/v1";
        this.accountV2BaseUrl = "https://api.ebay.com/sell/account/v2";
        this.financesBaseUrl = "https://apiz.ebay.com/sell/finances/v1";
        this.graphQLBaseUrl = "https://api.ebay.com/graphql";
    }

    public AccountManagementConfiguration(
            String accountV1BaseUrl,
            String accountV2BaseUrl,
            String financesBaseUrl,
            String graphQLBaseUrl) {
        this.accountV1BaseUrl = validateHost(accountV1BaseUrl);
        this.accountV2BaseUrl = validateHost(accountV2BaseUrl);
        this.financesBaseUrl = validateHost(financesBaseUrl);
        this.graphQLBaseUrl = validateHost(graphQLBaseUrl);
    }

    private String validateHost(String url) {
        try {
            String host = new java.net.URI(url).getHost();
            if (host == null || !getAllowedHosts().contains(host)) {
                throw new IllegalArgumentException("URL host not in allowed list: " + url);
            }
        } catch (java.net.URISyntaxException e) {
            throw new IllegalArgumentException("Invalid URL: " + url, e);
        }
        return url;
    }

    /**
     * Sets the OAuth Bearer token used for API calls when no per-call token is provided.
     *
     * <p><b>Security note:</b> The token is stored as a Java {@code String} and will remain
     * in heap memory until garbage collected. To minimize exposure: do not log this
     * configuration object, null out the token reference when it is no longer needed,
     * and avoid storing the configuration longer than the client lifecycle.
     */
    public void setAccessToken(@Nullable String token) {
        this.accessToken = token;
    }

    public @Nullable String getAccessToken() {
        return accessToken;
    }

    public RequestOptions getDefaultRequestOptions() {
        return defaultRequestOptions;
    }

    public Set<String> getAllowedHosts() {
        Set<String> hosts = new HashSet<>();
        hosts.add("api.ebay.com");
        hosts.add("apiz.ebay.com");
        return hosts;
    }

    public String getAccountV1BaseUrl() {
        return accountV1BaseUrl;
    }

    public String getAccountV2BaseUrl() {
        return accountV2BaseUrl;
    }

    public String getFinancesBaseUrl() {
        return financesBaseUrl;
    }

    public String getGraphQLBaseUrl() {
        return graphQLBaseUrl;
    }
}
