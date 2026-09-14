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

package com.ebay.accountmanagement.generated.accountv1.program.opt_out;

import com.ebay.accountmanagement.generated.accountv1.models.Error;
import com.ebay.accountmanagement.generated.accountv1.models.Program;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /program/opt_out
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OptOutRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link OptOutRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OptOutRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/program/opt_out", pathParameters);
    }
    /**
     * Instantiates a new {@link OptOutRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OptOutRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/program/opt_out", rawUrl);
    }
    /**
     * This method opts the seller out of a seller program in which they are currently opted in to. A seller can retrieve a list of the seller programs they are opted-in to using the &lt;b&gt;getOptedInPrograms&lt;/b&gt; method.
     * @param body The seller program to opt in to when part of an &lt;b&gt;optInToProgram&lt;/b&gt; request, or out of when part of an  &lt;b&gt;optOutOfProgram&lt;/b&gt; request.
     * @return a {@link OptOutPostResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public OptOutPostResponse post(@jakarta.annotation.Nonnull final Program body) {
        return post(body, null);
    }
    /**
     * This method opts the seller out of a seller program in which they are currently opted in to. A seller can retrieve a list of the seller programs they are opted-in to using the &lt;b&gt;getOptedInPrograms&lt;/b&gt; method.
     * @param body The seller program to opt in to when part of an &lt;b&gt;optInToProgram&lt;/b&gt; request, or out of when part of an  &lt;b&gt;optOutOfProgram&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OptOutPostResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public OptOutPostResponse post(@jakarta.annotation.Nonnull final Program body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OptOutPostResponse::createFromDiscriminatorValue);
    }
    /**
     * This method opts the seller out of a seller program in which they are currently opted in to. A seller can retrieve a list of the seller programs they are opted-in to using the &lt;b&gt;getOptedInPrograms&lt;/b&gt; method.
     * @param body The seller program to opt in to when part of an &lt;b&gt;optInToProgram&lt;/b&gt; request, or out of when part of an  &lt;b&gt;optOutOfProgram&lt;/b&gt; request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Program body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method opts the seller out of a seller program in which they are currently opted in to. A seller can retrieve a list of the seller programs they are opted-in to using the &lt;b&gt;getOptedInPrograms&lt;/b&gt; method.
     * @param body The seller program to opt in to when part of an &lt;b&gt;optInToProgram&lt;/b&gt; request, or out of when part of an  &lt;b&gt;optOutOfProgram&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Program body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link OptOutRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OptOutRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OptOutRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
