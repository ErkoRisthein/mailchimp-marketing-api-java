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
import io.github.erkoristhein.mailchimp.marketing.model.DailySendingDays;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The schedule for sending the RSS Campaign.
 */
@JsonPropertyOrder({
  SendingSchedule1.JSON_PROPERTY_HOUR,
  SendingSchedule1.JSON_PROPERTY_DAILY_SEND,
  SendingSchedule1.JSON_PROPERTY_WEEKLY_SEND_DAY,
  SendingSchedule1.JSON_PROPERTY_MONTHLY_SEND_DATE
})
@JsonTypeName("Sending_Schedule_1")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class SendingSchedule1 {
  public static final String JSON_PROPERTY_HOUR = "hour";
  private Integer hour;

  public static final String JSON_PROPERTY_DAILY_SEND = "daily_send";
  private DailySendingDays dailySend;

  /**
   * The day of the week to send a weekly RSS Campaign.
   */
  public enum WeeklySendDayEnum {
    SUNDAY("sunday"),
    
    MONDAY("monday"),
    
    TUESDAY("tuesday"),
    
    WEDNESDAY("wednesday"),
    
    THURSDAY("thursday"),
    
    FRIDAY("friday"),
    
    SATURDAY("saturday");

    private String value;

    WeeklySendDayEnum(String value) {
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
    public static WeeklySendDayEnum fromValue(String value) {
      for (WeeklySendDayEnum b : WeeklySendDayEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WEEKLY_SEND_DAY = "weekly_send_day";
  private WeeklySendDayEnum weeklySendDay;

  public static final String JSON_PROPERTY_MONTHLY_SEND_DATE = "monthly_send_date";
  private BigDecimal monthlySendDate;

  public SendingSchedule1() {
  }

  public SendingSchedule1 hour(Integer hour) {
    
    this.hour = hour;
    return this;
  }

   /**
   * The hour to send the campaign in local time. Acceptable hours are 0-23. For example, &#39;4&#39; would be 4am in [your account&#39;s default time zone](https://mailchimp.com/help/set-account-details/).
   * minimum: 0
   * maximum: 23
   * @return hour
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHour() {
    return hour;
  }


  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHour(Integer hour) {
    this.hour = hour;
  }


  public SendingSchedule1 dailySend(DailySendingDays dailySend) {
    
    this.dailySend = dailySend;
    return this;
  }

   /**
   * Get dailySend
   * @return dailySend
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAILY_SEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DailySendingDays getDailySend() {
    return dailySend;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_SEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDailySend(DailySendingDays dailySend) {
    this.dailySend = dailySend;
  }


  public SendingSchedule1 weeklySendDay(WeeklySendDayEnum weeklySendDay) {
    
    this.weeklySendDay = weeklySendDay;
    return this;
  }

   /**
   * The day of the week to send a weekly RSS Campaign.
   * @return weeklySendDay
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEEKLY_SEND_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WeeklySendDayEnum getWeeklySendDay() {
    return weeklySendDay;
  }


  @JsonProperty(JSON_PROPERTY_WEEKLY_SEND_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeeklySendDay(WeeklySendDayEnum weeklySendDay) {
    this.weeklySendDay = weeklySendDay;
  }


  public SendingSchedule1 monthlySendDate(BigDecimal monthlySendDate) {
    
    this.monthlySendDate = monthlySendDate;
    return this;
  }

   /**
   * The day of the month to send a monthly RSS Campaign. Acceptable days are 0-31, where &#39;0&#39; is always the last day of a month. Months with fewer than the selected number of days will not have an RSS campaign sent out that day. For example, RSS Campaigns set to send on the 30th will not go out in February.
   * minimum: 0
   * maximum: 31
   * @return monthlySendDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONTHLY_SEND_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMonthlySendDate() {
    return monthlySendDate;
  }


  @JsonProperty(JSON_PROPERTY_MONTHLY_SEND_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonthlySendDate(BigDecimal monthlySendDate) {
    this.monthlySendDate = monthlySendDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendingSchedule1 sendingSchedule1 = (SendingSchedule1) o;
    return Objects.equals(this.hour, sendingSchedule1.hour) &&
        Objects.equals(this.dailySend, sendingSchedule1.dailySend) &&
        Objects.equals(this.weeklySendDay, sendingSchedule1.weeklySendDay) &&
        Objects.equals(this.monthlySendDate, sendingSchedule1.monthlySendDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, dailySend, weeklySendDay, monthlySendDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendingSchedule1 {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    dailySend: ").append(toIndentedString(dailySend)).append("\n");
    sb.append("    weeklySendDay: ").append(toIndentedString(weeklySendDay)).append("\n");
    sb.append("    monthlySendDate: ").append(toIndentedString(monthlySendDate)).append("\n");
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

