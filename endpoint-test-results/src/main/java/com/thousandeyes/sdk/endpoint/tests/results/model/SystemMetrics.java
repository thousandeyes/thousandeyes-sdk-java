/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.11
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
import com.thousandeyes.sdk.endpoint.tests.results.model.CpuUtilization;
import com.thousandeyes.sdk.endpoint.tests.results.model.PhysicalMemoryUsedBytes;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SystemMetrics
 */
@JsonPropertyOrder({
  SystemMetrics.JSON_PROPERTY_START_TIME_MS,
  SystemMetrics.JSON_PROPERTY_END_TIME_MS,
  SystemMetrics.JSON_PROPERTY_CPU_UTILIZATION,
  SystemMetrics.JSON_PROPERTY_PHYSICAL_MEMORY_USED_BYTES,
  SystemMetrics.JSON_PROPERTY_PHYSICAL_MEMORY_TOTAL_BYTES
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class SystemMetrics {
  public static final String JSON_PROPERTY_START_TIME_MS = "startTimeMs";
  private Long startTimeMs;

  public static final String JSON_PROPERTY_END_TIME_MS = "endTimeMs";
  private Long endTimeMs;

  public static final String JSON_PROPERTY_CPU_UTILIZATION = "cpuUtilization";
  private CpuUtilization cpuUtilization;

  public static final String JSON_PROPERTY_PHYSICAL_MEMORY_USED_BYTES = "physicalMemoryUsedBytes";
  private PhysicalMemoryUsedBytes physicalMemoryUsedBytes;

  public static final String JSON_PROPERTY_PHYSICAL_MEMORY_TOTAL_BYTES = "physicalMemoryTotalBytes";
  private Long physicalMemoryTotalBytes;

  public SystemMetrics() { 
  }

  @JsonCreator
  public SystemMetrics(
    @JsonProperty(JSON_PROPERTY_START_TIME_MS) Long startTimeMs, 
    @JsonProperty(JSON_PROPERTY_END_TIME_MS) Long endTimeMs, 
    @JsonProperty(JSON_PROPERTY_PHYSICAL_MEMORY_TOTAL_BYTES) Long physicalMemoryTotalBytes
  ) {
  this();
    this.startTimeMs = startTimeMs;
    this.endTimeMs = endTimeMs;
    this.physicalMemoryTotalBytes = physicalMemoryTotalBytes;
  }

   /**
   * The start time of metrics collection, expressed in milliseconds since the Epoch.
   * @return startTimeMs
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStartTimeMs() {
    return startTimeMs;
  }




   /**
   * The end time of metrics collection, expressed in milliseconds since the Epoch.
   * @return endTimeMs
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TIME_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEndTimeMs() {
    return endTimeMs;
  }




  public SystemMetrics cpuUtilization(CpuUtilization cpuUtilization) {
    this.cpuUtilization = cpuUtilization;
    return this;
  }

   /**
   * Get cpuUtilization
   * @return cpuUtilization
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CPU_UTILIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CpuUtilization getCpuUtilization() {
    return cpuUtilization;
  }


  @JsonProperty(JSON_PROPERTY_CPU_UTILIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpuUtilization(CpuUtilization cpuUtilization) {
    this.cpuUtilization = cpuUtilization;
  }


  public SystemMetrics physicalMemoryUsedBytes(PhysicalMemoryUsedBytes physicalMemoryUsedBytes) {
    this.physicalMemoryUsedBytes = physicalMemoryUsedBytes;
    return this;
  }

   /**
   * Get physicalMemoryUsedBytes
   * @return physicalMemoryUsedBytes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHYSICAL_MEMORY_USED_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PhysicalMemoryUsedBytes getPhysicalMemoryUsedBytes() {
    return physicalMemoryUsedBytes;
  }


  @JsonProperty(JSON_PROPERTY_PHYSICAL_MEMORY_USED_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhysicalMemoryUsedBytes(PhysicalMemoryUsedBytes physicalMemoryUsedBytes) {
    this.physicalMemoryUsedBytes = physicalMemoryUsedBytes;
  }


   /**
   * Total physical memory of the system.
   * @return physicalMemoryTotalBytes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHYSICAL_MEMORY_TOTAL_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPhysicalMemoryTotalBytes() {
    return physicalMemoryTotalBytes;
  }




  /**
   * Return true if this SystemMetrics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemMetrics systemMetrics = (SystemMetrics) o;
    return Objects.equals(this.startTimeMs, systemMetrics.startTimeMs) &&
        Objects.equals(this.endTimeMs, systemMetrics.endTimeMs) &&
        Objects.equals(this.cpuUtilization, systemMetrics.cpuUtilization) &&
        Objects.equals(this.physicalMemoryUsedBytes, systemMetrics.physicalMemoryUsedBytes) &&
        Objects.equals(this.physicalMemoryTotalBytes, systemMetrics.physicalMemoryTotalBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTimeMs, endTimeMs, cpuUtilization, physicalMemoryUsedBytes, physicalMemoryTotalBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemMetrics {\n");
    sb.append("    startTimeMs: ").append(toIndentedString(startTimeMs)).append("\n");
    sb.append("    endTimeMs: ").append(toIndentedString(endTimeMs)).append("\n");
    sb.append("    cpuUtilization: ").append(toIndentedString(cpuUtilization)).append("\n");
    sb.append("    physicalMemoryUsedBytes: ").append(toIndentedString(physicalMemoryUsedBytes)).append("\n");
    sb.append("    physicalMemoryTotalBytes: ").append(toIndentedString(physicalMemoryTotalBytes)).append("\n");
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

