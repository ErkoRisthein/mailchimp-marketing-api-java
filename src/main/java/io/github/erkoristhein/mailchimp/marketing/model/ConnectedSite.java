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
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import io.github.erkoristhein.mailchimp.marketing.model.Script;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information about a specific connected site.
 */
@JsonPropertyOrder({
  ConnectedSite.JSON_PROPERTY_FOREIGN_ID,
  ConnectedSite.JSON_PROPERTY_STORE_ID,
  ConnectedSite.JSON_PROPERTY_PLATFORM,
  ConnectedSite.JSON_PROPERTY_DOMAIN,
  ConnectedSite.JSON_PROPERTY_SITE_SCRIPT,
  ConnectedSite.JSON_PROPERTY_CREATED_AT,
  ConnectedSite.JSON_PROPERTY_UPDATED_AT,
  ConnectedSite.JSON_PROPERTY_LINKS
})
@JsonTypeName("Connected_Site")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class ConnectedSite {
  public static final String JSON_PROPERTY_FOREIGN_ID = "foreign_id";
  private String foreignId;

  public static final String JSON_PROPERTY_STORE_ID = "store_id";
  private String storeId;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private String platform;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_SITE_SCRIPT = "site_script";
  private Script siteScript;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links = new ArrayList<>();

  public ConnectedSite() {
  }

  @JsonCreator
  public ConnectedSite(
    @JsonProperty(JSON_PROPERTY_FOREIGN_ID) String foreignId, 
    @JsonProperty(JSON_PROPERTY_STORE_ID) String storeId, 
    @JsonProperty(JSON_PROPERTY_PLATFORM) String platform, 
    @JsonProperty(JSON_PROPERTY_DOMAIN) String domain, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.foreignId = foreignId;
    this.storeId = storeId;
    this.platform = platform;
    this.domain = domain;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.links = links;
  }

   /**
   * The unique identifier for the site.
   * @return foreignId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOREIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getForeignId() {
    return foreignId;
  }




   /**
   * The unique identifier for the ecommerce store that&#39;s associated with the connected site (if any). The store_id for a specific connected site can&#39;t change.
   * @return storeId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoreId() {
    return storeId;
  }




   /**
   * The platform of the connected site.
   * @return platform
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlatform() {
    return platform;
  }




   /**
   * The connected site domain.
   * @return domain
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomain() {
    return domain;
  }




  public ConnectedSite siteScript(Script siteScript) {
    
    this.siteScript = siteScript;
    return this;
  }

   /**
   * Get siteScript
   * @return siteScript
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SITE_SCRIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Script getSiteScript() {
    return siteScript;
  }


  @JsonProperty(JSON_PROPERTY_SITE_SCRIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSiteScript(Script siteScript) {
    this.siteScript = siteScript;
  }


   /**
   * The date and time the connected site was created in ISO 8601 format.
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * The date and time the connected site was last updated in ISO 8601 format.
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
    ConnectedSite connectedSite = (ConnectedSite) o;
    return Objects.equals(this.foreignId, connectedSite.foreignId) &&
        Objects.equals(this.storeId, connectedSite.storeId) &&
        Objects.equals(this.platform, connectedSite.platform) &&
        Objects.equals(this.domain, connectedSite.domain) &&
        Objects.equals(this.siteScript, connectedSite.siteScript) &&
        Objects.equals(this.createdAt, connectedSite.createdAt) &&
        Objects.equals(this.updatedAt, connectedSite.updatedAt) &&
        Objects.equals(this.links, connectedSite.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foreignId, storeId, platform, domain, siteScript, createdAt, updatedAt, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectedSite {\n");
    sb.append("    foreignId: ").append(toIndentedString(foreignId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    siteScript: ").append(toIndentedString(siteScript)).append("\n");
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

