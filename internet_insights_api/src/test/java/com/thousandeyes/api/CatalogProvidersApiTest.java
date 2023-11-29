/*
 * Internet Insights API
 * # Overview We are happy to announce the release of the Internet Insights API set. This limited release includes endpoints that: * Make our catalog provider and Internet outage data accessible to API users. * Provide access to advanced filtering, which is part of our next-generation API efforts to allow API users to fine-tune queries across all of our APIs in a consistent manner.  Internet Insights provide visibility into core Internet infrastructure, including: ISPs, DNS providers, IaaS, CDNs , and SaaS providers. It tracks the macro-level impact of Internet events on individual users and enterprise networks connecting at the edge of the Internet. These events include: Outages, Routing hijacks and leaks, DDoS attacks, And political interference, among others.  Future releases of the Internet Insights API set will further unlock access to core Internet Insights functionality, unlocking potential integrations to enrich customer process flows. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api;

import com.thousandeyes.ApiException;
import com.thousandeyes.api.model.ApiCatalogProviderDetailsResponse;
import com.thousandeyes.api.model.ApiCatalogProviderFilter;
import com.thousandeyes.api.model.ApiCatalogProviderResponse;
import com.thousandeyes.api.model.Error;
import java.util.UUID;
import com.thousandeyes.api.model.UnauthorizedError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CatalogProvidersApi
 */
@Disabled
public class CatalogProvidersApiTest {

    private final CatalogProvidersApi api = new CatalogProvidersApi();

    /**
     * List catalog providers
     *
     * Returns a list of catalog providers using the specified filters. Returns high-level information about each catalog provider. For more details about a specific provider, call the Get a catalog provider endpoint.  &lt;b&gt;Note:&lt;/b&gt; Support for pagination will be added in the future. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void catalogProviderListTest() throws ApiException {
        ApiCatalogProviderFilter apiCatalogProviderFilter = null;
        String aid = null;
        ApiCatalogProviderResponse response = api.catalogProviderList(apiCatalogProviderFilter, aid);
        // TODO: test validations
    }

    /**
     * Retrieve a catalog provider
     *
     * Returns the details of a catalog provider. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCatalogProviderTest() throws ApiException {
        UUID providerId = null;
        String aid = null;
        ApiCatalogProviderDetailsResponse response = api.getCatalogProvider(providerId, aid);
        // TODO: test validations
    }

}
