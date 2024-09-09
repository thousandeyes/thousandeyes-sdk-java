/*
 * Administrative API
 * Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API. This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.    For more information about the administrative models, see [Account Management](https://docs.thousandeyes.com/product-documentation/user-management).
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.account.management.administrative.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.account.management.administrative.model.CloudEnterpriseAgentType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AgentResponse
 */
@JsonPropertyOrder({
  AgentResponse.JSON_PROPERTY_IP_ADDRESSES,
  AgentResponse.JSON_PROPERTY_PUBLIC_IP_ADDRESSES,
  AgentResponse.JSON_PROPERTY_NETWORK,
  AgentResponse.JSON_PROPERTY_AGENT_ID,
  AgentResponse.JSON_PROPERTY_AGENT_NAME,
  AgentResponse.JSON_PROPERTY_LOCATION,
  AgentResponse.JSON_PROPERTY_COUNTRY_ID,
  AgentResponse.JSON_PROPERTY_ENABLED,
  AgentResponse.JSON_PROPERTY_PREFIX,
  AgentResponse.JSON_PROPERTY_VERIFY_SSL_CERTIFICATES,
  AgentResponse.JSON_PROPERTY_AGENT_TYPE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class AgentResponse {
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

  public static final String JSON_PROPERTY_AGENT_TYPE = "agentType";
  private CloudEnterpriseAgentType agentType;

  public AgentResponse() { 
  }

  @JsonCreator
  public AgentResponse(
    @JsonProperty(JSON_PROPERTY_IP_ADDRESSES) List<String> ipAddresses, 
    @JsonProperty(JSON_PROPERTY_PUBLIC_IP_ADDRESSES) List<String> publicIpAddresses, 
    @JsonProperty(JSON_PROPERTY_NETWORK) String network, 
    @JsonProperty(JSON_PROPERTY_AGENT_ID) String agentId, 
    @JsonProperty(JSON_PROPERTY_LOCATION) String location, 
    @JsonProperty(JSON_PROPERTY_COUNTRY_ID) String countryId, 
    @JsonProperty(JSON_PROPERTY_PREFIX) String prefix, 
    @JsonProperty(JSON_PROPERTY_VERIFY_SSL_CERTIFICATES) Boolean verifySslCertificates
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




  public AgentResponse agentName(String agentName) {
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




  public AgentResponse enabled(Boolean enabled) {
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




  public AgentResponse agentType(CloudEnterpriseAgentType agentType) {
    this.agentType = agentType;
    return this;
  }

   /**
   * Get agentType
   * @return agentType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AGENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CloudEnterpriseAgentType getAgentType() {
    return agentType;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAgentType(CloudEnterpriseAgentType agentType) {
    this.agentType = agentType;
  }


  /**
   * Return true if this AgentResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentResponse agentResponse = (AgentResponse) o;
    return Objects.equals(this.ipAddresses, agentResponse.ipAddresses) &&
        Objects.equals(this.publicIpAddresses, agentResponse.publicIpAddresses) &&
        Objects.equals(this.network, agentResponse.network) &&
        Objects.equals(this.agentId, agentResponse.agentId) &&
        Objects.equals(this.agentName, agentResponse.agentName) &&
        Objects.equals(this.location, agentResponse.location) &&
        Objects.equals(this.countryId, agentResponse.countryId) &&
        Objects.equals(this.enabled, agentResponse.enabled) &&
        Objects.equals(this.prefix, agentResponse.prefix) &&
        Objects.equals(this.verifySslCertificates, agentResponse.verifySslCertificates) &&
        Objects.equals(this.agentType, agentResponse.agentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddresses, publicIpAddresses, network, agentId, agentName, location, countryId, enabled, prefix, verifySslCertificates, agentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentResponse {\n");
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
    sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
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

