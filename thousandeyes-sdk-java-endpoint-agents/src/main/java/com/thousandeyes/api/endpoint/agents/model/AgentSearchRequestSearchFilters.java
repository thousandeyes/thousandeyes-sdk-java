/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.   For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.agents.model.Platform;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AgentSearchRequestSearchFilters
 */
@JsonPropertyOrder({
  AgentSearchRequestSearchFilters.JSON_PROPERTY_ID,
  AgentSearchRequestSearchFilters.JSON_PROPERTY_AGENT_NAME,
  AgentSearchRequestSearchFilters.JSON_PROPERTY_COMPUTER_NAME,
  AgentSearchRequestSearchFilters.JSON_PROPERTY_USERNAME,
  AgentSearchRequestSearchFilters.JSON_PROPERTY_PLATFORM,
  AgentSearchRequestSearchFilters.JSON_PROPERTY_OS_VERSION,
  AgentSearchRequestSearchFilters.JSON_PROPERTY_LOCATION_COUNTRY_I_S_O,
  AgentSearchRequestSearchFilters.JSON_PROPERTY_LOCATION_SUBDIVISION1_CODE,
  AgentSearchRequestSearchFilters.JSON_PROPERTY_LOCATION_CITY
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T16:57:45.059460+01:00[Europe/Lisbon]")
public class AgentSearchRequestSearchFilters {
  public static final String JSON_PROPERTY_ID = "id";
  private List<UUID> id = new ArrayList<>();

  public static final String JSON_PROPERTY_AGENT_NAME = "agentName";
  private List<String> agentName = new ArrayList<>();

  public static final String JSON_PROPERTY_COMPUTER_NAME = "computerName";
  private List<String> computerName = new ArrayList<>();

  public static final String JSON_PROPERTY_USERNAME = "username";
  private List<String> username = new ArrayList<>();

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private List<Platform> platform = new ArrayList<>();

  public static final String JSON_PROPERTY_OS_VERSION = "osVersion";
  private List<String> osVersion = new ArrayList<>();

  public static final String JSON_PROPERTY_LOCATION_COUNTRY_I_S_O = "locationCountryISO";
  private List<String> locationCountryISO = new ArrayList<>();

  public static final String JSON_PROPERTY_LOCATION_SUBDIVISION1_CODE = "locationSubdivision1Code";
  private List<String> locationSubdivision1Code = new ArrayList<>();

  public static final String JSON_PROPERTY_LOCATION_CITY = "locationCity";
  private List<String> locationCity = new ArrayList<>();

  public AgentSearchRequestSearchFilters() { 
  }

  public AgentSearchRequestSearchFilters id(List<UUID> id) {
    this.id = id;
    return this;
  }

  public AgentSearchRequestSearchFilters addidItem(UUID idItem) {
    if (this.id == null) {
      this.id = new ArrayList<>();
    }
    this.id.add(idItem);
    return this;
  }

   /**
   * Returns only agents that are an exact match of the provided identifiers.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(List<UUID> id) {
    this.id = id;
  }


  public AgentSearchRequestSearchFilters agentName(List<String> agentName) {
    this.agentName = agentName;
    return this;
  }

  public AgentSearchRequestSearchFilters addagentNameItem(String agentNameItem) {
    if (this.agentName == null) {
      this.agentName = new ArrayList<>();
    }
    this.agentName.add(agentNameItem);
    return this;
  }

   /**
   * Returns only agents with the given name.  This is an exact match only. 
   * @return agentName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAgentName() {
    return agentName;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentName(List<String> agentName) {
    this.agentName = agentName;
  }


  public AgentSearchRequestSearchFilters computerName(List<String> computerName) {
    this.computerName = computerName;
    return this;
  }

  public AgentSearchRequestSearchFilters addcomputerNameItem(String computerNameItem) {
    if (this.computerName == null) {
      this.computerName = new ArrayList<>();
    }
    this.computerName.add(computerNameItem);
    return this;
  }

   /**
   * Returns only agents with the given computer name. This is an exact match only. 
   * @return computerName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getComputerName() {
    return computerName;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComputerName(List<String> computerName) {
    this.computerName = computerName;
  }


  public AgentSearchRequestSearchFilters username(List<String> username) {
    this.username = username;
    return this;
  }

  public AgentSearchRequestSearchFilters addusernameItem(String usernameItem) {
    if (this.username == null) {
      this.username = new ArrayList<>();
    }
    this.username.add(usernameItem);
    return this;
  }

   /**
   * Returns only agents that have at least one user with a name. starting with the provided string. This is a case-insensitive prefix match. 
   * @return username
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(List<String> username) {
    this.username = username;
  }


  public AgentSearchRequestSearchFilters platform(List<Platform> platform) {
    this.platform = platform;
    return this;
  }

  public AgentSearchRequestSearchFilters addplatformItem(Platform platformItem) {
    if (this.platform == null) {
      this.platform = new ArrayList<>();
    }
    this.platform.add(platformItem);
    return this;
  }

   /**
   * Filter on the platform on which the agent is running. 
   * @return platform
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Platform> getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatform(List<Platform> platform) {
    this.platform = platform;
  }


  public AgentSearchRequestSearchFilters osVersion(List<String> osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  public AgentSearchRequestSearchFilters addosVersionItem(String osVersionItem) {
    if (this.osVersion == null) {
      this.osVersion = new ArrayList<>();
    }
    this.osVersion.add(osVersionItem);
    return this;
  }

   /**
   * Case-insensitive prefix filter on the OS version.
   * @return osVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getOsVersion() {
    return osVersion;
  }


  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOsVersion(List<String> osVersion) {
    this.osVersion = osVersion;
  }


  public AgentSearchRequestSearchFilters locationCountryISO(List<String> locationCountryISO) {
    this.locationCountryISO = locationCountryISO;
    return this;
  }

  public AgentSearchRequestSearchFilters addlocationCountryISOItem(String locationCountryISOItem) {
    if (this.locationCountryISO == null) {
      this.locationCountryISO = new ArrayList<>();
    }
    this.locationCountryISO.add(locationCountryISOItem);
    return this;
  }

   /**
   * Filter using the ISO country code of the location. 
   * @return locationCountryISO
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION_COUNTRY_I_S_O)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLocationCountryISO() {
    return locationCountryISO;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION_COUNTRY_I_S_O)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocationCountryISO(List<String> locationCountryISO) {
    this.locationCountryISO = locationCountryISO;
  }


  public AgentSearchRequestSearchFilters locationSubdivision1Code(List<String> locationSubdivision1Code) {
    this.locationSubdivision1Code = locationSubdivision1Code;
    return this;
  }

  public AgentSearchRequestSearchFilters addlocationSubdivision1CodeItem(String locationSubdivision1CodeItem) {
    if (this.locationSubdivision1Code == null) {
      this.locationSubdivision1Code = new ArrayList<>();
    }
    this.locationSubdivision1Code.add(locationSubdivision1CodeItem);
    return this;
  }

   /**
   * Filter using the code for the first level administrative division within  the country. In US/Canada this is the State, in UK it&#39;s the country e.g. &#x60;ENG&#x60; 
   * @return locationSubdivision1Code
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION_SUBDIVISION1_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLocationSubdivision1Code() {
    return locationSubdivision1Code;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION_SUBDIVISION1_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocationSubdivision1Code(List<String> locationSubdivision1Code) {
    this.locationSubdivision1Code = locationSubdivision1Code;
  }


  public AgentSearchRequestSearchFilters locationCity(List<String> locationCity) {
    this.locationCity = locationCity;
    return this;
  }

  public AgentSearchRequestSearchFilters addlocationCityItem(String locationCityItem) {
    if (this.locationCity == null) {
      this.locationCity = new ArrayList<>();
    }
    this.locationCity.add(locationCityItem);
    return this;
  }

   /**
   * This is a prefix match on the city name field. The endpoint expects this to contain the  name of the city in English. e.g. &#39;Paris&#39; or &#39;&#39; 
   * @return locationCity
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLocationCity() {
    return locationCity;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocationCity(List<String> locationCity) {
    this.locationCity = locationCity;
  }


  /**
   * Return true if this AgentSearchRequest_searchFilters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentSearchRequestSearchFilters agentSearchRequestSearchFilters = (AgentSearchRequestSearchFilters) o;
    return Objects.equals(this.id, agentSearchRequestSearchFilters.id) &&
        Objects.equals(this.agentName, agentSearchRequestSearchFilters.agentName) &&
        Objects.equals(this.computerName, agentSearchRequestSearchFilters.computerName) &&
        Objects.equals(this.username, agentSearchRequestSearchFilters.username) &&
        Objects.equals(this.platform, agentSearchRequestSearchFilters.platform) &&
        Objects.equals(this.osVersion, agentSearchRequestSearchFilters.osVersion) &&
        Objects.equals(this.locationCountryISO, agentSearchRequestSearchFilters.locationCountryISO) &&
        Objects.equals(this.locationSubdivision1Code, agentSearchRequestSearchFilters.locationSubdivision1Code) &&
        Objects.equals(this.locationCity, agentSearchRequestSearchFilters.locationCity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, agentName, computerName, username, platform, osVersion, locationCountryISO, locationSubdivision1Code, locationCity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentSearchRequestSearchFilters {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    locationCountryISO: ").append(toIndentedString(locationCountryISO)).append("\n");
    sb.append("    locationSubdivision1Code: ").append(toIndentedString(locationSubdivision1Code)).append("\n");
    sb.append("    locationCity: ").append(toIndentedString(locationCity)).append("\n");
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

