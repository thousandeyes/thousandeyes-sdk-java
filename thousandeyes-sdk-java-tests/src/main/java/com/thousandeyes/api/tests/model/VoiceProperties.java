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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.tests.model.TestDscpId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * VoiceProperties
 */
@JsonPropertyOrder({
  VoiceProperties.JSON_PROPERTY_CODEC,
  VoiceProperties.JSON_PROPERTY_CODEC_ID,
  VoiceProperties.JSON_PROPERTY_DSCP,
  VoiceProperties.JSON_PROPERTY_DSCP_ID,
  VoiceProperties.JSON_PROPERTY_DURATION,
  VoiceProperties.JSON_PROPERTY_JITTER_BUFFER,
  VoiceProperties.JSON_PROPERTY_NUM_PATH_TRACES,
  VoiceProperties.JSON_PROPERTY_PORT,
  VoiceProperties.JSON_PROPERTY_TARGET_AGENT_ID,
  VoiceProperties.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class VoiceProperties {
  public static final String JSON_PROPERTY_CODEC = "codec";
  private String codec;

  public static final String JSON_PROPERTY_CODEC_ID = "codecId";
  private String codecId;

  public static final String JSON_PROPERTY_DSCP = "dscp";
  private String dscp;

  public static final String JSON_PROPERTY_DSCP_ID = "dscpId";
  private TestDscpId dscpId = TestDscpId._0;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration = 5;

  public static final String JSON_PROPERTY_JITTER_BUFFER = "jitterBuffer";
  private Integer jitterBuffer = 40;

  public static final String JSON_PROPERTY_NUM_PATH_TRACES = "numPathTraces";
  private Integer numPathTraces = 3;

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port;

  public static final String JSON_PROPERTY_TARGET_AGENT_ID = "targetAgentId";
  private String targetAgentId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public VoiceProperties() { 
  }

  @JsonCreator
  public VoiceProperties(
    @JsonProperty(JSON_PROPERTY_CODEC) String codec, 
    @JsonProperty(JSON_PROPERTY_DSCP) String dscp, 
    @JsonProperty(JSON_PROPERTY_TYPE) String type
  ) {
  this();
    this.codec = codec;
    this.dscp = dscp;
    this.type = type;
  }

   /**
   * Codec label
   * @return codec
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODEC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCodec() {
    return codec;
  }




  public VoiceProperties codecId(String codecId) {
    this.codecId = codecId;
    return this;
  }

   /**
   * Coded ID, [see the list of acceptable values](https://docs.thousandeyes.com/product-documentation/internet-and-wan-monitoring/tests/working-with-test-settings#rtp-stream-advanced-settings-tab)
   * @return codecId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODEC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCodecId() {
    return codecId;
  }


  @JsonProperty(JSON_PROPERTY_CODEC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCodecId(String codecId) {
    this.codecId = codecId;
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




  public VoiceProperties dscpId(TestDscpId dscpId) {
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


  public VoiceProperties duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration of the test in seconds.
   * minimum: 5
   * maximum: 30
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public VoiceProperties jitterBuffer(Integer jitterBuffer) {
    this.jitterBuffer = jitterBuffer;
    return this;
  }

   /**
   * De-jitter buffer size in seconds.
   * minimum: 0
   * maximum: 150
   * @return jitterBuffer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JITTER_BUFFER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getJitterBuffer() {
    return jitterBuffer;
  }


  @JsonProperty(JSON_PROPERTY_JITTER_BUFFER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJitterBuffer(Integer jitterBuffer) {
    this.jitterBuffer = jitterBuffer;
  }


  public VoiceProperties numPathTraces(Integer numPathTraces) {
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


  public VoiceProperties port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Port number for the chosen protocol.
   * minimum: 1024
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


  public VoiceProperties targetAgentId(String targetAgentId) {
    this.targetAgentId = targetAgentId;
    return this;
  }

   /**
   * Agent ID of the target agent for the test.
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
   * Return true if this VoiceProperties object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoiceProperties voiceProperties = (VoiceProperties) o;
    return Objects.equals(this.codec, voiceProperties.codec) &&
        Objects.equals(this.codecId, voiceProperties.codecId) &&
        Objects.equals(this.dscp, voiceProperties.dscp) &&
        Objects.equals(this.dscpId, voiceProperties.dscpId) &&
        Objects.equals(this.duration, voiceProperties.duration) &&
        Objects.equals(this.jitterBuffer, voiceProperties.jitterBuffer) &&
        Objects.equals(this.numPathTraces, voiceProperties.numPathTraces) &&
        Objects.equals(this.port, voiceProperties.port) &&
        Objects.equals(this.targetAgentId, voiceProperties.targetAgentId) &&
        Objects.equals(this.type, voiceProperties.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codec, codecId, dscp, dscpId, duration, jitterBuffer, numPathTraces, port, targetAgentId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoiceProperties {\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    codecId: ").append(toIndentedString(codecId)).append("\n");
    sb.append("    dscp: ").append(toIndentedString(dscp)).append("\n");
    sb.append("    dscpId: ").append(toIndentedString(dscpId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    jitterBuffer: ").append(toIndentedString(jitterBuffer)).append("\n");
    sb.append("    numPathTraces: ").append(toIndentedString(numPathTraces)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    targetAgentId: ").append(toIndentedString(targetAgentId)).append("\n");
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

