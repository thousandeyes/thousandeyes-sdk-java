/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.results.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.endpoint.tests.results.model.ConditionalOperator;
import com.thousandeyes.api.endpoint.tests.results.model.TestsDataThresholdFilter;
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

import com.thousandeyes.api.endpoint.tests.JSON;

/**
 * All filters are applied based on the conditional operator (and/or).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:32.305594Z[Europe/Lisbon]")
public class TestsDataThresholdFilters {
  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<TestsDataThresholdFilter> filters;

  public static final String SERIALIZED_NAME_CONDITIONAL_OPERATOR = "conditionalOperator";
  @SerializedName(SERIALIZED_NAME_CONDITIONAL_OPERATOR)
  private ConditionalOperator conditionalOperator;

  public TestsDataThresholdFilters() {
  }

  public TestsDataThresholdFilters filters(List<TestsDataThresholdFilter> filters) {
    
    this.filters = filters;
    return this;
  }

  public TestsDataThresholdFilters addFiltersItem(TestsDataThresholdFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  public List<TestsDataThresholdFilter> getFilters() {
    return filters;
  }


  public void setFilters(List<TestsDataThresholdFilter> filters) {
    this.filters = filters;
  }


  public TestsDataThresholdFilters conditionalOperator(ConditionalOperator conditionalOperator) {
    
    this.conditionalOperator = conditionalOperator;
    return this;
  }

   /**
   * Get conditionalOperator
   * @return conditionalOperator
  **/
  @javax.annotation.Nullable
  public ConditionalOperator getConditionalOperator() {
    return conditionalOperator;
  }


  public void setConditionalOperator(ConditionalOperator conditionalOperator) {
    this.conditionalOperator = conditionalOperator;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestsDataThresholdFilters testsDataThresholdFilters = (TestsDataThresholdFilters) o;
    return Objects.equals(this.filters, testsDataThresholdFilters.filters) &&
        Objects.equals(this.conditionalOperator, testsDataThresholdFilters.conditionalOperator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, conditionalOperator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestsDataThresholdFilters {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    conditionalOperator: ").append(toIndentedString(conditionalOperator)).append("\n");
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
    openapiFields.add("filters");
    openapiFields.add("conditionalOperator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TestsDataThresholdFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestsDataThresholdFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestsDataThresholdFilters is not found in the empty JSON string", TestsDataThresholdFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestsDataThresholdFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestsDataThresholdFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        JsonArray jsonArrayfilters = jsonObj.getAsJsonArray("filters");
        if (jsonArrayfilters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("filters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `filters` to be an array in the JSON string but got `%s`", jsonObj.get("filters").toString()));
          }

          // validate the optional field `filters` (array)
          for (int i = 0; i < jsonArrayfilters.size(); i++) {
            TestsDataThresholdFilter.validateJsonElement(jsonArrayfilters.get(i));
          };
        }
      }
      // validate the optional field `conditionalOperator`
      if (jsonObj.get("conditionalOperator") != null && !jsonObj.get("conditionalOperator").isJsonNull()) {
        ConditionalOperator.validateJsonElement(jsonObj.get("conditionalOperator"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestsDataThresholdFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestsDataThresholdFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestsDataThresholdFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestsDataThresholdFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<TestsDataThresholdFilters>() {
           @Override
           public void write(JsonWriter out, TestsDataThresholdFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestsDataThresholdFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestsDataThresholdFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestsDataThresholdFilters
  * @throws IOException if the JSON string is invalid with respect to TestsDataThresholdFilters
  */
  public static TestsDataThresholdFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestsDataThresholdFilters.class);
  }

 /**
  * Convert an instance of TestsDataThresholdFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

