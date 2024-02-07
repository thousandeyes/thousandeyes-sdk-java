/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.0
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
import com.thousandeyes.api.endpoint.tests.results.model.TracerouteHop;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RealUserTestNetworkTraceroute
 */
@JsonPropertyOrder({
  RealUserTestNetworkTraceroute.JSON_PROPERTY_DESTINATION,
  RealUserTestNetworkTraceroute.JSON_PROPERTY_ERROR,
  RealUserTestNetworkTraceroute.JSON_PROPERTY_INFO_FLAGS,
  RealUserTestNetworkTraceroute.JSON_PROPERTY_INTERNAL_ERRORS,
  RealUserTestNetworkTraceroute.JSON_PROPERTY_HOPS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-02-07T22:58:18.077659Z[Europe/Lisbon]")
public class RealUserTestNetworkTraceroute {
  public static final String JSON_PROPERTY_DESTINATION = "destination";
  private String destination;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_INFO_FLAGS = "infoFlags";
  private List<String> infoFlags;

  public static final String JSON_PROPERTY_INTERNAL_ERRORS = "internalErrors";
  private List<String> internalErrors;

  public static final String JSON_PROPERTY_HOPS = "hops";
  private List<TracerouteHop> hops;

  public RealUserTestNetworkTraceroute() { 
  }

  @JsonCreator
  public RealUserTestNetworkTraceroute(
    @JsonProperty(JSON_PROPERTY_DESTINATION) String destination, 
    @JsonProperty(JSON_PROPERTY_ERROR) String error, 
    @JsonProperty(JSON_PROPERTY_INFO_FLAGS) List<String> infoFlags, 
    @JsonProperty(JSON_PROPERTY_INTERNAL_ERRORS) List<String> internalErrors
  ) {
  this();
    this.destination = destination;
    this.error = error;
    this.infoFlags = infoFlags;
    this.internalErrors = internalErrors;
  }

   /**
   * The target IP address.
   * @return destination
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDestination() {
    return destination;
  }




   /**
   * Only present when there is an error
   * @return error
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }




   /**
   * Get infoFlags
   * @return infoFlags
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFO_FLAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getInfoFlags() {
    return infoFlags;
  }




   /**
   * Get internalErrors
   * @return internalErrors
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERNAL_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getInternalErrors() {
    return internalErrors;
  }




  public RealUserTestNetworkTraceroute hops(List<TracerouteHop> hops) {
    this.hops = hops;
    return this;
  }

  public RealUserTestNetworkTraceroute addHopsItem(TracerouteHop hopsItem) {
    if (this.hops == null) {
      this.hops = new ArrayList<>();
    }
    this.hops.add(hopsItem);
    return this;
  }

   /**
   * Get hops
   * @return hops
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TracerouteHop> getHops() {
    return hops;
  }


  @JsonProperty(JSON_PROPERTY_HOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHops(List<TracerouteHop> hops) {
    this.hops = hops;
  }


  /**
   * Return true if this RealUserTestNetwork_traceroute object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealUserTestNetworkTraceroute realUserTestNetworkTraceroute = (RealUserTestNetworkTraceroute) o;
    return Objects.equals(this.destination, realUserTestNetworkTraceroute.destination) &&
        Objects.equals(this.error, realUserTestNetworkTraceroute.error) &&
        Objects.equals(this.infoFlags, realUserTestNetworkTraceroute.infoFlags) &&
        Objects.equals(this.internalErrors, realUserTestNetworkTraceroute.internalErrors) &&
        Objects.equals(this.hops, realUserTestNetworkTraceroute.hops);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, error, infoFlags, internalErrors, hops);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealUserTestNetworkTraceroute {\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    infoFlags: ").append(toIndentedString(infoFlags)).append("\n");
    sb.append("    internalErrors: ").append(toIndentedString(internalErrors)).append("\n");
    sb.append("    hops: ").append(toIndentedString(hops)).append("\n");
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

