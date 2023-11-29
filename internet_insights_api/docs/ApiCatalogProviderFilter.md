

# ApiCatalogProviderFilter

Advanced filter query used to filter the response. The provider name, location, asn can be partial names. Can filter on: - Provider name - Provider type - Region - Location - ASN - included

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerName** | **String** | The name of the catalog provider. |  [optional] |
|**providerType** | **String** | The type of catalog provider. |  [optional] |
|**region** | **String** | The catalog provider region. |  [optional] |
|**location** | **String** | Location of the catalog provider. |  [optional] |
|**asn** | **String** | Name of the ASN (Autonomous Systems Number) covered by providers. |  [optional] |
|**included** | **Boolean** | Indicates whether the catalog provider is included in the licensed packages. true returns providers covered by licensed packages, false returns providers not covered by licensed packages. |  [optional] |



