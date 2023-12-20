

# ApiCatalogProviderDetailsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The catalog provider ID. |  [optional] |
|**providerName** | **String** | The name of the catalog provider. |  [optional] |
|**providerType** | **String** | The type of catalog provider. |  [optional] |
|**region** | **String** | The catalog provider region. |  [optional] |
|**dataType** | **String** | The type of data produced by the provider. |  [optional] |
|**asns** | [**Set&lt;ApiAsn&gt;**](ApiAsn.md) | List of ASN&#39;s covered by the Provider. |  [optional] |
|**locations** | [**Set&lt;ApiCatalogProviderDetailsLocationsInner&gt;**](ApiCatalogProviderDetailsLocationsInner.md) | List of locations covered by the Provider. |  [optional] |
|**links** | [**SelfLinksLinks**](SelfLinksLinks.md) |  |  [optional] |



