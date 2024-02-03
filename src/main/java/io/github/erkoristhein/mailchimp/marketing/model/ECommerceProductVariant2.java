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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information about a specific product variant.
 */
@JsonPropertyOrder({
  ECommerceProductVariant2.JSON_PROPERTY_TITLE,
  ECommerceProductVariant2.JSON_PROPERTY_URL,
  ECommerceProductVariant2.JSON_PROPERTY_SKU,
  ECommerceProductVariant2.JSON_PROPERTY_PRICE,
  ECommerceProductVariant2.JSON_PROPERTY_INVENTORY_QUANTITY,
  ECommerceProductVariant2.JSON_PROPERTY_IMAGE_URL,
  ECommerceProductVariant2.JSON_PROPERTY_BACKORDERS,
  ECommerceProductVariant2.JSON_PROPERTY_VISIBILITY
})
@JsonTypeName("E_commerce_Product_Variant_2")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class ECommerceProductVariant2 {
  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_SKU = "sku";
  private String sku;

  public static final String JSON_PROPERTY_PRICE = "price";
  private BigDecimal price;

  public static final String JSON_PROPERTY_INVENTORY_QUANTITY = "inventory_quantity";
  private Integer inventoryQuantity;

  public static final String JSON_PROPERTY_IMAGE_URL = "image_url";
  private String imageUrl;

  public static final String JSON_PROPERTY_BACKORDERS = "backorders";
  private String backorders;

  public static final String JSON_PROPERTY_VISIBILITY = "visibility";
  private String visibility;

  public ECommerceProductVariant2() {
  }

  public ECommerceProductVariant2 title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of a product variant.
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public ECommerceProductVariant2 url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL for a product variant.
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public ECommerceProductVariant2 sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * The stock keeping unit (SKU) of a product variant.
   * @return sku
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSku() {
    return sku;
  }


  @JsonProperty(JSON_PROPERTY_SKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSku(String sku) {
    this.sku = sku;
  }


  public ECommerceProductVariant2 price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * The price of a product variant.
   * @return price
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public ECommerceProductVariant2 inventoryQuantity(Integer inventoryQuantity) {
    
    this.inventoryQuantity = inventoryQuantity;
    return this;
  }

   /**
   * The inventory quantity of a product variant.
   * @return inventoryQuantity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVENTORY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInventoryQuantity() {
    return inventoryQuantity;
  }


  @JsonProperty(JSON_PROPERTY_INVENTORY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInventoryQuantity(Integer inventoryQuantity) {
    this.inventoryQuantity = inventoryQuantity;
  }


  public ECommerceProductVariant2 imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * The image URL for a product variant.
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageUrl() {
    return imageUrl;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public ECommerceProductVariant2 backorders(String backorders) {
    
    this.backorders = backorders;
    return this;
  }

   /**
   * The backorders of a product variant.
   * @return backorders
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACKORDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBackorders() {
    return backorders;
  }


  @JsonProperty(JSON_PROPERTY_BACKORDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackorders(String backorders) {
    this.backorders = backorders;
  }


  public ECommerceProductVariant2 visibility(String visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * The visibility of a product variant.
   * @return visibility
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVisibility() {
    return visibility;
  }


  @JsonProperty(JSON_PROPERTY_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ECommerceProductVariant2 eCommerceProductVariant2 = (ECommerceProductVariant2) o;
    return Objects.equals(this.title, eCommerceProductVariant2.title) &&
        Objects.equals(this.url, eCommerceProductVariant2.url) &&
        Objects.equals(this.sku, eCommerceProductVariant2.sku) &&
        Objects.equals(this.price, eCommerceProductVariant2.price) &&
        Objects.equals(this.inventoryQuantity, eCommerceProductVariant2.inventoryQuantity) &&
        Objects.equals(this.imageUrl, eCommerceProductVariant2.imageUrl) &&
        Objects.equals(this.backorders, eCommerceProductVariant2.backorders) &&
        Objects.equals(this.visibility, eCommerceProductVariant2.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, url, sku, price, inventoryQuantity, imageUrl, backorders, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ECommerceProductVariant2 {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    inventoryQuantity: ").append(toIndentedString(inventoryQuantity)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    backorders: ").append(toIndentedString(backorders)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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

