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
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import io.github.erkoristhein.mailchimp.marketing.model.TagsInner2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A list of tags assigned to a list member.
 */
@JsonPropertyOrder({
  CollectionOfTags.JSON_PROPERTY_TAGS,
  CollectionOfTags.JSON_PROPERTY_TOTAL_ITEMS,
  CollectionOfTags.JSON_PROPERTY_LINKS
})
@JsonTypeName("Collection_of_Tags")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class CollectionOfTags {
  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<TagsInner2> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_ITEMS = "total_items";
  private Integer totalItems;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links = new ArrayList<>();

  public CollectionOfTags() {
  }

  @JsonCreator
  public CollectionOfTags(
    @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS) Integer totalItems, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.totalItems = totalItems;
    this.links = links;
  }

  public CollectionOfTags tags(List<TagsInner2> tags) {
    
    this.tags = tags;
    return this;
  }

  public CollectionOfTags addTagsItem(TagsInner2 tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of tags assigned to the list member.
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TagsInner2> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<TagsInner2> tags) {
    this.tags = tags;
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
    CollectionOfTags collectionOfTags = (CollectionOfTags) o;
    return Objects.equals(this.tags, collectionOfTags.tags) &&
        Objects.equals(this.totalItems, collectionOfTags.totalItems) &&
        Objects.equals(this.links, collectionOfTags.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, totalItems, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionOfTags {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

