

# AlertSuppressionWindowRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alertSuppressionWindowId** | **String** | Unique ID of the alert suppression window. |  [optional] [readonly] |
|**name** | **String** | Name of the alert suppression window. |  [optional] |
|**isEnabled** | **Boolean** | Set to &#x60;false&#x60; for &#x60;disabled&#x60;, &#x60;true&#x60; for &#x60;enabled&#x60;. |  [optional] |
|**status** | **AlertSuppressionWindowState** |  |  [optional] |
|**startDate** | **OffsetDateTime** | The date/time when the alert suppression window starts (ISO date-time format). |  [optional] |
|**duration** | **Integer** | Duration in seconds the suppression window is active. |  [optional] |
|**repeat** | [**Repeat**](Repeat.md) |  |  [optional] |
|**endRepeat** | [**EndRepeat**](EndRepeat.md) |  |  [optional] |
|**tests** | **List&lt;String&gt;** | List of tests to assign to the alert suppression window. |  [optional] |



