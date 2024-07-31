/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.endpoint.tests.results.model.LocalNetworkResult;
import com.thousandeyes.sdk.endpoint.tests.results.model.SelfLinks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LocalNetworkResults
 */
@JsonPropertyOrder({
  LocalNetworkResults.JSON_PROPERTY_LOCAL_NETWORKS,
  LocalNetworkResults.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class LocalNetworkResults {
  public static final String JSON_PROPERTY_LOCAL_NETWORKS = "localNetworks";
  private List<LocalNetworkResult> localNetworks = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinks links;

  public LocalNetworkResults() { 
  }

  public LocalNetworkResults localNetworks(List<LocalNetworkResult> localNetworks) {
    this.localNetworks = localNetworks;
    return this;
  }

  public LocalNetworkResults addLocalNetworksItem(LocalNetworkResult localNetworksItem) {
    if (this.localNetworks == null) {
      this.localNetworks = new ArrayList<>();
    }
    this.localNetworks.add(localNetworksItem);
    return this;
  }

   /**
   * Get localNetworks
   * @return localNetworks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCAL_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LocalNetworkResult> getLocalNetworks() {
    return localNetworks;
  }


  @JsonProperty(JSON_PROPERTY_LOCAL_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocalNetworks(List<LocalNetworkResult> localNetworks) {
    this.localNetworks = localNetworks;
  }


  public LocalNetworkResults links(SelfLinks links) {
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
   * Return true if this LocalNetworkResults object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalNetworkResults localNetworkResults = (LocalNetworkResults) o;
    return Objects.equals(this.localNetworks, localNetworkResults.localNetworks) &&
        Objects.equals(this.links, localNetworkResults.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localNetworks, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalNetworkResults {\n");
    sb.append("    localNetworks: ").append(toIndentedString(localNetworks)).append("\n");
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

