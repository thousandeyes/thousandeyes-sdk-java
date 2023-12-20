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


package com.thousandeyes.api.internetinsights.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.internetinsights.model.ApiOutagesResponseAllOfOutagesInner;
import com.thousandeyes.api.internetinsights.model.SelfLinksLinks;
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
 * ApiOutagesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:28.694926Z[Europe/Lisbon]")
public class ApiOutagesResponse {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public static final String SERIALIZED_NAME_OUTAGES = "outages";
  @SerializedName(SERIALIZED_NAME_OUTAGES)
  private List<ApiOutagesResponseAllOfOutagesInner> outages;

  public ApiOutagesResponse() {
  }

  public ApiOutagesResponse links(SelfLinksLinks links) {
    
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


  public ApiOutagesResponse outages(List<ApiOutagesResponseAllOfOutagesInner> outages) {
    
    this.outages = outages;
    return this;
  }

  public ApiOutagesResponse addOutagesItem(ApiOutagesResponseAllOfOutagesInner outagesItem) {
    if (this.outages == null) {
      this.outages = new ArrayList<>();
    }
    this.outages.add(outagesItem);
    return this;
  }

   /**
   * List of application outages.
   * @return outages
  **/
  @javax.annotation.Nullable
  public List<ApiOutagesResponseAllOfOutagesInner> getOutages() {
    return outages;
  }


  public void setOutages(List<ApiOutagesResponseAllOfOutagesInner> outages) {
    this.outages = outages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiOutagesResponse apiOutagesResponse = (ApiOutagesResponse) o;
    return Objects.equals(this.links, apiOutagesResponse.links) &&
        Objects.equals(this.outages, apiOutagesResponse.outages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, outages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiOutagesResponse {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    outages: ").append(toIndentedString(outages)).append("\n");
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
    openapiFields.add("outages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiOutagesResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiOutagesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiOutagesResponse is not found in the empty JSON string", ApiOutagesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiOutagesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiOutagesResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        SelfLinksLinks.validateJsonElement(jsonObj.get("_links"));
      }
      if (jsonObj.get("outages") != null && !jsonObj.get("outages").isJsonNull()) {
        JsonArray jsonArrayoutages = jsonObj.getAsJsonArray("outages");
        if (jsonArrayoutages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("outages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `outages` to be an array in the JSON string but got `%s`", jsonObj.get("outages").toString()));
          }

          // validate the optional field `outages` (array)
          for (int i = 0; i < jsonArrayoutages.size(); i++) {
            ApiOutagesResponseAllOfOutagesInner.validateJsonElement(jsonArrayoutages.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiOutagesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiOutagesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiOutagesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiOutagesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiOutagesResponse>() {
           @Override
           public void write(JsonWriter out, ApiOutagesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiOutagesResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiOutagesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiOutagesResponse
  * @throws IOException if the JSON string is invalid with respect to ApiOutagesResponse
  */
  public static ApiOutagesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiOutagesResponse.class);
  }

 /**
  * Convert an instance of ApiOutagesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

