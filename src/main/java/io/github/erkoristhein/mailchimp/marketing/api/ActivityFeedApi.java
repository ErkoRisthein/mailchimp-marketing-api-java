package io.github.erkoristhein.mailchimp.marketing.api;

import io.github.erkoristhein.mailchimp.marketing.ApiClient;
import io.github.erkoristhein.mailchimp.marketing.BaseApi;

import io.github.erkoristhein.mailchimp.marketing.model.GetActivityFeedChimpChatter200Response;
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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class ActivityFeedApi extends BaseApi {

    public ActivityFeedApi() {
        super(new ApiClient());
    }

    public ActivityFeedApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Get latest chimp chatter
     * Return the Chimp Chatter for this account ordered by most recent.
     * <p><b>200</b> - ChimpChatter Collection
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return GetActivityFeedChimpChatter200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetActivityFeedChimpChatter200Response getActivityFeedChimpChatter(Integer count, Integer offset) throws RestClientException {
        return getActivityFeedChimpChatterWithHttpInfo(count, offset).getBody();
    }

    /**
     * Get latest chimp chatter
     * Return the Chimp Chatter for this account ordered by most recent.
     * <p><b>200</b> - ChimpChatter Collection
     * <p><b>0</b> - An error generated by the Mailchimp API.
     * @param count The number of records to return. Default value is 10. Maximum value is 1000 (optional, default to 10)
     * @param offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. (optional, default to 0)
     * @return ResponseEntity&lt;GetActivityFeedChimpChatter200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetActivityFeedChimpChatter200Response> getActivityFeedChimpChatterWithHttpInfo(Integer count, Integer offset) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        

        final String[] localVarAccepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<GetActivityFeedChimpChatter200Response> localReturnType = new ParameterizedTypeReference<GetActivityFeedChimpChatter200Response>() {};
        return apiClient.invokeAPI("/activity-feed/chimp-chatter", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
