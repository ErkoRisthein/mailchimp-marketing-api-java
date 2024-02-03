package io.github.erkoristhein.mailchimp.marketing.api;

import io.github.erkoristhein.mailchimp.marketing.ApiClient;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class SurveysApi {
    private ApiClient apiClient;

    public SurveysApi() {
        this(new ApiClient());
    }

    public SurveysApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Publish a Survey
     * Publish a survey that is in draft, unpublished, or has been previously published and edited.
     * <p><b>200</b> - Survey Published
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param surveyId The ID of the survey. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postListsIdSurveysIdActionsPublish(String listId, String surveyId) throws RestClientException {
        postListsIdSurveysIdActionsPublishWithHttpInfo(listId, surveyId);
    }

    /**
     * Publish a Survey
     * Publish a survey that is in draft, unpublished, or has been previously published and edited.
     * <p><b>200</b> - Survey Published
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param surveyId The ID of the survey. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postListsIdSurveysIdActionsPublishWithHttpInfo(String listId, String surveyId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling postListsIdSurveysIdActionsPublish");
        }
        
        // verify the required parameter 'surveyId' is set
        if (surveyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'surveyId' when calling postListsIdSurveysIdActionsPublish");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("survey_id", surveyId);

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
        return apiClient.invokeAPI("/lists/{list_id}/surveys/{survey_id}/actions/publish", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Unpublish a Survey
     * Unpublish a survey that has been published.
     * <p><b>200</b> - Survey Instance
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param surveyId The ID of the survey. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postListsIdSurveysIdActionsUnpublish(String listId, String surveyId) throws RestClientException {
        postListsIdSurveysIdActionsUnpublishWithHttpInfo(listId, surveyId);
    }

    /**
     * Unpublish a Survey
     * Unpublish a survey that has been published.
     * <p><b>200</b> - Survey Instance
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param surveyId The ID of the survey. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postListsIdSurveysIdActionsUnpublishWithHttpInfo(String listId, String surveyId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling postListsIdSurveysIdActionsUnpublish");
        }
        
        // verify the required parameter 'surveyId' is set
        if (surveyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'surveyId' when calling postListsIdSurveysIdActionsUnpublish");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("survey_id", surveyId);

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
        return apiClient.invokeAPI("/lists/{list_id}/surveys/{survey_id}/actions/unpublish", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}