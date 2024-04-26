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

import io.github.erkoristhein.mailchimp.marketing.model.Campaign3;
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
 * API tests for SurveysApi
 */
@Disabled
class SurveysApiTest {

    private final SurveysApi api = new SurveysApi();

    
    /**
     * Create a Survey Campaign
     *
     * Utilize the List ID and Survey ID to generate a Campaign that links to your survey.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void postListsIdSurveysIdActionsCreateEmailTest() {
        String listId = null;
        String surveyId = null;

        Campaign3 response = api.postListsIdSurveysIdActionsCreateEmail(listId, surveyId);

        // TODO: test validations
    }
    
    /**
     * Publish a Survey
     *
     * Publish a survey that is in draft, unpublished, or has been previously published and edited.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void postListsIdSurveysIdActionsPublishTest() {
        String listId = null;
        String surveyId = null;

        api.postListsIdSurveysIdActionsPublish(listId, surveyId);

        // TODO: test validations
    }
    
    /**
     * Unpublish a Survey
     *
     * Unpublish a survey that has been published.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void postListsIdSurveysIdActionsUnpublishTest() {
        String listId = null;
        String surveyId = null;

        api.postListsIdSurveysIdActionsUnpublish(listId, surveyId);

        // TODO: test validations
    }
    
}
