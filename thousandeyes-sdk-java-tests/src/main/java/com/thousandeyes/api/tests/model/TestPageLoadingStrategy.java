/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * * &#x60;normal&#x60;: The test waits until the entire page is fully loaded, including the downloading and parsing of HTML content as well as all associated resources, before advancing to the next action in the transaction test script.  * &#x60;eager&#x60;: The test waits for the DOMContentLoaded event, indicating that HTML content is downloaded and parsed, and the document reaches the \&quot;interactive\&quot; readiness state, before proceeding to the next action in the test script. * &#x60;none&#x60;: The test only waits for the download of HTML content. Once the HTML is downloaded, the test continues to the next action in the transaction test script without waiting for additional resources. 
 */
public enum TestPageLoadingStrategy {
  
  NORMAL("normal"),
  
  EAGER("eager"),
  
  NONE("none");

  private String value;

  TestPageLoadingStrategy(String value) {
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
  public static TestPageLoadingStrategy fromValue(String value) {
    for (TestPageLoadingStrategy b : TestPageLoadingStrategy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

