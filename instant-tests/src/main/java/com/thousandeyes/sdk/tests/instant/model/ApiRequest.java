/*
 * Instant Tests API
 * The Instant Tests API operations lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.instant.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.tests.instant.model.ApiClientAuthentication;
import com.thousandeyes.sdk.tests.instant.model.ApiRequestAssertion;
import com.thousandeyes.sdk.tests.instant.model.ApiRequestAuthType;
import com.thousandeyes.sdk.tests.instant.model.ApiRequestHeader;
import com.thousandeyes.sdk.tests.instant.model.ApiRequestMethod;
import com.thousandeyes.sdk.tests.instant.model.ApiRequestVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiRequest
 */
@JsonPropertyOrder({
  ApiRequest.JSON_PROPERTY_ASSERTIONS,
  ApiRequest.JSON_PROPERTY_AUTH_TYPE,
  ApiRequest.JSON_PROPERTY_BEARER_TOKEN,
  ApiRequest.JSON_PROPERTY_BODY,
  ApiRequest.JSON_PROPERTY_CLIENT_AUTHENTICATION,
  ApiRequest.JSON_PROPERTY_CLIENT_ID,
  ApiRequest.JSON_PROPERTY_CLIENT_SECRET,
  ApiRequest.JSON_PROPERTY_COLLECT_API_RESPONSE,
  ApiRequest.JSON_PROPERTY_HEADERS,
  ApiRequest.JSON_PROPERTY_METHOD,
  ApiRequest.JSON_PROPERTY_NAME,
  ApiRequest.JSON_PROPERTY_PASSWORD,
  ApiRequest.JSON_PROPERTY_SCOPE,
  ApiRequest.JSON_PROPERTY_TOKEN_URL,
  ApiRequest.JSON_PROPERTY_URL,
  ApiRequest.JSON_PROPERTY_USERNAME,
  ApiRequest.JSON_PROPERTY_VARIABLES,
  ApiRequest.JSON_PROPERTY_WAIT_TIME_MS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiRequest {
  public static final String JSON_PROPERTY_ASSERTIONS = "assertions";
  private List<ApiRequestAssertion> assertions = new ArrayList<>();

  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private ApiRequestAuthType authType = ApiRequestAuthType.NONE;

  public static final String JSON_PROPERTY_BEARER_TOKEN = "bearerToken";
  private String bearerToken;

  public static final String JSON_PROPERTY_BODY = "body";
  private String body;

  public static final String JSON_PROPERTY_CLIENT_AUTHENTICATION = "clientAuthentication";
  private ApiClientAuthentication clientAuthentication;

  public static final String JSON_PROPERTY_CLIENT_ID = "clientId";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "clientSecret";
  private String clientSecret;

  public static final String JSON_PROPERTY_COLLECT_API_RESPONSE = "collectApiResponse";
  private Boolean collectApiResponse = true;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private List<ApiRequestHeader> headers = new ArrayList<>();

  public static final String JSON_PROPERTY_METHOD = "method";
  private ApiRequestMethod method;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_TOKEN_URL = "tokenUrl";
  private String tokenUrl;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private List<ApiRequestVariable> variables = new ArrayList<>();

  public static final String JSON_PROPERTY_WAIT_TIME_MS = "waitTimeMs";
  private Integer waitTimeMs;

  public ApiRequest() { 
  }

  public ApiRequest assertions(List<ApiRequestAssertion> assertions) {
    this.assertions = assertions;
    return this;
  }

  public ApiRequest addAssertionsItem(ApiRequestAssertion assertionsItem) {
    if (this.assertions == null) {
      this.assertions = new ArrayList<>();
    }
    this.assertions.add(assertionsItem);
    return this;
  }

   /**
   * List of assertion objects.
   * @return assertions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSERTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiRequestAssertion> getAssertions() {
    return assertions;
  }


  @JsonProperty(JSON_PROPERTY_ASSERTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssertions(List<ApiRequestAssertion> assertions) {
    this.assertions = assertions;
  }


  public ApiRequest authType(ApiRequestAuthType authType) {
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiRequestAuthType getAuthType() {
    return authType;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthType(ApiRequestAuthType authType) {
    this.authType = authType;
  }


  public ApiRequest bearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
    return this;
  }

   /**
   * The bearer token if &#x60;authType &#x3D; bearer-token&#x60;.
   * @return bearerToken
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BEARER_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBearerToken() {
    return bearerToken;
  }


  @JsonProperty(JSON_PROPERTY_BEARER_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
  }


  public ApiRequest body(String body) {
    this.body = body;
    return this;
  }

   /**
   * POST/PUT request body. Must be in JSON format.
   * @return body
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBody() {
    return body;
  }


  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBody(String body) {
    this.body = body;
  }


  public ApiRequest clientAuthentication(ApiClientAuthentication clientAuthentication) {
    this.clientAuthentication = clientAuthentication;
    return this;
  }

   /**
   * Get clientAuthentication
   * @return clientAuthentication
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiClientAuthentication getClientAuthentication() {
    return clientAuthentication;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientAuthentication(ApiClientAuthentication clientAuthentication) {
    this.clientAuthentication = clientAuthentication;
  }


  public ApiRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The application ID used when &#x60;authType&#x60; is set to \&quot;oauth2\&quot;.
   * @return clientId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public ApiRequest clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * The private client secret used when &#x60;authType&#x60; is set to \&quot;oauth2\&quot;.
   * @return clientSecret
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientSecret() {
    return clientSecret;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public ApiRequest collectApiResponse(Boolean collectApiResponse) {
    this.collectApiResponse = collectApiResponse;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; if API response body should be collected and saved. Set to &#x60;false&#x60; if API response body should not be saved.
   * @return collectApiResponse
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLLECT_API_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCollectApiResponse() {
    return collectApiResponse;
  }


  @JsonProperty(JSON_PROPERTY_COLLECT_API_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollectApiResponse(Boolean collectApiResponse) {
    this.collectApiResponse = collectApiResponse;
  }


  public ApiRequest headers(List<ApiRequestHeader> headers) {
    this.headers = headers;
    return this;
  }

  public ApiRequest addHeadersItem(ApiRequestHeader headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Array of API Request Header objects.
   * @return headers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiRequestHeader> getHeaders() {
    return headers;
  }


  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaders(List<ApiRequestHeader> headers) {
    this.headers = headers;
  }


  public ApiRequest method(ApiRequestMethod method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiRequestMethod getMethod() {
    return method;
  }


  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMethod(ApiRequestMethod method) {
    this.method = method;
  }


  public ApiRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * API step name, must be unique.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public ApiRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password if &#x60;authType &#x3D; basic&#x60;.
   * @return password
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public ApiRequest scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Application-specific scope values for the access token when &#x60;authType&#x60; is \&quot;oauth2\&quot;.
   * @return scope
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScope() {
    return scope;
  }


  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScope(String scope) {
    this.scope = scope;
  }


  public ApiRequest tokenUrl(String tokenUrl) {
    this.tokenUrl = tokenUrl;
    return this;
  }

   /**
   * The endpoint used to request the access token when &#x60;authType&#x60; is \&quot;oauth2\&quot;.
   * @return tokenUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenUrl() {
    return tokenUrl;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenUrl(String tokenUrl) {
    this.tokenUrl = tokenUrl;
  }


  public ApiRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Request url. Supports variables in the format &#x60;{{variableName}}&#x60;.
   * @return url
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  public ApiRequest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username if &#x60;authType &#x3D; basic&#x60;.
   * @return username
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  public ApiRequest variables(List<ApiRequestVariable> variables) {
    this.variables = variables;
    return this;
  }

  public ApiRequest addVariablesItem(ApiRequestVariable variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

   /**
   * Array of API post request variable objects.
   * @return variables
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiRequestVariable> getVariables() {
    return variables;
  }


  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVariables(List<ApiRequestVariable> variables) {
    this.variables = variables;
  }


  public ApiRequest waitTimeMs(Integer waitTimeMs) {
    this.waitTimeMs = waitTimeMs;
    return this;
  }

   /**
   * Post request delay before executing the next API requests, in milliseconds.
   * @return waitTimeMs
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAIT_TIME_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWaitTimeMs() {
    return waitTimeMs;
  }


  @JsonProperty(JSON_PROPERTY_WAIT_TIME_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWaitTimeMs(Integer waitTimeMs) {
    this.waitTimeMs = waitTimeMs;
  }


  /**
   * Return true if this ApiRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiRequest apiRequest = (ApiRequest) o;
    return Objects.equals(this.assertions, apiRequest.assertions) &&
        Objects.equals(this.authType, apiRequest.authType) &&
        Objects.equals(this.bearerToken, apiRequest.bearerToken) &&
        Objects.equals(this.body, apiRequest.body) &&
        Objects.equals(this.clientAuthentication, apiRequest.clientAuthentication) &&
        Objects.equals(this.clientId, apiRequest.clientId) &&
        Objects.equals(this.clientSecret, apiRequest.clientSecret) &&
        Objects.equals(this.collectApiResponse, apiRequest.collectApiResponse) &&
        Objects.equals(this.headers, apiRequest.headers) &&
        Objects.equals(this.method, apiRequest.method) &&
        Objects.equals(this.name, apiRequest.name) &&
        Objects.equals(this.password, apiRequest.password) &&
        Objects.equals(this.scope, apiRequest.scope) &&
        Objects.equals(this.tokenUrl, apiRequest.tokenUrl) &&
        Objects.equals(this.url, apiRequest.url) &&
        Objects.equals(this.username, apiRequest.username) &&
        Objects.equals(this.variables, apiRequest.variables) &&
        Objects.equals(this.waitTimeMs, apiRequest.waitTimeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assertions, authType, bearerToken, body, clientAuthentication, clientId, clientSecret, collectApiResponse, headers, method, name, password, scope, tokenUrl, url, username, variables, waitTimeMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRequest {\n");
    sb.append("    assertions: ").append(toIndentedString(assertions)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    bearerToken: ").append(toIndentedString(bearerToken)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    clientAuthentication: ").append(toIndentedString(clientAuthentication)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    collectApiResponse: ").append(toIndentedString(collectApiResponse)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenUrl: ").append(toIndentedString(tokenUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    waitTimeMs: ").append(toIndentedString(waitTimeMs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

