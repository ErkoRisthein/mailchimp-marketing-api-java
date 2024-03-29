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
import io.github.erkoristhein.mailchimp.marketing.model.GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudience;
import io.github.erkoristhein.mailchimp.marketing.model.GetAllFacebookAds200ResponseFacebookAdsInnerAllOfBudget;
import io.github.erkoristhein.mailchimp.marketing.model.GetAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel;
import io.github.erkoristhein.mailchimp.marketing.model.GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity;
import io.github.erkoristhein.mailchimp.marketing.model.GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummary;
import io.github.erkoristhein.mailchimp.marketing.model.List10;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetReportingFacebookAdsId200Response
 */
@JsonPropertyOrder({
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_ID,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_WEB_ID,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_NAME,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_TYPE,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_STATUS,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_SHOW_REPORT,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_CREATE_TIME,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_START_TIME,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_UPDATED_AT,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_CANCELED_AT,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_PUBLISHED_TIME,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_HAS_SEGMENT,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_REPORT_SUMMARY,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_RECIPIENTS,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_THUMBNAIL,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_EMAIL_SOURCE_NAME,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_PAUSED_AT,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_END_TIME,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_NEEDS_ATTENTION,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_WAS_CANCELED_BY_FACEBOOK,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_CHANNEL,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_AUDIENCE,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_BUDGET,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_AUDIENCE_ACTIVITY,
  GetReportingFacebookAdsId200Response.JSON_PROPERTY_LINKS
})
@JsonTypeName("getReportingFacebookAdsId_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class GetReportingFacebookAdsId200Response {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_WEB_ID = "web_id";
  private Integer webId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * Supported Campaign, Ad, Page type
   */
  public enum TypeEnum {
    REGULAR("regular"),
    
    PLAINTEXT("plaintext"),
    
    RSS("rss"),
    
    RECONFIRM("reconfirm"),
    
    VARIATE("variate"),
    
    ABSPLIT("absplit"),
    
    AUTOMATION("automation"),
    
    FACEBOOK("facebook"),
    
    GOOGLE("google"),
    
    AUTORESPONDER("autoresponder"),
    
    TRANSACTIONAL("transactional"),
    
    PAGE("page"),
    
    WEBSITE("website"),
    
    SURVEY("survey");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  /**
   * Campaign, Ad, or Page status
   */
  public enum StatusEnum {
    SAVE("save"),
    
    PAUSED("paused"),
    
    SCHEDULE("schedule"),
    
    SENDING("sending"),
    
    SENT("sent"),
    
    CANCELED("canceled"),
    
    CANCELING("canceling"),
    
    ACTIVE("active"),
    
    DISCONNECTED("disconnected"),
    
    SOMEPAUSED("somepaused"),
    
    DRAFT("draft"),
    
    COMPLETED("completed"),
    
    PARTIALREJECTED("partialRejected"),
    
    PENDING("pending"),
    
    REJECTED("rejected"),
    
    PUBLISHED("published"),
    
    UNPUBLISHED("unpublished");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_SHOW_REPORT = "show_report";
  private Boolean showReport;

  public static final String JSON_PROPERTY_CREATE_TIME = "create_time";
  private OffsetDateTime createTime;

  public static final String JSON_PROPERTY_START_TIME = "start_time";
  private OffsetDateTime startTime;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_CANCELED_AT = "canceled_at";
  private OffsetDateTime canceledAt;

  public static final String JSON_PROPERTY_PUBLISHED_TIME = "published_time";
  private OffsetDateTime publishedTime;

  public static final String JSON_PROPERTY_HAS_SEGMENT = "has_segment";
  private Boolean hasSegment;

  public static final String JSON_PROPERTY_REPORT_SUMMARY = "report_summary";
  private GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummary reportSummary;

  public static final String JSON_PROPERTY_RECIPIENTS = "recipients";
  private List10 recipients;

  public static final String JSON_PROPERTY_THUMBNAIL = "thumbnail";
  private String thumbnail;

  public static final String JSON_PROPERTY_EMAIL_SOURCE_NAME = "email_source_name";
  private String emailSourceName;

  public static final String JSON_PROPERTY_PAUSED_AT = "paused_at";
  private OffsetDateTime pausedAt;

  public static final String JSON_PROPERTY_END_TIME = "end_time";
  private OffsetDateTime endTime;

  public static final String JSON_PROPERTY_NEEDS_ATTENTION = "needs_attention";
  private Boolean needsAttention;

  public static final String JSON_PROPERTY_WAS_CANCELED_BY_FACEBOOK = "was_canceled_by_facebook";
  private Boolean wasCanceledByFacebook;

  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private GetAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel channel;

  public static final String JSON_PROPERTY_AUDIENCE = "audience";
  private GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudience audience;

  public static final String JSON_PROPERTY_BUDGET = "budget";
  private GetAllFacebookAds200ResponseFacebookAdsInnerAllOfBudget budget;

  public static final String JSON_PROPERTY_AUDIENCE_ACTIVITY = "audience_activity";
  private GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity audienceActivity;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links;

  public GetReportingFacebookAdsId200Response() {
  }

  @JsonCreator
  public GetReportingFacebookAdsId200Response(
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.links = links;
  }

  public GetReportingFacebookAdsId200Response id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of an Outreach
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public GetReportingFacebookAdsId200Response webId(Integer webId) {
    
    this.webId = webId;
    return this;
  }

   /**
   * Web ID
   * @return webId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWebId() {
    return webId;
  }


  @JsonProperty(JSON_PROPERTY_WEB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebId(Integer webId) {
    this.webId = webId;
  }


  public GetReportingFacebookAdsId200Response name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Title or name of an Outreach
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public GetReportingFacebookAdsId200Response type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Supported Campaign, Ad, Page type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public GetReportingFacebookAdsId200Response status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Campaign, Ad, or Page status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public GetReportingFacebookAdsId200Response showReport(Boolean showReport) {
    
    this.showReport = showReport;
    return this;
  }

   /**
   * Outreach report availability
   * @return showReport
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowReport() {
    return showReport;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowReport(Boolean showReport) {
    this.showReport = showReport;
  }


  public GetReportingFacebookAdsId200Response createTime(OffsetDateTime createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreateTime() {
    return createTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }


  public GetReportingFacebookAdsId200Response startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public GetReportingFacebookAdsId200Response updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public GetReportingFacebookAdsId200Response canceledAt(OffsetDateTime canceledAt) {
    
    this.canceledAt = canceledAt;
    return this;
  }

   /**
   * Get canceledAt
   * @return canceledAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CANCELED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCanceledAt() {
    return canceledAt;
  }


  @JsonProperty(JSON_PROPERTY_CANCELED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanceledAt(OffsetDateTime canceledAt) {
    this.canceledAt = canceledAt;
  }


  public GetReportingFacebookAdsId200Response publishedTime(OffsetDateTime publishedTime) {
    
    this.publishedTime = publishedTime;
    return this;
  }

   /**
   * Get publishedTime
   * @return publishedTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLISHED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPublishedTime() {
    return publishedTime;
  }


  @JsonProperty(JSON_PROPERTY_PUBLISHED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublishedTime(OffsetDateTime publishedTime) {
    this.publishedTime = publishedTime;
  }


  public GetReportingFacebookAdsId200Response hasSegment(Boolean hasSegment) {
    
    this.hasSegment = hasSegment;
    return this;
  }

   /**
   * Get hasSegment
   * @return hasSegment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_SEGMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasSegment() {
    return hasSegment;
  }


  @JsonProperty(JSON_PROPERTY_HAS_SEGMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasSegment(Boolean hasSegment) {
    this.hasSegment = hasSegment;
  }


  public GetReportingFacebookAdsId200Response reportSummary(GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummary reportSummary) {
    
    this.reportSummary = reportSummary;
    return this;
  }

   /**
   * Get reportSummary
   * @return reportSummary
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPORT_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummary getReportSummary() {
    return reportSummary;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportSummary(GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummary reportSummary) {
    this.reportSummary = reportSummary;
  }


  public GetReportingFacebookAdsId200Response recipients(List10 recipients) {
    
    this.recipients = recipients;
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List10 getRecipients() {
    return recipients;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipients(List10 recipients) {
    this.recipients = recipients;
  }


  public GetReportingFacebookAdsId200Response thumbnail(String thumbnail) {
    
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * The URL of the thumbnail for this outreach
   * @return thumbnail
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THUMBNAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThumbnail() {
    return thumbnail;
  }


  @JsonProperty(JSON_PROPERTY_THUMBNAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }


  public GetReportingFacebookAdsId200Response emailSourceName(String emailSourceName) {
    
    this.emailSourceName = emailSourceName;
    return this;
  }

   /**
   * Get emailSourceName
   * @return emailSourceName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_SOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailSourceName() {
    return emailSourceName;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_SOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailSourceName(String emailSourceName) {
    this.emailSourceName = emailSourceName;
  }


  public GetReportingFacebookAdsId200Response pausedAt(OffsetDateTime pausedAt) {
    
    this.pausedAt = pausedAt;
    return this;
  }

   /**
   * Get pausedAt
   * @return pausedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAUSED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPausedAt() {
    return pausedAt;
  }


  @JsonProperty(JSON_PROPERTY_PAUSED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPausedAt(OffsetDateTime pausedAt) {
    this.pausedAt = pausedAt;
  }


  public GetReportingFacebookAdsId200Response endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public GetReportingFacebookAdsId200Response needsAttention(Boolean needsAttention) {
    
    this.needsAttention = needsAttention;
    return this;
  }

   /**
   * Get needsAttention
   * @return needsAttention
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEEDS_ATTENTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNeedsAttention() {
    return needsAttention;
  }


  @JsonProperty(JSON_PROPERTY_NEEDS_ATTENTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNeedsAttention(Boolean needsAttention) {
    this.needsAttention = needsAttention;
  }


  public GetReportingFacebookAdsId200Response wasCanceledByFacebook(Boolean wasCanceledByFacebook) {
    
    this.wasCanceledByFacebook = wasCanceledByFacebook;
    return this;
  }

   /**
   * Get wasCanceledByFacebook
   * @return wasCanceledByFacebook
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAS_CANCELED_BY_FACEBOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWasCanceledByFacebook() {
    return wasCanceledByFacebook;
  }


  @JsonProperty(JSON_PROPERTY_WAS_CANCELED_BY_FACEBOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWasCanceledByFacebook(Boolean wasCanceledByFacebook) {
    this.wasCanceledByFacebook = wasCanceledByFacebook;
  }


  public GetReportingFacebookAdsId200Response channel(GetAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel getChannel() {
    return channel;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannel(GetAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel channel) {
    this.channel = channel;
  }


  public GetReportingFacebookAdsId200Response audience(GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudience audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudience getAudience() {
    return audience;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudience(GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudience audience) {
    this.audience = audience;
  }


  public GetReportingFacebookAdsId200Response budget(GetAllFacebookAds200ResponseFacebookAdsInnerAllOfBudget budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetAllFacebookAds200ResponseFacebookAdsInnerAllOfBudget getBudget() {
    return budget;
  }


  @JsonProperty(JSON_PROPERTY_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBudget(GetAllFacebookAds200ResponseFacebookAdsInnerAllOfBudget budget) {
    this.budget = budget;
  }


  public GetReportingFacebookAdsId200Response audienceActivity(GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity audienceActivity) {
    
    this.audienceActivity = audienceActivity;
    return this;
  }

   /**
   * Get audienceActivity
   * @return audienceActivity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_ACTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity getAudienceActivity() {
    return audienceActivity;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_ACTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceActivity(GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity audienceActivity) {
    this.audienceActivity = audienceActivity;
  }


   /**
   * A list of link types and descriptions for the API schema documents.
   * @return links
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ResourceLink> getLinks() {
    return links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetReportingFacebookAdsId200Response getReportingFacebookAdsId200Response = (GetReportingFacebookAdsId200Response) o;
    return Objects.equals(this.id, getReportingFacebookAdsId200Response.id) &&
        Objects.equals(this.webId, getReportingFacebookAdsId200Response.webId) &&
        Objects.equals(this.name, getReportingFacebookAdsId200Response.name) &&
        Objects.equals(this.type, getReportingFacebookAdsId200Response.type) &&
        Objects.equals(this.status, getReportingFacebookAdsId200Response.status) &&
        Objects.equals(this.showReport, getReportingFacebookAdsId200Response.showReport) &&
        Objects.equals(this.createTime, getReportingFacebookAdsId200Response.createTime) &&
        Objects.equals(this.startTime, getReportingFacebookAdsId200Response.startTime) &&
        Objects.equals(this.updatedAt, getReportingFacebookAdsId200Response.updatedAt) &&
        Objects.equals(this.canceledAt, getReportingFacebookAdsId200Response.canceledAt) &&
        Objects.equals(this.publishedTime, getReportingFacebookAdsId200Response.publishedTime) &&
        Objects.equals(this.hasSegment, getReportingFacebookAdsId200Response.hasSegment) &&
        Objects.equals(this.reportSummary, getReportingFacebookAdsId200Response.reportSummary) &&
        Objects.equals(this.recipients, getReportingFacebookAdsId200Response.recipients) &&
        Objects.equals(this.thumbnail, getReportingFacebookAdsId200Response.thumbnail) &&
        Objects.equals(this.emailSourceName, getReportingFacebookAdsId200Response.emailSourceName) &&
        Objects.equals(this.pausedAt, getReportingFacebookAdsId200Response.pausedAt) &&
        Objects.equals(this.endTime, getReportingFacebookAdsId200Response.endTime) &&
        Objects.equals(this.needsAttention, getReportingFacebookAdsId200Response.needsAttention) &&
        Objects.equals(this.wasCanceledByFacebook, getReportingFacebookAdsId200Response.wasCanceledByFacebook) &&
        Objects.equals(this.channel, getReportingFacebookAdsId200Response.channel) &&
        Objects.equals(this.audience, getReportingFacebookAdsId200Response.audience) &&
        Objects.equals(this.budget, getReportingFacebookAdsId200Response.budget) &&
        Objects.equals(this.audienceActivity, getReportingFacebookAdsId200Response.audienceActivity) &&
        Objects.equals(this.links, getReportingFacebookAdsId200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, webId, name, type, status, showReport, createTime, startTime, updatedAt, canceledAt, publishedTime, hasSegment, reportSummary, recipients, thumbnail, emailSourceName, pausedAt, endTime, needsAttention, wasCanceledByFacebook, channel, audience, budget, audienceActivity, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReportingFacebookAdsId200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    webId: ").append(toIndentedString(webId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    showReport: ").append(toIndentedString(showReport)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    canceledAt: ").append(toIndentedString(canceledAt)).append("\n");
    sb.append("    publishedTime: ").append(toIndentedString(publishedTime)).append("\n");
    sb.append("    hasSegment: ").append(toIndentedString(hasSegment)).append("\n");
    sb.append("    reportSummary: ").append(toIndentedString(reportSummary)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    emailSourceName: ").append(toIndentedString(emailSourceName)).append("\n");
    sb.append("    pausedAt: ").append(toIndentedString(pausedAt)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    needsAttention: ").append(toIndentedString(needsAttention)).append("\n");
    sb.append("    wasCanceledByFacebook: ").append(toIndentedString(wasCanceledByFacebook)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    audienceActivity: ").append(toIndentedString(audienceActivity)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

