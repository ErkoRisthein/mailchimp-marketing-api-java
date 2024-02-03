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
import io.github.erkoristhein.mailchimp.marketing.model.CombinationsInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The settings specific to A/B test campaigns.
 */
@JsonPropertyOrder({
  ABTestOptions.JSON_PROPERTY_WINNING_COMBINATION_ID,
  ABTestOptions.JSON_PROPERTY_WINNING_CAMPAIGN_ID,
  ABTestOptions.JSON_PROPERTY_WINNER_CRITERIA,
  ABTestOptions.JSON_PROPERTY_WAIT_TIME,
  ABTestOptions.JSON_PROPERTY_TEST_SIZE,
  ABTestOptions.JSON_PROPERTY_SUBJECT_LINES,
  ABTestOptions.JSON_PROPERTY_SEND_TIMES,
  ABTestOptions.JSON_PROPERTY_FROM_NAMES,
  ABTestOptions.JSON_PROPERTY_REPLY_TO_ADDRESSES,
  ABTestOptions.JSON_PROPERTY_CONTENTS,
  ABTestOptions.JSON_PROPERTY_COMBINATIONS
})
@JsonTypeName("A_B_Test_Options")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class ABTestOptions {
  public static final String JSON_PROPERTY_WINNING_COMBINATION_ID = "winning_combination_id";
  private String winningCombinationId;

  public static final String JSON_PROPERTY_WINNING_CAMPAIGN_ID = "winning_campaign_id";
  private String winningCampaignId;

  /**
   * The combination that performs the best. This may be determined automatically by click rate, open rate, or total revenue -- or you may choose manually based on the reporting data you find the most valuable. For Multivariate Campaigns testing send_time, winner_criteria is ignored. For Multivariate Campaigns with &#39;manual&#39; as the winner_criteria, the winner must be chosen in the Mailchimp web application.
   */
  public enum WinnerCriteriaEnum {
    OPENS("opens"),
    
    CLICKS("clicks"),
    
    MANUAL("manual"),
    
    TOTAL_REVENUE("total_revenue");

    private String value;

    WinnerCriteriaEnum(String value) {
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
    public static WinnerCriteriaEnum fromValue(String value) {
      for (WinnerCriteriaEnum b : WinnerCriteriaEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WINNER_CRITERIA = "winner_criteria";
  private WinnerCriteriaEnum winnerCriteria;

  public static final String JSON_PROPERTY_WAIT_TIME = "wait_time";
  private Integer waitTime;

  public static final String JSON_PROPERTY_TEST_SIZE = "test_size";
  private Integer testSize;

  public static final String JSON_PROPERTY_SUBJECT_LINES = "subject_lines";
  private List<String> subjectLines;

  public static final String JSON_PROPERTY_SEND_TIMES = "send_times";
  private List<OffsetDateTime> sendTimes;

  public static final String JSON_PROPERTY_FROM_NAMES = "from_names";
  private List<String> fromNames;

  public static final String JSON_PROPERTY_REPLY_TO_ADDRESSES = "reply_to_addresses";
  private List<String> replyToAddresses;

  public static final String JSON_PROPERTY_CONTENTS = "contents";
  private List<String> contents;

  public static final String JSON_PROPERTY_COMBINATIONS = "combinations";
  private List<CombinationsInner> combinations;

  public ABTestOptions() {
  }

  @JsonCreator
  public ABTestOptions(
    @JsonProperty(JSON_PROPERTY_WINNING_COMBINATION_ID) String winningCombinationId, 
    @JsonProperty(JSON_PROPERTY_WINNING_CAMPAIGN_ID) String winningCampaignId, 
    @JsonProperty(JSON_PROPERTY_CONTENTS) List<String> contents, 
    @JsonProperty(JSON_PROPERTY_COMBINATIONS) List<CombinationsInner> combinations
  ) {
    this();
    this.winningCombinationId = winningCombinationId;
    this.winningCampaignId = winningCampaignId;
    this.contents = contents;
    this.combinations = combinations;
  }

   /**
   * ID for the winning combination.
   * @return winningCombinationId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WINNING_COMBINATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWinningCombinationId() {
    return winningCombinationId;
  }




   /**
   * ID of the campaign that was sent to the remaining recipients based on the winning combination.
   * @return winningCampaignId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WINNING_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWinningCampaignId() {
    return winningCampaignId;
  }




  public ABTestOptions winnerCriteria(WinnerCriteriaEnum winnerCriteria) {
    
    this.winnerCriteria = winnerCriteria;
    return this;
  }

   /**
   * The combination that performs the best. This may be determined automatically by click rate, open rate, or total revenue -- or you may choose manually based on the reporting data you find the most valuable. For Multivariate Campaigns testing send_time, winner_criteria is ignored. For Multivariate Campaigns with &#39;manual&#39; as the winner_criteria, the winner must be chosen in the Mailchimp web application.
   * @return winnerCriteria
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WINNER_CRITERIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WinnerCriteriaEnum getWinnerCriteria() {
    return winnerCriteria;
  }


  @JsonProperty(JSON_PROPERTY_WINNER_CRITERIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWinnerCriteria(WinnerCriteriaEnum winnerCriteria) {
    this.winnerCriteria = winnerCriteria;
  }


  public ABTestOptions waitTime(Integer waitTime) {
    
    this.waitTime = waitTime;
    return this;
  }

   /**
   * The number of minutes to wait before choosing the winning campaign. The value of wait_time must be greater than 0 and in whole hours, specified in minutes.
   * @return waitTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAIT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWaitTime() {
    return waitTime;
  }


  @JsonProperty(JSON_PROPERTY_WAIT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWaitTime(Integer waitTime) {
    this.waitTime = waitTime;
  }


  public ABTestOptions testSize(Integer testSize) {
    
    this.testSize = testSize;
    return this;
  }

   /**
   * The percentage of recipients to send the test combinations to, must be a value between 10 and 100.
   * @return testSize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTestSize() {
    return testSize;
  }


  @JsonProperty(JSON_PROPERTY_TEST_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestSize(Integer testSize) {
    this.testSize = testSize;
  }


  public ABTestOptions subjectLines(List<String> subjectLines) {
    
    this.subjectLines = subjectLines;
    return this;
  }

  public ABTestOptions addSubjectLinesItem(String subjectLinesItem) {
    if (this.subjectLines == null) {
      this.subjectLines = new ArrayList<>();
    }
    this.subjectLines.add(subjectLinesItem);
    return this;
  }

   /**
   * The possible subject lines to test. If no subject lines are provided, settings.subject_line will be used.
   * @return subjectLines
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSubjectLines() {
    return subjectLines;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubjectLines(List<String> subjectLines) {
    this.subjectLines = subjectLines;
  }


  public ABTestOptions sendTimes(List<OffsetDateTime> sendTimes) {
    
    this.sendTimes = sendTimes;
    return this;
  }

  public ABTestOptions addSendTimesItem(OffsetDateTime sendTimesItem) {
    if (this.sendTimes == null) {
      this.sendTimes = new ArrayList<>();
    }
    this.sendTimes.add(sendTimesItem);
    return this;
  }

   /**
   * The possible send times to test. The times provided should be in the format YYYY-MM-DD HH:MM:SS. If send_times are provided to test, the test_size will be set to 100% and winner_criteria will be ignored.
   * @return sendTimes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEND_TIMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OffsetDateTime> getSendTimes() {
    return sendTimes;
  }


  @JsonProperty(JSON_PROPERTY_SEND_TIMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSendTimes(List<OffsetDateTime> sendTimes) {
    this.sendTimes = sendTimes;
  }


  public ABTestOptions fromNames(List<String> fromNames) {
    
    this.fromNames = fromNames;
    return this;
  }

  public ABTestOptions addFromNamesItem(String fromNamesItem) {
    if (this.fromNames == null) {
      this.fromNames = new ArrayList<>();
    }
    this.fromNames.add(fromNamesItem);
    return this;
  }

   /**
   * The possible from names. The number of from_names provided must match the number of reply_to_addresses. If no from_names are provided, settings.from_name will be used.
   * @return fromNames
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFromNames() {
    return fromNames;
  }


  @JsonProperty(JSON_PROPERTY_FROM_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromNames(List<String> fromNames) {
    this.fromNames = fromNames;
  }


  public ABTestOptions replyToAddresses(List<String> replyToAddresses) {
    
    this.replyToAddresses = replyToAddresses;
    return this;
  }

  public ABTestOptions addReplyToAddressesItem(String replyToAddressesItem) {
    if (this.replyToAddresses == null) {
      this.replyToAddresses = new ArrayList<>();
    }
    this.replyToAddresses.add(replyToAddressesItem);
    return this;
  }

   /**
   * The possible reply-to addresses. The number of reply_to_addresses provided must match the number of from_names. If no reply_to_addresses are provided, settings.reply_to will be used.
   * @return replyToAddresses
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLY_TO_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getReplyToAddresses() {
    return replyToAddresses;
  }


  @JsonProperty(JSON_PROPERTY_REPLY_TO_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplyToAddresses(List<String> replyToAddresses) {
    this.replyToAddresses = replyToAddresses;
  }


   /**
   * Descriptions of possible email contents. To set campaign contents, make a PUT request to /campaigns/{campaign_id}/content with the field &#39;variate_contents&#39;.
   * @return contents
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getContents() {
    return contents;
  }




   /**
   * Combinations of possible variables used to build emails.
   * @return combinations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMBINATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CombinationsInner> getCombinations() {
    return combinations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ABTestOptions aBTestOptions = (ABTestOptions) o;
    return Objects.equals(this.winningCombinationId, aBTestOptions.winningCombinationId) &&
        Objects.equals(this.winningCampaignId, aBTestOptions.winningCampaignId) &&
        Objects.equals(this.winnerCriteria, aBTestOptions.winnerCriteria) &&
        Objects.equals(this.waitTime, aBTestOptions.waitTime) &&
        Objects.equals(this.testSize, aBTestOptions.testSize) &&
        Objects.equals(this.subjectLines, aBTestOptions.subjectLines) &&
        Objects.equals(this.sendTimes, aBTestOptions.sendTimes) &&
        Objects.equals(this.fromNames, aBTestOptions.fromNames) &&
        Objects.equals(this.replyToAddresses, aBTestOptions.replyToAddresses) &&
        Objects.equals(this.contents, aBTestOptions.contents) &&
        Objects.equals(this.combinations, aBTestOptions.combinations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(winningCombinationId, winningCampaignId, winnerCriteria, waitTime, testSize, subjectLines, sendTimes, fromNames, replyToAddresses, contents, combinations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABTestOptions {\n");
    sb.append("    winningCombinationId: ").append(toIndentedString(winningCombinationId)).append("\n");
    sb.append("    winningCampaignId: ").append(toIndentedString(winningCampaignId)).append("\n");
    sb.append("    winnerCriteria: ").append(toIndentedString(winnerCriteria)).append("\n");
    sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
    sb.append("    testSize: ").append(toIndentedString(testSize)).append("\n");
    sb.append("    subjectLines: ").append(toIndentedString(subjectLines)).append("\n");
    sb.append("    sendTimes: ").append(toIndentedString(sendTimes)).append("\n");
    sb.append("    fromNames: ").append(toIndentedString(fromNames)).append("\n");
    sb.append("    replyToAddresses: ").append(toIndentedString(replyToAddresses)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    combinations: ").append(toIndentedString(combinations)).append("\n");
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

