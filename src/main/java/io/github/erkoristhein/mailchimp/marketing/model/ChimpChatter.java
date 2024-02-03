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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A Chimp Chatter message
 */
@JsonPropertyOrder({
  ChimpChatter.JSON_PROPERTY_TITLE,
  ChimpChatter.JSON_PROPERTY_MESSAGE,
  ChimpChatter.JSON_PROPERTY_TYPE,
  ChimpChatter.JSON_PROPERTY_UPDATE_TIME,
  ChimpChatter.JSON_PROPERTY_URL,
  ChimpChatter.JSON_PROPERTY_LIST_ID,
  ChimpChatter.JSON_PROPERTY_CAMPAIGN_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class ChimpChatter {
  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  /**
   * The type of activity
   */
  public enum TypeEnum {
    LISTS_NEW_SUBSCRIBER("lists:new-subscriber"),
    
    LISTS_UNSUBSCRIBES("lists:unsubscribes"),
    
    LISTS_PROFILE_UPDATES("lists:profile-updates"),
    
    CAMPAIGNS_FACEBOOK_LIKES("campaigns:facebook-likes"),
    
    CAMPAIGNS_FORWARD_TO_FRIEND("campaigns:forward-to-friend"),
    
    LISTS_IMPORTS("lists:imports");

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

  public static final String JSON_PROPERTY_UPDATE_TIME = "update_time";
  private OffsetDateTime updateTime;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_LIST_ID = "list_id";
  private String listId;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaign_id";
  private String campaignId;

  public ChimpChatter() {
  }

  @JsonCreator
  public ChimpChatter(
    @JsonProperty(JSON_PROPERTY_TITLE) String title, 
    @JsonProperty(JSON_PROPERTY_MESSAGE) String message, 
    @JsonProperty(JSON_PROPERTY_TYPE) TypeEnum type, 
    @JsonProperty(JSON_PROPERTY_UPDATE_TIME) OffsetDateTime updateTime, 
    @JsonProperty(JSON_PROPERTY_URL) String url, 
    @JsonProperty(JSON_PROPERTY_LIST_ID) String listId, 
    @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID) String campaignId
  ) {
    this();
    this.title = title;
    this.message = message;
    this.type = type;
    this.updateTime = updateTime;
    this.url = url;
    this.listId = listId;
    this.campaignId = campaignId;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }




   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }




   /**
   * The type of activity
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }




   /**
   * The date and time this activity was updated.
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }




   /**
   * URL to a report that includes this activity
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }




   /**
   * If it exists, list ID for the associated list
   * @return listId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getListId() {
    return listId;
  }




   /**
   * If it exists, campaign ID for the associated campaign
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignId() {
    return campaignId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChimpChatter chimpChatter = (ChimpChatter) o;
    return Objects.equals(this.title, chimpChatter.title) &&
        Objects.equals(this.message, chimpChatter.message) &&
        Objects.equals(this.type, chimpChatter.type) &&
        Objects.equals(this.updateTime, chimpChatter.updateTime) &&
        Objects.equals(this.url, chimpChatter.url) &&
        Objects.equals(this.listId, chimpChatter.listId) &&
        Objects.equals(this.campaignId, chimpChatter.campaignId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, message, type, updateTime, url, listId, campaignId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChimpChatter {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
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

