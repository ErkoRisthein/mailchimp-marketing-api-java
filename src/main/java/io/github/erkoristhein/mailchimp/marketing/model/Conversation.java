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
import io.github.erkoristhein.mailchimp.marketing.model.LastMessage;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Details about an individual conversation. Conversation tracking is a feature available to paid accounts that lets you view replies to your campaigns in your Mailchimp account.
 */
@JsonPropertyOrder({
  Conversation.JSON_PROPERTY_ID,
  Conversation.JSON_PROPERTY_MESSAGE_COUNT,
  Conversation.JSON_PROPERTY_CAMPAIGN_ID,
  Conversation.JSON_PROPERTY_LIST_ID,
  Conversation.JSON_PROPERTY_UNREAD_MESSAGES,
  Conversation.JSON_PROPERTY_FROM_LABEL,
  Conversation.JSON_PROPERTY_FROM_EMAIL,
  Conversation.JSON_PROPERTY_SUBJECT,
  Conversation.JSON_PROPERTY_LAST_MESSAGE,
  Conversation.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class Conversation {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MESSAGE_COUNT = "message_count";
  private Integer messageCount;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaign_id";
  private String campaignId;

  public static final String JSON_PROPERTY_LIST_ID = "list_id";
  private String listId;

  public static final String JSON_PROPERTY_UNREAD_MESSAGES = "unread_messages";
  private Integer unreadMessages;

  public static final String JSON_PROPERTY_FROM_LABEL = "from_label";
  private String fromLabel;

  public static final String JSON_PROPERTY_FROM_EMAIL = "from_email";
  private String fromEmail;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_LAST_MESSAGE = "last_message";
  private LastMessage lastMessage;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links = new ArrayList<>();

  public Conversation() {
  }

  @JsonCreator
  public Conversation(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_MESSAGE_COUNT) Integer messageCount, 
    @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID) String campaignId, 
    @JsonProperty(JSON_PROPERTY_LIST_ID) String listId, 
    @JsonProperty(JSON_PROPERTY_UNREAD_MESSAGES) Integer unreadMessages, 
    @JsonProperty(JSON_PROPERTY_FROM_LABEL) String fromLabel, 
    @JsonProperty(JSON_PROPERTY_FROM_EMAIL) String fromEmail, 
    @JsonProperty(JSON_PROPERTY_SUBJECT) String subject, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.id = id;
    this.messageCount = messageCount;
    this.campaignId = campaignId;
    this.listId = listId;
    this.unreadMessages = unreadMessages;
    this.fromLabel = fromLabel;
    this.fromEmail = fromEmail;
    this.subject = subject;
    this.links = links;
  }

   /**
   * A string that uniquely identifies this conversation.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * The total number of messages in this conversation.
   * @return messageCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMessageCount() {
    return messageCount;
  }




   /**
   * The unique identifier of the campaign for this conversation.
   * @return campaignId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignId() {
    return campaignId;
  }




   /**
   * The unique identifier of the list for this conversation.
   * @return listId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getListId() {
    return listId;
  }




   /**
   * The number of unread messages in this conversation.
   * @return unreadMessages
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNREAD_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUnreadMessages() {
    return unreadMessages;
  }




   /**
   * A label representing the sender of this message.
   * @return fromLabel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromLabel() {
    return fromLabel;
  }




   /**
   * A label representing the email of the sender of this message.
   * @return fromEmail
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromEmail() {
    return fromEmail;
  }




   /**
   * The subject of the message.
   * @return subject
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubject() {
    return subject;
  }




  public Conversation lastMessage(LastMessage lastMessage) {
    
    this.lastMessage = lastMessage;
    return this;
  }

   /**
   * Get lastMessage
   * @return lastMessage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LastMessage getLastMessage() {
    return lastMessage;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastMessage(LastMessage lastMessage) {
    this.lastMessage = lastMessage;
  }


   /**
   * A list of link types and descriptions for the API schema documents.
   * @return links
  **/
  @jakarta.annotation.Nullable
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
    Conversation conversation = (Conversation) o;
    return Objects.equals(this.id, conversation.id) &&
        Objects.equals(this.messageCount, conversation.messageCount) &&
        Objects.equals(this.campaignId, conversation.campaignId) &&
        Objects.equals(this.listId, conversation.listId) &&
        Objects.equals(this.unreadMessages, conversation.unreadMessages) &&
        Objects.equals(this.fromLabel, conversation.fromLabel) &&
        Objects.equals(this.fromEmail, conversation.fromEmail) &&
        Objects.equals(this.subject, conversation.subject) &&
        Objects.equals(this.lastMessage, conversation.lastMessage) &&
        Objects.equals(this.links, conversation.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, messageCount, campaignId, listId, unreadMessages, fromLabel, fromEmail, subject, lastMessage, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conversation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messageCount: ").append(toIndentedString(messageCount)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    unreadMessages: ").append(toIndentedString(unreadMessages)).append("\n");
    sb.append("    fromLabel: ").append(toIndentedString(fromLabel)).append("\n");
    sb.append("    fromEmail: ").append(toIndentedString(fromEmail)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    lastMessage: ").append(toIndentedString(lastMessage)).append("\n");
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

