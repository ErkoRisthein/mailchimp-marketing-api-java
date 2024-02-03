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
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import io.github.erkoristhein.mailchimp.marketing.model.TrackingSettings;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A summary of an individual landing page&#39;s settings and content.
 */
@JsonPropertyOrder({
  LandingPage.JSON_PROPERTY_ID,
  LandingPage.JSON_PROPERTY_NAME,
  LandingPage.JSON_PROPERTY_TITLE,
  LandingPage.JSON_PROPERTY_DESCRIPTION,
  LandingPage.JSON_PROPERTY_TEMPLATE_ID,
  LandingPage.JSON_PROPERTY_STATUS,
  LandingPage.JSON_PROPERTY_LIST_ID,
  LandingPage.JSON_PROPERTY_STORE_ID,
  LandingPage.JSON_PROPERTY_WEB_ID,
  LandingPage.JSON_PROPERTY_CREATED_BY_SOURCE,
  LandingPage.JSON_PROPERTY_URL,
  LandingPage.JSON_PROPERTY_CREATED_AT,
  LandingPage.JSON_PROPERTY_PUBLISHED_AT,
  LandingPage.JSON_PROPERTY_UNPUBLISHED_AT,
  LandingPage.JSON_PROPERTY_UPDATED_AT,
  LandingPage.JSON_PROPERTY_TRACKING,
  LandingPage.JSON_PROPERTY_LINKS
})
@JsonTypeName("Landing_Page")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class LandingPage {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TEMPLATE_ID = "template_id";
  private Integer templateId;

  /**
   * The status of this landing page.
   */
  public enum StatusEnum {
    PUBLISHED("published"),
    
    UNPUBLISHED("unpublished"),
    
    DRAFT("draft");

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

  public static final String JSON_PROPERTY_LIST_ID = "list_id";
  private String listId;

  public static final String JSON_PROPERTY_STORE_ID = "store_id";
  private String storeId;

  public static final String JSON_PROPERTY_WEB_ID = "web_id";
  private Integer webId;

  public static final String JSON_PROPERTY_CREATED_BY_SOURCE = "created_by_source";
  private String createdBySource;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_PUBLISHED_AT = "published_at";
  private OffsetDateTime publishedAt;

  public static final String JSON_PROPERTY_UNPUBLISHED_AT = "unpublished_at";
  private OffsetDateTime unpublishedAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_TRACKING = "tracking";
  private TrackingSettings tracking;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links;

  public LandingPage() {
  }

  @JsonCreator
  public LandingPage(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_TEMPLATE_ID) Integer templateId, 
    @JsonProperty(JSON_PROPERTY_STATUS) StatusEnum status, 
    @JsonProperty(JSON_PROPERTY_CREATED_BY_SOURCE) String createdBySource, 
    @JsonProperty(JSON_PROPERTY_URL) String url, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt, 
    @JsonProperty(JSON_PROPERTY_PUBLISHED_AT) OffsetDateTime publishedAt, 
    @JsonProperty(JSON_PROPERTY_UNPUBLISHED_AT) OffsetDateTime unpublishedAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.id = id;
    this.templateId = templateId;
    this.status = status;
    this.createdBySource = createdBySource;
    this.url = url;
    this.createdAt = createdAt;
    this.publishedAt = publishedAt;
    this.unpublishedAt = unpublishedAt;
    this.updatedAt = updatedAt;
    this.links = links;
  }

   /**
   * A string that uniquely identifies this landing page.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public LandingPage name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this landing page.
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


  public LandingPage title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of this landing page seen in the browser&#39;s title bar.
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public LandingPage description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of this landing page.
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * The template_id of this landing page.
   * @return templateId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTemplateId() {
    return templateId;
  }




   /**
   * The status of this landing page.
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }




  public LandingPage listId(String listId) {
    
    this.listId = listId;
    return this;
  }

   /**
   * The list&#39;s ID associated with this landing page.
   * @return listId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getListId() {
    return listId;
  }


  @JsonProperty(JSON_PROPERTY_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListId(String listId) {
    this.listId = listId;
  }


  public LandingPage storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * The ID of the store associated with this landing page.
   * @return storeId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoreId() {
    return storeId;
  }


  @JsonProperty(JSON_PROPERTY_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public LandingPage webId(Integer webId) {
    
    this.webId = webId;
    return this;
  }

   /**
   * The ID used in the Mailchimp web application.
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


   /**
   * Created by mobile or web
   * @return createdBySource
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedBySource() {
    return createdBySource;
  }




   /**
   * The url of the published landing page.
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }




   /**
   * The time this landing page was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * The time this landing page was published.
   * @return publishedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }




   /**
   * The time this landing page was unpublished.
   * @return unpublishedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNPUBLISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUnpublishedAt() {
    return unpublishedAt;
  }




   /**
   * The time this landing page was updated at.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  public LandingPage tracking(TrackingSettings tracking) {
    
    this.tracking = tracking;
    return this;
  }

   /**
   * Get tracking
   * @return tracking
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrackingSettings getTracking() {
    return tracking;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTracking(TrackingSettings tracking) {
    this.tracking = tracking;
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
    LandingPage landingPage = (LandingPage) o;
    return Objects.equals(this.id, landingPage.id) &&
        Objects.equals(this.name, landingPage.name) &&
        Objects.equals(this.title, landingPage.title) &&
        Objects.equals(this.description, landingPage.description) &&
        Objects.equals(this.templateId, landingPage.templateId) &&
        Objects.equals(this.status, landingPage.status) &&
        Objects.equals(this.listId, landingPage.listId) &&
        Objects.equals(this.storeId, landingPage.storeId) &&
        Objects.equals(this.webId, landingPage.webId) &&
        Objects.equals(this.createdBySource, landingPage.createdBySource) &&
        Objects.equals(this.url, landingPage.url) &&
        Objects.equals(this.createdAt, landingPage.createdAt) &&
        Objects.equals(this.publishedAt, landingPage.publishedAt) &&
        Objects.equals(this.unpublishedAt, landingPage.unpublishedAt) &&
        Objects.equals(this.updatedAt, landingPage.updatedAt) &&
        Objects.equals(this.tracking, landingPage.tracking) &&
        Objects.equals(this.links, landingPage.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, title, description, templateId, status, listId, storeId, webId, createdBySource, url, createdAt, publishedAt, unpublishedAt, updatedAt, tracking, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LandingPage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    webId: ").append(toIndentedString(webId)).append("\n");
    sb.append("    createdBySource: ").append(toIndentedString(createdBySource)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    unpublishedAt: ").append(toIndentedString(unpublishedAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
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
