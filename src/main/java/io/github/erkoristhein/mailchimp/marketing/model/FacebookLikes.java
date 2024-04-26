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
 * An object describing campaign engagement on Facebook.
 */
@JsonPropertyOrder({
  FacebookLikes.JSON_PROPERTY_RECIPIENT_LIKES,
  FacebookLikes.JSON_PROPERTY_UNIQUE_LIKES,
  FacebookLikes.JSON_PROPERTY_FACEBOOK_LIKES
})
@JsonTypeName("Facebook_Likes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class FacebookLikes {
  public static final String JSON_PROPERTY_RECIPIENT_LIKES = "recipient_likes";
  private Integer recipientLikes;

  public static final String JSON_PROPERTY_UNIQUE_LIKES = "unique_likes";
  private Integer uniqueLikes;

  public static final String JSON_PROPERTY_FACEBOOK_LIKES = "facebook_likes";
  private Integer facebookLikes;

  public FacebookLikes() {
  }

  public FacebookLikes recipientLikes(Integer recipientLikes) {
    
    this.recipientLikes = recipientLikes;
    return this;
  }

   /**
   * The number of recipients who liked the campaign on Facebook.
   * @return recipientLikes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENT_LIKES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRecipientLikes() {
    return recipientLikes;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENT_LIKES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipientLikes(Integer recipientLikes) {
    this.recipientLikes = recipientLikes;
  }


  public FacebookLikes uniqueLikes(Integer uniqueLikes) {
    
    this.uniqueLikes = uniqueLikes;
    return this;
  }

   /**
   * The number of unique likes.
   * @return uniqueLikes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIQUE_LIKES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUniqueLikes() {
    return uniqueLikes;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_LIKES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniqueLikes(Integer uniqueLikes) {
    this.uniqueLikes = uniqueLikes;
  }


  public FacebookLikes facebookLikes(Integer facebookLikes) {
    
    this.facebookLikes = facebookLikes;
    return this;
  }

   /**
   * The number of Facebook likes for the campaign.
   * @return facebookLikes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FACEBOOK_LIKES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFacebookLikes() {
    return facebookLikes;
  }


  @JsonProperty(JSON_PROPERTY_FACEBOOK_LIKES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFacebookLikes(Integer facebookLikes) {
    this.facebookLikes = facebookLikes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacebookLikes facebookLikes = (FacebookLikes) o;
    return Objects.equals(this.recipientLikes, facebookLikes.recipientLikes) &&
        Objects.equals(this.uniqueLikes, facebookLikes.uniqueLikes) &&
        Objects.equals(this.facebookLikes, facebookLikes.facebookLikes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientLikes, uniqueLikes, facebookLikes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacebookLikes {\n");
    sb.append("    recipientLikes: ").append(toIndentedString(recipientLikes)).append("\n");
    sb.append("    uniqueLikes: ").append(toIndentedString(uniqueLikes)).append("\n");
    sb.append("    facebookLikes: ").append(toIndentedString(facebookLikes)).append("\n");
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

