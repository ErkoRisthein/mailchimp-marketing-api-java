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
 * The average campaign statistics for your industry.
 */
@JsonPropertyOrder({
  IndustryStats1.JSON_PROPERTY_TYPE,
  IndustryStats1.JSON_PROPERTY_OPEN_RATE,
  IndustryStats1.JSON_PROPERTY_CLICK_RATE,
  IndustryStats1.JSON_PROPERTY_BOUNCE_RATE,
  IndustryStats1.JSON_PROPERTY_UNOPEN_RATE,
  IndustryStats1.JSON_PROPERTY_UNSUB_RATE,
  IndustryStats1.JSON_PROPERTY_ABUSE_RATE
})
@JsonTypeName("Industry_Stats_1")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class IndustryStats1 {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_OPEN_RATE = "open_rate";
  private BigDecimal openRate;

  public static final String JSON_PROPERTY_CLICK_RATE = "click_rate";
  private BigDecimal clickRate;

  public static final String JSON_PROPERTY_BOUNCE_RATE = "bounce_rate";
  private BigDecimal bounceRate;

  public static final String JSON_PROPERTY_UNOPEN_RATE = "unopen_rate";
  private BigDecimal unopenRate;

  public static final String JSON_PROPERTY_UNSUB_RATE = "unsub_rate";
  private BigDecimal unsubRate;

  public static final String JSON_PROPERTY_ABUSE_RATE = "abuse_rate";
  private BigDecimal abuseRate;

  public IndustryStats1() {
  }

  public IndustryStats1 type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of business industry associated with your account. For example: retail, education, etc.
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public IndustryStats1 openRate(BigDecimal openRate) {
    
    this.openRate = openRate;
    return this;
  }

   /**
   * The industry open rate.
   * @return openRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPEN_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOpenRate() {
    return openRate;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenRate(BigDecimal openRate) {
    this.openRate = openRate;
  }


  public IndustryStats1 clickRate(BigDecimal clickRate) {
    
    this.clickRate = clickRate;
    return this;
  }

   /**
   * The industry click rate.
   * @return clickRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLICK_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getClickRate() {
    return clickRate;
  }


  @JsonProperty(JSON_PROPERTY_CLICK_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClickRate(BigDecimal clickRate) {
    this.clickRate = clickRate;
  }


  public IndustryStats1 bounceRate(BigDecimal bounceRate) {
    
    this.bounceRate = bounceRate;
    return this;
  }

   /**
   * The industry bounce rate.
   * @return bounceRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOUNCE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBounceRate() {
    return bounceRate;
  }


  @JsonProperty(JSON_PROPERTY_BOUNCE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBounceRate(BigDecimal bounceRate) {
    this.bounceRate = bounceRate;
  }


  public IndustryStats1 unopenRate(BigDecimal unopenRate) {
    
    this.unopenRate = unopenRate;
    return this;
  }

   /**
   * The industry unopened rate.
   * @return unopenRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNOPEN_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUnopenRate() {
    return unopenRate;
  }


  @JsonProperty(JSON_PROPERTY_UNOPEN_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnopenRate(BigDecimal unopenRate) {
    this.unopenRate = unopenRate;
  }


  public IndustryStats1 unsubRate(BigDecimal unsubRate) {
    
    this.unsubRate = unsubRate;
    return this;
  }

   /**
   * The industry unsubscribe rate.
   * @return unsubRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNSUB_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUnsubRate() {
    return unsubRate;
  }


  @JsonProperty(JSON_PROPERTY_UNSUB_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnsubRate(BigDecimal unsubRate) {
    this.unsubRate = unsubRate;
  }


  public IndustryStats1 abuseRate(BigDecimal abuseRate) {
    
    this.abuseRate = abuseRate;
    return this;
  }

   /**
   * The industry abuse rate.
   * @return abuseRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ABUSE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAbuseRate() {
    return abuseRate;
  }


  @JsonProperty(JSON_PROPERTY_ABUSE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbuseRate(BigDecimal abuseRate) {
    this.abuseRate = abuseRate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndustryStats1 industryStats1 = (IndustryStats1) o;
    return Objects.equals(this.type, industryStats1.type) &&
        Objects.equals(this.openRate, industryStats1.openRate) &&
        Objects.equals(this.clickRate, industryStats1.clickRate) &&
        Objects.equals(this.bounceRate, industryStats1.bounceRate) &&
        Objects.equals(this.unopenRate, industryStats1.unopenRate) &&
        Objects.equals(this.unsubRate, industryStats1.unsubRate) &&
        Objects.equals(this.abuseRate, industryStats1.abuseRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, openRate, clickRate, bounceRate, unopenRate, unsubRate, abuseRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndustryStats1 {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    openRate: ").append(toIndentedString(openRate)).append("\n");
    sb.append("    clickRate: ").append(toIndentedString(clickRate)).append("\n");
    sb.append("    bounceRate: ").append(toIndentedString(bounceRate)).append("\n");
    sb.append("    unopenRate: ").append(toIndentedString(unopenRate)).append("\n");
    sb.append("    unsubRate: ").append(toIndentedString(unsubRate)).append("\n");
    sb.append("    abuseRate: ").append(toIndentedString(abuseRate)).append("\n");
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

