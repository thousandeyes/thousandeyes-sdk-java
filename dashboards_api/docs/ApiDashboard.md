

# ApiDashboard


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**DashboardLinksLinks**](DashboardLinksLinks.md) |  |  [optional] |
|**dashboardId** | **String** | Identifier of a dashboard. |  [optional] [readonly] |
|**title** | **String** | Title of a dashboard. |  [optional] |
|**isBuiltIn** | **Boolean** | Indicates if a dashboard is built-in. True for built-in dashboards, false for user-created dashboards. |  [optional] [readonly] |
|**aid** | **String** | Identifier for the account group associated with a dashboard. |  [optional] [readonly] |
|**dashboardCreatedBy** | **String** | Identifier for the user that created a dashboard. |  [optional] [readonly] |
|**dashboardModifiedBy** | **String** | Identifier for the user that last modified a dashboard. |  [optional] [readonly] |
|**dashboardModifiedDate** | **OffsetDateTime** | UTC date/time when a dashboard was last modified (ISO date-time format). |  [optional] [readonly] |
|**isPrivate** | **Boolean** | A dashboard can be viewed by other users in the account. If true, only the creator of the dashboard may view it. If false, all users in the same account may view it. |  [optional] |
|**isDefaultForUser** | **Boolean** | Indicates whether this dashboard is the user&#39;s default. True for default, false if not. |  [optional] [readonly] |
|**isDefaultForAccount** | **Boolean** | Indicates whether this dashboard is the account group&#39;s default. True for default, false if not. |  [optional] [readonly] |
|**widgets** | [**List&lt;ApiWidget&gt;**](ApiWidget.md) |  |  [optional] |
|**description** | **String** | A text description of the dashboard&#39;s purpose and functionality. This information assists users in understanding the dashboard but isn&#39;t displayed when viewing a dashboard. |  [optional] |
|**defaultTimespan** | [**ApiDefaultTimespan**](ApiDefaultTimespan.md) |  |  [optional] |
|**isGlobalOverride** | **Boolean** | When set to &#x60;true&#x60;, the defaultTimespan is used and overrides the widget&#39;s timespan. If set to &#x60;false&#x60;, the the widget&#39;s timespan is used. |  [optional] |
|**isMigratedReport** | **Boolean** | True if this dashboard was previously a report. |  [optional] [readonly] |



