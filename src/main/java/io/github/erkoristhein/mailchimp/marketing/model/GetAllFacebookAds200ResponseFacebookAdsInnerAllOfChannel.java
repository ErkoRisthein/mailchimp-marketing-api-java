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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Channel settings
 */
@JsonPropertyOrder({
  GetAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel.JSON_PROPERTY_FB_PLACEMENT_FEED,
  GetAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel.JSON_PROPERTY_FB_PLACEMENT_AUDIENCE,
  GetAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel.JSON_PROPERTY_IG_PLACEMENT_FEED
})
@JsonTypeName("getAllFacebookAds_200_response_facebook_ads_inner_allOf_channel")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class GetAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel {
  public static final String JSON_PROPERTY_FB_PLACEMENT_FEED = "fb_placement_feed";
  private Boolean fbPlacementFeed;

  public static final String JSON_PROPERTY_FB_PLACEMENT_AUDIENCE = "fb_placement_audience";
  private Boolean fbPlacementAudience;

  public static final String JSON_PROPERTY_IG_PLACEMENT_FEED = "ig_placement_feed";
  private Boolean igPlacementFeed;

  public GetAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel() {
  }

  public GetAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel fbPlacementFeed(Boolean fbPlacementFeed) {
    
    this.fbPlacementFeed = fbPlacementFeed;
    return this;
  }

   /**
   * Is this for facebook feed
   * @return fbPlacementFeed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FB_PLACEMENT_FEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFbPlacementFeed() {
    return fbPlacementFeed;
  }


  @JsonProperty(JSON_PROPERTY_FB_PLACEMENT_FEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFbPlacementFeed(Boolean fbPlacementFeed) {
    this.fbPlacementFeed = fbPlacementFeed;
  }


  public GetAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel fbPlacementAudience(Boolean fbPlacementAudience) {
    
    this.fbPlacementAudience = fbPlacementAudience;
    return this;
  }

   /**
   * Is this for facebook audience
   * @return fbPlacementAudience
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FB_PLACEMENT_AUDIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFbPlacementAudience() {
    return fbPlacementAudience;
  }


  @JsonProperty(JSON_PROPERTY_FB_PLACEMENT_AUDIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFbPlacementAudience(Boolean fbPlacementAudience) {
    this.fbPlacementAudience = fbPlacementAudience;
  }


  public GetAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel igPlacementFeed(Boolean igPlacementFeed) {
    
    this.igPlacementFeed = igPlacementFeed;
    return this;
  }

   /**
   * Is this for instagram feed
   * @return igPlacementFeed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IG_PLACEMENT_FEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIgPlacementFeed() {
    return igPlacementFeed;
  }


  @JsonProperty(JSON_PROPERTY_IG_PLACEMENT_FEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIgPlacementFeed(Boolean igPlacementFeed) {
    this.igPlacementFeed = igPlacementFeed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel getAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel = (GetAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel) o;
    return Objects.equals(this.fbPlacementFeed, getAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel.fbPlacementFeed) &&
        Objects.equals(this.fbPlacementAudience, getAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel.fbPlacementAudience) &&
        Objects.equals(this.igPlacementFeed, getAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel.igPlacementFeed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fbPlacementFeed, fbPlacementAudience, igPlacementFeed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel {\n");
    sb.append("    fbPlacementFeed: ").append(toIndentedString(fbPlacementFeed)).append("\n");
    sb.append("    fbPlacementAudience: ").append(toIndentedString(fbPlacementAudience)).append("\n");
    sb.append("    igPlacementFeed: ").append(toIndentedString(igPlacementFeed)).append("\n");
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

