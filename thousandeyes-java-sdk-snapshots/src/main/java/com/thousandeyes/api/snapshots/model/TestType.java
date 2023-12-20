/*
 * Test Snapshots API
 * Creates a new test snapshot in ThousandEyes
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.snapshots.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * This is a read only value, as test type is implicit in the test creation url.
 */
@JsonAdapter(TestType.Adapter.class)
public enum TestType {
  
  AGENT_TO_AGENT("agent-to-agent"),
  
  AGENT_TO_SERVER("agent-to-server"),
  
  BGP("bgp"),
  
  HTTP_SERVER("http-server"),
  
  PAGE_LOAD("page-load"),
  
  WEB_TRANSACTIONS("web-transactions"),
  
  FTP_SERVER("ftp-server"),
  
  DNS_TRACE("dns-trace"),
  
  DNS_SERVER("dns-server"),
  
  DNSSEC("dnssec"),
  
  SIP_SERVER("sip-server"),
  
  VOICE("voice");

  private String value;

  TestType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TestType fromValue(String value) {
    for (TestType b : TestType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TestType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TestType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TestType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TestType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    TestType.fromValue(value);
  }
}

