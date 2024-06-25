/*
 * Instant Tests API
 * The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
 * The version of the OpenAPI document: 7.0.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.instant.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * DSCP ID [to see list for acceptable values](https://docs.thousandeyes.com/product-documentation/tests/dscp-options-in-network-tests)
 */
public enum TestDscpId {
  
  _0("0"),
  
  _8("8"),
  
  _16("16"),
  
  _24("24"),
  
  _32("32"),
  
  _40("40"),
  
  _48("48"),
  
  _56("56"),
  
  _10("10"),
  
  _12("12"),
  
  _14("14"),
  
  _18("18"),
  
  _20("20"),
  
  _22("22"),
  
  _26("26"),
  
  _28("28"),
  
  _30("30"),
  
  _34("34"),
  
  _36("36"),
  
  _38("38"),
  
  _46("46"),
  
  _44("44");

  private String value;

  TestDscpId(String value) {
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
  public static TestDscpId fromValue(String value) {
    for (TestDscpId b : TestDscpId.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

