/*
 * Mailchimp Marketing API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0.81
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
 * The events that can trigger the webhook and whether they are enabled.
 */
@JsonPropertyOrder({
  Events2.JSON_PROPERTY_SUBSCRIBE,
  Events2.JSON_PROPERTY_UNSUBSCRIBE,
  Events2.JSON_PROPERTY_PROFILE,
  Events2.JSON_PROPERTY_CLEANED,
  Events2.JSON_PROPERTY_UPEMAIL,
  Events2.JSON_PROPERTY_CAMPAIGN
})
@JsonTypeName("Events_2")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class Events2 {
  public static final String JSON_PROPERTY_SUBSCRIBE = "subscribe";
  private Boolean subscribe;

  public static final String JSON_PROPERTY_UNSUBSCRIBE = "unsubscribe";
  private Boolean unsubscribe;

  public static final String JSON_PROPERTY_PROFILE = "profile";
  private Boolean profile;

  public static final String JSON_PROPERTY_CLEANED = "cleaned";
  private Boolean cleaned;

  public static final String JSON_PROPERTY_UPEMAIL = "upemail";
  private Boolean upemail;

  public static final String JSON_PROPERTY_CAMPAIGN = "campaign";
  private Boolean campaign;

  public Events2() {
  }

  public Events2 subscribe(Boolean subscribe) {
    
    this.subscribe = subscribe;
    return this;
  }

   /**
   * Whether the webhook is triggered when a list subscriber is added.
   * @return subscribe
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIBE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSubscribe() {
    return subscribe;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIBE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscribe(Boolean subscribe) {
    this.subscribe = subscribe;
  }


  public Events2 unsubscribe(Boolean unsubscribe) {
    
    this.unsubscribe = unsubscribe;
    return this;
  }

   /**
   * Whether the webhook is triggered when a list member unsubscribes.
   * @return unsubscribe
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNSUBSCRIBE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUnsubscribe() {
    return unsubscribe;
  }


  @JsonProperty(JSON_PROPERTY_UNSUBSCRIBE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnsubscribe(Boolean unsubscribe) {
    this.unsubscribe = unsubscribe;
  }


  public Events2 profile(Boolean profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * Whether the webhook is triggered when a subscriber&#39;s profile is updated.
   * @return profile
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getProfile() {
    return profile;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfile(Boolean profile) {
    this.profile = profile;
  }


  public Events2 cleaned(Boolean cleaned) {
    
    this.cleaned = cleaned;
    return this;
  }

   /**
   * Whether the webhook is triggered when a subscriber&#39;s email address is cleaned from the list.
   * @return cleaned
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLEANED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCleaned() {
    return cleaned;
  }


  @JsonProperty(JSON_PROPERTY_CLEANED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCleaned(Boolean cleaned) {
    this.cleaned = cleaned;
  }


  public Events2 upemail(Boolean upemail) {
    
    this.upemail = upemail;
    return this;
  }

   /**
   * Whether the webhook is triggered when a subscriber&#39;s email address is changed.
   * @return upemail
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPEMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUpemail() {
    return upemail;
  }


  @JsonProperty(JSON_PROPERTY_UPEMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpemail(Boolean upemail) {
    this.upemail = upemail;
  }


  public Events2 campaign(Boolean campaign) {
    
    this.campaign = campaign;
    return this;
  }

   /**
   * Whether the webhook is triggered when a campaign is sent or cancelled.
   * @return campaign
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCampaign() {
    return campaign;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaign(Boolean campaign) {
    this.campaign = campaign;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Events2 events2 = (Events2) o;
    return Objects.equals(this.subscribe, events2.subscribe) &&
        Objects.equals(this.unsubscribe, events2.unsubscribe) &&
        Objects.equals(this.profile, events2.profile) &&
        Objects.equals(this.cleaned, events2.cleaned) &&
        Objects.equals(this.upemail, events2.upemail) &&
        Objects.equals(this.campaign, events2.campaign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscribe, unsubscribe, profile, cleaned, upemail, campaign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Events2 {\n");
    sb.append("    subscribe: ").append(toIndentedString(subscribe)).append("\n");
    sb.append("    unsubscribe: ").append(toIndentedString(unsubscribe)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    cleaned: ").append(toIndentedString(cleaned)).append("\n");
    sb.append("    upemail: ").append(toIndentedString(upemail)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
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

