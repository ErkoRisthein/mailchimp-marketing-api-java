/*
 * Mailchimp Marketing API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0.81
 * Contact: apihelp@mailchimp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.erkoristhein.mailchimp.marketing.api;

import io.github.erkoristhein.mailchimp.marketing.model.ConnectedSite;
import io.github.erkoristhein.mailchimp.marketing.model.ConnectedSite1;
import io.github.erkoristhein.mailchimp.marketing.model.ConnectedSites;
import io.github.erkoristhein.mailchimp.marketing.model.ProblemDetailDocument;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConnectedSitesApi
 */
@Ignore
public class ConnectedSitesApiTest {

    private final ConnectedSitesApi api = new ConnectedSitesApi();

    
    /**
     * Delete connected site
     *
     * Remove a connected site from your Mailchimp account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteConnectedSitesIdTest() {
        String connectedSiteId = null;

        api.deleteConnectedSitesId(connectedSiteId);

        // TODO: test validations
    }
    
    /**
     * List connected sites
     *
     * Get all connected sites in an account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConnectedSitesTest() {
        List<String> fields = null;
        List<String> excludeFields = null;
        Integer count = null;
        Integer offset = null;

        ConnectedSites response = api.getConnectedSites(fields, excludeFields, count, offset);

        // TODO: test validations
    }
    
    /**
     * Get connected site
     *
     * Get information about a specific connected site.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConnectedSitesIdTest() {
        String connectedSiteId = null;
        List<String> fields = null;
        List<String> excludeFields = null;

        ConnectedSite response = api.getConnectedSitesId(connectedSiteId, fields, excludeFields);

        // TODO: test validations
    }
    
    /**
     * Add connected site
     *
     * Create a new Mailchimp connected site.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postConnectedSitesTest() {
        ConnectedSite1 body = null;

        ConnectedSite response = api.postConnectedSites(body);

        // TODO: test validations
    }
    
    /**
     * Verify connected site script
     *
     * Verify that the connected sites script has been installed, either via the script URL or fragment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postConnectedSitesIdActionsVerifyScriptInstallationTest() {
        String connectedSiteId = null;

        api.postConnectedSitesIdActionsVerifyScriptInstallation(connectedSiteId);

        // TODO: test validations
    }
    
}
