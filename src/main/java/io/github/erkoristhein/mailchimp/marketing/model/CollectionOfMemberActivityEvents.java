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
import io.github.erkoristhein.mailchimp.marketing.model.Goal;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The last 50 Goal events for a member on a specific list.
 */
@JsonPropertyOrder({
  CollectionOfMemberActivityEvents.JSON_PROPERTY_GOALS,
  CollectionOfMemberActivityEvents.JSON_PROPERTY_LIST_ID,
  CollectionOfMemberActivityEvents.JSON_PROPERTY_EMAIL_ID,
  CollectionOfMemberActivityEvents.JSON_PROPERTY_TOTAL_ITEMS,
  CollectionOfMemberActivityEvents.JSON_PROPERTY_LINKS
})
@JsonTypeName("Collection_of_Member_Activity_Events")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class CollectionOfMemberActivityEvents {
  public static final String JSON_PROPERTY_GOALS = "goals";
  private List<Goal> goals = new ArrayList<>();

  public static final String JSON_PROPERTY_LIST_ID = "list_id";
  private String listId;

  public static final String JSON_PROPERTY_EMAIL_ID = "email_id";
  private String emailId;

  public static final String JSON_PROPERTY_TOTAL_ITEMS = "total_items";
  private Integer totalItems;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links = new ArrayList<>();

  public CollectionOfMemberActivityEvents() {
  }

  @JsonCreator
  public CollectionOfMemberActivityEvents(
    @JsonProperty(JSON_PROPERTY_LIST_ID) String listId, 
    @JsonProperty(JSON_PROPERTY_EMAIL_ID) String emailId, 
    @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS) Integer totalItems, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.listId = listId;
    this.emailId = emailId;
    this.totalItems = totalItems;
    this.links = links;
  }

  public CollectionOfMemberActivityEvents goals(List<Goal> goals) {
    
    this.goals = goals;
    return this;
  }

  public CollectionOfMemberActivityEvents addGoalsItem(Goal goalsItem) {
    if (this.goals == null) {
      this.goals = new ArrayList<>();
    }
    this.goals.add(goalsItem);
    return this;
  }

   /**
   * The last 50 Goal events triggered by a member.
   * @return goals
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GOALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Goal> getGoals() {
    return goals;
  }


  @JsonProperty(JSON_PROPERTY_GOALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoals(List<Goal> goals) {
    this.goals = goals;
  }


   /**
   * The list id.
   * @return listId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getListId() {
    return listId;
  }




   /**
   * The MD5 hash of the lowercase version of the list member&#39;s email address.
   * @return emailId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailId() {
    return emailId;
  }




   /**
   * The total number of items matching the query regardless of pagination.
   * @return totalItems
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalItems() {
    return totalItems;
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
    CollectionOfMemberActivityEvents collectionOfMemberActivityEvents = (CollectionOfMemberActivityEvents) o;
    return Objects.equals(this.goals, collectionOfMemberActivityEvents.goals) &&
        Objects.equals(this.listId, collectionOfMemberActivityEvents.listId) &&
        Objects.equals(this.emailId, collectionOfMemberActivityEvents.emailId) &&
        Objects.equals(this.totalItems, collectionOfMemberActivityEvents.totalItems) &&
        Objects.equals(this.links, collectionOfMemberActivityEvents.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goals, listId, emailId, totalItems, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionOfMemberActivityEvents {\n");
    sb.append("    goals: ").append(toIndentedString(goals)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
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

