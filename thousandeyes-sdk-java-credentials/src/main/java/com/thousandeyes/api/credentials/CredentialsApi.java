/*
 * Credentials API
 * Manage credentials for transaction tests using the Credentials API.  The following permissions are required to access Credentials API endpoints:  * `Settings Tests Read` for read operations. * `Settings Tests Update` for write operations. * `View sensitive data in web transaction scripts` to view the encrypted value property of credentials. * `Settings Tests Create Transaction (Tx) Tests` to create credentials.  For more information about credentials, see [Working With Secure Credentials](https://docs.thousandeyes.com/product-documentation/browser-synthetics/transaction-tests/getting-started/working-with-secure-credentials). 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.credentials;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.credentials.model.Credential;
import com.thousandeyes.api.credentials.model.CredentialRequest;
import com.thousandeyes.api.credentials.model.CredentialWithoutValue;
import com.thousandeyes.api.credentials.model.Error;
import com.thousandeyes.api.credentials.model.GetTransactionTestsCredentialsList200Response;
import java.net.URI;
import com.thousandeyes.api.credentials.model.UnauthorizedError;
import com.thousandeyes.api.credentials.model.ValidationError;

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
public class CredentialsApi {
  private final ApiClient apiClient;

  public CredentialsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create credential
   * Creates a new credential for ThousandEyes transaction tests, based on properties provided in the request data. To create a new credential, you must have permission to update tests.
   * @param credentialRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return CredentialWithoutValue
   * @throws ApiException if fails to make API call
   */
  public CredentialWithoutValue createTransactionTestsCredential(CredentialRequest credentialRequest, String aid) throws ApiException {
    ApiResponse<CredentialWithoutValue> response = createTransactionTestsCredentialWithHttpInfo(credentialRequest, aid);
    return response.getData();
  }

  /**
   * Create credential
   * Creates a new credential for ThousandEyes transaction tests, based on properties provided in the request data. To create a new credential, you must have permission to update tests.
   * @param credentialRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;CredentialWithoutValue&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CredentialWithoutValue> createTransactionTestsCredentialWithHttpInfo(CredentialRequest credentialRequest, String aid) throws ApiException {
    createTransactionTestsCredentialValidateRequest(credentialRequest);

    var requestBuilder = createTransactionTestsCredentialRequestBuilder(credentialRequest, aid);
    return apiClient.send(requestBuilder.build(), CredentialWithoutValue.class);

  }

  private void createTransactionTestsCredentialValidateRequest(CredentialRequest credentialRequest) throws ApiException {
      // verify the required parameter 'credentialRequest' is set
      if (credentialRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'credentialRequest' when calling createTransactionTestsCredential");
      }
  }

  private ApiRequest.ApiRequestBuilder createTransactionTestsCredentialRequestBuilder(CredentialRequest credentialRequest, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/credentials";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(credentialRequest);
    return requestBuilder;
  }
  /**
   * Delete credential
   * Deletes a ThousandEyes transaction test credential, using the request parameters. To delete a credential, you must have permission to update tests and access to the credential based on its default or provided account ID.
   * @param id The ID of the desired credential. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteTransactionTestsCredential(String id, String aid) throws ApiException {
    deleteTransactionTestsCredentialWithHttpInfo(id, aid);
  }

  /**
   * Delete credential
   * Deletes a ThousandEyes transaction test credential, using the request parameters. To delete a credential, you must have permission to update tests and access to the credential based on its default or provided account ID.
   * @param id The ID of the desired credential. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteTransactionTestsCredentialWithHttpInfo(String id, String aid) throws ApiException {
    deleteTransactionTestsCredentialValidateRequest(id);

    var requestBuilder = deleteTransactionTestsCredentialRequestBuilder(id, aid);
    return apiClient.send(requestBuilder.build(), Void.class);

  }

  private void deleteTransactionTestsCredentialValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTransactionTestsCredential");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteTransactionTestsCredentialRequestBuilder(String id, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/credentials/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Retrieve credential
   * Retrieves detailed information about a ThousandEyes transaction test credential. To access this information, you must have access to the credential based on its default or provided account ID.
   * @param id The ID of the desired credential. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return Credential
   * @throws ApiException if fails to make API call
   */
  public Credential getTransactionTestsCredentialDetails(String id, String aid) throws ApiException {
    ApiResponse<Credential> response = getTransactionTestsCredentialDetailsWithHttpInfo(id, aid);
    return response.getData();
  }

  /**
   * Retrieve credential
   * Retrieves detailed information about a ThousandEyes transaction test credential. To access this information, you must have access to the credential based on its default or provided account ID.
   * @param id The ID of the desired credential. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Credential&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Credential> getTransactionTestsCredentialDetailsWithHttpInfo(String id, String aid) throws ApiException {
    getTransactionTestsCredentialDetailsValidateRequest(id);

    var requestBuilder = getTransactionTestsCredentialDetailsRequestBuilder(id, aid);
    return apiClient.send(requestBuilder.build(), Credential.class);

  }

  private void getTransactionTestsCredentialDetailsValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getTransactionTestsCredentialDetails");
      }
  }

  private ApiRequest.ApiRequestBuilder getTransactionTestsCredentialDetailsRequestBuilder(String id, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/credentials/{id}"
        .replace("{id}", urlEncode(id.toString()));
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
  /**
   * List credentials
   * Retrieves a list of credentials configured in ThousandEyes. Users have access to the list of credentials based on the default settings or the specified account ID.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return GetTransactionTestsCredentialsList200Response
   * @throws ApiException if fails to make API call
   */
  public GetTransactionTestsCredentialsList200Response getTransactionTestsCredentialsList(String aid) throws ApiException {
    ApiResponse<GetTransactionTestsCredentialsList200Response> response = getTransactionTestsCredentialsListWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List credentials
   * Retrieves a list of credentials configured in ThousandEyes. Users have access to the list of credentials based on the default settings or the specified account ID.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;GetTransactionTestsCredentialsList200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetTransactionTestsCredentialsList200Response> getTransactionTestsCredentialsListWithHttpInfo(String aid) throws ApiException {
    getTransactionTestsCredentialsListValidateRequest();

    var requestBuilder = getTransactionTestsCredentialsListRequestBuilder(aid);
    return apiClient.send(requestBuilder.build(), GetTransactionTestsCredentialsList200Response.class);

  }

  private void getTransactionTestsCredentialsListValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getTransactionTestsCredentialsListRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/credentials";
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
  /**
   * Update credential
   * Updates the credential for ThousandEyes transaction tests, based on properties provided in the request data. To update a credential, you must have permission to update tests and access to the credential based on its default or provided account ID.
   * @param id The ID of the desired credential. (required)
   * @param credentialRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return CredentialWithoutValue
   * @throws ApiException if fails to make API call
   */
  public CredentialWithoutValue updateTransactionTestsCredential(String id, CredentialRequest credentialRequest, String aid) throws ApiException {
    ApiResponse<CredentialWithoutValue> response = updateTransactionTestsCredentialWithHttpInfo(id, credentialRequest, aid);
    return response.getData();
  }

  /**
   * Update credential
   * Updates the credential for ThousandEyes transaction tests, based on properties provided in the request data. To update a credential, you must have permission to update tests and access to the credential based on its default or provided account ID.
   * @param id The ID of the desired credential. (required)
   * @param credentialRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;CredentialWithoutValue&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CredentialWithoutValue> updateTransactionTestsCredentialWithHttpInfo(String id, CredentialRequest credentialRequest, String aid) throws ApiException {
    updateTransactionTestsCredentialValidateRequest(id, credentialRequest);

    var requestBuilder = updateTransactionTestsCredentialRequestBuilder(id, credentialRequest, aid);
    return apiClient.send(requestBuilder.build(), CredentialWithoutValue.class);

  }

  private void updateTransactionTestsCredentialValidateRequest(String id, CredentialRequest credentialRequest) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateTransactionTestsCredential");
      }
      // verify the required parameter 'credentialRequest' is set
      if (credentialRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'credentialRequest' when calling updateTransactionTestsCredential");
      }
  }

  private ApiRequest.ApiRequestBuilder updateTransactionTestsCredentialRequestBuilder(String id, CredentialRequest credentialRequest, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/credentials/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(credentialRequest);
    return requestBuilder;
  }
}
