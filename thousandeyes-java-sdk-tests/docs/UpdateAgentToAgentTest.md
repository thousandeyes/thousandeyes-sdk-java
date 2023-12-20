

# UpdateAgentToAgentTest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**interval** | **TestInterval** |  |  |
|**alertsEnabled** | **Boolean** | Indicates if alerts are enabled. |  [optional] |
|**enabled** | **Boolean** | Test is enabled. |  [optional] |
|**alertRules** | **List&lt;String&gt;** | List of alert rules IDs to apply to the test (get &#x60;ruleId&#x60; from &#x60;/alerts/rules&#x60; endpoint. If &#x60;alertsEnabled&#x60; is set to &#x60;true&#x60; and &#x60;alertRules&#x60; is not included on test creation or update, applicable user default alert rules will be used) |  [optional] |
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
|**labels** | **List&lt;String&gt;** | Contains list of test label IDs (get &#x60;labelId&#x60; from &#x60;/labels&#x60; endpoint) |  [optional] |
|**sharedWithAccounts** | **List&lt;String&gt;** | Contains list of account group IDs. Test is shared with the listed account groups (get &#x60;aid&#x60; from &#x60;/account-groups&#x60; endpoint) |  [optional] |
|**agents** | [**List&lt;TestRequestAllOfAgents&gt;**](TestRequestAllOfAgents.md) | Contains list of object with required &#x60;agentId&#x60; and optional &#x60;sourceIpAddress&#x60; |  |
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
|**monitors** | **List&lt;String&gt;** | Contains list of BGP monitor IDs (get &#x60;monitorId&#x60; from &#x60;/monitors&#x60; endpoint) |  [optional] |



