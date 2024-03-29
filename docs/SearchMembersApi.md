# SearchMembersApi

All URIs are relative to *https://server.api.mailchimp.com/3.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSearchMembers**](SearchMembersApi.md#getSearchMembers) | **GET** /search-members | Search members |



## getSearchMembers

> Members getSearchMembers(query, fields, excludeFields, listId)

Search members

Search for list members. This search can be restricted to a specific list, or can be used to search across all lists in an account.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.SearchMembersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        SearchMembersApi apiInstance = new SearchMembersApi(defaultClient);
        String query = "query_example"; // String | The search query used to filter results. Query should be a valid email, or a string representing a contact's first or last name.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        String listId = "listId_example"; // String | The unique id for the list.
        try {
            Members result = apiInstance.getSearchMembers(query, fields, excludeFields, listId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchMembersApi#getSearchMembers");
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
| **query** | **String**| The search query used to filter results. Query should be a valid email, or a string representing a contact&#39;s first or last name. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **listId** | **String**| The unique id for the list. | [optional] |

### Return type

[**Members**](Members.md)

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

