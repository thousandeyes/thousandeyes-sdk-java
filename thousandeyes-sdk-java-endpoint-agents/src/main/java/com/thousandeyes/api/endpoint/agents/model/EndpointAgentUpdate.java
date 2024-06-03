/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.   For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).
 *
 * The version of the OpenAPI document: 7.0.6
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
import com.thousandeyes.api.endpoint.agents.model.AgentLicenseType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The &#x60;EndpointAgentUpdate&#x60; object contains supported fields for updates.
 */
@JsonPropertyOrder({
  EndpointAgentUpdate.JSON_PROPERTY_NAME,
  EndpointAgentUpdate.JSON_PROPERTY_LICENSE_TYPE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EndpointAgentUpdate {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_LICENSE_TYPE = "licenseType";
  private AgentLicenseType licenseType;

  public EndpointAgentUpdate() { 
  }

  public EndpointAgentUpdate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * New agent name.
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


  public EndpointAgentUpdate licenseType(AgentLicenseType licenseType) {
    this.licenseType = licenseType;
    return this;
  }

   /**
   * Get licenseType
   * @return licenseType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LICENSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AgentLicenseType getLicenseType() {
    return licenseType;
  }


  @JsonProperty(JSON_PROPERTY_LICENSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLicenseType(AgentLicenseType licenseType) {
    this.licenseType = licenseType;
  }


  /**
   * Return true if this EndpointAgentUpdate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgentUpdate endpointAgentUpdate = (EndpointAgentUpdate) o;
    return Objects.equals(this.name, endpointAgentUpdate.name) &&
        Objects.equals(this.licenseType, endpointAgentUpdate.licenseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, licenseType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgentUpdate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
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

