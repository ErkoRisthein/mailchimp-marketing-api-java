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
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceOrderLineItem;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A collection of an order&#39;s line items.
 */
@JsonPropertyOrder({
  OrderLines.JSON_PROPERTY_STORE_ID,
  OrderLines.JSON_PROPERTY_ORDER_ID,
  OrderLines.JSON_PROPERTY_LINES,
  OrderLines.JSON_PROPERTY_TOTAL_ITEMS,
  OrderLines.JSON_PROPERTY_LINKS
})
@JsonTypeName("Order_Lines")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class OrderLines {
  public static final String JSON_PROPERTY_STORE_ID = "store_id";
  private String storeId;

  public static final String JSON_PROPERTY_ORDER_ID = "order_id";
  private String orderId;

  public static final String JSON_PROPERTY_LINES = "lines";
  private List<ECommerceOrderLineItem> lines = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_ITEMS = "total_items";
  private Integer totalItems;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links = new ArrayList<>();

  public OrderLines() {
  }

  @JsonCreator
  public OrderLines(
    @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS) Integer totalItems, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.totalItems = totalItems;
    this.links = links;
  }

  public OrderLines storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * The store id.
   * @return storeId
  **/
  @jakarta.annotation.Nullable
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


  public OrderLines orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * The order id.
   * @return orderId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrderId() {
    return orderId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public OrderLines lines(List<ECommerceOrderLineItem> lines) {
    
    this.lines = lines;
    return this;
  }

  public OrderLines addLinesItem(ECommerceOrderLineItem linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * An array of objects, each representing an order&#39;s line item.
   * @return lines
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ECommerceOrderLineItem> getLines() {
    return lines;
  }


  @JsonProperty(JSON_PROPERTY_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLines(List<ECommerceOrderLineItem> lines) {
    this.lines = lines;
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
    OrderLines orderLines = (OrderLines) o;
    return Objects.equals(this.storeId, orderLines.storeId) &&
        Objects.equals(this.orderId, orderLines.orderId) &&
        Objects.equals(this.lines, orderLines.lines) &&
        Objects.equals(this.totalItems, orderLines.totalItems) &&
        Objects.equals(this.links, orderLines.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, orderId, lines, totalItems, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLines {\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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

