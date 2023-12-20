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
import com.thousandeyes.api.tests.model.TestDscpId;
import com.thousandeyes.api.tests.model.TestIpv6Policy;
import com.thousandeyes.api.tests.model.TestLabelsInner;
import com.thousandeyes.api.tests.model.TestPathTraceMode;
import com.thousandeyes.api.tests.model.TestProbeMode;
import com.thousandeyes.api.tests.model.TestProtocol;
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
 * AgentToServerInstantTest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-18T17:52:56.680950Z[Europe/Lisbon]")
public class AgentToServerInstantTest {
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

  public static final String SERIALIZED_NAME_BANDWIDTH_MEASUREMENTS = "bandwidthMeasurements";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH_MEASUREMENTS)
  private Boolean bandwidthMeasurements;

  public static final String SERIALIZED_NAME_CONTINUOUS_MODE = "continuousMode";
  @SerializedName(SERIALIZED_NAME_CONTINUOUS_MODE)
  private Boolean continuousMode;

  public static final String SERIALIZED_NAME_FIXED_PACKET_RATE = "fixedPacketRate";
  @SerializedName(SERIALIZED_NAME_FIXED_PACKET_RATE)
  private Integer fixedPacketRate;

  public static final String SERIALIZED_NAME_MTU_MEASUREMENTS = "mtuMeasurements";
  @SerializedName(SERIALIZED_NAME_MTU_MEASUREMENTS)
  private Boolean mtuMeasurements;

  public static final String SERIALIZED_NAME_NUM_PATH_TRACES = "numPathTraces";
  @SerializedName(SERIALIZED_NAME_NUM_PATH_TRACES)
  private Integer numPathTraces = 3;

  public static final String SERIALIZED_NAME_PATH_TRACE_MODE = "pathTraceMode";
  @SerializedName(SERIALIZED_NAME_PATH_TRACE_MODE)
  private TestPathTraceMode pathTraceMode = TestPathTraceMode.CLASSIC;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port = 49153;

  public static final String SERIALIZED_NAME_PROBE_MODE = "probeMode";
  @SerializedName(SERIALIZED_NAME_PROBE_MODE)
  private TestProbeMode probeMode = TestProbeMode.AUTO;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private TestProtocol protocol = TestProtocol.TCP;

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public static final String SERIALIZED_NAME_DSCP = "dscp";
  @SerializedName(SERIALIZED_NAME_DSCP)
  private String dscp;

  public static final String SERIALIZED_NAME_DSCP_ID = "dscpId";
  @SerializedName(SERIALIZED_NAME_DSCP_ID)
  private TestDscpId dscpId = TestDscpId._0;

  public static final String SERIALIZED_NAME_IPV6_POLICY = "ipv6Policy";
  @SerializedName(SERIALIZED_NAME_IPV6_POLICY)
  private TestIpv6Policy ipv6Policy = TestIpv6Policy.USE_AGENT_POLICY;

  public static final String SERIALIZED_NAME_PING_PAYLOAD_SIZE = "pingPayloadSize";
  @SerializedName(SERIALIZED_NAME_PING_PAYLOAD_SIZE)
  private Integer pingPayloadSize;

  public static final String SERIALIZED_NAME_NETWORK_MEASUREMENTS = "networkMeasurements";
  @SerializedName(SERIALIZED_NAME_NETWORK_MEASUREMENTS)
  private Boolean networkMeasurements = false;

  public AgentToServerInstantTest() {
  }

  
  public AgentToServerInstantTest(
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
     String dscp
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




  public AgentToServerInstantTest description(String description) {
    
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




  public AgentToServerInstantTest testName(String testName) {
    
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




  public AgentToServerInstantTest links(UnexpandedInstantTestLinks links) {
    
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




  public AgentToServerInstantTest bandwidthMeasurements(Boolean bandwidthMeasurements) {
    
    this.bandwidthMeasurements = bandwidthMeasurements;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to enable bandwidth measurements, only applies to Enterprise agents assigned to the test.
   * @return bandwidthMeasurements
  **/
  @javax.annotation.Nullable
  public Boolean getBandwidthMeasurements() {
    return bandwidthMeasurements;
  }


  public void setBandwidthMeasurements(Boolean bandwidthMeasurements) {
    this.bandwidthMeasurements = bandwidthMeasurements;
  }


  public AgentToServerInstantTest continuousMode(Boolean continuousMode) {
    
    this.continuousMode = continuousMode;
    return this;
  }

   /**
   * To enable continuous monitoring, set this parameter to &#x60;true&#x60; to.  When continuous monitoring is enabled, the following actions occur: * &#x60;fixedPacketRate&#x60; is enforced * &#x60;bandwidthMeasurements&#x60; are disabled * If the &#x60;protocol&#x60; is set to &#x60;tcp&#x60;, &#x60;probeMode&#x60; is set to &#x60;syn&#x60;. 
   * @return continuousMode
  **/
  @javax.annotation.Nullable
  public Boolean getContinuousMode() {
    return continuousMode;
  }


  public void setContinuousMode(Boolean continuousMode) {
    this.continuousMode = continuousMode;
  }


  public AgentToServerInstantTest fixedPacketRate(Integer fixedPacketRate) {
    
    this.fixedPacketRate = fixedPacketRate;
    return this;
  }

   /**
   * If continuousMode is &#x60;false&#x60;, set the fixedPacketRate to a value between 10-100. If &#x60;continuousMode&#x60; is &#x60;true&#x60;, set the &#x60;fixedPacketRate&#x60; to &#x60;1&#x60;
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


  public AgentToServerInstantTest mtuMeasurements(Boolean mtuMeasurements) {
    
    this.mtuMeasurements = mtuMeasurements;
    return this;
  }

   /**
   * Set &#x60;true&#x60; to measure MTU sizes on network from agents to the target.
   * @return mtuMeasurements
  **/
  @javax.annotation.Nullable
  public Boolean getMtuMeasurements() {
    return mtuMeasurements;
  }


  public void setMtuMeasurements(Boolean mtuMeasurements) {
    this.mtuMeasurements = mtuMeasurements;
  }


  public AgentToServerInstantTest numPathTraces(Integer numPathTraces) {
    
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


  public AgentToServerInstantTest pathTraceMode(TestPathTraceMode pathTraceMode) {
    
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


  public AgentToServerInstantTest port(Integer port) {
    
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


  public AgentToServerInstantTest probeMode(TestProbeMode probeMode) {
    
    this.probeMode = probeMode;
    return this;
  }

   /**
   * Get probeMode
   * @return probeMode
  **/
  @javax.annotation.Nullable
  public TestProbeMode getProbeMode() {
    return probeMode;
  }


  public void setProbeMode(TestProbeMode probeMode) {
    this.probeMode = probeMode;
  }


  public AgentToServerInstantTest protocol(TestProtocol protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  public TestProtocol getProtocol() {
    return protocol;
  }


  public void setProtocol(TestProtocol protocol) {
    this.protocol = protocol;
  }


  public AgentToServerInstantTest server(String server) {
    
    this.server = server;
    return this;
  }

   /**
   * Target name or IP address.
   * @return server
  **/
  @javax.annotation.Nonnull
  public String getServer() {
    return server;
  }


  public void setServer(String server) {
    this.server = server;
  }


   /**
   * DSCP label.
   * @return dscp
  **/
  @javax.annotation.Nullable
  public String getDscp() {
    return dscp;
  }




  public AgentToServerInstantTest dscpId(TestDscpId dscpId) {
    
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


  public AgentToServerInstantTest ipv6Policy(TestIpv6Policy ipv6Policy) {
    
    this.ipv6Policy = ipv6Policy;
    return this;
  }

   /**
   * Get ipv6Policy
   * @return ipv6Policy
  **/
  @javax.annotation.Nullable
  public TestIpv6Policy getIpv6Policy() {
    return ipv6Policy;
  }


  public void setIpv6Policy(TestIpv6Policy ipv6Policy) {
    this.ipv6Policy = ipv6Policy;
  }


  public AgentToServerInstantTest pingPayloadSize(Integer pingPayloadSize) {
    
    this.pingPayloadSize = pingPayloadSize;
    return this;
  }

   /**
   * Payload size (not total packet size) for the end-to-end metric&#39;s probes, ping payload size allows values from 0 to 1400 bytes. When set to null, payload sizes are 0 bytes for ICMP-based tests and 1 byte for TCP-based tests.
   * minimum: 0
   * maximum: 1400
   * @return pingPayloadSize
  **/
  @javax.annotation.Nullable
  public Integer getPingPayloadSize() {
    return pingPayloadSize;
  }


  public void setPingPayloadSize(Integer pingPayloadSize) {
    this.pingPayloadSize = pingPayloadSize;
  }


  public AgentToServerInstantTest networkMeasurements(Boolean networkMeasurements) {
    
    this.networkMeasurements = networkMeasurements;
    return this;
  }

   /**
   * View packet loss in 1-second intervals. This is only available for 1-minute interval tests. Set to &#x60;true&#x60; to enable network measurements.
   * @return networkMeasurements
  **/
  @javax.annotation.Nullable
  public Boolean getNetworkMeasurements() {
    return networkMeasurements;
  }


  public void setNetworkMeasurements(Boolean networkMeasurements) {
    this.networkMeasurements = networkMeasurements;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentToServerInstantTest agentToServerInstantTest = (AgentToServerInstantTest) o;
    return Objects.equals(this.createdBy, agentToServerInstantTest.createdBy) &&
        Objects.equals(this.createdDate, agentToServerInstantTest.createdDate) &&
        Objects.equals(this.description, agentToServerInstantTest.description) &&
        Objects.equals(this.liveShare, agentToServerInstantTest.liveShare) &&
        Objects.equals(this.modifiedBy, agentToServerInstantTest.modifiedBy) &&
        Objects.equals(this.modifiedDate, agentToServerInstantTest.modifiedDate) &&
        Objects.equals(this.savedEvent, agentToServerInstantTest.savedEvent) &&
        Objects.equals(this.testId, agentToServerInstantTest.testId) &&
        Objects.equals(this.testName, agentToServerInstantTest.testName) &&
        Objects.equals(this.type, agentToServerInstantTest.type) &&
        Objects.equals(this.links, agentToServerInstantTest.links) &&
        Objects.equals(this.labels, agentToServerInstantTest.labels) &&
        Objects.equals(this.sharedWithAccounts, agentToServerInstantTest.sharedWithAccounts) &&
        Objects.equals(this.agents, agentToServerInstantTest.agents) &&
        Objects.equals(this.bandwidthMeasurements, agentToServerInstantTest.bandwidthMeasurements) &&
        Objects.equals(this.continuousMode, agentToServerInstantTest.continuousMode) &&
        Objects.equals(this.fixedPacketRate, agentToServerInstantTest.fixedPacketRate) &&
        Objects.equals(this.mtuMeasurements, agentToServerInstantTest.mtuMeasurements) &&
        Objects.equals(this.numPathTraces, agentToServerInstantTest.numPathTraces) &&
        Objects.equals(this.pathTraceMode, agentToServerInstantTest.pathTraceMode) &&
        Objects.equals(this.port, agentToServerInstantTest.port) &&
        Objects.equals(this.probeMode, agentToServerInstantTest.probeMode) &&
        Objects.equals(this.protocol, agentToServerInstantTest.protocol) &&
        Objects.equals(this.server, agentToServerInstantTest.server) &&
        Objects.equals(this.dscp, agentToServerInstantTest.dscp) &&
        Objects.equals(this.dscpId, agentToServerInstantTest.dscpId) &&
        Objects.equals(this.ipv6Policy, agentToServerInstantTest.ipv6Policy) &&
        Objects.equals(this.pingPayloadSize, agentToServerInstantTest.pingPayloadSize) &&
        Objects.equals(this.networkMeasurements, agentToServerInstantTest.networkMeasurements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, labels, sharedWithAccounts, agents, bandwidthMeasurements, continuousMode, fixedPacketRate, mtuMeasurements, numPathTraces, pathTraceMode, port, probeMode, protocol, server, dscp, dscpId, ipv6Policy, pingPayloadSize, networkMeasurements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentToServerInstantTest {\n");
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
    sb.append("    bandwidthMeasurements: ").append(toIndentedString(bandwidthMeasurements)).append("\n");
    sb.append("    continuousMode: ").append(toIndentedString(continuousMode)).append("\n");
    sb.append("    fixedPacketRate: ").append(toIndentedString(fixedPacketRate)).append("\n");
    sb.append("    mtuMeasurements: ").append(toIndentedString(mtuMeasurements)).append("\n");
    sb.append("    numPathTraces: ").append(toIndentedString(numPathTraces)).append("\n");
    sb.append("    pathTraceMode: ").append(toIndentedString(pathTraceMode)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    probeMode: ").append(toIndentedString(probeMode)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    dscp: ").append(toIndentedString(dscp)).append("\n");
    sb.append("    dscpId: ").append(toIndentedString(dscpId)).append("\n");
    sb.append("    ipv6Policy: ").append(toIndentedString(ipv6Policy)).append("\n");
    sb.append("    pingPayloadSize: ").append(toIndentedString(pingPayloadSize)).append("\n");
    sb.append("    networkMeasurements: ").append(toIndentedString(networkMeasurements)).append("\n");
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
    openapiFields.add("bandwidthMeasurements");
    openapiFields.add("continuousMode");
    openapiFields.add("fixedPacketRate");
    openapiFields.add("mtuMeasurements");
    openapiFields.add("numPathTraces");
    openapiFields.add("pathTraceMode");
    openapiFields.add("port");
    openapiFields.add("probeMode");
    openapiFields.add("protocol");
    openapiFields.add("server");
    openapiFields.add("dscp");
    openapiFields.add("dscpId");
    openapiFields.add("ipv6Policy");
    openapiFields.add("pingPayloadSize");
    openapiFields.add("networkMeasurements");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agents");
    openapiRequiredFields.add("server");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AgentToServerInstantTest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AgentToServerInstantTest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgentToServerInstantTest is not found in the empty JSON string", AgentToServerInstantTest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AgentToServerInstantTest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AgentToServerInstantTest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AgentToServerInstantTest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      // validate the optional field `pathTraceMode`
      if (jsonObj.get("pathTraceMode") != null && !jsonObj.get("pathTraceMode").isJsonNull()) {
        TestPathTraceMode.validateJsonElement(jsonObj.get("pathTraceMode"));
      }
      // validate the optional field `probeMode`
      if (jsonObj.get("probeMode") != null && !jsonObj.get("probeMode").isJsonNull()) {
        TestProbeMode.validateJsonElement(jsonObj.get("probeMode"));
      }
      // validate the optional field `protocol`
      if (jsonObj.get("protocol") != null && !jsonObj.get("protocol").isJsonNull()) {
        TestProtocol.validateJsonElement(jsonObj.get("protocol"));
      }
      if (!jsonObj.get("server").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server").toString()));
      }
      if ((jsonObj.get("dscp") != null && !jsonObj.get("dscp").isJsonNull()) && !jsonObj.get("dscp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dscp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dscp").toString()));
      }
      // validate the optional field `dscpId`
      if (jsonObj.get("dscpId") != null && !jsonObj.get("dscpId").isJsonNull()) {
        TestDscpId.validateJsonElement(jsonObj.get("dscpId"));
      }
      // validate the optional field `ipv6Policy`
      if (jsonObj.get("ipv6Policy") != null && !jsonObj.get("ipv6Policy").isJsonNull()) {
        TestIpv6Policy.validateJsonElement(jsonObj.get("ipv6Policy"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentToServerInstantTest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentToServerInstantTest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentToServerInstantTest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentToServerInstantTest.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentToServerInstantTest>() {
           @Override
           public void write(JsonWriter out, AgentToServerInstantTest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentToServerInstantTest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentToServerInstantTest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentToServerInstantTest
  * @throws IOException if the JSON string is invalid with respect to AgentToServerInstantTest
  */
  public static AgentToServerInstantTest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentToServerInstantTest.class);
  }

 /**
  * Convert an instance of AgentToServerInstantTest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

