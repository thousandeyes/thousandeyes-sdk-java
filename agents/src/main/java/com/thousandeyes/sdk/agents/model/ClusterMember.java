/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.10
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
import com.thousandeyes.sdk.agents.model.EnterpriseAgentState;
import com.thousandeyes.sdk.agents.model.ErrorDetail;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ClusterMember
 */
@JsonPropertyOrder({
  ClusterMember.JSON_PROPERTY_IP_ADDRESSES,
  ClusterMember.JSON_PROPERTY_PUBLIC_IP_ADDRESSES,
  ClusterMember.JSON_PROPERTY_NETWORK,
  ClusterMember.JSON_PROPERTY_MEMBER_ID,
  ClusterMember.JSON_PROPERTY_NAME,
  ClusterMember.JSON_PROPERTY_ERROR_DETAILS,
  ClusterMember.JSON_PROPERTY_LAST_SEEN,
  ClusterMember.JSON_PROPERTY_AGENT_STATE,
  ClusterMember.JSON_PROPERTY_TARGET_FOR_TESTS,
  ClusterMember.JSON_PROPERTY_UTILIZATION
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ClusterMember {
  public static final String JSON_PROPERTY_IP_ADDRESSES = "ipAddresses";
  private List<String> ipAddresses = new ArrayList<>();

  public static final String JSON_PROPERTY_PUBLIC_IP_ADDRESSES = "publicIpAddresses";
  private List<String> publicIpAddresses = new ArrayList<>();

  public static final String JSON_PROPERTY_NETWORK = "network";
  private String network;

  public static final String JSON_PROPERTY_MEMBER_ID = "memberId";
  private String memberId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ERROR_DETAILS = "errorDetails";
  private List<ErrorDetail> errorDetails = new ArrayList<>();

  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  private OffsetDateTime lastSeen;

  public static final String JSON_PROPERTY_AGENT_STATE = "agentState";
  private EnterpriseAgentState agentState;

  public static final String JSON_PROPERTY_TARGET_FOR_TESTS = "targetForTests";
  private String targetForTests;

  public static final String JSON_PROPERTY_UTILIZATION = "utilization";
  private Integer utilization;

  public ClusterMember() { 
  }

  @JsonCreator
  public ClusterMember(
    @JsonProperty(JSON_PROPERTY_IP_ADDRESSES) List<String> ipAddresses, 
    @JsonProperty(JSON_PROPERTY_PUBLIC_IP_ADDRESSES) List<String> publicIpAddresses, 
    @JsonProperty(JSON_PROPERTY_NETWORK) String network, 
    @JsonProperty(JSON_PROPERTY_MEMBER_ID) String memberId, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_ERROR_DETAILS) List<ErrorDetail> errorDetails, 
    @JsonProperty(JSON_PROPERTY_LAST_SEEN) OffsetDateTime lastSeen, 
    @JsonProperty(JSON_PROPERTY_UTILIZATION) Integer utilization
  ) {
  this();
    this.ipAddresses = ipAddresses;
    this.publicIpAddresses = publicIpAddresses;
    this.network = network;
    this.memberId = memberId;
    this.name = name;
    this.errorDetails = errorDetails;
    this.lastSeen = lastSeen;
    this.utilization = utilization;
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
   * Unique ID of the cluster member
   * @return memberId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMBER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMemberId() {
    return memberId;
  }




   /**
   * Name of the cluster member
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
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
   * UTC last seen date (ISO date-time format).
   * @return lastSeen
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastSeen() {
    return lastSeen;
  }




  public ClusterMember agentState(EnterpriseAgentState agentState) {
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


  public ClusterMember targetForTests(String targetForTests) {
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




  /**
   * Return true if this ClusterMember object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterMember clusterMember = (ClusterMember) o;
    return Objects.equals(this.ipAddresses, clusterMember.ipAddresses) &&
        Objects.equals(this.publicIpAddresses, clusterMember.publicIpAddresses) &&
        Objects.equals(this.network, clusterMember.network) &&
        Objects.equals(this.memberId, clusterMember.memberId) &&
        Objects.equals(this.name, clusterMember.name) &&
        Objects.equals(this.errorDetails, clusterMember.errorDetails) &&
        Objects.equals(this.lastSeen, clusterMember.lastSeen) &&
        Objects.equals(this.agentState, clusterMember.agentState) &&
        Objects.equals(this.targetForTests, clusterMember.targetForTests) &&
        Objects.equals(this.utilization, clusterMember.utilization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddresses, publicIpAddresses, network, memberId, name, errorDetails, lastSeen, agentState, targetForTests, utilization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterMember {\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    publicIpAddresses: ").append(toIndentedString(publicIpAddresses)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    agentState: ").append(toIndentedString(agentState)).append("\n");
    sb.append("    targetForTests: ").append(toIndentedString(targetForTests)).append("\n");
    sb.append("    utilization: ").append(toIndentedString(utilization)).append("\n");
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

