# ConversationsApi

All URIs are relative to *https://server.api.mailchimp.com/3.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getConversations**](ConversationsApi.md#getConversations) | **GET** /conversations | List conversations |
| [**getConversationsId**](ConversationsApi.md#getConversationsId) | **GET** /conversations/{conversation_id} | Get conversation |
| [**getConversationsIdMessages**](ConversationsApi.md#getConversationsIdMessages) | **GET** /conversations/{conversation_id}/messages | List messages |
| [**getConversationsIdMessagesId**](ConversationsApi.md#getConversationsIdMessagesId) | **GET** /conversations/{conversation_id}/messages/{message_id} | Get message |



## getConversations

> TrackedConversations getConversations(fields, excludeFields, count, offset, hasUnreadMessages, listId, campaignId)

List conversations

Get a list of conversations for the account. Conversations has been deprecated in favor of Inbox and these endpoints don&#39;t include Inbox data. Past Conversations are still available via this endpoint, but new campaign replies and other Inbox messages aren’t available using this endpoint.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ConversationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ConversationsApi apiInstance = new ConversationsApi(defaultClient);
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        String hasUnreadMessages = "true"; // String | Whether the conversation has any unread messages.
        String listId = "listId_example"; // String | The unique id for the list.
        String campaignId = "campaignId_example"; // String | The unique id for the campaign.
        try {
            TrackedConversations result = apiInstance.getConversations(fields, excludeFields, count, offset, hasUnreadMessages, listId, campaignId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationsApi#getConversations");
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
| **hasUnreadMessages** | **String**| Whether the conversation has any unread messages. | [optional] [enum: true, false] |
| **listId** | **String**| The unique id for the list. | [optional] |
| **campaignId** | **String**| The unique id for the campaign. | [optional] |

### Return type

[**TrackedConversations**](TrackedConversations.md)

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


## getConversationsId

> Conversation getConversationsId(conversationId, fields, excludeFields)

Get conversation

Get details about an individual conversation. Conversations has been deprecated in favor of Inbox and these endpoints don&#39;t include Inbox data. Past Conversations are still available via this endpoint, but new campaign replies and other Inbox messages aren’t available using this endpoint.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ConversationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ConversationsApi apiInstance = new ConversationsApi(defaultClient);
        String conversationId = "conversationId_example"; // String | The unique id for the conversation.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            Conversation result = apiInstance.getConversationsId(conversationId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationsApi#getConversationsId");
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
| **conversationId** | **String**| The unique id for the conversation. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**Conversation**](Conversation.md)

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


## getConversationsIdMessages

> CollectionOfConversationMessages getConversationsIdMessages(conversationId, fields, excludeFields, isRead, beforeTimestamp, sinceTimestamp)

List messages

Get messages from a specific conversation. Conversations has been deprecated in favor of Inbox and these endpoints don&#39;t include Inbox data. Past Conversations are still available via this endpoint, but new campaign replies and other Inbox messages aren’t available using this endpoint.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ConversationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ConversationsApi apiInstance = new ConversationsApi(defaultClient);
        String conversationId = "conversationId_example"; // String | The unique id for the conversation.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        String isRead = "true"; // String | Whether a conversation message has been marked as read.
        OffsetDateTime beforeTimestamp = OffsetDateTime.now(); // OffsetDateTime | Restrict the response to messages created before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        OffsetDateTime sinceTimestamp = OffsetDateTime.now(); // OffsetDateTime | Restrict the response to messages created after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
        try {
            CollectionOfConversationMessages result = apiInstance.getConversationsIdMessages(conversationId, fields, excludeFields, isRead, beforeTimestamp, sinceTimestamp);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationsApi#getConversationsIdMessages");
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
| **conversationId** | **String**| The unique id for the conversation. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **isRead** | **String**| Whether a conversation message has been marked as read. | [optional] [enum: true, false] |
| **beforeTimestamp** | **OffsetDateTime**| Restrict the response to messages created before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **sinceTimestamp** | **OffsetDateTime**| Restrict the response to messages created after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |

### Return type

[**CollectionOfConversationMessages**](CollectionOfConversationMessages.md)

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


## getConversationsIdMessagesId

> ConversationMessage getConversationsIdMessagesId(conversationId, messageId, fields, excludeFields)

Get message

Get an individual message in a conversation. Conversations has been deprecated in favor of Inbox and these endpoints don&#39;t include Inbox data. Past Conversations are still available via this endpoint, but new campaign replies and other Inbox messages aren’t available using this endpoint.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.ConversationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ConversationsApi apiInstance = new ConversationsApi(defaultClient);
        String conversationId = "conversationId_example"; // String | The unique id for the conversation.
        String messageId = "messageId_example"; // String | The unique id for the conversation message.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            ConversationMessage result = apiInstance.getConversationsIdMessagesId(conversationId, messageId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationsApi#getConversationsIdMessagesId");
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
| **conversationId** | **String**| The unique id for the conversation. | |
| **messageId** | **String**| The unique id for the conversation message. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ConversationMessage**](ConversationMessage.md)

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

