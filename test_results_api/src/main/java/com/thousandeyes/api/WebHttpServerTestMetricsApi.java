/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api;

import com.thousandeyes.ApiCallback;
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.ApiResponse;
import com.thousandeyes.Configuration;
import com.thousandeyes.Pair;
import com.thousandeyes.ProgressRequestBody;
import com.thousandeyes.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.thousandeyes.api.model.Error;
import com.thousandeyes.api.model.Expand;
import com.thousandeyes.api.model.GetTestResultHttpServer200Response;
import java.time.OffsetDateTime;
import com.thousandeyes.api.model.UnauthorizedError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebHttpServerTestMetricsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WebHttpServerTestMetricsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WebHttpServerTestMetricsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getTestResultHttpServer
     * @param testId Test ID (required)
     * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
     * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
     * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
     * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
     * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;_links&#x60; instead of this parameter. (optional)
     * @param expand This parameter lets you decide if you want to see more details about test results. By default, no extra information is shown unless you use the query parameter. For instance, if you want more info about the \&quot;header,\&quot; add ?expand&#x3D;header to the query. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Insufficient permissions to query endpoint </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Exhausted rate limit for the organization </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTestResultHttpServerCall(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, List<Expand> expand, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v7/test-results/{testId}/http-server"
            .replace("{" + "testId" + "}", localVarApiClient.escapeString(testId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (aid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("aid", aid));
        }

        if (window != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("window", window));
        }

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startDate", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endDate", endDate));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (expand != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "expand", expand));
        }

        final String[] localVarAccepts = {
            "application/hal+json",
            "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTestResultHttpServerValidateBeforeCall(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, List<Expand> expand, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'testId' is set
        if (testId == null) {
            throw new ApiException("Missing the required parameter 'testId' when calling getTestResultHttpServer(Async)");
        }

        return getTestResultHttpServerCall(testId, aid, window, startDate, endDate, cursor, expand, _callback);

    }

    /**
     * Get HTTP server test results
     * Returns results for requests made over HTTP. Components include DNS, Connect, Wait, Receive, and Fetch. 
     * @param testId Test ID (required)
     * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
     * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
     * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
     * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
     * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;_links&#x60; instead of this parameter. (optional)
     * @param expand This parameter lets you decide if you want to see more details about test results. By default, no extra information is shown unless you use the query parameter. For instance, if you want more info about the \&quot;header,\&quot; add ?expand&#x3D;header to the query. (optional)
     * @return GetTestResultHttpServer200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Insufficient permissions to query endpoint </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Exhausted rate limit for the organization </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
     </table>
     */
    public GetTestResultHttpServer200Response getTestResultHttpServer(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, List<Expand> expand) throws ApiException {
        ApiResponse<GetTestResultHttpServer200Response> localVarResp = getTestResultHttpServerWithHttpInfo(testId, aid, window, startDate, endDate, cursor, expand);
        return localVarResp.getData();
    }

    /**
     * Get HTTP server test results
     * Returns results for requests made over HTTP. Components include DNS, Connect, Wait, Receive, and Fetch. 
     * @param testId Test ID (required)
     * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
     * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
     * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
     * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
     * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;_links&#x60; instead of this parameter. (optional)
     * @param expand This parameter lets you decide if you want to see more details about test results. By default, no extra information is shown unless you use the query parameter. For instance, if you want more info about the \&quot;header,\&quot; add ?expand&#x3D;header to the query. (optional)
     * @return ApiResponse&lt;GetTestResultHttpServer200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Insufficient permissions to query endpoint </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Exhausted rate limit for the organization </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetTestResultHttpServer200Response> getTestResultHttpServerWithHttpInfo(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, List<Expand> expand) throws ApiException {
        okhttp3.Call localVarCall = getTestResultHttpServerValidateBeforeCall(testId, aid, window, startDate, endDate, cursor, expand, null);
        Type localVarReturnType = new TypeToken<GetTestResultHttpServer200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get HTTP server test results (asynchronously)
     * Returns results for requests made over HTTP. Components include DNS, Connect, Wait, Receive, and Fetch. 
     * @param testId Test ID (required)
     * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
     * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
     * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
     * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
     * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;_links&#x60; instead of this parameter. (optional)
     * @param expand This parameter lets you decide if you want to see more details about test results. By default, no extra information is shown unless you use the query parameter. For instance, if you want more info about the \&quot;header,\&quot; add ?expand&#x3D;header to the query. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Insufficient permissions to query endpoint </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Exhausted rate limit for the organization </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTestResultHttpServerAsync(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, List<Expand> expand, final ApiCallback<GetTestResultHttpServer200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTestResultHttpServerValidateBeforeCall(testId, aid, window, startDate, endDate, cursor, expand, _callback);
        Type localVarReturnType = new TypeToken<GetTestResultHttpServer200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
