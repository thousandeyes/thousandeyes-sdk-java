/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.test.results.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.test.results.model.Link;
import java.io.IOException;
import java.util.Arrays;



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

import com.thousandeyes.api.test.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:04.702673Z[Europe/Lisbon]")
public class UnexpandedInstantTestLinksTestResults extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UnexpandedInstantTestLinksTestResults.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UnexpandedInstantTestLinksTestResults.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UnexpandedInstantTestLinksTestResults' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);

            final Type typeInstance = new TypeToken<List<Link>>(){}.getType();
            final TypeAdapter<List<Link>> adapterLinkList = (TypeAdapter<List<Link>>) gson.getDelegateAdapter(this, TypeToken.get(typeInstance));
            final TypeAdapter<Link> adapterLink = gson.getDelegateAdapter(this, TypeToken.get(Link.class));

            return (TypeAdapter<T>) new TypeAdapter<UnexpandedInstantTestLinksTestResults>() {
                @Override
                public void write(JsonWriter out, UnexpandedInstantTestLinksTestResults value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `List<Link>`
                    if (value.getActualInstance() instanceof List<?>) {
                      List<?> list = (List<?>) value.getActualInstance();
        	            if(list.get(0) instanceof Link) {
        		            JsonArray array = adapterLinkList.toJsonTree((List<Link>)value.getActualInstance()).getAsJsonArray();
                        elementAdapter.write(out, array);
                        return;
        	            }
                    }
                    // check if the actual instance is of the type `Link`
                    if (value.getActualInstance() instanceof Link) {
                      JsonElement element = adapterLink.toJsonTree((Link)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: Link, List<Link>");
                }

                @Override
                public UnexpandedInstantTestLinksTestResults read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize List<Link>
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if (!jsonElement.isJsonArray()) {
                        throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
                      }

                      JsonArray array = jsonElement.getAsJsonArray();
                      // validate array items
                      for(JsonElement element : array) {
                        Link.validateJsonElement(element);
                      }
                      actualAdapter = adapterLinkList;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'List<Link>'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for List<Link> failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'List<Link>'", e);
                    }
                    // deserialize Link
                    try {
                      // validate the JSON object to see if any exception is thrown
                      Link.validateJsonElement(jsonElement);
                      actualAdapter = adapterLink;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'Link'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for Link failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'Link'", e);
                    }

                    if (match == 1) {
                        UnexpandedInstantTestLinksTestResults ret = new UnexpandedInstantTestLinksTestResults();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UnexpandedInstantTestLinksTestResults: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public UnexpandedInstantTestLinksTestResults() {
        super("oneOf", Boolean.FALSE);
    }

    public UnexpandedInstantTestLinksTestResults(Link o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UnexpandedInstantTestLinksTestResults(List<Link> o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("List<Link>", List.class);
        schemas.put("Link", Link.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UnexpandedInstantTestLinksTestResults.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Link, List<Link>
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof List<?>) {
            List<?> list = (List<?>) instance;
        	if(list.get(0) instanceof Link) {
        		super.setActualInstance(instance);
        		return;
        	}
        }

        if (instance instanceof Link) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Link, List<Link>");
    }

    /**
     * Get the actual instance, which can be the following:
     * Link, List<Link>
     *
     * @return The actual instance (Link, List<Link>)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<Link>`. If the actual instance is not `List<Link>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<Link>`
     * @throws ClassCastException if the instance is not `List<Link>`
     */
    public List<Link> getLinkList() throws ClassCastException {
        return (List<Link>)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Link`. If the actual instance is not `Link`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Link`
     * @throws ClassCastException if the instance is not `Link`
     */
    public Link getLink() throws ClassCastException {
        return (Link)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UnexpandedInstantTestLinksTestResults
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with List<Link>
    try {
      if (!jsonElement.isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
      }
      JsonArray array = jsonElement.getAsJsonArray();
      // validate array items
      for(JsonElement element : array) {
        Link.validateJsonElement(element);
      }
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for List<Link> failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with Link
    try {
      Link.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for Link failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for UnexpandedInstantTestLinksTestResults with oneOf schemas: Link, List<Link>. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of UnexpandedInstantTestLinksTestResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UnexpandedInstantTestLinksTestResults
  * @throws IOException if the JSON string is invalid with respect to UnexpandedInstantTestLinksTestResults
  */
  public static UnexpandedInstantTestLinksTestResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UnexpandedInstantTestLinksTestResults.class);
  }

 /**
  * Convert an instance of UnexpandedInstantTestLinksTestResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

