/*
 * Endpoint Instant Scheduled Tests API
 *  You can create and execute a new endpoint instant scheduled test within ThousandEyes using this API. The test parameters are specified in the `POST` data.  The following applies to the Endpoint Instant Scheduled Tests API:  * To initiate the creation and execution of an instant scheduled test, the user must possess the `Edit endpoint tests` permission.  * Upon successful creation of an instant scheduled test, the API responds with an HTTP/201 CREATED status code and return the test definition. * It's important to note that the response does not include the results of the instant scheduled test. To retrieve test results, users can utilize the Endpoint Test Data endpoints. The URLs for these API test data endpoints are provided within the test definition output when an instant scheduled test is created. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.endpoint.tests.instant;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.reflect.TypeUtils;
import com.thousandeyes.sdk.endpoint.tests.instant.model.EndpointHttpServerInstantTest;
import com.thousandeyes.sdk.endpoint.tests.instant.model.EndpointHttpServerTest;
import com.thousandeyes.sdk.endpoint.tests.instant.model.Error;
import java.net.URI;
import com.thousandeyes.sdk.endpoint.tests.instant.model.UnauthorizedError;
import com.thousandeyes.sdk.endpoint.tests.instant.model.ValidationError;

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
public class HttpServerEndpointInstantScheduledTestsApi {
  private final ApiClient apiClient;

  public HttpServerEndpointInstantScheduledTestsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Run http server instant scheduled test
   * Creates and runs a new endpoint http server instant scheduled test in ThousandEyes.
   * @param endpointHttpServerInstantTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EndpointHttpServerTest
   * @throws ApiException if fails to make API call
   */
  public EndpointHttpServerTest createHttpServerScheduledInstantTest(EndpointHttpServerInstantTest endpointHttpServerInstantTest, String aid) throws ApiException {
    ApiResponse<EndpointHttpServerTest> response = createHttpServerScheduledInstantTestWithHttpInfo(endpointHttpServerInstantTest, aid);
    return response.getData();
  }

  /**
   * Run http server instant scheduled test
   * Creates and runs a new endpoint http server instant scheduled test in ThousandEyes.
   * @param endpointHttpServerInstantTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EndpointHttpServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointHttpServerTest> createHttpServerScheduledInstantTestWithHttpInfo(EndpointHttpServerInstantTest endpointHttpServerInstantTest, String aid) throws ApiException {
    createHttpServerScheduledInstantTestValidateRequest(endpointHttpServerInstantTest);

    var requestBuilder = createHttpServerScheduledInstantTestRequestBuilder(endpointHttpServerInstantTest, aid);

    return apiClient.send(requestBuilder.build(), EndpointHttpServerTest.class);
  }

  private void createHttpServerScheduledInstantTestValidateRequest(EndpointHttpServerInstantTest endpointHttpServerInstantTest) throws ApiException {
      // verify the required parameter 'endpointHttpServerInstantTest' is set
      if (endpointHttpServerInstantTest == null) {
        throw new ApiException(400, "Missing the required parameter 'endpointHttpServerInstantTest' when calling createHttpServerScheduledInstantTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createHttpServerScheduledInstantTestRequestBuilder(EndpointHttpServerInstantTest endpointHttpServerInstantTest, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/endpoint/tests/scheduled-tests/http-server/instant";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(endpointHttpServerInstantTest);
    return requestBuilder;
  }
}
