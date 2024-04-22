/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.tests.results.model.Agent;
import com.thousandeyes.api.tests.results.model.PathVisDirection;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PathVisBaseTestResult
 */
@JsonPropertyOrder({
  PathVisBaseTestResult.JSON_PROPERTY_DATE,
  PathVisBaseTestResult.JSON_PROPERTY_ROUND_ID,
  PathVisBaseTestResult.JSON_PROPERTY_LINKS,
  PathVisBaseTestResult.JSON_PROPERTY_START_TIME,
  PathVisBaseTestResult.JSON_PROPERTY_END_TIME,
  PathVisBaseTestResult.JSON_PROPERTY_AGENT,
  PathVisBaseTestResult.JSON_PROPERTY_SERVER,
  PathVisBaseTestResult.JSON_PROPERTY_SERVER_IP,
  PathVisBaseTestResult.JSON_PROPERTY_SOURCE_IP,
  PathVisBaseTestResult.JSON_PROPERTY_SOURCE_PREFIX,
  PathVisBaseTestResult.JSON_PROPERTY_TARGET_IS_PROXY,
  PathVisBaseTestResult.JSON_PROPERTY_DIRECTION
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-22T10:43:50.800492+01:00[Europe/London]")
public class PathVisBaseTestResult {
  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private Object links;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private Integer startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private Integer endTime;

  public static final String JSON_PROPERTY_AGENT = "agent";
  private Agent agent;

  public static final String JSON_PROPERTY_SERVER = "server";
  private String server;

  public static final String JSON_PROPERTY_SERVER_IP = "serverIp";
  private String serverIp;

  public static final String JSON_PROPERTY_SOURCE_IP = "sourceIp";
  private String sourceIp;

  public static final String JSON_PROPERTY_SOURCE_PREFIX = "sourcePrefix";
  private String sourcePrefix;

  public static final String JSON_PROPERTY_TARGET_IS_PROXY = "targetIsProxy";
  private Boolean targetIsProxy;

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private PathVisDirection direction;

  public PathVisBaseTestResult() { 
  }

  @JsonCreator
  public PathVisBaseTestResult(
    @JsonProperty(JSON_PROPERTY_DATE) OffsetDateTime date, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId, 
    @JsonProperty(JSON_PROPERTY_START_TIME) Integer startTime, 
    @JsonProperty(JSON_PROPERTY_END_TIME) Integer endTime, 
    @JsonProperty(JSON_PROPERTY_SERVER) String server, 
    @JsonProperty(JSON_PROPERTY_SERVER_IP) String serverIp, 
    @JsonProperty(JSON_PROPERTY_SOURCE_IP) String sourceIp, 
    @JsonProperty(JSON_PROPERTY_SOURCE_PREFIX) String sourcePrefix, 
    @JsonProperty(JSON_PROPERTY_TARGET_IS_PROXY) Boolean targetIsProxy
  ) {
  this();
    this.date = date;
    this.roundId = roundId;
    this.startTime = startTime;
    this.endTime = endTime;
    this.server = server;
    this.serverIp = serverIp;
    this.sourceIp = sourceIp;
    this.sourcePrefix = sourcePrefix;
    this.targetIsProxy = targetIsProxy;
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




  public PathVisBaseTestResult links(Object links) {
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

  public Object getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(Object links) {
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




  public PathVisBaseTestResult agent(Agent agent) {
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
   * Target server, including port (if method used is TCP)
   * @return server
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServer() {
    return server;
  }




   /**
   * IP of target server
   * @return serverIp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServerIp() {
    return serverIp;
  }




   /**
   * IP address of source agent
   * @return sourceIp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceIp() {
    return sourceIp;
  }




   /**
   * IP prefix of source agent
   * @return sourcePrefix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourcePrefix() {
    return sourcePrefix;
  }




   /**
   * Specifies whether the traces are targeting a proxy. If not set, it is considered as false.
   * @return targetIsProxy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_IS_PROXY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTargetIsProxy() {
    return targetIsProxy;
  }




  public PathVisBaseTestResult direction(PathVisDirection direction) {
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

  public PathVisDirection getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(PathVisDirection direction) {
    this.direction = direction;
  }


  /**
   * Return true if this PathVisBaseTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathVisBaseTestResult pathVisBaseTestResult = (PathVisBaseTestResult) o;
    return Objects.equals(this.date, pathVisBaseTestResult.date) &&
        Objects.equals(this.roundId, pathVisBaseTestResult.roundId) &&
        Objects.equals(this.links, pathVisBaseTestResult.links) &&
        Objects.equals(this.startTime, pathVisBaseTestResult.startTime) &&
        Objects.equals(this.endTime, pathVisBaseTestResult.endTime) &&
        Objects.equals(this.agent, pathVisBaseTestResult.agent) &&
        Objects.equals(this.server, pathVisBaseTestResult.server) &&
        Objects.equals(this.serverIp, pathVisBaseTestResult.serverIp) &&
        Objects.equals(this.sourceIp, pathVisBaseTestResult.sourceIp) &&
        Objects.equals(this.sourcePrefix, pathVisBaseTestResult.sourcePrefix) &&
        Objects.equals(this.targetIsProxy, pathVisBaseTestResult.targetIsProxy) &&
        Objects.equals(this.direction, pathVisBaseTestResult.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, startTime, endTime, agent, server, serverIp, sourceIp, sourcePrefix, targetIsProxy, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathVisBaseTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
    sb.append("    sourcePrefix: ").append(toIndentedString(sourcePrefix)).append("\n");
    sb.append("    targetIsProxy: ").append(toIndentedString(targetIsProxy)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

