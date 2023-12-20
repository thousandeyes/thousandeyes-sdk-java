/*
 * Tests API
 *  ### Overview This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests.
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.tests.model.Agent;
import com.thousandeyes.api.tests.model.AgentToAgentTestProtocol;
import com.thousandeyes.api.tests.model.AlertRule;
import com.thousandeyes.api.tests.model.Monitor;
import com.thousandeyes.api.tests.model.TestDirection;
import com.thousandeyes.api.tests.model.TestDscpId;
import com.thousandeyes.api.tests.model.TestInterval;
import com.thousandeyes.api.tests.model.TestLabelsInner;
import com.thousandeyes.api.tests.model.TestPathTraceMode;
import com.thousandeyes.api.tests.model.TestSharedAccountsInner;
import com.thousandeyes.api.tests.model.UnexpandedInstantTestLinks;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thousandeyes.api.JSON;

/**
 * AgentToAgentTest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:06.198107Z[Europe/Lisbon]")
public class AgentToAgentTest {
  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private TestInterval interval;

  public static final String SERIALIZED_NAME_ALERTS_ENABLED = "alertsEnabled";
  @SerializedName(SERIALIZED_NAME_ALERTS_ENABLED)
  private Boolean alertsEnabled;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled = true;

  public static final String SERIALIZED_NAME_ALERT_RULES = "alertRules";
  @SerializedName(SERIALIZED_NAME_ALERT_RULES)
  private List<AlertRule> alertRules;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LIVE_SHARE = "liveShare";
  @SerializedName(SERIALIZED_NAME_LIVE_SHARE)
  private Boolean liveShare;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private String modifiedBy;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_SAVED_EVENT = "savedEvent";
  @SerializedName(SERIALIZED_NAME_SAVED_EVENT)
  private Boolean savedEvent;

  public static final String SERIALIZED_NAME_TEST_ID = "testId";
  @SerializedName(SERIALIZED_NAME_TEST_ID)
  private String testId;

  public static final String SERIALIZED_NAME_TEST_NAME = "testName";
  @SerializedName(SERIALIZED_NAME_TEST_NAME)
  private String testName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private UnexpandedInstantTestLinks links;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<TestLabelsInner> labels;

  public static final String SERIALIZED_NAME_SHARED_WITH_ACCOUNTS = "sharedWithAccounts";
  @SerializedName(SERIALIZED_NAME_SHARED_WITH_ACCOUNTS)
  private List<TestSharedAccountsInner> sharedWithAccounts;

  public static final String SERIALIZED_NAME_AGENTS = "agents";
  @SerializedName(SERIALIZED_NAME_AGENTS)
  private List<Agent> agents = new ArrayList<>();

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private TestDirection direction = TestDirection.TO_TARGET;

  public static final String SERIALIZED_NAME_DSCP = "dscp";
  @SerializedName(SERIALIZED_NAME_DSCP)
  private String dscp;

  public static final String SERIALIZED_NAME_DSCP_ID = "dscpId";
  @SerializedName(SERIALIZED_NAME_DSCP_ID)
  private TestDscpId dscpId = TestDscpId._0;

  public static final String SERIALIZED_NAME_MSS = "mss";
  @SerializedName(SERIALIZED_NAME_MSS)
  private Integer mss;

  public static final String SERIALIZED_NAME_NUM_PATH_TRACES = "numPathTraces";
  @SerializedName(SERIALIZED_NAME_NUM_PATH_TRACES)
  private Integer numPathTraces = 3;

  public static final String SERIALIZED_NAME_PATH_TRACE_MODE = "pathTraceMode";
  @SerializedName(SERIALIZED_NAME_PATH_TRACE_MODE)
  private TestPathTraceMode pathTraceMode = TestPathTraceMode.CLASSIC;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port = 49153;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private AgentToAgentTestProtocol protocol = AgentToAgentTestProtocol.TCP;

  public static final String SERIALIZED_NAME_TARGET_AGENT_ID = "targetAgentId";
  @SerializedName(SERIALIZED_NAME_TARGET_AGENT_ID)
  private String targetAgentId;

  public static final String SERIALIZED_NAME_THROUGHPUT_MEASUREMENTS = "throughputMeasurements";
  @SerializedName(SERIALIZED_NAME_THROUGHPUT_MEASUREMENTS)
  private Boolean throughputMeasurements = false;

  public static final String SERIALIZED_NAME_THROUGHPUT_DURATION = "throughputDuration";
  @SerializedName(SERIALIZED_NAME_THROUGHPUT_DURATION)
  private Integer throughputDuration = 10000;

  public static final String SERIALIZED_NAME_THROUGHPUT_RATE = "throughputRate";
  @SerializedName(SERIALIZED_NAME_THROUGHPUT_RATE)
  private Integer throughputRate;

  public static final String SERIALIZED_NAME_FIXED_PACKET_RATE = "fixedPacketRate";
  @SerializedName(SERIALIZED_NAME_FIXED_PACKET_RATE)
  private Integer fixedPacketRate;

  public static final String SERIALIZED_NAME_BGP_MEASUREMENTS = "bgpMeasurements";
  @SerializedName(SERIALIZED_NAME_BGP_MEASUREMENTS)
  private Boolean bgpMeasurements = true;

  public static final String SERIALIZED_NAME_MONITORS = "monitors";
  @SerializedName(SERIALIZED_NAME_MONITORS)
  private List<Monitor> monitors;

  public AgentToAgentTest() {
  }

  
  public AgentToAgentTest(
     String createdBy, 
     OffsetDateTime createdDate, 
     Boolean liveShare, 
     String modifiedBy, 
     OffsetDateTime modifiedDate, 
     Boolean savedEvent, 
     String testId, 
     String type, 
     List<TestLabelsInner> labels, 
     List<TestSharedAccountsInner> sharedWithAccounts, 
     List<Agent> agents, 
     String dscp, 
     List<Monitor> monitors
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
    this.labels = labels;
    this.sharedWithAccounts = sharedWithAccounts;
    this.agents = agents;
    this.dscp = dscp;
    this.monitors = monitors;
  }

  public AgentToAgentTest interval(TestInterval interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @javax.annotation.Nonnull
  public TestInterval getInterval() {
    return interval;
  }


  public void setInterval(TestInterval interval) {
    this.interval = interval;
  }


  public AgentToAgentTest alertsEnabled(Boolean alertsEnabled) {
    
    this.alertsEnabled = alertsEnabled;
    return this;
  }

   /**
   * Indicates if alerts are enabled.
   * @return alertsEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getAlertsEnabled() {
    return alertsEnabled;
  }


  public void setAlertsEnabled(Boolean alertsEnabled) {
    this.alertsEnabled = alertsEnabled;
  }


  public AgentToAgentTest enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Test is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public AgentToAgentTest alertRules(List<AlertRule> alertRules) {
    
    this.alertRules = alertRules;
    return this;
  }

  public AgentToAgentTest addAlertRulesItem(AlertRule alertRulesItem) {
    if (this.alertRules == null) {
      this.alertRules = new ArrayList<>();
    }
    this.alertRules.add(alertRulesItem);
    return this;
  }

   /**
   * Contains list of enabled alert rule objects.
   * @return alertRules
  **/
  @javax.annotation.Nullable
  public List<AlertRule> getAlertRules() {
    return alertRules;
  }


  public void setAlertRules(List<AlertRule> alertRules) {
    this.alertRules = alertRules;
  }


   /**
   * User that created the test.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  public String getCreatedBy() {
    return createdBy;
  }




   /**
   * UTC created date (ISO date-time format).
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




  public AgentToAgentTest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the test.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Indicates if the test is shared with the account group.
   * @return liveShare
  **/
  @javax.annotation.Nullable
  public Boolean getLiveShare() {
    return liveShare;
  }




   /**
   * User that modified the test.
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  public String getModifiedBy() {
    return modifiedBy;
  }




   /**
   * UTC last modification date (ISO date-time format).
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }




   /**
   * Indicates if the test is a saved event.
   * @return savedEvent
  **/
  @javax.annotation.Nullable
  public Boolean getSavedEvent() {
    return savedEvent;
  }




   /**
   * Each test is assigned an unique ID; this is used to access test information and results from other endpoints.
   * @return testId
  **/
  @javax.annotation.Nullable
  public String getTestId() {
    return testId;
  }




  public AgentToAgentTest testName(String testName) {
    
    this.testName = testName;
    return this;
  }

   /**
   * The name of the test. Test name must be unique.
   * @return testName
  **/
  @javax.annotation.Nullable
  public String getTestName() {
    return testName;
  }


  public void setTestName(String testName) {
    this.testName = testName;
  }


   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }




  public AgentToAgentTest links(UnexpandedInstantTestLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public UnexpandedInstantTestLinks getLinks() {
    return links;
  }


  public void setLinks(UnexpandedInstantTestLinks links) {
    this.links = links;
  }


   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  public List<TestLabelsInner> getLabels() {
    return labels;
  }




   /**
   * Get sharedWithAccounts
   * @return sharedWithAccounts
  **/
  @javax.annotation.Nullable
  public List<TestSharedAccountsInner> getSharedWithAccounts() {
    return sharedWithAccounts;
  }




   /**
   * Contains list of agents.
   * @return agents
  **/
  @javax.annotation.Nonnull
  public List<Agent> getAgents() {
    return agents;
  }




  public AgentToAgentTest direction(TestDirection direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  public TestDirection getDirection() {
    return direction;
  }


  public void setDirection(TestDirection direction) {
    this.direction = direction;
  }


   /**
   * DSCP label.
   * @return dscp
  **/
  @javax.annotation.Nullable
  public String getDscp() {
    return dscp;
  }




  public AgentToAgentTest dscpId(TestDscpId dscpId) {
    
    this.dscpId = dscpId;
    return this;
  }

   /**
   * Get dscpId
   * @return dscpId
  **/
  @javax.annotation.Nullable
  public TestDscpId getDscpId() {
    return dscpId;
  }


  public void setDscpId(TestDscpId dscpId) {
    this.dscpId = dscpId;
  }


  public AgentToAgentTest mss(Integer mss) {
    
    this.mss = mss;
    return this;
  }

   /**
   * Maximum segment size, in bytes.
   * minimum: 20
   * maximum: 1400
   * @return mss
  **/
  @javax.annotation.Nullable
  public Integer getMss() {
    return mss;
  }


  public void setMss(Integer mss) {
    this.mss = mss;
  }


  public AgentToAgentTest numPathTraces(Integer numPathTraces) {
    
    this.numPathTraces = numPathTraces;
    return this;
  }

   /**
   * Number of path traces executed by the agent.
   * minimum: 3
   * maximum: 10
   * @return numPathTraces
  **/
  @javax.annotation.Nullable
  public Integer getNumPathTraces() {
    return numPathTraces;
  }


  public void setNumPathTraces(Integer numPathTraces) {
    this.numPathTraces = numPathTraces;
  }


  public AgentToAgentTest pathTraceMode(TestPathTraceMode pathTraceMode) {
    
    this.pathTraceMode = pathTraceMode;
    return this;
  }

   /**
   * Get pathTraceMode
   * @return pathTraceMode
  **/
  @javax.annotation.Nullable
  public TestPathTraceMode getPathTraceMode() {
    return pathTraceMode;
  }


  public void setPathTraceMode(TestPathTraceMode pathTraceMode) {
    this.pathTraceMode = pathTraceMode;
  }


  public AgentToAgentTest port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Target port.
   * minimum: 1
   * maximum: 65535
   * @return port
  **/
  @javax.annotation.Nullable
  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public AgentToAgentTest protocol(AgentToAgentTestProtocol protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  public AgentToAgentTestProtocol getProtocol() {
    return protocol;
  }


  public void setProtocol(AgentToAgentTestProtocol protocol) {
    this.protocol = protocol;
  }


  public AgentToAgentTest targetAgentId(String targetAgentId) {
    
    this.targetAgentId = targetAgentId;
    return this;
  }

   /**
   * &#x60;agentId&#x60; of the target agent for the test.
   * @return targetAgentId
  **/
  @javax.annotation.Nonnull
  public String getTargetAgentId() {
    return targetAgentId;
  }


  public void setTargetAgentId(String targetAgentId) {
    this.targetAgentId = targetAgentId;
  }


  public AgentToAgentTest throughputMeasurements(Boolean throughputMeasurements) {
    
    this.throughputMeasurements = throughputMeasurements;
    return this;
  }

   /**
   * Enable or disable throughput measurements. Throughput measurements cannot be enabled when the source or target of the test is a cloud agent.
   * @return throughputMeasurements
  **/
  @javax.annotation.Nullable
  public Boolean getThroughputMeasurements() {
    return throughputMeasurements;
  }


  public void setThroughputMeasurements(Boolean throughputMeasurements) {
    this.throughputMeasurements = throughputMeasurements;
  }


  public AgentToAgentTest throughputDuration(Integer throughputDuration) {
    
    this.throughputDuration = throughputDuration;
    return this;
  }

   /**
   * The throughput duration.
   * minimum: 5000
   * maximum: 30000
   * @return throughputDuration
  **/
  @javax.annotation.Nullable
  public Integer getThroughputDuration() {
    return throughputDuration;
  }


  public void setThroughputDuration(Integer throughputDuration) {
    this.throughputDuration = throughputDuration;
  }


  public AgentToAgentTest throughputRate(Integer throughputRate) {
    
    this.throughputRate = throughputRate;
    return this;
  }

   /**
   * The throughput rate, only applicable for UDP protocol.
   * minimum: 8
   * maximum: 1000
   * @return throughputRate
  **/
  @javax.annotation.Nullable
  public Integer getThroughputRate() {
    return throughputRate;
  }


  public void setThroughputRate(Integer throughputRate) {
    this.throughputRate = throughputRate;
  }


  public AgentToAgentTest fixedPacketRate(Integer fixedPacketRate) {
    
    this.fixedPacketRate = fixedPacketRate;
    return this;
  }

   /**
   * Sets packets rate sent to measure the network in packets per second.
   * minimum: 0
   * maximum: 100
   * @return fixedPacketRate
  **/
  @javax.annotation.Nullable
  public Integer getFixedPacketRate() {
    return fixedPacketRate;
  }


  public void setFixedPacketRate(Integer fixedPacketRate) {
    this.fixedPacketRate = fixedPacketRate;
  }


  public AgentToAgentTest bgpMeasurements(Boolean bgpMeasurements) {
    
    this.bgpMeasurements = bgpMeasurements;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to enable bgp measurements.
   * @return bgpMeasurements
  **/
  @javax.annotation.Nullable
  public Boolean getBgpMeasurements() {
    return bgpMeasurements;
  }


  public void setBgpMeasurements(Boolean bgpMeasurements) {
    this.bgpMeasurements = bgpMeasurements;
  }


   /**
   * Contains list of enabled BGP monitors.
   * @return monitors
  **/
  @javax.annotation.Nullable
  public List<Monitor> getMonitors() {
    return monitors;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentToAgentTest agentToAgentTest = (AgentToAgentTest) o;
    return Objects.equals(this.interval, agentToAgentTest.interval) &&
        Objects.equals(this.alertsEnabled, agentToAgentTest.alertsEnabled) &&
        Objects.equals(this.enabled, agentToAgentTest.enabled) &&
        Objects.equals(this.alertRules, agentToAgentTest.alertRules) &&
        Objects.equals(this.createdBy, agentToAgentTest.createdBy) &&
        Objects.equals(this.createdDate, agentToAgentTest.createdDate) &&
        Objects.equals(this.description, agentToAgentTest.description) &&
        Objects.equals(this.liveShare, agentToAgentTest.liveShare) &&
        Objects.equals(this.modifiedBy, agentToAgentTest.modifiedBy) &&
        Objects.equals(this.modifiedDate, agentToAgentTest.modifiedDate) &&
        Objects.equals(this.savedEvent, agentToAgentTest.savedEvent) &&
        Objects.equals(this.testId, agentToAgentTest.testId) &&
        Objects.equals(this.testName, agentToAgentTest.testName) &&
        Objects.equals(this.type, agentToAgentTest.type) &&
        Objects.equals(this.links, agentToAgentTest.links) &&
        Objects.equals(this.labels, agentToAgentTest.labels) &&
        Objects.equals(this.sharedWithAccounts, agentToAgentTest.sharedWithAccounts) &&
        Objects.equals(this.agents, agentToAgentTest.agents) &&
        Objects.equals(this.direction, agentToAgentTest.direction) &&
        Objects.equals(this.dscp, agentToAgentTest.dscp) &&
        Objects.equals(this.dscpId, agentToAgentTest.dscpId) &&
        Objects.equals(this.mss, agentToAgentTest.mss) &&
        Objects.equals(this.numPathTraces, agentToAgentTest.numPathTraces) &&
        Objects.equals(this.pathTraceMode, agentToAgentTest.pathTraceMode) &&
        Objects.equals(this.port, agentToAgentTest.port) &&
        Objects.equals(this.protocol, agentToAgentTest.protocol) &&
        Objects.equals(this.targetAgentId, agentToAgentTest.targetAgentId) &&
        Objects.equals(this.throughputMeasurements, agentToAgentTest.throughputMeasurements) &&
        Objects.equals(this.throughputDuration, agentToAgentTest.throughputDuration) &&
        Objects.equals(this.throughputRate, agentToAgentTest.throughputRate) &&
        Objects.equals(this.fixedPacketRate, agentToAgentTest.fixedPacketRate) &&
        Objects.equals(this.bgpMeasurements, agentToAgentTest.bgpMeasurements) &&
        Objects.equals(this.monitors, agentToAgentTest.monitors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, alertsEnabled, enabled, alertRules, createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, labels, sharedWithAccounts, agents, direction, dscp, dscpId, mss, numPathTraces, pathTraceMode, port, protocol, targetAgentId, throughputMeasurements, throughputDuration, throughputRate, fixedPacketRate, bgpMeasurements, monitors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentToAgentTest {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    alertsEnabled: ").append(toIndentedString(alertsEnabled)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    alertRules: ").append(toIndentedString(alertRules)).append("\n");
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
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    sharedWithAccounts: ").append(toIndentedString(sharedWithAccounts)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
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
    sb.append("    bgpMeasurements: ").append(toIndentedString(bgpMeasurements)).append("\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("interval");
    openapiFields.add("alertsEnabled");
    openapiFields.add("enabled");
    openapiFields.add("alertRules");
    openapiFields.add("createdBy");
    openapiFields.add("createdDate");
    openapiFields.add("description");
    openapiFields.add("liveShare");
    openapiFields.add("modifiedBy");
    openapiFields.add("modifiedDate");
    openapiFields.add("savedEvent");
    openapiFields.add("testId");
    openapiFields.add("testName");
    openapiFields.add("type");
    openapiFields.add("_links");
    openapiFields.add("labels");
    openapiFields.add("sharedWithAccounts");
    openapiFields.add("agents");
    openapiFields.add("direction");
    openapiFields.add("dscp");
    openapiFields.add("dscpId");
    openapiFields.add("mss");
    openapiFields.add("numPathTraces");
    openapiFields.add("pathTraceMode");
    openapiFields.add("port");
    openapiFields.add("protocol");
    openapiFields.add("targetAgentId");
    openapiFields.add("throughputMeasurements");
    openapiFields.add("throughputDuration");
    openapiFields.add("throughputRate");
    openapiFields.add("fixedPacketRate");
    openapiFields.add("bgpMeasurements");
    openapiFields.add("monitors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("interval");
    openapiRequiredFields.add("agents");
    openapiRequiredFields.add("targetAgentId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AgentToAgentTest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AgentToAgentTest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgentToAgentTest is not found in the empty JSON string", AgentToAgentTest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AgentToAgentTest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AgentToAgentTest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AgentToAgentTest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `interval`
      TestInterval.validateJsonElement(jsonObj.get("interval"));
      if (jsonObj.get("alertRules") != null && !jsonObj.get("alertRules").isJsonNull()) {
        JsonArray jsonArrayalertRules = jsonObj.getAsJsonArray("alertRules");
        if (jsonArrayalertRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("alertRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `alertRules` to be an array in the JSON string but got `%s`", jsonObj.get("alertRules").toString()));
          }

          // validate the optional field `alertRules` (array)
          for (int i = 0; i < jsonArrayalertRules.size(); i++) {
            AlertRule.validateJsonElement(jsonArrayalertRules.get(i));
          };
        }
      }
      if ((jsonObj.get("createdBy") != null && !jsonObj.get("createdBy").isJsonNull()) && !jsonObj.get("createdBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdBy").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("modifiedBy") != null && !jsonObj.get("modifiedBy").isJsonNull()) && !jsonObj.get("modifiedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedBy").toString()));
      }
      if ((jsonObj.get("testId") != null && !jsonObj.get("testId").isJsonNull()) && !jsonObj.get("testId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testId").toString()));
      }
      if ((jsonObj.get("testName") != null && !jsonObj.get("testName").isJsonNull()) && !jsonObj.get("testName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testName").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        UnexpandedInstantTestLinks.validateJsonElement(jsonObj.get("_links"));
      }
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonNull()) {
        JsonArray jsonArraylabels = jsonObj.getAsJsonArray("labels");
        if (jsonArraylabels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("labels").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
          }

          // validate the optional field `labels` (array)
          for (int i = 0; i < jsonArraylabels.size(); i++) {
            TestLabelsInner.validateJsonElement(jsonArraylabels.get(i));
          };
        }
      }
      if (jsonObj.get("sharedWithAccounts") != null && !jsonObj.get("sharedWithAccounts").isJsonNull()) {
        JsonArray jsonArraysharedWithAccounts = jsonObj.getAsJsonArray("sharedWithAccounts");
        if (jsonArraysharedWithAccounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sharedWithAccounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sharedWithAccounts` to be an array in the JSON string but got `%s`", jsonObj.get("sharedWithAccounts").toString()));
          }

          // validate the optional field `sharedWithAccounts` (array)
          for (int i = 0; i < jsonArraysharedWithAccounts.size(); i++) {
            TestSharedAccountsInner.validateJsonElement(jsonArraysharedWithAccounts.get(i));
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("agents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `agents` to be an array in the JSON string but got `%s`", jsonObj.get("agents").toString()));
      }

      JsonArray jsonArrayagents = jsonObj.getAsJsonArray("agents");
      // validate the required field `agents` (array)
      for (int i = 0; i < jsonArrayagents.size(); i++) {
        Agent.validateJsonElement(jsonArrayagents.get(i));
      };
      // validate the optional field `direction`
      if (jsonObj.get("direction") != null && !jsonObj.get("direction").isJsonNull()) {
        TestDirection.validateJsonElement(jsonObj.get("direction"));
      }
      if ((jsonObj.get("dscp") != null && !jsonObj.get("dscp").isJsonNull()) && !jsonObj.get("dscp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dscp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dscp").toString()));
      }
      // validate the optional field `dscpId`
      if (jsonObj.get("dscpId") != null && !jsonObj.get("dscpId").isJsonNull()) {
        TestDscpId.validateJsonElement(jsonObj.get("dscpId"));
      }
      // validate the optional field `pathTraceMode`
      if (jsonObj.get("pathTraceMode") != null && !jsonObj.get("pathTraceMode").isJsonNull()) {
        TestPathTraceMode.validateJsonElement(jsonObj.get("pathTraceMode"));
      }
      // validate the optional field `protocol`
      if (jsonObj.get("protocol") != null && !jsonObj.get("protocol").isJsonNull()) {
        AgentToAgentTestProtocol.validateJsonElement(jsonObj.get("protocol"));
      }
      if (!jsonObj.get("targetAgentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetAgentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetAgentId").toString()));
      }
      if (jsonObj.get("monitors") != null && !jsonObj.get("monitors").isJsonNull()) {
        JsonArray jsonArraymonitors = jsonObj.getAsJsonArray("monitors");
        if (jsonArraymonitors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("monitors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `monitors` to be an array in the JSON string but got `%s`", jsonObj.get("monitors").toString()));
          }

          // validate the optional field `monitors` (array)
          for (int i = 0; i < jsonArraymonitors.size(); i++) {
            Monitor.validateJsonElement(jsonArraymonitors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentToAgentTest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentToAgentTest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentToAgentTest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentToAgentTest.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentToAgentTest>() {
           @Override
           public void write(JsonWriter out, AgentToAgentTest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentToAgentTest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentToAgentTest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentToAgentTest
  * @throws IOException if the JSON string is invalid with respect to AgentToAgentTest
  */
  public static AgentToAgentTest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentToAgentTest.class);
  }

 /**
  * Convert an instance of AgentToAgentTest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

