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
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information about an Ecommerce Store&#39;s specific Promo Code
 */
@JsonPropertyOrder({
  ECommercePromoCode.JSON_PROPERTY_ID,
  ECommercePromoCode.JSON_PROPERTY_CODE,
  ECommercePromoCode.JSON_PROPERTY_REDEMPTION_URL,
  ECommercePromoCode.JSON_PROPERTY_USAGE_COUNT,
  ECommercePromoCode.JSON_PROPERTY_ENABLED,
  ECommercePromoCode.JSON_PROPERTY_CREATED_AT_FOREIGN,
  ECommercePromoCode.JSON_PROPERTY_UPDATED_AT_FOREIGN,
  ECommercePromoCode.JSON_PROPERTY_LINKS
})
@JsonTypeName("E_commerce_Promo_Code")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class ECommercePromoCode {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_REDEMPTION_URL = "redemption_url";
  private String redemptionUrl;

  public static final String JSON_PROPERTY_USAGE_COUNT = "usage_count";
  private Integer usageCount;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_CREATED_AT_FOREIGN = "created_at_foreign";
  private OffsetDateTime createdAtForeign;

  public static final String JSON_PROPERTY_UPDATED_AT_FOREIGN = "updated_at_foreign";
  private OffsetDateTime updatedAtForeign;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links;

  public ECommercePromoCode() {
  }

  @JsonCreator
  public ECommercePromoCode(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.id = id;
    this.links = links;
  }

   /**
   * A unique identifier for the promo Code.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public ECommercePromoCode code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The discount code. Restricted to UTF-8 characters with max length 50.
   * @return code
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public ECommercePromoCode redemptionUrl(String redemptionUrl) {
    
    this.redemptionUrl = redemptionUrl;
    return this;
  }

   /**
   * The url that should be used in the promotion campaign restricted to UTF-8 characters with max length 2000.
   * @return redemptionUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDEMPTION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRedemptionUrl() {
    return redemptionUrl;
  }


  @JsonProperty(JSON_PROPERTY_REDEMPTION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedemptionUrl(String redemptionUrl) {
    this.redemptionUrl = redemptionUrl;
  }


  public ECommercePromoCode usageCount(Integer usageCount) {
    
    this.usageCount = usageCount;
    return this;
  }

   /**
   * Number of times promo code has been used.
   * @return usageCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUsageCount() {
    return usageCount;
  }


  @JsonProperty(JSON_PROPERTY_USAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsageCount(Integer usageCount) {
    this.usageCount = usageCount;
  }


  public ECommercePromoCode enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the promo code is currently enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public ECommercePromoCode createdAtForeign(OffsetDateTime createdAtForeign) {
    
    this.createdAtForeign = createdAtForeign;
    return this;
  }

   /**
   * The date and time the promotion was created in ISO 8601 format.
   * @return createdAtForeign
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT_FOREIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAtForeign() {
    return createdAtForeign;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT_FOREIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAtForeign(OffsetDateTime createdAtForeign) {
    this.createdAtForeign = createdAtForeign;
  }


  public ECommercePromoCode updatedAtForeign(OffsetDateTime updatedAtForeign) {
    
    this.updatedAtForeign = updatedAtForeign;
    return this;
  }

   /**
   * The date and time the promotion was updated in ISO 8601 format.
   * @return updatedAtForeign
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT_FOREIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAtForeign() {
    return updatedAtForeign;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT_FOREIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAtForeign(OffsetDateTime updatedAtForeign) {
    this.updatedAtForeign = updatedAtForeign;
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
    ECommercePromoCode eCommercePromoCode = (ECommercePromoCode) o;
    return Objects.equals(this.id, eCommercePromoCode.id) &&
        Objects.equals(this.code, eCommercePromoCode.code) &&
        Objects.equals(this.redemptionUrl, eCommercePromoCode.redemptionUrl) &&
        Objects.equals(this.usageCount, eCommercePromoCode.usageCount) &&
        Objects.equals(this.enabled, eCommercePromoCode.enabled) &&
        Objects.equals(this.createdAtForeign, eCommercePromoCode.createdAtForeign) &&
        Objects.equals(this.updatedAtForeign, eCommercePromoCode.updatedAtForeign) &&
        Objects.equals(this.links, eCommercePromoCode.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, redemptionUrl, usageCount, enabled, createdAtForeign, updatedAtForeign, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ECommercePromoCode {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    redemptionUrl: ").append(toIndentedString(redemptionUrl)).append("\n");
    sb.append("    usageCount: ").append(toIndentedString(usageCount)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    createdAtForeign: ").append(toIndentedString(createdAtForeign)).append("\n");
    sb.append("    updatedAtForeign: ").append(toIndentedString(updatedAtForeign)).append("\n");
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

