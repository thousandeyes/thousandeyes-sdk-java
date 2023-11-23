

# EnterpriseAgent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ipAddresses** | **List&lt;String&gt;** | Array of private IP addresses. |  [optional] [readonly] |
|**publicIpAddresses** | **List&lt;String&gt;** | Array of public IP addresses. |  [optional] [readonly] |
|**network** | **String** | Network (including ASN) of agent’s public IP. |  [optional] [readonly] |
|**agentId** | **String** | Unique ID of the agent. |  [optional] [readonly] |
|**agentName** | **String** | Name of the agent. |  [optional] |
|**agentType** | **CloudEnterpriseAgentType** |  |  [optional] |
|**location** | **String** | Location of the agent. |  [optional] [readonly] |
|**countryId** | **String** | 2-digit ISO country code |  [optional] [readonly] |
|**enabled** | **Boolean** | Flag indicating if the agent is enabled. |  [optional] |
|**verifySslCertificates** | **Boolean** | Flag indicating if has normal SSL operations or  if instead it&#39;s set to ignore SSL errors on browserbot-based tests. |  [optional] [readonly] |
|**clusterMembers** | [**List&lt;ClusterMember&gt;**](ClusterMember.md) | If an enterprise agent is clustered, detailed information about each cluster member will be shown as array entries in the clusterMembers field. This field is not shown for Enterprise Agents in standalone mode, or for Cloud Agents. |  [optional] [readonly] |
|**utilization** | **Integer** | Shows overall utilization percentage (online Enterprise Agents and Enterprise Clusters only). |  [optional] [readonly] |
|**accountGroups** | [**List&lt;AccountGroup1&gt;**](AccountGroup1.md) | List of account groups. See /accounts-groups to pull a list of account IDs |  [optional] |
|**prefix** | **String** | Prefix containing agents public IP address. |  [optional] [readonly] |
|**ipv6Policy** | **EnterpriseAgentIpv6Policy** |  |  [optional] |
|**errorDetails** | [**List&lt;ErrorDetail&gt;**](ErrorDetail.md) | If an enterprise agent or a cluster member presents at least one error, the errors will be shown as an array of entries in the errorDetails field (Enterprise Agents and Enterprise Cluster members only) |  [optional] [readonly] |
|**hostname** | **String** | Fully qualified domain name of the agent (Enterprise Agents only) |  [optional] [readonly] |
|**lastSeen** | **OffsetDateTime** | UTC last seen date (ISO date-time format). |  [optional] [readonly] |
|**agentState** | **EnterpriseAgentState** |  |  [optional] |
|**keepBrowserCache** | **Boolean** | Flag indicating if the agent retains cache. |  [optional] |
|**createdDate** | **OffsetDateTime** | UTC Agent creation date (ISO date-time format). |  [optional] [readonly] |
|**targetForTests** | **String** | Test target IP address. |  [optional] |
|**localResolutionPrefixes** | **List&lt;String&gt;** | To perform rDNS lookups for public IP ranges, this field represents the public IP ranges. The range must be in CIDR notation; for example, 10.1.1.0/24. Maximum of 5 prefixes allowed (Enterprise Agents and Enterprise Agent clusters only). |  [optional] |
|**interfaceIpMappings** | [**List&lt;InterfaceIpMapping&gt;**](InterfaceIpMapping.md) |  |  [optional] [readonly] |



