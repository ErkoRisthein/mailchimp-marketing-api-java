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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Stats for the list. Many of these are cached for at least five minutes.
 */
@JsonPropertyOrder({
  Statistics.JSON_PROPERTY_MEMBER_COUNT,
  Statistics.JSON_PROPERTY_TOTAL_CONTACTS,
  Statistics.JSON_PROPERTY_UNSUBSCRIBE_COUNT,
  Statistics.JSON_PROPERTY_CLEANED_COUNT,
  Statistics.JSON_PROPERTY_MEMBER_COUNT_SINCE_SEND,
  Statistics.JSON_PROPERTY_UNSUBSCRIBE_COUNT_SINCE_SEND,
  Statistics.JSON_PROPERTY_CLEANED_COUNT_SINCE_SEND,
  Statistics.JSON_PROPERTY_CAMPAIGN_COUNT,
  Statistics.JSON_PROPERTY_CAMPAIGN_LAST_SENT,
  Statistics.JSON_PROPERTY_MERGE_FIELD_COUNT,
  Statistics.JSON_PROPERTY_AVG_SUB_RATE,
  Statistics.JSON_PROPERTY_AVG_UNSUB_RATE,
  Statistics.JSON_PROPERTY_TARGET_SUB_RATE,
  Statistics.JSON_PROPERTY_OPEN_RATE,
  Statistics.JSON_PROPERTY_CLICK_RATE,
  Statistics.JSON_PROPERTY_LAST_SUB_DATE,
  Statistics.JSON_PROPERTY_LAST_UNSUB_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class Statistics {
  public static final String JSON_PROPERTY_MEMBER_COUNT = "member_count";
  private Integer memberCount;

  public static final String JSON_PROPERTY_TOTAL_CONTACTS = "total_contacts";
  private Integer totalContacts;

  public static final String JSON_PROPERTY_UNSUBSCRIBE_COUNT = "unsubscribe_count";
  private Integer unsubscribeCount;

  public static final String JSON_PROPERTY_CLEANED_COUNT = "cleaned_count";
  private Integer cleanedCount;

  public static final String JSON_PROPERTY_MEMBER_COUNT_SINCE_SEND = "member_count_since_send";
  private Integer memberCountSinceSend;

  public static final String JSON_PROPERTY_UNSUBSCRIBE_COUNT_SINCE_SEND = "unsubscribe_count_since_send";
  private Integer unsubscribeCountSinceSend;

  public static final String JSON_PROPERTY_CLEANED_COUNT_SINCE_SEND = "cleaned_count_since_send";
  private Integer cleanedCountSinceSend;

  public static final String JSON_PROPERTY_CAMPAIGN_COUNT = "campaign_count";
  private Integer campaignCount;

  public static final String JSON_PROPERTY_CAMPAIGN_LAST_SENT = "campaign_last_sent";
  private OffsetDateTime campaignLastSent;

  public static final String JSON_PROPERTY_MERGE_FIELD_COUNT = "merge_field_count";
  private Integer mergeFieldCount;

  public static final String JSON_PROPERTY_AVG_SUB_RATE = "avg_sub_rate";
  private BigDecimal avgSubRate;

  public static final String JSON_PROPERTY_AVG_UNSUB_RATE = "avg_unsub_rate";
  private BigDecimal avgUnsubRate;

  public static final String JSON_PROPERTY_TARGET_SUB_RATE = "target_sub_rate";
  private BigDecimal targetSubRate;

  public static final String JSON_PROPERTY_OPEN_RATE = "open_rate";
  private BigDecimal openRate;

  public static final String JSON_PROPERTY_CLICK_RATE = "click_rate";
  private BigDecimal clickRate;

  public static final String JSON_PROPERTY_LAST_SUB_DATE = "last_sub_date";
  private OffsetDateTime lastSubDate;

  public static final String JSON_PROPERTY_LAST_UNSUB_DATE = "last_unsub_date";
  private OffsetDateTime lastUnsubDate;

  public Statistics() {
  }

  @JsonCreator
  public Statistics(
    @JsonProperty(JSON_PROPERTY_MEMBER_COUNT) Integer memberCount, 
    @JsonProperty(JSON_PROPERTY_TOTAL_CONTACTS) Integer totalContacts, 
    @JsonProperty(JSON_PROPERTY_UNSUBSCRIBE_COUNT) Integer unsubscribeCount, 
    @JsonProperty(JSON_PROPERTY_CLEANED_COUNT) Integer cleanedCount, 
    @JsonProperty(JSON_PROPERTY_MEMBER_COUNT_SINCE_SEND) Integer memberCountSinceSend, 
    @JsonProperty(JSON_PROPERTY_UNSUBSCRIBE_COUNT_SINCE_SEND) Integer unsubscribeCountSinceSend, 
    @JsonProperty(JSON_PROPERTY_CLEANED_COUNT_SINCE_SEND) Integer cleanedCountSinceSend, 
    @JsonProperty(JSON_PROPERTY_CAMPAIGN_COUNT) Integer campaignCount, 
    @JsonProperty(JSON_PROPERTY_CAMPAIGN_LAST_SENT) OffsetDateTime campaignLastSent, 
    @JsonProperty(JSON_PROPERTY_MERGE_FIELD_COUNT) Integer mergeFieldCount, 
    @JsonProperty(JSON_PROPERTY_AVG_SUB_RATE) BigDecimal avgSubRate, 
    @JsonProperty(JSON_PROPERTY_AVG_UNSUB_RATE) BigDecimal avgUnsubRate, 
    @JsonProperty(JSON_PROPERTY_TARGET_SUB_RATE) BigDecimal targetSubRate, 
    @JsonProperty(JSON_PROPERTY_OPEN_RATE) BigDecimal openRate, 
    @JsonProperty(JSON_PROPERTY_CLICK_RATE) BigDecimal clickRate, 
    @JsonProperty(JSON_PROPERTY_LAST_SUB_DATE) OffsetDateTime lastSubDate, 
    @JsonProperty(JSON_PROPERTY_LAST_UNSUB_DATE) OffsetDateTime lastUnsubDate
  ) {
    this();
    this.memberCount = memberCount;
    this.totalContacts = totalContacts;
    this.unsubscribeCount = unsubscribeCount;
    this.cleanedCount = cleanedCount;
    this.memberCountSinceSend = memberCountSinceSend;
    this.unsubscribeCountSinceSend = unsubscribeCountSinceSend;
    this.cleanedCountSinceSend = cleanedCountSinceSend;
    this.campaignCount = campaignCount;
    this.campaignLastSent = campaignLastSent;
    this.mergeFieldCount = mergeFieldCount;
    this.avgSubRate = avgSubRate;
    this.avgUnsubRate = avgUnsubRate;
    this.targetSubRate = targetSubRate;
    this.openRate = openRate;
    this.clickRate = clickRate;
    this.lastSubDate = lastSubDate;
    this.lastUnsubDate = lastUnsubDate;
  }

   /**
   * The number of active members in the list.
   * @return memberCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMBER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMemberCount() {
    return memberCount;
  }




   /**
   * The number of contacts in the list, including subscribed, unsubscribed, pending, cleaned, deleted, transactional, and those that need to be reconfirmed. Requires include_total_contacts query parameter to be included.
   * @return totalContacts
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalContacts() {
    return totalContacts;
  }




   /**
   * The number of members who have unsubscribed from the list.
   * @return unsubscribeCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNSUBSCRIBE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUnsubscribeCount() {
    return unsubscribeCount;
  }




   /**
   * The number of members cleaned from the list.
   * @return cleanedCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLEANED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCleanedCount() {
    return cleanedCount;
  }




   /**
   * The number of active members in the list since the last campaign was sent.
   * @return memberCountSinceSend
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMBER_COUNT_SINCE_SEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMemberCountSinceSend() {
    return memberCountSinceSend;
  }




   /**
   * The number of members who have unsubscribed since the last campaign was sent.
   * @return unsubscribeCountSinceSend
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNSUBSCRIBE_COUNT_SINCE_SEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUnsubscribeCountSinceSend() {
    return unsubscribeCountSinceSend;
  }




   /**
   * The number of members cleaned from the list since the last campaign was sent.
   * @return cleanedCountSinceSend
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLEANED_COUNT_SINCE_SEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCleanedCountSinceSend() {
    return cleanedCountSinceSend;
  }




   /**
   * The number of campaigns in any status that use this list.
   * @return campaignCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCampaignCount() {
    return campaignCount;
  }




   /**
   * The date and time the last campaign was sent to this list in ISO 8601 format. This is updated when a campaign is sent to 10 or more recipients.
   * @return campaignLastSent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_LAST_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCampaignLastSent() {
    return campaignLastSent;
  }




   /**
   * The number of merge fields ([audience field](https://mailchimp.com/help/getting-started-with-merge-tags/)) for this list (doesn&#39;t include EMAIL).
   * @return mergeFieldCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERGE_FIELD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMergeFieldCount() {
    return mergeFieldCount;
  }




   /**
   * The average number of subscriptions per month for the list (not returned if we haven&#39;t calculated it yet).
   * @return avgSubRate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVG_SUB_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAvgSubRate() {
    return avgSubRate;
  }




   /**
   * The average number of unsubscriptions per month for the list (not returned if we haven&#39;t calculated it yet).
   * @return avgUnsubRate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVG_UNSUB_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAvgUnsubRate() {
    return avgUnsubRate;
  }




   /**
   * The target number of subscriptions per month for the list to keep it growing (not returned if we haven&#39;t calculated it yet).
   * @return targetSubRate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_SUB_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTargetSubRate() {
    return targetSubRate;
  }




   /**
   * The average open rate (a percentage represented as a number between 0 and 100) per campaign for the list (not returned if we haven&#39;t calculated it yet).
   * @return openRate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPEN_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOpenRate() {
    return openRate;
  }




   /**
   * The average click rate (a percentage represented as a number between 0 and 100) per campaign for the list (not returned if we haven&#39;t calculated it yet).
   * @return clickRate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLICK_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getClickRate() {
    return clickRate;
  }




   /**
   * The date and time of the last time someone subscribed to this list in ISO 8601 format.
   * @return lastSubDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_SUB_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastSubDate() {
    return lastSubDate;
  }




   /**
   * The date and time of the last time someone unsubscribed from this list in ISO 8601 format.
   * @return lastUnsubDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UNSUB_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastUnsubDate() {
    return lastUnsubDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Statistics statistics = (Statistics) o;
    return Objects.equals(this.memberCount, statistics.memberCount) &&
        Objects.equals(this.totalContacts, statistics.totalContacts) &&
        Objects.equals(this.unsubscribeCount, statistics.unsubscribeCount) &&
        Objects.equals(this.cleanedCount, statistics.cleanedCount) &&
        Objects.equals(this.memberCountSinceSend, statistics.memberCountSinceSend) &&
        Objects.equals(this.unsubscribeCountSinceSend, statistics.unsubscribeCountSinceSend) &&
        Objects.equals(this.cleanedCountSinceSend, statistics.cleanedCountSinceSend) &&
        Objects.equals(this.campaignCount, statistics.campaignCount) &&
        Objects.equals(this.campaignLastSent, statistics.campaignLastSent) &&
        Objects.equals(this.mergeFieldCount, statistics.mergeFieldCount) &&
        Objects.equals(this.avgSubRate, statistics.avgSubRate) &&
        Objects.equals(this.avgUnsubRate, statistics.avgUnsubRate) &&
        Objects.equals(this.targetSubRate, statistics.targetSubRate) &&
        Objects.equals(this.openRate, statistics.openRate) &&
        Objects.equals(this.clickRate, statistics.clickRate) &&
        Objects.equals(this.lastSubDate, statistics.lastSubDate) &&
        Objects.equals(this.lastUnsubDate, statistics.lastUnsubDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberCount, totalContacts, unsubscribeCount, cleanedCount, memberCountSinceSend, unsubscribeCountSinceSend, cleanedCountSinceSend, campaignCount, campaignLastSent, mergeFieldCount, avgSubRate, avgUnsubRate, targetSubRate, openRate, clickRate, lastSubDate, lastUnsubDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statistics {\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    totalContacts: ").append(toIndentedString(totalContacts)).append("\n");
    sb.append("    unsubscribeCount: ").append(toIndentedString(unsubscribeCount)).append("\n");
    sb.append("    cleanedCount: ").append(toIndentedString(cleanedCount)).append("\n");
    sb.append("    memberCountSinceSend: ").append(toIndentedString(memberCountSinceSend)).append("\n");
    sb.append("    unsubscribeCountSinceSend: ").append(toIndentedString(unsubscribeCountSinceSend)).append("\n");
    sb.append("    cleanedCountSinceSend: ").append(toIndentedString(cleanedCountSinceSend)).append("\n");
    sb.append("    campaignCount: ").append(toIndentedString(campaignCount)).append("\n");
    sb.append("    campaignLastSent: ").append(toIndentedString(campaignLastSent)).append("\n");
    sb.append("    mergeFieldCount: ").append(toIndentedString(mergeFieldCount)).append("\n");
    sb.append("    avgSubRate: ").append(toIndentedString(avgSubRate)).append("\n");
    sb.append("    avgUnsubRate: ").append(toIndentedString(avgUnsubRate)).append("\n");
    sb.append("    targetSubRate: ").append(toIndentedString(targetSubRate)).append("\n");
    sb.append("    openRate: ").append(toIndentedString(openRate)).append("\n");
    sb.append("    clickRate: ").append(toIndentedString(clickRate)).append("\n");
    sb.append("    lastSubDate: ").append(toIndentedString(lastSubDate)).append("\n");
    sb.append("    lastUnsubDate: ").append(toIndentedString(lastUnsubDate)).append("\n");
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

