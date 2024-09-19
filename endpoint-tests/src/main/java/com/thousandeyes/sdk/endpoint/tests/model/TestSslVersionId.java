/*
 * Endpoint Tests API
 *  Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SSL version options:  * Use &#39;0&#39; for automatic selection. * Use &#39;3&#39; for SSLv3. * Use &#39;4&#39; for TLS v1.0. * Use &#39;5&#39; for TLS v1.1. * Use &#39;6&#39; for TLS v1.2. 
 */
public enum TestSslVersionId {
  
  _0("0"),
  
  _3("3"),
  
  _4("4"),
  
  _5("5"),
  
  _6("6"),
  
  UNKNOWN("unknown");

  private String value;

  TestSslVersionId(String value) {
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
  public static TestSslVersionId fromValue(String value) {
    for (TestSslVersionId b : TestSslVersionId.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
  }

}

