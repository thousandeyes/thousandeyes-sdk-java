/*
 * ThousandEyes for OpenTelemetry API
 *  Configure ThousandEyes to stream or push test data to a OpenTelemetry compliant endpoint with the ThousandEyes for OpenTelemetry API. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.streaming.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * AuditOperationWithUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:28.138431Z[Europe/Lisbon]")
public class AuditOperationWithUpdate {
  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private Long createdBy;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private Long createdDate;

  public static final String SERIALIZED_NAME_UPDATED_BY = "updatedBy";
  @SerializedName(SERIALIZED_NAME_UPDATED_BY)
  private Long updatedBy;

  public static final String SERIALIZED_NAME_UPDATED_DATE = "updatedDate";
  @SerializedName(SERIALIZED_NAME_UPDATED_DATE)
  private Long updatedDate;

  public AuditOperationWithUpdate() {
  }

  public AuditOperationWithUpdate createdBy(Long createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * ID of the user who created the integration
   * @return createdBy
  **/
  @javax.annotation.Nullable
  public Long getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }


  public AuditOperationWithUpdate createdDate(Long createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Creation date of the integration
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public Long getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }


  public AuditOperationWithUpdate updatedBy(Long updatedBy) {
    
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * ID of the user who last updated the integration
   * @return updatedBy
  **/
  @javax.annotation.Nullable
  public Long getUpdatedBy() {
    return updatedBy;
  }


  public void setUpdatedBy(Long updatedBy) {
    this.updatedBy = updatedBy;
  }


  public AuditOperationWithUpdate updatedDate(Long updatedDate) {
    
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * Date of the last update to the integration
   * @return updatedDate
  **/
  @javax.annotation.Nullable
  public Long getUpdatedDate() {
    return updatedDate;
  }


  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditOperationWithUpdate auditOperationWithUpdate = (AuditOperationWithUpdate) o;
    return Objects.equals(this.createdBy, auditOperationWithUpdate.createdBy) &&
        Objects.equals(this.createdDate, auditOperationWithUpdate.createdDate) &&
        Objects.equals(this.updatedBy, auditOperationWithUpdate.updatedBy) &&
        Objects.equals(this.updatedDate, auditOperationWithUpdate.updatedDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, updatedBy, updatedDate);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditOperationWithUpdate {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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
    openapiFields.add("createdBy");
    openapiFields.add("createdDate");
    openapiFields.add("updatedBy");
    openapiFields.add("updatedDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AuditOperationWithUpdate
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuditOperationWithUpdate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuditOperationWithUpdate is not found in the empty JSON string", AuditOperationWithUpdate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuditOperationWithUpdate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuditOperationWithUpdate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuditOperationWithUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuditOperationWithUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuditOperationWithUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuditOperationWithUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<AuditOperationWithUpdate>() {
           @Override
           public void write(JsonWriter out, AuditOperationWithUpdate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuditOperationWithUpdate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuditOperationWithUpdate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuditOperationWithUpdate
  * @throws IOException if the JSON string is invalid with respect to AuditOperationWithUpdate
  */
  public static AuditOperationWithUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuditOperationWithUpdate.class);
  }

 /**
  * Convert an instance of AuditOperationWithUpdate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

