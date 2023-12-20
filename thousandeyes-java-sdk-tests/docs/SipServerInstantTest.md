

# SipServerInstantTest


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
|**authUser** | **String** | Username for authentication with SIP server. |  [optional] |
|**mtuMeasurements** | **Boolean** | Set &#x60;true&#x60; to measure MTU sizes on network from agents to the target. |  [optional] |
|**networkMeasurements** | **Boolean** | Enable or disable network measurements. Set to true to enable or false to disable network measurements. |  [optional] |
|**optionsRegex** | **String** | Options regex, this field does not require escaping. |  [optional] |
|**password** | **String** | Password for Basic/NTLM authentication. |  [optional] |
|**pathTraceMode** | **TestPathTraceMode** |  |  [optional] |
|**port** | **Integer** | Target port. |  |
|**protocol** | **SipTestProtocol** |  |  [optional] |
|**registerEnabled** | **Boolean** | Set to true to perform SIP registration on the test target with the SIP REGISTER command. |  [optional] |
|**sipRegistrar** | **String** | SIP server to be tested, specified by domain name or IP address. |  [optional] |
|**sipTargetTime** | **Integer** | Target time for test completion in milliseconds. |  [optional] |
|**sipTimeLimit** | **Integer** | Time limit in milliseconds. |  [optional] |
|**targetSipCredentials** | [**TestSipCredentials**](TestSipCredentials.md) |  |  |
|**user** | **String** | Username for SIP registration, should be unique within a ThousandEyes account group. |  [optional] |
|**fixedPacketRate** | **Integer** | Sets packets rate sent to measure the network in packets per second. |  [optional] |
|**ipv6Policy** | **TestIpv6Policy** |  |  [optional] |



