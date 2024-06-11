/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.tests.results.model.Agent;
import com.thousandeyes.sdk.tests.results.model.TestResultAppLinks;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RtpStreamTestResult
 */
@JsonPropertyOrder({
  RtpStreamTestResult.JSON_PROPERTY_DATE,
  RtpStreamTestResult.JSON_PROPERTY_ROUND_ID,
  RtpStreamTestResult.JSON_PROPERTY_LINKS,
  RtpStreamTestResult.JSON_PROPERTY_START_TIME,
  RtpStreamTestResult.JSON_PROPERTY_END_TIME,
  RtpStreamTestResult.JSON_PROPERTY_AGENT,
  RtpStreamTestResult.JSON_PROPERTY_SERVER_IP,
  RtpStreamTestResult.JSON_PROPERTY_DSCP,
  RtpStreamTestResult.JSON_PROPERTY_DSCP_NAME,
  RtpStreamTestResult.JSON_PROPERTY_MOS,
  RtpStreamTestResult.JSON_PROPERTY_CODEC_NAME,
  RtpStreamTestResult.JSON_PROPERTY_CODEC_MAX_MOS,
  RtpStreamTestResult.JSON_PROPERTY_LOSS,
  RtpStreamTestResult.JSON_PROPERTY_DISCARDS,
  RtpStreamTestResult.JSON_PROPERTY_LATENCY,
  RtpStreamTestResult.JSON_PROPERTY_PDV,
  RtpStreamTestResult.JSON_PROPERTY_ERROR_DETAIL
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class RtpStreamTestResult {
  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private TestResultAppLinks links;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private Integer startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private Integer endTime;

  public static final String JSON_PROPERTY_AGENT = "agent";
  private Agent agent;

  public static final String JSON_PROPERTY_SERVER_IP = "serverIp";
  private String serverIp;

  public static final String JSON_PROPERTY_DSCP = "dscp";
  private String dscp;

  public static final String JSON_PROPERTY_DSCP_NAME = "dscpName";
  private String dscpName;

  public static final String JSON_PROPERTY_MOS = "mos";
  private Float mos;

  public static final String JSON_PROPERTY_CODEC_NAME = "codecName";
  private String codecName;

  public static final String JSON_PROPERTY_CODEC_MAX_MOS = "codecMaxMos";
  private Float codecMaxMos;

  public static final String JSON_PROPERTY_LOSS = "loss";
  private Float loss;

  public static final String JSON_PROPERTY_DISCARDS = "discards";
  private Float discards;

  public static final String JSON_PROPERTY_LATENCY = "latency";
  private Integer latency;

  public static final String JSON_PROPERTY_PDV = "pdv";
  private Integer pdv;

  public static final String JSON_PROPERTY_ERROR_DETAIL = "errorDetail";
  private String errorDetail;

  public RtpStreamTestResult() { 
  }

  @JsonCreator
  public RtpStreamTestResult(
    @JsonProperty(JSON_PROPERTY_DATE) OffsetDateTime date, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId, 
    @JsonProperty(JSON_PROPERTY_START_TIME) Integer startTime, 
    @JsonProperty(JSON_PROPERTY_END_TIME) Integer endTime, 
    @JsonProperty(JSON_PROPERTY_SERVER_IP) String serverIp, 
    @JsonProperty(JSON_PROPERTY_DSCP) String dscp, 
    @JsonProperty(JSON_PROPERTY_DSCP_NAME) String dscpName, 
    @JsonProperty(JSON_PROPERTY_MOS) Float mos, 
    @JsonProperty(JSON_PROPERTY_CODEC_NAME) String codecName, 
    @JsonProperty(JSON_PROPERTY_CODEC_MAX_MOS) Float codecMaxMos, 
    @JsonProperty(JSON_PROPERTY_LOSS) Float loss, 
    @JsonProperty(JSON_PROPERTY_DISCARDS) Float discards, 
    @JsonProperty(JSON_PROPERTY_LATENCY) Integer latency, 
    @JsonProperty(JSON_PROPERTY_PDV) Integer pdv, 
    @JsonProperty(JSON_PROPERTY_ERROR_DETAIL) String errorDetail
  ) {
  this();
    this.date = date;
    this.roundId = roundId;
    this.startTime = startTime;
    this.endTime = endTime;
    this.serverIp = serverIp;
    this.dscp = dscp;
    this.dscpName = dscpName;
    this.mos = mos;
    this.codecName = codecName;
    this.codecMaxMos = codecMaxMos;
    this.loss = loss;
    this.discards = discards;
    this.latency = latency;
    this.pdv = pdv;
    this.errorDetail = errorDetail;
  }

   /**
   * Data point date UTC (ISO date-time format).
   * @return date
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDate() {
    return date;
  }




   /**
   * Epoch time (seconds) indicating the start time of the round
   * @return roundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoundId() {
    return roundId;
  }




  public RtpStreamTestResult links(TestResultAppLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestResultAppLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(TestResultAppLinks links) {
    this.links = links;
  }


   /**
   * Epoch time (seconds) indicating the start time of the round
   * @return startTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartTime() {
    return startTime;
  }




   /**
   * Epoch time (seconds) indicating the end time of the round
   * @return endTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndTime() {
    return endTime;
  }




  public RtpStreamTestResult agent(Agent agent) {
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Agent getAgent() {
    return agent;
  }


  @JsonProperty(JSON_PROPERTY_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgent(Agent agent) {
    this.agent = agent;
  }


   /**
   * Target agent IP address
   * @return serverIp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServerIp() {
    return serverIp;
  }




   /**
   * DSCP value received by the server from the agent
   * @return dscp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DSCP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDscp() {
    return dscp;
  }




   /**
   * Name of DSCP value received by the server from the agent
   * @return dscpName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DSCP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDscpName() {
    return dscpName;
  }




   /**
   * Mean opinion score for agent’s stream
   * @return mos
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getMos() {
    return mos;
  }




   /**
   * Name of codec used by agen
   * @return codecName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODEC_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCodecName() {
    return codecName;
  }




   /**
   * Maximum value of Mean Opinion Score based on codec selection
   * @return codecMaxMos
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODEC_MAX_MOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getCodecMaxMos() {
    return codecMaxMos;
  }




   /**
   * Percentage value of packets sent from agent not received by server
   * @return loss
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getLoss() {
    return loss;
  }




   /**
   * Percentage of packets discarded
   * @return discards
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getDiscards() {
    return discards;
  }




   /**
   * Time to send packets from source to server in milliseconds
   * @return latency
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLatency() {
    return latency;
  }




   /**
   * Variation in packet delay in milliseconds
   * @return pdv
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PDV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPdv() {
    return pdv;
  }




   /**
   * Error details, if an error was encountered
   * @return errorDetail
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDetail() {
    return errorDetail;
  }




  /**
   * Return true if this RtpStreamTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RtpStreamTestResult rtpStreamTestResult = (RtpStreamTestResult) o;
    return Objects.equals(this.date, rtpStreamTestResult.date) &&
        Objects.equals(this.roundId, rtpStreamTestResult.roundId) &&
        Objects.equals(this.links, rtpStreamTestResult.links) &&
        Objects.equals(this.startTime, rtpStreamTestResult.startTime) &&
        Objects.equals(this.endTime, rtpStreamTestResult.endTime) &&
        Objects.equals(this.agent, rtpStreamTestResult.agent) &&
        Objects.equals(this.serverIp, rtpStreamTestResult.serverIp) &&
        Objects.equals(this.dscp, rtpStreamTestResult.dscp) &&
        Objects.equals(this.dscpName, rtpStreamTestResult.dscpName) &&
        Objects.equals(this.mos, rtpStreamTestResult.mos) &&
        Objects.equals(this.codecName, rtpStreamTestResult.codecName) &&
        Objects.equals(this.codecMaxMos, rtpStreamTestResult.codecMaxMos) &&
        Objects.equals(this.loss, rtpStreamTestResult.loss) &&
        Objects.equals(this.discards, rtpStreamTestResult.discards) &&
        Objects.equals(this.latency, rtpStreamTestResult.latency) &&
        Objects.equals(this.pdv, rtpStreamTestResult.pdv) &&
        Objects.equals(this.errorDetail, rtpStreamTestResult.errorDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, startTime, endTime, agent, serverIp, dscp, dscpName, mos, codecName, codecMaxMos, loss, discards, latency, pdv, errorDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RtpStreamTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    dscp: ").append(toIndentedString(dscp)).append("\n");
    sb.append("    dscpName: ").append(toIndentedString(dscpName)).append("\n");
    sb.append("    mos: ").append(toIndentedString(mos)).append("\n");
    sb.append("    codecName: ").append(toIndentedString(codecName)).append("\n");
    sb.append("    codecMaxMos: ").append(toIndentedString(codecMaxMos)).append("\n");
    sb.append("    loss: ").append(toIndentedString(loss)).append("\n");
    sb.append("    discards: ").append(toIndentedString(discards)).append("\n");
    sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
    sb.append("    pdv: ").append(toIndentedString(pdv)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
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

