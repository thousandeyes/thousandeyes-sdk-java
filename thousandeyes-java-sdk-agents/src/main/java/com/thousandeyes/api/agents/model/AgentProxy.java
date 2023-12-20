/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.agents.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.agents.model.ProxyAuthType;
import com.thousandeyes.api.agents.model.ProxyType;
import java.io.IOException;
import java.time.OffsetDateTime;
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

import com.thousandeyes.api.JSON;

/**
 * AgentProxy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:03.604841Z[Europe/Lisbon]")
public class AgentProxy {
  public static final String SERIALIZED_NAME_AID = "aid";
  @SerializedName(SERIALIZED_NAME_AID)
  private String aid;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "authType";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private ProxyAuthType authType;

  public static final String SERIALIZED_NAME_BYPASS_LIST = "bypassList";
  @SerializedName(SERIALIZED_NAME_BYPASS_LIST)
  private List<String> bypassList;

  public static final String SERIALIZED_NAME_LAST_MODIFIED = "lastModified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private OffsetDateTime lastModified;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_IS_LOCAL_CONFIGURED = "isLocalConfigured";
  @SerializedName(SERIALIZED_NAME_IS_LOCAL_CONFIGURED)
  private Boolean isLocalConfigured;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PROXY_ID = "proxyId";
  @SerializedName(SERIALIZED_NAME_PROXY_ID)
  private String proxyId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ProxyType type;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public AgentProxy() {
  }

  public AgentProxy aid(String aid) {
    
    this.aid = aid;
    return this;
  }

   /**
   * Account id that this proxy configuration belongs to
   * @return aid
  **/
  @javax.annotation.Nullable
  public String getAid() {
    return aid;
  }


  public void setAid(String aid) {
    this.aid = aid;
  }


  public AgentProxy authType(ProxyAuthType authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @javax.annotation.Nullable
  public ProxyAuthType getAuthType() {
    return authType;
  }


  public void setAuthType(ProxyAuthType authType) {
    this.authType = authType;
  }


  public AgentProxy bypassList(List<String> bypassList) {
    
    this.bypassList = bypassList;
    return this;
  }

  public AgentProxy addBypassListItem(String bypassListItem) {
    if (this.bypassList == null) {
      this.bypassList = new ArrayList<>();
    }
    this.bypassList.add(bypassListItem);
    return this;
  }

   /**
   * A list of hostnames, network prefixes, or wildcards used to determine which test targets should not be proxied. If all tests should be proxied, leave empty.
   * @return bypassList
  **/
  @javax.annotation.Nullable
  public List<String> getBypassList() {
    return bypassList;
  }


  public void setBypassList(List<String> bypassList) {
    this.bypassList = bypassList;
  }


  public AgentProxy lastModified(OffsetDateTime lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Last modification timestamp of the proxy. Expressed in UTC (ISO date-time format).
   * @return lastModified
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastModified() {
    return lastModified;
  }


  public void setLastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }


  public AgentProxy location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * The location of the proxy. If proxyType is &#x60;static&#x60; use the format &#x60;hostname:port&#x60;. If location is &#x60;pac&#x60;, then specify the URL where the PAC file can be obtained.
   * @return location
  **/
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public AgentProxy isLocalConfigured(Boolean isLocalConfigured) {
    
    this.isLocalConfigured = isLocalConfigured;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; if this proxy configuration comes from the agent’s config file. Specify &#x60;false&#x60; if the proxy configuration was created in the ThousandEyes application.
   * @return isLocalConfigured
  **/
  @javax.annotation.Nullable
  public Boolean getIsLocalConfigured() {
    return isLocalConfigured;
  }


  public void setIsLocalConfigured(Boolean isLocalConfigured) {
    this.isLocalConfigured = isLocalConfigured;
  }


  public AgentProxy name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Expression of agent notification rule.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AgentProxy password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password for proxy authentication
   * @return password
  **/
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public AgentProxy proxyId(String proxyId) {
    
    this.proxyId = proxyId;
    return this;
  }

   /**
   * Agent proxy&#39;s unique ID.
   * @return proxyId
  **/
  @javax.annotation.Nullable
  public String getProxyId() {
    return proxyId;
  }


  public void setProxyId(String proxyId) {
    this.proxyId = proxyId;
  }


  public AgentProxy type(ProxyType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public ProxyType getType() {
    return type;
  }


  public void setType(ProxyType type) {
    this.type = type;
  }


  public AgentProxy user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * Username for proxy authentication.
   * @return user
  **/
  @javax.annotation.Nullable
  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentProxy agentProxy = (AgentProxy) o;
    return Objects.equals(this.aid, agentProxy.aid) &&
        Objects.equals(this.authType, agentProxy.authType) &&
        Objects.equals(this.bypassList, agentProxy.bypassList) &&
        Objects.equals(this.lastModified, agentProxy.lastModified) &&
        Objects.equals(this.location, agentProxy.location) &&
        Objects.equals(this.isLocalConfigured, agentProxy.isLocalConfigured) &&
        Objects.equals(this.name, agentProxy.name) &&
        Objects.equals(this.password, agentProxy.password) &&
        Objects.equals(this.proxyId, agentProxy.proxyId) &&
        Objects.equals(this.type, agentProxy.type) &&
        Objects.equals(this.user, agentProxy.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, authType, bypassList, lastModified, location, isLocalConfigured, name, password, proxyId, type, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentProxy {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    bypassList: ").append(toIndentedString(bypassList)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    isLocalConfigured: ").append(toIndentedString(isLocalConfigured)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append("*").append("\n");
    sb.append("    proxyId: ").append(toIndentedString(proxyId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("aid");
    openapiFields.add("authType");
    openapiFields.add("bypassList");
    openapiFields.add("lastModified");
    openapiFields.add("location");
    openapiFields.add("isLocalConfigured");
    openapiFields.add("name");
    openapiFields.add("password");
    openapiFields.add("proxyId");
    openapiFields.add("type");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AgentProxy
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AgentProxy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgentProxy is not found in the empty JSON string", AgentProxy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AgentProxy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AgentProxy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("aid") != null && !jsonObj.get("aid").isJsonNull()) && !jsonObj.get("aid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aid").toString()));
      }
      // validate the optional field `authType`
      if (jsonObj.get("authType") != null && !jsonObj.get("authType").isJsonNull()) {
        ProxyAuthType.validateJsonElement(jsonObj.get("authType"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bypassList") != null && !jsonObj.get("bypassList").isJsonNull() && !jsonObj.get("bypassList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bypassList` to be an array in the JSON string but got `%s`", jsonObj.get("bypassList").toString()));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("proxyId") != null && !jsonObj.get("proxyId").isJsonNull()) && !jsonObj.get("proxyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proxyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proxyId").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        ProxyType.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentProxy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentProxy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentProxy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentProxy.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentProxy>() {
           @Override
           public void write(JsonWriter out, AgentProxy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentProxy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentProxy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentProxy
  * @throws IOException if the JSON string is invalid with respect to AgentProxy
  */
  public static AgentProxy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentProxy.class);
  }

 /**
  * Convert an instance of AgentProxy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

