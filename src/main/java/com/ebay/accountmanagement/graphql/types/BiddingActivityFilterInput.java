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
