/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.6
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
import com.thousandeyes.sdk.tests.model.Agent;
import com.thousandeyes.sdk.tests.model.SharedWithAccount;
import com.thousandeyes.sdk.tests.model.TestIpv6Policy;
import com.thousandeyes.sdk.tests.model.TestLabel;
import com.thousandeyes.sdk.tests.model.TestLinks;
import com.thousandeyes.sdk.tests.model.TestPathTraceMode;
import com.thousandeyes.sdk.tests.model.TestProbeMode;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SipServerInstantTest
 */
@JsonPropertyOrder({
  SipServerInstantTest.JSON_PROPERTY_CREATED_BY,
  SipServerInstantTest.JSON_PROPERTY_CREATED_DATE,
  SipServerInstantTest.JSON_PROPERTY_DESCRIPTION,
  SipServerInstantTest.JSON_PROPERTY_LIVE_SHARE,
  SipServerInstantTest.JSON_PROPERTY_MODIFIED_BY,
  SipServerInstantTest.JSON_PROPERTY_MODIFIED_DATE,
  SipServerInstantTest.JSON_PROPERTY_SAVED_EVENT,
  SipServerInstantTest.JSON_PROPERTY_TEST_ID,
  SipServerInstantTest.JSON_PROPERTY_TEST_NAME,
  SipServerInstantTest.JSON_PROPERTY_TYPE,
  SipServerInstantTest.JSON_PROPERTY_LINKS,
  SipServerInstantTest.JSON_PROPERTY_LABELS,
  SipServerInstantTest.JSON_PROPERTY_SHARED_WITH_ACCOUNTS,
  SipServerInstantTest.JSON_PROPERTY_MTU_MEASUREMENTS,
  SipServerInstantTest.JSON_PROPERTY_NETWORK_MEASUREMENTS,
  SipServerInstantTest.JSON_PROPERTY_NUM_PATH_TRACES,
  SipServerInstantTest.JSON_PROPERTY_OPTIONS_REGEX,
  SipServerInstantTest.JSON_PROPERTY_PATH_TRACE_MODE,
  SipServerInstantTest.JSON_PROPERTY_PROBE_MODE,
  SipServerInstantTest.JSON_PROPERTY_REGISTER_ENABLED,
  SipServerInstantTest.JSON_PROPERTY_SIP_TARGET_TIME,
  SipServerInstantTest.JSON_PROPERTY_SIP_TIME_LIMIT,
  SipServerInstantTest.JSON_PROPERTY_FIXED_PACKET_RATE,
  SipServerInstantTest.JSON_PROPERTY_IPV6_POLICY,
  SipServerInstantTest.JSON_PROPERTY_AGENTS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class SipServerInstantTest {
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

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<TestLabel> labels = new ArrayList<>();

  public static final String JSON_PROPERTY_SHARED_WITH_ACCOUNTS = "sharedWithAccounts";
  private List<SharedWithAccount> sharedWithAccounts = new ArrayList<>();

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

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<Agent> agents = new ArrayList<>();

  public SipServerInstantTest() { 
  }

  @JsonCreator
  public SipServerInstantTest(
    @JsonProperty(JSON_PROPERTY_CREATED_BY) String createdBy, 
    @JsonProperty(JSON_PROPERTY_CREATED_DATE) OffsetDateTime createdDate, 
    @JsonProperty(JSON_PROPERTY_LIVE_SHARE) Boolean liveShare, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_BY) String modifiedBy, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_DATE) OffsetDateTime modifiedDate, 
    @JsonProperty(JSON_PROPERTY_SAVED_EVENT) Boolean savedEvent, 
    @JsonProperty(JSON_PROPERTY_TEST_ID) String testId, 
    @JsonProperty(JSON_PROPERTY_TYPE) String type, 
    @JsonProperty(JSON_PROPERTY_LABELS) List<TestLabel> labels, 
    @JsonProperty(JSON_PROPERTY_SHARED_WITH_ACCOUNTS) List<SharedWithAccount> sharedWithAccounts, 
    @JsonProperty(JSON_PROPERTY_AGENTS) List<Agent> agents
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




  public SipServerInstantTest description(String description) {
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
   * Indicates if the test is a saved event.
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




  public SipServerInstantTest testName(String testName) {
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




  public SipServerInstantTest links(TestLinks links) {
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


   /**
   * Get labels
   * @return labels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TestLabel> getLabels() {
    return labels;
  }




   /**
   * Get sharedWithAccounts
   * @return sharedWithAccounts
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARED_WITH_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SharedWithAccount> getSharedWithAccounts() {
    return sharedWithAccounts;
  }




  public SipServerInstantTest mtuMeasurements(Boolean mtuMeasurements) {
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


  public SipServerInstantTest networkMeasurements(Boolean networkMeasurements) {
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


  public SipServerInstantTest numPathTraces(Integer numPathTraces) {
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


  public SipServerInstantTest optionsRegex(String optionsRegex) {
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


  public SipServerInstantTest pathTraceMode(TestPathTraceMode pathTraceMode) {
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


  public SipServerInstantTest probeMode(TestProbeMode probeMode) {
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


  public SipServerInstantTest registerEnabled(Boolean registerEnabled) {
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


  public SipServerInstantTest sipTargetTime(Integer sipTargetTime) {
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


  public SipServerInstantTest sipTimeLimit(Integer sipTimeLimit) {
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


  public SipServerInstantTest fixedPacketRate(Integer fixedPacketRate) {
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


  public SipServerInstantTest ipv6Policy(TestIpv6Policy ipv6Policy) {
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
   * Contains list of agents.
   * @return agents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Agent> getAgents() {
    return agents;
  }




  /**
   * Return true if this SipServerInstantTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SipServerInstantTest sipServerInstantTest = (SipServerInstantTest) o;
    return Objects.equals(this.createdBy, sipServerInstantTest.createdBy) &&
        Objects.equals(this.createdDate, sipServerInstantTest.createdDate) &&
        Objects.equals(this.description, sipServerInstantTest.description) &&
        Objects.equals(this.liveShare, sipServerInstantTest.liveShare) &&
        Objects.equals(this.modifiedBy, sipServerInstantTest.modifiedBy) &&
        Objects.equals(this.modifiedDate, sipServerInstantTest.modifiedDate) &&
        Objects.equals(this.savedEvent, sipServerInstantTest.savedEvent) &&
        Objects.equals(this.testId, sipServerInstantTest.testId) &&
        Objects.equals(this.testName, sipServerInstantTest.testName) &&
        Objects.equals(this.type, sipServerInstantTest.type) &&
        Objects.equals(this.links, sipServerInstantTest.links) &&
        Objects.equals(this.labels, sipServerInstantTest.labels) &&
        Objects.equals(this.sharedWithAccounts, sipServerInstantTest.sharedWithAccounts) &&
        Objects.equals(this.mtuMeasurements, sipServerInstantTest.mtuMeasurements) &&
        Objects.equals(this.networkMeasurements, sipServerInstantTest.networkMeasurements) &&
        Objects.equals(this.numPathTraces, sipServerInstantTest.numPathTraces) &&
        Objects.equals(this.optionsRegex, sipServerInstantTest.optionsRegex) &&
        Objects.equals(this.pathTraceMode, sipServerInstantTest.pathTraceMode) &&
        Objects.equals(this.probeMode, sipServerInstantTest.probeMode) &&
        Objects.equals(this.registerEnabled, sipServerInstantTest.registerEnabled) &&
        Objects.equals(this.sipTargetTime, sipServerInstantTest.sipTargetTime) &&
        Objects.equals(this.sipTimeLimit, sipServerInstantTest.sipTimeLimit) &&
        Objects.equals(this.fixedPacketRate, sipServerInstantTest.fixedPacketRate) &&
        Objects.equals(this.ipv6Policy, sipServerInstantTest.ipv6Policy) &&
        Objects.equals(this.agents, sipServerInstantTest.agents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, labels, sharedWithAccounts, mtuMeasurements, networkMeasurements, numPathTraces, optionsRegex, pathTraceMode, probeMode, registerEnabled, sipTargetTime, sipTimeLimit, fixedPacketRate, ipv6Policy, agents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SipServerInstantTest {\n");
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
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
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

