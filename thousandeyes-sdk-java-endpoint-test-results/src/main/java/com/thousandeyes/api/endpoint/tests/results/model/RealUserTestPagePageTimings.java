/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.results.model;

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
 * RealUserTestPagePageTimings
 */
@JsonPropertyOrder({
  RealUserTestPagePageTimings.JSON_PROPERTY_ON_CONTENT_LOAD,
  RealUserTestPagePageTimings.JSON_PROPERTY_ON_LOAD
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-30T10:06:13.283389+01:00[Europe/Lisbon]")
public class RealUserTestPagePageTimings {
  public static final String JSON_PROPERTY_ON_CONTENT_LOAD = "onContentLoad";
  private Integer onContentLoad;

  public static final String JSON_PROPERTY_ON_LOAD = "onLoad";
  private Integer onLoad;

  public RealUserTestPagePageTimings() { 
  }

  @JsonCreator
  public RealUserTestPagePageTimings(
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
   * Return true if this RealUserTestPage_pageTimings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealUserTestPagePageTimings realUserTestPagePageTimings = (RealUserTestPagePageTimings) o;
    return Objects.equals(this.onContentLoad, realUserTestPagePageTimings.onContentLoad) &&
        Objects.equals(this.onLoad, realUserTestPagePageTimings.onLoad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onContentLoad, onLoad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealUserTestPagePageTimings {\n");
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

