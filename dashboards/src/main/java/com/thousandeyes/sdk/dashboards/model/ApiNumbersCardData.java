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
import com.thousandeyes.sdk.dashboards.model.ApiDashboardAsw;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The data displayed on a numbers card.
 */
@JsonPropertyOrder({
  ApiNumbersCardData.JSON_PROPERTY_CARD_ID,
  ApiNumbersCardData.JSON_PROPERTY_START_DATE,
  ApiNumbersCardData.JSON_PROPERTY_END_DATE,
  ApiNumbersCardData.JSON_PROPERTY_PREVIOUS_VALUE,
  ApiNumbersCardData.JSON_PROPERTY_BIN_SIZE,
  ApiNumbersCardData.JSON_PROPERTY_TIMESTAMP,
  ApiNumbersCardData.JSON_PROPERTY_NUMBER_OF_DATA_POINTS,
  ApiNumbersCardData.JSON_PROPERTY_VALUE,
  ApiNumbersCardData.JSON_PROPERTY_STATUS,
  ApiNumbersCardData.JSON_PROPERTY_ALERT_SUPPRESSION_WINDOWS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiNumbersCardData {
  public static final String JSON_PROPERTY_CARD_ID = "cardId";
  private String cardId;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_PREVIOUS_VALUE = "previousValue";
  private Double previousValue;

  public static final String JSON_PROPERTY_BIN_SIZE = "binSize";
  private Long binSize;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public static final String JSON_PROPERTY_NUMBER_OF_DATA_POINTS = "numberOfDataPoints";
  private Long numberOfDataPoints;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_ALERT_SUPPRESSION_WINDOWS = "alertSuppressionWindows";
  private List<ApiDashboardAsw> alertSuppressionWindows = new ArrayList<>();

  public ApiNumbersCardData() { 
  }

  public ApiNumbersCardData cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * Identifier of the card.
   * @return cardId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardId() {
    return cardId;
  }


  @JsonProperty(JSON_PROPERTY_CARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardId(String cardId) {
    this.cardId = cardId;
  }


  public ApiNumbersCardData startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * UTC start date of the data shown in the API output (ISO date-time format).
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public ApiNumbersCardData endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * UTC end date of the data shown in the API output (ISO date-time format).
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public ApiNumbersCardData previousValue(Double previousValue) {
    this.previousValue = previousValue;
    return this;
  }

   /**
   * Previous value if &#x60;compareToPreviousValue &#x3D;&#x3D; true&#x60; in configuration.
   * @return previousValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREVIOUS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPreviousValue() {
    return previousValue;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviousValue(Double previousValue) {
    this.previousValue = previousValue;
  }


  public ApiNumbersCardData binSize(Long binSize) {
    this.binSize = binSize;
    return this;
  }

   /**
   * Duration of each bin.
   * @return binSize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIN_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBinSize() {
    return binSize;
  }


  @JsonProperty(JSON_PROPERTY_BIN_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBinSize(Long binSize) {
    this.binSize = binSize;
  }


  public ApiNumbersCardData timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp of the aggregated data point.
   * @return timestamp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  public ApiNumbersCardData numberOfDataPoints(Long numberOfDataPoints) {
    this.numberOfDataPoints = numberOfDataPoints;
    return this;
  }

   /**
   * Number of points aggregated into the data point
   * @return numberOfDataPoints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_DATA_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfDataPoints() {
    return numberOfDataPoints;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_DATA_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfDataPoints(Long numberOfDataPoints) {
    this.numberOfDataPoints = numberOfDataPoints;
  }


  public ApiNumbersCardData value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Aggregated value.
   * @return value
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Double value) {
    this.value = value;
  }


  public ApiNumbersCardData status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Message for not fully configured card or no data.
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public ApiNumbersCardData alertSuppressionWindows(List<ApiDashboardAsw> alertSuppressionWindows) {
    this.alertSuppressionWindows = alertSuppressionWindows;
    return this;
  }

  public ApiNumbersCardData addAlertSuppressionWindowsItem(ApiDashboardAsw alertSuppressionWindowsItem) {
    if (this.alertSuppressionWindows == null) {
      this.alertSuppressionWindows = new ArrayList<>();
    }
    this.alertSuppressionWindows.add(alertSuppressionWindowsItem);
    return this;
  }

   /**
   * Get alertSuppressionWindows
   * @return alertSuppressionWindows
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_SUPPRESSION_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiDashboardAsw> getAlertSuppressionWindows() {
    return alertSuppressionWindows;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_SUPPRESSION_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertSuppressionWindows(List<ApiDashboardAsw> alertSuppressionWindows) {
    this.alertSuppressionWindows = alertSuppressionWindows;
  }


  /**
   * Return true if this ApiNumbersCardData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiNumbersCardData apiNumbersCardData = (ApiNumbersCardData) o;
    return Objects.equals(this.cardId, apiNumbersCardData.cardId) &&
        Objects.equals(this.startDate, apiNumbersCardData.startDate) &&
        Objects.equals(this.endDate, apiNumbersCardData.endDate) &&
        Objects.equals(this.previousValue, apiNumbersCardData.previousValue) &&
        Objects.equals(this.binSize, apiNumbersCardData.binSize) &&
        Objects.equals(this.timestamp, apiNumbersCardData.timestamp) &&
        Objects.equals(this.numberOfDataPoints, apiNumbersCardData.numberOfDataPoints) &&
        Objects.equals(this.value, apiNumbersCardData.value) &&
        Objects.equals(this.status, apiNumbersCardData.status) &&
        Objects.equals(this.alertSuppressionWindows, apiNumbersCardData.alertSuppressionWindows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardId, startDate, endDate, previousValue, binSize, timestamp, numberOfDataPoints, value, status, alertSuppressionWindows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiNumbersCardData {\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    previousValue: ").append(toIndentedString(previousValue)).append("\n");
    sb.append("    binSize: ").append(toIndentedString(binSize)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    numberOfDataPoints: ").append(toIndentedString(numberOfDataPoints)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    alertSuppressionWindows: ").append(toIndentedString(alertSuppressionWindows)).append("\n");
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

