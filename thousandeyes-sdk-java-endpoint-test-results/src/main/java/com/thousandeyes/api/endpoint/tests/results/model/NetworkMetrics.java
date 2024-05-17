/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.4
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
 * NetworkMetrics
 */
@JsonPropertyOrder({
  NetworkMetrics.JSON_PROPERTY_JITTER,
  NetworkMetrics.JSON_PROPERTY_LATENCY,
  NetworkMetrics.JSON_PROPERTY_LOSS,
  NetworkMetrics.JSON_PROPERTY_TARGET
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-05-17T09:32:26.589642+01:00[Europe/Lisbon]")
public class NetworkMetrics {
  public static final String JSON_PROPERTY_JITTER = "jitter";
  private Integer jitter;

  public static final String JSON_PROPERTY_LATENCY = "latency";
  private Integer latency;

  public static final String JSON_PROPERTY_LOSS = "loss";
  private Double loss;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public NetworkMetrics() { 
  }

  @JsonCreator
  public NetworkMetrics(
    @JsonProperty(JSON_PROPERTY_JITTER) Integer jitter, 
    @JsonProperty(JSON_PROPERTY_LATENCY) Integer latency, 
    @JsonProperty(JSON_PROPERTY_LOSS) Double loss, 
    @JsonProperty(JSON_PROPERTY_TARGET) String target
  ) {
  this();
    this.jitter = jitter;
    this.latency = latency;
    this.loss = loss;
    this.target = target;
  }

   /**
   * Network jitter.
   * @return jitter
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JITTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getJitter() {
    return jitter;
  }




   /**
   * Network latency.
   * @return latency
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLatency() {
    return latency;
  }




   /**
   * Network loss.
   * @return loss
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLoss() {
    return loss;
  }




   /**
   * Network target IP address.
   * @return target
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTarget() {
    return target;
  }




  /**
   * Return true if this NetworkMetrics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkMetrics networkMetrics = (NetworkMetrics) o;
    return Objects.equals(this.jitter, networkMetrics.jitter) &&
        Objects.equals(this.latency, networkMetrics.latency) &&
        Objects.equals(this.loss, networkMetrics.loss) &&
        Objects.equals(this.target, networkMetrics.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jitter, latency, loss, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkMetrics {\n");
    sb.append("    jitter: ").append(toIndentedString(jitter)).append("\n");
    sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
    sb.append("    loss: ").append(toIndentedString(loss)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

