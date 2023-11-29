/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.model.EthernetProfile;
import com.thousandeyes.api.model.InterfaceHardwareType;
import com.thousandeyes.api.model.NetworkInterface;
import com.thousandeyes.api.model.NetworkProxyProfile;
import com.thousandeyes.api.model.NetworkWirelessProfile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thousandeyes.JSON;

/**
 * NetworkProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:40.551124Z[Europe/London]")
public class NetworkProfile {
  public static final String SERIALIZED_NAME_IP_ADDRESS = "ipAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_SUBNET_MASK = "subnetMask";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK)
  private String subnetMask;

  public static final String SERIALIZED_NAME_PUBLIC_IP_ADDRESS = "publicIpAddress";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IP_ADDRESS)
  private String publicIpAddress;

  public static final String SERIALIZED_NAME_LOCAL_PREFIX = "localPrefix";
  @SerializedName(SERIALIZED_NAME_LOCAL_PREFIX)
  private String localPrefix;

  public static final String SERIALIZED_NAME_PUBLIC_IP_RANGE = "publicIpRange";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IP_RANGE)
  private String publicIpRange;

  public static final String SERIALIZED_NAME_DNS_SERVERS = "dnsServers";
  @SerializedName(SERIALIZED_NAME_DNS_SERVERS)
  private List<String> dnsServers;

  public static final String SERIALIZED_NAME_HARDWARE_TYPE = "hardwareType";
  @SerializedName(SERIALIZED_NAME_HARDWARE_TYPE)
  private InterfaceHardwareType hardwareType;

  public static final String SERIALIZED_NAME_INTERFACE_NAME = "interfaceName";
  @SerializedName(SERIALIZED_NAME_INTERFACE_NAME)
  private String interfaceName;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_WIRELESS_PROFILE = "wirelessProfile";
  @SerializedName(SERIALIZED_NAME_WIRELESS_PROFILE)
  private NetworkWirelessProfile wirelessProfile;

  public static final String SERIALIZED_NAME_PROXY_PROFILE = "proxyProfile";
  @SerializedName(SERIALIZED_NAME_PROXY_PROFILE)
  private NetworkProxyProfile proxyProfile;

  public static final String SERIALIZED_NAME_ETHERNET_PROFILE = "ethernetProfile";
  @SerializedName(SERIALIZED_NAME_ETHERNET_PROFILE)
  private EthernetProfile ethernetProfile;

  public static final String SERIALIZED_NAME_PREVIOUS_INTERFACE = "previousInterface";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_INTERFACE)
  private NetworkInterface previousInterface;

  public NetworkProfile() {
  }

  
  public NetworkProfile(
     String ipAddress, 
     String subnetMask, 
     String publicIpAddress, 
     String localPrefix, 
     String publicIpRange, 
     List<String> dnsServers, 
     String interfaceName, 
     String error, 
     String gateway
  ) {
    this();
    this.ipAddress = ipAddress;
    this.subnetMask = subnetMask;
    this.publicIpAddress = publicIpAddress;
    this.localPrefix = localPrefix;
    this.publicIpRange = publicIpRange;
    this.dnsServers = dnsServers;
    this.interfaceName = interfaceName;
    this.error = error;
    this.gateway = gateway;
  }

   /**
   * Network IP address.
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  public String getIpAddress() {
    return ipAddress;
  }




   /**
   * Network subnet mask.
   * @return subnetMask
  **/
  @javax.annotation.Nullable
  public String getSubnetMask() {
    return subnetMask;
  }




   /**
   * Network public IP address.
   * @return publicIpAddress
  **/
  @javax.annotation.Nullable
  public String getPublicIpAddress() {
    return publicIpAddress;
  }




   /**
   * Network local prefix.
   * @return localPrefix
  **/
  @javax.annotation.Nullable
  public String getLocalPrefix() {
    return localPrefix;
  }




   /**
   * Network public IP range.
   * @return publicIpRange
  **/
  @javax.annotation.Nullable
  public String getPublicIpRange() {
    return publicIpRange;
  }




   /**
   * Network DNS servers.
   * @return dnsServers
  **/
  @javax.annotation.Nullable
  public List<String> getDnsServers() {
    return dnsServers;
  }




  public NetworkProfile hardwareType(InterfaceHardwareType hardwareType) {
    
    this.hardwareType = hardwareType;
    return this;
  }

   /**
   * Get hardwareType
   * @return hardwareType
  **/
  @javax.annotation.Nullable
  public InterfaceHardwareType getHardwareType() {
    return hardwareType;
  }


  public void setHardwareType(InterfaceHardwareType hardwareType) {
    this.hardwareType = hardwareType;
  }


   /**
   * Network interface name.
   * @return interfaceName
  **/
  @javax.annotation.Nullable
  public String getInterfaceName() {
    return interfaceName;
  }




   /**
   * Only present when there is an error
   * @return error
  **/
  @javax.annotation.Nullable
  public String getError() {
    return error;
  }




   /**
   * Network gateway address.
   * @return gateway
  **/
  @javax.annotation.Nullable
  public String getGateway() {
    return gateway;
  }




  public NetworkProfile wirelessProfile(NetworkWirelessProfile wirelessProfile) {
    
    this.wirelessProfile = wirelessProfile;
    return this;
  }

   /**
   * Get wirelessProfile
   * @return wirelessProfile
  **/
  @javax.annotation.Nullable
  public NetworkWirelessProfile getWirelessProfile() {
    return wirelessProfile;
  }


  public void setWirelessProfile(NetworkWirelessProfile wirelessProfile) {
    this.wirelessProfile = wirelessProfile;
  }


  public NetworkProfile proxyProfile(NetworkProxyProfile proxyProfile) {
    
    this.proxyProfile = proxyProfile;
    return this;
  }

   /**
   * Get proxyProfile
   * @return proxyProfile
  **/
  @javax.annotation.Nullable
  public NetworkProxyProfile getProxyProfile() {
    return proxyProfile;
  }


  public void setProxyProfile(NetworkProxyProfile proxyProfile) {
    this.proxyProfile = proxyProfile;
  }


  public NetworkProfile ethernetProfile(EthernetProfile ethernetProfile) {
    
    this.ethernetProfile = ethernetProfile;
    return this;
  }

   /**
   * Get ethernetProfile
   * @return ethernetProfile
  **/
  @javax.annotation.Nullable
  public EthernetProfile getEthernetProfile() {
    return ethernetProfile;
  }


  public void setEthernetProfile(EthernetProfile ethernetProfile) {
    this.ethernetProfile = ethernetProfile;
  }


  public NetworkProfile previousInterface(NetworkInterface previousInterface) {
    
    this.previousInterface = previousInterface;
    return this;
  }

   /**
   * Get previousInterface
   * @return previousInterface
  **/
  @javax.annotation.Nullable
  public NetworkInterface getPreviousInterface() {
    return previousInterface;
  }


  public void setPreviousInterface(NetworkInterface previousInterface) {
    this.previousInterface = previousInterface;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkProfile networkProfile = (NetworkProfile) o;
    return Objects.equals(this.ipAddress, networkProfile.ipAddress) &&
        Objects.equals(this.subnetMask, networkProfile.subnetMask) &&
        Objects.equals(this.publicIpAddress, networkProfile.publicIpAddress) &&
        Objects.equals(this.localPrefix, networkProfile.localPrefix) &&
        Objects.equals(this.publicIpRange, networkProfile.publicIpRange) &&
        Objects.equals(this.dnsServers, networkProfile.dnsServers) &&
        Objects.equals(this.hardwareType, networkProfile.hardwareType) &&
        Objects.equals(this.interfaceName, networkProfile.interfaceName) &&
        Objects.equals(this.error, networkProfile.error) &&
        Objects.equals(this.gateway, networkProfile.gateway) &&
        Objects.equals(this.wirelessProfile, networkProfile.wirelessProfile) &&
        Objects.equals(this.proxyProfile, networkProfile.proxyProfile) &&
        Objects.equals(this.ethernetProfile, networkProfile.ethernetProfile) &&
        Objects.equals(this.previousInterface, networkProfile.previousInterface);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, subnetMask, publicIpAddress, localPrefix, publicIpRange, dnsServers, hardwareType, interfaceName, error, gateway, wirelessProfile, proxyProfile, ethernetProfile, previousInterface);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkProfile {\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
    sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
    sb.append("    localPrefix: ").append(toIndentedString(localPrefix)).append("\n");
    sb.append("    publicIpRange: ").append(toIndentedString(publicIpRange)).append("\n");
    sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
    sb.append("    hardwareType: ").append(toIndentedString(hardwareType)).append("\n");
    sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    wirelessProfile: ").append(toIndentedString(wirelessProfile)).append("\n");
    sb.append("    proxyProfile: ").append(toIndentedString(proxyProfile)).append("\n");
    sb.append("    ethernetProfile: ").append(toIndentedString(ethernetProfile)).append("\n");
    sb.append("    previousInterface: ").append(toIndentedString(previousInterface)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ipAddress");
    openapiFields.add("subnetMask");
    openapiFields.add("publicIpAddress");
    openapiFields.add("localPrefix");
    openapiFields.add("publicIpRange");
    openapiFields.add("dnsServers");
    openapiFields.add("hardwareType");
    openapiFields.add("interfaceName");
    openapiFields.add("error");
    openapiFields.add("gateway");
    openapiFields.add("wirelessProfile");
    openapiFields.add("proxyProfile");
    openapiFields.add("ethernetProfile");
    openapiFields.add("previousInterface");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NetworkProfile
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NetworkProfile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NetworkProfile is not found in the empty JSON string", NetworkProfile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NetworkProfile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NetworkProfile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ipAddress") != null && !jsonObj.get("ipAddress").isJsonNull()) && !jsonObj.get("ipAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipAddress").toString()));
      }
      if ((jsonObj.get("subnetMask") != null && !jsonObj.get("subnetMask").isJsonNull()) && !jsonObj.get("subnetMask").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subnetMask` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subnetMask").toString()));
      }
      if ((jsonObj.get("publicIpAddress") != null && !jsonObj.get("publicIpAddress").isJsonNull()) && !jsonObj.get("publicIpAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicIpAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicIpAddress").toString()));
      }
      if ((jsonObj.get("localPrefix") != null && !jsonObj.get("localPrefix").isJsonNull()) && !jsonObj.get("localPrefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `localPrefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("localPrefix").toString()));
      }
      if ((jsonObj.get("publicIpRange") != null && !jsonObj.get("publicIpRange").isJsonNull()) && !jsonObj.get("publicIpRange").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicIpRange` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicIpRange").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dnsServers") != null && !jsonObj.get("dnsServers").isJsonNull() && !jsonObj.get("dnsServers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dnsServers` to be an array in the JSON string but got `%s`", jsonObj.get("dnsServers").toString()));
      }
      if ((jsonObj.get("interfaceName") != null && !jsonObj.get("interfaceName").isJsonNull()) && !jsonObj.get("interfaceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interfaceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interfaceName").toString()));
      }
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      if ((jsonObj.get("gateway") != null && !jsonObj.get("gateway").isJsonNull()) && !jsonObj.get("gateway").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway").toString()));
      }
      // validate the optional field `wirelessProfile`
      if (jsonObj.get("wirelessProfile") != null && !jsonObj.get("wirelessProfile").isJsonNull()) {
        NetworkWirelessProfile.validateJsonElement(jsonObj.get("wirelessProfile"));
      }
      // validate the optional field `proxyProfile`
      if (jsonObj.get("proxyProfile") != null && !jsonObj.get("proxyProfile").isJsonNull()) {
        NetworkProxyProfile.validateJsonElement(jsonObj.get("proxyProfile"));
      }
      // validate the optional field `ethernetProfile`
      if (jsonObj.get("ethernetProfile") != null && !jsonObj.get("ethernetProfile").isJsonNull()) {
        EthernetProfile.validateJsonElement(jsonObj.get("ethernetProfile"));
      }
      // validate the optional field `previousInterface`
      if (jsonObj.get("previousInterface") != null && !jsonObj.get("previousInterface").isJsonNull()) {
        NetworkInterface.validateJsonElement(jsonObj.get("previousInterface"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NetworkProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NetworkProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NetworkProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NetworkProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<NetworkProfile>() {
           @Override
           public void write(JsonWriter out, NetworkProfile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NetworkProfile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NetworkProfile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NetworkProfile
  * @throws IOException if the JSON string is invalid with respect to NetworkProfile
  */
  public static NetworkProfile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NetworkProfile.class);
  }

 /**
  * Convert an instance of NetworkProfile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

