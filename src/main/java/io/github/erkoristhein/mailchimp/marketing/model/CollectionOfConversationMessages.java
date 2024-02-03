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
import io.github.erkoristhein.mailchimp.marketing.model.ConversationMessage;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Messages from a specific conversation.
 */
@JsonPropertyOrder({
  CollectionOfConversationMessages.JSON_PROPERTY_CONVERSATION_MESSAGES,
  CollectionOfConversationMessages.JSON_PROPERTY_CONVERSATION_ID,
  CollectionOfConversationMessages.JSON_PROPERTY_TOTAL_ITEMS,
  CollectionOfConversationMessages.JSON_PROPERTY_LINKS
})
@JsonTypeName("Collection_of_Conversation_Messages")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class CollectionOfConversationMessages {
  public static final String JSON_PROPERTY_CONVERSATION_MESSAGES = "conversation_messages";
  private List<ConversationMessage> conversationMessages;

  public static final String JSON_PROPERTY_CONVERSATION_ID = "conversation_id";
  private String conversationId;

  public static final String JSON_PROPERTY_TOTAL_ITEMS = "total_items";
  private Integer totalItems;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links;

  public CollectionOfConversationMessages() {
  }

  @JsonCreator
  public CollectionOfConversationMessages(
    @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS) Integer totalItems, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.totalItems = totalItems;
    this.links = links;
  }

  public CollectionOfConversationMessages conversationMessages(List<ConversationMessage> conversationMessages) {
    
    this.conversationMessages = conversationMessages;
    return this;
  }

  public CollectionOfConversationMessages addConversationMessagesItem(ConversationMessage conversationMessagesItem) {
    if (this.conversationMessages == null) {
      this.conversationMessages = new ArrayList<>();
    }
    this.conversationMessages.add(conversationMessagesItem);
    return this;
  }

   /**
   * An array of objects, each representing a conversation messages resources.
   * @return conversationMessages
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSATION_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConversationMessage> getConversationMessages() {
    return conversationMessages;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSATION_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversationMessages(List<ConversationMessage> conversationMessages) {
    this.conversationMessages = conversationMessages;
  }


  public CollectionOfConversationMessages conversationId(String conversationId) {
    
    this.conversationId = conversationId;
    return this;
  }

   /**
   * A string that identifies this conversation.
   * @return conversationId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConversationId() {
    return conversationId;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


   /**
   * The total number of items matching the query regardless of pagination.
   * @return totalItems
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalItems() {
    return totalItems;
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
    CollectionOfConversationMessages collectionOfConversationMessages = (CollectionOfConversationMessages) o;
    return Objects.equals(this.conversationMessages, collectionOfConversationMessages.conversationMessages) &&
        Objects.equals(this.conversationId, collectionOfConversationMessages.conversationId) &&
        Objects.equals(this.totalItems, collectionOfConversationMessages.totalItems) &&
        Objects.equals(this.links, collectionOfConversationMessages.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationMessages, conversationId, totalItems, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionOfConversationMessages {\n");
    sb.append("    conversationMessages: ").append(toIndentedString(conversationMessages)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
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

