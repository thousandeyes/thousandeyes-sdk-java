/*
 * Instant Tests API
 * The Instant Tests API operations lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.instant.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.tests.instant.model.AgentResponse;
import com.thousandeyes.sdk.tests.instant.model.SharedWithAccount;
import com.thousandeyes.sdk.tests.instant.model.TestDscpId;
import com.thousandeyes.sdk.tests.instant.model.TestIpv6Policy;
import com.thousandeyes.sdk.tests.instant.model.TestLabel;
import com.thousandeyes.sdk.tests.instant.model.TestLinks;
import com.thousandeyes.sdk.tests.instant.model.TestPathTraceMode;
import com.thousandeyes.sdk.tests.instant.model.TestProbeMode;
import com.thousandeyes.sdk.tests.instant.model.TestProtocol;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AgentToServerInstantTestResponse
 */
@JsonPropertyOrder({
  AgentToServerInstantTestResponse.JSON_PROPERTY_CREATED_BY,
  AgentToServerInstantTestResponse.JSON_PROPERTY_CREATED_DATE,
  AgentToServerInstantTestResponse.JSON_PROPERTY_DESCRIPTION,
  AgentToServerInstantTestResponse.JSON_PROPERTY_LIVE_SHARE,
  AgentToServerInstantTestResponse.JSON_PROPERTY_MODIFIED_BY,
  AgentToServerInstantTestResponse.JSON_PROPERTY_MODIFIED_DATE,
  AgentToServerInstantTestResponse.JSON_PROPERTY_SAVED_EVENT,
  AgentToServerInstantTestResponse.JSON_PROPERTY_TEST_ID,
  AgentToServerInstantTestResponse.JSON_PROPERTY_TEST_NAME,
  AgentToServerInstantTestResponse.JSON_PROPERTY_TYPE,
  AgentToServerInstantTestResponse.JSON_PROPERTY_LINKS,
  AgentToServerInstantTestResponse.JSON_PROPERTY_LABELS,
  AgentToServerInstantTestResponse.JSON_PROPERTY_SHARED_WITH_ACCOUNTS,
  AgentToServerInstantTestResponse.JSON_PROPERTY_BANDWIDTH_MEASUREMENTS,
  AgentToServerInstantTestResponse.JSON_PROPERTY_CONTINUOUS_MODE,
  AgentToServerInstantTestResponse.JSON_PROPERTY_FIXED_PACKET_RATE,
  AgentToServerInstantTestResponse.JSON_PROPERTY_MTU_MEASUREMENTS,
  AgentToServerInstantTestResponse.JSON_PROPERTY_NUM_PATH_TRACES,
  AgentToServerInstantTestResponse.JSON_PROPERTY_PATH_TRACE_MODE,
  AgentToServerInstantTestResponse.JSON_PROPERTY_PORT,
  AgentToServerInstantTestResponse.JSON_PROPERTY_PROBE_MODE,
  AgentToServerInstantTestResponse.JSON_PROPERTY_PROTOCOL,
  AgentToServerInstantTestResponse.JSON_PROPERTY_RANDOMIZED_START_TIME,
  AgentToServerInstantTestResponse.JSON_PROPERTY_SERVER,
  AgentToServerInstantTestResponse.JSON_PROPERTY_DSCP,
  AgentToServerInstantTestResponse.JSON_PROPERTY_DSCP_ID,
  AgentToServerInstantTestResponse.JSON_PROPERTY_IPV6_POLICY,
  AgentToServerInstantTestResponse.JSON_PROPERTY_PING_PAYLOAD_SIZE,
  AgentToServerInstantTestResponse.JSON_PROPERTY_NETWORK_MEASUREMENTS,
  AgentToServerInstantTestResponse.JSON_PROPERTY_AGENTS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class AgentToServerInstantTestResponse {
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

  public static final String JSON_PROPERTY_BANDWIDTH_MEASUREMENTS = "bandwidthMeasurements";
  private Boolean bandwidthMeasurements;

  public static final String JSON_PROPERTY_CONTINUOUS_MODE = "continuousMode";
  private Boolean continuousMode;

  public static final String JSON_PROPERTY_FIXED_PACKET_RATE = "fixedPacketRate";
  private Integer fixedPacketRate;

  public static final String JSON_PROPERTY_MTU_MEASUREMENTS = "mtuMeasurements";
  private Boolean mtuMeasurements;

  public static final String JSON_PROPERTY_NUM_PATH_TRACES = "numPathTraces";
  private Integer numPathTraces = 3;

  public static final String JSON_PROPERTY_PATH_TRACE_MODE = "pathTraceMode";
  private TestPathTraceMode pathTraceMode = TestPathTraceMode.CLASSIC;

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port = 49153;

  public static final String JSON_PROPERTY_PROBE_MODE = "probeMode";
  private TestProbeMode probeMode = TestProbeMode.AUTO;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private TestProtocol protocol = TestProtocol.TCP;

  public static final String JSON_PROPERTY_RANDOMIZED_START_TIME = "randomizedStartTime";
  private Boolean randomizedStartTime = false;

  public static final String JSON_PROPERTY_SERVER = "server";
  private String server;

  public static final String JSON_PROPERTY_DSCP = "dscp";
  private String dscp;

  public static final String JSON_PROPERTY_DSCP_ID = "dscpId";
  private TestDscpId dscpId = TestDscpId._0;

  public static final String JSON_PROPERTY_IPV6_POLICY = "ipv6Policy";
  private TestIpv6Policy ipv6Policy = TestIpv6Policy.USE_AGENT_POLICY;

  public static final String JSON_PROPERTY_PING_PAYLOAD_SIZE = "pingPayloadSize";
  private Integer pingPayloadSize;

  public static final String JSON_PROPERTY_NETWORK_MEASUREMENTS = "networkMeasurements";
  private Boolean networkMeasurements = false;

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<AgentResponse> agents = new ArrayList<>();

  public AgentToServerInstantTestResponse() { 
  }

  @JsonCreator
  public AgentToServerInstantTestResponse(
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
    this.labels = labels;
    this.sharedWithAccounts = sharedWithAccounts;
    this.dscp = dscp;
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




  public AgentToServerInstantTestResponse description(String description) {
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




  public AgentToServerInstantTestResponse testName(String testName) {
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




  public AgentToServerInstantTestResponse links(TestLinks links) {
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




  public AgentToServerInstantTestResponse bandwidthMeasurements(Boolean bandwidthMeasurements) {
    this.bandwidthMeasurements = bandwidthMeasurements;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to enable bandwidth measurements, only applies to Enterprise agents assigned to the test.
   * @return bandwidthMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANDWIDTH_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBandwidthMeasurements() {
    return bandwidthMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_BANDWIDTH_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBandwidthMeasurements(Boolean bandwidthMeasurements) {
    this.bandwidthMeasurements = bandwidthMeasurements;
  }


  public AgentToServerInstantTestResponse continuousMode(Boolean continuousMode) {
    this.continuousMode = continuousMode;
    return this;
  }

   /**
   * To enable continuous monitoring, set this parameter to &#x60;true&#x60; to.  When continuous monitoring is enabled, the following actions occur: * &#x60;fixedPacketRate&#x60; is enforced * &#x60;bandwidthMeasurements&#x60; are disabled * If the &#x60;protocol&#x60; is set to &#x60;tcp&#x60;, &#x60;probeMode&#x60; is set to &#x60;syn&#x60;. 
   * @return continuousMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTINUOUS_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContinuousMode() {
    return continuousMode;
  }


  @JsonProperty(JSON_PROPERTY_CONTINUOUS_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContinuousMode(Boolean continuousMode) {
    this.continuousMode = continuousMode;
  }


  public AgentToServerInstantTestResponse fixedPacketRate(Integer fixedPacketRate) {
    this.fixedPacketRate = fixedPacketRate;
    return this;
  }

   /**
   * If continuousMode is &#x60;false&#x60;, set the fixedPacketRate to a value between 10-100. If &#x60;continuousMode&#x60; is &#x60;true&#x60;, set the &#x60;fixedPacketRate&#x60; to &#x60;1&#x60;
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


  public AgentToServerInstantTestResponse mtuMeasurements(Boolean mtuMeasurements) {
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


  public AgentToServerInstantTestResponse numPathTraces(Integer numPathTraces) {
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


  public AgentToServerInstantTestResponse pathTraceMode(TestPathTraceMode pathTraceMode) {
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


  public AgentToServerInstantTestResponse port(Integer port) {
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


  public AgentToServerInstantTestResponse probeMode(TestProbeMode probeMode) {
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


  public AgentToServerInstantTestResponse protocol(TestProtocol protocol) {
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

  public TestProtocol getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(TestProtocol protocol) {
    this.protocol = protocol;
  }


  public AgentToServerInstantTestResponse randomizedStartTime(Boolean randomizedStartTime) {
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


  public AgentToServerInstantTestResponse server(String server) {
    this.server = server;
    return this;
  }

   /**
   * Target name or IP address.
   * @return server
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SERVER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServer() {
    return server;
  }


  @JsonProperty(JSON_PROPERTY_SERVER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServer(String server) {
    this.server = server;
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




  public AgentToServerInstantTestResponse dscpId(TestDscpId dscpId) {
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


  public AgentToServerInstantTestResponse ipv6Policy(TestIpv6Policy ipv6Policy) {
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


  public AgentToServerInstantTestResponse pingPayloadSize(Integer pingPayloadSize) {
    this.pingPayloadSize = pingPayloadSize;
    return this;
  }

   /**
   * Payload size (not total packet size) for the end-to-end metric&#39;s probes, ping payload size allows values from 0 to 1400 bytes. When set to null, payload sizes are 0 bytes for ICMP-based tests and 1 byte for TCP-based tests.
   * minimum: 0
   * maximum: 1400
   * @return pingPayloadSize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PING_PAYLOAD_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPingPayloadSize() {
    return pingPayloadSize;
  }


  @JsonProperty(JSON_PROPERTY_PING_PAYLOAD_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPingPayloadSize(Integer pingPayloadSize) {
    this.pingPayloadSize = pingPayloadSize;
  }


  public AgentToServerInstantTestResponse networkMeasurements(Boolean networkMeasurements) {
    this.networkMeasurements = networkMeasurements;
    return this;
  }

   /**
   * View packet loss in 1-second intervals. This is only available for 1-minute interval tests. Set to &#x60;true&#x60; to enable network measurements.
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


  public AgentToServerInstantTestResponse agents(List<AgentResponse> agents) {
    this.agents = agents;
    return this;
  }

  public AgentToServerInstantTestResponse addAgentsItem(AgentResponse agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * Contains list of agents.
   * @return agents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AgentResponse> getAgents() {
    return agents;
  }


  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgents(List<AgentResponse> agents) {
    this.agents = agents;
  }


  /**
   * Return true if this AgentToServerInstantTestResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentToServerInstantTestResponse agentToServerInstantTestResponse = (AgentToServerInstantTestResponse) o;
    return Objects.equals(this.createdBy, agentToServerInstantTestResponse.createdBy) &&
        Objects.equals(this.createdDate, agentToServerInstantTestResponse.createdDate) &&
        Objects.equals(this.description, agentToServerInstantTestResponse.description) &&
        Objects.equals(this.liveShare, agentToServerInstantTestResponse.liveShare) &&
        Objects.equals(this.modifiedBy, agentToServerInstantTestResponse.modifiedBy) &&
        Objects.equals(this.modifiedDate, agentToServerInstantTestResponse.modifiedDate) &&
        Objects.equals(this.savedEvent, agentToServerInstantTestResponse.savedEvent) &&
        Objects.equals(this.testId, agentToServerInstantTestResponse.testId) &&
        Objects.equals(this.testName, agentToServerInstantTestResponse.testName) &&
        Objects.equals(this.type, agentToServerInstantTestResponse.type) &&
        Objects.equals(this.links, agentToServerInstantTestResponse.links) &&
        Objects.equals(this.labels, agentToServerInstantTestResponse.labels) &&
        Objects.equals(this.sharedWithAccounts, agentToServerInstantTestResponse.sharedWithAccounts) &&
        Objects.equals(this.bandwidthMeasurements, agentToServerInstantTestResponse.bandwidthMeasurements) &&
        Objects.equals(this.continuousMode, agentToServerInstantTestResponse.continuousMode) &&
        Objects.equals(this.fixedPacketRate, agentToServerInstantTestResponse.fixedPacketRate) &&
        Objects.equals(this.mtuMeasurements, agentToServerInstantTestResponse.mtuMeasurements) &&
        Objects.equals(this.numPathTraces, agentToServerInstantTestResponse.numPathTraces) &&
        Objects.equals(this.pathTraceMode, agentToServerInstantTestResponse.pathTraceMode) &&
        Objects.equals(this.port, agentToServerInstantTestResponse.port) &&
        Objects.equals(this.probeMode, agentToServerInstantTestResponse.probeMode) &&
        Objects.equals(this.protocol, agentToServerInstantTestResponse.protocol) &&
        Objects.equals(this.randomizedStartTime, agentToServerInstantTestResponse.randomizedStartTime) &&
        Objects.equals(this.server, agentToServerInstantTestResponse.server) &&
        Objects.equals(this.dscp, agentToServerInstantTestResponse.dscp) &&
        Objects.equals(this.dscpId, agentToServerInstantTestResponse.dscpId) &&
        Objects.equals(this.ipv6Policy, agentToServerInstantTestResponse.ipv6Policy) &&
        Objects.equals(this.pingPayloadSize, agentToServerInstantTestResponse.pingPayloadSize) &&
        Objects.equals(this.networkMeasurements, agentToServerInstantTestResponse.networkMeasurements) &&
        Objects.equals(this.agents, agentToServerInstantTestResponse.agents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, labels, sharedWithAccounts, bandwidthMeasurements, continuousMode, fixedPacketRate, mtuMeasurements, numPathTraces, pathTraceMode, port, probeMode, protocol, randomizedStartTime, server, dscp, dscpId, ipv6Policy, pingPayloadSize, networkMeasurements, agents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentToServerInstantTestResponse {\n");
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
    sb.append("    bandwidthMeasurements: ").append(toIndentedString(bandwidthMeasurements)).append("\n");
    sb.append("    continuousMode: ").append(toIndentedString(continuousMode)).append("\n");
    sb.append("    fixedPacketRate: ").append(toIndentedString(fixedPacketRate)).append("\n");
    sb.append("    mtuMeasurements: ").append(toIndentedString(mtuMeasurements)).append("\n");
    sb.append("    numPathTraces: ").append(toIndentedString(numPathTraces)).append("\n");
    sb.append("    pathTraceMode: ").append(toIndentedString(pathTraceMode)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    probeMode: ").append(toIndentedString(probeMode)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    randomizedStartTime: ").append(toIndentedString(randomizedStartTime)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    dscp: ").append(toIndentedString(dscp)).append("\n");
    sb.append("    dscpId: ").append(toIndentedString(dscpId)).append("\n");
    sb.append("    ipv6Policy: ").append(toIndentedString(ipv6Policy)).append("\n");
    sb.append("    pingPayloadSize: ").append(toIndentedString(pingPayloadSize)).append("\n");
    sb.append("    networkMeasurements: ").append(toIndentedString(networkMeasurements)).append("\n");
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

