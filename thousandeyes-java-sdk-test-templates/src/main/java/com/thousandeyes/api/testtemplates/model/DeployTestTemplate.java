/*
 * Test Templates API
 *  ## Overview  Test templates allow you create a set of tests, alert rules, dashboards, and labels from a single template configuration file.    The following applies to test templates:  * You can create tests for monitoring common services and applications such as Microsoft 365, Webex, and others using a predefined set of certified templates.  * Test templates reduce the time and complexity of creating tests for common SaaS or other services by providing a set of templates for creating tests, alert rules, and other assets within the ThousandEyes platform.  * Templates created with an account group in a particular organization are visible to all account groups in that organization, provided they have the `View Test Templates` permission.  * Credentials (usernames, passwords, tokens, etc.) can be included in a test template only as placeholders whose value is provided by user input when the template is deployed. Creating or updating a test template that contains a credentials field in plain text will result in a bad request (HTTP 400).  * The schemas to use for `labels`, `tests`, `alertRules` and `dashboards` are defined at https://developer.thousandeyes.com/v7/.  * To support referencing an asset from another asset of a different type (for example, defining the `testId` field of an `alertRule` by referencing the ID of a test defined in the template itself), the deployment of assets is done in a specific order:      1. Labels     2. Tests     3. Alert rules     4. Dashboards      For a given asset type, you can reference any asset type with a higher order. (For example, labels cannot reference other assets in the template; tests can only reference labels; alert rules can reference tests and labels, etc.)
 *
 * The version of the OpenAPI document: 7.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.testtemplates.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.testtemplates.model.DeployTestTemplateTests;
import com.thousandeyes.api.testtemplates.model.DeployTestTemplateUserInputValues;
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
 * DeployTestTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:03.138345Z[Europe/Lisbon]")
public class DeployTestTemplate {
  public static final String SERIALIZED_NAME_USER_INPUT_VALUES = "userInputValues";
  @SerializedName(SERIALIZED_NAME_USER_INPUT_VALUES)
  private DeployTestTemplateUserInputValues userInputValues;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TESTS = "tests";
  @SerializedName(SERIALIZED_NAME_TESTS)
  private DeployTestTemplateTests tests;

  public DeployTestTemplate() {
  }

  public DeployTestTemplate userInputValues(DeployTestTemplateUserInputValues userInputValues) {
    
    this.userInputValues = userInputValues;
    return this;
  }

   /**
   * Get userInputValues
   * @return userInputValues
  **/
  @javax.annotation.Nullable
  public DeployTestTemplateUserInputValues getUserInputValues() {
    return userInputValues;
  }


  public void setUserInputValues(DeployTestTemplateUserInputValues userInputValues) {
    this.userInputValues = userInputValues;
  }


  public DeployTestTemplate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DeployTestTemplate tests(DeployTestTemplateTests tests) {
    
    this.tests = tests;
    return this;
  }

   /**
   * Get tests
   * @return tests
  **/
  @javax.annotation.Nullable
  public DeployTestTemplateTests getTests() {
    return tests;
  }


  public void setTests(DeployTestTemplateTests tests) {
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
    DeployTestTemplate deployTestTemplate = (DeployTestTemplate) o;
    return Objects.equals(this.userInputValues, deployTestTemplate.userInputValues) &&
        Objects.equals(this.name, deployTestTemplate.name) &&
        Objects.equals(this.tests, deployTestTemplate.tests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userInputValues, name, tests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployTestTemplate {\n");
    sb.append("    userInputValues: ").append(toIndentedString(userInputValues)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("userInputValues");
    openapiFields.add("name");
    openapiFields.add("tests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DeployTestTemplate
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeployTestTemplate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeployTestTemplate is not found in the empty JSON string", DeployTestTemplate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeployTestTemplate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeployTestTemplate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `userInputValues`
      if (jsonObj.get("userInputValues") != null && !jsonObj.get("userInputValues").isJsonNull()) {
        DeployTestTemplateUserInputValues.validateJsonElement(jsonObj.get("userInputValues"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `tests`
      if (jsonObj.get("tests") != null && !jsonObj.get("tests").isJsonNull()) {
        DeployTestTemplateTests.validateJsonElement(jsonObj.get("tests"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeployTestTemplate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeployTestTemplate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeployTestTemplate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeployTestTemplate.class));

       return (TypeAdapter<T>) new TypeAdapter<DeployTestTemplate>() {
           @Override
           public void write(JsonWriter out, DeployTestTemplate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeployTestTemplate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeployTestTemplate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeployTestTemplate
  * @throws IOException if the JSON string is invalid with respect to DeployTestTemplate
  */
  public static DeployTestTemplate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeployTestTemplate.class);
  }

 /**
  * Convert an instance of DeployTestTemplate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

