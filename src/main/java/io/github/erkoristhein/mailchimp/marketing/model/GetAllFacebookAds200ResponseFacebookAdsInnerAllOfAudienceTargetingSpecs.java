/*
 * Mailchimp Marketing API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0.55
 * Contact: apihelp@mailchimp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.erkoristhein.mailchimp.marketing.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.erkoristhein.mailchimp.marketing.model.GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecsInterestsInner;
import io.github.erkoristhein.mailchimp.marketing.model.GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecsLocations;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs
 */
@JsonPropertyOrder({
  GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs.JSON_PROPERTY_GENDER,
  GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs.JSON_PROPERTY_MIN_AGE,
  GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs.JSON_PROPERTY_MAX_AGE,
  GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs.JSON_PROPERTY_LOCATIONS,
  GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs.JSON_PROPERTY_INTERESTS
})
@JsonTypeName("getAllFacebookAds_200_response_facebook_ads_inner_allOf_audience_targeting_specs")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs {
  public static final String JSON_PROPERTY_GENDER = "gender";
  private Integer gender;

  public static final String JSON_PROPERTY_MIN_AGE = "min_age";
  private Integer minAge;

  public static final String JSON_PROPERTY_MAX_AGE = "max_age";
  private Integer maxAge;

  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecsLocations locations;

  public static final String JSON_PROPERTY_INTERESTS = "interests";
  private List<GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecsInterestsInner> interests = new ArrayList<>();

  public GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs() {
  }

  public GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs gender(Integer gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGender() {
    return gender;
  }


  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGender(Integer gender) {
    this.gender = gender;
  }


  public GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs minAge(Integer minAge) {
    
    this.minAge = minAge;
    return this;
  }

   /**
   * Get minAge
   * @return minAge
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinAge() {
    return minAge;
  }


  @JsonProperty(JSON_PROPERTY_MIN_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinAge(Integer minAge) {
    this.minAge = minAge;
  }


  public GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs maxAge(Integer maxAge) {
    
    this.maxAge = maxAge;
    return this;
  }

   /**
   * Get maxAge
   * @return maxAge
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxAge() {
    return maxAge;
  }


  @JsonProperty(JSON_PROPERTY_MAX_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxAge(Integer maxAge) {
    this.maxAge = maxAge;
  }


  public GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs locations(GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecsLocations locations) {
    
    this.locations = locations;
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecsLocations getLocations() {
    return locations;
  }


  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocations(GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecsLocations locations) {
    this.locations = locations;
  }


  public GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs interests(List<GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecsInterestsInner> interests) {
    
    this.interests = interests;
    return this;
  }

  public GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs addInterestsItem(GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecsInterestsInner interestsItem) {
    if (this.interests == null) {
      this.interests = new ArrayList<>();
    }
    this.interests.add(interestsItem);
    return this;
  }

   /**
   * Get interests
   * @return interests
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecsInterestsInner> getInterests() {
    return interests;
  }


  @JsonProperty(JSON_PROPERTY_INTERESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterests(List<GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecsInterestsInner> interests) {
    this.interests = interests;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs getAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs = (GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs) o;
    return Objects.equals(this.gender, getAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs.gender) &&
        Objects.equals(this.minAge, getAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs.minAge) &&
        Objects.equals(this.maxAge, getAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs.maxAge) &&
        Objects.equals(this.locations, getAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs.locations) &&
        Objects.equals(this.interests, getAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs.interests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender, minAge, maxAge, locations, interests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudienceTargetingSpecs {\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    minAge: ").append(toIndentedString(minAge)).append("\n");
    sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    interests: ").append(toIndentedString(interests)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

