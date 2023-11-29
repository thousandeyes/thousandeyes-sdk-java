/*
 * Endpoint Agent Labels API
 * Manage labels applied to endpoint agents using this API. 
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
 * Specifies how the filters are combined for matching this label.  * &#x60;and&#x60;: All filters must be matched. * &#x60;or&#x60;: Any of the filters should match. 
 */
@JsonAdapter(MatchType.Adapter.class)
public enum MatchType {
  
  AND("and"),
  
  OR("or");

  private String value;

  MatchType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MatchType fromValue(String value) {
    for (MatchType b : MatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MatchType> {
    @Override
    public void write(final JsonWriter jsonWriter, final MatchType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MatchType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MatchType.fromValue(value);
    }
  }
}

