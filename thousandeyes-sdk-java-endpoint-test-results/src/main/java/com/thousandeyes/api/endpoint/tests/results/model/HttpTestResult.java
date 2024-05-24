/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.tests.results.model.HttpErrorType;
import com.thousandeyes.api.endpoint.tests.results.model.HttpTestResultHeaders;
import com.thousandeyes.api.endpoint.tests.results.model.NetworkProfile;
import com.thousandeyes.api.endpoint.tests.results.model.SystemMetrics;
import com.thousandeyes.api.endpoint.tests.results.model.TargetProfile;
import com.thousandeyes.api.endpoint.tests.results.model.VpnProfile;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * HttpTestResult
 */
@JsonPropertyOrder({
  HttpTestResult.JSON_PROPERTY_AID,
  HttpTestResult.JSON_PROPERTY_AGENT_ID,
  HttpTestResult.JSON_PROPERTY_ROUND_ID,
  HttpTestResult.JSON_PROPERTY_SERVER_IP,
  HttpTestResult.JSON_PROPERTY_NETWORK_PROFILE,
  HttpTestResult.JSON_PROPERTY_SYSTEM_METRICS,
  HttpTestResult.JSON_PROPERTY_ORIGINAL_TARGET_PROFILE,
  HttpTestResult.JSON_PROPERTY_VPN_PROFILE,
  HttpTestResult.JSON_PROPERTY_CONNECT_TIME,
  HttpTestResult.JSON_PROPERTY_DNS_TIME,
  HttpTestResult.JSON_PROPERTY_ERROR_TYPE,
  HttpTestResult.JSON_PROPERTY_ERROR_DETAILS,
  HttpTestResult.JSON_PROPERTY_HEADERS,
  HttpTestResult.JSON_PROPERTY_NUM_REDIRECTS,
  HttpTestResult.JSON_PROPERTY_RECEIVE_TIME,
  HttpTestResult.JSON_PROPERTY_REDIRECT_TIME,
  HttpTestResult.JSON_PROPERTY_RESPONSE_CODE,
  HttpTestResult.JSON_PROPERTY_RESPONSE_TIME,
  HttpTestResult.JSON_PROPERTY_SSL_TIME,
  HttpTestResult.JSON_PROPERTY_TOTAL_TIME,
  HttpTestResult.JSON_PROPERTY_WAIT_TIME,
  HttpTestResult.JSON_PROPERTY_WIRE_SIZE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class HttpTestResult {
  public static final String JSON_PROPERTY_AID = "aid";
  private String aid;

  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private UUID agentId;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_SERVER_IP = "serverIp";
  private String serverIp;

  public static final String JSON_PROPERTY_NETWORK_PROFILE = "networkProfile";
  private NetworkProfile networkProfile;

  public static final String JSON_PROPERTY_SYSTEM_METRICS = "systemMetrics";
  private SystemMetrics systemMetrics;

  public static final String JSON_PROPERTY_ORIGINAL_TARGET_PROFILE = "originalTargetProfile";
  private TargetProfile originalTargetProfile;

  public static final String JSON_PROPERTY_VPN_PROFILE = "vpnProfile";
  private VpnProfile vpnProfile;

  public static final String JSON_PROPERTY_CONNECT_TIME = "connectTime";
  private Integer connectTime;

  public static final String JSON_PROPERTY_DNS_TIME = "dnsTime";
  private Integer dnsTime;

  public static final String JSON_PROPERTY_ERROR_TYPE = "errorType";
  private HttpErrorType errorType = HttpErrorType.CONNECT;

  public static final String JSON_PROPERTY_ERROR_DETAILS = "errorDetails";
  private String errorDetails;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private HttpTestResultHeaders headers;

  public static final String JSON_PROPERTY_NUM_REDIRECTS = "numRedirects";
  private Integer numRedirects;

  public static final String JSON_PROPERTY_RECEIVE_TIME = "receiveTime";
  private Integer receiveTime;

  public static final String JSON_PROPERTY_REDIRECT_TIME = "redirectTime";
  private Integer redirectTime;

  public static final String JSON_PROPERTY_RESPONSE_CODE = "responseCode";
  private Integer responseCode;

  public static final String JSON_PROPERTY_RESPONSE_TIME = "responseTime";
  private Integer responseTime;

  public static final String JSON_PROPERTY_SSL_TIME = "sslTime";
  private Integer sslTime;

  public static final String JSON_PROPERTY_TOTAL_TIME = "totalTime";
  private Integer totalTime;

  public static final String JSON_PROPERTY_WAIT_TIME = "waitTime";
  private Integer waitTime;

  public static final String JSON_PROPERTY_WIRE_SIZE = "wireSize";
  private Integer wireSize;

  public HttpTestResult() { 
  }

  @JsonCreator
  public HttpTestResult(
    @JsonProperty(JSON_PROPERTY_AGENT_ID) UUID agentId, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId, 
    @JsonProperty(JSON_PROPERTY_SERVER_IP) String serverIp, 
    @JsonProperty(JSON_PROPERTY_CONNECT_TIME) Integer connectTime, 
    @JsonProperty(JSON_PROPERTY_DNS_TIME) Integer dnsTime, 
    @JsonProperty(JSON_PROPERTY_ERROR_DETAILS) String errorDetails, 
    @JsonProperty(JSON_PROPERTY_NUM_REDIRECTS) Integer numRedirects, 
    @JsonProperty(JSON_PROPERTY_RECEIVE_TIME) Integer receiveTime, 
    @JsonProperty(JSON_PROPERTY_REDIRECT_TIME) Integer redirectTime, 
    @JsonProperty(JSON_PROPERTY_RESPONSE_CODE) Integer responseCode, 
    @JsonProperty(JSON_PROPERTY_RESPONSE_TIME) Integer responseTime, 
    @JsonProperty(JSON_PROPERTY_SSL_TIME) Integer sslTime, 
    @JsonProperty(JSON_PROPERTY_TOTAL_TIME) Integer totalTime, 
    @JsonProperty(JSON_PROPERTY_WAIT_TIME) Integer waitTime, 
    @JsonProperty(JSON_PROPERTY_WIRE_SIZE) Integer wireSize
  ) {
  this();
    this.agentId = agentId;
    this.roundId = roundId;
    this.serverIp = serverIp;
    this.connectTime = connectTime;
    this.dnsTime = dnsTime;
    this.errorDetails = errorDetails;
    this.numRedirects = numRedirects;
    this.receiveTime = receiveTime;
    this.redirectTime = redirectTime;
    this.responseCode = responseCode;
    this.responseTime = responseTime;
    this.sslTime = sslTime;
    this.totalTime = totalTime;
    this.waitTime = waitTime;
    this.wireSize = wireSize;
  }

  public HttpTestResult aid(String aid) {
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


   /**
   * Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint.
   * @return agentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getAgentId() {
    return agentId;
  }




   /**
   * Epoch time (seconds) indicating the start time of the round.
   * @return roundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoundId() {
    return roundId;
  }




   /**
   * IP address of destination server.
   * @return serverIp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServerIp() {
    return serverIp;
  }




  public HttpTestResult networkProfile(NetworkProfile networkProfile) {
    this.networkProfile = networkProfile;
    return this;
  }

   /**
   * Get networkProfile
   * @return networkProfile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkProfile getNetworkProfile() {
    return networkProfile;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkProfile(NetworkProfile networkProfile) {
    this.networkProfile = networkProfile;
  }


  public HttpTestResult systemMetrics(SystemMetrics systemMetrics) {
    this.systemMetrics = systemMetrics;
    return this;
  }

   /**
   * Get systemMetrics
   * @return systemMetrics
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYSTEM_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SystemMetrics getSystemMetrics() {
    return systemMetrics;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystemMetrics(SystemMetrics systemMetrics) {
    this.systemMetrics = systemMetrics;
  }


  public HttpTestResult originalTargetProfile(TargetProfile originalTargetProfile) {
    this.originalTargetProfile = originalTargetProfile;
    return this;
  }

   /**
   * Get originalTargetProfile
   * @return originalTargetProfile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINAL_TARGET_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TargetProfile getOriginalTargetProfile() {
    return originalTargetProfile;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_TARGET_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalTargetProfile(TargetProfile originalTargetProfile) {
    this.originalTargetProfile = originalTargetProfile;
  }


  public HttpTestResult vpnProfile(VpnProfile vpnProfile) {
    this.vpnProfile = vpnProfile;
    return this;
  }

   /**
   * Get vpnProfile
   * @return vpnProfile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VPN_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VpnProfile getVpnProfile() {
    return vpnProfile;
  }


  @JsonProperty(JSON_PROPERTY_VPN_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVpnProfile(VpnProfile vpnProfile) {
    this.vpnProfile = vpnProfile;
  }


   /**
   * Time required to establish a TCP connection to the server in milliseconds.
   * @return connectTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConnectTime() {
    return connectTime;
  }




   /**
   * Time required to resolve DNS in milliseconds.
   * @return dnsTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDnsTime() {
    return dnsTime;
  }




  public HttpTestResult errorType(HttpErrorType errorType) {
    this.errorType = errorType;
    return this;
  }

   /**
   * Get errorType
   * @return errorType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HttpErrorType getErrorType() {
    return errorType;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorType(HttpErrorType errorType) {
    this.errorType = errorType;
  }


   /**
   * Error details, if an error were encountered.
   * @return errorDetails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDetails() {
    return errorDetails;
  }




  public HttpTestResult headers(HttpTestResultHeaders headers) {
    this.headers = headers;
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HttpTestResultHeaders getHeaders() {
    return headers;
  }


  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaders(HttpTestResultHeaders headers) {
    this.headers = headers;
  }


   /**
   * Number of redirects.
   * @return numRedirects
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_REDIRECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumRedirects() {
    return numRedirects;
  }




   /**
   * Elapsed time between first and last byte of response in milliseconds.
   * @return receiveTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReceiveTime() {
    return receiveTime;
  }




   /**
   * Cumulative redirect timing in milliseconds.
   * @return redirectTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIRECT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRedirectTime() {
    return redirectTime;
  }




   /**
   * HTTP response code.
   * @return responseCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResponseCode() {
    return responseCode;
  }




   /**
   * Time to first byte in milliseconds.
   * @return responseTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResponseTime() {
    return responseTime;
  }




   /**
   * Time to negotiate SSL/TLS in milliseconds.
   * @return sslTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSslTime() {
    return sslTime;
  }




   /**
   * Total time is the response time + receive time.
   * @return totalTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalTime() {
    return totalTime;
  }




   /**
   * Time elapsed between completion of request and first byte of response in milliseconds.
   * @return waitTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAIT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWaitTime() {
    return waitTime;
  }




   /**
   * Size of content in bytes.
   * @return wireSize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIRE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWireSize() {
    return wireSize;
  }




  /**
   * Return true if this HttpTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpTestResult httpTestResult = (HttpTestResult) o;
    return Objects.equals(this.aid, httpTestResult.aid) &&
        Objects.equals(this.agentId, httpTestResult.agentId) &&
        Objects.equals(this.roundId, httpTestResult.roundId) &&
        Objects.equals(this.serverIp, httpTestResult.serverIp) &&
        Objects.equals(this.networkProfile, httpTestResult.networkProfile) &&
        Objects.equals(this.systemMetrics, httpTestResult.systemMetrics) &&
        Objects.equals(this.originalTargetProfile, httpTestResult.originalTargetProfile) &&
        Objects.equals(this.vpnProfile, httpTestResult.vpnProfile) &&
        Objects.equals(this.connectTime, httpTestResult.connectTime) &&
        Objects.equals(this.dnsTime, httpTestResult.dnsTime) &&
        Objects.equals(this.errorType, httpTestResult.errorType) &&
        Objects.equals(this.errorDetails, httpTestResult.errorDetails) &&
        Objects.equals(this.headers, httpTestResult.headers) &&
        Objects.equals(this.numRedirects, httpTestResult.numRedirects) &&
        Objects.equals(this.receiveTime, httpTestResult.receiveTime) &&
        Objects.equals(this.redirectTime, httpTestResult.redirectTime) &&
        Objects.equals(this.responseCode, httpTestResult.responseCode) &&
        Objects.equals(this.responseTime, httpTestResult.responseTime) &&
        Objects.equals(this.sslTime, httpTestResult.sslTime) &&
        Objects.equals(this.totalTime, httpTestResult.totalTime) &&
        Objects.equals(this.waitTime, httpTestResult.waitTime) &&
        Objects.equals(this.wireSize, httpTestResult.wireSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, agentId, roundId, serverIp, networkProfile, systemMetrics, originalTargetProfile, vpnProfile, connectTime, dnsTime, errorType, errorDetails, headers, numRedirects, receiveTime, redirectTime, responseCode, responseTime, sslTime, totalTime, waitTime, wireSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpTestResult {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    networkProfile: ").append(toIndentedString(networkProfile)).append("\n");
    sb.append("    systemMetrics: ").append(toIndentedString(systemMetrics)).append("\n");
    sb.append("    originalTargetProfile: ").append(toIndentedString(originalTargetProfile)).append("\n");
    sb.append("    vpnProfile: ").append(toIndentedString(vpnProfile)).append("\n");
    sb.append("    connectTime: ").append(toIndentedString(connectTime)).append("\n");
    sb.append("    dnsTime: ").append(toIndentedString(dnsTime)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    numRedirects: ").append(toIndentedString(numRedirects)).append("\n");
    sb.append("    receiveTime: ").append(toIndentedString(receiveTime)).append("\n");
    sb.append("    redirectTime: ").append(toIndentedString(redirectTime)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    sslTime: ").append(toIndentedString(sslTime)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
    sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
    sb.append("    wireSize: ").append(toIndentedString(wireSize)).append("\n");
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

