# EcommerceApi

All URIs are relative to *https://server.api.mailchimp.com/3.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteEcommerceStoresId**](EcommerceApi.md#deleteEcommerceStoresId) | **DELETE** /ecommerce/stores/{store_id} | Delete store |
| [**deleteEcommerceStoresIdCartsId**](EcommerceApi.md#deleteEcommerceStoresIdCartsId) | **DELETE** /ecommerce/stores/{store_id}/carts/{cart_id} | Delete cart |
| [**deleteEcommerceStoresIdCartsLinesId**](EcommerceApi.md#deleteEcommerceStoresIdCartsLinesId) | **DELETE** /ecommerce/stores/{store_id}/carts/{cart_id}/lines/{line_id} | Delete cart line item |
| [**deleteEcommerceStoresIdCustomersId**](EcommerceApi.md#deleteEcommerceStoresIdCustomersId) | **DELETE** /ecommerce/stores/{store_id}/customers/{customer_id} | Delete customer |
| [**deleteEcommerceStoresIdOrdersId**](EcommerceApi.md#deleteEcommerceStoresIdOrdersId) | **DELETE** /ecommerce/stores/{store_id}/orders/{order_id} | Delete order |
| [**deleteEcommerceStoresIdOrdersIdLinesId**](EcommerceApi.md#deleteEcommerceStoresIdOrdersIdLinesId) | **DELETE** /ecommerce/stores/{store_id}/orders/{order_id}/lines/{line_id} | Delete order line item |
| [**deleteEcommerceStoresIdProductsId**](EcommerceApi.md#deleteEcommerceStoresIdProductsId) | **DELETE** /ecommerce/stores/{store_id}/products/{product_id} | Delete product |
| [**deleteEcommerceStoresIdProductsIdImagesId**](EcommerceApi.md#deleteEcommerceStoresIdProductsIdImagesId) | **DELETE** /ecommerce/stores/{store_id}/products/{product_id}/images/{image_id} | Delete product image |
| [**deleteEcommerceStoresIdProductsIdVariantsId**](EcommerceApi.md#deleteEcommerceStoresIdProductsIdVariantsId) | **DELETE** /ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id} | Delete product variant |
| [**deleteEcommerceStoresIdPromocodesId**](EcommerceApi.md#deleteEcommerceStoresIdPromocodesId) | **DELETE** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes/{promo_code_id} | Delete promo code |
| [**deleteEcommerceStoresIdPromorulesId**](EcommerceApi.md#deleteEcommerceStoresIdPromorulesId) | **DELETE** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id} | Delete promo rule |
| [**getEcommerceOrders**](EcommerceApi.md#getEcommerceOrders) | **GET** /ecommerce/orders | List account orders |
| [**getEcommerceStores**](EcommerceApi.md#getEcommerceStores) | **GET** /ecommerce/stores | List stores |
| [**getEcommerceStoresId**](EcommerceApi.md#getEcommerceStoresId) | **GET** /ecommerce/stores/{store_id} | Get store info |
| [**getEcommerceStoresIdCarts**](EcommerceApi.md#getEcommerceStoresIdCarts) | **GET** /ecommerce/stores/{store_id}/carts | List carts |
| [**getEcommerceStoresIdCartsId**](EcommerceApi.md#getEcommerceStoresIdCartsId) | **GET** /ecommerce/stores/{store_id}/carts/{cart_id} | Get cart info |
| [**getEcommerceStoresIdCartsIdLines**](EcommerceApi.md#getEcommerceStoresIdCartsIdLines) | **GET** /ecommerce/stores/{store_id}/carts/{cart_id}/lines | List cart line items |
| [**getEcommerceStoresIdCartsIdLinesId**](EcommerceApi.md#getEcommerceStoresIdCartsIdLinesId) | **GET** /ecommerce/stores/{store_id}/carts/{cart_id}/lines/{line_id} | Get cart line item |
| [**getEcommerceStoresIdCustomers**](EcommerceApi.md#getEcommerceStoresIdCustomers) | **GET** /ecommerce/stores/{store_id}/customers | List customers |
| [**getEcommerceStoresIdCustomersId**](EcommerceApi.md#getEcommerceStoresIdCustomersId) | **GET** /ecommerce/stores/{store_id}/customers/{customer_id} | Get customer info |
| [**getEcommerceStoresIdOrders**](EcommerceApi.md#getEcommerceStoresIdOrders) | **GET** /ecommerce/stores/{store_id}/orders | List orders |
| [**getEcommerceStoresIdOrdersId**](EcommerceApi.md#getEcommerceStoresIdOrdersId) | **GET** /ecommerce/stores/{store_id}/orders/{order_id} | Get order info |
| [**getEcommerceStoresIdOrdersIdLines**](EcommerceApi.md#getEcommerceStoresIdOrdersIdLines) | **GET** /ecommerce/stores/{store_id}/orders/{order_id}/lines | List order line items |
| [**getEcommerceStoresIdOrdersIdLinesId**](EcommerceApi.md#getEcommerceStoresIdOrdersIdLinesId) | **GET** /ecommerce/stores/{store_id}/orders/{order_id}/lines/{line_id} | Get order line item |
| [**getEcommerceStoresIdProducts**](EcommerceApi.md#getEcommerceStoresIdProducts) | **GET** /ecommerce/stores/{store_id}/products | List product |
| [**getEcommerceStoresIdProductsId**](EcommerceApi.md#getEcommerceStoresIdProductsId) | **GET** /ecommerce/stores/{store_id}/products/{product_id} | Get product info |
| [**getEcommerceStoresIdProductsIdImages**](EcommerceApi.md#getEcommerceStoresIdProductsIdImages) | **GET** /ecommerce/stores/{store_id}/products/{product_id}/images | List product images |
| [**getEcommerceStoresIdProductsIdImagesId**](EcommerceApi.md#getEcommerceStoresIdProductsIdImagesId) | **GET** /ecommerce/stores/{store_id}/products/{product_id}/images/{image_id} | Get product image info |
| [**getEcommerceStoresIdProductsIdVariants**](EcommerceApi.md#getEcommerceStoresIdProductsIdVariants) | **GET** /ecommerce/stores/{store_id}/products/{product_id}/variants | List product variants |
| [**getEcommerceStoresIdProductsIdVariantsId**](EcommerceApi.md#getEcommerceStoresIdProductsIdVariantsId) | **GET** /ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id} | Get product variant info |
| [**getEcommerceStoresIdPromocodes**](EcommerceApi.md#getEcommerceStoresIdPromocodes) | **GET** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes | List promo codes |
| [**getEcommerceStoresIdPromocodesId**](EcommerceApi.md#getEcommerceStoresIdPromocodesId) | **GET** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes/{promo_code_id} | Get promo code |
| [**getEcommerceStoresIdPromorules**](EcommerceApi.md#getEcommerceStoresIdPromorules) | **GET** /ecommerce/stores/{store_id}/promo-rules | List promo rules |
| [**getEcommerceStoresIdPromorulesId**](EcommerceApi.md#getEcommerceStoresIdPromorulesId) | **GET** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id} | Get promo rule |
| [**patchEcommerceStoresId**](EcommerceApi.md#patchEcommerceStoresId) | **PATCH** /ecommerce/stores/{store_id} | Update store |
| [**patchEcommerceStoresIdCartsId**](EcommerceApi.md#patchEcommerceStoresIdCartsId) | **PATCH** /ecommerce/stores/{store_id}/carts/{cart_id} | Update cart |
| [**patchEcommerceStoresIdCartsIdLinesId**](EcommerceApi.md#patchEcommerceStoresIdCartsIdLinesId) | **PATCH** /ecommerce/stores/{store_id}/carts/{cart_id}/lines/{line_id} | Update cart line item |
| [**patchEcommerceStoresIdCustomersId**](EcommerceApi.md#patchEcommerceStoresIdCustomersId) | **PATCH** /ecommerce/stores/{store_id}/customers/{customer_id} | Update customer |
| [**patchEcommerceStoresIdOrdersId**](EcommerceApi.md#patchEcommerceStoresIdOrdersId) | **PATCH** /ecommerce/stores/{store_id}/orders/{order_id} | Update order |
| [**patchEcommerceStoresIdOrdersIdLinesId**](EcommerceApi.md#patchEcommerceStoresIdOrdersIdLinesId) | **PATCH** /ecommerce/stores/{store_id}/orders/{order_id}/lines/{line_id} | Update order line item |
| [**patchEcommerceStoresIdProductsId**](EcommerceApi.md#patchEcommerceStoresIdProductsId) | **PATCH** /ecommerce/stores/{store_id}/products/{product_id} | Update product |
| [**patchEcommerceStoresIdProductsIdImagesId**](EcommerceApi.md#patchEcommerceStoresIdProductsIdImagesId) | **PATCH** /ecommerce/stores/{store_id}/products/{product_id}/images/{image_id} | Update product image |
| [**patchEcommerceStoresIdProductsIdVariantsId**](EcommerceApi.md#patchEcommerceStoresIdProductsIdVariantsId) | **PATCH** /ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id} | Update product variant |
| [**patchEcommerceStoresIdPromocodesId**](EcommerceApi.md#patchEcommerceStoresIdPromocodesId) | **PATCH** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes/{promo_code_id} | Update promo code |
| [**patchEcommerceStoresIdPromorulesId**](EcommerceApi.md#patchEcommerceStoresIdPromorulesId) | **PATCH** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id} | Update promo rule |
| [**postEcommerceStores**](EcommerceApi.md#postEcommerceStores) | **POST** /ecommerce/stores | Add store |
| [**postEcommerceStoresIdCarts**](EcommerceApi.md#postEcommerceStoresIdCarts) | **POST** /ecommerce/stores/{store_id}/carts | Add cart |
| [**postEcommerceStoresIdCartsIdLines**](EcommerceApi.md#postEcommerceStoresIdCartsIdLines) | **POST** /ecommerce/stores/{store_id}/carts/{cart_id}/lines | Add cart line item |
| [**postEcommerceStoresIdCustomers**](EcommerceApi.md#postEcommerceStoresIdCustomers) | **POST** /ecommerce/stores/{store_id}/customers | Add customer |
| [**postEcommerceStoresIdOrders**](EcommerceApi.md#postEcommerceStoresIdOrders) | **POST** /ecommerce/stores/{store_id}/orders | Add order |
| [**postEcommerceStoresIdOrdersIdLines**](EcommerceApi.md#postEcommerceStoresIdOrdersIdLines) | **POST** /ecommerce/stores/{store_id}/orders/{order_id}/lines | Add order line item |
| [**postEcommerceStoresIdProducts**](EcommerceApi.md#postEcommerceStoresIdProducts) | **POST** /ecommerce/stores/{store_id}/products | Add product |
| [**postEcommerceStoresIdProductsIdImages**](EcommerceApi.md#postEcommerceStoresIdProductsIdImages) | **POST** /ecommerce/stores/{store_id}/products/{product_id}/images | Add product image |
| [**postEcommerceStoresIdProductsIdVariants**](EcommerceApi.md#postEcommerceStoresIdProductsIdVariants) | **POST** /ecommerce/stores/{store_id}/products/{product_id}/variants | Add product variant |
| [**postEcommerceStoresIdPromocodes**](EcommerceApi.md#postEcommerceStoresIdPromocodes) | **POST** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes | Add promo code |
| [**postEcommerceStoresIdPromorules**](EcommerceApi.md#postEcommerceStoresIdPromorules) | **POST** /ecommerce/stores/{store_id}/promo-rules | Add promo rule |
| [**putEcommerceStoresIdCustomersId**](EcommerceApi.md#putEcommerceStoresIdCustomersId) | **PUT** /ecommerce/stores/{store_id}/customers/{customer_id} | Add or update customer |
| [**putEcommerceStoresIdProductsIdVariantsId**](EcommerceApi.md#putEcommerceStoresIdProductsIdVariantsId) | **PUT** /ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id} | Add or update product variant |



## deleteEcommerceStoresId

> Object deleteEcommerceStoresId(storeId)

Delete store

Delete a store. Deleting a store will also delete any associated subresources, including Customers, Orders, Products, and Carts.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        try {
            Object result = apiInstance.deleteEcommerceStoresId(storeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#deleteEcommerceStoresId");
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
| **storeId** | **String**| The store id. | |

### Return type

**Object**

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


## deleteEcommerceStoresIdCartsId

> deleteEcommerceStoresIdCartsId(storeId, cartId)

Delete cart

Delete a cart.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String cartId = "cartId_example"; // String | The id for the cart.
        try {
            apiInstance.deleteEcommerceStoresIdCartsId(storeId, cartId);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#deleteEcommerceStoresIdCartsId");
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
| **storeId** | **String**| The store id. | |
| **cartId** | **String**| The id for the cart. | |

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


## deleteEcommerceStoresIdCartsLinesId

> deleteEcommerceStoresIdCartsLinesId(storeId, cartId, lineId)

Delete cart line item

Delete a specific cart line item.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String cartId = "cartId_example"; // String | The id for the cart.
        String lineId = "lineId_example"; // String | The id for the line item of a cart.
        try {
            apiInstance.deleteEcommerceStoresIdCartsLinesId(storeId, cartId, lineId);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#deleteEcommerceStoresIdCartsLinesId");
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
| **storeId** | **String**| The store id. | |
| **cartId** | **String**| The id for the cart. | |
| **lineId** | **String**| The id for the line item of a cart. | |

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


## deleteEcommerceStoresIdCustomersId

> deleteEcommerceStoresIdCustomersId(storeId, customerId)

Delete customer

Delete a customer from a store.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String customerId = "customerId_example"; // String | The id for the customer of a store.
        try {
            apiInstance.deleteEcommerceStoresIdCustomersId(storeId, customerId);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#deleteEcommerceStoresIdCustomersId");
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
| **storeId** | **String**| The store id. | |
| **customerId** | **String**| The id for the customer of a store. | |

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


## deleteEcommerceStoresIdOrdersId

> deleteEcommerceStoresIdOrdersId(storeId, orderId)

Delete order

Delete an order.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String orderId = "orderId_example"; // String | The id for the order in a store.
        try {
            apiInstance.deleteEcommerceStoresIdOrdersId(storeId, orderId);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#deleteEcommerceStoresIdOrdersId");
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
| **storeId** | **String**| The store id. | |
| **orderId** | **String**| The id for the order in a store. | |

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


## deleteEcommerceStoresIdOrdersIdLinesId

> deleteEcommerceStoresIdOrdersIdLinesId(storeId, orderId, lineId)

Delete order line item

Delete a specific order line item.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String orderId = "orderId_example"; // String | The id for the order in a store.
        String lineId = "lineId_example"; // String | The id for the line item of an order.
        try {
            apiInstance.deleteEcommerceStoresIdOrdersIdLinesId(storeId, orderId, lineId);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#deleteEcommerceStoresIdOrdersIdLinesId");
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
| **storeId** | **String**| The store id. | |
| **orderId** | **String**| The id for the order in a store. | |
| **lineId** | **String**| The id for the line item of an order. | |

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


## deleteEcommerceStoresIdProductsId

> deleteEcommerceStoresIdProductsId(storeId, productId)

Delete product

Delete a product.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String productId = "productId_example"; // String | The id for the product of a store.
        try {
            apiInstance.deleteEcommerceStoresIdProductsId(storeId, productId);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#deleteEcommerceStoresIdProductsId");
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
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |

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


## deleteEcommerceStoresIdProductsIdImagesId

> deleteEcommerceStoresIdProductsIdImagesId(storeId, productId, imageId)

Delete product image

Delete a product image.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String productId = "productId_example"; // String | The id for the product of a store.
        String imageId = "imageId_example"; // String | The id for the product image.
        try {
            apiInstance.deleteEcommerceStoresIdProductsIdImagesId(storeId, productId, imageId);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#deleteEcommerceStoresIdProductsIdImagesId");
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
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **imageId** | **String**| The id for the product image. | |

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


## deleteEcommerceStoresIdProductsIdVariantsId

> deleteEcommerceStoresIdProductsIdVariantsId(storeId, productId, variantId)

Delete product variant

Delete a product variant.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String productId = "productId_example"; // String | The id for the product of a store.
        String variantId = "variantId_example"; // String | The id for the product variant.
        try {
            apiInstance.deleteEcommerceStoresIdProductsIdVariantsId(storeId, productId, variantId);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#deleteEcommerceStoresIdProductsIdVariantsId");
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
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **variantId** | **String**| The id for the product variant. | |

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


## deleteEcommerceStoresIdPromocodesId

> deleteEcommerceStoresIdPromocodesId(storeId, promoRuleId, promoCodeId)

Delete promo code

Delete a promo code from a store.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String promoRuleId = "promoRuleId_example"; // String | The id for the promo rule of a store.
        String promoCodeId = "promoCodeId_example"; // String | The id for the promo code of a store.
        try {
            apiInstance.deleteEcommerceStoresIdPromocodesId(storeId, promoRuleId, promoCodeId);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#deleteEcommerceStoresIdPromocodesId");
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
| **storeId** | **String**| The store id. | |
| **promoRuleId** | **String**| The id for the promo rule of a store. | |
| **promoCodeId** | **String**| The id for the promo code of a store. | |

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


## deleteEcommerceStoresIdPromorulesId

> deleteEcommerceStoresIdPromorulesId(storeId, promoRuleId)

Delete promo rule

Delete a promo rule from a store.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String promoRuleId = "promoRuleId_example"; // String | The id for the promo rule of a store.
        try {
            apiInstance.deleteEcommerceStoresIdPromorulesId(storeId, promoRuleId);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#deleteEcommerceStoresIdPromorulesId");
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
| **storeId** | **String**| The store id. | |
| **promoRuleId** | **String**| The id for the promo rule of a store. | |

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


## getEcommerceOrders

> Orders getEcommerceOrders(fields, excludeFields, count, offset, campaignId, outreachId, customerId, hasOutreach)

List account orders

Get information about an account&#39;s orders.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        String campaignId = "campaignId_example"; // String | Restrict results to orders with a specific `campaign_id` value.
        String outreachId = "outreachId_example"; // String | Restrict results to orders with a specific `outreach_id` value.
        String customerId = "customerId_example"; // String | Restrict results to orders made by a specific customer.
        Boolean hasOutreach = true; // Boolean | Restrict results to orders that have an outreach attached. For example, an email campaign or Facebook ad.
        try {
            Orders result = apiInstance.getEcommerceOrders(fields, excludeFields, count, offset, campaignId, outreachId, customerId, hasOutreach);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceOrders");
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
| **campaignId** | **String**| Restrict results to orders with a specific &#x60;campaign_id&#x60; value. | [optional] |
| **outreachId** | **String**| Restrict results to orders with a specific &#x60;outreach_id&#x60; value. | [optional] |
| **customerId** | **String**| Restrict results to orders made by a specific customer. | [optional] |
| **hasOutreach** | **Boolean**| Restrict results to orders that have an outreach attached. For example, an email campaign or Facebook ad. | [optional] |

### Return type

[**Orders**](Orders.md)

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


## getEcommerceStores

> ECommerceStores getEcommerceStores(fields, excludeFields, count, offset)

List stores

Get information about all stores in the account.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        try {
            ECommerceStores result = apiInstance.getEcommerceStores(fields, excludeFields, count, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStores");
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

[**ECommerceStores**](ECommerceStores.md)

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


## getEcommerceStoresId

> ECommerceStore getEcommerceStoresId(storeId, fields, excludeFields)

Get store info

Get information about a specific store.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            ECommerceStore result = apiInstance.getEcommerceStoresId(storeId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresId");
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
| **storeId** | **String**| The store id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ECommerceStore**](ECommerceStore.md)

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


## getEcommerceStoresIdCarts

> Carts getEcommerceStoresIdCarts(storeId, fields, excludeFields, count, offset)

List carts

Get information about a store&#39;s carts.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        try {
            Carts result = apiInstance.getEcommerceStoresIdCarts(storeId, fields, excludeFields, count, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdCarts");
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
| **storeId** | **String**| The store id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**Carts**](Carts.md)

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


## getEcommerceStoresIdCartsId

> ECommerceCart getEcommerceStoresIdCartsId(storeId, cartId, fields, excludeFields)

Get cart info

Get information about a specific cart.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String cartId = "cartId_example"; // String | The id for the cart.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            ECommerceCart result = apiInstance.getEcommerceStoresIdCartsId(storeId, cartId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdCartsId");
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
| **storeId** | **String**| The store id. | |
| **cartId** | **String**| The id for the cart. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ECommerceCart**](ECommerceCart.md)

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


## getEcommerceStoresIdCartsIdLines

> CartLines getEcommerceStoresIdCartsIdLines(storeId, cartId, fields, excludeFields, count, offset)

List cart line items

Get information about a cart&#39;s line items.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String cartId = "cartId_example"; // String | The id for the cart.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        try {
            CartLines result = apiInstance.getEcommerceStoresIdCartsIdLines(storeId, cartId, fields, excludeFields, count, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdCartsIdLines");
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
| **storeId** | **String**| The store id. | |
| **cartId** | **String**| The id for the cart. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**CartLines**](CartLines.md)

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


## getEcommerceStoresIdCartsIdLinesId

> ECommerceCartLineItem getEcommerceStoresIdCartsIdLinesId(storeId, cartId, lineId, fields, excludeFields)

Get cart line item

Get information about a specific cart line item.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String cartId = "cartId_example"; // String | The id for the cart.
        String lineId = "lineId_example"; // String | The id for the line item of a cart.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            ECommerceCartLineItem result = apiInstance.getEcommerceStoresIdCartsIdLinesId(storeId, cartId, lineId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdCartsIdLinesId");
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
| **storeId** | **String**| The store id. | |
| **cartId** | **String**| The id for the cart. | |
| **lineId** | **String**| The id for the line item of a cart. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ECommerceCartLineItem**](ECommerceCartLineItem.md)

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


## getEcommerceStoresIdCustomers

> Customers getEcommerceStoresIdCustomers(storeId, fields, excludeFields, count, offset, emailAddress)

List customers

Get information about a store&#39;s customers.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        String emailAddress = "emailAddress_example"; // String | Restrict the response to customers with the email address.
        try {
            Customers result = apiInstance.getEcommerceStoresIdCustomers(storeId, fields, excludeFields, count, offset, emailAddress);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdCustomers");
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
| **storeId** | **String**| The store id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **emailAddress** | **String**| Restrict the response to customers with the email address. | [optional] |

### Return type

[**Customers**](Customers.md)

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


## getEcommerceStoresIdCustomersId

> ECommerceCustomer getEcommerceStoresIdCustomersId(storeId, customerId, fields, excludeFields)

Get customer info

Get information about a specific customer.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String customerId = "customerId_example"; // String | The id for the customer of a store.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            ECommerceCustomer result = apiInstance.getEcommerceStoresIdCustomersId(storeId, customerId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdCustomersId");
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
| **storeId** | **String**| The store id. | |
| **customerId** | **String**| The id for the customer of a store. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ECommerceCustomer**](ECommerceCustomer.md)

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


## getEcommerceStoresIdOrders

> Orders1 getEcommerceStoresIdOrders(storeId, fields, excludeFields, count, offset, customerId, hasOutreach, campaignId, outreachId)

List orders

Get information about a store&#39;s orders.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        String customerId = "customerId_example"; // String | Restrict results to orders made by a specific customer.
        Boolean hasOutreach = true; // Boolean | Restrict results to orders that have an outreach attached. For example, an email campaign or Facebook ad.
        String campaignId = "campaignId_example"; // String | Restrict results to orders with a specific `campaign_id` value.
        String outreachId = "outreachId_example"; // String | Restrict results to orders with a specific `outreach_id` value.
        try {
            Orders1 result = apiInstance.getEcommerceStoresIdOrders(storeId, fields, excludeFields, count, offset, customerId, hasOutreach, campaignId, outreachId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdOrders");
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
| **storeId** | **String**| The store id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **customerId** | **String**| Restrict results to orders made by a specific customer. | [optional] |
| **hasOutreach** | **Boolean**| Restrict results to orders that have an outreach attached. For example, an email campaign or Facebook ad. | [optional] |
| **campaignId** | **String**| Restrict results to orders with a specific &#x60;campaign_id&#x60; value. | [optional] |
| **outreachId** | **String**| Restrict results to orders with a specific &#x60;outreach_id&#x60; value. | [optional] |

### Return type

[**Orders1**](Orders1.md)

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


## getEcommerceStoresIdOrdersId

> ECommerceOrder getEcommerceStoresIdOrdersId(storeId, orderId, fields, excludeFields)

Get order info

Get information about a specific order.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String orderId = "orderId_example"; // String | The id for the order in a store.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            ECommerceOrder result = apiInstance.getEcommerceStoresIdOrdersId(storeId, orderId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdOrdersId");
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
| **storeId** | **String**| The store id. | |
| **orderId** | **String**| The id for the order in a store. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ECommerceOrder**](ECommerceOrder.md)

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


## getEcommerceStoresIdOrdersIdLines

> OrderLines getEcommerceStoresIdOrdersIdLines(storeId, orderId, fields, excludeFields, count, offset)

List order line items

Get information about an order&#39;s line items.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String orderId = "orderId_example"; // String | The id for the order in a store.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        try {
            OrderLines result = apiInstance.getEcommerceStoresIdOrdersIdLines(storeId, orderId, fields, excludeFields, count, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdOrdersIdLines");
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
| **storeId** | **String**| The store id. | |
| **orderId** | **String**| The id for the order in a store. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**OrderLines**](OrderLines.md)

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


## getEcommerceStoresIdOrdersIdLinesId

> ECommerceOrderLineItem getEcommerceStoresIdOrdersIdLinesId(storeId, orderId, lineId, fields, excludeFields)

Get order line item

Get information about a specific order line item.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String orderId = "orderId_example"; // String | The id for the order in a store.
        String lineId = "lineId_example"; // String | The id for the line item of an order.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            ECommerceOrderLineItem result = apiInstance.getEcommerceStoresIdOrdersIdLinesId(storeId, orderId, lineId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdOrdersIdLinesId");
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
| **storeId** | **String**| The store id. | |
| **orderId** | **String**| The id for the order in a store. | |
| **lineId** | **String**| The id for the line item of an order. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ECommerceOrderLineItem**](ECommerceOrderLineItem.md)

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


## getEcommerceStoresIdProducts

> Products getEcommerceStoresIdProducts(storeId, fields, excludeFields, count, offset)

List product

Get information about a store&#39;s products.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        try {
            Products result = apiInstance.getEcommerceStoresIdProducts(storeId, fields, excludeFields, count, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdProducts");
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
| **storeId** | **String**| The store id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**Products**](Products.md)

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


## getEcommerceStoresIdProductsId

> ECommerceProduct getEcommerceStoresIdProductsId(storeId, productId, fields, excludeFields)

Get product info

Get information about a specific product.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String productId = "productId_example"; // String | The id for the product of a store.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            ECommerceProduct result = apiInstance.getEcommerceStoresIdProductsId(storeId, productId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdProductsId");
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
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ECommerceProduct**](ECommerceProduct.md)

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


## getEcommerceStoresIdProductsIdImages

> EcommerceProductImages getEcommerceStoresIdProductsIdImages(storeId, productId, fields, excludeFields, count, offset)

List product images

Get information about a product&#39;s images.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String productId = "productId_example"; // String | The id for the product of a store.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        try {
            EcommerceProductImages result = apiInstance.getEcommerceStoresIdProductsIdImages(storeId, productId, fields, excludeFields, count, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdProductsIdImages");
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
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**EcommerceProductImages**](EcommerceProductImages.md)

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


## getEcommerceStoresIdProductsIdImagesId

> ECommerceProductImage getEcommerceStoresIdProductsIdImagesId(storeId, productId, imageId, fields, excludeFields)

Get product image info

Get information about a specific product image.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String productId = "productId_example"; // String | The id for the product of a store.
        String imageId = "imageId_example"; // String | The id for the product image.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            ECommerceProductImage result = apiInstance.getEcommerceStoresIdProductsIdImagesId(storeId, productId, imageId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdProductsIdImagesId");
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
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **imageId** | **String**| The id for the product image. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ECommerceProductImage**](ECommerceProductImage.md)

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


## getEcommerceStoresIdProductsIdVariants

> EcommerceProductVariants getEcommerceStoresIdProductsIdVariants(storeId, productId, fields, excludeFields, count, offset)

List product variants

Get information about a product&#39;s variants.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String productId = "productId_example"; // String | The id for the product of a store.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        try {
            EcommerceProductVariants result = apiInstance.getEcommerceStoresIdProductsIdVariants(storeId, productId, fields, excludeFields, count, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdProductsIdVariants");
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
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**EcommerceProductVariants**](EcommerceProductVariants.md)

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


## getEcommerceStoresIdProductsIdVariantsId

> ECommerceProductVariant getEcommerceStoresIdProductsIdVariantsId(storeId, productId, variantId, fields, excludeFields)

Get product variant info

Get information about a specific product variant.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String productId = "productId_example"; // String | The id for the product of a store.
        String variantId = "variantId_example"; // String | The id for the product variant.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            ECommerceProductVariant result = apiInstance.getEcommerceStoresIdProductsIdVariantsId(storeId, productId, variantId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdProductsIdVariantsId");
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
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **variantId** | **String**| The id for the product variant. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ECommerceProductVariant**](ECommerceProductVariant.md)

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


## getEcommerceStoresIdPromocodes

> PromoCodes getEcommerceStoresIdPromocodes(promoRuleId, storeId, fields, excludeFields, count, offset)

List promo codes

Get information about a store&#39;s promo codes.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String promoRuleId = "promoRuleId_example"; // String | The id for the promo rule of a store.
        String storeId = "storeId_example"; // String | The store id.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        try {
            PromoCodes result = apiInstance.getEcommerceStoresIdPromocodes(promoRuleId, storeId, fields, excludeFields, count, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdPromocodes");
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
| **promoRuleId** | **String**| The id for the promo rule of a store. | |
| **storeId** | **String**| The store id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**PromoCodes**](PromoCodes.md)

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


## getEcommerceStoresIdPromocodesId

> ECommercePromoCode getEcommerceStoresIdPromocodesId(storeId, promoRuleId, promoCodeId, fields, excludeFields)

Get promo code

Get information about a specific promo code.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String promoRuleId = "promoRuleId_example"; // String | The id for the promo rule of a store.
        String promoCodeId = "promoCodeId_example"; // String | The id for the promo code of a store.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            ECommercePromoCode result = apiInstance.getEcommerceStoresIdPromocodesId(storeId, promoRuleId, promoCodeId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdPromocodesId");
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
| **storeId** | **String**| The store id. | |
| **promoRuleId** | **String**| The id for the promo rule of a store. | |
| **promoCodeId** | **String**| The id for the promo code of a store. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ECommercePromoCode**](ECommercePromoCode.md)

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


## getEcommerceStoresIdPromorules

> PromoRules getEcommerceStoresIdPromorules(storeId, fields, excludeFields, count, offset)

List promo rules

Get information about a store&#39;s promo rules.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        Integer count = 10; // Integer | The number of records to return. Default value is 10. Maximum value is 1000
        Integer offset = 0; // Integer | Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
        try {
            PromoRules result = apiInstance.getEcommerceStoresIdPromorules(storeId, fields, excludeFields, count, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdPromorules");
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
| **storeId** | **String**| The store id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**PromoRules**](PromoRules.md)

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


## getEcommerceStoresIdPromorulesId

> ECommercePromoRule getEcommerceStoresIdPromorulesId(storeId, promoRuleId, fields, excludeFields)

Get promo rule

Get information about a specific promo rule.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String promoRuleId = "promoRuleId_example"; // String | The id for the promo rule of a store.
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
        List<String> excludeFields = Arrays.asList(); // List<String> | A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
        try {
            ECommercePromoRule result = apiInstance.getEcommerceStoresIdPromorulesId(storeId, promoRuleId, fields, excludeFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#getEcommerceStoresIdPromorulesId");
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
| **storeId** | **String**| The store id. | |
| **promoRuleId** | **String**| The id for the promo rule of a store. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ECommercePromoRule**](ECommercePromoRule.md)

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


## patchEcommerceStoresId

> ECommerceStore patchEcommerceStoresId(storeId, body)

Update store

Update a store.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        ECommerceStore2 body = new ECommerceStore2(); // ECommerceStore2 | 
        try {
            ECommerceStore result = apiInstance.patchEcommerceStoresId(storeId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#patchEcommerceStoresId");
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
| **storeId** | **String**| The store id. | |
| **body** | [**ECommerceStore2**](ECommerceStore2.md)|  | |

### Return type

[**ECommerceStore**](ECommerceStore.md)

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


## patchEcommerceStoresIdCartsId

> ECommerceCart patchEcommerceStoresIdCartsId(storeId, cartId, body)

Update cart

Update a specific cart.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String cartId = "cartId_example"; // String | The id for the cart.
        ECommerceCart2 body = new ECommerceCart2(); // ECommerceCart2 | 
        try {
            ECommerceCart result = apiInstance.patchEcommerceStoresIdCartsId(storeId, cartId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#patchEcommerceStoresIdCartsId");
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
| **storeId** | **String**| The store id. | |
| **cartId** | **String**| The id for the cart. | |
| **body** | [**ECommerceCart2**](ECommerceCart2.md)|  | |

### Return type

[**ECommerceCart**](ECommerceCart.md)

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


## patchEcommerceStoresIdCartsIdLinesId

> ECommerceCartLineItem patchEcommerceStoresIdCartsIdLinesId(storeId, cartId, lineId, body)

Update cart line item

Update a specific cart line item.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String cartId = "cartId_example"; // String | The id for the cart.
        String lineId = "lineId_example"; // String | The id for the line item of a cart.
        ECommerceCartLineItem2 body = new ECommerceCartLineItem2(); // ECommerceCartLineItem2 | 
        try {
            ECommerceCartLineItem result = apiInstance.patchEcommerceStoresIdCartsIdLinesId(storeId, cartId, lineId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#patchEcommerceStoresIdCartsIdLinesId");
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
| **storeId** | **String**| The store id. | |
| **cartId** | **String**| The id for the cart. | |
| **lineId** | **String**| The id for the line item of a cart. | |
| **body** | [**ECommerceCartLineItem2**](ECommerceCartLineItem2.md)|  | |

### Return type

[**ECommerceCartLineItem**](ECommerceCartLineItem.md)

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


## patchEcommerceStoresIdCustomersId

> ECommerceCustomer patchEcommerceStoresIdCustomersId(storeId, customerId, body)

Update customer

Update a customer.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String customerId = "customerId_example"; // String | The id for the customer of a store.
        ECommerceCustomer2 body = new ECommerceCustomer2(); // ECommerceCustomer2 | 
        try {
            ECommerceCustomer result = apiInstance.patchEcommerceStoresIdCustomersId(storeId, customerId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#patchEcommerceStoresIdCustomersId");
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
| **storeId** | **String**| The store id. | |
| **customerId** | **String**| The id for the customer of a store. | |
| **body** | [**ECommerceCustomer2**](ECommerceCustomer2.md)|  | |

### Return type

[**ECommerceCustomer**](ECommerceCustomer.md)

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


## patchEcommerceStoresIdOrdersId

> ECommerceOrder patchEcommerceStoresIdOrdersId(storeId, orderId, body)

Update order

Update a specific order.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String orderId = "orderId_example"; // String | The id for the order in a store.
        ECommerceOrder2 body = new ECommerceOrder2(); // ECommerceOrder2 | 
        try {
            ECommerceOrder result = apiInstance.patchEcommerceStoresIdOrdersId(storeId, orderId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#patchEcommerceStoresIdOrdersId");
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
| **storeId** | **String**| The store id. | |
| **orderId** | **String**| The id for the order in a store. | |
| **body** | [**ECommerceOrder2**](ECommerceOrder2.md)|  | |

### Return type

[**ECommerceOrder**](ECommerceOrder.md)

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


## patchEcommerceStoresIdOrdersIdLinesId

> ECommerceOrderLineItem patchEcommerceStoresIdOrdersIdLinesId(storeId, orderId, lineId, body)

Update order line item

Update a specific order line item.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String orderId = "orderId_example"; // String | The id for the order in a store.
        String lineId = "lineId_example"; // String | The id for the line item of an order.
        ECommerceOrderLineItem2 body = new ECommerceOrderLineItem2(); // ECommerceOrderLineItem2 | 
        try {
            ECommerceOrderLineItem result = apiInstance.patchEcommerceStoresIdOrdersIdLinesId(storeId, orderId, lineId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#patchEcommerceStoresIdOrdersIdLinesId");
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
| **storeId** | **String**| The store id. | |
| **orderId** | **String**| The id for the order in a store. | |
| **lineId** | **String**| The id for the line item of an order. | |
| **body** | [**ECommerceOrderLineItem2**](ECommerceOrderLineItem2.md)|  | |

### Return type

[**ECommerceOrderLineItem**](ECommerceOrderLineItem.md)

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


## patchEcommerceStoresIdProductsId

> ECommerceProduct patchEcommerceStoresIdProductsId(storeId, productId, body)

Update product

Update a specific product.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String productId = "productId_example"; // String | The id for the product of a store.
        ECommerceProduct2 body = new ECommerceProduct2(); // ECommerceProduct2 | 
        try {
            ECommerceProduct result = apiInstance.patchEcommerceStoresIdProductsId(storeId, productId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#patchEcommerceStoresIdProductsId");
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
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **body** | [**ECommerceProduct2**](ECommerceProduct2.md)|  | |

### Return type

[**ECommerceProduct**](ECommerceProduct.md)

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


## patchEcommerceStoresIdProductsIdImagesId

> ECommerceProductImage patchEcommerceStoresIdProductsIdImagesId(storeId, productId, imageId, body)

Update product image

Update a product image.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String productId = "productId_example"; // String | The id for the product of a store.
        String imageId = "imageId_example"; // String | The id for the product image.
        ECommerceProductImage2 body = new ECommerceProductImage2(); // ECommerceProductImage2 | 
        try {
            ECommerceProductImage result = apiInstance.patchEcommerceStoresIdProductsIdImagesId(storeId, productId, imageId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#patchEcommerceStoresIdProductsIdImagesId");
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
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **imageId** | **String**| The id for the product image. | |
| **body** | [**ECommerceProductImage2**](ECommerceProductImage2.md)|  | |

### Return type

[**ECommerceProductImage**](ECommerceProductImage.md)

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


## patchEcommerceStoresIdProductsIdVariantsId

> ECommerceProductVariant patchEcommerceStoresIdProductsIdVariantsId(storeId, productId, variantId, body)

Update product variant

Update a product variant.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String productId = "productId_example"; // String | The id for the product of a store.
        String variantId = "variantId_example"; // String | The id for the product variant.
        ECommerceProductVariant2 body = new ECommerceProductVariant2(); // ECommerceProductVariant2 | 
        try {
            ECommerceProductVariant result = apiInstance.patchEcommerceStoresIdProductsIdVariantsId(storeId, productId, variantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#patchEcommerceStoresIdProductsIdVariantsId");
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
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **variantId** | **String**| The id for the product variant. | |
| **body** | [**ECommerceProductVariant2**](ECommerceProductVariant2.md)|  | |

### Return type

[**ECommerceProductVariant**](ECommerceProductVariant.md)

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


## patchEcommerceStoresIdPromocodesId

> ECommercePromoCode patchEcommerceStoresIdPromocodesId(storeId, promoRuleId, promoCodeId, body)

Update promo code

Update a promo code.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String promoRuleId = "promoRuleId_example"; // String | The id for the promo rule of a store.
        String promoCodeId = "promoCodeId_example"; // String | The id for the promo code of a store.
        ECommercePromoCode2 body = new ECommercePromoCode2(); // ECommercePromoCode2 | 
        try {
            ECommercePromoCode result = apiInstance.patchEcommerceStoresIdPromocodesId(storeId, promoRuleId, promoCodeId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#patchEcommerceStoresIdPromocodesId");
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
| **storeId** | **String**| The store id. | |
| **promoRuleId** | **String**| The id for the promo rule of a store. | |
| **promoCodeId** | **String**| The id for the promo code of a store. | |
| **body** | [**ECommercePromoCode2**](ECommercePromoCode2.md)|  | |

### Return type

[**ECommercePromoCode**](ECommercePromoCode.md)

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


## patchEcommerceStoresIdPromorulesId

> ECommercePromoRule patchEcommerceStoresIdPromorulesId(storeId, promoRuleId, body)

Update promo rule

Update a promo rule.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String promoRuleId = "promoRuleId_example"; // String | The id for the promo rule of a store.
        ECommercePromoRule2 body = new ECommercePromoRule2(); // ECommercePromoRule2 | 
        try {
            ECommercePromoRule result = apiInstance.patchEcommerceStoresIdPromorulesId(storeId, promoRuleId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#patchEcommerceStoresIdPromorulesId");
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
| **storeId** | **String**| The store id. | |
| **promoRuleId** | **String**| The id for the promo rule of a store. | |
| **body** | [**ECommercePromoRule2**](ECommercePromoRule2.md)|  | |

### Return type

[**ECommercePromoRule**](ECommercePromoRule.md)

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


## postEcommerceStores

> ECommerceStore postEcommerceStores(body)

Add store

Add a new store to your Mailchimp account.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        ECommerceStore1 body = new ECommerceStore1(); // ECommerceStore1 | 
        try {
            ECommerceStore result = apiInstance.postEcommerceStores(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#postEcommerceStores");
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
| **body** | [**ECommerceStore1**](ECommerceStore1.md)|  | |

### Return type

[**ECommerceStore**](ECommerceStore.md)

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


## postEcommerceStoresIdCarts

> ECommerceCart postEcommerceStoresIdCarts(storeId, body)

Add cart

Add a new cart to a store.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        ECommerceCart1 body = new ECommerceCart1(); // ECommerceCart1 | 
        try {
            ECommerceCart result = apiInstance.postEcommerceStoresIdCarts(storeId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#postEcommerceStoresIdCarts");
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
| **storeId** | **String**| The store id. | |
| **body** | [**ECommerceCart1**](ECommerceCart1.md)|  | |

### Return type

[**ECommerceCart**](ECommerceCart.md)

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


## postEcommerceStoresIdCartsIdLines

> ECommerceCartLineItem postEcommerceStoresIdCartsIdLines(storeId, cartId, body)

Add cart line item

Add a new line item to an existing cart.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String cartId = "cartId_example"; // String | The id for the cart.
        ECommerceCartLineItem1 body = new ECommerceCartLineItem1(); // ECommerceCartLineItem1 | 
        try {
            ECommerceCartLineItem result = apiInstance.postEcommerceStoresIdCartsIdLines(storeId, cartId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#postEcommerceStoresIdCartsIdLines");
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
| **storeId** | **String**| The store id. | |
| **cartId** | **String**| The id for the cart. | |
| **body** | [**ECommerceCartLineItem1**](ECommerceCartLineItem1.md)|  | |

### Return type

[**ECommerceCartLineItem**](ECommerceCartLineItem.md)

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


## postEcommerceStoresIdCustomers

> ECommerceCustomer postEcommerceStoresIdCustomers(storeId, body)

Add customer

Add a new customer to a store.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        ECommerceCustomer3 body = new ECommerceCustomer3(); // ECommerceCustomer3 | 
        try {
            ECommerceCustomer result = apiInstance.postEcommerceStoresIdCustomers(storeId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#postEcommerceStoresIdCustomers");
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
| **storeId** | **String**| The store id. | |
| **body** | [**ECommerceCustomer3**](ECommerceCustomer3.md)|  | |

### Return type

[**ECommerceCustomer**](ECommerceCustomer.md)

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


## postEcommerceStoresIdOrders

> ECommerceOrder postEcommerceStoresIdOrders(storeId, body)

Add order

Add a new order to a store.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        ECommerceOrder1 body = new ECommerceOrder1(); // ECommerceOrder1 | 
        try {
            ECommerceOrder result = apiInstance.postEcommerceStoresIdOrders(storeId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#postEcommerceStoresIdOrders");
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
| **storeId** | **String**| The store id. | |
| **body** | [**ECommerceOrder1**](ECommerceOrder1.md)|  | |

### Return type

[**ECommerceOrder**](ECommerceOrder.md)

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


## postEcommerceStoresIdOrdersIdLines

> ECommerceOrderLineItem postEcommerceStoresIdOrdersIdLines(storeId, orderId, body)

Add order line item

Add a new line item to an existing order.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String orderId = "orderId_example"; // String | The id for the order in a store.
        ECommerceOrderLineItem1 body = new ECommerceOrderLineItem1(); // ECommerceOrderLineItem1 | 
        try {
            ECommerceOrderLineItem result = apiInstance.postEcommerceStoresIdOrdersIdLines(storeId, orderId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#postEcommerceStoresIdOrdersIdLines");
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
| **storeId** | **String**| The store id. | |
| **orderId** | **String**| The id for the order in a store. | |
| **body** | [**ECommerceOrderLineItem1**](ECommerceOrderLineItem1.md)|  | |

### Return type

[**ECommerceOrderLineItem**](ECommerceOrderLineItem.md)

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


## postEcommerceStoresIdProducts

> ECommerceProduct postEcommerceStoresIdProducts(storeId, body)

Add product

Add a new product to a store.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        ECommerceProduct1 body = new ECommerceProduct1(); // ECommerceProduct1 | 
        try {
            ECommerceProduct result = apiInstance.postEcommerceStoresIdProducts(storeId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#postEcommerceStoresIdProducts");
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
| **storeId** | **String**| The store id. | |
| **body** | [**ECommerceProduct1**](ECommerceProduct1.md)|  | |

### Return type

[**ECommerceProduct**](ECommerceProduct.md)

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


## postEcommerceStoresIdProductsIdImages

> ECommerceProductImage postEcommerceStoresIdProductsIdImages(storeId, productId, body)

Add product image

Add a new image to the product.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String productId = "productId_example"; // String | The id for the product of a store.
        ECommerceProductImage1 body = new ECommerceProductImage1(); // ECommerceProductImage1 | 
        try {
            ECommerceProductImage result = apiInstance.postEcommerceStoresIdProductsIdImages(storeId, productId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#postEcommerceStoresIdProductsIdImages");
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
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **body** | [**ECommerceProductImage1**](ECommerceProductImage1.md)|  | |

### Return type

[**ECommerceProductImage**](ECommerceProductImage.md)

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


## postEcommerceStoresIdProductsIdVariants

> ECommerceProductVariant postEcommerceStoresIdProductsIdVariants(storeId, productId, body)

Add product variant

Add a new variant to the product.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String productId = "productId_example"; // String | The id for the product of a store.
        ECommerceProductVariant1 body = new ECommerceProductVariant1(); // ECommerceProductVariant1 | 
        try {
            ECommerceProductVariant result = apiInstance.postEcommerceStoresIdProductsIdVariants(storeId, productId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#postEcommerceStoresIdProductsIdVariants");
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
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **body** | [**ECommerceProductVariant1**](ECommerceProductVariant1.md)|  | |

### Return type

[**ECommerceProductVariant**](ECommerceProductVariant.md)

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


## postEcommerceStoresIdPromocodes

> ECommercePromoCode postEcommerceStoresIdPromocodes(storeId, promoRuleId, body)

Add promo code

Add a new promo code to a store.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String promoRuleId = "promoRuleId_example"; // String | The id for the promo rule of a store.
        ECommercePromoCode1 body = new ECommercePromoCode1(); // ECommercePromoCode1 | 
        try {
            ECommercePromoCode result = apiInstance.postEcommerceStoresIdPromocodes(storeId, promoRuleId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#postEcommerceStoresIdPromocodes");
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
| **storeId** | **String**| The store id. | |
| **promoRuleId** | **String**| The id for the promo rule of a store. | |
| **body** | [**ECommercePromoCode1**](ECommercePromoCode1.md)|  | |

### Return type

[**ECommercePromoCode**](ECommercePromoCode.md)

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


## postEcommerceStoresIdPromorules

> ECommercePromoRule postEcommerceStoresIdPromorules(storeId, body)

Add promo rule

Add a new promo rule to a store.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        ECommercePromoRule1 body = new ECommercePromoRule1(); // ECommercePromoRule1 | 
        try {
            ECommercePromoRule result = apiInstance.postEcommerceStoresIdPromorules(storeId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#postEcommerceStoresIdPromorules");
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
| **storeId** | **String**| The store id. | |
| **body** | [**ECommercePromoRule1**](ECommercePromoRule1.md)|  | |

### Return type

[**ECommercePromoRule**](ECommercePromoRule.md)

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


## putEcommerceStoresIdCustomersId

> ECommerceCustomer putEcommerceStoresIdCustomersId(storeId, customerId, body)

Add or update customer

Add or update a customer.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String customerId = "customerId_example"; // String | The id for the customer of a store.
        ECommerceCustomer4 body = new ECommerceCustomer4(); // ECommerceCustomer4 | 
        try {
            ECommerceCustomer result = apiInstance.putEcommerceStoresIdCustomersId(storeId, customerId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#putEcommerceStoresIdCustomersId");
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
| **storeId** | **String**| The store id. | |
| **customerId** | **String**| The id for the customer of a store. | |
| **body** | [**ECommerceCustomer4**](ECommerceCustomer4.md)|  | |

### Return type

[**ECommerceCustomer**](ECommerceCustomer.md)

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


## putEcommerceStoresIdProductsIdVariantsId

> ECommerceProductVariant putEcommerceStoresIdProductsIdVariantsId(storeId, productId, variantId, body)

Add or update product variant

Add or update a product variant.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.ApiException;
import io.github.erkoristhein.mailchimp.marketing.Configuration;
import io.github.erkoristhein.mailchimp.marketing.auth.*;
import io.github.erkoristhein.mailchimp.marketing.models.*;
import io.github.erkoristhein.mailchimp.marketing.api.EcommerceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server.api.mailchimp.com/3.0");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EcommerceApi apiInstance = new EcommerceApi(defaultClient);
        String storeId = "storeId_example"; // String | The store id.
        String productId = "productId_example"; // String | The id for the product of a store.
        String variantId = "variantId_example"; // String | The id for the product variant.
        ECommerceProductVariant1 body = new ECommerceProductVariant1(); // ECommerceProductVariant1 | 
        try {
            ECommerceProductVariant result = apiInstance.putEcommerceStoresIdProductsIdVariantsId(storeId, productId, variantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EcommerceApi#putEcommerceStoresIdProductsIdVariantsId");
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
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **variantId** | **String**| The id for the product variant. | |
| **body** | [**ECommerceProductVariant1**](ECommerceProductVariant1.md)|  | |

### Return type

[**ECommerceProductVariant**](ECommerceProductVariant.md)

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

