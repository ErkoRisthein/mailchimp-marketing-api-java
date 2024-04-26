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
import io.github.erkoristhein.mailchimp.marketing.model.Hours;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A workflow&#39;s runtime settings for an Automation.
 */
@JsonPropertyOrder({
  AutomationWorkflowRuntimeSettings.JSON_PROPERTY_DAYS,
  AutomationWorkflowRuntimeSettings.JSON_PROPERTY_HOURS
})
@JsonTypeName("Automation_Workflow_Runtime_Settings")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class AutomationWorkflowRuntimeSettings {
  /**
   * Gets or Sets days
   */
  public enum DaysEnum {
    SUNDAY("sunday"),
    
    MONDAY("monday"),
    
    TUESDAY("tuesday"),
    
    WEDNESDAY("wednesday"),
    
    THURSDAY("thursday"),
    
    FRIDAY("friday"),
    
    SATURDAY("saturday");

    private String value;

    DaysEnum(String value) {
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
    public static DaysEnum fromValue(String value) {
      for (DaysEnum b : DaysEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DAYS = "days";
  private List<DaysEnum> days = new ArrayList<>();

  public static final String JSON_PROPERTY_HOURS = "hours";
  private Hours hours;

  public AutomationWorkflowRuntimeSettings() {
  }

  public AutomationWorkflowRuntimeSettings days(List<DaysEnum> days) {
    
    this.days = days;
    return this;
  }

  public AutomationWorkflowRuntimeSettings addDaysItem(DaysEnum daysItem) {
    if (this.days == null) {
      this.days = new ArrayList<>();
    }
    this.days.add(daysItem);
    return this;
  }

   /**
   * The days an Automation workflow can send.
   * @return days
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DaysEnum> getDays() {
    return days;
  }


  @JsonProperty(JSON_PROPERTY_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDays(List<DaysEnum> days) {
    this.days = days;
  }


  public AutomationWorkflowRuntimeSettings hours(Hours hours) {
    
    this.hours = hours;
    return this;
  }

   /**
   * Get hours
   * @return hours
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Hours getHours() {
    return hours;
  }


  @JsonProperty(JSON_PROPERTY_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHours(Hours hours) {
    this.hours = hours;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomationWorkflowRuntimeSettings automationWorkflowRuntimeSettings = (AutomationWorkflowRuntimeSettings) o;
    return Objects.equals(this.days, automationWorkflowRuntimeSettings.days) &&
        Objects.equals(this.hours, automationWorkflowRuntimeSettings.hours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days, hours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationWorkflowRuntimeSettings {\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
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

