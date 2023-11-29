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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets AgentLabelsSelectorType
 */
@JsonAdapter(AgentLabelsSelectorType.Adapter.class)
public enum AgentLabelsSelectorType {
  
  AGENT_LABELS("agent-labels");

  private String value;

  AgentLabelsSelectorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentLabelsSelectorType fromValue(String value) {
    for (AgentLabelsSelectorType b : AgentLabelsSelectorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentLabelsSelectorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentLabelsSelectorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentLabelsSelectorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentLabelsSelectorType.fromValue(value);
    }
  }
}

