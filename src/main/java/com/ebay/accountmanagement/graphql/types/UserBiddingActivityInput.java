package com.ebay.accountmanagement.graphql.types;

import java.util.HashMap;
import java.util.Map;

/**
 * Input type for userBiddingActivity GraphQL query.
 */
public final class UserBiddingActivityInput {
    private BiddingActivityFilterInput filter;

    public UserBiddingActivityInput() {}

    public UserBiddingActivityInput(BiddingActivityFilterInput filter) {
        this.filter = filter;
    }

    public BiddingActivityFilterInput getFilter() {
        return filter;
    }

    public void setFilter(BiddingActivityFilterInput filter) {
        this.filter = filter;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        if (filter != null) {
            map.put("filter", filter.toMap());
        }
        return map;
    }
}
