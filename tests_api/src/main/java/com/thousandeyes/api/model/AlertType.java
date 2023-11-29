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
 * Type of alert being triggered. In multi-layered tests, this value represents the layer the alert relates to. See [Alert Details](https://developer.thousandeyes.com/v7/alerts/#/alert-details) documentation for a list of possible values
 */
@JsonAdapter(AlertType.Adapter.class)
public enum AlertType {
  
  PAGE_LOAD("page-load"),
  
  HTTP_SERVER("http-server"),
  
  END_TO_END_SERVER("end-to-end-server"),
  
  END_TO_END_AGENT("end-to-end-agent"),
  
  VOICE("voice"),
  
  DNS_SERVER("dns-server"),
  
  DNS_TRACE("dns-trace"),
  
  DNSSEC("dnssec"),
  
  BGP("bgp"),
  
  PATH_TRACE("path-trace"),
  
  FTP("ftp"),
  
  SIP_SERVER("sip-server"),
  
  TRANSACTIONS("transactions"),
  
  WEB_TRANSACTIONS("web-transactions"),
  
  AGENT("agent"),
  
  NETWORK_OUTAGE("network-outage"),
  
  APPLICATION_OUTAGE("application-outage"),
  
  DEVICE_DEVICE("device-device"),
  
  DEVICE_INTERFACE("device-interface"),
  
  ENDPOINT_NETWORK_SERVER("endpoint-network-server"),
  
  ENDPOINT_HTTP_SERVER("endpoint-http-server"),
  
  ENDPOINT_PATH_TRACE("endpoint-path-trace"),
  
  ENDPOINT_BROWSER_SESSIONS_AGENT("endpoint-browser-sessions-agent"),
  
  ENDPOINT_BROWSER_SESSIONS_APPLICATION("endpoint-browser-sessions-application"),
  
  UNKNOWN("unknown");

  private String value;

  AlertType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AlertType fromValue(String value) {
    for (AlertType b : AlertType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AlertType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AlertType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AlertType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AlertType.fromValue(value);
    }
  }
}

