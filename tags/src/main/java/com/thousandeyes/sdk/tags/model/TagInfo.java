/*
 * Tags API
 * The ThousandEyes Tags API provides a tagging system with key/value pairs. It allows you to tag assets within the ThousandEyes platform (such as agents, tests, or alert rules) with meaningful metadata. For example: `branch:sfo`, `branch:nyc`, and `team:netops`.  This feature provides:  * Support for automation. * Powerful and flexible reports/dashboards. * Support for third-party integrations.  Things to note with the ThousandEyes Tags API:  * Tags are backwards-compatible with existing labels. * Tags are separated by Tests (CEA), Agents (CEA), Endpoint Agents, Scheduled Endpoint Tests, and Reports. A single tag can only apply to one type of target object, so each tag must specify the target type of object via a `type` field. * Tags are defined in a single table so that they can be represented using a single model - `Tag`. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tags.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.tags.model.AccessType;
import com.thousandeyes.sdk.tags.model.Assignment;
import com.thousandeyes.sdk.tags.model.ObjectType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TagInfo
 */
@JsonPropertyOrder({
  TagInfo.JSON_PROPERTY_ASSIGNMENTS,
  TagInfo.JSON_PROPERTY_ACCESS_TYPE,
  TagInfo.JSON_PROPERTY_AID,
  TagInfo.JSON_PROPERTY_COLOR,
  TagInfo.JSON_PROPERTY_CREATE_DATE,
  TagInfo.JSON_PROPERTY_ICON,
  TagInfo.JSON_PROPERTY_DESCRIPTION,
  TagInfo.JSON_PROPERTY_ID,
  TagInfo.JSON_PROPERTY_KEY,
  TagInfo.JSON_PROPERTY_LEGACY_ID,
  TagInfo.JSON_PROPERTY_OBJECT_TYPE,
  TagInfo.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class TagInfo {
  public static final String JSON_PROPERTY_ASSIGNMENTS = "assignments";
  private List<Assignment> assignments = new ArrayList<>();

  public static final String JSON_PROPERTY_ACCESS_TYPE = "accessType";
  private AccessType accessType;

  public static final String JSON_PROPERTY_AID = "aid";
  private Integer aid;

  public static final String JSON_PROPERTY_COLOR = "color";
  private String color;

  public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
  private String createDate;

  public static final String JSON_PROPERTY_ICON = "icon";
  private String icon;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_LEGACY_ID = "legacyId";
  private BigDecimal legacyId;

  public static final String JSON_PROPERTY_OBJECT_TYPE = "objectType";
  private ObjectType objectType;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public TagInfo() { 
  }

  @JsonCreator
  public TagInfo(
    @JsonProperty(JSON_PROPERTY_ASSIGNMENTS) List<Assignment> assignments, 
    @JsonProperty(JSON_PROPERTY_AID) Integer aid, 
    @JsonProperty(JSON_PROPERTY_CREATE_DATE) String createDate, 
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_LEGACY_ID) BigDecimal legacyId
  ) {
  this();
    this.assignments = assignments;
    this.aid = aid;
    this.createDate = createDate;
    this.id = id;
    this.legacyId = legacyId;
  }

   /**
   * Get assignments
   * @return assignments
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Assignment> getAssignments() {
    return assignments;
  }




  public TagInfo accessType(AccessType accessType) {
    this.accessType = accessType;
    return this;
  }

   /**
   * Get accessType
   * @return accessType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccessType getAccessType() {
    return accessType;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessType(AccessType accessType) {
    this.accessType = accessType;
  }


   /**
   * The account group ID
   * @return aid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAid() {
    return aid;
  }




  public TagInfo color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Tag color
   * @return color
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColor() {
    return color;
  }


  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(String color) {
    this.color = color;
  }


   /**
   * Tag creation date
   * @return createDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreateDate() {
    return createDate;
  }




  public TagInfo icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIcon() {
    return icon;
  }


  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIcon(String icon) {
    this.icon = icon;
  }


  public TagInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The tag&#39;s description.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * The tag ID
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public TagInfo key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The tags&#39;s key
   * @return key
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


   /**
   * Get legacyId
   * @return legacyId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEGACY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLegacyId() {
    return legacyId;
  }




  public TagInfo objectType(ObjectType objectType) {
    this.objectType = objectType;
    return this;
  }

   /**
   * Get objectType
   * @return objectType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJECT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ObjectType getObjectType() {
    return objectType;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjectType(ObjectType objectType) {
    this.objectType = objectType;
  }


  public TagInfo value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The tag&#39;s value
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
   * Return true if this TagInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagInfo tagInfo = (TagInfo) o;
    return Objects.equals(this.assignments, tagInfo.assignments) &&
        Objects.equals(this.accessType, tagInfo.accessType) &&
        Objects.equals(this.aid, tagInfo.aid) &&
        Objects.equals(this.color, tagInfo.color) &&
        Objects.equals(this.createDate, tagInfo.createDate) &&
        Objects.equals(this.icon, tagInfo.icon) &&
        Objects.equals(this.description, tagInfo.description) &&
        Objects.equals(this.id, tagInfo.id) &&
        Objects.equals(this.key, tagInfo.key) &&
        Objects.equals(this.legacyId, tagInfo.legacyId) &&
        Objects.equals(this.objectType, tagInfo.objectType) &&
        Objects.equals(this.value, tagInfo.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignments, accessType, aid, color, createDate, icon, description, id, key, legacyId, objectType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagInfo {\n");
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    legacyId: ").append(toIndentedString(legacyId)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
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

