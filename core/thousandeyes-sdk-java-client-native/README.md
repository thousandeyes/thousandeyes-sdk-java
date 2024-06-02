# thousandeyes-sdk-java-client-native

This project contains a Java native client that can be used to call the ThousandEyes API.

By default, it retries the responses which are Rate Limited (HTTP response status code == 429)
within `NativeClient.sendRequestAndProcessResponse(...)` using `RateLimitHandler`. 



