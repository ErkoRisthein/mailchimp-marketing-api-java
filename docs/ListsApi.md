# ListsApi

All URIs are relative to *https://server.api.mailchimp.com/3.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteListsId**](ListsApi.md#deleteListsId) | **DELETE** /lists/{list_id} | Delete list |
| [**deleteListsIdInterestCategoriesId**](ListsApi.md#deleteListsIdInterestCategoriesId) | **DELETE** /lists/{list_id}/interest-categories/{interest_category_id} | Delete interest category |
| [**deleteListsIdInterestCategoriesIdInterestsId**](ListsApi.md#deleteListsIdInterestCategoriesIdInterestsId) | **DELETE** /lists/{list_id}/interest-categories/{interest_category_id}/interests/{interest_id} | Delete interest in category |
| [**deleteListsIdMembersId**](ListsApi.md#deleteListsIdMembersId) | **DELETE** /lists/{list_id}/members/{subscriber_hash} | Archive list member |
| [**deleteListsIdMembersIdNotesId**](ListsApi.md#deleteListsIdMembersIdNotesId) | **DELETE** /lists/{list_id}/members/{subscriber_hash}/notes/{note_id} | Delete note |
| [**deleteListsIdMergeFieldsId**](ListsApi.md#deleteListsIdMergeFieldsId) | **DELETE** /lists/{list_id}/merge-fields/{merge_id} | Delete merge field |
| [**deleteListsIdSegmentsId**](ListsApi.md#deleteListsIdSegmentsId) | **DELETE** /lists/{list_id}/segments/{segment_id} | Delete segment |
| [**deleteListsIdSegmentsIdMembersId**](ListsApi.md#deleteListsIdSegmentsIdMembersId) | **DELETE** /lists/{list_id}/segments/{segment_id}/members/{subscriber_hash} | Remove list member from segment |
| [**deleteListsIdWebhooksId**](ListsApi.md#deleteListsIdWebhooksId) | **DELETE** /lists/{list_id}/webhooks/{webhook_id} | Delete webhook |
| [**getListMemberTags**](ListsApi.md#getListMemberTags) | **GET** /lists/{list_id}/members/{subscriber_hash}/tags | List member tags |
| [**getLists**](ListsApi.md#getLists) | **GET** /lists | Get lists info |
| [**getListsId**](ListsApi.md#getListsId) | **GET** /lists/{list_id} | Get list info |
| [**getListsIdAbuseReports**](ListsApi.md#getListsIdAbuseReports) | **GET** /lists/{list_id}/abuse-reports | List abuse reports |
| [**getListsIdAbuseReportsId**](ListsApi.md#getListsIdAbuseReportsId) | **GET** /lists/{list_id}/abuse-reports/{report_id} | Get abuse report |
| [**getListsIdActivity**](ListsApi.md#getListsIdActivity) | **GET** /lists/{list_id}/activity | List recent activity |
| [**getListsIdClients**](ListsApi.md#getListsIdClients) | **GET** /lists/{list_id}/clients | List top email clients |
| [**getListsIdGrowthHistory**](ListsApi.md#getListsIdGrowthHistory) | **GET** /lists/{list_id}/growth-history | List growth history data |
| [**getListsIdGrowthHistoryId**](ListsApi.md#getListsIdGrowthHistoryId) | **GET** /lists/{list_id}/growth-history/{month} | Get growth history by month |
| [**getListsIdInterestCategories**](ListsApi.md#getListsIdInterestCategories) | **GET** /lists/{list_id}/interest-categories | List interest categories |
| [**getListsIdInterestCategoriesId**](ListsApi.md#getListsIdInterestCategoriesId) | **GET** /lists/{list_id}/interest-categories/{interest_category_id} | Get interest category info |
| [**getListsIdInterestCategoriesIdInterests**](ListsApi.md#getListsIdInterestCategoriesIdInterests) | **GET** /lists/{list_id}/interest-categories/{interest_category_id}/interests | List interests in category |
| [**getListsIdInterestCategoriesIdInterestsId**](ListsApi.md#getListsIdInterestCategoriesIdInterestsId) | **GET** /lists/{list_id}/interest-categories/{interest_category_id}/interests/{interest_id} | Get interest in category |
| [**getListsIdLocations**](ListsApi.md#getListsIdLocations) | **GET** /lists/{list_id}/locations | List locations |
| [**getListsIdMembers**](ListsApi.md#getListsIdMembers) | **GET** /lists/{list_id}/members | List members info |
| [**getListsIdMembersId**](ListsApi.md#getListsIdMembersId) | **GET** /lists/{list_id}/members/{subscriber_hash} | Get member info |
| [**getListsIdMembersIdActivity**](ListsApi.md#getListsIdMembersIdActivity) | **GET** /lists/{list_id}/members/{subscriber_hash}/activity | View recent activity 50 |
| [**getListsIdMembersIdActivityFeed**](ListsApi.md#getListsIdMembersIdActivityFeed) | **GET** /lists/{list_id}/members/{subscriber_hash}/activity-feed | View recent activity |
| [**getListsIdMembersIdEvents**](ListsApi.md#getListsIdMembersIdEvents) | **GET** /lists/{list_id}/members/{subscriber_hash}/events | List member events |
| [**getListsIdMembersIdGoals**](ListsApi.md#getListsIdMembersIdGoals) | **GET** /lists/{list_id}/members/{subscriber_hash}/goals | List member goal events |
| [**getListsIdMembersIdNotes**](ListsApi.md#getListsIdMembersIdNotes) | **GET** /lists/{list_id}/members/{subscriber_hash}/notes | List recent member notes |
| [**getListsIdMembersIdNotesId**](ListsApi.md#getListsIdMembersIdNotesId) | **GET** /lists/{list_id}/members/{subscriber_hash}/notes/{note_id} | Get member note |
| [**getListsIdMergeFields**](ListsApi.md#getListsIdMergeFields) | **GET** /lists/{list_id}/merge-fields | List merge fields |
| [**getListsIdMergeFieldsId**](ListsApi.md#getListsIdMergeFieldsId) | **GET** /lists/{list_id}/merge-fields/{merge_id} | Get merge field |
| [**getListsIdSegmentsId**](ListsApi.md#getListsIdSegmentsId) | **GET** /lists/{list_id}/segments/{segment_id} | Get segment info |
| [**getListsIdSegmentsIdMembers**](ListsApi.md#getListsIdSegmentsIdMembers) | **GET** /lists/{list_id}/segments/{segment_id}/members | List members in segment |
| [**getListsIdSignupForms**](ListsApi.md#getListsIdSignupForms) | **GET** /lists/{list_id}/signup-forms | List signup forms |
| [**getListsIdSurveys**](ListsApi.md#getListsIdSurveys) | **GET** /lists/{list_id}/surveys | Get information about all surveys for a list |
| [**getListsIdSurveysId**](ListsApi.md#getListsIdSurveysId) | **GET** /lists/{list_id}/surveys/{survey_id} | Get survey |
| [**getListsIdWebhooks**](ListsApi.md#getListsIdWebhooks) | **GET** /lists/{list_id}/webhooks | List webhooks |
| [**getListsIdWebhooksId**](ListsApi.md#getListsIdWebhooksId) | **GET** /lists/{list_id}/webhooks/{webhook_id} | Get webhook info |
| [**patchListsId**](ListsApi.md#patchListsId) | **PATCH** /lists/{list_id} | Update lists |
| [**patchListsIdInterestCategoriesId**](ListsApi.md#patchListsIdInterestCategoriesId) | **PATCH** /lists/{list_id}/interest-categories/{interest_category_id} | Update interest category |
| [**patchListsIdInterestCategoriesIdInterestsId**](ListsApi.md#patchListsIdInterestCategoriesIdInterestsId) | **PATCH** /lists/{list_id}/interest-categories/{interest_category_id}/interests/{interest_id} | Update interest in category |
| [**patchListsIdMembersId**](ListsApi.md#patchListsIdMembersId) | **PATCH** /lists/{list_id}/members/{subscriber_hash} | Update list member |
| [**patchListsIdMembersIdNotesId**](ListsApi.md#patchListsIdMembersIdNotesId) | **PATCH** /lists/{list_id}/members/{subscriber_hash}/notes/{note_id} | Update note |
| [**patchListsIdMergeFieldsId**](ListsApi.md#patchListsIdMergeFieldsId) | **PATCH** /lists/{list_id}/merge-fields/{merge_id} | Update merge field |
| [**patchListsIdSegmentsId**](ListsApi.md#patchListsIdSegmentsId) | **PATCH** /lists/{list_id}/segments/{segment_id} | Update segment |
| [**patchListsIdWebhooksId**](ListsApi.md#patchListsIdWebhooksId) | **PATCH** /lists/{list_id}/webhooks/{webhook_id} | Update webhook |
| [**postListMemberEvents**](ListsApi.md#postListMemberEvents) | **POST** /lists/{list_id}/members/{subscriber_hash}/events | Add event |
| [**postListMemberTags**](ListsApi.md#postListMemberTags) | **POST** /lists/{list_id}/members/{subscriber_hash}/tags | Add or remove member tags |
| [**postLists**](ListsApi.md#postLists) | **POST** /lists | Add list |
| [**postListsId**](ListsApi.md#postListsId) | **POST** /lists/{list_id} | Batch subscribe or unsubscribe |
| [**postListsIdInterestCategories**](ListsApi.md#postListsIdInterestCategories) | **POST** /lists/{list_id}/interest-categories | Add interest category |
| [**postListsIdInterestCategoriesIdInterests**](ListsApi.md#postListsIdInterestCategoriesIdInterests) | **POST** /lists/{list_id}/interest-categories/{interest_category_id}/interests | Add interest in category |
| [**postListsIdMembers**](ListsApi.md#postListsIdMembers) | **POST** /lists/{list_id}/members | Add member to list |
| [**postListsIdMembersHashActionsDeletePermanent**](ListsApi.md#postListsIdMembersHashActionsDeletePermanent) | **POST** /lists/{list_id}/members/{subscriber_hash}/actions/delete-permanent | Delete list member |
| [**postListsIdMembersIdNotes**](ListsApi.md#postListsIdMembersIdNotes) | **POST** /lists/{list_id}/members/{subscriber_hash}/notes | Add member note |
| [**postListsIdMergeFields**](ListsApi.md#postListsIdMergeFields) | **POST** /lists/{list_id}/merge-fields | Add merge field |
| [**postListsIdSegments**](ListsApi.md#postListsIdSegments) | **POST** /lists/{list_id}/segments | Add segment |
| [**postListsIdSegmentsId**](ListsApi.md#postListsIdSegmentsId) | **POST** /lists/{list_id}/segments/{segment_id} | Batch add or remove members |
| [**postListsIdSegmentsIdMembers**](ListsApi.md#postListsIdSegmentsIdMembers) | **POST** /lists/{list_id}/segments/{segment_id}/members | Add member to segment |
| [**postListsIdSignupForms**](ListsApi.md#postListsIdSignupForms) | **POST** /lists/{list_id}/signup-forms | Customize signup form |
| [**postListsIdWebhooks**](ListsApi.md#postListsIdWebhooks) | **POST** /lists/{list_id}/webhooks | Add webhook |
| [**previewASegment**](ListsApi.md#previewASegment) | **GET** /lists/{list_id}/segments | List segments |
| [**putListsIdMembersId**](ListsApi.md#putListsIdMembersId) | **PUT** /lists/{list_id}/members/{subscriber_hash} | Add or update list member |
| [**searchTagsByName**](ListsApi.md#searchTagsByName) | **GET** /lists/{list_id}/tag-search | Search for tags on a list by name. |



## deleteListsId

> deleteListsId(listId)

Delete list

Delete a list from your Mailchimp account. If you delete a list, you&#39;ll lose the list history—including subscriber activity, unsubscribes, complaints, and bounces. You’ll also lose subscribers’ email addresses, unless you exported and backed up your list.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        try {
            apiInstance.deleteListsId(listId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#deleteListsId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## deleteListsIdInterestCategoriesId

> deleteListsIdInterestCategoriesId(listId, interestCategoryId)

Delete interest category

Delete a specific interest category.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String interestCategoryId = "interestCategoryId_example"; // String | The unique ID for the interest category.
        try {
            apiInstance.deleteListsIdInterestCategoriesId(listId, interestCategoryId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#deleteListsIdInterestCategoriesId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **interestCategoryId** | **String**| The unique ID for the interest category. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## deleteListsIdInterestCategoriesIdInterestsId

> deleteListsIdInterestCategoriesIdInterestsId(listId, interestCategoryId, interestId)

Delete interest in category

Delete interests or group names in a specific category.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String interestCategoryId = "interestCategoryId_example"; // String | The unique ID for the interest category.
        String interestId = "interestId_example"; // String | The specific interest or 'group name'.
        try {
            apiInstance.deleteListsIdInterestCategoriesIdInterestsId(listId, interestCategoryId, interestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#deleteListsIdInterestCategoriesIdInterestsId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **interestCategoryId** | **String**| The unique ID for the interest category. | |
| **interestId** | **String**| The specific interest or &#39;group name&#39;. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## deleteListsIdMembersId

> deleteListsIdMembersId(listId, subscriberHash)

Archive list member

Archive a list member. To permanently delete, use the delete-permanent action.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
        try {
            apiInstance.deleteListsIdMembersId(listId, subscriberHash);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#deleteListsIdMembersId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## deleteListsIdMembersIdNotesId

> deleteListsIdMembersIdNotesId(listId, subscriberHash, noteId)

Delete note

Delete a specific note for a specific list member.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
        String noteId = "noteId_example"; // String | The id for the note.
        try {
            apiInstance.deleteListsIdMembersIdNotesId(listId, subscriberHash, noteId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#deleteListsIdMembersIdNotesId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **noteId** | **String**| The id for the note. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## deleteListsIdMergeFieldsId

> deleteListsIdMergeFieldsId(listId, mergeId)

Delete merge field

Delete a specific merge field.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String mergeId = "mergeId_example"; // String | The id for the merge field.
        try {
            apiInstance.deleteListsIdMergeFieldsId(listId, mergeId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#deleteListsIdMergeFieldsId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **mergeId** | **String**| The id for the merge field. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## deleteListsIdSegmentsId

> deleteListsIdSegmentsId(listId, segmentId)

Delete segment

Delete a specific segment in a list.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String segmentId = "segmentId_example"; // String | The unique id for the segment.
        try {
            apiInstance.deleteListsIdSegmentsId(listId, segmentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#deleteListsIdSegmentsId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **segmentId** | **String**| The unique id for the segment. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## deleteListsIdSegmentsIdMembersId

> deleteListsIdSegmentsIdMembersId(listId, segmentId, subscriberHash)

Remove list member from segment

Remove a member from the specified static segment.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String segmentId = "segmentId_example"; // String | The unique id for the segment.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address.
        try {
            apiInstance.deleteListsIdSegmentsIdMembersId(listId, segmentId, subscriberHash);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#deleteListsIdSegmentsIdMembersId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **segmentId** | **String**| The unique id for the segment. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## deleteListsIdWebhooksId

> deleteListsIdWebhooksId(listId, webhookId)

Delete webhook

Delete a specific webhook in a list.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String webhookId = "webhookId_example"; // String | The webhook's id.
        try {
            apiInstance.deleteListsIdWebhooksId(listId, webhookId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#deleteListsIdWebhooksId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **webhookId** | **String**| The webhook&#39;s id. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListMemberTags

> CollectionOfTags getListMemberTags(listId, subscriberHash, fields, excludeFields, count, offset)

List member tags

Get the tags on a list member.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        try {
            CollectionOfTags result = apiInstance.getListMemberTags(listId, subscriberHash, fields, excludeFields, count, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListMemberTags");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**CollectionOfTags**](CollectionOfTags.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getLists

> SubscriberLists getLists(fields, excludeFields, count, offset, beforeDateCreated, sinceDateCreated, beforeCampaignLastSent, sinceCampaignLastSent, email, sortField, sortDir, hasEcommerceStore, includeTotalContacts)

Get lists info

Get information about all lists in the account.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        String beforeDateCreated = "beforeDateCreated_example"; // String | Restrict response to lists created before the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        String sinceDateCreated = "sinceDateCreated_example"; // String | Restrict results to lists created after the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        String beforeCampaignLastSent = "beforeCampaignLastSent_example"; // String | Restrict results to lists created before the last campaign send date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        String sinceCampaignLastSent = "sinceCampaignLastSent_example"; // String | Restrict results to lists created after the last campaign send date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        String email = "email_example"; // String | Restrict results to lists that include a specific subscriber's email address.
        String sortField = "date_created"; // String | Returns files sorted by the specified field.
        String sortDir = "ASC"; // String | Determines the order direction for sorted results.
        Boolean hasEcommerceStore = true; // Boolean | Restrict results to lists that contain an active, connected, undeleted ecommerce store.
        Boolean includeTotalContacts = true; // Boolean | Return the total_contacts field in the stats response, which contains an approximate count of all contacts in any state.
        try {
            SubscriberLists result = apiInstance.getLists(fields, excludeFields, count, offset, beforeDateCreated, sinceDateCreated, beforeCampaignLastSent, sinceCampaignLastSent, email, sortField, sortDir, hasEcommerceStore, includeTotalContacts);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getLists");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **beforeDateCreated** | **String**| Restrict response to lists created before the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **sinceDateCreated** | **String**| Restrict results to lists created after the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **beforeCampaignLastSent** | **String**| Restrict results to lists created before the last campaign send date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **sinceCampaignLastSent** | **String**| Restrict results to lists created after the last campaign send date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **email** | **String**| Restrict results to lists that include a specific subscriber&#39;s email address. | [optional] |
| **sortField** | **String**| Returns files sorted by the specified field. | [optional] [enum: date_created] |
| **sortDir** | **String**| Determines the order direction for sorted results. | [optional] [enum: ASC, DESC] |
| **hasEcommerceStore** | **Boolean**| Restrict results to lists that contain an active, connected, undeleted ecommerce store. | [optional] |
| **includeTotalContacts** | **Boolean**| Return the total_contacts field in the stats response, which contains an approximate count of all contacts in any state. | [optional] |

### Return type

[**SubscriberLists**](SubscriberLists.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsId

> SubscriberList getListsId(listId, fields, excludeFields, includeTotalContacts)

Get list info

Get information about a specific list in your Mailchimp account. Results include list members who have signed up but haven&#39;t confirmed their subscription yet and unsubscribed or cleaned.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Boolean includeTotalContacts = true; // Boolean | Return the total_contacts field in the stats response, which contains an approximate count of all contacts in any state.
        try {
            SubscriberList result = apiInstance.getListsId(listId, fields, excludeFields, includeTotalContacts);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **includeTotalContacts** | **Boolean**| Return the total_contacts field in the stats response, which contains an approximate count of all contacts in any state. | [optional] |

### Return type

[**SubscriberList**](SubscriberList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdAbuseReports

> AbuseComplaints getListsIdAbuseReports(listId, fields, excludeFields, count, offset)

List abuse reports

Get all abuse reports for a specific list.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        try {
            AbuseComplaints result = apiInstance.getListsIdAbuseReports(listId, fields, excludeFields, count, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdAbuseReports");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**AbuseComplaints**](AbuseComplaints.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdAbuseReportsId

> AbuseComplaint getListsIdAbuseReportsId(listId, reportId, fields, excludeFields, count, offset)

Get abuse report

Get details about a specific abuse report.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String reportId = "reportId_example"; // String | The id for the abuse report.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        try {
            AbuseComplaint result = apiInstance.getListsIdAbuseReportsId(listId, reportId, fields, excludeFields, count, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdAbuseReportsId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **reportId** | **String**| The id for the abuse report. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**AbuseComplaint**](AbuseComplaint.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdActivity

> ListActivity getListsIdActivity(listId, count, offset, fields, excludeFields)

List recent activity

Get up to the previous 180 days of daily detailed aggregated activity stats for a list, not including Automation activity.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            ListActivity result = apiInstance.getListsIdActivity(listId, count, offset, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdActivity");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ListActivity**](ListActivity.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdClients

> EmailClients getListsIdClients(listId, fields, excludeFields)

List top email clients

Get a list of the top email clients based on user-agent strings.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            EmailClients result = apiInstance.getListsIdClients(listId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdClients");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**EmailClients**](EmailClients.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdGrowthHistory

> GrowthHistory getListsIdGrowthHistory(listId, fields, excludeFields, count, offset, sortField, sortDir)

List growth history data

Get a month-by-month summary of a specific list&#39;s growth activity.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        String sortField = "month"; // String | Returns files sorted by the specified field.
        String sortDir = "ASC"; // String | Determines the order direction for sorted results.
        try {
            GrowthHistory result = apiInstance.getListsIdGrowthHistory(listId, fields, excludeFields, count, offset, sortField, sortDir);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdGrowthHistory");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **sortField** | **String**| Returns files sorted by the specified field. | [optional] [enum: month] |
| **sortDir** | **String**| Determines the order direction for sorted results. | [optional] [enum: ASC, DESC] |

### Return type

[**GrowthHistory**](GrowthHistory.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdGrowthHistoryId

> GrowthHistory getListsIdGrowthHistoryId(listId, month, fields, excludeFields)

Get growth history by month

Get a summary of a specific list&#39;s growth activity for a specific month and year.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String month = "month_example"; // String | A specific month of list growth history.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            GrowthHistory result = apiInstance.getListsIdGrowthHistoryId(listId, month, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdGrowthHistoryId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **month** | **String**| A specific month of list growth history. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**GrowthHistory**](GrowthHistory.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdInterestCategories

> InterestGroupings getListsIdInterestCategories(listId, fields, excludeFields, count, offset, type)

List interest categories

Get information about a list&#39;s interest categories.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        String type = "type_example"; // String | Restrict results a type of interest group
        try {
            InterestGroupings result = apiInstance.getListsIdInterestCategories(listId, fields, excludeFields, count, offset, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdInterestCategories");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **type** | **String**| Restrict results a type of interest group | [optional] |

### Return type

[**InterestGroupings**](InterestGroupings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdInterestCategoriesId

> InterestCategory getListsIdInterestCategoriesId(listId, interestCategoryId, fields, excludeFields)

Get interest category info

Get information about a specific interest category.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String interestCategoryId = "interestCategoryId_example"; // String | The unique ID for the interest category.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            InterestCategory result = apiInstance.getListsIdInterestCategoriesId(listId, interestCategoryId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdInterestCategoriesId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **interestCategoryId** | **String**| The unique ID for the interest category. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**InterestCategory**](InterestCategory.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdInterestCategoriesIdInterests

> Interests getListsIdInterestCategoriesIdInterests(listId, interestCategoryId, fields, excludeFields, count, offset)

List interests in category

Get a list of this category&#39;s interests.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String interestCategoryId = "interestCategoryId_example"; // String | The unique ID for the interest category.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        try {
            Interests result = apiInstance.getListsIdInterestCategoriesIdInterests(listId, interestCategoryId, fields, excludeFields, count, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdInterestCategoriesIdInterests");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **interestCategoryId** | **String**| The unique ID for the interest category. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**Interests**](Interests.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdInterestCategoriesIdInterestsId

> Interest getListsIdInterestCategoriesIdInterestsId(listId, interestCategoryId, interestId, fields, excludeFields)

Get interest in category

Get interests or &#39;group names&#39; for a specific category.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String interestCategoryId = "interestCategoryId_example"; // String | The unique ID for the interest category.
        String interestId = "interestId_example"; // String | The specific interest or 'group name'.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            Interest result = apiInstance.getListsIdInterestCategoriesIdInterestsId(listId, interestCategoryId, interestId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdInterestCategoriesIdInterestsId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **interestCategoryId** | **String**| The unique ID for the interest category. | |
| **interestId** | **String**| The specific interest or &#39;group name&#39;. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**Interest**](Interest.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdLocations

> ListLocations getListsIdLocations(listId, fields, excludeFields)

List locations

Get the locations (countries) that the list&#39;s subscribers have been tagged to based on geocoding their IP address.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            ListLocations result = apiInstance.getListsIdLocations(listId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdLocations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ListLocations**](ListLocations.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdMembers

> ListMembers2 getListsIdMembers(listId, fields, excludeFields, count, offset, emailType, status, sinceTimestampOpt, beforeTimestampOpt, sinceLastChanged, beforeLastChanged, uniqueEmailId, vipOnly, interestCategoryId, interestIds, interestMatch, sortField, sortDir, sinceLastCampaign, unsubscribedSince)

List members info

Get information about members in a specific Mailchimp list.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        String emailType = "emailType_example"; // String | The email type.
        String status = "subscribed"; // String | The subscriber's status.
        String sinceTimestampOpt = "sinceTimestampOpt_example"; // String | Restrict results to subscribers who opted-in after the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        String beforeTimestampOpt = "beforeTimestampOpt_example"; // String | Restrict results to subscribers who opted-in before the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        String sinceLastChanged = "sinceLastChanged_example"; // String | Restrict results to subscribers whose information changed after the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        String beforeLastChanged = "beforeLastChanged_example"; // String | Restrict results to subscribers whose information changed before the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        String uniqueEmailId = "uniqueEmailId_example"; // String | A unique identifier for the email address across all Mailchimp lists.
        Boolean vipOnly = true; // Boolean | A filter to return only the list's VIP members. Passing `true` will restrict results to VIP list members, passing `false` will return all list members.
        String interestCategoryId = "interestCategoryId_example"; // String | The unique id for the interest category.
        String interestIds = "interestIds_example"; // String | Used to filter list members by interests. Must be accompanied by interest_category_id and interest_match. The value must be a comma separated list of interest ids present for any supplied interest categories.
        String interestMatch = "any"; // String | Used to filter list members by interests. Must be accompanied by interest_category_id and interest_ids. \"any\" will match a member with any of the interest supplied, \"all\" will only match members with every interest supplied, and \"none\" will match members without any of the interest supplied.
        String sortField = "timestamp_opt"; // String | Returns files sorted by the specified field.
        String sortDir = "ASC"; // String | Determines the order direction for sorted results.
        Boolean sinceLastCampaign = true; // Boolean | Filter subscribers by those subscribed/unsubscribed/pending/cleaned since last email campaign send. Member status is required to use this filter.
        String unsubscribedSince = "unsubscribedSince_example"; // String | Filter subscribers by those unsubscribed since a specific date. Using any status other than unsubscribed with this filter will result in an error.
        try {
            ListMembers2 result = apiInstance.getListsIdMembers(listId, fields, excludeFields, count, offset, emailType, status, sinceTimestampOpt, beforeTimestampOpt, sinceLastChanged, beforeLastChanged, uniqueEmailId, vipOnly, interestCategoryId, interestIds, interestMatch, sortField, sortDir, sinceLastCampaign, unsubscribedSince);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdMembers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **emailType** | **String**| The email type. | [optional] |
| **status** | **String**| The subscriber&#39;s status. | [optional] [enum: subscribed, unsubscribed, cleaned, pending, transactional, archived] |
| **sinceTimestampOpt** | **String**| Restrict results to subscribers who opted-in after the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **beforeTimestampOpt** | **String**| Restrict results to subscribers who opted-in before the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **sinceLastChanged** | **String**| Restrict results to subscribers whose information changed after the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **beforeLastChanged** | **String**| Restrict results to subscribers whose information changed before the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **uniqueEmailId** | **String**| A unique identifier for the email address across all Mailchimp lists. | [optional] |
| **vipOnly** | **Boolean**| A filter to return only the list&#39;s VIP members. Passing &#x60;true&#x60; will restrict results to VIP list members, passing &#x60;false&#x60; will return all list members. | [optional] |
| **interestCategoryId** | **String**| The unique id for the interest category. | [optional] |
| **interestIds** | **String**| Used to filter list members by interests. Must be accompanied by interest_category_id and interest_match. The value must be a comma separated list of interest ids present for any supplied interest categories. | [optional] |
| **interestMatch** | **String**| Used to filter list members by interests. Must be accompanied by interest_category_id and interest_ids. \&quot;any\&quot; will match a member with any of the interest supplied, \&quot;all\&quot; will only match members with every interest supplied, and \&quot;none\&quot; will match members without any of the interest supplied. | [optional] [enum: any, all, none] |
| **sortField** | **String**| Returns files sorted by the specified field. | [optional] [enum: timestamp_opt, timestamp_signup, last_changed] |
| **sortDir** | **String**| Determines the order direction for sorted results. | [optional] [enum: ASC, DESC] |
| **sinceLastCampaign** | **Boolean**| Filter subscribers by those subscribed/unsubscribed/pending/cleaned since last email campaign send. Member status is required to use this filter. | [optional] |
| **unsubscribedSince** | **String**| Filter subscribers by those unsubscribed since a specific date. Using any status other than unsubscribed with this filter will result in an error. | [optional] |

### Return type

[**ListMembers2**](ListMembers2.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdMembersId

> ListMembers2 getListsIdMembersId(listId, subscriberHash, fields, excludeFields)

Get member info

Get information about a specific list member, including a currently subscribed, unsubscribed, or bounced member.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            ListMembers2 result = apiInstance.getListsIdMembersId(listId, subscriberHash, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdMembersId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ListMembers2**](ListMembers2.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdMembersIdActivity

> MemberActivityEvents getListsIdMembersIdActivity(listId, subscriberHash, fields, excludeFields, action)

View recent activity 50

Get the last 50 events of a member&#39;s activity on a specific list, including opens, clicks, and unsubscribes.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        List<String> action = Arrays.asList(); // List<String> | A comma seperated list of actions to return.
        try {
            MemberActivityEvents result = apiInstance.getListsIdMembersIdActivity(listId, subscriberHash, fields, excludeFields, action);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdMembersIdActivity");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **action** | [**List&lt;String&gt;**](String.md)| A comma seperated list of actions to return. | [optional] |

### Return type

[**MemberActivityEvents**](MemberActivityEvents.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdMembersIdActivityFeed

> MemberActivityEvents1 getListsIdMembersIdActivityFeed(listId, subscriberHash, fields, excludeFields, count, offset, activityFilters)

View recent activity

Get a member&#39;s activity on a specific list, including opens, clicks, and unsubscribes.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        List<String> activityFilters = Arrays.asList(); // List<String> | A comma-separated list of activity filters that correspond to a set of activity types, e.g \"?activity_filters=open,bounce,click\".
        try {
            MemberActivityEvents1 result = apiInstance.getListsIdMembersIdActivityFeed(listId, subscriberHash, fields, excludeFields, count, offset, activityFilters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdMembersIdActivityFeed");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **activityFilters** | [**List&lt;String&gt;**](String.md)| A comma-separated list of activity filters that correspond to a set of activity types, e.g \&quot;?activity_filters&#x3D;open,bounce,click\&quot;. | [optional] |

### Return type

[**MemberActivityEvents1**](MemberActivityEvents1.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdMembersIdEvents

> CollectionOfEvents getListsIdMembersIdEvents(listId, subscriberHash, count, offset, fields, excludeFields)

List member events

Get events for a contact.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            CollectionOfEvents result = apiInstance.getListsIdMembersIdEvents(listId, subscriberHash, count, offset, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdMembersIdEvents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**CollectionOfEvents**](CollectionOfEvents.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdMembersIdGoals

> CollectionOfMemberActivityEvents getListsIdMembersIdGoals(listId, subscriberHash, fields, excludeFields)

List member goal events

Get the last 50 Goal events for a member on a specific list.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            CollectionOfMemberActivityEvents result = apiInstance.getListsIdMembersIdGoals(listId, subscriberHash, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdMembersIdGoals");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**CollectionOfMemberActivityEvents**](CollectionOfMemberActivityEvents.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdMembersIdNotes

> CollectionOfNotes getListsIdMembersIdNotes(listId, subscriberHash, sortField, sortDir, fields, excludeFields, count, offset)

List recent member notes

Get recent notes for a specific list member.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address.
        String sortField = "created_at"; // String | Returns notes sorted by the specified field.
        String sortDir = "ASC"; // String | Determines the order direction for sorted results.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        try {
            CollectionOfNotes result = apiInstance.getListsIdMembersIdNotes(listId, subscriberHash, sortField, sortDir, fields, excludeFields, count, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdMembersIdNotes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. | |
| **sortField** | **String**| Returns notes sorted by the specified field. | [optional] [enum: created_at, updated_at, note_id] |
| **sortDir** | **String**| Determines the order direction for sorted results. | [optional] [enum: ASC, DESC] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**CollectionOfNotes**](CollectionOfNotes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdMembersIdNotesId

> MemberNotes getListsIdMembersIdNotesId(listId, subscriberHash, noteId, fields, excludeFields)

Get member note

Get a specific note for a specific list member.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
        String noteId = "noteId_example"; // String | The id for the note.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            MemberNotes result = apiInstance.getListsIdMembersIdNotesId(listId, subscriberHash, noteId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdMembersIdNotesId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **noteId** | **String**| The id for the note. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**MemberNotes**](MemberNotes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdMergeFields

> CollectionOfMergeFields getListsIdMergeFields(listId, fields, excludeFields, count, offset, type, required)

List merge fields

Get a list of all merge fields for an audience.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        String type = "type_example"; // String | The merge field type.
        Boolean required = true; // Boolean | Whether it's a required merge field.
        try {
            CollectionOfMergeFields result = apiInstance.getListsIdMergeFields(listId, fields, excludeFields, count, offset, type, required);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdMergeFields");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **type** | **String**| The merge field type. | [optional] |
| **required** | **Boolean**| Whether it&#39;s a required merge field. | [optional] |

### Return type

[**CollectionOfMergeFields**](CollectionOfMergeFields.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdMergeFieldsId

> MergeField getListsIdMergeFieldsId(listId, mergeId, excludeFields, fields)

Get merge field

Get information about a specific merge field.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String mergeId = "mergeId_example"; // String | The id for the merge field.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        try {
            MergeField result = apiInstance.getListsIdMergeFieldsId(listId, mergeId, excludeFields, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdMergeFieldsId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **mergeId** | **String**| The id for the merge field. | |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**MergeField**](MergeField.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdSegmentsId

> List7 getListsIdSegmentsId(listId, segmentId, fields, excludeFields, includeCleaned, includeTransactional, includeUnsubscribed)

Get segment info

Get information about a specific segment.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String segmentId = "segmentId_example"; // String | The unique id for the segment.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Boolean includeCleaned = false; // Boolean | Include cleaned members in response
        Boolean includeTransactional = false; // Boolean | Include transactional members in response
        Boolean includeUnsubscribed = false; // Boolean | Include unsubscribed members in response
        try {
            List7 result = apiInstance.getListsIdSegmentsId(listId, segmentId, fields, excludeFields, includeCleaned, includeTransactional, includeUnsubscribed);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdSegmentsId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **segmentId** | **String**| The unique id for the segment. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **includeCleaned** | **Boolean**| Include cleaned members in response | [optional] |
| **includeTransactional** | **Boolean**| Include transactional members in response | [optional] |
| **includeUnsubscribed** | **Boolean**| Include unsubscribed members in response | [optional] |

### Return type

[**List7**](List7.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdSegmentsIdMembers

> SegmentMembers getListsIdSegmentsIdMembers(listId, segmentId, fields, excludeFields, count, offset, includeCleaned, includeTransactional, includeUnsubscribed)

List members in segment

Get information about members in a saved segment.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String segmentId = "segmentId_example"; // String | The unique id for the segment.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        Boolean includeCleaned = false; // Boolean | Include cleaned members in response
        Boolean includeTransactional = false; // Boolean | Include transactional members in response
        Boolean includeUnsubscribed = false; // Boolean | Include unsubscribed members in response
        try {
            SegmentMembers result = apiInstance.getListsIdSegmentsIdMembers(listId, segmentId, fields, excludeFields, count, offset, includeCleaned, includeTransactional, includeUnsubscribed);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdSegmentsIdMembers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **segmentId** | **String**| The unique id for the segment. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **includeCleaned** | **Boolean**| Include cleaned members in response | [optional] |
| **includeTransactional** | **Boolean**| Include transactional members in response | [optional] |
| **includeUnsubscribed** | **Boolean**| Include unsubscribed members in response | [optional] |

### Return type

[**SegmentMembers**](SegmentMembers.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdSignupForms

> ListSignupForms getListsIdSignupForms(listId)

List signup forms

Get signup forms for a specific list.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        try {
            ListSignupForms result = apiInstance.getListsIdSignupForms(listId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdSignupForms");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |

### Return type

[**ListSignupForms**](ListSignupForms.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdSurveys

> getListsIdSurveys(listId)

Get information about all surveys for a list

Get information about all available surveys for a specific list.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        try {
            apiInstance.getListsIdSurveys(listId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdSurveys");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdSurveysId

> getListsIdSurveysId(listId, surveyId)

Get survey

Get details about a specific survey.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String surveyId = "surveyId_example"; // String | The ID of the survey.
        try {
            apiInstance.getListsIdSurveysId(listId, surveyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdSurveysId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **surveyId** | **String**| The ID of the survey. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdWebhooks

> ListWebhooks getListsIdWebhooks(listId)

List webhooks

Get information about all webhooks for a specific list.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        try {
            ListWebhooks result = apiInstance.getListsIdWebhooks(listId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdWebhooks");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |

### Return type

[**ListWebhooks**](ListWebhooks.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getListsIdWebhooksId

> ListWebhooks getListsIdWebhooksId(listId, webhookId)

Get webhook info

Get information about a specific webhook.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String webhookId = "webhookId_example"; // String | The webhook's id.
        try {
            ListWebhooks result = apiInstance.getListsIdWebhooksId(listId, webhookId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#getListsIdWebhooksId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **webhookId** | **String**| The webhook&#39;s id. | |

### Return type

[**ListWebhooks**](ListWebhooks.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## patchListsId

> SubscriberList patchListsId(listId, body)

Update lists

Update the settings for a specific list.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        SubscriberList2 body = new SubscriberList2(); // SubscriberList2 | 
        try {
            SubscriberList result = apiInstance.patchListsId(listId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#patchListsId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **body** | [**SubscriberList2**](SubscriberList2.md)|  | |

### Return type

[**SubscriberList**](SubscriberList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## patchListsIdInterestCategoriesId

> InterestCategory patchListsIdInterestCategoriesId(listId, interestCategoryId, body)

Update interest category

Update a specific interest category.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String interestCategoryId = "interestCategoryId_example"; // String | The unique ID for the interest category.
        InterestCategory1 body = new InterestCategory1(); // InterestCategory1 | 
        try {
            InterestCategory result = apiInstance.patchListsIdInterestCategoriesId(listId, interestCategoryId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#patchListsIdInterestCategoriesId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **interestCategoryId** | **String**| The unique ID for the interest category. | |
| **body** | [**InterestCategory1**](InterestCategory1.md)|  | |

### Return type

[**InterestCategory**](InterestCategory.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## patchListsIdInterestCategoriesIdInterestsId

> Interest patchListsIdInterestCategoriesIdInterestsId(listId, interestCategoryId, interestId, body)

Update interest in category

Update interests or &#39;group names&#39; for a specific category.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String interestCategoryId = "interestCategoryId_example"; // String | The unique ID for the interest category.
        String interestId = "interestId_example"; // String | The specific interest or 'group name'.
        Interest1 body = new Interest1(); // Interest1 | 
        try {
            Interest result = apiInstance.patchListsIdInterestCategoriesIdInterestsId(listId, interestCategoryId, interestId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#patchListsIdInterestCategoriesIdInterestsId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **interestCategoryId** | **String**| The unique ID for the interest category. | |
| **interestId** | **String**| The specific interest or &#39;group name&#39;. | |
| **body** | [**Interest1**](Interest1.md)|  | |

### Return type

[**Interest**](Interest.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## patchListsIdMembersId

> ListMembers2 patchListsIdMembersId(listId, subscriberHash, body, skipMergeValidation)

Update list member

Update information for a specific list member.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
        AddListMembers3 body = new AddListMembers3(); // AddListMembers3 | 
        Boolean skipMergeValidation = true; // Boolean | If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false.
        try {
            ListMembers2 result = apiInstance.patchListsIdMembersId(listId, subscriberHash, body, skipMergeValidation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#patchListsIdMembersId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **body** | [**AddListMembers3**](AddListMembers3.md)|  | |
| **skipMergeValidation** | **Boolean**| If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false. | [optional] |

### Return type

[**ListMembers2**](ListMembers2.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## patchListsIdMembersIdNotesId

> MemberNotes patchListsIdMembersIdNotesId(listId, subscriberHash, noteId, body)

Update note

Update a specific note for a specific list member.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
        String noteId = "noteId_example"; // String | The id for the note.
        MemberNotes1 body = new MemberNotes1(); // MemberNotes1 | 
        try {
            MemberNotes result = apiInstance.patchListsIdMembersIdNotesId(listId, subscriberHash, noteId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#patchListsIdMembersIdNotesId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **noteId** | **String**| The id for the note. | |
| **body** | [**MemberNotes1**](MemberNotes1.md)|  | |

### Return type

[**MemberNotes**](MemberNotes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## patchListsIdMergeFieldsId

> MergeField patchListsIdMergeFieldsId(listId, mergeId, body)

Update merge field

Update a specific merge field.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String mergeId = "mergeId_example"; // String | The id for the merge field.
        MergeField2 body = new MergeField2(); // MergeField2 | 
        try {
            MergeField result = apiInstance.patchListsIdMergeFieldsId(listId, mergeId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#patchListsIdMergeFieldsId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **mergeId** | **String**| The id for the merge field. | |
| **body** | [**MergeField2**](MergeField2.md)|  | |

### Return type

[**MergeField**](MergeField.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## patchListsIdSegmentsId

> List7 patchListsIdSegmentsId(listId, segmentId, body)

Update segment

Update a specific segment in a list.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String segmentId = "segmentId_example"; // String | The unique id for the segment.
        List9 body = new List9(); // List9 | 
        try {
            List7 result = apiInstance.patchListsIdSegmentsId(listId, segmentId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#patchListsIdSegmentsId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **segmentId** | **String**| The unique id for the segment. | |
| **body** | [**List9**](List9.md)|  | |

### Return type

[**List7**](List7.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## patchListsIdWebhooksId

> ListWebhooks patchListsIdWebhooksId(listId, webhookId, body)

Update webhook

Update the settings for an existing webhook.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String webhookId = "webhookId_example"; // String | The webhook's id.
        AddWebhook body = new AddWebhook(); // AddWebhook | 
        try {
            ListWebhooks result = apiInstance.patchListsIdWebhooksId(listId, webhookId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#patchListsIdWebhooksId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **webhookId** | **String**| The webhook&#39;s id. | |
| **body** | [**AddWebhook**](AddWebhook.md)|  | |

### Return type

[**ListWebhooks**](ListWebhooks.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## postListMemberEvents

> postListMemberEvents(listId, subscriberHash, body)

Add event

Add an event for a list member.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
        Events body = new Events(); // Events | 
        try {
            apiInstance.postListMemberEvents(listId, subscriberHash, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#postListMemberEvents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **body** | [**Events**](Events.md)|  | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## postListMemberTags

> postListMemberTags(listId, subscriberHash, body)

Add or remove member tags

Add or remove tags from a list member. If a tag that does not exist is passed in and set as &#39;active&#39;, a new tag will be created.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address.
        MemberTags body = new MemberTags(); // MemberTags | 
        try {
            apiInstance.postListMemberTags(listId, subscriberHash, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#postListMemberTags");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. | |
| **body** | [**MemberTags**](MemberTags.md)|  | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## postLists

> SubscriberList postLists(body)

Add list

Create a new list in your Mailchimp account.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        SubscriberList1 body = new SubscriberList1(); // SubscriberList1 | 
        try {
            SubscriberList result = apiInstance.postLists(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#postLists");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**SubscriberList1**](SubscriberList1.md)|  | |

### Return type

[**SubscriberList**](SubscriberList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## postListsId

> BatchUpdateListMembers postListsId(listId, body, skipMergeValidation, skipDuplicateCheck)

Batch subscribe or unsubscribe

Batch subscribe or unsubscribe list members.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        MembersToSubscribeUnsubscribeToFromAListInBatch body = new MembersToSubscribeUnsubscribeToFromAListInBatch(); // MembersToSubscribeUnsubscribeToFromAListInBatch | 
        Boolean skipMergeValidation = true; // Boolean | If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false.
        Boolean skipDuplicateCheck = true; // Boolean | If skip_duplicate_check is true, we will ignore duplicates sent in the request when using the batch sub/unsub on the lists endpoint. The status of the first appearance in the request will be saved. This defaults to false.
        try {
            BatchUpdateListMembers result = apiInstance.postListsId(listId, body, skipMergeValidation, skipDuplicateCheck);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#postListsId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **body** | [**MembersToSubscribeUnsubscribeToFromAListInBatch**](MembersToSubscribeUnsubscribeToFromAListInBatch.md)|  | |
| **skipMergeValidation** | **Boolean**| If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false. | [optional] |
| **skipDuplicateCheck** | **Boolean**| If skip_duplicate_check is true, we will ignore duplicates sent in the request when using the batch sub/unsub on the lists endpoint. The status of the first appearance in the request will be saved. This defaults to false. | [optional] |

### Return type

[**BatchUpdateListMembers**](BatchUpdateListMembers.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## postListsIdInterestCategories

> InterestCategory postListsIdInterestCategories(listId, body)

Add interest category

Create a new interest category.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        InterestCategory1 body = new InterestCategory1(); // InterestCategory1 | 
        try {
            InterestCategory result = apiInstance.postListsIdInterestCategories(listId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#postListsIdInterestCategories");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **body** | [**InterestCategory1**](InterestCategory1.md)|  | |

### Return type

[**InterestCategory**](InterestCategory.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## postListsIdInterestCategoriesIdInterests

> Interest postListsIdInterestCategoriesIdInterests(listId, interestCategoryId, body)

Add interest in category

Create a new interest or &#39;group name&#39; for a specific category.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String interestCategoryId = "interestCategoryId_example"; // String | The unique ID for the interest category.
        Interest1 body = new Interest1(); // Interest1 | 
        try {
            Interest result = apiInstance.postListsIdInterestCategoriesIdInterests(listId, interestCategoryId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#postListsIdInterestCategoriesIdInterests");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **interestCategoryId** | **String**| The unique ID for the interest category. | |
| **body** | [**Interest1**](Interest1.md)|  | |

### Return type

[**Interest**](Interest.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## postListsIdMembers

> ListMembers2 postListsIdMembers(listId, body, skipMergeValidation)

Add member to list

Add a new member to the list.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        AddListMembers1 body = new AddListMembers1(); // AddListMembers1 | 
        Boolean skipMergeValidation = true; // Boolean | If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false.
        try {
            ListMembers2 result = apiInstance.postListsIdMembers(listId, body, skipMergeValidation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#postListsIdMembers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **body** | [**AddListMembers1**](AddListMembers1.md)|  | |
| **skipMergeValidation** | **Boolean**| If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false. | [optional] |

### Return type

[**ListMembers2**](ListMembers2.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## postListsIdMembersHashActionsDeletePermanent

> postListsIdMembersHashActionsDeletePermanent(listId, subscriberHash)

Delete list member

Delete all personally identifiable information related to a list member, and remove them from a list. This will make it impossible to re-import the list member.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address.
        try {
            apiInstance.postListsIdMembersHashActionsDeletePermanent(listId, subscriberHash);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#postListsIdMembersHashActionsDeletePermanent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## postListsIdMembersIdNotes

> MemberNotes postListsIdMembersIdNotes(listId, subscriberHash, body)

Add member note

Add a new note for a specific subscriber.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address.
        MemberNotes1 body = new MemberNotes1(); // MemberNotes1 | 
        try {
            MemberNotes result = apiInstance.postListsIdMembersIdNotes(listId, subscriberHash, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#postListsIdMembersIdNotes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. | |
| **body** | [**MemberNotes1**](MemberNotes1.md)|  | |

### Return type

[**MemberNotes**](MemberNotes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## postListsIdMergeFields

> MergeField postListsIdMergeFields(listId, body)

Add merge field

Add a new merge field for a specific audience.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        MergeField1 body = new MergeField1(); // MergeField1 | 
        try {
            MergeField result = apiInstance.postListsIdMergeFields(listId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#postListsIdMergeFields");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **body** | [**MergeField1**](MergeField1.md)|  | |

### Return type

[**MergeField**](MergeField.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## postListsIdSegments

> List7 postListsIdSegments(listId, body)

Add segment

Create a new segment in a specific list.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        List8 body = new List8(); // List8 | 
        try {
            List7 result = apiInstance.postListsIdSegments(listId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#postListsIdSegments");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **body** | [**List8**](List8.md)|  | |

### Return type

[**List7**](List7.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## postListsIdSegmentsId

> BatchAddRemoveListMembersToFromStaticSegment postListsIdSegmentsId(listId, segmentId, body)

Batch add or remove members

Batch add/remove list members to static segment

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String segmentId = "segmentId_example"; // String | The unique id for the segment.
        MembersToAddRemoveToFromAStaticSegment body = new MembersToAddRemoveToFromAStaticSegment(); // MembersToAddRemoveToFromAStaticSegment | 
        try {
            BatchAddRemoveListMembersToFromStaticSegment result = apiInstance.postListsIdSegmentsId(listId, segmentId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#postListsIdSegmentsId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **segmentId** | **String**| The unique id for the segment. | |
| **body** | [**MembersToAddRemoveToFromAStaticSegment**](MembersToAddRemoveToFromAStaticSegment.md)|  | |

### Return type

[**BatchAddRemoveListMembersToFromStaticSegment**](BatchAddRemoveListMembersToFromStaticSegment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## postListsIdSegmentsIdMembers

> ListMembers1 postListsIdSegmentsIdMembers(listId, segmentId, body)

Add member to segment

Add a member to a static segment.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String segmentId = "segmentId_example"; // String | The unique id for the segment.
        PostListsIdSegmentsIdMembersRequest body = new PostListsIdSegmentsIdMembersRequest(); // PostListsIdSegmentsIdMembersRequest | 
        try {
            ListMembers1 result = apiInstance.postListsIdSegmentsIdMembers(listId, segmentId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#postListsIdSegmentsIdMembers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **segmentId** | **String**| The unique id for the segment. | |
| **body** | [**PostListsIdSegmentsIdMembersRequest**](PostListsIdSegmentsIdMembersRequest.md)|  | |

### Return type

[**ListMembers1**](ListMembers1.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## postListsIdSignupForms

> SignupForm postListsIdSignupForms(listId, body)

Customize signup form

Customize a list&#39;s default signup form.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        SignupForm1 body = new SignupForm1(); // SignupForm1 | 
        try {
            SignupForm result = apiInstance.postListsIdSignupForms(listId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#postListsIdSignupForms");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **body** | [**SignupForm1**](SignupForm1.md)|  | |

### Return type

[**SignupForm**](SignupForm.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## postListsIdWebhooks

> ListWebhooks postListsIdWebhooks(listId, body)

Add webhook

Create a new webhook for a specific list.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        AddWebhook body = new AddWebhook(); // AddWebhook | 
        try {
            ListWebhooks result = apiInstance.postListsIdWebhooks(listId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#postListsIdWebhooks");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **body** | [**AddWebhook**](AddWebhook.md)|  | |

### Return type

[**ListWebhooks**](ListWebhooks.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## previewASegment

> CollectionOfSegments previewASegment(listId, fields, excludeFields, count, offset, type, sinceCreatedAt, beforeCreatedAt, includeCleaned, includeTransactional, includeUnsubscribed, sinceUpdatedAt, beforeUpdatedAt)

List segments

Get information about all available segments for a specific list.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        String type = "type_example"; // String | Limit results based on segment type.
        String sinceCreatedAt = "sinceCreatedAt_example"; // String | Restrict results to segments created after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        String beforeCreatedAt = "beforeCreatedAt_example"; // String | Restrict results to segments created before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        Boolean includeCleaned = false; // Boolean | Include cleaned members in response
        Boolean includeTransactional = false; // Boolean | Include transactional members in response
        Boolean includeUnsubscribed = false; // Boolean | Include unsubscribed members in response
        String sinceUpdatedAt = "sinceUpdatedAt_example"; // String | Restrict results to segments update after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        String beforeUpdatedAt = "beforeUpdatedAt_example"; // String | Restrict results to segments update before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        try {
            CollectionOfSegments result = apiInstance.previewASegment(listId, fields, excludeFields, count, offset, type, sinceCreatedAt, beforeCreatedAt, includeCleaned, includeTransactional, includeUnsubscribed, sinceUpdatedAt, beforeUpdatedAt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#previewASegment");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **type** | **String**| Limit results based on segment type. | [optional] |
| **sinceCreatedAt** | **String**| Restrict results to segments created after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **beforeCreatedAt** | **String**| Restrict results to segments created before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **includeCleaned** | **Boolean**| Include cleaned members in response | [optional] |
| **includeTransactional** | **Boolean**| Include transactional members in response | [optional] |
| **includeUnsubscribed** | **Boolean**| Include unsubscribed members in response | [optional] |
| **sinceUpdatedAt** | **String**| Restrict results to segments update after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **beforeUpdatedAt** | **String**| Restrict results to segments update before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |

### Return type

[**CollectionOfSegments**](CollectionOfSegments.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## putListsIdMembersId

> ListMembers2 putListsIdMembersId(listId, subscriberHash, body, skipMergeValidation)

Add or update list member

Add or update a list member.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
        AddListMembers2 body = new AddListMembers2(); // AddListMembers2 | 
        Boolean skipMergeValidation = true; // Boolean | If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false.
        try {
            ListMembers2 result = apiInstance.putListsIdMembersId(listId, subscriberHash, body, skipMergeValidation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#putListsIdMembersId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **body** | [**AddListMembers2**](AddListMembers2.md)|  | |
| **skipMergeValidation** | **Boolean**| If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false. | [optional] |

### Return type

[**ListMembers2**](ListMembers2.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## searchTagsByName

> TagSearchResults searchTagsByName(listId, name)

Search for tags on a list by name.

Search for tags on a list by name. If no name is provided, will return all tags on the list.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ListsApi apiInstance = new ListsApi(defaultClient);
        String listId = "listId_example"; // String | The unique ID for the list.
        String name = "name_example"; // String | The search query used to filter tags.  The search query will be compared to each tag as a prefix, so all tags that have a name starting with this field will be returned.
        try {
            TagSearchResults result = apiInstance.searchTagsByName(listId, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListsApi#searchTagsByName");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **name** | **String**| The search query used to filter tags.  The search query will be compared to each tag as a prefix, so all tags that have a name starting with this field will be returned. | [optional] |

### Return type

[**TagSearchResults**](TagSearchResults.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

