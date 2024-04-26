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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An object describing the open activity for the campaign.
 */
@JsonPropertyOrder({
  Opens.JSON_PROPERTY_OPENS_TOTAL,
  Opens.JSON_PROPERTY_UNIQUE_OPENS,
  Opens.JSON_PROPERTY_OPEN_RATE,
  Opens.JSON_PROPERTY_LAST_OPEN
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class Opens {
  public static final String JSON_PROPERTY_OPENS_TOTAL = "opens_total";
  private Integer opensTotal;

  public static final String JSON_PROPERTY_UNIQUE_OPENS = "unique_opens";
  private Integer uniqueOpens;

  public static final String JSON_PROPERTY_OPEN_RATE = "open_rate";
  private BigDecimal openRate;

  public static final String JSON_PROPERTY_LAST_OPEN = "last_open";
  private OffsetDateTime lastOpen;

  public Opens() {
  }

  public Opens opensTotal(Integer opensTotal) {
    
    this.opensTotal = opensTotal;
    return this;
  }

   /**
   * The total number of opens for a campaign.
   * @return opensTotal
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENS_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOpensTotal() {
    return opensTotal;
  }


  @JsonProperty(JSON_PROPERTY_OPENS_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpensTotal(Integer opensTotal) {
    this.opensTotal = opensTotal;
  }


  public Opens uniqueOpens(Integer uniqueOpens) {
    
    this.uniqueOpens = uniqueOpens;
    return this;
  }

   /**
   * The total number of unique opens.
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


  public Opens openRate(BigDecimal openRate) {
    
    this.openRate = openRate;
    return this;
  }

   /**
   * The number of unique opens divided by the total number of successful deliveries.
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


  public Opens lastOpen(OffsetDateTime lastOpen) {
    
    this.lastOpen = lastOpen;
    return this;
  }

   /**
   * The date and time of the last recorded open in ISO 8601 format.
   * @return lastOpen
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_OPEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastOpen() {
    return lastOpen;
  }


  @JsonProperty(JSON_PROPERTY_LAST_OPEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastOpen(OffsetDateTime lastOpen) {
    this.lastOpen = lastOpen;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Opens opens = (Opens) o;
    return Objects.equals(this.opensTotal, opens.opensTotal) &&
        Objects.equals(this.uniqueOpens, opens.uniqueOpens) &&
        Objects.equals(this.openRate, opens.openRate) &&
        Objects.equals(this.lastOpen, opens.lastOpen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opensTotal, uniqueOpens, openRate, lastOpen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Opens {\n");
    sb.append("    opensTotal: ").append(toIndentedString(opensTotal)).append("\n");
    sb.append("    uniqueOpens: ").append(toIndentedString(uniqueOpens)).append("\n");
    sb.append("    openRate: ").append(toIndentedString(openRate)).append("\n");
    sb.append("    lastOpen: ").append(toIndentedString(lastOpen)).append("\n");
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

