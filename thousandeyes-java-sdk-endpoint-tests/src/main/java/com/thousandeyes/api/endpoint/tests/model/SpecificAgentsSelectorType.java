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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets SpecificAgentsSelectorType
 */
@JsonAdapter(SpecificAgentsSelectorType.Adapter.class)
public enum SpecificAgentsSelectorType {
  
  SPECIFIC_AGENTS("specific-agents");

  private String value;

  SpecificAgentsSelectorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SpecificAgentsSelectorType fromValue(String value) {
    for (SpecificAgentsSelectorType b : SpecificAgentsSelectorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SpecificAgentsSelectorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SpecificAgentsSelectorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SpecificAgentsSelectorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SpecificAgentsSelectorType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    SpecificAgentsSelectorType.fromValue(value);
  }
}

