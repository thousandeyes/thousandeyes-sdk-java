

# WebTransactionPageDetailTestResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | Data point date UTC (ISO date-time format). |  [optional] [readonly] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round |  [optional] [readonly] |
|**links** | **Object** |  |  [optional] |
|**agent** | [**Agent**](Agent.md) |  |  [optional] |
|**componentErrors** | **Integer** | Number of components which did not successfully load |  [optional] [readonly] |
|**transactionTime** | **Integer** | Elapsed execution time of the web transaction script in milliseconds |  [optional] [readonly] |
|**errorType** | **String** | Type of error encountered; corresponds to phase of connection |  [optional] [readonly] |
|**errorDetails** | **String** | Error details, if an error were encountered |  [optional] [readonly] |
|**markers** | [**List&lt;Marker&gt;**](Marker.md) |  |  [optional] |
|**pages** | [**List&lt;Page&gt;**](Page.md) |  |  [optional] |
|**har** | **Object** | See [HAR specification](http://www.softwareishard.com/blog/har-12-spec/) for details |  [optional] [readonly] |



