/*
 * Endpoint Tests API
 *  Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.endpoint.tests.model.EndpointAgentSelectorConfig;
import com.thousandeyes.sdk.endpoint.tests.model.EndpointIpVersionTemplate;
import com.thousandeyes.sdk.endpoint.tests.model.EndpointTestLinks;
import com.thousandeyes.sdk.endpoint.tests.model.EndpointTestProtocol;
import com.thousandeyes.sdk.endpoint.tests.model.TestInterval;
import com.thousandeyes.sdk.endpoint.tests.model.TestLabel;
import com.thousandeyes.sdk.endpoint.tests.model.TestProbeModeResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointAgentToServerTest
 */
@JsonPropertyOrder({
  EndpointAgentToServerTest.JSON_PROPERTY_AID,
  EndpointAgentToServerTest.JSON_PROPERTY_LINKS,
  EndpointAgentToServerTest.JSON_PROPERTY_AGENT_SELECTOR_CONFIG,
  EndpointAgentToServerTest.JSON_PROPERTY_CREATED_DATE,
  EndpointAgentToServerTest.JSON_PROPERTY_INTERVAL,
  EndpointAgentToServerTest.JSON_PROPERTY_IS_ENABLED,
  EndpointAgentToServerTest.JSON_PROPERTY_IS_SAVED_EVENT,
  EndpointAgentToServerTest.JSON_PROPERTY_HAS_PATH_TRACE_IN_SESSION,
  EndpointAgentToServerTest.JSON_PROPERTY_MODIFIED_DATE,
  EndpointAgentToServerTest.JSON_PROPERTY_NETWORK_MEASUREMENTS,
  EndpointAgentToServerTest.JSON_PROPERTY_PROTOCOL,
  EndpointAgentToServerTest.JSON_PROPERTY_IP_VERSION,
  EndpointAgentToServerTest.JSON_PROPERTY_SERVER,
  EndpointAgentToServerTest.JSON_PROPERTY_TEST_ID,
  EndpointAgentToServerTest.JSON_PROPERTY_TEST_NAME,
  EndpointAgentToServerTest.JSON_PROPERTY_TYPE,
  EndpointAgentToServerTest.JSON_PROPERTY_TCP_PROBE_MODE,
  EndpointAgentToServerTest.JSON_PROPERTY_PORT,
  EndpointAgentToServerTest.JSON_PROPERTY_LABELS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EndpointAgentToServerTest {
  public static final String JSON_PROPERTY_AID = "aid";
  private String aid;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private EndpointTestLinks links;

  public static final String JSON_PROPERTY_AGENT_SELECTOR_CONFIG = "agentSelectorConfig";
  private EndpointAgentSelectorConfig agentSelectorConfig;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private OffsetDateTime createdDate;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private TestInterval interval = TestInterval.NUMBER_60;

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  private Boolean isEnabled = true;

  public static final String JSON_PROPERTY_IS_SAVED_EVENT = "isSavedEvent";
  private Boolean isSavedEvent;

  public static final String JSON_PROPERTY_HAS_PATH_TRACE_IN_SESSION = "hasPathTraceInSession";
  private Boolean hasPathTraceInSession;

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private OffsetDateTime modifiedDate;

  public static final String JSON_PROPERTY_NETWORK_MEASUREMENTS = "networkMeasurements";
  private Boolean networkMeasurements = true;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private EndpointTestProtocol protocol = EndpointTestProtocol.ICMP;

  public static final String JSON_PROPERTY_IP_VERSION = "ipVersion";
  private EndpointIpVersionTemplate ipVersion;

  public static final String JSON_PROPERTY_SERVER = "server";
  private String server;

  public static final String JSON_PROPERTY_TEST_ID = "testId";
  private String testId;

  public static final String JSON_PROPERTY_TEST_NAME = "testName";
  private String testName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_TCP_PROBE_MODE = "tcpProbeMode";
  private TestProbeModeResponse tcpProbeMode = TestProbeModeResponse.AUTO;

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port = 443;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<TestLabel> labels = new ArrayList<>();

  public EndpointAgentToServerTest() { 
  }

  @JsonCreator
  public EndpointAgentToServerTest(
    @JsonProperty(JSON_PROPERTY_CREATED_DATE) OffsetDateTime createdDate, 
    @JsonProperty(JSON_PROPERTY_IS_SAVED_EVENT) Boolean isSavedEvent, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_DATE) OffsetDateTime modifiedDate, 
    @JsonProperty(JSON_PROPERTY_TEST_ID) String testId, 
    @JsonProperty(JSON_PROPERTY_TYPE) String type, 
    @JsonProperty(JSON_PROPERTY_LABELS) List<TestLabel> labels
  ) {
  this();
    this.createdDate = createdDate;
    this.isSavedEvent = isSavedEvent;
    this.modifiedDate = modifiedDate;
    this.testId = testId;
    this.type = type;
    this.labels = labels;
  }

  public EndpointAgentToServerTest aid(String aid) {
    this.aid = aid;
    return this;
  }

   /**
   * A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint.
   * @return aid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAid() {
    return aid;
  }


  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAid(String aid) {
    this.aid = aid;
  }


  public EndpointAgentToServerTest links(EndpointTestLinks links) {
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

  public EndpointTestLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(EndpointTestLinks links) {
    this.links = links;
  }


  public EndpointAgentToServerTest agentSelectorConfig(EndpointAgentSelectorConfig agentSelectorConfig) {
    this.agentSelectorConfig = agentSelectorConfig;
    return this;
  }

   /**
   * Get agentSelectorConfig
   * @return agentSelectorConfig
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_SELECTOR_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointAgentSelectorConfig getAgentSelectorConfig() {
    return agentSelectorConfig;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_SELECTOR_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentSelectorConfig(EndpointAgentSelectorConfig agentSelectorConfig) {
    this.agentSelectorConfig = agentSelectorConfig;
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




  public EndpointAgentToServerTest interval(TestInterval interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestInterval getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterval(TestInterval interval) {
    this.interval = interval;
  }


  public EndpointAgentToServerTest isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Indicates if test is enabled.
   * @return isEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


   /**
   * Indicates if the test is a saved event.
   * @return isSavedEvent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_SAVED_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsSavedEvent() {
    return isSavedEvent;
  }




  public EndpointAgentToServerTest hasPathTraceInSession(Boolean hasPathTraceInSession) {
    this.hasPathTraceInSession = hasPathTraceInSession;
    return this;
  }

   /**
   * Enables \&quot;in session\&quot; path trace. When enabled, this option initiates a TCP session with the target server and sends path trace packets within the established TCP session.
   * @return hasPathTraceInSession
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_PATH_TRACE_IN_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasPathTraceInSession() {
    return hasPathTraceInSession;
  }


  @JsonProperty(JSON_PROPERTY_HAS_PATH_TRACE_IN_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasPathTraceInSession(Boolean hasPathTraceInSession) {
    this.hasPathTraceInSession = hasPathTraceInSession;
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




  public EndpointAgentToServerTest networkMeasurements(Boolean networkMeasurements) {
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


  public EndpointAgentToServerTest protocol(EndpointTestProtocol protocol) {
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

  public EndpointTestProtocol getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(EndpointTestProtocol protocol) {
    this.protocol = protocol;
  }


  public EndpointAgentToServerTest ipVersion(EndpointIpVersionTemplate ipVersion) {
    this.ipVersion = ipVersion;
    return this;
  }

   /**
   * Get ipVersion
   * @return ipVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointIpVersionTemplate getIpVersion() {
    return ipVersion;
  }


  @JsonProperty(JSON_PROPERTY_IP_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpVersion(EndpointIpVersionTemplate ipVersion) {
    this.ipVersion = ipVersion;
  }


  public EndpointAgentToServerTest server(String server) {
    this.server = server;
    return this;
  }

   /**
   * Target domain name or IP address.
   * @return server
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServer() {
    return server;
  }


  @JsonProperty(JSON_PROPERTY_SERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServer(String server) {
    this.server = server;
  }


   /**
   * Each test is assigned a unique ID to access test data from other endpoints.
   * @return testId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestId() {
    return testId;
  }




  public EndpointAgentToServerTest testName(String testName) {
    this.testName = testName;
    return this;
  }

   /**
   * Name of the test.
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
   * Type of test being queried.
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }




  public EndpointAgentToServerTest tcpProbeMode(TestProbeModeResponse tcpProbeMode) {
    this.tcpProbeMode = tcpProbeMode;
    return this;
  }

   /**
   * Get tcpProbeMode
   * @return tcpProbeMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestProbeModeResponse getTcpProbeMode() {
    return tcpProbeMode;
  }


  @JsonProperty(JSON_PROPERTY_TCP_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTcpProbeMode(TestProbeModeResponse tcpProbeMode) {
    this.tcpProbeMode = tcpProbeMode;
  }


  public EndpointAgentToServerTest port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Port number.
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
   * Return true if this EndpointAgentToServerTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgentToServerTest endpointAgentToServerTest = (EndpointAgentToServerTest) o;
    return Objects.equals(this.aid, endpointAgentToServerTest.aid) &&
        Objects.equals(this.links, endpointAgentToServerTest.links) &&
        Objects.equals(this.agentSelectorConfig, endpointAgentToServerTest.agentSelectorConfig) &&
        Objects.equals(this.createdDate, endpointAgentToServerTest.createdDate) &&
        Objects.equals(this.interval, endpointAgentToServerTest.interval) &&
        Objects.equals(this.isEnabled, endpointAgentToServerTest.isEnabled) &&
        Objects.equals(this.isSavedEvent, endpointAgentToServerTest.isSavedEvent) &&
        Objects.equals(this.hasPathTraceInSession, endpointAgentToServerTest.hasPathTraceInSession) &&
        Objects.equals(this.modifiedDate, endpointAgentToServerTest.modifiedDate) &&
        Objects.equals(this.networkMeasurements, endpointAgentToServerTest.networkMeasurements) &&
        Objects.equals(this.protocol, endpointAgentToServerTest.protocol) &&
        Objects.equals(this.ipVersion, endpointAgentToServerTest.ipVersion) &&
        Objects.equals(this.server, endpointAgentToServerTest.server) &&
        Objects.equals(this.testId, endpointAgentToServerTest.testId) &&
        Objects.equals(this.testName, endpointAgentToServerTest.testName) &&
        Objects.equals(this.type, endpointAgentToServerTest.type) &&
        Objects.equals(this.tcpProbeMode, endpointAgentToServerTest.tcpProbeMode) &&
        Objects.equals(this.port, endpointAgentToServerTest.port) &&
        Objects.equals(this.labels, endpointAgentToServerTest.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, links, agentSelectorConfig, createdDate, interval, isEnabled, isSavedEvent, hasPathTraceInSession, modifiedDate, networkMeasurements, protocol, ipVersion, server, testId, testName, type, tcpProbeMode, port, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgentToServerTest {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    agentSelectorConfig: ").append(toIndentedString(agentSelectorConfig)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isSavedEvent: ").append(toIndentedString(isSavedEvent)).append("\n");
    sb.append("    hasPathTraceInSession: ").append(toIndentedString(hasPathTraceInSession)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    networkMeasurements: ").append(toIndentedString(networkMeasurements)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tcpProbeMode: ").append(toIndentedString(tcpProbeMode)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

