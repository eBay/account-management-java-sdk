package com.ebay.accountmanagement.clients.graphql;

import com.ebay.accountmanagement.configuration.RequestOptions;
import com.ebay.accountmanagement.graphql.EBayGraphOperations;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Typed GraphQL client for eBay Graph API operations.
 * Wraps DynamicGraphQLClient with specific typed methods.
 */
public final class EBayGraphClient {
    private static final ObjectMapper MAPPER = new ObjectMapper();
    private final DynamicGraphQLClient dynamic;

    public EBayGraphClient(DynamicGraphQLClient dynamic) {
        this.dynamic = dynamic;
    }

    /**
     * Retrieve identity information for the authenticated user.
     *
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with user data as JsonNode
     */
    public CompletableFuture<JsonNode> userAsync(String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            JsonNode data = dynamic.execute(
                EBayGraphOperations.USER,
                null,
                accessToken,
                requestOptions
            );
            return data.get("user");
        });
    }

    /**
     * Retrieve bidding activity for the authenticated user.
     *
     * @param input Filter criteria (map with filter properties)
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with bidding activity data as JsonNode
     */
    public CompletableFuture<JsonNode> userBiddingActivityAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            Map<String, Object> variables = new HashMap<>();
            variables.put("input", input != null ? input : Map.of());

            JsonNode data = dynamic.execute(
                EBayGraphOperations.USER_BIDDING_ACTIVITY,
                variables,
                accessToken,
                requestOptions
            );
            return data.get("userBiddingActivity");
        });
    }

    /**
     * Escape hatch — execute any raw GraphQL query.
     *
     * @param query GraphQL query string
     * @param variables Variables map (can be null)
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with raw response data as JsonNode
     */
    public CompletableFuture<JsonNode> executeRawAsync(
            String query,
            Map<String, Object> variables,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            dynamic.execute(query, variables, accessToken, requestOptions)
        );
    }
}
