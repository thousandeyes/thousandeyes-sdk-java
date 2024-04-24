/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.agents.model.AccountGroup;
import com.thousandeyes.api.agents.model.ClusterMember;
import com.thousandeyes.api.agents.model.EnterpriseAgentIpv6Policy;
import com.thousandeyes.api.agents.model.EnterpriseAgentState;
import com.thousandeyes.api.agents.model.ErrorDetail;
import com.thousandeyes.api.agents.model.InterfaceIpMapping;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EnterpriseAgentData
 */
@JsonPropertyOrder({
  EnterpriseAgentData.JSON_PROPERTY_CLUSTER_MEMBERS,
  EnterpriseAgentData.JSON_PROPERTY_UTILIZATION,
  EnterpriseAgentData.JSON_PROPERTY_ACCOUNT_GROUPS,
  EnterpriseAgentData.JSON_PROPERTY_IPV6_POLICY,
  EnterpriseAgentData.JSON_PROPERTY_ERROR_DETAILS,
  EnterpriseAgentData.JSON_PROPERTY_HOSTNAME,
  EnterpriseAgentData.JSON_PROPERTY_LAST_SEEN,
  EnterpriseAgentData.JSON_PROPERTY_AGENT_STATE,
  EnterpriseAgentData.JSON_PROPERTY_KEEP_BROWSER_CACHE,
  EnterpriseAgentData.JSON_PROPERTY_CREATED_DATE,
  EnterpriseAgentData.JSON_PROPERTY_TARGET_FOR_TESTS,
  EnterpriseAgentData.JSON_PROPERTY_LOCAL_RESOLUTION_PREFIXES,
  EnterpriseAgentData.JSON_PROPERTY_INTERFACE_IP_MAPPINGS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T10:46:26.012068+01:00[Europe/Lisbon]")
public class EnterpriseAgentData {
  public static final String JSON_PROPERTY_CLUSTER_MEMBERS = "clusterMembers";
  private List<ClusterMember> clusterMembers = new ArrayList<>();

  public static final String JSON_PROPERTY_UTILIZATION = "utilization";
  private Integer utilization;

  public static final String JSON_PROPERTY_ACCOUNT_GROUPS = "accountGroups";
  private List<AccountGroup> accountGroups = new ArrayList<>();

  public static final String JSON_PROPERTY_IPV6_POLICY = "ipv6Policy";
  private EnterpriseAgentIpv6Policy ipv6Policy;

  public static final String JSON_PROPERTY_ERROR_DETAILS = "errorDetails";
  private List<ErrorDetail> errorDetails = new ArrayList<>();

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  private OffsetDateTime lastSeen;

  public static final String JSON_PROPERTY_AGENT_STATE = "agentState";
  private EnterpriseAgentState agentState;

  public static final String JSON_PROPERTY_KEEP_BROWSER_CACHE = "keepBrowserCache";
  private Boolean keepBrowserCache;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private OffsetDateTime createdDate;

  public static final String JSON_PROPERTY_TARGET_FOR_TESTS = "targetForTests";
  private String targetForTests;

  public static final String JSON_PROPERTY_LOCAL_RESOLUTION_PREFIXES = "localResolutionPrefixes";
  private List<String> localResolutionPrefixes = new ArrayList<>();

  public static final String JSON_PROPERTY_INTERFACE_IP_MAPPINGS = "interfaceIpMappings";
  private List<InterfaceIpMapping> interfaceIpMappings = new ArrayList<>();

  public EnterpriseAgentData() { 
  }

  @JsonCreator
  public EnterpriseAgentData(
    @JsonProperty(JSON_PROPERTY_CLUSTER_MEMBERS) List<ClusterMember> clusterMembers, 
    @JsonProperty(JSON_PROPERTY_UTILIZATION) Integer utilization, 
    @JsonProperty(JSON_PROPERTY_ERROR_DETAILS) List<ErrorDetail> errorDetails, 
    @JsonProperty(JSON_PROPERTY_HOSTNAME) String hostname, 
    @JsonProperty(JSON_PROPERTY_LAST_SEEN) OffsetDateTime lastSeen, 
    @JsonProperty(JSON_PROPERTY_CREATED_DATE) OffsetDateTime createdDate, 
    @JsonProperty(JSON_PROPERTY_INTERFACE_IP_MAPPINGS) List<InterfaceIpMapping> interfaceIpMappings
  ) {
  this();
    this.clusterMembers = clusterMembers;
    this.utilization = utilization;
    this.errorDetails = errorDetails;
    this.hostname = hostname;
    this.lastSeen = lastSeen;
    this.createdDate = createdDate;
    this.interfaceIpMappings = interfaceIpMappings;
  }

   /**
   * If an enterprise agent is clustered, detailed information about each cluster member will be shown as array entries in the clusterMembers field. This field is not shown for Enterprise Agents in standalone mode, or for Cloud Agents.
   * @return clusterMembers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLUSTER_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ClusterMember> getClusterMembers() {
    return clusterMembers;
  }




   /**
   * Shows overall utilization percentage (online Enterprise Agents and Enterprise Clusters only).
   * @return utilization
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UTILIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUtilization() {
    return utilization;
  }




  public EnterpriseAgentData accountGroups(List<AccountGroup> accountGroups) {
    this.accountGroups = accountGroups;
    return this;
  }

  public EnterpriseAgentData addAccountGroupsItem(AccountGroup accountGroupsItem) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccountGroup> getAccountGroups() {
    return accountGroups;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountGroups(List<AccountGroup> accountGroups) {
    this.accountGroups = accountGroups;
  }


  public EnterpriseAgentData ipv6Policy(EnterpriseAgentIpv6Policy ipv6Policy) {
    this.ipv6Policy = ipv6Policy;
    return this;
  }

   /**
   * Get ipv6Policy
   * @return ipv6Policy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IPV6_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnterpriseAgentIpv6Policy getIpv6Policy() {
    return ipv6Policy;
  }


  @JsonProperty(JSON_PROPERTY_IPV6_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpv6Policy(EnterpriseAgentIpv6Policy ipv6Policy) {
    this.ipv6Policy = ipv6Policy;
  }


   /**
   * If an enterprise agent or a cluster member presents at least one error, the errors will be shown as an array of entries in the errorDetails field (Enterprise Agents and Enterprise Cluster members only)
   * @return errorDetails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ErrorDetail> getErrorDetails() {
    return errorDetails;
  }




   /**
   * Fully qualified domain name of the agent (Enterprise Agents only)
   * @return hostname
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHostname() {
    return hostname;
  }




   /**
   * UTC last seen date (ISO date-time format).
   * @return lastSeen
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastSeen() {
    return lastSeen;
  }




  public EnterpriseAgentData agentState(EnterpriseAgentState agentState) {
    this.agentState = agentState;
    return this;
  }

   /**
   * Get agentState
   * @return agentState
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnterpriseAgentState getAgentState() {
    return agentState;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentState(EnterpriseAgentState agentState) {
    this.agentState = agentState;
  }


  public EnterpriseAgentData keepBrowserCache(Boolean keepBrowserCache) {
    this.keepBrowserCache = keepBrowserCache;
    return this;
  }

   /**
   * Flag indicating if the agent retains cache.
   * @return keepBrowserCache
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEEP_BROWSER_CACHE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getKeepBrowserCache() {
    return keepBrowserCache;
  }


  @JsonProperty(JSON_PROPERTY_KEEP_BROWSER_CACHE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeepBrowserCache(Boolean keepBrowserCache) {
    this.keepBrowserCache = keepBrowserCache;
  }


   /**
   * UTC Agent creation date (ISO date-time format).
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




  public EnterpriseAgentData targetForTests(String targetForTests) {
    this.targetForTests = targetForTests;
    return this;
  }

   /**
   * Test target IP address.
   * @return targetForTests
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_FOR_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetForTests() {
    return targetForTests;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_FOR_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetForTests(String targetForTests) {
    this.targetForTests = targetForTests;
  }


  public EnterpriseAgentData localResolutionPrefixes(List<String> localResolutionPrefixes) {
    this.localResolutionPrefixes = localResolutionPrefixes;
    return this;
  }

  public EnterpriseAgentData addLocalResolutionPrefixesItem(String localResolutionPrefixesItem) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCAL_RESOLUTION_PREFIXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLocalResolutionPrefixes() {
    return localResolutionPrefixes;
  }


  @JsonProperty(JSON_PROPERTY_LOCAL_RESOLUTION_PREFIXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocalResolutionPrefixes(List<String> localResolutionPrefixes) {
    this.localResolutionPrefixes = localResolutionPrefixes;
  }


   /**
   * Get interfaceIpMappings
   * @return interfaceIpMappings
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERFACE_IP_MAPPINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InterfaceIpMapping> getInterfaceIpMappings() {
    return interfaceIpMappings;
  }




  /**
   * Return true if this EnterpriseAgentData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseAgentData enterpriseAgentData = (EnterpriseAgentData) o;
    return Objects.equals(this.clusterMembers, enterpriseAgentData.clusterMembers) &&
        Objects.equals(this.utilization, enterpriseAgentData.utilization) &&
        Objects.equals(this.accountGroups, enterpriseAgentData.accountGroups) &&
        Objects.equals(this.ipv6Policy, enterpriseAgentData.ipv6Policy) &&
        Objects.equals(this.errorDetails, enterpriseAgentData.errorDetails) &&
        Objects.equals(this.hostname, enterpriseAgentData.hostname) &&
        Objects.equals(this.lastSeen, enterpriseAgentData.lastSeen) &&
        Objects.equals(this.agentState, enterpriseAgentData.agentState) &&
        Objects.equals(this.keepBrowserCache, enterpriseAgentData.keepBrowserCache) &&
        Objects.equals(this.createdDate, enterpriseAgentData.createdDate) &&
        Objects.equals(this.targetForTests, enterpriseAgentData.targetForTests) &&
        Objects.equals(this.localResolutionPrefixes, enterpriseAgentData.localResolutionPrefixes) &&
        Objects.equals(this.interfaceIpMappings, enterpriseAgentData.interfaceIpMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterMembers, utilization, accountGroups, ipv6Policy, errorDetails, hostname, lastSeen, agentState, keepBrowserCache, createdDate, targetForTests, localResolutionPrefixes, interfaceIpMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseAgentData {\n");
    sb.append("    clusterMembers: ").append(toIndentedString(clusterMembers)).append("\n");
    sb.append("    utilization: ").append(toIndentedString(utilization)).append("\n");
    sb.append("    accountGroups: ").append(toIndentedString(accountGroups)).append("\n");
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
}

