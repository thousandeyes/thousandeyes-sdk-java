# thousandeyes-sdk-java-client

This project contains an interface which all created API Clients should conform with - the native
Java
client [thousandeyes-sdk-java-client-native](https://github.com/thousandeyes/thousandeyes-sdk-java/tree/main/thousandeyes-sdk-java-client-native)
shipped alongside this project is an example of such implementation.

It also contains several utility Classes, namely `RateLimitDecorator` that can be used to make sure
the requests getting Rate Limited (HTTP response status code == 429) are automatically retried after
waiting the appropriate amount of time. E.g:

````java
class Example {
    private static final ApiClient apiClient = NativeApiClient
            .builder()
            .baseUri("https://api.stg.thousandeyes.com")
            .bearerToken("<token>")
            .build();

    public static void main(String[] args) {
        var rlApiClient = new RateLimitDecorator(apiClient);
        UsersApi apiInstance = new UsersApi(rlApiClient);
        try {
            var users = apiInstance.getUsers(aid);
        }
        catch (ApiException e) {
            //Treat exception
        }
    }

}
````





