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

import io.github.erkoristhein.mailchimp.marketing.model.BatchWebhook;
import io.github.erkoristhein.mailchimp.marketing.model.BatchWebhook1;
import io.github.erkoristhein.mailchimp.marketing.model.BatchWebhook2;
import io.github.erkoristhein.mailchimp.marketing.model.BatchWebhooks;
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
 * API tests for BatchWebhooksApi
 */
@Ignore
public class BatchWebhooksApiTest {

    private final BatchWebhooksApi api = new BatchWebhooksApi();

    
    /**
     * Delete batch webhook
     *
     * Remove a batch webhook. Webhooks will no longer be sent to the given URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBatchWebhookIdTest() {
        String batchWebhookId = null;

        api.deleteBatchWebhookId(batchWebhookId);

        // TODO: test validations
    }
    
    /**
     * Get batch webhook info
     *
     * Get information about a specific batch webhook.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBatchWebhookTest() {
        String batchWebhookId = null;
        List<String> fields = null;
        List<String> excludeFields = null;

        BatchWebhook response = api.getBatchWebhook(batchWebhookId, fields, excludeFields);

        // TODO: test validations
    }
    
    /**
     * List batch webhooks
     *
     * Get all webhooks that have been configured for batches.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBatchWebhooksTest() {
        List<String> fields = null;
        List<String> excludeFields = null;
        Integer count = null;
        Integer offset = null;

        BatchWebhooks response = api.getBatchWebhooks(fields, excludeFields, count, offset);

        // TODO: test validations
    }
    
    /**
     * Update batch webhook
     *
     * Update a webhook that will fire whenever any batch request completes processing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchBatchWebhooksTest() {
        String batchWebhookId = null;
        BatchWebhook2 body = null;

        BatchWebhook response = api.patchBatchWebhooks(batchWebhookId, body);

        // TODO: test validations
    }
    
    /**
     * Add batch webhook
     *
     * Configure a webhook that will fire whenever any batch request completes processing.  You may only have a maximum of 20 batch webhooks.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postBatchWebhooksTest() {
        BatchWebhook1 body = null;

        BatchWebhook response = api.postBatchWebhooks(body);

        // TODO: test validations
    }
    
}
