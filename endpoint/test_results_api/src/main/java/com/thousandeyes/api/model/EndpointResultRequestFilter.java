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
import com.thousandeyes.api.model.InterfaceHardwareType;
import com.thousandeyes.api.model.Platform;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

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
 * EndpointResultRequestFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:40.551124Z[Europe/London]")
public class EndpointResultRequestFilter {
  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private List<String> location;

  public static final String SERIALIZED_NAME_CONNECTION = "connection";
  @SerializedName(SERIALIZED_NAME_CONNECTION)
  private List<InterfaceHardwareType> connection;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private List<Platform> platform;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private List<String> gateway;

  public static final String SERIALIZED_NAME_PROXY_TARGET = "proxyTarget";
  @SerializedName(SERIALIZED_NAME_PROXY_TARGET)
  private List<String> proxyTarget;

  public static final String SERIALIZED_NAME_VPN_TARGET = "vpnTarget";
  @SerializedName(SERIALIZED_NAME_VPN_TARGET)
  private List<String> vpnTarget;

  public static final String SERIALIZED_NAME_AGENT_ID = "agentId";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private List<UUID> agentId;

  public static final String SERIALIZED_NAME_NETWORK_ID = "networkId";
  @SerializedName(SERIALIZED_NAME_NETWORK_ID)
  private List<String> networkId;

  public static final String SERIALIZED_NAME_SSID = "ssid";
  @SerializedName(SERIALIZED_NAME_SSID)
  private List<String> ssid;

  public static final String SERIALIZED_NAME_BSSID = "bssid";
  @SerializedName(SERIALIZED_NAME_BSSID)
  private List<String> bssid;

  public EndpointResultRequestFilter() {
  }

  public EndpointResultRequestFilter location(List<String> location) {
    
    this.location = location;
    return this;
  }

  public EndpointResultRequestFilter addLocationItem(String locationItem) {
    if (this.location == null) {
      this.location = new ArrayList<>();
    }
    this.location.add(locationItem);
    return this;
  }

   /**
   * Location of the endpoint agent.
   * @return location
  **/
  @javax.annotation.Nullable
  public List<String> getLocation() {
    return location;
  }


  public void setLocation(List<String> location) {
    this.location = location;
  }


  public EndpointResultRequestFilter connection(List<InterfaceHardwareType> connection) {
    
    this.connection = connection;
    return this;
  }

  public EndpointResultRequestFilter addConnectionItem(InterfaceHardwareType connectionItem) {
    if (this.connection == null) {
      this.connection = new ArrayList<>();
    }
    this.connection.add(connectionItem);
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  @javax.annotation.Nullable
  public List<InterfaceHardwareType> getConnection() {
    return connection;
  }


  public void setConnection(List<InterfaceHardwareType> connection) {
    this.connection = connection;
  }


  public EndpointResultRequestFilter platform(List<Platform> platform) {
    
    this.platform = platform;
    return this;
  }

  public EndpointResultRequestFilter addPlatformItem(Platform platformItem) {
    if (this.platform == null) {
      this.platform = new ArrayList<>();
    }
    this.platform.add(platformItem);
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  public List<Platform> getPlatform() {
    return platform;
  }


  public void setPlatform(List<Platform> platform) {
    this.platform = platform;
  }


  public EndpointResultRequestFilter gateway(List<String> gateway) {
    
    this.gateway = gateway;
    return this;
  }

  public EndpointResultRequestFilter addGatewayItem(String gatewayItem) {
    if (this.gateway == null) {
      this.gateway = new ArrayList<>();
    }
    this.gateway.add(gatewayItem);
    return this;
  }

   /**
   * Endpoint agent default gateway IP address.
   * @return gateway
  **/
  @javax.annotation.Nullable
  public List<String> getGateway() {
    return gateway;
  }


  public void setGateway(List<String> gateway) {
    this.gateway = gateway;
  }


  public EndpointResultRequestFilter proxyTarget(List<String> proxyTarget) {
    
    this.proxyTarget = proxyTarget;
    return this;
  }

  public EndpointResultRequestFilter addProxyTargetItem(String proxyTargetItem) {
    if (this.proxyTarget == null) {
      this.proxyTarget = new ArrayList<>();
    }
    this.proxyTarget.add(proxyTargetItem);
    return this;
  }

   /**
   * Endpoint agent proxy IP address.
   * @return proxyTarget
  **/
  @javax.annotation.Nullable
  public List<String> getProxyTarget() {
    return proxyTarget;
  }


  public void setProxyTarget(List<String> proxyTarget) {
    this.proxyTarget = proxyTarget;
  }


  public EndpointResultRequestFilter vpnTarget(List<String> vpnTarget) {
    
    this.vpnTarget = vpnTarget;
    return this;
  }

  public EndpointResultRequestFilter addVpnTargetItem(String vpnTargetItem) {
    if (this.vpnTarget == null) {
      this.vpnTarget = new ArrayList<>();
    }
    this.vpnTarget.add(vpnTargetItem);
    return this;
  }

   /**
   * Endpoint agent VPN endpoint IP address.
   * @return vpnTarget
  **/
  @javax.annotation.Nullable
  public List<String> getVpnTarget() {
    return vpnTarget;
  }


  public void setVpnTarget(List<String> vpnTarget) {
    this.vpnTarget = vpnTarget;
  }


  public EndpointResultRequestFilter agentId(List<UUID> agentId) {
    
    this.agentId = agentId;
    return this;
  }

  public EndpointResultRequestFilter addAgentIdItem(UUID agentIdItem) {
    if (this.agentId == null) {
      this.agentId = new ArrayList<>();
    }
    this.agentId.add(agentIdItem);
    return this;
  }

   /**
   * Endpoint agent ID.
   * @return agentId
  **/
  @javax.annotation.Nullable
  public List<UUID> getAgentId() {
    return agentId;
  }


  public void setAgentId(List<UUID> agentId) {
    this.agentId = agentId;
  }


  public EndpointResultRequestFilter networkId(List<String> networkId) {
    
    this.networkId = networkId;
    return this;
  }

  public EndpointResultRequestFilter addNetworkIdItem(String networkIdItem) {
    if (this.networkId == null) {
      this.networkId = new ArrayList<>();
    }
    this.networkId.add(networkIdItem);
    return this;
  }

   /**
   * Network ID.
   * @return networkId
  **/
  @javax.annotation.Nullable
  public List<String> getNetworkId() {
    return networkId;
  }


  public void setNetworkId(List<String> networkId) {
    this.networkId = networkId;
  }


  public EndpointResultRequestFilter ssid(List<String> ssid) {
    
    this.ssid = ssid;
    return this;
  }

  public EndpointResultRequestFilter addSsidItem(String ssidItem) {
    if (this.ssid == null) {
      this.ssid = new ArrayList<>();
    }
    this.ssid.add(ssidItem);
    return this;
  }

   /**
   * WiFi SSID.
   * @return ssid
  **/
  @javax.annotation.Nullable
  public List<String> getSsid() {
    return ssid;
  }


  public void setSsid(List<String> ssid) {
    this.ssid = ssid;
  }


  public EndpointResultRequestFilter bssid(List<String> bssid) {
    
    this.bssid = bssid;
    return this;
  }

  public EndpointResultRequestFilter addBssidItem(String bssidItem) {
    if (this.bssid == null) {
      this.bssid = new ArrayList<>();
    }
    this.bssid.add(bssidItem);
    return this;
  }

   /**
   * WiFi BSSID.
   * @return bssid
  **/
  @javax.annotation.Nullable
  public List<String> getBssid() {
    return bssid;
  }


  public void setBssid(List<String> bssid) {
    this.bssid = bssid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointResultRequestFilter endpointResultRequestFilter = (EndpointResultRequestFilter) o;
    return Objects.equals(this.location, endpointResultRequestFilter.location) &&
        Objects.equals(this.connection, endpointResultRequestFilter.connection) &&
        Objects.equals(this.platform, endpointResultRequestFilter.platform) &&
        Objects.equals(this.gateway, endpointResultRequestFilter.gateway) &&
        Objects.equals(this.proxyTarget, endpointResultRequestFilter.proxyTarget) &&
        Objects.equals(this.vpnTarget, endpointResultRequestFilter.vpnTarget) &&
        Objects.equals(this.agentId, endpointResultRequestFilter.agentId) &&
        Objects.equals(this.networkId, endpointResultRequestFilter.networkId) &&
        Objects.equals(this.ssid, endpointResultRequestFilter.ssid) &&
        Objects.equals(this.bssid, endpointResultRequestFilter.bssid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, connection, platform, gateway, proxyTarget, vpnTarget, agentId, networkId, ssid, bssid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointResultRequestFilter {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    proxyTarget: ").append(toIndentedString(proxyTarget)).append("\n");
    sb.append("    vpnTarget: ").append(toIndentedString(vpnTarget)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
    sb.append("    bssid: ").append(toIndentedString(bssid)).append("\n");
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
    openapiFields.add("location");
    openapiFields.add("connection");
    openapiFields.add("platform");
    openapiFields.add("gateway");
    openapiFields.add("proxyTarget");
    openapiFields.add("vpnTarget");
    openapiFields.add("agentId");
    openapiFields.add("networkId");
    openapiFields.add("ssid");
    openapiFields.add("bssid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EndpointResultRequestFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EndpointResultRequestFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointResultRequestFilter is not found in the empty JSON string", EndpointResultRequestFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EndpointResultRequestFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointResultRequestFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull() && !jsonObj.get("location").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be an array in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("connection") != null && !jsonObj.get("connection").isJsonNull() && !jsonObj.get("connection").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection` to be an array in the JSON string but got `%s`", jsonObj.get("connection").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonNull() && !jsonObj.get("platform").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be an array in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("gateway") != null && !jsonObj.get("gateway").isJsonNull() && !jsonObj.get("gateway").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway` to be an array in the JSON string but got `%s`", jsonObj.get("gateway").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("proxyTarget") != null && !jsonObj.get("proxyTarget").isJsonNull() && !jsonObj.get("proxyTarget").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `proxyTarget` to be an array in the JSON string but got `%s`", jsonObj.get("proxyTarget").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("vpnTarget") != null && !jsonObj.get("vpnTarget").isJsonNull() && !jsonObj.get("vpnTarget").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vpnTarget` to be an array in the JSON string but got `%s`", jsonObj.get("vpnTarget").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("agentId") != null && !jsonObj.get("agentId").isJsonNull() && !jsonObj.get("agentId").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentId` to be an array in the JSON string but got `%s`", jsonObj.get("agentId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("networkId") != null && !jsonObj.get("networkId").isJsonNull() && !jsonObj.get("networkId").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `networkId` to be an array in the JSON string but got `%s`", jsonObj.get("networkId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ssid") != null && !jsonObj.get("ssid").isJsonNull() && !jsonObj.get("ssid").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssid` to be an array in the JSON string but got `%s`", jsonObj.get("ssid").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bssid") != null && !jsonObj.get("bssid").isJsonNull() && !jsonObj.get("bssid").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bssid` to be an array in the JSON string but got `%s`", jsonObj.get("bssid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointResultRequestFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointResultRequestFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointResultRequestFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointResultRequestFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointResultRequestFilter>() {
           @Override
           public void write(JsonWriter out, EndpointResultRequestFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointResultRequestFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EndpointResultRequestFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EndpointResultRequestFilter
  * @throws IOException if the JSON string is invalid with respect to EndpointResultRequestFilter
  */
  public static EndpointResultRequestFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointResultRequestFilter.class);
  }

 /**
  * Convert an instance of EndpointResultRequestFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

