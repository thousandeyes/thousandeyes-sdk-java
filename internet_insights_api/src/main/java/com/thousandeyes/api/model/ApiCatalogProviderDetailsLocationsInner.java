/*
 * Internet Insights API
 * # Overview We are happy to announce the release of the Internet Insights API set. This limited release includes endpoints that: * Make our catalog provider and Internet outage data accessible to API users. * Provide access to advanced filtering, which is part of our next-generation API efforts to allow API users to fine-tune queries across all of our APIs in a consistent manner.  Internet Insights provide visibility into core Internet infrastructure, including: ISPs, DNS providers, IaaS, CDNs , and SaaS providers. It tracks the macro-level impact of Internet events on individual users and enterprise networks connecting at the edge of the Internet. These events include: Outages, Routing hijacks and leaks, DDoS attacks, And political interference, among others.  Future releases of the Internet Insights API set will further unlock access to core Internet Insights functionality, unlocking potential integrations to enrich customer process flows. 
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

import com.thousandeyes.JSON;

/**
 * ApiCatalogProviderDetailsLocationsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:42.909342Z[Europe/London]")
public class ApiCatalogProviderDetailsLocationsInner {
  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_INTERFACES_COUNT = "interfacesCount";
  @SerializedName(SERIALIZED_NAME_INTERFACES_COUNT)
  private Integer interfacesCount;

  public ApiCatalogProviderDetailsLocationsInner() {
  }

  public ApiCatalogProviderDetailsLocationsInner location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * The location covered by the Provider.
   * @return location
  **/
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public ApiCatalogProviderDetailsLocationsInner interfacesCount(Integer interfacesCount) {
    
    this.interfacesCount = interfacesCount;
    return this;
  }

   /**
   * The number of interfaces covered by the Provider at this location.
   * @return interfacesCount
  **/
  @javax.annotation.Nullable
  public Integer getInterfacesCount() {
    return interfacesCount;
  }


  public void setInterfacesCount(Integer interfacesCount) {
    this.interfacesCount = interfacesCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCatalogProviderDetailsLocationsInner apiCatalogProviderDetailsLocationsInner = (ApiCatalogProviderDetailsLocationsInner) o;
    return Objects.equals(this.location, apiCatalogProviderDetailsLocationsInner.location) &&
        Objects.equals(this.interfacesCount, apiCatalogProviderDetailsLocationsInner.interfacesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, interfacesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCatalogProviderDetailsLocationsInner {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    interfacesCount: ").append(toIndentedString(interfacesCount)).append("\n");
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
    openapiFields.add("interfacesCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiCatalogProviderDetailsLocationsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiCatalogProviderDetailsLocationsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiCatalogProviderDetailsLocationsInner is not found in the empty JSON string", ApiCatalogProviderDetailsLocationsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiCatalogProviderDetailsLocationsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiCatalogProviderDetailsLocationsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiCatalogProviderDetailsLocationsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiCatalogProviderDetailsLocationsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiCatalogProviderDetailsLocationsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiCatalogProviderDetailsLocationsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiCatalogProviderDetailsLocationsInner>() {
           @Override
           public void write(JsonWriter out, ApiCatalogProviderDetailsLocationsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiCatalogProviderDetailsLocationsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiCatalogProviderDetailsLocationsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiCatalogProviderDetailsLocationsInner
  * @throws IOException if the JSON string is invalid with respect to ApiCatalogProviderDetailsLocationsInner
  */
  public static ApiCatalogProviderDetailsLocationsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiCatalogProviderDetailsLocationsInner.class);
  }

 /**
  * Convert an instance of ApiCatalogProviderDetailsLocationsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

