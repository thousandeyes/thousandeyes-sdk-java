/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.dashboards.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.dashboards.model.TestTableFilterKey;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A multi search filter key within the Multi-Metric table widget. The key represents the filter name, and the value specifies the filter value.
 */
@JsonPropertyOrder({
  ApiMultiSearchFilterApiTestTableFilterKey.JSON_PROPERTY_KEY,
  ApiMultiSearchFilterApiTestTableFilterKey.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiMultiSearchFilterApiTestTableFilterKey {
  public static final String JSON_PROPERTY_KEY = "key";
  private TestTableFilterKey key;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public ApiMultiSearchFilterApiTestTableFilterKey() { 
  }

  public ApiMultiSearchFilterApiTestTableFilterKey key(TestTableFilterKey key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestTableFilterKey getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(TestTableFilterKey key) {
    this.key = key;
  }


  public ApiMultiSearchFilterApiTestTableFilterKey value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Return true if this ApiMultiSearchFilterApiTestTableFilterKey object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiMultiSearchFilterApiTestTableFilterKey apiMultiSearchFilterApiTestTableFilterKey = (ApiMultiSearchFilterApiTestTableFilterKey) o;
    return Objects.equals(this.key, apiMultiSearchFilterApiTestTableFilterKey.key) &&
        Objects.equals(this.value, apiMultiSearchFilterApiTestTableFilterKey.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiMultiSearchFilterApiTestTableFilterKey {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

