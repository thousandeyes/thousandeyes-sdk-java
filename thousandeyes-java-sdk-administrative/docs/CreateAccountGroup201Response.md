

# CreateAccountGroup201Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. |  [optional] |
|**accountGroupName** | **String** | Account group name |  [optional] |
|**isCurrentAccountGroup** | **Boolean** | Indicates whether the requested aid is the context of the current account. |  [optional] |
|**isDefaultAccountGroup** | **Boolean** | Indicates whether the aid is the default one for the requesting user. |  [optional] |
|**organizationName** | **String** | (Optional) Indicates whether the aid is the default one for the requesting user. |  [optional] |
|**users** | [**List&lt;UserAccountGroup&gt;**](UserAccountGroup.md) |  |  [optional] |
|**links** | [**SelfLinksLinks**](SelfLinksLinks.md) |  |  [optional] |



