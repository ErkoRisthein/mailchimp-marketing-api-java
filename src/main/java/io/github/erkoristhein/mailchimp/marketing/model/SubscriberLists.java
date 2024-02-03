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
import io.github.erkoristhein.mailchimp.marketing.model.CollectionAuthorization;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import io.github.erkoristhein.mailchimp.marketing.model.SubscriberList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A collection of subscriber lists for this account. Lists contain subscribers who have opted-in to receive correspondence from you or your organization.
 */
@JsonPropertyOrder({
  SubscriberLists.JSON_PROPERTY_LISTS,
  SubscriberLists.JSON_PROPERTY_TOTAL_ITEMS,
  SubscriberLists.JSON_PROPERTY_CONSTRAINTS,
  SubscriberLists.JSON_PROPERTY_LINKS
})
@JsonTypeName("Subscriber_Lists")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class SubscriberLists {
  public static final String JSON_PROPERTY_LISTS = "lists";
  private List<SubscriberList> lists = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_ITEMS = "total_items";
  private Integer totalItems;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private CollectionAuthorization constraints;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links;

  public SubscriberLists() {
  }

  @JsonCreator
  public SubscriberLists(
    @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS) Integer totalItems, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.totalItems = totalItems;
    this.links = links;
  }

  public SubscriberLists lists(List<SubscriberList> lists) {
    
    this.lists = lists;
    return this;
  }

  public SubscriberLists addListsItem(SubscriberList listsItem) {
    if (this.lists == null) {
      this.lists = new ArrayList<>();
    }
    this.lists.add(listsItem);
    return this;
  }

   /**
   * An array of objects, each representing a list.
   * @return lists
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LISTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SubscriberList> getLists() {
    return lists;
  }


  @JsonProperty(JSON_PROPERTY_LISTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLists(List<SubscriberList> lists) {
    this.lists = lists;
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




  public SubscriberLists constraints(CollectionAuthorization constraints) {
    
    this.constraints = constraints;
    return this;
  }

   /**
   * Get constraints
   * @return constraints
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CollectionAuthorization getConstraints() {
    return constraints;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstraints(CollectionAuthorization constraints) {
    this.constraints = constraints;
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
    SubscriberLists subscriberLists = (SubscriberLists) o;
    return Objects.equals(this.lists, subscriberLists.lists) &&
        Objects.equals(this.totalItems, subscriberLists.totalItems) &&
        Objects.equals(this.constraints, subscriberLists.constraints) &&
        Objects.equals(this.links, subscriberLists.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lists, totalItems, constraints, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriberLists {\n");
    sb.append("    lists: ").append(toIndentedString(lists)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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
