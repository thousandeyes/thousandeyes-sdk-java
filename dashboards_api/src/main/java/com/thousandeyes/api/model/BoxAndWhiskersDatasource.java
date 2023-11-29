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
 * Datasource of the box and whiskers widget.
 */
@JsonAdapter(BoxAndWhiskersDatasource.Adapter.class)
public enum BoxAndWhiskersDatasource {
  
  ALERTS("ALERTS"),
  
  CLOUD_AND_ENTERPRISE_AGENTS("CLOUD_AND_ENTERPRISE_AGENTS"),
  
  DEVICES("DEVICES"),
  
  ENDPOINT_AST_TEST("ENDPOINT_AST_TEST"),
  
  ENDPOINT_BROWSER_SESSION("ENDPOINT_BROWSER_SESSION"),
  
  ENDPOINT_LOCAL_NETWORK("ENDPOINT_LOCAL_NETWORK"),
  
  ENDPOINT_LOCAL_NETWORK_WIRELESS("ENDPOINT_LOCAL_NETWORK_WIRELESS"),
  
  ENDPOINT_SCHEDULED_TEST("ENDPOINT_SCHEDULED_TEST"),
  
  INTERNET_INSIGHTS("INTERNET_INSIGHTS"),
  
  ROUTING("ROUTING");

  private String value;

  BoxAndWhiskersDatasource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BoxAndWhiskersDatasource fromValue(String value) {
    for (BoxAndWhiskersDatasource b : BoxAndWhiskersDatasource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BoxAndWhiskersDatasource> {
    @Override
    public void write(final JsonWriter jsonWriter, final BoxAndWhiskersDatasource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BoxAndWhiskersDatasource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BoxAndWhiskersDatasource.fromValue(value);
    }
  }
}

