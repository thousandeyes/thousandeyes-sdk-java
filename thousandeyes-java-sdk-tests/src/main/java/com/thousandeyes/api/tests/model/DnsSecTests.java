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
import com.thousandeyes.api.tests.model.DnsSecTest;
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
 * DnsSecTests
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:06.198107Z[Europe/Lisbon]")
public class DnsSecTests {
  public static final String SERIALIZED_NAME_TESTS = "tests";
  @SerializedName(SERIALIZED_NAME_TESTS)
  private List<DnsSecTest> tests;

  public DnsSecTests() {
  }

  public DnsSecTests tests(List<DnsSecTest> tests) {
    
    this.tests = tests;
    return this;
  }

  public DnsSecTests addTestsItem(DnsSecTest testsItem) {
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
  public List<DnsSecTest> getTests() {
    return tests;
  }


  public void setTests(List<DnsSecTest> tests) {
    this.tests = tests;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsSecTests dnsSecTests = (DnsSecTests) o;
    return Objects.equals(this.tests, dnsSecTests.tests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsSecTests {\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DnsSecTests
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DnsSecTests.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DnsSecTests is not found in the empty JSON string", DnsSecTests.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DnsSecTests.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DnsSecTests` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            DnsSecTest.validateJsonElement(jsonArraytests.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DnsSecTests.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DnsSecTests' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DnsSecTests> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DnsSecTests.class));

       return (TypeAdapter<T>) new TypeAdapter<DnsSecTests>() {
           @Override
           public void write(JsonWriter out, DnsSecTests value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DnsSecTests read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DnsSecTests given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DnsSecTests
  * @throws IOException if the JSON string is invalid with respect to DnsSecTests
  */
  public static DnsSecTests fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DnsSecTests.class);
  }

 /**
  * Convert an instance of DnsSecTests to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

