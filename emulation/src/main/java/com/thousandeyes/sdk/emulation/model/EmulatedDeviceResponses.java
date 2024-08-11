/*
 * Emulation API
 * The Emulation API facilitates the retrieval of user-agent strings for HTTP, pageload, and transaction tests. It also enables the retrieval and addition of emulated devices for pageload and transaction tests.  To access Emulation API endpoints, the following permissions are required:  * `Settings Tests Read` for read operations. * `Settings Tests Update` for write operations. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.emulation.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.emulation.model.EmulatedDeviceResponse;
import com.thousandeyes.sdk.emulation.model.SelfLinks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EmulatedDeviceResponses
 */
@JsonPropertyOrder({
  EmulatedDeviceResponses.JSON_PROPERTY_EMULATED_DEVICES,
  EmulatedDeviceResponses.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EmulatedDeviceResponses {
  public static final String JSON_PROPERTY_EMULATED_DEVICES = "emulatedDevices";
  private List<EmulatedDeviceResponse> emulatedDevices = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinks links;

  public EmulatedDeviceResponses() { 
  }

  public EmulatedDeviceResponses emulatedDevices(List<EmulatedDeviceResponse> emulatedDevices) {
    this.emulatedDevices = emulatedDevices;
    return this;
  }

  public EmulatedDeviceResponses addEmulatedDevicesItem(EmulatedDeviceResponse emulatedDevicesItem) {
    if (this.emulatedDevices == null) {
      this.emulatedDevices = new ArrayList<>();
    }
    this.emulatedDevices.add(emulatedDevicesItem);
    return this;
  }

   /**
   * Get emulatedDevices
   * @return emulatedDevices
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMULATED_DEVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EmulatedDeviceResponse> getEmulatedDevices() {
    return emulatedDevices;
  }


  @JsonProperty(JSON_PROPERTY_EMULATED_DEVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmulatedDevices(List<EmulatedDeviceResponse> emulatedDevices) {
    this.emulatedDevices = emulatedDevices;
  }


  public EmulatedDeviceResponses links(SelfLinks links) {
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

  public SelfLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinks links) {
    this.links = links;
  }


  /**
   * Return true if this EmulatedDeviceResponses object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmulatedDeviceResponses emulatedDeviceResponses = (EmulatedDeviceResponses) o;
    return Objects.equals(this.emulatedDevices, emulatedDeviceResponses.emulatedDevices) &&
        Objects.equals(this.links, emulatedDeviceResponses.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emulatedDevices, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmulatedDeviceResponses {\n");
    sb.append("    emulatedDevices: ").append(toIndentedString(emulatedDevices)).append("\n");
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

