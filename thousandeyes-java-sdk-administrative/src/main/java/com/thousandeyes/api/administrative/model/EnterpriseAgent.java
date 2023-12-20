/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API.  This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.administrative.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.administrative.model.AccountGroup1;
import com.thousandeyes.api.administrative.model.CloudEnterpriseAgentType;
import com.thousandeyes.api.administrative.model.ClusterMember;
import com.thousandeyes.api.administrative.model.EnterpriseAgentIpv6Policy;
import com.thousandeyes.api.administrative.model.EnterpriseAgentState;
import com.thousandeyes.api.administrative.model.ErrorDetail;
import com.thousandeyes.api.administrative.model.InterfaceIpMapping;
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

import com.thousandeyes.api.JSON;

/**
 * EnterpriseAgent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:29.770800Z[Europe/Lisbon]")
public class EnterpriseAgent {
  public static final String SERIALIZED_NAME_IP_ADDRESSES = "ipAddresses";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESSES)
  private List<String> ipAddresses;

  public static final String SERIALIZED_NAME_PUBLIC_IP_ADDRESSES = "publicIpAddresses";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IP_ADDRESSES)
  private List<String> publicIpAddresses;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_AGENT_ID = "agentId";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private String agentId;

  public static final String SERIALIZED_NAME_AGENT_NAME = "agentName";
  @SerializedName(SERIALIZED_NAME_AGENT_NAME)
  private String agentName;

  public static final String SERIALIZED_NAME_AGENT_TYPE = "agentType";
  @SerializedName(SERIALIZED_NAME_AGENT_TYPE)
  private CloudEnterpriseAgentType agentType;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_COUNTRY_ID = "countryId";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ID)
  private String countryId;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_VERIFY_SSL_CERTIFICATES = "verifySslCertificates";
  @SerializedName(SERIALIZED_NAME_VERIFY_SSL_CERTIFICATES)
  private Boolean verifySslCertificates;

  public static final String SERIALIZED_NAME_CLUSTER_MEMBERS = "clusterMembers";
  @SerializedName(SERIALIZED_NAME_CLUSTER_MEMBERS)
  private List<ClusterMember> clusterMembers;

  public static final String SERIALIZED_NAME_UTILIZATION = "utilization";
  @SerializedName(SERIALIZED_NAME_UTILIZATION)
  private Integer utilization;

  public static final String SERIALIZED_NAME_ACCOUNT_GROUPS = "accountGroups";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GROUPS)
  private List<AccountGroup1> accountGroups;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_IPV6_POLICY = "ipv6Policy";
  @SerializedName(SERIALIZED_NAME_IPV6_POLICY)
  private EnterpriseAgentIpv6Policy ipv6Policy;

  public static final String SERIALIZED_NAME_ERROR_DETAILS = "errorDetails";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAILS)
  private List<ErrorDetail> errorDetails;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_LAST_SEEN = "lastSeen";
  @SerializedName(SERIALIZED_NAME_LAST_SEEN)
  private OffsetDateTime lastSeen;

  public static final String SERIALIZED_NAME_AGENT_STATE = "agentState";
  @SerializedName(SERIALIZED_NAME_AGENT_STATE)
  private EnterpriseAgentState agentState;

  public static final String SERIALIZED_NAME_KEEP_BROWSER_CACHE = "keepBrowserCache";
  @SerializedName(SERIALIZED_NAME_KEEP_BROWSER_CACHE)
  private Boolean keepBrowserCache;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_TARGET_FOR_TESTS = "targetForTests";
  @SerializedName(SERIALIZED_NAME_TARGET_FOR_TESTS)
  private String targetForTests;

  public static final String SERIALIZED_NAME_LOCAL_RESOLUTION_PREFIXES = "localResolutionPrefixes";
  @SerializedName(SERIALIZED_NAME_LOCAL_RESOLUTION_PREFIXES)
  private List<String> localResolutionPrefixes;

  public static final String SERIALIZED_NAME_INTERFACE_IP_MAPPINGS = "interfaceIpMappings";
  @SerializedName(SERIALIZED_NAME_INTERFACE_IP_MAPPINGS)
  private List<InterfaceIpMapping> interfaceIpMappings;

  public EnterpriseAgent() {
  }

  
  public EnterpriseAgent(
     List<String> ipAddresses, 
     List<String> publicIpAddresses, 
     String network, 
     String agentId, 
     String location, 
     String countryId, 
     Boolean verifySslCertificates, 
     List<ClusterMember> clusterMembers, 
     Integer utilization, 
     String prefix, 
     List<ErrorDetail> errorDetails, 
     String hostname, 
     OffsetDateTime lastSeen, 
     OffsetDateTime createdDate, 
     List<InterfaceIpMapping> interfaceIpMappings
  ) {
    this();
    this.ipAddresses = ipAddresses;
    this.publicIpAddresses = publicIpAddresses;
    this.network = network;
    this.agentId = agentId;
    this.location = location;
    this.countryId = countryId;
    this.verifySslCertificates = verifySslCertificates;
    this.clusterMembers = clusterMembers;
    this.utilization = utilization;
    this.prefix = prefix;
    this.errorDetails = errorDetails;
    this.hostname = hostname;
    this.lastSeen = lastSeen;
    this.createdDate = createdDate;
    this.interfaceIpMappings = interfaceIpMappings;
  }

   /**
   * Array of private IP addresses.
   * @return ipAddresses
  **/
  @javax.annotation.Nullable
  public List<String> getIpAddresses() {
    return ipAddresses;
  }




   /**
   * Array of public IP addresses.
   * @return publicIpAddresses
  **/
  @javax.annotation.Nullable
  public List<String> getPublicIpAddresses() {
    return publicIpAddresses;
  }




   /**
   * Network (including ASN) of agent’s public IP.
   * @return network
  **/
  @javax.annotation.Nullable
  public String getNetwork() {
    return network;
  }




   /**
   * Unique ID of the agent.
   * @return agentId
  **/
  @javax.annotation.Nullable
  public String getAgentId() {
    return agentId;
  }




  public EnterpriseAgent agentName(String agentName) {
    
    this.agentName = agentName;
    return this;
  }

   /**
   * Name of the agent.
   * @return agentName
  **/
  @javax.annotation.Nullable
  public String getAgentName() {
    return agentName;
  }


  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }


  public EnterpriseAgent agentType(CloudEnterpriseAgentType agentType) {
    
    this.agentType = agentType;
    return this;
  }

   /**
   * Get agentType
   * @return agentType
  **/
  @javax.annotation.Nullable
  public CloudEnterpriseAgentType getAgentType() {
    return agentType;
  }


  public void setAgentType(CloudEnterpriseAgentType agentType) {
    this.agentType = agentType;
  }


   /**
   * Location of the agent.
   * @return location
  **/
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }




   /**
   * 2-digit ISO country code
   * @return countryId
  **/
  @javax.annotation.Nullable
  public String getCountryId() {
    return countryId;
  }




  public EnterpriseAgent enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Flag indicating if the agent is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


   /**
   * Flag indicating if has normal SSL operations or  if instead it&#39;s set to ignore SSL errors on browserbot-based tests.
   * @return verifySslCertificates
  **/
  @javax.annotation.Nullable
  public Boolean getVerifySslCertificates() {
    return verifySslCertificates;
  }




   /**
   * If an enterprise agent is clustered, detailed information about each cluster member will be shown as array entries in the clusterMembers field. This field is not shown for Enterprise Agents in standalone mode, or for Cloud Agents.
   * @return clusterMembers
  **/
  @javax.annotation.Nullable
  public List<ClusterMember> getClusterMembers() {
    return clusterMembers;
  }




   /**
   * Shows overall utilization percentage (online Enterprise Agents and Enterprise Clusters only).
   * @return utilization
  **/
  @javax.annotation.Nullable
  public Integer getUtilization() {
    return utilization;
  }




  public EnterpriseAgent accountGroups(List<AccountGroup1> accountGroups) {
    
    this.accountGroups = accountGroups;
    return this;
  }

  public EnterpriseAgent addAccountGroupsItem(AccountGroup1 accountGroupsItem) {
    if (this.accountGroups == null) {
      this.accountGroups = new ArrayList<>();
    }
    this.accountGroups.add(accountGroupsItem);
    return this;
  }

   /**
   * List of account groups. See /accounts-groups to pull a list of account IDs
   * @return accountGroups
  **/
  @javax.annotation.Nullable
  public List<AccountGroup1> getAccountGroups() {
    return accountGroups;
  }


  public void setAccountGroups(List<AccountGroup1> accountGroups) {
    this.accountGroups = accountGroups;
  }


   /**
   * Prefix containing agents public IP address.
   * @return prefix
  **/
  @javax.annotation.Nullable
  public String getPrefix() {
    return prefix;
  }




  public EnterpriseAgent ipv6Policy(EnterpriseAgentIpv6Policy ipv6Policy) {
    
    this.ipv6Policy = ipv6Policy;
    return this;
  }

   /**
   * Get ipv6Policy
   * @return ipv6Policy
  **/
  @javax.annotation.Nullable
  public EnterpriseAgentIpv6Policy getIpv6Policy() {
    return ipv6Policy;
  }


  public void setIpv6Policy(EnterpriseAgentIpv6Policy ipv6Policy) {
    this.ipv6Policy = ipv6Policy;
  }


   /**
   * If an enterprise agent or a cluster member presents at least one error, the errors will be shown as an array of entries in the errorDetails field (Enterprise Agents and Enterprise Cluster members only)
   * @return errorDetails
  **/
  @javax.annotation.Nullable
  public List<ErrorDetail> getErrorDetails() {
    return errorDetails;
  }




   /**
   * Fully qualified domain name of the agent (Enterprise Agents only)
   * @return hostname
  **/
  @javax.annotation.Nullable
  public String getHostname() {
    return hostname;
  }




   /**
   * UTC last seen date (ISO date-time format).
   * @return lastSeen
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastSeen() {
    return lastSeen;
  }




  public EnterpriseAgent agentState(EnterpriseAgentState agentState) {
    
    this.agentState = agentState;
    return this;
  }

   /**
   * Get agentState
   * @return agentState
  **/
  @javax.annotation.Nullable
  public EnterpriseAgentState getAgentState() {
    return agentState;
  }


  public void setAgentState(EnterpriseAgentState agentState) {
    this.agentState = agentState;
  }


  public EnterpriseAgent keepBrowserCache(Boolean keepBrowserCache) {
    
    this.keepBrowserCache = keepBrowserCache;
    return this;
  }

   /**
   * Flag indicating if the agent retains cache.
   * @return keepBrowserCache
  **/
  @javax.annotation.Nullable
  public Boolean getKeepBrowserCache() {
    return keepBrowserCache;
  }


  public void setKeepBrowserCache(Boolean keepBrowserCache) {
    this.keepBrowserCache = keepBrowserCache;
  }


   /**
   * UTC Agent creation date (ISO date-time format).
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




  public EnterpriseAgent targetForTests(String targetForTests) {
    
    this.targetForTests = targetForTests;
    return this;
  }

   /**
   * Test target IP address.
   * @return targetForTests
  **/
  @javax.annotation.Nullable
  public String getTargetForTests() {
    return targetForTests;
  }


  public void setTargetForTests(String targetForTests) {
    this.targetForTests = targetForTests;
  }


  public EnterpriseAgent localResolutionPrefixes(List<String> localResolutionPrefixes) {
    
    this.localResolutionPrefixes = localResolutionPrefixes;
    return this;
  }

  public EnterpriseAgent addLocalResolutionPrefixesItem(String localResolutionPrefixesItem) {
    if (this.localResolutionPrefixes == null) {
      this.localResolutionPrefixes = new ArrayList<>();
    }
    this.localResolutionPrefixes.add(localResolutionPrefixesItem);
    return this;
  }

   /**
   * To perform rDNS lookups for public IP ranges, this field represents the public IP ranges. The range must be in CIDR notation; for example, 10.1.1.0/24. Maximum of 5 prefixes allowed (Enterprise Agents and Enterprise Agent clusters only).
   * @return localResolutionPrefixes
  **/
  @javax.annotation.Nullable
  public List<String> getLocalResolutionPrefixes() {
    return localResolutionPrefixes;
  }


  public void setLocalResolutionPrefixes(List<String> localResolutionPrefixes) {
    this.localResolutionPrefixes = localResolutionPrefixes;
  }


   /**
   * Get interfaceIpMappings
   * @return interfaceIpMappings
  **/
  @javax.annotation.Nullable
  public List<InterfaceIpMapping> getInterfaceIpMappings() {
    return interfaceIpMappings;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseAgent enterpriseAgent = (EnterpriseAgent) o;
    return Objects.equals(this.ipAddresses, enterpriseAgent.ipAddresses) &&
        Objects.equals(this.publicIpAddresses, enterpriseAgent.publicIpAddresses) &&
        Objects.equals(this.network, enterpriseAgent.network) &&
        Objects.equals(this.agentId, enterpriseAgent.agentId) &&
        Objects.equals(this.agentName, enterpriseAgent.agentName) &&
        Objects.equals(this.agentType, enterpriseAgent.agentType) &&
        Objects.equals(this.location, enterpriseAgent.location) &&
        Objects.equals(this.countryId, enterpriseAgent.countryId) &&
        Objects.equals(this.enabled, enterpriseAgent.enabled) &&
        Objects.equals(this.verifySslCertificates, enterpriseAgent.verifySslCertificates) &&
        Objects.equals(this.clusterMembers, enterpriseAgent.clusterMembers) &&
        Objects.equals(this.utilization, enterpriseAgent.utilization) &&
        Objects.equals(this.accountGroups, enterpriseAgent.accountGroups) &&
        Objects.equals(this.prefix, enterpriseAgent.prefix) &&
        Objects.equals(this.ipv6Policy, enterpriseAgent.ipv6Policy) &&
        Objects.equals(this.errorDetails, enterpriseAgent.errorDetails) &&
        Objects.equals(this.hostname, enterpriseAgent.hostname) &&
        Objects.equals(this.lastSeen, enterpriseAgent.lastSeen) &&
        Objects.equals(this.agentState, enterpriseAgent.agentState) &&
        Objects.equals(this.keepBrowserCache, enterpriseAgent.keepBrowserCache) &&
        Objects.equals(this.createdDate, enterpriseAgent.createdDate) &&
        Objects.equals(this.targetForTests, enterpriseAgent.targetForTests) &&
        Objects.equals(this.localResolutionPrefixes, enterpriseAgent.localResolutionPrefixes) &&
        Objects.equals(this.interfaceIpMappings, enterpriseAgent.interfaceIpMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddresses, publicIpAddresses, network, agentId, agentName, agentType, location, countryId, enabled, verifySslCertificates, clusterMembers, utilization, accountGroups, prefix, ipv6Policy, errorDetails, hostname, lastSeen, agentState, keepBrowserCache, createdDate, targetForTests, localResolutionPrefixes, interfaceIpMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseAgent {\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    publicIpAddresses: ").append(toIndentedString(publicIpAddresses)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    verifySslCertificates: ").append(toIndentedString(verifySslCertificates)).append("\n");
    sb.append("    clusterMembers: ").append(toIndentedString(clusterMembers)).append("\n");
    sb.append("    utilization: ").append(toIndentedString(utilization)).append("\n");
    sb.append("    accountGroups: ").append(toIndentedString(accountGroups)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    ipv6Policy: ").append(toIndentedString(ipv6Policy)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    agentState: ").append(toIndentedString(agentState)).append("\n");
    sb.append("    keepBrowserCache: ").append(toIndentedString(keepBrowserCache)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    targetForTests: ").append(toIndentedString(targetForTests)).append("\n");
    sb.append("    localResolutionPrefixes: ").append(toIndentedString(localResolutionPrefixes)).append("\n");
    sb.append("    interfaceIpMappings: ").append(toIndentedString(interfaceIpMappings)).append("\n");
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
    openapiFields.add("ipAddresses");
    openapiFields.add("publicIpAddresses");
    openapiFields.add("network");
    openapiFields.add("agentId");
    openapiFields.add("agentName");
    openapiFields.add("agentType");
    openapiFields.add("location");
    openapiFields.add("countryId");
    openapiFields.add("enabled");
    openapiFields.add("verifySslCertificates");
    openapiFields.add("clusterMembers");
    openapiFields.add("utilization");
    openapiFields.add("accountGroups");
    openapiFields.add("prefix");
    openapiFields.add("ipv6Policy");
    openapiFields.add("errorDetails");
    openapiFields.add("hostname");
    openapiFields.add("lastSeen");
    openapiFields.add("agentState");
    openapiFields.add("keepBrowserCache");
    openapiFields.add("createdDate");
    openapiFields.add("targetForTests");
    openapiFields.add("localResolutionPrefixes");
    openapiFields.add("interfaceIpMappings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EnterpriseAgent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnterpriseAgent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnterpriseAgent is not found in the empty JSON string", EnterpriseAgent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnterpriseAgent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnterpriseAgent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("ipAddresses") != null && !jsonObj.get("ipAddresses").isJsonNull() && !jsonObj.get("ipAddresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("ipAddresses").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("publicIpAddresses") != null && !jsonObj.get("publicIpAddresses").isJsonNull() && !jsonObj.get("publicIpAddresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicIpAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("publicIpAddresses").toString()));
      }
      if ((jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) && !jsonObj.get("network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
      if ((jsonObj.get("agentId") != null && !jsonObj.get("agentId").isJsonNull()) && !jsonObj.get("agentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agentId").toString()));
      }
      if ((jsonObj.get("agentName") != null && !jsonObj.get("agentName").isJsonNull()) && !jsonObj.get("agentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agentName").toString()));
      }
      // validate the optional field `agentType`
      if (jsonObj.get("agentType") != null && !jsonObj.get("agentType").isJsonNull()) {
        CloudEnterpriseAgentType.validateJsonElement(jsonObj.get("agentType"));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("countryId") != null && !jsonObj.get("countryId").isJsonNull()) && !jsonObj.get("countryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryId").toString()));
      }
      if (jsonObj.get("clusterMembers") != null && !jsonObj.get("clusterMembers").isJsonNull()) {
        JsonArray jsonArrayclusterMembers = jsonObj.getAsJsonArray("clusterMembers");
        if (jsonArrayclusterMembers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("clusterMembers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `clusterMembers` to be an array in the JSON string but got `%s`", jsonObj.get("clusterMembers").toString()));
          }

          // validate the optional field `clusterMembers` (array)
          for (int i = 0; i < jsonArrayclusterMembers.size(); i++) {
            ClusterMember.validateJsonElement(jsonArrayclusterMembers.get(i));
          };
        }
      }
      if (jsonObj.get("accountGroups") != null && !jsonObj.get("accountGroups").isJsonNull()) {
        JsonArray jsonArrayaccountGroups = jsonObj.getAsJsonArray("accountGroups");
        if (jsonArrayaccountGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("accountGroups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `accountGroups` to be an array in the JSON string but got `%s`", jsonObj.get("accountGroups").toString()));
          }

          // validate the optional field `accountGroups` (array)
          for (int i = 0; i < jsonArrayaccountGroups.size(); i++) {
            AccountGroup1.validateJsonElement(jsonArrayaccountGroups.get(i));
          };
        }
      }
      if ((jsonObj.get("prefix") != null && !jsonObj.get("prefix").isJsonNull()) && !jsonObj.get("prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefix").toString()));
      }
      // validate the optional field `ipv6Policy`
      if (jsonObj.get("ipv6Policy") != null && !jsonObj.get("ipv6Policy").isJsonNull()) {
        EnterpriseAgentIpv6Policy.validateJsonElement(jsonObj.get("ipv6Policy"));
      }
      if (jsonObj.get("errorDetails") != null && !jsonObj.get("errorDetails").isJsonNull()) {
        JsonArray jsonArrayerrorDetails = jsonObj.getAsJsonArray("errorDetails");
        if (jsonArrayerrorDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errorDetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errorDetails` to be an array in the JSON string but got `%s`", jsonObj.get("errorDetails").toString()));
          }

          // validate the optional field `errorDetails` (array)
          for (int i = 0; i < jsonArrayerrorDetails.size(); i++) {
            ErrorDetail.validateJsonElement(jsonArrayerrorDetails.get(i));
          };
        }
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      // validate the optional field `agentState`
      if (jsonObj.get("agentState") != null && !jsonObj.get("agentState").isJsonNull()) {
        EnterpriseAgentState.validateJsonElement(jsonObj.get("agentState"));
      }
      if ((jsonObj.get("targetForTests") != null && !jsonObj.get("targetForTests").isJsonNull()) && !jsonObj.get("targetForTests").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetForTests` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetForTests").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("localResolutionPrefixes") != null && !jsonObj.get("localResolutionPrefixes").isJsonNull() && !jsonObj.get("localResolutionPrefixes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `localResolutionPrefixes` to be an array in the JSON string but got `%s`", jsonObj.get("localResolutionPrefixes").toString()));
      }
      if (jsonObj.get("interfaceIpMappings") != null && !jsonObj.get("interfaceIpMappings").isJsonNull()) {
        JsonArray jsonArrayinterfaceIpMappings = jsonObj.getAsJsonArray("interfaceIpMappings");
        if (jsonArrayinterfaceIpMappings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("interfaceIpMappings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `interfaceIpMappings` to be an array in the JSON string but got `%s`", jsonObj.get("interfaceIpMappings").toString()));
          }

          // validate the optional field `interfaceIpMappings` (array)
          for (int i = 0; i < jsonArrayinterfaceIpMappings.size(); i++) {
            InterfaceIpMapping.validateJsonElement(jsonArrayinterfaceIpMappings.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseAgent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseAgent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseAgent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseAgent.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseAgent>() {
           @Override
           public void write(JsonWriter out, EnterpriseAgent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseAgent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseAgent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseAgent
  * @throws IOException if the JSON string is invalid with respect to EnterpriseAgent
  */
  public static EnterpriseAgent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseAgent.class);
  }

 /**
  * Convert an instance of EnterpriseAgent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

