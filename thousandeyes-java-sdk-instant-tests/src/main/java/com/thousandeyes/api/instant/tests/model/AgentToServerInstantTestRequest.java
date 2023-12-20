/*
 * Instant Tests API
 *  ### Overview The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.instant.tests.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.instant.tests.model.InstantTestRequestAgentsInner;
import com.thousandeyes.api.instant.tests.model.TestDscpId;
import com.thousandeyes.api.instant.tests.model.TestIpv6Policy;
import com.thousandeyes.api.instant.tests.model.TestPathTraceMode;
import com.thousandeyes.api.instant.tests.model.TestProbeMode;
import com.thousandeyes.api.instant.tests.model.TestProtocol;
import com.thousandeyes.api.instant.tests.model.UnexpandedInstantTestLinks;
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

import com.thousandeyes.api.instant.JSON;

/**
 * AgentToServerInstantTestRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:05.783040Z[Europe/Lisbon]")
public class AgentToServerInstantTestRequest {
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
  private List<String> labels;

  public static final String SERIALIZED_NAME_SHARED_WITH_ACCOUNTS = "sharedWithAccounts";
  @SerializedName(SERIALIZED_NAME_SHARED_WITH_ACCOUNTS)
  private List<String> sharedWithAccounts;

  public static final String SERIALIZED_NAME_AGENTS = "agents";
  @SerializedName(SERIALIZED_NAME_AGENTS)
  private List<InstantTestRequestAgentsInner> agents = new ArrayList<>();

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

  public AgentToServerInstantTestRequest() {
  }

  
  public AgentToServerInstantTestRequest(
     String createdBy, 
     OffsetDateTime createdDate, 
     Boolean liveShare, 
     String modifiedBy, 
     OffsetDateTime modifiedDate, 
     Boolean savedEvent, 
     String testId, 
     String type, 
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




  public AgentToServerInstantTestRequest description(String description) {
    
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




  public AgentToServerInstantTestRequest testName(String testName) {
    
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




  public AgentToServerInstantTestRequest links(UnexpandedInstantTestLinks links) {
    
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


  public AgentToServerInstantTestRequest labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public AgentToServerInstantTestRequest addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * A list of test label identifiers (get &#x60;labelId&#x60; from &#x60;/labels&#x60; endpoint).
   * @return labels
  **/
  @javax.annotation.Nullable
  public List<String> getLabels() {
    return labels;
  }


  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public AgentToServerInstantTestRequest sharedWithAccounts(List<String> sharedWithAccounts) {
    
    this.sharedWithAccounts = sharedWithAccounts;
    return this;
  }

  public AgentToServerInstantTestRequest addSharedWithAccountsItem(String sharedWithAccountsItem) {
    if (this.sharedWithAccounts == null) {
      this.sharedWithAccounts = new ArrayList<>();
    }
    this.sharedWithAccounts.add(sharedWithAccountsItem);
    return this;
  }

   /**
   * A list of account group identifiers that the test is shared with (get &#x60;aid&#x60; from &#x60;/account-groups&#x60; endpoint).
   * @return sharedWithAccounts
  **/
  @javax.annotation.Nullable
  public List<String> getSharedWithAccounts() {
    return sharedWithAccounts;
  }


  public void setSharedWithAccounts(List<String> sharedWithAccounts) {
    this.sharedWithAccounts = sharedWithAccounts;
  }


  public AgentToServerInstantTestRequest agents(List<InstantTestRequestAgentsInner> agents) {
    
    this.agents = agents;
    return this;
  }

  public AgentToServerInstantTestRequest addAgentsItem(InstantTestRequestAgentsInner agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * A list of objects with &#x60;agentId&#x60; (required) and &#x60;sourceIpAddress&#x60; (optional).
   * @return agents
  **/
  @javax.annotation.Nonnull
  public List<InstantTestRequestAgentsInner> getAgents() {
    return agents;
  }


  public void setAgents(List<InstantTestRequestAgentsInner> agents) {
    this.agents = agents;
  }


  public AgentToServerInstantTestRequest bandwidthMeasurements(Boolean bandwidthMeasurements) {
    
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


  public AgentToServerInstantTestRequest continuousMode(Boolean continuousMode) {
    
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


  public AgentToServerInstantTestRequest fixedPacketRate(Integer fixedPacketRate) {
    
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


  public AgentToServerInstantTestRequest mtuMeasurements(Boolean mtuMeasurements) {
    
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


  public AgentToServerInstantTestRequest numPathTraces(Integer numPathTraces) {
    
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


  public AgentToServerInstantTestRequest pathTraceMode(TestPathTraceMode pathTraceMode) {
    
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


  public AgentToServerInstantTestRequest port(Integer port) {
    
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


  public AgentToServerInstantTestRequest probeMode(TestProbeMode probeMode) {
    
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


  public AgentToServerInstantTestRequest protocol(TestProtocol protocol) {
    
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


  public AgentToServerInstantTestRequest server(String server) {
    
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




  public AgentToServerInstantTestRequest dscpId(TestDscpId dscpId) {
    
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


  public AgentToServerInstantTestRequest ipv6Policy(TestIpv6Policy ipv6Policy) {
    
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


  public AgentToServerInstantTestRequest pingPayloadSize(Integer pingPayloadSize) {
    
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


  public AgentToServerInstantTestRequest networkMeasurements(Boolean networkMeasurements) {
    
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
    AgentToServerInstantTestRequest agentToServerInstantTestRequest = (AgentToServerInstantTestRequest) o;
    return Objects.equals(this.createdBy, agentToServerInstantTestRequest.createdBy) &&
        Objects.equals(this.createdDate, agentToServerInstantTestRequest.createdDate) &&
        Objects.equals(this.description, agentToServerInstantTestRequest.description) &&
        Objects.equals(this.liveShare, agentToServerInstantTestRequest.liveShare) &&
        Objects.equals(this.modifiedBy, agentToServerInstantTestRequest.modifiedBy) &&
        Objects.equals(this.modifiedDate, agentToServerInstantTestRequest.modifiedDate) &&
        Objects.equals(this.savedEvent, agentToServerInstantTestRequest.savedEvent) &&
        Objects.equals(this.testId, agentToServerInstantTestRequest.testId) &&
        Objects.equals(this.testName, agentToServerInstantTestRequest.testName) &&
        Objects.equals(this.type, agentToServerInstantTestRequest.type) &&
        Objects.equals(this.links, agentToServerInstantTestRequest.links) &&
        Objects.equals(this.labels, agentToServerInstantTestRequest.labels) &&
        Objects.equals(this.sharedWithAccounts, agentToServerInstantTestRequest.sharedWithAccounts) &&
        Objects.equals(this.agents, agentToServerInstantTestRequest.agents) &&
        Objects.equals(this.bandwidthMeasurements, agentToServerInstantTestRequest.bandwidthMeasurements) &&
        Objects.equals(this.continuousMode, agentToServerInstantTestRequest.continuousMode) &&
        Objects.equals(this.fixedPacketRate, agentToServerInstantTestRequest.fixedPacketRate) &&
        Objects.equals(this.mtuMeasurements, agentToServerInstantTestRequest.mtuMeasurements) &&
        Objects.equals(this.numPathTraces, agentToServerInstantTestRequest.numPathTraces) &&
        Objects.equals(this.pathTraceMode, agentToServerInstantTestRequest.pathTraceMode) &&
        Objects.equals(this.port, agentToServerInstantTestRequest.port) &&
        Objects.equals(this.probeMode, agentToServerInstantTestRequest.probeMode) &&
        Objects.equals(this.protocol, agentToServerInstantTestRequest.protocol) &&
        Objects.equals(this.server, agentToServerInstantTestRequest.server) &&
        Objects.equals(this.dscp, agentToServerInstantTestRequest.dscp) &&
        Objects.equals(this.dscpId, agentToServerInstantTestRequest.dscpId) &&
        Objects.equals(this.ipv6Policy, agentToServerInstantTestRequest.ipv6Policy) &&
        Objects.equals(this.pingPayloadSize, agentToServerInstantTestRequest.pingPayloadSize) &&
        Objects.equals(this.networkMeasurements, agentToServerInstantTestRequest.networkMeasurements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, labels, sharedWithAccounts, agents, bandwidthMeasurements, continuousMode, fixedPacketRate, mtuMeasurements, numPathTraces, pathTraceMode, port, probeMode, protocol, server, dscp, dscpId, ipv6Policy, pingPayloadSize, networkMeasurements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentToServerInstantTestRequest {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to AgentToServerInstantTestRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AgentToServerInstantTestRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgentToServerInstantTestRequest is not found in the empty JSON string", AgentToServerInstantTestRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AgentToServerInstantTestRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AgentToServerInstantTestRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AgentToServerInstantTestRequest.openapiRequiredFields) {
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonNull() && !jsonObj.get("labels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sharedWithAccounts") != null && !jsonObj.get("sharedWithAccounts").isJsonNull() && !jsonObj.get("sharedWithAccounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedWithAccounts` to be an array in the JSON string but got `%s`", jsonObj.get("sharedWithAccounts").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("agents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `agents` to be an array in the JSON string but got `%s`", jsonObj.get("agents").toString()));
      }

      JsonArray jsonArrayagents = jsonObj.getAsJsonArray("agents");
      // validate the required field `agents` (array)
      for (int i = 0; i < jsonArrayagents.size(); i++) {
        InstantTestRequestAgentsInner.validateJsonElement(jsonArrayagents.get(i));
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
       if (!AgentToServerInstantTestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentToServerInstantTestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentToServerInstantTestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentToServerInstantTestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentToServerInstantTestRequest>() {
           @Override
           public void write(JsonWriter out, AgentToServerInstantTestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentToServerInstantTestRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentToServerInstantTestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentToServerInstantTestRequest
  * @throws IOException if the JSON string is invalid with respect to AgentToServerInstantTestRequest
  */
  public static AgentToServerInstantTestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentToServerInstantTestRequest.class);
  }

 /**
  * Convert an instance of AgentToServerInstantTestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

