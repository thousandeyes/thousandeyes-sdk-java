/*
 * Dashboards API
 * Manage ThousandEyes Dashboards
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.dashboards.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.dashboards.model.ApiGraphletPoint;
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
 * Information displayed within a mini-graph associated with a specific test in a table.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:29.147613Z[Europe/Lisbon]")
public class ApiTestTableGraphletsData {
  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private String metric;

  public static final String SERIALIZED_NAME_TEST_ID = "testId";
  @SerializedName(SERIALIZED_NAME_TEST_ID)
  private String testId;

  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private List<ApiGraphletPoint> points;

  public ApiTestTableGraphletsData() {
  }

  public ApiTestTableGraphletsData metric(String metric) {
    
    this.metric = metric;
    return this;
  }

   /**
   * Name of the metric.
   * @return metric
  **/
  @javax.annotation.Nullable
  public String getMetric() {
    return metric;
  }


  public void setMetric(String metric) {
    this.metric = metric;
  }


  public ApiTestTableGraphletsData testId(String testId) {
    
    this.testId = testId;
    return this;
  }

   /**
   * Identifier of the test.
   * @return testId
  **/
  @javax.annotation.Nullable
  public String getTestId() {
    return testId;
  }


  public void setTestId(String testId) {
    this.testId = testId;
  }


  public ApiTestTableGraphletsData points(List<ApiGraphletPoint> points) {
    
    this.points = points;
    return this;
  }

  public ApiTestTableGraphletsData addPointsItem(ApiGraphletPoint pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<>();
    }
    this.points.add(pointsItem);
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  @javax.annotation.Nullable
  public List<ApiGraphletPoint> getPoints() {
    return points;
  }


  public void setPoints(List<ApiGraphletPoint> points) {
    this.points = points;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiTestTableGraphletsData apiTestTableGraphletsData = (ApiTestTableGraphletsData) o;
    return Objects.equals(this.metric, apiTestTableGraphletsData.metric) &&
        Objects.equals(this.testId, apiTestTableGraphletsData.testId) &&
        Objects.equals(this.points, apiTestTableGraphletsData.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, testId, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiTestTableGraphletsData {\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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
    openapiFields.add("metric");
    openapiFields.add("testId");
    openapiFields.add("points");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiTestTableGraphletsData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiTestTableGraphletsData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiTestTableGraphletsData is not found in the empty JSON string", ApiTestTableGraphletsData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiTestTableGraphletsData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiTestTableGraphletsData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("metric") != null && !jsonObj.get("metric").isJsonNull()) && !jsonObj.get("metric").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metric` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metric").toString()));
      }
      if ((jsonObj.get("testId") != null && !jsonObj.get("testId").isJsonNull()) && !jsonObj.get("testId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testId").toString()));
      }
      if (jsonObj.get("points") != null && !jsonObj.get("points").isJsonNull()) {
        JsonArray jsonArraypoints = jsonObj.getAsJsonArray("points");
        if (jsonArraypoints != null) {
          // ensure the json data is an array
          if (!jsonObj.get("points").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `points` to be an array in the JSON string but got `%s`", jsonObj.get("points").toString()));
          }

          // validate the optional field `points` (array)
          for (int i = 0; i < jsonArraypoints.size(); i++) {
            ApiGraphletPoint.validateJsonElement(jsonArraypoints.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiTestTableGraphletsData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiTestTableGraphletsData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiTestTableGraphletsData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiTestTableGraphletsData.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiTestTableGraphletsData>() {
           @Override
           public void write(JsonWriter out, ApiTestTableGraphletsData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiTestTableGraphletsData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiTestTableGraphletsData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiTestTableGraphletsData
  * @throws IOException if the JSON string is invalid with respect to ApiTestTableGraphletsData
  */
  public static ApiTestTableGraphletsData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiTestTableGraphletsData.class);
  }

 /**
  * Convert an instance of ApiTestTableGraphletsData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

