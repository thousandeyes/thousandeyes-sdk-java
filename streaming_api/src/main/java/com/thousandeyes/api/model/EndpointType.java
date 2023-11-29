/*
 * ThousandEyes for OpenTelemetry
 *  Configure ThousandEyes to stream or push test data to a OpenTelemetry compliant endpoint with the ThousandEyes for OpenTelemetry API. 
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
 * The type of connection used to send data to the endpoint.
 */
@JsonAdapter(EndpointType.Adapter.class)
public enum EndpointType {
  
  GRPC("grpc"),
  
  HTTP("http");

  private String value;

  EndpointType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EndpointType fromValue(String value) {
    for (EndpointType b : EndpointType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EndpointType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EndpointType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EndpointType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EndpointType.fromValue(value);
    }
  }
}

