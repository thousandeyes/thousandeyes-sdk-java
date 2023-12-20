/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.agents.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.endpoint.agents.model.AgentLicenseType;
import com.thousandeyes.api.endpoint.agents.model.EndpointAgentAid;
import com.thousandeyes.api.endpoint.agents.model.EndpointAgentLocation;
import com.thousandeyes.api.endpoint.agents.model.EndpointAsnDetails;
import com.thousandeyes.api.endpoint.agents.model.EndpointClient;
import com.thousandeyes.api.endpoint.agents.model.EndpointVpnProfile;
import com.thousandeyes.api.endpoint.agents.model.InterfaceProfile;
import com.thousandeyes.api.endpoint.agents.model.Platform;
import com.thousandeyes.api.endpoint.agents.model.SelfLinksLinks;
import com.thousandeyes.api.endpoint.agents.model.Status;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * EndpointAgentsAgentsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:02.075333Z[Europe/Lisbon]")
public class EndpointAgentsAgentsInner {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_AID = "aid";
  @SerializedName(SERIALIZED_NAME_AID)
  private EndpointAgentAid aid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COMPUTER_NAME = "computerName";
  @SerializedName(SERIALIZED_NAME_COMPUTER_NAME)
  private String computerName;

  public static final String SERIALIZED_NAME_OS_VERSION = "osVersion";
  @SerializedName(SERIALIZED_NAME_OS_VERSION)
  private String osVersion;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private Platform platform;

  public static final String SERIALIZED_NAME_KERNEL_VERSION = "kernelVersion";
  @SerializedName(SERIALIZED_NAME_KERNEL_VERSION)
  private String kernelVersion;

  public static final String SERIALIZED_NAME_MANUFACTURER = "manufacturer";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER)
  private String manufacturer;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_LAST_SEEN = "lastSeen";
  @SerializedName(SERIALIZED_NAME_LAST_SEEN)
  private OffsetDateTime lastSeen;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Status status;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_NUMBER_OF_CLIENTS = "numberOfClients";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_CLIENTS)
  private Long numberOfClients;

  public static final String SERIALIZED_NAME_PUBLIC_I_P = "publicIP";
  @SerializedName(SERIALIZED_NAME_PUBLIC_I_P)
  private String publicIP;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private EndpointAgentLocation location;

  public static final String SERIALIZED_NAME_CLIENTS = "clients";
  @SerializedName(SERIALIZED_NAME_CLIENTS)
  private List<EndpointClient> clients;

  public static final String SERIALIZED_NAME_TOTAL_MEMORY = "totalMemory";
  @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY)
  private String totalMemory;

  public static final String SERIALIZED_NAME_AGENT_TYPE = "agentType";
  @SerializedName(SERIALIZED_NAME_AGENT_TYPE)
  private String agentType;

  public static final String SERIALIZED_NAME_VPN_PROFILES = "vpnProfiles";
  @SerializedName(SERIALIZED_NAME_VPN_PROFILES)
  private List<EndpointVpnProfile> vpnProfiles;

  public static final String SERIALIZED_NAME_NETWORK_INTERFACE_PROFILES = "networkInterfaceProfiles";
  @SerializedName(SERIALIZED_NAME_NETWORK_INTERFACE_PROFILES)
  private List<InterfaceProfile> networkInterfaceProfiles;

  public static final String SERIALIZED_NAME_ASN_DETAILS = "asnDetails";
  @SerializedName(SERIALIZED_NAME_ASN_DETAILS)
  private EndpointAsnDetails asnDetails;

  public static final String SERIALIZED_NAME_LICENSE_TYPE = "licenseType";
  @SerializedName(SERIALIZED_NAME_LICENSE_TYPE)
  private AgentLicenseType licenseType;

  public static final String SERIALIZED_NAME_TCP_DRIVER_AVAILABLE = "tcpDriverAvailable";
  @SerializedName(SERIALIZED_NAME_TCP_DRIVER_AVAILABLE)
  private Boolean tcpDriverAvailable;

  public static final String SERIALIZED_NAME_NPCAP_VERSION = "npcapVersion";
  @SerializedName(SERIALIZED_NAME_NPCAP_VERSION)
  private String npcapVersion;

  public EndpointAgentsAgentsInner() {
  }

  
  public EndpointAgentsAgentsInner(
     String id, 
     String computerName, 
     String osVersion, 
     String kernelVersion, 
     String manufacturer, 
     String model, 
     OffsetDateTime lastSeen, 
     Boolean deleted, 
     String version, 
     OffsetDateTime createdAt, 
     Long numberOfClients, 
     String publicIP, 
     List<EndpointClient> clients, 
     String totalMemory, 
     String agentType, 
     List<EndpointVpnProfile> vpnProfiles, 
     List<InterfaceProfile> networkInterfaceProfiles, 
     Boolean tcpDriverAvailable, 
     String npcapVersion
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

  public EndpointAgentsAgentsInner links(SelfLinksLinks links) {
    
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


   /**
   * Identifier of the agent this applies to.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }




  public EndpointAgentsAgentsInner aid(EndpointAgentAid aid) {
    
    this.aid = aid;
    return this;
  }

   /**
   * Get aid
   * @return aid
  **/
  @javax.annotation.Nullable
  public EndpointAgentAid getAid() {
    return aid;
  }


  public void setAid(EndpointAgentAid aid) {
    this.aid = aid;
  }


  public EndpointAgentsAgentsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the agent.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


   /**
   * Get computerName
   * @return computerName
  **/
  @javax.annotation.Nullable
  public String getComputerName() {
    return computerName;
  }




   /**
   * Get osVersion
   * @return osVersion
  **/
  @javax.annotation.Nullable
  public String getOsVersion() {
    return osVersion;
  }




  public EndpointAgentsAgentsInner platform(Platform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  public Platform getPlatform() {
    return platform;
  }


  public void setPlatform(Platform platform) {
    this.platform = platform;
  }


   /**
   * Get kernelVersion
   * @return kernelVersion
  **/
  @javax.annotation.Nullable
  public String getKernelVersion() {
    return kernelVersion;
  }




   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @javax.annotation.Nullable
  public String getManufacturer() {
    return manufacturer;
  }




   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nullable
  public String getModel() {
    return model;
  }




   /**
   * The last time the agent checked-in.
   * @return lastSeen
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastSeen() {
    return lastSeen;
  }




  public EndpointAgentsAgentsInner status(Status status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Status getStatus() {
    return status;
  }


  public void setStatus(Status status) {
    this.status = status;
  }


   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  public Boolean getDeleted() {
    return deleted;
  }




   /**
   * Version of the agent software running.
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }




   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * Get numberOfClients
   * @return numberOfClients
  **/
  @javax.annotation.Nullable
  public Long getNumberOfClients() {
    return numberOfClients;
  }




   /**
   * Get publicIP
   * @return publicIP
  **/
  @javax.annotation.Nullable
  public String getPublicIP() {
    return publicIP;
  }




  public EndpointAgentsAgentsInner location(EndpointAgentLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  public EndpointAgentLocation getLocation() {
    return location;
  }


  public void setLocation(EndpointAgentLocation location) {
    this.location = location;
  }


   /**
   * List of clients (user accounts) that the agent works with. Not populated by default. 
   * @return clients
  **/
  @javax.annotation.Nullable
  public List<EndpointClient> getClients() {
    return clients;
  }




   /**
   * Get totalMemory
   * @return totalMemory
  **/
  @javax.annotation.Nullable
  public String getTotalMemory() {
    return totalMemory;
  }




   /**
   * Get agentType
   * @return agentType
  **/
  @javax.annotation.Nullable
  public String getAgentType() {
    return agentType;
  }




   /**
   * List of VPN connections on the agent. Not populated by default. 
   * @return vpnProfiles
  **/
  @javax.annotation.Nullable
  public List<EndpointVpnProfile> getVpnProfiles() {
    return vpnProfiles;
  }




   /**
   * List of network interfaces on the agent. Not populated by default. 
   * @return networkInterfaceProfiles
  **/
  @javax.annotation.Nullable
  public List<InterfaceProfile> getNetworkInterfaceProfiles() {
    return networkInterfaceProfiles;
  }




  public EndpointAgentsAgentsInner asnDetails(EndpointAsnDetails asnDetails) {
    
    this.asnDetails = asnDetails;
    return this;
  }

   /**
   * Get asnDetails
   * @return asnDetails
  **/
  @javax.annotation.Nullable
  public EndpointAsnDetails getAsnDetails() {
    return asnDetails;
  }


  public void setAsnDetails(EndpointAsnDetails asnDetails) {
    this.asnDetails = asnDetails;
  }


  public EndpointAgentsAgentsInner licenseType(AgentLicenseType licenseType) {
    
    this.licenseType = licenseType;
    return this;
  }

   /**
   * Get licenseType
   * @return licenseType
  **/
  @javax.annotation.Nullable
  public AgentLicenseType getLicenseType() {
    return licenseType;
  }


  public void setLicenseType(AgentLicenseType licenseType) {
    this.licenseType = licenseType;
  }


   /**
   * Status of TCP test support on the agent.
   * @return tcpDriverAvailable
  **/
  @javax.annotation.Nullable
  public Boolean getTcpDriverAvailable() {
    return tcpDriverAvailable;
  }




   /**
   * For Windows agents, the version of the NPCAP driver that the agent has loaded.
   * @return npcapVersion
  **/
  @javax.annotation.Nullable
  public String getNpcapVersion() {
    return npcapVersion;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgentsAgentsInner endpointAgentsAgentsInner = (EndpointAgentsAgentsInner) o;
    return Objects.equals(this.links, endpointAgentsAgentsInner.links) &&
        Objects.equals(this.id, endpointAgentsAgentsInner.id) &&
        Objects.equals(this.aid, endpointAgentsAgentsInner.aid) &&
        Objects.equals(this.name, endpointAgentsAgentsInner.name) &&
        Objects.equals(this.computerName, endpointAgentsAgentsInner.computerName) &&
        Objects.equals(this.osVersion, endpointAgentsAgentsInner.osVersion) &&
        Objects.equals(this.platform, endpointAgentsAgentsInner.platform) &&
        Objects.equals(this.kernelVersion, endpointAgentsAgentsInner.kernelVersion) &&
        Objects.equals(this.manufacturer, endpointAgentsAgentsInner.manufacturer) &&
        Objects.equals(this.model, endpointAgentsAgentsInner.model) &&
        Objects.equals(this.lastSeen, endpointAgentsAgentsInner.lastSeen) &&
        Objects.equals(this.status, endpointAgentsAgentsInner.status) &&
        Objects.equals(this.deleted, endpointAgentsAgentsInner.deleted) &&
        Objects.equals(this.version, endpointAgentsAgentsInner.version) &&
        Objects.equals(this.createdAt, endpointAgentsAgentsInner.createdAt) &&
        Objects.equals(this.numberOfClients, endpointAgentsAgentsInner.numberOfClients) &&
        Objects.equals(this.publicIP, endpointAgentsAgentsInner.publicIP) &&
        Objects.equals(this.location, endpointAgentsAgentsInner.location) &&
        Objects.equals(this.clients, endpointAgentsAgentsInner.clients) &&
        Objects.equals(this.totalMemory, endpointAgentsAgentsInner.totalMemory) &&
        Objects.equals(this.agentType, endpointAgentsAgentsInner.agentType) &&
        Objects.equals(this.vpnProfiles, endpointAgentsAgentsInner.vpnProfiles) &&
        Objects.equals(this.networkInterfaceProfiles, endpointAgentsAgentsInner.networkInterfaceProfiles) &&
        Objects.equals(this.asnDetails, endpointAgentsAgentsInner.asnDetails) &&
        Objects.equals(this.licenseType, endpointAgentsAgentsInner.licenseType) &&
        Objects.equals(this.tcpDriverAvailable, endpointAgentsAgentsInner.tcpDriverAvailable) &&
        Objects.equals(this.npcapVersion, endpointAgentsAgentsInner.npcapVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, aid, name, computerName, osVersion, platform, kernelVersion, manufacturer, model, lastSeen, status, deleted, version, createdAt, numberOfClients, publicIP, location, clients, totalMemory, agentType, vpnProfiles, networkInterfaceProfiles, asnDetails, licenseType, tcpDriverAvailable, npcapVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgentsAgentsInner {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("aid");
    openapiFields.add("name");
    openapiFields.add("computerName");
    openapiFields.add("osVersion");
    openapiFields.add("platform");
    openapiFields.add("kernelVersion");
    openapiFields.add("manufacturer");
    openapiFields.add("model");
    openapiFields.add("lastSeen");
    openapiFields.add("status");
    openapiFields.add("deleted");
    openapiFields.add("version");
    openapiFields.add("createdAt");
    openapiFields.add("numberOfClients");
    openapiFields.add("publicIP");
    openapiFields.add("location");
    openapiFields.add("clients");
    openapiFields.add("totalMemory");
    openapiFields.add("agentType");
    openapiFields.add("vpnProfiles");
    openapiFields.add("networkInterfaceProfiles");
    openapiFields.add("asnDetails");
    openapiFields.add("licenseType");
    openapiFields.add("tcpDriverAvailable");
    openapiFields.add("npcapVersion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EndpointAgentsAgentsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EndpointAgentsAgentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointAgentsAgentsInner is not found in the empty JSON string", EndpointAgentsAgentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EndpointAgentsAgentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointAgentsAgentsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        SelfLinksLinks.validateJsonElement(jsonObj.get("_links"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `aid`
      if (jsonObj.get("aid") != null && !jsonObj.get("aid").isJsonNull()) {
        EndpointAgentAid.validateJsonElement(jsonObj.get("aid"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("computerName") != null && !jsonObj.get("computerName").isJsonNull()) && !jsonObj.get("computerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `computerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("computerName").toString()));
      }
      if ((jsonObj.get("osVersion") != null && !jsonObj.get("osVersion").isJsonNull()) && !jsonObj.get("osVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `osVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("osVersion").toString()));
      }
      // validate the optional field `platform`
      if (jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonNull()) {
        Platform.validateJsonElement(jsonObj.get("platform"));
      }
      if ((jsonObj.get("kernelVersion") != null && !jsonObj.get("kernelVersion").isJsonNull()) && !jsonObj.get("kernelVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kernelVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kernelVersion").toString()));
      }
      if ((jsonObj.get("manufacturer") != null && !jsonObj.get("manufacturer").isJsonNull()) && !jsonObj.get("manufacturer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `manufacturer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("manufacturer").toString()));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Status.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("publicIP") != null && !jsonObj.get("publicIP").isJsonNull()) && !jsonObj.get("publicIP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicIP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicIP").toString()));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        EndpointAgentLocation.validateJsonElement(jsonObj.get("location"));
      }
      if (jsonObj.get("clients") != null && !jsonObj.get("clients").isJsonNull()) {
        JsonArray jsonArrayclients = jsonObj.getAsJsonArray("clients");
        if (jsonArrayclients != null) {
          // ensure the json data is an array
          if (!jsonObj.get("clients").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `clients` to be an array in the JSON string but got `%s`", jsonObj.get("clients").toString()));
          }

          // validate the optional field `clients` (array)
          for (int i = 0; i < jsonArrayclients.size(); i++) {
            EndpointClient.validateJsonElement(jsonArrayclients.get(i));
          };
        }
      }
      if ((jsonObj.get("totalMemory") != null && !jsonObj.get("totalMemory").isJsonNull()) && !jsonObj.get("totalMemory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalMemory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalMemory").toString()));
      }
      if ((jsonObj.get("agentType") != null && !jsonObj.get("agentType").isJsonNull()) && !jsonObj.get("agentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agentType").toString()));
      }
      if (jsonObj.get("vpnProfiles") != null && !jsonObj.get("vpnProfiles").isJsonNull()) {
        JsonArray jsonArrayvpnProfiles = jsonObj.getAsJsonArray("vpnProfiles");
        if (jsonArrayvpnProfiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vpnProfiles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vpnProfiles` to be an array in the JSON string but got `%s`", jsonObj.get("vpnProfiles").toString()));
          }

          // validate the optional field `vpnProfiles` (array)
          for (int i = 0; i < jsonArrayvpnProfiles.size(); i++) {
            EndpointVpnProfile.validateJsonElement(jsonArrayvpnProfiles.get(i));
          };
        }
      }
      if (jsonObj.get("networkInterfaceProfiles") != null && !jsonObj.get("networkInterfaceProfiles").isJsonNull()) {
        JsonArray jsonArraynetworkInterfaceProfiles = jsonObj.getAsJsonArray("networkInterfaceProfiles");
        if (jsonArraynetworkInterfaceProfiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("networkInterfaceProfiles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `networkInterfaceProfiles` to be an array in the JSON string but got `%s`", jsonObj.get("networkInterfaceProfiles").toString()));
          }

          // validate the optional field `networkInterfaceProfiles` (array)
          for (int i = 0; i < jsonArraynetworkInterfaceProfiles.size(); i++) {
            InterfaceProfile.validateJsonElement(jsonArraynetworkInterfaceProfiles.get(i));
          };
        }
      }
      // validate the optional field `asnDetails`
      if (jsonObj.get("asnDetails") != null && !jsonObj.get("asnDetails").isJsonNull()) {
        EndpointAsnDetails.validateJsonElement(jsonObj.get("asnDetails"));
      }
      // validate the optional field `licenseType`
      if (jsonObj.get("licenseType") != null && !jsonObj.get("licenseType").isJsonNull()) {
        AgentLicenseType.validateJsonElement(jsonObj.get("licenseType"));
      }
      if ((jsonObj.get("npcapVersion") != null && !jsonObj.get("npcapVersion").isJsonNull()) && !jsonObj.get("npcapVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `npcapVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("npcapVersion").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointAgentsAgentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointAgentsAgentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointAgentsAgentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointAgentsAgentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointAgentsAgentsInner>() {
           @Override
           public void write(JsonWriter out, EndpointAgentsAgentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointAgentsAgentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EndpointAgentsAgentsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EndpointAgentsAgentsInner
  * @throws IOException if the JSON string is invalid with respect to EndpointAgentsAgentsInner
  */
  public static EndpointAgentsAgentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointAgentsAgentsInner.class);
  }

 /**
  * Convert an instance of EndpointAgentsAgentsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

