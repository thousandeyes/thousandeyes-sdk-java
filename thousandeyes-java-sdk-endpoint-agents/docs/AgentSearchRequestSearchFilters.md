

# AgentSearchRequestSearchFilters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentName** | **List&lt;String&gt;** | Returns only agents with the given name.  This is an exact match only.  |  [optional] |
|**computerName** | **List&lt;String&gt;** | Returns only agents with the given computer name. This is an exact match only.  |  [optional] |
|**username** | **List&lt;String&gt;** | Returns only agents that have at least one user with a name. starting with the provided string. This is a case-insensitive prefix match.  |  [optional] |
|**platform** | **List&lt;Platform&gt;** | Filter on the platform on which the agent is running.  |  [optional] |
|**osVersion** | **List&lt;String&gt;** | Case-insensitive prefix filter on the OS version. |  [optional] |
|**locationCountryISO** | **List&lt;String&gt;** | Filter using the ISO country code of the location.  |  [optional] |
|**locationSubdivision1Code** | **List&lt;String&gt;** | Filter using the code for the first level administrative division within  the country. In US/Canada this is the State, in UK it&#39;s the country e.g. &#x60;ENG&#x60;  |  [optional] |
|**locationCity** | **List&lt;String&gt;** | This is a prefix match on the city name field. The endpoint expects this to contain the  name of the city in English. e.g. &#39;Paris&#39; or &#39;&#39;  |  [optional] |



