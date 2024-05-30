/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.6
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
 * Hop
 */
@JsonPropertyOrder({
  Hop.JSON_PROPERTY_HOP,
  Hop.JSON_PROPERTY_IP_ADDRESS,
  Hop.JSON_PROPERTY_PREFIX
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class Hop {
  public static final String JSON_PROPERTY_HOP = "hop";
  private Integer hop;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private String ipAddress;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public Hop() { 
  }

  @JsonCreator
  public Hop(
    @JsonProperty(JSON_PROPERTY_HOP) Integer hop, 
    @JsonProperty(JSON_PROPERTY_IP_ADDRESS) String ipAddress, 
    @JsonProperty(JSON_PROPERTY_PREFIX) String prefix
  ) {
  this();
    this.hop = hop;
    this.ipAddress = ipAddress;
    this.prefix = prefix;
  }

   /**
   * The hop index.
   * @return hop
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHop() {
    return hop;
  }




   /**
   * IP address of the hop.
   * @return ipAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpAddress() {
    return ipAddress;
  }




   /**
   * Prefix of IP address shown in CIDR.
   * @return prefix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrefix() {
    return prefix;
  }




  /**
   * Return true if this Hop object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hop hop = (Hop) o;
    return Objects.equals(this.hop, hop.hop) &&
        Objects.equals(this.ipAddress, hop.ipAddress) &&
        Objects.equals(this.prefix, hop.prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hop, ipAddress, prefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hop {\n");
    sb.append("    hop: ").append(toIndentedString(hop)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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

