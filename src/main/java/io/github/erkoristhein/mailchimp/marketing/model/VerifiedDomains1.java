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
import io.github.erkoristhein.mailchimp.marketing.model.VerifiedDomains;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The verified domains currently on the account.
 */
@JsonPropertyOrder({
  VerifiedDomains1.JSON_PROPERTY_DOMAINS,
  VerifiedDomains1.JSON_PROPERTY_TOTAL_ITEMS
})
@JsonTypeName("Verified_Domains_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class VerifiedDomains1 {
  public static final String JSON_PROPERTY_DOMAINS = "domains";
  private List<VerifiedDomains> domains;

  public static final String JSON_PROPERTY_TOTAL_ITEMS = "total_items";
  private Integer totalItems;

  public VerifiedDomains1() {
  }

  @JsonCreator
  public VerifiedDomains1(
    @JsonProperty(JSON_PROPERTY_DOMAINS) List<VerifiedDomains> domains, 
    @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS) Integer totalItems
  ) {
    this();
    this.domains = domains;
    this.totalItems = totalItems;
  }

   /**
   * The domains on the account
   * @return domains
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VerifiedDomains> getDomains() {
    return domains;
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifiedDomains1 verifiedDomains1 = (VerifiedDomains1) o;
    return Objects.equals(this.domains, verifiedDomains1.domains) &&
        Objects.equals(this.totalItems, verifiedDomains1.totalItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domains, totalItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifiedDomains1 {\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
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

