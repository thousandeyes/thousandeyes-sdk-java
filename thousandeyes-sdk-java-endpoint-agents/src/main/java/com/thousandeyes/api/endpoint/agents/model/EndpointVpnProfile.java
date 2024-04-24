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
import com.thousandeyes.api.endpoint.agents.model.VpnType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointVpnProfile
 */
@JsonPropertyOrder({
  EndpointVpnProfile.JSON_PROPERTY_INTERFACE_NAME,
  EndpointVpnProfile.JSON_PROPERTY_VPN_TYPE,
  EndpointVpnProfile.JSON_PROPERTY_VPN_GATEWAY_ADDRESS,
  EndpointVpnProfile.JSON_PROPERTY_VPN_CLIENT_ADDRESSES,
  EndpointVpnProfile.JSON_PROPERTY_VPN_CLIENT_NETWORK_RANGE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T10:46:26.016598+01:00[Europe/Lisbon]")
public class EndpointVpnProfile {
  public static final String JSON_PROPERTY_INTERFACE_NAME = "interfaceName";
  private String interfaceName;

  public static final String JSON_PROPERTY_VPN_TYPE = "vpnType";
  private VpnType vpnType;

  public static final String JSON_PROPERTY_VPN_GATEWAY_ADDRESS = "vpnGatewayAddress";
  private String vpnGatewayAddress;

  public static final String JSON_PROPERTY_VPN_CLIENT_ADDRESSES = "vpnClientAddresses";
  private List<String> vpnClientAddresses = new ArrayList<>();

  public static final String JSON_PROPERTY_VPN_CLIENT_NETWORK_RANGE = "vpnClientNetworkRange";
  private List<String> vpnClientNetworkRange = new ArrayList<>();

  public EndpointVpnProfile() { 
  }

  public EndpointVpnProfile interfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
    return this;
  }

   /**
   * Interface name associated with &#x60;interfaceProfile&#x60;.
   * @return interfaceName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERFACE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInterfaceName() {
    return interfaceName;
  }


  @JsonProperty(JSON_PROPERTY_INTERFACE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
  }


  public EndpointVpnProfile vpnType(VpnType vpnType) {
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


  public EndpointVpnProfile vpnGatewayAddress(String vpnGatewayAddress) {
    this.vpnGatewayAddress = vpnGatewayAddress;
    return this;
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


  @JsonProperty(JSON_PROPERTY_VPN_GATEWAY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVpnGatewayAddress(String vpnGatewayAddress) {
    this.vpnGatewayAddress = vpnGatewayAddress;
  }


  public EndpointVpnProfile vpnClientAddresses(List<String> vpnClientAddresses) {
    this.vpnClientAddresses = vpnClientAddresses;
    return this;
  }

  public EndpointVpnProfile addVpnClientAddressesItem(String vpnClientAddressesItem) {
    if (this.vpnClientAddresses == null) {
      this.vpnClientAddresses = new ArrayList<>();
    }
    this.vpnClientAddresses.add(vpnClientAddressesItem);
    return this;
  }

   /**
   * List of private IP addresses assigned to the device, by the VPN server.
   * @return vpnClientAddresses
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VPN_CLIENT_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getVpnClientAddresses() {
    return vpnClientAddresses;
  }


  @JsonProperty(JSON_PROPERTY_VPN_CLIENT_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVpnClientAddresses(List<String> vpnClientAddresses) {
    this.vpnClientAddresses = vpnClientAddresses;
  }


  public EndpointVpnProfile vpnClientNetworkRange(List<String> vpnClientNetworkRange) {
    this.vpnClientNetworkRange = vpnClientNetworkRange;
    return this;
  }

  public EndpointVpnProfile addVpnClientNetworkRangeItem(String vpnClientNetworkRangeItem) {
    if (this.vpnClientNetworkRange == null) {
      this.vpnClientNetworkRange = new ArrayList<>();
    }
    this.vpnClientNetworkRange.add(vpnClientNetworkRangeItem);
    return this;
  }

   /**
   * List of private networks assigned to the device, by the VPN server.
   * @return vpnClientNetworkRange
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VPN_CLIENT_NETWORK_RANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getVpnClientNetworkRange() {
    return vpnClientNetworkRange;
  }


  @JsonProperty(JSON_PROPERTY_VPN_CLIENT_NETWORK_RANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVpnClientNetworkRange(List<String> vpnClientNetworkRange) {
    this.vpnClientNetworkRange = vpnClientNetworkRange;
  }


  /**
   * Return true if this EndpointVpnProfile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointVpnProfile endpointVpnProfile = (EndpointVpnProfile) o;
    return Objects.equals(this.interfaceName, endpointVpnProfile.interfaceName) &&
        Objects.equals(this.vpnType, endpointVpnProfile.vpnType) &&
        Objects.equals(this.vpnGatewayAddress, endpointVpnProfile.vpnGatewayAddress) &&
        Objects.equals(this.vpnClientAddresses, endpointVpnProfile.vpnClientAddresses) &&
        Objects.equals(this.vpnClientNetworkRange, endpointVpnProfile.vpnClientNetworkRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaceName, vpnType, vpnGatewayAddress, vpnClientAddresses, vpnClientNetworkRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointVpnProfile {\n");
    sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
    sb.append("    vpnType: ").append(toIndentedString(vpnType)).append("\n");
    sb.append("    vpnGatewayAddress: ").append(toIndentedString(vpnGatewayAddress)).append("\n");
    sb.append("    vpnClientAddresses: ").append(toIndentedString(vpnClientAddresses)).append("\n");
    sb.append("    vpnClientNetworkRange: ").append(toIndentedString(vpnClientNetworkRange)).append("\n");
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

