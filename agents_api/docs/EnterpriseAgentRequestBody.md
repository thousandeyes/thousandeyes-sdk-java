

# EnterpriseAgentRequestBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentName** | **String** | Name of the agent. |  [optional] |
|**enabled** | **Boolean** | Flag indicating if the agent is enabled. |  [optional] |
|**accountGroups** | **List&lt;String&gt;** | Contains a list of account groups IDs. See &#x60;/accounts-groups&#x60; for a list of account IDs |  [optional] |
|**ipv6Policy** | **AgentIpv6Policy** |  |  [optional] |
|**keepBrowserCache** | **Boolean** | Flag indicating if the agent retains cache. |  [optional] |
|**targetForTests** | **String** | Test target IP address. |  [optional] |
|**localResolutionPrefixes** | **List&lt;String&gt;** | Public IP ranges for rDNS lookups. The range must be in CIDR notation; for example, 10.1.1.0/24. Maximum of 5 prefixes allowed (Enterprise Agents and Enterprise Agent clusters only). |  [optional] |
|**tests** | **List&lt;String&gt;** | Contains list of test IDs. See &#x60;/tests&#x60; to pull a list of available tests. |  [optional] |



