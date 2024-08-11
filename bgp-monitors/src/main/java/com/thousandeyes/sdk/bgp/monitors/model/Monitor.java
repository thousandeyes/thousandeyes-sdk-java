/*
 * BGP Monitors API
 *  Retrieve information about BGP monitors available to your ThousandEyes account. ThousandEyes ingests BGP routing data from dozens of global BGP collectors and automatically integrates that visibility as a configurable layer under service, network, and path visualization layers.  When you specify a service URL in a test, layered BGP tests automatically track reachability and path changes for any relevant prefix. When you use an IP address as the target for a test, the ThousandEyes platform monitors the relevant internet-routed prefix. You can also create specific BGP monitoring for a prefix, and can alert on hijacks and leaks.  For more information about monitors, see [Inside-Out BGP Visibility](https://docs.thousandeyes.com/product-documentation/internet-and-wan-monitoring/tests/bgp-tests/inside-out-bgp-visibility). 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.bgp.monitors.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.bgp.monitors.model.MonitorType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Monitor
 */
@JsonPropertyOrder({
  Monitor.JSON_PROPERTY_COUNTRY_ID,
  Monitor.JSON_PROPERTY_MONITOR_ID,
  Monitor.JSON_PROPERTY_IP_ADDRESS,
  Monitor.JSON_PROPERTY_NETWORK,
  Monitor.JSON_PROPERTY_MONITOR_TYPE,
  Monitor.JSON_PROPERTY_MONITOR_NAME
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class Monitor {
  public static final String JSON_PROPERTY_COUNTRY_ID = "countryId";
  private String countryId;

  public static final String JSON_PROPERTY_MONITOR_ID = "monitorId";
  private String monitorId;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private String ipAddress;

  public static final String JSON_PROPERTY_NETWORK = "network";
  private String network;

  public static final String JSON_PROPERTY_MONITOR_TYPE = "monitorType";
  private MonitorType monitorType;

  public static final String JSON_PROPERTY_MONITOR_NAME = "monitorName";
  private String monitorName;

  public Monitor() { 
  }

  @JsonCreator
  public Monitor(
    @JsonProperty(JSON_PROPERTY_COUNTRY_ID) String countryId, 
    @JsonProperty(JSON_PROPERTY_MONITOR_ID) String monitorId
  ) {
  this();
    this.countryId = countryId;
    this.monitorId = monitorId;
  }

   /**
   * Country ID
   * @return countryId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryId() {
    return countryId;
  }




   /**
   * BGP monitor ID
   * @return monitorId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMonitorId() {
    return monitorId;
  }




  public Monitor ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of the BGP monitor
   * @return ipAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpAddress() {
    return ipAddress;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public Monitor network(String network) {
    this.network = network;
    return this;
  }

   /**
   * Name of the autonomous system in which the monitor is found
   * @return network
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetwork() {
    return network;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetwork(String network) {
    this.network = network;
  }


  public Monitor monitorType(MonitorType monitorType) {
    this.monitorType = monitorType;
    return this;
  }

   /**
   * Get monitorType
   * @return monitorType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MonitorType getMonitorType() {
    return monitorType;
  }


  @JsonProperty(JSON_PROPERTY_MONITOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitorType(MonitorType monitorType) {
    this.monitorType = monitorType;
  }


  public Monitor monitorName(String monitorName) {
    this.monitorName = monitorName;
    return this;
  }

   /**
   * Display name of the BGP monitor
   * @return monitorName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMonitorName() {
    return monitorName;
  }


  @JsonProperty(JSON_PROPERTY_MONITOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitorName(String monitorName) {
    this.monitorName = monitorName;
  }


  /**
   * Return true if this Monitor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Monitor monitor = (Monitor) o;
    return Objects.equals(this.countryId, monitor.countryId) &&
        Objects.equals(this.monitorId, monitor.monitorId) &&
        Objects.equals(this.ipAddress, monitor.ipAddress) &&
        Objects.equals(this.network, monitor.network) &&
        Objects.equals(this.monitorType, monitor.monitorType) &&
        Objects.equals(this.monitorName, monitor.monitorName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryId, monitorId, ipAddress, network, monitorType, monitorName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Monitor {\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    monitorType: ").append(toIndentedString(monitorType)).append("\n");
    sb.append("    monitorName: ").append(toIndentedString(monitorName)).append("\n");
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

