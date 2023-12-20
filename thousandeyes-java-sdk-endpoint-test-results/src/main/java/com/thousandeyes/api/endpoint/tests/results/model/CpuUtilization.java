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
import java.io.IOException;
import java.math.BigDecimal;
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

import com.thousandeyes.api.endpoint.tests.JSON;

/**
 * CpuUtilization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:05.666462Z[Europe/Lisbon]")
public class CpuUtilization {
  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Double min;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Double max;

  public static final String SERIALIZED_NAME_MEAN = "mean";
  @SerializedName(SERIALIZED_NAME_MEAN)
  private Double mean;

  public static final String SERIALIZED_NAME_MEDIAN = "median";
  @SerializedName(SERIALIZED_NAME_MEDIAN)
  private Double median;

  public static final String SERIALIZED_NAME_STD_DEV = "stdDev";
  @SerializedName(SERIALIZED_NAME_STD_DEV)
  private Double stdDev;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private BigDecimal count;

  public CpuUtilization() {
  }

  
  public CpuUtilization(
     Double min, 
     Double max, 
     Double mean, 
     Double median, 
     Double stdDev, 
     BigDecimal count
  ) {
    this();
    this.min = min;
    this.max = max;
    this.mean = mean;
    this.median = median;
    this.stdDev = stdDev;
    this.count = count;
  }

   /**
   * The minimum sampled usage value recorded during the monitored period.
   * minimum: 0.0
   * maximum: 1.0
   * @return min
  **/
  @javax.annotation.Nullable
  public Double getMin() {
    return min;
  }




   /**
   * The maximum sampled usage value recorded during the monitored period.
   * minimum: 0.0
   * maximum: 1.0
   * @return max
  **/
  @javax.annotation.Nullable
  public Double getMax() {
    return max;
  }




   /**
   * The mean (average) sampled usage value recorded during the monitored period.
   * minimum: 0.0
   * maximum: 1.0
   * @return mean
  **/
  @javax.annotation.Nullable
  public Double getMean() {
    return mean;
  }




   /**
   * The median sampled usage value recorded during the monitored period.
   * minimum: 0.0
   * maximum: 1.0
   * @return median
  **/
  @javax.annotation.Nullable
  public Double getMedian() {
    return median;
  }




   /**
   * The standard deviation of sampled usage values recorded during the monitored period.
   * minimum: 0.0
   * maximum: 1.0
   * @return stdDev
  **/
  @javax.annotation.Nullable
  public Double getStdDev() {
    return stdDev;
  }




   /**
   * The total number of samples collected during the monitored period.
   * @return count
  **/
  @javax.annotation.Nullable
  public BigDecimal getCount() {
    return count;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CpuUtilization cpuUtilization = (CpuUtilization) o;
    return Objects.equals(this.min, cpuUtilization.min) &&
        Objects.equals(this.max, cpuUtilization.max) &&
        Objects.equals(this.mean, cpuUtilization.mean) &&
        Objects.equals(this.median, cpuUtilization.median) &&
        Objects.equals(this.stdDev, cpuUtilization.stdDev) &&
        Objects.equals(this.count, cpuUtilization.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, mean, median, stdDev, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CpuUtilization {\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    stdDev: ").append(toIndentedString(stdDev)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
    openapiFields.add("min");
    openapiFields.add("max");
    openapiFields.add("mean");
    openapiFields.add("median");
    openapiFields.add("stdDev");
    openapiFields.add("count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CpuUtilization
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CpuUtilization.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CpuUtilization is not found in the empty JSON string", CpuUtilization.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CpuUtilization.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CpuUtilization` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CpuUtilization.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CpuUtilization' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CpuUtilization> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CpuUtilization.class));

       return (TypeAdapter<T>) new TypeAdapter<CpuUtilization>() {
           @Override
           public void write(JsonWriter out, CpuUtilization value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CpuUtilization read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CpuUtilization given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CpuUtilization
  * @throws IOException if the JSON string is invalid with respect to CpuUtilization
  */
  public static CpuUtilization fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CpuUtilization.class);
  }

 /**
  * Convert an instance of CpuUtilization to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

