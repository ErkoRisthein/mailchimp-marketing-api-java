package io.github.erkoristhein.mailchimp.marketing.api;

import io.github.erkoristhein.mailchimp.marketing.ApiClient;

import io.github.erkoristhein.mailchimp.marketing.model.AccountExportsInner;
import io.github.erkoristhein.mailchimp.marketing.model.CreateAnAccountExport;
import io.github.erkoristhein.mailchimp.marketing.model.GetAccountExports200Response;
import io.github.erkoristhein.mailchimp.marketing.model.ProblemDetailDocument;

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
public class AccountExportsApi {
    private ApiClient apiClient;

    public AccountExportsApi() {
        this(new ApiClient());
    }

    public AccountExportsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List account exports
     * Get a list of account exports for a given account.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return GetAccountExports200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetAccountExports200Response getAccountExports(List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
        return getAccountExportsWithHttpInfo(fields, excludeFields, count, offset).getBody();
    }

    /**
     * List account exports
     * Get a list of account exports for a given account.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return ResponseEntity&lt;GetAccountExports200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetAccountExports200Response> getAccountExportsWithHttpInfo(List<String> fields, List<String> excludeFields, Integer count, Integer offset) throws RestClientException {
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

        ParameterizedTypeReference<GetAccountExports200Response> localReturnType = new ParameterizedTypeReference<GetAccountExports200Response>() {};
        return apiClient.invokeAPI("/account-exports", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add export
     * Create a new account export in your Mailchimp account.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param body  (required)
     * @return AccountExportsInner
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountExportsInner postAccountExport(CreateAnAccountExport body) throws RestClientException {
        return postAccountExportWithHttpInfo(body).getBody();
    }

    /**
     * Add export
     * Create a new account export in your Mailchimp account.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param body  (required)
     * @return ResponseEntity&lt;AccountExportsInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountExportsInner> postAccountExportWithHttpInfo(CreateAnAccountExport body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postAccountExport");
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

        ParameterizedTypeReference<AccountExportsInner> localReturnType = new ParameterizedTypeReference<AccountExportsInner>() {};
        return apiClient.invokeAPI("/account-exports", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}