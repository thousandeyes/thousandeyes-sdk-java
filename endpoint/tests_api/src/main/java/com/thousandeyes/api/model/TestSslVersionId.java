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


package com.thousandeyes.api.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * SSL version options:  * Use &#39;0&#39; for automatic selection. * Use &#39;3&#39; for SSLv3. * Use &#39;4&#39; for TLS v1.0. * Use &#39;5&#39; for TLS v1.1. * Use &#39;6&#39; for TLS v1.2. 
 */
@JsonAdapter(TestSslVersionId.Adapter.class)
public enum TestSslVersionId {
  
  _0("0"),
  
  _3("3"),
  
  _4("4"),
  
  _5("5"),
  
  _6("6");

  private String value;

  TestSslVersionId(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TestSslVersionId fromValue(String value) {
    for (TestSslVersionId b : TestSslVersionId.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TestSslVersionId> {
    @Override
    public void write(final JsonWriter jsonWriter, final TestSslVersionId enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TestSslVersionId read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TestSslVersionId.fromValue(value);
    }
  }
}

