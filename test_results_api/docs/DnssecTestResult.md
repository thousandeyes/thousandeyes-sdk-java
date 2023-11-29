

# DnssecTestResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | Data point date UTC (ISO date-time format). |  [optional] [readonly] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round |  [optional] [readonly] |
|**links** | **Object** |  |  [optional] |
|**startTime** | **Integer** | Epoch time (seconds) indicating the start time of the round |  [optional] [readonly] |
|**endTime** | **Integer** | Epoch time (seconds) indicating the end time of the round |  [optional] [readonly] |
|**agent** | [**Agent**](Agent.md) |  |  [optional] |
|**isValid** | **Boolean** | Indicates if keychain is valid (if false see errorDetails field) |  [optional] [readonly] |
|**errorDetails** | **String** | Error details, if an error were encountered |  [optional] [readonly] |



