

# HttpTestResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | Data point date UTC (ISO date-time format). |  [optional] [readonly] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round |  [optional] [readonly] |
|**links** | **Object** |  |  [optional] |
|**agent** | [**Agent**](Agent.md) |  |  [optional] |
|**serverIp** | **String** | IP address of destination server |  [optional] [readonly] |
|**responseCode** | **Integer** | HTTP response code |  [optional] |
|**numRedirects** | **Integer** | Number of redirects |  [optional] |
|**redirectTime** | **Integer** | Cumulative redirect timing in milliseconds |  [optional] |
|**dnsTime** | **Integer** | Time required to resolve DNS in milliseconds |  [optional] |
|**sslTime** | **Integer** | Time to negotiate SSL/TLS in milliseconds |  [optional] |
|**connectTime** | **Integer** | Time required to establish a TCP connection to the server |  [optional] |
|**waitTime** | **Integer** | Time elapsed between completion of request and first byte of response in milliseconds |  [optional] |
|**receiveTime** | **Integer** | Elapsed time between first and last byte of response in milliseconds |  [optional] |
|**wireSize** | **Integer** | Size of content in bytes |  [optional] |
|**responseTime** | **Integer** | Time to first byte in milliseconds |  [optional] |
|**throughput** | **Double** | WireSize divided by receiveTime in byter per second |  [optional] |
|**totalTime** | **Integer** | response time + receive time |  [optional] |
|**headers** | [**HttpTestResultHeaders**](HttpTestResultHeaders.md) |  |  [optional] |
|**errorType** | **String** | Type of error encountered; corresponds to phase of connection |  [optional] [readonly] |
|**errorDetails** | **String** | Error details, if an error were encountered |  [optional] [readonly] |
|**sslCipher** | **String** | Cipher suite |  [optional] |
|**sslVersion** | **String** | TLS version |  [optional] |
|**sslCertificates** | [**List&lt;SslCert&gt;**](SslCert.md) |  |  [optional] |



