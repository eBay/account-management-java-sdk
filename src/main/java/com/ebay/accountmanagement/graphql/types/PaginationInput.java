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
