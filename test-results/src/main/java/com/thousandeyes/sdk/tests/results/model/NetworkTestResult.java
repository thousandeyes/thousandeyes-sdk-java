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
import com.thousandeyes.sdk.tests.results.model.TestDirection;
import com.thousandeyes.sdk.tests.results.model.TestResultAgent;
import com.thousandeyes.sdk.tests.results.model.TestResultAppLinks;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NetworkTestResult
 */
@JsonPropertyOrder({
  NetworkTestResult.JSON_PROPERTY_DATE,
  NetworkTestResult.JSON_PROPERTY_ROUND_ID,
  NetworkTestResult.JSON_PROPERTY_LINKS,
  NetworkTestResult.JSON_PROPERTY_START_TIME,
  NetworkTestResult.JSON_PROPERTY_END_TIME,
  NetworkTestResult.JSON_PROPERTY_AVAILABLE_BANDWIDTH,
  NetworkTestResult.JSON_PROPERTY_AVG_LATENCY,
  NetworkTestResult.JSON_PROPERTY_BANDWIDTH,
  NetworkTestResult.JSON_PROPERTY_CAPACITY,
  NetworkTestResult.JSON_PROPERTY_JITTER,
  NetworkTestResult.JSON_PROPERTY_LOSS,
  NetworkTestResult.JSON_PROPERTY_MAX_LATENCY,
  NetworkTestResult.JSON_PROPERTY_MIN_LATENCY,
  NetworkTestResult.JSON_PROPERTY_PACKETS_BY_SECOND,
  NetworkTestResult.JSON_PROPERTY_AGENT,
  NetworkTestResult.JSON_PROPERTY_SERVER_IP,
  NetworkTestResult.JSON_PROPERTY_SERVER,
  NetworkTestResult.JSON_PROPERTY_HEALTH_SCORE,
  NetworkTestResult.JSON_PROPERTY_DIRECTION
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class NetworkTestResult {
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

  public static final String JSON_PROPERTY_AVAILABLE_BANDWIDTH = "availableBandwidth";
  private Double availableBandwidth;

  public static final String JSON_PROPERTY_AVG_LATENCY = "avgLatency";
  private Double avgLatency;

  public static final String JSON_PROPERTY_BANDWIDTH = "bandwidth";
  private Double bandwidth;

  public static final String JSON_PROPERTY_CAPACITY = "capacity";
  private Double capacity;

  public static final String JSON_PROPERTY_JITTER = "jitter";
  private Double jitter;

  public static final String JSON_PROPERTY_LOSS = "loss";
  private Double loss;

  public static final String JSON_PROPERTY_MAX_LATENCY = "maxLatency";
  private Double maxLatency;

  public static final String JSON_PROPERTY_MIN_LATENCY = "minLatency";
  private Double minLatency;

  public static final String JSON_PROPERTY_PACKETS_BY_SECOND = "packetsBySecond";
  private List<List<Integer>> packetsBySecond = new ArrayList<>();

  public static final String JSON_PROPERTY_AGENT = "agent";
  private TestResultAgent agent;

  public static final String JSON_PROPERTY_SERVER_IP = "serverIp";
  private String serverIp;

  public static final String JSON_PROPERTY_SERVER = "server";
  private String server;

  public static final String JSON_PROPERTY_HEALTH_SCORE = "healthScore";
  private BigDecimal healthScore;

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private TestDirection direction = TestDirection.TO_TARGET;

  public NetworkTestResult() { 
  }

  @JsonCreator
  public NetworkTestResult(
    @JsonProperty(JSON_PROPERTY_DATE) OffsetDateTime date, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId, 
    @JsonProperty(JSON_PROPERTY_START_TIME) Integer startTime, 
    @JsonProperty(JSON_PROPERTY_END_TIME) Integer endTime, 
    @JsonProperty(JSON_PROPERTY_AVAILABLE_BANDWIDTH) Double availableBandwidth, 
    @JsonProperty(JSON_PROPERTY_AVG_LATENCY) Double avgLatency, 
    @JsonProperty(JSON_PROPERTY_BANDWIDTH) Double bandwidth, 
    @JsonProperty(JSON_PROPERTY_CAPACITY) Double capacity, 
    @JsonProperty(JSON_PROPERTY_JITTER) Double jitter, 
    @JsonProperty(JSON_PROPERTY_LOSS) Double loss, 
    @JsonProperty(JSON_PROPERTY_MAX_LATENCY) Double maxLatency, 
    @JsonProperty(JSON_PROPERTY_MIN_LATENCY) Double minLatency, 
    @JsonProperty(JSON_PROPERTY_PACKETS_BY_SECOND) List<List<Integer>> packetsBySecond, 
    @JsonProperty(JSON_PROPERTY_SERVER_IP) String serverIp, 
    @JsonProperty(JSON_PROPERTY_SERVER) String server
  ) {
  this();
    this.date = date;
    this.roundId = roundId;
    this.startTime = startTime;
    this.endTime = endTime;
    this.availableBandwidth = availableBandwidth;
    this.avgLatency = avgLatency;
    this.bandwidth = bandwidth;
    this.capacity = capacity;
    this.jitter = jitter;
    this.loss = loss;
    this.maxLatency = maxLatency;
    this.minLatency = minLatency;
    this.packetsBySecond = packetsBySecond;
    this.serverIp = serverIp;
    this.server = server;
  }

   /**
   * Data point date in UTC (ISO date-time format).
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




  public NetworkTestResult links(TestResultAppLinks links) {
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




   /**
   * The bandwidth from the client to the server measured in Mbps. This value is not available if bandwidth testing is disabled, if no value could be calculated, or if the target is a proxy.
   * @return availableBandwidth
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABLE_BANDWIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAvailableBandwidth() {
    return availableBandwidth;
  }




   /**
   * Average RTT for packets sent to destination
   * @return avgLatency
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVG_LATENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAvgLatency() {
    return avgLatency;
  }




   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANDWIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getBandwidth() {
    return bandwidth;
  }




   /**
   * The capacity from the client to the server measured in Mbps. This value is not available if bandwidth testing is disabled, if no value could be calculated, or if the target is a proxy.
   * @return capacity
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCapacity() {
    return capacity;
  }




   /**
   * Standard deviation of latency
   * @return jitter
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JITTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getJitter() {
    return jitter;
  }




   /**
   * Percentage of packets not reaching destination
   * @return loss
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLoss() {
    return loss;
  }




   /**
   * Maximum RTT for packets sent to destination
   * @return maxLatency
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_LATENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMaxLatency() {
    return maxLatency;
  }




   /**
   * Minimum RTT for packets sent to destination
   * @return minLatency
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_LATENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMinLatency() {
    return minLatency;
  }




   /**
   * Number of packets sent and received in a second.
   * @return packetsBySecond
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PACKETS_BY_SECOND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<List<Integer>> getPacketsBySecond() {
    return packetsBySecond;
  }




  public NetworkTestResult agent(TestResultAgent agent) {
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
   * Target server, including port (if method used is TCP)
   * @return server
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServer() {
    return server;
  }




  public NetworkTestResult healthScore(BigDecimal healthScore) {
    this.healthScore = healthScore;
    return this;
  }

   /**
   * A normalized value (0.0-1.0) representing the network connection health of the test target. Returns negative values as error codes. -1.0 indicates there was insufficient data to calculate the health score.
   * @return healthScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEALTH_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getHealthScore() {
    return healthScore;
  }


  @JsonProperty(JSON_PROPERTY_HEALTH_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHealthScore(BigDecimal healthScore) {
    this.healthScore = healthScore;
  }


  public NetworkTestResult direction(TestDirection direction) {
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
   * Return true if this NetworkTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkTestResult networkTestResult = (NetworkTestResult) o;
    return Objects.equals(this.date, networkTestResult.date) &&
        Objects.equals(this.roundId, networkTestResult.roundId) &&
        Objects.equals(this.links, networkTestResult.links) &&
        Objects.equals(this.startTime, networkTestResult.startTime) &&
        Objects.equals(this.endTime, networkTestResult.endTime) &&
        Objects.equals(this.availableBandwidth, networkTestResult.availableBandwidth) &&
        Objects.equals(this.avgLatency, networkTestResult.avgLatency) &&
        Objects.equals(this.bandwidth, networkTestResult.bandwidth) &&
        Objects.equals(this.capacity, networkTestResult.capacity) &&
        Objects.equals(this.jitter, networkTestResult.jitter) &&
        Objects.equals(this.loss, networkTestResult.loss) &&
        Objects.equals(this.maxLatency, networkTestResult.maxLatency) &&
        Objects.equals(this.minLatency, networkTestResult.minLatency) &&
        Objects.equals(this.packetsBySecond, networkTestResult.packetsBySecond) &&
        Objects.equals(this.agent, networkTestResult.agent) &&
        Objects.equals(this.serverIp, networkTestResult.serverIp) &&
        Objects.equals(this.server, networkTestResult.server) &&
        Objects.equals(this.healthScore, networkTestResult.healthScore) &&
        Objects.equals(this.direction, networkTestResult.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, startTime, endTime, availableBandwidth, avgLatency, bandwidth, capacity, jitter, loss, maxLatency, minLatency, packetsBySecond, agent, serverIp, server, healthScore, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    availableBandwidth: ").append(toIndentedString(availableBandwidth)).append("\n");
    sb.append("    avgLatency: ").append(toIndentedString(avgLatency)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    jitter: ").append(toIndentedString(jitter)).append("\n");
    sb.append("    loss: ").append(toIndentedString(loss)).append("\n");
    sb.append("    maxLatency: ").append(toIndentedString(maxLatency)).append("\n");
    sb.append("    minLatency: ").append(toIndentedString(minLatency)).append("\n");
    sb.append("    packetsBySecond: ").append(toIndentedString(packetsBySecond)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    healthScore: ").append(toIndentedString(healthScore)).append("\n");
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

