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
 * An object describing the forwards and forward activity for the campaign.
 */
@JsonPropertyOrder({
  Forwards.JSON_PROPERTY_FORWARDS_COUNT,
  Forwards.JSON_PROPERTY_FORWARDS_OPENS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class Forwards {
  public static final String JSON_PROPERTY_FORWARDS_COUNT = "forwards_count";
  private Integer forwardsCount;

  public static final String JSON_PROPERTY_FORWARDS_OPENS = "forwards_opens";
  private Integer forwardsOpens;

  public Forwards() {
  }

  public Forwards forwardsCount(Integer forwardsCount) {
    
    this.forwardsCount = forwardsCount;
    return this;
  }

   /**
   * How many times the campaign has been forwarded.
   * @return forwardsCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORWARDS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getForwardsCount() {
    return forwardsCount;
  }


  @JsonProperty(JSON_PROPERTY_FORWARDS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForwardsCount(Integer forwardsCount) {
    this.forwardsCount = forwardsCount;
  }


  public Forwards forwardsOpens(Integer forwardsOpens) {
    
    this.forwardsOpens = forwardsOpens;
    return this;
  }

   /**
   * How many times the forwarded campaign has been opened.
   * @return forwardsOpens
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORWARDS_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getForwardsOpens() {
    return forwardsOpens;
  }


  @JsonProperty(JSON_PROPERTY_FORWARDS_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForwardsOpens(Integer forwardsOpens) {
    this.forwardsOpens = forwardsOpens;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Forwards forwards = (Forwards) o;
    return Objects.equals(this.forwardsCount, forwards.forwardsCount) &&
        Objects.equals(this.forwardsOpens, forwards.forwardsOpens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forwardsCount, forwardsOpens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Forwards {\n");
    sb.append("    forwardsCount: ").append(toIndentedString(forwardsCount)).append("\n");
    sb.append("    forwardsOpens: ").append(toIndentedString(forwardsOpens)).append("\n");
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

