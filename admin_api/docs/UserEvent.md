

# UserEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. |  [optional] |
|**accountGroupName** | **String** | Account group name |  [optional] |
|**date** | **OffsetDateTime** | UTC event date (ISO date-time format). |  [optional] |
|**event** | **String** | Event type. |  [optional] |
|**ipAddress** | **String** | Source IP address of the user. |  [optional] |
|**uid** | **String** | Unique id representing the user. |  [optional] |
|**user** | **String** | The name and email address of the user. |  [optional] |
|**resources** | [**List&lt;UserEventAllOfResourcesInner&gt;**](UserEventAllOfResourcesInner.md) |  |  [optional] |



