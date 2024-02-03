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
import io.github.erkoristhein.mailchimp.marketing.model.TrackingSettings;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A summary of an individual page&#39;s properties.
 */
@JsonPropertyOrder({
  LandingPage1.JSON_PROPERTY_NAME,
  LandingPage1.JSON_PROPERTY_TITLE,
  LandingPage1.JSON_PROPERTY_DESCRIPTION,
  LandingPage1.JSON_PROPERTY_STORE_ID,
  LandingPage1.JSON_PROPERTY_LIST_ID,
  LandingPage1.JSON_PROPERTY_TYPE,
  LandingPage1.JSON_PROPERTY_TEMPLATE_ID,
  LandingPage1.JSON_PROPERTY_TRACKING
})
@JsonTypeName("Landing_Page_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class LandingPage1 {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_STORE_ID = "store_id";
  private String storeId;

  public static final String JSON_PROPERTY_LIST_ID = "list_id";
  private String listId;

  /**
   * The type of template the landing page has.
   */
  public enum TypeEnum {
    SIGNUP("signup"),
    
    PRODUCT("product");

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

  public static final String JSON_PROPERTY_TEMPLATE_ID = "template_id";
  private Integer templateId;

  public static final String JSON_PROPERTY_TRACKING = "tracking";
  private TrackingSettings tracking;

  public LandingPage1() {
  }

  public LandingPage1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this landing page.
   * @return name
  **/
  @javax.annotation.Nullable
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


  public LandingPage1 title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of this landing page seen in the browser&#39;s title bar.
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public LandingPage1 description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of this landing page.
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public LandingPage1 storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * The ID of the store associated with this landing page.
   * @return storeId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoreId() {
    return storeId;
  }


  @JsonProperty(JSON_PROPERTY_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public LandingPage1 listId(String listId) {
    
    this.listId = listId;
    return this;
  }

   /**
   * The list&#39;s ID associated with this landing page.
   * @return listId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getListId() {
    return listId;
  }


  @JsonProperty(JSON_PROPERTY_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListId(String listId) {
    this.listId = listId;
  }


  public LandingPage1 type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of template the landing page has.
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


  public LandingPage1 templateId(Integer templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * The template_id of this landing page.
   * @return templateId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTemplateId() {
    return templateId;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }


  public LandingPage1 tracking(TrackingSettings tracking) {
    
    this.tracking = tracking;
    return this;
  }

   /**
   * Get tracking
   * @return tracking
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrackingSettings getTracking() {
    return tracking;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTracking(TrackingSettings tracking) {
    this.tracking = tracking;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LandingPage1 landingPage1 = (LandingPage1) o;
    return Objects.equals(this.name, landingPage1.name) &&
        Objects.equals(this.title, landingPage1.title) &&
        Objects.equals(this.description, landingPage1.description) &&
        Objects.equals(this.storeId, landingPage1.storeId) &&
        Objects.equals(this.listId, landingPage1.listId) &&
        Objects.equals(this.type, landingPage1.type) &&
        Objects.equals(this.templateId, landingPage1.templateId) &&
        Objects.equals(this.tracking, landingPage1.tracking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, title, description, storeId, listId, type, templateId, tracking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LandingPage1 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
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
