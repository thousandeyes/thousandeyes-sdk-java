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


package com.thousandeyes.api.endpoint.tests.results.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.endpoint.tests.results.model.AccountGroupId;
import com.thousandeyes.api.endpoint.tests.results.model.NetworkProfile;
import com.thousandeyes.api.endpoint.tests.results.model.SystemMetrics;
import com.thousandeyes.api.endpoint.tests.results.model.VpnProfile;
import java.io.IOException;
import java.util.Arrays;
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

import com.thousandeyes.api.endpoint.tests.JSON;

/**
 * NetworkTestResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:32.305594Z[Europe/Lisbon]")
public class NetworkTestResult {
  public static final String SERIALIZED_NAME_AGENT_ID = "agentId";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private UUID agentId;

  public static final String SERIALIZED_NAME_AID = "aid";
  @SerializedName(SERIALIZED_NAME_AID)
  private AccountGroupId aid;

  public static final String SERIALIZED_NAME_ROUND_ID = "roundId";
  @SerializedName(SERIALIZED_NAME_ROUND_ID)
  private Integer roundId;

  public static final String SERIALIZED_NAME_SERVER_IP = "serverIp";
  @SerializedName(SERIALIZED_NAME_SERVER_IP)
  private String serverIp;

  public static final String SERIALIZED_NAME_SYSTEM_METRICS = "systemMetrics";
  @SerializedName(SERIALIZED_NAME_SYSTEM_METRICS)
  private SystemMetrics systemMetrics;

  public static final String SERIALIZED_NAME_VPN_PROFILE = "vpnProfile";
  @SerializedName(SERIALIZED_NAME_VPN_PROFILE)
  private VpnProfile vpnProfile;

  public static final String SERIALIZED_NAME_NETWORK_PROFILE = "networkProfile";
  @SerializedName(SERIALIZED_NAME_NETWORK_PROFILE)
  private NetworkProfile networkProfile;

  public static final String SERIALIZED_NAME_AVG_LATENCY = "avgLatency";
  @SerializedName(SERIALIZED_NAME_AVG_LATENCY)
  private Double avgLatency;

  public static final String SERIALIZED_NAME_ERROR_DETAILS = "errorDetails";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAILS)
  private String errorDetails;

  public static final String SERIALIZED_NAME_JITTER = "jitter";
  @SerializedName(SERIALIZED_NAME_JITTER)
  private Double jitter;

  public static final String SERIALIZED_NAME_IS_ICMP_BLOCKED = "isIcmpBlocked";
  @SerializedName(SERIALIZED_NAME_IS_ICMP_BLOCKED)
  private Boolean isIcmpBlocked;

  public static final String SERIALIZED_NAME_LOSS = "loss";
  @SerializedName(SERIALIZED_NAME_LOSS)
  private Double loss;

  public static final String SERIALIZED_NAME_MAX_LATENCY = "maxLatency";
  @SerializedName(SERIALIZED_NAME_MAX_LATENCY)
  private Double maxLatency;

  public static final String SERIALIZED_NAME_MIN_LATENCY = "minLatency";
  @SerializedName(SERIALIZED_NAME_MIN_LATENCY)
  private Double minLatency;

  public NetworkTestResult() {
  }

  
  public NetworkTestResult(
     UUID agentId, 
     Integer roundId, 
     String serverIp, 
     Double avgLatency, 
     String errorDetails, 
     Double jitter, 
     Boolean isIcmpBlocked, 
     Double loss, 
     Double maxLatency, 
     Double minLatency
  ) {
    this();
    this.agentId = agentId;
    this.roundId = roundId;
    this.serverIp = serverIp;
    this.avgLatency = avgLatency;
    this.errorDetails = errorDetails;
    this.jitter = jitter;
    this.isIcmpBlocked = isIcmpBlocked;
    this.loss = loss;
    this.maxLatency = maxLatency;
    this.minLatency = minLatency;
  }

   /**
   * Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint.
   * @return agentId
  **/
  @javax.annotation.Nullable
  public UUID getAgentId() {
    return agentId;
  }




  public NetworkTestResult aid(AccountGroupId aid) {
    
    this.aid = aid;
    return this;
  }

   /**
   * Get aid
   * @return aid
  **/
  @javax.annotation.Nullable
  public AccountGroupId getAid() {
    return aid;
  }


  public void setAid(AccountGroupId aid) {
    this.aid = aid;
  }


   /**
   * Epoch time (seconds) indicating the start time of the round.
   * @return roundId
  **/
  @javax.annotation.Nullable
  public Integer getRoundId() {
    return roundId;
  }




   /**
   * IP address of target server.
   * @return serverIp
  **/
  @javax.annotation.Nullable
  public String getServerIp() {
    return serverIp;
  }




  public NetworkTestResult systemMetrics(SystemMetrics systemMetrics) {
    
    this.systemMetrics = systemMetrics;
    return this;
  }

   /**
   * Get systemMetrics
   * @return systemMetrics
  **/
  @javax.annotation.Nullable
  public SystemMetrics getSystemMetrics() {
    return systemMetrics;
  }


  public void setSystemMetrics(SystemMetrics systemMetrics) {
    this.systemMetrics = systemMetrics;
  }


  public NetworkTestResult vpnProfile(VpnProfile vpnProfile) {
    
    this.vpnProfile = vpnProfile;
    return this;
  }

   /**
   * Get vpnProfile
   * @return vpnProfile
  **/
  @javax.annotation.Nullable
  public VpnProfile getVpnProfile() {
    return vpnProfile;
  }


  public void setVpnProfile(VpnProfile vpnProfile) {
    this.vpnProfile = vpnProfile;
  }


  public NetworkTestResult networkProfile(NetworkProfile networkProfile) {
    
    this.networkProfile = networkProfile;
    return this;
  }

   /**
   * Get networkProfile
   * @return networkProfile
  **/
  @javax.annotation.Nullable
  public NetworkProfile getNetworkProfile() {
    return networkProfile;
  }


  public void setNetworkProfile(NetworkProfile networkProfile) {
    this.networkProfile = networkProfile;
  }


   /**
   * Average RTT for packets sent to destination.
   * @return avgLatency
  **/
  @javax.annotation.Nullable
  public Double getAvgLatency() {
    return avgLatency;
  }




   /**
   * Error details, if an error was encountered.
   * @return errorDetails
  **/
  @javax.annotation.Nullable
  public String getErrorDetails() {
    return errorDetails;
  }




   /**
   * Standard deviation of latency.
   * @return jitter
  **/
  @javax.annotation.Nullable
  public Double getJitter() {
    return jitter;
  }




   /**
   * Set to &#x60;true&#x60; if network target is blocking ICMP echo (ping) queries.
   * @return isIcmpBlocked
  **/
  @javax.annotation.Nullable
  public Boolean getIsIcmpBlocked() {
    return isIcmpBlocked;
  }




   /**
   * Percentage of packets not reaching destination.
   * @return loss
  **/
  @javax.annotation.Nullable
  public Double getLoss() {
    return loss;
  }




   /**
   * Maximum RTT for packets sent to destination.
   * @return maxLatency
  **/
  @javax.annotation.Nullable
  public Double getMaxLatency() {
    return maxLatency;
  }




   /**
   * Minimum RTT for packets sent to destination.
   * @return minLatency
  **/
  @javax.annotation.Nullable
  public Double getMinLatency() {
    return minLatency;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkTestResult networkTestResult = (NetworkTestResult) o;
    return Objects.equals(this.agentId, networkTestResult.agentId) &&
        Objects.equals(this.aid, networkTestResult.aid) &&
        Objects.equals(this.roundId, networkTestResult.roundId) &&
        Objects.equals(this.serverIp, networkTestResult.serverIp) &&
        Objects.equals(this.systemMetrics, networkTestResult.systemMetrics) &&
        Objects.equals(this.vpnProfile, networkTestResult.vpnProfile) &&
        Objects.equals(this.networkProfile, networkTestResult.networkProfile) &&
        Objects.equals(this.avgLatency, networkTestResult.avgLatency) &&
        Objects.equals(this.errorDetails, networkTestResult.errorDetails) &&
        Objects.equals(this.jitter, networkTestResult.jitter) &&
        Objects.equals(this.isIcmpBlocked, networkTestResult.isIcmpBlocked) &&
        Objects.equals(this.loss, networkTestResult.loss) &&
        Objects.equals(this.maxLatency, networkTestResult.maxLatency) &&
        Objects.equals(this.minLatency, networkTestResult.minLatency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, aid, roundId, serverIp, systemMetrics, vpnProfile, networkProfile, avgLatency, errorDetails, jitter, isIcmpBlocked, loss, maxLatency, minLatency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkTestResult {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    systemMetrics: ").append(toIndentedString(systemMetrics)).append("\n");
    sb.append("    vpnProfile: ").append(toIndentedString(vpnProfile)).append("\n");
    sb.append("    networkProfile: ").append(toIndentedString(networkProfile)).append("\n");
    sb.append("    avgLatency: ").append(toIndentedString(avgLatency)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    jitter: ").append(toIndentedString(jitter)).append("\n");
    sb.append("    isIcmpBlocked: ").append(toIndentedString(isIcmpBlocked)).append("\n");
    sb.append("    loss: ").append(toIndentedString(loss)).append("\n");
    sb.append("    maxLatency: ").append(toIndentedString(maxLatency)).append("\n");
    sb.append("    minLatency: ").append(toIndentedString(minLatency)).append("\n");
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
    openapiFields.add("agentId");
    openapiFields.add("aid");
    openapiFields.add("roundId");
    openapiFields.add("serverIp");
    openapiFields.add("systemMetrics");
    openapiFields.add("vpnProfile");
    openapiFields.add("networkProfile");
    openapiFields.add("avgLatency");
    openapiFields.add("errorDetails");
    openapiFields.add("jitter");
    openapiFields.add("isIcmpBlocked");
    openapiFields.add("loss");
    openapiFields.add("maxLatency");
    openapiFields.add("minLatency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NetworkTestResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NetworkTestResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NetworkTestResult is not found in the empty JSON string", NetworkTestResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NetworkTestResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NetworkTestResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("agentId") != null && !jsonObj.get("agentId").isJsonNull()) && !jsonObj.get("agentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agentId").toString()));
      }
      // validate the optional field `aid`
      if (jsonObj.get("aid") != null && !jsonObj.get("aid").isJsonNull()) {
        AccountGroupId.validateJsonElement(jsonObj.get("aid"));
      }
      if ((jsonObj.get("serverIp") != null && !jsonObj.get("serverIp").isJsonNull()) && !jsonObj.get("serverIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverIp").toString()));
      }
      // validate the optional field `systemMetrics`
      if (jsonObj.get("systemMetrics") != null && !jsonObj.get("systemMetrics").isJsonNull()) {
        SystemMetrics.validateJsonElement(jsonObj.get("systemMetrics"));
      }
      // validate the optional field `vpnProfile`
      if (jsonObj.get("vpnProfile") != null && !jsonObj.get("vpnProfile").isJsonNull()) {
        VpnProfile.validateJsonElement(jsonObj.get("vpnProfile"));
      }
      // validate the optional field `networkProfile`
      if (jsonObj.get("networkProfile") != null && !jsonObj.get("networkProfile").isJsonNull()) {
        NetworkProfile.validateJsonElement(jsonObj.get("networkProfile"));
      }
      if ((jsonObj.get("errorDetails") != null && !jsonObj.get("errorDetails").isJsonNull()) && !jsonObj.get("errorDetails").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorDetails` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorDetails").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NetworkTestResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NetworkTestResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NetworkTestResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NetworkTestResult.class));

       return (TypeAdapter<T>) new TypeAdapter<NetworkTestResult>() {
           @Override
           public void write(JsonWriter out, NetworkTestResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NetworkTestResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NetworkTestResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NetworkTestResult
  * @throws IOException if the JSON string is invalid with respect to NetworkTestResult
  */
  public static NetworkTestResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NetworkTestResult.class);
  }

 /**
  * Convert an instance of NetworkTestResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

