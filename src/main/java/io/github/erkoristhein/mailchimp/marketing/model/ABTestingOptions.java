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
 * [A/B Testing](https://mailchimp.com/help/about-ab-testing-campaigns/) options for a campaign.
 */
@JsonPropertyOrder({
  ABTestingOptions.JSON_PROPERTY_SPLIT_TEST,
  ABTestingOptions.JSON_PROPERTY_PICK_WINNER,
  ABTestingOptions.JSON_PROPERTY_WAIT_UNITS,
  ABTestingOptions.JSON_PROPERTY_WAIT_TIME,
  ABTestingOptions.JSON_PROPERTY_SPLIT_SIZE,
  ABTestingOptions.JSON_PROPERTY_FROM_NAME_A,
  ABTestingOptions.JSON_PROPERTY_FROM_NAME_B,
  ABTestingOptions.JSON_PROPERTY_REPLY_EMAIL_A,
  ABTestingOptions.JSON_PROPERTY_REPLY_EMAIL_B,
  ABTestingOptions.JSON_PROPERTY_SUBJECT_A,
  ABTestingOptions.JSON_PROPERTY_SUBJECT_B,
  ABTestingOptions.JSON_PROPERTY_SEND_TIME_A,
  ABTestingOptions.JSON_PROPERTY_SEND_TIME_B,
  ABTestingOptions.JSON_PROPERTY_SEND_TIME_WINNER
})
@JsonTypeName("A_B_Testing_Options")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class ABTestingOptions {
  /**
   * The type of AB split to run.
   */
  public enum SplitTestEnum {
    SUBJECT("subject"),
    
    FROM_NAME("from_name"),
    
    SCHEDULE("schedule");

    private String value;

    SplitTestEnum(String value) {
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
    public static SplitTestEnum fromValue(String value) {
      for (SplitTestEnum b : SplitTestEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SPLIT_TEST = "split_test";
  private SplitTestEnum splitTest;

  /**
   * How we should evaluate a winner. Based on &#39;opens&#39;, &#39;clicks&#39;, or &#39;manual&#39;.
   */
  public enum PickWinnerEnum {
    OPENS("opens"),
    
    CLICKS("clicks"),
    
    MANUAL("manual");

    private String value;

    PickWinnerEnum(String value) {
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
    public static PickWinnerEnum fromValue(String value) {
      for (PickWinnerEnum b : PickWinnerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PICK_WINNER = "pick_winner";
  private PickWinnerEnum pickWinner;

  /**
   * How unit of time for measuring the winner (&#39;hours&#39; or &#39;days&#39;). This cannot be changed after a campaign is sent.
   */
  public enum WaitUnitsEnum {
    HOURS("hours"),
    
    DAYS("days");

    private String value;

    WaitUnitsEnum(String value) {
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
    public static WaitUnitsEnum fromValue(String value) {
      for (WaitUnitsEnum b : WaitUnitsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WAIT_UNITS = "wait_units";
  private WaitUnitsEnum waitUnits;

  public static final String JSON_PROPERTY_WAIT_TIME = "wait_time";
  private Integer waitTime;

  public static final String JSON_PROPERTY_SPLIT_SIZE = "split_size";
  private Integer splitSize;

  public static final String JSON_PROPERTY_FROM_NAME_A = "from_name_a";
  private String fromNameA;

  public static final String JSON_PROPERTY_FROM_NAME_B = "from_name_b";
  private String fromNameB;

  public static final String JSON_PROPERTY_REPLY_EMAIL_A = "reply_email_a";
  private String replyEmailA;

  public static final String JSON_PROPERTY_REPLY_EMAIL_B = "reply_email_b";
  private String replyEmailB;

  public static final String JSON_PROPERTY_SUBJECT_A = "subject_a";
  private String subjectA;

  public static final String JSON_PROPERTY_SUBJECT_B = "subject_b";
  private String subjectB;

  public static final String JSON_PROPERTY_SEND_TIME_A = "send_time_a";
  private OffsetDateTime sendTimeA;

  public static final String JSON_PROPERTY_SEND_TIME_B = "send_time_b";
  private OffsetDateTime sendTimeB;

  public static final String JSON_PROPERTY_SEND_TIME_WINNER = "send_time_winner";
  private String sendTimeWinner;

  public ABTestingOptions() {
  }

  public ABTestingOptions splitTest(SplitTestEnum splitTest) {
    
    this.splitTest = splitTest;
    return this;
  }

   /**
   * The type of AB split to run.
   * @return splitTest
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPLIT_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SplitTestEnum getSplitTest() {
    return splitTest;
  }


  @JsonProperty(JSON_PROPERTY_SPLIT_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSplitTest(SplitTestEnum splitTest) {
    this.splitTest = splitTest;
  }


  public ABTestingOptions pickWinner(PickWinnerEnum pickWinner) {
    
    this.pickWinner = pickWinner;
    return this;
  }

   /**
   * How we should evaluate a winner. Based on &#39;opens&#39;, &#39;clicks&#39;, or &#39;manual&#39;.
   * @return pickWinner
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICK_WINNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PickWinnerEnum getPickWinner() {
    return pickWinner;
  }


  @JsonProperty(JSON_PROPERTY_PICK_WINNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickWinner(PickWinnerEnum pickWinner) {
    this.pickWinner = pickWinner;
  }


  public ABTestingOptions waitUnits(WaitUnitsEnum waitUnits) {
    
    this.waitUnits = waitUnits;
    return this;
  }

   /**
   * How unit of time for measuring the winner (&#39;hours&#39; or &#39;days&#39;). This cannot be changed after a campaign is sent.
   * @return waitUnits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAIT_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WaitUnitsEnum getWaitUnits() {
    return waitUnits;
  }


  @JsonProperty(JSON_PROPERTY_WAIT_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWaitUnits(WaitUnitsEnum waitUnits) {
    this.waitUnits = waitUnits;
  }


  public ABTestingOptions waitTime(Integer waitTime) {
    
    this.waitTime = waitTime;
    return this;
  }

   /**
   * The amount of time to wait before picking a winner. This cannot be changed after a campaign is sent.
   * @return waitTime
  **/
  @jakarta.annotation.Nullable
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


  public ABTestingOptions splitSize(Integer splitSize) {
    
    this.splitSize = splitSize;
    return this;
  }

   /**
   * The size of the split groups. Campaigns split based on &#39;schedule&#39; are forced to have a 50/50 split. Valid split integers are between 1-50.
   * minimum: 1
   * maximum: 50
   * @return splitSize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPLIT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSplitSize() {
    return splitSize;
  }


  @JsonProperty(JSON_PROPERTY_SPLIT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSplitSize(Integer splitSize) {
    this.splitSize = splitSize;
  }


  public ABTestingOptions fromNameA(String fromNameA) {
    
    this.fromNameA = fromNameA;
    return this;
  }

   /**
   * For campaigns split on &#39;From Name&#39;, the name for Group A.
   * @return fromNameA
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_NAME_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromNameA() {
    return fromNameA;
  }


  @JsonProperty(JSON_PROPERTY_FROM_NAME_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromNameA(String fromNameA) {
    this.fromNameA = fromNameA;
  }


  public ABTestingOptions fromNameB(String fromNameB) {
    
    this.fromNameB = fromNameB;
    return this;
  }

   /**
   * For campaigns split on &#39;From Name&#39;, the name for Group B.
   * @return fromNameB
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_NAME_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromNameB() {
    return fromNameB;
  }


  @JsonProperty(JSON_PROPERTY_FROM_NAME_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromNameB(String fromNameB) {
    this.fromNameB = fromNameB;
  }


  public ABTestingOptions replyEmailA(String replyEmailA) {
    
    this.replyEmailA = replyEmailA;
    return this;
  }

   /**
   * For campaigns split on &#39;From Name&#39;, the reply-to address for Group A.
   * @return replyEmailA
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLY_EMAIL_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReplyEmailA() {
    return replyEmailA;
  }


  @JsonProperty(JSON_PROPERTY_REPLY_EMAIL_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplyEmailA(String replyEmailA) {
    this.replyEmailA = replyEmailA;
  }


  public ABTestingOptions replyEmailB(String replyEmailB) {
    
    this.replyEmailB = replyEmailB;
    return this;
  }

   /**
   * For campaigns split on &#39;From Name&#39;, the reply-to address for Group B.
   * @return replyEmailB
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLY_EMAIL_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReplyEmailB() {
    return replyEmailB;
  }


  @JsonProperty(JSON_PROPERTY_REPLY_EMAIL_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplyEmailB(String replyEmailB) {
    this.replyEmailB = replyEmailB;
  }


  public ABTestingOptions subjectA(String subjectA) {
    
    this.subjectA = subjectA;
    return this;
  }

   /**
   * For campaigns split on &#39;Subject Line&#39;, the subject line for Group A.
   * @return subjectA
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubjectA() {
    return subjectA;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubjectA(String subjectA) {
    this.subjectA = subjectA;
  }


  public ABTestingOptions subjectB(String subjectB) {
    
    this.subjectB = subjectB;
    return this;
  }

   /**
   * For campaigns split on &#39;Subject Line&#39;, the subject line for Group B.
   * @return subjectB
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubjectB() {
    return subjectB;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubjectB(String subjectB) {
    this.subjectB = subjectB;
  }


  public ABTestingOptions sendTimeA(OffsetDateTime sendTimeA) {
    
    this.sendTimeA = sendTimeA;
    return this;
  }

   /**
   * The send time for Group A.
   * @return sendTimeA
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEND_TIME_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSendTimeA() {
    return sendTimeA;
  }


  @JsonProperty(JSON_PROPERTY_SEND_TIME_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSendTimeA(OffsetDateTime sendTimeA) {
    this.sendTimeA = sendTimeA;
  }


  public ABTestingOptions sendTimeB(OffsetDateTime sendTimeB) {
    
    this.sendTimeB = sendTimeB;
    return this;
  }

   /**
   * The send time for Group B.
   * @return sendTimeB
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEND_TIME_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSendTimeB() {
    return sendTimeB;
  }


  @JsonProperty(JSON_PROPERTY_SEND_TIME_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSendTimeB(OffsetDateTime sendTimeB) {
    this.sendTimeB = sendTimeB;
  }


  public ABTestingOptions sendTimeWinner(String sendTimeWinner) {
    
    this.sendTimeWinner = sendTimeWinner;
    return this;
  }

   /**
   * The send time for the winning version.
   * @return sendTimeWinner
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEND_TIME_WINNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSendTimeWinner() {
    return sendTimeWinner;
  }


  @JsonProperty(JSON_PROPERTY_SEND_TIME_WINNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSendTimeWinner(String sendTimeWinner) {
    this.sendTimeWinner = sendTimeWinner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ABTestingOptions aBTestingOptions = (ABTestingOptions) o;
    return Objects.equals(this.splitTest, aBTestingOptions.splitTest) &&
        Objects.equals(this.pickWinner, aBTestingOptions.pickWinner) &&
        Objects.equals(this.waitUnits, aBTestingOptions.waitUnits) &&
        Objects.equals(this.waitTime, aBTestingOptions.waitTime) &&
        Objects.equals(this.splitSize, aBTestingOptions.splitSize) &&
        Objects.equals(this.fromNameA, aBTestingOptions.fromNameA) &&
        Objects.equals(this.fromNameB, aBTestingOptions.fromNameB) &&
        Objects.equals(this.replyEmailA, aBTestingOptions.replyEmailA) &&
        Objects.equals(this.replyEmailB, aBTestingOptions.replyEmailB) &&
        Objects.equals(this.subjectA, aBTestingOptions.subjectA) &&
        Objects.equals(this.subjectB, aBTestingOptions.subjectB) &&
        Objects.equals(this.sendTimeA, aBTestingOptions.sendTimeA) &&
        Objects.equals(this.sendTimeB, aBTestingOptions.sendTimeB) &&
        Objects.equals(this.sendTimeWinner, aBTestingOptions.sendTimeWinner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(splitTest, pickWinner, waitUnits, waitTime, splitSize, fromNameA, fromNameB, replyEmailA, replyEmailB, subjectA, subjectB, sendTimeA, sendTimeB, sendTimeWinner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABTestingOptions {\n");
    sb.append("    splitTest: ").append(toIndentedString(splitTest)).append("\n");
    sb.append("    pickWinner: ").append(toIndentedString(pickWinner)).append("\n");
    sb.append("    waitUnits: ").append(toIndentedString(waitUnits)).append("\n");
    sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
    sb.append("    splitSize: ").append(toIndentedString(splitSize)).append("\n");
    sb.append("    fromNameA: ").append(toIndentedString(fromNameA)).append("\n");
    sb.append("    fromNameB: ").append(toIndentedString(fromNameB)).append("\n");
    sb.append("    replyEmailA: ").append(toIndentedString(replyEmailA)).append("\n");
    sb.append("    replyEmailB: ").append(toIndentedString(replyEmailB)).append("\n");
    sb.append("    subjectA: ").append(toIndentedString(subjectA)).append("\n");
    sb.append("    subjectB: ").append(toIndentedString(subjectB)).append("\n");
    sb.append("    sendTimeA: ").append(toIndentedString(sendTimeA)).append("\n");
    sb.append("    sendTimeB: ").append(toIndentedString(sendTimeB)).append("\n");
    sb.append("    sendTimeWinner: ").append(toIndentedString(sendTimeWinner)).append("\n");
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

