/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.
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
 * OS platform types
 */
@JsonAdapter(Platform.Adapter.class)
public enum Platform {
  
  WINDOWS("windows"),
  
  LINUX("linux"),
  
  MAC("mac");

  private String value;

  Platform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Platform fromValue(String value) {
    for (Platform b : Platform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Platform> {
    @Override
    public void write(final JsonWriter jsonWriter, final Platform enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Platform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Platform.fromValue(value);
    }
  }
}

