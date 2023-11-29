

# TestTemplate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The ID of the test template. |  [optional] |
|**name** | **String** | The name of the test template. |  [optional] |
|**description** | **String** | Text that describes the test template. |  [optional] |
|**icon** | **String** | Icon for the test template; will be displayed in the UI. |  [optional] |
|**isBuiltIn** | **Boolean** | Indicates whether the test template is a built-in template. Note that built-in test templates are read-only. |  [optional] |
|**certificationLevel** | **String** |  |  [optional] |
|**dateCreated** | **String** | The date and time the test template was created. |  [optional] |
|**userInputs** | [**Map&lt;String, UserInput&gt;**](UserInput.md) |  |  [optional] |
|**labels** | **Object** | A map of &lt;labelKey, labelConfiguration&gt;. |  [optional] |
|**tests** | **Object** | A map of &lt;testKey, testConfiguration&gt;. |  [optional] |
|**alertRules** | **Object** | A map of &lt;alertRuleKey, alertRuleConfiguration&gt;. |  [optional] |
|**dashboards** | **Object** | A map of &lt;dashboardKey, dashboardConfiguration&gt;. |  [optional] |
|**deploymentStrategy** | **Map&lt;String, DeploymentStrategy&gt;** | A map of &lt;assetKey, deploymentStrategy&gt;. |  [optional] |
|**links** | [**Map&lt;String, Link&gt;**](Link.md) |  |  [optional] |



