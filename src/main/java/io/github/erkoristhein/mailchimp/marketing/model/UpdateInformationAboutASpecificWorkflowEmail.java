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
import io.github.erkoristhein.mailchimp.marketing.model.AutomationDelay1;
import io.github.erkoristhein.mailchimp.marketing.model.CampaignSettings1;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Update information about an individual Automation workflow email.
 */
@JsonPropertyOrder({
  UpdateInformationAboutASpecificWorkflowEmail.JSON_PROPERTY_SETTINGS,
  UpdateInformationAboutASpecificWorkflowEmail.JSON_PROPERTY_DELAY
})
@JsonTypeName("Update_information_about_a_specific_workflow_email")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class UpdateInformationAboutASpecificWorkflowEmail {
  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private CampaignSettings1 settings;

  public static final String JSON_PROPERTY_DELAY = "delay";
  private AutomationDelay1 delay;

  public UpdateInformationAboutASpecificWorkflowEmail() {
  }

  public UpdateInformationAboutASpecificWorkflowEmail settings(CampaignSettings1 settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignSettings1 getSettings() {
    return settings;
  }


  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettings(CampaignSettings1 settings) {
    this.settings = settings;
  }


  public UpdateInformationAboutASpecificWorkflowEmail delay(AutomationDelay1 delay) {
    
    this.delay = delay;
    return this;
  }

   /**
   * Get delay
   * @return delay
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AutomationDelay1 getDelay() {
    return delay;
  }


  @JsonProperty(JSON_PROPERTY_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelay(AutomationDelay1 delay) {
    this.delay = delay;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateInformationAboutASpecificWorkflowEmail updateInformationAboutASpecificWorkflowEmail = (UpdateInformationAboutASpecificWorkflowEmail) o;
    return Objects.equals(this.settings, updateInformationAboutASpecificWorkflowEmail.settings) &&
        Objects.equals(this.delay, updateInformationAboutASpecificWorkflowEmail.delay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings, delay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInformationAboutASpecificWorkflowEmail {\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
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

