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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PromosInner
 */
@JsonPropertyOrder({
  PromosInner.JSON_PROPERTY_CODE,
  PromosInner.JSON_PROPERTY_AMOUNT_DISCOUNTED,
  PromosInner.JSON_PROPERTY_TYPE
})
@JsonTypeName("Promos_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class PromosInner {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_AMOUNT_DISCOUNTED = "amount_discounted";
  private BigDecimal amountDiscounted;

  /**
   * Type of discount. For free shipping set type to fixed
   */
  public enum TypeEnum {
    FIXED("fixed"),
    
    PERCENTAGE("percentage");

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

  public PromosInner() {
  }

  public PromosInner code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The Promo Code
   * @return code
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public PromosInner amountDiscounted(BigDecimal amountDiscounted) {
    
    this.amountDiscounted = amountDiscounted;
    return this;
  }

   /**
   * The amount of discount applied on the total price. For example if the total cost was $100 and the customer paid $95.5, amount_discounted will be 4.5 For free shipping set amount_discounted to 0
   * @return amountDiscounted
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT_DISCOUNTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmountDiscounted() {
    return amountDiscounted;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_DISCOUNTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountDiscounted(BigDecimal amountDiscounted) {
    this.amountDiscounted = amountDiscounted;
  }


  public PromosInner type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of discount. For free shipping set type to fixed
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    PromosInner promosInner = (PromosInner) o;
    return Objects.equals(this.code, promosInner.code) &&
        Objects.equals(this.amountDiscounted, promosInner.amountDiscounted) &&
        Objects.equals(this.type, promosInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, amountDiscounted, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromosInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    amountDiscounted: ").append(toIndentedString(amountDiscounted)).append("\n");
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

