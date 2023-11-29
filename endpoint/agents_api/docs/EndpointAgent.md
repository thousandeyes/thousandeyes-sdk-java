

# EndpointAgent

The `EndpointAgent` object, which may include multiple clients.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier of the agent this applies to. |  [optional] [readonly] |
|**aid** | [**EndpointAgentAid**](EndpointAgentAid.md) |  |  [optional] |
|**name** | **String** | The name of the agent. |  [optional] |
|**computerName** | **String** |  |  [optional] [readonly] |
|**osVersion** | **String** |  |  [optional] [readonly] |
|**platform** | **Platform** |  |  [optional] |
|**kernelVersion** | **String** |  |  [optional] [readonly] |
|**manufacturer** | **String** |  |  [optional] [readonly] |
|**model** | **String** |  |  [optional] [readonly] |
|**lastSeen** | **OffsetDateTime** | The last time the agent checked-in. |  [optional] [readonly] |
|**status** | **Status** |  |  [optional] |
|**deleted** | **Boolean** |  |  [optional] [readonly] |
|**version** | **String** | Version of the agent software running. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**numberOfClients** | **Long** |  |  [optional] [readonly] |
|**publicIP** | **String** |  |  [optional] [readonly] |
|**location** | [**EndpointAgentLocation**](EndpointAgentLocation.md) |  |  [optional] |
|**clients** | [**List&lt;EndpointClient&gt;**](EndpointClient.md) | List of clients (user accounts) that the agent works with. Not populated by default.  |  [optional] [readonly] |
|**totalMemory** | **String** |  |  [optional] [readonly] |
|**agentType** | **String** |  |  [optional] [readonly] |
|**vpnProfiles** | [**List&lt;EndpointVpnProfile&gt;**](EndpointVpnProfile.md) | List of VPN connections on the agent. Not populated by default.  |  [optional] [readonly] |
|**networkInterfaceProfiles** | [**List&lt;InterfaceProfile&gt;**](InterfaceProfile.md) | List of network interfaces on the agent. Not populated by default.  |  [optional] [readonly] |
|**asnDetails** | [**EndpointAsnDetails**](EndpointAsnDetails.md) |  |  [optional] |
|**licenseType** | **AgentLicenseType** |  |  [optional] |
|**tcpDriverAvailable** | **Boolean** | Status of TCP test support on the agent. |  [optional] [readonly] |
|**npcapVersion** | **String** | For Windows agents, the version of the NPCAP driver that the agent has loaded. |  [optional] [readonly] |



