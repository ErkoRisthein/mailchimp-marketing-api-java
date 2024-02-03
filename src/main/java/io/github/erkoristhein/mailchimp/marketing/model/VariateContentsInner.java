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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VariateContentsInner
 */
@JsonPropertyOrder({
  VariateContentsInner.JSON_PROPERTY_CONTENT_LABEL,
  VariateContentsInner.JSON_PROPERTY_PLAIN_TEXT,
  VariateContentsInner.JSON_PROPERTY_HTML
})
@JsonTypeName("Variate_Contents_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class VariateContentsInner {
  public static final String JSON_PROPERTY_CONTENT_LABEL = "content_label";
  private String contentLabel;

  public static final String JSON_PROPERTY_PLAIN_TEXT = "plain_text";
  private String plainText;

  public static final String JSON_PROPERTY_HTML = "html";
  private String html;

  public VariateContentsInner() {
  }

  public VariateContentsInner contentLabel(String contentLabel) {
    
    this.contentLabel = contentLabel;
    return this;
  }

   /**
   * Label used to identify the content option.
   * @return contentLabel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentLabel() {
    return contentLabel;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentLabel(String contentLabel) {
    this.contentLabel = contentLabel;
  }


  public VariateContentsInner plainText(String plainText) {
    
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


  public VariateContentsInner html(String html) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariateContentsInner variateContentsInner = (VariateContentsInner) o;
    return Objects.equals(this.contentLabel, variateContentsInner.contentLabel) &&
        Objects.equals(this.plainText, variateContentsInner.plainText) &&
        Objects.equals(this.html, variateContentsInner.html);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentLabel, plainText, html);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariateContentsInner {\n");
    sb.append("    contentLabel: ").append(toIndentedString(contentLabel)).append("\n");
    sb.append("    plainText: ").append(toIndentedString(plainText)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
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

