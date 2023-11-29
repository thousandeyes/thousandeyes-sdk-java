

# DnsTraceTestResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | Data point date UTC (ISO date-time format). |  [optional] [readonly] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round |  [optional] [readonly] |
|**links** | **Object** |  |  [optional] |
|**startTime** | **Integer** | Epoch time (seconds) indicating the start time of the round |  [optional] [readonly] |
|**endTime** | **Integer** | Epoch time (seconds) indicating the end time of the round |  [optional] [readonly] |
|**agent** | [**Agent**](Agent.md) |  |  [optional] |
|**output** | **String** | Verbose output from the trace request |  [optional] [readonly] |
|**errorDetails** | **String** | Error details, if an error were encountered |  [optional] [readonly] |
|**queries** | **Integer** | How many queries were required to get to the requested result |  [optional] [readonly] |
|**failedQueries** | **Integer** | How many queries failed while getting to the requested result |  [optional] [readonly] |
|**finalServerQueried** | **String** | DNS server that provided the final result |  [optional] [readonly] |
|**finalQueryTime** | **Integer** | How long the final query took to return a response |  [optional] [readonly] |
|**mappings** | **String** | Final mappings returned from the request |  [optional] [readonly] |



