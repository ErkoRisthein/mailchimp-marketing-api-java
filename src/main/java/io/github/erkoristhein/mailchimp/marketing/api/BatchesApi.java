package io.github.erkoristhein.mailchimp.marketing.api;

import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.BaseApi;

import io.github.erkoristhein.mailchimp.marketing.model.Batch;
import io.github.erkoristhein.mailchimp.marketing.model.BatchOperations;
import io.github.erkoristhein.mailchimp.marketing.model.PostBatchesRequest;
import io.github.erkoristhein.mailchimp.marketing.model.ProblemDetailDocument;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class BatchesApi extends BaseApi {

    public BatchesApi() {
        super(new ApiClient());
    }

    public BatchesApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Delete batch request
     * Stops a batch request from running. Since only one batch request is run at a time, this can be used to cancel a long running request. The results of any completed operations will not be available after this call.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param batchId The unique id for the batch operation. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteBatchesId(String batchId) throws RestClientException {
        deleteBatchesIdWithHttpInfo(batchId);
    }

    /**
     * Delete batch request
     * Stops a batch request from running. Since only one batch request is run at a time, this can be used to cancel a long running request. The results of any completed operations will not be available after this call.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param batchId The unique id for the batch operation. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteBatchesIdWithHttpInfo(String batchId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'batchId' is set
        if (batchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batchId' when calling deleteBatchesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("batch_id", batchId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/batches/{batch_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List batch requests
     * Get a summary of batch requests that have been made.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return BatchOperations
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BatchOperations getBatches(List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        return getBatchesWithHttpInfo(fields, excludeFields, count, offset).getBody();
    }

    /**
     * List batch requests
     * Get a summary of batch requests that have been made.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return ResponseEntity&lt;BatchOperations&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BatchOperations> getBatchesWithHttpInfo(List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "exclude_fields", excludeFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        

        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<BatchOperations> localReturnType = new ParameterizedTypeReference<BatchOperations>() {};
        return apiClient.invokeAPI("/batches", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get batch operation status
     * Get the status of a batch request.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param batchId The unique id for the batch operation. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return Batch
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Batch getBatchesId(String batchId, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getBatchesIdWithHttpInfo(batchId, fields, excludeFields).getBody();
    }

    /**
     * Get batch operation status
     * Get the status of a batch request.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param batchId The unique id for the batch operation. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;Batch&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Batch> getBatchesIdWithHttpInfo(String batchId, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'batchId' is set
        if (batchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batchId' when calling getBatchesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("batch_id", batchId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "exclude_fields", excludeFields));
        

        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Batch> localReturnType = new ParameterizedTypeReference<Batch>() {};
        return apiClient.invokeAPI("/batches/{batch_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Start batch operation
     * Begin processing a batch operations request.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param body  (required)
     * @return Batch
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Batch postBatches(PostBatchesRequest body) throws RestClientException {
        return postBatchesWithHttpInfo(body).getBody();
    }

    /**
     * Start batch operation
     * Begin processing a batch operations request.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param body  (required)
     * @return ResponseEntity&lt;Batch&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Batch> postBatchesWithHttpInfo(PostBatchesRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postBatches");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Batch> localReturnType = new ParameterizedTypeReference<Batch>() {};
        return apiClient.invokeAPI("/batches", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    @Override
    public <T> ResponseEntity<T> invokeAPI(String url, HttpMethod method, Object request, ParameterizedTypeReference<T> returnType) throws RestClientException {
        String localVarPath = url.replace(apiClient.getBasePath(), "");
        Object localVarPostBody = request;

        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
