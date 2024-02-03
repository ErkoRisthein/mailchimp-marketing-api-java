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

import io.github.erkoristhein.mailchimp.marketing.model.Campaigns;
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
 * API tests for SearchCampaignsApi
 */
@Ignore
public class SearchCampaignsApiTest {

    private final SearchCampaignsApi api = new SearchCampaignsApi();

    
    /**
     * Search campaigns
     *
     * Search all campaigns for the specified query terms.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSearchCampaignsTest() {
        String query = null;
        List<String> fields = null;
        List<String> excludeFields = null;

        Campaigns response = api.getSearchCampaigns(query, fields, excludeFields);

        // TODO: test validations
    }
    
}
