/*
 * Test Templates API
 *  ## Overview  Test templates allow you create a set of tests, alert rules, dashboards, and labels from a single template configuration file.    The following applies to test templates:  * You can create tests for monitoring common services and applications such as Microsoft 365, Webex, and others using a predefined set of certified templates.  * Test templates reduce the time and complexity of creating tests for common SaaS or other services by providing a set of templates for creating tests, alert rules, and other assets within the ThousandEyes platform.  * Templates created with an account group in a particular organization are visible to all account groups in that organization, provided they have the `View Test Templates` permission.  * Credentials (usernames, passwords, tokens, etc.) can be included in a test template only as placeholders whose value is provided by user input when the template is deployed. Creating or updating a test template that contains a credentials field in plain text will result in a bad request (HTTP 400).  * The schemas to use for `labels`, `tests`, `alertRules` and `dashboards` are defined at https://developer.thousandeyes.com/v7/.  * To support referencing an asset from another asset of a different type (for example, defining the `testId` field of an `alertRule` by referencing the ID of a test defined in the template itself), the deployment of assets is done in a specific order:      1. Labels     2. Tests     3. Alert rules     4. Dashboards      For a given asset type, you can reference any asset type with a higher order. (For example, labels cannot reference other assets in the template; tests can only reference labels; alert rules can reference tests and labels, etc.)
 *
 * The version of the OpenAPI document: 7.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:29.528444Z[Europe/Lisbon]")
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
