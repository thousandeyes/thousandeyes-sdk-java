

# SipServerTestResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | Data point date UTC (ISO date-time format). |  [optional] [readonly] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round |  [optional] [readonly] |
|**links** | **Object** |  |  [optional] |
|**serverIp** | **String** | Target agent IP address |  [optional] [readonly] |
|**agent** | [**Agent**](Agent.md) |  |  [optional] |
|**availability** | **Float** | availability of the service |  [optional] [readonly] |
|**connectTime** | **Integer** | Time required to establish a TCP connection to the server in milliseconds, only available when TCP is configured as protocol |  [optional] [readonly] |
|**dnsTime** | **Integer** | Time required to resolve DNS in milliseconds |  [optional] [readonly] |
|**inviteTime** | **Integer** | Time to complete INVITE in milliseconds |  [optional] [readonly] |
|**optionsTime** | **Integer** | Time to complete OPTIONS in milliseconds |  [optional] [readonly] |
|**numRedirects** | **Integer** | Number of redirects |  [optional] [readonly] |
|**optionsRequest** | **String** | Entire OPTIONS request |  [optional] [readonly] |
|**optionsResponse** | **String** | Entire OPTIONS response |  [optional] [readonly] |
|**registerTime** | **Integer** | Time to complete REGISTER in milliseconds |  [optional] [readonly] |
|**responseCode** | **Integer** | SIP server response code |  [optional] [readonly] |
|**responseTime** | **Integer** | Time to first byte |  [optional] [readonly] |
|**totalTime** | **Integer** | Total time |  [optional] [readonly] |
|**waitTime** | **Integer** | Time elapsed between completion of request and first byte of response |  [optional] [readonly] |
|**errorType** | **SipServerErrorType** |  |  [optional] |
|**problemDetail** | **String** | Error details, if an error was encountered |  [optional] [readonly] |



