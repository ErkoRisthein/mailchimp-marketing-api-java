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
import io.github.erkoristhein.mailchimp.marketing.model.Conditions2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information about a specific list segment.
 */
@JsonPropertyOrder({
  List9.JSON_PROPERTY_NAME,
  List9.JSON_PROPERTY_STATIC_SEGMENT,
  List9.JSON_PROPERTY_OPTIONS
})
@JsonTypeName("List_9")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class List9 {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATIC_SEGMENT = "static_segment";
  private List<String> staticSegment = new ArrayList<>();

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private Conditions2 options;

  public List9() {
  }

  public List9 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the segment.
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


  public List9 staticSegment(List<String> staticSegment) {
    
    this.staticSegment = staticSegment;
    return this;
  }

  public List9 addStaticSegmentItem(String staticSegmentItem) {
    if (this.staticSegment == null) {
      this.staticSegment = new ArrayList<>();
    }
    this.staticSegment.add(staticSegmentItem);
    return this;
  }

   /**
   * An array of emails to be used for a static segment. Any emails provided that are not present on the list will be ignored. Passing an empty array for an existing static segment will reset that segment and remove all members. This field cannot be provided with the &#x60;options&#x60; field.
   * @return staticSegment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATIC_SEGMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getStaticSegment() {
    return staticSegment;
  }


  @JsonProperty(JSON_PROPERTY_STATIC_SEGMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStaticSegment(List<String> staticSegment) {
    this.staticSegment = staticSegment;
  }


  public List9 options(Conditions2 options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Conditions2 getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptions(Conditions2 options) {
    this.options = options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    List9 list9 = (List9) o;
    return Objects.equals(this.name, list9.name) &&
        Objects.equals(this.staticSegment, list9.staticSegment) &&
        Objects.equals(this.options, list9.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, staticSegment, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class List9 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    staticSegment: ").append(toIndentedString(staticSegment)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

