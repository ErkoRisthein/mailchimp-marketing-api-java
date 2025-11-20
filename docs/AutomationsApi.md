# AutomationsApi

All URIs are relative to *https://server.api.mailchimp.com/3.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**archiveAutomations**](AutomationsApi.md#archiveAutomations) | **POST** /automations/{workflow_id}/actions/archive | Archive automation |
| [**deleteAutomationsIdEmailsId**](AutomationsApi.md#deleteAutomationsIdEmailsId) | **DELETE** /automations/{workflow_id}/emails/{workflow_email_id} | Delete workflow email |
| [**getAutomations**](AutomationsApi.md#getAutomations) | **GET** /automations | List automations |
| [**getAutomationsId**](AutomationsApi.md#getAutomationsId) | **GET** /automations/{workflow_id} | Get automation info |
| [**getAutomationsIdEmails**](AutomationsApi.md#getAutomationsIdEmails) | **GET** /automations/{workflow_id}/emails | List automated emails |
| [**getAutomationsIdEmailsId**](AutomationsApi.md#getAutomationsIdEmailsId) | **GET** /automations/{workflow_id}/emails/{workflow_email_id} | Get workflow email info |
| [**getAutomationsIdEmailsIdQueue**](AutomationsApi.md#getAutomationsIdEmailsIdQueue) | **GET** /automations/{workflow_id}/emails/{workflow_email_id}/queue | List automated email subscribers |
| [**getAutomationsIdEmailsIdQueueId**](AutomationsApi.md#getAutomationsIdEmailsIdQueueId) | **GET** /automations/{workflow_id}/emails/{workflow_email_id}/queue/{subscriber_hash} | Get automated email subscriber |
| [**getAutomationsIdRemovedSubscribers**](AutomationsApi.md#getAutomationsIdRemovedSubscribers) | **GET** /automations/{workflow_id}/removed-subscribers | List subscribers removed from workflow |
| [**getAutomationsIdRemovedSubscribersId**](AutomationsApi.md#getAutomationsIdRemovedSubscribersId) | **GET** /automations/{workflow_id}/removed-subscribers/{subscriber_hash} | Get subscriber removed from workflow |
| [**patchAutomationEmailWorkflowId**](AutomationsApi.md#patchAutomationEmailWorkflowId) | **PATCH** /automations/{workflow_id}/emails/{workflow_email_id} | Update workflow email |
| [**postAutomations**](AutomationsApi.md#postAutomations) | **POST** /automations | Add automation |
| [**postAutomationsIdActionsPauseAllEmails**](AutomationsApi.md#postAutomationsIdActionsPauseAllEmails) | **POST** /automations/{workflow_id}/actions/pause-all-emails | Pause automation emails |
| [**postAutomationsIdActionsStartAllEmails**](AutomationsApi.md#postAutomationsIdActionsStartAllEmails) | **POST** /automations/{workflow_id}/actions/start-all-emails | Start automation emails |
| [**postAutomationsIdEmailsIdActionsPause**](AutomationsApi.md#postAutomationsIdEmailsIdActionsPause) | **POST** /automations/{workflow_id}/emails/{workflow_email_id}/actions/pause | Pause automated email |
| [**postAutomationsIdEmailsIdActionsStart**](AutomationsApi.md#postAutomationsIdEmailsIdActionsStart) | **POST** /automations/{workflow_id}/emails/{workflow_email_id}/actions/start | Start automated email |
| [**postAutomationsIdEmailsIdQueue**](AutomationsApi.md#postAutomationsIdEmailsIdQueue) | **POST** /automations/{workflow_id}/emails/{workflow_email_id}/queue | Add subscriber to workflow email |
| [**postAutomationsIdRemovedSubscribers**](AutomationsApi.md#postAutomationsIdRemovedSubscribers) | **POST** /automations/{workflow_id}/removed-subscribers | Remove subscriber from workflow |



## archiveAutomations

> archiveAutomations(workflowId)

Archive automation

Archiving will permanently end your automation and keep the report data. You’ll be able to replicate your archived automation, but you can’t restart it.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.AutomationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AutomationsApi apiInstance = new AutomationsApi(defaultClient);
        String workflowId = "workflowId_example"; // String | The unique id for the Automation workflow.
        try {
            apiInstance.archiveAutomations(workflowId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomationsApi#archiveAutomations");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |

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


## deleteAutomationsIdEmailsId

> deleteAutomationsIdEmailsId(workflowId, workflowEmailId)

Delete workflow email

Removes an individual classic automation workflow email. Emails from certain workflow types, including the Abandoned Cart Email (abandonedCart) and Product Retargeting Email (abandonedBrowse) Workflows, cannot be deleted.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.AutomationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AutomationsApi apiInstance = new AutomationsApi(defaultClient);
        String workflowId = "workflowId_example"; // String | The unique id for the Automation workflow.
        String workflowEmailId = "workflowEmailId_example"; // String | The unique id for the Automation workflow email.
        try {
            apiInstance.deleteAutomationsIdEmailsId(workflowId, workflowEmailId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomationsApi#deleteAutomationsIdEmailsId");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **workflowEmailId** | **String**| The unique id for the Automation workflow email. | |

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


## getAutomations

> GetAutomations200Response getAutomations(count, offset, fields, excludeFields, beforeCreateTime, sinceCreateTime, beforeStartTime, sinceStartTime, status)

List automations

Get a summary of an account&#39;s classic automations.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.AutomationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AutomationsApi apiInstance = new AutomationsApi(defaultClient);
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        OffsetDateTime beforeCreateTime = OffsetDateTime.now(); // OffsetDateTime | Restrict the response to automations created before this time. Uses the ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        OffsetDateTime sinceCreateTime = OffsetDateTime.now(); // OffsetDateTime | Restrict the response to automations created after this time. Uses the ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        OffsetDateTime beforeStartTime = OffsetDateTime.now(); // OffsetDateTime | Restrict the response to automations started before this time. Uses the ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        OffsetDateTime sinceStartTime = OffsetDateTime.now(); // OffsetDateTime | Restrict the response to automations started after this time. Uses the ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        String status = "save"; // String | Restrict the results to automations with the specified status.
        try {
            GetAutomations200Response result = apiInstance.getAutomations(count, offset, fields, excludeFields, beforeCreateTime, sinceCreateTime, beforeStartTime, sinceStartTime, status);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomationsApi#getAutomations");
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
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **beforeCreateTime** | **OffsetDateTime**| Restrict the response to automations created before this time. Uses the ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **sinceCreateTime** | **OffsetDateTime**| Restrict the response to automations created after this time. Uses the ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **beforeStartTime** | **OffsetDateTime**| Restrict the response to automations started before this time. Uses the ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **sinceStartTime** | **OffsetDateTime**| Restrict the response to automations started after this time. Uses the ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **status** | **String**| Restrict the results to automations with the specified status. | [optional] [enum: save, paused, sending] |

### Return type

[**GetAutomations200Response**](GetAutomations200Response.md)

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


## getAutomationsId

> AutomationWorkflow getAutomationsId(workflowId, fields, excludeFields)

Get automation info

Get a summary of an individual classic automation workflow&#39;s settings and content. The &#x60;trigger_settings&#x60; object returns information for the first email in the workflow.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.AutomationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AutomationsApi apiInstance = new AutomationsApi(defaultClient);
        String workflowId = "workflowId_example"; // String | The unique id for the Automation workflow.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            AutomationWorkflow result = apiInstance.getAutomationsId(workflowId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomationsApi#getAutomationsId");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**AutomationWorkflow**](AutomationWorkflow.md)

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


## getAutomationsIdEmails

> AutomationEmails getAutomationsIdEmails(workflowId)

List automated emails

Get a summary of the emails in a classic automation workflow.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.AutomationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AutomationsApi apiInstance = new AutomationsApi(defaultClient);
        String workflowId = "workflowId_example"; // String | The unique id for the Automation workflow.
        try {
            AutomationEmails result = apiInstance.getAutomationsIdEmails(workflowId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomationsApi#getAutomationsIdEmails");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |

### Return type

[**AutomationEmails**](AutomationEmails.md)

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


## getAutomationsIdEmailsId

> AutomationWorkflowEmail getAutomationsIdEmailsId(workflowId, workflowEmailId)

Get workflow email info

Get information about an individual classic automation workflow email.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.AutomationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AutomationsApi apiInstance = new AutomationsApi(defaultClient);
        String workflowId = "workflowId_example"; // String | The unique id for the Automation workflow.
        String workflowEmailId = "workflowEmailId_example"; // String | The unique id for the Automation workflow email.
        try {
            AutomationWorkflowEmail result = apiInstance.getAutomationsIdEmailsId(workflowId, workflowEmailId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomationsApi#getAutomationsIdEmailsId");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **workflowEmailId** | **String**| The unique id for the Automation workflow email. | |

### Return type

[**AutomationWorkflowEmail**](AutomationWorkflowEmail.md)

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


## getAutomationsIdEmailsIdQueue

> GetAutomationsIdEmailsIdQueue200Response getAutomationsIdEmailsIdQueue(workflowId, workflowEmailId)

List automated email subscribers

Get information about a classic automation email queue.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.AutomationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AutomationsApi apiInstance = new AutomationsApi(defaultClient);
        String workflowId = "workflowId_example"; // String | The unique id for the Automation workflow.
        String workflowEmailId = "workflowEmailId_example"; // String | The unique id for the Automation workflow email.
        try {
            GetAutomationsIdEmailsIdQueue200Response result = apiInstance.getAutomationsIdEmailsIdQueue(workflowId, workflowEmailId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomationsApi#getAutomationsIdEmailsIdQueue");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **workflowEmailId** | **String**| The unique id for the Automation workflow email. | |

### Return type

[**GetAutomationsIdEmailsIdQueue200Response**](GetAutomationsIdEmailsIdQueue200Response.md)

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


## getAutomationsIdEmailsIdQueueId

> SubscriberInAutomationQueue2 getAutomationsIdEmailsIdQueueId(workflowId, workflowEmailId, subscriberHash)

Get automated email subscriber

Get information about a specific subscriber in a classic automation email queue.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.AutomationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AutomationsApi apiInstance = new AutomationsApi(defaultClient);
        String workflowId = "workflowId_example"; // String | The unique id for the Automation workflow.
        String workflowEmailId = "workflowEmailId_example"; // String | The unique id for the Automation workflow email.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address.
        try {
            SubscriberInAutomationQueue2 result = apiInstance.getAutomationsIdEmailsIdQueueId(workflowId, workflowEmailId, subscriberHash);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomationsApi#getAutomationsIdEmailsIdQueueId");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **workflowEmailId** | **String**| The unique id for the Automation workflow email. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. | |

### Return type

[**SubscriberInAutomationQueue2**](SubscriberInAutomationQueue2.md)

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


## getAutomationsIdRemovedSubscribers

> RemovedSubscribers getAutomationsIdRemovedSubscribers(workflowId)

List subscribers removed from workflow

Get information about subscribers who were removed from a classic automation workflow.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.AutomationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AutomationsApi apiInstance = new AutomationsApi(defaultClient);
        String workflowId = "workflowId_example"; // String | The unique id for the Automation workflow.
        try {
            RemovedSubscribers result = apiInstance.getAutomationsIdRemovedSubscribers(workflowId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomationsApi#getAutomationsIdRemovedSubscribers");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |

### Return type

[**RemovedSubscribers**](RemovedSubscribers.md)

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


## getAutomationsIdRemovedSubscribersId

> SubscriberRemovedFromAutomationWorkflow getAutomationsIdRemovedSubscribersId(workflowId, subscriberHash)

Get subscriber removed from workflow

Get information about a specific subscriber who was removed from a classic automation workflow.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.AutomationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AutomationsApi apiInstance = new AutomationsApi(defaultClient);
        String workflowId = "workflowId_example"; // String | The unique id for the Automation workflow.
        String subscriberHash = "subscriberHash_example"; // String | The MD5 hash of the lowercase version of the list member's email address.
        try {
            SubscriberRemovedFromAutomationWorkflow result = apiInstance.getAutomationsIdRemovedSubscribersId(workflowId, subscriberHash);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomationsApi#getAutomationsIdRemovedSubscribersId");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. | |

### Return type

[**SubscriberRemovedFromAutomationWorkflow**](SubscriberRemovedFromAutomationWorkflow.md)

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


## patchAutomationEmailWorkflowId

> AutomationWorkflowEmail patchAutomationEmailWorkflowId(workflowId, workflowEmailId, body)

Update workflow email

Update settings for a classic automation workflow email.  Only works with workflows of type: abandonedBrowse, abandonedCart, emailFollowup, or singleWelcome.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.AutomationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AutomationsApi apiInstance = new AutomationsApi(defaultClient);
        String workflowId = "workflowId_example"; // String | The unique id for the Automation workflow.
        String workflowEmailId = "workflowEmailId_example"; // String | The unique id for the Automation workflow email.
        UpdateInformationAboutASpecificWorkflowEmail body = new UpdateInformationAboutASpecificWorkflowEmail(); // UpdateInformationAboutASpecificWorkflowEmail | 
        try {
            AutomationWorkflowEmail result = apiInstance.patchAutomationEmailWorkflowId(workflowId, workflowEmailId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomationsApi#patchAutomationEmailWorkflowId");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **workflowEmailId** | **String**| The unique id for the Automation workflow email. | |
| **body** | [**UpdateInformationAboutASpecificWorkflowEmail**](UpdateInformationAboutASpecificWorkflowEmail.md)|  | |

### Return type

[**AutomationWorkflowEmail**](AutomationWorkflowEmail.md)

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


## postAutomations

> AutomationWorkflow postAutomations(body)

Add automation

Create a new classic automation in your Mailchimp account.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.AutomationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AutomationsApi apiInstance = new AutomationsApi(defaultClient);
        AutomationWorkflow1 body = new AutomationWorkflow1(); // AutomationWorkflow1 | 
        try {
            AutomationWorkflow result = apiInstance.postAutomations(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomationsApi#postAutomations");
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
| **body** | [**AutomationWorkflow1**](AutomationWorkflow1.md)|  | |

### Return type

[**AutomationWorkflow**](AutomationWorkflow.md)

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


## postAutomationsIdActionsPauseAllEmails

> postAutomationsIdActionsPauseAllEmails(workflowId)

Pause automation emails

Pause all emails in a specific classic automation workflow.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.AutomationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AutomationsApi apiInstance = new AutomationsApi(defaultClient);
        String workflowId = "workflowId_example"; // String | The unique id for the Automation workflow.
        try {
            apiInstance.postAutomationsIdActionsPauseAllEmails(workflowId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomationsApi#postAutomationsIdActionsPauseAllEmails");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |

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


## postAutomationsIdActionsStartAllEmails

> postAutomationsIdActionsStartAllEmails(workflowId)

Start automation emails

Start all emails in a classic automation workflow.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.AutomationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AutomationsApi apiInstance = new AutomationsApi(defaultClient);
        String workflowId = "workflowId_example"; // String | The unique id for the Automation workflow.
        try {
            apiInstance.postAutomationsIdActionsStartAllEmails(workflowId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomationsApi#postAutomationsIdActionsStartAllEmails");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |

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


## postAutomationsIdEmailsIdActionsPause

> postAutomationsIdEmailsIdActionsPause(workflowId, workflowEmailId)

Pause automated email

Pause an automated email.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.AutomationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AutomationsApi apiInstance = new AutomationsApi(defaultClient);
        String workflowId = "workflowId_example"; // String | The unique id for the Automation workflow.
        String workflowEmailId = "workflowEmailId_example"; // String | The unique id for the Automation workflow email.
        try {
            apiInstance.postAutomationsIdEmailsIdActionsPause(workflowId, workflowEmailId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomationsApi#postAutomationsIdEmailsIdActionsPause");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **workflowEmailId** | **String**| The unique id for the Automation workflow email. | |

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


## postAutomationsIdEmailsIdActionsStart

> postAutomationsIdEmailsIdActionsStart(workflowId, workflowEmailId)

Start automated email

Start an automated email.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.AutomationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AutomationsApi apiInstance = new AutomationsApi(defaultClient);
        String workflowId = "workflowId_example"; // String | The unique id for the Automation workflow.
        String workflowEmailId = "workflowEmailId_example"; // String | The unique id for the Automation workflow email.
        try {
            apiInstance.postAutomationsIdEmailsIdActionsStart(workflowId, workflowEmailId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomationsApi#postAutomationsIdEmailsIdActionsStart");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **workflowEmailId** | **String**| The unique id for the Automation workflow email. | |

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


## postAutomationsIdEmailsIdQueue

> SubscriberInAutomationQueue2 postAutomationsIdEmailsIdQueue(workflowId, workflowEmailId, body)

Add subscriber to workflow email

Manually add a subscriber to a workflow, bypassing the default trigger settings. You can also use this endpoint to trigger a series of automated emails in an API 3.0 workflow type.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.AutomationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AutomationsApi apiInstance = new AutomationsApi(defaultClient);
        String workflowId = "workflowId_example"; // String | The unique id for the Automation workflow.
        String workflowEmailId = "workflowEmailId_example"; // String | The unique id for the Automation workflow email.
        SubscriberInAutomationQueue1 body = new SubscriberInAutomationQueue1(); // SubscriberInAutomationQueue1 | 
        try {
            SubscriberInAutomationQueue2 result = apiInstance.postAutomationsIdEmailsIdQueue(workflowId, workflowEmailId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomationsApi#postAutomationsIdEmailsIdQueue");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **workflowEmailId** | **String**| The unique id for the Automation workflow email. | |
| **body** | [**SubscriberInAutomationQueue1**](SubscriberInAutomationQueue1.md)|  | |

### Return type

[**SubscriberInAutomationQueue2**](SubscriberInAutomationQueue2.md)

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


## postAutomationsIdRemovedSubscribers

> SubscriberRemovedFromAutomationWorkflow postAutomationsIdRemovedSubscribers(workflowId, body)

Remove subscriber from workflow

Remove a subscriber from a specific classic automation workflow. You can remove a subscriber at any point in an automation workflow, regardless of how many emails they&#39;ve been sent from that workflow. Once they&#39;re removed, they can never be added back to the same workflow.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.AutomationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AutomationsApi apiInstance = new AutomationsApi(defaultClient);
        String workflowId = "workflowId_example"; // String | The unique id for the Automation workflow.
        SubscriberInAutomationQueue1 body = new SubscriberInAutomationQueue1(); // SubscriberInAutomationQueue1 | 
        try {
            SubscriberRemovedFromAutomationWorkflow result = apiInstance.postAutomationsIdRemovedSubscribers(workflowId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomationsApi#postAutomationsIdRemovedSubscribers");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **body** | [**SubscriberInAutomationQueue1**](SubscriberInAutomationQueue1.md)|  | |

### Return type

[**SubscriberRemovedFromAutomationWorkflow**](SubscriberRemovedFromAutomationWorkflow.md)

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

