

# FtpServerTestResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | Data point date UTC (ISO date-time format). |  [optional] [readonly] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round |  [optional] [readonly] |
|**links** | **Object** |  |  [optional] |
|**agent** | [**Agent**](Agent.md) |  |  [optional] |
|**serverIp** | **String** | IP address of destination server |  [optional] [readonly] |
|**responseCode** | **Integer** | FTP response code |  [optional] [readonly] |
|**dnsTime** | **Float** | Time required to resolve DNS  in milliseconds |  [optional] [readonly] |
|**connectTime** | **Float** | Time required to establish a TCP connection to the server in milliseconds |  [optional] [readonly] |
|**negotiationTime** | **Float** | Time negotiate the connection and authenticate with the destination server in milliseconds |  [optional] [readonly] |
|**waitTime** | **Float** | Time elapsed between completion of request and first byte of response in milliseconds |  [optional] [readonly] |
|**responseTime** | **Float** | Sum of DNS, connect, negotiation and wait times in milliseconds |  [optional] [readonly] |
|**transferTime** | **Float** | Elapsed time between first and last byte of the transfer in milliseconds |  [optional] [readonly] |
|**wireSize** | **BigDecimal** | Size of content in bytes |  [optional] [readonly] |
|**totalTime** | **Float** | Sum of response + transfer time in milliseconds |  [optional] [readonly] |
|**errorType** | **String** | Type of error encountered; corresponds to phase of connection |  [optional] [readonly] |
|**errorDetails** | **String** | Error details, if an error were encountered |  [optional] [readonly] |
|**throughput** | **BigDecimal** | WireSize divided by receiveTime in byter per second |  [optional] [readonly] |



