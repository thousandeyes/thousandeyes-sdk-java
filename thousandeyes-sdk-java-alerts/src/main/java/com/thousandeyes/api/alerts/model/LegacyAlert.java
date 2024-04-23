/*
 * Alerts API
 * You can manage the following alert functionalities on the ThousandEyes platform using the Alerts API:  * **Alerts**: Retrieve alert details. Alerts are assigned to tests through alert rules.  * **Alert Rules**: Conditions that you configure in order to highlight or be notified of events of interest in your ThousandEyes tests. When an alert rule’s conditions are met, the associated alert is triggered and the alert becomes active. It remains active until the alert is cleared. Alert rules are reusable across multiple tests..  * **Alert Suppression Windows**: Suppress alerts for tests during periods such as planned maintenance. Windows can be one-time events or recurring events to handle periodic occurrences such as monthly downtime for maintenance.  For more information about the alerts, see [Alerts](https://docs.thousandeyes.com/product-documentation/alerts). 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.alerts.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LegacyAlert
 * @deprecated
 */
@Deprecated
@JsonPropertyOrder({
  LegacyAlert.JSON_PROPERTY_ALERT_ID,
  LegacyAlert.JSON_PROPERTY_DATE_START,
  LegacyAlert.JSON_PROPERTY_DATE_END,
  LegacyAlert.JSON_PROPERTY_RULE_ID,
  LegacyAlert.JSON_PROPERTY_STATE,
  LegacyAlert.JSON_PROPERTY_SEVERITY,
  LegacyAlert.JSON_PROPERTY_PERMALINK,
  LegacyAlert.JSON_PROPERTY_API_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T16:57:45.250800+01:00[Europe/Lisbon]")
public class LegacyAlert {
  public static final String JSON_PROPERTY_ALERT_ID = "alertId";
  private UUID alertId;

  public static final String JSON_PROPERTY_DATE_START = "dateStart";
  private String dateStart;

  public static final String JSON_PROPERTY_DATE_END = "dateEnd";
  private String dateEnd;

  public static final String JSON_PROPERTY_RULE_ID = "ruleId";
  private Integer ruleId;

  /**
   * Current state of the alert. Possible values: clear or trigger.
   */
  public enum StateEnum {
    ACTIVE("ACTIVE"),
    
    CLEARED("CLEARED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATE = "state";
  private StateEnum state;

  /**
   * The severity of the alert.
   */
  public enum SeverityEnum {
    INFO("INFO"),
    
    MAJOR("MAJOR"),
    
    MINOR("MINOR"),
    
    CRITICAL("CRITICAL"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private SeverityEnum severity;

  public static final String JSON_PROPERTY_PERMALINK = "permalink";
  private String permalink;

  public static final String JSON_PROPERTY_API_LINKS = "apiLinks";
  private List<Map<String, Object>> apiLinks = new ArrayList<>();

  public LegacyAlert() { 
  }

  @JsonCreator
  public LegacyAlert(
    @JsonProperty(JSON_PROPERTY_ALERT_ID) UUID alertId, 
    @JsonProperty(JSON_PROPERTY_DATE_START) String dateStart, 
    @JsonProperty(JSON_PROPERTY_DATE_END) String dateEnd, 
    @JsonProperty(JSON_PROPERTY_RULE_ID) Integer ruleId, 
    @JsonProperty(JSON_PROPERTY_STATE) StateEnum state
  ) {
  this();
    this.alertId = alertId;
    this.dateStart = dateStart;
    this.dateEnd = dateEnd;
    this.ruleId = ruleId;
    this.state = state;
  }

   /**
   * A unique ID for each individual alert occurrence.
   * @return alertId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getAlertId() {
    return alertId;
  }




   /**
   * The start date and time for querying alerts.
   * @return dateStart
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateStart() {
    return dateStart;
  }




   /**
   * The end date and time for querying alerts.
   * @return dateEnd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateEnd() {
    return dateEnd;
  }




   /**
   * Unique ID of the rule.
   * @return ruleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRuleId() {
    return ruleId;
  }




   /**
   * Current state of the alert. Possible values: clear or trigger.
   * @return state
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StateEnum getState() {
    return state;
  }




  public LegacyAlert severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

   /**
   * The severity of the alert.
   * @return severity
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SeverityEnum getSeverity() {
    return severity;
  }


  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }


  public LegacyAlert permalink(String permalink) {
    this.permalink = permalink;
    return this;
  }

   /**
   * Hyperlink to alerts list, with row expanded
   * @return permalink
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERMALINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPermalink() {
    return permalink;
  }


  @JsonProperty(JSON_PROPERTY_PERMALINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermalink(String permalink) {
    this.permalink = permalink;
  }


  public LegacyAlert apiLinks(List<Map<String, Object>> apiLinks) {
    this.apiLinks = apiLinks;
    return this;
  }

  public LegacyAlert addapiLinksItem(Map<String, Object> apiLinksItem) {
    if (this.apiLinks == null) {
      this.apiLinks = new ArrayList<>();
    }
    this.apiLinks.add(apiLinksItem);
    return this;
  }

   /**
   * List of hyperlinks to other areas of the API
   * @return apiLinks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Map<String, Object>> getApiLinks() {
    return apiLinks;
  }


  @JsonProperty(JSON_PROPERTY_API_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiLinks(List<Map<String, Object>> apiLinks) {
    this.apiLinks = apiLinks;
  }


  /**
   * Return true if this LegacyAlert object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacyAlert legacyAlert = (LegacyAlert) o;
    return Objects.equals(this.alertId, legacyAlert.alertId) &&
        Objects.equals(this.dateStart, legacyAlert.dateStart) &&
        Objects.equals(this.dateEnd, legacyAlert.dateEnd) &&
        Objects.equals(this.ruleId, legacyAlert.ruleId) &&
        Objects.equals(this.state, legacyAlert.state) &&
        Objects.equals(this.severity, legacyAlert.severity) &&
        Objects.equals(this.permalink, legacyAlert.permalink) &&
        Objects.equals(this.apiLinks, legacyAlert.apiLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertId, dateStart, dateEnd, ruleId, state, severity, permalink, apiLinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacyAlert {\n");
    sb.append("    alertId: ").append(toIndentedString(alertId)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    permalink: ").append(toIndentedString(permalink)).append("\n");
    sb.append("    apiLinks: ").append(toIndentedString(apiLinks)).append("\n");
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

