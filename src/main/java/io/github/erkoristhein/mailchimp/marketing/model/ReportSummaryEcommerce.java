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
 * ReportSummaryEcommerce
 */
@JsonPropertyOrder({
  ReportSummaryEcommerce.JSON_PROPERTY_TOTAL_REVENUE,
  ReportSummaryEcommerce.JSON_PROPERTY_CURRENCY_CODE,
  ReportSummaryEcommerce.JSON_PROPERTY_AVERAGE_ORDER_REVENUE
})
@JsonTypeName("Report_Summary_ecommerce")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class ReportSummaryEcommerce {
  public static final String JSON_PROPERTY_TOTAL_REVENUE = "total_revenue";
  private BigDecimal totalRevenue;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currency_code";
  private String currencyCode;

  public static final String JSON_PROPERTY_AVERAGE_ORDER_REVENUE = "average_order_revenue";
  private BigDecimal averageOrderRevenue;

  public ReportSummaryEcommerce() {
  }

  public ReportSummaryEcommerce totalRevenue(BigDecimal totalRevenue) {
    
    this.totalRevenue = totalRevenue;
    return this;
  }

   /**
   * Get totalRevenue
   * @return totalRevenue
  **/
  @jakarta.annotation.Nullable
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


  public ReportSummaryEcommerce currencyCode(String currencyCode) {
    
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


  public ReportSummaryEcommerce averageOrderRevenue(BigDecimal averageOrderRevenue) {
    
    this.averageOrderRevenue = averageOrderRevenue;
    return this;
  }

   /**
   * Get averageOrderRevenue
   * @return averageOrderRevenue
  **/
  @jakarta.annotation.Nullable
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
    ReportSummaryEcommerce reportSummaryEcommerce = (ReportSummaryEcommerce) o;
    return Objects.equals(this.totalRevenue, reportSummaryEcommerce.totalRevenue) &&
        Objects.equals(this.currencyCode, reportSummaryEcommerce.currencyCode) &&
        Objects.equals(this.averageOrderRevenue, reportSummaryEcommerce.averageOrderRevenue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRevenue, currencyCode, averageOrderRevenue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportSummaryEcommerce {\n");
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
