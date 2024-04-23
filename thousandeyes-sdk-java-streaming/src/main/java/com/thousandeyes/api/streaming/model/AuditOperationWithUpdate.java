/*
 * ThousandEyes for OpenTelemetry API
 * ThousandEyes for OpenTelemetry provides machine-to-machine integration between ThousandEyes and its customers. It allows you to export ThousandEyes telemetry data in OTel format, which is widely used in the industry. With ThousandEyes for OTel, you can leverage frameworks widely used in the observability domain - such as Splunk, Grafana, and Honeycomb - to capture and analyze ThousandEyes data. Any client that supports OTel can use ThousandEyes for OpenTelemetry.  ThousandEyes for OTel is made up of the following components:  * Data streaming APIs that you can use to configure and enable your ThousandEyes tests with OTel-compatible streams, in particular to configure how ThousandEyes telemetry data is exported to client integrations. * A set of streaming pipelines called _collectors_ that actively fetch ThousandEyes network test data, enrich the data with some additional detail, filter, and push the data to the customer-configured endpoints, depending on what you configure via the public APIs. * Third-party OTel collectors that receive, transform, filter, and export different metrics to client applications such as AppD, or any other OTel-capable client configuration.  For more information about ThousandEyes for OpenTelemetry, see the [documentation](https://docs.thousandeyes.com/product-documentation/api/opentelemetry). 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.streaming.model;

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
 * AuditOperationWithUpdate
 */
@JsonPropertyOrder({
  AuditOperationWithUpdate.JSON_PROPERTY_CREATED_BY,
  AuditOperationWithUpdate.JSON_PROPERTY_CREATED_DATE,
  AuditOperationWithUpdate.JSON_PROPERTY_UPDATED_BY,
  AuditOperationWithUpdate.JSON_PROPERTY_UPDATED_DATE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T16:57:44.814008+01:00[Europe/Lisbon]")
public class AuditOperationWithUpdate {
  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private Long createdBy;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private Long createdDate;

  public static final String JSON_PROPERTY_UPDATED_BY = "updatedBy";
  private Long updatedBy;

  public static final String JSON_PROPERTY_UPDATED_DATE = "updatedDate";
  private Long updatedDate;

  public AuditOperationWithUpdate() { 
  }

  public AuditOperationWithUpdate createdBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * ID of the user who created the integration
   * @return createdBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }


  public AuditOperationWithUpdate createdDate(Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Creation date of the integration
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedDate() {
    return createdDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }


  public AuditOperationWithUpdate updatedBy(Long updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * ID of the user who last updated the integration
   * @return updatedBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUpdatedBy() {
    return updatedBy;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedBy(Long updatedBy) {
    this.updatedBy = updatedBy;
  }


  public AuditOperationWithUpdate updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * Date of the last update to the integration
   * @return updatedDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUpdatedDate() {
    return updatedDate;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }


  /**
   * Return true if this AuditOperationWithUpdate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditOperationWithUpdate auditOperationWithUpdate = (AuditOperationWithUpdate) o;
    return Objects.equals(this.createdBy, auditOperationWithUpdate.createdBy) &&
        Objects.equals(this.createdDate, auditOperationWithUpdate.createdDate) &&
        Objects.equals(this.updatedBy, auditOperationWithUpdate.updatedBy) &&
        Objects.equals(this.updatedDate, auditOperationWithUpdate.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, updatedBy, updatedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditOperationWithUpdate {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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

