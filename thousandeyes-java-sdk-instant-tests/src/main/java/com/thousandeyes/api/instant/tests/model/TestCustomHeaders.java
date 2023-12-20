/*
 * Instant Tests API
 *  ### Overview The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.instant.tests.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.instant.tests.model.MapItem;
import com.thousandeyes.api.instant.tests.model.TestCustomHeadersAll;
import com.thousandeyes.api.instant.tests.model.TestCustomHeadersRoot;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

import com.thousandeyes.api.instant.JSON;

/**
 * TestCustomHeaders
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-18T17:52:55.998641Z[Europe/Lisbon]")
public class TestCustomHeaders {
  public static final String SERIALIZED_NAME_ROOT = "root";
  @SerializedName(SERIALIZED_NAME_ROOT)
  private TestCustomHeadersRoot root;

  public static final String SERIALIZED_NAME_DOMAINS = "domains";
  @SerializedName(SERIALIZED_NAME_DOMAINS)
  private Map<String, MapItem> domains = new HashMap<>();

  public static final String SERIALIZED_NAME_ALL = "all";
  @SerializedName(SERIALIZED_NAME_ALL)
  private TestCustomHeadersAll all;

  public TestCustomHeaders() {
  }

  public TestCustomHeaders root(TestCustomHeadersRoot root) {
    
    this.root = root;
    return this;
  }

   /**
   * Get root
   * @return root
  **/
  @javax.annotation.Nullable
  public TestCustomHeadersRoot getRoot() {
    return root;
  }


  public void setRoot(TestCustomHeadersRoot root) {
    this.root = root;
  }


  public TestCustomHeaders domains(Map<String, MapItem> domains) {
    
    this.domains = domains;
    return this;
  }

  public TestCustomHeaders putDomainsItem(String key, MapItem domainsItem) {
    if (this.domains == null) {
      this.domains = new HashMap<>();
    }
    this.domains.put(key, domainsItem);
    return this;
  }

   /**
   * Use these HTTP headers for the specified domains.
   * @return domains
  **/
  @javax.annotation.Nullable
  public Map<String, MapItem> getDomains() {
    return domains;
  }


  public void setDomains(Map<String, MapItem> domains) {
    this.domains = domains;
  }


  public TestCustomHeaders all(TestCustomHeadersAll all) {
    
    this.all = all;
    return this;
  }

   /**
   * Get all
   * @return all
  **/
  @javax.annotation.Nullable
  public TestCustomHeadersAll getAll() {
    return all;
  }


  public void setAll(TestCustomHeadersAll all) {
    this.all = all;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestCustomHeaders testCustomHeaders = (TestCustomHeaders) o;
    return Objects.equals(this.root, testCustomHeaders.root) &&
        Objects.equals(this.domains, testCustomHeaders.domains) &&
        Objects.equals(this.all, testCustomHeaders.all);
  }

  @Override
  public int hashCode() {
    return Objects.hash(root, domains, all);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestCustomHeaders {\n");
    sb.append("    root: ").append(toIndentedString(root)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
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
    openapiFields.add("root");
    openapiFields.add("domains");
    openapiFields.add("all");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TestCustomHeaders
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestCustomHeaders.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestCustomHeaders is not found in the empty JSON string", TestCustomHeaders.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestCustomHeaders.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestCustomHeaders` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `root`
      if (jsonObj.get("root") != null && !jsonObj.get("root").isJsonNull()) {
        TestCustomHeadersRoot.validateJsonElement(jsonObj.get("root"));
      }
      // validate the optional field `all`
      if (jsonObj.get("all") != null && !jsonObj.get("all").isJsonNull()) {
        TestCustomHeadersAll.validateJsonElement(jsonObj.get("all"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestCustomHeaders.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestCustomHeaders' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestCustomHeaders> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestCustomHeaders.class));

       return (TypeAdapter<T>) new TypeAdapter<TestCustomHeaders>() {
           @Override
           public void write(JsonWriter out, TestCustomHeaders value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestCustomHeaders read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestCustomHeaders given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestCustomHeaders
  * @throws IOException if the JSON string is invalid with respect to TestCustomHeaders
  */
  public static TestCustomHeaders fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestCustomHeaders.class);
  }

 /**
  * Convert an instance of TestCustomHeaders to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

