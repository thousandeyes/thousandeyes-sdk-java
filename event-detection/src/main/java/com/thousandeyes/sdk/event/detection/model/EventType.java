/*
 * Event Detection API
 *  Event detection occurs when ThousandEyes identifies that error signals related to a component (proxy, network node, AS, server etc) have deviated from the baselines established by events. * To determine this, ThousandEyes takes the test results from all accounts groups within an organization, and analyzes that data. * Noisy test results (those that have too many errors in a short window) are removed until they stabilize, and the rest of the results are tagged with the components associated with that test result (for example, proxy, network, or server). * Next, any increase in failures from the test results and each component helps in determining the problem domain and which component may be at fault. * When this failure rate increases beyond a pre-defined threshold (set by the algorithm), an event is triggered and an email notification is sent to the user (if they've enabled email alerts).  With the Events API, you can perform the following tasks on the ThousandEyes platform: * **Retrieve Events**: Obtain a list of events and detailed information for each event. For more information about events, see [Event Detection](https://docs.thousandeyes.com/product-documentation/event-detection). 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.event.detection.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the event type in a machine-readable and backwards-compatible format. Allowed values are: &#x60;agent-local&#x60;, &#x60;network-pop&#x60;, &#x60;network&#x60;, &#x60;dns&#x60;, &#x60;target&#x60;, and &#x60;proxy&#x60;.
 */
public enum EventType {
  
  AGENT_LOCAL("agent-local"),
  
  NETWORK_POP("network-pop"),
  
  NETWORK("network"),
  
  DNS("dns"),
  
  TARGET("target"),
  
  TARGET_NETWORK("target-network"),
  
  PROXY("proxy"),
  
  UNKNOWN("unknown");

  private String value;

  EventType(String value) {
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
  public static EventType fromValue(String value) {
    for (EventType b : EventType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
  }

}

