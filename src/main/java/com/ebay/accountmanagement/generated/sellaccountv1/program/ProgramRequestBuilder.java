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

package com.ebay.accountmanagement.generated.sellaccountv1.program;

import com.ebay.accountmanagement.generated.sellaccountv1.program.get_opted_in_programs.GetOptedInProgramsRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv1.program.opt_in.OptInRequestBuilder;
import com.ebay.accountmanagement.generated.sellaccountv1.program.opt_out.OptOutRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /program
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProgramRequestBuilder extends BaseRequestBuilder {
    /**
     * The get_opted_in_programs property
     * @return a {@link GetOptedInProgramsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOptedInProgramsRequestBuilder getOptedInPrograms() {
        return new GetOptedInProgramsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The opt_in property
     * @return a {@link OptInRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OptInRequestBuilder optIn() {
        return new OptInRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The opt_out property
     * @return a {@link OptOutRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OptOutRequestBuilder optOut() {
        return new OptOutRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ProgramRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProgramRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/program", pathParameters);
    }
    /**
     * Instantiates a new {@link ProgramRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProgramRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/program", rawUrl);
    }
}
