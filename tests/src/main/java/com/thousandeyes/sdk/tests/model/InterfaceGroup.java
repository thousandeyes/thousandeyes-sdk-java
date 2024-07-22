/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.model;

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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * InterfaceGroup
 */
@JsonPropertyOrder({
  InterfaceGroup.JSON_PROPERTY_AID,
  InterfaceGroup.JSON_PROPERTY_GROUP_ID,
  InterfaceGroup.JSON_PROPERTY_GROUP_NAME,
  InterfaceGroup.JSON_PROPERTY_IP_ADDRESSES,
  InterfaceGroup.JSON_PROPERTY_RDNS_REGEXES
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class InterfaceGroup {
  public static final String JSON_PROPERTY_AID = "aid";
  private String aid;

  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private String groupId;

  public static final String JSON_PROPERTY_GROUP_NAME = "groupName";
  private String groupName;

  public static final String JSON_PROPERTY_IP_ADDRESSES = "ipAddresses";
  private List<String> ipAddresses = new ArrayList<>();

  public static final String JSON_PROPERTY_RDNS_REGEXES = "rdnsRegexes";
  private List<String> rdnsRegexes = new ArrayList<>();

  public InterfaceGroup() { 
  }

  @JsonCreator
  public InterfaceGroup(
    @JsonProperty(JSON_PROPERTY_AID) String aid, 
    @JsonProperty(JSON_PROPERTY_GROUP_ID) String groupId, 
    @JsonProperty(JSON_PROPERTY_RDNS_REGEXES) List<String> rdnsRegexes
  ) {
  this();
    this.aid = aid;
    this.groupId = groupId;
    this.rdnsRegexes = rdnsRegexes;
  }

   /**
   * Account Group Id
   * @return aid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAid() {
    return aid;
  }




   /**
   * Group ID
   * @return groupId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupId() {
    return groupId;
  }




  public InterfaceGroup groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Name of the path visualization interface group
   * @return groupName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupName() {
    return groupName;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public InterfaceGroup ipAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public InterfaceGroup addIpAddressesItem(String ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

   /**
   * Array of IP addresses associated with the interface group
   * @return ipAddresses
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIpAddresses() {
    return ipAddresses;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }


   /**
   * Array of RDNS Regexes associated with the interface group
   * @return rdnsRegexes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RDNS_REGEXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRdnsRegexes() {
    return rdnsRegexes;
  }




  /**
   * Return true if this InterfaceGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterfaceGroup interfaceGroup = (InterfaceGroup) o;
    return Objects.equals(this.aid, interfaceGroup.aid) &&
        Objects.equals(this.groupId, interfaceGroup.groupId) &&
        Objects.equals(this.groupName, interfaceGroup.groupName) &&
        Objects.equals(this.ipAddresses, interfaceGroup.ipAddresses) &&
        Objects.equals(this.rdnsRegexes, interfaceGroup.rdnsRegexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, groupId, groupName, ipAddresses, rdnsRegexes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterfaceGroup {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    rdnsRegexes: ").append(toIndentedString(rdnsRegexes)).append("\n");
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

