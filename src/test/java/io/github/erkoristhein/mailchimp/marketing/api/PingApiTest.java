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

import io.github.erkoristhein.mailchimp.marketing.model.APIHealthStatus;
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
 * API tests for PingApi
 */
@Disabled
class PingApiTest {

    private final PingApi api = new PingApi();

    
    /**
     * Ping
     *
     * A health check for the API that won&#39;t return any account-specific information.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void getPingTest() {

        APIHealthStatus response = api.getPing();

        // TODO: test validations
    }
    
}
