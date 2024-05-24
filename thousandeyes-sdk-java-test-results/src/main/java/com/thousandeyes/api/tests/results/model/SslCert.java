/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SslCert
 */
@JsonPropertyOrder({
  SslCert.JSON_PROPERTY_DAYS_UNTIL_EXPIRY,
  SslCert.JSON_PROPERTY_IS_FETCH_DATE_IN_VALID_CERT_DATE_RANGE,
  SslCert.JSON_PROPERTY_HAS_VALID_SIGNING_CERT,
  SslCert.JSON_PROPERTY_ISSUER_NAME,
  SslCert.JSON_PROPERTY_VALID_BEFORE,
  SslCert.JSON_PROPERTY_VALID_AFTER,
  SslCert.JSON_PROPERTY_SUBJECT_ALTERNATIVE_NAMES,
  SslCert.JSON_PROPERTY_SUBJECT_NAME
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class SslCert {
  public static final String JSON_PROPERTY_DAYS_UNTIL_EXPIRY = "daysUntilExpiry";
  private Integer daysUntilExpiry;

  public static final String JSON_PROPERTY_IS_FETCH_DATE_IN_VALID_CERT_DATE_RANGE = "isFetchDateInValidCertDateRange";
  private Boolean isFetchDateInValidCertDateRange;

  public static final String JSON_PROPERTY_HAS_VALID_SIGNING_CERT = "hasValidSigningCert";
  private Boolean hasValidSigningCert;

  public static final String JSON_PROPERTY_ISSUER_NAME = "issuerName";
  private String issuerName;

  public static final String JSON_PROPERTY_VALID_BEFORE = "validBefore";
  private OffsetDateTime validBefore;

  public static final String JSON_PROPERTY_VALID_AFTER = "validAfter";
  private OffsetDateTime validAfter;

  public static final String JSON_PROPERTY_SUBJECT_ALTERNATIVE_NAMES = "subjectAlternativeNames";
  private List<String> subjectAlternativeNames = new ArrayList<>();

  public static final String JSON_PROPERTY_SUBJECT_NAME = "subjectName";
  private String subjectName;

  public SslCert() { 
  }

  public SslCert daysUntilExpiry(Integer daysUntilExpiry) {
    this.daysUntilExpiry = daysUntilExpiry;
    return this;
  }

   /**
   * Days until certificate expires, rounded down. 0 is shown if there are less than 24 hours remaining. Calculated when the test was executed.
   * @return daysUntilExpiry
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAYS_UNTIL_EXPIRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDaysUntilExpiry() {
    return daysUntilExpiry;
  }


  @JsonProperty(JSON_PROPERTY_DAYS_UNTIL_EXPIRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDaysUntilExpiry(Integer daysUntilExpiry) {
    this.daysUntilExpiry = daysUntilExpiry;
  }


  public SslCert isFetchDateInValidCertDateRange(Boolean isFetchDateInValidCertDateRange) {
    this.isFetchDateInValidCertDateRange = isFetchDateInValidCertDateRange;
    return this;
  }

   /**
   * True when certificate fetch date is within the valid certificate date range, false otherwise
   * @return isFetchDateInValidCertDateRange
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_FETCH_DATE_IN_VALID_CERT_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsFetchDateInValidCertDateRange() {
    return isFetchDateInValidCertDateRange;
  }


  @JsonProperty(JSON_PROPERTY_IS_FETCH_DATE_IN_VALID_CERT_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsFetchDateInValidCertDateRange(Boolean isFetchDateInValidCertDateRange) {
    this.isFetchDateInValidCertDateRange = isFetchDateInValidCertDateRange;
  }


  public SslCert hasValidSigningCert(Boolean hasValidSigningCert) {
    this.hasValidSigningCert = hasValidSigningCert;
    return this;
  }

   /**
   * This field is implicitly true; it is output only when false. false indicates this certificate was missing a valid signing certificate in the chain.
   * @return hasValidSigningCert
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_VALID_SIGNING_CERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasValidSigningCert() {
    return hasValidSigningCert;
  }


  @JsonProperty(JSON_PROPERTY_HAS_VALID_SIGNING_CERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasValidSigningCert(Boolean hasValidSigningCert) {
    this.hasValidSigningCert = hasValidSigningCert;
  }


  public SslCert issuerName(String issuerName) {
    this.issuerName = issuerName;
    return this;
  }

   /**
   * Certificate issuer
   * @return issuerName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssuerName() {
    return issuerName;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }


  public SslCert validBefore(OffsetDateTime validBefore) {
    this.validBefore = validBefore;
    return this;
  }

   /**
   * Certificate is not valid after this date
   * @return validBefore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_BEFORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getValidBefore() {
    return validBefore;
  }


  @JsonProperty(JSON_PROPERTY_VALID_BEFORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidBefore(OffsetDateTime validBefore) {
    this.validBefore = validBefore;
  }


  public SslCert validAfter(OffsetDateTime validAfter) {
    this.validAfter = validAfter;
    return this;
  }

   /**
   * Certificate is not valid before this date
   * @return validAfter
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getValidAfter() {
    return validAfter;
  }


  @JsonProperty(JSON_PROPERTY_VALID_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidAfter(OffsetDateTime validAfter) {
    this.validAfter = validAfter;
  }


  public SslCert subjectAlternativeNames(List<String> subjectAlternativeNames) {
    this.subjectAlternativeNames = subjectAlternativeNames;
    return this;
  }

  public SslCert addSubjectAlternativeNamesItem(String subjectAlternativeNamesItem) {
    if (this.subjectAlternativeNames == null) {
      this.subjectAlternativeNames = new ArrayList<>();
    }
    this.subjectAlternativeNames.add(subjectAlternativeNamesItem);
    return this;
  }

   /**
   * Alternative name(s) of the certificate subject, extracted from the Subject Alternative Name (SAN) X.509 certificate extension, for example example.com, www2.example.com
   * @return subjectAlternativeNames
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT_ALTERNATIVE_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSubjectAlternativeNames() {
    return subjectAlternativeNames;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT_ALTERNATIVE_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubjectAlternativeNames(List<String> subjectAlternativeNames) {
    this.subjectAlternativeNames = subjectAlternativeNames;
  }


  public SslCert subjectName(String subjectName) {
    this.subjectName = subjectName;
    return this;
  }

   /**
   * certificate’s subject name - a value of the common name (CN) RDN from the certificate’s Subject attribute, for example www.example.com
   * @return subjectName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubjectName() {
    return subjectName;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }


  /**
   * Return true if this SslCert object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SslCert sslCert = (SslCert) o;
    return Objects.equals(this.daysUntilExpiry, sslCert.daysUntilExpiry) &&
        Objects.equals(this.isFetchDateInValidCertDateRange, sslCert.isFetchDateInValidCertDateRange) &&
        Objects.equals(this.hasValidSigningCert, sslCert.hasValidSigningCert) &&
        Objects.equals(this.issuerName, sslCert.issuerName) &&
        Objects.equals(this.validBefore, sslCert.validBefore) &&
        Objects.equals(this.validAfter, sslCert.validAfter) &&
        Objects.equals(this.subjectAlternativeNames, sslCert.subjectAlternativeNames) &&
        Objects.equals(this.subjectName, sslCert.subjectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysUntilExpiry, isFetchDateInValidCertDateRange, hasValidSigningCert, issuerName, validBefore, validAfter, subjectAlternativeNames, subjectName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SslCert {\n");
    sb.append("    daysUntilExpiry: ").append(toIndentedString(daysUntilExpiry)).append("\n");
    sb.append("    isFetchDateInValidCertDateRange: ").append(toIndentedString(isFetchDateInValidCertDateRange)).append("\n");
    sb.append("    hasValidSigningCert: ").append(toIndentedString(hasValidSigningCert)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    validBefore: ").append(toIndentedString(validBefore)).append("\n");
    sb.append("    validAfter: ").append(toIndentedString(validAfter)).append("\n");
    sb.append("    subjectAlternativeNames: ").append(toIndentedString(subjectAlternativeNames)).append("\n");
    sb.append("    subjectName: ").append(toIndentedString(subjectName)).append("\n");
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

