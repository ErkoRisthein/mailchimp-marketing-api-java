/*
 * Mailchimp Marketing API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0.55
 * Contact: apihelp@mailchimp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.erkoristhein.mailchimp.marketing.api;

import io.github.erkoristhein.mailchimp.marketing.model.CampaignFolder;
import io.github.erkoristhein.mailchimp.marketing.model.CampaignFolder1;
import io.github.erkoristhein.mailchimp.marketing.model.CampaignFolders;
import io.github.erkoristhein.mailchimp.marketing.model.ProblemDetailDocument;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestClientException;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CampaignFoldersApi
 */
@Disabled
class CampaignFoldersApiTest {

    private final CampaignFoldersApi api = new CampaignFoldersApi();

    
    /**
     * Delete campaign folder
     *
     * Delete a specific campaign folder, and mark all the campaigns in the folder as &#39;unfiled&#39;.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void deleteCampaignFoldersIdTest() {
        String folderId = null;

        api.deleteCampaignFoldersId(folderId);

        // TODO: test validations
    }
    
    /**
     * List campaign folders
     *
     * Get all folders used to organize campaigns.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void getCampaignFoldersTest() {
        List<String> fields = null;
        List<String> excludeFields = null;
        Integer count = null;
        Integer offset = null;

        CampaignFolders response = api.getCampaignFolders(fields, excludeFields, count, offset);

        // TODO: test validations
    }
    
    /**
     * Get campaign folder
     *
     * Get information about a specific folder used to organize campaigns.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void getCampaignFoldersIdTest() {
        String folderId = null;
        List<String> fields = null;
        List<String> excludeFields = null;

        CampaignFolder response = api.getCampaignFoldersId(folderId, fields, excludeFields);

        // TODO: test validations
    }
    
    /**
     * Update campaign folder
     *
     * Update a specific folder used to organize campaigns.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void patchCampaignFoldersIdTest() {
        String folderId = null;
        CampaignFolder1 body = null;

        CampaignFolder response = api.patchCampaignFoldersId(folderId, body);

        // TODO: test validations
    }
    
    /**
     * Add campaign folder
     *
     * Create a new campaign folder.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void postCampaignFoldersTest() {
        CampaignFolder1 body = null;

        CampaignFolder response = api.postCampaignFolders(body);

        // TODO: test validations
    }
    
}
