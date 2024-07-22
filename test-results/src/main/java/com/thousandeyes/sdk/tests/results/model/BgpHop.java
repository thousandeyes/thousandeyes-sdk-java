/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.results.model;

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
 * BgpHop
 */
@JsonPropertyOrder({
  BgpHop.JSON_PROPERTY_ASN,
  BgpHop.JSON_PROPERTY_AS_NAME
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class BgpHop {
  public static final String JSON_PROPERTY_ASN = "asn";
  private Integer asn;

  public static final String JSON_PROPERTY_AS_NAME = "asName";
  private String asName;

  public BgpHop() { 
  }

  @JsonCreator
  public BgpHop(
    @JsonProperty(JSON_PROPERTY_ASN) Integer asn, 
    @JsonProperty(JSON_PROPERTY_AS_NAME) String asName
  ) {
  this();
    this.asn = asn;
    this.asName = asName;
  }

   /**
   * ASN of transit autonomous system
   * @return asn
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAsn() {
    return asn;
  }




   /**
   * Name of autonomous system.
   * @return asName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAsName() {
    return asName;
  }




  /**
   * Return true if this BgpHop object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgpHop bgpHop = (BgpHop) o;
    return Objects.equals(this.asn, bgpHop.asn) &&
        Objects.equals(this.asName, bgpHop.asName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asn, asName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgpHop {\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    asName: ").append(toIndentedString(asName)).append("\n");
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

