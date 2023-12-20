/*
 * Endpoint Tests API
 *  ## Overview Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.endpoint.tests.model.EndpointAgentSelectorConfig;
import com.thousandeyes.api.endpoint.tests.model.EndpointHttpServerType;
import com.thousandeyes.api.endpoint.tests.model.EndpointTestAid;
import com.thousandeyes.api.endpoint.tests.model.EndpointTestAuthType;
import com.thousandeyes.api.endpoint.tests.model.EndpointTestProtocol;
import com.thousandeyes.api.endpoint.tests.model.SelfLinksLinks;
import com.thousandeyes.api.endpoint.tests.model.TestInterval;
import com.thousandeyes.api.endpoint.tests.model.TestProbeMode;
import com.thousandeyes.api.endpoint.tests.model.TestSslVersionId;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;

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

import com.thousandeyes.api.endpoint.JSON;

/**
 * GetEndpointHttpserverTestDetail200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:32.432392Z[Europe/Lisbon]")
public class GetEndpointHttpserverTestDetail200Response {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public static final String SERIALIZED_NAME_AGENT_SELECTOR_CONFIG = "agentSelectorConfig";
  @SerializedName(SERIALIZED_NAME_AGENT_SELECTOR_CONFIG)
  private EndpointAgentSelectorConfig agentSelectorConfig;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private TestInterval interval;

  public static final String SERIALIZED_NAME_IS_ENABLED = "isEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled = true;

  public static final String SERIALIZED_NAME_IS_SAVED_EVENT = "isSavedEvent";
  @SerializedName(SERIALIZED_NAME_IS_SAVED_EVENT)
  private Boolean isSavedEvent;

  public static final String SERIALIZED_NAME_HAS_PATH_TRACE_IN_SESSION = "hasPathTraceInSession";
  @SerializedName(SERIALIZED_NAME_HAS_PATH_TRACE_IN_SESSION)
  private Boolean hasPathTraceInSession;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_NETWORK_MEASUREMENTS = "networkMeasurements";
  @SerializedName(SERIALIZED_NAME_NETWORK_MEASUREMENTS)
  private Boolean networkMeasurements = true;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private EndpointTestProtocol protocol = EndpointTestProtocol.ICMP;

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public static final String SERIALIZED_NAME_TEST_ID = "testId";
  @SerializedName(SERIALIZED_NAME_TEST_ID)
  private String testId;

  public static final String SERIALIZED_NAME_AID = "aid";
  @SerializedName(SERIALIZED_NAME_AID)
  private EndpointTestAid aid;

  public static final String SERIALIZED_NAME_TEST_NAME = "testName";
  @SerializedName(SERIALIZED_NAME_TEST_NAME)
  private String testName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private EndpointHttpServerType type;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "authType";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private EndpointTestAuthType authType = EndpointTestAuthType.NONE;

  public static final String SERIALIZED_NAME_HTTP_TIME_LIMIT = "httpTimeLimit";
  @SerializedName(SERIALIZED_NAME_HTTP_TIME_LIMIT)
  private Integer httpTimeLimit;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_SSL_VERSION_ID = "sslVersionId";
  @SerializedName(SERIALIZED_NAME_SSL_VERSION_ID)
  private TestSslVersionId sslVersionId;

  public static final String SERIALIZED_NAME_TCP_PROBE_MODE = "tcpProbeMode";
  @SerializedName(SERIALIZED_NAME_TCP_PROBE_MODE)
  private TestProbeMode tcpProbeMode = TestProbeMode.AUTO;

  public static final String SERIALIZED_NAME_VERIFY_CERTIFICATE = "verifyCertificate";
  @SerializedName(SERIALIZED_NAME_VERIFY_CERTIFICATE)
  private Boolean verifyCertificate;

  public static final String SERIALIZED_NAME_CONTENT_REGEX = "contentRegex";
  @SerializedName(SERIALIZED_NAME_CONTENT_REGEX)
  private String contentRegex;

  public static final String SERIALIZED_NAME_FOLLOW_REDIRECTS = "followRedirects";
  @SerializedName(SERIALIZED_NAME_FOLLOW_REDIRECTS)
  private Boolean followRedirects = true;

  public static final String SERIALIZED_NAME_HTTP_TARGET_TIME = "httpTargetTime";
  @SerializedName(SERIALIZED_NAME_HTTP_TARGET_TIME)
  private Integer httpTargetTime;

  public static final String SERIALIZED_NAME_HTTP_VERSION = "httpVersion";
  @SerializedName(SERIALIZED_NAME_HTTP_VERSION)
  private Integer httpVersion = 2;

  public static final String SERIALIZED_NAME_POST_BODY = "postBody";
  @SerializedName(SERIALIZED_NAME_POST_BODY)
  private String postBody;

  public static final String SERIALIZED_NAME_SSL_VERSION = "sslVersion";
  @SerializedName(SERIALIZED_NAME_SSL_VERSION)
  private String sslVersion;

  public static final String SERIALIZED_NAME_USE_NTLM = "useNtlm";
  @SerializedName(SERIALIZED_NAME_USE_NTLM)
  private Boolean useNtlm;

  public static final String SERIALIZED_NAME_USER_AGENT = "userAgent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private String userAgent;

  public GetEndpointHttpserverTestDetail200Response() {
  }

  
  public GetEndpointHttpserverTestDetail200Response(
     OffsetDateTime createdDate, 
     Boolean isSavedEvent, 
     OffsetDateTime modifiedDate, 
     String testId, 
     String sslVersion
  ) {
    this();
    this.createdDate = createdDate;
    this.isSavedEvent = isSavedEvent;
    this.modifiedDate = modifiedDate;
    this.testId = testId;
    this.sslVersion = sslVersion;
  }

  public GetEndpointHttpserverTestDetail200Response links(SelfLinksLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public SelfLinksLinks getLinks() {
    return links;
  }


  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }


  public GetEndpointHttpserverTestDetail200Response agentSelectorConfig(EndpointAgentSelectorConfig agentSelectorConfig) {
    
    this.agentSelectorConfig = agentSelectorConfig;
    return this;
  }

   /**
   * Get agentSelectorConfig
   * @return agentSelectorConfig
  **/
  @javax.annotation.Nullable
  public EndpointAgentSelectorConfig getAgentSelectorConfig() {
    return agentSelectorConfig;
  }


  public void setAgentSelectorConfig(EndpointAgentSelectorConfig agentSelectorConfig) {
    this.agentSelectorConfig = agentSelectorConfig;
  }


   /**
   * UTC created date (ISO date-time format).
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




  public GetEndpointHttpserverTestDetail200Response interval(TestInterval interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @javax.annotation.Nullable
  public TestInterval getInterval() {
    return interval;
  }


  public void setInterval(TestInterval interval) {
    this.interval = interval;
  }


  public GetEndpointHttpserverTestDetail200Response isEnabled(Boolean isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Indicates if test is enabled.
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


   /**
   * Indicates if the test is a saved event.
   * @return isSavedEvent
  **/
  @javax.annotation.Nullable
  public Boolean getIsSavedEvent() {
    return isSavedEvent;
  }




  public GetEndpointHttpserverTestDetail200Response hasPathTraceInSession(Boolean hasPathTraceInSession) {
    
    this.hasPathTraceInSession = hasPathTraceInSession;
    return this;
  }

   /**
   * Enables \&quot;in session\&quot; path trace. When enabled, this option initiates a TCP session with the target server and sends path trace packets within the established TCP session.
   * @return hasPathTraceInSession
  **/
  @javax.annotation.Nullable
  public Boolean getHasPathTraceInSession() {
    return hasPathTraceInSession;
  }


  public void setHasPathTraceInSession(Boolean hasPathTraceInSession) {
    this.hasPathTraceInSession = hasPathTraceInSession;
  }


   /**
   * UTC last modification date (ISO date-time format).
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }




  public GetEndpointHttpserverTestDetail200Response networkMeasurements(Boolean networkMeasurements) {
    
    this.networkMeasurements = networkMeasurements;
    return this;
  }

   /**
   * Enable or disable network measurements. Set to true to enable or false to disable network measurements.
   * @return networkMeasurements
  **/
  @javax.annotation.Nullable
  public Boolean getNetworkMeasurements() {
    return networkMeasurements;
  }


  public void setNetworkMeasurements(Boolean networkMeasurements) {
    this.networkMeasurements = networkMeasurements;
  }


  public GetEndpointHttpserverTestDetail200Response port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Port number, if not specified, the port is selected based on a protocol (HTTP 80, HTTPS 443).
   * @return port
  **/
  @javax.annotation.Nullable
  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public GetEndpointHttpserverTestDetail200Response protocol(EndpointTestProtocol protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  public EndpointTestProtocol getProtocol() {
    return protocol;
  }


  public void setProtocol(EndpointTestProtocol protocol) {
    this.protocol = protocol;
  }


  public GetEndpointHttpserverTestDetail200Response server(String server) {
    
    this.server = server;
    return this;
  }

   /**
   * Target domain name or IP address.
   * @return server
  **/
  @javax.annotation.Nullable
  public String getServer() {
    return server;
  }


  public void setServer(String server) {
    this.server = server;
  }


   /**
   * Each test is assigned a unique ID to access test data from other endpoints.
   * @return testId
  **/
  @javax.annotation.Nullable
  public String getTestId() {
    return testId;
  }




  public GetEndpointHttpserverTestDetail200Response aid(EndpointTestAid aid) {
    
    this.aid = aid;
    return this;
  }

   /**
   * Get aid
   * @return aid
  **/
  @javax.annotation.Nullable
  public EndpointTestAid getAid() {
    return aid;
  }


  public void setAid(EndpointTestAid aid) {
    this.aid = aid;
  }


  public GetEndpointHttpserverTestDetail200Response testName(String testName) {
    
    this.testName = testName;
    return this;
  }

   /**
   * Name of the test.
   * @return testName
  **/
  @javax.annotation.Nullable
  public String getTestName() {
    return testName;
  }


  public void setTestName(String testName) {
    this.testName = testName;
  }


  public GetEndpointHttpserverTestDetail200Response type(EndpointHttpServerType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public EndpointHttpServerType getType() {
    return type;
  }


  public void setType(EndpointHttpServerType type) {
    this.type = type;
  }


  public GetEndpointHttpserverTestDetail200Response authType(EndpointTestAuthType authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @javax.annotation.Nullable
  public EndpointTestAuthType getAuthType() {
    return authType;
  }


  public void setAuthType(EndpointTestAuthType authType) {
    this.authType = authType;
  }


  public GetEndpointHttpserverTestDetail200Response httpTimeLimit(Integer httpTimeLimit) {
    
    this.httpTimeLimit = httpTimeLimit;
    return this;
  }

   /**
   * Maximum amount of time in milliseconds the agents wait before a request times out.
   * @return httpTimeLimit
  **/
  @javax.annotation.Nullable
  public Integer getHttpTimeLimit() {
    return httpTimeLimit;
  }


  public void setHttpTimeLimit(Integer httpTimeLimit) {
    this.httpTimeLimit = httpTimeLimit;
  }


  public GetEndpointHttpserverTestDetail200Response url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Test target URL. Optionally, you can specify a protocol (http or https). If no protocol is provided, the default &#x60;https&#x60; protocol is used.
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public GetEndpointHttpserverTestDetail200Response username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Username for Basic/NTLM authentication.
   * @return username
  **/
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public GetEndpointHttpserverTestDetail200Response sslVersionId(TestSslVersionId sslVersionId) {
    
    this.sslVersionId = sslVersionId;
    return this;
  }

   /**
   * Get sslVersionId
   * @return sslVersionId
  **/
  @javax.annotation.Nullable
  public TestSslVersionId getSslVersionId() {
    return sslVersionId;
  }


  public void setSslVersionId(TestSslVersionId sslVersionId) {
    this.sslVersionId = sslVersionId;
  }


  public GetEndpointHttpserverTestDetail200Response tcpProbeMode(TestProbeMode tcpProbeMode) {
    
    this.tcpProbeMode = tcpProbeMode;
    return this;
  }

   /**
   * Get tcpProbeMode
   * @return tcpProbeMode
  **/
  @javax.annotation.Nullable
  public TestProbeMode getTcpProbeMode() {
    return tcpProbeMode;
  }


  public void setTcpProbeMode(TestProbeMode tcpProbeMode) {
    this.tcpProbeMode = tcpProbeMode;
  }


  public GetEndpointHttpserverTestDetail200Response verifyCertificate(Boolean verifyCertificate) {
    
    this.verifyCertificate = verifyCertificate;
    return this;
  }

   /**
   * Flag indicating if a certificate should be verified.
   * @return verifyCertificate
  **/
  @javax.annotation.Nullable
  public Boolean getVerifyCertificate() {
    return verifyCertificate;
  }


  public void setVerifyCertificate(Boolean verifyCertificate) {
    this.verifyCertificate = verifyCertificate;
  }


  public GetEndpointHttpserverTestDetail200Response contentRegex(String contentRegex) {
    
    this.contentRegex = contentRegex;
    return this;
  }

   /**
   * Content regex, this field does not require escaping.
   * @return contentRegex
  **/
  @javax.annotation.Nullable
  public String getContentRegex() {
    return contentRegex;
  }


  public void setContentRegex(String contentRegex) {
    this.contentRegex = contentRegex;
  }


  public GetEndpointHttpserverTestDetail200Response followRedirects(Boolean followRedirects) {
    
    this.followRedirects = followRedirects;
    return this;
  }

   /**
   * To disable following HTTP/301 or HTTP/302 redirect directives, set this parameter to false.
   * @return followRedirects
  **/
  @javax.annotation.Nullable
  public Boolean getFollowRedirects() {
    return followRedirects;
  }


  public void setFollowRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
  }


  public GetEndpointHttpserverTestDetail200Response httpTargetTime(Integer httpTargetTime) {
    
    this.httpTargetTime = httpTargetTime;
    return this;
  }

   /**
   * Target time for HTTP server completion, specified in milliseconds.
   * minimum: 100
   * maximum: 5000
   * @return httpTargetTime
  **/
  @javax.annotation.Nullable
  public Integer getHttpTargetTime() {
    return httpTargetTime;
  }


  public void setHttpTargetTime(Integer httpTargetTime) {
    this.httpTargetTime = httpTargetTime;
  }


  public GetEndpointHttpserverTestDetail200Response httpVersion(Integer httpVersion) {
    
    this.httpVersion = httpVersion;
    return this;
  }

   /**
   * HTTP protocol version. Set to &#39;2&#39; to prefer HTTP/2, or &#39;1&#39; to use only HTTP/1.1.
   * minimum: 1
   * maximum: 2
   * @return httpVersion
  **/
  @javax.annotation.Nullable
  public Integer getHttpVersion() {
    return httpVersion;
  }


  public void setHttpVersion(Integer httpVersion) {
    this.httpVersion = httpVersion;
  }


  public GetEndpointHttpserverTestDetail200Response postBody(String postBody) {
    
    this.postBody = postBody;
    return this;
  }

   /**
   * Enter the body for the HTTP POST request in this field. No special escaping is necessary. If the post body is provided with content, the &#x60;requestMethod&#x60; is automatically set to POST.
   * @return postBody
  **/
  @javax.annotation.Nullable
  public String getPostBody() {
    return postBody;
  }


  public void setPostBody(String postBody) {
    this.postBody = postBody;
  }


   /**
   * Reflects the verbose SSL protocol version used by a test.
   * @return sslVersion
  **/
  @javax.annotation.Nullable
  public String getSslVersion() {
    return sslVersion;
  }




  public GetEndpointHttpserverTestDetail200Response useNtlm(Boolean useNtlm) {
    
    this.useNtlm = useNtlm;
    return this;
  }

   /**
   * Set to true to use NTLM, false to use Basic Authentication. Requires username and password to be set.
   * @return useNtlm
  **/
  @javax.annotation.Nullable
  public Boolean getUseNtlm() {
    return useNtlm;
  }


  public void setUseNtlm(Boolean useNtlm) {
    this.useNtlm = useNtlm;
  }


  public GetEndpointHttpserverTestDetail200Response userAgent(String userAgent) {
    
    this.userAgent = userAgent;
    return this;
  }

   /**
   * User-agent string to be provided during the test.
   * @return userAgent
  **/
  @javax.annotation.Nullable
  public String getUserAgent() {
    return userAgent;
  }


  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEndpointHttpserverTestDetail200Response getEndpointHttpserverTestDetail200Response = (GetEndpointHttpserverTestDetail200Response) o;
    return Objects.equals(this.links, getEndpointHttpserverTestDetail200Response.links) &&
        Objects.equals(this.agentSelectorConfig, getEndpointHttpserverTestDetail200Response.agentSelectorConfig) &&
        Objects.equals(this.createdDate, getEndpointHttpserverTestDetail200Response.createdDate) &&
        Objects.equals(this.interval, getEndpointHttpserverTestDetail200Response.interval) &&
        Objects.equals(this.isEnabled, getEndpointHttpserverTestDetail200Response.isEnabled) &&
        Objects.equals(this.isSavedEvent, getEndpointHttpserverTestDetail200Response.isSavedEvent) &&
        Objects.equals(this.hasPathTraceInSession, getEndpointHttpserverTestDetail200Response.hasPathTraceInSession) &&
        Objects.equals(this.modifiedDate, getEndpointHttpserverTestDetail200Response.modifiedDate) &&
        Objects.equals(this.networkMeasurements, getEndpointHttpserverTestDetail200Response.networkMeasurements) &&
        Objects.equals(this.port, getEndpointHttpserverTestDetail200Response.port) &&
        Objects.equals(this.protocol, getEndpointHttpserverTestDetail200Response.protocol) &&
        Objects.equals(this.server, getEndpointHttpserverTestDetail200Response.server) &&
        Objects.equals(this.testId, getEndpointHttpserverTestDetail200Response.testId) &&
        Objects.equals(this.aid, getEndpointHttpserverTestDetail200Response.aid) &&
        Objects.equals(this.testName, getEndpointHttpserverTestDetail200Response.testName) &&
        Objects.equals(this.type, getEndpointHttpserverTestDetail200Response.type) &&
        Objects.equals(this.authType, getEndpointHttpserverTestDetail200Response.authType) &&
        Objects.equals(this.httpTimeLimit, getEndpointHttpserverTestDetail200Response.httpTimeLimit) &&
        Objects.equals(this.url, getEndpointHttpserverTestDetail200Response.url) &&
        Objects.equals(this.username, getEndpointHttpserverTestDetail200Response.username) &&
        Objects.equals(this.sslVersionId, getEndpointHttpserverTestDetail200Response.sslVersionId) &&
        Objects.equals(this.tcpProbeMode, getEndpointHttpserverTestDetail200Response.tcpProbeMode) &&
        Objects.equals(this.verifyCertificate, getEndpointHttpserverTestDetail200Response.verifyCertificate) &&
        Objects.equals(this.contentRegex, getEndpointHttpserverTestDetail200Response.contentRegex) &&
        Objects.equals(this.followRedirects, getEndpointHttpserverTestDetail200Response.followRedirects) &&
        Objects.equals(this.httpTargetTime, getEndpointHttpserverTestDetail200Response.httpTargetTime) &&
        Objects.equals(this.httpVersion, getEndpointHttpserverTestDetail200Response.httpVersion) &&
        Objects.equals(this.postBody, getEndpointHttpserverTestDetail200Response.postBody) &&
        Objects.equals(this.sslVersion, getEndpointHttpserverTestDetail200Response.sslVersion) &&
        Objects.equals(this.useNtlm, getEndpointHttpserverTestDetail200Response.useNtlm) &&
        Objects.equals(this.userAgent, getEndpointHttpserverTestDetail200Response.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, agentSelectorConfig, createdDate, interval, isEnabled, isSavedEvent, hasPathTraceInSession, modifiedDate, networkMeasurements, port, protocol, server, testId, aid, testName, type, authType, httpTimeLimit, url, username, sslVersionId, tcpProbeMode, verifyCertificate, contentRegex, followRedirects, httpTargetTime, httpVersion, postBody, sslVersion, useNtlm, userAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEndpointHttpserverTestDetail200Response {\n");
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
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    httpTimeLimit: ").append(toIndentedString(httpTimeLimit)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    sslVersionId: ").append(toIndentedString(sslVersionId)).append("\n");
    sb.append("    tcpProbeMode: ").append(toIndentedString(tcpProbeMode)).append("\n");
    sb.append("    verifyCertificate: ").append(toIndentedString(verifyCertificate)).append("\n");
    sb.append("    contentRegex: ").append(toIndentedString(contentRegex)).append("\n");
    sb.append("    followRedirects: ").append(toIndentedString(followRedirects)).append("\n");
    sb.append("    httpTargetTime: ").append(toIndentedString(httpTargetTime)).append("\n");
    sb.append("    httpVersion: ").append(toIndentedString(httpVersion)).append("\n");
    sb.append("    postBody: ").append(toIndentedString(postBody)).append("\n");
    sb.append("    sslVersion: ").append(toIndentedString(sslVersion)).append("\n");
    sb.append("    useNtlm: ").append(toIndentedString(useNtlm)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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
    openapiFields.add("_links");
    openapiFields.add("agentSelectorConfig");
    openapiFields.add("createdDate");
    openapiFields.add("interval");
    openapiFields.add("isEnabled");
    openapiFields.add("isSavedEvent");
    openapiFields.add("hasPathTraceInSession");
    openapiFields.add("modifiedDate");
    openapiFields.add("networkMeasurements");
    openapiFields.add("port");
    openapiFields.add("protocol");
    openapiFields.add("server");
    openapiFields.add("testId");
    openapiFields.add("aid");
    openapiFields.add("testName");
    openapiFields.add("type");
    openapiFields.add("authType");
    openapiFields.add("httpTimeLimit");
    openapiFields.add("url");
    openapiFields.add("username");
    openapiFields.add("sslVersionId");
    openapiFields.add("tcpProbeMode");
    openapiFields.add("verifyCertificate");
    openapiFields.add("contentRegex");
    openapiFields.add("followRedirects");
    openapiFields.add("httpTargetTime");
    openapiFields.add("httpVersion");
    openapiFields.add("postBody");
    openapiFields.add("sslVersion");
    openapiFields.add("useNtlm");
    openapiFields.add("userAgent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetEndpointHttpserverTestDetail200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetEndpointHttpserverTestDetail200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetEndpointHttpserverTestDetail200Response is not found in the empty JSON string", GetEndpointHttpserverTestDetail200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetEndpointHttpserverTestDetail200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetEndpointHttpserverTestDetail200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        SelfLinksLinks.validateJsonElement(jsonObj.get("_links"));
      }
      // validate the optional field `agentSelectorConfig`
      if (jsonObj.get("agentSelectorConfig") != null && !jsonObj.get("agentSelectorConfig").isJsonNull()) {
        EndpointAgentSelectorConfig.validateJsonElement(jsonObj.get("agentSelectorConfig"));
      }
      // validate the optional field `interval`
      if (jsonObj.get("interval") != null && !jsonObj.get("interval").isJsonNull()) {
        TestInterval.validateJsonElement(jsonObj.get("interval"));
      }
      // validate the optional field `protocol`
      if (jsonObj.get("protocol") != null && !jsonObj.get("protocol").isJsonNull()) {
        EndpointTestProtocol.validateJsonElement(jsonObj.get("protocol"));
      }
      if ((jsonObj.get("server") != null && !jsonObj.get("server").isJsonNull()) && !jsonObj.get("server").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server").toString()));
      }
      if ((jsonObj.get("testId") != null && !jsonObj.get("testId").isJsonNull()) && !jsonObj.get("testId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testId").toString()));
      }
      // validate the optional field `aid`
      if (jsonObj.get("aid") != null && !jsonObj.get("aid").isJsonNull()) {
        EndpointTestAid.validateJsonElement(jsonObj.get("aid"));
      }
      if ((jsonObj.get("testName") != null && !jsonObj.get("testName").isJsonNull()) && !jsonObj.get("testName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testName").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        EndpointHttpServerType.validateJsonElement(jsonObj.get("type"));
      }
      // validate the optional field `authType`
      if (jsonObj.get("authType") != null && !jsonObj.get("authType").isJsonNull()) {
        EndpointTestAuthType.validateJsonElement(jsonObj.get("authType"));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      // validate the optional field `sslVersionId`
      if (jsonObj.get("sslVersionId") != null && !jsonObj.get("sslVersionId").isJsonNull()) {
        TestSslVersionId.validateJsonElement(jsonObj.get("sslVersionId"));
      }
      // validate the optional field `tcpProbeMode`
      if (jsonObj.get("tcpProbeMode") != null && !jsonObj.get("tcpProbeMode").isJsonNull()) {
        TestProbeMode.validateJsonElement(jsonObj.get("tcpProbeMode"));
      }
      if ((jsonObj.get("contentRegex") != null && !jsonObj.get("contentRegex").isJsonNull()) && !jsonObj.get("contentRegex").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentRegex` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contentRegex").toString()));
      }
      if ((jsonObj.get("postBody") != null && !jsonObj.get("postBody").isJsonNull()) && !jsonObj.get("postBody").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postBody` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postBody").toString()));
      }
      if ((jsonObj.get("sslVersion") != null && !jsonObj.get("sslVersion").isJsonNull()) && !jsonObj.get("sslVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sslVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sslVersion").toString()));
      }
      if ((jsonObj.get("userAgent") != null && !jsonObj.get("userAgent").isJsonNull()) && !jsonObj.get("userAgent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userAgent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userAgent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetEndpointHttpserverTestDetail200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetEndpointHttpserverTestDetail200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetEndpointHttpserverTestDetail200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetEndpointHttpserverTestDetail200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetEndpointHttpserverTestDetail200Response>() {
           @Override
           public void write(JsonWriter out, GetEndpointHttpserverTestDetail200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetEndpointHttpserverTestDetail200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetEndpointHttpserverTestDetail200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetEndpointHttpserverTestDetail200Response
  * @throws IOException if the JSON string is invalid with respect to GetEndpointHttpserverTestDetail200Response
  */
  public static GetEndpointHttpserverTestDetail200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetEndpointHttpserverTestDetail200Response.class);
  }

 /**
  * Convert an instance of GetEndpointHttpserverTestDetail200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

