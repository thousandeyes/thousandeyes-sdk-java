

# ApiOutagesResponseAllOfOutagesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the outage. |  [optional] |
|**type** | **String** | The type of outage e.g. app. |  [optional] |
|**providerName** | **String** | The name of the affected provider. |  [optional] |
|**providerType** | **String** | The type of the affected provider. |  [optional] |
|**name** | **String** | The name of the affected application. |  [optional] |
|**startDate** | **String** | Date and time when the outage started. |  [optional] |
|**startRoundId** | **Long** | Epoch time (seconds) when the outage started. |  [optional] |
|**endDate** | **String** | Date and time when the outage ended. |  [optional] |
|**endRoundId** | **Long** | Epoch time (seconds) when the outage ended. |  [optional] |
|**duration** | **Long** | Duration of the outage (seconds) |  [optional] |
|**affectedTestsCount** | **Integer** | The number of affected tests |  [optional] |
|**affectedServersCount** | **Integer** | The number of affected servers |  [optional] |
|**affectedLocationsCount** | **Integer** | The number of affected locations |  [optional] |
|**links** | [**SelfLinksLinks**](SelfLinksLinks.md) |  |  [optional] |



