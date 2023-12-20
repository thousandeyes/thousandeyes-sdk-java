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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.agents.model.AccountGroup;
import com.thousandeyes.api.agents.model.CloudEnterpriseAgentType;
import com.thousandeyes.api.agents.model.ClusterMember;
import com.thousandeyes.api.agents.model.EnterpriseAgentIpv6Policy;
import com.thousandeyes.api.agents.model.EnterpriseAgentState;
import com.thousandeyes.api.agents.model.ErrorDetail;
import com.thousandeyes.api.agents.model.InterfaceIpMapping;
import com.thousandeyes.api.agents.model.Labels;
import com.thousandeyes.api.agents.model.NotificationRules;
import com.thousandeyes.api.agents.model.SimpleTest;
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
 * EnterpriseAgentDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:03.604841Z[Europe/Lisbon]")
public class EnterpriseAgentDetail {
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
  private List<AccountGroup> accountGroups;

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

  public static final String SERIALIZED_NAME_TESTS = "tests";
  @SerializedName(SERIALIZED_NAME_TESTS)
  private List<SimpleTest> tests;

  public static final String SERIALIZED_NAME_NOTIFICATION_RULES = "notificationRules";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_RULES)
  private List<NotificationRules> notificationRules;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<Labels> labels;

  public EnterpriseAgentDetail() {
  }

  
  public EnterpriseAgentDetail(
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
     List<InterfaceIpMapping> interfaceIpMappings, 
     List<Labels> labels
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
    this.labels = labels;
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




  public EnterpriseAgentDetail agentName(String agentName) {
    
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


  public EnterpriseAgentDetail agentType(CloudEnterpriseAgentType agentType) {
    
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




  public EnterpriseAgentDetail enabled(Boolean enabled) {
    
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




  public EnterpriseAgentDetail accountGroups(List<AccountGroup> accountGroups) {
    
    this.accountGroups = accountGroups;
    return this;
  }

  public EnterpriseAgentDetail addAccountGroupsItem(AccountGroup accountGroupsItem) {
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
  public List<AccountGroup> getAccountGroups() {
    return accountGroups;
  }


  public void setAccountGroups(List<AccountGroup> accountGroups) {
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




  public EnterpriseAgentDetail ipv6Policy(EnterpriseAgentIpv6Policy ipv6Policy) {
    
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




  public EnterpriseAgentDetail agentState(EnterpriseAgentState agentState) {
    
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


  public EnterpriseAgentDetail keepBrowserCache(Boolean keepBrowserCache) {
    
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




  public EnterpriseAgentDetail targetForTests(String targetForTests) {
    
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


  public EnterpriseAgentDetail localResolutionPrefixes(List<String> localResolutionPrefixes) {
    
    this.localResolutionPrefixes = localResolutionPrefixes;
    return this;
  }

  public EnterpriseAgentDetail addLocalResolutionPrefixesItem(String localResolutionPrefixesItem) {
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




  public EnterpriseAgentDetail tests(List<SimpleTest> tests) {
    
    this.tests = tests;
    return this;
  }

  public EnterpriseAgentDetail addTestsItem(SimpleTest testsItem) {
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
  @javax.annotation.Nullable
  public List<SimpleTest> getTests() {
    return tests;
  }


  public void setTests(List<SimpleTest> tests) {
    this.tests = tests;
  }


  public EnterpriseAgentDetail notificationRules(List<NotificationRules> notificationRules) {
    
    this.notificationRules = notificationRules;
    return this;
  }

  public EnterpriseAgentDetail addNotificationRulesItem(NotificationRules notificationRulesItem) {
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
  @javax.annotation.Nullable
  public List<NotificationRules> getNotificationRules() {
    return notificationRules;
  }


  public void setNotificationRules(List<NotificationRules> notificationRules) {
    this.notificationRules = notificationRules;
  }


   /**
   * List of labels. See &#x60;/labels&#x60; for more information.
   * @return labels
  **/
  @javax.annotation.Nullable
  public List<Labels> getLabels() {
    return labels;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseAgentDetail enterpriseAgentDetail = (EnterpriseAgentDetail) o;
    return Objects.equals(this.ipAddresses, enterpriseAgentDetail.ipAddresses) &&
        Objects.equals(this.publicIpAddresses, enterpriseAgentDetail.publicIpAddresses) &&
        Objects.equals(this.network, enterpriseAgentDetail.network) &&
        Objects.equals(this.agentId, enterpriseAgentDetail.agentId) &&
        Objects.equals(this.agentName, enterpriseAgentDetail.agentName) &&
        Objects.equals(this.agentType, enterpriseAgentDetail.agentType) &&
        Objects.equals(this.location, enterpriseAgentDetail.location) &&
        Objects.equals(this.countryId, enterpriseAgentDetail.countryId) &&
        Objects.equals(this.enabled, enterpriseAgentDetail.enabled) &&
        Objects.equals(this.verifySslCertificates, enterpriseAgentDetail.verifySslCertificates) &&
        Objects.equals(this.clusterMembers, enterpriseAgentDetail.clusterMembers) &&
        Objects.equals(this.utilization, enterpriseAgentDetail.utilization) &&
        Objects.equals(this.accountGroups, enterpriseAgentDetail.accountGroups) &&
        Objects.equals(this.prefix, enterpriseAgentDetail.prefix) &&
        Objects.equals(this.ipv6Policy, enterpriseAgentDetail.ipv6Policy) &&
        Objects.equals(this.errorDetails, enterpriseAgentDetail.errorDetails) &&
        Objects.equals(this.hostname, enterpriseAgentDetail.hostname) &&
        Objects.equals(this.lastSeen, enterpriseAgentDetail.lastSeen) &&
        Objects.equals(this.agentState, enterpriseAgentDetail.agentState) &&
        Objects.equals(this.keepBrowserCache, enterpriseAgentDetail.keepBrowserCache) &&
        Objects.equals(this.createdDate, enterpriseAgentDetail.createdDate) &&
        Objects.equals(this.targetForTests, enterpriseAgentDetail.targetForTests) &&
        Objects.equals(this.localResolutionPrefixes, enterpriseAgentDetail.localResolutionPrefixes) &&
        Objects.equals(this.interfaceIpMappings, enterpriseAgentDetail.interfaceIpMappings) &&
        Objects.equals(this.tests, enterpriseAgentDetail.tests) &&
        Objects.equals(this.notificationRules, enterpriseAgentDetail.notificationRules) &&
        Objects.equals(this.labels, enterpriseAgentDetail.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddresses, publicIpAddresses, network, agentId, agentName, agentType, location, countryId, enabled, verifySslCertificates, clusterMembers, utilization, accountGroups, prefix, ipv6Policy, errorDetails, hostname, lastSeen, agentState, keepBrowserCache, createdDate, targetForTests, localResolutionPrefixes, interfaceIpMappings, tests, notificationRules, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseAgentDetail {\n");
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
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
    sb.append("    notificationRules: ").append(toIndentedString(notificationRules)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
    openapiFields.add("tests");
    openapiFields.add("notificationRules");
    openapiFields.add("labels");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EnterpriseAgentDetail
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnterpriseAgentDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnterpriseAgentDetail is not found in the empty JSON string", EnterpriseAgentDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnterpriseAgentDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnterpriseAgentDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            AccountGroup.validateJsonElement(jsonArrayaccountGroups.get(i));
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
      if (jsonObj.get("tests") != null && !jsonObj.get("tests").isJsonNull()) {
        JsonArray jsonArraytests = jsonObj.getAsJsonArray("tests");
        if (jsonArraytests != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tests").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tests` to be an array in the JSON string but got `%s`", jsonObj.get("tests").toString()));
          }

          // validate the optional field `tests` (array)
          for (int i = 0; i < jsonArraytests.size(); i++) {
            SimpleTest.validateJsonElement(jsonArraytests.get(i));
          };
        }
      }
      if (jsonObj.get("notificationRules") != null && !jsonObj.get("notificationRules").isJsonNull()) {
        JsonArray jsonArraynotificationRules = jsonObj.getAsJsonArray("notificationRules");
        if (jsonArraynotificationRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("notificationRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `notificationRules` to be an array in the JSON string but got `%s`", jsonObj.get("notificationRules").toString()));
          }

          // validate the optional field `notificationRules` (array)
          for (int i = 0; i < jsonArraynotificationRules.size(); i++) {
            NotificationRules.validateJsonElement(jsonArraynotificationRules.get(i));
          };
        }
      }
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonNull()) {
        JsonArray jsonArraylabels = jsonObj.getAsJsonArray("labels");
        if (jsonArraylabels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("labels").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
          }

          // validate the optional field `labels` (array)
          for (int i = 0; i < jsonArraylabels.size(); i++) {
            Labels.validateJsonElement(jsonArraylabels.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseAgentDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseAgentDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseAgentDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseAgentDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseAgentDetail>() {
           @Override
           public void write(JsonWriter out, EnterpriseAgentDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseAgentDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseAgentDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseAgentDetail
  * @throws IOException if the JSON string is invalid with respect to EnterpriseAgentDetail
  */
  public static EnterpriseAgentDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseAgentDetail.class);
  }

 /**
  * Convert an instance of EnterpriseAgentDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

