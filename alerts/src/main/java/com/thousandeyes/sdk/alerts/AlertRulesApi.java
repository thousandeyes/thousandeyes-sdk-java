/*
 * Alerts API
 * You can manage the following alert functionalities on the ThousandEyes platform using the Alerts API:  * **Alerts**: Retrieve alert details. Alerts are assigned to tests through alert rules.  * **Alert Rules**: Conditions that you configure in order to highlight or be notified of events of interest in your ThousandEyes tests. When an alert rule’s conditions are met, the associated alert is triggered and the alert becomes active. It remains active until the alert is cleared. Alert rules are reusable across multiple tests..  * **Alert Suppression Windows**: Suppress alerts for tests during periods such as planned maintenance. Windows can be one-time events or recurring events to handle periodic occurrences such as monthly downtime for maintenance.  For more information about the alerts, see [Alerts](https://docs.thousandeyes.com/product-documentation/alerts). 
 *
 * The version of the OpenAPI document: 7.0.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.alerts;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.sdk.alerts.model.Error;
import com.thousandeyes.sdk.alerts.model.Rule;
import com.thousandeyes.sdk.alerts.model.RuleDetail;
import com.thousandeyes.sdk.alerts.model.RuleDetailUpdate;
import com.thousandeyes.sdk.alerts.model.Rules;
import java.net.URI;
import com.thousandeyes.sdk.alerts.model.UnauthorizedError;
import com.thousandeyes.sdk.alerts.model.ValidationError;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class AlertRulesApi {
  private final ApiClient apiClient;

  public AlertRulesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create alert rule
   * Creates a new alert rule in your account, using the provided POST data. The &#x60;Edit alert rules&#x60; permission is required to create an alert rule. Note: Assigning an alert rule to a test during creation requires the &#x60;Edit tests&#x60; permission.
   * @param ruleDetailUpdate  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return Rule
   * @throws ApiException if fails to make API call
   */
  public Rule createAlertRule(RuleDetailUpdate ruleDetailUpdate, String aid) throws ApiException {
    ApiResponse<Rule> response = createAlertRuleWithHttpInfo(ruleDetailUpdate, aid);
    return response.getData();
  }

  /**
   * Create alert rule
   * Creates a new alert rule in your account, using the provided POST data. The &#x60;Edit alert rules&#x60; permission is required to create an alert rule. Note: Assigning an alert rule to a test during creation requires the &#x60;Edit tests&#x60; permission.
   * @param ruleDetailUpdate  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Rule&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Rule> createAlertRuleWithHttpInfo(RuleDetailUpdate ruleDetailUpdate, String aid) throws ApiException {
    createAlertRuleValidateRequest(ruleDetailUpdate);

    var requestBuilder = createAlertRuleRequestBuilder(ruleDetailUpdate, aid);

    return apiClient.send(requestBuilder.build(), Rule.class);
  }

  private void createAlertRuleValidateRequest(RuleDetailUpdate ruleDetailUpdate) throws ApiException {
      // verify the required parameter 'ruleDetailUpdate' is set
      if (ruleDetailUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'ruleDetailUpdate' when calling createAlertRule");
      }
  }

  private ApiRequest.ApiRequestBuilder createAlertRuleRequestBuilder(RuleDetailUpdate ruleDetailUpdate, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/alerts/rules";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(ruleDetailUpdate);
    return requestBuilder;
  }
  /**
   * Delete alert rule
   * Deletes an alert rule from your account. Users must have both &#x60;Edit alert rules&#x60; and &#x60;Edit tests&#x60; permissions,  especially if the rule is linked to any tests. Without these permissions, an error occurs.
   * @param ruleId Unique alert rule ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteAlertRule(String ruleId, String aid) throws ApiException {
    deleteAlertRuleWithHttpInfo(ruleId, aid);
  }

  /**
   * Delete alert rule
   * Deletes an alert rule from your account. Users must have both &#x60;Edit alert rules&#x60; and &#x60;Edit tests&#x60; permissions,  especially if the rule is linked to any tests. Without these permissions, an error occurs.
   * @param ruleId Unique alert rule ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAlertRuleWithHttpInfo(String ruleId, String aid) throws ApiException {
    deleteAlertRuleValidateRequest(ruleId);

    var requestBuilder = deleteAlertRuleRequestBuilder(ruleId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteAlertRuleValidateRequest(String ruleId) throws ApiException {
      // verify the required parameter 'ruleId' is set
      if (ruleId == null) {
        throw new ApiException(400, "Missing the required parameter 'ruleId' when calling deleteAlertRule");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteAlertRuleRequestBuilder(String ruleId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/alerts/rules/{ruleId}"
        .replace("{ruleId}", urlEncode(ruleId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Retrieve alert rule
   * Returns detailed information about an alert rule using the &#x60;ruleId&#x60;. If the &#x60;ruleId&#x60; doesn’t exist or is inaccessible by your account, an empty response is returned.
   * @param ruleId Unique alert rule ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return RuleDetail
   * @throws ApiException if fails to make API call
   */
  public RuleDetail getAlertRule(String ruleId, String aid) throws ApiException {
    ApiResponse<RuleDetail> response = getAlertRuleWithHttpInfo(ruleId, aid);
    return response.getData();
  }

  /**
   * Retrieve alert rule
   * Returns detailed information about an alert rule using the &#x60;ruleId&#x60;. If the &#x60;ruleId&#x60; doesn’t exist or is inaccessible by your account, an empty response is returned.
   * @param ruleId Unique alert rule ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;RuleDetail&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RuleDetail> getAlertRuleWithHttpInfo(String ruleId, String aid) throws ApiException {
    getAlertRuleValidateRequest(ruleId);

    var requestBuilder = getAlertRuleRequestBuilder(ruleId, aid);

    return apiClient.send(requestBuilder.build(), RuleDetail.class);
  }

  private void getAlertRuleValidateRequest(String ruleId) throws ApiException {
      // verify the required parameter 'ruleId' is set
      if (ruleId == null) {
        throw new ApiException(400, "Missing the required parameter 'ruleId' when calling getAlertRule");
      }
  }

  private ApiRequest.ApiRequestBuilder getAlertRuleRequestBuilder(String ruleId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/alerts/rules/{ruleId}"
        .replace("{ruleId}", urlEncode(ruleId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * List alert rules
   * Returns a list of alert rules. Default rules for each test type are indicated with a boolean response (true or false); these default alert rules automatically apply to their respective test types.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return Rules
   * @throws ApiException if fails to make API call
   */
  public Rules getAlertsRules(String aid) throws ApiException {
    ApiResponse<Rules> response = getAlertsRulesWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List alert rules
   * Returns a list of alert rules. Default rules for each test type are indicated with a boolean response (true or false); these default alert rules automatically apply to their respective test types.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Rules&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Rules> getAlertsRulesWithHttpInfo(String aid) throws ApiException {
    getAlertsRulesValidateRequest();

    var requestBuilder = getAlertsRulesRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), Rules.class);
  }

  private void getAlertsRulesValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getAlertsRulesRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/alerts/rules";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Update alert rule
   * Modifies an existing alert rule in your account, using the provided POST data. The &#x60;Edit alert rules&#x60; permission is required to modify an alert rule.  Note: Assigning an alert rule to a test during creation requires the &#x60;Edit tests&#x60; permission.
   * @param ruleId Unique alert rule ID. (required)
   * @param ruleDetailUpdate  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return Rule
   * @throws ApiException if fails to make API call
   */
  public Rule updateAlertRule(String ruleId, RuleDetailUpdate ruleDetailUpdate, String aid) throws ApiException {
    ApiResponse<Rule> response = updateAlertRuleWithHttpInfo(ruleId, ruleDetailUpdate, aid);
    return response.getData();
  }

  /**
   * Update alert rule
   * Modifies an existing alert rule in your account, using the provided POST data. The &#x60;Edit alert rules&#x60; permission is required to modify an alert rule.  Note: Assigning an alert rule to a test during creation requires the &#x60;Edit tests&#x60; permission.
   * @param ruleId Unique alert rule ID. (required)
   * @param ruleDetailUpdate  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Rule&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Rule> updateAlertRuleWithHttpInfo(String ruleId, RuleDetailUpdate ruleDetailUpdate, String aid) throws ApiException {
    updateAlertRuleValidateRequest(ruleId, ruleDetailUpdate);

    var requestBuilder = updateAlertRuleRequestBuilder(ruleId, ruleDetailUpdate, aid);

    return apiClient.send(requestBuilder.build(), Rule.class);
  }

  private void updateAlertRuleValidateRequest(String ruleId, RuleDetailUpdate ruleDetailUpdate) throws ApiException {
      // verify the required parameter 'ruleId' is set
      if (ruleId == null) {
        throw new ApiException(400, "Missing the required parameter 'ruleId' when calling updateAlertRule");
      }
      // verify the required parameter 'ruleDetailUpdate' is set
      if (ruleDetailUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'ruleDetailUpdate' when calling updateAlertRule");
      }
  }

  private ApiRequest.ApiRequestBuilder updateAlertRuleRequestBuilder(String ruleId, RuleDetailUpdate ruleDetailUpdate, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/alerts/rules/{ruleId}"
        .replace("{ruleId}", urlEncode(ruleId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(ruleDetailUpdate);
    return requestBuilder;
  }
}
