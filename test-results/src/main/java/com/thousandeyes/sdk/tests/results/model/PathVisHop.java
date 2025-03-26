/*
 * Test Results API
 * Get test result metrics for Network and Application Synthetics tests.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.results.model;

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
 * PathVisHop
 */
@JsonPropertyOrder({
  PathVisHop.JSON_PROPERTY_HOP,
  PathVisHop.JSON_PROPERTY_IP_ADDRESS,
  PathVisHop.JSON_PROPERTY_PREFIX,
  PathVisHop.JSON_PROPERTY_RDNS,
  PathVisHop.JSON_PROPERTY_NETWORK,
  PathVisHop.JSON_PROPERTY_RESPONSE_TIME,
  PathVisHop.JSON_PROPERTY_LOCATION,
  PathVisHop.JSON_PROPERTY_MPLS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class PathVisHop {
  public static final String JSON_PROPERTY_HOP = "hop";
  private Integer hop;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private String ipAddress;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_RDNS = "rdns";
  private String rdns;

  public static final String JSON_PROPERTY_NETWORK = "network";
  private String network;

  public static final String JSON_PROPERTY_RESPONSE_TIME = "responseTime";
  private Integer responseTime;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_MPLS = "mpls";
  private String mpls;

  public PathVisHop() { 
  }

  @JsonCreator
  public PathVisHop(
    @JsonProperty(JSON_PROPERTY_HOP) Integer hop, 
    @JsonProperty(JSON_PROPERTY_IP_ADDRESS) String ipAddress, 
    @JsonProperty(JSON_PROPERTY_PREFIX) String prefix, 
    @JsonProperty(JSON_PROPERTY_RDNS) String rdns, 
    @JsonProperty(JSON_PROPERTY_NETWORK) String network, 
    @JsonProperty(JSON_PROPERTY_RESPONSE_TIME) Integer responseTime, 
    @JsonProperty(JSON_PROPERTY_LOCATION) String location, 
    @JsonProperty(JSON_PROPERTY_MPLS) String mpls
  ) {
  this();
    this.hop = hop;
    this.ipAddress = ipAddress;
    this.prefix = prefix;
    this.rdns = rdns;
    this.network = network;
    this.responseTime = responseTime;
    this.location = location;
    this.mpls = mpls;
  }

   /**
   * Hop index
   * @return hop
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHop() {
    return hop;
  }




   /**
   * IP address of the hop
   * @return ipAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpAddress() {
    return ipAddress;
  }




   /**
   * Prefix of IP address shown in CIDR
   * @return prefix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrefix() {
    return prefix;
  }




   /**
   * Reverse DNS entry of IP, if available
   * @return rdns
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RDNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRdns() {
    return rdns;
  }




   /**
   * Autonomous System originating the prefix
   * @return network
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetwork() {
    return network;
  }




   /**
   * RTT to the hop’s IP in milliseconds
   * @return responseTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResponseTime() {
    return responseTime;
  }




   /**
   * Location information for the hop
   * @return location
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocation() {
    return location;
  }




   /**
   * Multiprotocol Label Switching information, if available
   * @return mpls
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MPLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMpls() {
    return mpls;
  }




  /**
   * Return true if this PathVisHop object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathVisHop pathVisHop = (PathVisHop) o;
    return Objects.equals(this.hop, pathVisHop.hop) &&
        Objects.equals(this.ipAddress, pathVisHop.ipAddress) &&
        Objects.equals(this.prefix, pathVisHop.prefix) &&
        Objects.equals(this.rdns, pathVisHop.rdns) &&
        Objects.equals(this.network, pathVisHop.network) &&
        Objects.equals(this.responseTime, pathVisHop.responseTime) &&
        Objects.equals(this.location, pathVisHop.location) &&
        Objects.equals(this.mpls, pathVisHop.mpls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hop, ipAddress, prefix, rdns, network, responseTime, location, mpls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathVisHop {\n");
    sb.append("    hop: ").append(toIndentedString(hop)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    rdns: ").append(toIndentedString(rdns)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    mpls: ").append(toIndentedString(mpls)).append("\n");
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

