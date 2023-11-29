

# RtpStreamTestResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | Data point date UTC (ISO date-time format). |  [optional] [readonly] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round |  [optional] [readonly] |
|**links** | **Object** |  |  [optional] |
|**agent** | [**Agent**](Agent.md) |  |  [optional] |
|**serverIp** | **String** | Target agent IP address |  [optional] [readonly] |
|**dscp** | **String** | DSCP value received by the server from the agent |  [optional] [readonly] |
|**dscpName** | **String** | Name of DSCP value received by the server from the agent |  [optional] [readonly] |
|**mos** | **Float** | Mean opinion score for agent’s stream |  [optional] [readonly] |
|**codecName** | **String** | Name of codec used by agen |  [optional] [readonly] |
|**codecMaxMos** | **Float** | Maximum value of Mean Opinion Score based on codec selection |  [optional] [readonly] |
|**loss** | **Float** | Percentage value of packets sent from agent not received by server |  [optional] [readonly] |
|**discards** | **Float** | Percentage of packets discarded |  [optional] [readonly] |
|**latency** | **Integer** | Time to send packets from source to server in milliseconds |  [optional] [readonly] |
|**pdv** | **Integer** | Variation in packet delay in milliseconds |  [optional] [readonly] |
|**errorDetail** | **String** | Error details, if an error was encountered |  [optional] [readonly] |



