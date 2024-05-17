/*
 * Endpoint Tests API
 *  Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API. 
 *
 * The version of the OpenAPI document: 7.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.tests.model.EndpointTestAgentSelectorType;
import com.thousandeyes.api.endpoint.tests.model.EndpointTestAuthType;
import com.thousandeyes.api.endpoint.tests.model.EndpointTestProtocol;
import com.thousandeyes.api.endpoint.tests.model.TestProbeModeResponse;
import com.thousandeyes.api.endpoint.tests.model.TestSslVersionId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointHttpServerInstantTest
 */
@JsonPropertyOrder({
  EndpointHttpServerInstantTest.JSON_PROPERTY_AGENT_SELECTOR_TYPE,
  EndpointHttpServerInstantTest.JSON_PROPERTY_AGENTS,
  EndpointHttpServerInstantTest.JSON_PROPERTY_HAS_PING,
  EndpointHttpServerInstantTest.JSON_PROPERTY_HAS_TRACEROUTE,
  EndpointHttpServerInstantTest.JSON_PROPERTY_ENDPOINT_AGENT_LABELS,
  EndpointHttpServerInstantTest.JSON_PROPERTY_MAX_MACHINES,
  EndpointHttpServerInstantTest.JSON_PROPERTY_PORT,
  EndpointHttpServerInstantTest.JSON_PROPERTY_TEST_NAME,
  EndpointHttpServerInstantTest.JSON_PROPERTY_AUTH_TYPE,
  EndpointHttpServerInstantTest.JSON_PROPERTY_HAS_PATH_TRACE_IN_SESSION,
  EndpointHttpServerInstantTest.JSON_PROPERTY_HTTP_TIME_LIMIT,
  EndpointHttpServerInstantTest.JSON_PROPERTY_PROTOCOL,
  EndpointHttpServerInstantTest.JSON_PROPERTY_URL,
  EndpointHttpServerInstantTest.JSON_PROPERTY_USERNAME,
  EndpointHttpServerInstantTest.JSON_PROPERTY_SSL_VERSION_ID,
  EndpointHttpServerInstantTest.JSON_PROPERTY_TCP_PROBE_MODE,
  EndpointHttpServerInstantTest.JSON_PROPERTY_VERIFY_CERTIFICATE,
  EndpointHttpServerInstantTest.JSON_PROPERTY_TARGET_RESPONSE_TIME,
  EndpointHttpServerInstantTest.JSON_PROPERTY_PASSWORD
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-05-17T09:32:26.288294+01:00[Europe/Lisbon]")
public class EndpointHttpServerInstantTest {
  public static final String JSON_PROPERTY_AGENT_SELECTOR_TYPE = "agentSelectorType";
  private EndpointTestAgentSelectorType agentSelectorType;

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<UUID> agents;

  public static final String JSON_PROPERTY_HAS_PING = "hasPing";
  private Boolean hasPing = true;

  public static final String JSON_PROPERTY_HAS_TRACEROUTE = "hasTraceroute";
  private Boolean hasTraceroute = true;

  public static final String JSON_PROPERTY_ENDPOINT_AGENT_LABELS = "endpointAgentLabels";
  private List<String> endpointAgentLabels;

  public static final String JSON_PROPERTY_MAX_MACHINES = "maxMachines";
  private Integer maxMachines;

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port;

  public static final String JSON_PROPERTY_TEST_NAME = "testName";
  private String testName;

  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private EndpointTestAuthType authType = EndpointTestAuthType.NONE;

  public static final String JSON_PROPERTY_HAS_PATH_TRACE_IN_SESSION = "hasPathTraceInSession";
  private Boolean hasPathTraceInSession;

  public static final String JSON_PROPERTY_HTTP_TIME_LIMIT = "httpTimeLimit";
  private Integer httpTimeLimit;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private EndpointTestProtocol protocol = EndpointTestProtocol.ICMP;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_SSL_VERSION_ID = "sslVersionId";
  private TestSslVersionId sslVersionId;

  public static final String JSON_PROPERTY_TCP_PROBE_MODE = "tcpProbeMode";
  private TestProbeModeResponse tcpProbeMode = TestProbeModeResponse.AUTO;

  public static final String JSON_PROPERTY_VERIFY_CERTIFICATE = "verifyCertificate";
  private Boolean verifyCertificate;

  public static final String JSON_PROPERTY_TARGET_RESPONSE_TIME = "targetResponseTime";
  private Integer targetResponseTime;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public EndpointHttpServerInstantTest() { 
  }

  public EndpointHttpServerInstantTest agentSelectorType(EndpointTestAgentSelectorType agentSelectorType) {
    this.agentSelectorType = agentSelectorType;
    return this;
  }

   /**
   * Get agentSelectorType
   * @return agentSelectorType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AGENT_SELECTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EndpointTestAgentSelectorType getAgentSelectorType() {
    return agentSelectorType;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_SELECTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAgentSelectorType(EndpointTestAgentSelectorType agentSelectorType) {
    this.agentSelectorType = agentSelectorType;
  }


  public EndpointHttpServerInstantTest agents(List<UUID> agents) {
    this.agents = agents;
    return this;
  }

  public EndpointHttpServerInstantTest addItem(UUID agentsItem) {
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


  public EndpointHttpServerInstantTest hasPing(Boolean hasPing) {
    this.hasPing = hasPing;
    return this;
  }

   /**
   * Optional flag indicating if the test should run ping.
   * @return hasPing
  **/
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


  public EndpointHttpServerInstantTest hasTraceroute(Boolean hasTraceroute) {
    this.hasTraceroute = hasTraceroute;
    return this;
  }

   /**
   * Optional flag indicating if the test should run traceroute.
   * @return hasTraceroute
  **/
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


  public EndpointHttpServerInstantTest endpointAgentLabels(List<String> endpointAgentLabels) {
    this.endpointAgentLabels = endpointAgentLabels;
    return this;
  }

  public EndpointHttpServerInstantTest addItem(String endpointAgentLabelsItem) {
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


  public EndpointHttpServerInstantTest maxMachines(Integer maxMachines) {
    this.maxMachines = maxMachines;
    return this;
  }

   /**
   * Maximum number of agents which can execute the test.
   * minimum: 1
   * maximum: 50000
   * @return maxMachines
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_MACHINES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMaxMachines() {
    return maxMachines;
  }


  @JsonProperty(JSON_PROPERTY_MAX_MACHINES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxMachines(Integer maxMachines) {
    this.maxMachines = maxMachines;
  }


  public EndpointHttpServerInstantTest port(Integer port) {
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


  public EndpointHttpServerInstantTest testName(String testName) {
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


  public EndpointHttpServerInstantTest authType(EndpointTestAuthType authType) {
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


  public EndpointHttpServerInstantTest hasPathTraceInSession(Boolean hasPathTraceInSession) {
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


  public EndpointHttpServerInstantTest httpTimeLimit(Integer httpTimeLimit) {
    this.httpTimeLimit = httpTimeLimit;
    return this;
  }

   /**
   * Maximum amount of time in milliseconds the agents wait before a request times out.
   * @return httpTimeLimit
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HTTP_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getHttpTimeLimit() {
    return httpTimeLimit;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHttpTimeLimit(Integer httpTimeLimit) {
    this.httpTimeLimit = httpTimeLimit;
  }


  public EndpointHttpServerInstantTest protocol(EndpointTestProtocol protocol) {
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


  public EndpointHttpServerInstantTest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Test target URL. Optionally, you can specify a protocol (http or https). If no protocol is provided, the default &#x60;https&#x60; protocol is used.
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


  public EndpointHttpServerInstantTest username(String username) {
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


  public EndpointHttpServerInstantTest sslVersionId(TestSslVersionId sslVersionId) {
    this.sslVersionId = sslVersionId;
    return this;
  }

   /**
   * Get sslVersionId
   * @return sslVersionId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SSL_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TestSslVersionId getSslVersionId() {
    return sslVersionId;
  }


  @JsonProperty(JSON_PROPERTY_SSL_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSslVersionId(TestSslVersionId sslVersionId) {
    this.sslVersionId = sslVersionId;
  }


  public EndpointHttpServerInstantTest tcpProbeMode(TestProbeModeResponse tcpProbeMode) {
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


  public EndpointHttpServerInstantTest verifyCertificate(Boolean verifyCertificate) {
    this.verifyCertificate = verifyCertificate;
    return this;
  }

   /**
   * Flag indicating if a certificate should be verified.
   * @return verifyCertificate
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERIFY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getVerifyCertificate() {
    return verifyCertificate;
  }


  @JsonProperty(JSON_PROPERTY_VERIFY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVerifyCertificate(Boolean verifyCertificate) {
    this.verifyCertificate = verifyCertificate;
  }


  public EndpointHttpServerInstantTest targetResponseTime(Integer targetResponseTime) {
    this.targetResponseTime = targetResponseTime;
    return this;
  }

   /**
   * Response time target in milliseconds. Affects the colors of agents and legends on the view page. The value is compared with actual response time in order to determine the color scale (from green to red).
   * @return targetResponseTime
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TARGET_RESPONSE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTargetResponseTime() {
    return targetResponseTime;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_RESPONSE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetResponseTime(Integer targetResponseTime) {
    this.targetResponseTime = targetResponseTime;
  }


  public EndpointHttpServerInstantTest password(String password) {
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


  /**
   * Return true if this EndpointHttpServerInstantTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointHttpServerInstantTest endpointHttpServerInstantTest = (EndpointHttpServerInstantTest) o;
    return Objects.equals(this.agentSelectorType, endpointHttpServerInstantTest.agentSelectorType) &&
        Objects.equals(this.agents, endpointHttpServerInstantTest.agents) &&
        Objects.equals(this.hasPing, endpointHttpServerInstantTest.hasPing) &&
        Objects.equals(this.hasTraceroute, endpointHttpServerInstantTest.hasTraceroute) &&
        Objects.equals(this.endpointAgentLabels, endpointHttpServerInstantTest.endpointAgentLabels) &&
        Objects.equals(this.maxMachines, endpointHttpServerInstantTest.maxMachines) &&
        Objects.equals(this.port, endpointHttpServerInstantTest.port) &&
        Objects.equals(this.testName, endpointHttpServerInstantTest.testName) &&
        Objects.equals(this.authType, endpointHttpServerInstantTest.authType) &&
        Objects.equals(this.hasPathTraceInSession, endpointHttpServerInstantTest.hasPathTraceInSession) &&
        Objects.equals(this.httpTimeLimit, endpointHttpServerInstantTest.httpTimeLimit) &&
        Objects.equals(this.protocol, endpointHttpServerInstantTest.protocol) &&
        Objects.equals(this.url, endpointHttpServerInstantTest.url) &&
        Objects.equals(this.username, endpointHttpServerInstantTest.username) &&
        Objects.equals(this.sslVersionId, endpointHttpServerInstantTest.sslVersionId) &&
        Objects.equals(this.tcpProbeMode, endpointHttpServerInstantTest.tcpProbeMode) &&
        Objects.equals(this.verifyCertificate, endpointHttpServerInstantTest.verifyCertificate) &&
        Objects.equals(this.targetResponseTime, endpointHttpServerInstantTest.targetResponseTime) &&
        Objects.equals(this.password, endpointHttpServerInstantTest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentSelectorType, agents, hasPing, hasTraceroute, endpointAgentLabels, maxMachines, port, testName, authType, hasPathTraceInSession, httpTimeLimit, protocol, url, username, sslVersionId, tcpProbeMode, verifyCertificate, targetResponseTime, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointHttpServerInstantTest {\n");
    sb.append("    agentSelectorType: ").append(toIndentedString(agentSelectorType)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    hasPing: ").append(toIndentedString(hasPing)).append("\n");
    sb.append("    hasTraceroute: ").append(toIndentedString(hasTraceroute)).append("\n");
    sb.append("    endpointAgentLabels: ").append(toIndentedString(endpointAgentLabels)).append("\n");
    sb.append("    maxMachines: ").append(toIndentedString(maxMachines)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    hasPathTraceInSession: ").append(toIndentedString(hasPathTraceInSession)).append("\n");
    sb.append("    httpTimeLimit: ").append(toIndentedString(httpTimeLimit)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    sslVersionId: ").append(toIndentedString(sslVersionId)).append("\n");
    sb.append("    tcpProbeMode: ").append(toIndentedString(tcpProbeMode)).append("\n");
    sb.append("    verifyCertificate: ").append(toIndentedString(verifyCertificate)).append("\n");
    sb.append("    targetResponseTime: ").append(toIndentedString(targetResponseTime)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

