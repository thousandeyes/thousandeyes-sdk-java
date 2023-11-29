

# CreateAgentLabel201Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**labelId** | **String** | Unique ID of the label; this number is negative for built-in labels. Query &#x60;/v7/labels/{type}/{id}&#x60; endpoint to see the list of agent/test/dashboard ids with this label.  |  [optional] |
|**isBuiltIn** | **Boolean** | &#x60;true&#x60; for built-in labels, and &#x60;false&#x60; for user-created labels. Note that built-in labels are read-only.  |  [optional] |
|**name** | **String** | The name of the new label - this must be unique. |  [optional] |
|**type** | **LabelType** |  |  [optional] |
|**ids** | **List&lt;String&gt;** | Array of agent/test/dashboard IDs the label is assigned to, depending on the type of label. |  [optional] |
|**links** | [**SelfLinksLinks**](SelfLinksLinks.md) |  |  [optional] |



