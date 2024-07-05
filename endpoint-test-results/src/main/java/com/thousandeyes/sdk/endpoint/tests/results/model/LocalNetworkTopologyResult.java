/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.8
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
import com.thousandeyes.sdk.endpoint.tests.results.model.NetworkPing;
import com.thousandeyes.sdk.endpoint.tests.results.model.NetworkProfile;
import com.thousandeyes.sdk.endpoint.tests.results.model.NetworkTopologyType;
import com.thousandeyes.sdk.endpoint.tests.results.model.RealUserTestCoordinates;
import com.thousandeyes.sdk.endpoint.tests.results.model.SystemMetrics;
import com.thousandeyes.sdk.endpoint.tests.results.model.TcpConnect;
import com.thousandeyes.sdk.endpoint.tests.results.model.Traceroute;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LocalNetworkTopologyResult
 */
@JsonPropertyOrder({
  LocalNetworkTopologyResult.JSON_PROPERTY_AGENT_ID,
  LocalNetworkTopologyResult.JSON_PROPERTY_DATE,
  LocalNetworkTopologyResult.JSON_PROPERTY_NETWORK_TOPOLOGY_ID,
  LocalNetworkTopologyResult.JSON_PROPERTY_ROUND_ID,
  LocalNetworkTopologyResult.JSON_PROPERTY_TARGET,
  LocalNetworkTopologyResult.JSON_PROPERTY_TARGET_PORT,
  LocalNetworkTopologyResult.JSON_PROPERTY_TYPE,
  LocalNetworkTopologyResult.JSON_PROPERTY_ICMP_PING,
  LocalNetworkTopologyResult.JSON_PROPERTY_IS_ICMP_BLOCKED,
  LocalNetworkTopologyResult.JSON_PROPERTY_TCP_CONNECT,
  LocalNetworkTopologyResult.JSON_PROPERTY_SYSTEM_METRICS,
  LocalNetworkTopologyResult.JSON_PROPERTY_COORDINATES,
  LocalNetworkTopologyResult.JSON_PROPERTY_NETWORK_PROFILE,
  LocalNetworkTopologyResult.JSON_PROPERTY_ICMP_TRACEROUTE,
  LocalNetworkTopologyResult.JSON_PROPERTY_ICMP_TRACEROUTES
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class LocalNetworkTopologyResult {
  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private UUID agentId;

  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_NETWORK_TOPOLOGY_ID = "networkTopologyId";
  private String networkTopologyId;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TARGET_PORT = "targetPort";
  private Integer targetPort;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NetworkTopologyType type;

  public static final String JSON_PROPERTY_ICMP_PING = "icmpPing";
  private NetworkPing icmpPing;

  public static final String JSON_PROPERTY_IS_ICMP_BLOCKED = "isIcmpBlocked";
  private Boolean isIcmpBlocked;

  public static final String JSON_PROPERTY_TCP_CONNECT = "tcpConnect";
  private TcpConnect tcpConnect;

  public static final String JSON_PROPERTY_SYSTEM_METRICS = "systemMetrics";
  private SystemMetrics systemMetrics;

  public static final String JSON_PROPERTY_COORDINATES = "coordinates";
  private RealUserTestCoordinates coordinates;

  public static final String JSON_PROPERTY_NETWORK_PROFILE = "networkProfile";
  private NetworkProfile networkProfile;

  public static final String JSON_PROPERTY_ICMP_TRACEROUTE = "icmpTraceroute";
  private Traceroute icmpTraceroute;

  public static final String JSON_PROPERTY_ICMP_TRACEROUTES = "icmpTraceroutes";
  private List<Traceroute> icmpTraceroutes = new ArrayList<>();

  public LocalNetworkTopologyResult() { 
  }

  @JsonCreator
  public LocalNetworkTopologyResult(
    @JsonProperty(JSON_PROPERTY_AGENT_ID) UUID agentId, 
    @JsonProperty(JSON_PROPERTY_DATE) OffsetDateTime date, 
    @JsonProperty(JSON_PROPERTY_NETWORK_TOPOLOGY_ID) String networkTopologyId, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId, 
    @JsonProperty(JSON_PROPERTY_TARGET) String target, 
    @JsonProperty(JSON_PROPERTY_TARGET_PORT) Integer targetPort, 
    @JsonProperty(JSON_PROPERTY_IS_ICMP_BLOCKED) Boolean isIcmpBlocked
  ) {
  this();
    this.agentId = agentId;
    this.date = date;
    this.networkTopologyId = networkTopologyId;
    this.roundId = roundId;
    this.target = target;
    this.targetPort = targetPort;
    this.isIcmpBlocked = isIcmpBlocked;
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
   * UTC date when endpoint network topology took place (ISO date-time format).
   * @return date
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDate() {
    return date;
  }




   /**
   * Network topology ID. Each network topology occurrence has a unique ID.
   * @return networkTopologyId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_TOPOLOGY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetworkTopologyId() {
    return networkTopologyId;
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
   * IP of the target the network topology was performed against. This is typically a default gateway, proxy or VPN endpoint.
   * @return target
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTarget() {
    return target;
  }




   /**
   * Port of the target the network topology was performed against.
   * @return targetPort
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTargetPort() {
    return targetPort;
  }




  public LocalNetworkTopologyResult type(NetworkTopologyType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkTopologyType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(NetworkTopologyType type) {
    this.type = type;
  }


  public LocalNetworkTopologyResult icmpPing(NetworkPing icmpPing) {
    this.icmpPing = icmpPing;
    return this;
  }

   /**
   * Get icmpPing
   * @return icmpPing
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICMP_PING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkPing getIcmpPing() {
    return icmpPing;
  }


  @JsonProperty(JSON_PROPERTY_ICMP_PING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIcmpPing(NetworkPing icmpPing) {
    this.icmpPing = icmpPing;
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




  public LocalNetworkTopologyResult tcpConnect(TcpConnect tcpConnect) {
    this.tcpConnect = tcpConnect;
    return this;
  }

   /**
   * Get tcpConnect
   * @return tcpConnect
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_CONNECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TcpConnect getTcpConnect() {
    return tcpConnect;
  }


  @JsonProperty(JSON_PROPERTY_TCP_CONNECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTcpConnect(TcpConnect tcpConnect) {
    this.tcpConnect = tcpConnect;
  }


  public LocalNetworkTopologyResult systemMetrics(SystemMetrics systemMetrics) {
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


  public LocalNetworkTopologyResult coordinates(RealUserTestCoordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COORDINATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RealUserTestCoordinates getCoordinates() {
    return coordinates;
  }


  @JsonProperty(JSON_PROPERTY_COORDINATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoordinates(RealUserTestCoordinates coordinates) {
    this.coordinates = coordinates;
  }


  public LocalNetworkTopologyResult networkProfile(NetworkProfile networkProfile) {
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


  public LocalNetworkTopologyResult icmpTraceroute(Traceroute icmpTraceroute) {
    this.icmpTraceroute = icmpTraceroute;
    return this;
  }

   /**
   * Get icmpTraceroute
   * @return icmpTraceroute
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICMP_TRACEROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Traceroute getIcmpTraceroute() {
    return icmpTraceroute;
  }


  @JsonProperty(JSON_PROPERTY_ICMP_TRACEROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIcmpTraceroute(Traceroute icmpTraceroute) {
    this.icmpTraceroute = icmpTraceroute;
  }


  public LocalNetworkTopologyResult icmpTraceroutes(List<Traceroute> icmpTraceroutes) {
    this.icmpTraceroutes = icmpTraceroutes;
    return this;
  }

  public LocalNetworkTopologyResult addIcmpTraceroutesItem(Traceroute icmpTraceroutesItem) {
    if (this.icmpTraceroutes == null) {
      this.icmpTraceroutes = new ArrayList<>();
    }
    this.icmpTraceroutes.add(icmpTraceroutesItem);
    return this;
  }

   /**
   * Get icmpTraceroutes
   * @return icmpTraceroutes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICMP_TRACEROUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Traceroute> getIcmpTraceroutes() {
    return icmpTraceroutes;
  }


  @JsonProperty(JSON_PROPERTY_ICMP_TRACEROUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIcmpTraceroutes(List<Traceroute> icmpTraceroutes) {
    this.icmpTraceroutes = icmpTraceroutes;
  }


  /**
   * Return true if this LocalNetworkTopologyResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalNetworkTopologyResult localNetworkTopologyResult = (LocalNetworkTopologyResult) o;
    return Objects.equals(this.agentId, localNetworkTopologyResult.agentId) &&
        Objects.equals(this.date, localNetworkTopologyResult.date) &&
        Objects.equals(this.networkTopologyId, localNetworkTopologyResult.networkTopologyId) &&
        Objects.equals(this.roundId, localNetworkTopologyResult.roundId) &&
        Objects.equals(this.target, localNetworkTopologyResult.target) &&
        Objects.equals(this.targetPort, localNetworkTopologyResult.targetPort) &&
        Objects.equals(this.type, localNetworkTopologyResult.type) &&
        Objects.equals(this.icmpPing, localNetworkTopologyResult.icmpPing) &&
        Objects.equals(this.isIcmpBlocked, localNetworkTopologyResult.isIcmpBlocked) &&
        Objects.equals(this.tcpConnect, localNetworkTopologyResult.tcpConnect) &&
        Objects.equals(this.systemMetrics, localNetworkTopologyResult.systemMetrics) &&
        Objects.equals(this.coordinates, localNetworkTopologyResult.coordinates) &&
        Objects.equals(this.networkProfile, localNetworkTopologyResult.networkProfile) &&
        Objects.equals(this.icmpTraceroute, localNetworkTopologyResult.icmpTraceroute) &&
        Objects.equals(this.icmpTraceroutes, localNetworkTopologyResult.icmpTraceroutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, date, networkTopologyId, roundId, target, targetPort, type, icmpPing, isIcmpBlocked, tcpConnect, systemMetrics, coordinates, networkProfile, icmpTraceroute, icmpTraceroutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalNetworkTopologyResult {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    networkTopologyId: ").append(toIndentedString(networkTopologyId)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    icmpPing: ").append(toIndentedString(icmpPing)).append("\n");
    sb.append("    isIcmpBlocked: ").append(toIndentedString(isIcmpBlocked)).append("\n");
    sb.append("    tcpConnect: ").append(toIndentedString(tcpConnect)).append("\n");
    sb.append("    systemMetrics: ").append(toIndentedString(systemMetrics)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    networkProfile: ").append(toIndentedString(networkProfile)).append("\n");
    sb.append("    icmpTraceroute: ").append(toIndentedString(icmpTraceroute)).append("\n");
    sb.append("    icmpTraceroutes: ").append(toIndentedString(icmpTraceroutes)).append("\n");
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

