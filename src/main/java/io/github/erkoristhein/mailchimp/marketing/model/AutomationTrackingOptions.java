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
import io.github.erkoristhein.mailchimp.marketing.model.CapsuleCRMTracking;
import io.github.erkoristhein.mailchimp.marketing.model.SalesforceCRMTracking;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The tracking options for the Automation.
 */
@JsonPropertyOrder({
  AutomationTrackingOptions.JSON_PROPERTY_OPENS,
  AutomationTrackingOptions.JSON_PROPERTY_HTML_CLICKS,
  AutomationTrackingOptions.JSON_PROPERTY_TEXT_CLICKS,
  AutomationTrackingOptions.JSON_PROPERTY_GOAL_TRACKING,
  AutomationTrackingOptions.JSON_PROPERTY_ECOMM360,
  AutomationTrackingOptions.JSON_PROPERTY_GOOGLE_ANALYTICS,
  AutomationTrackingOptions.JSON_PROPERTY_CLICKTALE,
  AutomationTrackingOptions.JSON_PROPERTY_SALESFORCE,
  AutomationTrackingOptions.JSON_PROPERTY_CAPSULE
})
@JsonTypeName("Automation_Tracking_Options")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class AutomationTrackingOptions {
  public static final String JSON_PROPERTY_OPENS = "opens";
  private Boolean opens;

  public static final String JSON_PROPERTY_HTML_CLICKS = "html_clicks";
  private Boolean htmlClicks;

  public static final String JSON_PROPERTY_TEXT_CLICKS = "text_clicks";
  private Boolean textClicks;

  public static final String JSON_PROPERTY_GOAL_TRACKING = "goal_tracking";
  private Boolean goalTracking;

  public static final String JSON_PROPERTY_ECOMM360 = "ecomm360";
  private Boolean ecomm360;

  public static final String JSON_PROPERTY_GOOGLE_ANALYTICS = "google_analytics";
  private String googleAnalytics;

  public static final String JSON_PROPERTY_CLICKTALE = "clicktale";
  private String clicktale;

  public static final String JSON_PROPERTY_SALESFORCE = "salesforce";
  private SalesforceCRMTracking salesforce;

  public static final String JSON_PROPERTY_CAPSULE = "capsule";
  private CapsuleCRMTracking capsule;

  public AutomationTrackingOptions() {
  }

  public AutomationTrackingOptions opens(Boolean opens) {
    
    this.opens = opens;
    return this;
  }

   /**
   * Whether to [track opens](https://mailchimp.com/help/about-open-tracking/). Defaults to &#x60;true&#x60;.
   * @return opens
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOpens() {
    return opens;
  }


  @JsonProperty(JSON_PROPERTY_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpens(Boolean opens) {
    this.opens = opens;
  }


  public AutomationTrackingOptions htmlClicks(Boolean htmlClicks) {
    
    this.htmlClicks = htmlClicks;
    return this;
  }

   /**
   * Whether to [track clicks](https://mailchimp.com/help/enable-and-view-click-tracking/) in the HTML version of the Automation. Defaults to &#x60;true&#x60;.
   * @return htmlClicks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTML_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHtmlClicks() {
    return htmlClicks;
  }


  @JsonProperty(JSON_PROPERTY_HTML_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtmlClicks(Boolean htmlClicks) {
    this.htmlClicks = htmlClicks;
  }


  public AutomationTrackingOptions textClicks(Boolean textClicks) {
    
    this.textClicks = textClicks;
    return this;
  }

   /**
   * Whether to [track clicks](https://mailchimp.com/help/enable-and-view-click-tracking/) in the plain-text version of the Automation. Defaults to &#x60;true&#x60;.
   * @return textClicks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTextClicks() {
    return textClicks;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextClicks(Boolean textClicks) {
    this.textClicks = textClicks;
  }


  public AutomationTrackingOptions goalTracking(Boolean goalTracking) {
    
    this.goalTracking = goalTracking;
    return this;
  }

   /**
   * Deprecated
   * @return goalTracking
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GOAL_TRACKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getGoalTracking() {
    return goalTracking;
  }


  @JsonProperty(JSON_PROPERTY_GOAL_TRACKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoalTracking(Boolean goalTracking) {
    this.goalTracking = goalTracking;
  }


  public AutomationTrackingOptions ecomm360(Boolean ecomm360) {
    
    this.ecomm360 = ecomm360;
    return this;
  }

   /**
   * Whether to enable e-commerce tracking.
   * @return ecomm360
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ECOMM360)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEcomm360() {
    return ecomm360;
  }


  @JsonProperty(JSON_PROPERTY_ECOMM360)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEcomm360(Boolean ecomm360) {
    this.ecomm360 = ecomm360;
  }


  public AutomationTrackingOptions googleAnalytics(String googleAnalytics) {
    
    this.googleAnalytics = googleAnalytics;
    return this;
  }

   /**
   * The custom slug for [Google Analytics](https://mailchimp.com/help/integrate-google-analytics-with-mailchimp/) tracking (max of 50 bytes).
   * @return googleAnalytics
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GOOGLE_ANALYTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGoogleAnalytics() {
    return googleAnalytics;
  }


  @JsonProperty(JSON_PROPERTY_GOOGLE_ANALYTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoogleAnalytics(String googleAnalytics) {
    this.googleAnalytics = googleAnalytics;
  }


  public AutomationTrackingOptions clicktale(String clicktale) {
    
    this.clicktale = clicktale;
    return this;
  }

   /**
   * The custom slug for [ClickTale](https://mailchimp.com/help/additional-tracking-options-for-campaigns/) tracking (max of 50 bytes).
   * @return clicktale
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLICKTALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClicktale() {
    return clicktale;
  }


  @JsonProperty(JSON_PROPERTY_CLICKTALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClicktale(String clicktale) {
    this.clicktale = clicktale;
  }


  public AutomationTrackingOptions salesforce(SalesforceCRMTracking salesforce) {
    
    this.salesforce = salesforce;
    return this;
  }

   /**
   * Get salesforce
   * @return salesforce
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SALESFORCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SalesforceCRMTracking getSalesforce() {
    return salesforce;
  }


  @JsonProperty(JSON_PROPERTY_SALESFORCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSalesforce(SalesforceCRMTracking salesforce) {
    this.salesforce = salesforce;
  }


  public AutomationTrackingOptions capsule(CapsuleCRMTracking capsule) {
    
    this.capsule = capsule;
    return this;
  }

   /**
   * Get capsule
   * @return capsule
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAPSULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CapsuleCRMTracking getCapsule() {
    return capsule;
  }


  @JsonProperty(JSON_PROPERTY_CAPSULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapsule(CapsuleCRMTracking capsule) {
    this.capsule = capsule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomationTrackingOptions automationTrackingOptions = (AutomationTrackingOptions) o;
    return Objects.equals(this.opens, automationTrackingOptions.opens) &&
        Objects.equals(this.htmlClicks, automationTrackingOptions.htmlClicks) &&
        Objects.equals(this.textClicks, automationTrackingOptions.textClicks) &&
        Objects.equals(this.goalTracking, automationTrackingOptions.goalTracking) &&
        Objects.equals(this.ecomm360, automationTrackingOptions.ecomm360) &&
        Objects.equals(this.googleAnalytics, automationTrackingOptions.googleAnalytics) &&
        Objects.equals(this.clicktale, automationTrackingOptions.clicktale) &&
        Objects.equals(this.salesforce, automationTrackingOptions.salesforce) &&
        Objects.equals(this.capsule, automationTrackingOptions.capsule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opens, htmlClicks, textClicks, goalTracking, ecomm360, googleAnalytics, clicktale, salesforce, capsule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationTrackingOptions {\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    htmlClicks: ").append(toIndentedString(htmlClicks)).append("\n");
    sb.append("    textClicks: ").append(toIndentedString(textClicks)).append("\n");
    sb.append("    goalTracking: ").append(toIndentedString(goalTracking)).append("\n");
    sb.append("    ecomm360: ").append(toIndentedString(ecomm360)).append("\n");
    sb.append("    googleAnalytics: ").append(toIndentedString(googleAnalytics)).append("\n");
    sb.append("    clicktale: ").append(toIndentedString(clicktale)).append("\n");
    sb.append("    salesforce: ").append(toIndentedString(salesforce)).append("\n");
    sb.append("    capsule: ").append(toIndentedString(capsule)).append("\n");
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

