/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.endpoint.tests.results;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.sdk.endpoint.tests.results.model.EndpointNetworkTopologyResultRequest;
import com.thousandeyes.sdk.endpoint.tests.results.model.Error;
import com.thousandeyes.sdk.endpoint.tests.results.model.LocalNetworkResults;
import com.thousandeyes.sdk.endpoint.tests.results.model.LocalNetworkTopologyDetailResults;
import com.thousandeyes.sdk.endpoint.tests.results.model.LocalNetworkTopologyResults;
import java.time.OffsetDateTime;
import com.thousandeyes.sdk.endpoint.tests.results.model.UnauthorizedError;
import com.thousandeyes.sdk.endpoint.tests.results.model.ValidationError;

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
public class LocalNetworkTestsResultsApi {
  private final ApiClient apiClient;

  public LocalNetworkTestsResultsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * List endpoint network topologies probes
   * Returns a list of all endpoint local network topologies probes.  Results from the last round are provided unless an explicit start and end is provided with &#x60;startDate&#x60;, &#x60;endDate&#x60; or &#x60;window&#x60; optional parameters.  ## Request body filters This endpoint supports complex filtering using the request body. It is important these filters remain unaltered when making use of pagination, otherwise the results will not be coherent with the original request.  ### Multiple filter fields When multiple filter fields are provided, a logical &#x60;AND&#x60; is applied between the filters.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Filter field with multiple values When a filter field contains multiple values, a logical &#x60;OR&#x60; is applied between the filter values.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Combination of request parameters and body filters &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter?window&#x3D;12h&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ],     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Warning Note that a maximum of 12h worth of data can be retrieved at once.  If you need more, you need to make multiple requests.  Returns a &#x60;results&#x60; array of network topology probes.  Network topology probes shown are from the latest round, or based on the time range specified. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param endpointNetworkTopologyResultRequest  (optional)
   * @return LocalNetworkTopologyResults
   * @throws ApiException if fails to make API call
   */
  public LocalNetworkTopologyResults filterLocalNetworksTestResultsTopologies(String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, EndpointNetworkTopologyResultRequest endpointNetworkTopologyResultRequest) throws ApiException {
    ApiResponse<LocalNetworkTopologyResults> response = filterLocalNetworksTestResultsTopologiesWithHttpInfo(aid, window, startDate, endDate, cursor, endpointNetworkTopologyResultRequest);
    return response.getData();
  }

  /**
   * List endpoint network topologies probes
   * Returns a list of all endpoint local network topologies probes.  Results from the last round are provided unless an explicit start and end is provided with &#x60;startDate&#x60;, &#x60;endDate&#x60; or &#x60;window&#x60; optional parameters.  ## Request body filters This endpoint supports complex filtering using the request body. It is important these filters remain unaltered when making use of pagination, otherwise the results will not be coherent with the original request.  ### Multiple filter fields When multiple filter fields are provided, a logical &#x60;AND&#x60; is applied between the filters.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Filter field with multiple values When a filter field contains multiple values, a logical &#x60;OR&#x60; is applied between the filter values.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Combination of request parameters and body filters &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter?window&#x3D;12h&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ],     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Warning Note that a maximum of 12h worth of data can be retrieved at once.  If you need more, you need to make multiple requests.  Returns a &#x60;results&#x60; array of network topology probes.  Network topology probes shown are from the latest round, or based on the time range specified. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param endpointNetworkTopologyResultRequest  (optional)
   * @return ApiResponse&lt;LocalNetworkTopologyResults&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocalNetworkTopologyResults> filterLocalNetworksTestResultsTopologiesWithHttpInfo(String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, EndpointNetworkTopologyResultRequest endpointNetworkTopologyResultRequest) throws ApiException {
    filterLocalNetworksTestResultsTopologiesValidateRequest();

    var requestBuilder = filterLocalNetworksTestResultsTopologiesRequestBuilder(aid, window, startDate, endDate, cursor, endpointNetworkTopologyResultRequest);

    return apiClient.send(requestBuilder.build(), LocalNetworkTopologyResults.class);
  }

  private void filterLocalNetworksTestResultsTopologiesValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder filterLocalNetworksTestResultsTopologiesRequestBuilder(String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, EndpointNetworkTopologyResultRequest endpointNetworkTopologyResultRequest) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/endpoint/test-results/local-networks/topologies/filter";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("window", window));
    localVarQueryParams.addAll(parameterToPairs("startDate", startDate));
    localVarQueryParams.addAll(parameterToPairs("endDate", endDate));
    localVarQueryParams.addAll(parameterToPairs("cursor", cursor));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(endpointNetworkTopologyResultRequest);
    return requestBuilder;
  }
  /**
   * List local networks
   * Returns a list of all the networks used by endpoint agents.  Sends back a &#x60;localNetworks&#x60; array. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return LocalNetworkResults
   * @throws ApiException if fails to make API call
   */
  public LocalNetworkResults getLocalNetworksTestResults(String aid) throws ApiException {
    ApiResponse<LocalNetworkResults> response = getLocalNetworksTestResultsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List local networks
   * Returns a list of all the networks used by endpoint agents.  Sends back a &#x60;localNetworks&#x60; array. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;LocalNetworkResults&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocalNetworkResults> getLocalNetworksTestResultsWithHttpInfo(String aid) throws ApiException {
    getLocalNetworksTestResultsValidateRequest();

    var requestBuilder = getLocalNetworksTestResultsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), LocalNetworkResults.class);
  }

  private void getLocalNetworksTestResultsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getLocalNetworksTestResultsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/endpoint/test-results/local-networks";
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
  /**
   * Retrieve endpoint local network topology
   * Returns detailed data of a local network topology. 
   * @param networkTopologyId The network topology ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return LocalNetworkTopologyDetailResults
   * @throws ApiException if fails to make API call
   */
  public LocalNetworkTopologyDetailResults getLocalNetworksTestResultsTopology(String networkTopologyId, String aid) throws ApiException {
    ApiResponse<LocalNetworkTopologyDetailResults> response = getLocalNetworksTestResultsTopologyWithHttpInfo(networkTopologyId, aid);
    return response.getData();
  }

  /**
   * Retrieve endpoint local network topology
   * Returns detailed data of a local network topology. 
   * @param networkTopologyId The network topology ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;LocalNetworkTopologyDetailResults&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocalNetworkTopologyDetailResults> getLocalNetworksTestResultsTopologyWithHttpInfo(String networkTopologyId, String aid) throws ApiException {
    getLocalNetworksTestResultsTopologyValidateRequest(networkTopologyId);

    var requestBuilder = getLocalNetworksTestResultsTopologyRequestBuilder(networkTopologyId, aid);

    return apiClient.send(requestBuilder.build(), LocalNetworkTopologyDetailResults.class);
  }

  private void getLocalNetworksTestResultsTopologyValidateRequest(String networkTopologyId) throws ApiException {
      // verify the required parameter 'networkTopologyId' is set
      if (networkTopologyId == null) {
        throw new ApiException(400, "Missing the required parameter 'networkTopologyId' when calling getLocalNetworksTestResultsTopology");
      }
  }

  private ApiRequest.ApiRequestBuilder getLocalNetworksTestResultsTopologyRequestBuilder(String networkTopologyId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/endpoint/test-results/local-networks/topologies/{networkTopologyId}"
        .replace("{networkTopologyId}", urlEncode(networkTopologyId.toString()));
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