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

import io.github.erkoristhein.mailchimp.marketing.model.ProblemDetailDocument;
import io.github.erkoristhein.mailchimp.marketing.model.TemplateFolder;
import io.github.erkoristhein.mailchimp.marketing.model.TemplateFolder1;
import io.github.erkoristhein.mailchimp.marketing.model.TemplateFolders;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplateFoldersApi
 */
@Ignore
public class TemplateFoldersApiTest {

    private final TemplateFoldersApi api = new TemplateFoldersApi();

    
    /**
     * Delete template folder
     *
     * Delete a specific template folder, and mark all the templates in the folder as &#39;unfiled&#39;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTemplateFoldersIdTest() {
        String folderId = null;

        api.deleteTemplateFoldersId(folderId);

        // TODO: test validations
    }
    
    /**
     * List template folders
     *
     * Get all folders used to organize templates.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplateFoldersTest() {
        List<String> fields = null;
        List<String> excludeFields = null;
        Integer count = null;
        Integer offset = null;

        TemplateFolders response = api.getTemplateFolders(fields, excludeFields, count, offset);

        // TODO: test validations
    }
    
    /**
     * Get template folder
     *
     * Get information about a specific folder used to organize templates.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplateFoldersIdTest() {
        String folderId = null;
        List<String> fields = null;
        List<String> excludeFields = null;

        TemplateFolder response = api.getTemplateFoldersId(folderId, fields, excludeFields);

        // TODO: test validations
    }
    
    /**
     * Update template folder
     *
     * Update a specific folder used to organize templates.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchTemplateFoldersIdTest() {
        String folderId = null;
        TemplateFolder1 body = null;

        TemplateFolder response = api.patchTemplateFoldersId(folderId, body);

        // TODO: test validations
    }
    
    /**
     * Add template folder
     *
     * Create a new template folder.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postTemplateFoldersTest() {
        TemplateFolder1 body = null;

        TemplateFolder response = api.postTemplateFolders(body);

        // TODO: test validations
    }
    
}