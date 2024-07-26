/*
 * Endpoint Agent Labels API
 * Manage labels applied to endpoint agents using this API. 
 *
 * The version of the OpenAPI document: 7.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.labels.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies how the filters are combined for matching this label.  * &#x60;and&#x60;: All filters must be matched. * &#x60;or&#x60;: Any of the filters should match. 
 */
public enum MatchType {
  
  AND("and"),
  
  OR("or");

  private String value;

  MatchType(String value) {
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
  public static MatchType fromValue(String value) {
    for (MatchType b : MatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

