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
 * Information about the contact.
 */
@JsonPropertyOrder({
  Contact.JSON_PROPERTY_EMAIL_ID,
  Contact.JSON_PROPERTY_CONTACT_ID,
  Contact.JSON_PROPERTY_STATUS,
  Contact.JSON_PROPERTY_EMAIL,
  Contact.JSON_PROPERTY_FULL_NAME,
  Contact.JSON_PROPERTY_CONSENTS_TO_ONE_TO_ONE_MESSAGING,
  Contact.JSON_PROPERTY_AVATAR_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class Contact {
  public static final String JSON_PROPERTY_EMAIL_ID = "email_id";
  private String emailId;

  public static final String JSON_PROPERTY_CONTACT_ID = "contact_id";
  private String contactId;

  /**
   * The contact&#39;s current status.
   */
  public enum StatusEnum {
    SUBSCRIBED("Subscribed"),
    
    UNSUBSCRIBED("Unsubscribed"),
    
    NON_SUBSCRIBED("Non-Subscribed"),
    
    CLEANED("Cleaned"),
    
    ARCHIVED("Archived");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_FULL_NAME = "full_name";
  private String fullName;

  public static final String JSON_PROPERTY_CONSENTS_TO_ONE_TO_ONE_MESSAGING = "consents_to_one_to_one_messaging";
  private Boolean consentsToOneToOneMessaging;

  public static final String JSON_PROPERTY_AVATAR_URL = "avatar_url";
  private String avatarUrl;

  public Contact() {
  }

  @JsonCreator
  public Contact(
    @JsonProperty(JSON_PROPERTY_EMAIL_ID) String emailId, 
    @JsonProperty(JSON_PROPERTY_CONTACT_ID) String contactId, 
    @JsonProperty(JSON_PROPERTY_STATUS) StatusEnum status, 
    @JsonProperty(JSON_PROPERTY_EMAIL) String email, 
    @JsonProperty(JSON_PROPERTY_FULL_NAME) String fullName, 
    @JsonProperty(JSON_PROPERTY_CONSENTS_TO_ONE_TO_ONE_MESSAGING) Boolean consentsToOneToOneMessaging, 
    @JsonProperty(JSON_PROPERTY_AVATAR_URL) String avatarUrl
  ) {
    this();
    this.emailId = emailId;
    this.contactId = contactId;
    this.status = status;
    this.email = email;
    this.fullName = fullName;
    this.consentsToOneToOneMessaging = consentsToOneToOneMessaging;
    this.avatarUrl = avatarUrl;
  }

   /**
   * The MD5 hash of the lowercase version of the list member&#39;s email address.
   * @return emailId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailId() {
    return emailId;
  }




   /**
   * The ID of this contact.
   * @return contactId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactId() {
    return contactId;
  }




   /**
   * The contact&#39;s current status.
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }




   /**
   * The contact&#39;s email address.
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }




   /**
   * The contact&#39;s full name.
   * @return fullName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullName() {
    return fullName;
  }




   /**
   * Indicates whether a contact consents to 1:1 messaging.
   * @return consentsToOneToOneMessaging
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSENTS_TO_ONE_TO_ONE_MESSAGING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getConsentsToOneToOneMessaging() {
    return consentsToOneToOneMessaging;
  }




   /**
   * URL for the contact&#39;s avatar or profile image.
   * @return avatarUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAvatarUrl() {
    return avatarUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.emailId, contact.emailId) &&
        Objects.equals(this.contactId, contact.contactId) &&
        Objects.equals(this.status, contact.status) &&
        Objects.equals(this.email, contact.email) &&
        Objects.equals(this.fullName, contact.fullName) &&
        Objects.equals(this.consentsToOneToOneMessaging, contact.consentsToOneToOneMessaging) &&
        Objects.equals(this.avatarUrl, contact.avatarUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailId, contactId, status, email, fullName, consentsToOneToOneMessaging, avatarUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    consentsToOneToOneMessaging: ").append(toIndentedString(consentsToOneToOneMessaging)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
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

