/*
 * Tags API
 * The ThousandEyes Tags API provides a tagging system with key/value pairs. It allows you to tag assets within the ThousandEyes platform (such as agents, tests, or alert rules) with meaningful metadata. For example: `branch:sfo`, `branch:nyc`, and `team:netops`.  This feature provides:  * Support for automation. * Powerful and flexible reports/dashboards. * Support for third-party integrations.  Things to note with the ThousandEyes Tags API:  * Tags are backwards-compatible with existing labels. * Tags are separated by Tests (CEA), Agents (CEA), Endpoint Agents, Scheduled Endpoint Tests, and Reports. A single tag can only apply to one type of target object, so each tag must specify the target type of object via a `type` field. * Tags are defined in a single table so that they can be represented using a single model - `Tag`. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.tags;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.sdk.tags.model.ApiError;
import com.thousandeyes.sdk.tags.model.BulkTagAssignments;
import com.thousandeyes.sdk.tags.model.Error;
import com.thousandeyes.sdk.tags.model.TagAssignment;
import com.thousandeyes.sdk.tags.model.UnauthorizedError;

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
public class TagAssignmentApi {
  private final ApiClient apiClient;

  public TagAssignmentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Assign tag to multiple objects
   * Assigns a tag to one or more objects. This endpoint has cumulative behavior: The tag is assigned to the specified objects, and the previous assignments persist. No unassignment takes place.
   * @param id ID of the tag to associate (required)
   * @param tagAssignment  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void assignTag(String id, TagAssignment tagAssignment, String aid) throws ApiException {
    assignTagWithHttpInfo(id, tagAssignment, aid);
  }

  /**
   * Assign tag to multiple objects
   * Assigns a tag to one or more objects. This endpoint has cumulative behavior: The tag is assigned to the specified objects, and the previous assignments persist. No unassignment takes place.
   * @param id ID of the tag to associate (required)
   * @param tagAssignment  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> assignTagWithHttpInfo(String id, TagAssignment tagAssignment, String aid) throws ApiException {
    assignTagValidateRequest(id, tagAssignment);

    var requestBuilder = assignTagRequestBuilder(id, tagAssignment, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void assignTagValidateRequest(String id, TagAssignment tagAssignment) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling assignTag");
      }
      // verify the required parameter 'tagAssignment' is set
      if (tagAssignment == null) {
        throw new ApiException(400, "Missing the required parameter 'tagAssignment' when calling assignTag");
      }
  }

  private ApiRequest.ApiRequestBuilder assignTagRequestBuilder(String id, TagAssignment tagAssignment, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tags/{id}/assign"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(tagAssignment);
    return requestBuilder;
  }
  /**
   * Assign multiple tags to multiple objects
   * Assigns the specified tags to the specified objects. This endpoint has cumulative behavior: The tags are assigned to the specified objects, and the previous assignments persist. No unassignment takes place.
   * @param bulkTagAssignments  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void assignTags(BulkTagAssignments bulkTagAssignments, String aid) throws ApiException {
    assignTagsWithHttpInfo(bulkTagAssignments, aid);
  }

  /**
   * Assign multiple tags to multiple objects
   * Assigns the specified tags to the specified objects. This endpoint has cumulative behavior: The tags are assigned to the specified objects, and the previous assignments persist. No unassignment takes place.
   * @param bulkTagAssignments  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> assignTagsWithHttpInfo(BulkTagAssignments bulkTagAssignments, String aid) throws ApiException {
    assignTagsValidateRequest(bulkTagAssignments);

    var requestBuilder = assignTagsRequestBuilder(bulkTagAssignments, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void assignTagsValidateRequest(BulkTagAssignments bulkTagAssignments) throws ApiException {
      // verify the required parameter 'bulkTagAssignments' is set
      if (bulkTagAssignments == null) {
        throw new ApiException(400, "Missing the required parameter 'bulkTagAssignments' when calling assignTags");
      }
  }

  private ApiRequest.ApiRequestBuilder assignTagsRequestBuilder(BulkTagAssignments bulkTagAssignments, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tags/assign";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(bulkTagAssignments);
    return requestBuilder;
  }
  /**
   * Remove tag from multiple objects
   * Removes a tag from one or more objects.
   * @param id ID of the tag to associate (required)
   * @param tagAssignment  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void unassignTag(String id, TagAssignment tagAssignment, String aid) throws ApiException {
    unassignTagWithHttpInfo(id, tagAssignment, aid);
  }

  /**
   * Remove tag from multiple objects
   * Removes a tag from one or more objects.
   * @param id ID of the tag to associate (required)
   * @param tagAssignment  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> unassignTagWithHttpInfo(String id, TagAssignment tagAssignment, String aid) throws ApiException {
    unassignTagValidateRequest(id, tagAssignment);

    var requestBuilder = unassignTagRequestBuilder(id, tagAssignment, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void unassignTagValidateRequest(String id, TagAssignment tagAssignment) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling unassignTag");
      }
      // verify the required parameter 'tagAssignment' is set
      if (tagAssignment == null) {
        throw new ApiException(400, "Missing the required parameter 'tagAssignment' when calling unassignTag");
      }
  }

  private ApiRequest.ApiRequestBuilder unassignTagRequestBuilder(String id, TagAssignment tagAssignment, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tags/{id}/unassign"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(tagAssignment);
    return requestBuilder;
  }
  /**
   * Remove multiple tags from multiple objects
   * Removes the specified tags from one or more objects.
   * @param bulkTagAssignments  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void unassignTags(BulkTagAssignments bulkTagAssignments, String aid) throws ApiException {
    unassignTagsWithHttpInfo(bulkTagAssignments, aid);
  }

  /**
   * Remove multiple tags from multiple objects
   * Removes the specified tags from one or more objects.
   * @param bulkTagAssignments  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> unassignTagsWithHttpInfo(BulkTagAssignments bulkTagAssignments, String aid) throws ApiException {
    unassignTagsValidateRequest(bulkTagAssignments);

    var requestBuilder = unassignTagsRequestBuilder(bulkTagAssignments, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void unassignTagsValidateRequest(BulkTagAssignments bulkTagAssignments) throws ApiException {
      // verify the required parameter 'bulkTagAssignments' is set
      if (bulkTagAssignments == null) {
        throw new ApiException(400, "Missing the required parameter 'bulkTagAssignments' when calling unassignTags");
      }
  }

  private ApiRequest.ApiRequestBuilder unassignTagsRequestBuilder(BulkTagAssignments bulkTagAssignments, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tags/unassign";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(bulkTagAssignments);
    return requestBuilder;
  }
}
