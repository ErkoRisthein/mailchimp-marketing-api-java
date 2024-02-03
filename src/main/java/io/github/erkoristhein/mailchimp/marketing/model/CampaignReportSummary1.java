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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * For sent campaigns, a summary of opens and clicks.
 */
@JsonPropertyOrder({
  CampaignReportSummary1.JSON_PROPERTY_OPENS,
  CampaignReportSummary1.JSON_PROPERTY_UNIQUE_OPENS,
  CampaignReportSummary1.JSON_PROPERTY_OPEN_RATE,
  CampaignReportSummary1.JSON_PROPERTY_CLICKS,
  CampaignReportSummary1.JSON_PROPERTY_SUBSCRIBER_CLICKS,
  CampaignReportSummary1.JSON_PROPERTY_CLICK_RATE
})
@JsonTypeName("Campaign_Report_Summary_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class CampaignReportSummary1 {
  public static final String JSON_PROPERTY_OPENS = "opens";
  private Integer opens;

  public static final String JSON_PROPERTY_UNIQUE_OPENS = "unique_opens";
  private Integer uniqueOpens;

  public static final String JSON_PROPERTY_OPEN_RATE = "open_rate";
  private BigDecimal openRate;

  public static final String JSON_PROPERTY_CLICKS = "clicks";
  private Integer clicks;

  public static final String JSON_PROPERTY_SUBSCRIBER_CLICKS = "subscriber_clicks";
  private Integer subscriberClicks;

  public static final String JSON_PROPERTY_CLICK_RATE = "click_rate";
  private BigDecimal clickRate;

  public CampaignReportSummary1() {
  }

  @JsonCreator
  public CampaignReportSummary1(
    @JsonProperty(JSON_PROPERTY_OPENS) Integer opens, 
    @JsonProperty(JSON_PROPERTY_UNIQUE_OPENS) Integer uniqueOpens, 
    @JsonProperty(JSON_PROPERTY_OPEN_RATE) BigDecimal openRate, 
    @JsonProperty(JSON_PROPERTY_CLICKS) Integer clicks, 
    @JsonProperty(JSON_PROPERTY_SUBSCRIBER_CLICKS) Integer subscriberClicks, 
    @JsonProperty(JSON_PROPERTY_CLICK_RATE) BigDecimal clickRate
  ) {
    this();
    this.opens = opens;
    this.uniqueOpens = uniqueOpens;
    this.openRate = openRate;
    this.clicks = clicks;
    this.subscriberClicks = subscriberClicks;
    this.clickRate = clickRate;
  }

   /**
   * The total number of opens for a campaign.
   * @return opens
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOpens() {
    return opens;
  }




   /**
   * The number of unique opens.
   * @return uniqueOpens
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIQUE_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUniqueOpens() {
    return uniqueOpens;
  }




   /**
   * The number of unique opens divided by the total number of successful deliveries.
   * @return openRate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPEN_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOpenRate() {
    return openRate;
  }




   /**
   * The total number of clicks for an campaign.
   * @return clicks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getClicks() {
    return clicks;
  }




   /**
   * The number of unique clicks.
   * @return subscriberClicks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIBER_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSubscriberClicks() {
    return subscriberClicks;
  }




   /**
   * The number of unique clicks divided by the total number of successful deliveries.
   * @return clickRate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLICK_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getClickRate() {
    return clickRate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignReportSummary1 campaignReportSummary1 = (CampaignReportSummary1) o;
    return Objects.equals(this.opens, campaignReportSummary1.opens) &&
        Objects.equals(this.uniqueOpens, campaignReportSummary1.uniqueOpens) &&
        Objects.equals(this.openRate, campaignReportSummary1.openRate) &&
        Objects.equals(this.clicks, campaignReportSummary1.clicks) &&
        Objects.equals(this.subscriberClicks, campaignReportSummary1.subscriberClicks) &&
        Objects.equals(this.clickRate, campaignReportSummary1.clickRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opens, uniqueOpens, openRate, clicks, subscriberClicks, clickRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignReportSummary1 {\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    uniqueOpens: ").append(toIndentedString(uniqueOpens)).append("\n");
    sb.append("    openRate: ").append(toIndentedString(openRate)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    subscriberClicks: ").append(toIndentedString(subscriberClicks)).append("\n");
    sb.append("    clickRate: ").append(toIndentedString(clickRate)).append("\n");
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

