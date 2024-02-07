/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.endpoint.agents;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.endpoint.agents.model.EndpointAgentsConnectionString200Response;
import com.thousandeyes.api.endpoint.agents.model.Error;
import com.thousandeyes.api.endpoint.agents.model.UnauthorizedError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-02-07T22:58:17.779627Z[Europe/Lisbon]")
public class AdministrativeEndpointsApi {
  private final ApiClient apiClient;

  public AdministrativeEndpointsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get agent connection string
   * 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EndpointAgentsConnectionString200Response
   * @throws ApiException if fails to make API call
   */
  public EndpointAgentsConnectionString200Response endpointAgentsConnectionString(String aid) throws ApiException {
    ApiResponse<EndpointAgentsConnectionString200Response> response = endpointAgentsConnectionStringWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * Get agent connection string
   * 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EndpointAgentsConnectionString200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointAgentsConnectionString200Response> endpointAgentsConnectionStringWithHttpInfo(String aid) throws ApiException {
    endpointAgentsConnectionStringValidateRequest();

    var requestBuilder = endpointAgentsConnectionStringRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), EndpointAgentsConnectionString200Response.class);
  }

  private void endpointAgentsConnectionStringValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder endpointAgentsConnectionStringRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/endpoint/agents/connection-string";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "aid";
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));

    return requestBuilder;
  }
}
