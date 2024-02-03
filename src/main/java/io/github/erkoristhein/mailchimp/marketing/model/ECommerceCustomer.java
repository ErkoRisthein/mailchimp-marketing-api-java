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
import io.github.erkoristhein.mailchimp.marketing.model.Address;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information about a specific customer.
 */
@JsonPropertyOrder({
  ECommerceCustomer.JSON_PROPERTY_ID,
  ECommerceCustomer.JSON_PROPERTY_EMAIL_ADDRESS,
  ECommerceCustomer.JSON_PROPERTY_OPT_IN_STATUS,
  ECommerceCustomer.JSON_PROPERTY_COMPANY,
  ECommerceCustomer.JSON_PROPERTY_FIRST_NAME,
  ECommerceCustomer.JSON_PROPERTY_LAST_NAME,
  ECommerceCustomer.JSON_PROPERTY_ORDERS_COUNT,
  ECommerceCustomer.JSON_PROPERTY_TOTAL_SPENT,
  ECommerceCustomer.JSON_PROPERTY_ADDRESS,
  ECommerceCustomer.JSON_PROPERTY_CREATED_AT,
  ECommerceCustomer.JSON_PROPERTY_UPDATED_AT,
  ECommerceCustomer.JSON_PROPERTY_LINKS
})
@JsonTypeName("E_commerce_Customer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class ECommerceCustomer {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "email_address";
  private String emailAddress;

  public static final String JSON_PROPERTY_OPT_IN_STATUS = "opt_in_status";
  private Boolean optInStatus;

  public static final String JSON_PROPERTY_COMPANY = "company";
  private String company;

  public static final String JSON_PROPERTY_FIRST_NAME = "first_name";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "last_name";
  private String lastName;

  public static final String JSON_PROPERTY_ORDERS_COUNT = "orders_count";
  private Integer ordersCount;

  public static final String JSON_PROPERTY_TOTAL_SPENT = "total_spent";
  private BigDecimal totalSpent;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links;

  public ECommerceCustomer() {
  }

  @JsonCreator
  public ECommerceCustomer(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS) String emailAddress, 
    @JsonProperty(JSON_PROPERTY_ORDERS_COUNT) Integer ordersCount, 
    @JsonProperty(JSON_PROPERTY_TOTAL_SPENT) BigDecimal totalSpent, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.id = id;
    this.emailAddress = emailAddress;
    this.ordersCount = ordersCount;
    this.totalSpent = totalSpent;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.links = links;
  }

   /**
   * A unique identifier for the customer.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * The customer&#39;s email address.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }




  public ECommerceCustomer optInStatus(Boolean optInStatus) {
    
    this.optInStatus = optInStatus;
    return this;
  }

   /**
   * The customer&#39;s opt-in status. This value will never overwrite the opt-in status of a pre-existing Mailchimp list member, but will apply to list members that are added through the e-commerce API endpoints. Customers who don&#39;t opt in to your Mailchimp list [will be added as &#x60;Transactional&#x60; members](https://mailchimp.com/developer/marketing/docs/e-commerce/#customers).
   * @return optInStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPT_IN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOptInStatus() {
    return optInStatus;
  }


  @JsonProperty(JSON_PROPERTY_OPT_IN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptInStatus(Boolean optInStatus) {
    this.optInStatus = optInStatus;
  }


  public ECommerceCustomer company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * The customer&#39;s company.
   * @return company
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompany() {
    return company;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompany(String company) {
    this.company = company;
  }


  public ECommerceCustomer firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The customer&#39;s first name.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public ECommerceCustomer lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The customer&#39;s last name.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


   /**
   * The customer&#39;s total order count.
   * @return ordersCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDERS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrdersCount() {
    return ordersCount;
  }




   /**
   * The total amount the customer has spent.
   * @return totalSpent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_SPENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalSpent() {
    return totalSpent;
  }




  public ECommerceCustomer address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(Address address) {
    this.address = address;
  }


   /**
   * The date and time the customer was created in ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * The date and time the customer was last updated in ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
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
    ECommerceCustomer eCommerceCustomer = (ECommerceCustomer) o;
    return Objects.equals(this.id, eCommerceCustomer.id) &&
        Objects.equals(this.emailAddress, eCommerceCustomer.emailAddress) &&
        Objects.equals(this.optInStatus, eCommerceCustomer.optInStatus) &&
        Objects.equals(this.company, eCommerceCustomer.company) &&
        Objects.equals(this.firstName, eCommerceCustomer.firstName) &&
        Objects.equals(this.lastName, eCommerceCustomer.lastName) &&
        Objects.equals(this.ordersCount, eCommerceCustomer.ordersCount) &&
        Objects.equals(this.totalSpent, eCommerceCustomer.totalSpent) &&
        Objects.equals(this.address, eCommerceCustomer.address) &&
        Objects.equals(this.createdAt, eCommerceCustomer.createdAt) &&
        Objects.equals(this.updatedAt, eCommerceCustomer.updatedAt) &&
        Objects.equals(this.links, eCommerceCustomer.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, emailAddress, optInStatus, company, firstName, lastName, ordersCount, totalSpent, address, createdAt, updatedAt, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ECommerceCustomer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    optInStatus: ").append(toIndentedString(optInStatus)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    ordersCount: ").append(toIndentedString(ordersCount)).append("\n");
    sb.append("    totalSpent: ").append(toIndentedString(totalSpent)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
