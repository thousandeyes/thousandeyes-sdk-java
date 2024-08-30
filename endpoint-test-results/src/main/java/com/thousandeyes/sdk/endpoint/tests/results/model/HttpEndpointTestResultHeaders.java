/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Expandable object containing both request and response headers.
 */
@JsonPropertyOrder({
  HttpEndpointTestResultHeaders.JSON_PROPERTY_REQUEST_HEADERS,
  HttpEndpointTestResultHeaders.JSON_PROPERTY_RESPONSE_HEADERS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class HttpEndpointTestResultHeaders {
  public static final String JSON_PROPERTY_REQUEST_HEADERS = "requestHeaders";
  private String requestHeaders;

  public static final String JSON_PROPERTY_RESPONSE_HEADERS = "responseHeaders";
  private String responseHeaders;

  public HttpEndpointTestResultHeaders() { 
  }

  @JsonCreator
  public HttpEndpointTestResultHeaders(
    @JsonProperty(JSON_PROPERTY_REQUEST_HEADERS) String requestHeaders, 
    @JsonProperty(JSON_PROPERTY_RESPONSE_HEADERS) String responseHeaders
  ) {
  this();
    this.requestHeaders = requestHeaders;
    this.responseHeaders = responseHeaders;
  }

   /**
   * CRLF-delimited list of request headers in &#x60;header: value&#x60; format.
   * @return requestHeaders
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestHeaders() {
    return requestHeaders;
  }




   /**
   * CRLF-delimited list of response headers in &#x60;header: value&#x60; format.
   * @return responseHeaders
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResponseHeaders() {
    return responseHeaders;
  }




  /**
   * Return true if this HttpEndpointTestResultHeaders object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpEndpointTestResultHeaders httpEndpointTestResultHeaders = (HttpEndpointTestResultHeaders) o;
    return Objects.equals(this.requestHeaders, httpEndpointTestResultHeaders.requestHeaders) &&
        Objects.equals(this.responseHeaders, httpEndpointTestResultHeaders.responseHeaders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeaders, responseHeaders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpEndpointTestResultHeaders {\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
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
