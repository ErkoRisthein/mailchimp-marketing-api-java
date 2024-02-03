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
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceProductVariant;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A collection of a product&#39;s variants.
 */
@JsonPropertyOrder({
  EcommerceProductVariants.JSON_PROPERTY_STORE_ID,
  EcommerceProductVariants.JSON_PROPERTY_PRODUCT_ID,
  EcommerceProductVariants.JSON_PROPERTY_VARIANTS,
  EcommerceProductVariants.JSON_PROPERTY_TOTAL_ITEMS,
  EcommerceProductVariants.JSON_PROPERTY_LINKS
})
@JsonTypeName("Ecommerce_Product_Variants")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class EcommerceProductVariants {
  public static final String JSON_PROPERTY_STORE_ID = "store_id";
  private String storeId;

  public static final String JSON_PROPERTY_PRODUCT_ID = "product_id";
  private String productId;

  public static final String JSON_PROPERTY_VARIANTS = "variants";
  private List<ECommerceProductVariant> variants;

  public static final String JSON_PROPERTY_TOTAL_ITEMS = "total_items";
  private Integer totalItems;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links;

  public EcommerceProductVariants() {
  }

  @JsonCreator
  public EcommerceProductVariants(
    @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS) Integer totalItems, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.totalItems = totalItems;
    this.links = links;
  }

  public EcommerceProductVariants storeId(String storeId) {
    
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


  public EcommerceProductVariants productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * The product id.
   * @return productId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductId() {
    return productId;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductId(String productId) {
    this.productId = productId;
  }


  public EcommerceProductVariants variants(List<ECommerceProductVariant> variants) {
    
    this.variants = variants;
    return this;
  }

  public EcommerceProductVariants addVariantsItem(ECommerceProductVariant variantsItem) {
    if (this.variants == null) {
      this.variants = new ArrayList<>();
    }
    this.variants.add(variantsItem);
    return this;
  }

   /**
   * An array of objects, each representing a product&#39;s variants.
   * @return variants
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ECommerceProductVariant> getVariants() {
    return variants;
  }


  @JsonProperty(JSON_PROPERTY_VARIANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVariants(List<ECommerceProductVariant> variants) {
    this.variants = variants;
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
    EcommerceProductVariants ecommerceProductVariants = (EcommerceProductVariants) o;
    return Objects.equals(this.storeId, ecommerceProductVariants.storeId) &&
        Objects.equals(this.productId, ecommerceProductVariants.productId) &&
        Objects.equals(this.variants, ecommerceProductVariants.variants) &&
        Objects.equals(this.totalItems, ecommerceProductVariants.totalItems) &&
        Objects.equals(this.links, ecommerceProductVariants.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, productId, variants, totalItems, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EcommerceProductVariants {\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
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
