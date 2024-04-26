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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The billing address for the order.
 */
@JsonPropertyOrder({
  BillingAddress.JSON_PROPERTY_NAME,
  BillingAddress.JSON_PROPERTY_ADDRESS1,
  BillingAddress.JSON_PROPERTY_ADDRESS2,
  BillingAddress.JSON_PROPERTY_CITY,
  BillingAddress.JSON_PROPERTY_PROVINCE,
  BillingAddress.JSON_PROPERTY_PROVINCE_CODE,
  BillingAddress.JSON_PROPERTY_POSTAL_CODE,
  BillingAddress.JSON_PROPERTY_COUNTRY,
  BillingAddress.JSON_PROPERTY_COUNTRY_CODE,
  BillingAddress.JSON_PROPERTY_LONGITUDE,
  BillingAddress.JSON_PROPERTY_LATITUDE,
  BillingAddress.JSON_PROPERTY_PHONE,
  BillingAddress.JSON_PROPERTY_COMPANY
})
@JsonTypeName("Billing_Address")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class BillingAddress {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ADDRESS1 = "address1";
  private String address1;

  public static final String JSON_PROPERTY_ADDRESS2 = "address2";
  private String address2;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_PROVINCE = "province";
  private String province;

  public static final String JSON_PROPERTY_PROVINCE_CODE = "province_code";
  private String provinceCode;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postal_code";
  private String postalCode;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private BigDecimal longitude;

  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private BigDecimal latitude;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_COMPANY = "company";
  private String company;

  public BillingAddress() {
  }

  public BillingAddress name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name associated with an order&#39;s billing address.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public BillingAddress address1(String address1) {
    
    this.address1 = address1;
    return this;
  }

   /**
   * The billing address for the order.
   * @return address1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress1() {
    return address1;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  public BillingAddress address2(String address2) {
    
    this.address2 = address2;
    return this;
  }

   /**
   * An additional field for the billing address.
   * @return address2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress2() {
    return address2;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  public BillingAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city in the billing address.
   * @return city
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public BillingAddress province(String province) {
    
    this.province = province;
    return this;
  }

   /**
   * The state or normalized province in the billing address.
   * @return province
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProvince() {
    return province;
  }


  @JsonProperty(JSON_PROPERTY_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvince(String province) {
    this.province = province;
  }


  public BillingAddress provinceCode(String provinceCode) {
    
    this.provinceCode = provinceCode;
    return this;
  }

   /**
   * The two-letter code for the province or state in the billing address.
   * @return provinceCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVINCE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProvinceCode() {
    return provinceCode;
  }


  @JsonProperty(JSON_PROPERTY_PROVINCE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }


  public BillingAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal or zip code in the billing address.
   * @return postalCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public BillingAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country in the billing address.
   * @return country
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }


  public BillingAddress countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The two-letter code for the country in the billing address.
   * @return countryCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public BillingAddress longitude(BigDecimal longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * The longitude for the billing address location.
   * @return longitude
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLongitude() {
    return longitude;
  }


  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  public BillingAddress latitude(BigDecimal latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * The latitude for the billing address location.
   * @return latitude
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLatitude() {
    return latitude;
  }


  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }


  public BillingAddress phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * The phone number for the billing address.
   * @return phone
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(String phone) {
    this.phone = phone;
  }


  public BillingAddress company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * The company associated with the billing address.
   * @return company
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompany() {
    return company;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompany(String company) {
    this.company = company;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingAddress billingAddress = (BillingAddress) o;
    return Objects.equals(this.name, billingAddress.name) &&
        Objects.equals(this.address1, billingAddress.address1) &&
        Objects.equals(this.address2, billingAddress.address2) &&
        Objects.equals(this.city, billingAddress.city) &&
        Objects.equals(this.province, billingAddress.province) &&
        Objects.equals(this.provinceCode, billingAddress.provinceCode) &&
        Objects.equals(this.postalCode, billingAddress.postalCode) &&
        Objects.equals(this.country, billingAddress.country) &&
        Objects.equals(this.countryCode, billingAddress.countryCode) &&
        Objects.equals(this.longitude, billingAddress.longitude) &&
        Objects.equals(this.latitude, billingAddress.latitude) &&
        Objects.equals(this.phone, billingAddress.phone) &&
        Objects.equals(this.company, billingAddress.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address1, address2, city, province, provinceCode, postalCode, country, countryCode, longitude, latitude, phone, company);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingAddress {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    provinceCode: ").append(toIndentedString(provinceCode)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

