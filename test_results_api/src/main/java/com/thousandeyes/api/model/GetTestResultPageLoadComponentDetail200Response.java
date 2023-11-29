/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
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
import com.thousandeyes.api.model.PageLoadDetailTestResult;
import com.thousandeyes.api.model.SelfLinksLinks;
import com.thousandeyes.api.model.SimpleTest;
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

import com.thousandeyes.JSON;

/**
 * GetTestResultPageLoadComponentDetail200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:31.708307Z[Europe/London]")
public class GetTestResultPageLoadComponentDetail200Response {
  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<PageLoadDetailTestResult> results;

  public static final String SERIALIZED_NAME_TEST = "test";
  @SerializedName(SERIALIZED_NAME_TEST)
  private SimpleTest test;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public GetTestResultPageLoadComponentDetail200Response() {
  }

  public GetTestResultPageLoadComponentDetail200Response results(List<PageLoadDetailTestResult> results) {
    
    this.results = results;
    return this;
  }

  public GetTestResultPageLoadComponentDetail200Response addResultsItem(PageLoadDetailTestResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  public List<PageLoadDetailTestResult> getResults() {
    return results;
  }


  public void setResults(List<PageLoadDetailTestResult> results) {
    this.results = results;
  }


  public GetTestResultPageLoadComponentDetail200Response test(SimpleTest test) {
    
    this.test = test;
    return this;
  }

   /**
   * Get test
   * @return test
  **/
  @javax.annotation.Nullable
  public SimpleTest getTest() {
    return test;
  }


  public void setTest(SimpleTest test) {
    this.test = test;
  }


  public GetTestResultPageLoadComponentDetail200Response links(SelfLinksLinks links) {
    
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
    GetTestResultPageLoadComponentDetail200Response getTestResultPageLoadComponentDetail200Response = (GetTestResultPageLoadComponentDetail200Response) o;
    return Objects.equals(this.results, getTestResultPageLoadComponentDetail200Response.results) &&
        Objects.equals(this.test, getTestResultPageLoadComponentDetail200Response.test) &&
        Objects.equals(this.links, getTestResultPageLoadComponentDetail200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, test, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTestResultPageLoadComponentDetail200Response {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
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
    openapiFields.add("results");
    openapiFields.add("test");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetTestResultPageLoadComponentDetail200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetTestResultPageLoadComponentDetail200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTestResultPageLoadComponentDetail200Response is not found in the empty JSON string", GetTestResultPageLoadComponentDetail200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetTestResultPageLoadComponentDetail200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTestResultPageLoadComponentDetail200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("results") != null && !jsonObj.get("results").isJsonNull()) {
        JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
        if (jsonArrayresults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("results").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
          }

          // validate the optional field `results` (array)
          for (int i = 0; i < jsonArrayresults.size(); i++) {
            PageLoadDetailTestResult.validateJsonElement(jsonArrayresults.get(i));
          };
        }
      }
      // validate the optional field `test`
      if (jsonObj.get("test") != null && !jsonObj.get("test").isJsonNull()) {
        SimpleTest.validateJsonElement(jsonObj.get("test"));
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
       if (!GetTestResultPageLoadComponentDetail200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTestResultPageLoadComponentDetail200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTestResultPageLoadComponentDetail200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTestResultPageLoadComponentDetail200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTestResultPageLoadComponentDetail200Response>() {
           @Override
           public void write(JsonWriter out, GetTestResultPageLoadComponentDetail200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTestResultPageLoadComponentDetail200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetTestResultPageLoadComponentDetail200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTestResultPageLoadComponentDetail200Response
  * @throws IOException if the JSON string is invalid with respect to GetTestResultPageLoadComponentDetail200Response
  */
  public static GetTestResultPageLoadComponentDetail200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTestResultPageLoadComponentDetail200Response.class);
  }

 /**
  * Convert an instance of GetTestResultPageLoadComponentDetail200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

