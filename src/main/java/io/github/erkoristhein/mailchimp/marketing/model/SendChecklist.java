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
import io.github.erkoristhein.mailchimp.marketing.model.ItemsInner;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The send checklist for the campaign.
 */
@JsonPropertyOrder({
  SendChecklist.JSON_PROPERTY_IS_READY,
  SendChecklist.JSON_PROPERTY_ITEMS,
  SendChecklist.JSON_PROPERTY_LINKS
})
@JsonTypeName("Send_Checklist")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class SendChecklist {
  public static final String JSON_PROPERTY_IS_READY = "is_ready";
  private Boolean isReady;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<ItemsInner> items = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links = new ArrayList<>();

  public SendChecklist() {
  }

  @JsonCreator
  public SendChecklist(
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.links = links;
  }

  public SendChecklist isReady(Boolean isReady) {
    
    this.isReady = isReady;
    return this;
  }

   /**
   * Whether the campaign is ready to send.
   * @return isReady
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_READY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsReady() {
    return isReady;
  }


  @JsonProperty(JSON_PROPERTY_IS_READY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsReady(Boolean isReady) {
    this.isReady = isReady;
  }


  public SendChecklist items(List<ItemsInner> items) {
    
    this.items = items;
    return this;
  }

  public SendChecklist addItemsItem(ItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of feedback items to review before sending your campaign.
   * @return items
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ItemsInner> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<ItemsInner> items) {
    this.items = items;
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
    SendChecklist sendChecklist = (SendChecklist) o;
    return Objects.equals(this.isReady, sendChecklist.isReady) &&
        Objects.equals(this.items, sendChecklist.items) &&
        Objects.equals(this.links, sendChecklist.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isReady, items, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendChecklist {\n");
    sb.append("    isReady: ").append(toIndentedString(isReady)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

