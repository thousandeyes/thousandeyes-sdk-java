/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Request to update the expiration date of a snapshot.
 */
@JsonPropertyOrder({
  UpdateSnapshotExpirationDateApiRequest.JSON_PROPERTY_SNAPSHOT_EXPIRATION_DATE,
  UpdateSnapshotExpirationDateApiRequest.JSON_PROPERTY_EXPIRATION_DATE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class UpdateSnapshotExpirationDateApiRequest {
  public static final String JSON_PROPERTY_SNAPSHOT_EXPIRATION_DATE = "snapshotExpirationDate";
  private OffsetDateTime snapshotExpirationDate;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  private String expirationDate;

  public UpdateSnapshotExpirationDateApiRequest() { 
  }

  public UpdateSnapshotExpirationDateApiRequest snapshotExpirationDate(OffsetDateTime snapshotExpirationDate) {
    this.snapshotExpirationDate = snapshotExpirationDate;
    return this;
  }

   /**
   * Expiration date of the snapshot. If unspecified, the snapshot expires 1 year from its creation date. The expiration date must be set within 5 years from the current date and adhere to the ISO date-time format.
   * @return snapshotExpirationDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSnapshotExpirationDate() {
    return snapshotExpirationDate;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshotExpirationDate(OffsetDateTime snapshotExpirationDate) {
    this.snapshotExpirationDate = snapshotExpirationDate;
  }


  public UpdateSnapshotExpirationDateApiRequest expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration date of the snapshot. If unspecified, the snapshot expires 1 year from its creation date. The expiration date must be set within 5 years from the current date.
   * @return expirationDate
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpirationDate() {
    return expirationDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  /**
   * Return true if this UpdateSnapshotExpirationDateApiRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSnapshotExpirationDateApiRequest updateSnapshotExpirationDateApiRequest = (UpdateSnapshotExpirationDateApiRequest) o;
    return Objects.equals(this.snapshotExpirationDate, updateSnapshotExpirationDateApiRequest.snapshotExpirationDate) &&
        Objects.equals(this.expirationDate, updateSnapshotExpirationDateApiRequest.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotExpirationDate, expirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSnapshotExpirationDateApiRequest {\n");
    sb.append("    snapshotExpirationDate: ").append(toIndentedString(snapshotExpirationDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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

