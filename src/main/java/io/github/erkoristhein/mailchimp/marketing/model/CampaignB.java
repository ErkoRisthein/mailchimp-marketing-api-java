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
 * Stats for Campaign B.
 */
@JsonPropertyOrder({
  CampaignB.JSON_PROPERTY_BOUNCES,
  CampaignB.JSON_PROPERTY_ABUSE_REPORTS,
  CampaignB.JSON_PROPERTY_UNSUBS,
  CampaignB.JSON_PROPERTY_RECIPIENT_CLICKS,
  CampaignB.JSON_PROPERTY_FORWARDS,
  CampaignB.JSON_PROPERTY_FORWARDS_OPENS,
  CampaignB.JSON_PROPERTY_OPENS,
  CampaignB.JSON_PROPERTY_LAST_OPEN,
  CampaignB.JSON_PROPERTY_UNIQUE_OPENS
})
@JsonTypeName("Campaign_B")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class CampaignB {
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

  public CampaignB() {
  }

  public CampaignB bounces(Integer bounces) {
    
    this.bounces = bounces;
    return this;
  }

   /**
   * Bounces for Campaign B.
   * @return bounces
  **/
  @javax.annotation.Nullable
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


  public CampaignB abuseReports(Integer abuseReports) {
    
    this.abuseReports = abuseReports;
    return this;
  }

   /**
   * Abuse reports for Campaign B.
   * @return abuseReports
  **/
  @javax.annotation.Nullable
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


  public CampaignB unsubs(Integer unsubs) {
    
    this.unsubs = unsubs;
    return this;
  }

   /**
   * Unsubscribes for Campaign B.
   * @return unsubs
  **/
  @javax.annotation.Nullable
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


  public CampaignB recipientClicks(Integer recipientClicks) {
    
    this.recipientClicks = recipientClicks;
    return this;
  }

   /**
   * Recipients clicks for Campaign B.
   * @return recipientClicks
  **/
  @javax.annotation.Nullable
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


  public CampaignB forwards(Integer forwards) {
    
    this.forwards = forwards;
    return this;
  }

   /**
   * Forwards for Campaign B.
   * @return forwards
  **/
  @javax.annotation.Nullable
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


  public CampaignB forwardsOpens(Integer forwardsOpens) {
    
    this.forwardsOpens = forwardsOpens;
    return this;
  }

   /**
   * Opens for forwards from Campaign B.
   * @return forwardsOpens
  **/
  @javax.annotation.Nullable
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


  public CampaignB opens(Integer opens) {
    
    this.opens = opens;
    return this;
  }

   /**
   * Opens for Campaign B.
   * @return opens
  **/
  @javax.annotation.Nullable
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


  public CampaignB lastOpen(String lastOpen) {
    
    this.lastOpen = lastOpen;
    return this;
  }

   /**
   * The last open for Campaign B.
   * @return lastOpen
  **/
  @javax.annotation.Nullable
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


  public CampaignB uniqueOpens(Integer uniqueOpens) {
    
    this.uniqueOpens = uniqueOpens;
    return this;
  }

   /**
   * Unique opens for Campaign B.
   * @return uniqueOpens
  **/
  @javax.annotation.Nullable
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
    CampaignB campaignB = (CampaignB) o;
    return Objects.equals(this.bounces, campaignB.bounces) &&
        Objects.equals(this.abuseReports, campaignB.abuseReports) &&
        Objects.equals(this.unsubs, campaignB.unsubs) &&
        Objects.equals(this.recipientClicks, campaignB.recipientClicks) &&
        Objects.equals(this.forwards, campaignB.forwards) &&
        Objects.equals(this.forwardsOpens, campaignB.forwardsOpens) &&
        Objects.equals(this.opens, campaignB.opens) &&
        Objects.equals(this.lastOpen, campaignB.lastOpen) &&
        Objects.equals(this.uniqueOpens, campaignB.uniqueOpens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bounces, abuseReports, unsubs, recipientClicks, forwards, forwardsOpens, opens, lastOpen, uniqueOpens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignB {\n");
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
