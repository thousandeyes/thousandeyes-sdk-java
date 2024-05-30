/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.6
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
import com.thousandeyes.api.dashboards.model.ApiGraphletPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Information displayed within a mini-graph associated with a specific test in a table.
 */
@JsonPropertyOrder({
  ApiTestTableGraphletsData.JSON_PROPERTY_METRIC,
  ApiTestTableGraphletsData.JSON_PROPERTY_TEST_ID,
  ApiTestTableGraphletsData.JSON_PROPERTY_POINTS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiTestTableGraphletsData {
  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_TEST_ID = "testId";
  private String testId;

  public static final String JSON_PROPERTY_POINTS = "points";
  private List<ApiGraphletPoint> points = new ArrayList<>();

  public ApiTestTableGraphletsData() { 
  }

  public ApiTestTableGraphletsData metric(String metric) {
    this.metric = metric;
    return this;
  }

   /**
   * Name of the metric.
   * @return metric
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMetric() {
    return metric;
  }


  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetric(String metric) {
    this.metric = metric;
  }


  public ApiTestTableGraphletsData testId(String testId) {
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


  public ApiTestTableGraphletsData points(List<ApiGraphletPoint> points) {
    this.points = points;
    return this;
  }

  public ApiTestTableGraphletsData addPointsItem(ApiGraphletPoint pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<>();
    }
    this.points.add(pointsItem);
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiGraphletPoint> getPoints() {
    return points;
  }


  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPoints(List<ApiGraphletPoint> points) {
    this.points = points;
  }


  /**
   * Return true if this ApiTestTableGraphletsData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiTestTableGraphletsData apiTestTableGraphletsData = (ApiTestTableGraphletsData) o;
    return Objects.equals(this.metric, apiTestTableGraphletsData.metric) &&
        Objects.equals(this.testId, apiTestTableGraphletsData.testId) &&
        Objects.equals(this.points, apiTestTableGraphletsData.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, testId, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiTestTableGraphletsData {\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

