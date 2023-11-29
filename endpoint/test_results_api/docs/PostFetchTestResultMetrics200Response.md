

# PostFetchTestResultMetrics200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**results** | [**List&lt;NetworkTestResult&gt;**](NetworkTestResult.md) |  |  [optional] |
|**test** | [**EndpointScheduledTest**](EndpointScheduledTest.md) |  |  [optional] |
|**startDate** | **OffsetDateTime** | (Optional) When passing &#x60;window&#x60; or &#x60;startDate&#x60; parameter,  the client will also receive the &#x60;startDate&#x60; field indicating the UTC start date of the data&#39;s time range being retrieved  (ISO date-time format). |  [optional] [readonly] |
|**endDate** | **OffsetDateTime** | (Optional) When passing &#x60;window&#x60; or &#x60;endDate&#x60; parameter,  the client will also receive the &#x60;endDate&#x60; field indicating the UTC end date of the data&#39;s time range being retrieved  (ISO date-time format). |  [optional] [readonly] |
|**links** | [**PaginationNextLinkLinks**](PaginationNextLinkLinks.md) |  |  [optional] |



