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
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceCart;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A collection of a store&#39;s carts.
 */
@JsonPropertyOrder({
  Carts.JSON_PROPERTY_STORE_ID,
  Carts.JSON_PROPERTY_CARTS,
  Carts.JSON_PROPERTY_TOTAL_ITEMS,
  Carts.JSON_PROPERTY_LINKS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class Carts {
  public static final String JSON_PROPERTY_STORE_ID = "store_id";
  private String storeId;

  public static final String JSON_PROPERTY_CARTS = "carts";
  private List<ECommerceCart> carts;

  public static final String JSON_PROPERTY_TOTAL_ITEMS = "total_items";
  private Integer totalItems;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links;

  public Carts() {
  }

  @JsonCreator
  public Carts(
    @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS) Integer totalItems, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.totalItems = totalItems;
    this.links = links;
  }

  public Carts storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * The store id.
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


  public Carts carts(List<ECommerceCart> carts) {
    
    this.carts = carts;
    return this;
  }

  public Carts addCartsItem(ECommerceCart cartsItem) {
    if (this.carts == null) {
      this.carts = new ArrayList<>();
    }
    this.carts.add(cartsItem);
    return this;
  }

   /**
   * An array of objects, each representing a cart.
   * @return carts
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ECommerceCart> getCarts() {
    return carts;
  }


  @JsonProperty(JSON_PROPERTY_CARTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarts(List<ECommerceCart> carts) {
    this.carts = carts;
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
    Carts carts = (Carts) o;
    return Objects.equals(this.storeId, carts.storeId) &&
        Objects.equals(this.carts, carts.carts) &&
        Objects.equals(this.totalItems, carts.totalItems) &&
        Objects.equals(this.links, carts.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, carts, totalItems, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carts {\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    carts: ").append(toIndentedString(carts)).append("\n");
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

