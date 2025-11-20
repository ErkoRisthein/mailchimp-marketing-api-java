# CampaignsApi

All URIs are relative to *https://server.api.mailchimp.com/3.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCampaignsId**](CampaignsApi.md#deleteCampaignsId) | **DELETE** /campaigns/{campaign_id} | Delete campaign |
| [**deleteCampaignsIdFeedbackId**](CampaignsApi.md#deleteCampaignsIdFeedbackId) | **DELETE** /campaigns/{campaign_id}/feedback/{feedback_id} | Delete campaign feedback message |
| [**getCampaigns**](CampaignsApi.md#getCampaigns) | **GET** /campaigns | List campaigns |
| [**getCampaignsId**](CampaignsApi.md#getCampaignsId) | **GET** /campaigns/{campaign_id} | Get campaign info |
| [**getCampaignsIdContent**](CampaignsApi.md#getCampaignsIdContent) | **GET** /campaigns/{campaign_id}/content | Get campaign content |
| [**getCampaignsIdFeedback**](CampaignsApi.md#getCampaignsIdFeedback) | **GET** /campaigns/{campaign_id}/feedback | List campaign feedback |
| [**getCampaignsIdFeedbackId**](CampaignsApi.md#getCampaignsIdFeedbackId) | **GET** /campaigns/{campaign_id}/feedback/{feedback_id} | Get campaign feedback message |
| [**getCampaignsIdSendChecklist**](CampaignsApi.md#getCampaignsIdSendChecklist) | **GET** /campaigns/{campaign_id}/send-checklist | Get campaign send checklist |
| [**patchCampaignsId**](CampaignsApi.md#patchCampaignsId) | **PATCH** /campaigns/{campaign_id} | Update campaign settings |
| [**patchCampaignsIdFeedbackId**](CampaignsApi.md#patchCampaignsIdFeedbackId) | **PATCH** /campaigns/{campaign_id}/feedback/{feedback_id} | Update campaign feedback message |
| [**postCampaigns**](CampaignsApi.md#postCampaigns) | **POST** /campaigns | Add campaign |
| [**postCampaignsIdActionsCancelSend**](CampaignsApi.md#postCampaignsIdActionsCancelSend) | **POST** /campaigns/{campaign_id}/actions/cancel-send | Cancel campaign |
| [**postCampaignsIdActionsCreateResend**](CampaignsApi.md#postCampaignsIdActionsCreateResend) | **POST** /campaigns/{campaign_id}/actions/create-resend | Resend campaign |
| [**postCampaignsIdActionsPause**](CampaignsApi.md#postCampaignsIdActionsPause) | **POST** /campaigns/{campaign_id}/actions/pause | Pause rss campaign |
| [**postCampaignsIdActionsReplicate**](CampaignsApi.md#postCampaignsIdActionsReplicate) | **POST** /campaigns/{campaign_id}/actions/replicate | Replicate campaign |
| [**postCampaignsIdActionsResume**](CampaignsApi.md#postCampaignsIdActionsResume) | **POST** /campaigns/{campaign_id}/actions/resume | Resume rss campaign |
| [**postCampaignsIdActionsSchedule**](CampaignsApi.md#postCampaignsIdActionsSchedule) | **POST** /campaigns/{campaign_id}/actions/schedule | Schedule campaign |
| [**postCampaignsIdActionsSend**](CampaignsApi.md#postCampaignsIdActionsSend) | **POST** /campaigns/{campaign_id}/actions/send | Send campaign |
| [**postCampaignsIdActionsTest**](CampaignsApi.md#postCampaignsIdActionsTest) | **POST** /campaigns/{campaign_id}/actions/test | Send test email |
| [**postCampaignsIdActionsUnschedule**](CampaignsApi.md#postCampaignsIdActionsUnschedule) | **POST** /campaigns/{campaign_id}/actions/unschedule | Unschedule campaign |
| [**postCampaignsIdFeedback**](CampaignsApi.md#postCampaignsIdFeedback) | **POST** /campaigns/{campaign_id}/feedback | Add campaign feedback |
| [**putCampaignsIdContent**](CampaignsApi.md#putCampaignsIdContent) | **PUT** /campaigns/{campaign_id}/content | Set campaign content |



## deleteCampaignsId

> deleteCampaignsId(campaignId)

Delete campaign

Remove a campaign from your Mailchimp account.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        try {
            apiInstance.deleteCampaignsId(campaignId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#deleteCampaignsId");
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
| **campaignId** | **String**| The unique id for the campaign. | |

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


## deleteCampaignsIdFeedbackId

> deleteCampaignsIdFeedbackId(campaignId, feedbackId)

Delete campaign feedback message

Remove a specific feedback message for a campaign.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        String feedbackId = "feedbackId_example"; // String | The unique id for the feedback message.
        try {
            apiInstance.deleteCampaignsIdFeedbackId(campaignId, feedbackId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#deleteCampaignsIdFeedbackId");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **feedbackId** | **String**| The unique id for the feedback message. | |

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


## getCampaigns

> GetCampaigns200Response getCampaigns(fields, excludeFields, count, offset, type, status, beforeSendTime, sinceSendTime, beforeCreateTime, sinceCreateTime, listId, folderId, memberId, sortField, sortDir, includeResendShortcutEligibility)

List campaigns

Get all campaigns in an account.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0.
        String type = "regular"; // String | The campaign type.
        String status = "save"; // String | The status of the campaign.
        OffsetDateTime beforeSendTime = OffsetDateTime.now(); // OffsetDateTime | Restrict the response to campaigns sent before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        OffsetDateTime sinceSendTime = OffsetDateTime.now(); // OffsetDateTime | Restrict the response to campaigns sent after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        OffsetDateTime beforeCreateTime = OffsetDateTime.now(); // OffsetDateTime | Restrict the response to campaigns created before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        OffsetDateTime sinceCreateTime = OffsetDateTime.now(); // OffsetDateTime | Restrict the response to campaigns created after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        String listId = "listId_example"; // String | The unique id for the list.
        String folderId = "folderId_example"; // String | The unique folder id.
        String memberId = "memberId_example"; // String | Retrieve campaigns sent to a particular list member. Member ID is The MD5 hash of the lowercase version of the list member’s email address.
        String sortField = "create_time"; // String | Returns files sorted by the specified field.
        String sortDir = "ASC"; // String | Determines the order direction for sorted results.
        Boolean includeResendShortcutEligibility = true; // Boolean | Return the `resend_shortcut_eligibility` field in the response, which tells you if the campaign is eligible for the various Campaign Resend Shortcuts offered.
        try {
            GetCampaigns200Response result = apiInstance.getCampaigns(fields, excludeFields, count, offset, type, status, beforeSendTime, sinceSendTime, beforeCreateTime, sinceCreateTime, listId, folderId, memberId, sortField, sortDir, includeResendShortcutEligibility);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#getCampaigns");
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
| **type** | **String**| The campaign type. | [optional] [enum: regular, plaintext, absplit, rss, variate] |
| **status** | **String**| The status of the campaign. | [optional] [enum: save, paused, schedule, sending, sent] |
| **beforeSendTime** | **OffsetDateTime**| Restrict the response to campaigns sent before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **sinceSendTime** | **OffsetDateTime**| Restrict the response to campaigns sent after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **beforeCreateTime** | **OffsetDateTime**| Restrict the response to campaigns created before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **sinceCreateTime** | **OffsetDateTime**| Restrict the response to campaigns created after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **listId** | **String**| The unique id for the list. | [optional] |
| **folderId** | **String**| The unique folder id. | [optional] |
| **memberId** | **String**| Retrieve campaigns sent to a particular list member. Member ID is The MD5 hash of the lowercase version of the list member’s email address. | [optional] |
| **sortField** | **String**| Returns files sorted by the specified field. | [optional] [enum: create_time, send_time] |
| **sortDir** | **String**| Determines the order direction for sorted results. | [optional] [enum: ASC, DESC] |
| **includeResendShortcutEligibility** | **Boolean**| Return the &#x60;resend_shortcut_eligibility&#x60; field in the response, which tells you if the campaign is eligible for the various Campaign Resend Shortcuts offered. | [optional] |

### Return type

[**GetCampaigns200Response**](GetCampaigns200Response.md)

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


## getCampaignsId

> Campaign getCampaignsId(campaignId, fields, excludeFields, includeResendShortcutEligibility, includeResendShortcutUsage)

Get campaign info

Get information about a specific campaign.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Boolean includeResendShortcutEligibility = true; // Boolean | Return the `resend_shortcut_eligibility` field in the response, which tells you if the campaign is eligible for the various Campaign Resend Shortcuts offered.
        Boolean includeResendShortcutUsage = true; // Boolean | Return the `resend_shortcut_usage` field in the response.  This includes information about campaigns related by a shortcut.
        try {
            Campaign result = apiInstance.getCampaignsId(campaignId, fields, excludeFields, includeResendShortcutEligibility, includeResendShortcutUsage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#getCampaignsId");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **includeResendShortcutEligibility** | **Boolean**| Return the &#x60;resend_shortcut_eligibility&#x60; field in the response, which tells you if the campaign is eligible for the various Campaign Resend Shortcuts offered. | [optional] |
| **includeResendShortcutUsage** | **Boolean**| Return the &#x60;resend_shortcut_usage&#x60; field in the response.  This includes information about campaigns related by a shortcut. | [optional] |

### Return type

[**Campaign**](Campaign.md)

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


## getCampaignsIdContent

> CampaignContent getCampaignsIdContent(campaignId, fields, excludeFields)

Get campaign content

Get the the HTML and plain-text content for a campaign.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            CampaignContent result = apiInstance.getCampaignsIdContent(campaignId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#getCampaignsIdContent");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**CampaignContent**](CampaignContent.md)

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


## getCampaignsIdFeedback

> CampaignReports getCampaignsIdFeedback(campaignId, fields, excludeFields)

List campaign feedback

Get team feedback while you&#39;re working together on a Mailchimp campaign.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            CampaignReports result = apiInstance.getCampaignsIdFeedback(campaignId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#getCampaignsIdFeedback");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**CampaignReports**](CampaignReports.md)

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


## getCampaignsIdFeedbackId

> CampaignFeedback2 getCampaignsIdFeedbackId(campaignId, feedbackId, fields, excludeFields)

Get campaign feedback message

Get a specific feedback message from a campaign.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        String feedbackId = "feedbackId_example"; // String | The unique id for the feedback message.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            CampaignFeedback2 result = apiInstance.getCampaignsIdFeedbackId(campaignId, feedbackId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#getCampaignsIdFeedbackId");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **feedbackId** | **String**| The unique id for the feedback message. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**CampaignFeedback2**](CampaignFeedback2.md)

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


## getCampaignsIdSendChecklist

> SendChecklist getCampaignsIdSendChecklist(campaignId, fields, excludeFields)

Get campaign send checklist

Review the send checklist for a campaign, and resolve any issues before sending.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            SendChecklist result = apiInstance.getCampaignsIdSendChecklist(campaignId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#getCampaignsIdSendChecklist");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**SendChecklist**](SendChecklist.md)

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


## patchCampaignsId

> Campaign patchCampaignsId(campaignId, body)

Update campaign settings

Update some or all of the settings for a specific campaign.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        Campaign2 body = new Campaign2(); // Campaign2 | 
        try {
            Campaign result = apiInstance.patchCampaignsId(campaignId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#patchCampaignsId");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **body** | [**Campaign2**](Campaign2.md)|  | |

### Return type

[**Campaign**](Campaign.md)

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


## patchCampaignsIdFeedbackId

> CampaignFeedback2 patchCampaignsIdFeedbackId(campaignId, feedbackId, body)

Update campaign feedback message

Update a specific feedback message for a campaign.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        String feedbackId = "feedbackId_example"; // String | The unique id for the feedback message.
        CampaignFeedback3 body = new CampaignFeedback3(); // CampaignFeedback3 | 
        try {
            CampaignFeedback2 result = apiInstance.patchCampaignsIdFeedbackId(campaignId, feedbackId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#patchCampaignsIdFeedbackId");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **feedbackId** | **String**| The unique id for the feedback message. | |
| **body** | [**CampaignFeedback3**](CampaignFeedback3.md)|  | |

### Return type

[**CampaignFeedback2**](CampaignFeedback2.md)

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


## postCampaigns

> Campaign postCampaigns(body)

Add campaign

Create a new Mailchimp campaign.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        Campaign1 body = new Campaign1(); // Campaign1 | 
        try {
            Campaign result = apiInstance.postCampaigns(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#postCampaigns");
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
| **body** | [**Campaign1**](Campaign1.md)|  | |

### Return type

[**Campaign**](Campaign.md)

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


## postCampaignsIdActionsCancelSend

> postCampaignsIdActionsCancelSend(campaignId)

Cancel campaign

Cancel a Regular or Plain-Text Campaign after you send, before all of your recipients receive it. This feature is included with Mailchimp Pro.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        try {
            apiInstance.postCampaignsIdActionsCancelSend(campaignId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#postCampaignsIdActionsCancelSend");
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
| **campaignId** | **String**| The unique id for the campaign. | |

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


## postCampaignsIdActionsCreateResend

> Campaign3 postCampaignsIdActionsCreateResend(campaignId, body)

Resend campaign

Remove the guesswork for resending a campaign to certain segments. You can use this endpoint as a shortcut to replicate a campaign and resend it to common segments, such as those who didn&#39;t open the campaign, or any new subscribers since it was sent.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        PostCampaignsIdActionsCreateResendRequest body = new PostCampaignsIdActionsCreateResendRequest(); // PostCampaignsIdActionsCreateResendRequest | 
        try {
            Campaign3 result = apiInstance.postCampaignsIdActionsCreateResend(campaignId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#postCampaignsIdActionsCreateResend");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **body** | [**PostCampaignsIdActionsCreateResendRequest**](PostCampaignsIdActionsCreateResendRequest.md)|  | [optional] |

### Return type

[**Campaign3**](Campaign3.md)

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


## postCampaignsIdActionsPause

> postCampaignsIdActionsPause(campaignId)

Pause rss campaign

Pause an RSS-Driven campaign.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        try {
            apiInstance.postCampaignsIdActionsPause(campaignId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#postCampaignsIdActionsPause");
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
| **campaignId** | **String**| The unique id for the campaign. | |

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


## postCampaignsIdActionsReplicate

> Campaign3 postCampaignsIdActionsReplicate(campaignId)

Replicate campaign

Replicate a campaign in saved or send status.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        try {
            Campaign3 result = apiInstance.postCampaignsIdActionsReplicate(campaignId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#postCampaignsIdActionsReplicate");
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
| **campaignId** | **String**| The unique id for the campaign. | |

### Return type

[**Campaign3**](Campaign3.md)

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


## postCampaignsIdActionsResume

> postCampaignsIdActionsResume(campaignId)

Resume rss campaign

Resume an RSS-Driven campaign.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        try {
            apiInstance.postCampaignsIdActionsResume(campaignId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#postCampaignsIdActionsResume");
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
| **campaignId** | **String**| The unique id for the campaign. | |

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


## postCampaignsIdActionsSchedule

> postCampaignsIdActionsSchedule(campaignId, body)

Schedule campaign

Schedule a campaign for delivery. If you&#39;re using Multivariate Campaigns to test send times or sending RSS Campaigns, use the send action instead.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        PostCampaignsIdActionsScheduleRequest body = new PostCampaignsIdActionsScheduleRequest(); // PostCampaignsIdActionsScheduleRequest | 
        try {
            apiInstance.postCampaignsIdActionsSchedule(campaignId, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#postCampaignsIdActionsSchedule");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **body** | [**PostCampaignsIdActionsScheduleRequest**](PostCampaignsIdActionsScheduleRequest.md)|  | |

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


## postCampaignsIdActionsSend

> postCampaignsIdActionsSend(campaignId)

Send campaign

Send a Mailchimp campaign. For RSS Campaigns, the campaign will send according to its schedule. All other campaigns will send immediately.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        try {
            apiInstance.postCampaignsIdActionsSend(campaignId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#postCampaignsIdActionsSend");
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
| **campaignId** | **String**| The unique id for the campaign. | |

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


## postCampaignsIdActionsTest

> postCampaignsIdActionsTest(campaignId, body)

Send test email

Send a test email.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        PostCampaignsIdActionsTestRequest body = new PostCampaignsIdActionsTestRequest(); // PostCampaignsIdActionsTestRequest | 
        try {
            apiInstance.postCampaignsIdActionsTest(campaignId, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#postCampaignsIdActionsTest");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **body** | [**PostCampaignsIdActionsTestRequest**](PostCampaignsIdActionsTestRequest.md)|  | |

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


## postCampaignsIdActionsUnschedule

> postCampaignsIdActionsUnschedule(campaignId)

Unschedule campaign

Unschedule a scheduled campaign that hasn&#39;t started sending.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        try {
            apiInstance.postCampaignsIdActionsUnschedule(campaignId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#postCampaignsIdActionsUnschedule");
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
| **campaignId** | **String**| The unique id for the campaign. | |

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


## postCampaignsIdFeedback

> CampaignFeedback2 postCampaignsIdFeedback(campaignId, body)

Add campaign feedback

Add feedback on a specific campaign.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        CampaignFeedback1 body = new CampaignFeedback1(); // CampaignFeedback1 | 
        try {
            CampaignFeedback2 result = apiInstance.postCampaignsIdFeedback(campaignId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#postCampaignsIdFeedback");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **body** | [**CampaignFeedback1**](CampaignFeedback1.md)|  | |

### Return type

[**CampaignFeedback2**](CampaignFeedback2.md)

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


## putCampaignsIdContent

> CampaignContent putCampaignsIdContent(campaignId, body)

Set campaign content

Set the content for a campaign.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        CampaignContent1 body = new CampaignContent1(); // CampaignContent1 | 
        try {
            CampaignContent result = apiInstance.putCampaignsIdContent(campaignId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#putCampaignsIdContent");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **body** | [**CampaignContent1**](CampaignContent1.md)|  | |

### Return type

[**CampaignContent**](CampaignContent.md)

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

