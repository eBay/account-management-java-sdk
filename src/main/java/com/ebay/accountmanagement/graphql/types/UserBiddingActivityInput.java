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
