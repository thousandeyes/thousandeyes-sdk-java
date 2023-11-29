

# BgpTestResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | Data point date UTC (ISO date-time format). |  [optional] [readonly] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round |  [optional] [readonly] |
|**links** | **Object** |  |  [optional] |
|**monitor** | [**Monitor**](Monitor.md) |  |  [optional] |
|**prefixId** | **String** | Internally tracked prefix ID. |  [optional] |
|**prefix** | **String** | Prefix being tracked. |  [optional] |
|**updates** | **Double** | Number of updates tracked against this prefix by this monitor. |  [optional] |
|**pathChanges** | **Double** | Number of path changes tracked against this prefix by this monitor. |  [optional] |
|**reachability** | **Double** | Percentage reachability |  [optional] |



