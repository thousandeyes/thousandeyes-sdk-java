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
import com.thousandeyes.api.tests.model.VoiceTest;
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
 * GetVoiceTests200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:06.198107Z[Europe/Lisbon]")
public class GetVoiceTests200Response {
  public static final String SERIALIZED_NAME_TESTS = "tests";
  @SerializedName(SERIALIZED_NAME_TESTS)
  private List<VoiceTest> tests;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public GetVoiceTests200Response() {
  }

  public GetVoiceTests200Response tests(List<VoiceTest> tests) {
    
    this.tests = tests;
    return this;
  }

  public GetVoiceTests200Response addTestsItem(VoiceTest testsItem) {
    if (this.tests == null) {
      this.tests = new ArrayList<>();
    }
    this.tests.add(testsItem);
    return this;
  }

   /**
   * Get tests
   * @return tests
  **/
  @javax.annotation.Nullable
  public List<VoiceTest> getTests() {
    return tests;
  }


  public void setTests(List<VoiceTest> tests) {
    this.tests = tests;
  }


  public GetVoiceTests200Response links(SelfLinksLinks links) {
    
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
    GetVoiceTests200Response getVoiceTests200Response = (GetVoiceTests200Response) o;
    return Objects.equals(this.tests, getVoiceTests200Response.tests) &&
        Objects.equals(this.links, getVoiceTests200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tests, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetVoiceTests200Response {\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
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
    openapiFields.add("tests");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetVoiceTests200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetVoiceTests200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetVoiceTests200Response is not found in the empty JSON string", GetVoiceTests200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetVoiceTests200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetVoiceTests200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("tests") != null && !jsonObj.get("tests").isJsonNull()) {
        JsonArray jsonArraytests = jsonObj.getAsJsonArray("tests");
        if (jsonArraytests != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tests").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tests` to be an array in the JSON string but got `%s`", jsonObj.get("tests").toString()));
          }

          // validate the optional field `tests` (array)
          for (int i = 0; i < jsonArraytests.size(); i++) {
            VoiceTest.validateJsonElement(jsonArraytests.get(i));
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
       if (!GetVoiceTests200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetVoiceTests200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetVoiceTests200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetVoiceTests200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetVoiceTests200Response>() {
           @Override
           public void write(JsonWriter out, GetVoiceTests200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetVoiceTests200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetVoiceTests200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetVoiceTests200Response
  * @throws IOException if the JSON string is invalid with respect to GetVoiceTests200Response
  */
  public static GetVoiceTests200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetVoiceTests200Response.class);
  }

 /**
  * Convert an instance of GetVoiceTests200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

