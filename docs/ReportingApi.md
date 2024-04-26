# ReportingApi

All URIs are relative to *https://server.api.mailchimp.com/3.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getReportingFacebookAds**](ReportingApi.md#getReportingFacebookAds) | **GET** /reporting/facebook-ads | List facebook ads reports |
| [**getReportingFacebookAdsId**](ReportingApi.md#getReportingFacebookAdsId) | **GET** /reporting/facebook-ads/{outreach_id} | Get facebook ad report |
| [**getReportingFacebookAdsIdEcommerceProductActivity**](ReportingApi.md#getReportingFacebookAdsIdEcommerceProductActivity) | **GET** /reporting/facebook-ads/{outreach_id}/ecommerce-product-activity | List facebook ecommerce report |
| [**getReportingLandingPages**](ReportingApi.md#getReportingLandingPages) | **GET** /reporting/landing-pages | List landing pages reports |
| [**getReportingLandingPagesId**](ReportingApi.md#getReportingLandingPagesId) | **GET** /reporting/landing-pages/{outreach_id} | Get landing page report |
| [**getReportingSurveys**](ReportingApi.md#getReportingSurveys) | **GET** /reporting/surveys | List survey reports |
| [**getReportingSurveysId**](ReportingApi.md#getReportingSurveysId) | **GET** /reporting/surveys/{survey_id} | Get survey report |
| [**getReportingSurveysIdQuestions**](ReportingApi.md#getReportingSurveysIdQuestions) | **GET** /reporting/surveys/{survey_id}/questions | List survey question reports |
| [**getReportingSurveysIdQuestionsId**](ReportingApi.md#getReportingSurveysIdQuestionsId) | **GET** /reporting/surveys/{survey_id}/questions/{question_id} | Get survey question report |
| [**getReportingSurveysIdQuestionsIdAnswers**](ReportingApi.md#getReportingSurveysIdQuestionsIdAnswers) | **GET** /reporting/surveys/{survey_id}/questions/{question_id}/answers | List answers for question |
| [**getReportingSurveysIdResponses**](ReportingApi.md#getReportingSurveysIdResponses) | **GET** /reporting/surveys/{survey_id}/responses | List survey responses |
| [**getReportingSurveysIdResponsesId**](ReportingApi.md#getReportingSurveysIdResponsesId) | **GET** /reporting/surveys/{survey_id}/responses/{response_id} | Get survey response |



## getReportingFacebookAds

> GetReportingFacebookAds200Response getReportingFacebookAds(fields, excludeFields, count, offset, sortField, sortDir)

List facebook ads reports

Get reports of Facebook ads.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        String sortField = "created_at"; // String | Returns files sorted by the specified field.
        String sortDir = "ASC"; // String | Determines the order direction for sorted results.
        try {
            GetReportingFacebookAds200Response result = apiInstance.getReportingFacebookAds(fields, excludeFields, count, offset, sortField, sortDir);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#getReportingFacebookAds");
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
| **sortField** | **String**| Returns files sorted by the specified field. | [optional] [enum: created_at, updated_at, end_time] |
| **sortDir** | **String**| Determines the order direction for sorted results. | [optional] [enum: ASC, DESC] |

### Return type

[**GetReportingFacebookAds200Response**](GetReportingFacebookAds200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Facebook Ad Report Instances |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getReportingFacebookAdsId

> GetReportingFacebookAdsId200Response getReportingFacebookAdsId(outreachId, fields, excludeFields)

Get facebook ad report

Get report of a Facebook ad.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        String outreachId = "outreachId_example"; // String | The outreach id.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            GetReportingFacebookAdsId200Response result = apiInstance.getReportingFacebookAdsId(outreachId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#getReportingFacebookAdsId");
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
| **outreachId** | **String**| The outreach id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**GetReportingFacebookAdsId200Response**](GetReportingFacebookAdsId200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Facebook Ad report Instance |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getReportingFacebookAdsIdEcommerceProductActivity

> GetReportsIdEcommerceProductActivity200Response getReportingFacebookAdsIdEcommerceProductActivity(outreachId, fields, excludeFields, count, offset, sortField)

List facebook ecommerce report

Get breakdown of product activity for an outreach.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        String outreachId = "outreachId_example"; // String | The outreach id.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        String sortField = "title"; // String | Returns files sorted by the specified field.
        try {
            GetReportsIdEcommerceProductActivity200Response result = apiInstance.getReportingFacebookAdsIdEcommerceProductActivity(outreachId, fields, excludeFields, count, offset, sortField);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#getReportingFacebookAdsIdEcommerceProductActivity");
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
| **outreachId** | **String**| The outreach id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **sortField** | **String**| Returns files sorted by the specified field. | [optional] [enum: title, total_revenue, total_purchased] |

### Return type

[**GetReportsIdEcommerceProductActivity200Response**](GetReportsIdEcommerceProductActivity200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ecommerce Product Activity Instance |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getReportingLandingPages

> GetReportingLandingPages200Response getReportingLandingPages(fields, excludeFields, count, offset)

List landing pages reports

Get reports of landing pages.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        try {
            GetReportingLandingPages200Response result = apiInstance.getReportingLandingPages(fields, excludeFields, count, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#getReportingLandingPages");
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

### Return type

[**GetReportingLandingPages200Response**](GetReportingLandingPages200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Landing Page Report Instances |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getReportingLandingPagesId

> LandingPageReport getReportingLandingPagesId(outreachId, fields, excludeFields)

Get landing page report

Get report of a landing page.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        String outreachId = "outreachId_example"; // String | The outreach id.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            LandingPageReport result = apiInstance.getReportingLandingPagesId(outreachId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#getReportingLandingPagesId");
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
| **outreachId** | **String**| The outreach id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**LandingPageReport**](LandingPageReport.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Landing Page Report Instance |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getReportingSurveys

> GetReportingSurveys200Response getReportingSurveys(fields, excludeFields, count, offset)

List survey reports

Get reports for surveys.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        try {
            GetReportingSurveys200Response result = apiInstance.getReportingSurveys(fields, excludeFields, count, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#getReportingSurveys");
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

### Return type

[**GetReportingSurveys200Response**](GetReportingSurveys200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Survey Report Instances |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getReportingSurveysId

> SurveyReport getReportingSurveysId(surveyId, fields, excludeFields)

Get survey report

Get report for a survey.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        String surveyId = "surveyId_example"; // String | The ID of the survey.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            SurveyReport result = apiInstance.getReportingSurveysId(surveyId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#getReportingSurveysId");
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
| **surveyId** | **String**| The ID of the survey. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**SurveyReport**](SurveyReport.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Survey Report Instance |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getReportingSurveysIdQuestions

> GetReportingSurveysIdQuestions200Response getReportingSurveysIdQuestions(surveyId, fields, excludeFields)

List survey question reports

Get reports for survey questions.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        String surveyId = "surveyId_example"; // String | The ID of the survey.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            GetReportingSurveysIdQuestions200Response result = apiInstance.getReportingSurveysIdQuestions(surveyId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#getReportingSurveysIdQuestions");
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
| **surveyId** | **String**| The ID of the survey. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**GetReportingSurveysIdQuestions200Response**](GetReportingSurveysIdQuestions200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Survey Question Report Instances |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getReportingSurveysIdQuestionsId

> SurveyQuestionReport getReportingSurveysIdQuestionsId(surveyId, questionId, fields, excludeFields)

Get survey question report

Get report for a survey question.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        String surveyId = "surveyId_example"; // String | The ID of the survey.
        String questionId = "questionId_example"; // String | The ID of the survey question.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            SurveyQuestionReport result = apiInstance.getReportingSurveysIdQuestionsId(surveyId, questionId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#getReportingSurveysIdQuestionsId");
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
| **surveyId** | **String**| The ID of the survey. | |
| **questionId** | **String**| The ID of the survey question. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**SurveyQuestionReport**](SurveyQuestionReport.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Survey Question Report Instance |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getReportingSurveysIdQuestionsIdAnswers

> GetReportingSurveysIdQuestionsIdAnswers200Response getReportingSurveysIdQuestionsIdAnswers(surveyId, questionId, fields, excludeFields, respondentFamiliarityIs)

List answers for question

Get answers for a survey question.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        String surveyId = "surveyId_example"; // String | The ID of the survey.
        String questionId = "questionId_example"; // String | The ID of the survey question.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        String respondentFamiliarityIs = "new"; // String | Filter survey responses by familiarity of the respondents.
        try {
            GetReportingSurveysIdQuestionsIdAnswers200Response result = apiInstance.getReportingSurveysIdQuestionsIdAnswers(surveyId, questionId, fields, excludeFields, respondentFamiliarityIs);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#getReportingSurveysIdQuestionsIdAnswers");
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
| **surveyId** | **String**| The ID of the survey. | |
| **questionId** | **String**| The ID of the survey question. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **respondentFamiliarityIs** | **String**| Filter survey responses by familiarity of the respondents. | [optional] [enum: new, known, unknown] |

### Return type

[**GetReportingSurveysIdQuestionsIdAnswers200Response**](GetReportingSurveysIdQuestionsIdAnswers200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Survey Question Answers |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getReportingSurveysIdResponses

> GetReportingSurveysIdResponses200Response getReportingSurveysIdResponses(surveyId, fields, excludeFields, answeredQuestion, choseAnswer, respondentFamiliarityIs)

List survey responses

Get responses to a survey.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        String surveyId = "surveyId_example"; // String | The ID of the survey.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer answeredQuestion = 56; // Integer | The ID of the question that was answered.
        String choseAnswer = "choseAnswer_example"; // String | The ID of the option chosen to filter responses on.
        String respondentFamiliarityIs = "new"; // String | Filter survey responses by familiarity of the respondents.
        try {
            GetReportingSurveysIdResponses200Response result = apiInstance.getReportingSurveysIdResponses(surveyId, fields, excludeFields, answeredQuestion, choseAnswer, respondentFamiliarityIs);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#getReportingSurveysIdResponses");
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
| **surveyId** | **String**| The ID of the survey. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **answeredQuestion** | **Integer**| The ID of the question that was answered. | [optional] |
| **choseAnswer** | **String**| The ID of the option chosen to filter responses on. | [optional] |
| **respondentFamiliarityIs** | **String**| Filter survey responses by familiarity of the respondents. | [optional] [enum: new, known, unknown] |

### Return type

[**GetReportingSurveysIdResponses200Response**](GetReportingSurveysIdResponses200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of survey responses |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |


## getReportingSurveysIdResponsesId

> SurveyResponse getReportingSurveysIdResponsesId(surveyId, responseId)

Get survey response

Get a single survey response.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        String surveyId = "surveyId_example"; // String | The ID of the survey.
        String responseId = "responseId_example"; // String | The ID of the survey response.
        try {
            SurveyResponse result = apiInstance.getReportingSurveysIdResponsesId(surveyId, responseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#getReportingSurveysIdResponsesId");
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
| **surveyId** | **String**| The ID of the survey. | |
| **responseId** | **String**| The ID of the survey response. | |

### Return type

[**SurveyResponse**](SurveyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a single survey response. |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

