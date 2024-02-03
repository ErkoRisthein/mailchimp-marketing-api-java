package io.github.erkoristhein.mailchimp.marketing.api;

import io.github.erkoristhein.mailchimp.marketing.ApiClient;

import io.github.erkoristhein.mailchimp.marketing.model.ProblemDetailDocument;
import io.github.erkoristhein.mailchimp.marketing.model.VerifiedDomains;
import io.github.erkoristhein.mailchimp.marketing.model.VerifiedDomains1;
import io.github.erkoristhein.mailchimp.marketing.model.VerifiedDomains2;
import io.github.erkoristhein.mailchimp.marketing.model.VerifyADomainForSending;

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
public class VerifiedDomainsApi {
    private ApiClient apiClient;

    public VerifiedDomainsApi() {
        this(new ApiClient());
    }

    public VerifiedDomainsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add domain to account
     * Add a domain to the account.
     * <p><b>200</b> - The newly-created domain.
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param body  (required)
     * @return VerifiedDomains
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VerifiedDomains createVerifiedDomain(VerifiedDomains2 body) throws RestClientException {
        return createVerifiedDomainWithHttpInfo(body).getBody();
    }

    /**
     * Add domain to account
     * Add a domain to the account.
     * <p><b>200</b> - The newly-created domain.
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param body  (required)
     * @return ResponseEntity&lt;VerifiedDomains&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VerifiedDomains> createVerifiedDomainWithHttpInfo(VerifiedDomains2 body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createVerifiedDomain");
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

        ParameterizedTypeReference<VerifiedDomains> localReturnType = new ParameterizedTypeReference<VerifiedDomains>() {};
        return apiClient.invokeAPI("/verified-domains", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete domain
     * Delete a verified domain from the account.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param domainName The domain name. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteVerifiedDomain(String domainName) throws RestClientException {
        deleteVerifiedDomainWithHttpInfo(domainName);
    }

    /**
     * Delete domain
     * Delete a verified domain from the account.
     * <p><b>204</b> - Empty Response
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param domainName The domain name. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteVerifiedDomainWithHttpInfo(String domainName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'domainName' is set
        if (domainName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'domainName' when calling deleteVerifiedDomain");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("domain_name", domainName);

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
        return apiClient.invokeAPI("/verified-domains/{domain_name}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get domain info
     * Get the details for a single domain on the account.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param domainName The domain name. (required)
     * @return VerifiedDomains
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VerifiedDomains getVerifiedDomain(String domainName) throws RestClientException {
        return getVerifiedDomainWithHttpInfo(domainName).getBody();
    }

    /**
     * Get domain info
     * Get the details for a single domain on the account.
     * <p><b>200</b> - 
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param domainName The domain name. (required)
     * @return ResponseEntity&lt;VerifiedDomains&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VerifiedDomains> getVerifiedDomainWithHttpInfo(String domainName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'domainName' is set
        if (domainName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'domainName' when calling getVerifiedDomain");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("domain_name", domainName);

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

        ParameterizedTypeReference<VerifiedDomains> localReturnType = new ParameterizedTypeReference<VerifiedDomains>() {};
        return apiClient.invokeAPI("/verified-domains/{domain_name}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List sending domains
     * Get all of the sending domains on the account.
     * <p><b>200</b> - The domains on the account.
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @return VerifiedDomains1
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VerifiedDomains1 getVerifiedDomains() throws RestClientException {
        return getVerifiedDomainsWithHttpInfo().getBody();
    }

    /**
     * List sending domains
     * Get all of the sending domains on the account.
     * <p><b>200</b> - The domains on the account.
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @return ResponseEntity&lt;VerifiedDomains1&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VerifiedDomains1> getVerifiedDomainsWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<VerifiedDomains1> localReturnType = new ParameterizedTypeReference<VerifiedDomains1>() {};
        return apiClient.invokeAPI("/verified-domains", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Verify domain
     * Verify a domain for sending.
     * <p><b>200</b> - The domain being verified for sending.
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param domainName The domain name. (required)
     * @param body  (required)
     * @return VerifiedDomains
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VerifiedDomains verifyDomain(String domainName, VerifyADomainForSending body) throws RestClientException {
        return verifyDomainWithHttpInfo(domainName, body).getBody();
    }

    /**
     * Verify domain
     * Verify a domain for sending.
     * <p><b>200</b> - The domain being verified for sending.
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param domainName The domain name. (required)
     * @param body  (required)
     * @return ResponseEntity&lt;VerifiedDomains&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VerifiedDomains> verifyDomainWithHttpInfo(String domainName, VerifyADomainForSending body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'domainName' is set
        if (domainName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'domainName' when calling verifyDomain");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling verifyDomain");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("domain_name", domainName);

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

        ParameterizedTypeReference<VerifiedDomains> localReturnType = new ParameterizedTypeReference<VerifiedDomains>() {};
        return apiClient.invokeAPI("/verified-domains/{domain_name}/actions/verify", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}