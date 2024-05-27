/*
 * Test Snapshots API
 * Creates a new test snapshot in ThousandEyes.
 *
 * The version of the OpenAPI document: 7.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.snapshots.model;

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
 * SnapshotRequest
 */
@JsonPropertyOrder({
  SnapshotRequest.JSON_PROPERTY_DISPLAY_NAME,
  SnapshotRequest.JSON_PROPERTY_START_DATE,
  SnapshotRequest.JSON_PROPERTY_END_DATE,
  SnapshotRequest.JSON_PROPERTY_IS_PUBLIC
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class SnapshotRequest {
  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_IS_PUBLIC = "isPublic";
  private Boolean isPublic;

  public SnapshotRequest() { 
  }

  public SnapshotRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Snapshot title.
   * @return displayName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public SnapshotRequest startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date for the snapshot in UTC time, formatted in ISO date-time.
   * @return startDate
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public SnapshotRequest endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date for the snapshot in UTC time, formatted in ISO date-time.
   * @return endDate
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public SnapshotRequest isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; for saved events and &#x60;false&#x60; for share links. Its default value is &#x60;false&#x60;.
   * @return isPublic
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPublic() {
    return isPublic;
  }


  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  /**
   * Return true if this SnapshotRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotRequest snapshotRequest = (SnapshotRequest) o;
    return Objects.equals(this.displayName, snapshotRequest.displayName) &&
        Objects.equals(this.startDate, snapshotRequest.startDate) &&
        Objects.equals(this.endDate, snapshotRequest.endDate) &&
        Objects.equals(this.isPublic, snapshotRequest.isPublic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, startDate, endDate, isPublic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotRequest {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
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

