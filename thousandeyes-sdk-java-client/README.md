# thousandeyes-sdk-java-client

This project contains an interface which all created API Clients should conform with - the native
Java
client [thousandeyes-sdk-java-client-native](https://github.com/thousandeyes/thousandeyes-sdk-java/tree/main/thousandeyes-sdk-java-client-native)
shipped alongside this project is an example of such implementation.

It also contains several utility Classes, namely `RateLimitHandler` that can be used to make sure
the requests getting Rate Limited (HTTP response status code == 429) are automatically retried after
waiting the appropriate amount of time. For an example of implementation
see `NativeClient.sendRequestAndProcessResponse(...)` from
the [#thousandeyes-sdk-java-client-native](https://github.com/thousandeyes/thousandeyes-sdk-java/tree/main/thousandeyes-sdk-java-client-native)
project.




