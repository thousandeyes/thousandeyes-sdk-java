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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CpuUtilization
 */
@JsonPropertyOrder({
  CpuUtilization.JSON_PROPERTY_MIN,
  CpuUtilization.JSON_PROPERTY_MAX,
  CpuUtilization.JSON_PROPERTY_MEAN,
  CpuUtilization.JSON_PROPERTY_MEDIAN,
  CpuUtilization.JSON_PROPERTY_STD_DEV,
  CpuUtilization.JSON_PROPERTY_COUNT
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-30T10:06:13.283389+01:00[Europe/Lisbon]")
public class CpuUtilization {
  public static final String JSON_PROPERTY_MIN = "min";
  private Double min;

  public static final String JSON_PROPERTY_MAX = "max";
  private Double max;

  public static final String JSON_PROPERTY_MEAN = "mean";
  private Double mean;

  public static final String JSON_PROPERTY_MEDIAN = "median";
  private Double median;

  public static final String JSON_PROPERTY_STD_DEV = "stdDev";
  private Double stdDev;

  public static final String JSON_PROPERTY_COUNT = "count";
  private BigDecimal count;

  public CpuUtilization() { 
  }

  @JsonCreator
  public CpuUtilization(
    @JsonProperty(JSON_PROPERTY_MIN) Double min, 
    @JsonProperty(JSON_PROPERTY_MAX) Double max, 
    @JsonProperty(JSON_PROPERTY_MEAN) Double mean, 
    @JsonProperty(JSON_PROPERTY_MEDIAN) Double median, 
    @JsonProperty(JSON_PROPERTY_STD_DEV) Double stdDev, 
    @JsonProperty(JSON_PROPERTY_COUNT) BigDecimal count
  ) {
  this();
    this.min = min;
    this.max = max;
    this.mean = mean;
    this.median = median;
    this.stdDev = stdDev;
    this.count = count;
  }

   /**
   * The minimum sampled usage value recorded during the monitored period.
   * minimum: 0.0
   * maximum: 1.0
   * @return min
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMin() {
    return min;
  }




   /**
   * The maximum sampled usage value recorded during the monitored period.
   * minimum: 0.0
   * maximum: 1.0
   * @return max
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMax() {
    return max;
  }




   /**
   * The mean (average) sampled usage value recorded during the monitored period.
   * minimum: 0.0
   * maximum: 1.0
   * @return mean
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMean() {
    return mean;
  }




   /**
   * The median sampled usage value recorded during the monitored period.
   * minimum: 0.0
   * maximum: 1.0
   * @return median
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEDIAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMedian() {
    return median;
  }




   /**
   * The standard deviation of sampled usage values recorded during the monitored period.
   * minimum: 0.0
   * maximum: 1.0
   * @return stdDev
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STD_DEV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getStdDev() {
    return stdDev;
  }




   /**
   * The total number of samples collected during the monitored period.
   * @return count
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCount() {
    return count;
  }




  /**
   * Return true if this CpuUtilization object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CpuUtilization cpuUtilization = (CpuUtilization) o;
    return Objects.equals(this.min, cpuUtilization.min) &&
        Objects.equals(this.max, cpuUtilization.max) &&
        Objects.equals(this.mean, cpuUtilization.mean) &&
        Objects.equals(this.median, cpuUtilization.median) &&
        Objects.equals(this.stdDev, cpuUtilization.stdDev) &&
        Objects.equals(this.count, cpuUtilization.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, mean, median, stdDev, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CpuUtilization {\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    stdDev: ").append(toIndentedString(stdDev)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

