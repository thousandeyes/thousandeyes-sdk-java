/*
 * Instant Tests API
 * The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
 * The version of the OpenAPI document: 7.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.tests.instant;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import com.thousandeyes.api.utils.Config;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.tests.instant.model.Error;
import com.thousandeyes.api.tests.instant.model.Expand;
import com.thousandeyes.api.tests.instant.model.SipServerInstantTestRequest;
import com.thousandeyes.api.tests.instant.model.SipServerInstantTestResponse;
import java.net.URI;
import com.thousandeyes.api.tests.instant.model.UnauthorizedError;
import com.thousandeyes.api.tests.instant.model.ValidationError;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class SipServerApi {
  private final ApiClient apiClient;

  public SipServerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create SIP server instant test
   * Creates and runs a new SIP server instant test.
   * @param sipServerInstantTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand (Optional) Indicates if the test sub-resources should be expanded. Defaults to no expansion. To expand the &#x60;agents&#x60; sub-resource, use the query &#x60;?expand&#x3D;agent&#x60;. (optional
   * @return SipServerInstantTestResponse
   * @throws ApiException if fails to make API call
   */
  public SipServerInstantTestResponse postInstantSIPServer(SipServerInstantTestRequest sipServerInstantTestRequest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<SipServerInstantTestResponse> response = postInstantSIPServerWithHttpInfo(sipServerInstantTestRequest, aid, expand);
    return response.getData();
  }

  /**
   * Create SIP server instant test
   * Creates and runs a new SIP server instant test.
   * @param sipServerInstantTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand (Optional) Indicates if the test sub-resources should be expanded. Defaults to no expansion. To expand the &#x60;agents&#x60; sub-resource, use the query &#x60;?expand&#x3D;agent&#x60;. (optional
   * @return ApiResponse&lt;SipServerInstantTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SipServerInstantTestResponse> postInstantSIPServerWithHttpInfo(SipServerInstantTestRequest sipServerInstantTestRequest, String aid, List<Expand> expand) throws ApiException {
    postInstantSIPServerValidateRequest(sipServerInstantTestRequest);

    var requestBuilder = postInstantSIPServerRequestBuilder(sipServerInstantTestRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), SipServerInstantTestResponse.class);
  }

  private void postInstantSIPServerValidateRequest(SipServerInstantTestRequest sipServerInstantTestRequest) throws ApiException {
      // verify the required parameter 'sipServerInstantTestRequest' is set
      if (sipServerInstantTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'sipServerInstantTestRequest' when calling postInstantSIPServer");
      }
  }

  private ApiRequest.ApiRequestBuilder postInstantSIPServerRequestBuilder(SipServerInstantTestRequest sipServerInstantTestRequest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tests/sip-server/instant";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(sipServerInstantTestRequest);
    return requestBuilder;
  }
}
