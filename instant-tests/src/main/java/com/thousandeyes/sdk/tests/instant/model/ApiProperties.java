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
import com.thousandeyes.sdk.tests.instant.model.ApiPredefinedVariable;
import com.thousandeyes.sdk.tests.instant.model.ApiRequest;
import com.thousandeyes.sdk.tests.instant.model.TestPathTraceMode;
import com.thousandeyes.sdk.tests.instant.model.TestProbeMode;
import com.thousandeyes.sdk.tests.instant.model.TestProtocol;
import com.thousandeyes.sdk.tests.instant.model.TestSslVersionId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiProperties
 */
@JsonPropertyOrder({
  ApiProperties.JSON_PROPERTY_COLLECT_PROXY_NETWORK_DATA,
  ApiProperties.JSON_PROPERTY_FOLLOW_REDIRECTS,
  ApiProperties.JSON_PROPERTY_MTU_MEASUREMENTS,
  ApiProperties.JSON_PROPERTY_NETWORK_MEASUREMENTS,
  ApiProperties.JSON_PROPERTY_NUM_PATH_TRACES,
  ApiProperties.JSON_PROPERTY_OVERRIDE_AGENT_PROXY,
  ApiProperties.JSON_PROPERTY_OVERRIDE_PROXY_ID,
  ApiProperties.JSON_PROPERTY_PATH_TRACE_MODE,
  ApiProperties.JSON_PROPERTY_PREDEFINED_VARIABLES,
  ApiProperties.JSON_PROPERTY_PROBE_MODE,
  ApiProperties.JSON_PROPERTY_PROTOCOL,
  ApiProperties.JSON_PROPERTY_REQUESTS,
  ApiProperties.JSON_PROPERTY_SSL_VERSION_ID,
  ApiProperties.JSON_PROPERTY_TARGET_TIME,
  ApiProperties.JSON_PROPERTY_TIME_LIMIT,
  ApiProperties.JSON_PROPERTY_URL,
  ApiProperties.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiProperties {
  public static final String JSON_PROPERTY_COLLECT_PROXY_NETWORK_DATA = "collectProxyNetworkData";
  private Boolean collectProxyNetworkData = false;

  public static final String JSON_PROPERTY_FOLLOW_REDIRECTS = "followRedirects";
  private Boolean followRedirects = true;

  public static final String JSON_PROPERTY_MTU_MEASUREMENTS = "mtuMeasurements";
  private Boolean mtuMeasurements;

  public static final String JSON_PROPERTY_NETWORK_MEASUREMENTS = "networkMeasurements";
  private Boolean networkMeasurements = true;

  public static final String JSON_PROPERTY_NUM_PATH_TRACES = "numPathTraces";
  private Integer numPathTraces = 3;

  public static final String JSON_PROPERTY_OVERRIDE_AGENT_PROXY = "overrideAgentProxy";
  private Boolean overrideAgentProxy = false;

  public static final String JSON_PROPERTY_OVERRIDE_PROXY_ID = "overrideProxyId";
  private String overrideProxyId;

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

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public ApiProperties() { 
  }

  @JsonCreator
  public ApiProperties(
    @JsonProperty(JSON_PROPERTY_TYPE) String type
  ) {
  this();
    this.type = type;
  }

  public ApiProperties collectProxyNetworkData(Boolean collectProxyNetworkData) {
    this.collectProxyNetworkData = collectProxyNetworkData;
    return this;
  }

   /**
   * Indicates whether network data to the proxy should be collected.
   * @return collectProxyNetworkData
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLLECT_PROXY_NETWORK_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCollectProxyNetworkData() {
    return collectProxyNetworkData;
  }


  @JsonProperty(JSON_PROPERTY_COLLECT_PROXY_NETWORK_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollectProxyNetworkData(Boolean collectProxyNetworkData) {
    this.collectProxyNetworkData = collectProxyNetworkData;
  }


  public ApiProperties followRedirects(Boolean followRedirects) {
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


  public ApiProperties mtuMeasurements(Boolean mtuMeasurements) {
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


  public ApiProperties networkMeasurements(Boolean networkMeasurements) {
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


  public ApiProperties numPathTraces(Integer numPathTraces) {
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


  public ApiProperties overrideAgentProxy(Boolean overrideAgentProxy) {
    this.overrideAgentProxy = overrideAgentProxy;
    return this;
  }

   /**
   * Flag indicating if a proxy other than the default should be used. To override the default proxy for agents, set to &#x60;true&#x60; and specify a value for &#x60;overrideProxyId&#x60;.
   * @return overrideAgentProxy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERRIDE_AGENT_PROXY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOverrideAgentProxy() {
    return overrideAgentProxy;
  }


  @JsonProperty(JSON_PROPERTY_OVERRIDE_AGENT_PROXY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverrideAgentProxy(Boolean overrideAgentProxy) {
    this.overrideAgentProxy = overrideAgentProxy;
  }


  public ApiProperties overrideProxyId(String overrideProxyId) {
    this.overrideProxyId = overrideProxyId;
    return this;
  }

   /**
   * ID of the proxy to be used if the default proxy is overridden.
   * @return overrideProxyId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERRIDE_PROXY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOverrideProxyId() {
    return overrideProxyId;
  }


  @JsonProperty(JSON_PROPERTY_OVERRIDE_PROXY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverrideProxyId(String overrideProxyId) {
    this.overrideProxyId = overrideProxyId;
  }


  public ApiProperties pathTraceMode(TestPathTraceMode pathTraceMode) {
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


  public ApiProperties predefinedVariables(List<ApiPredefinedVariable> predefinedVariables) {
    this.predefinedVariables = predefinedVariables;
    return this;
  }

  public ApiProperties addPredefinedVariablesItem(ApiPredefinedVariable predefinedVariablesItem) {
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


  public ApiProperties probeMode(TestProbeMode probeMode) {
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


  public ApiProperties protocol(TestProtocol protocol) {
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


  public ApiProperties requests(List<ApiRequest> requests) {
    this.requests = requests;
    return this;
  }

  public ApiProperties addRequestsItem(ApiRequest requestsItem) {
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


  public ApiProperties sslVersionId(TestSslVersionId sslVersionId) {
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


  public ApiProperties targetTime(Integer targetTime) {
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


  public ApiProperties timeLimit(Integer timeLimit) {
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


  public ApiProperties url(String url) {
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




  /**
   * Return true if this ApiProperties object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiProperties apiProperties = (ApiProperties) o;
    return Objects.equals(this.collectProxyNetworkData, apiProperties.collectProxyNetworkData) &&
        Objects.equals(this.followRedirects, apiProperties.followRedirects) &&
        Objects.equals(this.mtuMeasurements, apiProperties.mtuMeasurements) &&
        Objects.equals(this.networkMeasurements, apiProperties.networkMeasurements) &&
        Objects.equals(this.numPathTraces, apiProperties.numPathTraces) &&
        Objects.equals(this.overrideAgentProxy, apiProperties.overrideAgentProxy) &&
        Objects.equals(this.overrideProxyId, apiProperties.overrideProxyId) &&
        Objects.equals(this.pathTraceMode, apiProperties.pathTraceMode) &&
        Objects.equals(this.predefinedVariables, apiProperties.predefinedVariables) &&
        Objects.equals(this.probeMode, apiProperties.probeMode) &&
        Objects.equals(this.protocol, apiProperties.protocol) &&
        Objects.equals(this.requests, apiProperties.requests) &&
        Objects.equals(this.sslVersionId, apiProperties.sslVersionId) &&
        Objects.equals(this.targetTime, apiProperties.targetTime) &&
        Objects.equals(this.timeLimit, apiProperties.timeLimit) &&
        Objects.equals(this.url, apiProperties.url) &&
        Objects.equals(this.type, apiProperties.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectProxyNetworkData, followRedirects, mtuMeasurements, networkMeasurements, numPathTraces, overrideAgentProxy, overrideProxyId, pathTraceMode, predefinedVariables, probeMode, protocol, requests, sslVersionId, targetTime, timeLimit, url, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiProperties {\n");
    sb.append("    collectProxyNetworkData: ").append(toIndentedString(collectProxyNetworkData)).append("\n");
    sb.append("    followRedirects: ").append(toIndentedString(followRedirects)).append("\n");
    sb.append("    mtuMeasurements: ").append(toIndentedString(mtuMeasurements)).append("\n");
    sb.append("    networkMeasurements: ").append(toIndentedString(networkMeasurements)).append("\n");
    sb.append("    numPathTraces: ").append(toIndentedString(numPathTraces)).append("\n");
    sb.append("    overrideAgentProxy: ").append(toIndentedString(overrideAgentProxy)).append("\n");
    sb.append("    overrideProxyId: ").append(toIndentedString(overrideProxyId)).append("\n");
    sb.append("    pathTraceMode: ").append(toIndentedString(pathTraceMode)).append("\n");
    sb.append("    predefinedVariables: ").append(toIndentedString(predefinedVariables)).append("\n");
    sb.append("    probeMode: ").append(toIndentedString(probeMode)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    sslVersionId: ").append(toIndentedString(sslVersionId)).append("\n");
    sb.append("    targetTime: ").append(toIndentedString(targetTime)).append("\n");
    sb.append("    timeLimit: ").append(toIndentedString(timeLimit)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

