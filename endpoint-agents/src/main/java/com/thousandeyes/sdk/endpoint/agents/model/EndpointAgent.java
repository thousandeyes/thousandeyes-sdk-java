/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.   For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.endpoint.agents.model.AgentLicenseType;
import com.thousandeyes.sdk.endpoint.agents.model.EndpointAgentLocation;
import com.thousandeyes.sdk.endpoint.agents.model.EndpointAsnDetails;
import com.thousandeyes.sdk.endpoint.agents.model.EndpointClient;
import com.thousandeyes.sdk.endpoint.agents.model.EndpointVpnProfile;
import com.thousandeyes.sdk.endpoint.agents.model.InterfaceProfile;
import com.thousandeyes.sdk.endpoint.agents.model.Platform;
import com.thousandeyes.sdk.endpoint.agents.model.SelfLinks;
import com.thousandeyes.sdk.endpoint.agents.model.Status;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The &#x60;EndpointAgent&#x60; object, which may include multiple clients.
 */
@JsonPropertyOrder({
  EndpointAgent.JSON_PROPERTY_ID,
  EndpointAgent.JSON_PROPERTY_AID,
  EndpointAgent.JSON_PROPERTY_NAME,
  EndpointAgent.JSON_PROPERTY_COMPUTER_NAME,
  EndpointAgent.JSON_PROPERTY_OS_VERSION,
  EndpointAgent.JSON_PROPERTY_PLATFORM,
  EndpointAgent.JSON_PROPERTY_KERNEL_VERSION,
  EndpointAgent.JSON_PROPERTY_MANUFACTURER,
  EndpointAgent.JSON_PROPERTY_MODEL,
  EndpointAgent.JSON_PROPERTY_LAST_SEEN,
  EndpointAgent.JSON_PROPERTY_STATUS,
  EndpointAgent.JSON_PROPERTY_DELETED,
  EndpointAgent.JSON_PROPERTY_VERSION,
  EndpointAgent.JSON_PROPERTY_TARGET_VERSION,
  EndpointAgent.JSON_PROPERTY_CREATED_AT,
  EndpointAgent.JSON_PROPERTY_NUMBER_OF_CLIENTS,
  EndpointAgent.JSON_PROPERTY_PUBLIC_I_P,
  EndpointAgent.JSON_PROPERTY_LOCATION,
  EndpointAgent.JSON_PROPERTY_CLIENTS,
  EndpointAgent.JSON_PROPERTY_TOTAL_MEMORY,
  EndpointAgent.JSON_PROPERTY_AGENT_TYPE,
  EndpointAgent.JSON_PROPERTY_VPN_PROFILES,
  EndpointAgent.JSON_PROPERTY_NETWORK_INTERFACE_PROFILES,
  EndpointAgent.JSON_PROPERTY_ASN_DETAILS,
  EndpointAgent.JSON_PROPERTY_LICENSE_TYPE,
  EndpointAgent.JSON_PROPERTY_TCP_DRIVER_AVAILABLE,
  EndpointAgent.JSON_PROPERTY_NPCAP_VERSION,
  EndpointAgent.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EndpointAgent {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_AID = "aid";
  private String aid;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_COMPUTER_NAME = "computerName";
  private String computerName;

  public static final String JSON_PROPERTY_OS_VERSION = "osVersion";
  private String osVersion;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private Platform platform;

  public static final String JSON_PROPERTY_KERNEL_VERSION = "kernelVersion";
  private String kernelVersion;

  public static final String JSON_PROPERTY_MANUFACTURER = "manufacturer";
  private String manufacturer;

  public static final String JSON_PROPERTY_MODEL = "model";
  private String model;

  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  private OffsetDateTime lastSeen;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Status status;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_TARGET_VERSION = "targetVersion";
  private String targetVersion;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_NUMBER_OF_CLIENTS = "numberOfClients";
  private Long numberOfClients;

  public static final String JSON_PROPERTY_PUBLIC_I_P = "publicIP";
  private String publicIP;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private EndpointAgentLocation location;

  public static final String JSON_PROPERTY_CLIENTS = "clients";
  private List<EndpointClient> clients = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_MEMORY = "totalMemory";
  private String totalMemory;

  public static final String JSON_PROPERTY_AGENT_TYPE = "agentType";
  private String agentType;

  public static final String JSON_PROPERTY_VPN_PROFILES = "vpnProfiles";
  private List<EndpointVpnProfile> vpnProfiles = new ArrayList<>();

  public static final String JSON_PROPERTY_NETWORK_INTERFACE_PROFILES = "networkInterfaceProfiles";
  private List<InterfaceProfile> networkInterfaceProfiles = new ArrayList<>();

  public static final String JSON_PROPERTY_ASN_DETAILS = "asnDetails";
  private EndpointAsnDetails asnDetails;

  public static final String JSON_PROPERTY_LICENSE_TYPE = "licenseType";
  private AgentLicenseType licenseType;

  public static final String JSON_PROPERTY_TCP_DRIVER_AVAILABLE = "tcpDriverAvailable";
  private Boolean tcpDriverAvailable;

  public static final String JSON_PROPERTY_NPCAP_VERSION = "npcapVersion";
  private String npcapVersion;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinks links;

  public EndpointAgent() { 
  }

  @JsonCreator
  public EndpointAgent(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_COMPUTER_NAME) String computerName, 
    @JsonProperty(JSON_PROPERTY_OS_VERSION) String osVersion, 
    @JsonProperty(JSON_PROPERTY_KERNEL_VERSION) String kernelVersion, 
    @JsonProperty(JSON_PROPERTY_MANUFACTURER) String manufacturer, 
    @JsonProperty(JSON_PROPERTY_MODEL) String model, 
    @JsonProperty(JSON_PROPERTY_LAST_SEEN) OffsetDateTime lastSeen, 
    @JsonProperty(JSON_PROPERTY_DELETED) Boolean deleted, 
    @JsonProperty(JSON_PROPERTY_VERSION) String version, 
    @JsonProperty(JSON_PROPERTY_TARGET_VERSION) String targetVersion, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt, 
    @JsonProperty(JSON_PROPERTY_NUMBER_OF_CLIENTS) Long numberOfClients, 
    @JsonProperty(JSON_PROPERTY_PUBLIC_I_P) String publicIP, 
    @JsonProperty(JSON_PROPERTY_CLIENTS) List<EndpointClient> clients, 
    @JsonProperty(JSON_PROPERTY_TOTAL_MEMORY) String totalMemory, 
    @JsonProperty(JSON_PROPERTY_AGENT_TYPE) String agentType, 
    @JsonProperty(JSON_PROPERTY_VPN_PROFILES) List<EndpointVpnProfile> vpnProfiles, 
    @JsonProperty(JSON_PROPERTY_NETWORK_INTERFACE_PROFILES) List<InterfaceProfile> networkInterfaceProfiles, 
    @JsonProperty(JSON_PROPERTY_TCP_DRIVER_AVAILABLE) Boolean tcpDriverAvailable, 
    @JsonProperty(JSON_PROPERTY_NPCAP_VERSION) String npcapVersion
  ) {
  this();
    this.id = id;
    this.computerName = computerName;
    this.osVersion = osVersion;
    this.kernelVersion = kernelVersion;
    this.manufacturer = manufacturer;
    this.model = model;
    this.lastSeen = lastSeen;
    this.deleted = deleted;
    this.version = version;
    this.targetVersion = targetVersion;
    this.createdAt = createdAt;
    this.numberOfClients = numberOfClients;
    this.publicIP = publicIP;
    this.clients = clients;
    this.totalMemory = totalMemory;
    this.agentType = agentType;
    this.vpnProfiles = vpnProfiles;
    this.networkInterfaceProfiles = networkInterfaceProfiles;
    this.tcpDriverAvailable = tcpDriverAvailable;
    this.npcapVersion = npcapVersion;
  }

   /**
   * Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public EndpointAgent aid(String aid) {
    this.aid = aid;
    return this;
  }

   /**
   * Get aid
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


  public EndpointAgent name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the agent.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


   /**
   * Get computerName
   * @return computerName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComputerName() {
    return computerName;
  }




   /**
   * Get osVersion
   * @return osVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOsVersion() {
    return osVersion;
  }




  public EndpointAgent platform(Platform platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Platform getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatform(Platform platform) {
    this.platform = platform;
  }


   /**
   * Get kernelVersion
   * @return kernelVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KERNEL_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKernelVersion() {
    return kernelVersion;
  }




   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManufacturer() {
    return manufacturer;
  }




   /**
   * Get model
   * @return model
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModel() {
    return model;
  }




   /**
   * The last time the agent checked-in.
   * @return lastSeen
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastSeen() {
    return lastSeen;
  }




  public EndpointAgent status(Status status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Status getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Status status) {
    this.status = status;
  }


   /**
   * Get deleted
   * @return deleted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleted() {
    return deleted;
  }




   /**
   * Version of the agent software running.
   * @return version
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }




   /**
   * The latest available version of the agent. This field is populated only if expand includes &#x60;targetVersion&#x60;.
   * @return targetVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetVersion() {
    return targetVersion;
  }




   /**
   * Get createdAt
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * Get numberOfClients
   * @return numberOfClients
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_CLIENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfClients() {
    return numberOfClients;
  }




   /**
   * Get publicIP
   * @return publicIP
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_I_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicIP() {
    return publicIP;
  }




  public EndpointAgent location(EndpointAgentLocation location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointAgentLocation getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(EndpointAgentLocation location) {
    this.location = location;
  }


   /**
   * List of clients (user accounts) that the agent works with. Not populated by default. 
   * @return clients
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EndpointClient> getClients() {
    return clients;
  }




   /**
   * Get totalMemory
   * @return totalMemory
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_MEMORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTotalMemory() {
    return totalMemory;
  }




   /**
   * Get agentType
   * @return agentType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgentType() {
    return agentType;
  }




   /**
   * List of VPN connections on the agent. Not populated by default. 
   * @return vpnProfiles
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VPN_PROFILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EndpointVpnProfile> getVpnProfiles() {
    return vpnProfiles;
  }




   /**
   * List of network interfaces on the agent. Not populated by default. 
   * @return networkInterfaceProfiles
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_INTERFACE_PROFILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InterfaceProfile> getNetworkInterfaceProfiles() {
    return networkInterfaceProfiles;
  }




  public EndpointAgent asnDetails(EndpointAsnDetails asnDetails) {
    this.asnDetails = asnDetails;
    return this;
  }

   /**
   * Get asnDetails
   * @return asnDetails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASN_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointAsnDetails getAsnDetails() {
    return asnDetails;
  }


  @JsonProperty(JSON_PROPERTY_ASN_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsnDetails(EndpointAsnDetails asnDetails) {
    this.asnDetails = asnDetails;
  }


  public EndpointAgent licenseType(AgentLicenseType licenseType) {
    this.licenseType = licenseType;
    return this;
  }

   /**
   * Get licenseType
   * @return licenseType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LICENSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AgentLicenseType getLicenseType() {
    return licenseType;
  }


  @JsonProperty(JSON_PROPERTY_LICENSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLicenseType(AgentLicenseType licenseType) {
    this.licenseType = licenseType;
  }


   /**
   * Status of TCP test support on the agent.
   * @return tcpDriverAvailable
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_DRIVER_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTcpDriverAvailable() {
    return tcpDriverAvailable;
  }




   /**
   * For Windows agents, the version of the NPCAP driver that the agent has loaded.
   * @return npcapVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NPCAP_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNpcapVersion() {
    return npcapVersion;
  }




  public EndpointAgent links(SelfLinks links) {
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

  public SelfLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinks links) {
    this.links = links;
  }


  /**
   * Return true if this EndpointAgent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgent endpointAgent = (EndpointAgent) o;
    return Objects.equals(this.id, endpointAgent.id) &&
        Objects.equals(this.aid, endpointAgent.aid) &&
        Objects.equals(this.name, endpointAgent.name) &&
        Objects.equals(this.computerName, endpointAgent.computerName) &&
        Objects.equals(this.osVersion, endpointAgent.osVersion) &&
        Objects.equals(this.platform, endpointAgent.platform) &&
        Objects.equals(this.kernelVersion, endpointAgent.kernelVersion) &&
        Objects.equals(this.manufacturer, endpointAgent.manufacturer) &&
        Objects.equals(this.model, endpointAgent.model) &&
        Objects.equals(this.lastSeen, endpointAgent.lastSeen) &&
        Objects.equals(this.status, endpointAgent.status) &&
        Objects.equals(this.deleted, endpointAgent.deleted) &&
        Objects.equals(this.version, endpointAgent.version) &&
        Objects.equals(this.targetVersion, endpointAgent.targetVersion) &&
        Objects.equals(this.createdAt, endpointAgent.createdAt) &&
        Objects.equals(this.numberOfClients, endpointAgent.numberOfClients) &&
        Objects.equals(this.publicIP, endpointAgent.publicIP) &&
        Objects.equals(this.location, endpointAgent.location) &&
        Objects.equals(this.clients, endpointAgent.clients) &&
        Objects.equals(this.totalMemory, endpointAgent.totalMemory) &&
        Objects.equals(this.agentType, endpointAgent.agentType) &&
        Objects.equals(this.vpnProfiles, endpointAgent.vpnProfiles) &&
        Objects.equals(this.networkInterfaceProfiles, endpointAgent.networkInterfaceProfiles) &&
        Objects.equals(this.asnDetails, endpointAgent.asnDetails) &&
        Objects.equals(this.licenseType, endpointAgent.licenseType) &&
        Objects.equals(this.tcpDriverAvailable, endpointAgent.tcpDriverAvailable) &&
        Objects.equals(this.npcapVersion, endpointAgent.npcapVersion) &&
        Objects.equals(this.links, endpointAgent.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, aid, name, computerName, osVersion, platform, kernelVersion, manufacturer, model, lastSeen, status, deleted, version, targetVersion, createdAt, numberOfClients, publicIP, location, clients, totalMemory, agentType, vpnProfiles, networkInterfaceProfiles, asnDetails, licenseType, tcpDriverAvailable, npcapVersion, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    numberOfClients: ").append(toIndentedString(numberOfClients)).append("\n");
    sb.append("    publicIP: ").append(toIndentedString(publicIP)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
    sb.append("    totalMemory: ").append(toIndentedString(totalMemory)).append("\n");
    sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
    sb.append("    vpnProfiles: ").append(toIndentedString(vpnProfiles)).append("\n");
    sb.append("    networkInterfaceProfiles: ").append(toIndentedString(networkInterfaceProfiles)).append("\n");
    sb.append("    asnDetails: ").append(toIndentedString(asnDetails)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    tcpDriverAvailable: ").append(toIndentedString(tcpDriverAvailable)).append("\n");
    sb.append("    npcapVersion: ").append(toIndentedString(npcapVersion)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

