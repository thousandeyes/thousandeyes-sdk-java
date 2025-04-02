/*
 * Instant Tests API
 * The Instant Tests API operations lets you create and run new instant tests. You will need to be an Account Admin.  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.tests.instant;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.reflect.TypeUtils;
import com.thousandeyes.sdk.tests.instant.model.DnsSecInstantTestRequest;
import com.thousandeyes.sdk.tests.instant.model.DnsSecInstantTestResponse;
import com.thousandeyes.sdk.tests.instant.model.Error;
import com.thousandeyes.sdk.tests.instant.model.ExpandInstantTestOptions;
import java.net.URI;
import com.thousandeyes.sdk.tests.instant.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.instant.model.ValidationError;

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
public class DnssecInstantTestsApi {
  private final ApiClient apiClient;

  public DnssecInstantTestsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create DNSSEC instant test
   * Creates and runs a new DNSSEC instant test.
   * @param dnsSecInstantTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand (Optional) Indicates if the test sub-resources should be expanded. Defaults to no expansion. To expand the &#x60;agents&#x60; sub-resource, use the query &#x60;?expand&#x3D;agent&#x60;. (optional
   * @return DnsSecInstantTestResponse
   * @throws ApiException if fails to make API call
   */
  public DnsSecInstantTestResponse createDnsSecInstantTest(DnsSecInstantTestRequest dnsSecInstantTestRequest, String aid, List<ExpandInstantTestOptions> expand) throws ApiException {
    ApiResponse<DnsSecInstantTestResponse> response = createDnsSecInstantTestWithHttpInfo(dnsSecInstantTestRequest, aid, expand);
    return response.getData();
  }

  /**
   * Create DNSSEC instant test
   * Creates and runs a new DNSSEC instant test.
   * @param dnsSecInstantTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand (Optional) Indicates if the test sub-resources should be expanded. Defaults to no expansion. To expand the &#x60;agents&#x60; sub-resource, use the query &#x60;?expand&#x3D;agent&#x60;. (optional
   * @return ApiResponse&lt;DnsSecInstantTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DnsSecInstantTestResponse> createDnsSecInstantTestWithHttpInfo(DnsSecInstantTestRequest dnsSecInstantTestRequest, String aid, List<ExpandInstantTestOptions> expand) throws ApiException {
    createDnsSecInstantTestValidateRequest(dnsSecInstantTestRequest);

    var requestBuilder = createDnsSecInstantTestRequestBuilder(dnsSecInstantTestRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), DnsSecInstantTestResponse.class);
  }

  private void createDnsSecInstantTestValidateRequest(DnsSecInstantTestRequest dnsSecInstantTestRequest) throws ApiException {
      // verify the required parameter 'dnsSecInstantTestRequest' is set
      if (dnsSecInstantTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'dnsSecInstantTestRequest' when calling createDnsSecInstantTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createDnsSecInstantTestRequestBuilder(DnsSecInstantTestRequest dnsSecInstantTestRequest, String aid, List<ExpandInstantTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/tests/dnssec/instant";
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
    requestBuilder.requestBody(dnsSecInstantTestRequest);
    return requestBuilder;
  }
}
