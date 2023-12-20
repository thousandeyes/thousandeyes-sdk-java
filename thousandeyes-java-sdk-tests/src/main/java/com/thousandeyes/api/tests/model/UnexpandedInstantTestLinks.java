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
import com.thousandeyes.api.tests.model.UnexpandedInstantTestLinksSelf;
import com.thousandeyes.api.tests.model.UnexpandedInstantTestLinksTestResults;
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

import com.thousandeyes.api.JSON;

/**
 * A list of links that can be accessed to get more information
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:06.198107Z[Europe/Lisbon]")
public class UnexpandedInstantTestLinks {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private UnexpandedInstantTestLinksSelf self;

  public static final String SERIALIZED_NAME_TEST_RESULTS = "testResults";
  @SerializedName(SERIALIZED_NAME_TEST_RESULTS)
  private UnexpandedInstantTestLinksTestResults testResults;

  public UnexpandedInstantTestLinks() {
  }

  public UnexpandedInstantTestLinks self(UnexpandedInstantTestLinksSelf self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  public UnexpandedInstantTestLinksSelf getSelf() {
    return self;
  }


  public void setSelf(UnexpandedInstantTestLinksSelf self) {
    this.self = self;
  }


  public UnexpandedInstantTestLinks testResults(UnexpandedInstantTestLinksTestResults testResults) {
    
    this.testResults = testResults;
    return this;
  }

   /**
   * Get testResults
   * @return testResults
  **/
  @javax.annotation.Nullable
  public UnexpandedInstantTestLinksTestResults getTestResults() {
    return testResults;
  }


  public void setTestResults(UnexpandedInstantTestLinksTestResults testResults) {
    this.testResults = testResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnexpandedInstantTestLinks unexpandedInstantTestLinks = (UnexpandedInstantTestLinks) o;
    return Objects.equals(this.self, unexpandedInstantTestLinks.self) &&
        Objects.equals(this.testResults, unexpandedInstantTestLinks.testResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, testResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnexpandedInstantTestLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
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
    openapiFields.add("self");
    openapiFields.add("testResults");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UnexpandedInstantTestLinks
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UnexpandedInstantTestLinks.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UnexpandedInstantTestLinks is not found in the empty JSON string", UnexpandedInstantTestLinks.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UnexpandedInstantTestLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UnexpandedInstantTestLinks` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `self`
      if (jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) {
        UnexpandedInstantTestLinksSelf.validateJsonElement(jsonObj.get("self"));
      }
      // validate the optional field `testResults`
      if (jsonObj.get("testResults") != null && !jsonObj.get("testResults").isJsonNull()) {
        UnexpandedInstantTestLinksTestResults.validateJsonElement(jsonObj.get("testResults"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UnexpandedInstantTestLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UnexpandedInstantTestLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UnexpandedInstantTestLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UnexpandedInstantTestLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<UnexpandedInstantTestLinks>() {
           @Override
           public void write(JsonWriter out, UnexpandedInstantTestLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UnexpandedInstantTestLinks read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UnexpandedInstantTestLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UnexpandedInstantTestLinks
  * @throws IOException if the JSON string is invalid with respect to UnexpandedInstantTestLinks
  */
  public static UnexpandedInstantTestLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UnexpandedInstantTestLinks.class);
  }

 /**
  * Convert an instance of UnexpandedInstantTestLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

