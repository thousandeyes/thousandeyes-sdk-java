/*
 * Endpoint Instant Scheduled Tests API
 *  You can create and execute a new endpoint instant scheduled test within ThousandEyes using this API. The test parameters are specified in the `POST` data.  The following applies to the Endpoint Instant Scheduled Tests API:  * To initiate the creation and execution of an instant scheduled test, the user must possess the `Edit endpoint tests` permission.  * Upon successful creation of an instant scheduled test, the API responds with an HTTP/201 CREATED status code and return the test definition. * It's important to note that the response does not include the results of the instant scheduled test. To retrieve test results, users can utilize the Endpoint Test Data endpoints. The URLs for these API test data endpoints are provided within the test definition output when an instant scheduled test is created. 
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.instant.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of alert being triggered. In multi-layered tests, this value represents the layer the alert relates to. See [Alert Details](https://developer.thousandeyes.com/v7/alerts/#/alert-details) documentation for a list of possible values
 */
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
  
  API("api"),
  
  WEB_TRANSACTION("web-transaction"),
  
  UNKNOWN("unknown");

  private String value;

  AlertType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AlertType fromValue(String value) {
    for (AlertType b : AlertType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

