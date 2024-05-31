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
import com.thousandeyes.api.endpoint.tests.results.model.Trigger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointRealUserTestResultRequestFilter
 */
@JsonPropertyOrder({
  EndpointRealUserTestResultRequestFilter.JSON_PROPERTY_LOCATION,
  EndpointRealUserTestResultRequestFilter.JSON_PROPERTY_CONNECTION,
  EndpointRealUserTestResultRequestFilter.JSON_PROPERTY_PLATFORM,
  EndpointRealUserTestResultRequestFilter.JSON_PROPERTY_GATEWAY,
  EndpointRealUserTestResultRequestFilter.JSON_PROPERTY_PROXY_TARGET,
  EndpointRealUserTestResultRequestFilter.JSON_PROPERTY_VPN_TARGET,
  EndpointRealUserTestResultRequestFilter.JSON_PROPERTY_AGENT_ID,
  EndpointRealUserTestResultRequestFilter.JSON_PROPERTY_NETWORK_ID,
  EndpointRealUserTestResultRequestFilter.JSON_PROPERTY_SSID,
  EndpointRealUserTestResultRequestFilter.JSON_PROPERTY_BSSID,
  EndpointRealUserTestResultRequestFilter.JSON_PROPERTY_DESTINATION_IP,
  EndpointRealUserTestResultRequestFilter.JSON_PROPERTY_DOMAIN,
  EndpointRealUserTestResultRequestFilter.JSON_PROPERTY_TRIGGER,
  EndpointRealUserTestResultRequestFilter.JSON_PROPERTY_VISITED_SITE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EndpointRealUserTestResultRequestFilter {
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

  public static final String JSON_PROPERTY_DESTINATION_IP = "destinationIp";
  private List<String> destinationIp = new ArrayList<>();

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private List<String> domain = new ArrayList<>();

  public static final String JSON_PROPERTY_TRIGGER = "trigger";
  private List<Trigger> trigger = new ArrayList<>();

  public static final String JSON_PROPERTY_VISITED_SITE = "visitedSite";
  private List<String> visitedSite = new ArrayList<>();

  public EndpointRealUserTestResultRequestFilter() { 
  }

  public EndpointRealUserTestResultRequestFilter location(List<String> location) {
    this.location = location;
    return this;
  }

  public EndpointRealUserTestResultRequestFilter addLocationItem(String locationItem) {
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


  public EndpointRealUserTestResultRequestFilter connection(List<InterfaceHardwareType> connection) {
    this.connection = connection;
    return this;
  }

  public EndpointRealUserTestResultRequestFilter addConnectionItem(InterfaceHardwareType connectionItem) {
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


  public EndpointRealUserTestResultRequestFilter platform(List<Platform> platform) {
    this.platform = platform;
    return this;
  }

  public EndpointRealUserTestResultRequestFilter addPlatformItem(Platform platformItem) {
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


  public EndpointRealUserTestResultRequestFilter gateway(List<String> gateway) {
    this.gateway = gateway;
    return this;
  }

  public EndpointRealUserTestResultRequestFilter addGatewayItem(String gatewayItem) {
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


  public EndpointRealUserTestResultRequestFilter proxyTarget(List<String> proxyTarget) {
    this.proxyTarget = proxyTarget;
    return this;
  }

  public EndpointRealUserTestResultRequestFilter addProxyTargetItem(String proxyTargetItem) {
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


  public EndpointRealUserTestResultRequestFilter vpnTarget(List<String> vpnTarget) {
    this.vpnTarget = vpnTarget;
    return this;
  }

  public EndpointRealUserTestResultRequestFilter addVpnTargetItem(String vpnTargetItem) {
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


  public EndpointRealUserTestResultRequestFilter agentId(List<UUID> agentId) {
    this.agentId = agentId;
    return this;
  }

  public EndpointRealUserTestResultRequestFilter addAgentIdItem(UUID agentIdItem) {
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


  public EndpointRealUserTestResultRequestFilter networkId(List<String> networkId) {
    this.networkId = networkId;
    return this;
  }

  public EndpointRealUserTestResultRequestFilter addNetworkIdItem(String networkIdItem) {
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


  public EndpointRealUserTestResultRequestFilter ssid(List<String> ssid) {
    this.ssid = ssid;
    return this;
  }

  public EndpointRealUserTestResultRequestFilter addSsidItem(String ssidItem) {
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


  public EndpointRealUserTestResultRequestFilter bssid(List<String> bssid) {
    this.bssid = bssid;
    return this;
  }

  public EndpointRealUserTestResultRequestFilter addBssidItem(String bssidItem) {
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


  public EndpointRealUserTestResultRequestFilter destinationIp(List<String> destinationIp) {
    this.destinationIp = destinationIp;
    return this;
  }

  public EndpointRealUserTestResultRequestFilter addDestinationIpItem(String destinationIpItem) {
    if (this.destinationIp == null) {
      this.destinationIp = new ArrayList<>();
    }
    this.destinationIp.add(destinationIpItem);
    return this;
  }

   /**
   * Web site destination IP address.
   * @return destinationIp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESTINATION_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDestinationIp() {
    return destinationIp;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestinationIp(List<String> destinationIp) {
    this.destinationIp = destinationIp;
  }


  public EndpointRealUserTestResultRequestFilter domain(List<String> domain) {
    this.domain = domain;
    return this;
  }

  public EndpointRealUserTestResultRequestFilter addDomainItem(String domainItem) {
    if (this.domain == null) {
      this.domain = new ArrayList<>();
    }
    this.domain.add(domainItem);
    return this;
  }

   /**
   * Web site base domain visited during the session.
   * @return domain
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDomain() {
    return domain;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomain(List<String> domain) {
    this.domain = domain;
  }


  public EndpointRealUserTestResultRequestFilter trigger(List<Trigger> trigger) {
    this.trigger = trigger;
    return this;
  }

  public EndpointRealUserTestResultRequestFilter addTriggerItem(Trigger triggerItem) {
    if (this.trigger == null) {
      this.trigger = new ArrayList<>();
    }
    this.trigger.add(triggerItem);
    return this;
  }

   /**
   * Real user test trigger.
   * @return trigger
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Trigger> getTrigger() {
    return trigger;
  }


  @JsonProperty(JSON_PROPERTY_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrigger(List<Trigger> trigger) {
    this.trigger = trigger;
  }


  public EndpointRealUserTestResultRequestFilter visitedSite(List<String> visitedSite) {
    this.visitedSite = visitedSite;
    return this;
  }

  public EndpointRealUserTestResultRequestFilter addVisitedSiteItem(String visitedSiteItem) {
    if (this.visitedSite == null) {
      this.visitedSite = new ArrayList<>();
    }
    this.visitedSite.add(visitedSiteItem);
    return this;
  }

   /**
   * Web site domain visited during the session.
   * @return visitedSite
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISITED_SITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getVisitedSite() {
    return visitedSite;
  }


  @JsonProperty(JSON_PROPERTY_VISITED_SITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisitedSite(List<String> visitedSite) {
    this.visitedSite = visitedSite;
  }


  /**
   * Return true if this EndpointRealUserTestResultRequestFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointRealUserTestResultRequestFilter endpointRealUserTestResultRequestFilter = (EndpointRealUserTestResultRequestFilter) o;
    return Objects.equals(this.location, endpointRealUserTestResultRequestFilter.location) &&
        Objects.equals(this.connection, endpointRealUserTestResultRequestFilter.connection) &&
        Objects.equals(this.platform, endpointRealUserTestResultRequestFilter.platform) &&
        Objects.equals(this.gateway, endpointRealUserTestResultRequestFilter.gateway) &&
        Objects.equals(this.proxyTarget, endpointRealUserTestResultRequestFilter.proxyTarget) &&
        Objects.equals(this.vpnTarget, endpointRealUserTestResultRequestFilter.vpnTarget) &&
        Objects.equals(this.agentId, endpointRealUserTestResultRequestFilter.agentId) &&
        Objects.equals(this.networkId, endpointRealUserTestResultRequestFilter.networkId) &&
        Objects.equals(this.ssid, endpointRealUserTestResultRequestFilter.ssid) &&
        Objects.equals(this.bssid, endpointRealUserTestResultRequestFilter.bssid) &&
        Objects.equals(this.destinationIp, endpointRealUserTestResultRequestFilter.destinationIp) &&
        Objects.equals(this.domain, endpointRealUserTestResultRequestFilter.domain) &&
        Objects.equals(this.trigger, endpointRealUserTestResultRequestFilter.trigger) &&
        Objects.equals(this.visitedSite, endpointRealUserTestResultRequestFilter.visitedSite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, connection, platform, gateway, proxyTarget, vpnTarget, agentId, networkId, ssid, bssid, destinationIp, domain, trigger, visitedSite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointRealUserTestResultRequestFilter {\n");
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
    sb.append("    destinationIp: ").append(toIndentedString(destinationIp)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    visitedSite: ").append(toIndentedString(visitedSite)).append("\n");
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

