/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
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
import com.thousandeyes.sdk.tests.model.AgentResponse;
import com.thousandeyes.sdk.tests.model.AlertRule;
import com.thousandeyes.sdk.tests.model.ApiPredefinedVariable;
import com.thousandeyes.sdk.tests.model.ApiRequest;
import com.thousandeyes.sdk.tests.model.Monitor;
import com.thousandeyes.sdk.tests.model.SharedWithAccount;
import com.thousandeyes.sdk.tests.model.TestInterval;
import com.thousandeyes.sdk.tests.model.TestLabel;
import com.thousandeyes.sdk.tests.model.TestLinks;
import com.thousandeyes.sdk.tests.model.TestPathTraceMode;
import com.thousandeyes.sdk.tests.model.TestProbeMode;
import com.thousandeyes.sdk.tests.model.TestProtocol;
import com.thousandeyes.sdk.tests.model.TestSslVersionId;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiTestResponse
 */
@JsonPropertyOrder({
  ApiTestResponse.JSON_PROPERTY_INTERVAL,
  ApiTestResponse.JSON_PROPERTY_ALERTS_ENABLED,
  ApiTestResponse.JSON_PROPERTY_ENABLED,
  ApiTestResponse.JSON_PROPERTY_ALERT_RULES,
  ApiTestResponse.JSON_PROPERTY_CREATED_BY,
  ApiTestResponse.JSON_PROPERTY_CREATED_DATE,
  ApiTestResponse.JSON_PROPERTY_DESCRIPTION,
  ApiTestResponse.JSON_PROPERTY_LIVE_SHARE,
  ApiTestResponse.JSON_PROPERTY_MODIFIED_BY,
  ApiTestResponse.JSON_PROPERTY_MODIFIED_DATE,
  ApiTestResponse.JSON_PROPERTY_SAVED_EVENT,
  ApiTestResponse.JSON_PROPERTY_TEST_ID,
  ApiTestResponse.JSON_PROPERTY_TEST_NAME,
  ApiTestResponse.JSON_PROPERTY_TYPE,
  ApiTestResponse.JSON_PROPERTY_LINKS,
  ApiTestResponse.JSON_PROPERTY_LABELS,
  ApiTestResponse.JSON_PROPERTY_SHARED_WITH_ACCOUNTS,
  ApiTestResponse.JSON_PROPERTY_FOLLOW_REDIRECTS,
  ApiTestResponse.JSON_PROPERTY_MTU_MEASUREMENTS,
  ApiTestResponse.JSON_PROPERTY_NETWORK_MEASUREMENTS,
  ApiTestResponse.JSON_PROPERTY_NUM_PATH_TRACES,
  ApiTestResponse.JSON_PROPERTY_PATH_TRACE_MODE,
  ApiTestResponse.JSON_PROPERTY_PREDEFINED_VARIABLES,
  ApiTestResponse.JSON_PROPERTY_PROBE_MODE,
  ApiTestResponse.JSON_PROPERTY_PROTOCOL,
  ApiTestResponse.JSON_PROPERTY_REQUESTS,
  ApiTestResponse.JSON_PROPERTY_SSL_VERSION_ID,
  ApiTestResponse.JSON_PROPERTY_TARGET_TIME,
  ApiTestResponse.JSON_PROPERTY_TIME_LIMIT,
  ApiTestResponse.JSON_PROPERTY_URL,
  ApiTestResponse.JSON_PROPERTY_CREDENTIALS,
  ApiTestResponse.JSON_PROPERTY_BGP_MEASUREMENTS,
  ApiTestResponse.JSON_PROPERTY_USE_PUBLIC_BGP,
  ApiTestResponse.JSON_PROPERTY_MONITORS,
  ApiTestResponse.JSON_PROPERTY_AGENTS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiTestResponse {
  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private TestInterval interval = TestInterval.NUMBER_60;

  public static final String JSON_PROPERTY_ALERTS_ENABLED = "alertsEnabled";
  private Boolean alertsEnabled;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled = true;

  public static final String JSON_PROPERTY_ALERT_RULES = "alertRules";
  private List<AlertRule> alertRules = new ArrayList<>();

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

  public static final String JSON_PROPERTY_FOLLOW_REDIRECTS = "followRedirects";
  private Boolean followRedirects = true;

  public static final String JSON_PROPERTY_MTU_MEASUREMENTS = "mtuMeasurements";
  private Boolean mtuMeasurements;

  public static final String JSON_PROPERTY_NETWORK_MEASUREMENTS = "networkMeasurements";
  private Boolean networkMeasurements = true;

  public static final String JSON_PROPERTY_NUM_PATH_TRACES = "numPathTraces";
  private Integer numPathTraces = 3;

  public static final String JSON_PROPERTY_PATH_TRACE_MODE = "pathTraceMode";
  private TestPathTraceMode pathTraceMode = TestPathTraceMode.CLASSIC;

  public static final String JSON_PROPERTY_PREDEFINED_VARIABLES = "predefinedVariables";
  private List<ApiPredefinedVariable> predefinedVariables = new ArrayList<>();

  public static final String JSON_PROPERTY_PROBE_MODE = "probeMode";
  private TestProbeMode probeMode = TestProbeMode.AUTO;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private TestProtocol protocol = TestProtocol.TCP;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<ApiRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_SSL_VERSION_ID = "sslVersionId";
  private TestSslVersionId sslVersionId = TestSslVersionId._0;

  public static final String JSON_PROPERTY_TARGET_TIME = "targetTime";
  private Integer targetTime;

  public static final String JSON_PROPERTY_TIME_LIMIT = "timeLimit";
  private Integer timeLimit = 30;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_CREDENTIALS = "credentials";
  private List<String> credentials = new ArrayList<>();

  public static final String JSON_PROPERTY_BGP_MEASUREMENTS = "bgpMeasurements";
  private Boolean bgpMeasurements = true;

  public static final String JSON_PROPERTY_USE_PUBLIC_BGP = "usePublicBgp";
  private Boolean usePublicBgp = true;

  public static final String JSON_PROPERTY_MONITORS = "monitors";
  private List<Monitor> monitors = new ArrayList<>();

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<AgentResponse> agents = new ArrayList<>();

  public ApiTestResponse() { 
  }

  @JsonCreator
  public ApiTestResponse(
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
    this.labels = labels;
    this.sharedWithAccounts = sharedWithAccounts;
    this.monitors = monitors;
  }

  public ApiTestResponse interval(TestInterval interval) {
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


  public ApiTestResponse alertsEnabled(Boolean alertsEnabled) {
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


  public ApiTestResponse enabled(Boolean enabled) {
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


  public ApiTestResponse alertRules(List<AlertRule> alertRules) {
    this.alertRules = alertRules;
    return this;
  }

  public ApiTestResponse addAlertRulesItem(AlertRule alertRulesItem) {
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




  public ApiTestResponse description(String description) {
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




  public ApiTestResponse testName(String testName) {
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




  public ApiTestResponse links(TestLinks links) {
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




  public ApiTestResponse followRedirects(Boolean followRedirects) {
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


  public ApiTestResponse mtuMeasurements(Boolean mtuMeasurements) {
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


  public ApiTestResponse networkMeasurements(Boolean networkMeasurements) {
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


  public ApiTestResponse numPathTraces(Integer numPathTraces) {
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


  public ApiTestResponse pathTraceMode(TestPathTraceMode pathTraceMode) {
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


  public ApiTestResponse predefinedVariables(List<ApiPredefinedVariable> predefinedVariables) {
    this.predefinedVariables = predefinedVariables;
    return this;
  }

  public ApiTestResponse addPredefinedVariablesItem(ApiPredefinedVariable predefinedVariablesItem) {
    if (this.predefinedVariables == null) {
      this.predefinedVariables = new ArrayList<>();
    }
    this.predefinedVariables.add(predefinedVariablesItem);
    return this;
  }

   /**
   * Get predefinedVariables
   * @return predefinedVariables
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREDEFINED_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiPredefinedVariable> getPredefinedVariables() {
    return predefinedVariables;
  }


  @JsonProperty(JSON_PROPERTY_PREDEFINED_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPredefinedVariables(List<ApiPredefinedVariable> predefinedVariables) {
    this.predefinedVariables = predefinedVariables;
  }


  public ApiTestResponse probeMode(TestProbeMode probeMode) {
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


  public ApiTestResponse protocol(TestProtocol protocol) {
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


  public ApiTestResponse requests(List<ApiRequest> requests) {
    this.requests = requests;
    return this;
  }

  public ApiTestResponse addRequestsItem(ApiRequest requestsItem) {
    if (this.requests == null) {
      this.requests = new ArrayList<>();
    }
    this.requests.add(requestsItem);
    return this;
  }

   /**
   * Get requests
   * @return requests
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ApiRequest> getRequests() {
    return requests;
  }


  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequests(List<ApiRequest> requests) {
    this.requests = requests;
  }


  public ApiTestResponse sslVersionId(TestSslVersionId sslVersionId) {
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


  public ApiTestResponse targetTime(Integer targetTime) {
    this.targetTime = targetTime;
    return this;
  }

   /**
   * Target time for completion metric, defaults to 50% of time limit specified in seconds. (0 means default behavior)
   * minimum: 0
   * maximum: 60
   * @return targetTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTargetTime() {
    return targetTime;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetTime(Integer targetTime) {
    this.targetTime = targetTime;
  }


  public ApiTestResponse timeLimit(Integer timeLimit) {
    this.timeLimit = timeLimit;
    return this;
  }

   /**
   * Time limit for transaction in seconds. Exceeding this limit will result in a Timeout error.
   * minimum: 5
   * maximum: 180
   * @return timeLimit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimeLimit() {
    return timeLimit;
  }


  @JsonProperty(JSON_PROPERTY_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeLimit(Integer timeLimit) {
    this.timeLimit = timeLimit;
  }


  public ApiTestResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Target for the test.
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


  public ApiTestResponse credentials(List<String> credentials) {
    this.credentials = credentials;
    return this;
  }

  public ApiTestResponse addCredentialsItem(String credentialsItem) {
    if (this.credentials == null) {
      this.credentials = new ArrayList<>();
    }
    this.credentials.add(credentialsItem);
    return this;
  }

   /**
   * Contains a list of credential IDs (get &#x60;credentialId&#x60; from &#x60;/credentials&#x60; endpoint).
   * @return credentials
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREDENTIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCredentials() {
    return credentials;
  }


  @JsonProperty(JSON_PROPERTY_CREDENTIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredentials(List<String> credentials) {
    this.credentials = credentials;
  }


  public ApiTestResponse bgpMeasurements(Boolean bgpMeasurements) {
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


  public ApiTestResponse usePublicBgp(Boolean usePublicBgp) {
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




  public ApiTestResponse agents(List<AgentResponse> agents) {
    this.agents = agents;
    return this;
  }

  public ApiTestResponse addAgentsItem(AgentResponse agentsItem) {
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
   * Return true if this ApiTestResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiTestResponse apiTestResponse = (ApiTestResponse) o;
    return Objects.equals(this.interval, apiTestResponse.interval) &&
        Objects.equals(this.alertsEnabled, apiTestResponse.alertsEnabled) &&
        Objects.equals(this.enabled, apiTestResponse.enabled) &&
        Objects.equals(this.alertRules, apiTestResponse.alertRules) &&
        Objects.equals(this.createdBy, apiTestResponse.createdBy) &&
        Objects.equals(this.createdDate, apiTestResponse.createdDate) &&
        Objects.equals(this.description, apiTestResponse.description) &&
        Objects.equals(this.liveShare, apiTestResponse.liveShare) &&
        Objects.equals(this.modifiedBy, apiTestResponse.modifiedBy) &&
        Objects.equals(this.modifiedDate, apiTestResponse.modifiedDate) &&
        Objects.equals(this.savedEvent, apiTestResponse.savedEvent) &&
        Objects.equals(this.testId, apiTestResponse.testId) &&
        Objects.equals(this.testName, apiTestResponse.testName) &&
        Objects.equals(this.type, apiTestResponse.type) &&
        Objects.equals(this.links, apiTestResponse.links) &&
        Objects.equals(this.labels, apiTestResponse.labels) &&
        Objects.equals(this.sharedWithAccounts, apiTestResponse.sharedWithAccounts) &&
        Objects.equals(this.followRedirects, apiTestResponse.followRedirects) &&
        Objects.equals(this.mtuMeasurements, apiTestResponse.mtuMeasurements) &&
        Objects.equals(this.networkMeasurements, apiTestResponse.networkMeasurements) &&
        Objects.equals(this.numPathTraces, apiTestResponse.numPathTraces) &&
        Objects.equals(this.pathTraceMode, apiTestResponse.pathTraceMode) &&
        Objects.equals(this.predefinedVariables, apiTestResponse.predefinedVariables) &&
        Objects.equals(this.probeMode, apiTestResponse.probeMode) &&
        Objects.equals(this.protocol, apiTestResponse.protocol) &&
        Objects.equals(this.requests, apiTestResponse.requests) &&
        Objects.equals(this.sslVersionId, apiTestResponse.sslVersionId) &&
        Objects.equals(this.targetTime, apiTestResponse.targetTime) &&
        Objects.equals(this.timeLimit, apiTestResponse.timeLimit) &&
        Objects.equals(this.url, apiTestResponse.url) &&
        Objects.equals(this.credentials, apiTestResponse.credentials) &&
        Objects.equals(this.bgpMeasurements, apiTestResponse.bgpMeasurements) &&
        Objects.equals(this.usePublicBgp, apiTestResponse.usePublicBgp) &&
        Objects.equals(this.monitors, apiTestResponse.monitors) &&
        Objects.equals(this.agents, apiTestResponse.agents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, alertsEnabled, enabled, alertRules, createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, labels, sharedWithAccounts, followRedirects, mtuMeasurements, networkMeasurements, numPathTraces, pathTraceMode, predefinedVariables, probeMode, protocol, requests, sslVersionId, targetTime, timeLimit, url, credentials, bgpMeasurements, usePublicBgp, monitors, agents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiTestResponse {\n");
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
    sb.append("    followRedirects: ").append(toIndentedString(followRedirects)).append("\n");
    sb.append("    mtuMeasurements: ").append(toIndentedString(mtuMeasurements)).append("\n");
    sb.append("    networkMeasurements: ").append(toIndentedString(networkMeasurements)).append("\n");
    sb.append("    numPathTraces: ").append(toIndentedString(numPathTraces)).append("\n");
    sb.append("    pathTraceMode: ").append(toIndentedString(pathTraceMode)).append("\n");
    sb.append("    predefinedVariables: ").append(toIndentedString(predefinedVariables)).append("\n");
    sb.append("    probeMode: ").append(toIndentedString(probeMode)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    sslVersionId: ").append(toIndentedString(sslVersionId)).append("\n");
    sb.append("    targetTime: ").append(toIndentedString(targetTime)).append("\n");
    sb.append("    timeLimit: ").append(toIndentedString(timeLimit)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    bgpMeasurements: ").append(toIndentedString(bgpMeasurements)).append("\n");
    sb.append("    usePublicBgp: ").append(toIndentedString(usePublicBgp)).append("\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
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

