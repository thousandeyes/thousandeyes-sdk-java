/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API.  This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.administrative.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.administrative.model.EnterpriseAgent;
import com.thousandeyes.api.administrative.model.SelfLinksLinks;
import com.thousandeyes.api.administrative.model.UserAccountGroup;
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

import com.thousandeyes.api.JSON;

/**
 * GetAccountGroup200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:29.770800Z[Europe/Lisbon]")
public class GetAccountGroup200Response {
  public static final String SERIALIZED_NAME_AID = "aid";
  @SerializedName(SERIALIZED_NAME_AID)
  private String aid;

  public static final String SERIALIZED_NAME_ACCOUNT_GROUP_NAME = "accountGroupName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GROUP_NAME)
  private String accountGroupName;

  public static final String SERIALIZED_NAME_IS_CURRENT_ACCOUNT_GROUP = "isCurrentAccountGroup";
  @SerializedName(SERIALIZED_NAME_IS_CURRENT_ACCOUNT_GROUP)
  private Boolean isCurrentAccountGroup;

  public static final String SERIALIZED_NAME_IS_DEFAULT_ACCOUNT_GROUP = "isDefaultAccountGroup";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT_ACCOUNT_GROUP)
  private Boolean isDefaultAccountGroup;

  public static final String SERIALIZED_NAME_ORGANIZATION_NAME = "organizationName";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_NAME)
  private String organizationName;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<UserAccountGroup> users;

  public static final String SERIALIZED_NAME_AGENTS = "agents";
  @SerializedName(SERIALIZED_NAME_AGENTS)
  private List<EnterpriseAgent> agents;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public GetAccountGroup200Response() {
  }

  public GetAccountGroup200Response aid(String aid) {
    
    this.aid = aid;
    return this;
  }

   /**
   * A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint.
   * @return aid
  **/
  @javax.annotation.Nullable
  public String getAid() {
    return aid;
  }


  public void setAid(String aid) {
    this.aid = aid;
  }


  public GetAccountGroup200Response accountGroupName(String accountGroupName) {
    
    this.accountGroupName = accountGroupName;
    return this;
  }

   /**
   * Account group name
   * @return accountGroupName
  **/
  @javax.annotation.Nullable
  public String getAccountGroupName() {
    return accountGroupName;
  }


  public void setAccountGroupName(String accountGroupName) {
    this.accountGroupName = accountGroupName;
  }


  public GetAccountGroup200Response isCurrentAccountGroup(Boolean isCurrentAccountGroup) {
    
    this.isCurrentAccountGroup = isCurrentAccountGroup;
    return this;
  }

   /**
   * Indicates whether the requested aid is the context of the current account.
   * @return isCurrentAccountGroup
  **/
  @javax.annotation.Nullable
  public Boolean getIsCurrentAccountGroup() {
    return isCurrentAccountGroup;
  }


  public void setIsCurrentAccountGroup(Boolean isCurrentAccountGroup) {
    this.isCurrentAccountGroup = isCurrentAccountGroup;
  }


  public GetAccountGroup200Response isDefaultAccountGroup(Boolean isDefaultAccountGroup) {
    
    this.isDefaultAccountGroup = isDefaultAccountGroup;
    return this;
  }

   /**
   * Indicates whether the aid is the default one for the requesting user.
   * @return isDefaultAccountGroup
  **/
  @javax.annotation.Nullable
  public Boolean getIsDefaultAccountGroup() {
    return isDefaultAccountGroup;
  }


  public void setIsDefaultAccountGroup(Boolean isDefaultAccountGroup) {
    this.isDefaultAccountGroup = isDefaultAccountGroup;
  }


  public GetAccountGroup200Response organizationName(String organizationName) {
    
    this.organizationName = organizationName;
    return this;
  }

   /**
   * (Optional) Indicates whether the aid is the default one for the requesting user.
   * @return organizationName
  **/
  @javax.annotation.Nullable
  public String getOrganizationName() {
    return organizationName;
  }


  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }


  public GetAccountGroup200Response users(List<UserAccountGroup> users) {
    
    this.users = users;
    return this;
  }

  public GetAccountGroup200Response addUsersItem(UserAccountGroup usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @javax.annotation.Nullable
  public List<UserAccountGroup> getUsers() {
    return users;
  }


  public void setUsers(List<UserAccountGroup> users) {
    this.users = users;
  }


  public GetAccountGroup200Response agents(List<EnterpriseAgent> agents) {
    
    this.agents = agents;
    return this;
  }

  public GetAccountGroup200Response addAgentsItem(EnterpriseAgent agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * Get agents
   * @return agents
  **/
  @javax.annotation.Nullable
  public List<EnterpriseAgent> getAgents() {
    return agents;
  }


  public void setAgents(List<EnterpriseAgent> agents) {
    this.agents = agents;
  }


  public GetAccountGroup200Response links(SelfLinksLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public SelfLinksLinks getLinks() {
    return links;
  }


  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountGroup200Response getAccountGroup200Response = (GetAccountGroup200Response) o;
    return Objects.equals(this.aid, getAccountGroup200Response.aid) &&
        Objects.equals(this.accountGroupName, getAccountGroup200Response.accountGroupName) &&
        Objects.equals(this.isCurrentAccountGroup, getAccountGroup200Response.isCurrentAccountGroup) &&
        Objects.equals(this.isDefaultAccountGroup, getAccountGroup200Response.isDefaultAccountGroup) &&
        Objects.equals(this.organizationName, getAccountGroup200Response.organizationName) &&
        Objects.equals(this.users, getAccountGroup200Response.users) &&
        Objects.equals(this.agents, getAccountGroup200Response.agents) &&
        Objects.equals(this.links, getAccountGroup200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, accountGroupName, isCurrentAccountGroup, isDefaultAccountGroup, organizationName, users, agents, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountGroup200Response {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    accountGroupName: ").append(toIndentedString(accountGroupName)).append("\n");
    sb.append("    isCurrentAccountGroup: ").append(toIndentedString(isCurrentAccountGroup)).append("\n");
    sb.append("    isDefaultAccountGroup: ").append(toIndentedString(isDefaultAccountGroup)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("accountGroupName");
    openapiFields.add("isCurrentAccountGroup");
    openapiFields.add("isDefaultAccountGroup");
    openapiFields.add("organizationName");
    openapiFields.add("users");
    openapiFields.add("agents");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetAccountGroup200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetAccountGroup200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAccountGroup200Response is not found in the empty JSON string", GetAccountGroup200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetAccountGroup200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAccountGroup200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("aid") != null && !jsonObj.get("aid").isJsonNull()) && !jsonObj.get("aid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aid").toString()));
      }
      if ((jsonObj.get("accountGroupName") != null && !jsonObj.get("accountGroupName").isJsonNull()) && !jsonObj.get("accountGroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountGroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountGroupName").toString()));
      }
      if ((jsonObj.get("organizationName") != null && !jsonObj.get("organizationName").isJsonNull()) && !jsonObj.get("organizationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organizationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organizationName").toString()));
      }
      if (jsonObj.get("users") != null && !jsonObj.get("users").isJsonNull()) {
        JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
        if (jsonArrayusers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("users").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
          }

          // validate the optional field `users` (array)
          for (int i = 0; i < jsonArrayusers.size(); i++) {
            UserAccountGroup.validateJsonElement(jsonArrayusers.get(i));
          };
        }
      }
      if (jsonObj.get("agents") != null && !jsonObj.get("agents").isJsonNull()) {
        JsonArray jsonArrayagents = jsonObj.getAsJsonArray("agents");
        if (jsonArrayagents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("agents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `agents` to be an array in the JSON string but got `%s`", jsonObj.get("agents").toString()));
          }

          // validate the optional field `agents` (array)
          for (int i = 0; i < jsonArrayagents.size(); i++) {
            EnterpriseAgent.validateJsonElement(jsonArrayagents.get(i));
          };
        }
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        SelfLinksLinks.validateJsonElement(jsonObj.get("_links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAccountGroup200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAccountGroup200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAccountGroup200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAccountGroup200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAccountGroup200Response>() {
           @Override
           public void write(JsonWriter out, GetAccountGroup200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAccountGroup200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetAccountGroup200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAccountGroup200Response
  * @throws IOException if the JSON string is invalid with respect to GetAccountGroup200Response
  */
  public static GetAccountGroup200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAccountGroup200Response.class);
  }

 /**
  * Convert an instance of GetAccountGroup200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

