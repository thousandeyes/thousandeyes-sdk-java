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
 * Protocol used to perform the test.
 */
@JsonAdapter(EndpointTestProtocol.Adapter.class)
public enum EndpointTestProtocol {
  
  ICMP("icmp"),
  
  ICMP_WITH_TCP_CONNECT("icmp-with-tcp-connect"),
  
  TCP("tcp"),
  
  PREFER_TCP("prefer-tcp"),
  
  AST_AUTODETECT("ast-autodetect"),
  
  AUTODETECT("autodetect");

  private String value;

  EndpointTestProtocol(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EndpointTestProtocol fromValue(String value) {
    for (EndpointTestProtocol b : EndpointTestProtocol.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EndpointTestProtocol> {
    @Override
    public void write(final JsonWriter jsonWriter, final EndpointTestProtocol enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EndpointTestProtocol read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EndpointTestProtocol.fromValue(value);
    }
  }
}

