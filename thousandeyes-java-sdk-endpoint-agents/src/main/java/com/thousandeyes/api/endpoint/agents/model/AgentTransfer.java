/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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

import com.thousandeyes.api.endpoint.JSON;

/**
 * AgentTransfer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:28.978971Z[Europe/Lisbon]")
public class AgentTransfer {
  public static final String SERIALIZED_NAME_AGENT_ID = "agentId";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private String agentId;

  public static final String SERIALIZED_NAME_FROM_AID = "fromAid";
  @SerializedName(SERIALIZED_NAME_FROM_AID)
  private String fromAid;

  public static final String SERIALIZED_NAME_TO_AID = "toAid";
  @SerializedName(SERIALIZED_NAME_TO_AID)
  private String toAid;

  public AgentTransfer() {
  }

  
  public AgentTransfer(
     String agentId
  ) {
    this();
    this.agentId = agentId;
  }

   /**
   * Identifier of the agent this applies to.
   * @return agentId
  **/
  @javax.annotation.Nullable
  public String getAgentId() {
    return agentId;
  }




  public AgentTransfer fromAid(String fromAid) {
    
    this.fromAid = fromAid;
    return this;
  }

   /**
   * A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint.
   * @return fromAid
  **/
  @javax.annotation.Nullable
  public String getFromAid() {
    return fromAid;
  }


  public void setFromAid(String fromAid) {
    this.fromAid = fromAid;
  }


  public AgentTransfer toAid(String toAid) {
    
    this.toAid = toAid;
    return this;
  }

   /**
   * A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint.
   * @return toAid
  **/
  @javax.annotation.Nullable
  public String getToAid() {
    return toAid;
  }


  public void setToAid(String toAid) {
    this.toAid = toAid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentTransfer agentTransfer = (AgentTransfer) o;
    return Objects.equals(this.agentId, agentTransfer.agentId) &&
        Objects.equals(this.fromAid, agentTransfer.fromAid) &&
        Objects.equals(this.toAid, agentTransfer.toAid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, fromAid, toAid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentTransfer {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    fromAid: ").append(toIndentedString(fromAid)).append("\n");
    sb.append("    toAid: ").append(toIndentedString(toAid)).append("\n");
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
    openapiFields.add("fromAid");
    openapiFields.add("toAid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AgentTransfer
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AgentTransfer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgentTransfer is not found in the empty JSON string", AgentTransfer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AgentTransfer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AgentTransfer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("agentId") != null && !jsonObj.get("agentId").isJsonNull()) && !jsonObj.get("agentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agentId").toString()));
      }
      if ((jsonObj.get("fromAid") != null && !jsonObj.get("fromAid").isJsonNull()) && !jsonObj.get("fromAid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromAid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromAid").toString()));
      }
      if ((jsonObj.get("toAid") != null && !jsonObj.get("toAid").isJsonNull()) && !jsonObj.get("toAid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `toAid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("toAid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentTransfer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentTransfer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentTransfer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentTransfer.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentTransfer>() {
           @Override
           public void write(JsonWriter out, AgentTransfer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentTransfer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentTransfer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentTransfer
  * @throws IOException if the JSON string is invalid with respect to AgentTransfer
  */
  public static AgentTransfer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentTransfer.class);
  }

 /**
  * Convert an instance of AgentTransfer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

