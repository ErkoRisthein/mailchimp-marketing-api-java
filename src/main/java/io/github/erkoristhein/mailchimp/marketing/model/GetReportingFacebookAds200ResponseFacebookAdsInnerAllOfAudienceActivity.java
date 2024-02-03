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
import io.github.erkoristhein.mailchimp.marketing.model.GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivityClicksInner;
import io.github.erkoristhein.mailchimp.marketing.model.GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivityImpressionsInner;
import io.github.erkoristhein.mailchimp.marketing.model.GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivityRevenueInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity
 */
@JsonPropertyOrder({
  GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity.JSON_PROPERTY_CLICKS,
  GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity.JSON_PROPERTY_IMPRESSIONS,
  GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity.JSON_PROPERTY_REVENUE
})
@JsonTypeName("getReportingFacebookAds_200_response_facebook_ads_inner_allOf_audience_activity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity {
  public static final String JSON_PROPERTY_CLICKS = "clicks";
  private List<GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivityClicksInner> clicks;

  public static final String JSON_PROPERTY_IMPRESSIONS = "impressions";
  private List<GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivityImpressionsInner> impressions;

  public static final String JSON_PROPERTY_REVENUE = "revenue";
  private List<GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivityRevenueInner> revenue;

  public GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity() {
  }

  public GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity clicks(List<GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivityClicksInner> clicks) {
    
    this.clicks = clicks;
    return this;
  }

  public GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity addClicksItem(GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivityClicksInner clicksItem) {
    if (this.clicks == null) {
      this.clicks = new ArrayList<>();
    }
    this.clicks.add(clicksItem);
    return this;
  }

   /**
   * Get clicks
   * @return clicks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivityClicksInner> getClicks() {
    return clicks;
  }


  @JsonProperty(JSON_PROPERTY_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClicks(List<GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivityClicksInner> clicks) {
    this.clicks = clicks;
  }


  public GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity impressions(List<GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivityImpressionsInner> impressions) {
    
    this.impressions = impressions;
    return this;
  }

  public GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity addImpressionsItem(GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivityImpressionsInner impressionsItem) {
    if (this.impressions == null) {
      this.impressions = new ArrayList<>();
    }
    this.impressions.add(impressionsItem);
    return this;
  }

   /**
   * Get impressions
   * @return impressions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPRESSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivityImpressionsInner> getImpressions() {
    return impressions;
  }


  @JsonProperty(JSON_PROPERTY_IMPRESSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpressions(List<GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivityImpressionsInner> impressions) {
    this.impressions = impressions;
  }


  public GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity revenue(List<GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivityRevenueInner> revenue) {
    
    this.revenue = revenue;
    return this;
  }

  public GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity addRevenueItem(GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivityRevenueInner revenueItem) {
    if (this.revenue == null) {
      this.revenue = new ArrayList<>();
    }
    this.revenue.add(revenueItem);
    return this;
  }

   /**
   * Get revenue
   * @return revenue
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivityRevenueInner> getRevenue() {
    return revenue;
  }


  @JsonProperty(JSON_PROPERTY_REVENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevenue(List<GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivityRevenueInner> revenue) {
    this.revenue = revenue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity getReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity = (GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity) o;
    return Objects.equals(this.clicks, getReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity.clicks) &&
        Objects.equals(this.impressions, getReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity.impressions) &&
        Objects.equals(this.revenue, getReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity.revenue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clicks, impressions, revenue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity {\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    impressions: ").append(toIndentedString(impressions)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
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

