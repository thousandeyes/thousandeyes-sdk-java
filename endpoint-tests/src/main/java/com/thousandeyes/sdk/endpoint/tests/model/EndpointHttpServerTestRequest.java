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
import com.thousandeyes.sdk.endpoint.tests.model.EndpointTestAgentSelectorType;
import com.thousandeyes.sdk.endpoint.tests.model.EndpointTestAuthType;
import com.thousandeyes.sdk.endpoint.tests.model.EndpointTestProtocol;
import com.thousandeyes.sdk.endpoint.tests.model.TestInterval;
import com.thousandeyes.sdk.endpoint.tests.model.TestProbeModeResponse;
import com.thousandeyes.sdk.endpoint.tests.model.TestSslVersionId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointHttpServerTestRequest
 */
@JsonPropertyOrder({
  EndpointHttpServerTestRequest.JSON_PROPERTY_AGENT_SELECTOR_TYPE,
  EndpointHttpServerTestRequest.JSON_PROPERTY_AGENTS,
  EndpointHttpServerTestRequest.JSON_PROPERTY_ENDPOINT_AGENT_LABELS,
  EndpointHttpServerTestRequest.JSON_PROPERTY_MAX_MACHINES,
  EndpointHttpServerTestRequest.JSON_PROPERTY_TEST_NAME,
  EndpointHttpServerTestRequest.JSON_PROPERTY_AUTH_TYPE,
  EndpointHttpServerTestRequest.JSON_PROPERTY_HAS_PATH_TRACE_IN_SESSION,
  EndpointHttpServerTestRequest.JSON_PROPERTY_HTTP_TIME_LIMIT,
  EndpointHttpServerTestRequest.JSON_PROPERTY_PROTOCOL,
  EndpointHttpServerTestRequest.JSON_PROPERTY_USERNAME,
  EndpointHttpServerTestRequest.JSON_PROPERTY_SSL_VERSION_ID,
  EndpointHttpServerTestRequest.JSON_PROPERTY_TCP_PROBE_MODE,
  EndpointHttpServerTestRequest.JSON_PROPERTY_VERIFY_CERTIFICATE,
  EndpointHttpServerTestRequest.JSON_PROPERTY_URL,
  EndpointHttpServerTestRequest.JSON_PROPERTY_HAS_PING,
  EndpointHttpServerTestRequest.JSON_PROPERTY_HAS_TRACEROUTE,
  EndpointHttpServerTestRequest.JSON_PROPERTY_NETWORK_MEASUREMENTS,
  EndpointHttpServerTestRequest.JSON_PROPERTY_TARGET_RESPONSE_TIME,
  EndpointHttpServerTestRequest.JSON_PROPERTY_PASSWORD,
  EndpointHttpServerTestRequest.JSON_PROPERTY_INTERVAL
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EndpointHttpServerTestRequest {
  public static final String JSON_PROPERTY_AGENT_SELECTOR_TYPE = "agentSelectorType";
  private EndpointTestAgentSelectorType agentSelectorType = EndpointTestAgentSelectorType.ALL_AGENTS;

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<UUID> agents = new ArrayList<>();

  public static final String JSON_PROPERTY_ENDPOINT_AGENT_LABELS = "endpointAgentLabels";
  private List<String> endpointAgentLabels = new ArrayList<>();

  public static final String JSON_PROPERTY_MAX_MACHINES = "maxMachines";
  private Integer maxMachines = 25;

  public static final String JSON_PROPERTY_TEST_NAME = "testName";
  private String testName;

  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private EndpointTestAuthType authType = EndpointTestAuthType.NONE;

  public static final String JSON_PROPERTY_HAS_PATH_TRACE_IN_SESSION = "hasPathTraceInSession";
  private Boolean hasPathTraceInSession;

  public static final String JSON_PROPERTY_HTTP_TIME_LIMIT = "httpTimeLimit";
  private Integer httpTimeLimit = 5000;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private EndpointTestProtocol protocol = EndpointTestProtocol.ICMP;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_SSL_VERSION_ID = "sslVersionId";
  private TestSslVersionId sslVersionId = TestSslVersionId._0;

  public static final String JSON_PROPERTY_TCP_PROBE_MODE = "tcpProbeMode";
  private TestProbeModeResponse tcpProbeMode = TestProbeModeResponse.AUTO;

  public static final String JSON_PROPERTY_VERIFY_CERTIFICATE = "verifyCertificate";
  private Boolean verifyCertificate = true;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_HAS_PING = "hasPing";
  private Boolean hasPing = true;

  public static final String JSON_PROPERTY_HAS_TRACEROUTE = "hasTraceroute";
  private Boolean hasTraceroute = true;

  public static final String JSON_PROPERTY_NETWORK_MEASUREMENTS = "networkMeasurements";
  private Boolean networkMeasurements = true;

  public static final String JSON_PROPERTY_TARGET_RESPONSE_TIME = "targetResponseTime";
  private Integer targetResponseTime = 1000;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private TestInterval interval = TestInterval.NUMBER_60;

  public EndpointHttpServerTestRequest() { 
  }

  public EndpointHttpServerTestRequest agentSelectorType(EndpointTestAgentSelectorType agentSelectorType) {
    this.agentSelectorType = agentSelectorType;
    return this;
  }

   /**
   * Get agentSelectorType
   * @return agentSelectorType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_SELECTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointTestAgentSelectorType getAgentSelectorType() {
    return agentSelectorType;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_SELECTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentSelectorType(EndpointTestAgentSelectorType agentSelectorType) {
    this.agentSelectorType = agentSelectorType;
  }


  public EndpointHttpServerTestRequest agents(List<UUID> agents) {
    this.agents = agents;
    return this;
  }

  public EndpointHttpServerTestRequest addAgentsItem(UUID agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * List of endpoint agent IDs (obtained from &#x60;/endpoint/agents&#x60; endpoint). Required when &#x60;agentSelectorType&#x60; is set to &#x60;specific-agent&#x60;.
   * @return agents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getAgents() {
    return agents;
  }


  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgents(List<UUID> agents) {
    this.agents = agents;
  }


  public EndpointHttpServerTestRequest endpointAgentLabels(List<String> endpointAgentLabels) {
    this.endpointAgentLabels = endpointAgentLabels;
    return this;
  }

  public EndpointHttpServerTestRequest addEndpointAgentLabelsItem(String endpointAgentLabelsItem) {
    if (this.endpointAgentLabels == null) {
      this.endpointAgentLabels = new ArrayList<>();
    }
    this.endpointAgentLabels.add(endpointAgentLabelsItem);
    return this;
  }

   /**
   * List of endpoint agent label IDs (obtained from &#x60;/endpoint/labels&#x60; endpoint), required when &#x60;agentSelectorType&#x60; is set to &#x60;agent-labels&#x60;.
   * @return endpointAgentLabels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENT_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEndpointAgentLabels() {
    return endpointAgentLabels;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENT_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointAgentLabels(List<String> endpointAgentLabels) {
    this.endpointAgentLabels = endpointAgentLabels;
  }


  public EndpointHttpServerTestRequest maxMachines(Integer maxMachines) {
    this.maxMachines = maxMachines;
    return this;
  }

   /**
   * Maximum number of agents which can execute the test.
   * @return maxMachines
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_MACHINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxMachines() {
    return maxMachines;
  }


  @JsonProperty(JSON_PROPERTY_MAX_MACHINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxMachines(Integer maxMachines) {
    this.maxMachines = maxMachines;
  }


  public EndpointHttpServerTestRequest testName(String testName) {
    this.testName = testName;
    return this;
  }

   /**
   * Name of the test.
   * @return testName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTestName() {
    return testName;
  }


  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTestName(String testName) {
    this.testName = testName;
  }


  public EndpointHttpServerTestRequest authType(EndpointTestAuthType authType) {
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointTestAuthType getAuthType() {
    return authType;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthType(EndpointTestAuthType authType) {
    this.authType = authType;
  }


  public EndpointHttpServerTestRequest hasPathTraceInSession(Boolean hasPathTraceInSession) {
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


  public EndpointHttpServerTestRequest httpTimeLimit(Integer httpTimeLimit) {
    this.httpTimeLimit = httpTimeLimit;
    return this;
  }

   /**
   * Maximum amount of time in milliseconds the agents wait before a request times out.
   * @return httpTimeLimit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHttpTimeLimit() {
    return httpTimeLimit;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHttpTimeLimit(Integer httpTimeLimit) {
    this.httpTimeLimit = httpTimeLimit;
  }


  public EndpointHttpServerTestRequest protocol(EndpointTestProtocol protocol) {
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


  public EndpointHttpServerTestRequest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username for Basic/NTLM authentication.
   * @return username
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  public EndpointHttpServerTestRequest sslVersionId(TestSslVersionId sslVersionId) {
    this.sslVersionId = sslVersionId;
    return this;
  }

   /**
   * Get sslVersionId
   * @return sslVersionId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSL_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestSslVersionId getSslVersionId() {
    return sslVersionId;
  }


  @JsonProperty(JSON_PROPERTY_SSL_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSslVersionId(TestSslVersionId sslVersionId) {
    this.sslVersionId = sslVersionId;
  }


  public EndpointHttpServerTestRequest tcpProbeMode(TestProbeModeResponse tcpProbeMode) {
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


  public EndpointHttpServerTestRequest verifyCertificate(Boolean verifyCertificate) {
    this.verifyCertificate = verifyCertificate;
    return this;
  }

   /**
   * Flag indicating if a certificate should be verified.
   * @return verifyCertificate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERIFY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVerifyCertificate() {
    return verifyCertificate;
  }


  @JsonProperty(JSON_PROPERTY_VERIFY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerifyCertificate(Boolean verifyCertificate) {
    this.verifyCertificate = verifyCertificate;
  }


  public EndpointHttpServerTestRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The test target URL. You can optionally specify the protocol (&#x60;http&#x60; or &#x60;https&#x60;).   - **Default Protocol:** If no protocol is specified, &#x60;https&#x60; is used by default.  - **Port Number:** To specify a port, append it to the URL with a colon after the hostname or IP address (e.g., &#x60;https://example.com:443&#x60;).      - If no port is specified in the URL, the &#x60;port&#x60; is determined by the default for protocol (HTTP: 80, HTTPS: 443). 
   * @return url
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  public EndpointHttpServerTestRequest hasPing(Boolean hasPing) {
    this.hasPing = hasPing;
    return this;
  }

   /**
   * Optional flag indicating if the test should run ping.
   * @return hasPing
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_PING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasPing() {
    return hasPing;
  }


  @JsonProperty(JSON_PROPERTY_HAS_PING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasPing(Boolean hasPing) {
    this.hasPing = hasPing;
  }


  public EndpointHttpServerTestRequest hasTraceroute(Boolean hasTraceroute) {
    this.hasTraceroute = hasTraceroute;
    return this;
  }

   /**
   * Optional flag indicating if the test should run traceroute.
   * @return hasTraceroute
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_TRACEROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasTraceroute() {
    return hasTraceroute;
  }


  @JsonProperty(JSON_PROPERTY_HAS_TRACEROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasTraceroute(Boolean hasTraceroute) {
    this.hasTraceroute = hasTraceroute;
  }


  public EndpointHttpServerTestRequest networkMeasurements(Boolean networkMeasurements) {
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


  public EndpointHttpServerTestRequest targetResponseTime(Integer targetResponseTime) {
    this.targetResponseTime = targetResponseTime;
    return this;
  }

   /**
   * Response time target in milliseconds. Affects the colors of agents and legends on the view page. The value is compared with actual response time in order to determine the color scale (from green to red).
   * @return targetResponseTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_RESPONSE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTargetResponseTime() {
    return targetResponseTime;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_RESPONSE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetResponseTime(Integer targetResponseTime) {
    this.targetResponseTime = targetResponseTime;
  }


  public EndpointHttpServerTestRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password for Basic/NTLM authentication.
   * @return password
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public EndpointHttpServerTestRequest interval(TestInterval interval) {
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


  /**
   * Return true if this EndpointHttpServerTestRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointHttpServerTestRequest endpointHttpServerTestRequest = (EndpointHttpServerTestRequest) o;
    return Objects.equals(this.agentSelectorType, endpointHttpServerTestRequest.agentSelectorType) &&
        Objects.equals(this.agents, endpointHttpServerTestRequest.agents) &&
        Objects.equals(this.endpointAgentLabels, endpointHttpServerTestRequest.endpointAgentLabels) &&
        Objects.equals(this.maxMachines, endpointHttpServerTestRequest.maxMachines) &&
        Objects.equals(this.testName, endpointHttpServerTestRequest.testName) &&
        Objects.equals(this.authType, endpointHttpServerTestRequest.authType) &&
        Objects.equals(this.hasPathTraceInSession, endpointHttpServerTestRequest.hasPathTraceInSession) &&
        Objects.equals(this.httpTimeLimit, endpointHttpServerTestRequest.httpTimeLimit) &&
        Objects.equals(this.protocol, endpointHttpServerTestRequest.protocol) &&
        Objects.equals(this.username, endpointHttpServerTestRequest.username) &&
        Objects.equals(this.sslVersionId, endpointHttpServerTestRequest.sslVersionId) &&
        Objects.equals(this.tcpProbeMode, endpointHttpServerTestRequest.tcpProbeMode) &&
        Objects.equals(this.verifyCertificate, endpointHttpServerTestRequest.verifyCertificate) &&
        Objects.equals(this.url, endpointHttpServerTestRequest.url) &&
        Objects.equals(this.hasPing, endpointHttpServerTestRequest.hasPing) &&
        Objects.equals(this.hasTraceroute, endpointHttpServerTestRequest.hasTraceroute) &&
        Objects.equals(this.networkMeasurements, endpointHttpServerTestRequest.networkMeasurements) &&
        Objects.equals(this.targetResponseTime, endpointHttpServerTestRequest.targetResponseTime) &&
        Objects.equals(this.password, endpointHttpServerTestRequest.password) &&
        Objects.equals(this.interval, endpointHttpServerTestRequest.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentSelectorType, agents, endpointAgentLabels, maxMachines, testName, authType, hasPathTraceInSession, httpTimeLimit, protocol, username, sslVersionId, tcpProbeMode, verifyCertificate, url, hasPing, hasTraceroute, networkMeasurements, targetResponseTime, password, interval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointHttpServerTestRequest {\n");
    sb.append("    agentSelectorType: ").append(toIndentedString(agentSelectorType)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    endpointAgentLabels: ").append(toIndentedString(endpointAgentLabels)).append("\n");
    sb.append("    maxMachines: ").append(toIndentedString(maxMachines)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    hasPathTraceInSession: ").append(toIndentedString(hasPathTraceInSession)).append("\n");
    sb.append("    httpTimeLimit: ").append(toIndentedString(httpTimeLimit)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    sslVersionId: ").append(toIndentedString(sslVersionId)).append("\n");
    sb.append("    tcpProbeMode: ").append(toIndentedString(tcpProbeMode)).append("\n");
    sb.append("    verifyCertificate: ").append(toIndentedString(verifyCertificate)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    hasPing: ").append(toIndentedString(hasPing)).append("\n");
    sb.append("    hasTraceroute: ").append(toIndentedString(hasTraceroute)).append("\n");
    sb.append("    networkMeasurements: ").append(toIndentedString(networkMeasurements)).append("\n");
    sb.append("    targetResponseTime: ").append(toIndentedString(targetResponseTime)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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

