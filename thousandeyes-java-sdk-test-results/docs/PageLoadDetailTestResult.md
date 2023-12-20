

# PageLoadDetailTestResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | Data point date UTC (ISO date-time format). |  [optional] [readonly] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round |  [optional] [readonly] |
|**links** | **Object** |  |  [optional] |
|**agent** | [**Agent**](Agent.md) |  |  [optional] |
|**responseTime** | **Double** | Time to first byte in milliseconds |  [optional] [readonly] |
|**totalSize** | **Integer** | Sum of wire size of all objects on page in bytes |  [optional] [readonly] |
|**numObjects** | **Integer** | Number of objects found on the page |  [optional] [readonly] |
|**numErrors** | **Integer** | Number of objects which encountered errors during download |  [optional] [readonly] |
|**domLoadTime** | **Integer** | Time to interaction in milliseconds |  [optional] [readonly] |
|**pageLoadTime** | **Integer** | Time to completely load page in milliseconds |  [optional] [readonly] |
|**har** | **Object** | See [HAR specification](http://www.softwareishard.com/blog/har-12-spec/) for details |  [optional] [readonly] |



