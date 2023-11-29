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
 * Integration type.
 */
@JsonAdapter(WebhookIntegrationType.Adapter.class)
public enum WebhookIntegrationType {
  
  WEBHOOK("webhook");

  private String value;

  WebhookIntegrationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WebhookIntegrationType fromValue(String value) {
    for (WebhookIntegrationType b : WebhookIntegrationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<WebhookIntegrationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final WebhookIntegrationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WebhookIntegrationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WebhookIntegrationType.fromValue(value);
    }
  }
}

