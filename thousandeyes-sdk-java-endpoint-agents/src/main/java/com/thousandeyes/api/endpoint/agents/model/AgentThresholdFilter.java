/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.   For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.agents.model.ThresholdFilterOperator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The metric is filtered based on the threshold value and operator provided.
 */
@JsonPropertyOrder({
  AgentThresholdFilter.JSON_PROPERTY_NAME,
  AgentThresholdFilter.JSON_PROPERTY_VALUE,
  AgentThresholdFilter.JSON_PROPERTY_OPERATOR
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T17:12:31.591476+01:00[Europe/Lisbon]")
public class AgentThresholdFilter {
  /**
   * Gets or Sets name
   */
  public enum NameEnum {
    LAST_SEEN_MS("last-seen-ms");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_NAME = "name";
  private NameEnum name;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private ThresholdFilterOperator operator;

  public AgentThresholdFilter() { 
  }

  public AgentThresholdFilter name(NameEnum name) {
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

  public NameEnum getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(NameEnum name) {
    this.name = name;
  }


  public AgentThresholdFilter value(Double value) {
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


  public AgentThresholdFilter operator(ThresholdFilterOperator operator) {
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
   * Return true if this AgentThresholdFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentThresholdFilter agentThresholdFilter = (AgentThresholdFilter) o;
    return Objects.equals(this.name, agentThresholdFilter.name) &&
        Objects.equals(this.value, agentThresholdFilter.value) &&
        Objects.equals(this.operator, agentThresholdFilter.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentThresholdFilter {\n");
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

