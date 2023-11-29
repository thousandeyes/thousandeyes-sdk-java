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


package com.thousandeyes.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.model.CpuUtilization;
import com.thousandeyes.api.model.PhysicalMemoryUsedBytes;
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

import com.thousandeyes.JSON;

/**
 * SystemMetrics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:40.551124Z[Europe/London]")
public class SystemMetrics {
  public static final String SERIALIZED_NAME_START_TIME_MS = "startTimeMs";
  @SerializedName(SERIALIZED_NAME_START_TIME_MS)
  private BigDecimal startTimeMs;

  public static final String SERIALIZED_NAME_END_TIME_MS = "endTimeMs";
  @SerializedName(SERIALIZED_NAME_END_TIME_MS)
  private BigDecimal endTimeMs;

  public static final String SERIALIZED_NAME_CPU_UTILIZATION = "cpuUtilization";
  @SerializedName(SERIALIZED_NAME_CPU_UTILIZATION)
  private CpuUtilization cpuUtilization;

  public static final String SERIALIZED_NAME_PHYSICAL_MEMORY_USED_BYTES = "physicalMemoryUsedBytes";
  @SerializedName(SERIALIZED_NAME_PHYSICAL_MEMORY_USED_BYTES)
  private PhysicalMemoryUsedBytes physicalMemoryUsedBytes;

  public static final String SERIALIZED_NAME_PHYSICAL_MEMORY_TOTAL_BYTES = "physicalMemoryTotalBytes";
  @SerializedName(SERIALIZED_NAME_PHYSICAL_MEMORY_TOTAL_BYTES)
  private BigDecimal physicalMemoryTotalBytes;

  public SystemMetrics() {
  }

  
  public SystemMetrics(
     BigDecimal startTimeMs, 
     BigDecimal endTimeMs, 
     BigDecimal physicalMemoryTotalBytes
  ) {
    this();
    this.startTimeMs = startTimeMs;
    this.endTimeMs = endTimeMs;
    this.physicalMemoryTotalBytes = physicalMemoryTotalBytes;
  }

   /**
   * The start time of metrics collection, expressed in milliseconds since the Epoch.
   * @return startTimeMs
  **/
  @javax.annotation.Nullable
  public BigDecimal getStartTimeMs() {
    return startTimeMs;
  }




   /**
   * The end time of metrics collection, expressed in milliseconds since the Epoch.
   * @return endTimeMs
  **/
  @javax.annotation.Nullable
  public BigDecimal getEndTimeMs() {
    return endTimeMs;
  }




  public SystemMetrics cpuUtilization(CpuUtilization cpuUtilization) {
    
    this.cpuUtilization = cpuUtilization;
    return this;
  }

   /**
   * Get cpuUtilization
   * @return cpuUtilization
  **/
  @javax.annotation.Nullable
  public CpuUtilization getCpuUtilization() {
    return cpuUtilization;
  }


  public void setCpuUtilization(CpuUtilization cpuUtilization) {
    this.cpuUtilization = cpuUtilization;
  }


  public SystemMetrics physicalMemoryUsedBytes(PhysicalMemoryUsedBytes physicalMemoryUsedBytes) {
    
    this.physicalMemoryUsedBytes = physicalMemoryUsedBytes;
    return this;
  }

   /**
   * Get physicalMemoryUsedBytes
   * @return physicalMemoryUsedBytes
  **/
  @javax.annotation.Nullable
  public PhysicalMemoryUsedBytes getPhysicalMemoryUsedBytes() {
    return physicalMemoryUsedBytes;
  }


  public void setPhysicalMemoryUsedBytes(PhysicalMemoryUsedBytes physicalMemoryUsedBytes) {
    this.physicalMemoryUsedBytes = physicalMemoryUsedBytes;
  }


   /**
   * Total physical memory of the system.
   * @return physicalMemoryTotalBytes
  **/
  @javax.annotation.Nullable
  public BigDecimal getPhysicalMemoryTotalBytes() {
    return physicalMemoryTotalBytes;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemMetrics systemMetrics = (SystemMetrics) o;
    return Objects.equals(this.startTimeMs, systemMetrics.startTimeMs) &&
        Objects.equals(this.endTimeMs, systemMetrics.endTimeMs) &&
        Objects.equals(this.cpuUtilization, systemMetrics.cpuUtilization) &&
        Objects.equals(this.physicalMemoryUsedBytes, systemMetrics.physicalMemoryUsedBytes) &&
        Objects.equals(this.physicalMemoryTotalBytes, systemMetrics.physicalMemoryTotalBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTimeMs, endTimeMs, cpuUtilization, physicalMemoryUsedBytes, physicalMemoryTotalBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemMetrics {\n");
    sb.append("    startTimeMs: ").append(toIndentedString(startTimeMs)).append("\n");
    sb.append("    endTimeMs: ").append(toIndentedString(endTimeMs)).append("\n");
    sb.append("    cpuUtilization: ").append(toIndentedString(cpuUtilization)).append("\n");
    sb.append("    physicalMemoryUsedBytes: ").append(toIndentedString(physicalMemoryUsedBytes)).append("\n");
    sb.append("    physicalMemoryTotalBytes: ").append(toIndentedString(physicalMemoryTotalBytes)).append("\n");
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
    openapiFields.add("startTimeMs");
    openapiFields.add("endTimeMs");
    openapiFields.add("cpuUtilization");
    openapiFields.add("physicalMemoryUsedBytes");
    openapiFields.add("physicalMemoryTotalBytes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SystemMetrics
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SystemMetrics.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SystemMetrics is not found in the empty JSON string", SystemMetrics.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SystemMetrics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SystemMetrics` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `cpuUtilization`
      if (jsonObj.get("cpuUtilization") != null && !jsonObj.get("cpuUtilization").isJsonNull()) {
        CpuUtilization.validateJsonElement(jsonObj.get("cpuUtilization"));
      }
      // validate the optional field `physicalMemoryUsedBytes`
      if (jsonObj.get("physicalMemoryUsedBytes") != null && !jsonObj.get("physicalMemoryUsedBytes").isJsonNull()) {
        PhysicalMemoryUsedBytes.validateJsonElement(jsonObj.get("physicalMemoryUsedBytes"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SystemMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SystemMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SystemMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SystemMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<SystemMetrics>() {
           @Override
           public void write(JsonWriter out, SystemMetrics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SystemMetrics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SystemMetrics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SystemMetrics
  * @throws IOException if the JSON string is invalid with respect to SystemMetrics
  */
  public static SystemMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SystemMetrics.class);
  }

 /**
  * Convert an instance of SystemMetrics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

