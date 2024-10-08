/*
 * Event Detection API
 *  Event detection occurs when ThousandEyes identifies that error signals related to a component (proxy, network node, AS, server etc) have deviated from the baselines established by events. * To determine this, ThousandEyes takes the test results from all accounts groups within an organization, and analyzes that data. * Noisy test results (those that have too many errors in a short window) are removed until they stabilize, and the rest of the results are tagged with the components associated with that test result (for example, proxy, network, or server). * Next, any increase in failures from the test results and each component helps in determining the problem domain and which component may be at fault. * When this failure rate increases beyond a pre-defined threshold (set by the algorithm), an event is triggered and an email notification is sent to the user (if they've enabled email alerts).  With the Events API, you can perform the following tasks on the ThousandEyes platform: * **Retrieve Events**: Obtain a list of events and detailed information for each event. For more information about events, see [Event Detection](https://docs.thousandeyes.com/product-documentation/event-detection). 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.event.detection.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.thousandeyes.sdk.event.detection.model.ApiAffectedTarget;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AffectedTargets
 */
@JsonPropertyOrder({
  AffectedTargets.JSON_PROPERTY_TOTAL,
  AffectedTargets.JSON_PROPERTY_IN_ACCOUNT_GROUP,
  AffectedTargets.JSON_PROPERTY_TARGETS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class AffectedTargets {
  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_IN_ACCOUNT_GROUP = "inAccountGroup";
  private Integer inAccountGroup;

  public static final String JSON_PROPERTY_TARGETS = "targets";
  private Set<ApiAffectedTarget> targets = new LinkedHashSet<>();

  public AffectedTargets() { 
  }

  @JsonCreator
  public AffectedTargets(
    @JsonProperty(JSON_PROPERTY_TOTAL) Integer total, 
    @JsonProperty(JSON_PROPERTY_IN_ACCOUNT_GROUP) Integer inAccountGroup
  ) {
  this();
    this.total = total;
    this.inAccountGroup = inAccountGroup;
  }

   /**
   * The total number affected.
   * @return total
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotal() {
    return total;
  }




   /**
   * Indicates if in the affected account group.
   * @return inAccountGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IN_ACCOUNT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInAccountGroup() {
    return inAccountGroup;
  }




  public AffectedTargets targets(Set<ApiAffectedTarget> targets) {
    this.targets = targets;
    return this;
  }

  public AffectedTargets addTargetsItem(ApiAffectedTarget targetsItem) {
    if (this.targets == null) {
      this.targets = new LinkedHashSet<>();
    }
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * List of affected targets.
   * @return targets
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ApiAffectedTarget> getTargets() {
    return targets;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargets(Set<ApiAffectedTarget> targets) {
    this.targets = targets;
  }


  /**
   * Return true if this AffectedTargets object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AffectedTargets affectedTargets = (AffectedTargets) o;
    return Objects.equals(this.total, affectedTargets.total) &&
        Objects.equals(this.inAccountGroup, affectedTargets.inAccountGroup) &&
        Objects.equals(this.targets, affectedTargets.targets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, inAccountGroup, targets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AffectedTargets {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    inAccountGroup: ").append(toIndentedString(inAccountGroup)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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

