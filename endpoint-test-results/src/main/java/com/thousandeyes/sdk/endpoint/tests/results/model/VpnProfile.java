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
import com.thousandeyes.sdk.endpoint.tests.results.model.VpnType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * VpnProfile
 */
@JsonPropertyOrder({
  VpnProfile.JSON_PROPERTY_VPN_CLIENT_ADDRESSES,
  VpnProfile.JSON_PROPERTY_VPN_CLIENT_NETWORK_RANGE,
  VpnProfile.JSON_PROPERTY_VPN_GATEWAY_ADDRESS,
  VpnProfile.JSON_PROPERTY_VPN_TYPE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class VpnProfile {
  public static final String JSON_PROPERTY_VPN_CLIENT_ADDRESSES = "vpnClientAddresses";
  private List<String> vpnClientAddresses = new ArrayList<>();

  public static final String JSON_PROPERTY_VPN_CLIENT_NETWORK_RANGE = "vpnClientNetworkRange";
  private List<String> vpnClientNetworkRange = new ArrayList<>();

  public static final String JSON_PROPERTY_VPN_GATEWAY_ADDRESS = "vpnGatewayAddress";
  private String vpnGatewayAddress;

  public static final String JSON_PROPERTY_VPN_TYPE = "vpnType";
  private VpnType vpnType;

  public VpnProfile() { 
  }

  @JsonCreator
  public VpnProfile(
    @JsonProperty(JSON_PROPERTY_VPN_CLIENT_ADDRESSES) List<String> vpnClientAddresses, 
    @JsonProperty(JSON_PROPERTY_VPN_CLIENT_NETWORK_RANGE) List<String> vpnClientNetworkRange, 
    @JsonProperty(JSON_PROPERTY_VPN_GATEWAY_ADDRESS) String vpnGatewayAddress
  ) {
  this();
    this.vpnClientAddresses = vpnClientAddresses;
    this.vpnClientNetworkRange = vpnClientNetworkRange;
    this.vpnGatewayAddress = vpnGatewayAddress;
  }

   /**
   * A list of private IP addresses assigned to the device by the VPN server.
   * @return vpnClientAddresses
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VPN_CLIENT_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getVpnClientAddresses() {
    return vpnClientAddresses;
  }




   /**
   * A list of private networks assigned to the device by the VPN server.
   * @return vpnClientNetworkRange
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VPN_CLIENT_NETWORK_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getVpnClientNetworkRange() {
    return vpnClientNetworkRange;
  }




   /**
   * IP address of the VPN gateway.
   * @return vpnGatewayAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VPN_GATEWAY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVpnGatewayAddress() {
    return vpnGatewayAddress;
  }




  public VpnProfile vpnType(VpnType vpnType) {
    this.vpnType = vpnType;
    return this;
  }

   /**
   * Get vpnType
   * @return vpnType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VPN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VpnType getVpnType() {
    return vpnType;
  }


  @JsonProperty(JSON_PROPERTY_VPN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVpnType(VpnType vpnType) {
    this.vpnType = vpnType;
  }


  /**
   * Return true if this VpnProfile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VpnProfile vpnProfile = (VpnProfile) o;
    return Objects.equals(this.vpnClientAddresses, vpnProfile.vpnClientAddresses) &&
        Objects.equals(this.vpnClientNetworkRange, vpnProfile.vpnClientNetworkRange) &&
        Objects.equals(this.vpnGatewayAddress, vpnProfile.vpnGatewayAddress) &&
        Objects.equals(this.vpnType, vpnProfile.vpnType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpnClientAddresses, vpnClientNetworkRange, vpnGatewayAddress, vpnType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VpnProfile {\n");
    sb.append("    vpnClientAddresses: ").append(toIndentedString(vpnClientAddresses)).append("\n");
    sb.append("    vpnClientNetworkRange: ").append(toIndentedString(vpnClientNetworkRange)).append("\n");
    sb.append("    vpnGatewayAddress: ").append(toIndentedString(vpnGatewayAddress)).append("\n");
    sb.append("    vpnType: ").append(toIndentedString(vpnType)).append("\n");
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

