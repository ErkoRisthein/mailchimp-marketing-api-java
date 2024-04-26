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
 * The [average campaign statistics](https://mailchimp.com/resources/research/email-marketing-benchmarks/?utm_source&#x3D;mc-api&amp;utm_medium&#x3D;docs&amp;utm_campaign&#x3D;apidocs) for all campaigns in the account&#39;s specified industry.
 */
@JsonPropertyOrder({
  IndustryStats.JSON_PROPERTY_OPEN_RATE,
  IndustryStats.JSON_PROPERTY_BOUNCE_RATE,
  IndustryStats.JSON_PROPERTY_CLICK_RATE
})
@JsonTypeName("Industry_Stats")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class IndustryStats {
  public static final String JSON_PROPERTY_OPEN_RATE = "open_rate";
  private BigDecimal openRate;

  public static final String JSON_PROPERTY_BOUNCE_RATE = "bounce_rate";
  private BigDecimal bounceRate;

  public static final String JSON_PROPERTY_CLICK_RATE = "click_rate";
  private BigDecimal clickRate;

  public IndustryStats() {
  }

  @JsonCreator
  public IndustryStats(
    @JsonProperty(JSON_PROPERTY_OPEN_RATE) BigDecimal openRate, 
    @JsonProperty(JSON_PROPERTY_BOUNCE_RATE) BigDecimal bounceRate, 
    @JsonProperty(JSON_PROPERTY_CLICK_RATE) BigDecimal clickRate
  ) {
    this();
    this.openRate = openRate;
    this.bounceRate = bounceRate;
    this.clickRate = clickRate;
  }

   /**
   * The average unique open rate for all campaigns in the account&#39;s specified industry.
   * @return openRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPEN_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOpenRate() {
    return openRate;
  }




   /**
   * The average bounce rate for all campaigns in the account&#39;s specified industry.
   * @return bounceRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOUNCE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBounceRate() {
    return bounceRate;
  }




   /**
   * The average unique click rate for all campaigns in the account&#39;s specified industry.
   * @return clickRate
  **/
  @jakarta.annotation.Nullable
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
    IndustryStats industryStats = (IndustryStats) o;
    return Objects.equals(this.openRate, industryStats.openRate) &&
        Objects.equals(this.bounceRate, industryStats.bounceRate) &&
        Objects.equals(this.clickRate, industryStats.clickRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openRate, bounceRate, clickRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndustryStats {\n");
    sb.append("    openRate: ").append(toIndentedString(openRate)).append("\n");
    sb.append("    bounceRate: ").append(toIndentedString(bounceRate)).append("\n");
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

