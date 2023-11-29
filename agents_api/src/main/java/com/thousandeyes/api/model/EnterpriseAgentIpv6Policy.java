/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
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
 * IP version policy, (Enterprise Agents and Enterprise Clusters only)
 */
@JsonAdapter(EnterpriseAgentIpv6Policy.Adapter.class)
public enum EnterpriseAgentIpv6Policy {
  
  FORCE_IPV4("force-ipv4"),
  
  PREFER_IPV6("prefer-ipv6"),
  
  FORCE_IPV6("force-ipv6");

  private String value;

  EnterpriseAgentIpv6Policy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnterpriseAgentIpv6Policy fromValue(String value) {
    for (EnterpriseAgentIpv6Policy b : EnterpriseAgentIpv6Policy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnterpriseAgentIpv6Policy> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnterpriseAgentIpv6Policy enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnterpriseAgentIpv6Policy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnterpriseAgentIpv6Policy.fromValue(value);
    }
  }
}

