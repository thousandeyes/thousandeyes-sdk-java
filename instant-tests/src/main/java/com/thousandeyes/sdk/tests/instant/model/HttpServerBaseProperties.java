/*
 * Instant Tests API
 * The Instant Tests API operations lets you create and run new instant tests. You will need to be an Account Admin.  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
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
import com.thousandeyes.sdk.tests.instant.model.AgentInterfaces;
import com.thousandeyes.sdk.tests.instant.model.OAuth;
import com.thousandeyes.sdk.tests.instant.model.TestAuthType;
import com.thousandeyes.sdk.tests.instant.model.TestCustomHeaders;
import com.thousandeyes.sdk.tests.instant.model.TestPathTraceMode;
import com.thousandeyes.sdk.tests.instant.model.TestProbeMode;
import com.thousandeyes.sdk.tests.instant.model.TestProtocol;
import com.thousandeyes.sdk.tests.instant.model.TestSslVersionId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * HttpServerBaseProperties
 */
@JsonPropertyOrder({
  HttpServerBaseProperties.JSON_PROPERTY_AUTH_TYPE,
  HttpServerBaseProperties.JSON_PROPERTY_AGENT_INTERFACES,
  HttpServerBaseProperties.JSON_PROPERTY_BANDWIDTH_MEASUREMENTS,
  HttpServerBaseProperties.JSON_PROPERTY_CLIENT_CERTIFICATE,
  HttpServerBaseProperties.JSON_PROPERTY_CONTENT_REGEX,
  HttpServerBaseProperties.JSON_PROPERTY_CUSTOM_HEADERS,
  HttpServerBaseProperties.JSON_PROPERTY_DESIRED_STATUS_CODE,
  HttpServerBaseProperties.JSON_PROPERTY_DOWNLOAD_LIMIT,
  HttpServerBaseProperties.JSON_PROPERTY_DNS_OVERRIDE,
  HttpServerBaseProperties.JSON_PROPERTY_HTTP_TARGET_TIME,
  HttpServerBaseProperties.JSON_PROPERTY_HTTP_TIME_LIMIT,
  HttpServerBaseProperties.JSON_PROPERTY_HTTP_VERSION,
  HttpServerBaseProperties.JSON_PROPERTY_INCLUDE_HEADERS,
  HttpServerBaseProperties.JSON_PROPERTY_MTU_MEASUREMENTS,
  HttpServerBaseProperties.JSON_PROPERTY_NETWORK_MEASUREMENTS,
  HttpServerBaseProperties.JSON_PROPERTY_NUM_PATH_TRACES,
  HttpServerBaseProperties.JSON_PROPERTY_O_AUTH,
  HttpServerBaseProperties.JSON_PROPERTY_PASSWORD,
  HttpServerBaseProperties.JSON_PROPERTY_PATH_TRACE_MODE,
  HttpServerBaseProperties.JSON_PROPERTY_PROBE_MODE,
  HttpServerBaseProperties.JSON_PROPERTY_PROTOCOL,
  HttpServerBaseProperties.JSON_PROPERTY_SSL_VERSION,
  HttpServerBaseProperties.JSON_PROPERTY_SSL_VERSION_ID,
  HttpServerBaseProperties.JSON_PROPERTY_URL,
  HttpServerBaseProperties.JSON_PROPERTY_USE_NTLM,
  HttpServerBaseProperties.JSON_PROPERTY_USER_AGENT,
  HttpServerBaseProperties.JSON_PROPERTY_USERNAME,
  HttpServerBaseProperties.JSON_PROPERTY_VERIFY_CERTIFICATE,
  HttpServerBaseProperties.JSON_PROPERTY_ALLOW_UNSAFE_LEGACY_RENEGOTIATION,
  HttpServerBaseProperties.JSON_PROPERTY_FOLLOW_REDIRECTS,
  HttpServerBaseProperties.JSON_PROPERTY_FIXED_PACKET_RATE,
  HttpServerBaseProperties.JSON_PROPERTY_OVERRIDE_AGENT_PROXY,
  HttpServerBaseProperties.JSON_PROPERTY_OVERRIDE_PROXY_ID,
  HttpServerBaseProperties.JSON_PROPERTY_COLLECT_PROXY_NETWORK_DATA
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class HttpServerBaseProperties {
  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private TestAuthType authType = TestAuthType.NONE;

  public static final String JSON_PROPERTY_AGENT_INTERFACES = "agentInterfaces";
  private AgentInterfaces agentInterfaces;

  public static final String JSON_PROPERTY_BANDWIDTH_MEASUREMENTS = "bandwidthMeasurements";
  private Boolean bandwidthMeasurements;

  public static final String JSON_PROPERTY_CLIENT_CERTIFICATE = "clientCertificate";
  private String clientCertificate;

  public static final String JSON_PROPERTY_CONTENT_REGEX = "contentRegex";
  private String contentRegex;

  public static final String JSON_PROPERTY_CUSTOM_HEADERS = "customHeaders";
  private TestCustomHeaders customHeaders;

  public static final String JSON_PROPERTY_DESIRED_STATUS_CODE = "desiredStatusCode";
  private String desiredStatusCode = "default";

  public static final String JSON_PROPERTY_DOWNLOAD_LIMIT = "downloadLimit";
  private Integer downloadLimit;

  public static final String JSON_PROPERTY_DNS_OVERRIDE = "dnsOverride";
  private String dnsOverride;

  public static final String JSON_PROPERTY_HTTP_TARGET_TIME = "httpTargetTime";
  private Integer httpTargetTime;

  public static final String JSON_PROPERTY_HTTP_TIME_LIMIT = "httpTimeLimit";
  private Integer httpTimeLimit = 5;

  public static final String JSON_PROPERTY_HTTP_VERSION = "httpVersion";
  private Integer httpVersion = 2;

  public static final String JSON_PROPERTY_INCLUDE_HEADERS = "includeHeaders";
  private Boolean includeHeaders = true;

  public static final String JSON_PROPERTY_MTU_MEASUREMENTS = "mtuMeasurements";
  private Boolean mtuMeasurements;

  public static final String JSON_PROPERTY_NETWORK_MEASUREMENTS = "networkMeasurements";
  private Boolean networkMeasurements = true;

  public static final String JSON_PROPERTY_NUM_PATH_TRACES = "numPathTraces";
  private Integer numPathTraces = 3;

  public static final String JSON_PROPERTY_O_AUTH = "oAuth";
  private OAuth oAuth;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_PATH_TRACE_MODE = "pathTraceMode";
  private TestPathTraceMode pathTraceMode = TestPathTraceMode.CLASSIC;

  public static final String JSON_PROPERTY_PROBE_MODE = "probeMode";
  private TestProbeMode probeMode = TestProbeMode.AUTO;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private TestProtocol protocol = TestProtocol.TCP;

  public static final String JSON_PROPERTY_SSL_VERSION = "sslVersion";
  private String sslVersion;

  public static final String JSON_PROPERTY_SSL_VERSION_ID = "sslVersionId";
  private TestSslVersionId sslVersionId = TestSslVersionId._0;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_USE_NTLM = "useNtlm";
  private Boolean useNtlm;

  public static final String JSON_PROPERTY_USER_AGENT = "userAgent";
  private String userAgent;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_VERIFY_CERTIFICATE = "verifyCertificate";
  private Boolean verifyCertificate = false;

  public static final String JSON_PROPERTY_ALLOW_UNSAFE_LEGACY_RENEGOTIATION = "allowUnsafeLegacyRenegotiation";
  private Boolean allowUnsafeLegacyRenegotiation = true;

  public static final String JSON_PROPERTY_FOLLOW_REDIRECTS = "followRedirects";
  private Boolean followRedirects = true;

  public static final String JSON_PROPERTY_FIXED_PACKET_RATE = "fixedPacketRate";
  private Integer fixedPacketRate;

  public static final String JSON_PROPERTY_OVERRIDE_AGENT_PROXY = "overrideAgentProxy";
  private Boolean overrideAgentProxy = false;

  public static final String JSON_PROPERTY_OVERRIDE_PROXY_ID = "overrideProxyId";
  private String overrideProxyId;

  public static final String JSON_PROPERTY_COLLECT_PROXY_NETWORK_DATA = "collectProxyNetworkData";
  private Boolean collectProxyNetworkData = false;

  public HttpServerBaseProperties() { 
  }

  @JsonCreator
  public HttpServerBaseProperties(
    @JsonProperty(JSON_PROPERTY_SSL_VERSION) String sslVersion
  ) {
  this();
    this.sslVersion = sslVersion;
  }

  public HttpServerBaseProperties authType(TestAuthType authType) {
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

  public TestAuthType getAuthType() {
    return authType;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthType(TestAuthType authType) {
    this.authType = authType;
  }


  public HttpServerBaseProperties agentInterfaces(AgentInterfaces agentInterfaces) {
    this.agentInterfaces = agentInterfaces;
    return this;
  }

   /**
   * Get agentInterfaces
   * @return agentInterfaces
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_INTERFACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AgentInterfaces getAgentInterfaces() {
    return agentInterfaces;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_INTERFACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentInterfaces(AgentInterfaces agentInterfaces) {
    this.agentInterfaces = agentInterfaces;
  }


  public HttpServerBaseProperties bandwidthMeasurements(Boolean bandwidthMeasurements) {
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


  public HttpServerBaseProperties clientCertificate(String clientCertificate) {
    this.clientCertificate = clientCertificate;
    return this;
  }

   /**
   * String representation (containing newline characters) of client certificate, the private key must be placed first, then the certificate.
   * @return clientCertificate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientCertificate() {
    return clientCertificate;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientCertificate(String clientCertificate) {
    this.clientCertificate = clientCertificate;
  }


  public HttpServerBaseProperties contentRegex(String contentRegex) {
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


  public HttpServerBaseProperties customHeaders(TestCustomHeaders customHeaders) {
    this.customHeaders = customHeaders;
    return this;
  }

   /**
   * Get customHeaders
   * @return customHeaders
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestCustomHeaders getCustomHeaders() {
    return customHeaders;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomHeaders(TestCustomHeaders customHeaders) {
    this.customHeaders = customHeaders;
  }


  public HttpServerBaseProperties desiredStatusCode(String desiredStatusCode) {
    this.desiredStatusCode = desiredStatusCode;
    return this;
  }

   /**
   * Specify the HTTP status code value that indicates a successful response. The default value accepts any 2xx or 3xx status code.
   * @return desiredStatusCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESIRED_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDesiredStatusCode() {
    return desiredStatusCode;
  }


  @JsonProperty(JSON_PROPERTY_DESIRED_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesiredStatusCode(String desiredStatusCode) {
    this.desiredStatusCode = desiredStatusCode;
  }


  public HttpServerBaseProperties downloadLimit(Integer downloadLimit) {
    this.downloadLimit = downloadLimit;
    return this;
  }

   /**
   * Specifies maximum number of bytes to download from the target object.
   * @return downloadLimit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDownloadLimit() {
    return downloadLimit;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownloadLimit(Integer downloadLimit) {
    this.downloadLimit = downloadLimit;
  }


  public HttpServerBaseProperties dnsOverride(String dnsOverride) {
    this.dnsOverride = dnsOverride;
    return this;
  }

   /**
   * IP address to use for DNS override.
   * @return dnsOverride
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDnsOverride() {
    return dnsOverride;
  }


  @JsonProperty(JSON_PROPERTY_DNS_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDnsOverride(String dnsOverride) {
    this.dnsOverride = dnsOverride;
  }


  public HttpServerBaseProperties httpTargetTime(Integer httpTargetTime) {
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


  public HttpServerBaseProperties httpTimeLimit(Integer httpTimeLimit) {
    this.httpTimeLimit = httpTimeLimit;
    return this;
  }

   /**
   * HTTP time limit in seconds.
   * minimum: 5
   * maximum: 60
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


  public HttpServerBaseProperties httpVersion(Integer httpVersion) {
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


  public HttpServerBaseProperties includeHeaders(Boolean includeHeaders) {
    this.includeHeaders = includeHeaders;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to capture response headers for objects loaded by the test.
   * @return includeHeaders
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeHeaders() {
    return includeHeaders;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeHeaders(Boolean includeHeaders) {
    this.includeHeaders = includeHeaders;
  }


  public HttpServerBaseProperties mtuMeasurements(Boolean mtuMeasurements) {
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


  public HttpServerBaseProperties networkMeasurements(Boolean networkMeasurements) {
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


  public HttpServerBaseProperties numPathTraces(Integer numPathTraces) {
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


  public HttpServerBaseProperties oAuth(OAuth oAuth) {
    this.oAuth = oAuth;
    return this;
  }

   /**
   * Get oAuth
   * @return oAuth
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_O_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OAuth getoAuth() {
    return oAuth;
  }


  @JsonProperty(JSON_PROPERTY_O_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setoAuth(OAuth oAuth) {
    this.oAuth = oAuth;
  }


  public HttpServerBaseProperties password(String password) {
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


  public HttpServerBaseProperties pathTraceMode(TestPathTraceMode pathTraceMode) {
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


  public HttpServerBaseProperties probeMode(TestProbeMode probeMode) {
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


  public HttpServerBaseProperties protocol(TestProtocol protocol) {
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




  public HttpServerBaseProperties sslVersionId(TestSslVersionId sslVersionId) {
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


  public HttpServerBaseProperties url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Target for the test.
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


  public HttpServerBaseProperties useNtlm(Boolean useNtlm) {
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


  public HttpServerBaseProperties userAgent(String userAgent) {
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


  public HttpServerBaseProperties username(String username) {
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


  public HttpServerBaseProperties verifyCertificate(Boolean verifyCertificate) {
    this.verifyCertificate = verifyCertificate;
    return this;
  }

   /**
   * Ignore or acknowledge certificate errors. Set to false to ignore certificate errors.
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


  public HttpServerBaseProperties allowUnsafeLegacyRenegotiation(Boolean allowUnsafeLegacyRenegotiation) {
    this.allowUnsafeLegacyRenegotiation = allowUnsafeLegacyRenegotiation;
    return this;
  }

   /**
   * Allows TLS renegotiation with servers not supporting RFC 5746. Default Set to true to allow unsafe legacy renegotiation.
   * @return allowUnsafeLegacyRenegotiation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_UNSAFE_LEGACY_RENEGOTIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowUnsafeLegacyRenegotiation() {
    return allowUnsafeLegacyRenegotiation;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_UNSAFE_LEGACY_RENEGOTIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowUnsafeLegacyRenegotiation(Boolean allowUnsafeLegacyRenegotiation) {
    this.allowUnsafeLegacyRenegotiation = allowUnsafeLegacyRenegotiation;
  }


  public HttpServerBaseProperties followRedirects(Boolean followRedirects) {
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


  public HttpServerBaseProperties fixedPacketRate(Integer fixedPacketRate) {
    this.fixedPacketRate = fixedPacketRate;
    return this;
  }

   /**
   * Sets packets rate sent to measure the network in packets per second.
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


  public HttpServerBaseProperties overrideAgentProxy(Boolean overrideAgentProxy) {
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


  public HttpServerBaseProperties overrideProxyId(String overrideProxyId) {
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


  public HttpServerBaseProperties collectProxyNetworkData(Boolean collectProxyNetworkData) {
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


  /**
   * Return true if this HttpServerBaseProperties object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpServerBaseProperties httpServerBaseProperties = (HttpServerBaseProperties) o;
    return Objects.equals(this.authType, httpServerBaseProperties.authType) &&
        Objects.equals(this.agentInterfaces, httpServerBaseProperties.agentInterfaces) &&
        Objects.equals(this.bandwidthMeasurements, httpServerBaseProperties.bandwidthMeasurements) &&
        Objects.equals(this.clientCertificate, httpServerBaseProperties.clientCertificate) &&
        Objects.equals(this.contentRegex, httpServerBaseProperties.contentRegex) &&
        Objects.equals(this.customHeaders, httpServerBaseProperties.customHeaders) &&
        Objects.equals(this.desiredStatusCode, httpServerBaseProperties.desiredStatusCode) &&
        Objects.equals(this.downloadLimit, httpServerBaseProperties.downloadLimit) &&
        Objects.equals(this.dnsOverride, httpServerBaseProperties.dnsOverride) &&
        Objects.equals(this.httpTargetTime, httpServerBaseProperties.httpTargetTime) &&
        Objects.equals(this.httpTimeLimit, httpServerBaseProperties.httpTimeLimit) &&
        Objects.equals(this.httpVersion, httpServerBaseProperties.httpVersion) &&
        Objects.equals(this.includeHeaders, httpServerBaseProperties.includeHeaders) &&
        Objects.equals(this.mtuMeasurements, httpServerBaseProperties.mtuMeasurements) &&
        Objects.equals(this.networkMeasurements, httpServerBaseProperties.networkMeasurements) &&
        Objects.equals(this.numPathTraces, httpServerBaseProperties.numPathTraces) &&
        Objects.equals(this.oAuth, httpServerBaseProperties.oAuth) &&
        Objects.equals(this.password, httpServerBaseProperties.password) &&
        Objects.equals(this.pathTraceMode, httpServerBaseProperties.pathTraceMode) &&
        Objects.equals(this.probeMode, httpServerBaseProperties.probeMode) &&
        Objects.equals(this.protocol, httpServerBaseProperties.protocol) &&
        Objects.equals(this.sslVersion, httpServerBaseProperties.sslVersion) &&
        Objects.equals(this.sslVersionId, httpServerBaseProperties.sslVersionId) &&
        Objects.equals(this.url, httpServerBaseProperties.url) &&
        Objects.equals(this.useNtlm, httpServerBaseProperties.useNtlm) &&
        Objects.equals(this.userAgent, httpServerBaseProperties.userAgent) &&
        Objects.equals(this.username, httpServerBaseProperties.username) &&
        Objects.equals(this.verifyCertificate, httpServerBaseProperties.verifyCertificate) &&
        Objects.equals(this.allowUnsafeLegacyRenegotiation, httpServerBaseProperties.allowUnsafeLegacyRenegotiation) &&
        Objects.equals(this.followRedirects, httpServerBaseProperties.followRedirects) &&
        Objects.equals(this.fixedPacketRate, httpServerBaseProperties.fixedPacketRate) &&
        Objects.equals(this.overrideAgentProxy, httpServerBaseProperties.overrideAgentProxy) &&
        Objects.equals(this.overrideProxyId, httpServerBaseProperties.overrideProxyId) &&
        Objects.equals(this.collectProxyNetworkData, httpServerBaseProperties.collectProxyNetworkData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, agentInterfaces, bandwidthMeasurements, clientCertificate, contentRegex, customHeaders, desiredStatusCode, downloadLimit, dnsOverride, httpTargetTime, httpTimeLimit, httpVersion, includeHeaders, mtuMeasurements, networkMeasurements, numPathTraces, oAuth, password, pathTraceMode, probeMode, protocol, sslVersion, sslVersionId, url, useNtlm, userAgent, username, verifyCertificate, allowUnsafeLegacyRenegotiation, followRedirects, fixedPacketRate, overrideAgentProxy, overrideProxyId, collectProxyNetworkData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpServerBaseProperties {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    agentInterfaces: ").append(toIndentedString(agentInterfaces)).append("\n");
    sb.append("    bandwidthMeasurements: ").append(toIndentedString(bandwidthMeasurements)).append("\n");
    sb.append("    clientCertificate: ").append(toIndentedString(clientCertificate)).append("\n");
    sb.append("    contentRegex: ").append(toIndentedString(contentRegex)).append("\n");
    sb.append("    customHeaders: ").append(toIndentedString(customHeaders)).append("\n");
    sb.append("    desiredStatusCode: ").append(toIndentedString(desiredStatusCode)).append("\n");
    sb.append("    downloadLimit: ").append(toIndentedString(downloadLimit)).append("\n");
    sb.append("    dnsOverride: ").append(toIndentedString(dnsOverride)).append("\n");
    sb.append("    httpTargetTime: ").append(toIndentedString(httpTargetTime)).append("\n");
    sb.append("    httpTimeLimit: ").append(toIndentedString(httpTimeLimit)).append("\n");
    sb.append("    httpVersion: ").append(toIndentedString(httpVersion)).append("\n");
    sb.append("    includeHeaders: ").append(toIndentedString(includeHeaders)).append("\n");
    sb.append("    mtuMeasurements: ").append(toIndentedString(mtuMeasurements)).append("\n");
    sb.append("    networkMeasurements: ").append(toIndentedString(networkMeasurements)).append("\n");
    sb.append("    numPathTraces: ").append(toIndentedString(numPathTraces)).append("\n");
    sb.append("    oAuth: ").append(toIndentedString(oAuth)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    pathTraceMode: ").append(toIndentedString(pathTraceMode)).append("\n");
    sb.append("    probeMode: ").append(toIndentedString(probeMode)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    sslVersion: ").append(toIndentedString(sslVersion)).append("\n");
    sb.append("    sslVersionId: ").append(toIndentedString(sslVersionId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    useNtlm: ").append(toIndentedString(useNtlm)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    verifyCertificate: ").append(toIndentedString(verifyCertificate)).append("\n");
    sb.append("    allowUnsafeLegacyRenegotiation: ").append(toIndentedString(allowUnsafeLegacyRenegotiation)).append("\n");
    sb.append("    followRedirects: ").append(toIndentedString(followRedirects)).append("\n");
    sb.append("    fixedPacketRate: ").append(toIndentedString(fixedPacketRate)).append("\n");
    sb.append("    overrideAgentProxy: ").append(toIndentedString(overrideAgentProxy)).append("\n");
    sb.append("    overrideProxyId: ").append(toIndentedString(overrideProxyId)).append("\n");
    sb.append("    collectProxyNetworkData: ").append(toIndentedString(collectProxyNetworkData)).append("\n");
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

