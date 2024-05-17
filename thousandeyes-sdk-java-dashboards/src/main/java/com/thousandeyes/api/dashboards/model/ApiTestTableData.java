/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.dashboards.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.dashboards.model.ApiTestTableGraphletsData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Data shown in a test table widget.
 */
@JsonPropertyOrder({
  ApiTestTableData.JSON_PROPERTY_TEST_ID,
  ApiTestTableData.JSON_PROPERTY_TEST_NAME,
  ApiTestTableData.JSON_PROPERTY_TARGET,
  ApiTestTableData.JSON_PROPERTY_TEST_TYPE,
  ApiTestTableData.JSON_PROPERTY_ALERT_COUNT,
  ApiTestTableData.JSON_PROPERTY_IS_SHARED,
  ApiTestTableData.JSON_PROPERTY_GRAPHLETS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-05-17T09:32:26.521054+01:00[Europe/Lisbon]")
public class ApiTestTableData {
  public static final String JSON_PROPERTY_TEST_ID = "testId";
  private String testId;

  public static final String JSON_PROPERTY_TEST_NAME = "testName";
  private String testName;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TEST_TYPE = "testType";
  private String testType;

  public static final String JSON_PROPERTY_ALERT_COUNT = "alertCount";
  private Long alertCount;

  public static final String JSON_PROPERTY_IS_SHARED = "isShared";
  private Boolean isShared;

  public static final String JSON_PROPERTY_GRAPHLETS = "graphlets";
  private List<ApiTestTableGraphletsData> graphlets;

  public ApiTestTableData() { 
  }

  public ApiTestTableData testId(String testId) {
    this.testId = testId;
    return this;
  }

   /**
   * Identifier of the test.
   * @return testId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestId() {
    return testId;
  }


  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestId(String testId) {
    this.testId = testId;
  }


  public ApiTestTableData testName(String testName) {
    this.testName = testName;
    return this;
  }

   /**
   * Name of the test.
   * @return testName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestName() {
    return testName;
  }


  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestName(String testName) {
    this.testName = testName;
  }


  public ApiTestTableData target(String target) {
    this.target = target;
    return this;
  }

   /**
   * Configured target of the test.
   * @return target
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTarget() {
    return target;
  }


  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTarget(String target) {
    this.target = target;
  }


  public ApiTestTableData testType(String testType) {
    this.testType = testType;
    return this;
  }

   /**
   * Type of the test.
   * @return testType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestType() {
    return testType;
  }


  @JsonProperty(JSON_PROPERTY_TEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestType(String testType) {
    this.testType = testType;
  }


  public ApiTestTableData alertCount(Long alertCount) {
    this.alertCount = alertCount;
    return this;
  }

   /**
   * Number of active alerts of the test.
   * @return alertCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAlertCount() {
    return alertCount;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertCount(Long alertCount) {
    this.alertCount = alertCount;
  }


  public ApiTestTableData isShared(Boolean isShared) {
    this.isShared = isShared;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; if test is shared, &#x60;false&#x60; otherwise.
   * @return isShared
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_SHARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsShared() {
    return isShared;
  }


  @JsonProperty(JSON_PROPERTY_IS_SHARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsShared(Boolean isShared) {
    this.isShared = isShared;
  }


  public ApiTestTableData graphlets(List<ApiTestTableGraphletsData> graphlets) {
    this.graphlets = graphlets;
    return this;
  }

  public ApiTestTableData addItem(ApiTestTableGraphletsData graphletsItem) {
    if (this.graphlets == null) {
      this.graphlets = new ArrayList<>();
    }
    this.graphlets.add(graphletsItem);
    return this;
  }

   /**
   * List of time series points for test metrics in the last 12 hours.
   * @return graphlets
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRAPHLETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiTestTableGraphletsData> getGraphlets() {
    return graphlets;
  }


  @JsonProperty(JSON_PROPERTY_GRAPHLETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGraphlets(List<ApiTestTableGraphletsData> graphlets) {
    this.graphlets = graphlets;
  }


  /**
   * Return true if this ApiTestTableData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiTestTableData apiTestTableData = (ApiTestTableData) o;
    return Objects.equals(this.testId, apiTestTableData.testId) &&
        Objects.equals(this.testName, apiTestTableData.testName) &&
        Objects.equals(this.target, apiTestTableData.target) &&
        Objects.equals(this.testType, apiTestTableData.testType) &&
        Objects.equals(this.alertCount, apiTestTableData.alertCount) &&
        Objects.equals(this.isShared, apiTestTableData.isShared) &&
        Objects.equals(this.graphlets, apiTestTableData.graphlets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testId, testName, target, testType, alertCount, isShared, graphlets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiTestTableData {\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
    sb.append("    alertCount: ").append(toIndentedString(alertCount)).append("\n");
    sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
    sb.append("    graphlets: ").append(toIndentedString(graphlets)).append("\n");
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

