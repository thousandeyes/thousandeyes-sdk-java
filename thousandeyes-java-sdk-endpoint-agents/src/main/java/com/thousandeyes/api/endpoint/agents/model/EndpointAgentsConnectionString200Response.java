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
import com.thousandeyes.api.endpoint.agents.model.SelfLinksLinks;
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
 * EndpointAgentsConnectionString200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:28.978971Z[Europe/Lisbon]")
public class EndpointAgentsConnectionString200Response {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public static final String SERIALIZED_NAME_CONNECTION_STRING = "connectionString";
  @SerializedName(SERIALIZED_NAME_CONNECTION_STRING)
  private String connectionString;

  public EndpointAgentsConnectionString200Response() {
  }

  public EndpointAgentsConnectionString200Response links(SelfLinksLinks links) {
    
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


  public EndpointAgentsConnectionString200Response connectionString(String connectionString) {
    
    this.connectionString = connectionString;
    return this;
  }

   /**
   * The connection string is used for some integrations and other client types. 
   * @return connectionString
  **/
  @javax.annotation.Nullable
  public String getConnectionString() {
    return connectionString;
  }


  public void setConnectionString(String connectionString) {
    this.connectionString = connectionString;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgentsConnectionString200Response endpointAgentsConnectionString200Response = (EndpointAgentsConnectionString200Response) o;
    return Objects.equals(this.links, endpointAgentsConnectionString200Response.links) &&
        Objects.equals(this.connectionString, endpointAgentsConnectionString200Response.connectionString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, connectionString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgentsConnectionString200Response {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
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
    openapiFields.add("_links");
    openapiFields.add("connectionString");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EndpointAgentsConnectionString200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EndpointAgentsConnectionString200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointAgentsConnectionString200Response is not found in the empty JSON string", EndpointAgentsConnectionString200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EndpointAgentsConnectionString200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointAgentsConnectionString200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        SelfLinksLinks.validateJsonElement(jsonObj.get("_links"));
      }
      if ((jsonObj.get("connectionString") != null && !jsonObj.get("connectionString").isJsonNull()) && !jsonObj.get("connectionString").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connectionString` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connectionString").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointAgentsConnectionString200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointAgentsConnectionString200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointAgentsConnectionString200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointAgentsConnectionString200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointAgentsConnectionString200Response>() {
           @Override
           public void write(JsonWriter out, EndpointAgentsConnectionString200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointAgentsConnectionString200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EndpointAgentsConnectionString200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EndpointAgentsConnectionString200Response
  * @throws IOException if the JSON string is invalid with respect to EndpointAgentsConnectionString200Response
  */
  public static EndpointAgentsConnectionString200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointAgentsConnectionString200Response.class);
  }

 /**
  * Convert an instance of EndpointAgentsConnectionString200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

