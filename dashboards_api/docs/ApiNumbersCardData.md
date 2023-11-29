

# ApiNumbersCardData

The data displayed on a numbers card.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cardId** | **String** | Identifier of the card. |  [optional] |
|**startDate** | **OffsetDateTime** | UTC start date of the data shown in the API output (ISO date-time format). |  [optional] |
|**endDate** | **OffsetDateTime** | UTC end date of the data shown in the API output (ISO date-time format). |  [optional] |
|**previousValue** | **Double** | Previous value if &#x60;compareToPreviousValue &#x3D;&#x3D; true&#x60; in configuration. |  [optional] |
|**binSize** | **Long** | Duration of each bin. |  [optional] |
|**timestamp** | **Long** | Timestamp of the aggregated data point. |  [optional] |
|**numberOfDataPoints** | **Long** | Number of points aggregated into the data point |  [optional] |
|**value** | **Double** | Aggregated value. |  [optional] |
|**status** | **String** | Message for not fully configured card or no data. |  [optional] |
|**alertSuppressionWindows** | [**List&lt;ApiDashboardAsw&gt;**](ApiDashboardAsw.md) |  |  [optional] |



