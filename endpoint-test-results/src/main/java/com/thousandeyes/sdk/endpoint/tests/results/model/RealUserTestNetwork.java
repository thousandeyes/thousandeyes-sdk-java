/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.6
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
import com.thousandeyes.sdk.endpoint.tests.results.model.GatewayNetworkPing;
import com.thousandeyes.sdk.endpoint.tests.results.model.NetworkProfile;
import com.thousandeyes.sdk.endpoint.tests.results.model.SystemMetrics;
import com.thousandeyes.sdk.endpoint.tests.results.model.TargetNetworkPing;
import com.thousandeyes.sdk.endpoint.tests.results.model.TargetTraceroute;
import com.thousandeyes.sdk.endpoint.tests.results.model.VpnNetworkPing;
import com.thousandeyes.sdk.endpoint.tests.results.model.VpnTraceroute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contains details about network profile and conditions during session.
 */
@JsonPropertyOrder({
  RealUserTestNetwork.JSON_PROPERTY_NETWORK_PROFILE,
  RealUserTestNetwork.JSON_PROPERTY_SYSTEM_METRICS,
  RealUserTestNetwork.JSON_PROPERTY_GATEWAY_PING,
  RealUserTestNetwork.JSON_PROPERTY_PING,
  RealUserTestNetwork.JSON_PROPERTY_TRACEROUTE,
  RealUserTestNetwork.JSON_PROPERTY_CONNECT_RTT,
  RealUserTestNetwork.JSON_PROPERTY_IS_ICMP_BLOCKED,
  RealUserTestNetwork.JSON_PROPERTY_ERRORS,
  RealUserTestNetwork.JSON_PROPERTY_VPN_PING,
  RealUserTestNetwork.JSON_PROPERTY_VPN_TRACEROUTE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class RealUserTestNetwork {
  public static final String JSON_PROPERTY_NETWORK_PROFILE = "networkProfile";
  private NetworkProfile networkProfile;

  public static final String JSON_PROPERTY_SYSTEM_METRICS = "systemMetrics";
  private SystemMetrics systemMetrics;

  public static final String JSON_PROPERTY_GATEWAY_PING = "gatewayPing";
  private GatewayNetworkPing gatewayPing;

  public static final String JSON_PROPERTY_PING = "ping";
  private TargetNetworkPing ping;

  public static final String JSON_PROPERTY_TRACEROUTE = "traceroute";
  private TargetTraceroute traceroute;

  public static final String JSON_PROPERTY_CONNECT_RTT = "connectRtt";
  private Double connectRtt;

  public static final String JSON_PROPERTY_IS_ICMP_BLOCKED = "isIcmpBlocked";
  private Boolean isIcmpBlocked;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<String> errors = new ArrayList<>();

  public static final String JSON_PROPERTY_VPN_PING = "vpnPing";
  private VpnNetworkPing vpnPing;

  public static final String JSON_PROPERTY_VPN_TRACEROUTE = "vpnTraceroute";
  private VpnTraceroute vpnTraceroute;

  public RealUserTestNetwork() { 
  }

  @JsonCreator
  public RealUserTestNetwork(
    @JsonProperty(JSON_PROPERTY_CONNECT_RTT) Double connectRtt, 
    @JsonProperty(JSON_PROPERTY_IS_ICMP_BLOCKED) Boolean isIcmpBlocked, 
    @JsonProperty(JSON_PROPERTY_ERRORS) List<String> errors
  ) {
  this();
    this.connectRtt = connectRtt;
    this.isIcmpBlocked = isIcmpBlocked;
    this.errors = errors;
  }

  public RealUserTestNetwork networkProfile(NetworkProfile networkProfile) {
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


  public RealUserTestNetwork systemMetrics(SystemMetrics systemMetrics) {
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


  public RealUserTestNetwork gatewayPing(GatewayNetworkPing gatewayPing) {
    this.gatewayPing = gatewayPing;
    return this;
  }

   /**
   * Get gatewayPing
   * @return gatewayPing
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GATEWAY_PING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GatewayNetworkPing getGatewayPing() {
    return gatewayPing;
  }


  @JsonProperty(JSON_PROPERTY_GATEWAY_PING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGatewayPing(GatewayNetworkPing gatewayPing) {
    this.gatewayPing = gatewayPing;
  }


  public RealUserTestNetwork ping(TargetNetworkPing ping) {
    this.ping = ping;
    return this;
  }

   /**
   * Get ping
   * @return ping
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TargetNetworkPing getPing() {
    return ping;
  }


  @JsonProperty(JSON_PROPERTY_PING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPing(TargetNetworkPing ping) {
    this.ping = ping;
  }


  public RealUserTestNetwork traceroute(TargetTraceroute traceroute) {
    this.traceroute = traceroute;
    return this;
  }

   /**
   * Get traceroute
   * @return traceroute
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACEROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TargetTraceroute getTraceroute() {
    return traceroute;
  }


  @JsonProperty(JSON_PROPERTY_TRACEROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTraceroute(TargetTraceroute traceroute) {
    this.traceroute = traceroute;
  }


   /**
   * Represents the number of milliseconds required to establish TCP connectivity with the target.
   * @return connectRtt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECT_RTT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getConnectRtt() {
    return connectRtt;
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
   * Array of string representing possible network errors.
   * @return errors
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getErrors() {
    return errors;
  }




  public RealUserTestNetwork vpnPing(VpnNetworkPing vpnPing) {
    this.vpnPing = vpnPing;
    return this;
  }

   /**
   * Get vpnPing
   * @return vpnPing
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VPN_PING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VpnNetworkPing getVpnPing() {
    return vpnPing;
  }


  @JsonProperty(JSON_PROPERTY_VPN_PING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVpnPing(VpnNetworkPing vpnPing) {
    this.vpnPing = vpnPing;
  }


  public RealUserTestNetwork vpnTraceroute(VpnTraceroute vpnTraceroute) {
    this.vpnTraceroute = vpnTraceroute;
    return this;
  }

   /**
   * Get vpnTraceroute
   * @return vpnTraceroute
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VPN_TRACEROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VpnTraceroute getVpnTraceroute() {
    return vpnTraceroute;
  }


  @JsonProperty(JSON_PROPERTY_VPN_TRACEROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVpnTraceroute(VpnTraceroute vpnTraceroute) {
    this.vpnTraceroute = vpnTraceroute;
  }


  /**
   * Return true if this RealUserTestNetwork object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealUserTestNetwork realUserTestNetwork = (RealUserTestNetwork) o;
    return Objects.equals(this.networkProfile, realUserTestNetwork.networkProfile) &&
        Objects.equals(this.systemMetrics, realUserTestNetwork.systemMetrics) &&
        Objects.equals(this.gatewayPing, realUserTestNetwork.gatewayPing) &&
        Objects.equals(this.ping, realUserTestNetwork.ping) &&
        Objects.equals(this.traceroute, realUserTestNetwork.traceroute) &&
        Objects.equals(this.connectRtt, realUserTestNetwork.connectRtt) &&
        Objects.equals(this.isIcmpBlocked, realUserTestNetwork.isIcmpBlocked) &&
        Objects.equals(this.errors, realUserTestNetwork.errors) &&
        Objects.equals(this.vpnPing, realUserTestNetwork.vpnPing) &&
        Objects.equals(this.vpnTraceroute, realUserTestNetwork.vpnTraceroute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkProfile, systemMetrics, gatewayPing, ping, traceroute, connectRtt, isIcmpBlocked, errors, vpnPing, vpnTraceroute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealUserTestNetwork {\n");
    sb.append("    networkProfile: ").append(toIndentedString(networkProfile)).append("\n");
    sb.append("    systemMetrics: ").append(toIndentedString(systemMetrics)).append("\n");
    sb.append("    gatewayPing: ").append(toIndentedString(gatewayPing)).append("\n");
    sb.append("    ping: ").append(toIndentedString(ping)).append("\n");
    sb.append("    traceroute: ").append(toIndentedString(traceroute)).append("\n");
    sb.append("    connectRtt: ").append(toIndentedString(connectRtt)).append("\n");
    sb.append("    isIcmpBlocked: ").append(toIndentedString(isIcmpBlocked)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    vpnPing: ").append(toIndentedString(vpnPing)).append("\n");
    sb.append("    vpnTraceroute: ").append(toIndentedString(vpnTraceroute)).append("\n");
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

