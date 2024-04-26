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
import io.github.erkoristhein.mailchimp.marketing.model.CampaignDefaults1;
import io.github.erkoristhein.mailchimp.marketing.model.ListContact1;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information about a specific list.
 */
@JsonPropertyOrder({
  SubscriberList1.JSON_PROPERTY_NAME,
  SubscriberList1.JSON_PROPERTY_CONTACT,
  SubscriberList1.JSON_PROPERTY_PERMISSION_REMINDER,
  SubscriberList1.JSON_PROPERTY_USE_ARCHIVE_BAR,
  SubscriberList1.JSON_PROPERTY_CAMPAIGN_DEFAULTS,
  SubscriberList1.JSON_PROPERTY_NOTIFY_ON_SUBSCRIBE,
  SubscriberList1.JSON_PROPERTY_NOTIFY_ON_UNSUBSCRIBE,
  SubscriberList1.JSON_PROPERTY_EMAIL_TYPE_OPTION,
  SubscriberList1.JSON_PROPERTY_DOUBLE_OPTIN,
  SubscriberList1.JSON_PROPERTY_MARKETING_PERMISSIONS
})
@JsonTypeName("Subscriber_List_1")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class SubscriberList1 {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CONTACT = "contact";
  private ListContact1 contact;

  public static final String JSON_PROPERTY_PERMISSION_REMINDER = "permission_reminder";
  private String permissionReminder;

  public static final String JSON_PROPERTY_USE_ARCHIVE_BAR = "use_archive_bar";
  private Boolean useArchiveBar = false;

  public static final String JSON_PROPERTY_CAMPAIGN_DEFAULTS = "campaign_defaults";
  private CampaignDefaults1 campaignDefaults;

  public static final String JSON_PROPERTY_NOTIFY_ON_SUBSCRIBE = "notify_on_subscribe";
  private String notifyOnSubscribe = "false";

  public static final String JSON_PROPERTY_NOTIFY_ON_UNSUBSCRIBE = "notify_on_unsubscribe";
  private String notifyOnUnsubscribe = "false";

  public static final String JSON_PROPERTY_EMAIL_TYPE_OPTION = "email_type_option";
  private Boolean emailTypeOption;

  public static final String JSON_PROPERTY_DOUBLE_OPTIN = "double_optin";
  private Boolean doubleOptin = false;

  public static final String JSON_PROPERTY_MARKETING_PERMISSIONS = "marketing_permissions";
  private Boolean marketingPermissions = false;

  public SubscriberList1() {
  }

  public SubscriberList1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the list.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public SubscriberList1 contact(ListContact1 contact) {
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ListContact1 getContact() {
    return contact;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContact(ListContact1 contact) {
    this.contact = contact;
  }


  public SubscriberList1 permissionReminder(String permissionReminder) {
    
    this.permissionReminder = permissionReminder;
    return this;
  }

   /**
   * The [permission reminder](https://mailchimp.com/help/edit-the-permission-reminder/) for the list.
   * @return permissionReminder
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PERMISSION_REMINDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPermissionReminder() {
    return permissionReminder;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSION_REMINDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPermissionReminder(String permissionReminder) {
    this.permissionReminder = permissionReminder;
  }


  public SubscriberList1 useArchiveBar(Boolean useArchiveBar) {
    
    this.useArchiveBar = useArchiveBar;
    return this;
  }

   /**
   * Whether campaigns for this list use the [Archive Bar](https://mailchimp.com/help/about-email-campaign-archives-and-pages/) in archives by default.
   * @return useArchiveBar
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_ARCHIVE_BAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseArchiveBar() {
    return useArchiveBar;
  }


  @JsonProperty(JSON_PROPERTY_USE_ARCHIVE_BAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseArchiveBar(Boolean useArchiveBar) {
    this.useArchiveBar = useArchiveBar;
  }


  public SubscriberList1 campaignDefaults(CampaignDefaults1 campaignDefaults) {
    
    this.campaignDefaults = campaignDefaults;
    return this;
  }

   /**
   * Get campaignDefaults
   * @return campaignDefaults
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_DEFAULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CampaignDefaults1 getCampaignDefaults() {
    return campaignDefaults;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_DEFAULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCampaignDefaults(CampaignDefaults1 campaignDefaults) {
    this.campaignDefaults = campaignDefaults;
  }


  public SubscriberList1 notifyOnSubscribe(String notifyOnSubscribe) {
    
    this.notifyOnSubscribe = notifyOnSubscribe;
    return this;
  }

   /**
   * The email address to send [subscribe notifications](https://mailchimp.com/help/change-subscribe-and-unsubscribe-notifications/) to.
   * @return notifyOnSubscribe
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_SUBSCRIBE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotifyOnSubscribe() {
    return notifyOnSubscribe;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_SUBSCRIBE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifyOnSubscribe(String notifyOnSubscribe) {
    this.notifyOnSubscribe = notifyOnSubscribe;
  }


  public SubscriberList1 notifyOnUnsubscribe(String notifyOnUnsubscribe) {
    
    this.notifyOnUnsubscribe = notifyOnUnsubscribe;
    return this;
  }

   /**
   * The email address to send [unsubscribe notifications](https://mailchimp.com/help/change-subscribe-and-unsubscribe-notifications/) to.
   * @return notifyOnUnsubscribe
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_UNSUBSCRIBE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotifyOnUnsubscribe() {
    return notifyOnUnsubscribe;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_UNSUBSCRIBE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifyOnUnsubscribe(String notifyOnUnsubscribe) {
    this.notifyOnUnsubscribe = notifyOnUnsubscribe;
  }


  public SubscriberList1 emailTypeOption(Boolean emailTypeOption) {
    
    this.emailTypeOption = emailTypeOption;
    return this;
  }

   /**
   * Whether the list supports [multiple formats for emails](https://mailchimp.com/help/change-audience-name-defaults/). When set to &#x60;true&#x60;, subscribers can choose whether they want to receive HTML or plain-text emails. When set to &#x60;false&#x60;, subscribers will receive HTML emails, with a plain-text alternative backup.
   * @return emailTypeOption
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL_TYPE_OPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEmailTypeOption() {
    return emailTypeOption;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_TYPE_OPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmailTypeOption(Boolean emailTypeOption) {
    this.emailTypeOption = emailTypeOption;
  }


  public SubscriberList1 doubleOptin(Boolean doubleOptin) {
    
    this.doubleOptin = doubleOptin;
    return this;
  }

   /**
   * Whether or not to require the subscriber to confirm subscription via email.
   * @return doubleOptin
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOUBLE_OPTIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDoubleOptin() {
    return doubleOptin;
  }


  @JsonProperty(JSON_PROPERTY_DOUBLE_OPTIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDoubleOptin(Boolean doubleOptin) {
    this.doubleOptin = doubleOptin;
  }


  public SubscriberList1 marketingPermissions(Boolean marketingPermissions) {
    
    this.marketingPermissions = marketingPermissions;
    return this;
  }

   /**
   * Whether or not the list has marketing permissions (eg. GDPR) enabled.
   * @return marketingPermissions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARKETING_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMarketingPermissions() {
    return marketingPermissions;
  }


  @JsonProperty(JSON_PROPERTY_MARKETING_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketingPermissions(Boolean marketingPermissions) {
    this.marketingPermissions = marketingPermissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriberList1 subscriberList1 = (SubscriberList1) o;
    return Objects.equals(this.name, subscriberList1.name) &&
        Objects.equals(this.contact, subscriberList1.contact) &&
        Objects.equals(this.permissionReminder, subscriberList1.permissionReminder) &&
        Objects.equals(this.useArchiveBar, subscriberList1.useArchiveBar) &&
        Objects.equals(this.campaignDefaults, subscriberList1.campaignDefaults) &&
        Objects.equals(this.notifyOnSubscribe, subscriberList1.notifyOnSubscribe) &&
        Objects.equals(this.notifyOnUnsubscribe, subscriberList1.notifyOnUnsubscribe) &&
        Objects.equals(this.emailTypeOption, subscriberList1.emailTypeOption) &&
        Objects.equals(this.doubleOptin, subscriberList1.doubleOptin) &&
        Objects.equals(this.marketingPermissions, subscriberList1.marketingPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, contact, permissionReminder, useArchiveBar, campaignDefaults, notifyOnSubscribe, notifyOnUnsubscribe, emailTypeOption, doubleOptin, marketingPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriberList1 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    permissionReminder: ").append(toIndentedString(permissionReminder)).append("\n");
    sb.append("    useArchiveBar: ").append(toIndentedString(useArchiveBar)).append("\n");
    sb.append("    campaignDefaults: ").append(toIndentedString(campaignDefaults)).append("\n");
    sb.append("    notifyOnSubscribe: ").append(toIndentedString(notifyOnSubscribe)).append("\n");
    sb.append("    notifyOnUnsubscribe: ").append(toIndentedString(notifyOnUnsubscribe)).append("\n");
    sb.append("    emailTypeOption: ").append(toIndentedString(emailTypeOption)).append("\n");
    sb.append("    doubleOptin: ").append(toIndentedString(doubleOptin)).append("\n");
    sb.append("    marketingPermissions: ").append(toIndentedString(marketingPermissions)).append("\n");
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

