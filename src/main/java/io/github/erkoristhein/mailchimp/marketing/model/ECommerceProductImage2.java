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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information about a specific product image.
 */
@JsonPropertyOrder({
  ECommerceProductImage2.JSON_PROPERTY_ID,
  ECommerceProductImage2.JSON_PROPERTY_URL,
  ECommerceProductImage2.JSON_PROPERTY_VARIANT_IDS
})
@JsonTypeName("E_commerce_Product_Image_2")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class ECommerceProductImage2 {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_VARIANT_IDS = "variant_ids";
  private List<String> variantIds;

  public ECommerceProductImage2() {
  }

  public ECommerceProductImage2 id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the product image.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public ECommerceProductImage2 url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL for a product image.
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


  public ECommerceProductImage2 variantIds(List<String> variantIds) {
    
    this.variantIds = variantIds;
    return this;
  }

  public ECommerceProductImage2 addVariantIdsItem(String variantIdsItem) {
    if (this.variantIds == null) {
      this.variantIds = new ArrayList<>();
    }
    this.variantIds.add(variantIdsItem);
    return this;
  }

   /**
   * The list of product variants using the image.
   * @return variantIds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getVariantIds() {
    return variantIds;
  }


  @JsonProperty(JSON_PROPERTY_VARIANT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVariantIds(List<String> variantIds) {
    this.variantIds = variantIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ECommerceProductImage2 eCommerceProductImage2 = (ECommerceProductImage2) o;
    return Objects.equals(this.id, eCommerceProductImage2.id) &&
        Objects.equals(this.url, eCommerceProductImage2.url) &&
        Objects.equals(this.variantIds, eCommerceProductImage2.variantIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, variantIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ECommerceProductImage2 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    variantIds: ").append(toIndentedString(variantIds)).append("\n");
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

