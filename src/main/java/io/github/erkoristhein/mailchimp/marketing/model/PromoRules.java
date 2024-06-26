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
import io.github.erkoristhein.mailchimp.marketing.model.ECommercePromoRule;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A collection of the store&#39;s promo rules.
 */
@JsonPropertyOrder({
  PromoRules.JSON_PROPERTY_STORE_ID,
  PromoRules.JSON_PROPERTY_PROMO_RULES,
  PromoRules.JSON_PROPERTY_TOTAL_ITEMS,
  PromoRules.JSON_PROPERTY_LINKS
})
@JsonTypeName("Promo_Rules")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class PromoRules {
  public static final String JSON_PROPERTY_STORE_ID = "store_id";
  private String storeId;

  public static final String JSON_PROPERTY_PROMO_RULES = "promo_rules";
  private List<ECommercePromoRule> promoRules = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_ITEMS = "total_items";
  private Integer totalItems;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links = new ArrayList<>();

  public PromoRules() {
  }

  @JsonCreator
  public PromoRules(
    @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS) Integer totalItems, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.totalItems = totalItems;
    this.links = links;
  }

  public PromoRules storeId(String storeId) {
    
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


  public PromoRules promoRules(List<ECommercePromoRule> promoRules) {
    
    this.promoRules = promoRules;
    return this;
  }

  public PromoRules addPromoRulesItem(ECommercePromoRule promoRulesItem) {
    if (this.promoRules == null) {
      this.promoRules = new ArrayList<>();
    }
    this.promoRules.add(promoRulesItem);
    return this;
  }

   /**
   * An array of objects, each representing promo rules defined for a store.
   * @return promoRules
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROMO_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ECommercePromoRule> getPromoRules() {
    return promoRules;
  }


  @JsonProperty(JSON_PROPERTY_PROMO_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPromoRules(List<ECommercePromoRule> promoRules) {
    this.promoRules = promoRules;
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
    PromoRules promoRules = (PromoRules) o;
    return Objects.equals(this.storeId, promoRules.storeId) &&
        Objects.equals(this.promoRules, promoRules.promoRules) &&
        Objects.equals(this.totalItems, promoRules.totalItems) &&
        Objects.equals(this.links, promoRules.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, promoRules, totalItems, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromoRules {\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    promoRules: ").append(toIndentedString(promoRules)).append("\n");
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

