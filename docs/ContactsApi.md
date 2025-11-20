# ContactsApi

All URIs are relative to *https://server.api.mailchimp.com/3.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAudienceContact**](ContactsApi.md#createAudienceContact) | **POST** /audiences/{audience_id}/contacts | Add Contact |
| [**getAudienceContact**](ContactsApi.md#getAudienceContact) | **GET** /audiences/{audience_id}/contacts/{contact_id} | Get Contact |
| [**getAudienceContactList**](ContactsApi.md#getAudienceContactList) | **GET** /audiences/{audience_id}/contacts | Get Contacts |
| [**getAudienceContacts**](ContactsApi.md#getAudienceContacts) | **GET** /audiences | Get a list of audiences |
| [**getAudienceId**](ContactsApi.md#getAudienceId) | **GET** /audiences/{audience_id} | Get audience info |
| [**patchAudienceContact**](ContactsApi.md#patchAudienceContact) | **PATCH** /audiences/{audience_id}/contacts/{contact_id} | Update Contact |
| [**postAudiencesContactsActionsArchive**](ContactsApi.md#postAudiencesContactsActionsArchive) | **POST** /audiences/{audience_id}/contacts/{contact_id}/actions/archive | Archive Contact |
| [**postAudiencesContactsActionsForget**](ContactsApi.md#postAudiencesContactsActionsForget) | **POST** /audiences/{audience_id}/contacts/{contact_id}/actions/forget | Forget Contact |



## createAudienceContact

> ContactsInner createAudienceContact(audienceId, body, mergeFieldValidationMode, dataMode)

Add Contact

Create a new omni-channel contact for an audience.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ContactsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        String audienceId = "audienceId_example"; // String | The unique ID for the audience.
        CreateAudienceContactRequest body = new CreateAudienceContactRequest(); // CreateAudienceContactRequest | 
        String mergeFieldValidationMode = "ignore_required_checks"; // String | Defines how merge field validation is handled. When set to `ignore_required_checks`, the API does not raise an error if required merge fields are missing from the request. When set to `strict`, the API enforces validation and returns an error if any required merge field is not provided. If this setting is omitted, `strict` is applied by default.
        String dataMode = "historical"; // String | Indicates the data processing mode. In `historical` mode, contact data changes do not trigger automations or webhooks. In `live mode`, such changes do trigger them.
        try {
            ContactsInner result = apiInstance.createAudienceContact(audienceId, body, mergeFieldValidationMode, dataMode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#createAudienceContact");
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
| **audienceId** | **String**| The unique ID for the audience. | |
| **body** | [**CreateAudienceContactRequest**](CreateAudienceContactRequest.md)|  | |
| **mergeFieldValidationMode** | **String**| Defines how merge field validation is handled. When set to &#x60;ignore_required_checks&#x60;, the API does not raise an error if required merge fields are missing from the request. When set to &#x60;strict&#x60;, the API enforces validation and returns an error if any required merge field is not provided. If this setting is omitted, &#x60;strict&#x60; is applied by default. | [optional] [enum: ignore_required_checks, strict] |
| **dataMode** | **String**| Indicates the data processing mode. In &#x60;historical&#x60; mode, contact data changes do not trigger automations or webhooks. In &#x60;live mode&#x60;, such changes do trigger them. | [optional] [enum: historical, live] |

### Return type

[**ContactsInner**](ContactsInner.md)

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


## getAudienceContact

> ContactsInner getAudienceContact(audienceId, contactId, fields, excludeFields)

Get Contact

Retrieve a specific omni-channel contact in an audience.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ContactsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        String audienceId = "audienceId_example"; // String | The unique ID for the audience.
        String contactId = "contactId_example"; // String | A unique identifier for the contact, which can be a Mailchimp contact ID or a channel hash. A channel hash must follow the format email:[md5_hash] (where the hash is the MD5 of the lowercased email address) or sms:[sha256_hash] (where the hash is the SHA256 of the E.164-formatted phone number).
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            ContactsInner result = apiInstance.getAudienceContact(audienceId, contactId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#getAudienceContact");
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
| **audienceId** | **String**| The unique ID for the audience. | |
| **contactId** | **String**| A unique identifier for the contact, which can be a Mailchimp contact ID or a channel hash. A channel hash must follow the format email:[md5_hash] (where the hash is the MD5 of the lowercased email address) or sms:[sha256_hash] (where the hash is the SHA256 of the E.164-formatted phone number). | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ContactsInner**](ContactsInner.md)

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


## getAudienceContactList

> GetAudienceContactList200Response getAudienceContactList(audienceId, fields, excludeFields, count, cursor, createdBefore, createdSince, updatedBefore, updatedSince)

Get Contacts

Get a list of omni-channel contacts for a given audience.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ContactsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        String audienceId = "audienceId_example"; // String | The unique ID for the audience.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        String cursor = "cursor_example"; // String | Paginate through a collection of records by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request. Default value fetches the first \"page\" of results.
        OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Restricts the response to contacts created at or before the specified time (inclusive). Uses ISO 8601 format: 2025-04-23T15:41:36+00:00.
        OffsetDateTime createdSince = OffsetDateTime.now(); // OffsetDateTime | Restricts the response to contacts created after the specified time (exclusive). Uses ISO 8601 format: 2025-04-23T15:41:36+00:00.
        OffsetDateTime updatedBefore = OffsetDateTime.now(); // OffsetDateTime | Restricts the response to contacts updated at or before the specified time (inclusive). Uses ISO 8601 format: 2025-04-23T15:41:36+00:00.
        OffsetDateTime updatedSince = OffsetDateTime.now(); // OffsetDateTime | Restricts the response to contacts updated after the specified time (exclusive). Uses ISO 8601 format: 2025-04-23T15:41:36+00:00.
        try {
            GetAudienceContactList200Response result = apiInstance.getAudienceContactList(audienceId, fields, excludeFields, count, cursor, createdBefore, createdSince, updatedBefore, updatedSince);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#getAudienceContactList");
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
| **audienceId** | **String**| The unique ID for the audience. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **cursor** | **String**| Paginate through a collection of records by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request. Default value fetches the first \&quot;page\&quot; of results. | [optional] |
| **createdBefore** | **OffsetDateTime**| Restricts the response to contacts created at or before the specified time (inclusive). Uses ISO 8601 format: 2025-04-23T15:41:36+00:00. | [optional] |
| **createdSince** | **OffsetDateTime**| Restricts the response to contacts created after the specified time (exclusive). Uses ISO 8601 format: 2025-04-23T15:41:36+00:00. | [optional] |
| **updatedBefore** | **OffsetDateTime**| Restricts the response to contacts updated at or before the specified time (inclusive). Uses ISO 8601 format: 2025-04-23T15:41:36+00:00. | [optional] |
| **updatedSince** | **OffsetDateTime**| Restricts the response to contacts updated after the specified time (exclusive). Uses ISO 8601 format: 2025-04-23T15:41:36+00:00. | [optional] |

### Return type

[**GetAudienceContactList200Response**](GetAudienceContactList200Response.md)

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


## getAudienceContacts

> GetAudienceContacts200Response getAudienceContacts(fields, excludeFields, count, offset)

Get a list of audiences

Get information about all audiences in the account.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ContactsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0.
        try {
            GetAudienceContacts200Response result = apiInstance.getAudienceContacts(fields, excludeFields, count, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#getAudienceContacts");
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
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**GetAudienceContacts200Response**](GetAudienceContacts200Response.md)

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


## getAudienceId

> AudiencesInner getAudienceId(audienceId, fields, excludeFields)

Get audience info

Get information about a specific audience.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ContactsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        String audienceId = "audienceId_example"; // String | The unique ID for the audience.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            AudiencesInner result = apiInstance.getAudienceId(audienceId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#getAudienceId");
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
| **audienceId** | **String**| The unique ID for the audience. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**AudiencesInner**](AudiencesInner.md)

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


## patchAudienceContact

> ContactsInner patchAudienceContact(audienceId, contactId, body, mergeFieldValidationMode, dataMode)

Update Contact

Update an existing omni-channel contact.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ContactsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        String audienceId = "audienceId_example"; // String | The unique ID for the audience.
        String contactId = "contactId_example"; // String | The unique id for the contact.
        PatchAudienceContactRequest body = new PatchAudienceContactRequest(); // PatchAudienceContactRequest | 
        String mergeFieldValidationMode = "ignore_required_checks"; // String | Defines how merge field validation is handled. When set to `ignore_required_checks`, the API does not raise an error if required merge fields are missing from the request. When set to `strict`, the API enforces validation and returns an error if any required merge field is not provided. If this setting is omitted, `strict` is applied by default.
        String dataMode = "historical"; // String | Indicates the data processing mode. In `historical` mode, contact data changes do not trigger automations or webhooks. In `live mode`, such changes do trigger them.
        try {
            ContactsInner result = apiInstance.patchAudienceContact(audienceId, contactId, body, mergeFieldValidationMode, dataMode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#patchAudienceContact");
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
| **audienceId** | **String**| The unique ID for the audience. | |
| **contactId** | **String**| The unique id for the contact. | |
| **body** | [**PatchAudienceContactRequest**](PatchAudienceContactRequest.md)|  | |
| **mergeFieldValidationMode** | **String**| Defines how merge field validation is handled. When set to &#x60;ignore_required_checks&#x60;, the API does not raise an error if required merge fields are missing from the request. When set to &#x60;strict&#x60;, the API enforces validation and returns an error if any required merge field is not provided. If this setting is omitted, &#x60;strict&#x60; is applied by default. | [optional] [enum: ignore_required_checks, strict] |
| **dataMode** | **String**| Indicates the data processing mode. In &#x60;historical&#x60; mode, contact data changes do not trigger automations or webhooks. In &#x60;live mode&#x60;, such changes do trigger them. | [optional] [enum: historical, live] |

### Return type

[**ContactsInner**](ContactsInner.md)

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


## postAudiencesContactsActionsArchive

> postAudiencesContactsActionsArchive(audienceId, contactId)

Archive Contact

Archives a Contact.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ContactsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        String audienceId = "audienceId_example"; // String | The unique ID for the audience.
        String contactId = "contactId_example"; // String | The unique id for the contact.
        try {
            apiInstance.postAudiencesContactsActionsArchive(audienceId, contactId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#postAudiencesContactsActionsArchive");
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
| **audienceId** | **String**| The unique ID for the audience. | |
| **contactId** | **String**| The unique id for the contact. | |

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


## postAudiencesContactsActionsForget

> postAudiencesContactsActionsForget(audienceId, contactId)

Forget Contact

Forgets a Contact.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ContactsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        String audienceId = "audienceId_example"; // String | The unique ID for the audience.
        String contactId = "contactId_example"; // String | The unique id for the contact.
        try {
            apiInstance.postAudiencesContactsActionsForget(audienceId, contactId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#postAudiencesContactsActionsForget");
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
| **audienceId** | **String**| The unique ID for the audience. | |
| **contactId** | **String**| The unique id for the contact. | |

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

