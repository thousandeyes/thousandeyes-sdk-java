/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.agents.model.AccountGroup;
import com.thousandeyes.sdk.agents.model.ClusterMember;
import com.thousandeyes.sdk.agents.model.EnterpriseAgentIpv6Policy;
import com.thousandeyes.sdk.agents.model.EnterpriseAgentState;
import com.thousandeyes.sdk.agents.model.ErrorDetail;
import com.thousandeyes.sdk.agents.model.InterfaceIpMapping;
import com.thousandeyes.sdk.agents.model.Labels;
import com.thousandeyes.sdk.agents.model.NotificationRules;
import com.thousandeyes.sdk.agents.model.SelfLinks;
import com.thousandeyes.sdk.agents.model.SimpleTest;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EnterpriseAgentClusterDetail
 */
@JsonPropertyOrder({
  EnterpriseAgentClusterDetail.JSON_PROPERTY_IP_ADDRESSES,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_PUBLIC_IP_ADDRESSES,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_NETWORK,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_AGENT_ID,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_AGENT_NAME,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_LOCATION,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_COUNTRY_ID,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_ENABLED,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_PREFIX,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_VERIFY_SSL_CERTIFICATES,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_CLUSTER_MEMBERS,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_UTILIZATION,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_ACCOUNT_GROUPS,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_IPV6_POLICY,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_ERROR_DETAILS,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_HOSTNAME,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_LAST_SEEN,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_AGENT_STATE,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_KEEP_BROWSER_CACHE,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_CREATED_DATE,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_TARGET_FOR_TESTS,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_LOCAL_RESOLUTION_PREFIXES,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_INTERFACE_IP_MAPPINGS,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_TESTS,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_NOTIFICATION_RULES,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_LABELS,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_AGENT_TYPE,
  EnterpriseAgentClusterDetail.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EnterpriseAgentClusterDetail {
  public static final String JSON_PROPERTY_IP_ADDRESSES = "ipAddresses";
  private List<String> ipAddresses = new ArrayList<>();

  public static final String JSON_PROPERTY_PUBLIC_IP_ADDRESSES = "publicIpAddresses";
  private List<String> publicIpAddresses = new ArrayList<>();

  public static final String JSON_PROPERTY_NETWORK = "network";
  private String network;

  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private String agentId;

  public static final String JSON_PROPERTY_AGENT_NAME = "agentName";
  private String agentName;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_COUNTRY_ID = "countryId";
  private String countryId;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_VERIFY_SSL_CERTIFICATES = "verifySslCertificates";
  private Boolean verifySslCertificates;

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

  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<SimpleTest> tests = new ArrayList<>();

  public static final String JSON_PROPERTY_NOTIFICATION_RULES = "notificationRules";
  private List<NotificationRules> notificationRules = new ArrayList<>();

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<Labels> labels = new ArrayList<>();

  public static final String JSON_PROPERTY_AGENT_TYPE = "agentType";
  private String agentType;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinks links;

  public EnterpriseAgentClusterDetail() { 
  }

  @JsonCreator
  public EnterpriseAgentClusterDetail(
    @JsonProperty(JSON_PROPERTY_IP_ADDRESSES) List<String> ipAddresses, 
    @JsonProperty(JSON_PROPERTY_PUBLIC_IP_ADDRESSES) List<String> publicIpAddresses, 
    @JsonProperty(JSON_PROPERTY_NETWORK) String network, 
    @JsonProperty(JSON_PROPERTY_AGENT_ID) String agentId, 
    @JsonProperty(JSON_PROPERTY_LOCATION) String location, 
    @JsonProperty(JSON_PROPERTY_COUNTRY_ID) String countryId, 
    @JsonProperty(JSON_PROPERTY_PREFIX) String prefix, 
    @JsonProperty(JSON_PROPERTY_VERIFY_SSL_CERTIFICATES) Boolean verifySslCertificates, 
    @JsonProperty(JSON_PROPERTY_CLUSTER_MEMBERS) List<ClusterMember> clusterMembers, 
    @JsonProperty(JSON_PROPERTY_UTILIZATION) Integer utilization, 
    @JsonProperty(JSON_PROPERTY_ERROR_DETAILS) List<ErrorDetail> errorDetails, 
    @JsonProperty(JSON_PROPERTY_HOSTNAME) String hostname, 
    @JsonProperty(JSON_PROPERTY_LAST_SEEN) OffsetDateTime lastSeen, 
    @JsonProperty(JSON_PROPERTY_CREATED_DATE) OffsetDateTime createdDate, 
    @JsonProperty(JSON_PROPERTY_INTERFACE_IP_MAPPINGS) List<InterfaceIpMapping> interfaceIpMappings, 
    @JsonProperty(JSON_PROPERTY_LABELS) List<Labels> labels
  ) {
  this();
    this.ipAddresses = ipAddresses;
    this.publicIpAddresses = publicIpAddresses;
    this.network = network;
    this.agentId = agentId;
    this.location = location;
    this.countryId = countryId;
    this.prefix = prefix;
    this.verifySslCertificates = verifySslCertificates;
    this.clusterMembers = clusterMembers;
    this.utilization = utilization;
    this.errorDetails = errorDetails;
    this.hostname = hostname;
    this.lastSeen = lastSeen;
    this.createdDate = createdDate;
    this.interfaceIpMappings = interfaceIpMappings;
    this.labels = labels;
  }

   /**
   * Array of private IP addresses.
   * @return ipAddresses
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIpAddresses() {
    return ipAddresses;
  }




   /**
   * Array of public IP addresses.
   * @return publicIpAddresses
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_IP_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPublicIpAddresses() {
    return publicIpAddresses;
  }




   /**
   * Network (including ASN) of agent’s public IP.
   * @return network
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetwork() {
    return network;
  }




   /**
   * Unique ID of the agent.
   * @return agentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgentId() {
    return agentId;
  }




  public EnterpriseAgentClusterDetail agentName(String agentName) {
    this.agentName = agentName;
    return this;
  }

   /**
   * Name of the agent.
   * @return agentName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgentName() {
    return agentName;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }


   /**
   * Location of the agent.
   * @return location
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocation() {
    return location;
  }




   /**
   * 2-digit ISO country code
   * @return countryId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryId() {
    return countryId;
  }




  public EnterpriseAgentClusterDetail enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Flag indicating if the agent is enabled.
   * @return enabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


   /**
   * Prefix containing agents public IP address.
   * @return prefix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrefix() {
    return prefix;
  }




   /**
   * Flag indicating if has normal SSL operations or  if instead it&#39;s set to ignore SSL errors on browserbot-based tests.
   * @return verifySslCertificates
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERIFY_SSL_CERTIFICATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVerifySslCertificates() {
    return verifySslCertificates;
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




  public EnterpriseAgentClusterDetail accountGroups(List<AccountGroup> accountGroups) {
    this.accountGroups = accountGroups;
    return this;
  }

  public EnterpriseAgentClusterDetail addAccountGroupsItem(AccountGroup accountGroupsItem) {
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


  public EnterpriseAgentClusterDetail ipv6Policy(EnterpriseAgentIpv6Policy ipv6Policy) {
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




  public EnterpriseAgentClusterDetail agentState(EnterpriseAgentState agentState) {
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


  public EnterpriseAgentClusterDetail keepBrowserCache(Boolean keepBrowserCache) {
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




  public EnterpriseAgentClusterDetail targetForTests(String targetForTests) {
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


  public EnterpriseAgentClusterDetail localResolutionPrefixes(List<String> localResolutionPrefixes) {
    this.localResolutionPrefixes = localResolutionPrefixes;
    return this;
  }

  public EnterpriseAgentClusterDetail addLocalResolutionPrefixesItem(String localResolutionPrefixesItem) {
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




  public EnterpriseAgentClusterDetail tests(List<SimpleTest> tests) {
    this.tests = tests;
    return this;
  }

  public EnterpriseAgentClusterDetail addTestsItem(SimpleTest testsItem) {
    if (this.tests == null) {
      this.tests = new ArrayList<>();
    }
    this.tests.add(testsItem);
    return this;
  }

   /**
   * List of tests. See &#x60;/tests&#x60; for more information.
   * @return tests
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SimpleTest> getTests() {
    return tests;
  }


  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTests(List<SimpleTest> tests) {
    this.tests = tests;
  }


  public EnterpriseAgentClusterDetail notificationRules(List<NotificationRules> notificationRules) {
    this.notificationRules = notificationRules;
    return this;
  }

  public EnterpriseAgentClusterDetail addNotificationRulesItem(NotificationRules notificationRulesItem) {
    if (this.notificationRules == null) {
      this.notificationRules = new ArrayList<>();
    }
    this.notificationRules.add(notificationRulesItem);
    return this;
  }

   /**
   * List of notification rule objects configured on agent
   * @return notificationRules
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<NotificationRules> getNotificationRules() {
    return notificationRules;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATION_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotificationRules(List<NotificationRules> notificationRules) {
    this.notificationRules = notificationRules;
  }


   /**
   * List of labels. See &#x60;/labels&#x60; for more information.
   * @return labels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Labels> getLabels() {
    return labels;
  }




  public EnterpriseAgentClusterDetail agentType(String agentType) {
    this.agentType = agentType;
    return this;
  }

   /**
   * Enterprise Cluster agent type.
   * @return agentType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AGENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAgentType() {
    return agentType;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAgentType(String agentType) {
    this.agentType = agentType;
  }


  public EnterpriseAgentClusterDetail links(SelfLinks links) {
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
   * Return true if this EnterpriseAgentClusterDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseAgentClusterDetail enterpriseAgentClusterDetail = (EnterpriseAgentClusterDetail) o;
    return Objects.equals(this.ipAddresses, enterpriseAgentClusterDetail.ipAddresses) &&
        Objects.equals(this.publicIpAddresses, enterpriseAgentClusterDetail.publicIpAddresses) &&
        Objects.equals(this.network, enterpriseAgentClusterDetail.network) &&
        Objects.equals(this.agentId, enterpriseAgentClusterDetail.agentId) &&
        Objects.equals(this.agentName, enterpriseAgentClusterDetail.agentName) &&
        Objects.equals(this.location, enterpriseAgentClusterDetail.location) &&
        Objects.equals(this.countryId, enterpriseAgentClusterDetail.countryId) &&
        Objects.equals(this.enabled, enterpriseAgentClusterDetail.enabled) &&
        Objects.equals(this.prefix, enterpriseAgentClusterDetail.prefix) &&
        Objects.equals(this.verifySslCertificates, enterpriseAgentClusterDetail.verifySslCertificates) &&
        Objects.equals(this.clusterMembers, enterpriseAgentClusterDetail.clusterMembers) &&
        Objects.equals(this.utilization, enterpriseAgentClusterDetail.utilization) &&
        Objects.equals(this.accountGroups, enterpriseAgentClusterDetail.accountGroups) &&
        Objects.equals(this.ipv6Policy, enterpriseAgentClusterDetail.ipv6Policy) &&
        Objects.equals(this.errorDetails, enterpriseAgentClusterDetail.errorDetails) &&
        Objects.equals(this.hostname, enterpriseAgentClusterDetail.hostname) &&
        Objects.equals(this.lastSeen, enterpriseAgentClusterDetail.lastSeen) &&
        Objects.equals(this.agentState, enterpriseAgentClusterDetail.agentState) &&
        Objects.equals(this.keepBrowserCache, enterpriseAgentClusterDetail.keepBrowserCache) &&
        Objects.equals(this.createdDate, enterpriseAgentClusterDetail.createdDate) &&
        Objects.equals(this.targetForTests, enterpriseAgentClusterDetail.targetForTests) &&
        Objects.equals(this.localResolutionPrefixes, enterpriseAgentClusterDetail.localResolutionPrefixes) &&
        Objects.equals(this.interfaceIpMappings, enterpriseAgentClusterDetail.interfaceIpMappings) &&
        Objects.equals(this.tests, enterpriseAgentClusterDetail.tests) &&
        Objects.equals(this.notificationRules, enterpriseAgentClusterDetail.notificationRules) &&
        Objects.equals(this.labels, enterpriseAgentClusterDetail.labels) &&
        Objects.equals(this.agentType, enterpriseAgentClusterDetail.agentType) &&
        Objects.equals(this.links, enterpriseAgentClusterDetail.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddresses, publicIpAddresses, network, agentId, agentName, location, countryId, enabled, prefix, verifySslCertificates, clusterMembers, utilization, accountGroups, ipv6Policy, errorDetails, hostname, lastSeen, agentState, keepBrowserCache, createdDate, targetForTests, localResolutionPrefixes, interfaceIpMappings, tests, notificationRules, labels, agentType, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseAgentClusterDetail {\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    publicIpAddresses: ").append(toIndentedString(publicIpAddresses)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    verifySslCertificates: ").append(toIndentedString(verifySslCertificates)).append("\n");
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
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
    sb.append("    notificationRules: ").append(toIndentedString(notificationRules)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
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

