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
import com.thousandeyes.api.tests.model.AgentRequest;
import com.thousandeyes.api.tests.model.Monitor;
import com.thousandeyes.api.tests.model.TestInterval;
import com.thousandeyes.api.tests.model.TestIpv6Policy;
import com.thousandeyes.api.tests.model.TestPathTraceMode;
import com.thousandeyes.api.tests.model.TestProbeMode;
import com.thousandeyes.api.tests.model.TestSipCredentials;
import com.thousandeyes.api.tests.model.UnexpandedInstantTestLinks;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateSipServerTest
 */
@JsonPropertyOrder({
  UpdateSipServerTest.JSON_PROPERTY_INTERVAL,
  UpdateSipServerTest.JSON_PROPERTY_ALERTS_ENABLED,
  UpdateSipServerTest.JSON_PROPERTY_ENABLED,
  UpdateSipServerTest.JSON_PROPERTY_ALERT_RULES,
  UpdateSipServerTest.JSON_PROPERTY_CREATED_BY,
  UpdateSipServerTest.JSON_PROPERTY_CREATED_DATE,
  UpdateSipServerTest.JSON_PROPERTY_DESCRIPTION,
  UpdateSipServerTest.JSON_PROPERTY_LIVE_SHARE,
  UpdateSipServerTest.JSON_PROPERTY_MODIFIED_BY,
  UpdateSipServerTest.JSON_PROPERTY_MODIFIED_DATE,
  UpdateSipServerTest.JSON_PROPERTY_SAVED_EVENT,
  UpdateSipServerTest.JSON_PROPERTY_TEST_ID,
  UpdateSipServerTest.JSON_PROPERTY_TEST_NAME,
  UpdateSipServerTest.JSON_PROPERTY_TYPE,
  UpdateSipServerTest.JSON_PROPERTY_LINKS,
  UpdateSipServerTest.JSON_PROPERTY_LABELS,
  UpdateSipServerTest.JSON_PROPERTY_SHARED_WITH_ACCOUNTS,
  UpdateSipServerTest.JSON_PROPERTY_MTU_MEASUREMENTS,
  UpdateSipServerTest.JSON_PROPERTY_NETWORK_MEASUREMENTS,
  UpdateSipServerTest.JSON_PROPERTY_NUM_PATH_TRACES,
  UpdateSipServerTest.JSON_PROPERTY_OPTIONS_REGEX,
  UpdateSipServerTest.JSON_PROPERTY_PATH_TRACE_MODE,
  UpdateSipServerTest.JSON_PROPERTY_PROBE_MODE,
  UpdateSipServerTest.JSON_PROPERTY_REGISTER_ENABLED,
  UpdateSipServerTest.JSON_PROPERTY_SIP_TARGET_TIME,
  UpdateSipServerTest.JSON_PROPERTY_SIP_TIME_LIMIT,
  UpdateSipServerTest.JSON_PROPERTY_FIXED_PACKET_RATE,
  UpdateSipServerTest.JSON_PROPERTY_IPV6_POLICY,
  UpdateSipServerTest.JSON_PROPERTY_AGENTS,
  UpdateSipServerTest.JSON_PROPERTY_TARGET_SIP_CREDENTIALS,
  UpdateSipServerTest.JSON_PROPERTY_BGP_MEASUREMENTS,
  UpdateSipServerTest.JSON_PROPERTY_USE_PUBLIC_BGP,
  UpdateSipServerTest.JSON_PROPERTY_MONITORS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-30T10:06:14.524967+01:00[Europe/Lisbon]")
public class UpdateSipServerTest {
  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private TestInterval interval;

  public static final String JSON_PROPERTY_ALERTS_ENABLED = "alertsEnabled";
  private Boolean alertsEnabled;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled = true;

  public static final String JSON_PROPERTY_ALERT_RULES = "alertRules";
  private List<String> alertRules = new ArrayList<>();

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
  private UnexpandedInstantTestLinks links;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<String> labels = new ArrayList<>();

  public static final String JSON_PROPERTY_SHARED_WITH_ACCOUNTS = "sharedWithAccounts";
  private List<String> sharedWithAccounts = new ArrayList<>();

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
  private List<AgentRequest> agents = new ArrayList<>();

  public static final String JSON_PROPERTY_TARGET_SIP_CREDENTIALS = "targetSipCredentials";
  private TestSipCredentials targetSipCredentials;

  public static final String JSON_PROPERTY_BGP_MEASUREMENTS = "bgpMeasurements";
  private Boolean bgpMeasurements = true;

  public static final String JSON_PROPERTY_USE_PUBLIC_BGP = "usePublicBgp";
  private Boolean usePublicBgp = true;

  public static final String JSON_PROPERTY_MONITORS = "monitors";
  private List<Monitor> monitors = new ArrayList<>();

  public UpdateSipServerTest() { 
  }

  @JsonCreator
  public UpdateSipServerTest(
    @JsonProperty(JSON_PROPERTY_CREATED_BY) String createdBy, 
    @JsonProperty(JSON_PROPERTY_CREATED_DATE) OffsetDateTime createdDate, 
    @JsonProperty(JSON_PROPERTY_LIVE_SHARE) Boolean liveShare, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_BY) String modifiedBy, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_DATE) OffsetDateTime modifiedDate, 
    @JsonProperty(JSON_PROPERTY_SAVED_EVENT) Boolean savedEvent, 
    @JsonProperty(JSON_PROPERTY_TEST_ID) String testId, 
    @JsonProperty(JSON_PROPERTY_TYPE) String type, 
    @JsonProperty(JSON_PROPERTY_MONITORS) List<Monitor> monitors
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
    this.monitors = monitors;
  }

  public UpdateSipServerTest interval(TestInterval interval) {
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


  public UpdateSipServerTest alertsEnabled(Boolean alertsEnabled) {
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


  public UpdateSipServerTest enabled(Boolean enabled) {
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


  public UpdateSipServerTest alertRules(List<String> alertRules) {
    this.alertRules = alertRules;
    return this;
  }

  public UpdateSipServerTest addAlertRulesItem(String alertRulesItem) {
    if (this.alertRules == null) {
      this.alertRules = new ArrayList<>();
    }
    this.alertRules.add(alertRulesItem);
    return this;
  }

   /**
   * List of alert rules IDs to apply to the test (get &#x60;ruleId&#x60; from &#x60;/alerts/rules&#x60; endpoint. If &#x60;alertsEnabled&#x60; is set to &#x60;true&#x60; and &#x60;alertRules&#x60; is not included on test creation or update, applicable user default alert rules will be used)
   * @return alertRules
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAlertRules() {
    return alertRules;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertRules(List<String> alertRules) {
    this.alertRules = alertRules;
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




  public UpdateSipServerTest description(String description) {
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




  public UpdateSipServerTest testName(String testName) {
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




  public UpdateSipServerTest links(UnexpandedInstantTestLinks links) {
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

  public UnexpandedInstantTestLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(UnexpandedInstantTestLinks links) {
    this.links = links;
  }


  public UpdateSipServerTest labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public UpdateSipServerTest addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Contains list of test label IDs (get &#x60;labelId&#x60; from &#x60;/labels&#x60; endpoint)
   * @return labels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public UpdateSipServerTest sharedWithAccounts(List<String> sharedWithAccounts) {
    this.sharedWithAccounts = sharedWithAccounts;
    return this;
  }

  public UpdateSipServerTest addSharedWithAccountsItem(String sharedWithAccountsItem) {
    if (this.sharedWithAccounts == null) {
      this.sharedWithAccounts = new ArrayList<>();
    }
    this.sharedWithAccounts.add(sharedWithAccountsItem);
    return this;
  }

   /**
   * Contains list of account group IDs. Test is shared with the listed account groups (get &#x60;aid&#x60; from &#x60;/account-groups&#x60; endpoint)
   * @return sharedWithAccounts
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARED_WITH_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSharedWithAccounts() {
    return sharedWithAccounts;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_WITH_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedWithAccounts(List<String> sharedWithAccounts) {
    this.sharedWithAccounts = sharedWithAccounts;
  }


  public UpdateSipServerTest mtuMeasurements(Boolean mtuMeasurements) {
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


  public UpdateSipServerTest networkMeasurements(Boolean networkMeasurements) {
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


  public UpdateSipServerTest numPathTraces(Integer numPathTraces) {
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


  public UpdateSipServerTest optionsRegex(String optionsRegex) {
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


  public UpdateSipServerTest pathTraceMode(TestPathTraceMode pathTraceMode) {
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


  public UpdateSipServerTest probeMode(TestProbeMode probeMode) {
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


  public UpdateSipServerTest registerEnabled(Boolean registerEnabled) {
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


  public UpdateSipServerTest sipTargetTime(Integer sipTargetTime) {
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


  public UpdateSipServerTest sipTimeLimit(Integer sipTimeLimit) {
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


  public UpdateSipServerTest fixedPacketRate(Integer fixedPacketRate) {
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


  public UpdateSipServerTest ipv6Policy(TestIpv6Policy ipv6Policy) {
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


  public UpdateSipServerTest agents(List<AgentRequest> agents) {
    this.agents = agents;
    return this;
  }

  public UpdateSipServerTest addAgentsItem(AgentRequest agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * Get agents
   * @return agents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AgentRequest> getAgents() {
    return agents;
  }


  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgents(List<AgentRequest> agents) {
    this.agents = agents;
  }


  public UpdateSipServerTest targetSipCredentials(TestSipCredentials targetSipCredentials) {
    this.targetSipCredentials = targetSipCredentials;
    return this;
  }

   /**
   * Get targetSipCredentials
   * @return targetSipCredentials
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TARGET_SIP_CREDENTIALS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TestSipCredentials getTargetSipCredentials() {
    return targetSipCredentials;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_SIP_CREDENTIALS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetSipCredentials(TestSipCredentials targetSipCredentials) {
    this.targetSipCredentials = targetSipCredentials;
  }


  public UpdateSipServerTest bgpMeasurements(Boolean bgpMeasurements) {
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


  public UpdateSipServerTest usePublicBgp(Boolean usePublicBgp) {
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
   * Contains list of enabled BGP monitors.
   * @return monitors
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Monitor> getMonitors() {
    return monitors;
  }




  /**
   * Return true if this UpdateSipServerTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSipServerTest updateSipServerTest = (UpdateSipServerTest) o;
    return Objects.equals(this.interval, updateSipServerTest.interval) &&
        Objects.equals(this.alertsEnabled, updateSipServerTest.alertsEnabled) &&
        Objects.equals(this.enabled, updateSipServerTest.enabled) &&
        Objects.equals(this.alertRules, updateSipServerTest.alertRules) &&
        Objects.equals(this.createdBy, updateSipServerTest.createdBy) &&
        Objects.equals(this.createdDate, updateSipServerTest.createdDate) &&
        Objects.equals(this.description, updateSipServerTest.description) &&
        Objects.equals(this.liveShare, updateSipServerTest.liveShare) &&
        Objects.equals(this.modifiedBy, updateSipServerTest.modifiedBy) &&
        Objects.equals(this.modifiedDate, updateSipServerTest.modifiedDate) &&
        Objects.equals(this.savedEvent, updateSipServerTest.savedEvent) &&
        Objects.equals(this.testId, updateSipServerTest.testId) &&
        Objects.equals(this.testName, updateSipServerTest.testName) &&
        Objects.equals(this.type, updateSipServerTest.type) &&
        Objects.equals(this.links, updateSipServerTest.links) &&
        Objects.equals(this.labels, updateSipServerTest.labels) &&
        Objects.equals(this.sharedWithAccounts, updateSipServerTest.sharedWithAccounts) &&
        Objects.equals(this.mtuMeasurements, updateSipServerTest.mtuMeasurements) &&
        Objects.equals(this.networkMeasurements, updateSipServerTest.networkMeasurements) &&
        Objects.equals(this.numPathTraces, updateSipServerTest.numPathTraces) &&
        Objects.equals(this.optionsRegex, updateSipServerTest.optionsRegex) &&
        Objects.equals(this.pathTraceMode, updateSipServerTest.pathTraceMode) &&
        Objects.equals(this.probeMode, updateSipServerTest.probeMode) &&
        Objects.equals(this.registerEnabled, updateSipServerTest.registerEnabled) &&
        Objects.equals(this.sipTargetTime, updateSipServerTest.sipTargetTime) &&
        Objects.equals(this.sipTimeLimit, updateSipServerTest.sipTimeLimit) &&
        Objects.equals(this.fixedPacketRate, updateSipServerTest.fixedPacketRate) &&
        Objects.equals(this.ipv6Policy, updateSipServerTest.ipv6Policy) &&
        Objects.equals(this.agents, updateSipServerTest.agents) &&
        Objects.equals(this.targetSipCredentials, updateSipServerTest.targetSipCredentials) &&
        Objects.equals(this.bgpMeasurements, updateSipServerTest.bgpMeasurements) &&
        Objects.equals(this.usePublicBgp, updateSipServerTest.usePublicBgp) &&
        Objects.equals(this.monitors, updateSipServerTest.monitors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, alertsEnabled, enabled, alertRules, createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, labels, sharedWithAccounts, mtuMeasurements, networkMeasurements, numPathTraces, optionsRegex, pathTraceMode, probeMode, registerEnabled, sipTargetTime, sipTimeLimit, fixedPacketRate, ipv6Policy, agents, targetSipCredentials, bgpMeasurements, usePublicBgp, monitors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSipServerTest {\n");
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
    sb.append("    targetSipCredentials: ").append(toIndentedString(targetSipCredentials)).append("\n");
    sb.append("    bgpMeasurements: ").append(toIndentedString(bgpMeasurements)).append("\n");
    sb.append("    usePublicBgp: ").append(toIndentedString(usePublicBgp)).append("\n");
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
}

