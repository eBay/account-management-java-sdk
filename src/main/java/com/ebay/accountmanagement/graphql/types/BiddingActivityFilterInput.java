package com.ebay.accountmanagement.graphql.types;

import java.util.HashMap;
import java.util.Map;

/**
 * Filter criteria for userBiddingActivity GraphQL query.
 */
public final class BiddingActivityFilterInput {
    private String activeAfter;
    private String activeBefore;
    private PaginationInput paginationInput;

    public BiddingActivityFilterInput() {}

    public String getActiveAfter() {
        return activeAfter;
    }

    public void setActiveAfter(String activeAfter) {
        this.activeAfter = activeAfter;
    }

    public String getActiveBefore() {
        return activeBefore;
    }

    public void setActiveBefore(String activeBefore) {
        this.activeBefore = activeBefore;
    }

    public PaginationInput getPaginationInput() {
        return paginationInput;
    }

    public void setPaginationInput(PaginationInput paginationInput) {
        this.paginationInput = paginationInput;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        if (activeAfter != null) {
            map.put("activeAfter", activeAfter);
        }
        if (activeBefore != null) {
            map.put("activeBefore", activeBefore);
        }
        if (paginationInput != null) {
            map.put("paginationInput", paginationInput.toMap());
        }
        return map;
    }
}
