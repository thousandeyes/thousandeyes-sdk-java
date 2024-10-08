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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contains approximate GPS location of the endpoint agent, based on endpoint agent’s public IP address.
 */
@JsonPropertyOrder({
  RealUserEndpointTestCoordinates.JSON_PROPERTY_LATITUDE,
  RealUserEndpointTestCoordinates.JSON_PROPERTY_LOCATION,
  RealUserEndpointTestCoordinates.JSON_PROPERTY_LONGITUDE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class RealUserEndpointTestCoordinates {
  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private Double latitude;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private Double longitude;

  public RealUserEndpointTestCoordinates() { 
  }

  @JsonCreator
  public RealUserEndpointTestCoordinates(
    @JsonProperty(JSON_PROPERTY_LATITUDE) Double latitude, 
    @JsonProperty(JSON_PROPERTY_LOCATION) String location, 
    @JsonProperty(JSON_PROPERTY_LONGITUDE) Double longitude
  ) {
  this();
    this.latitude = latitude;
    this.location = location;
    this.longitude = longitude;
  }

   /**
   * Numeric representations of GPS coordinates.
   * @return latitude
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLatitude() {
    return latitude;
  }




   /**
   * Represents named geographical location.
   * @return location
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocation() {
    return location;
  }




   /**
   * Numeric representations of GPS coordinates.
   * @return longitude
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLongitude() {
    return longitude;
  }




  /**
   * Return true if this RealUserEndpointTestCoordinates object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealUserEndpointTestCoordinates realUserEndpointTestCoordinates = (RealUserEndpointTestCoordinates) o;
    return Objects.equals(this.latitude, realUserEndpointTestCoordinates.latitude) &&
        Objects.equals(this.location, realUserEndpointTestCoordinates.location) &&
        Objects.equals(this.longitude, realUserEndpointTestCoordinates.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, location, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealUserEndpointTestCoordinates {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

