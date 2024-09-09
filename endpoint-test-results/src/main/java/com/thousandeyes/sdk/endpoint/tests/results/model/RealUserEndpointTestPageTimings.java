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
 * RealUserEndpointTestPageTimings
 */
@JsonPropertyOrder({
  RealUserEndpointTestPageTimings.JSON_PROPERTY_ON_CONTENT_LOAD,
  RealUserEndpointTestPageTimings.JSON_PROPERTY_ON_LOAD
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class RealUserEndpointTestPageTimings {
  public static final String JSON_PROPERTY_ON_CONTENT_LOAD = "onContentLoad";
  private Integer onContentLoad;

  public static final String JSON_PROPERTY_ON_LOAD = "onLoad";
  private Integer onLoad;

  public RealUserEndpointTestPageTimings() { 
  }

  @JsonCreator
  public RealUserEndpointTestPageTimings(
    @JsonProperty(JSON_PROPERTY_ON_CONTENT_LOAD) Integer onContentLoad, 
    @JsonProperty(JSON_PROPERTY_ON_LOAD) Integer onLoad
  ) {
  this();
    this.onContentLoad = onContentLoad;
    this.onLoad = onLoad;
  }

   /**
   * DOM load time in milliseconds.
   * @return onContentLoad
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_CONTENT_LOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOnContentLoad() {
    return onContentLoad;
  }




   /**
   * Page load time in milliseconds.
   * @return onLoad
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_LOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOnLoad() {
    return onLoad;
  }




  /**
   * Return true if this RealUserEndpointTestPageTimings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealUserEndpointTestPageTimings realUserEndpointTestPageTimings = (RealUserEndpointTestPageTimings) o;
    return Objects.equals(this.onContentLoad, realUserEndpointTestPageTimings.onContentLoad) &&
        Objects.equals(this.onLoad, realUserEndpointTestPageTimings.onLoad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onContentLoad, onLoad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealUserEndpointTestPageTimings {\n");
    sb.append("    onContentLoad: ").append(toIndentedString(onContentLoad)).append("\n");
    sb.append("    onLoad: ").append(toIndentedString(onLoad)).append("\n");
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

