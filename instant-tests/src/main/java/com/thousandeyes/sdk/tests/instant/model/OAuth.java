/*
 * Instant Tests API
 * The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
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
import com.thousandeyes.sdk.tests.instant.model.RequestMethod;
import com.thousandeyes.sdk.tests.instant.model.TestAuthType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Use this only if you want to use OAuth as the authentication mechanism.
 */
@JsonPropertyOrder({
  OAuth.JSON_PROPERTY_CONFIG_ID,
  OAuth.JSON_PROPERTY_TEST_URL,
  OAuth.JSON_PROPERTY_REQUEST_METHOD,
  OAuth.JSON_PROPERTY_POST_BODY,
  OAuth.JSON_PROPERTY_HEADERS,
  OAuth.JSON_PROPERTY_AUTH_TYPE,
  OAuth.JSON_PROPERTY_USERNAME,
  OAuth.JSON_PROPERTY_PASSWORD
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class OAuth {
  public static final String JSON_PROPERTY_CONFIG_ID = "configId";
  private String configId;

  public static final String JSON_PROPERTY_TEST_URL = "testUrl";
  private String testUrl;

  public static final String JSON_PROPERTY_REQUEST_METHOD = "requestMethod";
  private RequestMethod requestMethod;

  public static final String JSON_PROPERTY_POST_BODY = "postBody";
  private String postBody;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private String headers;

  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private TestAuthType authType = TestAuthType.NONE;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public OAuth() { 
  }

  public OAuth configId(String configId) {
    this.configId = configId;
    return this;
  }

   /**
   * The ID of the OAuth configuration.
   * @return configId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConfigId() {
    return configId;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigId(String configId) {
    this.configId = configId;
  }


  public OAuth testUrl(String testUrl) {
    this.testUrl = testUrl;
    return this;
  }

   /**
   * Target for the test.
   * @return testUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestUrl() {
    return testUrl;
  }


  @JsonProperty(JSON_PROPERTY_TEST_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestUrl(String testUrl) {
    this.testUrl = testUrl;
  }


  public OAuth requestMethod(RequestMethod requestMethod) {
    this.requestMethod = requestMethod;
    return this;
  }

   /**
   * Get requestMethod
   * @return requestMethod
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RequestMethod getRequestMethod() {
    return requestMethod;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestMethod(RequestMethod requestMethod) {
    this.requestMethod = requestMethod;
  }


  public OAuth postBody(String postBody) {
    this.postBody = postBody;
    return this;
  }

   /**
   * Enter the OAuth body for the HTTP POST request in this field when using OAuth as the authentication mechanism. No special escaping is required. If content is provided in the post body, the &#x60;requestMethod&#x60; is automatically set to POST.
   * @return postBody
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POST_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostBody() {
    return postBody;
  }


  @JsonProperty(JSON_PROPERTY_POST_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostBody(String postBody) {
    this.postBody = postBody;
  }


  public OAuth headers(String headers) {
    this.headers = headers;
    return this;
  }

   /**
   * Request headers used for OAuth.
   * @return headers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeaders() {
    return headers;
  }


  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaders(String headers) {
    this.headers = headers;
  }


  public OAuth authType(TestAuthType authType) {
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

  public TestAuthType getAuthType() {
    return authType;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthType(TestAuthType authType) {
    this.authType = authType;
  }


  public OAuth username(String username) {
    this.username = username;
    return this;
  }

   /**
   * OAuth username
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


  public OAuth password(String password) {
    this.password = password;
    return this;
  }

   /**
   * OAuth password
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


  /**
   * Return true if this OAuth object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth oauth = (OAuth) o;
    return Objects.equals(this.configId, oauth.configId) &&
        Objects.equals(this.testUrl, oauth.testUrl) &&
        Objects.equals(this.requestMethod, oauth.requestMethod) &&
        Objects.equals(this.postBody, oauth.postBody) &&
        Objects.equals(this.headers, oauth.headers) &&
        Objects.equals(this.authType, oauth.authType) &&
        Objects.equals(this.username, oauth.username) &&
        Objects.equals(this.password, oauth.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configId, testUrl, requestMethod, postBody, headers, authType, username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth {\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    testUrl: ").append(toIndentedString(testUrl)).append("\n");
    sb.append("    requestMethod: ").append(toIndentedString(requestMethod)).append("\n");
    sb.append("    postBody: ").append(toIndentedString(postBody)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

