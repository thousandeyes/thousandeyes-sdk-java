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
import com.thousandeyes.api.endpoint.tests.results.model.TestProtocol;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TargetProfile
 */
@JsonPropertyOrder({
  TargetProfile.JSON_PROPERTY_REMOTE_PORT,
  TargetProfile.JSON_PROPERTY_REMOTE_IP_ADDRESS,
  TargetProfile.JSON_PROPERTY_PROTOCOL
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class TargetProfile {
  public static final String JSON_PROPERTY_REMOTE_PORT = "remotePort";
  private BigDecimal remotePort;

  public static final String JSON_PROPERTY_REMOTE_IP_ADDRESS = "remoteIpAddress";
  private String remoteIpAddress;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private TestProtocol protocol = TestProtocol.TCP;

  public TargetProfile() { 
  }

  @JsonCreator
  public TargetProfile(
    @JsonProperty(JSON_PROPERTY_REMOTE_PORT) BigDecimal remotePort, 
    @JsonProperty(JSON_PROPERTY_REMOTE_IP_ADDRESS) String remoteIpAddress
  ) {
  this();
    this.remotePort = remotePort;
    this.remoteIpAddress = remoteIpAddress;
  }

   /**
   * The remote port of a network flow towards the target.
   * @return remotePort
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOTE_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRemotePort() {
    return remotePort;
  }




   /**
   * The remote IP address of a network flow towards the target.
   * @return remoteIpAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOTE_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRemoteIpAddress() {
    return remoteIpAddress;
  }




  public TargetProfile protocol(TestProtocol protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestProtocol getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(TestProtocol protocol) {
    this.protocol = protocol;
  }


  /**
   * Return true if this TargetProfile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetProfile targetProfile = (TargetProfile) o;
    return Objects.equals(this.remotePort, targetProfile.remotePort) &&
        Objects.equals(this.remoteIpAddress, targetProfile.remoteIpAddress) &&
        Objects.equals(this.protocol, targetProfile.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remotePort, remoteIpAddress, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetProfile {\n");
    sb.append("    remotePort: ").append(toIndentedString(remotePort)).append("\n");
    sb.append("    remoteIpAddress: ").append(toIndentedString(remoteIpAddress)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
