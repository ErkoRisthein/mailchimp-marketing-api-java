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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryAverageOrderAmount
 */
@JsonPropertyOrder({
  GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryAverageOrderAmount.JSON_PROPERTY_AMOUNT,
  GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryAverageOrderAmount.JSON_PROPERTY_CURRENCY_CODE
})
@JsonTypeName("getReportingFacebookAds_200_response_facebook_ads_inner_allOf_report_summary_average_order_amount")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryAverageOrderAmount {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private BigDecimal amount;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currency_code";
  private String currencyCode;

  public GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryAverageOrderAmount() {
  }

  public GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryAverageOrderAmount amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryAverageOrderAmount currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @jakarta.annotation.Nullable
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryAverageOrderAmount getReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryAverageOrderAmount = (GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryAverageOrderAmount) o;
    return Objects.equals(this.amount, getReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryAverageOrderAmount.amount) &&
        Objects.equals(this.currencyCode, getReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryAverageOrderAmount.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummaryAverageOrderAmount {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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

