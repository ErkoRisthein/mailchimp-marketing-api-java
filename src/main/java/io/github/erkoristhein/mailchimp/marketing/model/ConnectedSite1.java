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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information about a specific connected site.
 */
@JsonPropertyOrder({
  ConnectedSite1.JSON_PROPERTY_FOREIGN_ID,
  ConnectedSite1.JSON_PROPERTY_DOMAIN
})
@JsonTypeName("Connected_Site_1")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class ConnectedSite1 {
  public static final String JSON_PROPERTY_FOREIGN_ID = "foreign_id";
  private String foreignId;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public ConnectedSite1() {
  }

  public ConnectedSite1 foreignId(String foreignId) {
    
    this.foreignId = foreignId;
    return this;
  }

   /**
   * The unique identifier for the site.
   * @return foreignId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FOREIGN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getForeignId() {
    return foreignId;
  }


  @JsonProperty(JSON_PROPERTY_FOREIGN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setForeignId(String foreignId) {
    this.foreignId = foreignId;
  }


  public ConnectedSite1 domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * The connected site domain.
   * @return domain
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDomain() {
    return domain;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDomain(String domain) {
    this.domain = domain;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectedSite1 connectedSite1 = (ConnectedSite1) o;
    return Objects.equals(this.foreignId, connectedSite1.foreignId) &&
        Objects.equals(this.domain, connectedSite1.domain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foreignId, domain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectedSite1 {\n");
    sb.append("    foreignId: ").append(toIndentedString(foreignId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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

