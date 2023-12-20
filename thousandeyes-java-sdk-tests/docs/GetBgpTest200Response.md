

# GetBgpTest200Response


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
|**links** | [**SelfLinksLinks**](SelfLinksLinks.md) |  |  [optional] |
|**labels** | [**List&lt;TestLabelsInner&gt;**](TestLabelsInner.md) |  |  [optional] [readonly] |
|**sharedWithAccounts** | [**List&lt;TestSharedAccountsInner&gt;**](TestSharedAccountsInner.md) |  |  [optional] [readonly] |
|**monitors** | [**List&lt;Monitor&gt;**](Monitor.md) | Contains list of enabled BGP monitors. |  [optional] [readonly] |
|**includeCoveredPrefixes** | **Boolean** | Indicate if queries for subprefixes detected under this prefix should included. |  [optional] |
|**prefix** | **String** | a.b.c.d is a network address, with the prefix length defined as e. Prefixes can be any length from 8 to 24. |  |
|**usePublicBGP** | **Boolean** | Indicate if all available public BGP monitors should be used. |  [optional] |
|**alertsEnabled** | **Boolean** | Indicates if alerts are enabled. |  [optional] |
|**alertRules** | [**List&lt;AlertRule&gt;**](AlertRule.md) | A list of enabled alert rule objects. |  [optional] |



