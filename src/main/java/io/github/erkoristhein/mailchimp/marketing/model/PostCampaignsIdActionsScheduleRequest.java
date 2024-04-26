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
import io.github.erkoristhein.mailchimp.marketing.model.BatchDelivery;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PostCampaignsIdActionsScheduleRequest
 */
@JsonPropertyOrder({
  PostCampaignsIdActionsScheduleRequest.JSON_PROPERTY_SCHEDULE_TIME,
  PostCampaignsIdActionsScheduleRequest.JSON_PROPERTY_TIMEWARP,
  PostCampaignsIdActionsScheduleRequest.JSON_PROPERTY_BATCH_DELIVERY
})
@JsonTypeName("postCampaignsIdActionsSchedule_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class PostCampaignsIdActionsScheduleRequest {
  public static final String JSON_PROPERTY_SCHEDULE_TIME = "schedule_time";
  private OffsetDateTime scheduleTime;

  public static final String JSON_PROPERTY_TIMEWARP = "timewarp";
  private Boolean timewarp;

  public static final String JSON_PROPERTY_BATCH_DELIVERY = "batch_delivery";
  private BatchDelivery batchDelivery;

  public PostCampaignsIdActionsScheduleRequest() {
  }

  public PostCampaignsIdActionsScheduleRequest scheduleTime(OffsetDateTime scheduleTime) {
    
    this.scheduleTime = scheduleTime;
    return this;
  }

   /**
   * The UTC date and time to schedule the campaign for delivery in ISO 8601 format. Campaigns may only be scheduled to send on the quarter-hour (:00, :15, :30, :45).
   * @return scheduleTime
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCHEDULE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getScheduleTime() {
    return scheduleTime;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScheduleTime(OffsetDateTime scheduleTime) {
    this.scheduleTime = scheduleTime;
  }


  public PostCampaignsIdActionsScheduleRequest timewarp(Boolean timewarp) {
    
    this.timewarp = timewarp;
    return this;
  }

   /**
   * Choose whether the campaign should use [Timewarp](https://mailchimp.com/help/use-timewarp/) when sending. Campaigns scheduled with Timewarp are localized based on the recipients&#39; time zones. For example, a Timewarp campaign with a &#x60;schedule_time&#x60; of 13:00 will be sent to each recipient at 1:00pm in their local time. Cannot be set to &#x60;true&#x60; for campaigns using [Batch Delivery](https://mailchimp.com/help/schedule-batch-delivery/).
   * @return timewarp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEWARP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTimewarp() {
    return timewarp;
  }


  @JsonProperty(JSON_PROPERTY_TIMEWARP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimewarp(Boolean timewarp) {
    this.timewarp = timewarp;
  }


  public PostCampaignsIdActionsScheduleRequest batchDelivery(BatchDelivery batchDelivery) {
    
    this.batchDelivery = batchDelivery;
    return this;
  }

   /**
   * Get batchDelivery
   * @return batchDelivery
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATCH_DELIVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BatchDelivery getBatchDelivery() {
    return batchDelivery;
  }


  @JsonProperty(JSON_PROPERTY_BATCH_DELIVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBatchDelivery(BatchDelivery batchDelivery) {
    this.batchDelivery = batchDelivery;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCampaignsIdActionsScheduleRequest postCampaignsIdActionsScheduleRequest = (PostCampaignsIdActionsScheduleRequest) o;
    return Objects.equals(this.scheduleTime, postCampaignsIdActionsScheduleRequest.scheduleTime) &&
        Objects.equals(this.timewarp, postCampaignsIdActionsScheduleRequest.timewarp) &&
        Objects.equals(this.batchDelivery, postCampaignsIdActionsScheduleRequest.batchDelivery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleTime, timewarp, batchDelivery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCampaignsIdActionsScheduleRequest {\n");
    sb.append("    scheduleTime: ").append(toIndentedString(scheduleTime)).append("\n");
    sb.append("    timewarp: ").append(toIndentedString(timewarp)).append("\n");
    sb.append("    batchDelivery: ").append(toIndentedString(batchDelivery)).append("\n");
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

