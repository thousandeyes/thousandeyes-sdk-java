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
 * ProcessMetrics
 */
@JsonPropertyOrder({
  ProcessMetrics.JSON_PROPERTY_NAME,
  ProcessMetrics.JSON_PROPERTY_PID,
  ProcessMetrics.JSON_PROPERTY_CPU,
  ProcessMetrics.JSON_PROPERTY_MEMORY_PERCENTAGE,
  ProcessMetrics.JSON_PROPERTY_MEMORY_BYTES
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ProcessMetrics {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PID = "pid";
  private Integer pid;

  public static final String JSON_PROPERTY_CPU = "cpu";
  private Double cpu;

  public static final String JSON_PROPERTY_MEMORY_PERCENTAGE = "memoryPercentage";
  private Double memoryPercentage;

  public static final String JSON_PROPERTY_MEMORY_BYTES = "memoryBytes";
  private Long memoryBytes;

  public ProcessMetrics() { 
  }

  public ProcessMetrics name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the process.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ProcessMetrics pid(Integer pid) {
    this.pid = pid;
    return this;
  }

   /**
   * The process ID.
   * @return pid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPid() {
    return pid;
  }


  @JsonProperty(JSON_PROPERTY_PID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPid(Integer pid) {
    this.pid = pid;
  }


  public ProcessMetrics cpu(Double cpu) {
    this.cpu = cpu;
    return this;
  }

   /**
   * The CPU usage by the process as a percentage (e.g., 0.5 for 50% CPU usage).
   * @return cpu
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CPU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCpu() {
    return cpu;
  }


  @JsonProperty(JSON_PROPERTY_CPU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpu(Double cpu) {
    this.cpu = cpu;
  }


  public ProcessMetrics memoryPercentage(Double memoryPercentage) {
    this.memoryPercentage = memoryPercentage;
    return this;
  }

   /**
   * The memory usage by the process as a percentage (e.g., 0.22 for 22%).
   * @return memoryPercentage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMORY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMemoryPercentage() {
    return memoryPercentage;
  }


  @JsonProperty(JSON_PROPERTY_MEMORY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemoryPercentage(Double memoryPercentage) {
    this.memoryPercentage = memoryPercentage;
  }


  public ProcessMetrics memoryBytes(Long memoryBytes) {
    this.memoryBytes = memoryBytes;
    return this;
  }

   /**
   * The memory usage by the process in bytes.
   * @return memoryBytes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMORY_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMemoryBytes() {
    return memoryBytes;
  }


  @JsonProperty(JSON_PROPERTY_MEMORY_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemoryBytes(Long memoryBytes) {
    this.memoryBytes = memoryBytes;
  }


  /**
   * Return true if this ProcessMetrics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessMetrics processMetrics = (ProcessMetrics) o;
    return Objects.equals(this.name, processMetrics.name) &&
        Objects.equals(this.pid, processMetrics.pid) &&
        Objects.equals(this.cpu, processMetrics.cpu) &&
        Objects.equals(this.memoryPercentage, processMetrics.memoryPercentage) &&
        Objects.equals(this.memoryBytes, processMetrics.memoryBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pid, cpu, memoryPercentage, memoryBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessMetrics {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    memoryPercentage: ").append(toIndentedString(memoryPercentage)).append("\n");
    sb.append("    memoryBytes: ").append(toIndentedString(memoryBytes)).append("\n");
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
