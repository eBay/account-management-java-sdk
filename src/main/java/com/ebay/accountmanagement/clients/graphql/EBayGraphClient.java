package com.ebay.accountmanagement.clients.graphql;

import com.ebay.accountmanagement.configuration.RequestOptions;
import com.ebay.accountmanagement.graphql.EBayGraphOperations;
import com.ebay.accountmanagement.graphql.types.UserBiddingActivityInput;
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
     * @param input Filter criteria (typed UserBiddingActivityInput)
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with bidding activity data as JsonNode
     */
    public CompletableFuture<JsonNode> userBiddingActivityAsync(
            UserBiddingActivityInput input,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            Map<String, Object> variables = new HashMap<>();
            variables.put("input", input != null ? input.toMap() : Map.of());

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
     * Add items to the authenticated user's watch list.
     *
     * @param input Input map (itemIds, etc.)
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with addToWatchList data as JsonNode
     */
    public CompletableFuture<JsonNode> addToWatchListAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            Map<String, Object> variables = new HashMap<>();
            variables.put("input", input != null ? input : Map.of());

            JsonNode data = dynamic.execute(
                EBayGraphOperations.ADD_TO_WATCH_LIST,
                variables,
                accessToken,
                requestOptions
            );
            return data.get("addToWatchList");
        });
    }

    /**
     * Create or replace a user note on an order line item.
     *
     * @param input Input map (orderLineItemId, note, etc.)
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with createOrReplaceUserNote data as JsonNode
     */
    public CompletableFuture<JsonNode> createOrReplaceUserNoteAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            Map<String, Object> variables = new HashMap<>();
            variables.put("input", input != null ? input : Map.of());

            JsonNode data = dynamic.execute(
                EBayGraphOperations.CREATE_OR_REPLACE_USER_NOTE,
                variables,
                accessToken,
                requestOptions
            );
            return data.get("createOrReplaceUserNote");
        });
    }

    /**
     * Delete a user note on an order line item.
     *
     * @param input Input map (orderLineItemId, etc.)
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with deleteUserNote data as JsonNode
     */
    public CompletableFuture<JsonNode> deleteUserNoteAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            Map<String, Object> variables = new HashMap<>();
            variables.put("input", input != null ? input : Map.of());

            JsonNode data = dynamic.execute(
                EBayGraphOperations.DELETE_USER_NOTE,
                variables,
                accessToken,
                requestOptions
            );
            return data.get("deleteUserNote");
        });
    }

    /**
     * Retrieve bidding activity for a specific item.
     *
     * @param input Input map (itemId, etc.)
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with itemBiddingActivity data as JsonNode
     */
    public CompletableFuture<JsonNode> itemBiddingActivityAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            Map<String, Object> variables = new HashMap<>();
            variables.put("input", input != null ? input : Map.of());

            JsonNode data = dynamic.execute(
                EBayGraphOperations.ITEM_BIDDING_ACTIVITY,
                variables,
                accessToken,
                requestOptions
            );
            return data.get("itemBiddingActivity");
        });
    }

    /**
     * Remove all items from the authenticated user's watch list.
     *
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with removeAllFromWatchList data as JsonNode
     */
    public CompletableFuture<JsonNode> removeAllFromWatchListAsync(
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            JsonNode data = dynamic.execute(
                EBayGraphOperations.REMOVE_ALL_FROM_WATCH_LIST,
                null,
                accessToken,
                requestOptions
            );
            return data.get("removeAllFromWatchList");
        });
    }

    /**
     * Remove specific items from the authenticated user's watch list.
     *
     * @param input Input map (itemIds, etc.)
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with removeFromWatchList data as JsonNode
     */
    public CompletableFuture<JsonNode> removeFromWatchListAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            Map<String, Object> variables = new HashMap<>();
            variables.put("input", input != null ? input : Map.of());

            JsonNode data = dynamic.execute(
                EBayGraphOperations.REMOVE_FROM_WATCH_LIST,
                variables,
                accessToken,
                requestOptions
            );
            return data.get("removeFromWatchList");
        });
    }

    /**
     * Retrieve custom lists for the authenticated user.
     *
     * @param input Input map (customListIds, pagination, etc.) — nullable
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with userCustomLists data as JsonNode
     */
    public CompletableFuture<JsonNode> userCustomListsAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            Map<String, Object> variables = new HashMap<>();
            variables.put("input", input != null ? input : Map.of());

            JsonNode data = dynamic.execute(
                EBayGraphOperations.USER_CUSTOM_LISTS,
                variables,
                accessToken,
                requestOptions
            );
            return data.get("userCustomLists");
        });
    }

    /**
     * Retrieve the authenticated user's watch list.
     *
     * @param input Input map (pagination, etc.) — nullable
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with userWatchList data as JsonNode
     */
    public CompletableFuture<JsonNode> userWatchListAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            Map<String, Object> variables = new HashMap<>();
            variables.put("input", input != null ? input : Map.of());

            JsonNode data = dynamic.execute(
                EBayGraphOperations.USER_WATCH_LIST,
                variables,
                accessToken,
                requestOptions
            );
            return data.get("userWatchList");
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
