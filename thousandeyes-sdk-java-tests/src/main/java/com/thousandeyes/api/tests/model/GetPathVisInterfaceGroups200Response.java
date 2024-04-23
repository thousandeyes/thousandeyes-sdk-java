/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.tests.model.InterfaceGroup;
import com.thousandeyes.api.tests.model.SelfLinksLinks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetPathVisInterfaceGroups200Response
 */
@JsonPropertyOrder({
  GetPathVisInterfaceGroups200Response.JSON_PROPERTY_PATH_VIS_INTERFACE_GROUPS,
  GetPathVisInterfaceGroups200Response.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T17:12:32.734520+01:00[Europe/Lisbon]")
public class GetPathVisInterfaceGroups200Response {
  public static final String JSON_PROPERTY_PATH_VIS_INTERFACE_GROUPS = "pathVisInterfaceGroups";
  private List<InterfaceGroup> pathVisInterfaceGroups = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public GetPathVisInterfaceGroups200Response() { 
  }

  public GetPathVisInterfaceGroups200Response pathVisInterfaceGroups(List<InterfaceGroup> pathVisInterfaceGroups) {
    this.pathVisInterfaceGroups = pathVisInterfaceGroups;
    return this;
  }

  public GetPathVisInterfaceGroups200Response addPathVisInterfaceGroupsItem(InterfaceGroup pathVisInterfaceGroupsItem) {
    if (this.pathVisInterfaceGroups == null) {
      this.pathVisInterfaceGroups = new ArrayList<>();
    }
    this.pathVisInterfaceGroups.add(pathVisInterfaceGroupsItem);
    return this;
  }

   /**
   * Get pathVisInterfaceGroups
   * @return pathVisInterfaceGroups
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_VIS_INTERFACE_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InterfaceGroup> getPathVisInterfaceGroups() {
    return pathVisInterfaceGroups;
  }


  @JsonProperty(JSON_PROPERTY_PATH_VIS_INTERFACE_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPathVisInterfaceGroups(List<InterfaceGroup> pathVisInterfaceGroups) {
    this.pathVisInterfaceGroups = pathVisInterfaceGroups;
  }


  public GetPathVisInterfaceGroups200Response links(SelfLinksLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SelfLinksLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }


  /**
   * Return true if this getPathVisInterfaceGroups_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPathVisInterfaceGroups200Response getPathVisInterfaceGroups200Response = (GetPathVisInterfaceGroups200Response) o;
    return Objects.equals(this.pathVisInterfaceGroups, getPathVisInterfaceGroups200Response.pathVisInterfaceGroups) &&
        Objects.equals(this.links, getPathVisInterfaceGroups200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathVisInterfaceGroups, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPathVisInterfaceGroups200Response {\n");
    sb.append("    pathVisInterfaceGroups: ").append(toIndentedString(pathVisInterfaceGroups)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

