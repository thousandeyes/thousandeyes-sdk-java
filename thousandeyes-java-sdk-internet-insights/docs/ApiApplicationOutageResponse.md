

# ApiApplicationOutageResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the outage. |  [optional] |
|**providerName** | **String** | The name of the affected provider. |  [optional] |
|**providerType** | **String** | The type of the affected provider. |  [optional] |
|**applicationName** | **String** | The name of the affected application. |  [optional] |
|**startDate** | **String** | Date and time when the outage started. |  [optional] |
|**startRoundId** | **Long** | Epoch time (seconds) when the outage started. |  [optional] |
|**endDate** | **String** | Date and time when the outage ended. |  [optional] |
|**endRoundId** | **Long** | Epoch time (seconds) when the outage ended. |  [optional] |
|**duration** | **Long** | Duration of the outage in seconds. |  [optional] |
|**affectedTests** | [**Set&lt;ApiAffectedTest&gt;**](ApiAffectedTest.md) | List of affected tests. |  [optional] |
|**affectedDomains** | **Set&lt;String&gt;** | List of affected domains. |  [optional] |
|**affectedAgents** | [**Set&lt;ApiAffectedAgent&gt;**](ApiAffectedAgent.md) | List of affected agents. |  [optional] |
|**errors** | **Set&lt;String&gt;** | List of errors. |  [optional] |
|**affectedLocations** | [**Set&lt;ApiApplicationOutageAffectedLocation&gt;**](ApiApplicationOutageAffectedLocation.md) | List of affected locations. |  [optional] |
|**links** | [**SelfLinksLinks**](SelfLinksLinks.md) |  |  [optional] |



