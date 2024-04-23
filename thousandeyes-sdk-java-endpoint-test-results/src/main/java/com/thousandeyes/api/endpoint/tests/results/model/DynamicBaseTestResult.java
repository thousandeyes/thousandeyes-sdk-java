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
import com.thousandeyes.api.endpoint.tests.results.model.DynamicBaseTestResultWebex;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DynamicBaseTestResult
 */
@JsonPropertyOrder({
  DynamicBaseTestResult.JSON_PROPERTY_APPLICATION,
  DynamicBaseTestResult.JSON_PROPERTY_WEBEX
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T16:57:45.229088+01:00[Europe/Lisbon]")
public class DynamicBaseTestResult {
  public static final String JSON_PROPERTY_APPLICATION = "application";
  private String application;

  public static final String JSON_PROPERTY_WEBEX = "webex";
  private DynamicBaseTestResultWebex webex;

  public DynamicBaseTestResult() { 
  }

  public DynamicBaseTestResult application(String application) {
    this.application = application;
    return this;
  }

   /**
   * Which supported application to monitor, can be one of &#x60;webex&#x60;, &#x60;zoom&#x60;, &#x60;microsoft-teams&#x60;.
   * @return application
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApplication() {
    return application;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplication(String application) {
    this.application = application;
  }


  public DynamicBaseTestResult webex(DynamicBaseTestResultWebex webex) {
    this.webex = webex;
    return this;
  }

   /**
   * Get webex
   * @return webex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DynamicBaseTestResultWebex getWebex() {
    return webex;
  }


  @JsonProperty(JSON_PROPERTY_WEBEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebex(DynamicBaseTestResultWebex webex) {
    this.webex = webex;
  }


  /**
   * Return true if this DynamicBaseTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicBaseTestResult dynamicBaseTestResult = (DynamicBaseTestResult) o;
    return Objects.equals(this.application, dynamicBaseTestResult.application) &&
        Objects.equals(this.webex, dynamicBaseTestResult.webex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, webex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicBaseTestResult {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    webex: ").append(toIndentedString(webex)).append("\n");
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

