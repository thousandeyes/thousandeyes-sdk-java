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


package com.thousandeyes.api.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Ownership of the agent.
 */
@JsonAdapter(AgentWidgetShow.Adapter.class)
public enum AgentWidgetShow {
  
  OWNED("owned"),
  
  ALL("all");

  private String value;

  AgentWidgetShow(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentWidgetShow fromValue(String value) {
    for (AgentWidgetShow b : AgentWidgetShow.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentWidgetShow> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentWidgetShow enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentWidgetShow read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentWidgetShow.fromValue(value);
    }
  }
}

