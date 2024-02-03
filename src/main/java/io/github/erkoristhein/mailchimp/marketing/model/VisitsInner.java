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
 * VisitsInner
 */
@JsonPropertyOrder({
  VisitsInner.JSON_PROPERTY_DATE,
  VisitsInner.JSON_PROPERTY_VAL
})
@JsonTypeName("Visits_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class VisitsInner {
  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_VAL = "val";
  private Integer val;

  public VisitsInner() {
  }

  @JsonCreator
  public VisitsInner(
    @JsonProperty(JSON_PROPERTY_DATE) String date, 
    @JsonProperty(JSON_PROPERTY_VAL) Integer val
  ) {
    this();
    this.date = date;
    this.val = val;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDate() {
    return date;
  }




   /**
   * Get val
   * @return val
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVal() {
    return val;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisitsInner visitsInner = (VisitsInner) o;
    return Objects.equals(this.date, visitsInner.date) &&
        Objects.equals(this.val, visitsInner.val);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, val);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisitsInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    val: ").append(toIndentedString(val)).append("\n");
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

