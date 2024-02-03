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
import io.github.erkoristhein.mailchimp.marketing.model.GetReportsIdEcommerceProductActivity200ResponseProductsInner;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A collection of ecommerce products.
 */
@JsonPropertyOrder({
  GetReportsIdEcommerceProductActivity200Response.JSON_PROPERTY_PRODUCTS,
  GetReportsIdEcommerceProductActivity200Response.JSON_PROPERTY_TOTAL_ITEMS,
  GetReportsIdEcommerceProductActivity200Response.JSON_PROPERTY_LINKS
})
@JsonTypeName("getReportsIdEcommerceProductActivity_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class GetReportsIdEcommerceProductActivity200Response {
  public static final String JSON_PROPERTY_PRODUCTS = "products";
  private List<GetReportsIdEcommerceProductActivity200ResponseProductsInner> products;

  public static final String JSON_PROPERTY_TOTAL_ITEMS = "total_items";
  private Integer totalItems;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links;

  public GetReportsIdEcommerceProductActivity200Response() {
  }

  @JsonCreator
  public GetReportsIdEcommerceProductActivity200Response(
    @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS) Integer totalItems, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.totalItems = totalItems;
    this.links = links;
  }

  public GetReportsIdEcommerceProductActivity200Response products(List<GetReportsIdEcommerceProductActivity200ResponseProductsInner> products) {
    
    this.products = products;
    return this;
  }

  public GetReportsIdEcommerceProductActivity200Response addProductsItem(GetReportsIdEcommerceProductActivity200ResponseProductsInner productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetReportsIdEcommerceProductActivity200ResponseProductsInner> getProducts() {
    return products;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProducts(List<GetReportsIdEcommerceProductActivity200ResponseProductsInner> products) {
    this.products = products;
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
    GetReportsIdEcommerceProductActivity200Response getReportsIdEcommerceProductActivity200Response = (GetReportsIdEcommerceProductActivity200Response) o;
    return Objects.equals(this.products, getReportsIdEcommerceProductActivity200Response.products) &&
        Objects.equals(this.totalItems, getReportsIdEcommerceProductActivity200Response.totalItems) &&
        Objects.equals(this.links, getReportsIdEcommerceProductActivity200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products, totalItems, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReportsIdEcommerceProductActivity200Response {\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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
