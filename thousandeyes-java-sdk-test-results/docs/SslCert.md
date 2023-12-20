

# SslCert


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**daysUntilExpiry** | **Integer** | Days until certificate expires, rounded down. 0 is shown if there are less than 24 hours remaining. Calculated when the test was executed. |  [optional] |
|**isFetchDateInValidCertDateRange** | **String** | True when certificate fetch date is within the valid certificate date range, false otherwise |  [optional] |
|**hasValidSigningCert** | **String** | This field is implicitly true; it is output only when false. false indicates this certificate was missing a valid signing certificate in the chain. |  [optional] |
|**issuerName** | **String** | Certificate issuer |  [optional] |
|**validBefore** | **OffsetDateTime** | Certificate is not valid after this date |  [optional] |
|**validAfter** | **OffsetDateTime** | Certificate is not valid before this date |  [optional] |
|**subjectAlternativeNames** | **List&lt;String&gt;** | Alternative name(s) of the certificate subject, extracted from the Subject Alternative Name (SAN) X.509 certificate extension, for example example.com, www2.example.com |  [optional] |
|**subjectName** | **String** | certificate’s subject name - a value of the common name (CN) RDN from the certificate’s Subject attribute, for example www.example.com |  [optional] |



