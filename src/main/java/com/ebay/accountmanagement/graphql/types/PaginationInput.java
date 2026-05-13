package com.ebay.accountmanagement.graphql.types;

import java.util.HashMap;
import java.util.Map;

/**
 * Pagination input for GraphQL queries.
 */
public final class PaginationInput {
    private Integer maxPageSize;
    private String pageCursor;

    public PaginationInput() {}

    public Integer getMaxPageSize() {
        return maxPageSize;
    }

    public void setMaxPageSize(Integer maxPageSize) {
        this.maxPageSize = maxPageSize;
    }

    public String getPageCursor() {
        return pageCursor;
    }

    public void setPageCursor(String pageCursor) {
        this.pageCursor = pageCursor;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        if (maxPageSize != null) {
            map.put("maxPageSize", maxPageSize);
        }
        if (pageCursor != null) {
            map.put("pageCursor", pageCursor);
        }
        return map;
    }
}
