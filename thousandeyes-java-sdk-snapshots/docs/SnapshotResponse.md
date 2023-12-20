

# SnapshotResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | **Object** |  |  [optional] |
|**id** | **String** | Snapshot ID. |  [optional] |
|**startRoundId** | **Integer** | The start time of the test snapshot, represented in epoch time format (in seconds). |  [optional] [readonly] |
|**endRoundId** | **Integer** | The end time of the test snapshot, represented in epoch time format (in seconds). |  [optional] [readonly] |
|**roundId** | **Integer** | The selected time of the test snapshot, represented in epoch time format (in seconds). |  [optional] [readonly] |
|**shareDate** | **OffsetDateTime** | The date when the test snapshot was created in UTC time, formatted in ISO date-time. |  [optional] |
|**sourceTestId** | **String** | Snapshot test ID. |  [optional] |
|**testId** | **String** | Snapshot test ID. |  [optional] |
|**uid** | **String** | User ID. |  [optional] |
|**displayName** | **String** | Snapshot title. |  [optional] |
|**extraParams** | **String** | Extra parameters. |  [optional] |
|**test** | [**SnapshotResponseAllOfTest**](SnapshotResponseAllOfTest.md) |  |  [optional] |



