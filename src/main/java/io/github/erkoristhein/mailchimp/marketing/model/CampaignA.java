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
 * Stats for Campaign A.
 */
@JsonPropertyOrder({
  CampaignA.JSON_PROPERTY_BOUNCES,
  CampaignA.JSON_PROPERTY_ABUSE_REPORTS,
  CampaignA.JSON_PROPERTY_UNSUBS,
  CampaignA.JSON_PROPERTY_RECIPIENT_CLICKS,
  CampaignA.JSON_PROPERTY_FORWARDS,
  CampaignA.JSON_PROPERTY_FORWARDS_OPENS,
  CampaignA.JSON_PROPERTY_OPENS,
  CampaignA.JSON_PROPERTY_LAST_OPEN,
  CampaignA.JSON_PROPERTY_UNIQUE_OPENS
})
@JsonTypeName("Campaign_A")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class CampaignA {
  public static final String JSON_PROPERTY_BOUNCES = "bounces";
  private Integer bounces;

  public static final String JSON_PROPERTY_ABUSE_REPORTS = "abuse_reports";
  private Integer abuseReports;

  public static final String JSON_PROPERTY_UNSUBS = "unsubs";
  private Integer unsubs;

  public static final String JSON_PROPERTY_RECIPIENT_CLICKS = "recipient_clicks";
  private Integer recipientClicks;

  public static final String JSON_PROPERTY_FORWARDS = "forwards";
  private Integer forwards;

  public static final String JSON_PROPERTY_FORWARDS_OPENS = "forwards_opens";
  private Integer forwardsOpens;

  public static final String JSON_PROPERTY_OPENS = "opens";
  private Integer opens;

  public static final String JSON_PROPERTY_LAST_OPEN = "last_open";
  private String lastOpen;

  public static final String JSON_PROPERTY_UNIQUE_OPENS = "unique_opens";
  private Integer uniqueOpens;

  public CampaignA() {
  }

  public CampaignA bounces(Integer bounces) {
    
    this.bounces = bounces;
    return this;
  }

   /**
   * Bounces for Campaign A.
   * @return bounces
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOUNCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBounces() {
    return bounces;
  }


  @JsonProperty(JSON_PROPERTY_BOUNCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBounces(Integer bounces) {
    this.bounces = bounces;
  }


  public CampaignA abuseReports(Integer abuseReports) {
    
    this.abuseReports = abuseReports;
    return this;
  }

   /**
   * Abuse reports for Campaign A.
   * @return abuseReports
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ABUSE_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAbuseReports() {
    return abuseReports;
  }


  @JsonProperty(JSON_PROPERTY_ABUSE_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbuseReports(Integer abuseReports) {
    this.abuseReports = abuseReports;
  }


  public CampaignA unsubs(Integer unsubs) {
    
    this.unsubs = unsubs;
    return this;
  }

   /**
   * Unsubscribes for Campaign A.
   * @return unsubs
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNSUBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUnsubs() {
    return unsubs;
  }


  @JsonProperty(JSON_PROPERTY_UNSUBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnsubs(Integer unsubs) {
    this.unsubs = unsubs;
  }


  public CampaignA recipientClicks(Integer recipientClicks) {
    
    this.recipientClicks = recipientClicks;
    return this;
  }

   /**
   * Recipient Clicks for Campaign A.
   * @return recipientClicks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENT_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRecipientClicks() {
    return recipientClicks;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENT_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipientClicks(Integer recipientClicks) {
    this.recipientClicks = recipientClicks;
  }


  public CampaignA forwards(Integer forwards) {
    
    this.forwards = forwards;
    return this;
  }

   /**
   * Forwards for Campaign A.
   * @return forwards
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORWARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getForwards() {
    return forwards;
  }


  @JsonProperty(JSON_PROPERTY_FORWARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForwards(Integer forwards) {
    this.forwards = forwards;
  }


  public CampaignA forwardsOpens(Integer forwardsOpens) {
    
    this.forwardsOpens = forwardsOpens;
    return this;
  }

   /**
   * Opens from forwards for Campaign A.
   * @return forwardsOpens
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORWARDS_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getForwardsOpens() {
    return forwardsOpens;
  }


  @JsonProperty(JSON_PROPERTY_FORWARDS_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForwardsOpens(Integer forwardsOpens) {
    this.forwardsOpens = forwardsOpens;
  }


  public CampaignA opens(Integer opens) {
    
    this.opens = opens;
    return this;
  }

   /**
   * Opens for Campaign A.
   * @return opens
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOpens() {
    return opens;
  }


  @JsonProperty(JSON_PROPERTY_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpens(Integer opens) {
    this.opens = opens;
  }


  public CampaignA lastOpen(String lastOpen) {
    
    this.lastOpen = lastOpen;
    return this;
  }

   /**
   * The last open for Campaign A.
   * @return lastOpen
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_OPEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastOpen() {
    return lastOpen;
  }


  @JsonProperty(JSON_PROPERTY_LAST_OPEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastOpen(String lastOpen) {
    this.lastOpen = lastOpen;
  }


  public CampaignA uniqueOpens(Integer uniqueOpens) {
    
    this.uniqueOpens = uniqueOpens;
    return this;
  }

   /**
   * Unique opens for Campaign A.
   * @return uniqueOpens
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIQUE_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUniqueOpens() {
    return uniqueOpens;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniqueOpens(Integer uniqueOpens) {
    this.uniqueOpens = uniqueOpens;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignA campaignA = (CampaignA) o;
    return Objects.equals(this.bounces, campaignA.bounces) &&
        Objects.equals(this.abuseReports, campaignA.abuseReports) &&
        Objects.equals(this.unsubs, campaignA.unsubs) &&
        Objects.equals(this.recipientClicks, campaignA.recipientClicks) &&
        Objects.equals(this.forwards, campaignA.forwards) &&
        Objects.equals(this.forwardsOpens, campaignA.forwardsOpens) &&
        Objects.equals(this.opens, campaignA.opens) &&
        Objects.equals(this.lastOpen, campaignA.lastOpen) &&
        Objects.equals(this.uniqueOpens, campaignA.uniqueOpens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bounces, abuseReports, unsubs, recipientClicks, forwards, forwardsOpens, opens, lastOpen, uniqueOpens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignA {\n");
    sb.append("    bounces: ").append(toIndentedString(bounces)).append("\n");
    sb.append("    abuseReports: ").append(toIndentedString(abuseReports)).append("\n");
    sb.append("    unsubs: ").append(toIndentedString(unsubs)).append("\n");
    sb.append("    recipientClicks: ").append(toIndentedString(recipientClicks)).append("\n");
    sb.append("    forwards: ").append(toIndentedString(forwards)).append("\n");
    sb.append("    forwardsOpens: ").append(toIndentedString(forwardsOpens)).append("\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    lastOpen: ").append(toIndentedString(lastOpen)).append("\n");
    sb.append("    uniqueOpens: ").append(toIndentedString(uniqueOpens)).append("\n");
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

