/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.dashboards.model;

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
 * IP information of the agent.
 */
@JsonPropertyOrder({
  ApiAgentStatusIpInfo.JSON_PROPERTY_PUBLIC_IP,
  ApiAgentStatusIpInfo.JSON_PROPERTY_PRIVATE_IP,
  ApiAgentStatusIpInfo.JSON_PROPERTY_IPV6,
  ApiAgentStatusIpInfo.JSON_PROPERTY_OPERATIVE_SYSTEM_VERSION
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-30T10:06:13.271495+01:00[Europe/Lisbon]")
public class ApiAgentStatusIpInfo {
  public static final String JSON_PROPERTY_PUBLIC_IP = "publicIp";
  private String publicIp;

  public static final String JSON_PROPERTY_PRIVATE_IP = "privateIp";
  private String privateIp;

  public static final String JSON_PROPERTY_IPV6 = "ipv6";
  private String ipv6;

  public static final String JSON_PROPERTY_OPERATIVE_SYSTEM_VERSION = "operativeSystemVersion";
  private String operativeSystemVersion;

  public ApiAgentStatusIpInfo() { 
  }

  public ApiAgentStatusIpInfo publicIp(String publicIp) {
    this.publicIp = publicIp;
    return this;
  }

   /**
   * Public IP of the agent.
   * @return publicIp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicIp() {
    return publicIp;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicIp(String publicIp) {
    this.publicIp = publicIp;
  }


  public ApiAgentStatusIpInfo privateIp(String privateIp) {
    this.privateIp = privateIp;
    return this;
  }

   /**
   * Private IP of the agent.
   * @return privateIp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrivateIp() {
    return privateIp;
  }


  @JsonProperty(JSON_PROPERTY_PRIVATE_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivateIp(String privateIp) {
    this.privateIp = privateIp;
  }


  public ApiAgentStatusIpInfo ipv6(String ipv6) {
    this.ipv6 = ipv6;
    return this;
  }

   /**
   * Get ipv6
   * @return ipv6
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IPV6)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpv6() {
    return ipv6;
  }


  @JsonProperty(JSON_PROPERTY_IPV6)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpv6(String ipv6) {
    this.ipv6 = ipv6;
  }


  public ApiAgentStatusIpInfo operativeSystemVersion(String operativeSystemVersion) {
    this.operativeSystemVersion = operativeSystemVersion;
    return this;
  }

   /**
   * Get operativeSystemVersion
   * @return operativeSystemVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATIVE_SYSTEM_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOperativeSystemVersion() {
    return operativeSystemVersion;
  }


  @JsonProperty(JSON_PROPERTY_OPERATIVE_SYSTEM_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperativeSystemVersion(String operativeSystemVersion) {
    this.operativeSystemVersion = operativeSystemVersion;
  }


  /**
   * Return true if this ApiAgentStatusIpInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAgentStatusIpInfo apiAgentStatusIpInfo = (ApiAgentStatusIpInfo) o;
    return Objects.equals(this.publicIp, apiAgentStatusIpInfo.publicIp) &&
        Objects.equals(this.privateIp, apiAgentStatusIpInfo.privateIp) &&
        Objects.equals(this.ipv6, apiAgentStatusIpInfo.ipv6) &&
        Objects.equals(this.operativeSystemVersion, apiAgentStatusIpInfo.operativeSystemVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicIp, privateIp, ipv6, operativeSystemVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAgentStatusIpInfo {\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
    sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
    sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
    sb.append("    operativeSystemVersion: ").append(toIndentedString(operativeSystemVersion)).append("\n");
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

