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
import com.thousandeyes.api.model.NetworkMetrics;
import com.thousandeyes.api.model.SystemMetrics;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * RealUserTestNetworkResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:40.551124Z[Europe/London]")
public class RealUserTestNetworkResult {
  public static final String SERIALIZED_NAME_AGENT_ID = "agentId";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private UUID agentId;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ROUND_ID = "roundId";
  @SerializedName(SERIALIZED_NAME_ROUND_ID)
  private Integer roundId;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private NetworkMetrics destination;

  public static final String SERIALIZED_NAME_VPN = "vpn";
  @SerializedName(SERIALIZED_NAME_VPN)
  private NetworkMetrics vpn;

  public static final String SERIALIZED_NAME_PROXY = "proxy";
  @SerializedName(SERIALIZED_NAME_PROXY)
  private NetworkMetrics proxy;

  public static final String SERIALIZED_NAME_SYSTEM_METRICS = "systemMetrics";
  @SerializedName(SERIALIZED_NAME_SYSTEM_METRICS)
  private SystemMetrics systemMetrics;

  public RealUserTestNetworkResult() {
  }

  
  public RealUserTestNetworkResult(
     UUID agentId, 
     OffsetDateTime date, 
     String id, 
     Integer roundId
  ) {
    this();
    this.agentId = agentId;
    this.date = date;
    this.id = id;
    this.roundId = roundId;
  }

   /**
   * Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint.
   * @return agentId
  **/
  @javax.annotation.Nullable
  public UUID getAgentId() {
    return agentId;
  }




   /**
   * UTC date when endpoint real user test took place (ISO date-time format).
   * @return date
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDate() {
    return date;
  }




   /**
   * Endpoint real user test ID. Each endpoint real user test occurrence has a unique ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }




   /**
   * Epoch time (seconds) indicating the start time of the round.
   * @return roundId
  **/
  @javax.annotation.Nullable
  public Integer getRoundId() {
    return roundId;
  }




  public RealUserTestNetworkResult destination(NetworkMetrics destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nullable
  public NetworkMetrics getDestination() {
    return destination;
  }


  public void setDestination(NetworkMetrics destination) {
    this.destination = destination;
  }


  public RealUserTestNetworkResult vpn(NetworkMetrics vpn) {
    
    this.vpn = vpn;
    return this;
  }

   /**
   * Get vpn
   * @return vpn
  **/
  @javax.annotation.Nullable
  public NetworkMetrics getVpn() {
    return vpn;
  }


  public void setVpn(NetworkMetrics vpn) {
    this.vpn = vpn;
  }


  public RealUserTestNetworkResult proxy(NetworkMetrics proxy) {
    
    this.proxy = proxy;
    return this;
  }

   /**
   * Get proxy
   * @return proxy
  **/
  @javax.annotation.Nullable
  public NetworkMetrics getProxy() {
    return proxy;
  }


  public void setProxy(NetworkMetrics proxy) {
    this.proxy = proxy;
  }


  public RealUserTestNetworkResult systemMetrics(SystemMetrics systemMetrics) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealUserTestNetworkResult realUserTestNetworkResult = (RealUserTestNetworkResult) o;
    return Objects.equals(this.agentId, realUserTestNetworkResult.agentId) &&
        Objects.equals(this.date, realUserTestNetworkResult.date) &&
        Objects.equals(this.id, realUserTestNetworkResult.id) &&
        Objects.equals(this.roundId, realUserTestNetworkResult.roundId) &&
        Objects.equals(this.destination, realUserTestNetworkResult.destination) &&
        Objects.equals(this.vpn, realUserTestNetworkResult.vpn) &&
        Objects.equals(this.proxy, realUserTestNetworkResult.proxy) &&
        Objects.equals(this.systemMetrics, realUserTestNetworkResult.systemMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, date, id, roundId, destination, vpn, proxy, systemMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealUserTestNetworkResult {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    vpn: ").append(toIndentedString(vpn)).append("\n");
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
    sb.append("    systemMetrics: ").append(toIndentedString(systemMetrics)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("id");
    openapiFields.add("roundId");
    openapiFields.add("destination");
    openapiFields.add("vpn");
    openapiFields.add("proxy");
    openapiFields.add("systemMetrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RealUserTestNetworkResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RealUserTestNetworkResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RealUserTestNetworkResult is not found in the empty JSON string", RealUserTestNetworkResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RealUserTestNetworkResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RealUserTestNetworkResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("agentId") != null && !jsonObj.get("agentId").isJsonNull()) && !jsonObj.get("agentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agentId").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `destination`
      if (jsonObj.get("destination") != null && !jsonObj.get("destination").isJsonNull()) {
        NetworkMetrics.validateJsonElement(jsonObj.get("destination"));
      }
      // validate the optional field `vpn`
      if (jsonObj.get("vpn") != null && !jsonObj.get("vpn").isJsonNull()) {
        NetworkMetrics.validateJsonElement(jsonObj.get("vpn"));
      }
      // validate the optional field `proxy`
      if (jsonObj.get("proxy") != null && !jsonObj.get("proxy").isJsonNull()) {
        NetworkMetrics.validateJsonElement(jsonObj.get("proxy"));
      }
      // validate the optional field `systemMetrics`
      if (jsonObj.get("systemMetrics") != null && !jsonObj.get("systemMetrics").isJsonNull()) {
        SystemMetrics.validateJsonElement(jsonObj.get("systemMetrics"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RealUserTestNetworkResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RealUserTestNetworkResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RealUserTestNetworkResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RealUserTestNetworkResult.class));

       return (TypeAdapter<T>) new TypeAdapter<RealUserTestNetworkResult>() {
           @Override
           public void write(JsonWriter out, RealUserTestNetworkResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RealUserTestNetworkResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RealUserTestNetworkResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RealUserTestNetworkResult
  * @throws IOException if the JSON string is invalid with respect to RealUserTestNetworkResult
  */
  public static RealUserTestNetworkResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RealUserTestNetworkResult.class);
  }

 /**
  * Convert an instance of RealUserTestNetworkResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

