package io.github.erkoristhein.mailchimp.marketing.api;

import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.BaseApi;

import io.github.erkoristhein.mailchimp.marketing.model.CartLines;
import io.github.erkoristhein.mailchimp.marketing.model.Carts;
import io.github.erkoristhein.mailchimp.marketing.model.Customers;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceCart;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceCart1;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceCart2;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceCartLineItem;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceCartLineItem1;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceCartLineItem2;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceCustomer;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceCustomer2;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceCustomer3;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceCustomer4;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceOrder;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceOrder1;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceOrder2;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceOrder3;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceOrderLineItem;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceOrderLineItem1;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceOrderLineItem3;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceProduct;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceProduct1;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceProduct2;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceProduct3;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceProductImage;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceProductImage1;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceProductImage2;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceProductVariant;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceProductVariant1;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceProductVariant2;
import io.github.erkoristhein.mailchimp.marketing.model.ECommercePromoCode;
import io.github.erkoristhein.mailchimp.marketing.model.ECommercePromoCode1;
import io.github.erkoristhein.mailchimp.marketing.model.ECommercePromoCode2;
import io.github.erkoristhein.mailchimp.marketing.model.ECommercePromoRule;
import io.github.erkoristhein.mailchimp.marketing.model.ECommercePromoRule1;
import io.github.erkoristhein.mailchimp.marketing.model.ECommercePromoRule2;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceStore;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceStore1;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceStore2;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceStores;
import io.github.erkoristhein.mailchimp.marketing.model.EcommerceProductImages;
import io.github.erkoristhein.mailchimp.marketing.model.EcommerceProductVariants;
import io.github.erkoristhein.mailchimp.marketing.model.OrderLines;
import io.github.erkoristhein.mailchimp.marketing.model.Orders;
import io.github.erkoristhein.mailchimp.marketing.model.Orders1;
import io.github.erkoristhein.mailchimp.marketing.model.ProblemDetailDocument;
import io.github.erkoristhein.mailchimp.marketing.model.Products;
import io.github.erkoristhein.mailchimp.marketing.model.PromoCodes;
import io.github.erkoristhein.mailchimp.marketing.model.PromoRules;

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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-11-23T16:28:01.262813+02:00[Europe/Tallinn]", comments = "Generator version: 7.17.0")
public class EcommerceApi extends BaseApi {

    public EcommerceApi() {
        super(new ApiClient());
    }

    public EcommerceApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Delete store
     * Delete a store. Deleting a store will also delete any associated subresources, including Customers, Orders, Products, and Carts.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object deleteEcommerceStoresId(String storeId) throws RestClientException {
        return deleteEcommerceStoresIdWithHttpInfo(storeId).getBody();
    }

    /**
     * Delete store
     * Delete a store. Deleting a store will also delete any associated subresources, including Customers, Orders, Products, and Carts.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> deleteEcommerceStoresIdWithHttpInfo(String storeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling deleteEcommerceStoresId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);

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

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete cart
     * Delete a cart.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param cartId The id for the cart. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteEcommerceStoresIdCartsId(String storeId, String cartId) throws RestClientException {
        deleteEcommerceStoresIdCartsIdWithHttpInfo(storeId, cartId);
    }

    /**
     * Delete cart
     * Delete a cart.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param cartId The id for the cart. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteEcommerceStoresIdCartsIdWithHttpInfo(String storeId, String cartId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling deleteEcommerceStoresIdCartsId");
        }
        
        // verify the required parameter 'cartId' is set
        if (cartId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cartId' when calling deleteEcommerceStoresIdCartsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("cart_id", cartId);

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
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/carts/{cart_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete cart line item
     * Delete a specific cart line item.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param cartId The id for the cart. (required)
     * @param lineId The id for the line item of a cart. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteEcommerceStoresIdCartsLinesId(String storeId, String cartId, String lineId) throws RestClientException {
        deleteEcommerceStoresIdCartsLinesIdWithHttpInfo(storeId, cartId, lineId);
    }

    /**
     * Delete cart line item
     * Delete a specific cart line item.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param cartId The id for the cart. (required)
     * @param lineId The id for the line item of a cart. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteEcommerceStoresIdCartsLinesIdWithHttpInfo(String storeId, String cartId, String lineId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling deleteEcommerceStoresIdCartsLinesId");
        }
        
        // verify the required parameter 'cartId' is set
        if (cartId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cartId' when calling deleteEcommerceStoresIdCartsLinesId");
        }
        
        // verify the required parameter 'lineId' is set
        if (lineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lineId' when calling deleteEcommerceStoresIdCartsLinesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("cart_id", cartId);
        uriVariables.put("line_id", lineId);

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
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/carts/{cart_id}/lines/{line_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete customer
     * Delete a customer from a store.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param customerId The id for the customer of a store. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteEcommerceStoresIdCustomersId(String storeId, String customerId) throws RestClientException {
        deleteEcommerceStoresIdCustomersIdWithHttpInfo(storeId, customerId);
    }

    /**
     * Delete customer
     * Delete a customer from a store.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param customerId The id for the customer of a store. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteEcommerceStoresIdCustomersIdWithHttpInfo(String storeId, String customerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling deleteEcommerceStoresIdCustomersId");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling deleteEcommerceStoresIdCustomersId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("customer_id", customerId);

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
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/customers/{customer_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete order
     * Delete an order.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param orderId The id for the order in a store. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteEcommerceStoresIdOrdersId(String storeId, String orderId) throws RestClientException {
        deleteEcommerceStoresIdOrdersIdWithHttpInfo(storeId, orderId);
    }

    /**
     * Delete order
     * Delete an order.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param orderId The id for the order in a store. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteEcommerceStoresIdOrdersIdWithHttpInfo(String storeId, String orderId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling deleteEcommerceStoresIdOrdersId");
        }
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling deleteEcommerceStoresIdOrdersId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("order_id", orderId);

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
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/orders/{order_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete order line item
     * Delete a specific order line item.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param orderId The id for the order in a store. (required)
     * @param lineId The id for the line item of an order. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteEcommerceStoresIdOrdersIdLinesId(String storeId, String orderId, String lineId) throws RestClientException {
        deleteEcommerceStoresIdOrdersIdLinesIdWithHttpInfo(storeId, orderId, lineId);
    }

    /**
     * Delete order line item
     * Delete a specific order line item.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param orderId The id for the order in a store. (required)
     * @param lineId The id for the line item of an order. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteEcommerceStoresIdOrdersIdLinesIdWithHttpInfo(String storeId, String orderId, String lineId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling deleteEcommerceStoresIdOrdersIdLinesId");
        }
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling deleteEcommerceStoresIdOrdersIdLinesId");
        }
        
        // verify the required parameter 'lineId' is set
        if (lineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lineId' when calling deleteEcommerceStoresIdOrdersIdLinesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("order_id", orderId);
        uriVariables.put("line_id", lineId);

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
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/orders/{order_id}/lines/{line_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete product
     * Delete a product.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteEcommerceStoresIdProductsId(String storeId, String productId) throws RestClientException {
        deleteEcommerceStoresIdProductsIdWithHttpInfo(storeId, productId);
    }

    /**
     * Delete product
     * Delete a product.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteEcommerceStoresIdProductsIdWithHttpInfo(String storeId, String productId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling deleteEcommerceStoresIdProductsId");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling deleteEcommerceStoresIdProductsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("product_id", productId);

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
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/products/{product_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete product image
     * Delete a product image.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param imageId The id for the product image. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteEcommerceStoresIdProductsIdImagesId(String storeId, String productId, String imageId) throws RestClientException {
        deleteEcommerceStoresIdProductsIdImagesIdWithHttpInfo(storeId, productId, imageId);
    }

    /**
     * Delete product image
     * Delete a product image.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param imageId The id for the product image. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteEcommerceStoresIdProductsIdImagesIdWithHttpInfo(String storeId, String productId, String imageId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling deleteEcommerceStoresIdProductsIdImagesId");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling deleteEcommerceStoresIdProductsIdImagesId");
        }
        
        // verify the required parameter 'imageId' is set
        if (imageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageId' when calling deleteEcommerceStoresIdProductsIdImagesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("product_id", productId);
        uriVariables.put("image_id", imageId);

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
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/products/{product_id}/images/{image_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete product variant
     * Delete a product variant.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param variantId The id for the product variant. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteEcommerceStoresIdProductsIdVariantsId(String storeId, String productId, String variantId) throws RestClientException {
        deleteEcommerceStoresIdProductsIdVariantsIdWithHttpInfo(storeId, productId, variantId);
    }

    /**
     * Delete product variant
     * Delete a product variant.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param variantId The id for the product variant. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteEcommerceStoresIdProductsIdVariantsIdWithHttpInfo(String storeId, String productId, String variantId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling deleteEcommerceStoresIdProductsIdVariantsId");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling deleteEcommerceStoresIdProductsIdVariantsId");
        }
        
        // verify the required parameter 'variantId' is set
        if (variantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variantId' when calling deleteEcommerceStoresIdProductsIdVariantsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("product_id", productId);
        uriVariables.put("variant_id", variantId);

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
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete promo code
     * Delete a promo code from a store.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param promoRuleId The id for the promo rule of a store. (required)
     * @param promoCodeId The id for the promo code of a store. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteEcommerceStoresIdPromocodesId(String storeId, String promoRuleId, String promoCodeId) throws RestClientException {
        deleteEcommerceStoresIdPromocodesIdWithHttpInfo(storeId, promoRuleId, promoCodeId);
    }

    /**
     * Delete promo code
     * Delete a promo code from a store.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param promoRuleId The id for the promo rule of a store. (required)
     * @param promoCodeId The id for the promo code of a store. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteEcommerceStoresIdPromocodesIdWithHttpInfo(String storeId, String promoRuleId, String promoCodeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling deleteEcommerceStoresIdPromocodesId");
        }
        
        // verify the required parameter 'promoRuleId' is set
        if (promoRuleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'promoRuleId' when calling deleteEcommerceStoresIdPromocodesId");
        }
        
        // verify the required parameter 'promoCodeId' is set
        if (promoCodeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'promoCodeId' when calling deleteEcommerceStoresIdPromocodesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("promo_rule_id", promoRuleId);
        uriVariables.put("promo_code_id", promoCodeId);

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
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes/{promo_code_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete promo rule
     * Delete a promo rule from a store.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param promoRuleId The id for the promo rule of a store. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteEcommerceStoresIdPromorulesId(String storeId, String promoRuleId) throws RestClientException {
        deleteEcommerceStoresIdPromorulesIdWithHttpInfo(storeId, promoRuleId);
    }

    /**
     * Delete promo rule
     * Delete a promo rule from a store.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param promoRuleId The id for the promo rule of a store. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteEcommerceStoresIdPromorulesIdWithHttpInfo(String storeId, String promoRuleId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling deleteEcommerceStoresIdPromorulesId");
        }
        
        // verify the required parameter 'promoRuleId' is set
        if (promoRuleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'promoRuleId' when calling deleteEcommerceStoresIdPromorulesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("promo_rule_id", promoRuleId);

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
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List account orders
     * Get information about an account&#39;s orders.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param campaignId Restrict results to orders with a specific &#x60;campaign_id&#x60; value. (optional)
     * @param outreachId Restrict results to orders with a specific &#x60;outreach_id&#x60; value. (optional)
     * @param customerId Restrict results to orders made by a specific customer. (optional)
     * @param hasOutreach Restrict results to orders that have an outreach attached. For example, an email campaign or Facebook ad. (optional)
     * @return Orders
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Orders getEcommerceOrders(List<String> fields, List<String> excludeFields, Integer count, Integer offset, String campaignId, String outreachId, String customerId, Boolean hasOutreach) throws RestClientException {
        return getEcommerceOrdersWithHttpInfo(fields, excludeFields, count, offset, campaignId, outreachId, customerId, hasOutreach).getBody();
    }

    /**
     * List account orders
     * Get information about an account&#39;s orders.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param campaignId Restrict results to orders with a specific &#x60;campaign_id&#x60; value. (optional)
     * @param outreachId Restrict results to orders with a specific &#x60;outreach_id&#x60; value. (optional)
     * @param customerId Restrict results to orders made by a specific customer. (optional)
     * @param hasOutreach Restrict results to orders that have an outreach attached. For example, an email campaign or Facebook ad. (optional)
     * @return ResponseEntity&lt;Orders&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Orders> getEcommerceOrdersWithHttpInfo(List<String> fields, List<String> excludeFields, Integer count, Integer offset, String campaignId, String outreachId, String customerId, Boolean hasOutreach) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "exclude_fields", excludeFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "campaign_id", campaignId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "outreach_id", outreachId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "customer_id", customerId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "has_outreach", hasOutreach));
        

        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Orders> localReturnType = new ParameterizedTypeReference<Orders>() {};
        return apiClient.invokeAPI("/ecommerce/orders", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List stores
     * Get information about all stores in the account.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return ECommerceStores
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceStores getEcommerceStores(List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        return getEcommerceStoresWithHttpInfo(fields, excludeFields, count, offset).getBody();
    }

    /**
     * List stores
     * Get information about all stores in the account.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return ResponseEntity&lt;ECommerceStores&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceStores> getEcommerceStoresWithHttpInfo(List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<ECommerceStores> localReturnType = new ParameterizedTypeReference<ECommerceStores>() {};
        return apiClient.invokeAPI("/ecommerce/stores", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get store info
     * Get information about a specific store.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ECommerceStore
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceStore getEcommerceStoresId(String storeId, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getEcommerceStoresIdWithHttpInfo(storeId, fields, excludeFields).getBody();
    }

    /**
     * Get store info
     * Get information about a specific store.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;ECommerceStore&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceStore> getEcommerceStoresIdWithHttpInfo(String storeId, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);

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

        ParameterizedTypeReference<ECommerceStore> localReturnType = new ParameterizedTypeReference<ECommerceStore>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List carts
     * Get information about a store&#39;s carts.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return Carts
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Carts getEcommerceStoresIdCarts(String storeId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        return getEcommerceStoresIdCartsWithHttpInfo(storeId, fields, excludeFields, count, offset).getBody();
    }

    /**
     * List carts
     * Get information about a store&#39;s carts.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return ResponseEntity&lt;Carts&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Carts> getEcommerceStoresIdCartsWithHttpInfo(String storeId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdCarts");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);

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

        ParameterizedTypeReference<Carts> localReturnType = new ParameterizedTypeReference<Carts>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/carts", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get cart info
     * Get information about a specific cart.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param cartId The id for the cart. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ECommerceCart
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceCart getEcommerceStoresIdCartsId(String storeId, String cartId, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getEcommerceStoresIdCartsIdWithHttpInfo(storeId, cartId, fields, excludeFields).getBody();
    }

    /**
     * Get cart info
     * Get information about a specific cart.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param cartId The id for the cart. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;ECommerceCart&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceCart> getEcommerceStoresIdCartsIdWithHttpInfo(String storeId, String cartId, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdCartsId");
        }
        
        // verify the required parameter 'cartId' is set
        if (cartId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cartId' when calling getEcommerceStoresIdCartsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("cart_id", cartId);

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

        ParameterizedTypeReference<ECommerceCart> localReturnType = new ParameterizedTypeReference<ECommerceCart>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/carts/{cart_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List cart line items
     * Get information about a cart&#39;s line items.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param cartId The id for the cart. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return CartLines
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CartLines getEcommerceStoresIdCartsIdLines(String storeId, String cartId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        return getEcommerceStoresIdCartsIdLinesWithHttpInfo(storeId, cartId, fields, excludeFields, count, offset).getBody();
    }

    /**
     * List cart line items
     * Get information about a cart&#39;s line items.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param cartId The id for the cart. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return ResponseEntity&lt;CartLines&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CartLines> getEcommerceStoresIdCartsIdLinesWithHttpInfo(String storeId, String cartId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdCartsIdLines");
        }
        
        // verify the required parameter 'cartId' is set
        if (cartId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cartId' when calling getEcommerceStoresIdCartsIdLines");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("cart_id", cartId);

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

        ParameterizedTypeReference<CartLines> localReturnType = new ParameterizedTypeReference<CartLines>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/carts/{cart_id}/lines", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get cart line item
     * Get information about a specific cart line item.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param cartId The id for the cart. (required)
     * @param lineId The id for the line item of a cart. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ECommerceCartLineItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceCartLineItem getEcommerceStoresIdCartsIdLinesId(String storeId, String cartId, String lineId, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getEcommerceStoresIdCartsIdLinesIdWithHttpInfo(storeId, cartId, lineId, fields, excludeFields).getBody();
    }

    /**
     * Get cart line item
     * Get information about a specific cart line item.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param cartId The id for the cart. (required)
     * @param lineId The id for the line item of a cart. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;ECommerceCartLineItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceCartLineItem> getEcommerceStoresIdCartsIdLinesIdWithHttpInfo(String storeId, String cartId, String lineId, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdCartsIdLinesId");
        }
        
        // verify the required parameter 'cartId' is set
        if (cartId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cartId' when calling getEcommerceStoresIdCartsIdLinesId");
        }
        
        // verify the required parameter 'lineId' is set
        if (lineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lineId' when calling getEcommerceStoresIdCartsIdLinesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("cart_id", cartId);
        uriVariables.put("line_id", lineId);

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

        ParameterizedTypeReference<ECommerceCartLineItem> localReturnType = new ParameterizedTypeReference<ECommerceCartLineItem>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/carts/{cart_id}/lines/{line_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List customers
     * Get information about a store&#39;s customers.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param emailAddress Restrict the response to customers with the email address. (optional)
     * @return Customers
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Customers getEcommerceStoresIdCustomers(String storeId, List<String> fields, List<String> excludeFields, Integer count, Integer offset, String emailAddress) throws RestClientException {
        return getEcommerceStoresIdCustomersWithHttpInfo(storeId, fields, excludeFields, count, offset, emailAddress).getBody();
    }

    /**
     * List customers
     * Get information about a store&#39;s customers.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param emailAddress Restrict the response to customers with the email address. (optional)
     * @return ResponseEntity&lt;Customers&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Customers> getEcommerceStoresIdCustomersWithHttpInfo(String storeId, List<String> fields, List<String> excludeFields, Integer count, Integer offset, String emailAddress) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdCustomers");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "exclude_fields", excludeFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "email_address", emailAddress));
        

        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Customers> localReturnType = new ParameterizedTypeReference<Customers>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/customers", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get customer info
     * Get information about a specific customer.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param customerId The id for the customer of a store. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ECommerceCustomer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceCustomer getEcommerceStoresIdCustomersId(String storeId, String customerId, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getEcommerceStoresIdCustomersIdWithHttpInfo(storeId, customerId, fields, excludeFields).getBody();
    }

    /**
     * Get customer info
     * Get information about a specific customer.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param customerId The id for the customer of a store. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;ECommerceCustomer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceCustomer> getEcommerceStoresIdCustomersIdWithHttpInfo(String storeId, String customerId, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdCustomersId");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getEcommerceStoresIdCustomersId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("customer_id", customerId);

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

        ParameterizedTypeReference<ECommerceCustomer> localReturnType = new ParameterizedTypeReference<ECommerceCustomer>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/customers/{customer_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List orders
     * Get information about a store&#39;s orders.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param customerId Restrict results to orders made by a specific customer. (optional)
     * @param hasOutreach Restrict results to orders that have an outreach attached. For example, an email campaign or Facebook ad. (optional)
     * @param campaignId Restrict results to orders with a specific &#x60;campaign_id&#x60; value. (optional)
     * @param outreachId Restrict results to orders with a specific &#x60;outreach_id&#x60; value. (optional)
     * @return Orders1
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Orders1 getEcommerceStoresIdOrders(String storeId, List<String> fields, List<String> excludeFields, Integer count, Integer offset, String customerId, Boolean hasOutreach, String campaignId, String outreachId) throws RestClientException {
        return getEcommerceStoresIdOrdersWithHttpInfo(storeId, fields, excludeFields, count, offset, customerId, hasOutreach, campaignId, outreachId).getBody();
    }

    /**
     * List orders
     * Get information about a store&#39;s orders.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @param customerId Restrict results to orders made by a specific customer. (optional)
     * @param hasOutreach Restrict results to orders that have an outreach attached. For example, an email campaign or Facebook ad. (optional)
     * @param campaignId Restrict results to orders with a specific &#x60;campaign_id&#x60; value. (optional)
     * @param outreachId Restrict results to orders with a specific &#x60;outreach_id&#x60; value. (optional)
     * @return ResponseEntity&lt;Orders1&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Orders1> getEcommerceStoresIdOrdersWithHttpInfo(String storeId, List<String> fields, List<String> excludeFields, Integer count, Integer offset, String customerId, Boolean hasOutreach, String campaignId, String outreachId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdOrders");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "exclude_fields", excludeFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "customer_id", customerId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "has_outreach", hasOutreach));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "campaign_id", campaignId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "outreach_id", outreachId));
        

        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Orders1> localReturnType = new ParameterizedTypeReference<Orders1>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/orders", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get order info
     * Get information about a specific order.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param orderId The id for the order in a store. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ECommerceOrder
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceOrder getEcommerceStoresIdOrdersId(String storeId, String orderId, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getEcommerceStoresIdOrdersIdWithHttpInfo(storeId, orderId, fields, excludeFields).getBody();
    }

    /**
     * Get order info
     * Get information about a specific order.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param orderId The id for the order in a store. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;ECommerceOrder&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceOrder> getEcommerceStoresIdOrdersIdWithHttpInfo(String storeId, String orderId, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdOrdersId");
        }
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling getEcommerceStoresIdOrdersId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("order_id", orderId);

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

        ParameterizedTypeReference<ECommerceOrder> localReturnType = new ParameterizedTypeReference<ECommerceOrder>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/orders/{order_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List order line items
     * Get information about an order&#39;s line items.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param orderId The id for the order in a store. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return OrderLines
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OrderLines getEcommerceStoresIdOrdersIdLines(String storeId, String orderId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        return getEcommerceStoresIdOrdersIdLinesWithHttpInfo(storeId, orderId, fields, excludeFields, count, offset).getBody();
    }

    /**
     * List order line items
     * Get information about an order&#39;s line items.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param orderId The id for the order in a store. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return ResponseEntity&lt;OrderLines&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OrderLines> getEcommerceStoresIdOrdersIdLinesWithHttpInfo(String storeId, String orderId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdOrdersIdLines");
        }
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling getEcommerceStoresIdOrdersIdLines");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("order_id", orderId);

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

        ParameterizedTypeReference<OrderLines> localReturnType = new ParameterizedTypeReference<OrderLines>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/orders/{order_id}/lines", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get order line item
     * Get information about a specific order line item.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param orderId The id for the order in a store. (required)
     * @param lineId The id for the line item of an order. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ECommerceOrderLineItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceOrderLineItem getEcommerceStoresIdOrdersIdLinesId(String storeId, String orderId, String lineId, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getEcommerceStoresIdOrdersIdLinesIdWithHttpInfo(storeId, orderId, lineId, fields, excludeFields).getBody();
    }

    /**
     * Get order line item
     * Get information about a specific order line item.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param orderId The id for the order in a store. (required)
     * @param lineId The id for the line item of an order. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;ECommerceOrderLineItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceOrderLineItem> getEcommerceStoresIdOrdersIdLinesIdWithHttpInfo(String storeId, String orderId, String lineId, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdOrdersIdLinesId");
        }
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling getEcommerceStoresIdOrdersIdLinesId");
        }
        
        // verify the required parameter 'lineId' is set
        if (lineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lineId' when calling getEcommerceStoresIdOrdersIdLinesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("order_id", orderId);
        uriVariables.put("line_id", lineId);

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

        ParameterizedTypeReference<ECommerceOrderLineItem> localReturnType = new ParameterizedTypeReference<ECommerceOrderLineItem>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/orders/{order_id}/lines/{line_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List product
     * Get information about a store&#39;s products.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return Products
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Products getEcommerceStoresIdProducts(String storeId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        return getEcommerceStoresIdProductsWithHttpInfo(storeId, fields, excludeFields, count, offset).getBody();
    }

    /**
     * List product
     * Get information about a store&#39;s products.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return ResponseEntity&lt;Products&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Products> getEcommerceStoresIdProductsWithHttpInfo(String storeId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdProducts");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);

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

        ParameterizedTypeReference<Products> localReturnType = new ParameterizedTypeReference<Products>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/products", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get product info
     * Get information about a specific product.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ECommerceProduct2
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceProduct2 getEcommerceStoresIdProductsId(String storeId, String productId, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getEcommerceStoresIdProductsIdWithHttpInfo(storeId, productId, fields, excludeFields).getBody();
    }

    /**
     * Get product info
     * Get information about a specific product.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;ECommerceProduct2&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceProduct2> getEcommerceStoresIdProductsIdWithHttpInfo(String storeId, String productId, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdProductsId");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling getEcommerceStoresIdProductsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("product_id", productId);

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

        ParameterizedTypeReference<ECommerceProduct2> localReturnType = new ParameterizedTypeReference<ECommerceProduct2>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/products/{product_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List product images
     * Get information about a product&#39;s images.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return EcommerceProductImages
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EcommerceProductImages getEcommerceStoresIdProductsIdImages(String storeId, String productId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        return getEcommerceStoresIdProductsIdImagesWithHttpInfo(storeId, productId, fields, excludeFields, count, offset).getBody();
    }

    /**
     * List product images
     * Get information about a product&#39;s images.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return ResponseEntity&lt;EcommerceProductImages&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EcommerceProductImages> getEcommerceStoresIdProductsIdImagesWithHttpInfo(String storeId, String productId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdProductsIdImages");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling getEcommerceStoresIdProductsIdImages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("product_id", productId);

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

        ParameterizedTypeReference<EcommerceProductImages> localReturnType = new ParameterizedTypeReference<EcommerceProductImages>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/products/{product_id}/images", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get product image info
     * Get information about a specific product image.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param imageId The id for the product image. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ECommerceProductImage1
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceProductImage1 getEcommerceStoresIdProductsIdImagesId(String storeId, String productId, String imageId, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getEcommerceStoresIdProductsIdImagesIdWithHttpInfo(storeId, productId, imageId, fields, excludeFields).getBody();
    }

    /**
     * Get product image info
     * Get information about a specific product image.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param imageId The id for the product image. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;ECommerceProductImage1&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceProductImage1> getEcommerceStoresIdProductsIdImagesIdWithHttpInfo(String storeId, String productId, String imageId, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdProductsIdImagesId");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling getEcommerceStoresIdProductsIdImagesId");
        }
        
        // verify the required parameter 'imageId' is set
        if (imageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageId' when calling getEcommerceStoresIdProductsIdImagesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("product_id", productId);
        uriVariables.put("image_id", imageId);

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

        ParameterizedTypeReference<ECommerceProductImage1> localReturnType = new ParameterizedTypeReference<ECommerceProductImage1>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/products/{product_id}/images/{image_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List product variants
     * Get information about a product&#39;s variants.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return EcommerceProductVariants
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EcommerceProductVariants getEcommerceStoresIdProductsIdVariants(String storeId, String productId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        return getEcommerceStoresIdProductsIdVariantsWithHttpInfo(storeId, productId, fields, excludeFields, count, offset).getBody();
    }

    /**
     * List product variants
     * Get information about a product&#39;s variants.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return ResponseEntity&lt;EcommerceProductVariants&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EcommerceProductVariants> getEcommerceStoresIdProductsIdVariantsWithHttpInfo(String storeId, String productId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdProductsIdVariants");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling getEcommerceStoresIdProductsIdVariants");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("product_id", productId);

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

        ParameterizedTypeReference<EcommerceProductVariants> localReturnType = new ParameterizedTypeReference<EcommerceProductVariants>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/products/{product_id}/variants", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get product variant info
     * Get information about a specific product variant.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param variantId The id for the product variant. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ECommerceProductVariant1
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceProductVariant1 getEcommerceStoresIdProductsIdVariantsId(String storeId, String productId, String variantId, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getEcommerceStoresIdProductsIdVariantsIdWithHttpInfo(storeId, productId, variantId, fields, excludeFields).getBody();
    }

    /**
     * Get product variant info
     * Get information about a specific product variant.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param variantId The id for the product variant. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;ECommerceProductVariant1&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceProductVariant1> getEcommerceStoresIdProductsIdVariantsIdWithHttpInfo(String storeId, String productId, String variantId, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdProductsIdVariantsId");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling getEcommerceStoresIdProductsIdVariantsId");
        }
        
        // verify the required parameter 'variantId' is set
        if (variantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variantId' when calling getEcommerceStoresIdProductsIdVariantsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("product_id", productId);
        uriVariables.put("variant_id", variantId);

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

        ParameterizedTypeReference<ECommerceProductVariant1> localReturnType = new ParameterizedTypeReference<ECommerceProductVariant1>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List promo codes
     * Get information about a store&#39;s promo codes.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param promoRuleId The id for the promo rule of a store. (required)
     * @param storeId The store id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return PromoCodes
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PromoCodes getEcommerceStoresIdPromocodes(String promoRuleId, String storeId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        return getEcommerceStoresIdPromocodesWithHttpInfo(promoRuleId, storeId, fields, excludeFields, count, offset).getBody();
    }

    /**
     * List promo codes
     * Get information about a store&#39;s promo codes.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param promoRuleId The id for the promo rule of a store. (required)
     * @param storeId The store id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return ResponseEntity&lt;PromoCodes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PromoCodes> getEcommerceStoresIdPromocodesWithHttpInfo(String promoRuleId, String storeId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'promoRuleId' is set
        if (promoRuleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'promoRuleId' when calling getEcommerceStoresIdPromocodes");
        }
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdPromocodes");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("promo_rule_id", promoRuleId);
        uriVariables.put("store_id", storeId);

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

        ParameterizedTypeReference<PromoCodes> localReturnType = new ParameterizedTypeReference<PromoCodes>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get promo code
     * Get information about a specific promo code.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param promoRuleId The id for the promo rule of a store. (required)
     * @param promoCodeId The id for the promo code of a store. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ECommercePromoCode
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommercePromoCode getEcommerceStoresIdPromocodesId(String storeId, String promoRuleId, String promoCodeId, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getEcommerceStoresIdPromocodesIdWithHttpInfo(storeId, promoRuleId, promoCodeId, fields, excludeFields).getBody();
    }

    /**
     * Get promo code
     * Get information about a specific promo code.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param promoRuleId The id for the promo rule of a store. (required)
     * @param promoCodeId The id for the promo code of a store. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;ECommercePromoCode&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommercePromoCode> getEcommerceStoresIdPromocodesIdWithHttpInfo(String storeId, String promoRuleId, String promoCodeId, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdPromocodesId");
        }
        
        // verify the required parameter 'promoRuleId' is set
        if (promoRuleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'promoRuleId' when calling getEcommerceStoresIdPromocodesId");
        }
        
        // verify the required parameter 'promoCodeId' is set
        if (promoCodeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'promoCodeId' when calling getEcommerceStoresIdPromocodesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("promo_rule_id", promoRuleId);
        uriVariables.put("promo_code_id", promoCodeId);

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

        ParameterizedTypeReference<ECommercePromoCode> localReturnType = new ParameterizedTypeReference<ECommercePromoCode>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes/{promo_code_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List promo rules
     * Get information about a store&#39;s promo rules.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return PromoRules
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PromoRules getEcommerceStoresIdPromorules(String storeId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        return getEcommerceStoresIdPromorulesWithHttpInfo(storeId, fields, excludeFields, count, offset).getBody();
    }

    /**
     * List promo rules
     * Get information about a store&#39;s promo rules.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this is the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return ResponseEntity&lt;PromoRules&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PromoRules> getEcommerceStoresIdPromorulesWithHttpInfo(String storeId, List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdPromorules");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);

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

        ParameterizedTypeReference<PromoRules> localReturnType = new ParameterizedTypeReference<PromoRules>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/promo-rules", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get promo rule
     * Get information about a specific promo rule.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param promoRuleId The id for the promo rule of a store. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ECommercePromoRule
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommercePromoRule getEcommerceStoresIdPromorulesId(String storeId, String promoRuleId, List<String> fields, List<String> excludeFields) throws RestClientException {
        return getEcommerceStoresIdPromorulesIdWithHttpInfo(storeId, promoRuleId, fields, excludeFields).getBody();
    }

    /**
     * Get promo rule
     * Get information about a specific promo rule.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param promoRuleId The id for the promo rule of a store. (required)
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @return ResponseEntity&lt;ECommercePromoRule&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommercePromoRule> getEcommerceStoresIdPromorulesIdWithHttpInfo(String storeId, String promoRuleId, List<String> fields, List<String> excludeFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling getEcommerceStoresIdPromorulesId");
        }
        
        // verify the required parameter 'promoRuleId' is set
        if (promoRuleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'promoRuleId' when calling getEcommerceStoresIdPromorulesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("promo_rule_id", promoRuleId);

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

        ParameterizedTypeReference<ECommercePromoRule> localReturnType = new ParameterizedTypeReference<ECommercePromoRule>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update store
     * Update a store.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param body  (required)
     * @return ECommerceStore
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceStore patchEcommerceStoresId(String storeId, ECommerceStore2 body) throws RestClientException {
        return patchEcommerceStoresIdWithHttpInfo(storeId, body).getBody();
    }

    /**
     * Update store
     * Update a store.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceStore&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceStore> patchEcommerceStoresIdWithHttpInfo(String storeId, ECommerceStore2 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling patchEcommerceStoresId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchEcommerceStoresId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);

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

        ParameterizedTypeReference<ECommerceStore> localReturnType = new ParameterizedTypeReference<ECommerceStore>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update cart
     * Update a specific cart.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param cartId The id for the cart. (required)
     * @param body  (required)
     * @return ECommerceCart
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceCart patchEcommerceStoresIdCartsId(String storeId, String cartId, ECommerceCart2 body) throws RestClientException {
        return patchEcommerceStoresIdCartsIdWithHttpInfo(storeId, cartId, body).getBody();
    }

    /**
     * Update cart
     * Update a specific cart.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param cartId The id for the cart. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceCart&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceCart> patchEcommerceStoresIdCartsIdWithHttpInfo(String storeId, String cartId, ECommerceCart2 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling patchEcommerceStoresIdCartsId");
        }
        
        // verify the required parameter 'cartId' is set
        if (cartId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cartId' when calling patchEcommerceStoresIdCartsId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchEcommerceStoresIdCartsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("cart_id", cartId);

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

        ParameterizedTypeReference<ECommerceCart> localReturnType = new ParameterizedTypeReference<ECommerceCart>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/carts/{cart_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update cart line item
     * Update a specific cart line item.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param cartId The id for the cart. (required)
     * @param lineId The id for the line item of a cart. (required)
     * @param body  (required)
     * @return ECommerceCartLineItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceCartLineItem patchEcommerceStoresIdCartsIdLinesId(String storeId, String cartId, String lineId, ECommerceCartLineItem2 body) throws RestClientException {
        return patchEcommerceStoresIdCartsIdLinesIdWithHttpInfo(storeId, cartId, lineId, body).getBody();
    }

    /**
     * Update cart line item
     * Update a specific cart line item.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param cartId The id for the cart. (required)
     * @param lineId The id for the line item of a cart. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceCartLineItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceCartLineItem> patchEcommerceStoresIdCartsIdLinesIdWithHttpInfo(String storeId, String cartId, String lineId, ECommerceCartLineItem2 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling patchEcommerceStoresIdCartsIdLinesId");
        }
        
        // verify the required parameter 'cartId' is set
        if (cartId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cartId' when calling patchEcommerceStoresIdCartsIdLinesId");
        }
        
        // verify the required parameter 'lineId' is set
        if (lineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lineId' when calling patchEcommerceStoresIdCartsIdLinesId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchEcommerceStoresIdCartsIdLinesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("cart_id", cartId);
        uriVariables.put("line_id", lineId);

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

        ParameterizedTypeReference<ECommerceCartLineItem> localReturnType = new ParameterizedTypeReference<ECommerceCartLineItem>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/carts/{cart_id}/lines/{line_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update customer
     * Update a customer.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param customerId The id for the customer of a store. (required)
     * @param body  (required)
     * @return ECommerceCustomer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceCustomer patchEcommerceStoresIdCustomersId(String storeId, String customerId, ECommerceCustomer2 body) throws RestClientException {
        return patchEcommerceStoresIdCustomersIdWithHttpInfo(storeId, customerId, body).getBody();
    }

    /**
     * Update customer
     * Update a customer.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param customerId The id for the customer of a store. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceCustomer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceCustomer> patchEcommerceStoresIdCustomersIdWithHttpInfo(String storeId, String customerId, ECommerceCustomer2 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling patchEcommerceStoresIdCustomersId");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling patchEcommerceStoresIdCustomersId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchEcommerceStoresIdCustomersId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("customer_id", customerId);

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

        ParameterizedTypeReference<ECommerceCustomer> localReturnType = new ParameterizedTypeReference<ECommerceCustomer>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/customers/{customer_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update order
     * Update a specific order.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param orderId The id for the order in a store. (required)
     * @param body  (required)
     * @return ECommerceOrder
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceOrder patchEcommerceStoresIdOrdersId(String storeId, String orderId, ECommerceOrder3 body) throws RestClientException {
        return patchEcommerceStoresIdOrdersIdWithHttpInfo(storeId, orderId, body).getBody();
    }

    /**
     * Update order
     * Update a specific order.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param orderId The id for the order in a store. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceOrder&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceOrder> patchEcommerceStoresIdOrdersIdWithHttpInfo(String storeId, String orderId, ECommerceOrder3 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling patchEcommerceStoresIdOrdersId");
        }
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling patchEcommerceStoresIdOrdersId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchEcommerceStoresIdOrdersId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("order_id", orderId);

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

        ParameterizedTypeReference<ECommerceOrder> localReturnType = new ParameterizedTypeReference<ECommerceOrder>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/orders/{order_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update order line item
     * Update a specific order line item.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param orderId The id for the order in a store. (required)
     * @param lineId The id for the line item of an order. (required)
     * @param body  (required)
     * @return ECommerceOrderLineItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceOrderLineItem patchEcommerceStoresIdOrdersIdLinesId(String storeId, String orderId, String lineId, ECommerceOrderLineItem3 body) throws RestClientException {
        return patchEcommerceStoresIdOrdersIdLinesIdWithHttpInfo(storeId, orderId, lineId, body).getBody();
    }

    /**
     * Update order line item
     * Update a specific order line item.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param orderId The id for the order in a store. (required)
     * @param lineId The id for the line item of an order. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceOrderLineItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceOrderLineItem> patchEcommerceStoresIdOrdersIdLinesIdWithHttpInfo(String storeId, String orderId, String lineId, ECommerceOrderLineItem3 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling patchEcommerceStoresIdOrdersIdLinesId");
        }
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling patchEcommerceStoresIdOrdersIdLinesId");
        }
        
        // verify the required parameter 'lineId' is set
        if (lineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lineId' when calling patchEcommerceStoresIdOrdersIdLinesId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchEcommerceStoresIdOrdersIdLinesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("order_id", orderId);
        uriVariables.put("line_id", lineId);

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

        ParameterizedTypeReference<ECommerceOrderLineItem> localReturnType = new ParameterizedTypeReference<ECommerceOrderLineItem>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/orders/{order_id}/lines/{line_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update product
     * Update a specific product.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param body  (required)
     * @return ECommerceProduct2
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceProduct2 patchEcommerceStoresIdProductsId(String storeId, String productId, ECommerceProduct3 body) throws RestClientException {
        return patchEcommerceStoresIdProductsIdWithHttpInfo(storeId, productId, body).getBody();
    }

    /**
     * Update product
     * Update a specific product.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceProduct2&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceProduct2> patchEcommerceStoresIdProductsIdWithHttpInfo(String storeId, String productId, ECommerceProduct3 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling patchEcommerceStoresIdProductsId");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling patchEcommerceStoresIdProductsId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchEcommerceStoresIdProductsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("product_id", productId);

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

        ParameterizedTypeReference<ECommerceProduct2> localReturnType = new ParameterizedTypeReference<ECommerceProduct2>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/products/{product_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update product image
     * Update a product image.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param imageId The id for the product image. (required)
     * @param body  (required)
     * @return ECommerceProductImage1
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceProductImage1 patchEcommerceStoresIdProductsIdImagesId(String storeId, String productId, String imageId, ECommerceProductImage2 body) throws RestClientException {
        return patchEcommerceStoresIdProductsIdImagesIdWithHttpInfo(storeId, productId, imageId, body).getBody();
    }

    /**
     * Update product image
     * Update a product image.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param imageId The id for the product image. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceProductImage1&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceProductImage1> patchEcommerceStoresIdProductsIdImagesIdWithHttpInfo(String storeId, String productId, String imageId, ECommerceProductImage2 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling patchEcommerceStoresIdProductsIdImagesId");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling patchEcommerceStoresIdProductsIdImagesId");
        }
        
        // verify the required parameter 'imageId' is set
        if (imageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageId' when calling patchEcommerceStoresIdProductsIdImagesId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchEcommerceStoresIdProductsIdImagesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("product_id", productId);
        uriVariables.put("image_id", imageId);

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

        ParameterizedTypeReference<ECommerceProductImage1> localReturnType = new ParameterizedTypeReference<ECommerceProductImage1>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/products/{product_id}/images/{image_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update product variant
     * Update a product variant.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param variantId The id for the product variant. (required)
     * @param body  (required)
     * @return ECommerceProductVariant1
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceProductVariant1 patchEcommerceStoresIdProductsIdVariantsId(String storeId, String productId, String variantId, ECommerceProductVariant2 body) throws RestClientException {
        return patchEcommerceStoresIdProductsIdVariantsIdWithHttpInfo(storeId, productId, variantId, body).getBody();
    }

    /**
     * Update product variant
     * Update a product variant.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param variantId The id for the product variant. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceProductVariant1&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceProductVariant1> patchEcommerceStoresIdProductsIdVariantsIdWithHttpInfo(String storeId, String productId, String variantId, ECommerceProductVariant2 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling patchEcommerceStoresIdProductsIdVariantsId");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling patchEcommerceStoresIdProductsIdVariantsId");
        }
        
        // verify the required parameter 'variantId' is set
        if (variantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variantId' when calling patchEcommerceStoresIdProductsIdVariantsId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchEcommerceStoresIdProductsIdVariantsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("product_id", productId);
        uriVariables.put("variant_id", variantId);

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

        ParameterizedTypeReference<ECommerceProductVariant1> localReturnType = new ParameterizedTypeReference<ECommerceProductVariant1>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update promo code
     * Update a promo code.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param promoRuleId The id for the promo rule of a store. (required)
     * @param promoCodeId The id for the promo code of a store. (required)
     * @param body  (required)
     * @return ECommercePromoCode
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommercePromoCode patchEcommerceStoresIdPromocodesId(String storeId, String promoRuleId, String promoCodeId, ECommercePromoCode2 body) throws RestClientException {
        return patchEcommerceStoresIdPromocodesIdWithHttpInfo(storeId, promoRuleId, promoCodeId, body).getBody();
    }

    /**
     * Update promo code
     * Update a promo code.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param promoRuleId The id for the promo rule of a store. (required)
     * @param promoCodeId The id for the promo code of a store. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommercePromoCode&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommercePromoCode> patchEcommerceStoresIdPromocodesIdWithHttpInfo(String storeId, String promoRuleId, String promoCodeId, ECommercePromoCode2 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling patchEcommerceStoresIdPromocodesId");
        }
        
        // verify the required parameter 'promoRuleId' is set
        if (promoRuleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'promoRuleId' when calling patchEcommerceStoresIdPromocodesId");
        }
        
        // verify the required parameter 'promoCodeId' is set
        if (promoCodeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'promoCodeId' when calling patchEcommerceStoresIdPromocodesId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchEcommerceStoresIdPromocodesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("promo_rule_id", promoRuleId);
        uriVariables.put("promo_code_id", promoCodeId);

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

        ParameterizedTypeReference<ECommercePromoCode> localReturnType = new ParameterizedTypeReference<ECommercePromoCode>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes/{promo_code_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update promo rule
     * Update a promo rule.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param promoRuleId The id for the promo rule of a store. (required)
     * @param body  (required)
     * @return ECommercePromoRule
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommercePromoRule patchEcommerceStoresIdPromorulesId(String storeId, String promoRuleId, ECommercePromoRule2 body) throws RestClientException {
        return patchEcommerceStoresIdPromorulesIdWithHttpInfo(storeId, promoRuleId, body).getBody();
    }

    /**
     * Update promo rule
     * Update a promo rule.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param promoRuleId The id for the promo rule of a store. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommercePromoRule&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommercePromoRule> patchEcommerceStoresIdPromorulesIdWithHttpInfo(String storeId, String promoRuleId, ECommercePromoRule2 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling patchEcommerceStoresIdPromorulesId");
        }
        
        // verify the required parameter 'promoRuleId' is set
        if (promoRuleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'promoRuleId' when calling patchEcommerceStoresIdPromorulesId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchEcommerceStoresIdPromorulesId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("promo_rule_id", promoRuleId);

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

        ParameterizedTypeReference<ECommercePromoRule> localReturnType = new ParameterizedTypeReference<ECommercePromoRule>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add store
     * Add a new store to your Mailchimp account.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param body  (required)
     * @return ECommerceStore
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceStore postEcommerceStores(ECommerceStore1 body) throws RestClientException {
        return postEcommerceStoresWithHttpInfo(body).getBody();
    }

    /**
     * Add store
     * Add a new store to your Mailchimp account.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceStore&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceStore> postEcommerceStoresWithHttpInfo(ECommerceStore1 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postEcommerceStores");
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

        ParameterizedTypeReference<ECommerceStore> localReturnType = new ParameterizedTypeReference<ECommerceStore>() {};
        return apiClient.invokeAPI("/ecommerce/stores", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add cart
     * Add a new cart to a store.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param body  (required)
     * @return ECommerceCart
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceCart postEcommerceStoresIdCarts(String storeId, ECommerceCart1 body) throws RestClientException {
        return postEcommerceStoresIdCartsWithHttpInfo(storeId, body).getBody();
    }

    /**
     * Add cart
     * Add a new cart to a store.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceCart&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceCart> postEcommerceStoresIdCartsWithHttpInfo(String storeId, ECommerceCart1 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling postEcommerceStoresIdCarts");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postEcommerceStoresIdCarts");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);

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

        ParameterizedTypeReference<ECommerceCart> localReturnType = new ParameterizedTypeReference<ECommerceCart>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/carts", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add cart line item
     * Add a new line item to an existing cart.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param cartId The id for the cart. (required)
     * @param body  (required)
     * @return ECommerceCartLineItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceCartLineItem postEcommerceStoresIdCartsIdLines(String storeId, String cartId, ECommerceCartLineItem1 body) throws RestClientException {
        return postEcommerceStoresIdCartsIdLinesWithHttpInfo(storeId, cartId, body).getBody();
    }

    /**
     * Add cart line item
     * Add a new line item to an existing cart.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param cartId The id for the cart. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceCartLineItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceCartLineItem> postEcommerceStoresIdCartsIdLinesWithHttpInfo(String storeId, String cartId, ECommerceCartLineItem1 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling postEcommerceStoresIdCartsIdLines");
        }
        
        // verify the required parameter 'cartId' is set
        if (cartId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cartId' when calling postEcommerceStoresIdCartsIdLines");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postEcommerceStoresIdCartsIdLines");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("cart_id", cartId);

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

        ParameterizedTypeReference<ECommerceCartLineItem> localReturnType = new ParameterizedTypeReference<ECommerceCartLineItem>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/carts/{cart_id}/lines", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add customer
     * Add a new customer to a store.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param body  (required)
     * @return ECommerceCustomer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceCustomer postEcommerceStoresIdCustomers(String storeId, ECommerceCustomer3 body) throws RestClientException {
        return postEcommerceStoresIdCustomersWithHttpInfo(storeId, body).getBody();
    }

    /**
     * Add customer
     * Add a new customer to a store.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceCustomer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceCustomer> postEcommerceStoresIdCustomersWithHttpInfo(String storeId, ECommerceCustomer3 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling postEcommerceStoresIdCustomers");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postEcommerceStoresIdCustomers");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);

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

        ParameterizedTypeReference<ECommerceCustomer> localReturnType = new ParameterizedTypeReference<ECommerceCustomer>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/customers", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add order
     * Add a new order to a store.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param body  (required)
     * @return ECommerceOrder
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceOrder postEcommerceStoresIdOrders(String storeId, ECommerceOrder1 body) throws RestClientException {
        return postEcommerceStoresIdOrdersWithHttpInfo(storeId, body).getBody();
    }

    /**
     * Add order
     * Add a new order to a store.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceOrder&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceOrder> postEcommerceStoresIdOrdersWithHttpInfo(String storeId, ECommerceOrder1 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling postEcommerceStoresIdOrders");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postEcommerceStoresIdOrders");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);

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

        ParameterizedTypeReference<ECommerceOrder> localReturnType = new ParameterizedTypeReference<ECommerceOrder>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/orders", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add order line item
     * Add a new line item to an existing order.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param orderId The id for the order in a store. (required)
     * @param body  (required)
     * @return ECommerceOrderLineItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceOrderLineItem postEcommerceStoresIdOrdersIdLines(String storeId, String orderId, ECommerceOrderLineItem1 body) throws RestClientException {
        return postEcommerceStoresIdOrdersIdLinesWithHttpInfo(storeId, orderId, body).getBody();
    }

    /**
     * Add order line item
     * Add a new line item to an existing order.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param orderId The id for the order in a store. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceOrderLineItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceOrderLineItem> postEcommerceStoresIdOrdersIdLinesWithHttpInfo(String storeId, String orderId, ECommerceOrderLineItem1 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling postEcommerceStoresIdOrdersIdLines");
        }
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling postEcommerceStoresIdOrdersIdLines");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postEcommerceStoresIdOrdersIdLines");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("order_id", orderId);

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

        ParameterizedTypeReference<ECommerceOrderLineItem> localReturnType = new ParameterizedTypeReference<ECommerceOrderLineItem>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/orders/{order_id}/lines", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add product
     * Add a new product to a store.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param body  (required)
     * @return ECommerceProduct2
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceProduct2 postEcommerceStoresIdProducts(String storeId, ECommerceProduct body) throws RestClientException {
        return postEcommerceStoresIdProductsWithHttpInfo(storeId, body).getBody();
    }

    /**
     * Add product
     * Add a new product to a store.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceProduct2&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceProduct2> postEcommerceStoresIdProductsWithHttpInfo(String storeId, ECommerceProduct body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling postEcommerceStoresIdProducts");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postEcommerceStoresIdProducts");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);

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

        ParameterizedTypeReference<ECommerceProduct2> localReturnType = new ParameterizedTypeReference<ECommerceProduct2>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/products", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add product image
     * Add a new image to the product.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param body  (required)
     * @return ECommerceProductImage1
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceProductImage1 postEcommerceStoresIdProductsIdImages(String storeId, String productId, ECommerceProductImage body) throws RestClientException {
        return postEcommerceStoresIdProductsIdImagesWithHttpInfo(storeId, productId, body).getBody();
    }

    /**
     * Add product image
     * Add a new image to the product.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceProductImage1&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceProductImage1> postEcommerceStoresIdProductsIdImagesWithHttpInfo(String storeId, String productId, ECommerceProductImage body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling postEcommerceStoresIdProductsIdImages");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling postEcommerceStoresIdProductsIdImages");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postEcommerceStoresIdProductsIdImages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("product_id", productId);

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

        ParameterizedTypeReference<ECommerceProductImage1> localReturnType = new ParameterizedTypeReference<ECommerceProductImage1>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/products/{product_id}/images", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add product variant
     * Add a new variant to the product.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param body  (required)
     * @return ECommerceProductVariant1
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceProductVariant1 postEcommerceStoresIdProductsIdVariants(String storeId, String productId, ECommerceProductVariant body) throws RestClientException {
        return postEcommerceStoresIdProductsIdVariantsWithHttpInfo(storeId, productId, body).getBody();
    }

    /**
     * Add product variant
     * Add a new variant to the product.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceProductVariant1&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceProductVariant1> postEcommerceStoresIdProductsIdVariantsWithHttpInfo(String storeId, String productId, ECommerceProductVariant body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling postEcommerceStoresIdProductsIdVariants");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling postEcommerceStoresIdProductsIdVariants");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postEcommerceStoresIdProductsIdVariants");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("product_id", productId);

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

        ParameterizedTypeReference<ECommerceProductVariant1> localReturnType = new ParameterizedTypeReference<ECommerceProductVariant1>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/products/{product_id}/variants", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add promo code
     * Add a new promo code to a store.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param promoRuleId The id for the promo rule of a store. (required)
     * @param body  (required)
     * @return ECommercePromoCode
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommercePromoCode postEcommerceStoresIdPromocodes(String storeId, String promoRuleId, ECommercePromoCode1 body) throws RestClientException {
        return postEcommerceStoresIdPromocodesWithHttpInfo(storeId, promoRuleId, body).getBody();
    }

    /**
     * Add promo code
     * Add a new promo code to a store.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param promoRuleId The id for the promo rule of a store. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommercePromoCode&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommercePromoCode> postEcommerceStoresIdPromocodesWithHttpInfo(String storeId, String promoRuleId, ECommercePromoCode1 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling postEcommerceStoresIdPromocodes");
        }
        
        // verify the required parameter 'promoRuleId' is set
        if (promoRuleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'promoRuleId' when calling postEcommerceStoresIdPromocodes");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postEcommerceStoresIdPromocodes");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("promo_rule_id", promoRuleId);

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

        ParameterizedTypeReference<ECommercePromoCode> localReturnType = new ParameterizedTypeReference<ECommercePromoCode>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add promo rule
     * Add a new promo rule to a store.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param body  (required)
     * @return ECommercePromoRule
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommercePromoRule postEcommerceStoresIdPromorules(String storeId, ECommercePromoRule1 body) throws RestClientException {
        return postEcommerceStoresIdPromorulesWithHttpInfo(storeId, body).getBody();
    }

    /**
     * Add promo rule
     * Add a new promo rule to a store.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommercePromoRule&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommercePromoRule> postEcommerceStoresIdPromorulesWithHttpInfo(String storeId, ECommercePromoRule1 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling postEcommerceStoresIdPromorules");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postEcommerceStoresIdPromorules");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);

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

        ParameterizedTypeReference<ECommercePromoRule> localReturnType = new ParameterizedTypeReference<ECommercePromoRule>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/promo-rules", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add or update customer
     * Add or update a customer.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param customerId The id for the customer of a store. (required)
     * @param body  (required)
     * @return ECommerceCustomer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceCustomer putEcommerceStoresIdCustomersId(String storeId, String customerId, ECommerceCustomer4 body) throws RestClientException {
        return putEcommerceStoresIdCustomersIdWithHttpInfo(storeId, customerId, body).getBody();
    }

    /**
     * Add or update customer
     * Add or update a customer.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param customerId The id for the customer of a store. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceCustomer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceCustomer> putEcommerceStoresIdCustomersIdWithHttpInfo(String storeId, String customerId, ECommerceCustomer4 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling putEcommerceStoresIdCustomersId");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling putEcommerceStoresIdCustomersId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling putEcommerceStoresIdCustomersId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("customer_id", customerId);

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

        ParameterizedTypeReference<ECommerceCustomer> localReturnType = new ParameterizedTypeReference<ECommerceCustomer>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/customers/{customer_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add or update order
     * Add or update an order.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param orderId The id for the order in a store. (required)
     * @param body  (required)
     * @return ECommerceOrder
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceOrder putEcommerceStoresIdOrdersId(String storeId, String orderId, ECommerceOrder2 body) throws RestClientException {
        return putEcommerceStoresIdOrdersIdWithHttpInfo(storeId, orderId, body).getBody();
    }

    /**
     * Add or update order
     * Add or update an order.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param orderId The id for the order in a store. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceOrder&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceOrder> putEcommerceStoresIdOrdersIdWithHttpInfo(String storeId, String orderId, ECommerceOrder2 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling putEcommerceStoresIdOrdersId");
        }
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling putEcommerceStoresIdOrdersId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling putEcommerceStoresIdOrdersId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("order_id", orderId);

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

        ParameterizedTypeReference<ECommerceOrder> localReturnType = new ParameterizedTypeReference<ECommerceOrder>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/orders/{order_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create or update product
     * Update a specific product.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param body  (required)
     * @return ECommerceProduct2
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceProduct2 putEcommerceStoresIdProductsId(String storeId, String productId, ECommerceProduct1 body) throws RestClientException {
        return putEcommerceStoresIdProductsIdWithHttpInfo(storeId, productId, body).getBody();
    }

    /**
     * Create or update product
     * Update a specific product.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceProduct2&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceProduct2> putEcommerceStoresIdProductsIdWithHttpInfo(String storeId, String productId, ECommerceProduct1 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling putEcommerceStoresIdProductsId");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling putEcommerceStoresIdProductsId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling putEcommerceStoresIdProductsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("product_id", productId);

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

        ParameterizedTypeReference<ECommerceProduct2> localReturnType = new ParameterizedTypeReference<ECommerceProduct2>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/products/{product_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add or update product variant
     * Add or update a product variant.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param variantId The id for the product variant. (required)
     * @param body  (required)
     * @return ECommerceProductVariant1
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ECommerceProductVariant1 putEcommerceStoresIdProductsIdVariantsId(String storeId, String productId, String variantId, ECommerceProductVariant body) throws RestClientException {
        return putEcommerceStoresIdProductsIdVariantsIdWithHttpInfo(storeId, productId, variantId, body).getBody();
    }

    /**
     * Add or update product variant
     * Add or update a product variant.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param storeId The store id. (required)
     * @param productId The id for the product of a store. (required)
     * @param variantId The id for the product variant. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;ECommerceProductVariant1&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ECommerceProductVariant1> putEcommerceStoresIdProductsIdVariantsIdWithHttpInfo(String storeId, String productId, String variantId, ECommerceProductVariant body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storeId' when calling putEcommerceStoresIdProductsIdVariantsId");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling putEcommerceStoresIdProductsIdVariantsId");
        }
        
        // verify the required parameter 'variantId' is set
        if (variantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variantId' when calling putEcommerceStoresIdProductsIdVariantsId");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling putEcommerceStoresIdProductsIdVariantsId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("store_id", storeId);
        uriVariables.put("product_id", productId);
        uriVariables.put("variant_id", variantId);

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

        ParameterizedTypeReference<ECommerceProductVariant1> localReturnType = new ParameterizedTypeReference<ECommerceProductVariant1>() {};
        return apiClient.invokeAPI("/ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    @Override
    public <T> ResponseEntity<T> invokeAPI(String url, HttpMethod method, Object request, ParameterizedTypeReference<T> returnType) throws RestClientException {
        String localVarPath = url.replace(apiClient.getBasePath(), "");
        Object localVarPostBody = request;

        final Map<String, Object> uriVariables = new HashMap<String, Object>();
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

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
