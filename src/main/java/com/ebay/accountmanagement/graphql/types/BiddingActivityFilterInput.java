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

import jakarta.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/**
 * Filter criteria for userBiddingActivity GraphQL query.
 */
public final class BiddingActivityFilterInput {
    private @Nullable String activeAfter;
    private @Nullable String activeBefore;
    private @Nullable PaginationInput paginationInput;

    public BiddingActivityFilterInput() {}

    public @Nullable String getActiveAfter() {
        return activeAfter;
    }

    public void setActiveAfter(@Nullable String activeAfter) {
        this.activeAfter = activeAfter;
    }

    public @Nullable String getActiveBefore() {
        return activeBefore;
    }

    public void setActiveBefore(@Nullable String activeBefore) {
        this.activeBefore = activeBefore;
    }

    public @Nullable PaginationInput getPaginationInput() {
        return paginationInput;
    }

    public void setPaginationInput(@Nullable PaginationInput paginationInput) {
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
