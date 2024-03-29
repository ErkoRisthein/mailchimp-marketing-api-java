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

import io.github.erkoristhein.mailchimp.marketing.model.Members;
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
 * API tests for SearchMembersApi
 */
@Ignore
public class SearchMembersApiTest {

    private final SearchMembersApi api = new SearchMembersApi();

    
    /**
     * Search members
     *
     * Search for list members. This search can be restricted to a specific list, or can be used to search across all lists in an account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSearchMembersTest() {
        String query = null;
        List<String> fields = null;
        List<String> excludeFields = null;
        String listId = null;

        Members response = api.getSearchMembers(query, fields, excludeFields, listId);

        // TODO: test validations
    }
    
}
