package io.github.erkoristhein.mailchimp.marketing.api;

import io.github.erkoristhein.mailchimp.marketing.ApiClient;

import io.github.erkoristhein.mailchimp.marketing.model.AbuseComplaint;
import io.github.erkoristhein.mailchimp.marketing.model.AbuseComplaints;
import io.github.erkoristhein.mailchimp.marketing.model.AddListMembers1;
import io.github.erkoristhein.mailchimp.marketing.model.AddListMembers2;
import io.github.erkoristhein.mailchimp.marketing.model.AddListMembers3;
import io.github.erkoristhein.mailchimp.marketing.model.AddWebhook;
import io.github.erkoristhein.mailchimp.marketing.model.BatchAddRemoveListMembersToFromStaticSegment;
import io.github.erkoristhein.mailchimp.marketing.model.BatchUpdateListMembers;
import io.github.erkoristhein.mailchimp.marketing.model.CollectionOfEvents;
import io.github.erkoristhein.mailchimp.marketing.model.CollectionOfMemberActivityEvents;
import io.github.erkoristhein.mailchimp.marketing.model.CollectionOfMergeFields;
import io.github.erkoristhein.mailchimp.marketing.model.CollectionOfNotes;
import io.github.erkoristhein.mailchimp.marketing.model.CollectionOfSegments;
import io.github.erkoristhein.mailchimp.marketing.model.CollectionOfTags;
import io.github.erkoristhein.mailchimp.marketing.model.EmailClients;
import io.github.erkoristhein.mailchimp.marketing.model.Events;
import io.github.erkoristhein.mailchimp.marketing.model.GrowthHistory;
import io.github.erkoristhein.mailchimp.marketing.model.Interest;
import io.github.erkoristhein.mailchimp.marketing.model.Interest1;
import io.github.erkoristhein.mailchimp.marketing.model.InterestCategory;
import io.github.erkoristhein.mailchimp.marketing.model.InterestCategory1;
import io.github.erkoristhein.mailchimp.marketing.model.InterestGroupings;
import io.github.erkoristhein.mailchimp.marketing.model.Interests;
import io.github.erkoristhein.mailchimp.marketing.model.List7;
import io.github.erkoristhein.mailchimp.marketing.model.List8;
import io.github.erkoristhein.mailchimp.marketing.model.List9;
import io.github.erkoristhein.mailchimp.marketing.model.ListActivity;
import io.github.erkoristhein.mailchimp.marketing.model.ListLocations;
import io.github.erkoristhein.mailchimp.marketing.model.ListMembers1;
import io.github.erkoristhein.mailchimp.marketing.model.ListMembers2;
import io.github.erkoristhein.mailchimp.marketing.model.ListSignupForms;
import io.github.erkoristhein.mailchimp.marketing.model.ListWebhooks;
import io.github.erkoristhein.mailchimp.marketing.model.MemberActivityEvents;
import io.github.erkoristhein.mailchimp.marketing.model.MemberActivityEvents1;
import io.github.erkoristhein.mailchimp.marketing.model.MemberNotes;
import io.github.erkoristhein.mailchimp.marketing.model.MemberNotes1;
import io.github.erkoristhein.mailchimp.marketing.model.MemberTags;
import io.github.erkoristhein.mailchimp.marketing.model.MembersToAddRemoveToFromAStaticSegment;
import io.github.erkoristhein.mailchimp.marketing.model.MembersToSubscribeUnsubscribeToFromAListInBatch;
import io.github.erkoristhein.mailchimp.marketing.model.MergeField;
import io.github.erkoristhein.mailchimp.marketing.model.MergeField1;
import io.github.erkoristhein.mailchimp.marketing.model.MergeField2;
import io.github.erkoristhein.mailchimp.marketing.model.PostListsIdSegmentsIdMembersRequest;
import io.github.erkoristhein.mailchimp.marketing.model.ProblemDetailDocument;
import io.github.erkoristhein.mailchimp.marketing.model.SegmentMembers;
import io.github.erkoristhein.mailchimp.marketing.model.SignupForm;
import io.github.erkoristhein.mailchimp.marketing.model.SignupForm1;
import io.github.erkoristhein.mailchimp.marketing.model.SubscriberList;
import io.github.erkoristhein.mailchimp.marketing.model.SubscriberList1;
import io.github.erkoristhein.mailchimp.marketing.model.SubscriberList2;
import io.github.erkoristhein.mailchimp.marketing.model.SubscriberLists;
import io.github.erkoristhein.mailchimp.marketing.model.TagSearchResults;

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
public class ListsApi {
    private ApiClient apiClient;

    public ListsApi() {
        this(new ApiClient());
    }

    public ListsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete list
     * Delete a list from your Mailchimp account. If you delete a list, you&#39;ll lose the list history—including subscriber activity, unsubscribes, complaints, and bounces. You’ll also lose subscribers’ email addresses, unless you exported and backed up your list.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteListsId(String listId) throws RestClientException {
        deleteListsIdWithHttpInfo(listId);
    }

    /**
     * Delete list
     * Delete a list from your Mailchimp account. If you delete a list, you&#39;ll lose the list history—including subscriber activity, unsubscribes, complaints, and bounces. You’ll also lose subscribers’ email addresses, unless you exported and backed up your list.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteListsIdWithHttpInfo(String listId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling deleteListsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

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
        return apiClient.invokeAPI("/lists/{list_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete interest category
     * Delete a specific interest category.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param interestCategoryId The unique ID for the interest category. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteListsIdInterestCategoriesId(String listId, String interestCategoryId) throws RestClientException {
        deleteListsIdInterestCategoriesIdWithHttpInfo(listId, interestCategoryId);
    }

    /**
     * Delete interest category
     * Delete a specific interest category.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param interestCategoryId The unique ID for the interest category. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteListsIdInterestCategoriesIdWithHttpInfo(String listId, String interestCategoryId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling deleteListsIdInterestCategoriesId");
        }
        
        // verify the required parameter 'interestCategoryId' is set
        if (interestCategoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'interestCategoryId' when calling deleteListsIdInterestCategoriesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("interest_category_id", interestCategoryId);

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
        return apiClient.invokeAPI("/lists/{list_id}/interest-categories/{interest_category_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete interest in category
     * Delete interests or group names in a specific category.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param interestCategoryId The unique ID for the interest category. (required)
     * @param interestId The specific interest or &#39;group name&#39;. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteListsIdInterestCategoriesIdInterestsId(String listId, String interestCategoryId, String interestId) throws RestClientException {
        deleteListsIdInterestCategoriesIdInterestsIdWithHttpInfo(listId, interestCategoryId, interestId);
    }

    /**
     * Delete interest in category
     * Delete interests or group names in a specific category.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param interestCategoryId The unique ID for the interest category. (required)
     * @param interestId The specific interest or &#39;group name&#39;. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteListsIdInterestCategoriesIdInterestsIdWithHttpInfo(String listId, String interestCategoryId, String interestId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling deleteListsIdInterestCategoriesIdInterestsId");
        }
        
        // verify the required parameter 'interestCategoryId' is set
        if (interestCategoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'interestCategoryId' when calling deleteListsIdInterestCategoriesIdInterestsId");
        }
        
        // verify the required parameter 'interestId' is set
        if (interestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'interestId' when calling deleteListsIdInterestCategoriesIdInterestsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("interest_category_id", interestCategoryId);
        uriVariables.put("interest_id", interestId);

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
        return apiClient.invokeAPI("/lists/{list_id}/interest-categories/{interest_category_id}/interests/{interest_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Archive list member
     * Archive a list member. To permanently delete, use the delete-permanent action.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteListsIdMembersId(String listId, String subscriberHash) throws RestClientException {
        deleteListsIdMembersIdWithHttpInfo(listId, subscriberHash);
    }

    /**
     * Archive list member
     * Archive a list member. To permanently delete, use the delete-permanent action.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteListsIdMembersIdWithHttpInfo(String listId, String subscriberHash) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling deleteListsIdMembersId");
        }
        
        // verify the required parameter 'subscriberHash' is set
        if (subscriberHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriberHash' when calling deleteListsIdMembersId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("subscriber_hash", subscriberHash);

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
        return apiClient.invokeAPI("/lists/{list_id}/members/{subscriber_hash}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete note
     * Delete a specific note for a specific list member.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param noteId The id for the note. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteListsIdMembersIdNotesId(String listId, String subscriberHash, String noteId) throws RestClientException {
        deleteListsIdMembersIdNotesIdWithHttpInfo(listId, subscriberHash, noteId);
    }

    /**
     * Delete note
     * Delete a specific note for a specific list member.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param noteId The id for the note. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteListsIdMembersIdNotesIdWithHttpInfo(String listId, String subscriberHash, String noteId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling deleteListsIdMembersIdNotesId");
        }
        
        // verify the required parameter 'subscriberHash' is set
        if (subscriberHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriberHash' when calling deleteListsIdMembersIdNotesId");
        }
        
        // verify the required parameter 'noteId' is set
        if (noteId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'noteId' when calling deleteListsIdMembersIdNotesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("subscriber_hash", subscriberHash);
        uriVariables.put("note_id", noteId);

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
        return apiClient.invokeAPI("/lists/{list_id}/members/{subscriber_hash}/notes/{note_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete merge field
     * Delete a specific merge field.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param mergeId The id for the merge field. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteListsIdMergeFieldsId(String listId, String mergeId) throws RestClientException {
        deleteListsIdMergeFieldsIdWithHttpInfo(listId, mergeId);
    }

    /**
     * Delete merge field
     * Delete a specific merge field.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param mergeId The id for the merge field. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteListsIdMergeFieldsIdWithHttpInfo(String listId, String mergeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling deleteListsIdMergeFieldsId");
        }
        
        // verify the required parameter 'mergeId' is set
        if (mergeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mergeId' when calling deleteListsIdMergeFieldsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("merge_id", mergeId);

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
        return apiClient.invokeAPI("/lists/{list_id}/merge-fields/{merge_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete segment
     * Delete a specific segment in a list.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param segmentId The unique id for the segment. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteListsIdSegmentsId(String listId, String segmentId) throws RestClientException {
        deleteListsIdSegmentsIdWithHttpInfo(listId, segmentId);
    }

    /**
     * Delete segment
     * Delete a specific segment in a list.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param segmentId The unique id for the segment. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteListsIdSegmentsIdWithHttpInfo(String listId, String segmentId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling deleteListsIdSegmentsId");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling deleteListsIdSegmentsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("segment_id", segmentId);

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
        return apiClient.invokeAPI("/lists/{list_id}/segments/{segment_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Remove list member from segment
     * Remove a member from the specified static segment.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param segmentId The unique id for the segment. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteListsIdSegmentsIdMembersId(String listId, String segmentId, String subscriberHash) throws RestClientException {
        deleteListsIdSegmentsIdMembersIdWithHttpInfo(listId, segmentId, subscriberHash);
    }

    /**
     * Remove list member from segment
     * Remove a member from the specified static segment.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param segmentId The unique id for the segment. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteListsIdSegmentsIdMembersIdWithHttpInfo(String listId, String segmentId, String subscriberHash) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling deleteListsIdSegmentsIdMembersId");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling deleteListsIdSegmentsIdMembersId");
        }
        
        // verify the required parameter 'subscriberHash' is set
        if (subscriberHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriberHash' when calling deleteListsIdSegmentsIdMembersId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("segment_id", segmentId);
        uriVariables.put("subscriber_hash", subscriberHash);

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
        return apiClient.invokeAPI("/lists/{list_id}/segments/{segment_id}/members/{subscriber_hash}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete webhook
     * Delete a specific webhook in a list.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param webhookId The webhook&#39;s id. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteListsIdWebhooksId(String listId, String webhookId) throws RestClientException {
        deleteListsIdWebhooksIdWithHttpInfo(listId, webhookId);
    }

    /**
     * Delete webhook
     * Delete a specific webhook in a list.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param webhookId The webhook&#39;s id. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteListsIdWebhooksIdWithHttpInfo(String listId, String webhookId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling deleteListsIdWebhooksId");
        }
        
        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'webhookId' when calling deleteListsIdWebhooksId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("webhook_id", webhookId);

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
        return apiClient.invokeAPI("/lists/{list_id}/webhooks/{webhook_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List member tags
     * Get the tags on a list member.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return CollectionOfTags
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CollectionOfTags getListMemberTags(String listId, String subscriberHash, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        return getListMemberTagsWithHttpInfo(listId, subscriberHash, fields, excludeFields, count, offset).getBody();
    }

    /**
     * List member tags
     * Get the tags on a list member.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return ResponseEntity&lt;CollectionOfTags&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CollectionOfTags> getListMemberTagsWithHttpInfo(String listId, String subscriberHash, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListMemberTags");
        }
        
        // verify the required parameter 'subscriberHash' is set
        if (subscriberHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriberHash' when calling getListMemberTags");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("subscriber_hash", subscriberHash);

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

        ParameterizedTypeReference<CollectionOfTags> localReturnType = new ParameterizedTypeReference<CollectionOfTags>() {};
        return apiClient.invokeAPI("/lists/{list_id}/members/{subscriber_hash}/tags", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get lists info
     * Get information about all lists in the account.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param beforeDateCreated Restrict response to lists created before the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param sinceDateCreated Restrict results to lists created after the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param beforeCampaignLastSent Restrict results to lists created before the last campaign send date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param sinceCampaignLastSent Restrict results to lists created after the last campaign send date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param email Restrict results to lists that include a specific subscriber&#39;s email address. (optional)
     * @param sortField Returns files sorted by the specified field. (optional)
     * @param sortDir Determines the order direction for sorted results. (optional)
     * @param hasEcommerceStore Restrict results to lists that contain an active, connected, undeleted ecommerce store. (optional)
     * @param includeTotalContacts Return the total_contacts field in the stats response, which contains an approximate count of all contacts in any state. (optional)
     * @return SubscriberLists
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriberLists getLists(List<String> fields, List<String> excludeFields, Integer count, Integer offset, String beforeDateCreated, String sinceDateCreated, String beforeCampaignLastSent, String sinceCampaignLastSent, String email, String sortField, String sortDir, Boolean hasEcommerceStore, Boolean includeTotalContacts) throws RestClientException {
        return getListsWithHttpInfo(fields, excludeFields, count, offset, beforeDateCreated, sinceDateCreated, beforeCampaignLastSent, sinceCampaignLastSent, email, sortField, sortDir, hasEcommerceStore, includeTotalContacts).getBody();
    }

    /**
     * Get lists info
     * Get information about all lists in the account.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param beforeDateCreated Restrict response to lists created before the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param sinceDateCreated Restrict results to lists created after the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param beforeCampaignLastSent Restrict results to lists created before the last campaign send date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param sinceCampaignLastSent Restrict results to lists created after the last campaign send date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param email Restrict results to lists that include a specific subscriber&#39;s email address. (optional)
     * @param sortField Returns files sorted by the specified field. (optional)
     * @param sortDir Determines the order direction for sorted results. (optional)
     * @param hasEcommerceStore Restrict results to lists that contain an active, connected, undeleted ecommerce store. (optional)
     * @param includeTotalContacts Return the total_contacts field in the stats response, which contains an approximate count of all contacts in any state. (optional)
     * @return ResponseEntity&lt;SubscriberLists&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriberLists> getListsWithHttpInfo(List<String> fields, List<String> excludeFields, Integer count, Integer offset, String beforeDateCreated, String sinceDateCreated, String beforeCampaignLastSent, String sinceCampaignLastSent, String email, String sortField, String sortDir, Boolean hasEcommerceStore, Boolean includeTotalContacts) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "exclude_fields", excludeFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "before_date_created", beforeDateCreated));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "since_date_created", sinceDateCreated));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "before_campaign_last_sent", beforeCampaignLastSent));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "since_campaign_last_sent", sinceCampaignLastSent));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "email", email));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort_field", sortField));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort_dir", sortDir));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "has_ecommerce_store", hasEcommerceStore));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_total_contacts", includeTotalContacts));


        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<SubscriberLists> localReturnType = new ParameterizedTypeReference<SubscriberLists>() {};
        return apiClient.invokeAPI("/lists", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get list info
     * Get information about a specific list in your Mailchimp account. Results include list members who have signed up but haven&#39;t confirmed their subscription yet and unsubscribed or cleaned.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param includeTotalContacts Return the total_contacts field in the stats response, which contains an approximate count of all contacts in any state. (optional)
     * @return SubscriberList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriberList getListsId(String listId, List<String> fields, List<String> excludeFields, Boolean includeTotalContacts) throws RestClientException {
        return getListsIdWithHttpInfo(listId, fields, excludeFields, includeTotalContacts).getBody();
    }

    /**
     * Get list info
     * Get information about a specific list in your Mailchimp account. Results include list members who have signed up but haven&#39;t confirmed their subscription yet and unsubscribed or cleaned.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param includeTotalContacts Return the total_contacts field in the stats response, which contains an approximate count of all contacts in any state. (optional)
     * @return ResponseEntity&lt;SubscriberList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriberList> getListsIdWithHttpInfo(String listId, List<String> fields, List<String> excludeFields, Boolean includeTotalContacts) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "exclude_fields", excludeFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_total_contacts", includeTotalContacts));


        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<SubscriberList> localReturnType = new ParameterizedTypeReference<SubscriberList>() {};
        return apiClient.invokeAPI("/lists/{list_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List abuse reports
     * Get all abuse reports for a specific list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return AbuseComplaints
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AbuseComplaints getListsIdAbuseReports(String listId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        return getListsIdAbuseReportsWithHttpInfo(listId, fields, excludeFields, count, offset).getBody();
    }

    /**
     * List abuse reports
     * Get all abuse reports for a specific list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return ResponseEntity&lt;AbuseComplaints&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AbuseComplaints> getListsIdAbuseReportsWithHttpInfo(String listId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdAbuseReports");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

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

        ParameterizedTypeReference<AbuseComplaints> localReturnType = new ParameterizedTypeReference<AbuseComplaints>() {};
        return apiClient.invokeAPI("/lists/{list_id}/abuse-reports", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get abuse report
     * Get details about a specific abuse report.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param reportId The id for the abuse report. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return AbuseComplaint
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AbuseComplaint getListsIdAbuseReportsId(String listId, String reportId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        return getListsIdAbuseReportsIdWithHttpInfo(listId, reportId, fields, excludeFields, count, offset).getBody();
    }

    /**
     * Get abuse report
     * Get details about a specific abuse report.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param reportId The id for the abuse report. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return ResponseEntity&lt;AbuseComplaint&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AbuseComplaint> getListsIdAbuseReportsIdWithHttpInfo(String listId, String reportId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdAbuseReportsId");
        }
        
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reportId' when calling getListsIdAbuseReportsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("report_id", reportId);

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

        ParameterizedTypeReference<AbuseComplaint> localReturnType = new ParameterizedTypeReference<AbuseComplaint>() {};
        return apiClient.invokeAPI("/lists/{list_id}/abuse-reports/{report_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List recent activity
     * Get up to the previous 180 days of daily detailed aggregated activity stats for a list, not including Automation activity.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ListActivity
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListActivity getListsIdActivity(String listId, Integer count, Integer offset, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getListsIdActivityWithHttpInfo(listId, count, offset, fields, excludeFields).getBody();
    }

    /**
     * List recent activity
     * Get up to the previous 180 days of daily detailed aggregated activity stats for a list, not including Automation activity.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;ListActivity&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListActivity> getListsIdActivityWithHttpInfo(String listId, Integer count, Integer offset, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdActivity");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "exclude_fields", excludeFields));


        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<ListActivity> localReturnType = new ParameterizedTypeReference<ListActivity>() {};
        return apiClient.invokeAPI("/lists/{list_id}/activity", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List top email clients
     * Get a list of the top email clients based on user-agent strings.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return EmailClients
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EmailClients getListsIdClients(String listId, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getListsIdClientsWithHttpInfo(listId, fields, excludeFields).getBody();
    }

    /**
     * List top email clients
     * Get a list of the top email clients based on user-agent strings.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;EmailClients&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EmailClients> getListsIdClientsWithHttpInfo(String listId, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdClients");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

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

        ParameterizedTypeReference<EmailClients> localReturnType = new ParameterizedTypeReference<EmailClients>() {};
        return apiClient.invokeAPI("/lists/{list_id}/clients", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List growth history data
     * Get a month-by-month summary of a specific list&#39;s growth activity.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param sortField Returns files sorted by the specified field. (optional)
     * @param sortDir Determines the order direction for sorted results. (optional)
     * @return GrowthHistory
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GrowthHistory getListsIdGrowthHistory(String listId, List<String> fields, List<String> excludeFields, Integer count, Integer offset, String sortField, String sortDir) throws RestClientException {
        return getListsIdGrowthHistoryWithHttpInfo(listId, fields, excludeFields, count, offset, sortField, sortDir).getBody();
    }

    /**
     * List growth history data
     * Get a month-by-month summary of a specific list&#39;s growth activity.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param sortField Returns files sorted by the specified field. (optional)
     * @param sortDir Determines the order direction for sorted results. (optional)
     * @return ResponseEntity&lt;GrowthHistory&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GrowthHistory> getListsIdGrowthHistoryWithHttpInfo(String listId, List<String> fields, List<String> excludeFields, Integer count, Integer offset, String sortField, String sortDir) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdGrowthHistory");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "exclude_fields", excludeFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort_field", sortField));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort_dir", sortDir));


        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<GrowthHistory> localReturnType = new ParameterizedTypeReference<GrowthHistory>() {};
        return apiClient.invokeAPI("/lists/{list_id}/growth-history", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get growth history by month
     * Get a summary of a specific list&#39;s growth activity for a specific month and year.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param month A specific month of list growth history. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return GrowthHistory
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GrowthHistory getListsIdGrowthHistoryId(String listId, String month, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getListsIdGrowthHistoryIdWithHttpInfo(listId, month, fields, excludeFields).getBody();
    }

    /**
     * Get growth history by month
     * Get a summary of a specific list&#39;s growth activity for a specific month and year.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param month A specific month of list growth history. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;GrowthHistory&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GrowthHistory> getListsIdGrowthHistoryIdWithHttpInfo(String listId, String month, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdGrowthHistoryId");
        }
        
        // verify the required parameter 'month' is set
        if (month == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'month' when calling getListsIdGrowthHistoryId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("month", month);

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

        ParameterizedTypeReference<GrowthHistory> localReturnType = new ParameterizedTypeReference<GrowthHistory>() {};
        return apiClient.invokeAPI("/lists/{list_id}/growth-history/{month}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List interest categories
     * Get information about a list&#39;s interest categories.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param type Restrict results a type of interest group (optional)
     * @return InterestGroupings
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InterestGroupings getListsIdInterestCategories(String listId, List<String> fields, List<String> excludeFields, Integer count, Integer offset, String type) throws RestClientException {
        return getListsIdInterestCategoriesWithHttpInfo(listId, fields, excludeFields, count, offset, type).getBody();
    }

    /**
     * List interest categories
     * Get information about a list&#39;s interest categories.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param type Restrict results a type of interest group (optional)
     * @return ResponseEntity&lt;InterestGroupings&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InterestGroupings> getListsIdInterestCategoriesWithHttpInfo(String listId, List<String> fields, List<String> excludeFields, Integer count, Integer offset, String type) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdInterestCategories");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "exclude_fields", excludeFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));


        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<InterestGroupings> localReturnType = new ParameterizedTypeReference<InterestGroupings>() {};
        return apiClient.invokeAPI("/lists/{list_id}/interest-categories", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get interest category info
     * Get information about a specific interest category.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param interestCategoryId The unique ID for the interest category. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return InterestCategory
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InterestCategory getListsIdInterestCategoriesId(String listId, String interestCategoryId, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getListsIdInterestCategoriesIdWithHttpInfo(listId, interestCategoryId, fields, excludeFields).getBody();
    }

    /**
     * Get interest category info
     * Get information about a specific interest category.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param interestCategoryId The unique ID for the interest category. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;InterestCategory&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InterestCategory> getListsIdInterestCategoriesIdWithHttpInfo(String listId, String interestCategoryId, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdInterestCategoriesId");
        }
        
        // verify the required parameter 'interestCategoryId' is set
        if (interestCategoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'interestCategoryId' when calling getListsIdInterestCategoriesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("interest_category_id", interestCategoryId);

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

        ParameterizedTypeReference<InterestCategory> localReturnType = new ParameterizedTypeReference<InterestCategory>() {};
        return apiClient.invokeAPI("/lists/{list_id}/interest-categories/{interest_category_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List interests in category
     * Get a list of this category&#39;s interests.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param interestCategoryId The unique ID for the interest category. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return Interests
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Interests getListsIdInterestCategoriesIdInterests(String listId, String interestCategoryId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        return getListsIdInterestCategoriesIdInterestsWithHttpInfo(listId, interestCategoryId, fields, excludeFields, count, offset).getBody();
    }

    /**
     * List interests in category
     * Get a list of this category&#39;s interests.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param interestCategoryId The unique ID for the interest category. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return ResponseEntity&lt;Interests&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Interests> getListsIdInterestCategoriesIdInterestsWithHttpInfo(String listId, String interestCategoryId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdInterestCategoriesIdInterests");
        }
        
        // verify the required parameter 'interestCategoryId' is set
        if (interestCategoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'interestCategoryId' when calling getListsIdInterestCategoriesIdInterests");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("interest_category_id", interestCategoryId);

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

        ParameterizedTypeReference<Interests> localReturnType = new ParameterizedTypeReference<Interests>() {};
        return apiClient.invokeAPI("/lists/{list_id}/interest-categories/{interest_category_id}/interests", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get interest in category
     * Get interests or &#39;group names&#39; for a specific category.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param interestCategoryId The unique ID for the interest category. (required)
     * @param interestId The specific interest or &#39;group name&#39;. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return Interest
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Interest getListsIdInterestCategoriesIdInterestsId(String listId, String interestCategoryId, String interestId, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getListsIdInterestCategoriesIdInterestsIdWithHttpInfo(listId, interestCategoryId, interestId, fields, excludeFields).getBody();
    }

    /**
     * Get interest in category
     * Get interests or &#39;group names&#39; for a specific category.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param interestCategoryId The unique ID for the interest category. (required)
     * @param interestId The specific interest or &#39;group name&#39;. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;Interest&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Interest> getListsIdInterestCategoriesIdInterestsIdWithHttpInfo(String listId, String interestCategoryId, String interestId, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdInterestCategoriesIdInterestsId");
        }
        
        // verify the required parameter 'interestCategoryId' is set
        if (interestCategoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'interestCategoryId' when calling getListsIdInterestCategoriesIdInterestsId");
        }
        
        // verify the required parameter 'interestId' is set
        if (interestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'interestId' when calling getListsIdInterestCategoriesIdInterestsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("interest_category_id", interestCategoryId);
        uriVariables.put("interest_id", interestId);

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

        ParameterizedTypeReference<Interest> localReturnType = new ParameterizedTypeReference<Interest>() {};
        return apiClient.invokeAPI("/lists/{list_id}/interest-categories/{interest_category_id}/interests/{interest_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List locations
     * Get the locations (countries) that the list&#39;s subscribers have been tagged to based on geocoding their IP address.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ListLocations
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListLocations getListsIdLocations(String listId, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getListsIdLocationsWithHttpInfo(listId, fields, excludeFields).getBody();
    }

    /**
     * List locations
     * Get the locations (countries) that the list&#39;s subscribers have been tagged to based on geocoding their IP address.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;ListLocations&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListLocations> getListsIdLocationsWithHttpInfo(String listId, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdLocations");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

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

        ParameterizedTypeReference<ListLocations> localReturnType = new ParameterizedTypeReference<ListLocations>() {};
        return apiClient.invokeAPI("/lists/{list_id}/locations", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List members info
     * Get information about members in a specific Mailchimp list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param emailType The email type. (optional)
     * @param status The subscriber&#39;s status. (optional)
     * @param sinceTimestampOpt Restrict results to subscribers who opted-in after the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param beforeTimestampOpt Restrict results to subscribers who opted-in before the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param sinceLastChanged Restrict results to subscribers whose information changed after the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param beforeLastChanged Restrict results to subscribers whose information changed before the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param uniqueEmailId A unique identifier for the email address across all Mailchimp lists. (optional)
     * @param vipOnly A filter to return only the list&#39;s VIP members. Passing &#x60;true&#x60; will restrict results to VIP list members, passing &#x60;false&#x60; will return all list members. (optional)
     * @param interestCategoryId The unique id for the interest category. (optional)
     * @param interestIds Used to filter list members by interests. Must be accompanied by interest_category_id and interest_match. The value must be a comma separated list of interest ids present for any supplied interest categories. (optional)
     * @param interestMatch Used to filter list members by interests. Must be accompanied by interest_category_id and interest_ids. \&quot;any\&quot; will match a member with any of the interest supplied, \&quot;all\&quot; will only match members with every interest supplied, and \&quot;none\&quot; will match members without any of the interest supplied. (optional)
     * @param sortField Returns files sorted by the specified field. (optional)
     * @param sortDir Determines the order direction for sorted results. (optional)
     * @param sinceLastCampaign Filter subscribers by those subscribed/unsubscribed/pending/cleaned since last email campaign send. Member status is required to use this filter. (optional)
     * @param unsubscribedSince Filter subscribers by those unsubscribed since a specific date. Using any status other than unsubscribed with this filter will result in an error. (optional)
     * @return ListMembers2
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListMembers2 getListsIdMembers(String listId, List<String> fields, List<String> excludeFields, Integer count, Integer offset, String emailType, String status, String sinceTimestampOpt, String beforeTimestampOpt, String sinceLastChanged, String beforeLastChanged, String uniqueEmailId, Boolean vipOnly, String interestCategoryId, String interestIds, String interestMatch, String sortField, String sortDir, Boolean sinceLastCampaign, String unsubscribedSince) throws RestClientException {
        return getListsIdMembersWithHttpInfo(listId, fields, excludeFields, count, offset, emailType, status, sinceTimestampOpt, beforeTimestampOpt, sinceLastChanged, beforeLastChanged, uniqueEmailId, vipOnly, interestCategoryId, interestIds, interestMatch, sortField, sortDir, sinceLastCampaign, unsubscribedSince).getBody();
    }

    /**
     * List members info
     * Get information about members in a specific Mailchimp list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param emailType The email type. (optional)
     * @param status The subscriber&#39;s status. (optional)
     * @param sinceTimestampOpt Restrict results to subscribers who opted-in after the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param beforeTimestampOpt Restrict results to subscribers who opted-in before the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param sinceLastChanged Restrict results to subscribers whose information changed after the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param beforeLastChanged Restrict results to subscribers whose information changed before the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param uniqueEmailId A unique identifier for the email address across all Mailchimp lists. (optional)
     * @param vipOnly A filter to return only the list&#39;s VIP members. Passing &#x60;true&#x60; will restrict results to VIP list members, passing &#x60;false&#x60; will return all list members. (optional)
     * @param interestCategoryId The unique id for the interest category. (optional)
     * @param interestIds Used to filter list members by interests. Must be accompanied by interest_category_id and interest_match. The value must be a comma separated list of interest ids present for any supplied interest categories. (optional)
     * @param interestMatch Used to filter list members by interests. Must be accompanied by interest_category_id and interest_ids. \&quot;any\&quot; will match a member with any of the interest supplied, \&quot;all\&quot; will only match members with every interest supplied, and \&quot;none\&quot; will match members without any of the interest supplied. (optional)
     * @param sortField Returns files sorted by the specified field. (optional)
     * @param sortDir Determines the order direction for sorted results. (optional)
     * @param sinceLastCampaign Filter subscribers by those subscribed/unsubscribed/pending/cleaned since last email campaign send. Member status is required to use this filter. (optional)
     * @param unsubscribedSince Filter subscribers by those unsubscribed since a specific date. Using any status other than unsubscribed with this filter will result in an error. (optional)
     * @return ResponseEntity&lt;ListMembers2&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListMembers2> getListsIdMembersWithHttpInfo(String listId, List<String> fields, List<String> excludeFields, Integer count, Integer offset, String emailType, String status, String sinceTimestampOpt, String beforeTimestampOpt, String sinceLastChanged, String beforeLastChanged, String uniqueEmailId, Boolean vipOnly, String interestCategoryId, String interestIds, String interestMatch, String sortField, String sortDir, Boolean sinceLastCampaign, String unsubscribedSince) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdMembers");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "exclude_fields", excludeFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "email_type", emailType));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "since_timestamp_opt", sinceTimestampOpt));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "before_timestamp_opt", beforeTimestampOpt));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "since_last_changed", sinceLastChanged));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "before_last_changed", beforeLastChanged));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "unique_email_id", uniqueEmailId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "vip_only", vipOnly));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "interest_category_id", interestCategoryId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "interest_ids", interestIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "interest_match", interestMatch));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort_field", sortField));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort_dir", sortDir));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "since_last_campaign", sinceLastCampaign));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "unsubscribed_since", unsubscribedSince));


        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<ListMembers2> localReturnType = new ParameterizedTypeReference<ListMembers2>() {};
        return apiClient.invokeAPI("/lists/{list_id}/members", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get member info
     * Get information about a specific list member, including a currently subscribed, unsubscribed, or bounced member.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ListMembers2
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListMembers2 getListsIdMembersId(String listId, String subscriberHash, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getListsIdMembersIdWithHttpInfo(listId, subscriberHash, fields, excludeFields).getBody();
    }

    /**
     * Get member info
     * Get information about a specific list member, including a currently subscribed, unsubscribed, or bounced member.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;ListMembers2&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListMembers2> getListsIdMembersIdWithHttpInfo(String listId, String subscriberHash, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdMembersId");
        }
        
        // verify the required parameter 'subscriberHash' is set
        if (subscriberHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriberHash' when calling getListsIdMembersId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("subscriber_hash", subscriberHash);

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

        ParameterizedTypeReference<ListMembers2> localReturnType = new ParameterizedTypeReference<ListMembers2>() {};
        return apiClient.invokeAPI("/lists/{list_id}/members/{subscriber_hash}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * View recent activity 50
     * Get the last 50 events of a member&#39;s activity on a specific list, including opens, clicks, and unsubscribes.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param action A comma seperated list of actions to return. (optional)
     * @return MemberActivityEvents
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MemberActivityEvents getListsIdMembersIdActivity(String listId, String subscriberHash, List<String> fields, List<String> excludeFields, List<String> action) throws RestClientException {
        return getListsIdMembersIdActivityWithHttpInfo(listId, subscriberHash, fields, excludeFields, action).getBody();
    }

    /**
     * View recent activity 50
     * Get the last 50 events of a member&#39;s activity on a specific list, including opens, clicks, and unsubscribes.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param action A comma seperated list of actions to return. (optional)
     * @return ResponseEntity&lt;MemberActivityEvents&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MemberActivityEvents> getListsIdMembersIdActivityWithHttpInfo(String listId, String subscriberHash, List<String> fields, List<String> excludeFields, List<String> action) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdMembersIdActivity");
        }
        
        // verify the required parameter 'subscriberHash' is set
        if (subscriberHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriberHash' when calling getListsIdMembersIdActivity");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("subscriber_hash", subscriberHash);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "exclude_fields", excludeFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "action", action));


        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<MemberActivityEvents> localReturnType = new ParameterizedTypeReference<MemberActivityEvents>() {};
        return apiClient.invokeAPI("/lists/{list_id}/members/{subscriber_hash}/activity", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * View recent activity
     * Get a member&#39;s activity on a specific list, including opens, clicks, and unsubscribes.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param activityFilters A comma-separated list of activity filters that correspond to a set of activity types, e.g \&quot;?activity_filters&#x3D;open,bounce,click\&quot;. (optional)
     * @return MemberActivityEvents1
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MemberActivityEvents1 getListsIdMembersIdActivityFeed(String listId, String subscriberHash, List<String> fields, List<String> excludeFields, Integer count, Integer offset, List<String> activityFilters) throws RestClientException {
        return getListsIdMembersIdActivityFeedWithHttpInfo(listId, subscriberHash, fields, excludeFields, count, offset, activityFilters).getBody();
    }

    /**
     * View recent activity
     * Get a member&#39;s activity on a specific list, including opens, clicks, and unsubscribes.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param activityFilters A comma-separated list of activity filters that correspond to a set of activity types, e.g \&quot;?activity_filters&#x3D;open,bounce,click\&quot;. (optional)
     * @return ResponseEntity&lt;MemberActivityEvents1&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MemberActivityEvents1> getListsIdMembersIdActivityFeedWithHttpInfo(String listId, String subscriberHash, List<String> fields, List<String> excludeFields, Integer count, Integer offset, List<String> activityFilters) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdMembersIdActivityFeed");
        }
        
        // verify the required parameter 'subscriberHash' is set
        if (subscriberHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriberHash' when calling getListsIdMembersIdActivityFeed");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("subscriber_hash", subscriberHash);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "exclude_fields", excludeFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "activity_filters", activityFilters));


        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<MemberActivityEvents1> localReturnType = new ParameterizedTypeReference<MemberActivityEvents1>() {};
        return apiClient.invokeAPI("/lists/{list_id}/members/{subscriber_hash}/activity-feed", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List member events
     * Get events for a contact.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return CollectionOfEvents
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CollectionOfEvents getListsIdMembersIdEvents(String listId, String subscriberHash, Integer count, Integer offset, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getListsIdMembersIdEventsWithHttpInfo(listId, subscriberHash, count, offset, fields, excludeFields).getBody();
    }

    /**
     * List member events
     * Get events for a contact.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;CollectionOfEvents&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CollectionOfEvents> getListsIdMembersIdEventsWithHttpInfo(String listId, String subscriberHash, Integer count, Integer offset, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdMembersIdEvents");
        }
        
        // verify the required parameter 'subscriberHash' is set
        if (subscriberHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriberHash' when calling getListsIdMembersIdEvents");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("subscriber_hash", subscriberHash);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "exclude_fields", excludeFields));


        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<CollectionOfEvents> localReturnType = new ParameterizedTypeReference<CollectionOfEvents>() {};
        return apiClient.invokeAPI("/lists/{list_id}/members/{subscriber_hash}/events", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List member goal events
     * Get the last 50 Goal events for a member on a specific list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return CollectionOfMemberActivityEvents
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CollectionOfMemberActivityEvents getListsIdMembersIdGoals(String listId, String subscriberHash, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getListsIdMembersIdGoalsWithHttpInfo(listId, subscriberHash, fields, excludeFields).getBody();
    }

    /**
     * List member goal events
     * Get the last 50 Goal events for a member on a specific list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;CollectionOfMemberActivityEvents&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CollectionOfMemberActivityEvents> getListsIdMembersIdGoalsWithHttpInfo(String listId, String subscriberHash, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdMembersIdGoals");
        }
        
        // verify the required parameter 'subscriberHash' is set
        if (subscriberHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriberHash' when calling getListsIdMembersIdGoals");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("subscriber_hash", subscriberHash);

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

        ParameterizedTypeReference<CollectionOfMemberActivityEvents> localReturnType = new ParameterizedTypeReference<CollectionOfMemberActivityEvents>() {};
        return apiClient.invokeAPI("/lists/{list_id}/members/{subscriber_hash}/goals", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List recent member notes
     * Get recent notes for a specific list member.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. (required)
     * @param sortField Returns notes sorted by the specified field. (optional)
     * @param sortDir Determines the order direction for sorted results. (optional)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return CollectionOfNotes
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CollectionOfNotes getListsIdMembersIdNotes(String listId, String subscriberHash, String sortField, String sortDir, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        return getListsIdMembersIdNotesWithHttpInfo(listId, subscriberHash, sortField, sortDir, fields, excludeFields, count, offset).getBody();
    }

    /**
     * List recent member notes
     * Get recent notes for a specific list member.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. (required)
     * @param sortField Returns notes sorted by the specified field. (optional)
     * @param sortDir Determines the order direction for sorted results. (optional)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return ResponseEntity&lt;CollectionOfNotes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CollectionOfNotes> getListsIdMembersIdNotesWithHttpInfo(String listId, String subscriberHash, String sortField, String sortDir, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdMembersIdNotes");
        }
        
        // verify the required parameter 'subscriberHash' is set
        if (subscriberHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriberHash' when calling getListsIdMembersIdNotes");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("subscriber_hash", subscriberHash);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort_field", sortField));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort_dir", sortDir));
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

        ParameterizedTypeReference<CollectionOfNotes> localReturnType = new ParameterizedTypeReference<CollectionOfNotes>() {};
        return apiClient.invokeAPI("/lists/{list_id}/members/{subscriber_hash}/notes", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get member note
     * Get a specific note for a specific list member.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param noteId The id for the note. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return MemberNotes
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MemberNotes getListsIdMembersIdNotesId(String listId, String subscriberHash, String noteId, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getListsIdMembersIdNotesIdWithHttpInfo(listId, subscriberHash, noteId, fields, excludeFields).getBody();
    }

    /**
     * Get member note
     * Get a specific note for a specific list member.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param noteId The id for the note. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;MemberNotes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MemberNotes> getListsIdMembersIdNotesIdWithHttpInfo(String listId, String subscriberHash, String noteId, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdMembersIdNotesId");
        }
        
        // verify the required parameter 'subscriberHash' is set
        if (subscriberHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriberHash' when calling getListsIdMembersIdNotesId");
        }
        
        // verify the required parameter 'noteId' is set
        if (noteId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'noteId' when calling getListsIdMembersIdNotesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("subscriber_hash", subscriberHash);
        uriVariables.put("note_id", noteId);

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

        ParameterizedTypeReference<MemberNotes> localReturnType = new ParameterizedTypeReference<MemberNotes>() {};
        return apiClient.invokeAPI("/lists/{list_id}/members/{subscriber_hash}/notes/{note_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List merge fields
     * Get a list of all merge fields for an audience.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param type The merge field type. (optional)
     * @param required Whether it&#39;s a required merge field. (optional)
     * @return CollectionOfMergeFields
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CollectionOfMergeFields getListsIdMergeFields(String listId, List<String> fields, List<String> excludeFields, Integer count, Integer offset, String type, Boolean required) throws RestClientException {
        return getListsIdMergeFieldsWithHttpInfo(listId, fields, excludeFields, count, offset, type, required).getBody();
    }

    /**
     * List merge fields
     * Get a list of all merge fields for an audience.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param type The merge field type. (optional)
     * @param required Whether it&#39;s a required merge field. (optional)
     * @return ResponseEntity&lt;CollectionOfMergeFields&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CollectionOfMergeFields> getListsIdMergeFieldsWithHttpInfo(String listId, List<String> fields, List<String> excludeFields, Integer count, Integer offset, String type, Boolean required) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdMergeFields");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "exclude_fields", excludeFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "required", required));


        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<CollectionOfMergeFields> localReturnType = new ParameterizedTypeReference<CollectionOfMergeFields>() {};
        return apiClient.invokeAPI("/lists/{list_id}/merge-fields", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get merge field
     * Get information about a specific merge field.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param mergeId The id for the merge field. (required)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @return MergeField
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MergeField getListsIdMergeFieldsId(String listId, String mergeId, List<String> excludeFields, List<String> fields) throws RestClientException {
        return getListsIdMergeFieldsIdWithHttpInfo(listId, mergeId, excludeFields, fields).getBody();
    }

    /**
     * Get merge field
     * Get information about a specific merge field.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param mergeId The id for the merge field. (required)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;MergeField&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MergeField> getListsIdMergeFieldsIdWithHttpInfo(String listId, String mergeId, List<String> excludeFields, List<String> fields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdMergeFieldsId");
        }
        
        // verify the required parameter 'mergeId' is set
        if (mergeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mergeId' when calling getListsIdMergeFieldsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("merge_id", mergeId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "exclude_fields", excludeFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));


        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<MergeField> localReturnType = new ParameterizedTypeReference<MergeField>() {};
        return apiClient.invokeAPI("/lists/{list_id}/merge-fields/{merge_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get segment info
     * Get information about a specific segment.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param segmentId The unique id for the segment. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param includeCleaned Include cleaned members in response (optional)
     * @param includeTransactional Include transactional members in response (optional)
     * @param includeUnsubscribed Include unsubscribed members in response (optional)
     * @return List7
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List7 getListsIdSegmentsId(String listId, String segmentId, List<String> fields, List<String> excludeFields, Boolean includeCleaned, Boolean includeTransactional, Boolean includeUnsubscribed) throws RestClientException {
        return getListsIdSegmentsIdWithHttpInfo(listId, segmentId, fields, excludeFields, includeCleaned, includeTransactional, includeUnsubscribed).getBody();
    }

    /**
     * Get segment info
     * Get information about a specific segment.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param segmentId The unique id for the segment. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param includeCleaned Include cleaned members in response (optional)
     * @param includeTransactional Include transactional members in response (optional)
     * @param includeUnsubscribed Include unsubscribed members in response (optional)
     * @return ResponseEntity&lt;List7&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List7> getListsIdSegmentsIdWithHttpInfo(String listId, String segmentId, List<String> fields, List<String> excludeFields, Boolean includeCleaned, Boolean includeTransactional, Boolean includeUnsubscribed) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdSegmentsId");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling getListsIdSegmentsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("segment_id", segmentId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "exclude_fields", excludeFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_cleaned", includeCleaned));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_transactional", includeTransactional));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_unsubscribed", includeUnsubscribed));


        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<List7> localReturnType = new ParameterizedTypeReference<List7>() {};
        return apiClient.invokeAPI("/lists/{list_id}/segments/{segment_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List members in segment
     * Get information about members in a saved segment.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param segmentId The unique id for the segment. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param includeCleaned Include cleaned members in response (optional)
     * @param includeTransactional Include transactional members in response (optional)
     * @param includeUnsubscribed Include unsubscribed members in response (optional)
     * @return SegmentMembers
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SegmentMembers getListsIdSegmentsIdMembers(String listId, String segmentId, List<String> fields, List<String> excludeFields, Integer count, Integer offset, Boolean includeCleaned, Boolean includeTransactional, Boolean includeUnsubscribed) throws RestClientException {
        return getListsIdSegmentsIdMembersWithHttpInfo(listId, segmentId, fields, excludeFields, count, offset, includeCleaned, includeTransactional, includeUnsubscribed).getBody();
    }

    /**
     * List members in segment
     * Get information about members in a saved segment.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param segmentId The unique id for the segment. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param includeCleaned Include cleaned members in response (optional)
     * @param includeTransactional Include transactional members in response (optional)
     * @param includeUnsubscribed Include unsubscribed members in response (optional)
     * @return ResponseEntity&lt;SegmentMembers&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SegmentMembers> getListsIdSegmentsIdMembersWithHttpInfo(String listId, String segmentId, List<String> fields, List<String> excludeFields, Integer count, Integer offset, Boolean includeCleaned, Boolean includeTransactional, Boolean includeUnsubscribed) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdSegmentsIdMembers");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling getListsIdSegmentsIdMembers");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("segment_id", segmentId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "exclude_fields", excludeFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_cleaned", includeCleaned));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_transactional", includeTransactional));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_unsubscribed", includeUnsubscribed));


        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<SegmentMembers> localReturnType = new ParameterizedTypeReference<SegmentMembers>() {};
        return apiClient.invokeAPI("/lists/{list_id}/segments/{segment_id}/members", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List signup forms
     * Get signup forms for a specific list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @return ListSignupForms
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListSignupForms getListsIdSignupForms(String listId) throws RestClientException {
        return getListsIdSignupFormsWithHttpInfo(listId).getBody();
    }

    /**
     * List signup forms
     * Get signup forms for a specific list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @return ResponseEntity&lt;ListSignupForms&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListSignupForms> getListsIdSignupFormsWithHttpInfo(String listId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdSignupForms");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

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

        ParameterizedTypeReference<ListSignupForms> localReturnType = new ParameterizedTypeReference<ListSignupForms>() {};
        return apiClient.invokeAPI("/lists/{list_id}/signup-forms", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get information about all surveys for a list
     * Get information about all available surveys for a specific list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getListsIdSurveys(String listId) throws RestClientException {
        getListsIdSurveysWithHttpInfo(listId);
    }

    /**
     * Get information about all surveys for a list
     * Get information about all available surveys for a specific list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getListsIdSurveysWithHttpInfo(String listId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdSurveys");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

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
        return apiClient.invokeAPI("/lists/{list_id}/surveys", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get survey
     * Get details about a specific survey.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param surveyId The ID of the survey. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getListsIdSurveysId(String listId, String surveyId) throws RestClientException {
        getListsIdSurveysIdWithHttpInfo(listId, surveyId);
    }

    /**
     * Get survey
     * Get details about a specific survey.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param surveyId The ID of the survey. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getListsIdSurveysIdWithHttpInfo(String listId, String surveyId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdSurveysId");
        }
        
        // verify the required parameter 'surveyId' is set
        if (surveyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'surveyId' when calling getListsIdSurveysId");
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
        return apiClient.invokeAPI("/lists/{list_id}/surveys/{survey_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List webhooks
     * Get information about all webhooks for a specific list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @return ListWebhooks
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListWebhooks getListsIdWebhooks(String listId) throws RestClientException {
        return getListsIdWebhooksWithHttpInfo(listId).getBody();
    }

    /**
     * List webhooks
     * Get information about all webhooks for a specific list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @return ResponseEntity&lt;ListWebhooks&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListWebhooks> getListsIdWebhooksWithHttpInfo(String listId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdWebhooks");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

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

        ParameterizedTypeReference<ListWebhooks> localReturnType = new ParameterizedTypeReference<ListWebhooks>() {};
        return apiClient.invokeAPI("/lists/{list_id}/webhooks", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get webhook info
     * Get information about a specific webhook.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param webhookId The webhook&#39;s id. (required)
     * @return ListWebhooks
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListWebhooks getListsIdWebhooksId(String listId, String webhookId) throws RestClientException {
        return getListsIdWebhooksIdWithHttpInfo(listId, webhookId).getBody();
    }

    /**
     * Get webhook info
     * Get information about a specific webhook.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param webhookId The webhook&#39;s id. (required)
     * @return ResponseEntity&lt;ListWebhooks&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListWebhooks> getListsIdWebhooksIdWithHttpInfo(String listId, String webhookId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling getListsIdWebhooksId");
        }
        
        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'webhookId' when calling getListsIdWebhooksId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("webhook_id", webhookId);

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

        ParameterizedTypeReference<ListWebhooks> localReturnType = new ParameterizedTypeReference<ListWebhooks>() {};
        return apiClient.invokeAPI("/lists/{list_id}/webhooks/{webhook_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update lists
     * Update the settings for a specific list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param body  (required)
     * @return SubscriberList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriberList patchListsId(String listId, SubscriberList2 body) throws RestClientException {
        return patchListsIdWithHttpInfo(listId, body).getBody();
    }

    /**
     * Update lists
     * Update the settings for a specific list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;SubscriberList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriberList> patchListsIdWithHttpInfo(String listId, SubscriberList2 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling patchListsId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchListsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

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

        ParameterizedTypeReference<SubscriberList> localReturnType = new ParameterizedTypeReference<SubscriberList>() {};
        return apiClient.invokeAPI("/lists/{list_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update interest category
     * Update a specific interest category.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param interestCategoryId The unique ID for the interest category. (required)
     * @param body  (required)
     * @return InterestCategory
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InterestCategory patchListsIdInterestCategoriesId(String listId, String interestCategoryId, InterestCategory1 body) throws RestClientException {
        return patchListsIdInterestCategoriesIdWithHttpInfo(listId, interestCategoryId, body).getBody();
    }

    /**
     * Update interest category
     * Update a specific interest category.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param interestCategoryId The unique ID for the interest category. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;InterestCategory&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InterestCategory> patchListsIdInterestCategoriesIdWithHttpInfo(String listId, String interestCategoryId, InterestCategory1 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling patchListsIdInterestCategoriesId");
        }
        
        // verify the required parameter 'interestCategoryId' is set
        if (interestCategoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'interestCategoryId' when calling patchListsIdInterestCategoriesId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchListsIdInterestCategoriesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("interest_category_id", interestCategoryId);

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

        ParameterizedTypeReference<InterestCategory> localReturnType = new ParameterizedTypeReference<InterestCategory>() {};
        return apiClient.invokeAPI("/lists/{list_id}/interest-categories/{interest_category_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update interest in category
     * Update interests or &#39;group names&#39; for a specific category.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param interestCategoryId The unique ID for the interest category. (required)
     * @param interestId The specific interest or &#39;group name&#39;. (required)
     * @param body  (required)
     * @return Interest
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Interest patchListsIdInterestCategoriesIdInterestsId(String listId, String interestCategoryId, String interestId, Interest1 body) throws RestClientException {
        return patchListsIdInterestCategoriesIdInterestsIdWithHttpInfo(listId, interestCategoryId, interestId, body).getBody();
    }

    /**
     * Update interest in category
     * Update interests or &#39;group names&#39; for a specific category.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param interestCategoryId The unique ID for the interest category. (required)
     * @param interestId The specific interest or &#39;group name&#39;. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;Interest&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Interest> patchListsIdInterestCategoriesIdInterestsIdWithHttpInfo(String listId, String interestCategoryId, String interestId, Interest1 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling patchListsIdInterestCategoriesIdInterestsId");
        }
        
        // verify the required parameter 'interestCategoryId' is set
        if (interestCategoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'interestCategoryId' when calling patchListsIdInterestCategoriesIdInterestsId");
        }
        
        // verify the required parameter 'interestId' is set
        if (interestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'interestId' when calling patchListsIdInterestCategoriesIdInterestsId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchListsIdInterestCategoriesIdInterestsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("interest_category_id", interestCategoryId);
        uriVariables.put("interest_id", interestId);

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

        ParameterizedTypeReference<Interest> localReturnType = new ParameterizedTypeReference<Interest>() {};
        return apiClient.invokeAPI("/lists/{list_id}/interest-categories/{interest_category_id}/interests/{interest_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update list member
     * Update information for a specific list member.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param body  (required)
     * @param skipMergeValidation If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false. (optional)
     * @return ListMembers2
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListMembers2 patchListsIdMembersId(String listId, String subscriberHash, AddListMembers3 body, Boolean skipMergeValidation) throws RestClientException {
        return patchListsIdMembersIdWithHttpInfo(listId, subscriberHash, body, skipMergeValidation).getBody();
    }

    /**
     * Update list member
     * Update information for a specific list member.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param body  (required)
     * @param skipMergeValidation If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false. (optional)
     * @return ResponseEntity&lt;ListMembers2&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListMembers2> patchListsIdMembersIdWithHttpInfo(String listId, String subscriberHash, AddListMembers3 body, Boolean skipMergeValidation) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling patchListsIdMembersId");
        }
        
        // verify the required parameter 'subscriberHash' is set
        if (subscriberHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriberHash' when calling patchListsIdMembersId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchListsIdMembersId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("subscriber_hash", subscriberHash);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "skip_merge_validation", skipMergeValidation));


        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<ListMembers2> localReturnType = new ParameterizedTypeReference<ListMembers2>() {};
        return apiClient.invokeAPI("/lists/{list_id}/members/{subscriber_hash}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update note
     * Update a specific note for a specific list member.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param noteId The id for the note. (required)
     * @param body  (required)
     * @return MemberNotes
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MemberNotes patchListsIdMembersIdNotesId(String listId, String subscriberHash, String noteId, MemberNotes1 body) throws RestClientException {
        return patchListsIdMembersIdNotesIdWithHttpInfo(listId, subscriberHash, noteId, body).getBody();
    }

    /**
     * Update note
     * Update a specific note for a specific list member.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param noteId The id for the note. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;MemberNotes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MemberNotes> patchListsIdMembersIdNotesIdWithHttpInfo(String listId, String subscriberHash, String noteId, MemberNotes1 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling patchListsIdMembersIdNotesId");
        }
        
        // verify the required parameter 'subscriberHash' is set
        if (subscriberHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriberHash' when calling patchListsIdMembersIdNotesId");
        }
        
        // verify the required parameter 'noteId' is set
        if (noteId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'noteId' when calling patchListsIdMembersIdNotesId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchListsIdMembersIdNotesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("subscriber_hash", subscriberHash);
        uriVariables.put("note_id", noteId);

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

        ParameterizedTypeReference<MemberNotes> localReturnType = new ParameterizedTypeReference<MemberNotes>() {};
        return apiClient.invokeAPI("/lists/{list_id}/members/{subscriber_hash}/notes/{note_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update merge field
     * Update a specific merge field.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param mergeId The id for the merge field. (required)
     * @param body  (required)
     * @return MergeField
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MergeField patchListsIdMergeFieldsId(String listId, String mergeId, MergeField2 body) throws RestClientException {
        return patchListsIdMergeFieldsIdWithHttpInfo(listId, mergeId, body).getBody();
    }

    /**
     * Update merge field
     * Update a specific merge field.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param mergeId The id for the merge field. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;MergeField&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MergeField> patchListsIdMergeFieldsIdWithHttpInfo(String listId, String mergeId, MergeField2 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling patchListsIdMergeFieldsId");
        }
        
        // verify the required parameter 'mergeId' is set
        if (mergeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mergeId' when calling patchListsIdMergeFieldsId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchListsIdMergeFieldsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("merge_id", mergeId);

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

        ParameterizedTypeReference<MergeField> localReturnType = new ParameterizedTypeReference<MergeField>() {};
        return apiClient.invokeAPI("/lists/{list_id}/merge-fields/{merge_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update segment
     * Update a specific segment in a list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param segmentId The unique id for the segment. (required)
     * @param body  (required)
     * @return List7
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List7 patchListsIdSegmentsId(String listId, String segmentId, List9 body) throws RestClientException {
        return patchListsIdSegmentsIdWithHttpInfo(listId, segmentId, body).getBody();
    }

    /**
     * Update segment
     * Update a specific segment in a list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param segmentId The unique id for the segment. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;List7&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List7> patchListsIdSegmentsIdWithHttpInfo(String listId, String segmentId, List9 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling patchListsIdSegmentsId");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling patchListsIdSegmentsId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchListsIdSegmentsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("segment_id", segmentId);

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

        ParameterizedTypeReference<List7> localReturnType = new ParameterizedTypeReference<List7>() {};
        return apiClient.invokeAPI("/lists/{list_id}/segments/{segment_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update webhook
     * Update the settings for an existing webhook.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param webhookId The webhook&#39;s id. (required)
     * @param body  (required)
     * @return ListWebhooks
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListWebhooks patchListsIdWebhooksId(String listId, String webhookId, AddWebhook body) throws RestClientException {
        return patchListsIdWebhooksIdWithHttpInfo(listId, webhookId, body).getBody();
    }

    /**
     * Update webhook
     * Update the settings for an existing webhook.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param webhookId The webhook&#39;s id. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ListWebhooks&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListWebhooks> patchListsIdWebhooksIdWithHttpInfo(String listId, String webhookId, AddWebhook body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling patchListsIdWebhooksId");
        }
        
        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'webhookId' when calling patchListsIdWebhooksId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchListsIdWebhooksId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("webhook_id", webhookId);

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

        ParameterizedTypeReference<ListWebhooks> localReturnType = new ParameterizedTypeReference<ListWebhooks>() {};
        return apiClient.invokeAPI("/lists/{list_id}/webhooks/{webhook_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add event
     * Add an event for a list member.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param body  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postListMemberEvents(String listId, String subscriberHash, Events body) throws RestClientException {
        postListMemberEventsWithHttpInfo(listId, subscriberHash, body);
    }

    /**
     * Add event
     * Add an event for a list member.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postListMemberEventsWithHttpInfo(String listId, String subscriberHash, Events body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling postListMemberEvents");
        }
        
        // verify the required parameter 'subscriberHash' is set
        if (subscriberHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriberHash' when calling postListMemberEvents");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postListMemberEvents");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("subscriber_hash", subscriberHash);

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/lists/{list_id}/members/{subscriber_hash}/events", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add or remove member tags
     * Add or remove tags from a list member. If a tag that does not exist is passed in and set as &#39;active&#39;, a new tag will be created.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. (required)
     * @param body  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postListMemberTags(String listId, String subscriberHash, MemberTags body) throws RestClientException {
        postListMemberTagsWithHttpInfo(listId, subscriberHash, body);
    }

    /**
     * Add or remove member tags
     * Add or remove tags from a list member. If a tag that does not exist is passed in and set as &#39;active&#39;, a new tag will be created.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postListMemberTagsWithHttpInfo(String listId, String subscriberHash, MemberTags body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling postListMemberTags");
        }
        
        // verify the required parameter 'subscriberHash' is set
        if (subscriberHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriberHash' when calling postListMemberTags");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postListMemberTags");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("subscriber_hash", subscriberHash);

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/lists/{list_id}/members/{subscriber_hash}/tags", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add list
     * Create a new list in your Mailchimp account.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param body  (required)
     * @return SubscriberList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriberList postLists(SubscriberList1 body) throws RestClientException {
        return postListsWithHttpInfo(body).getBody();
    }

    /**
     * Add list
     * Create a new list in your Mailchimp account.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param body  (required)
     * @return ResponseEntity&lt;SubscriberList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriberList> postListsWithHttpInfo(SubscriberList1 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postLists");
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

        ParameterizedTypeReference<SubscriberList> localReturnType = new ParameterizedTypeReference<SubscriberList>() {};
        return apiClient.invokeAPI("/lists", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Batch subscribe or unsubscribe
     * Batch subscribe or unsubscribe list members.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param body  (required)
     * @param skipMergeValidation If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false. (optional)
     * @param skipDuplicateCheck If skip_duplicate_check is true, we will ignore duplicates sent in the request when using the batch sub/unsub on the lists endpoint. The status of the first appearance in the request will be saved. This defaults to false. (optional)
     * @return BatchUpdateListMembers
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BatchUpdateListMembers postListsId(String listId, MembersToSubscribeUnsubscribeToFromAListInBatch body, Boolean skipMergeValidation, Boolean skipDuplicateCheck) throws RestClientException {
        return postListsIdWithHttpInfo(listId, body, skipMergeValidation, skipDuplicateCheck).getBody();
    }

    /**
     * Batch subscribe or unsubscribe
     * Batch subscribe or unsubscribe list members.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param body  (required)
     * @param skipMergeValidation If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false. (optional)
     * @param skipDuplicateCheck If skip_duplicate_check is true, we will ignore duplicates sent in the request when using the batch sub/unsub on the lists endpoint. The status of the first appearance in the request will be saved. This defaults to false. (optional)
     * @return ResponseEntity&lt;BatchUpdateListMembers&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BatchUpdateListMembers> postListsIdWithHttpInfo(String listId, MembersToSubscribeUnsubscribeToFromAListInBatch body, Boolean skipMergeValidation, Boolean skipDuplicateCheck) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling postListsId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postListsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "skip_merge_validation", skipMergeValidation));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "skip_duplicate_check", skipDuplicateCheck));


        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<BatchUpdateListMembers> localReturnType = new ParameterizedTypeReference<BatchUpdateListMembers>() {};
        return apiClient.invokeAPI("/lists/{list_id}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add interest category
     * Create a new interest category.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param body  (required)
     * @return InterestCategory
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InterestCategory postListsIdInterestCategories(String listId, InterestCategory1 body) throws RestClientException {
        return postListsIdInterestCategoriesWithHttpInfo(listId, body).getBody();
    }

    /**
     * Add interest category
     * Create a new interest category.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;InterestCategory&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InterestCategory> postListsIdInterestCategoriesWithHttpInfo(String listId, InterestCategory1 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling postListsIdInterestCategories");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postListsIdInterestCategories");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

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

        ParameterizedTypeReference<InterestCategory> localReturnType = new ParameterizedTypeReference<InterestCategory>() {};
        return apiClient.invokeAPI("/lists/{list_id}/interest-categories", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add interest in category
     * Create a new interest or &#39;group name&#39; for a specific category.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param interestCategoryId The unique ID for the interest category. (required)
     * @param body  (required)
     * @return Interest
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Interest postListsIdInterestCategoriesIdInterests(String listId, String interestCategoryId, Interest1 body) throws RestClientException {
        return postListsIdInterestCategoriesIdInterestsWithHttpInfo(listId, interestCategoryId, body).getBody();
    }

    /**
     * Add interest in category
     * Create a new interest or &#39;group name&#39; for a specific category.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param interestCategoryId The unique ID for the interest category. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;Interest&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Interest> postListsIdInterestCategoriesIdInterestsWithHttpInfo(String listId, String interestCategoryId, Interest1 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling postListsIdInterestCategoriesIdInterests");
        }
        
        // verify the required parameter 'interestCategoryId' is set
        if (interestCategoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'interestCategoryId' when calling postListsIdInterestCategoriesIdInterests");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postListsIdInterestCategoriesIdInterests");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("interest_category_id", interestCategoryId);

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

        ParameterizedTypeReference<Interest> localReturnType = new ParameterizedTypeReference<Interest>() {};
        return apiClient.invokeAPI("/lists/{list_id}/interest-categories/{interest_category_id}/interests", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add member to list
     * Add a new member to the list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param body  (required)
     * @param skipMergeValidation If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false. (optional)
     * @return ListMembers2
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListMembers2 postListsIdMembers(String listId, AddListMembers1 body, Boolean skipMergeValidation) throws RestClientException {
        return postListsIdMembersWithHttpInfo(listId, body, skipMergeValidation).getBody();
    }

    /**
     * Add member to list
     * Add a new member to the list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param body  (required)
     * @param skipMergeValidation If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false. (optional)
     * @return ResponseEntity&lt;ListMembers2&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListMembers2> postListsIdMembersWithHttpInfo(String listId, AddListMembers1 body, Boolean skipMergeValidation) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling postListsIdMembers");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postListsIdMembers");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "skip_merge_validation", skipMergeValidation));


        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<ListMembers2> localReturnType = new ParameterizedTypeReference<ListMembers2>() {};
        return apiClient.invokeAPI("/lists/{list_id}/members", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete list member
     * Delete all personally identifiable information related to a list member, and remove them from a list. This will make it impossible to re-import the list member.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postListsIdMembersHashActionsDeletePermanent(String listId, String subscriberHash) throws RestClientException {
        postListsIdMembersHashActionsDeletePermanentWithHttpInfo(listId, subscriberHash);
    }

    /**
     * Delete list member
     * Delete all personally identifiable information related to a list member, and remove them from a list. This will make it impossible to re-import the list member.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postListsIdMembersHashActionsDeletePermanentWithHttpInfo(String listId, String subscriberHash) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling postListsIdMembersHashActionsDeletePermanent");
        }
        
        // verify the required parameter 'subscriberHash' is set
        if (subscriberHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriberHash' when calling postListsIdMembersHashActionsDeletePermanent");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("subscriber_hash", subscriberHash);

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
        return apiClient.invokeAPI("/lists/{list_id}/members/{subscriber_hash}/actions/delete-permanent", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add member note
     * Add a new note for a specific subscriber.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. (required)
     * @param body  (required)
     * @return MemberNotes
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MemberNotes postListsIdMembersIdNotes(String listId, String subscriberHash, MemberNotes1 body) throws RestClientException {
        return postListsIdMembersIdNotesWithHttpInfo(listId, subscriberHash, body).getBody();
    }

    /**
     * Add member note
     * Add a new note for a specific subscriber.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;MemberNotes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MemberNotes> postListsIdMembersIdNotesWithHttpInfo(String listId, String subscriberHash, MemberNotes1 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling postListsIdMembersIdNotes");
        }
        
        // verify the required parameter 'subscriberHash' is set
        if (subscriberHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriberHash' when calling postListsIdMembersIdNotes");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postListsIdMembersIdNotes");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("subscriber_hash", subscriberHash);

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

        ParameterizedTypeReference<MemberNotes> localReturnType = new ParameterizedTypeReference<MemberNotes>() {};
        return apiClient.invokeAPI("/lists/{list_id}/members/{subscriber_hash}/notes", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add merge field
     * Add a new merge field for a specific audience.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param body  (required)
     * @return MergeField
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MergeField postListsIdMergeFields(String listId, MergeField1 body) throws RestClientException {
        return postListsIdMergeFieldsWithHttpInfo(listId, body).getBody();
    }

    /**
     * Add merge field
     * Add a new merge field for a specific audience.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;MergeField&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MergeField> postListsIdMergeFieldsWithHttpInfo(String listId, MergeField1 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling postListsIdMergeFields");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postListsIdMergeFields");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

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

        ParameterizedTypeReference<MergeField> localReturnType = new ParameterizedTypeReference<MergeField>() {};
        return apiClient.invokeAPI("/lists/{list_id}/merge-fields", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add segment
     * Create a new segment in a specific list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param body  (required)
     * @return List7
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List7 postListsIdSegments(String listId, List8 body) throws RestClientException {
        return postListsIdSegmentsWithHttpInfo(listId, body).getBody();
    }

    /**
     * Add segment
     * Create a new segment in a specific list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;List7&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List7> postListsIdSegmentsWithHttpInfo(String listId, List8 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling postListsIdSegments");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postListsIdSegments");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

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

        ParameterizedTypeReference<List7> localReturnType = new ParameterizedTypeReference<List7>() {};
        return apiClient.invokeAPI("/lists/{list_id}/segments", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Batch add or remove members
     * Batch add/remove list members to static segment
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param segmentId The unique id for the segment. (required)
     * @param body  (required)
     * @return BatchAddRemoveListMembersToFromStaticSegment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BatchAddRemoveListMembersToFromStaticSegment postListsIdSegmentsId(String listId, String segmentId, MembersToAddRemoveToFromAStaticSegment body) throws RestClientException {
        return postListsIdSegmentsIdWithHttpInfo(listId, segmentId, body).getBody();
    }

    /**
     * Batch add or remove members
     * Batch add/remove list members to static segment
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param segmentId The unique id for the segment. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;BatchAddRemoveListMembersToFromStaticSegment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BatchAddRemoveListMembersToFromStaticSegment> postListsIdSegmentsIdWithHttpInfo(String listId, String segmentId, MembersToAddRemoveToFromAStaticSegment body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling postListsIdSegmentsId");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling postListsIdSegmentsId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postListsIdSegmentsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("segment_id", segmentId);

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

        ParameterizedTypeReference<BatchAddRemoveListMembersToFromStaticSegment> localReturnType = new ParameterizedTypeReference<BatchAddRemoveListMembersToFromStaticSegment>() {};
        return apiClient.invokeAPI("/lists/{list_id}/segments/{segment_id}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add member to segment
     * Add a member to a static segment.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param segmentId The unique id for the segment. (required)
     * @param body  (required)
     * @return ListMembers1
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListMembers1 postListsIdSegmentsIdMembers(String listId, String segmentId, PostListsIdSegmentsIdMembersRequest body) throws RestClientException {
        return postListsIdSegmentsIdMembersWithHttpInfo(listId, segmentId, body).getBody();
    }

    /**
     * Add member to segment
     * Add a member to a static segment.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param segmentId The unique id for the segment. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ListMembers1&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListMembers1> postListsIdSegmentsIdMembersWithHttpInfo(String listId, String segmentId, PostListsIdSegmentsIdMembersRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling postListsIdSegmentsIdMembers");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling postListsIdSegmentsIdMembers");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postListsIdSegmentsIdMembers");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("segment_id", segmentId);

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

        ParameterizedTypeReference<ListMembers1> localReturnType = new ParameterizedTypeReference<ListMembers1>() {};
        return apiClient.invokeAPI("/lists/{list_id}/segments/{segment_id}/members", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Customize signup form
     * Customize a list&#39;s default signup form.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param body  (required)
     * @return SignupForm
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SignupForm postListsIdSignupForms(String listId, SignupForm1 body) throws RestClientException {
        return postListsIdSignupFormsWithHttpInfo(listId, body).getBody();
    }

    /**
     * Customize signup form
     * Customize a list&#39;s default signup form.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;SignupForm&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SignupForm> postListsIdSignupFormsWithHttpInfo(String listId, SignupForm1 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling postListsIdSignupForms");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postListsIdSignupForms");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

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

        ParameterizedTypeReference<SignupForm> localReturnType = new ParameterizedTypeReference<SignupForm>() {};
        return apiClient.invokeAPI("/lists/{list_id}/signup-forms", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add webhook
     * Create a new webhook for a specific list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param body  (required)
     * @return ListWebhooks
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListWebhooks postListsIdWebhooks(String listId, AddWebhook body) throws RestClientException {
        return postListsIdWebhooksWithHttpInfo(listId, body).getBody();
    }

    /**
     * Add webhook
     * Create a new webhook for a specific list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ListWebhooks&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListWebhooks> postListsIdWebhooksWithHttpInfo(String listId, AddWebhook body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling postListsIdWebhooks");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postListsIdWebhooks");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

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

        ParameterizedTypeReference<ListWebhooks> localReturnType = new ParameterizedTypeReference<ListWebhooks>() {};
        return apiClient.invokeAPI("/lists/{list_id}/webhooks", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List segments
     * Get information about all available segments for a specific list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param type Limit results based on segment type. (optional)
     * @param sinceCreatedAt Restrict results to segments created after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param beforeCreatedAt Restrict results to segments created before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param includeCleaned Include cleaned members in response (optional)
     * @param includeTransactional Include transactional members in response (optional)
     * @param includeUnsubscribed Include unsubscribed members in response (optional)
     * @param sinceUpdatedAt Restrict results to segments update after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param beforeUpdatedAt Restrict results to segments update before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @return CollectionOfSegments
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CollectionOfSegments previewASegment(String listId, List<String> fields, List<String> excludeFields, Integer count, Integer offset, String type, String sinceCreatedAt, String beforeCreatedAt, Boolean includeCleaned, Boolean includeTransactional, Boolean includeUnsubscribed, String sinceUpdatedAt, String beforeUpdatedAt) throws RestClientException {
        return previewASegmentWithHttpInfo(listId, fields, excludeFields, count, offset, type, sinceCreatedAt, beforeCreatedAt, includeCleaned, includeTransactional, includeUnsubscribed, sinceUpdatedAt, beforeUpdatedAt).getBody();
    }

    /**
     * List segments
     * Get information about all available segments for a specific list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param type Limit results based on segment type. (optional)
     * @param sinceCreatedAt Restrict results to segments created after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param beforeCreatedAt Restrict results to segments created before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param includeCleaned Include cleaned members in response (optional)
     * @param includeTransactional Include transactional members in response (optional)
     * @param includeUnsubscribed Include unsubscribed members in response (optional)
     * @param sinceUpdatedAt Restrict results to segments update after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @param beforeUpdatedAt Restrict results to segments update before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. (optional)
     * @return ResponseEntity&lt;CollectionOfSegments&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CollectionOfSegments> previewASegmentWithHttpInfo(String listId, List<String> fields, List<String> excludeFields, Integer count, Integer offset, String type, String sinceCreatedAt, String beforeCreatedAt, Boolean includeCleaned, Boolean includeTransactional, Boolean includeUnsubscribed, String sinceUpdatedAt, String beforeUpdatedAt) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling previewASegment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "exclude_fields", excludeFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "since_created_at", sinceCreatedAt));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "before_created_at", beforeCreatedAt));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_cleaned", includeCleaned));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_transactional", includeTransactional));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_unsubscribed", includeUnsubscribed));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "since_updated_at", sinceUpdatedAt));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "before_updated_at", beforeUpdatedAt));


        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<CollectionOfSegments> localReturnType = new ParameterizedTypeReference<CollectionOfSegments>() {};
        return apiClient.invokeAPI("/lists/{list_id}/segments", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add or update list member
     * Add or update a list member.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param body  (required)
     * @param skipMergeValidation If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false. (optional)
     * @return ListMembers2
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListMembers2 putListsIdMembersId(String listId, String subscriberHash, AddListMembers2 body, Boolean skipMergeValidation) throws RestClientException {
        return putListsIdMembersIdWithHttpInfo(listId, subscriberHash, body, skipMergeValidation).getBody();
    }

    /**
     * Add or update list member
     * Add or update a list member.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param subscriberHash The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. (required)
     * @param body  (required)
     * @param skipMergeValidation If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false. (optional)
     * @return ResponseEntity&lt;ListMembers2&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListMembers2> putListsIdMembersIdWithHttpInfo(String listId, String subscriberHash, AddListMembers2 body, Boolean skipMergeValidation) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling putListsIdMembersId");
        }
        
        // verify the required parameter 'subscriberHash' is set
        if (subscriberHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriberHash' when calling putListsIdMembersId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling putListsIdMembersId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);
        uriVariables.put("subscriber_hash", subscriberHash);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "skip_merge_validation", skipMergeValidation));


        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<ListMembers2> localReturnType = new ParameterizedTypeReference<ListMembers2>() {};
        return apiClient.invokeAPI("/lists/{list_id}/members/{subscriber_hash}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search for tags on a list by name.
     * Search for tags on a list by name. If no name is provided, will return all tags on the list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param name The search query used to filter tags.  The search query will be compared to each tag as a prefix, so all tags that have a name starting with this field will be returned. (optional)
     * @return TagSearchResults
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TagSearchResults searchTagsByName(String listId, String name) throws RestClientException {
        return searchTagsByNameWithHttpInfo(listId, name).getBody();
    }

    /**
     * Search for tags on a list by name.
     * Search for tags on a list by name. If no name is provided, will return all tags on the list.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param listId The unique ID for the list. (required)
     * @param name The search query used to filter tags.  The search query will be compared to each tag as a prefix, so all tags that have a name starting with this field will be returned. (optional)
     * @return ResponseEntity&lt;TagSearchResults&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TagSearchResults> searchTagsByNameWithHttpInfo(String listId, String name) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling searchTagsByName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));


        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<TagSearchResults> localReturnType = new ParameterizedTypeReference<TagSearchResults>() {};
        return apiClient.invokeAPI("/lists/{list_id}/tag-search", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
