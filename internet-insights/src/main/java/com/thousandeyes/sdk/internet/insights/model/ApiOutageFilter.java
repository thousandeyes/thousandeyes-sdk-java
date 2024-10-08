/*
 * Internet Insights API
 * We are happy to announce the release of the Internet Insights API set. This limited release includes endpoints that:  * Make our catalog provider and Internet outage data accessible to API users. * Provide access to advanced filtering, which is part of our next-generation API efforts to allow API users to fine-tune queries across all of our APIs in a consistent manner.  Internet Insights provide visibility into core Internet infrastructure, including ISPs, DNS providers, IaaS, CDNs , and SaaS providers. It tracks the macro-level impact of Internet events on individual users and enterprise networks connecting at the edge of the Internet. These events include Outages, Routing hijacks and leaks, DDoS attacks, And political interference, among others.  Future releases of the Internet Insights API set will further unlock access to core Internet Insights functionality, unlocking potential integrations to enrich customer process flows.  For more information about Internet Insights, see the [Internet Insights](https://docs.thousandeyes.com/product-documentation/internet-insights). 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.internet.insights.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.internet.insights.model.OutageScope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Advanced filter query used to filter the response. Can filter on: - outageScope (all, affected tests (e.g. my tests only)). - providerName - interfaceNetwork - applicationName - startDate, endDate - window
 */
@JsonPropertyOrder({
  ApiOutageFilter.JSON_PROPERTY_START_DATE,
  ApiOutageFilter.JSON_PROPERTY_END_DATE,
  ApiOutageFilter.JSON_PROPERTY_WINDOW,
  ApiOutageFilter.JSON_PROPERTY_OUTAGE_SCOPE,
  ApiOutageFilter.JSON_PROPERTY_PROVIDER_NAME,
  ApiOutageFilter.JSON_PROPERTY_APPLICATION_NAME,
  ApiOutageFilter.JSON_PROPERTY_INTERFACE_NETWORK
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiOutageFilter {
  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_WINDOW = "window";
  private String window;

  public static final String JSON_PROPERTY_OUTAGE_SCOPE = "outageScope";
  private OutageScope outageScope;

  public static final String JSON_PROPERTY_PROVIDER_NAME = "providerName";
  private List<String> providerName = new ArrayList<>();

  public static final String JSON_PROPERTY_APPLICATION_NAME = "applicationName";
  private List<String> applicationName = new ArrayList<>();

  public static final String JSON_PROPERTY_INTERFACE_NETWORK = "interfaceNetwork";
  private List<String> interfaceNetwork = new ArrayList<>();

  public ApiOutageFilter() { 
  }

  public ApiOutageFilter startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Start of the time range. Must be paired with &#x60;endDate&#x60;.
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public ApiOutageFilter endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End of the time range. Must be paired with &#x60;startDate&#x60;.
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public ApiOutageFilter window(String window) {
    this.window = window;
    return this;
  }

   /**
   * Specify a time period in the past for which to retrieve data. Alternative to specifying &#x60;startDate&#x60; and &#x60;endDate&#x60;.
   * @return window
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWindow() {
    return window;
  }


  @JsonProperty(JSON_PROPERTY_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWindow(String window) {
    this.window = window;
  }


  public ApiOutageFilter outageScope(OutageScope outageScope) {
    this.outageScope = outageScope;
    return this;
  }

   /**
   * Get outageScope
   * @return outageScope
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTAGE_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OutageScope getOutageScope() {
    return outageScope;
  }


  @JsonProperty(JSON_PROPERTY_OUTAGE_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutageScope(OutageScope outageScope) {
    this.outageScope = outageScope;
  }


  public ApiOutageFilter providerName(List<String> providerName) {
    this.providerName = providerName;
    return this;
  }

  public ApiOutageFilter addProviderNameItem(String providerNameItem) {
    if (this.providerName == null) {
      this.providerName = new ArrayList<>();
    }
    this.providerName.add(providerNameItem);
    return this;
  }

   /**
   * The name used to identify the provider.
   * @return providerName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getProviderName() {
    return providerName;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderName(List<String> providerName) {
    this.providerName = providerName;
  }


  public ApiOutageFilter applicationName(List<String> applicationName) {
    this.applicationName = applicationName;
    return this;
  }

  public ApiOutageFilter addApplicationNameItem(String applicationNameItem) {
    if (this.applicationName == null) {
      this.applicationName = new ArrayList<>();
    }
    this.applicationName.add(applicationNameItem);
    return this;
  }

   /**
   * The name to identify the application.
   * @return applicationName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getApplicationName() {
    return applicationName;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationName(List<String> applicationName) {
    this.applicationName = applicationName;
  }


  public ApiOutageFilter interfaceNetwork(List<String> interfaceNetwork) {
    this.interfaceNetwork = interfaceNetwork;
    return this;
  }

  public ApiOutageFilter addInterfaceNetworkItem(String interfaceNetworkItem) {
    if (this.interfaceNetwork == null) {
      this.interfaceNetwork = new ArrayList<>();
    }
    this.interfaceNetwork.add(interfaceNetworkItem);
    return this;
  }

   /**
   * The name of the ASN (Interface Network).
   * @return interfaceNetwork
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERFACE_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getInterfaceNetwork() {
    return interfaceNetwork;
  }


  @JsonProperty(JSON_PROPERTY_INTERFACE_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterfaceNetwork(List<String> interfaceNetwork) {
    this.interfaceNetwork = interfaceNetwork;
  }


  /**
   * Return true if this ApiOutageFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiOutageFilter apiOutageFilter = (ApiOutageFilter) o;
    return Objects.equals(this.startDate, apiOutageFilter.startDate) &&
        Objects.equals(this.endDate, apiOutageFilter.endDate) &&
        Objects.equals(this.window, apiOutageFilter.window) &&
        Objects.equals(this.outageScope, apiOutageFilter.outageScope) &&
        Objects.equals(this.providerName, apiOutageFilter.providerName) &&
        Objects.equals(this.applicationName, apiOutageFilter.applicationName) &&
        Objects.equals(this.interfaceNetwork, apiOutageFilter.interfaceNetwork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, window, outageScope, providerName, applicationName, interfaceNetwork);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiOutageFilter {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    window: ").append(toIndentedString(window)).append("\n");
    sb.append("    outageScope: ").append(toIndentedString(outageScope)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    interfaceNetwork: ").append(toIndentedString(interfaceNetwork)).append("\n");
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

