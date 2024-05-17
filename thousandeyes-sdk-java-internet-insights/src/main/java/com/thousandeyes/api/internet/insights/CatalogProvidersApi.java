/*
 * Internet Insights API
 * We are happy to announce the release of the Internet Insights API set. This limited release includes endpoints that:  * Make our catalog provider and Internet outage data accessible to API users. * Provide access to advanced filtering, which is part of our next-generation API efforts to allow API users to fine-tune queries across all of our APIs in a consistent manner.  Internet Insights provide visibility into core Internet infrastructure, including ISPs, DNS providers, IaaS, CDNs , and SaaS providers. It tracks the macro-level impact of Internet events on individual users and enterprise networks connecting at the edge of the Internet. These events include Outages, Routing hijacks and leaks, DDoS attacks, And political interference, among others.  Future releases of the Internet Insights API set will further unlock access to core Internet Insights functionality, unlocking potential integrations to enrich customer process flows. 
 *
 * The version of the OpenAPI document: 7.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.internet.insights;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.internet.insights.model.ApiCatalogProviderDetails;
import com.thousandeyes.api.internet.insights.model.ApiCatalogProviderFilter;
import com.thousandeyes.api.internet.insights.model.ApiCatalogProviderResponse;
import com.thousandeyes.api.internet.insights.model.Error;
import java.util.UUID;
import com.thousandeyes.api.internet.insights.model.UnauthorizedError;
import com.thousandeyes.api.internet.insights.model.ValidationError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-05-17T09:32:25.983420+01:00[Europe/Lisbon]")
public class CatalogProvidersApi {
  private final ApiClient apiClient;

  public CatalogProvidersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * List catalog providers
   * Returns a list of catalog providers using the specified filters. Returns high-level information about each catalog provider. For more details about a specific provider, call the Get a catalog provider endpoint.  &lt;b&gt;Note:&lt;/b&gt; Support for pagination will be added in the future. 
   * @param apiCatalogProviderFilter  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiCatalogProviderResponse
   * @throws ApiException if fails to make API call
   */
  public ApiCatalogProviderResponse catalogProviderList(ApiCatalogProviderFilter apiCatalogProviderFilter, String aid) throws ApiException {
    ApiResponse<ApiCatalogProviderResponse> response = catalogProviderListWithHttpInfo(apiCatalogProviderFilter, aid);
    return response.getData();
  }

  /**
   * List catalog providers
   * Returns a list of catalog providers using the specified filters. Returns high-level information about each catalog provider. For more details about a specific provider, call the Get a catalog provider endpoint.  &lt;b&gt;Note:&lt;/b&gt; Support for pagination will be added in the future. 
   * @param apiCatalogProviderFilter  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;ApiCatalogProviderResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiCatalogProviderResponse> catalogProviderListWithHttpInfo(ApiCatalogProviderFilter apiCatalogProviderFilter, String aid) throws ApiException {
    catalogProviderListValidateRequest(apiCatalogProviderFilter);

    var requestBuilder = catalogProviderListRequestBuilder(apiCatalogProviderFilter, aid);

    return apiClient.send(requestBuilder.build(), ApiCatalogProviderResponse.class);
  }

  private void catalogProviderListValidateRequest(ApiCatalogProviderFilter apiCatalogProviderFilter) throws ApiException {
      // verify the required parameter 'apiCatalogProviderFilter' is set
      if (apiCatalogProviderFilter == null) {
        throw new ApiException(400, "Missing the required parameter 'apiCatalogProviderFilter' when calling catalogProviderList");
      }
  }

  private ApiRequest.ApiRequestBuilder catalogProviderListRequestBuilder(ApiCatalogProviderFilter apiCatalogProviderFilter, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/internet-insights/catalog/providers/filter";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(apiCatalogProviderFilter);
    return requestBuilder;
  }
  /**
   * Retrieve a catalog provider
   * Returns the details of a catalog provider. 
   * @param providerId  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiCatalogProviderDetails
   * @throws ApiException if fails to make API call
   */
  public ApiCatalogProviderDetails getCatalogProvider(UUID providerId, String aid) throws ApiException {
    ApiResponse<ApiCatalogProviderDetails> response = getCatalogProviderWithHttpInfo(providerId, aid);
    return response.getData();
  }

  /**
   * Retrieve a catalog provider
   * Returns the details of a catalog provider. 
   * @param providerId  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;ApiCatalogProviderDetails&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiCatalogProviderDetails> getCatalogProviderWithHttpInfo(UUID providerId, String aid) throws ApiException {
    getCatalogProviderValidateRequest(providerId);

    var requestBuilder = getCatalogProviderRequestBuilder(providerId, aid);

    return apiClient.send(requestBuilder.build(), ApiCatalogProviderDetails.class);
  }

  private void getCatalogProviderValidateRequest(UUID providerId) throws ApiException {
      // verify the required parameter 'providerId' is set
      if (providerId == null) {
        throw new ApiException(400, "Missing the required parameter 'providerId' when calling getCatalogProvider");
      }
  }

  private ApiRequest.ApiRequestBuilder getCatalogProviderRequestBuilder(UUID providerId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/internet-insights/catalog/providers/{providerId}"
        .replace("{providerId}", urlEncode(providerId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
}
