/*
 * Endpoint Agent Labels API
 * Manage labels applied to endpoint agents using this API. 
 *
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
 * Type of filter - the data that will be used to filter.
 */
public enum FilterType {
  
  AGENT_ID("agent-id"),
  
  PUBLIC_NETWORK("public-network"),
  
  LOCAL_NETWORK("local-network"),
  
  CONNECTION("connection"),
  
  GATEWAY("gateway"),
  
  PLATFORM("platform"),
  
  AGENT_TYPE("agent-type"),
  
  VPN_VENDOR("vpn-vendor"),
  
  VPN_GATEWAY_ADDRESS("vpn-gateway-address"),
  
  VPN_CLIENT_NETWORK("vpn-client-network"),
  
  VPN_CLIENT_ADDRESS("vpn-client-address"),
  
  IP_ADDRESS_FAMILY("ip-address-family"),
  
  SSID("ssid"),
  
  BSSID("bssid"),
  
  HOSTNAME("hostname"),
  
  USERNAME("username"),
  
  ASN("asn"),
  
  UNKNOWN("unknown");

  private String value;

  FilterType(String value) {
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
  public static FilterType fromValue(String value) {
    for (FilterType b : FilterType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
  }

}

