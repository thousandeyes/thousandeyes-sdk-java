/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.4
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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EthernetProfile
 */
@JsonPropertyOrder({
  EthernetProfile.JSON_PROPERTY_LINK_SPEED
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-05-17T09:32:26.589642+01:00[Europe/Lisbon]")
public class EthernetProfile {
  public static final String JSON_PROPERTY_LINK_SPEED = "linkSpeed";
  private BigDecimal linkSpeed;

  public EthernetProfile() { 
  }

  @JsonCreator
  public EthernetProfile(
    @JsonProperty(JSON_PROPERTY_LINK_SPEED) BigDecimal linkSpeed
  ) {
  this();
    this.linkSpeed = linkSpeed;
  }

   /**
   * Ethernet profile link speed
   * @return linkSpeed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLinkSpeed() {
    return linkSpeed;
  }




  /**
   * Return true if this EthernetProfile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EthernetProfile ethernetProfile = (EthernetProfile) o;
    return Objects.equals(this.linkSpeed, ethernetProfile.linkSpeed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkSpeed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EthernetProfile {\n");
    sb.append("    linkSpeed: ").append(toIndentedString(linkSpeed)).append("\n");
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

