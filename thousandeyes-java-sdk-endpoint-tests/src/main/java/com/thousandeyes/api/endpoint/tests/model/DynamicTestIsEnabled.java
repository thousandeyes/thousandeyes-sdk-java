/*
 * Endpoint Tests API
 *  ## Overview Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.model;

import java.util.Objects;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.thousandeyes.api.endpoint.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-18T17:52:55.839690Z[Europe/Lisbon]")
public class DynamicTestIsEnabled extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(DynamicTestIsEnabled.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DynamicTestIsEnabled.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DynamicTestIsEnabled' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Boolean> adapterBoolean = gson.getDelegateAdapter(this, TypeToken.get(Boolean.class));

            return (TypeAdapter<T>) new TypeAdapter<DynamicTestIsEnabled>() {
                @Override
                public void write(JsonWriter out, DynamicTestIsEnabled value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Boolean`
                    if (value.getActualInstance() instanceof Boolean) {
                      JsonPrimitive primitive = adapterBoolean.toJsonTree((Boolean)value.getActualInstance()).getAsJsonPrimitive();
                      elementAdapter.write(out, primitive);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: Boolean");
                }

                @Override
                public DynamicTestIsEnabled read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Boolean
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(!jsonElement.getAsJsonPrimitive().isBoolean()) {
                        throw new IllegalArgumentException(String.format("Expected json element to be of type Boolean in the JSON string but got `%s`", jsonElement.toString()));
                      }
                      actualAdapter = adapterBoolean;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'Boolean'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for Boolean failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'Boolean'", e);
                    }

                    if (match == 1) {
                        DynamicTestIsEnabled ret = new DynamicTestIsEnabled();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for DynamicTestIsEnabled: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public DynamicTestIsEnabled() {
        super("oneOf", Boolean.FALSE);
    }

    public DynamicTestIsEnabled(Boolean o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Boolean", Boolean.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return DynamicTestIsEnabled.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Boolean
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Boolean) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Boolean");
    }

    /**
     * Get the actual instance, which can be the following:
     * Boolean
     *
     * @return The actual instance (Boolean)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Boolean`. If the actual instance is not `Boolean`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Boolean`
     * @throws ClassCastException if the instance is not `Boolean`
     */
    public Boolean getBoolean() throws ClassCastException {
        return (Boolean)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DynamicTestIsEnabled
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with Boolean
    try {
      if(!jsonElement.getAsJsonPrimitive().isBoolean()) {
        throw new IllegalArgumentException(String.format("Expected json element to be of type Boolean in the JSON string but got `%s`", jsonElement.toString()));
      }
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for Boolean failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for DynamicTestIsEnabled with oneOf schemas: Boolean. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of DynamicTestIsEnabled given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DynamicTestIsEnabled
  * @throws IOException if the JSON string is invalid with respect to DynamicTestIsEnabled
  */
  public static DynamicTestIsEnabled fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DynamicTestIsEnabled.class);
  }

 /**
  * Convert an instance of DynamicTestIsEnabled to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

