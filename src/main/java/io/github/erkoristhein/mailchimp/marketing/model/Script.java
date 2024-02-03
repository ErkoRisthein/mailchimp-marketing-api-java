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
 * The script used to connect your site with Mailchimp.
 */
@JsonPropertyOrder({
  Script.JSON_PROPERTY_URL,
  Script.JSON_PROPERTY_FRAGMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class Script {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_FRAGMENT = "fragment";
  private String fragment;

  public Script() {
  }

  public Script url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL used for any integrations that offer built-in support for connected sites.
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


  public Script fragment(String fragment) {
    
    this.fragment = fragment;
    return this;
  }

   /**
   * A pre-built script that you can copy-and-paste into your site to integrate it with Mailchimp.
   * @return fragment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FRAGMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFragment() {
    return fragment;
  }


  @JsonProperty(JSON_PROPERTY_FRAGMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFragment(String fragment) {
    this.fragment = fragment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Script script = (Script) o;
    return Objects.equals(this.url, script.url) &&
        Objects.equals(this.fragment, script.fragment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, fragment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Script {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    fragment: ").append(toIndentedString(fragment)).append("\n");
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
