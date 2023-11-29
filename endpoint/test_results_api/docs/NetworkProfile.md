

# NetworkProfile


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ipAddress** | **String** | Network IP address. |  [optional] [readonly] |
|**subnetMask** | **String** | Network subnet mask. |  [optional] [readonly] |
|**publicIpAddress** | **String** | Network public IP address. |  [optional] [readonly] |
|**localPrefix** | **String** | Network local prefix. |  [optional] [readonly] |
|**publicIpRange** | **String** | Network public IP range. |  [optional] [readonly] |
|**dnsServers** | **List&lt;String&gt;** | Network DNS servers. |  [optional] [readonly] |
|**hardwareType** | **InterfaceHardwareType** |  |  [optional] |
|**interfaceName** | **String** | Network interface name. |  [optional] [readonly] |
|**error** | **String** | Only present when there is an error |  [optional] [readonly] |
|**gateway** | **String** | Network gateway address. |  [optional] [readonly] |
|**wirelessProfile** | [**NetworkWirelessProfile**](NetworkWirelessProfile.md) |  |  [optional] |
|**proxyProfile** | [**NetworkProxyProfile**](NetworkProxyProfile.md) |  |  [optional] |
|**ethernetProfile** | [**EthernetProfile**](EthernetProfile.md) |  |  [optional] |
|**previousInterface** | [**NetworkInterface**](NetworkInterface.md) |  |  [optional] |



