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
  Script1.JSON_PROPERTY_URL,
  Script1.JSON_PROPERTY_FRAGMENT
})
@JsonTypeName("Script_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class Script1 {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_FRAGMENT = "fragment";
  private String fragment;

  public Script1() {
  }

  @JsonCreator
  public Script1(
    @JsonProperty(JSON_PROPERTY_URL) String url, 
    @JsonProperty(JSON_PROPERTY_FRAGMENT) String fragment
  ) {
    this();
    this.url = url;
    this.fragment = fragment;
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Script1 script1 = (Script1) o;
    return Objects.equals(this.url, script1.url) &&
        Objects.equals(this.fragment, script1.fragment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, fragment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Script1 {\n");
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
