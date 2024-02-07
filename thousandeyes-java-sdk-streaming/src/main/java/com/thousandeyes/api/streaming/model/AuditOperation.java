/*
 * ThousandEyes for OpenTelemetry API
 *  Configure ThousandEyes to stream or push test data to a OpenTelemetry compliant endpoint with the ThousandEyes for OpenTelemetry API. 
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
 * AuditOperation
 */
@JsonPropertyOrder({
  AuditOperation.JSON_PROPERTY_CREATED_BY,
  AuditOperation.JSON_PROPERTY_CREATED_DATE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-02-07T22:58:22.959841Z[Europe/Lisbon]")
public class AuditOperation {
  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private Long createdBy;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private Long createdDate;

  public AuditOperation() { 
  }

  public AuditOperation createdBy(Long createdBy) {
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


  public AuditOperation createdDate(Long createdDate) {
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


  /**
   * Return true if this AuditOperation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditOperation auditOperation = (AuditOperation) o;
    return Objects.equals(this.createdBy, auditOperation.createdBy) &&
        Objects.equals(this.createdDate, auditOperation.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditOperation {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

