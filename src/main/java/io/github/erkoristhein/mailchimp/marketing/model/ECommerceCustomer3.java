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
import io.github.erkoristhein.mailchimp.marketing.model.Address;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information about a specific customer.
 */
@JsonPropertyOrder({
  ECommerceCustomer3.JSON_PROPERTY_ID,
  ECommerceCustomer3.JSON_PROPERTY_EMAIL_ADDRESS,
  ECommerceCustomer3.JSON_PROPERTY_OPT_IN_STATUS,
  ECommerceCustomer3.JSON_PROPERTY_COMPANY,
  ECommerceCustomer3.JSON_PROPERTY_FIRST_NAME,
  ECommerceCustomer3.JSON_PROPERTY_LAST_NAME,
  ECommerceCustomer3.JSON_PROPERTY_ADDRESS
})
@JsonTypeName("E_commerce_Customer_3")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class ECommerceCustomer3 {
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

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public ECommerceCustomer3() {
  }

  public ECommerceCustomer3 id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the customer. Limited to 50 characters.
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public ECommerceCustomer3 emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The customer&#39;s email address.
   * @return emailAddress
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmailAddress() {
    return emailAddress;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public ECommerceCustomer3 optInStatus(Boolean optInStatus) {
    
    this.optInStatus = optInStatus;
    return this;
  }

   /**
   * The customer&#39;s opt-in status. This value will never overwrite the opt-in status of a pre-existing Mailchimp list member, but will apply to list members that are added through the e-commerce API endpoints. Customers who don&#39;t opt in to your Mailchimp list [will be added as &#x60;Transactional&#x60; members](https://mailchimp.com/developer/marketing/docs/e-commerce/#customers).
   * @return optInStatus
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OPT_IN_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getOptInStatus() {
    return optInStatus;
  }


  @JsonProperty(JSON_PROPERTY_OPT_IN_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOptInStatus(Boolean optInStatus) {
    this.optInStatus = optInStatus;
  }


  public ECommerceCustomer3 company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * The customer&#39;s company.
   * @return company
  **/
  @jakarta.annotation.Nullable
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


  public ECommerceCustomer3 firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The customer&#39;s first name.
   * @return firstName
  **/
  @jakarta.annotation.Nullable
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


  public ECommerceCustomer3 lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The customer&#39;s last name.
   * @return lastName
  **/
  @jakarta.annotation.Nullable
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


  public ECommerceCustomer3 address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @jakarta.annotation.Nullable
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ECommerceCustomer3 eCommerceCustomer3 = (ECommerceCustomer3) o;
    return Objects.equals(this.id, eCommerceCustomer3.id) &&
        Objects.equals(this.emailAddress, eCommerceCustomer3.emailAddress) &&
        Objects.equals(this.optInStatus, eCommerceCustomer3.optInStatus) &&
        Objects.equals(this.company, eCommerceCustomer3.company) &&
        Objects.equals(this.firstName, eCommerceCustomer3.firstName) &&
        Objects.equals(this.lastName, eCommerceCustomer3.lastName) &&
        Objects.equals(this.address, eCommerceCustomer3.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, emailAddress, optInStatus, company, firstName, lastName, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ECommerceCustomer3 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    optInStatus: ").append(toIndentedString(optInStatus)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

