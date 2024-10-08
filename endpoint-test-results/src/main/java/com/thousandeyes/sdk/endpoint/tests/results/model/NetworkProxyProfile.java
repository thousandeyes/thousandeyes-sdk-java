/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
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
import com.thousandeyes.sdk.endpoint.tests.results.model.NetworkProxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NetworkProxyProfile
 */
@JsonPropertyOrder({
  NetworkProxyProfile.JSON_PROPERTY_METHOD,
  NetworkProxyProfile.JSON_PROPERTY_PROXIES
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class NetworkProxyProfile {
  public static final String JSON_PROPERTY_METHOD = "method";
  private String method;

  public static final String JSON_PROPERTY_PROXIES = "proxies";
  private List<NetworkProxy> proxies = new ArrayList<>();

  public NetworkProxyProfile() { 
  }

  @JsonCreator
  public NetworkProxyProfile(
    @JsonProperty(JSON_PROPERTY_METHOD) String method
  ) {
  this();
    this.method = method;
  }

   /**
   * Proxy profile method.
   * @return method
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMethod() {
    return method;
  }




  public NetworkProxyProfile proxies(List<NetworkProxy> proxies) {
    this.proxies = proxies;
    return this;
  }

  public NetworkProxyProfile addProxiesItem(NetworkProxy proxiesItem) {
    if (this.proxies == null) {
      this.proxies = new ArrayList<>();
    }
    this.proxies.add(proxiesItem);
    return this;
  }

   /**
   * Get proxies
   * @return proxies
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROXIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<NetworkProxy> getProxies() {
    return proxies;
  }


  @JsonProperty(JSON_PROPERTY_PROXIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProxies(List<NetworkProxy> proxies) {
    this.proxies = proxies;
  }


  /**
   * Return true if this NetworkProxyProfile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkProxyProfile networkProxyProfile = (NetworkProxyProfile) o;
    return Objects.equals(this.method, networkProxyProfile.method) &&
        Objects.equals(this.proxies, networkProxyProfile.proxies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, proxies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkProxyProfile {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    proxies: ").append(toIndentedString(proxies)).append("\n");
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

