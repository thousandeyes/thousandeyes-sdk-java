/*
 * Tests API
 *  ### Overview This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.tests.model.SelfLinksLinks;
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
 * UpdatePathVisInterfaceGroup200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:33.205984Z[Europe/Lisbon]")
public class UpdatePathVisInterfaceGroup200Response {
  public static final String SERIALIZED_NAME_AID = "aid";
  @SerializedName(SERIALIZED_NAME_AID)
  private String aid;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_GROUP_NAME = "groupName";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_IP_ADDRESSES = "ipAddresses";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESSES)
  private List<String> ipAddresses;

  public static final String SERIALIZED_NAME_RDNS_REGEXES = "rdnsRegexes";
  @SerializedName(SERIALIZED_NAME_RDNS_REGEXES)
  private List<String> rdnsRegexes;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public UpdatePathVisInterfaceGroup200Response() {
  }

  
  public UpdatePathVisInterfaceGroup200Response(
     String aid, 
     String groupId, 
     List<String> rdnsRegexes
  ) {
    this();
    this.aid = aid;
    this.groupId = groupId;
    this.rdnsRegexes = rdnsRegexes;
  }

   /**
   * Account Group Id
   * @return aid
  **/
  @javax.annotation.Nullable
  public String getAid() {
    return aid;
  }




   /**
   * Group ID
   * @return groupId
  **/
  @javax.annotation.Nullable
  public String getGroupId() {
    return groupId;
  }




  public UpdatePathVisInterfaceGroup200Response groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * Name of the path visualization interface group
   * @return groupName
  **/
  @javax.annotation.Nullable
  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public UpdatePathVisInterfaceGroup200Response ipAddresses(List<String> ipAddresses) {
    
    this.ipAddresses = ipAddresses;
    return this;
  }

  public UpdatePathVisInterfaceGroup200Response addIpAddressesItem(String ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

   /**
   * Array of IP addresses associated with the interface group
   * @return ipAddresses
  **/
  @javax.annotation.Nullable
  public List<String> getIpAddresses() {
    return ipAddresses;
  }


  public void setIpAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }


   /**
   * Array of RDNS Regexes associated with the interface group
   * @return rdnsRegexes
  **/
  @javax.annotation.Nullable
  public List<String> getRdnsRegexes() {
    return rdnsRegexes;
  }




  public UpdatePathVisInterfaceGroup200Response links(SelfLinksLinks links) {
    
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
    UpdatePathVisInterfaceGroup200Response updatePathVisInterfaceGroup200Response = (UpdatePathVisInterfaceGroup200Response) o;
    return Objects.equals(this.aid, updatePathVisInterfaceGroup200Response.aid) &&
        Objects.equals(this.groupId, updatePathVisInterfaceGroup200Response.groupId) &&
        Objects.equals(this.groupName, updatePathVisInterfaceGroup200Response.groupName) &&
        Objects.equals(this.ipAddresses, updatePathVisInterfaceGroup200Response.ipAddresses) &&
        Objects.equals(this.rdnsRegexes, updatePathVisInterfaceGroup200Response.rdnsRegexes) &&
        Objects.equals(this.links, updatePathVisInterfaceGroup200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, groupId, groupName, ipAddresses, rdnsRegexes, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePathVisInterfaceGroup200Response {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    rdnsRegexes: ").append(toIndentedString(rdnsRegexes)).append("\n");
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
    openapiFields.add("groupId");
    openapiFields.add("groupName");
    openapiFields.add("ipAddresses");
    openapiFields.add("rdnsRegexes");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdatePathVisInterfaceGroup200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdatePathVisInterfaceGroup200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePathVisInterfaceGroup200Response is not found in the empty JSON string", UpdatePathVisInterfaceGroup200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdatePathVisInterfaceGroup200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdatePathVisInterfaceGroup200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("aid") != null && !jsonObj.get("aid").isJsonNull()) && !jsonObj.get("aid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aid").toString()));
      }
      if ((jsonObj.get("groupId") != null && !jsonObj.get("groupId").isJsonNull()) && !jsonObj.get("groupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupId").toString()));
      }
      if ((jsonObj.get("groupName") != null && !jsonObj.get("groupName").isJsonNull()) && !jsonObj.get("groupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ipAddresses") != null && !jsonObj.get("ipAddresses").isJsonNull() && !jsonObj.get("ipAddresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("ipAddresses").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rdnsRegexes") != null && !jsonObj.get("rdnsRegexes").isJsonNull() && !jsonObj.get("rdnsRegexes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rdnsRegexes` to be an array in the JSON string but got `%s`", jsonObj.get("rdnsRegexes").toString()));
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
       if (!UpdatePathVisInterfaceGroup200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePathVisInterfaceGroup200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePathVisInterfaceGroup200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePathVisInterfaceGroup200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePathVisInterfaceGroup200Response>() {
           @Override
           public void write(JsonWriter out, UpdatePathVisInterfaceGroup200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatePathVisInterfaceGroup200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdatePathVisInterfaceGroup200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdatePathVisInterfaceGroup200Response
  * @throws IOException if the JSON string is invalid with respect to UpdatePathVisInterfaceGroup200Response
  */
  public static UpdatePathVisInterfaceGroup200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePathVisInterfaceGroup200Response.class);
  }

 /**
  * Convert an instance of UpdatePathVisInterfaceGroup200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

