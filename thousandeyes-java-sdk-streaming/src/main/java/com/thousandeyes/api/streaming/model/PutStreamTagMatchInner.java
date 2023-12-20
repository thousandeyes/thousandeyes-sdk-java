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
import com.thousandeyes.api.streaming.model.TagMatchObjectType;
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
 * PutStreamTagMatchInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:01.156542Z[Europe/Lisbon]")
public class PutStreamTagMatchInner {
  public static final String SERIALIZED_NAME_OBJECT_TYPE = "objectType";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private TagMatchObjectType objectType;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public PutStreamTagMatchInner() {
  }

  public PutStreamTagMatchInner objectType(TagMatchObjectType objectType) {
    
    this.objectType = objectType;
    return this;
  }

   /**
   * Get objectType
   * @return objectType
  **/
  @javax.annotation.Nullable
  public TagMatchObjectType getObjectType() {
    return objectType;
  }


  public void setObjectType(TagMatchObjectType objectType) {
    this.objectType = objectType;
  }


  public PutStreamTagMatchInner key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The name of the tag key to match
   * @return key
  **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public PutStreamTagMatchInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of the tag to match
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutStreamTagMatchInner putStreamTagMatchInner = (PutStreamTagMatchInner) o;
    return Objects.equals(this.objectType, putStreamTagMatchInner.objectType) &&
        Objects.equals(this.key, putStreamTagMatchInner.key) &&
        Objects.equals(this.value, putStreamTagMatchInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectType, key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutStreamTagMatchInner {\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("objectType");
    openapiFields.add("key");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PutStreamTagMatchInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PutStreamTagMatchInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PutStreamTagMatchInner is not found in the empty JSON string", PutStreamTagMatchInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PutStreamTagMatchInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PutStreamTagMatchInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `objectType`
      if (jsonObj.get("objectType") != null && !jsonObj.get("objectType").isJsonNull()) {
        TagMatchObjectType.validateJsonElement(jsonObj.get("objectType"));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PutStreamTagMatchInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PutStreamTagMatchInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PutStreamTagMatchInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PutStreamTagMatchInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PutStreamTagMatchInner>() {
           @Override
           public void write(JsonWriter out, PutStreamTagMatchInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PutStreamTagMatchInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PutStreamTagMatchInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PutStreamTagMatchInner
  * @throws IOException if the JSON string is invalid with respect to PutStreamTagMatchInner
  */
  public static PutStreamTagMatchInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PutStreamTagMatchInner.class);
  }

 /**
  * Convert an instance of PutStreamTagMatchInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

