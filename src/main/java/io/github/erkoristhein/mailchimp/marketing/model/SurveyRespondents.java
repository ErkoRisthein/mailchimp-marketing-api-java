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
import io.github.erkoristhein.mailchimp.marketing.model.Contact;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Survey respondent details.
 */
@JsonPropertyOrder({
  SurveyRespondents.JSON_PROPERTY_RESPONSE_ID,
  SurveyRespondents.JSON_PROPERTY_SUBMITTED_AT,
  SurveyRespondents.JSON_PROPERTY_CONTACT,
  SurveyRespondents.JSON_PROPERTY_IS_NEW_CONTACT
})
@JsonTypeName("Survey_Respondents")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class SurveyRespondents {
  public static final String JSON_PROPERTY_RESPONSE_ID = "response_id";
  private String responseId;

  public static final String JSON_PROPERTY_SUBMITTED_AT = "submitted_at";
  private OffsetDateTime submittedAt;

  public static final String JSON_PROPERTY_CONTACT = "contact";
  private Contact contact;

  public static final String JSON_PROPERTY_IS_NEW_CONTACT = "is_new_contact";
  private Boolean isNewContact;

  public SurveyRespondents() {
  }

  @JsonCreator
  public SurveyRespondents(
    @JsonProperty(JSON_PROPERTY_RESPONSE_ID) String responseId, 
    @JsonProperty(JSON_PROPERTY_SUBMITTED_AT) OffsetDateTime submittedAt
  ) {
    this();
    this.responseId = responseId;
    this.submittedAt = submittedAt;
  }

   /**
   * The ID for the survey response.
   * @return responseId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResponseId() {
    return responseId;
  }




   /**
   * The date and time when the survey response was submitted in ISO 8601 format.
   * @return submittedAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMITTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSubmittedAt() {
    return submittedAt;
  }




  public SurveyRespondents contact(Contact contact) {
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Contact getContact() {
    return contact;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContact(Contact contact) {
    this.contact = contact;
  }


  public SurveyRespondents isNewContact(Boolean isNewContact) {
    
    this.isNewContact = isNewContact;
    return this;
  }

   /**
   * If this contact was added to the Mailchimp audience via this survey.
   * @return isNewContact
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_NEW_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsNewContact() {
    return isNewContact;
  }


  @JsonProperty(JSON_PROPERTY_IS_NEW_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsNewContact(Boolean isNewContact) {
    this.isNewContact = isNewContact;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyRespondents surveyRespondents = (SurveyRespondents) o;
    return Objects.equals(this.responseId, surveyRespondents.responseId) &&
        Objects.equals(this.submittedAt, surveyRespondents.submittedAt) &&
        Objects.equals(this.contact, surveyRespondents.contact) &&
        Objects.equals(this.isNewContact, surveyRespondents.isNewContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseId, submittedAt, contact, isNewContact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyRespondents {\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    isNewContact: ").append(toIndentedString(isNewContact)).append("\n");
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

