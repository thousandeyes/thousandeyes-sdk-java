/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.0
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.tests.model.TestIpv6Policy;
import com.thousandeyes.api.tests.model.TestPathTraceMode;
import com.thousandeyes.api.tests.model.TestProbeMode;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SipServerProperties
 */
@JsonPropertyOrder({
  SipServerProperties.JSON_PROPERTY_MTU_MEASUREMENTS,
  SipServerProperties.JSON_PROPERTY_NETWORK_MEASUREMENTS,
  SipServerProperties.JSON_PROPERTY_NUM_PATH_TRACES,
  SipServerProperties.JSON_PROPERTY_OPTIONS_REGEX,
  SipServerProperties.JSON_PROPERTY_PATH_TRACE_MODE,
  SipServerProperties.JSON_PROPERTY_PROBE_MODE,
  SipServerProperties.JSON_PROPERTY_REGISTER_ENABLED,
  SipServerProperties.JSON_PROPERTY_SIP_TARGET_TIME,
  SipServerProperties.JSON_PROPERTY_SIP_TIME_LIMIT,
  SipServerProperties.JSON_PROPERTY_FIXED_PACKET_RATE,
  SipServerProperties.JSON_PROPERTY_IPV6_POLICY,
  SipServerProperties.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T17:12:32.734520+01:00[Europe/Lisbon]")
public class SipServerProperties {
  public static final String JSON_PROPERTY_MTU_MEASUREMENTS = "mtuMeasurements";
  private Boolean mtuMeasurements;

  public static final String JSON_PROPERTY_NETWORK_MEASUREMENTS = "networkMeasurements";
  private Boolean networkMeasurements = true;

  public static final String JSON_PROPERTY_NUM_PATH_TRACES = "numPathTraces";
  private Integer numPathTraces = 3;

  public static final String JSON_PROPERTY_OPTIONS_REGEX = "optionsRegex";
  private String optionsRegex;

  public static final String JSON_PROPERTY_PATH_TRACE_MODE = "pathTraceMode";
  private TestPathTraceMode pathTraceMode = TestPathTraceMode.CLASSIC;

  public static final String JSON_PROPERTY_PROBE_MODE = "probeMode";
  private TestProbeMode probeMode = TestProbeMode.AUTO;

  public static final String JSON_PROPERTY_REGISTER_ENABLED = "registerEnabled";
  private Boolean registerEnabled = false;

  public static final String JSON_PROPERTY_SIP_TARGET_TIME = "sipTargetTime";
  private Integer sipTargetTime;

  public static final String JSON_PROPERTY_SIP_TIME_LIMIT = "sipTimeLimit";
  private Integer sipTimeLimit = 5;

  public static final String JSON_PROPERTY_FIXED_PACKET_RATE = "fixedPacketRate";
  private Integer fixedPacketRate;

  public static final String JSON_PROPERTY_IPV6_POLICY = "ipv6Policy";
  private TestIpv6Policy ipv6Policy = TestIpv6Policy.USE_AGENT_POLICY;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public SipServerProperties() { 
  }

  @JsonCreator
  public SipServerProperties(
    @JsonProperty(JSON_PROPERTY_TYPE) String type
  ) {
  this();
    this.type = type;
  }

  public SipServerProperties mtuMeasurements(Boolean mtuMeasurements) {
    this.mtuMeasurements = mtuMeasurements;
    return this;
  }

   /**
   * Set &#x60;true&#x60; to measure MTU sizes on network from agents to the target.
   * @return mtuMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MTU_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMtuMeasurements() {
    return mtuMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_MTU_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMtuMeasurements(Boolean mtuMeasurements) {
    this.mtuMeasurements = mtuMeasurements;
  }


  public SipServerProperties networkMeasurements(Boolean networkMeasurements) {
    this.networkMeasurements = networkMeasurements;
    return this;
  }

   /**
   * Enable or disable network measurements. Set to true to enable or false to disable network measurements.
   * @return networkMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNetworkMeasurements() {
    return networkMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkMeasurements(Boolean networkMeasurements) {
    this.networkMeasurements = networkMeasurements;
  }


  public SipServerProperties numPathTraces(Integer numPathTraces) {
    this.numPathTraces = numPathTraces;
    return this;
  }

   /**
   * Number of path traces executed by the agent.
   * minimum: 1
   * maximum: 10
   * @return numPathTraces
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_PATH_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumPathTraces() {
    return numPathTraces;
  }


  @JsonProperty(JSON_PROPERTY_NUM_PATH_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumPathTraces(Integer numPathTraces) {
    this.numPathTraces = numPathTraces;
  }


  public SipServerProperties optionsRegex(String optionsRegex) {
    this.optionsRegex = optionsRegex;
    return this;
  }

   /**
   * Options regex, this field does not require escaping.
   * @return optionsRegex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOptionsRegex() {
    return optionsRegex;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptionsRegex(String optionsRegex) {
    this.optionsRegex = optionsRegex;
  }


  public SipServerProperties pathTraceMode(TestPathTraceMode pathTraceMode) {
    this.pathTraceMode = pathTraceMode;
    return this;
  }

   /**
   * Get pathTraceMode
   * @return pathTraceMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_TRACE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestPathTraceMode getPathTraceMode() {
    return pathTraceMode;
  }


  @JsonProperty(JSON_PROPERTY_PATH_TRACE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPathTraceMode(TestPathTraceMode pathTraceMode) {
    this.pathTraceMode = pathTraceMode;
  }


  public SipServerProperties probeMode(TestProbeMode probeMode) {
    this.probeMode = probeMode;
    return this;
  }

   /**
   * Get probeMode
   * @return probeMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestProbeMode getProbeMode() {
    return probeMode;
  }


  @JsonProperty(JSON_PROPERTY_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProbeMode(TestProbeMode probeMode) {
    this.probeMode = probeMode;
  }


  public SipServerProperties registerEnabled(Boolean registerEnabled) {
    this.registerEnabled = registerEnabled;
    return this;
  }

   /**
   * Set to true to perform SIP registration on the test target with the SIP REGISTER command.
   * @return registerEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGISTER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRegisterEnabled() {
    return registerEnabled;
  }


  @JsonProperty(JSON_PROPERTY_REGISTER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegisterEnabled(Boolean registerEnabled) {
    this.registerEnabled = registerEnabled;
  }


  public SipServerProperties sipTargetTime(Integer sipTargetTime) {
    this.sipTargetTime = sipTargetTime;
    return this;
  }

   /**
   * Target time for test completion in milliseconds.
   * minimum: 100
   * maximum: 5000
   * @return sipTargetTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIP_TARGET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSipTargetTime() {
    return sipTargetTime;
  }


  @JsonProperty(JSON_PROPERTY_SIP_TARGET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSipTargetTime(Integer sipTargetTime) {
    this.sipTargetTime = sipTargetTime;
  }


  public SipServerProperties sipTimeLimit(Integer sipTimeLimit) {
    this.sipTimeLimit = sipTimeLimit;
    return this;
  }

   /**
   * Time limit in milliseconds.
   * minimum: 5
   * maximum: 10
   * @return sipTimeLimit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIP_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSipTimeLimit() {
    return sipTimeLimit;
  }


  @JsonProperty(JSON_PROPERTY_SIP_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSipTimeLimit(Integer sipTimeLimit) {
    this.sipTimeLimit = sipTimeLimit;
  }


  public SipServerProperties fixedPacketRate(Integer fixedPacketRate) {
    this.fixedPacketRate = fixedPacketRate;
    return this;
  }

   /**
   * Sets packets rate sent to measure the network in packets per second.
   * minimum: 0
   * maximum: 100
   * @return fixedPacketRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIXED_PACKET_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFixedPacketRate() {
    return fixedPacketRate;
  }


  @JsonProperty(JSON_PROPERTY_FIXED_PACKET_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixedPacketRate(Integer fixedPacketRate) {
    this.fixedPacketRate = fixedPacketRate;
  }


  public SipServerProperties ipv6Policy(TestIpv6Policy ipv6Policy) {
    this.ipv6Policy = ipv6Policy;
    return this;
  }

   /**
   * Get ipv6Policy
   * @return ipv6Policy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IPV6_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestIpv6Policy getIpv6Policy() {
    return ipv6Policy;
  }


  @JsonProperty(JSON_PROPERTY_IPV6_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpv6Policy(TestIpv6Policy ipv6Policy) {
    this.ipv6Policy = ipv6Policy;
  }


   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }




  /**
   * Return true if this SipServerProperties object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SipServerProperties sipServerProperties = (SipServerProperties) o;
    return Objects.equals(this.mtuMeasurements, sipServerProperties.mtuMeasurements) &&
        Objects.equals(this.networkMeasurements, sipServerProperties.networkMeasurements) &&
        Objects.equals(this.numPathTraces, sipServerProperties.numPathTraces) &&
        Objects.equals(this.optionsRegex, sipServerProperties.optionsRegex) &&
        Objects.equals(this.pathTraceMode, sipServerProperties.pathTraceMode) &&
        Objects.equals(this.probeMode, sipServerProperties.probeMode) &&
        Objects.equals(this.registerEnabled, sipServerProperties.registerEnabled) &&
        Objects.equals(this.sipTargetTime, sipServerProperties.sipTargetTime) &&
        Objects.equals(this.sipTimeLimit, sipServerProperties.sipTimeLimit) &&
        Objects.equals(this.fixedPacketRate, sipServerProperties.fixedPacketRate) &&
        Objects.equals(this.ipv6Policy, sipServerProperties.ipv6Policy) &&
        Objects.equals(this.type, sipServerProperties.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mtuMeasurements, networkMeasurements, numPathTraces, optionsRegex, pathTraceMode, probeMode, registerEnabled, sipTargetTime, sipTimeLimit, fixedPacketRate, ipv6Policy, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SipServerProperties {\n");
    sb.append("    mtuMeasurements: ").append(toIndentedString(mtuMeasurements)).append("\n");
    sb.append("    networkMeasurements: ").append(toIndentedString(networkMeasurements)).append("\n");
    sb.append("    numPathTraces: ").append(toIndentedString(numPathTraces)).append("\n");
    sb.append("    optionsRegex: ").append(toIndentedString(optionsRegex)).append("\n");
    sb.append("    pathTraceMode: ").append(toIndentedString(pathTraceMode)).append("\n");
    sb.append("    probeMode: ").append(toIndentedString(probeMode)).append("\n");
    sb.append("    registerEnabled: ").append(toIndentedString(registerEnabled)).append("\n");
    sb.append("    sipTargetTime: ").append(toIndentedString(sipTargetTime)).append("\n");
    sb.append("    sipTimeLimit: ").append(toIndentedString(sipTimeLimit)).append("\n");
    sb.append("    fixedPacketRate: ").append(toIndentedString(fixedPacketRate)).append("\n");
    sb.append("    ipv6Policy: ").append(toIndentedString(ipv6Policy)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

