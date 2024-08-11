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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TracerouteHop
 */
@JsonPropertyOrder({
  TracerouteHop.JSON_PROPERTY_HOP,
  TracerouteHop.JSON_PROPERTY_IP_ADDRESS,
  TracerouteHop.JSON_PROPERTY_PREFIX,
  TracerouteHop.JSON_PROPERTY_ASN,
  TracerouteHop.JSON_PROPERTY_DELAY,
  TracerouteHop.JSON_PROPERTY_MPLS,
  TracerouteHop.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class TracerouteHop {
  public static final String JSON_PROPERTY_HOP = "hop";
  private Integer hop;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private String ipAddress;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_ASN = "asn";
  private Integer asn;

  public static final String JSON_PROPERTY_DELAY = "delay";
  private Integer delay;

  public static final String JSON_PROPERTY_MPLS = "mpls";
  private List<String> mpls = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public TracerouteHop() { 
  }

  @JsonCreator
  public TracerouteHop(
    @JsonProperty(JSON_PROPERTY_HOP) Integer hop, 
    @JsonProperty(JSON_PROPERTY_IP_ADDRESS) String ipAddress, 
    @JsonProperty(JSON_PROPERTY_PREFIX) String prefix, 
    @JsonProperty(JSON_PROPERTY_ASN) Integer asn, 
    @JsonProperty(JSON_PROPERTY_DELAY) Integer delay, 
    @JsonProperty(JSON_PROPERTY_MPLS) List<String> mpls, 
    @JsonProperty(JSON_PROPERTY_NAME) String name
  ) {
  this();
    this.hop = hop;
    this.ipAddress = ipAddress;
    this.prefix = prefix;
    this.asn = asn;
    this.delay = delay;
    this.mpls = mpls;
    this.name = name;
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
   * Unique number assigned to an organization (also referred to as service provider).
   * @return asn
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAsn() {
    return asn;
  }




   /**
   * Hop delay
   * @return delay
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDelay() {
    return delay;
  }




   /**
   * Hop Multiprotocol Label Switching.
   * @return mpls
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MPLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMpls() {
    return mpls;
  }




   /**
   * The hop name.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }




  /**
   * Return true if this TracerouteHop object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TracerouteHop tracerouteHop = (TracerouteHop) o;
    return Objects.equals(this.hop, tracerouteHop.hop) &&
        Objects.equals(this.ipAddress, tracerouteHop.ipAddress) &&
        Objects.equals(this.prefix, tracerouteHop.prefix) &&
        Objects.equals(this.asn, tracerouteHop.asn) &&
        Objects.equals(this.delay, tracerouteHop.delay) &&
        Objects.equals(this.mpls, tracerouteHop.mpls) &&
        Objects.equals(this.name, tracerouteHop.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hop, ipAddress, prefix, asn, delay, mpls, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TracerouteHop {\n");
    sb.append("    hop: ").append(toIndentedString(hop)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    mpls: ").append(toIndentedString(mpls)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

