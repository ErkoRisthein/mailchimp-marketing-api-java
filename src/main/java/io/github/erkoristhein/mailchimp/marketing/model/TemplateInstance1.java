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
 * Information about a specific template.
 */
@JsonPropertyOrder({
  TemplateInstance1.JSON_PROPERTY_NAME,
  TemplateInstance1.JSON_PROPERTY_FOLDER_ID,
  TemplateInstance1.JSON_PROPERTY_HTML
})
@JsonTypeName("Template_Instance_1")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class TemplateInstance1 {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_FOLDER_ID = "folder_id";
  private String folderId;

  public static final String JSON_PROPERTY_HTML = "html";
  private String html;

  public TemplateInstance1() {
  }

  public TemplateInstance1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the template.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public TemplateInstance1 folderId(String folderId) {
    
    this.folderId = folderId;
    return this;
  }

   /**
   * The id of the folder the template is currently in.
   * @return folderId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFolderId() {
    return folderId;
  }


  @JsonProperty(JSON_PROPERTY_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }


  public TemplateInstance1 html(String html) {
    
    this.html = html;
    return this;
  }

   /**
   * The raw HTML for the template. We  support the Mailchimp [Template Language](https://mailchimp.com/help/getting-started-with-mailchimps-template-language/) in any HTML code passed via the API.
   * @return html
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HTML)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHtml() {
    return html;
  }


  @JsonProperty(JSON_PROPERTY_HTML)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    TemplateInstance1 templateInstance1 = (TemplateInstance1) o;
    return Objects.equals(this.name, templateInstance1.name) &&
        Objects.equals(this.folderId, templateInstance1.folderId) &&
        Objects.equals(this.html, templateInstance1.html);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, folderId, html);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateInstance1 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
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

