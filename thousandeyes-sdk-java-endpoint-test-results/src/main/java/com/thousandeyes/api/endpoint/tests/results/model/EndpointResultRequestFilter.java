/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.4
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
import com.thousandeyes.api.endpoint.tests.results.model.InterfaceHardwareType;
import com.thousandeyes.api.endpoint.tests.results.model.Platform;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointResultRequestFilter
 */
@JsonPropertyOrder({
  EndpointResultRequestFilter.JSON_PROPERTY_LOCATION,
  EndpointResultRequestFilter.JSON_PROPERTY_CONNECTION,
  EndpointResultRequestFilter.JSON_PROPERTY_PLATFORM,
  EndpointResultRequestFilter.JSON_PROPERTY_GATEWAY,
  EndpointResultRequestFilter.JSON_PROPERTY_PROXY_TARGET,
  EndpointResultRequestFilter.JSON_PROPERTY_VPN_TARGET,
  EndpointResultRequestFilter.JSON_PROPERTY_AGENT_ID,
  EndpointResultRequestFilter.JSON_PROPERTY_NETWORK_ID,
  EndpointResultRequestFilter.JSON_PROPERTY_SSID,
  EndpointResultRequestFilter.JSON_PROPERTY_BSSID
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EndpointResultRequestFilter {
  public static final String JSON_PROPERTY_LOCATION = "location";
  private List<String> location = new ArrayList<>();

  public static final String JSON_PROPERTY_CONNECTION = "connection";
  private List<InterfaceHardwareType> connection = new ArrayList<>();

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private List<Platform> platform = new ArrayList<>();

  public static final String JSON_PROPERTY_GATEWAY = "gateway";
  private List<String> gateway = new ArrayList<>();

  public static final String JSON_PROPERTY_PROXY_TARGET = "proxyTarget";
  private List<String> proxyTarget = new ArrayList<>();

  public static final String JSON_PROPERTY_VPN_TARGET = "vpnTarget";
  private List<String> vpnTarget = new ArrayList<>();

  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private List<UUID> agentId = new ArrayList<>();

  public static final String JSON_PROPERTY_NETWORK_ID = "networkId";
  private List<String> networkId = new ArrayList<>();

  public static final String JSON_PROPERTY_SSID = "ssid";
  private List<String> ssid = new ArrayList<>();

  public static final String JSON_PROPERTY_BSSID = "bssid";
  private List<String> bssid = new ArrayList<>();

  public EndpointResultRequestFilter() { 
  }

  public EndpointResultRequestFilter location(List<String> location) {
    this.location = location;
    return this;
  }

  public EndpointResultRequestFilter addLocationItem(String locationItem) {
    if (this.location == null) {
      this.location = new ArrayList<>();
    }
    this.location.add(locationItem);
    return this;
  }

   /**
   * Location of the endpoint agent.
   * @return location
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(List<String> location) {
    this.location = location;
  }


  public EndpointResultRequestFilter connection(List<InterfaceHardwareType> connection) {
    this.connection = connection;
    return this;
  }

  public EndpointResultRequestFilter addConnectionItem(InterfaceHardwareType connectionItem) {
    if (this.connection == null) {
      this.connection = new ArrayList<>();
    }
    this.connection.add(connectionItem);
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InterfaceHardwareType> getConnection() {
    return connection;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnection(List<InterfaceHardwareType> connection) {
    this.connection = connection;
  }


  public EndpointResultRequestFilter platform(List<Platform> platform) {
    this.platform = platform;
    return this;
  }

  public EndpointResultRequestFilter addPlatformItem(Platform platformItem) {
    if (this.platform == null) {
      this.platform = new ArrayList<>();
    }
    this.platform.add(platformItem);
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Platform> getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatform(List<Platform> platform) {
    this.platform = platform;
  }


  public EndpointResultRequestFilter gateway(List<String> gateway) {
    this.gateway = gateway;
    return this;
  }

  public EndpointResultRequestFilter addGatewayItem(String gatewayItem) {
    if (this.gateway == null) {
      this.gateway = new ArrayList<>();
    }
    this.gateway.add(gatewayItem);
    return this;
  }

   /**
   * Endpoint agent default gateway IP address.
   * @return gateway
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GATEWAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getGateway() {
    return gateway;
  }


  @JsonProperty(JSON_PROPERTY_GATEWAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGateway(List<String> gateway) {
    this.gateway = gateway;
  }


  public EndpointResultRequestFilter proxyTarget(List<String> proxyTarget) {
    this.proxyTarget = proxyTarget;
    return this;
  }

  public EndpointResultRequestFilter addProxyTargetItem(String proxyTargetItem) {
    if (this.proxyTarget == null) {
      this.proxyTarget = new ArrayList<>();
    }
    this.proxyTarget.add(proxyTargetItem);
    return this;
  }

   /**
   * Endpoint agent proxy IP address.
   * @return proxyTarget
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROXY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getProxyTarget() {
    return proxyTarget;
  }


  @JsonProperty(JSON_PROPERTY_PROXY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProxyTarget(List<String> proxyTarget) {
    this.proxyTarget = proxyTarget;
  }


  public EndpointResultRequestFilter vpnTarget(List<String> vpnTarget) {
    this.vpnTarget = vpnTarget;
    return this;
  }

  public EndpointResultRequestFilter addVpnTargetItem(String vpnTargetItem) {
    if (this.vpnTarget == null) {
      this.vpnTarget = new ArrayList<>();
    }
    this.vpnTarget.add(vpnTargetItem);
    return this;
  }

   /**
   * Endpoint agent VPN endpoint IP address.
   * @return vpnTarget
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VPN_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getVpnTarget() {
    return vpnTarget;
  }


  @JsonProperty(JSON_PROPERTY_VPN_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVpnTarget(List<String> vpnTarget) {
    this.vpnTarget = vpnTarget;
  }


  public EndpointResultRequestFilter agentId(List<UUID> agentId) {
    this.agentId = agentId;
    return this;
  }

  public EndpointResultRequestFilter addAgentIdItem(UUID agentIdItem) {
    if (this.agentId == null) {
      this.agentId = new ArrayList<>();
    }
    this.agentId.add(agentIdItem);
    return this;
  }

   /**
   * Endpoint agent ID.
   * @return agentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getAgentId() {
    return agentId;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentId(List<UUID> agentId) {
    this.agentId = agentId;
  }


  public EndpointResultRequestFilter networkId(List<String> networkId) {
    this.networkId = networkId;
    return this;
  }

  public EndpointResultRequestFilter addNetworkIdItem(String networkIdItem) {
    if (this.networkId == null) {
      this.networkId = new ArrayList<>();
    }
    this.networkId.add(networkIdItem);
    return this;
  }

   /**
   * Network ID.
   * @return networkId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getNetworkId() {
    return networkId;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkId(List<String> networkId) {
    this.networkId = networkId;
  }


  public EndpointResultRequestFilter ssid(List<String> ssid) {
    this.ssid = ssid;
    return this;
  }

  public EndpointResultRequestFilter addSsidItem(String ssidItem) {
    if (this.ssid == null) {
      this.ssid = new ArrayList<>();
    }
    this.ssid.add(ssidItem);
    return this;
  }

   /**
   * WiFi SSID.
   * @return ssid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSsid() {
    return ssid;
  }


  @JsonProperty(JSON_PROPERTY_SSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsid(List<String> ssid) {
    this.ssid = ssid;
  }


  public EndpointResultRequestFilter bssid(List<String> bssid) {
    this.bssid = bssid;
    return this;
  }

  public EndpointResultRequestFilter addBssidItem(String bssidItem) {
    if (this.bssid == null) {
      this.bssid = new ArrayList<>();
    }
    this.bssid.add(bssidItem);
    return this;
  }

   /**
   * WiFi BSSID.
   * @return bssid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BSSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getBssid() {
    return bssid;
  }


  @JsonProperty(JSON_PROPERTY_BSSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBssid(List<String> bssid) {
    this.bssid = bssid;
  }


  /**
   * Return true if this EndpointResultRequestFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointResultRequestFilter endpointResultRequestFilter = (EndpointResultRequestFilter) o;
    return Objects.equals(this.location, endpointResultRequestFilter.location) &&
        Objects.equals(this.connection, endpointResultRequestFilter.connection) &&
        Objects.equals(this.platform, endpointResultRequestFilter.platform) &&
        Objects.equals(this.gateway, endpointResultRequestFilter.gateway) &&
        Objects.equals(this.proxyTarget, endpointResultRequestFilter.proxyTarget) &&
        Objects.equals(this.vpnTarget, endpointResultRequestFilter.vpnTarget) &&
        Objects.equals(this.agentId, endpointResultRequestFilter.agentId) &&
        Objects.equals(this.networkId, endpointResultRequestFilter.networkId) &&
        Objects.equals(this.ssid, endpointResultRequestFilter.ssid) &&
        Objects.equals(this.bssid, endpointResultRequestFilter.bssid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, connection, platform, gateway, proxyTarget, vpnTarget, agentId, networkId, ssid, bssid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointResultRequestFilter {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    proxyTarget: ").append(toIndentedString(proxyTarget)).append("\n");
    sb.append("    vpnTarget: ").append(toIndentedString(vpnTarget)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
    sb.append("    bssid: ").append(toIndentedString(bssid)).append("\n");
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

