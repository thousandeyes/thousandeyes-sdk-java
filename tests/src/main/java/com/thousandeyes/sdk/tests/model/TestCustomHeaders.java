/*
 * Tests API
 * This API allows you to list, create, edit, and delete Network and Application Synthetics tests. 
 *
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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TestCustomHeaders
 */
@JsonPropertyOrder({
  TestCustomHeaders.JSON_PROPERTY_ROOT,
  TestCustomHeaders.JSON_PROPERTY_DOMAINS,
  TestCustomHeaders.JSON_PROPERTY_ALL
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class TestCustomHeaders {
  public static final String JSON_PROPERTY_ROOT = "root";
  private Map<String, String> root = new HashMap<>();

  public static final String JSON_PROPERTY_DOMAINS = "domains";
  private Map<String, Map<String, String>> domains = new HashMap<>();

  public static final String JSON_PROPERTY_ALL = "all";
  private Map<String, String> all = new HashMap<>();

  public TestCustomHeaders() { 
  }

  public TestCustomHeaders root(Map<String, String> root) {
    this.root = root;
    return this;
  }

  public TestCustomHeaders putRootItem(String key, String rootItem) {
    if (this.root == null) {
      this.root = new HashMap<>();
    }
    this.root.put(key, rootItem);
    return this;
  }

   /**
   * Use these HTTP headers for root server request.
   * @return root
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getRoot() {
    return root;
  }


  @JsonProperty(JSON_PROPERTY_ROOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoot(Map<String, String> root) {
    this.root = root;
  }


  public TestCustomHeaders domains(Map<String, Map<String, String>> domains) {
    this.domains = domains;
    return this;
  }

  public TestCustomHeaders putDomainsItem(String key, Map<String, String> domainsItem) {
    if (this.domains == null) {
      this.domains = new HashMap<>();
    }
    this.domains.put(key, domainsItem);
    return this;
  }

   /**
   * Use these HTTP headers for the specified domains.
   * @return domains
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Map<String, String>> getDomains() {
    return domains;
  }


  @JsonProperty(JSON_PROPERTY_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomains(Map<String, Map<String, String>> domains) {
    this.domains = domains;
  }


  public TestCustomHeaders all(Map<String, String> all) {
    this.all = all;
    return this;
  }

  public TestCustomHeaders putAllItem(String key, String allItem) {
    if (this.all == null) {
      this.all = new HashMap<>();
    }
    this.all.put(key, allItem);
    return this;
  }

   /**
   * Use these HTTP headers for all domains.
   * @return all
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getAll() {
    return all;
  }


  @JsonProperty(JSON_PROPERTY_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAll(Map<String, String> all) {
    this.all = all;
  }


  /**
   * Return true if this TestCustomHeaders object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestCustomHeaders testCustomHeaders = (TestCustomHeaders) o;
    return Objects.equals(this.root, testCustomHeaders.root) &&
        Objects.equals(this.domains, testCustomHeaders.domains) &&
        Objects.equals(this.all, testCustomHeaders.all);
  }

  @Override
  public int hashCode() {
    return Objects.hash(root, domains, all);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestCustomHeaders {\n");
    sb.append("    root: ").append(toIndentedString(root)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
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

