/*
 * Endpoint Instant Scheduled Tests API
 *  You can create and execute a new endpoint instant scheduled test within ThousandEyes using this API. The test parameters are specified in the `POST` data.  The following applies to the Endpoint Instant Scheduled Tests API:  * To initiate the creation and execution of an instant scheduled test, the user must possess the `Edit endpoint tests` permission.  * Upon successful creation of an instant scheduled test, the API responds with an HTTP/201 CREATED status code and return the test definition. * It's important to note that the response does not include the results of the instant scheduled test. To retrieve test results, users can utilize the Endpoint Test Data endpoints. The URLs for these API test data endpoints are provided within the test definition output when an instant scheduled test is created. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.endpoint.tests.instant;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.endpoint.tests.instant.model.EndpointAgentToServerInstantTest;
import com.thousandeyes.api.endpoint.tests.instant.model.EndpointAgentToServerTest;
import com.thousandeyes.api.endpoint.tests.instant.model.Error;
import java.net.URI;
import com.thousandeyes.api.endpoint.tests.instant.model.UnauthorizedError;
import com.thousandeyes.api.endpoint.tests.instant.model.ValidationError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-30T10:06:12.868029+01:00[Europe/Lisbon]")
public class AgentToServerInstantScheduledTestApi {
  private final ApiClient apiClient;

  public AgentToServerInstantScheduledTestApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Run agent to server instant scheduled test
   * Creates and runs a new endpoint agent to server instant scheduled test in ThousandEyes.
   * @param endpointAgentToServerInstantTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EndpointAgentToServerTest
   * @throws ApiException if fails to make API call
   */
  public EndpointAgentToServerTest postAgentToServerInstantTest(EndpointAgentToServerInstantTest endpointAgentToServerInstantTest, String aid) throws ApiException {
    ApiResponse<EndpointAgentToServerTest> response = postAgentToServerInstantTestWithHttpInfo(endpointAgentToServerInstantTest, aid);
    return response.getData();
  }

  /**
   * Run agent to server instant scheduled test
   * Creates and runs a new endpoint agent to server instant scheduled test in ThousandEyes.
   * @param endpointAgentToServerInstantTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EndpointAgentToServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointAgentToServerTest> postAgentToServerInstantTestWithHttpInfo(EndpointAgentToServerInstantTest endpointAgentToServerInstantTest, String aid) throws ApiException {
    postAgentToServerInstantTestValidateRequest(endpointAgentToServerInstantTest);

    var requestBuilder = postAgentToServerInstantTestRequestBuilder(endpointAgentToServerInstantTest, aid);

    return apiClient.send(requestBuilder.build(), EndpointAgentToServerTest.class);
  }

  private void postAgentToServerInstantTestValidateRequest(EndpointAgentToServerInstantTest endpointAgentToServerInstantTest) throws ApiException {
      // verify the required parameter 'endpointAgentToServerInstantTest' is set
      if (endpointAgentToServerInstantTest == null) {
        throw new ApiException(400, "Missing the required parameter 'endpointAgentToServerInstantTest' when calling postAgentToServerInstantTest");
      }
  }

  private ApiRequest.ApiRequestBuilder postAgentToServerInstantTestRequestBuilder(EndpointAgentToServerInstantTest endpointAgentToServerInstantTest, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/endpoint/tests/scheduled-tests/agent-to-server/instant";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(endpointAgentToServerInstantTest);
    return requestBuilder;
  }
}
