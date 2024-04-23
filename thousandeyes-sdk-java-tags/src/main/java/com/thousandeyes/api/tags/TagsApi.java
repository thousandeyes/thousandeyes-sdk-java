/*
 * Tags API
 * The ThousandEyes Tags API provides a tagging system with key/value pairs. It allows you to tag assets within the ThousandEyes platform (such as agents, tests, or alert rules) with meaningful metadata. For example: `branch:sfo`, `branch:nyc`, and `team:netops`.  This feature provides:  * Support for automation. * Powerful and flexible reports/dashboards. * Support for third-party integrations.  Things to note with the ThousandEyes Tags API:  * Tags are backwards-compatible with existing labels. * Tags are separated by Tests (CEA), Agents (CEA), Endpoint Agents, Scheduled Endpoint Tests, and Reports. A single tag can only apply to one type of target object, so each tag must specify the target type of object via a `type` field. * Tags are defined in a single table so that they can be represented using a single model - `Tag`. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.tags;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.tags.model.ApiError;
import com.thousandeyes.api.tags.model.BulkTagResponse;
import com.thousandeyes.api.tags.model.Error;
import com.thousandeyes.api.tags.model.Expand;
import com.thousandeyes.api.tags.model.Tag;
import java.util.UUID;
import com.thousandeyes.api.tags.model.UnauthorizedError;
import com.thousandeyes.api.tags.model.ValidationError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T17:12:32.220834+01:00[Europe/Lisbon]")
public class TagsApi {
  private final ApiClient apiClient;

  public TagsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create tag
   * Creates a new tag.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param body Tag resource (optional)
   * @throws ApiException if fails to make API call
   */
  public void createTag(String aid, Tag body) throws ApiException {
    createTagWithHttpInfo(aid, body);
  }

  /**
   * Create tag
   * Creates a new tag.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param body Tag resource (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> createTagWithHttpInfo(String aid, Tag body) throws ApiException {
    createTagValidateRequest();

    var requestBuilder = createTagRequestBuilder(aid, body);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void createTagValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder createTagRequestBuilder(String aid, Tag body) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tags";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(body);
    return requestBuilder;
  }
  /**
   * Create multiple tags
   * Creates multiple tags. Note the response includes a &#x60;statuses&#x60; array. This array provides status information for each tag object, indexed 1:1 with the &#x60;tags&#x60; array.  
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param bulkTagResponse Tag resource (optional)
   * @throws ApiException if fails to make API call
   */
  public void createTagBulk(String aid, BulkTagResponse bulkTagResponse) throws ApiException {
    createTagBulkWithHttpInfo(aid, bulkTagResponse);
  }

  /**
   * Create multiple tags
   * Creates multiple tags. Note the response includes a &#x60;statuses&#x60; array. This array provides status information for each tag object, indexed 1:1 with the &#x60;tags&#x60; array.  
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param bulkTagResponse Tag resource (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> createTagBulkWithHttpInfo(String aid, BulkTagResponse bulkTagResponse) throws ApiException {
    createTagBulkValidateRequest();

    var requestBuilder = createTagBulkRequestBuilder(aid, bulkTagResponse);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void createTagBulkValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder createTagBulkRequestBuilder(String aid, BulkTagResponse bulkTagResponse) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tags/bulk";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(bulkTagResponse);
    return requestBuilder;
  }
  /**
   * Delete tag
   * Deletes a tag.
   * @param id ID of tag to delete (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteTag(String id, String aid) throws ApiException {
    deleteTagWithHttpInfo(id, aid);
  }

  /**
   * Delete tag
   * Deletes a tag.
   * @param id ID of tag to delete (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteTagWithHttpInfo(String id, String aid) throws ApiException {
    deleteTagValidateRequest(id);

    var requestBuilder = deleteTagRequestBuilder(id, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteTagValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTag");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteTagRequestBuilder(String id, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/tags/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Retrieve tag
   * Retrieves a tag using its ID.
   * @param id ID of tag to retrieve (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional, to retrieve associated assignments (optional
   * @throws ApiException if fails to make API call
   */
  public void getTag(UUID id, String aid, List<Expand> expand) throws ApiException {
    getTagWithHttpInfo(id, aid, expand);
  }

  /**
   * Retrieve tag
   * Retrieves a tag using its ID.
   * @param id ID of tag to retrieve (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional, to retrieve associated assignments (optional
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> getTagWithHttpInfo(UUID id, String aid, List<Expand> expand) throws ApiException {
    getTagValidateRequest(id);

    var requestBuilder = getTagRequestBuilder(id, aid, expand);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void getTagValidateRequest(UUID id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getTag");
      }
  }

  private ApiRequest.ApiRequestBuilder getTagRequestBuilder(UUID id, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tags/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("multi", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * List tags
   * This endpoint returns a list of tags in the specified account group (&#x60;aid&#x60;).
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional, to retrieve associated assignments (optional
   * @throws ApiException if fails to make API call
   */
  public void getTags(String aid, List<Expand> expand) throws ApiException {
    getTagsWithHttpInfo(aid, expand);
  }

  /**
   * List tags
   * This endpoint returns a list of tags in the specified account group (&#x60;aid&#x60;).
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional, to retrieve associated assignments (optional
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> getTagsWithHttpInfo(String aid, List<Expand> expand) throws ApiException {
    getTagsValidateRequest();

    var requestBuilder = getTagsRequestBuilder(aid, expand);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void getTagsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getTagsRequestBuilder(String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tags";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("multi", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Update tag
   * Updates a tag.
   * @param id ID of tag to update (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateTag(String id, String aid, Tag body) throws ApiException {
    updateTagWithHttpInfo(id, aid, body);
  }

  /**
   * Update tag
   * Updates a tag.
   * @param id ID of tag to update (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param body  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateTagWithHttpInfo(String id, String aid, Tag body) throws ApiException {
    updateTagValidateRequest(id);

    var requestBuilder = updateTagRequestBuilder(id, aid, body);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void updateTagValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateTag");
      }
  }

  private ApiRequest.ApiRequestBuilder updateTagRequestBuilder(String id, String aid, Tag body) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/tags/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(body);
    return requestBuilder;
  }
}
