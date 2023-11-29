/*
 * Tests API
 *  ### Overview This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests.
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
 * Domain class used by this test. &#39;in&#39; stands for Internet, while &#39;ch&#39; stands for Chaos.
 */
@JsonAdapter(DnsQueryClass.Adapter.class)
public enum DnsQueryClass {
  
  IN("in"),
  
  CH("ch");

  private String value;

  DnsQueryClass(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DnsQueryClass fromValue(String value) {
    for (DnsQueryClass b : DnsQueryClass.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DnsQueryClass> {
    @Override
    public void write(final JsonWriter jsonWriter, final DnsQueryClass enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DnsQueryClass read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DnsQueryClass.fromValue(value);
    }
  }
}

