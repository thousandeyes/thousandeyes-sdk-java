/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.   For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.endpoint.agents.model.AddressType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A description of the IPs assigned to this machine.
 */
@JsonPropertyOrder({
  AddressProfile.JSON_PROPERTY_ADDRESS_TYPE,
  AddressProfile.JSON_PROPERTY_IP_ADDRESS,
  AddressProfile.JSON_PROPERTY_PREFIX_LENGTH,
  AddressProfile.JSON_PROPERTY_GATEWAY,
  AddressProfile.JSON_PROPERTY_ROUTER_HARDWARE_ADDRESS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class AddressProfile {
  public static final String JSON_PROPERTY_ADDRESS_TYPE = "addressType";
  private AddressType addressType;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private String ipAddress;

  public static final String JSON_PROPERTY_PREFIX_LENGTH = "prefixLength";
  private Integer prefixLength;

  public static final String JSON_PROPERTY_GATEWAY = "gateway";
  private String gateway;

  public static final String JSON_PROPERTY_ROUTER_HARDWARE_ADDRESS = "routerHardwareAddress";
  private String routerHardwareAddress;

  public AddressProfile() { 
  }

  public AddressProfile addressType(AddressType addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * Get addressType
   * @return addressType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AddressType getAddressType() {
    return addressType;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressType(AddressType addressType) {
    this.addressType = addressType;
  }


  public AddressProfile ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of this interface in the network it&#39;s currently connected to.
   * @return ipAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpAddress() {
    return ipAddress;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public AddressProfile prefixLength(Integer prefixLength) {
    this.prefixLength = prefixLength;
    return this;
  }

   /**
   * The number of bits representing the network part of the &#x60;ipAddress&#x60;.
   * @return prefixLength
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPrefixLength() {
    return prefixLength;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixLength(Integer prefixLength) {
    this.prefixLength = prefixLength;
  }


  public AddressProfile gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

   /**
   * The default gateway for this interface.
   * @return gateway
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GATEWAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGateway() {
    return gateway;
  }


  @JsonProperty(JSON_PROPERTY_GATEWAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public AddressProfile routerHardwareAddress(String routerHardwareAddress) {
    this.routerHardwareAddress = routerHardwareAddress;
    return this;
  }

   /**
   * The router&#39;s MAC address resolved from an ARP request.
   * @return routerHardwareAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUTER_HARDWARE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRouterHardwareAddress() {
    return routerHardwareAddress;
  }


  @JsonProperty(JSON_PROPERTY_ROUTER_HARDWARE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRouterHardwareAddress(String routerHardwareAddress) {
    this.routerHardwareAddress = routerHardwareAddress;
  }


  /**
   * Return true if this AddressProfile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressProfile addressProfile = (AddressProfile) o;
    return Objects.equals(this.addressType, addressProfile.addressType) &&
        Objects.equals(this.ipAddress, addressProfile.ipAddress) &&
        Objects.equals(this.prefixLength, addressProfile.prefixLength) &&
        Objects.equals(this.gateway, addressProfile.gateway) &&
        Objects.equals(this.routerHardwareAddress, addressProfile.routerHardwareAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, ipAddress, prefixLength, gateway, routerHardwareAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressProfile {\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    prefixLength: ").append(toIndentedString(prefixLength)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    routerHardwareAddress: ").append(toIndentedString(routerHardwareAddress)).append("\n");
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

