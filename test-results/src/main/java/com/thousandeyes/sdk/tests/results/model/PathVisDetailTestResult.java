/*
 * Test Results API
 * Get test result metrics for Network and Application Synthetics tests.
 *
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
import com.thousandeyes.sdk.tests.results.model.PathVisDirection;
import com.thousandeyes.sdk.tests.results.model.PathVisRoute;
import com.thousandeyes.sdk.tests.results.model.TestResultAgent;
import com.thousandeyes.sdk.tests.results.model.TestResultAppLinks;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PathVisDetailTestResult
 */
@JsonPropertyOrder({
  PathVisDetailTestResult.JSON_PROPERTY_DATE,
  PathVisDetailTestResult.JSON_PROPERTY_ROUND_ID,
  PathVisDetailTestResult.JSON_PROPERTY_LINKS,
  PathVisDetailTestResult.JSON_PROPERTY_START_TIME,
  PathVisDetailTestResult.JSON_PROPERTY_END_TIME,
  PathVisDetailTestResult.JSON_PROPERTY_AGENT,
  PathVisDetailTestResult.JSON_PROPERTY_SERVER,
  PathVisDetailTestResult.JSON_PROPERTY_SERVER_IP,
  PathVisDetailTestResult.JSON_PROPERTY_SOURCE_IP,
  PathVisDetailTestResult.JSON_PROPERTY_SOURCE_PREFIX,
  PathVisDetailTestResult.JSON_PROPERTY_TARGET_IS_PROXY,
  PathVisDetailTestResult.JSON_PROPERTY_DIRECTION,
  PathVisDetailTestResult.JSON_PROPERTY_PATH_TRACES
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class PathVisDetailTestResult {
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
  private TestResultAgent agent;

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

  public static final String JSON_PROPERTY_PATH_TRACES = "pathTraces";
  private List<PathVisRoute> pathTraces = new ArrayList<>();

  public PathVisDetailTestResult() { 
  }

  @JsonCreator
  public PathVisDetailTestResult(
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




  public PathVisDetailTestResult links(TestResultAppLinks links) {
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




  public PathVisDetailTestResult agent(TestResultAgent agent) {
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

  public TestResultAgent getAgent() {
    return agent;
  }


  @JsonProperty(JSON_PROPERTY_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgent(TestResultAgent agent) {
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




  public PathVisDetailTestResult direction(PathVisDirection direction) {
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


  public PathVisDetailTestResult pathTraces(List<PathVisRoute> pathTraces) {
    this.pathTraces = pathTraces;
    return this;
  }

  public PathVisDetailTestResult addPathTracesItem(PathVisRoute pathTracesItem) {
    if (this.pathTraces == null) {
      this.pathTraces = new ArrayList<>();
    }
    this.pathTraces.add(pathTracesItem);
    return this;
  }

   /**
   * Shows 3 iterations of path trace, with each iteration specified by a pathId
   * @return pathTraces
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PathVisRoute> getPathTraces() {
    return pathTraces;
  }


  @JsonProperty(JSON_PROPERTY_PATH_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPathTraces(List<PathVisRoute> pathTraces) {
    this.pathTraces = pathTraces;
  }


  /**
   * Return true if this PathVisDetailTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathVisDetailTestResult pathVisDetailTestResult = (PathVisDetailTestResult) o;
    return Objects.equals(this.date, pathVisDetailTestResult.date) &&
        Objects.equals(this.roundId, pathVisDetailTestResult.roundId) &&
        Objects.equals(this.links, pathVisDetailTestResult.links) &&
        Objects.equals(this.startTime, pathVisDetailTestResult.startTime) &&
        Objects.equals(this.endTime, pathVisDetailTestResult.endTime) &&
        Objects.equals(this.agent, pathVisDetailTestResult.agent) &&
        Objects.equals(this.server, pathVisDetailTestResult.server) &&
        Objects.equals(this.serverIp, pathVisDetailTestResult.serverIp) &&
        Objects.equals(this.sourceIp, pathVisDetailTestResult.sourceIp) &&
        Objects.equals(this.sourcePrefix, pathVisDetailTestResult.sourcePrefix) &&
        Objects.equals(this.targetIsProxy, pathVisDetailTestResult.targetIsProxy) &&
        Objects.equals(this.direction, pathVisDetailTestResult.direction) &&
        Objects.equals(this.pathTraces, pathVisDetailTestResult.pathTraces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, startTime, endTime, agent, server, serverIp, sourceIp, sourcePrefix, targetIsProxy, direction, pathTraces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathVisDetailTestResult {\n");
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
    sb.append("    pathTraces: ").append(toIndentedString(pathTraces)).append("\n");
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

