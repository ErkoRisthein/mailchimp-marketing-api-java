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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The HTML content for a landing page.
 */
@JsonPropertyOrder({
  LandingPageContent.JSON_PROPERTY_HTML,
  LandingPageContent.JSON_PROPERTY_JSON,
  LandingPageContent.JSON_PROPERTY_LINKS
})
@JsonTypeName("Landing_Page_Content")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class LandingPageContent {
  public static final String JSON_PROPERTY_HTML = "html";
  private String html;

  public static final String JSON_PROPERTY_JSON = "json";
  private String json;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links;

  public LandingPageContent() {
  }

  @JsonCreator
  public LandingPageContent(
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.links = links;
  }

  public LandingPageContent html(String html) {
    
    this.html = html;
    return this;
  }

   /**
   * The raw HTML for the landing page.
   * @return html
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHtml() {
    return html;
  }


  @JsonProperty(JSON_PROPERTY_HTML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtml(String html) {
    this.html = html;
  }


  public LandingPageContent json(String json) {
    
    this.json = json;
    return this;
  }

   /**
   * The JSON Structure for the landing page
   * @return json
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJson() {
    return json;
  }


  @JsonProperty(JSON_PROPERTY_JSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJson(String json) {
    this.json = json;
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
    LandingPageContent landingPageContent = (LandingPageContent) o;
    return Objects.equals(this.html, landingPageContent.html) &&
        Objects.equals(this.json, landingPageContent.json) &&
        Objects.equals(this.links, landingPageContent.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(html, json, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LandingPageContent {\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
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

