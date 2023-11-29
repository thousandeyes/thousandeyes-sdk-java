

# GetAgentToAgentTest200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**interval** | **TestInterval** |  |  |
|**alertsEnabled** | **Boolean** | Indicates if alerts are enabled. |  [optional] |
|**enabled** | **Boolean** | Test is enabled. |  [optional] |
|**alertRules** | [**List&lt;AlertRule&gt;**](AlertRule.md) | Contains list of enabled alert rule objects. |  [optional] |
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
|**links** | [**SelfLinksLinks**](SelfLinksLinks.md) |  |  [optional] |
|**labels** | [**List&lt;TestLabelsInner&gt;**](TestLabelsInner.md) |  |  [optional] [readonly] |
|**sharedWithAccounts** | [**List&lt;TestSharedAccountsInner&gt;**](TestSharedAccountsInner.md) |  |  [optional] [readonly] |
|**agents** | [**List&lt;Agent&gt;**](Agent.md) | Contains list of agents. |  [readonly] |
|**direction** | **TestDirection** |  |  [optional] |
|**dscp** | **String** | DSCP label. |  [optional] [readonly] |
|**dscpId** | **TestDscpId** |  |  [optional] |
|**mss** | **Integer** | Maximum segment size, in bytes. |  [optional] |
|**numPathTraces** | **Integer** | Number of path traces executed by the agent. |  [optional] |
|**pathTraceMode** | **TestPathTraceMode** |  |  [optional] |
|**port** | **Integer** | Target port. |  [optional] |
|**protocol** | **AgentToAgentTestProtocol** |  |  [optional] |
|**targetAgentId** | **String** | &#x60;agentId&#x60; of the target agent for the test. |  |
|**throughputMeasurements** | **Boolean** | Enable or disable throughput measurements. Throughput measurements cannot be enabled when the source or target of the test is a cloud agent. |  [optional] |
|**throughputDuration** | **Integer** | The throughput duration. |  [optional] |
|**throughputRate** | **Integer** | The throughput rate, only applicable for UDP protocol. |  [optional] |
|**fixedPacketRate** | **Integer** | Sets packets rate sent to measure the network in packets per second. |  [optional] |
|**bgpMeasurements** | **Boolean** | Set to &#x60;true&#x60; to enable bgp measurements. |  [optional] |
|**monitors** | [**List&lt;Monitor&gt;**](Monitor.md) | Contains list of enabled BGP monitors. |  [optional] [readonly] |



