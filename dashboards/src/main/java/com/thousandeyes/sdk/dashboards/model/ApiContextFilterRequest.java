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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.thousandeyes.sdk.dashboards.model.ApiDataSourceFilters;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Request containing dashboard filter name, description and context details.
 */
@JsonPropertyOrder({
  ApiContextFilterRequest.JSON_PROPERTY_CONTEXT,
  ApiContextFilterRequest.JSON_PROPERTY_NAME,
  ApiContextFilterRequest.JSON_PROPERTY_DESCRIPTION
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiContextFilterRequest {
  public static final String JSON_PROPERTY_CONTEXT = "context";
  private Set<ApiDataSourceFilters> context = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public ApiContextFilterRequest() { 
  }

  public ApiContextFilterRequest context(Set<ApiDataSourceFilters> context) {
    this.context = context;
    return this;
  }

  public ApiContextFilterRequest addContextItem(ApiDataSourceFilters contextItem) {
    if (this.context == null) {
      this.context = new LinkedHashSet<>();
    }
    this.context.add(contextItem);
    return this;
  }

   /**
   * List of filters to be applied to a dashboard.
   * @return context
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<ApiDataSourceFilters> getContext() {
    return context;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContext(Set<ApiDataSourceFilters> context) {
    this.context = context;
  }


  public ApiContextFilterRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the dashboard filter, this must be unique.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public ApiContextFilterRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An optional description of the filter.
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
   * Return true if this ApiContextFilterRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiContextFilterRequest apiContextFilterRequest = (ApiContextFilterRequest) o;
    return Objects.equals(this.context, apiContextFilterRequest.context) &&
        Objects.equals(this.name, apiContextFilterRequest.name) &&
        Objects.equals(this.description, apiContextFilterRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiContextFilterRequest {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

