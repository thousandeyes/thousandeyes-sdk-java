/*
 * Endpoint Instant Scheduled Tests API
 *  You can create and execute a new endpoint instant scheduled test within ThousandEyes using this API. The test parameters are specified in the `POST` data.  The following applies to the Endpoint Instant Scheduled Tests API:  * To initiate the creation and execution of an instant scheduled test, the user must possess the `Edit endpoint tests` permission.  * Upon successful creation of an instant scheduled test, the API responds with an HTTP/201 CREATED status code and return the test definition. * It's important to note that the response does not include the results of the instant scheduled test. To retrieve test results, users can utilize the Endpoint Test Data endpoints. The URLs for these API test data endpoints are provided within the test definition output when an instant scheduled test is created. 
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.instant.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.endpoint.tests.instant.model.AlertRule;
import com.thousandeyes.sdk.endpoint.tests.instant.model.EndpointAgentSelectorConfig;
import com.thousandeyes.sdk.endpoint.tests.instant.model.EndpointTestAuthType;
import com.thousandeyes.sdk.endpoint.tests.instant.model.EndpointTestLinks;
import com.thousandeyes.sdk.endpoint.tests.instant.model.EndpointTestProtocol;
import com.thousandeyes.sdk.endpoint.tests.instant.model.TestInterval;
import com.thousandeyes.sdk.endpoint.tests.instant.model.TestLabel;
import com.thousandeyes.sdk.endpoint.tests.instant.model.TestProbeModeResponse;
import com.thousandeyes.sdk.endpoint.tests.instant.model.TestSslVersionId;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointHttpServerTest
 */
@JsonPropertyOrder({
  EndpointHttpServerTest.JSON_PROPERTY_AID,
  EndpointHttpServerTest.JSON_PROPERTY_LINKS,
  EndpointHttpServerTest.JSON_PROPERTY_AGENT_SELECTOR_CONFIG,
  EndpointHttpServerTest.JSON_PROPERTY_CREATED_DATE,
  EndpointHttpServerTest.JSON_PROPERTY_INTERVAL,
  EndpointHttpServerTest.JSON_PROPERTY_IS_ENABLED,
  EndpointHttpServerTest.JSON_PROPERTY_IS_SAVED_EVENT,
  EndpointHttpServerTest.JSON_PROPERTY_HAS_PATH_TRACE_IN_SESSION,
  EndpointHttpServerTest.JSON_PROPERTY_MODIFIED_DATE,
  EndpointHttpServerTest.JSON_PROPERTY_NETWORK_MEASUREMENTS,
  EndpointHttpServerTest.JSON_PROPERTY_PORT,
  EndpointHttpServerTest.JSON_PROPERTY_PROTOCOL,
  EndpointHttpServerTest.JSON_PROPERTY_SERVER,
  EndpointHttpServerTest.JSON_PROPERTY_TEST_ID,
  EndpointHttpServerTest.JSON_PROPERTY_TEST_NAME,
  EndpointHttpServerTest.JSON_PROPERTY_TYPE,
  EndpointHttpServerTest.JSON_PROPERTY_TCP_PROBE_MODE,
  EndpointHttpServerTest.JSON_PROPERTY_ALERT_RULES,
  EndpointHttpServerTest.JSON_PROPERTY_AUTH_TYPE,
  EndpointHttpServerTest.JSON_PROPERTY_HTTP_TIME_LIMIT,
  EndpointHttpServerTest.JSON_PROPERTY_URL,
  EndpointHttpServerTest.JSON_PROPERTY_USERNAME,
  EndpointHttpServerTest.JSON_PROPERTY_SSL_VERSION_ID,
  EndpointHttpServerTest.JSON_PROPERTY_VERIFY_CERTIFICATE,
  EndpointHttpServerTest.JSON_PROPERTY_CONTENT_REGEX,
  EndpointHttpServerTest.JSON_PROPERTY_FOLLOW_REDIRECTS,
  EndpointHttpServerTest.JSON_PROPERTY_HTTP_TARGET_TIME,
  EndpointHttpServerTest.JSON_PROPERTY_HTTP_VERSION,
  EndpointHttpServerTest.JSON_PROPERTY_POST_BODY,
  EndpointHttpServerTest.JSON_PROPERTY_SSL_VERSION,
  EndpointHttpServerTest.JSON_PROPERTY_USE_NTLM,
  EndpointHttpServerTest.JSON_PROPERTY_USER_AGENT,
  EndpointHttpServerTest.JSON_PROPERTY_LABELS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EndpointHttpServerTest {
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
  private String type;

  public static final String JSON_PROPERTY_TCP_PROBE_MODE = "tcpProbeMode";
  private TestProbeModeResponse tcpProbeMode = TestProbeModeResponse.AUTO;

  public static final String JSON_PROPERTY_ALERT_RULES = "alertRules";
  private List<AlertRule> alertRules = new ArrayList<>();

  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private EndpointTestAuthType authType = EndpointTestAuthType.NONE;

  public static final String JSON_PROPERTY_HTTP_TIME_LIMIT = "httpTimeLimit";
  private Integer httpTimeLimit;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_SSL_VERSION_ID = "sslVersionId";
  private TestSslVersionId sslVersionId;

  public static final String JSON_PROPERTY_VERIFY_CERTIFICATE = "verifyCertificate";
  private Boolean verifyCertificate;

  public static final String JSON_PROPERTY_CONTENT_REGEX = "contentRegex";
  private String contentRegex;

  public static final String JSON_PROPERTY_FOLLOW_REDIRECTS = "followRedirects";
  private Boolean followRedirects = true;

  public static final String JSON_PROPERTY_HTTP_TARGET_TIME = "httpTargetTime";
  private Integer httpTargetTime;

  public static final String JSON_PROPERTY_HTTP_VERSION = "httpVersion";
  private Integer httpVersion = 2;

  public static final String JSON_PROPERTY_POST_BODY = "postBody";
  private String postBody;

  public static final String JSON_PROPERTY_SSL_VERSION = "sslVersion";
  private String sslVersion;

  public static final String JSON_PROPERTY_USE_NTLM = "useNtlm";
  private Boolean useNtlm;

  public static final String JSON_PROPERTY_USER_AGENT = "userAgent";
  private String userAgent;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<TestLabel> labels = new ArrayList<>();

  public EndpointHttpServerTest() { 
  }

  @JsonCreator
  public EndpointHttpServerTest(
    @JsonProperty(JSON_PROPERTY_CREATED_DATE) OffsetDateTime createdDate, 
    @JsonProperty(JSON_PROPERTY_IS_SAVED_EVENT) Boolean isSavedEvent, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_DATE) OffsetDateTime modifiedDate, 
    @JsonProperty(JSON_PROPERTY_TEST_ID) String testId, 
    @JsonProperty(JSON_PROPERTY_TYPE) String type, 
    @JsonProperty(JSON_PROPERTY_SSL_VERSION) String sslVersion, 
    @JsonProperty(JSON_PROPERTY_LABELS) List<TestLabel> labels
  ) {
  this();
    this.createdDate = createdDate;
    this.isSavedEvent = isSavedEvent;
    this.modifiedDate = modifiedDate;
    this.testId = testId;
    this.type = type;
    this.sslVersion = sslVersion;
    this.labels = labels;
  }

  public EndpointHttpServerTest aid(String aid) {
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


  public EndpointHttpServerTest links(EndpointTestLinks links) {
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


  public EndpointHttpServerTest agentSelectorConfig(EndpointAgentSelectorConfig agentSelectorConfig) {
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




  public EndpointHttpServerTest interval(TestInterval interval) {
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


  public EndpointHttpServerTest isEnabled(Boolean isEnabled) {
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




  public EndpointHttpServerTest hasPathTraceInSession(Boolean hasPathTraceInSession) {
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




  public EndpointHttpServerTest networkMeasurements(Boolean networkMeasurements) {
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


  public EndpointHttpServerTest port(Integer port) {
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


  public EndpointHttpServerTest protocol(EndpointTestProtocol protocol) {
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


  public EndpointHttpServerTest server(String server) {
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




  public EndpointHttpServerTest testName(String testName) {
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




  public EndpointHttpServerTest tcpProbeMode(TestProbeModeResponse tcpProbeMode) {
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


  public EndpointHttpServerTest alertRules(List<AlertRule> alertRules) {
    this.alertRules = alertRules;
    return this;
  }

  public EndpointHttpServerTest addAlertRulesItem(AlertRule alertRulesItem) {
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


  public EndpointHttpServerTest authType(EndpointTestAuthType authType) {
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


  public EndpointHttpServerTest httpTimeLimit(Integer httpTimeLimit) {
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


  public EndpointHttpServerTest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Test target URL. Optionally, you can specify a protocol (http or https). If no protocol is provided, the default &#x60;https&#x60; protocol is used.
   * @return url
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public EndpointHttpServerTest username(String username) {
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


  public EndpointHttpServerTest sslVersionId(TestSslVersionId sslVersionId) {
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


  public EndpointHttpServerTest verifyCertificate(Boolean verifyCertificate) {
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


  public EndpointHttpServerTest contentRegex(String contentRegex) {
    this.contentRegex = contentRegex;
    return this;
  }

   /**
   * Content regex, this field does not require escaping.
   * @return contentRegex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentRegex() {
    return contentRegex;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentRegex(String contentRegex) {
    this.contentRegex = contentRegex;
  }


  public EndpointHttpServerTest followRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
    return this;
  }

   /**
   * To disable following HTTP/301 or HTTP/302 redirect directives, set this parameter to &#x60;false&#x60;.
   * @return followRedirects
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOLLOW_REDIRECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFollowRedirects() {
    return followRedirects;
  }


  @JsonProperty(JSON_PROPERTY_FOLLOW_REDIRECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFollowRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
  }


  public EndpointHttpServerTest httpTargetTime(Integer httpTargetTime) {
    this.httpTargetTime = httpTargetTime;
    return this;
  }

   /**
   * Target time for HTTP server completion, specified in milliseconds.
   * minimum: 100
   * maximum: 5000
   * @return httpTargetTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_TARGET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHttpTargetTime() {
    return httpTargetTime;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_TARGET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHttpTargetTime(Integer httpTargetTime) {
    this.httpTargetTime = httpTargetTime;
  }


  public EndpointHttpServerTest httpVersion(Integer httpVersion) {
    this.httpVersion = httpVersion;
    return this;
  }

   /**
   * HTTP protocol version. Set to &#39;2&#39; to prefer HTTP/2, or &#39;1&#39; to use only HTTP/1.1.
   * minimum: 1
   * maximum: 2
   * @return httpVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHttpVersion() {
    return httpVersion;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHttpVersion(Integer httpVersion) {
    this.httpVersion = httpVersion;
  }


  public EndpointHttpServerTest postBody(String postBody) {
    this.postBody = postBody;
    return this;
  }

   /**
   * Enter the body for the HTTP POST request in this field. No special escaping is necessary. If the post body is provided with content, the &#x60;requestMethod&#x60; is automatically set to POST.
   * @return postBody
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POST_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostBody() {
    return postBody;
  }


  @JsonProperty(JSON_PROPERTY_POST_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostBody(String postBody) {
    this.postBody = postBody;
  }


   /**
   * Reflects the verbose SSL protocol version used by a test.
   * @return sslVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSL_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSslVersion() {
    return sslVersion;
  }




  public EndpointHttpServerTest useNtlm(Boolean useNtlm) {
    this.useNtlm = useNtlm;
    return this;
  }

   /**
   * Set to true to use NTLM, false to use Basic Authentication. Requires username and password to be set.
   * @return useNtlm
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_NTLM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseNtlm() {
    return useNtlm;
  }


  @JsonProperty(JSON_PROPERTY_USE_NTLM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseNtlm(Boolean useNtlm) {
    this.useNtlm = useNtlm;
  }


  public EndpointHttpServerTest userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * User-agent string to be provided during the test.
   * @return userAgent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserAgent() {
    return userAgent;
  }


  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
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
   * Return true if this EndpointHttpServerTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointHttpServerTest endpointHttpServerTest = (EndpointHttpServerTest) o;
    return Objects.equals(this.aid, endpointHttpServerTest.aid) &&
        Objects.equals(this.links, endpointHttpServerTest.links) &&
        Objects.equals(this.agentSelectorConfig, endpointHttpServerTest.agentSelectorConfig) &&
        Objects.equals(this.createdDate, endpointHttpServerTest.createdDate) &&
        Objects.equals(this.interval, endpointHttpServerTest.interval) &&
        Objects.equals(this.isEnabled, endpointHttpServerTest.isEnabled) &&
        Objects.equals(this.isSavedEvent, endpointHttpServerTest.isSavedEvent) &&
        Objects.equals(this.hasPathTraceInSession, endpointHttpServerTest.hasPathTraceInSession) &&
        Objects.equals(this.modifiedDate, endpointHttpServerTest.modifiedDate) &&
        Objects.equals(this.networkMeasurements, endpointHttpServerTest.networkMeasurements) &&
        Objects.equals(this.port, endpointHttpServerTest.port) &&
        Objects.equals(this.protocol, endpointHttpServerTest.protocol) &&
        Objects.equals(this.server, endpointHttpServerTest.server) &&
        Objects.equals(this.testId, endpointHttpServerTest.testId) &&
        Objects.equals(this.testName, endpointHttpServerTest.testName) &&
        Objects.equals(this.type, endpointHttpServerTest.type) &&
        Objects.equals(this.tcpProbeMode, endpointHttpServerTest.tcpProbeMode) &&
        Objects.equals(this.alertRules, endpointHttpServerTest.alertRules) &&
        Objects.equals(this.authType, endpointHttpServerTest.authType) &&
        Objects.equals(this.httpTimeLimit, endpointHttpServerTest.httpTimeLimit) &&
        Objects.equals(this.url, endpointHttpServerTest.url) &&
        Objects.equals(this.username, endpointHttpServerTest.username) &&
        Objects.equals(this.sslVersionId, endpointHttpServerTest.sslVersionId) &&
        Objects.equals(this.verifyCertificate, endpointHttpServerTest.verifyCertificate) &&
        Objects.equals(this.contentRegex, endpointHttpServerTest.contentRegex) &&
        Objects.equals(this.followRedirects, endpointHttpServerTest.followRedirects) &&
        Objects.equals(this.httpTargetTime, endpointHttpServerTest.httpTargetTime) &&
        Objects.equals(this.httpVersion, endpointHttpServerTest.httpVersion) &&
        Objects.equals(this.postBody, endpointHttpServerTest.postBody) &&
        Objects.equals(this.sslVersion, endpointHttpServerTest.sslVersion) &&
        Objects.equals(this.useNtlm, endpointHttpServerTest.useNtlm) &&
        Objects.equals(this.userAgent, endpointHttpServerTest.userAgent) &&
        Objects.equals(this.labels, endpointHttpServerTest.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, links, agentSelectorConfig, createdDate, interval, isEnabled, isSavedEvent, hasPathTraceInSession, modifiedDate, networkMeasurements, port, protocol, server, testId, testName, type, tcpProbeMode, alertRules, authType, httpTimeLimit, url, username, sslVersionId, verifyCertificate, contentRegex, followRedirects, httpTargetTime, httpVersion, postBody, sslVersion, useNtlm, userAgent, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointHttpServerTest {\n");
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
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    httpTimeLimit: ").append(toIndentedString(httpTimeLimit)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    sslVersionId: ").append(toIndentedString(sslVersionId)).append("\n");
    sb.append("    verifyCertificate: ").append(toIndentedString(verifyCertificate)).append("\n");
    sb.append("    contentRegex: ").append(toIndentedString(contentRegex)).append("\n");
    sb.append("    followRedirects: ").append(toIndentedString(followRedirects)).append("\n");
    sb.append("    httpTargetTime: ").append(toIndentedString(httpTargetTime)).append("\n");
    sb.append("    httpVersion: ").append(toIndentedString(httpVersion)).append("\n");
    sb.append("    postBody: ").append(toIndentedString(postBody)).append("\n");
    sb.append("    sslVersion: ").append(toIndentedString(sslVersion)).append("\n");
    sb.append("    useNtlm: ").append(toIndentedString(useNtlm)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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

