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
 * ErrorsInner
 */
@JsonPropertyOrder({
  ErrorsInner.JSON_PROPERTY_EMAIL_ADDRESS,
  ErrorsInner.JSON_PROPERTY_ERROR,
  ErrorsInner.JSON_PROPERTY_ERROR_CODE,
  ErrorsInner.JSON_PROPERTY_FIELD,
  ErrorsInner.JSON_PROPERTY_FIELD_MESSAGE
})
@JsonTypeName("Errors_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class ErrorsInner {
  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "email_address";
  private String emailAddress;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  /**
   * A unique code that identifies this specifc error.
   */
  public enum ErrorCodeEnum {
    CONTACT_EXISTS("ERROR_CONTACT_EXISTS"),
    
    GENERIC("ERROR_GENERIC");

    private String value;

    ErrorCodeEnum(String value) {
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
    public static ErrorCodeEnum fromValue(String value) {
      for (ErrorCodeEnum b : ErrorCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ERROR_CODE = "error_code";
  private ErrorCodeEnum errorCode;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_FIELD_MESSAGE = "field_message";
  private String fieldMessage;

  public ErrorsInner() {
  }

  public ErrorsInner emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address that could not be added or updated.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public ErrorsInner error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * The error message indicating why the email address could not be added or updated.
   * @return error
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(String error) {
    this.error = error;
  }


  public ErrorsInner errorCode(ErrorCodeEnum errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * A unique code that identifies this specifc error.
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }


  public ErrorsInner field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * If the error is field-related, information about which field is at issue.
   * @return field
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setField(String field) {
    this.field = field;
  }


  public ErrorsInner fieldMessage(String fieldMessage) {
    
    this.fieldMessage = fieldMessage;
    return this;
  }

   /**
   * Message indicating how to resolve a field-related error.
   * @return fieldMessage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldMessage() {
    return fieldMessage;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldMessage(String fieldMessage) {
    this.fieldMessage = fieldMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorsInner errorsInner = (ErrorsInner) o;
    return Objects.equals(this.emailAddress, errorsInner.emailAddress) &&
        Objects.equals(this.error, errorsInner.error) &&
        Objects.equals(this.errorCode, errorsInner.errorCode) &&
        Objects.equals(this.field, errorsInner.field) &&
        Objects.equals(this.fieldMessage, errorsInner.fieldMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, error, errorCode, field, fieldMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsInner {\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    fieldMessage: ").append(toIndentedString(fieldMessage)).append("\n");
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
