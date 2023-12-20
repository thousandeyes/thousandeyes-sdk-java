

# NetworkTestResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | Data point date in UTC (ISO date-time format). |  [optional] [readonly] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round |  [optional] [readonly] |
|**links** | **Object** |  |  [optional] |
|**startTime** | **Integer** | Epoch time (seconds) indicating the start time of the round |  [optional] [readonly] |
|**endTime** | **Integer** | Epoch time (seconds) indicating the end time of the round |  [optional] [readonly] |
|**availableBandwidth** | **Double** |  |  [optional] [readonly] |
|**avgLatency** | **Double** | Average RTT for packets sent to destination |  [optional] [readonly] |
|**bandwidth** | **Double** |  |  [optional] [readonly] |
|**capacity** | **Double** |  |  [optional] [readonly] |
|**jitter** | **Double** | Standard deviation of latency |  [optional] [readonly] |
|**loss** | **Double** | Percentage of packets not reaching destination |  [optional] [readonly] |
|**maxLatency** | **Double** | Maximum RTT for packets sent to destination |  [optional] [readonly] |
|**minLatency** | **Double** | Minimum RTT for packets sent to destination |  [optional] [readonly] |
|**agent** | [**Agent**](Agent.md) |  |  [optional] |
|**serverIp** | **String** | IP of target server |  [optional] [readonly] |
|**server** | **String** | Target server, including port (if method used is TCP) |  [optional] [readonly] |
|**direction** | **TestDirection** |  |  [optional] |



