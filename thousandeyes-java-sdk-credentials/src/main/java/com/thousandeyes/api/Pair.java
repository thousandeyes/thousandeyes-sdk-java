/*
 * Credentials API
 * ### Overview Manage credentials for transaction tests using the Credentials API.   The following permissions are required to access Credentials API endpoints:  * `Settings Tests Read` for read operations.  * `Settings Tests Update` for write operations.  * `View sensitive data in web transaction scripts` to view the encrypted value property of credentials.  * `Settings Tests Create Transaction (Tx) Tests` to create credentials.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:28.663365Z[Europe/Lisbon]")
public class Pair {
    private String name = "";
    private String value = "";

    public Pair (String name, String value) {
        setName(name);
        setValue(value);
    }

    private void setName(String name) {
        if (!isValidString(name)) {
            return;
        }

        this.name = name;
    }

    private void setValue(String value) {
        if (!isValidString(value)) {
            return;
        }

        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    private boolean isValidString(String arg) {
        if (arg == null) {
            return false;
        }

        return true;
    }
}
