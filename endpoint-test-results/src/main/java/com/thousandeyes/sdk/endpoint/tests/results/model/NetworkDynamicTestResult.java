/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.endpoint.tests.results.model.DynamicTestWebex;
import com.thousandeyes.sdk.endpoint.tests.results.model.EndpointTestProtocol;
import com.thousandeyes.sdk.endpoint.tests.results.model.NetworkProfile;
import com.thousandeyes.sdk.endpoint.tests.results.model.SystemMetrics;
import com.thousandeyes.sdk.endpoint.tests.results.model.TargetProfile;
import com.thousandeyes.sdk.endpoint.tests.results.model.TestProbeModeResponse;
import com.thousandeyes.sdk.endpoint.tests.results.model.UdpProbeModeResponse;
import com.thousandeyes.sdk.endpoint.tests.results.model.VpnProfile;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NetworkDynamicTestResult
 */
@JsonPropertyOrder({
  NetworkDynamicTestResult.JSON_PROPERTY_AID,
  NetworkDynamicTestResult.JSON_PROPERTY_AGENT_ID,
  NetworkDynamicTestResult.JSON_PROPERTY_ROUND_ID,
  NetworkDynamicTestResult.JSON_PROPERTY_SERVER_IP,
  NetworkDynamicTestResult.JSON_PROPERTY_NETWORK_PROFILE,
  NetworkDynamicTestResult.JSON_PROPERTY_SYSTEM_METRICS,
  NetworkDynamicTestResult.JSON_PROPERTY_ORIGINAL_TARGET_PROFILE,
  NetworkDynamicTestResult.JSON_PROPERTY_VPN_PROFILE,
  NetworkDynamicTestResult.JSON_PROPERTY_AVG_LATENCY,
  NetworkDynamicTestResult.JSON_PROPERTY_ERROR_DETAILS,
  NetworkDynamicTestResult.JSON_PROPERTY_JITTER,
  NetworkDynamicTestResult.JSON_PROPERTY_IS_ICMP_BLOCKED,
  NetworkDynamicTestResult.JSON_PROPERTY_LOSS,
  NetworkDynamicTestResult.JSON_PROPERTY_MAX_LATENCY,
  NetworkDynamicTestResult.JSON_PROPERTY_MIN_LATENCY,
  NetworkDynamicTestResult.JSON_PROPERTY_APPLICATION,
  NetworkDynamicTestResult.JSON_PROPERTY_PROTOCOL,
  NetworkDynamicTestResult.JSON_PROPERTY_TCP_PROBE_MODE,
  NetworkDynamicTestResult.JSON_PROPERTY_UDP_PROBE_MODE,
  NetworkDynamicTestResult.JSON_PROPERTY_WEBEX
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class NetworkDynamicTestResult {
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

  public static final String JSON_PROPERTY_AVG_LATENCY = "avgLatency";
  private Double avgLatency;

  public static final String JSON_PROPERTY_ERROR_DETAILS = "errorDetails";
  private String errorDetails;

  public static final String JSON_PROPERTY_JITTER = "jitter";
  private Double jitter;

  public static final String JSON_PROPERTY_IS_ICMP_BLOCKED = "isIcmpBlocked";
  private Boolean isIcmpBlocked;

  public static final String JSON_PROPERTY_LOSS = "loss";
  private Double loss;

  public static final String JSON_PROPERTY_MAX_LATENCY = "maxLatency";
  private Double maxLatency;

  public static final String JSON_PROPERTY_MIN_LATENCY = "minLatency";
  private Double minLatency;

  public static final String JSON_PROPERTY_APPLICATION = "application";
  private String application;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private EndpointTestProtocol protocol = EndpointTestProtocol.ICMP;

  public static final String JSON_PROPERTY_TCP_PROBE_MODE = "tcpProbeMode";
  private TestProbeModeResponse tcpProbeMode = TestProbeModeResponse.AUTO;

  public static final String JSON_PROPERTY_UDP_PROBE_MODE = "udpProbeMode";
  private UdpProbeModeResponse udpProbeMode = UdpProbeModeResponse.UNKNOWN;

  public static final String JSON_PROPERTY_WEBEX = "webex";
  private DynamicTestWebex webex;

  public NetworkDynamicTestResult() { 
  }

  @JsonCreator
  public NetworkDynamicTestResult(
    @JsonProperty(JSON_PROPERTY_AGENT_ID) UUID agentId, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId, 
    @JsonProperty(JSON_PROPERTY_SERVER_IP) String serverIp, 
    @JsonProperty(JSON_PROPERTY_AVG_LATENCY) Double avgLatency, 
    @JsonProperty(JSON_PROPERTY_ERROR_DETAILS) String errorDetails, 
    @JsonProperty(JSON_PROPERTY_JITTER) Double jitter, 
    @JsonProperty(JSON_PROPERTY_IS_ICMP_BLOCKED) Boolean isIcmpBlocked, 
    @JsonProperty(JSON_PROPERTY_LOSS) Double loss, 
    @JsonProperty(JSON_PROPERTY_MAX_LATENCY) Double maxLatency, 
    @JsonProperty(JSON_PROPERTY_MIN_LATENCY) Double minLatency
  ) {
  this();
    this.agentId = agentId;
    this.roundId = roundId;
    this.serverIp = serverIp;
    this.avgLatency = avgLatency;
    this.errorDetails = errorDetails;
    this.jitter = jitter;
    this.isIcmpBlocked = isIcmpBlocked;
    this.loss = loss;
    this.maxLatency = maxLatency;
    this.minLatency = minLatency;
  }

  public NetworkDynamicTestResult aid(String aid) {
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
   * IP address of target server.
   * @return serverIp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServerIp() {
    return serverIp;
  }




  public NetworkDynamicTestResult networkProfile(NetworkProfile networkProfile) {
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


  public NetworkDynamicTestResult systemMetrics(SystemMetrics systemMetrics) {
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


  public NetworkDynamicTestResult originalTargetProfile(TargetProfile originalTargetProfile) {
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


  public NetworkDynamicTestResult vpnProfile(VpnProfile vpnProfile) {
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
   * Average RTT for packets sent to destination.
   * @return avgLatency
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVG_LATENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAvgLatency() {
    return avgLatency;
  }




   /**
   * Error details, if an error was encountered.
   * @return errorDetails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDetails() {
    return errorDetails;
  }




   /**
   * Standard deviation of latency.
   * @return jitter
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JITTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getJitter() {
    return jitter;
  }




   /**
   * Set to &#x60;true&#x60; if network target is blocking ICMP echo (ping) queries.
   * @return isIcmpBlocked
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ICMP_BLOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsIcmpBlocked() {
    return isIcmpBlocked;
  }




   /**
   * Percentage of packets not reaching destination.
   * @return loss
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLoss() {
    return loss;
  }




   /**
   * Maximum RTT for packets sent to destination.
   * @return maxLatency
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_LATENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMaxLatency() {
    return maxLatency;
  }




   /**
   * Minimum RTT for packets sent to destination.
   * @return minLatency
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_LATENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMinLatency() {
    return minLatency;
  }




  public NetworkDynamicTestResult application(String application) {
    this.application = application;
    return this;
  }

   /**
   * Which supported application to monitor, can be one of &#x60;webex&#x60;, &#x60;zoom&#x60;, &#x60;microsoft-teams&#x60;.
   * @return application
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApplication() {
    return application;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplication(String application) {
    this.application = application;
  }


  public NetworkDynamicTestResult protocol(EndpointTestProtocol protocol) {
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


  public NetworkDynamicTestResult tcpProbeMode(TestProbeModeResponse tcpProbeMode) {
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


  public NetworkDynamicTestResult udpProbeMode(UdpProbeModeResponse udpProbeMode) {
    this.udpProbeMode = udpProbeMode;
    return this;
  }

   /**
   * Get udpProbeMode
   * @return udpProbeMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UDP_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UdpProbeModeResponse getUdpProbeMode() {
    return udpProbeMode;
  }


  @JsonProperty(JSON_PROPERTY_UDP_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUdpProbeMode(UdpProbeModeResponse udpProbeMode) {
    this.udpProbeMode = udpProbeMode;
  }


  public NetworkDynamicTestResult webex(DynamicTestWebex webex) {
    this.webex = webex;
    return this;
  }

   /**
   * Get webex
   * @return webex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DynamicTestWebex getWebex() {
    return webex;
  }


  @JsonProperty(JSON_PROPERTY_WEBEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebex(DynamicTestWebex webex) {
    this.webex = webex;
  }


  /**
   * Return true if this NetworkDynamicTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkDynamicTestResult networkDynamicTestResult = (NetworkDynamicTestResult) o;
    return Objects.equals(this.aid, networkDynamicTestResult.aid) &&
        Objects.equals(this.agentId, networkDynamicTestResult.agentId) &&
        Objects.equals(this.roundId, networkDynamicTestResult.roundId) &&
        Objects.equals(this.serverIp, networkDynamicTestResult.serverIp) &&
        Objects.equals(this.networkProfile, networkDynamicTestResult.networkProfile) &&
        Objects.equals(this.systemMetrics, networkDynamicTestResult.systemMetrics) &&
        Objects.equals(this.originalTargetProfile, networkDynamicTestResult.originalTargetProfile) &&
        Objects.equals(this.vpnProfile, networkDynamicTestResult.vpnProfile) &&
        Objects.equals(this.avgLatency, networkDynamicTestResult.avgLatency) &&
        Objects.equals(this.errorDetails, networkDynamicTestResult.errorDetails) &&
        Objects.equals(this.jitter, networkDynamicTestResult.jitter) &&
        Objects.equals(this.isIcmpBlocked, networkDynamicTestResult.isIcmpBlocked) &&
        Objects.equals(this.loss, networkDynamicTestResult.loss) &&
        Objects.equals(this.maxLatency, networkDynamicTestResult.maxLatency) &&
        Objects.equals(this.minLatency, networkDynamicTestResult.minLatency) &&
        Objects.equals(this.application, networkDynamicTestResult.application) &&
        Objects.equals(this.protocol, networkDynamicTestResult.protocol) &&
        Objects.equals(this.tcpProbeMode, networkDynamicTestResult.tcpProbeMode) &&
        Objects.equals(this.udpProbeMode, networkDynamicTestResult.udpProbeMode) &&
        Objects.equals(this.webex, networkDynamicTestResult.webex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, agentId, roundId, serverIp, networkProfile, systemMetrics, originalTargetProfile, vpnProfile, avgLatency, errorDetails, jitter, isIcmpBlocked, loss, maxLatency, minLatency, application, protocol, tcpProbeMode, udpProbeMode, webex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkDynamicTestResult {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    networkProfile: ").append(toIndentedString(networkProfile)).append("\n");
    sb.append("    systemMetrics: ").append(toIndentedString(systemMetrics)).append("\n");
    sb.append("    originalTargetProfile: ").append(toIndentedString(originalTargetProfile)).append("\n");
    sb.append("    vpnProfile: ").append(toIndentedString(vpnProfile)).append("\n");
    sb.append("    avgLatency: ").append(toIndentedString(avgLatency)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    jitter: ").append(toIndentedString(jitter)).append("\n");
    sb.append("    isIcmpBlocked: ").append(toIndentedString(isIcmpBlocked)).append("\n");
    sb.append("    loss: ").append(toIndentedString(loss)).append("\n");
    sb.append("    maxLatency: ").append(toIndentedString(maxLatency)).append("\n");
    sb.append("    minLatency: ").append(toIndentedString(minLatency)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    tcpProbeMode: ").append(toIndentedString(tcpProbeMode)).append("\n");
    sb.append("    udpProbeMode: ").append(toIndentedString(udpProbeMode)).append("\n");
    sb.append("    webex: ").append(toIndentedString(webex)).append("\n");
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

