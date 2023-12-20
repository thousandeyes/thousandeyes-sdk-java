

# TestsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aid** | **Object** | Unique identifier of the account group which owns the test. |  [optional] |
|**accountGroupName** | **Object** | Name of the account group which owns the test. |  [optional] |
|**testId** | **String** | Unique identifier of the test generating usage. |  [optional] |
|**testName** | **String** | Name of the test generating usage. |  [optional] |
|**testType** | **String** | The type of test that generated the usage data. Note that this parameter provides a user-friendly description of the test type and should not be parsed to determine the endpoint for querying configuration details. |  [optional] |
|**cloudUnitsUsed** | **Long** | Number of cloud units that the test has consumed in the usage period. |  [optional] |
|**cloudUnitsProjected** | **Long** | The estimated number of cloud units that the test is expected to consume during the usage period. This estimate is determined by considering the units consumed up to the current time and the test&#39;s configuration. It&#39;s important to note that this value is updated every hour. For new tests, the &#x60;cloudUnitsProjected&#x60; parameter is absent until the projection is calculated. |  [optional] |



