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
import io.github.erkoristhein.mailchimp.marketing.model.TemplateContent;
import io.github.erkoristhein.mailchimp.marketing.model.UploadArchive;
import io.github.erkoristhein.mailchimp.marketing.model.VariateContentsInner1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The HTML and plain-text content for a campaign
 */
@JsonPropertyOrder({
  CampaignContent1.JSON_PROPERTY_PLAIN_TEXT,
  CampaignContent1.JSON_PROPERTY_HTML,
  CampaignContent1.JSON_PROPERTY_URL,
  CampaignContent1.JSON_PROPERTY_TEMPLATE,
  CampaignContent1.JSON_PROPERTY_ARCHIVE,
  CampaignContent1.JSON_PROPERTY_VARIATE_CONTENTS
})
@JsonTypeName("Campaign_Content_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class CampaignContent1 {
  public static final String JSON_PROPERTY_PLAIN_TEXT = "plain_text";
  private String plainText;

  public static final String JSON_PROPERTY_HTML = "html";
  private String html;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private TemplateContent template;

  public static final String JSON_PROPERTY_ARCHIVE = "archive";
  private UploadArchive archive;

  public static final String JSON_PROPERTY_VARIATE_CONTENTS = "variate_contents";
  private List<VariateContentsInner1> variateContents;

  public CampaignContent1() {
  }

  public CampaignContent1 plainText(String plainText) {
    
    this.plainText = plainText;
    return this;
  }

   /**
   * The plain-text portion of the campaign. If left unspecified, we&#39;ll generate this automatically.
   * @return plainText
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAIN_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlainText() {
    return plainText;
  }


  @JsonProperty(JSON_PROPERTY_PLAIN_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlainText(String plainText) {
    this.plainText = plainText;
  }


  public CampaignContent1 html(String html) {
    
    this.html = html;
    return this;
  }

   /**
   * The raw HTML for the campaign.
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


  public CampaignContent1 url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * When importing a campaign, the URL where the HTML lives.
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


  public CampaignContent1 template(TemplateContent template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TemplateContent getTemplate() {
    return template;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplate(TemplateContent template) {
    this.template = template;
  }


  public CampaignContent1 archive(UploadArchive archive) {
    
    this.archive = archive;
    return this;
  }

   /**
   * Get archive
   * @return archive
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARCHIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UploadArchive getArchive() {
    return archive;
  }


  @JsonProperty(JSON_PROPERTY_ARCHIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArchive(UploadArchive archive) {
    this.archive = archive;
  }


  public CampaignContent1 variateContents(List<VariateContentsInner1> variateContents) {
    
    this.variateContents = variateContents;
    return this;
  }

  public CampaignContent1 addVariateContentsItem(VariateContentsInner1 variateContentsItem) {
    if (this.variateContents == null) {
      this.variateContents = new ArrayList<>();
    }
    this.variateContents.add(variateContentsItem);
    return this;
  }

   /**
   * Content options for [Multivariate Campaigns](https://mailchimp.com/help/about-multivariate-campaigns/). Each content option must provide HTML content and may optionally provide plain text. For campaigns not testing content, only one object should be provided.
   * @return variateContents
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIATE_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VariateContentsInner1> getVariateContents() {
    return variateContents;
  }


  @JsonProperty(JSON_PROPERTY_VARIATE_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVariateContents(List<VariateContentsInner1> variateContents) {
    this.variateContents = variateContents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignContent1 campaignContent1 = (CampaignContent1) o;
    return Objects.equals(this.plainText, campaignContent1.plainText) &&
        Objects.equals(this.html, campaignContent1.html) &&
        Objects.equals(this.url, campaignContent1.url) &&
        Objects.equals(this.template, campaignContent1.template) &&
        Objects.equals(this.archive, campaignContent1.archive) &&
        Objects.equals(this.variateContents, campaignContent1.variateContents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plainText, html, url, template, archive, variateContents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignContent1 {\n");
    sb.append("    plainText: ").append(toIndentedString(plainText)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
    sb.append("    variateContents: ").append(toIndentedString(variateContents)).append("\n");
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

