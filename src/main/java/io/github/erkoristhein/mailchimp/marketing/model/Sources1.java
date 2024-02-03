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
 * The possible sources of any events that can trigger the webhook and whether they are enabled.
 */
@JsonPropertyOrder({
  Sources1.JSON_PROPERTY_USER,
  Sources1.JSON_PROPERTY_ADMIN,
  Sources1.JSON_PROPERTY_API
})
@JsonTypeName("Sources_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class Sources1 {
  public static final String JSON_PROPERTY_USER = "user";
  private Boolean user;

  public static final String JSON_PROPERTY_ADMIN = "admin";
  private Boolean admin;

  public static final String JSON_PROPERTY_API = "api";
  private Boolean api;

  public Sources1() {
  }

  public Sources1 user(Boolean user) {
    
    this.user = user;
    return this;
  }

   /**
   * Whether the webhook is triggered by subscriber-initiated actions.
   * @return user
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(Boolean user) {
    this.user = user;
  }


  public Sources1 admin(Boolean admin) {
    
    this.admin = admin;
    return this;
  }

   /**
   * Whether the webhook is triggered by admin-initiated actions in the web interface.
   * @return admin
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADMIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAdmin() {
    return admin;
  }


  @JsonProperty(JSON_PROPERTY_ADMIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }


  public Sources1 api(Boolean api) {
    
    this.api = api;
    return this;
  }

   /**
   * Whether the webhook is triggered by actions initiated via the API.
   * @return api
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getApi() {
    return api;
  }


  @JsonProperty(JSON_PROPERTY_API)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApi(Boolean api) {
    this.api = api;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sources1 sources1 = (Sources1) o;
    return Objects.equals(this.user, sources1.user) &&
        Objects.equals(this.admin, sources1.admin) &&
        Objects.equals(this.api, sources1.api);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, admin, api);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sources1 {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
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

