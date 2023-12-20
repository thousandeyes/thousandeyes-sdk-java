

# DnsServerTestResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | Data point date UTC (ISO date-time format). |  [optional] [readonly] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round |  [optional] [readonly] |
|**links** | **Object** |  |  [optional] |
|**startTime** | **Integer** | Epoch time (seconds) indicating the start time of the round |  [optional] [readonly] |
|**endTime** | **Integer** | Epoch time (seconds) indicating the end time of the round |  [optional] [readonly] |
|**agent** | [**Agent**](Agent.md) |  |  [optional] |
|**serverId** | **String** | Internal ID of DNS server being tested |  [optional] [readonly] |
|**server** | **String** | Canonical name of server being tested |  [optional] [readonly] |
|**resolutionTime** | **Integer** | How long it took to run the query against the serverow long it took to run the query against the server |  [optional] [readonly] |
|**errorDetails** | **String** | Error details, if an error were encountered |  [optional] [readonly] |
|**mappings** | **String** | Final mappings returned from the request |  [optional] [readonly] |



