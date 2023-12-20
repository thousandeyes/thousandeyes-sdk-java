

# ApiOutageFilter

Advanced filter query used to filter the response. Can filter on: - outageScope (all, affected tests (e.g. my tests only)). - providerName - interfaceNetwork - applicationName - startDate, endDate - window

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **String** | Start of the time range. Must be paired with &#x60;endDate&#x60;. |  [optional] |
|**endDate** | **String** | End of the time range. Must be paired with &#x60;startDate&#x60;. |  [optional] |
|**window** | **String** | Specify a time period in the past for which to retrieve data. Alternative to specifying &#x60;startDate&#x60; and &#x60;endDate&#x60;. |  [optional] |
|**outageScope** | **OutageScope** |  |  [optional] |
|**providerName** | **List&lt;String&gt;** | The name used to identify the provider. |  [optional] |
|**applicationName** | **List&lt;String&gt;** | The name to identify the application. |  [optional] |
|**interfaceNetwork** | **List&lt;String&gt;** | The name of the ASN (Interface Network). |  [optional] |



