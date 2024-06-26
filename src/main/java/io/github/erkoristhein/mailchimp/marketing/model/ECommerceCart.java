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
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceCartLineItem;
import io.github.erkoristhein.mailchimp.marketing.model.ECommerceCustomer;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information about a specific cart.
 */
@JsonPropertyOrder({
  ECommerceCart.JSON_PROPERTY_ID,
  ECommerceCart.JSON_PROPERTY_CUSTOMER,
  ECommerceCart.JSON_PROPERTY_CAMPAIGN_ID,
  ECommerceCart.JSON_PROPERTY_CHECKOUT_URL,
  ECommerceCart.JSON_PROPERTY_CURRENCY_CODE,
  ECommerceCart.JSON_PROPERTY_ORDER_TOTAL,
  ECommerceCart.JSON_PROPERTY_TAX_TOTAL,
  ECommerceCart.JSON_PROPERTY_LINES,
  ECommerceCart.JSON_PROPERTY_CREATED_AT,
  ECommerceCart.JSON_PROPERTY_UPDATED_AT,
  ECommerceCart.JSON_PROPERTY_LINKS
})
@JsonTypeName("E_commerce_Cart")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class ECommerceCart {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private ECommerceCustomer customer;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaign_id";
  private String campaignId;

  public static final String JSON_PROPERTY_CHECKOUT_URL = "checkout_url";
  private String checkoutUrl;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currency_code";
  private String currencyCode;

  public static final String JSON_PROPERTY_ORDER_TOTAL = "order_total";
  private BigDecimal orderTotal;

  public static final String JSON_PROPERTY_TAX_TOTAL = "tax_total";
  private BigDecimal taxTotal;

  public static final String JSON_PROPERTY_LINES = "lines";
  private List<ECommerceCartLineItem> lines = new ArrayList<>();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links = new ArrayList<>();

  public ECommerceCart() {
  }

  @JsonCreator
  public ECommerceCart(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.id = id;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.links = links;
  }

   /**
   * A unique identifier for the cart.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public ECommerceCart customer(ECommerceCustomer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ECommerceCustomer getCustomer() {
    return customer;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomer(ECommerceCustomer customer) {
    this.customer = customer;
  }


  public ECommerceCart campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * A string that uniquely identifies the campaign associated with a cart.
   * @return campaignId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public ECommerceCart checkoutUrl(String checkoutUrl) {
    
    this.checkoutUrl = checkoutUrl;
    return this;
  }

   /**
   * The URL for the cart. This parameter is required for [Abandoned Cart](https://mailchimp.com/help/create-an-abandoned-cart-email/) automations.
   * @return checkoutUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECKOUT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckoutUrl() {
    return checkoutUrl;
  }


  @JsonProperty(JSON_PROPERTY_CHECKOUT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutUrl(String checkoutUrl) {
    this.checkoutUrl = checkoutUrl;
  }


  public ECommerceCart currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The three-letter ISO 4217 code for the currency that the cart uses.
   * @return currencyCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyCode() {
    return currencyCode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public ECommerceCart orderTotal(BigDecimal orderTotal) {
    
    this.orderTotal = orderTotal;
    return this;
  }

   /**
   * The order total for the cart.
   * @return orderTotal
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOrderTotal() {
    return orderTotal;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderTotal(BigDecimal orderTotal) {
    this.orderTotal = orderTotal;
  }


  public ECommerceCart taxTotal(BigDecimal taxTotal) {
    
    this.taxTotal = taxTotal;
    return this;
  }

   /**
   * The total tax for the cart.
   * @return taxTotal
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTaxTotal() {
    return taxTotal;
  }


  @JsonProperty(JSON_PROPERTY_TAX_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxTotal(BigDecimal taxTotal) {
    this.taxTotal = taxTotal;
  }


  public ECommerceCart lines(List<ECommerceCartLineItem> lines) {
    
    this.lines = lines;
    return this;
  }

  public ECommerceCart addLinesItem(ECommerceCartLineItem linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * An array of the cart&#39;s line items.
   * @return lines
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ECommerceCartLineItem> getLines() {
    return lines;
  }


  @JsonProperty(JSON_PROPERTY_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLines(List<ECommerceCartLineItem> lines) {
    this.lines = lines;
  }


   /**
   * The date and time the cart was created in ISO 8601 format.
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * The date and time the cart was last updated in ISO 8601 format.
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
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
    ECommerceCart eCommerceCart = (ECommerceCart) o;
    return Objects.equals(this.id, eCommerceCart.id) &&
        Objects.equals(this.customer, eCommerceCart.customer) &&
        Objects.equals(this.campaignId, eCommerceCart.campaignId) &&
        Objects.equals(this.checkoutUrl, eCommerceCart.checkoutUrl) &&
        Objects.equals(this.currencyCode, eCommerceCart.currencyCode) &&
        Objects.equals(this.orderTotal, eCommerceCart.orderTotal) &&
        Objects.equals(this.taxTotal, eCommerceCart.taxTotal) &&
        Objects.equals(this.lines, eCommerceCart.lines) &&
        Objects.equals(this.createdAt, eCommerceCart.createdAt) &&
        Objects.equals(this.updatedAt, eCommerceCart.updatedAt) &&
        Objects.equals(this.links, eCommerceCart.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customer, campaignId, checkoutUrl, currencyCode, orderTotal, taxTotal, lines, createdAt, updatedAt, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ECommerceCart {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    checkoutUrl: ").append(toIndentedString(checkoutUrl)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    orderTotal: ").append(toIndentedString(orderTotal)).append("\n");
    sb.append("    taxTotal: ").append(toIndentedString(taxTotal)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

