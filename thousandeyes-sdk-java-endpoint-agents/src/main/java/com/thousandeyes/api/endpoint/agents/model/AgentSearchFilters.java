/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.   For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).
 *
 * The version of the OpenAPI document: 7.0.4
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
import com.thousandeyes.api.endpoint.agents.model.AgentLicenseType;
import com.thousandeyes.api.endpoint.agents.model.Platform;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AgentSearchFilters
 */
@JsonPropertyOrder({
  AgentSearchFilters.JSON_PROPERTY_ID,
  AgentSearchFilters.JSON_PROPERTY_AGENT_NAME,
  AgentSearchFilters.JSON_PROPERTY_COMPUTER_NAME,
  AgentSearchFilters.JSON_PROPERTY_USERNAME,
  AgentSearchFilters.JSON_PROPERTY_PLATFORM,
  AgentSearchFilters.JSON_PROPERTY_OS_VERSION,
  AgentSearchFilters.JSON_PROPERTY_LOCATION_COUNTRY_I_S_O,
  AgentSearchFilters.JSON_PROPERTY_LOCATION_SUBDIVISION1_CODE,
  AgentSearchFilters.JSON_PROPERTY_LOCATION_CITY,
  AgentSearchFilters.JSON_PROPERTY_LICENSE_TYPE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class AgentSearchFilters {
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

  public static final String JSON_PROPERTY_LICENSE_TYPE = "licenseType";
  private List<AgentLicenseType> licenseType = new ArrayList<>();

  public AgentSearchFilters() { 
  }

  public AgentSearchFilters id(List<UUID> id) {
    this.id = id;
    return this;
  }

  public AgentSearchFilters addIdItem(UUID idItem) {
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


  public AgentSearchFilters agentName(List<String> agentName) {
    this.agentName = agentName;
    return this;
  }

  public AgentSearchFilters addAgentNameItem(String agentNameItem) {
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


  public AgentSearchFilters computerName(List<String> computerName) {
    this.computerName = computerName;
    return this;
  }

  public AgentSearchFilters addComputerNameItem(String computerNameItem) {
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


  public AgentSearchFilters username(List<String> username) {
    this.username = username;
    return this;
  }

  public AgentSearchFilters addUsernameItem(String usernameItem) {
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


  public AgentSearchFilters platform(List<Platform> platform) {
    this.platform = platform;
    return this;
  }

  public AgentSearchFilters addPlatformItem(Platform platformItem) {
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


  public AgentSearchFilters osVersion(List<String> osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  public AgentSearchFilters addOsVersionItem(String osVersionItem) {
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


  public AgentSearchFilters locationCountryISO(List<String> locationCountryISO) {
    this.locationCountryISO = locationCountryISO;
    return this;
  }

  public AgentSearchFilters addLocationCountryISOItem(String locationCountryISOItem) {
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


  public AgentSearchFilters locationSubdivision1Code(List<String> locationSubdivision1Code) {
    this.locationSubdivision1Code = locationSubdivision1Code;
    return this;
  }

  public AgentSearchFilters addLocationSubdivision1CodeItem(String locationSubdivision1CodeItem) {
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


  public AgentSearchFilters locationCity(List<String> locationCity) {
    this.locationCity = locationCity;
    return this;
  }

  public AgentSearchFilters addLocationCityItem(String locationCityItem) {
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


  public AgentSearchFilters licenseType(List<AgentLicenseType> licenseType) {
    this.licenseType = licenseType;
    return this;
  }

  public AgentSearchFilters addLicenseTypeItem(AgentLicenseType licenseTypeItem) {
    if (this.licenseType == null) {
      this.licenseType = new ArrayList<>();
    }
    this.licenseType.add(licenseTypeItem);
    return this;
  }

   /**
   * Filter on the agent&#39;s license type 
   * @return licenseType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LICENSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AgentLicenseType> getLicenseType() {
    return licenseType;
  }


  @JsonProperty(JSON_PROPERTY_LICENSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLicenseType(List<AgentLicenseType> licenseType) {
    this.licenseType = licenseType;
  }


  /**
   * Return true if this AgentSearchFilters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentSearchFilters agentSearchFilters = (AgentSearchFilters) o;
    return Objects.equals(this.id, agentSearchFilters.id) &&
        Objects.equals(this.agentName, agentSearchFilters.agentName) &&
        Objects.equals(this.computerName, agentSearchFilters.computerName) &&
        Objects.equals(this.username, agentSearchFilters.username) &&
        Objects.equals(this.platform, agentSearchFilters.platform) &&
        Objects.equals(this.osVersion, agentSearchFilters.osVersion) &&
        Objects.equals(this.locationCountryISO, agentSearchFilters.locationCountryISO) &&
        Objects.equals(this.locationSubdivision1Code, agentSearchFilters.locationSubdivision1Code) &&
        Objects.equals(this.locationCity, agentSearchFilters.locationCity) &&
        Objects.equals(this.licenseType, agentSearchFilters.licenseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, agentName, computerName, username, platform, osVersion, locationCountryISO, locationSubdivision1Code, locationCity, licenseType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentSearchFilters {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    locationCountryISO: ").append(toIndentedString(locationCountryISO)).append("\n");
    sb.append("    locationSubdivision1Code: ").append(toIndentedString(locationSubdivision1Code)).append("\n");
    sb.append("    locationCity: ").append(toIndentedString(locationCity)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
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

