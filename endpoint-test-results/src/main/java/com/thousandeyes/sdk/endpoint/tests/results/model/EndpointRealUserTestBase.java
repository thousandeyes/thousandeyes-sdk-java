/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointRealUserTestBase
 */
@JsonPropertyOrder({
  EndpointRealUserTestBase.JSON_PROPERTY_AGENT_ID,
  EndpointRealUserTestBase.JSON_PROPERTY_COMMITTED,
  EndpointRealUserTestBase.JSON_PROPERTY_DATE,
  EndpointRealUserTestBase.JSON_PROPERTY_EXPERIENCE_SCORE,
  EndpointRealUserTestBase.JSON_PROPERTY_NUMBER_OF_PAGES,
  EndpointRealUserTestBase.JSON_PROPERTY_ORGANIZATION_NAME,
  EndpointRealUserTestBase.JSON_PROPERTY_PORT,
  EndpointRealUserTestBase.JSON_PROPERTY_PROTOCOL,
  EndpointRealUserTestBase.JSON_PROPERTY_ROUND_ID,
  EndpointRealUserTestBase.JSON_PROPERTY_SOURCE_ADDRESS,
  EndpointRealUserTestBase.JSON_PROPERTY_ID,
  EndpointRealUserTestBase.JSON_PROPERTY_VISITED_SITE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EndpointRealUserTestBase {
  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private UUID agentId;

  public static final String JSON_PROPERTY_COMMITTED = "committed";
  private OffsetDateTime committed;

  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_EXPERIENCE_SCORE = "experienceScore";
  private Double experienceScore;

  public static final String JSON_PROPERTY_NUMBER_OF_PAGES = "numberOfPages";
  private Integer numberOfPages;

  public static final String JSON_PROPERTY_ORGANIZATION_NAME = "organizationName";
  private String organizationName;

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private String protocol;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_SOURCE_ADDRESS = "sourceAddress";
  private String sourceAddress;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VISITED_SITE = "visitedSite";
  private String visitedSite;

  public EndpointRealUserTestBase() { 
  }

  @JsonCreator
  public EndpointRealUserTestBase(
    @JsonProperty(JSON_PROPERTY_AGENT_ID) UUID agentId, 
    @JsonProperty(JSON_PROPERTY_COMMITTED) OffsetDateTime committed, 
    @JsonProperty(JSON_PROPERTY_DATE) OffsetDateTime date, 
    @JsonProperty(JSON_PROPERTY_EXPERIENCE_SCORE) Double experienceScore, 
    @JsonProperty(JSON_PROPERTY_NUMBER_OF_PAGES) Integer numberOfPages, 
    @JsonProperty(JSON_PROPERTY_ORGANIZATION_NAME) String organizationName, 
    @JsonProperty(JSON_PROPERTY_PORT) Integer port, 
    @JsonProperty(JSON_PROPERTY_PROTOCOL) String protocol, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId, 
    @JsonProperty(JSON_PROPERTY_SOURCE_ADDRESS) String sourceAddress, 
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_VISITED_SITE) String visitedSite
  ) {
  this();
    this.agentId = agentId;
    this.committed = committed;
    this.date = date;
    this.experienceScore = experienceScore;
    this.numberOfPages = numberOfPages;
    this.organizationName = organizationName;
    this.port = port;
    this.protocol = protocol;
    this.roundId = roundId;
    this.sourceAddress = sourceAddress;
    this.id = id;
    this.visitedSite = visitedSite;
  }

   /**
   * Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint.
   * @return agentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getAgentId() {
    return agentId;
  }




   /**
   * UTC date when endpoint real user test was committed to the controller (ISO date-time format).
   * @return committed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCommitted() {
    return committed;
  }




   /**
   * UTC date when endpoint real user test took place (ISO date-time format).
   * @return date
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDate() {
    return date;
  }




   /**
   * Score rating a user’s experience when loading a particular page, from 0 (the worst) to 1 (the best). [More details](https://docs.thousandeyes.com/product-documentation/end-user-monitoring/viewing-data/endpoint-agent-views-reference#user-experience-score).
   * minimum: 0
   * maximum: 1.0
   * @return experienceScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPERIENCE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getExperienceScore() {
    return experienceScore;
  }




   /**
   * Number of web pages visited on target website.
   * @return numberOfPages
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfPages() {
    return numberOfPages;
  }




   /**
   * Name of the AS organization &#x60;sourceAddress&#x60; belongs to.
   * @return organizationName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrganizationName() {
    return organizationName;
  }




   /**
   * Port used to visit target website.
   * @return port
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPort() {
    return port;
  }




   /**
   * Protocol used to visit target website.
   * @return protocol
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProtocol() {
    return protocol;
  }




   /**
   * Epoch time (seconds) indicating the start time of the round.
   * @return roundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoundId() {
    return roundId;
  }




   /**
   * Public IP address of the endpoint agent during the session.
   * @return sourceAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceAddress() {
    return sourceAddress;
  }




   /**
   * Endpoint real user test ID. Each endpoint real user test occurrence has a unique ID.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * Domain used to visit target website.
   * @return visitedSite
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISITED_SITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVisitedSite() {
    return visitedSite;
  }




  /**
   * Return true if this EndpointRealUserTestBase object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointRealUserTestBase endpointRealUserTestBase = (EndpointRealUserTestBase) o;
    return Objects.equals(this.agentId, endpointRealUserTestBase.agentId) &&
        Objects.equals(this.committed, endpointRealUserTestBase.committed) &&
        Objects.equals(this.date, endpointRealUserTestBase.date) &&
        Objects.equals(this.experienceScore, endpointRealUserTestBase.experienceScore) &&
        Objects.equals(this.numberOfPages, endpointRealUserTestBase.numberOfPages) &&
        Objects.equals(this.organizationName, endpointRealUserTestBase.organizationName) &&
        Objects.equals(this.port, endpointRealUserTestBase.port) &&
        Objects.equals(this.protocol, endpointRealUserTestBase.protocol) &&
        Objects.equals(this.roundId, endpointRealUserTestBase.roundId) &&
        Objects.equals(this.sourceAddress, endpointRealUserTestBase.sourceAddress) &&
        Objects.equals(this.id, endpointRealUserTestBase.id) &&
        Objects.equals(this.visitedSite, endpointRealUserTestBase.visitedSite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, committed, date, experienceScore, numberOfPages, organizationName, port, protocol, roundId, sourceAddress, id, visitedSite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointRealUserTestBase {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    committed: ").append(toIndentedString(committed)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    experienceScore: ").append(toIndentedString(experienceScore)).append("\n");
    sb.append("    numberOfPages: ").append(toIndentedString(numberOfPages)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    sourceAddress: ").append(toIndentedString(sourceAddress)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    visitedSite: ").append(toIndentedString(visitedSite)).append("\n");
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

