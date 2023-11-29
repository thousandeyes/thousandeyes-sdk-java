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
import com.thousandeyes.api.model.AccountGroupId;
import com.thousandeyes.api.model.AsnDetails;
import com.thousandeyes.api.model.SystemMetrics;
import com.thousandeyes.api.model.VpnProfile;
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

import com.thousandeyes.JSON;

/**
 * PathVisBaseTestResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:40.551124Z[Europe/London]")
public class PathVisBaseTestResult {
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

  public static final String SERIALIZED_NAME_ASN_DETAILS = "asnDetails";
  @SerializedName(SERIALIZED_NAME_ASN_DETAILS)
  private AsnDetails asnDetails;

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public static final String SERIALIZED_NAME_SOURCE_IP = "sourceIp";
  @SerializedName(SERIALIZED_NAME_SOURCE_IP)
  private String sourceIp;

  public static final String SERIALIZED_NAME_SOURCE_PREFIX = "sourcePrefix";
  @SerializedName(SERIALIZED_NAME_SOURCE_PREFIX)
  private String sourcePrefix;

  public PathVisBaseTestResult() {
  }

  
  public PathVisBaseTestResult(
     UUID agentId, 
     Integer roundId, 
     String serverIp, 
     String server, 
     String sourceIp, 
     String sourcePrefix
  ) {
    this();
    this.agentId = agentId;
    this.roundId = roundId;
    this.serverIp = serverIp;
    this.server = server;
    this.sourceIp = sourceIp;
    this.sourcePrefix = sourcePrefix;
  }

   /**
   * Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint.
   * @return agentId
  **/
  @javax.annotation.Nullable
  public UUID getAgentId() {
    return agentId;
  }




  public PathVisBaseTestResult aid(AccountGroupId aid) {
    
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




  public PathVisBaseTestResult systemMetrics(SystemMetrics systemMetrics) {
    
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


  public PathVisBaseTestResult vpnProfile(VpnProfile vpnProfile) {
    
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


  public PathVisBaseTestResult asnDetails(AsnDetails asnDetails) {
    
    this.asnDetails = asnDetails;
    return this;
  }

   /**
   * Get asnDetails
   * @return asnDetails
  **/
  @javax.annotation.Nullable
  public AsnDetails getAsnDetails() {
    return asnDetails;
  }


  public void setAsnDetails(AsnDetails asnDetails) {
    this.asnDetails = asnDetails;
  }


   /**
   * Target server, including port.
   * @return server
  **/
  @javax.annotation.Nullable
  public String getServer() {
    return server;
  }




   /**
   * IP address of source endpoint agent.
   * @return sourceIp
  **/
  @javax.annotation.Nullable
  public String getSourceIp() {
    return sourceIp;
  }




   /**
   * IP prefix of source endpoint agent.
   * @return sourcePrefix
  **/
  @javax.annotation.Nullable
  public String getSourcePrefix() {
    return sourcePrefix;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathVisBaseTestResult pathVisBaseTestResult = (PathVisBaseTestResult) o;
    return Objects.equals(this.agentId, pathVisBaseTestResult.agentId) &&
        Objects.equals(this.aid, pathVisBaseTestResult.aid) &&
        Objects.equals(this.roundId, pathVisBaseTestResult.roundId) &&
        Objects.equals(this.serverIp, pathVisBaseTestResult.serverIp) &&
        Objects.equals(this.systemMetrics, pathVisBaseTestResult.systemMetrics) &&
        Objects.equals(this.vpnProfile, pathVisBaseTestResult.vpnProfile) &&
        Objects.equals(this.asnDetails, pathVisBaseTestResult.asnDetails) &&
        Objects.equals(this.server, pathVisBaseTestResult.server) &&
        Objects.equals(this.sourceIp, pathVisBaseTestResult.sourceIp) &&
        Objects.equals(this.sourcePrefix, pathVisBaseTestResult.sourcePrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, aid, roundId, serverIp, systemMetrics, vpnProfile, asnDetails, server, sourceIp, sourcePrefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathVisBaseTestResult {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    systemMetrics: ").append(toIndentedString(systemMetrics)).append("\n");
    sb.append("    vpnProfile: ").append(toIndentedString(vpnProfile)).append("\n");
    sb.append("    asnDetails: ").append(toIndentedString(asnDetails)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
    sb.append("    sourcePrefix: ").append(toIndentedString(sourcePrefix)).append("\n");
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
    openapiFields.add("asnDetails");
    openapiFields.add("server");
    openapiFields.add("sourceIp");
    openapiFields.add("sourcePrefix");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PathVisBaseTestResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PathVisBaseTestResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PathVisBaseTestResult is not found in the empty JSON string", PathVisBaseTestResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PathVisBaseTestResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PathVisBaseTestResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // validate the optional field `asnDetails`
      if (jsonObj.get("asnDetails") != null && !jsonObj.get("asnDetails").isJsonNull()) {
        AsnDetails.validateJsonElement(jsonObj.get("asnDetails"));
      }
      if ((jsonObj.get("server") != null && !jsonObj.get("server").isJsonNull()) && !jsonObj.get("server").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server").toString()));
      }
      if ((jsonObj.get("sourceIp") != null && !jsonObj.get("sourceIp").isJsonNull()) && !jsonObj.get("sourceIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceIp").toString()));
      }
      if ((jsonObj.get("sourcePrefix") != null && !jsonObj.get("sourcePrefix").isJsonNull()) && !jsonObj.get("sourcePrefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourcePrefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourcePrefix").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PathVisBaseTestResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PathVisBaseTestResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PathVisBaseTestResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PathVisBaseTestResult.class));

       return (TypeAdapter<T>) new TypeAdapter<PathVisBaseTestResult>() {
           @Override
           public void write(JsonWriter out, PathVisBaseTestResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PathVisBaseTestResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PathVisBaseTestResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PathVisBaseTestResult
  * @throws IOException if the JSON string is invalid with respect to PathVisBaseTestResult
  */
  public static PathVisBaseTestResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PathVisBaseTestResult.class);
  }

 /**
  * Convert an instance of PathVisBaseTestResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

