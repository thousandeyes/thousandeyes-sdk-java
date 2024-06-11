/*
 * Labels API
 * ### Overview This is API for the Labels API (formerly called groups).
 *
 * The version of the OpenAPI document: 7.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.labels;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.sdk.labels.model.Error;
import com.thousandeyes.sdk.labels.model.Labels;
import com.thousandeyes.sdk.labels.model.UnauthorizedError;
import com.thousandeyes.sdk.labels.model.ValidationError;

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
public class AllLabelsApi {
  private final ApiClient apiClient;

  public AllLabelsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get list of Labels
   * Returns a list of all labels (formerly called groups) configured in ThousandEyes.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return Labels
   * @throws ApiException if fails to make API call
   */
  public Labels getLabels(String aid) throws ApiException {
    ApiResponse<Labels> response = getLabelsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * Get list of Labels
   * Returns a list of all labels (formerly called groups) configured in ThousandEyes.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Labels&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Labels> getLabelsWithHttpInfo(String aid) throws ApiException {
    getLabelsValidateRequest();

    var requestBuilder = getLabelsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), Labels.class);
  }

  private void getLabelsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getLabelsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/labels";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
}
