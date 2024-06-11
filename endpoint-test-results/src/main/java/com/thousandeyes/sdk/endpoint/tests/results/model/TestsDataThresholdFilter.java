/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.7
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
import com.thousandeyes.sdk.endpoint.tests.results.model.ThresholdFilterName;
import com.thousandeyes.sdk.endpoint.tests.results.model.ThresholdFilterOperator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The metric is filtered based on the threshold value and operator provided.
 */
@JsonPropertyOrder({
  TestsDataThresholdFilter.JSON_PROPERTY_NAME,
  TestsDataThresholdFilter.JSON_PROPERTY_VALUE,
  TestsDataThresholdFilter.JSON_PROPERTY_OPERATOR
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class TestsDataThresholdFilter {
  public static final String JSON_PROPERTY_NAME = "name";
  private ThresholdFilterName name;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private ThresholdFilterOperator operator;

  public TestsDataThresholdFilter() { 
  }

  public TestsDataThresholdFilter name(ThresholdFilterName name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ThresholdFilterName getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(ThresholdFilterName name) {
    this.name = name;
  }


  public TestsDataThresholdFilter value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * The threshold value.
   * @return value
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Double value) {
    this.value = value;
  }


  public TestsDataThresholdFilter operator(ThresholdFilterOperator operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ThresholdFilterOperator getOperator() {
    return operator;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperator(ThresholdFilterOperator operator) {
    this.operator = operator;
  }


  /**
   * Return true if this TestsDataThresholdFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestsDataThresholdFilter testsDataThresholdFilter = (TestsDataThresholdFilter) o;
    return Objects.equals(this.name, testsDataThresholdFilter.name) &&
        Objects.equals(this.value, testsDataThresholdFilter.value) &&
        Objects.equals(this.operator, testsDataThresholdFilter.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestsDataThresholdFilter {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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

