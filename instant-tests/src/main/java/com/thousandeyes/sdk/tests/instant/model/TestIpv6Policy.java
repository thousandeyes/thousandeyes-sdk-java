/*
 * Instant Tests API
 * The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
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
 * IP version policy. Overrides the IPv6 policy configured at the agent level.
 */
public enum TestIpv6Policy {
  
  FORCE_IPV4("force-ipv4"),
  
  PREFER_IPV6("prefer-ipv6"),
  
  FORCE_IPV6("force-ipv6"),
  
  USE_AGENT_POLICY("use-agent-policy"),
  
  UNKNOWN("unknown");

  private String value;

  TestIpv6Policy(String value) {
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
  public static TestIpv6Policy fromValue(String value) {
    for (TestIpv6Policy b : TestIpv6Policy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
  }

}

