/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.tests.results.model.PathVisHop;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PathVisRoute
 */
@JsonPropertyOrder({
  PathVisRoute.JSON_PROPERTY_PATH_ID,
  PathVisRoute.JSON_PROPERTY_HOPS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class PathVisRoute {
  public static final String JSON_PROPERTY_PATH_ID = "pathId";
  private String pathId;

  public static final String JSON_PROPERTY_HOPS = "hops";
  private List<PathVisHop> hops = new ArrayList<>();

  public PathVisRoute() { 
  }

  @JsonCreator
  public PathVisRoute(
    @JsonProperty(JSON_PROPERTY_PATH_ID) String pathId
  ) {
  this();
    this.pathId = pathId;
  }

   /**
   * Unique ID of path trace.
   * @return pathId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPathId() {
    return pathId;
  }




  public PathVisRoute hops(List<PathVisHop> hops) {
    this.hops = hops;
    return this;
  }

  public PathVisRoute addHopsItem(PathVisHop hopsItem) {
    if (this.hops == null) {
      this.hops = new ArrayList<>();
    }
    this.hops.add(hopsItem);
    return this;
  }

   /**
   * Array of hop objects indicating each step in the traceroute.
   * @return hops
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PathVisHop> getHops() {
    return hops;
  }


  @JsonProperty(JSON_PROPERTY_HOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHops(List<PathVisHop> hops) {
    this.hops = hops;
  }


  /**
   * Return true if this PathVisRoute object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathVisRoute pathVisRoute = (PathVisRoute) o;
    return Objects.equals(this.pathId, pathVisRoute.pathId) &&
        Objects.equals(this.hops, pathVisRoute.hops);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathId, hops);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathVisRoute {\n");
    sb.append("    pathId: ").append(toIndentedString(pathId)).append("\n");
    sb.append("    hops: ").append(toIndentedString(hops)).append("\n");
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

