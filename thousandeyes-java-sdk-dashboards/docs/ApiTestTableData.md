

# ApiTestTableData

Data shown in a test table widget.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**testId** | **String** | Identifier of the test. |  [optional] |
|**testName** | **String** | Name of the test. |  [optional] |
|**target** | **String** | Configured target of the test. |  [optional] |
|**testType** | **String** | Type of the test. |  [optional] |
|**alertCount** | **Long** | Number of active alerts of the test. |  [optional] |
|**isShared** | **Boolean** | Set to &#x60;true&#x60; if test is shared, &#x60;false&#x60; otherwise. |  [optional] |
|**graphlets** | [**List&lt;ApiTestTableGraphletsData&gt;**](ApiTestTableGraphletsData.md) | List of time series points for test metrics in the last 12 hours. |  [optional] |



