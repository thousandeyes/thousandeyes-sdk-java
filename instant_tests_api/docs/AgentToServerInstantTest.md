

# AgentToServerInstantTest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdBy** | **String** | User that created the test. |  [optional] [readonly] |
|**createdDate** | **OffsetDateTime** | UTC created date (ISO date-time format). |  [optional] [readonly] |
|**description** | **String** | A description of the test. |  [optional] |
|**liveShare** | **Boolean** | Indicates if the test is shared with the account group. |  [optional] [readonly] |
|**modifiedBy** | **String** | User that modified the test. |  [optional] [readonly] |
|**modifiedDate** | **OffsetDateTime** | UTC last modification date (ISO date-time format). |  [optional] [readonly] |
|**savedEvent** | **Boolean** | Indicates if the test is a saved event. |  [optional] [readonly] |
|**testId** | **String** | Each test is assigned an unique ID; this is used to access test information and results from other endpoints. |  [optional] [readonly] |
|**testName** | **String** | The name of the test. Test name must be unique. |  [optional] |
|**type** | **String** |  |  [optional] [readonly] |
|**links** | [**UnexpandedInstantTestLinks**](UnexpandedInstantTestLinks.md) |  |  [optional] |
|**labels** | [**List&lt;TestLabelsInner&gt;**](TestLabelsInner.md) |  |  [optional] [readonly] |
|**sharedWithAccounts** | [**List&lt;TestSharedAccountsInner&gt;**](TestSharedAccountsInner.md) |  |  [optional] [readonly] |
|**agents** | [**List&lt;Agent&gt;**](Agent.md) | Contains list of agents. |  [readonly] |
|**bandwidthMeasurements** | **Boolean** | Set to &#x60;true&#x60; to enable bandwidth measurements, only applies to Enterprise agents assigned to the test. |  [optional] |
|**continuousMode** | **Boolean** | To enable continuous monitoring, set this parameter to &#x60;true&#x60; to.  When continuous monitoring is enabled, the following actions occur: * &#x60;fixedPacketRate&#x60; is enforced * &#x60;bandwidthMeasurements&#x60; are disabled * If the &#x60;protocol&#x60; is set to &#x60;tcp&#x60;, &#x60;probeMode&#x60; is set to &#x60;syn&#x60;.  |  [optional] |
|**fixedPacketRate** | **Integer** | If continuousMode is &#x60;false&#x60;, set the fixedPacketRate to a value between 10-100. If &#x60;continuousMode&#x60; is &#x60;true&#x60;, set the &#x60;fixedPacketRate&#x60; to &#x60;1&#x60; |  [optional] |
|**mtuMeasurements** | **Boolean** | Set &#x60;true&#x60; to measure MTU sizes on network from agents to the target. |  [optional] |
|**numPathTraces** | **Integer** | Number of path traces executed by the agent. |  [optional] |
|**pathTraceMode** | **TestPathTraceMode** |  |  [optional] |
|**port** | **Integer** | Target port. |  [optional] |
|**probeMode** | **TestProbeMode** |  |  [optional] |
|**protocol** | **TestProtocol** |  |  [optional] |
|**server** | **String** | Target name or IP address. |  |
|**dscp** | **String** | DSCP label. |  [optional] [readonly] |
|**dscpId** | **TestDscpId** |  |  [optional] |
|**ipv6Policy** | **TestIpv6Policy** |  |  [optional] |
|**pingPayloadSize** | **Integer** | Payload size (not total packet size) for the end-to-end metric&#39;s probes, ping payload size allows values from 0 to 1400 bytes. When set to null, payload sizes are 0 bytes for ICMP-based tests and 1 byte for TCP-based tests. |  [optional] |
|**networkMeasurements** | **Boolean** | View packet loss in 1-second intervals. This is only available for 1-minute interval tests. Set to &#x60;true&#x60; to enable network measurements. |  [optional] |



