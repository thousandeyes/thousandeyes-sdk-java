

# ApiDashboardSnapshot


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**DashboardSnapshotLinksLinks**](DashboardSnapshotLinksLinks.md) |  |  [optional] |
|**snapshotId** | **UUID** | Identifier of the dashboard snapshot. |  [optional] |
|**snapshotName** | **String** | Name of the dashboard snapshot. |  [optional] |
|**aid** | **String** | Identifier of the account group that the snapshot belongs to. |  [optional] |
|**isShared** | **Boolean** | Set &#x60;true&#x60; if dashboard snapshot is shared, &#x60;false&#x60; otherwise. |  [optional] |
|**snapshotCreatedDate** | **OffsetDateTime** | UTC date when dashboard snapshot was created (ISO date-time format). |  [optional] |
|**dashboard** | [**ApiDashboardSnapshotAllOfDashboard**](ApiDashboardSnapshotAllOfDashboard.md) |  |  [optional] |
|**widgets** | [**List&lt;ApiWidget&gt;**](ApiWidget.md) |  |  [optional] |
|**isScheduled** | **Boolean** | Set &#x60;true&#x60; if dashboard snapshot was generated from a schedule, &#x60;false&#x60; otherwise. |  [optional] |
|**timeSpan** | [**ApiReportSnapshotTimeSpan**](ApiReportSnapshotTimeSpan.md) |  |  [optional] |
|**snapshotExpirationDate** | **OffsetDateTime** | Expiration date of the snapshot. If unspecified, the snapshot expires 1 year from its creation date. The expiration date must be set within 5 years from the current date and adhere to the ISO date-time format. |  [optional] |



