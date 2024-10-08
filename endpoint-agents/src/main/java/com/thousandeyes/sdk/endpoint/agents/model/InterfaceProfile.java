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
import com.thousandeyes.sdk.endpoint.agents.model.AddressProfile;
import com.thousandeyes.sdk.endpoint.agents.model.EndpointAgentEthernetProfile;
import com.thousandeyes.sdk.endpoint.agents.model.InterfaceHardwareType;
import com.thousandeyes.sdk.endpoint.agents.model.WirelessProfile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * InterfaceProfile
 */
@JsonPropertyOrder({
  InterfaceProfile.JSON_PROPERTY_INTERFACE_NAME,
  InterfaceProfile.JSON_PROPERTY_ADDRESS_PROFILES,
  InterfaceProfile.JSON_PROPERTY_HARDWARE_TYPE,
  InterfaceProfile.JSON_PROPERTY_ETHERNET_PROFILE,
  InterfaceProfile.JSON_PROPERTY_WIRELESS_PROFILE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class InterfaceProfile {
  public static final String JSON_PROPERTY_INTERFACE_NAME = "interfaceName";
  private String interfaceName;

  public static final String JSON_PROPERTY_ADDRESS_PROFILES = "addressProfiles";
  private List<AddressProfile> addressProfiles = new ArrayList<>();

  public static final String JSON_PROPERTY_HARDWARE_TYPE = "hardwareType";
  private InterfaceHardwareType hardwareType;

  public static final String JSON_PROPERTY_ETHERNET_PROFILE = "ethernetProfile";
  private EndpointAgentEthernetProfile ethernetProfile;

  public static final String JSON_PROPERTY_WIRELESS_PROFILE = "wirelessProfile";
  private WirelessProfile wirelessProfile;

  public InterfaceProfile() { 
  }

  public InterfaceProfile interfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
    return this;
  }

   /**
   * Get interfaceName
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


  public InterfaceProfile addressProfiles(List<AddressProfile> addressProfiles) {
    this.addressProfiles = addressProfiles;
    return this;
  }

  public InterfaceProfile addAddressProfilesItem(AddressProfile addressProfilesItem) {
    if (this.addressProfiles == null) {
      this.addressProfiles = new ArrayList<>();
    }
    this.addressProfiles.add(addressProfilesItem);
    return this;
  }

   /**
   * Get addressProfiles
   * @return addressProfiles
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_PROFILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AddressProfile> getAddressProfiles() {
    return addressProfiles;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_PROFILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressProfiles(List<AddressProfile> addressProfiles) {
    this.addressProfiles = addressProfiles;
  }


  public InterfaceProfile hardwareType(InterfaceHardwareType hardwareType) {
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


  public InterfaceProfile ethernetProfile(EndpointAgentEthernetProfile ethernetProfile) {
    this.ethernetProfile = ethernetProfile;
    return this;
  }

   /**
   * Get ethernetProfile
   * @return ethernetProfile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ETHERNET_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointAgentEthernetProfile getEthernetProfile() {
    return ethernetProfile;
  }


  @JsonProperty(JSON_PROPERTY_ETHERNET_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEthernetProfile(EndpointAgentEthernetProfile ethernetProfile) {
    this.ethernetProfile = ethernetProfile;
  }


  public InterfaceProfile wirelessProfile(WirelessProfile wirelessProfile) {
    this.wirelessProfile = wirelessProfile;
    return this;
  }

   /**
   * Get wirelessProfile
   * @return wirelessProfile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIRELESS_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WirelessProfile getWirelessProfile() {
    return wirelessProfile;
  }


  @JsonProperty(JSON_PROPERTY_WIRELESS_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWirelessProfile(WirelessProfile wirelessProfile) {
    this.wirelessProfile = wirelessProfile;
  }


  /**
   * Return true if this InterfaceProfile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterfaceProfile interfaceProfile = (InterfaceProfile) o;
    return Objects.equals(this.interfaceName, interfaceProfile.interfaceName) &&
        Objects.equals(this.addressProfiles, interfaceProfile.addressProfiles) &&
        Objects.equals(this.hardwareType, interfaceProfile.hardwareType) &&
        Objects.equals(this.ethernetProfile, interfaceProfile.ethernetProfile) &&
        Objects.equals(this.wirelessProfile, interfaceProfile.wirelessProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaceName, addressProfiles, hardwareType, ethernetProfile, wirelessProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterfaceProfile {\n");
    sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
    sb.append("    addressProfiles: ").append(toIndentedString(addressProfiles)).append("\n");
    sb.append("    hardwareType: ").append(toIndentedString(hardwareType)).append("\n");
    sb.append("    ethernetProfile: ").append(toIndentedString(ethernetProfile)).append("\n");
    sb.append("    wirelessProfile: ").append(toIndentedString(wirelessProfile)).append("\n");
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

