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
import com.thousandeyes.sdk.endpoint.tests.results.model.InterfaceHardwareType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NetworkInterface
 */
@JsonPropertyOrder({
  NetworkInterface.JSON_PROPERTY_IP_ADDRESS,
  NetworkInterface.JSON_PROPERTY_SUBNET_MASK,
  NetworkInterface.JSON_PROPERTY_PUBLIC_IP_ADDRESS,
  NetworkInterface.JSON_PROPERTY_LOCAL_PREFIX,
  NetworkInterface.JSON_PROPERTY_PUBLIC_IP_RANGE,
  NetworkInterface.JSON_PROPERTY_DNS_SERVERS,
  NetworkInterface.JSON_PROPERTY_HARDWARE_TYPE,
  NetworkInterface.JSON_PROPERTY_INTERFACE_NAME
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class NetworkInterface {
  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private String ipAddress;

  public static final String JSON_PROPERTY_SUBNET_MASK = "subnetMask";
  private String subnetMask;

  public static final String JSON_PROPERTY_PUBLIC_IP_ADDRESS = "publicIpAddress";
  private String publicIpAddress;

  public static final String JSON_PROPERTY_LOCAL_PREFIX = "localPrefix";
  private String localPrefix;

  public static final String JSON_PROPERTY_PUBLIC_IP_RANGE = "publicIpRange";
  private String publicIpRange;

  public static final String JSON_PROPERTY_DNS_SERVERS = "dnsServers";
  private List<String> dnsServers = new ArrayList<>();

  public static final String JSON_PROPERTY_HARDWARE_TYPE = "hardwareType";
  private InterfaceHardwareType hardwareType;

  public static final String JSON_PROPERTY_INTERFACE_NAME = "interfaceName";
  private String interfaceName;

  public NetworkInterface() { 
  }

  @JsonCreator
  public NetworkInterface(
    @JsonProperty(JSON_PROPERTY_IP_ADDRESS) String ipAddress, 
    @JsonProperty(JSON_PROPERTY_SUBNET_MASK) String subnetMask, 
    @JsonProperty(JSON_PROPERTY_PUBLIC_IP_ADDRESS) String publicIpAddress, 
    @JsonProperty(JSON_PROPERTY_LOCAL_PREFIX) String localPrefix, 
    @JsonProperty(JSON_PROPERTY_PUBLIC_IP_RANGE) String publicIpRange, 
    @JsonProperty(JSON_PROPERTY_DNS_SERVERS) List<String> dnsServers, 
    @JsonProperty(JSON_PROPERTY_INTERFACE_NAME) String interfaceName
  ) {
  this();
    this.ipAddress = ipAddress;
    this.subnetMask = subnetMask;
    this.publicIpAddress = publicIpAddress;
    this.localPrefix = localPrefix;
    this.publicIpRange = publicIpRange;
    this.dnsServers = dnsServers;
    this.interfaceName = interfaceName;
  }

   /**
   * Network IP address.
   * @return ipAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpAddress() {
    return ipAddress;
  }




   /**
   * Network subnet mask - only for IPv4.
   * @return subnetMask
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBNET_MASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubnetMask() {
    return subnetMask;
  }




   /**
   * Network public IP address.
   * @return publicIpAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicIpAddress() {
    return publicIpAddress;
  }




   /**
   * Network local prefix.
   * @return localPrefix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCAL_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocalPrefix() {
    return localPrefix;
  }




   /**
   * Network public IP range.
   * @return publicIpRange
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_IP_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicIpRange() {
    return publicIpRange;
  }




   /**
   * Network DNS servers.
   * @return dnsServers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_SERVERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDnsServers() {
    return dnsServers;
  }




  public NetworkInterface hardwareType(InterfaceHardwareType hardwareType) {
    this.hardwareType = hardwareType;
    return this;
  }

   /**
   * Get hardwareType
   * @return hardwareType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HARDWARE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InterfaceHardwareType getHardwareType() {
    return hardwareType;
  }


  @JsonProperty(JSON_PROPERTY_HARDWARE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHardwareType(InterfaceHardwareType hardwareType) {
    this.hardwareType = hardwareType;
  }


   /**
   * Network interface name.
   * @return interfaceName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERFACE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInterfaceName() {
    return interfaceName;
  }




  /**
   * Return true if this NetworkInterface object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkInterface networkInterface = (NetworkInterface) o;
    return Objects.equals(this.ipAddress, networkInterface.ipAddress) &&
        Objects.equals(this.subnetMask, networkInterface.subnetMask) &&
        Objects.equals(this.publicIpAddress, networkInterface.publicIpAddress) &&
        Objects.equals(this.localPrefix, networkInterface.localPrefix) &&
        Objects.equals(this.publicIpRange, networkInterface.publicIpRange) &&
        Objects.equals(this.dnsServers, networkInterface.dnsServers) &&
        Objects.equals(this.hardwareType, networkInterface.hardwareType) &&
        Objects.equals(this.interfaceName, networkInterface.interfaceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, subnetMask, publicIpAddress, localPrefix, publicIpRange, dnsServers, hardwareType, interfaceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkInterface {\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
    sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
    sb.append("    localPrefix: ").append(toIndentedString(localPrefix)).append("\n");
    sb.append("    publicIpRange: ").append(toIndentedString(publicIpRange)).append("\n");
    sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
    sb.append("    hardwareType: ").append(toIndentedString(hardwareType)).append("\n");
    sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
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

