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
import com.thousandeyes.api.tests.model.AgentToAgentTestProtocol;
import com.thousandeyes.api.tests.model.TestDirection;
import com.thousandeyes.api.tests.model.TestDscpId;
import com.thousandeyes.api.tests.model.TestPathTraceMode;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AgentToAgentProperties
 */
@JsonPropertyOrder({
  AgentToAgentProperties.JSON_PROPERTY_DIRECTION,
  AgentToAgentProperties.JSON_PROPERTY_DSCP,
  AgentToAgentProperties.JSON_PROPERTY_DSCP_ID,
  AgentToAgentProperties.JSON_PROPERTY_MSS,
  AgentToAgentProperties.JSON_PROPERTY_NUM_PATH_TRACES,
  AgentToAgentProperties.JSON_PROPERTY_PATH_TRACE_MODE,
  AgentToAgentProperties.JSON_PROPERTY_PORT,
  AgentToAgentProperties.JSON_PROPERTY_PROTOCOL,
  AgentToAgentProperties.JSON_PROPERTY_TARGET_AGENT_ID,
  AgentToAgentProperties.JSON_PROPERTY_THROUGHPUT_MEASUREMENTS,
  AgentToAgentProperties.JSON_PROPERTY_THROUGHPUT_DURATION,
  AgentToAgentProperties.JSON_PROPERTY_THROUGHPUT_RATE,
  AgentToAgentProperties.JSON_PROPERTY_FIXED_PACKET_RATE,
  AgentToAgentProperties.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T10:46:27.140198+01:00[Europe/Lisbon]")
public class AgentToAgentProperties {
  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private TestDirection direction = TestDirection.TO_TARGET;

  public static final String JSON_PROPERTY_DSCP = "dscp";
  private String dscp;

  public static final String JSON_PROPERTY_DSCP_ID = "dscpId";
  private TestDscpId dscpId = TestDscpId._0;

  public static final String JSON_PROPERTY_MSS = "mss";
  private Integer mss;

  public static final String JSON_PROPERTY_NUM_PATH_TRACES = "numPathTraces";
  private Integer numPathTraces = 3;

  public static final String JSON_PROPERTY_PATH_TRACE_MODE = "pathTraceMode";
  private TestPathTraceMode pathTraceMode = TestPathTraceMode.CLASSIC;

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port = 49153;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private AgentToAgentTestProtocol protocol = AgentToAgentTestProtocol.TCP;

  public static final String JSON_PROPERTY_TARGET_AGENT_ID = "targetAgentId";
  private String targetAgentId;

  public static final String JSON_PROPERTY_THROUGHPUT_MEASUREMENTS = "throughputMeasurements";
  private Boolean throughputMeasurements = false;

  public static final String JSON_PROPERTY_THROUGHPUT_DURATION = "throughputDuration";
  private Integer throughputDuration = 10000;

  public static final String JSON_PROPERTY_THROUGHPUT_RATE = "throughputRate";
  private Integer throughputRate;

  public static final String JSON_PROPERTY_FIXED_PACKET_RATE = "fixedPacketRate";
  private Integer fixedPacketRate;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public AgentToAgentProperties() { 
  }

  @JsonCreator
  public AgentToAgentProperties(
    @JsonProperty(JSON_PROPERTY_DSCP) String dscp, 
    @JsonProperty(JSON_PROPERTY_TYPE) String type
  ) {
  this();
    this.dscp = dscp;
    this.type = type;
  }

  public AgentToAgentProperties direction(TestDirection direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestDirection getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(TestDirection direction) {
    this.direction = direction;
  }


   /**
   * DSCP label.
   * @return dscp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DSCP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDscp() {
    return dscp;
  }




  public AgentToAgentProperties dscpId(TestDscpId dscpId) {
    this.dscpId = dscpId;
    return this;
  }

   /**
   * Get dscpId
   * @return dscpId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DSCP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestDscpId getDscpId() {
    return dscpId;
  }


  @JsonProperty(JSON_PROPERTY_DSCP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDscpId(TestDscpId dscpId) {
    this.dscpId = dscpId;
  }


  public AgentToAgentProperties mss(Integer mss) {
    this.mss = mss;
    return this;
  }

   /**
   * Maximum segment size, in bytes.
   * minimum: 20
   * maximum: 1400
   * @return mss
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMss() {
    return mss;
  }


  @JsonProperty(JSON_PROPERTY_MSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMss(Integer mss) {
    this.mss = mss;
  }


  public AgentToAgentProperties numPathTraces(Integer numPathTraces) {
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


  public AgentToAgentProperties pathTraceMode(TestPathTraceMode pathTraceMode) {
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


  public AgentToAgentProperties port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Target port.
   * minimum: 1
   * maximum: 65535
   * @return port
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPort(Integer port) {
    this.port = port;
  }


  public AgentToAgentProperties protocol(AgentToAgentTestProtocol protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AgentToAgentTestProtocol getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(AgentToAgentTestProtocol protocol) {
    this.protocol = protocol;
  }


  public AgentToAgentProperties targetAgentId(String targetAgentId) {
    this.targetAgentId = targetAgentId;
    return this;
  }

   /**
   * &#x60;agentId&#x60; of the target agent for the test.
   * @return targetAgentId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TARGET_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTargetAgentId() {
    return targetAgentId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetAgentId(String targetAgentId) {
    this.targetAgentId = targetAgentId;
  }


  public AgentToAgentProperties throughputMeasurements(Boolean throughputMeasurements) {
    this.throughputMeasurements = throughputMeasurements;
    return this;
  }

   /**
   * Enable or disable throughput measurements. Throughput measurements cannot be enabled when the source or target of the test is a cloud agent.
   * @return throughputMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THROUGHPUT_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getThroughputMeasurements() {
    return throughputMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_THROUGHPUT_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThroughputMeasurements(Boolean throughputMeasurements) {
    this.throughputMeasurements = throughputMeasurements;
  }


  public AgentToAgentProperties throughputDuration(Integer throughputDuration) {
    this.throughputDuration = throughputDuration;
    return this;
  }

   /**
   * The throughput duration.
   * minimum: 5000
   * maximum: 30000
   * @return throughputDuration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THROUGHPUT_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getThroughputDuration() {
    return throughputDuration;
  }


  @JsonProperty(JSON_PROPERTY_THROUGHPUT_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThroughputDuration(Integer throughputDuration) {
    this.throughputDuration = throughputDuration;
  }


  public AgentToAgentProperties throughputRate(Integer throughputRate) {
    this.throughputRate = throughputRate;
    return this;
  }

   /**
   * The throughput rate, only applicable for UDP protocol.
   * minimum: 8
   * maximum: 1000
   * @return throughputRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THROUGHPUT_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getThroughputRate() {
    return throughputRate;
  }


  @JsonProperty(JSON_PROPERTY_THROUGHPUT_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThroughputRate(Integer throughputRate) {
    this.throughputRate = throughputRate;
  }


  public AgentToAgentProperties fixedPacketRate(Integer fixedPacketRate) {
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
   * Return true if this AgentToAgentProperties object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentToAgentProperties agentToAgentProperties = (AgentToAgentProperties) o;
    return Objects.equals(this.direction, agentToAgentProperties.direction) &&
        Objects.equals(this.dscp, agentToAgentProperties.dscp) &&
        Objects.equals(this.dscpId, agentToAgentProperties.dscpId) &&
        Objects.equals(this.mss, agentToAgentProperties.mss) &&
        Objects.equals(this.numPathTraces, agentToAgentProperties.numPathTraces) &&
        Objects.equals(this.pathTraceMode, agentToAgentProperties.pathTraceMode) &&
        Objects.equals(this.port, agentToAgentProperties.port) &&
        Objects.equals(this.protocol, agentToAgentProperties.protocol) &&
        Objects.equals(this.targetAgentId, agentToAgentProperties.targetAgentId) &&
        Objects.equals(this.throughputMeasurements, agentToAgentProperties.throughputMeasurements) &&
        Objects.equals(this.throughputDuration, agentToAgentProperties.throughputDuration) &&
        Objects.equals(this.throughputRate, agentToAgentProperties.throughputRate) &&
        Objects.equals(this.fixedPacketRate, agentToAgentProperties.fixedPacketRate) &&
        Objects.equals(this.type, agentToAgentProperties.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, dscp, dscpId, mss, numPathTraces, pathTraceMode, port, protocol, targetAgentId, throughputMeasurements, throughputDuration, throughputRate, fixedPacketRate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentToAgentProperties {\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    dscp: ").append(toIndentedString(dscp)).append("\n");
    sb.append("    dscpId: ").append(toIndentedString(dscpId)).append("\n");
    sb.append("    mss: ").append(toIndentedString(mss)).append("\n");
    sb.append("    numPathTraces: ").append(toIndentedString(numPathTraces)).append("\n");
    sb.append("    pathTraceMode: ").append(toIndentedString(pathTraceMode)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    targetAgentId: ").append(toIndentedString(targetAgentId)).append("\n");
    sb.append("    throughputMeasurements: ").append(toIndentedString(throughputMeasurements)).append("\n");
    sb.append("    throughputDuration: ").append(toIndentedString(throughputDuration)).append("\n");
    sb.append("    throughputRate: ").append(toIndentedString(throughputRate)).append("\n");
    sb.append("    fixedPacketRate: ").append(toIndentedString(fixedPacketRate)).append("\n");
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

