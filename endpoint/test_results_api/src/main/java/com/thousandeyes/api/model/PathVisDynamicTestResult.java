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
import com.thousandeyes.api.model.DynamicBaseTestResultWebex;
import com.thousandeyes.api.model.DynamicTestApplication;
import com.thousandeyes.api.model.PathVisEndpoint;
import com.thousandeyes.api.model.SystemMetrics;
import com.thousandeyes.api.model.VpnProfile;
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
 * PathVisDynamicTestResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:40.551124Z[Europe/London]")
public class PathVisDynamicTestResult {
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

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private DynamicTestApplication application;

  public static final String SERIALIZED_NAME_WEBEX = "webex";
  @SerializedName(SERIALIZED_NAME_WEBEX)
  private DynamicBaseTestResultWebex webex;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_ENDPOINTS = "endpoints";
  @SerializedName(SERIALIZED_NAME_ENDPOINTS)
  private List<PathVisEndpoint> endpoints;

  public PathVisDynamicTestResult() {
  }

  
  public PathVisDynamicTestResult(
     UUID agentId, 
     Integer roundId, 
     String serverIp, 
     String server, 
     String sourceIp, 
     String sourcePrefix, 
     String location
  ) {
    this();
    this.agentId = agentId;
    this.roundId = roundId;
    this.serverIp = serverIp;
    this.server = server;
    this.sourceIp = sourceIp;
    this.sourcePrefix = sourcePrefix;
    this.location = location;
  }

   /**
   * Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint.
   * @return agentId
  **/
  @javax.annotation.Nullable
  public UUID getAgentId() {
    return agentId;
  }




  public PathVisDynamicTestResult aid(AccountGroupId aid) {
    
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




  public PathVisDynamicTestResult systemMetrics(SystemMetrics systemMetrics) {
    
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


  public PathVisDynamicTestResult vpnProfile(VpnProfile vpnProfile) {
    
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


  public PathVisDynamicTestResult asnDetails(AsnDetails asnDetails) {
    
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




  public PathVisDynamicTestResult application(DynamicTestApplication application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @javax.annotation.Nullable
  public DynamicTestApplication getApplication() {
    return application;
  }


  public void setApplication(DynamicTestApplication application) {
    this.application = application;
  }


  public PathVisDynamicTestResult webex(DynamicBaseTestResultWebex webex) {
    
    this.webex = webex;
    return this;
  }

   /**
   * Get webex
   * @return webex
  **/
  @javax.annotation.Nullable
  public DynamicBaseTestResultWebex getWebex() {
    return webex;
  }


  public void setWebex(DynamicBaseTestResultWebex webex) {
    this.webex = webex;
  }


   /**
   * Geographic location of the pathvis.
   * @return location
  **/
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }




  public PathVisDynamicTestResult endpoints(List<PathVisEndpoint> endpoints) {
    
    this.endpoints = endpoints;
    return this;
  }

  public PathVisDynamicTestResult addEndpointsItem(PathVisEndpoint endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<>();
    }
    this.endpoints.add(endpointsItem);
    return this;
  }

   /**
   * Shows an iteration of path trace, with each iteration specified by a pathId.
   * @return endpoints
  **/
  @javax.annotation.Nullable
  public List<PathVisEndpoint> getEndpoints() {
    return endpoints;
  }


  public void setEndpoints(List<PathVisEndpoint> endpoints) {
    this.endpoints = endpoints;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathVisDynamicTestResult pathVisDynamicTestResult = (PathVisDynamicTestResult) o;
    return Objects.equals(this.agentId, pathVisDynamicTestResult.agentId) &&
        Objects.equals(this.aid, pathVisDynamicTestResult.aid) &&
        Objects.equals(this.roundId, pathVisDynamicTestResult.roundId) &&
        Objects.equals(this.serverIp, pathVisDynamicTestResult.serverIp) &&
        Objects.equals(this.systemMetrics, pathVisDynamicTestResult.systemMetrics) &&
        Objects.equals(this.vpnProfile, pathVisDynamicTestResult.vpnProfile) &&
        Objects.equals(this.asnDetails, pathVisDynamicTestResult.asnDetails) &&
        Objects.equals(this.server, pathVisDynamicTestResult.server) &&
        Objects.equals(this.sourceIp, pathVisDynamicTestResult.sourceIp) &&
        Objects.equals(this.sourcePrefix, pathVisDynamicTestResult.sourcePrefix) &&
        Objects.equals(this.application, pathVisDynamicTestResult.application) &&
        Objects.equals(this.webex, pathVisDynamicTestResult.webex) &&
        Objects.equals(this.location, pathVisDynamicTestResult.location) &&
        Objects.equals(this.endpoints, pathVisDynamicTestResult.endpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, aid, roundId, serverIp, systemMetrics, vpnProfile, asnDetails, server, sourceIp, sourcePrefix, application, webex, location, endpoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathVisDynamicTestResult {\n");
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
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    webex: ").append(toIndentedString(webex)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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
    openapiFields.add("application");
    openapiFields.add("webex");
    openapiFields.add("location");
    openapiFields.add("endpoints");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PathVisDynamicTestResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PathVisDynamicTestResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PathVisDynamicTestResult is not found in the empty JSON string", PathVisDynamicTestResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PathVisDynamicTestResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PathVisDynamicTestResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // validate the optional field `webex`
      if (jsonObj.get("webex") != null && !jsonObj.get("webex").isJsonNull()) {
        DynamicBaseTestResultWebex.validateJsonElement(jsonObj.get("webex"));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if (jsonObj.get("endpoints") != null && !jsonObj.get("endpoints").isJsonNull()) {
        JsonArray jsonArrayendpoints = jsonObj.getAsJsonArray("endpoints");
        if (jsonArrayendpoints != null) {
          // ensure the json data is an array
          if (!jsonObj.get("endpoints").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `endpoints` to be an array in the JSON string but got `%s`", jsonObj.get("endpoints").toString()));
          }

          // validate the optional field `endpoints` (array)
          for (int i = 0; i < jsonArrayendpoints.size(); i++) {
            PathVisEndpoint.validateJsonElement(jsonArrayendpoints.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PathVisDynamicTestResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PathVisDynamicTestResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PathVisDynamicTestResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PathVisDynamicTestResult.class));

       return (TypeAdapter<T>) new TypeAdapter<PathVisDynamicTestResult>() {
           @Override
           public void write(JsonWriter out, PathVisDynamicTestResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PathVisDynamicTestResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PathVisDynamicTestResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PathVisDynamicTestResult
  * @throws IOException if the JSON string is invalid with respect to PathVisDynamicTestResult
  */
  public static PathVisDynamicTestResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PathVisDynamicTestResult.class);
  }

 /**
  * Convert an instance of PathVisDynamicTestResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

