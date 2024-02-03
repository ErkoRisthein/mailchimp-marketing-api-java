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
import io.github.erkoristhein.mailchimp.marketing.model.SendingSchedule1;
import java.net.URI;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * [RSS](https://mailchimp.com/help/share-your-blog-posts-with-mailchimp/) options for a campaign.
 */
@JsonPropertyOrder({
  RSSOptions3.JSON_PROPERTY_FEED_URL,
  RSSOptions3.JSON_PROPERTY_FREQUENCY,
  RSSOptions3.JSON_PROPERTY_SCHEDULE,
  RSSOptions3.JSON_PROPERTY_LAST_SENT,
  RSSOptions3.JSON_PROPERTY_CONSTRAIN_RSS_IMG
})
@JsonTypeName("RSS_Options_3")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class RSSOptions3 {
  public static final String JSON_PROPERTY_FEED_URL = "feed_url";
  private URI feedUrl;

  /**
   * The frequency of the RSS Campaign.
   */
  public enum FrequencyEnum {
    DAILY("daily"),
    
    WEEKLY("weekly"),
    
    MONTHLY("monthly");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private FrequencyEnum frequency;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private SendingSchedule1 schedule;

  public static final String JSON_PROPERTY_LAST_SENT = "last_sent";
  private OffsetDateTime lastSent;

  public static final String JSON_PROPERTY_CONSTRAIN_RSS_IMG = "constrain_rss_img";
  private Boolean constrainRssImg;

  public RSSOptions3() {
  }

  @JsonCreator
  public RSSOptions3(
    @JsonProperty(JSON_PROPERTY_LAST_SENT) OffsetDateTime lastSent
  ) {
    this();
    this.lastSent = lastSent;
  }

  public RSSOptions3 feedUrl(URI feedUrl) {
    
    this.feedUrl = feedUrl;
    return this;
  }

   /**
   * The URL for the RSS feed.
   * @return feedUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FEED_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getFeedUrl() {
    return feedUrl;
  }


  @JsonProperty(JSON_PROPERTY_FEED_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFeedUrl(URI feedUrl) {
    this.feedUrl = feedUrl;
  }


  public RSSOptions3 frequency(FrequencyEnum frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * The frequency of the RSS Campaign.
   * @return frequency
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FrequencyEnum getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  public RSSOptions3 schedule(SendingSchedule1 schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SendingSchedule1 getSchedule() {
    return schedule;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedule(SendingSchedule1 schedule) {
    this.schedule = schedule;
  }


   /**
   * The date the campaign was last sent.
   * @return lastSent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastSent() {
    return lastSent;
  }




  public RSSOptions3 constrainRssImg(Boolean constrainRssImg) {
    
    this.constrainRssImg = constrainRssImg;
    return this;
  }

   /**
   * Whether to add CSS to images in the RSS feed to constrain their width in campaigns.
   * @return constrainRssImg
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSTRAIN_RSS_IMG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getConstrainRssImg() {
    return constrainRssImg;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAIN_RSS_IMG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstrainRssImg(Boolean constrainRssImg) {
    this.constrainRssImg = constrainRssImg;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RSSOptions3 rsSOptions3 = (RSSOptions3) o;
    return Objects.equals(this.feedUrl, rsSOptions3.feedUrl) &&
        Objects.equals(this.frequency, rsSOptions3.frequency) &&
        Objects.equals(this.schedule, rsSOptions3.schedule) &&
        Objects.equals(this.lastSent, rsSOptions3.lastSent) &&
        Objects.equals(this.constrainRssImg, rsSOptions3.constrainRssImg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedUrl, frequency, schedule, lastSent, constrainRssImg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RSSOptions3 {\n");
    sb.append("    feedUrl: ").append(toIndentedString(feedUrl)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    lastSent: ").append(toIndentedString(lastSent)).append("\n");
    sb.append("    constrainRssImg: ").append(toIndentedString(constrainRssImg)).append("\n");
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

