/*
 * Alerts API
 *  ## Overview Manage all alerts, alert rules and alert suppression windows.
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
 * Indicates the current status of the suppression window.
 */
@JsonAdapter(AlertSuppressionWindowState.Adapter.class)
public enum AlertSuppressionWindowState {
  
  ACTIVE("active"),
  
  INACTIVE("inactive"),
  
  ENDED("ended");

  private String value;

  AlertSuppressionWindowState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AlertSuppressionWindowState fromValue(String value) {
    for (AlertSuppressionWindowState b : AlertSuppressionWindowState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AlertSuppressionWindowState> {
    @Override
    public void write(final JsonWriter jsonWriter, final AlertSuppressionWindowState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AlertSuppressionWindowState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AlertSuppressionWindowState.fromValue(value);
    }
  }
}

