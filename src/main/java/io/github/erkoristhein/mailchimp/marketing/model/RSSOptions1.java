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
import io.github.erkoristhein.mailchimp.marketing.model.SendingSchedule;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * [RSS](https://mailchimp.com/help/share-your-blog-posts-with-mailchimp/) options, specific to an RSS campaign.
 */
@JsonPropertyOrder({
  RSSOptions1.JSON_PROPERTY_FEED_URL,
  RSSOptions1.JSON_PROPERTY_FREQUENCY,
  RSSOptions1.JSON_PROPERTY_SCHEDULE,
  RSSOptions1.JSON_PROPERTY_CONSTRAIN_RSS_IMG
})
@JsonTypeName("RSS_Options_1")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class RSSOptions1 {
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
  private SendingSchedule schedule;

  public static final String JSON_PROPERTY_CONSTRAIN_RSS_IMG = "constrain_rss_img";
  private Boolean constrainRssImg;

  public RSSOptions1() {
  }

  public RSSOptions1 feedUrl(URI feedUrl) {
    
    this.feedUrl = feedUrl;
    return this;
  }

   /**
   * The URL for the RSS feed.
   * @return feedUrl
  **/
  @jakarta.annotation.Nonnull
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


  public RSSOptions1 frequency(FrequencyEnum frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * The frequency of the RSS Campaign.
   * @return frequency
  **/
  @jakarta.annotation.Nonnull
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


  public RSSOptions1 schedule(SendingSchedule schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SendingSchedule getSchedule() {
    return schedule;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedule(SendingSchedule schedule) {
    this.schedule = schedule;
  }


  public RSSOptions1 constrainRssImg(Boolean constrainRssImg) {
    
    this.constrainRssImg = constrainRssImg;
    return this;
  }

   /**
   * Whether to add CSS to images in the RSS feed to constrain their width in campaigns.
   * @return constrainRssImg
  **/
  @jakarta.annotation.Nullable
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
    RSSOptions1 rsSOptions1 = (RSSOptions1) o;
    return Objects.equals(this.feedUrl, rsSOptions1.feedUrl) &&
        Objects.equals(this.frequency, rsSOptions1.frequency) &&
        Objects.equals(this.schedule, rsSOptions1.schedule) &&
        Objects.equals(this.constrainRssImg, rsSOptions1.constrainRssImg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedUrl, frequency, schedule, constrainRssImg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RSSOptions1 {\n");
    sb.append("    feedUrl: ").append(toIndentedString(feedUrl)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

