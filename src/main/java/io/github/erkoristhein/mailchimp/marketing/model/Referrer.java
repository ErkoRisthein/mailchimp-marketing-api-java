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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A single instance of a campaign referral.
 */
@JsonPropertyOrder({
  Referrer.JSON_PROPERTY_REFERRER,
  Referrer.JSON_PROPERTY_CLICKS,
  Referrer.JSON_PROPERTY_FIRST_CLICK,
  Referrer.JSON_PROPERTY_LAST_CLICK
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class Referrer {
  public static final String JSON_PROPERTY_REFERRER = "referrer";
  private String referrer;

  public static final String JSON_PROPERTY_CLICKS = "clicks";
  private Integer clicks;

  public static final String JSON_PROPERTY_FIRST_CLICK = "first_click";
  private OffsetDateTime firstClick;

  public static final String JSON_PROPERTY_LAST_CLICK = "last_click";
  private OffsetDateTime lastClick;

  public Referrer() {
  }

  public Referrer referrer(String referrer) {
    
    this.referrer = referrer;
    return this;
  }

   /**
   * A referrer (truncated to 100 bytes).
   * @return referrer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERRER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferrer() {
    return referrer;
  }


  @JsonProperty(JSON_PROPERTY_REFERRER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferrer(String referrer) {
    this.referrer = referrer;
  }


  public Referrer clicks(Integer clicks) {
    
    this.clicks = clicks;
    return this;
  }

   /**
   * The number of clicks a single referrer generated.
   * @return clicks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getClicks() {
    return clicks;
  }


  @JsonProperty(JSON_PROPERTY_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClicks(Integer clicks) {
    this.clicks = clicks;
  }


  public Referrer firstClick(OffsetDateTime firstClick) {
    
    this.firstClick = firstClick;
    return this;
  }

   /**
   * The timestamp for the first click from this referrer.
   * @return firstClick
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFirstClick() {
    return firstClick;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstClick(OffsetDateTime firstClick) {
    this.firstClick = firstClick;
  }


  public Referrer lastClick(OffsetDateTime lastClick) {
    
    this.lastClick = lastClick;
    return this;
  }

   /**
   * The timestamp for the last click from this referrer.
   * @return lastClick
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastClick() {
    return lastClick;
  }


  @JsonProperty(JSON_PROPERTY_LAST_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastClick(OffsetDateTime lastClick) {
    this.lastClick = lastClick;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Referrer referrer = (Referrer) o;
    return Objects.equals(this.referrer, referrer.referrer) &&
        Objects.equals(this.clicks, referrer.clicks) &&
        Objects.equals(this.firstClick, referrer.firstClick) &&
        Objects.equals(this.lastClick, referrer.lastClick);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referrer, clicks, firstClick, lastClick);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Referrer {\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    firstClick: ").append(toIndentedString(firstClick)).append("\n");
    sb.append("    lastClick: ").append(toIndentedString(lastClick)).append("\n");
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

