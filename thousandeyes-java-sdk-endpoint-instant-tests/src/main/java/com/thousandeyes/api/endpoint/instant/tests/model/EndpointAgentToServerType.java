/*
 * Endpoint Instant Scheduled Tests API
 *  ### Overview  You can create and execute a new endpoint instant scheduled test within ThousandEyes using this API. The test parameters are specified in the `POST` data.  The following applies to the Endpoint Instant Scheduled Tests API:  * To initiate the creation and execution of an instant scheduled test, the user must possess the `Edit endpoint tests` permission.  * Upon successful creation of an instant scheduled test, the API responds with an HTTP/201 CREATED status code and return the test definition. * It's important to note that the response does not include the results of the instant scheduled test. To retrieve test results, users can utilize the Endpoint Test Data endpoints. The URLs for these API test data endpoints are provided within the test definition output when an instant scheduled test is created. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.instant.tests.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Type of test being queried.
 */
@JsonAdapter(EndpointAgentToServerType.Adapter.class)
public enum EndpointAgentToServerType {
  
  AGENT_TO_SERVER("agent-to-server");

  private String value;

  EndpointAgentToServerType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EndpointAgentToServerType fromValue(String value) {
    for (EndpointAgentToServerType b : EndpointAgentToServerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EndpointAgentToServerType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EndpointAgentToServerType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EndpointAgentToServerType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EndpointAgentToServerType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    EndpointAgentToServerType.fromValue(value);
  }
}

