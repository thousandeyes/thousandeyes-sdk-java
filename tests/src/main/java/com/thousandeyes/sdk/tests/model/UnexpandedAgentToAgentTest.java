/*
 * Tests API
 * This API allows you to list, create, edit, and delete Network and Application Synthetics tests. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.tests.model.AgentToAgentTestProtocol;
import com.thousandeyes.sdk.tests.model.TestDirection;
import com.thousandeyes.sdk.tests.model.TestDscpId;
import com.thousandeyes.sdk.tests.model.TestInterval;
import com.thousandeyes.sdk.tests.model.TestLinks;
import com.thousandeyes.sdk.tests.model.TestPathTraceMode;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UnexpandedAgentToAgentTest
 */
@JsonPropertyOrder({
  UnexpandedAgentToAgentTest.JSON_PROPERTY_INTERVAL,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_ALERTS_ENABLED,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_ENABLED,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_CREATED_BY,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_CREATED_DATE,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_DESCRIPTION,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_LIVE_SHARE,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_MODIFIED_BY,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_MODIFIED_DATE,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_SAVED_EVENT,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_TEST_ID,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_TEST_NAME,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_TYPE,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_LINKS,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_DIRECTION,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_DSCP,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_DSCP_ID,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_MSS,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_NUM_PATH_TRACES,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_PATH_TRACE_MODE,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_PORT,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_PROTOCOL,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_RANDOMIZED_START_TIME,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_TARGET_AGENT_ID,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_THROUGHPUT_MEASUREMENTS,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_THROUGHPUT_DURATION,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_THROUGHPUT_RATE,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_FIXED_PACKET_RATE,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_BGP_MEASUREMENTS,
  UnexpandedAgentToAgentTest.JSON_PROPERTY_USE_PUBLIC_BGP
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class UnexpandedAgentToAgentTest {
  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private TestInterval interval = TestInterval.NUMBER_60;

  public static final String JSON_PROPERTY_ALERTS_ENABLED = "alertsEnabled";
  private Boolean alertsEnabled;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled = true;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private OffsetDateTime createdDate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LIVE_SHARE = "liveShare";
  private Boolean liveShare;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  private String modifiedBy;

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private OffsetDateTime modifiedDate;

  public static final String JSON_PROPERTY_SAVED_EVENT = "savedEvent";
  private Boolean savedEvent;

  public static final String JSON_PROPERTY_TEST_ID = "testId";
  private String testId;

  public static final String JSON_PROPERTY_TEST_NAME = "testName";
  private String testName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private TestLinks links;

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

  public static final String JSON_PROPERTY_RANDOMIZED_START_TIME = "randomizedStartTime";
  private Boolean randomizedStartTime = false;

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

  public static final String JSON_PROPERTY_BGP_MEASUREMENTS = "bgpMeasurements";
  private Boolean bgpMeasurements = true;

  public static final String JSON_PROPERTY_USE_PUBLIC_BGP = "usePublicBgp";
  private Boolean usePublicBgp = true;

  public UnexpandedAgentToAgentTest() { 
  }

  @JsonCreator
  public UnexpandedAgentToAgentTest(
    @JsonProperty(JSON_PROPERTY_CREATED_BY) String createdBy, 
    @JsonProperty(JSON_PROPERTY_CREATED_DATE) OffsetDateTime createdDate, 
    @JsonProperty(JSON_PROPERTY_LIVE_SHARE) Boolean liveShare, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_BY) String modifiedBy, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_DATE) OffsetDateTime modifiedDate, 
    @JsonProperty(JSON_PROPERTY_SAVED_EVENT) Boolean savedEvent, 
    @JsonProperty(JSON_PROPERTY_TEST_ID) String testId, 
    @JsonProperty(JSON_PROPERTY_TYPE) String type, 
    @JsonProperty(JSON_PROPERTY_DSCP) String dscp
  ) {
  this();
    this.createdBy = createdBy;
    this.createdDate = createdDate;
    this.liveShare = liveShare;
    this.modifiedBy = modifiedBy;
    this.modifiedDate = modifiedDate;
    this.savedEvent = savedEvent;
    this.testId = testId;
    this.type = type;
    this.dscp = dscp;
  }

  public UnexpandedAgentToAgentTest interval(TestInterval interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TestInterval getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInterval(TestInterval interval) {
    this.interval = interval;
  }


  public UnexpandedAgentToAgentTest alertsEnabled(Boolean alertsEnabled) {
    this.alertsEnabled = alertsEnabled;
    return this;
  }

   /**
   * Indicates if alerts are enabled.
   * @return alertsEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAlertsEnabled() {
    return alertsEnabled;
  }


  @JsonProperty(JSON_PROPERTY_ALERTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertsEnabled(Boolean alertsEnabled) {
    this.alertsEnabled = alertsEnabled;
  }


  public UnexpandedAgentToAgentTest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Test is enabled.
   * @return enabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


   /**
   * User that created the test.
   * @return createdBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedBy() {
    return createdBy;
  }




   /**
   * UTC created date (ISO date-time format).
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




  public UnexpandedAgentToAgentTest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the test.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Indicates if the test is shared with the account group.
   * @return liveShare
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVE_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLiveShare() {
    return liveShare;
  }




   /**
   * User that modified the test.
   * @return modifiedBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModifiedBy() {
    return modifiedBy;
  }




   /**
   * UTC last modification date (ISO date-time format).
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }




   /**
   * Indicates if the test is a saved event.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 
   * @return savedEvent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAVED_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSavedEvent() {
    return savedEvent;
  }




   /**
   * Each test is assigned an unique ID; this is used to access test information and results from other endpoints.
   * @return testId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestId() {
    return testId;
  }




  public UnexpandedAgentToAgentTest testName(String testName) {
    this.testName = testName;
    return this;
  }

   /**
   * The name of the test. Test name must be unique.
   * @return testName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestName() {
    return testName;
  }


  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestName(String testName) {
    this.testName = testName;
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




  public UnexpandedAgentToAgentTest links(TestLinks links) {
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

  public TestLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(TestLinks links) {
    this.links = links;
  }


  public UnexpandedAgentToAgentTest direction(TestDirection direction) {
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




  public UnexpandedAgentToAgentTest dscpId(TestDscpId dscpId) {
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


  public UnexpandedAgentToAgentTest mss(Integer mss) {
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


  public UnexpandedAgentToAgentTest numPathTraces(Integer numPathTraces) {
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


  public UnexpandedAgentToAgentTest pathTraceMode(TestPathTraceMode pathTraceMode) {
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


  public UnexpandedAgentToAgentTest port(Integer port) {
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


  public UnexpandedAgentToAgentTest protocol(AgentToAgentTestProtocol protocol) {
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


  public UnexpandedAgentToAgentTest randomizedStartTime(Boolean randomizedStartTime) {
    this.randomizedStartTime = randomizedStartTime;
    return this;
  }

   /**
   * Indicates whether agents should randomize the start time in each test round.
   * @return randomizedStartTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RANDOMIZED_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRandomizedStartTime() {
    return randomizedStartTime;
  }


  @JsonProperty(JSON_PROPERTY_RANDOMIZED_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRandomizedStartTime(Boolean randomizedStartTime) {
    this.randomizedStartTime = randomizedStartTime;
  }


  public UnexpandedAgentToAgentTest targetAgentId(String targetAgentId) {
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


  public UnexpandedAgentToAgentTest throughputMeasurements(Boolean throughputMeasurements) {
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


  public UnexpandedAgentToAgentTest throughputDuration(Integer throughputDuration) {
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


  public UnexpandedAgentToAgentTest throughputRate(Integer throughputRate) {
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


  public UnexpandedAgentToAgentTest fixedPacketRate(Integer fixedPacketRate) {
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


  public UnexpandedAgentToAgentTest bgpMeasurements(Boolean bgpMeasurements) {
    this.bgpMeasurements = bgpMeasurements;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to enable bgp measurements.
   * @return bgpMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BGP_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBgpMeasurements() {
    return bgpMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_BGP_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBgpMeasurements(Boolean bgpMeasurements) {
    this.bgpMeasurements = bgpMeasurements;
  }


  public UnexpandedAgentToAgentTest usePublicBgp(Boolean usePublicBgp) {
    this.usePublicBgp = usePublicBgp;
    return this;
  }

   /**
   * Indicate if all available public BGP monitors should be used, when ommited defaults to &#x60;bgpMeasurements&#x60; value.
   * @return usePublicBgp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_PUBLIC_BGP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUsePublicBgp() {
    return usePublicBgp;
  }


  @JsonProperty(JSON_PROPERTY_USE_PUBLIC_BGP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsePublicBgp(Boolean usePublicBgp) {
    this.usePublicBgp = usePublicBgp;
  }


  /**
   * Return true if this UnexpandedAgentToAgentTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnexpandedAgentToAgentTest unexpandedAgentToAgentTest = (UnexpandedAgentToAgentTest) o;
    return Objects.equals(this.interval, unexpandedAgentToAgentTest.interval) &&
        Objects.equals(this.alertsEnabled, unexpandedAgentToAgentTest.alertsEnabled) &&
        Objects.equals(this.enabled, unexpandedAgentToAgentTest.enabled) &&
        Objects.equals(this.createdBy, unexpandedAgentToAgentTest.createdBy) &&
        Objects.equals(this.createdDate, unexpandedAgentToAgentTest.createdDate) &&
        Objects.equals(this.description, unexpandedAgentToAgentTest.description) &&
        Objects.equals(this.liveShare, unexpandedAgentToAgentTest.liveShare) &&
        Objects.equals(this.modifiedBy, unexpandedAgentToAgentTest.modifiedBy) &&
        Objects.equals(this.modifiedDate, unexpandedAgentToAgentTest.modifiedDate) &&
        Objects.equals(this.savedEvent, unexpandedAgentToAgentTest.savedEvent) &&
        Objects.equals(this.testId, unexpandedAgentToAgentTest.testId) &&
        Objects.equals(this.testName, unexpandedAgentToAgentTest.testName) &&
        Objects.equals(this.type, unexpandedAgentToAgentTest.type) &&
        Objects.equals(this.links, unexpandedAgentToAgentTest.links) &&
        Objects.equals(this.direction, unexpandedAgentToAgentTest.direction) &&
        Objects.equals(this.dscp, unexpandedAgentToAgentTest.dscp) &&
        Objects.equals(this.dscpId, unexpandedAgentToAgentTest.dscpId) &&
        Objects.equals(this.mss, unexpandedAgentToAgentTest.mss) &&
        Objects.equals(this.numPathTraces, unexpandedAgentToAgentTest.numPathTraces) &&
        Objects.equals(this.pathTraceMode, unexpandedAgentToAgentTest.pathTraceMode) &&
        Objects.equals(this.port, unexpandedAgentToAgentTest.port) &&
        Objects.equals(this.protocol, unexpandedAgentToAgentTest.protocol) &&
        Objects.equals(this.randomizedStartTime, unexpandedAgentToAgentTest.randomizedStartTime) &&
        Objects.equals(this.targetAgentId, unexpandedAgentToAgentTest.targetAgentId) &&
        Objects.equals(this.throughputMeasurements, unexpandedAgentToAgentTest.throughputMeasurements) &&
        Objects.equals(this.throughputDuration, unexpandedAgentToAgentTest.throughputDuration) &&
        Objects.equals(this.throughputRate, unexpandedAgentToAgentTest.throughputRate) &&
        Objects.equals(this.fixedPacketRate, unexpandedAgentToAgentTest.fixedPacketRate) &&
        Objects.equals(this.bgpMeasurements, unexpandedAgentToAgentTest.bgpMeasurements) &&
        Objects.equals(this.usePublicBgp, unexpandedAgentToAgentTest.usePublicBgp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, alertsEnabled, enabled, createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, direction, dscp, dscpId, mss, numPathTraces, pathTraceMode, port, protocol, randomizedStartTime, targetAgentId, throughputMeasurements, throughputDuration, throughputRate, fixedPacketRate, bgpMeasurements, usePublicBgp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnexpandedAgentToAgentTest {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    alertsEnabled: ").append(toIndentedString(alertsEnabled)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    liveShare: ").append(toIndentedString(liveShare)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    savedEvent: ").append(toIndentedString(savedEvent)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    dscp: ").append(toIndentedString(dscp)).append("\n");
    sb.append("    dscpId: ").append(toIndentedString(dscpId)).append("\n");
    sb.append("    mss: ").append(toIndentedString(mss)).append("\n");
    sb.append("    numPathTraces: ").append(toIndentedString(numPathTraces)).append("\n");
    sb.append("    pathTraceMode: ").append(toIndentedString(pathTraceMode)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    randomizedStartTime: ").append(toIndentedString(randomizedStartTime)).append("\n");
    sb.append("    targetAgentId: ").append(toIndentedString(targetAgentId)).append("\n");
    sb.append("    throughputMeasurements: ").append(toIndentedString(throughputMeasurements)).append("\n");
    sb.append("    throughputDuration: ").append(toIndentedString(throughputDuration)).append("\n");
    sb.append("    throughputRate: ").append(toIndentedString(throughputRate)).append("\n");
    sb.append("    fixedPacketRate: ").append(toIndentedString(fixedPacketRate)).append("\n");
    sb.append("    bgpMeasurements: ").append(toIndentedString(bgpMeasurements)).append("\n");
    sb.append("    usePublicBgp: ").append(toIndentedString(usePublicBgp)).append("\n");
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

