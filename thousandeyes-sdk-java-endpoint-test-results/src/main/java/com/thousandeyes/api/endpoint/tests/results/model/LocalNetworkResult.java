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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LocalNetworkResult
 */
@JsonPropertyOrder({
  LocalNetworkResult.JSON_PROPERTY_NETWORK_ID,
  LocalNetworkResult.JSON_PROPERTY_NETWORK_NAME,
  LocalNetworkResult.JSON_PROPERTY_LOCAL_PREFIX,
  LocalNetworkResult.JSON_PROPERTY_PUBLIC_IP_RANGE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class LocalNetworkResult {
  public static final String JSON_PROPERTY_NETWORK_ID = "networkId";
  private String networkId;

  public static final String JSON_PROPERTY_NETWORK_NAME = "networkName";
  private String networkName;

  public static final String JSON_PROPERTY_LOCAL_PREFIX = "localPrefix";
  private String localPrefix;

  public static final String JSON_PROPERTY_PUBLIC_IP_RANGE = "publicIpRange";
  private String publicIpRange;

  public LocalNetworkResult() { 
  }

  @JsonCreator
  public LocalNetworkResult(
    @JsonProperty(JSON_PROPERTY_NETWORK_ID) String networkId, 
    @JsonProperty(JSON_PROPERTY_NETWORK_NAME) String networkName, 
    @JsonProperty(JSON_PROPERTY_LOCAL_PREFIX) String localPrefix, 
    @JsonProperty(JSON_PROPERTY_PUBLIC_IP_RANGE) String publicIpRange
  ) {
  this();
    this.networkId = networkId;
    this.networkName = networkName;
    this.localPrefix = localPrefix;
    this.publicIpRange = publicIpRange;
  }

   /**
   * The network ID. Each network occurrence has a unique ID.
   * @return networkId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetworkId() {
    return networkId;
  }




   /**
   * The network name.
   * @return networkName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetworkName() {
    return networkName;
  }




   /**
   * Network local private address.
   * @return localPrefix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCAL_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocalPrefix() {
    return localPrefix;
  }




   /**
   * Network public IP range.
   * @return publicIpRange
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_IP_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicIpRange() {
    return publicIpRange;
  }




  /**
   * Return true if this LocalNetworkResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalNetworkResult localNetworkResult = (LocalNetworkResult) o;
    return Objects.equals(this.networkId, localNetworkResult.networkId) &&
        Objects.equals(this.networkName, localNetworkResult.networkName) &&
        Objects.equals(this.localPrefix, localNetworkResult.localPrefix) &&
        Objects.equals(this.publicIpRange, localNetworkResult.publicIpRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkId, networkName, localPrefix, publicIpRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalNetworkResult {\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
    sb.append("    localPrefix: ").append(toIndentedString(localPrefix)).append("\n");
    sb.append("    publicIpRange: ").append(toIndentedString(publicIpRange)).append("\n");
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

