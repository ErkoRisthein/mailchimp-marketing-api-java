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
 * GetAllFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryEcommerce
 */
@JsonPropertyOrder({
  GetAllFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryEcommerce.JSON_PROPERTY_TOTAL_REVENUE,
  GetAllFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryEcommerce.JSON_PROPERTY_CURRENCY_CODE,
  GetAllFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryEcommerce.JSON_PROPERTY_AVERAGE_ORDER_REVENUE
})
@JsonTypeName("getAllFacebookAds_200_response_facebook_ads_inner_allOf_report_summary_ecommerce")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class GetAllFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryEcommerce {
  public static final String JSON_PROPERTY_TOTAL_REVENUE = "total_revenue";
  private BigDecimal totalRevenue;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currency_code";
  private String currencyCode;

  public static final String JSON_PROPERTY_AVERAGE_ORDER_REVENUE = "average_order_revenue";
  private BigDecimal averageOrderRevenue;

  public GetAllFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryEcommerce() {
  }

  public GetAllFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryEcommerce totalRevenue(BigDecimal totalRevenue) {
    
    this.totalRevenue = totalRevenue;
    return this;
  }

   /**
   * Get totalRevenue
   * @return totalRevenue
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_REVENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalRevenue() {
    return totalRevenue;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_REVENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalRevenue(BigDecimal totalRevenue) {
    this.totalRevenue = totalRevenue;
  }


  public GetAllFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryEcommerce currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyCode() {
    return currencyCode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public GetAllFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryEcommerce averageOrderRevenue(BigDecimal averageOrderRevenue) {
    
    this.averageOrderRevenue = averageOrderRevenue;
    return this;
  }

   /**
   * Get averageOrderRevenue
   * @return averageOrderRevenue
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_ORDER_REVENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAverageOrderRevenue() {
    return averageOrderRevenue;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_ORDER_REVENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageOrderRevenue(BigDecimal averageOrderRevenue) {
    this.averageOrderRevenue = averageOrderRevenue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryEcommerce getAllFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryEcommerce = (GetAllFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryEcommerce) o;
    return Objects.equals(this.totalRevenue, getAllFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryEcommerce.totalRevenue) &&
        Objects.equals(this.currencyCode, getAllFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryEcommerce.currencyCode) &&
        Objects.equals(this.averageOrderRevenue, getAllFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryEcommerce.averageOrderRevenue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRevenue, currencyCode, averageOrderRevenue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryEcommerce {\n");
    sb.append("    totalRevenue: ").append(toIndentedString(totalRevenue)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    averageOrderRevenue: ").append(toIndentedString(averageOrderRevenue)).append("\n");
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
