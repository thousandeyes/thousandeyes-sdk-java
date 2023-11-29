

# Alert


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | A unique ID for each individual alert occurrence. |  [optional] [readonly] |
|**alertType** | **AlertType** |  |  [optional] |
|**startDate** | **OffsetDateTime** | The start date and time (in UTC, ISO 8601 format) for querying alerts. |  [optional] [readonly] |
|**endDate** | **OffsetDateTime** | The end date and time (in UTC, ISO 8601 format) for querying alerts. |  [optional] [readonly] |
|**violationCount** | **Integer** | Number of sources that meet the alert criteria. |  [optional] |
|**duration** | **BigDecimal** | Duration in seconds the alert was active |  [optional] |
|**links** | [**RuleLinksLinks**](RuleLinksLinks.md) |  |  [optional] |
|**alertRuleId** | **String** | Unique ID of the rule. |  [optional] [readonly] |
|**alertState** | **State** |  |  [optional] |
|**alertSeverity** | **Severity** |  |  [optional] |



