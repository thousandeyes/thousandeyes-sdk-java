/*
 * Test Snapshots API
 * Creates a new test snapshot in ThousandEyes.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.snapshots;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.reflect.TypeUtils;
import com.thousandeyes.sdk.snapshots.model.Error;
import com.thousandeyes.sdk.snapshots.model.SnapshotRequest;
import com.thousandeyes.sdk.snapshots.model.SnapshotResponse;
import com.thousandeyes.sdk.snapshots.model.UnauthorizedError;
import com.thousandeyes.sdk.snapshots.model.ValidationError;

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
public class TestSnapshotsApi {
  private final ApiClient apiClient;

  public TestSnapshotsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create test snapshot
   * This operation creates a test snapshot based on the properties provided in the POST data.  * To use this endpoint, you need the &#x60;Create snapshot shares&#x60; permission. * You can create a maximum of 5 snapshots per organization within a 5-minute interval. * Snapshots generated through this operation have a 30-day expiration period. * The time range specified with the &#x60;from&#x60; and &#x60;to&#x60; parameters must adhere to one of the following intervals: 1, 2, 4, 6, 12, 24, or 48 hours. * The &#x60;endDate&#x60; field of the snapshot must be set to the present or a past date. * Certain regions may not have public snapshots enabled for compliance reasons. In that case you will get a 403 Forbidden as a response.  **Note**: This operation does not support the creation of operation Agent snapshots. 
   * @param testId Test ID (required)
   * @param snapshotRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return SnapshotResponse
   * @throws ApiException if fails to make API call
   */
  public SnapshotResponse createTestSnapshot(String testId, SnapshotRequest snapshotRequest, String aid) throws ApiException {
    ApiResponse<SnapshotResponse> response = createTestSnapshotWithHttpInfo(testId, snapshotRequest, aid);
    return response.getData();
  }

  /**
   * Create test snapshot
   * This operation creates a test snapshot based on the properties provided in the POST data.  * To use this endpoint, you need the &#x60;Create snapshot shares&#x60; permission. * You can create a maximum of 5 snapshots per organization within a 5-minute interval. * Snapshots generated through this operation have a 30-day expiration period. * The time range specified with the &#x60;from&#x60; and &#x60;to&#x60; parameters must adhere to one of the following intervals: 1, 2, 4, 6, 12, 24, or 48 hours. * The &#x60;endDate&#x60; field of the snapshot must be set to the present or a past date. * Certain regions may not have public snapshots enabled for compliance reasons. In that case you will get a 403 Forbidden as a response.  **Note**: This operation does not support the creation of operation Agent snapshots. 
   * @param testId Test ID (required)
   * @param snapshotRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;SnapshotResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SnapshotResponse> createTestSnapshotWithHttpInfo(String testId, SnapshotRequest snapshotRequest, String aid) throws ApiException {
    createTestSnapshotValidateRequest(testId, snapshotRequest);

    var requestBuilder = createTestSnapshotRequestBuilder(testId, snapshotRequest, aid);

    return apiClient.send(requestBuilder.build(), SnapshotResponse.class);
  }

  private void createTestSnapshotValidateRequest(String testId, SnapshotRequest snapshotRequest) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling createTestSnapshot");
      }
      // verify the required parameter 'snapshotRequest' is set
      if (snapshotRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'snapshotRequest' when calling createTestSnapshot");
      }
  }

  private ApiRequest.ApiRequestBuilder createTestSnapshotRequestBuilder(String testId, SnapshotRequest snapshotRequest, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/tests/{testId}/snapshot"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(snapshotRequest);
    return requestBuilder;
  }
}
