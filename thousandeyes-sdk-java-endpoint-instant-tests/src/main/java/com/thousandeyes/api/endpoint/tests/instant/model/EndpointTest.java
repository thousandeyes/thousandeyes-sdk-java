/*
 * Endpoint Instant Scheduled Tests API
 *  You can create and execute a new endpoint instant scheduled test within ThousandEyes using this API. The test parameters are specified in the `POST` data.  The following applies to the Endpoint Instant Scheduled Tests API:  * To initiate the creation and execution of an instant scheduled test, the user must possess the `Edit endpoint tests` permission.  * Upon successful creation of an instant scheduled test, the API responds with an HTTP/201 CREATED status code and return the test definition. * It's important to note that the response does not include the results of the instant scheduled test. To retrieve test results, users can utilize the Endpoint Test Data endpoints. The URLs for these API test data endpoints are provided within the test definition output when an instant scheduled test is created. 
 *
 * The version of the OpenAPI document: 7.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.instant.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.tests.instant.model.AlertRule;
import com.thousandeyes.api.endpoint.tests.instant.model.EndpointAgentSelectorConfig;
import com.thousandeyes.api.endpoint.tests.instant.model.EndpointScheduledTestType;
import com.thousandeyes.api.endpoint.tests.instant.model.EndpointTestLinks;
import com.thousandeyes.api.endpoint.tests.instant.model.EndpointTestProtocol;
import com.thousandeyes.api.endpoint.tests.instant.model.TestInterval;
import com.thousandeyes.api.endpoint.tests.instant.model.TestProbeModeResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointTest
 */
@JsonPropertyOrder({
  EndpointTest.JSON_PROPERTY_AID,
  EndpointTest.JSON_PROPERTY_LINKS,
  EndpointTest.JSON_PROPERTY_AGENT_SELECTOR_CONFIG,
  EndpointTest.JSON_PROPERTY_CREATED_DATE,
  EndpointTest.JSON_PROPERTY_INTERVAL,
  EndpointTest.JSON_PROPERTY_IS_ENABLED,
  EndpointTest.JSON_PROPERTY_IS_SAVED_EVENT,
  EndpointTest.JSON_PROPERTY_HAS_PATH_TRACE_IN_SESSION,
  EndpointTest.JSON_PROPERTY_MODIFIED_DATE,
  EndpointTest.JSON_PROPERTY_NETWORK_MEASUREMENTS,
  EndpointTest.JSON_PROPERTY_PORT,
  EndpointTest.JSON_PROPERTY_PROTOCOL,
  EndpointTest.JSON_PROPERTY_SERVER,
  EndpointTest.JSON_PROPERTY_TEST_ID,
  EndpointTest.JSON_PROPERTY_TEST_NAME,
  EndpointTest.JSON_PROPERTY_TYPE,
  EndpointTest.JSON_PROPERTY_TCP_PROBE_MODE,
  EndpointTest.JSON_PROPERTY_ALERT_RULES
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-05-17T09:32:26.034981+01:00[Europe/Lisbon]")
public class EndpointTest {
  public static final String JSON_PROPERTY_AID = "aid";
  private String aid;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private EndpointTestLinks links;

  public static final String JSON_PROPERTY_AGENT_SELECTOR_CONFIG = "agentSelectorConfig";
  private EndpointAgentSelectorConfig agentSelectorConfig;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private OffsetDateTime createdDate;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private TestInterval interval;

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

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private EndpointTestProtocol protocol = EndpointTestProtocol.ICMP;

  public static final String JSON_PROPERTY_SERVER = "server";
  private String server;

  public static final String JSON_PROPERTY_TEST_ID = "testId";
  private String testId;

  public static final String JSON_PROPERTY_TEST_NAME = "testName";
  private String testName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private EndpointScheduledTestType type;

  public static final String JSON_PROPERTY_TCP_PROBE_MODE = "tcpProbeMode";
  private TestProbeModeResponse tcpProbeMode = TestProbeModeResponse.AUTO;

  public static final String JSON_PROPERTY_ALERT_RULES = "alertRules";
  private List<AlertRule> alertRules;

  public EndpointTest() { 
  }

  @JsonCreator
  public EndpointTest(
    @JsonProperty(JSON_PROPERTY_CREATED_DATE) OffsetDateTime createdDate, 
    @JsonProperty(JSON_PROPERTY_IS_SAVED_EVENT) Boolean isSavedEvent, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_DATE) OffsetDateTime modifiedDate, 
    @JsonProperty(JSON_PROPERTY_TEST_ID) String testId
  ) {
  this();
    this.createdDate = createdDate;
    this.isSavedEvent = isSavedEvent;
    this.modifiedDate = modifiedDate;
    this.testId = testId;
  }

  public EndpointTest aid(String aid) {
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


  public EndpointTest links(EndpointTestLinks links) {
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


  public EndpointTest agentSelectorConfig(EndpointAgentSelectorConfig agentSelectorConfig) {
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




  public EndpointTest interval(TestInterval interval) {
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


  public EndpointTest isEnabled(Boolean isEnabled) {
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




  public EndpointTest hasPathTraceInSession(Boolean hasPathTraceInSession) {
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




  public EndpointTest networkMeasurements(Boolean networkMeasurements) {
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


  public EndpointTest port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Port number, if not specified, the port is selected based on a protocol (HTTP 80, HTTPS 443).
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


  public EndpointTest protocol(EndpointTestProtocol protocol) {
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


  public EndpointTest server(String server) {
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




  public EndpointTest testName(String testName) {
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


  public EndpointTest type(EndpointScheduledTestType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EndpointScheduledTestType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(EndpointScheduledTestType type) {
    this.type = type;
  }


  public EndpointTest tcpProbeMode(TestProbeModeResponse tcpProbeMode) {
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


  public EndpointTest alertRules(List<AlertRule> alertRules) {
    this.alertRules = alertRules;
    return this;
  }

  public EndpointTest addItem(AlertRule alertRulesItem) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AlertRule> getAlertRules() {
    return alertRules;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertRules(List<AlertRule> alertRules) {
    this.alertRules = alertRules;
  }


  /**
   * Return true if this EndpointTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointTest endpointTest = (EndpointTest) o;
    return Objects.equals(this.aid, endpointTest.aid) &&
        Objects.equals(this.links, endpointTest.links) &&
        Objects.equals(this.agentSelectorConfig, endpointTest.agentSelectorConfig) &&
        Objects.equals(this.createdDate, endpointTest.createdDate) &&
        Objects.equals(this.interval, endpointTest.interval) &&
        Objects.equals(this.isEnabled, endpointTest.isEnabled) &&
        Objects.equals(this.isSavedEvent, endpointTest.isSavedEvent) &&
        Objects.equals(this.hasPathTraceInSession, endpointTest.hasPathTraceInSession) &&
        Objects.equals(this.modifiedDate, endpointTest.modifiedDate) &&
        Objects.equals(this.networkMeasurements, endpointTest.networkMeasurements) &&
        Objects.equals(this.port, endpointTest.port) &&
        Objects.equals(this.protocol, endpointTest.protocol) &&
        Objects.equals(this.server, endpointTest.server) &&
        Objects.equals(this.testId, endpointTest.testId) &&
        Objects.equals(this.testName, endpointTest.testName) &&
        Objects.equals(this.type, endpointTest.type) &&
        Objects.equals(this.tcpProbeMode, endpointTest.tcpProbeMode) &&
        Objects.equals(this.alertRules, endpointTest.alertRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, links, agentSelectorConfig, createdDate, interval, isEnabled, isSavedEvent, hasPathTraceInSession, modifiedDate, networkMeasurements, port, protocol, server, testId, testName, type, tcpProbeMode, alertRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointTest {\n");
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
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tcpProbeMode: ").append(toIndentedString(tcpProbeMode)).append("\n");
    sb.append("    alertRules: ").append(toIndentedString(alertRules)).append("\n");
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

