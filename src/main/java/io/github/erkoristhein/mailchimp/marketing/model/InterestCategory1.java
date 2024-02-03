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
 * Interest categories organize interests, which are used to group subscribers based on their preferences. These correspond to Group Titles the application.
 */
@JsonPropertyOrder({
  InterestCategory1.JSON_PROPERTY_TITLE,
  InterestCategory1.JSON_PROPERTY_DISPLAY_ORDER,
  InterestCategory1.JSON_PROPERTY_TYPE
})
@JsonTypeName("Interest_Category_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class InterestCategory1 {
  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_DISPLAY_ORDER = "display_order";
  private Integer displayOrder;

  /**
   * Determines how this category’s interests appear on signup forms.
   */
  public enum TypeEnum {
    CHECKBOXES("checkboxes"),
    
    DROPDOWN("dropdown"),
    
    RADIO("radio"),
    
    HIDDEN("hidden");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public InterestCategory1() {
  }

  public InterestCategory1 title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The text description of this category. This field appears on signup forms and is often phrased as a question.
   * @return title
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(String title) {
    this.title = title;
  }


  public InterestCategory1 displayOrder(Integer displayOrder) {
    
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * The order that the categories are displayed in the list. Lower numbers display first.
   * @return displayOrder
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDisplayOrder() {
    return displayOrder;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }


  public InterestCategory1 type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Determines how this category’s interests appear on signup forms.
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterestCategory1 interestCategory1 = (InterestCategory1) o;
    return Objects.equals(this.title, interestCategory1.title) &&
        Objects.equals(this.displayOrder, interestCategory1.displayOrder) &&
        Objects.equals(this.type, interestCategory1.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, displayOrder, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterestCategory1 {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

