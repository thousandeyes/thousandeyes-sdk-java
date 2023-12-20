

# GenerateDashboardSnapshotRequest

Request to generate a snapshot from a dashboard.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** | Date and time to start aggregating data (ISO date-time format). |  [optional] |
|**endDate** | **OffsetDateTime** | Date and time to end aggregating data (ISO date-time format). |  [optional] |
|**displayName** | **String** | The name of the snapshot, does not have to be unique. |  [optional] |
|**dashboardId** | **String** | TheIdentifierof the dashboard to generate a snapshot from |  [optional] |
|**anonymizeData** | **Boolean** | Set to &#x60;true&#x60; to anonymize the data in the snapshot. |  [optional] |
|**timezone** | **String** | Specifies the timezone used for date and time fields. |  [optional] |
|**expirationDate** | **OffsetDateTime** | Expiration date of the snapshot. If unspecified, the snapshot expires 1 year from its creation date. The expiration date must be set within 5 years from the current date and adhere to the ISO date-time format. |  [optional] |



