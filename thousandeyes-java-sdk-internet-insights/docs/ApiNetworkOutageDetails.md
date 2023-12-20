

# ApiNetworkOutageDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the outage. |  [optional] |
|**providerName** | **String** | The name of the affected provider. |  [optional] |
|**providerType** | **String** | The type of the affected provider. |  [optional] |
|**networkName** | **String** | The affected network. |  [optional] |
|**asn** | **Integer** | ASN number |  [optional] |
|**startDate** | **String** | Date and time when the outage started. |  [optional] |
|**startRoundId** | **Long** | Epoch time (seconds) when the outage started. |  [optional] |
|**endDate** | **String** | Date and time when the outage ended. |  [optional] |
|**endRoundId** | **Long** | Epoch time (seconds) when the outage ended. |  [optional] |
|**duration** | **Long** | Duration of the outage in seconds. |  [optional] |
|**affectedTests** | [**Set&lt;ApiAffectedTest&gt;**](ApiAffectedTest.md) | List of affected tests. |  [optional] |
|**affectedDomains** | **Set&lt;String&gt;** | List of affected domains. |  [optional] |
|**affectedAgents** | [**Set&lt;ApiAffectedAgent&gt;**](ApiAffectedAgent.md) | List of affected agents. |  [optional] |
|**affectedLocations** | [**Set&lt;ApiNetworkOutageAffectedLocation&gt;**](ApiNetworkOutageAffectedLocation.md) | List of affected locations. |  [optional] |



