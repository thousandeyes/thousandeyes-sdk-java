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
import org.apache.commons.lang3.reflect.TypeUtils;
import com.thousandeyes.sdk.tags.model.ApiError;
import com.thousandeyes.sdk.tags.model.BulkTagResponse;
import com.thousandeyes.sdk.tags.model.Error;
import com.thousandeyes.sdk.tags.model.ExpandTagsOptions;
import com.thousandeyes.sdk.tags.model.Tag;
import com.thousandeyes.sdk.tags.model.TagInfo;
import com.thousandeyes.sdk.tags.model.Tags;
import com.thousandeyes.sdk.tags.model.UnauthorizedError;
import com.thousandeyes.sdk.tags.model.ValidationError;

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
public class TagsApi {
  private final ApiClient apiClient;

  public TagsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create tag
   * Creates a new tag.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param tagInfo Tag resource (optional)
   * @return TagInfo
   * @throws ApiException if fails to make API call
   */
  public TagInfo createTag(String aid, TagInfo tagInfo) throws ApiException {
    ApiResponse<TagInfo> response = createTagWithHttpInfo(aid, tagInfo);
    return response.getData();
  }

  /**
   * Create tag
   * Creates a new tag.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param tagInfo Tag resource (optional)
   * @return ApiResponse&lt;TagInfo&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TagInfo> createTagWithHttpInfo(String aid, TagInfo tagInfo) throws ApiException {
    createTagValidateRequest();

    var requestBuilder = createTagRequestBuilder(aid, tagInfo);

    return apiClient.send(requestBuilder.build(), TagInfo.class);
  }

  private void createTagValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder createTagRequestBuilder(String aid, TagInfo tagInfo) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/tags";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(tagInfo);
    return requestBuilder;
  }
  /**
   * Create multiple tags
   * Creates multiple tags. Note the response includes a &#x60;statuses&#x60; array. This array provides status information for each tag object, indexed 1:1 with the &#x60;tags&#x60; array.  
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param bulkTagResponse Tag resource (optional)
   * @return BulkTagResponse
   * @throws ApiException if fails to make API call
   */
  public BulkTagResponse createTags(String aid, BulkTagResponse bulkTagResponse) throws ApiException {
    ApiResponse<BulkTagResponse> response = createTagsWithHttpInfo(aid, bulkTagResponse);
    return response.getData();
  }

  /**
   * Create multiple tags
   * Creates multiple tags. Note the response includes a &#x60;statuses&#x60; array. This array provides status information for each tag object, indexed 1:1 with the &#x60;tags&#x60; array.  
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param bulkTagResponse Tag resource (optional)
   * @return ApiResponse&lt;BulkTagResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BulkTagResponse> createTagsWithHttpInfo(String aid, BulkTagResponse bulkTagResponse) throws ApiException {
    createTagsValidateRequest();

    var requestBuilder = createTagsRequestBuilder(aid, bulkTagResponse);

    return apiClient.send(requestBuilder.build(), BulkTagResponse.class);
  }

  private void createTagsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder createTagsRequestBuilder(String aid, BulkTagResponse bulkTagResponse) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/tags/bulk";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(bulkTagResponse);
    return requestBuilder;
  }
  /**
   * Delete tag
   * Deletes a tag.
   * @param id Tag ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteTag(String id, String aid) throws ApiException {
    deleteTagWithHttpInfo(id, aid);
  }

  /**
   * Delete tag
   * Deletes a tag.
   * @param id Tag ID (required)
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

    String path = "/tags/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Retrieve tag
   * Retrieves a tag using its ID.
   * @param id Tag ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional, to retrieve associated assignments (optional
   * @return Tag
   * @throws ApiException if fails to make API call
   */
  public Tag getTag(String id, String aid, List<ExpandTagsOptions> expand) throws ApiException {
    ApiResponse<Tag> response = getTagWithHttpInfo(id, aid, expand);
    return response.getData();
  }

  /**
   * Retrieve tag
   * Retrieves a tag using its ID.
   * @param id Tag ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional, to retrieve associated assignments (optional
   * @return ApiResponse&lt;Tag&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tag> getTagWithHttpInfo(String id, String aid, List<ExpandTagsOptions> expand) throws ApiException {
    getTagValidateRequest(id);

    var requestBuilder = getTagRequestBuilder(id, aid, expand);

    return apiClient.send(requestBuilder.build(), Tag.class);
  }

  private void getTagValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getTag");
      }
  }

  private ApiRequest.ApiRequestBuilder getTagRequestBuilder(String id, String aid, List<ExpandTagsOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/tags/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("multi", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * List tags
   * This operation returns a list of tags in the specified account group (&#x60;aid&#x60;).
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional, to retrieve associated assignments (optional
   * @return Tags
   * @throws ApiException if fails to make API call
   */
  public Tags getTags(String aid, List<ExpandTagsOptions> expand) throws ApiException {
    ApiResponse<Tags> response = getTagsWithHttpInfo(aid, expand);
    return response.getData();
  }

  /**
   * List tags
   * This operation returns a list of tags in the specified account group (&#x60;aid&#x60;).
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional, to retrieve associated assignments (optional
   * @return ApiResponse&lt;Tags&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tags> getTagsWithHttpInfo(String aid, List<ExpandTagsOptions> expand) throws ApiException {
    getTagsValidateRequest();

    var requestBuilder = getTagsRequestBuilder(aid, expand);

    return apiClient.send(requestBuilder.build(), Tags.class);
  }

  private void getTagsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getTagsRequestBuilder(String aid, List<ExpandTagsOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/tags";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("multi", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Update tag
   * Updates a tag.
   * @param id ID of tag to update (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param tagInfo  (optional)
   * @return TagInfo
   * @throws ApiException if fails to make API call
   */
  public TagInfo updateTag(String id, String aid, TagInfo tagInfo) throws ApiException {
    ApiResponse<TagInfo> response = updateTagWithHttpInfo(id, aid, tagInfo);
    return response.getData();
  }

  /**
   * Update tag
   * Updates a tag.
   * @param id ID of tag to update (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param tagInfo  (optional)
   * @return ApiResponse&lt;TagInfo&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TagInfo> updateTagWithHttpInfo(String id, String aid, TagInfo tagInfo) throws ApiException {
    updateTagValidateRequest(id);

    var requestBuilder = updateTagRequestBuilder(id, aid, tagInfo);

    return apiClient.send(requestBuilder.build(), TagInfo.class);
  }

  private void updateTagValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateTag");
      }
  }

  private ApiRequest.ApiRequestBuilder updateTagRequestBuilder(String id, String aid, TagInfo tagInfo) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/tags/{id}"
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
    requestBuilder.requestBody(tagInfo);
    return requestBuilder;
  }
}
