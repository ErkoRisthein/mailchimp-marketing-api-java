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
import io.github.erkoristhein.mailchimp.marketing.model.CampaignDefaults;
import io.github.erkoristhein.mailchimp.marketing.model.ListContact;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import io.github.erkoristhein.mailchimp.marketing.model.Statistics;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information about a specific list.
 */
@JsonPropertyOrder({
  SubscriberList.JSON_PROPERTY_ID,
  SubscriberList.JSON_PROPERTY_WEB_ID,
  SubscriberList.JSON_PROPERTY_NAME,
  SubscriberList.JSON_PROPERTY_CONTACT,
  SubscriberList.JSON_PROPERTY_PERMISSION_REMINDER,
  SubscriberList.JSON_PROPERTY_USE_ARCHIVE_BAR,
  SubscriberList.JSON_PROPERTY_CAMPAIGN_DEFAULTS,
  SubscriberList.JSON_PROPERTY_NOTIFY_ON_SUBSCRIBE,
  SubscriberList.JSON_PROPERTY_NOTIFY_ON_UNSUBSCRIBE,
  SubscriberList.JSON_PROPERTY_DATE_CREATED,
  SubscriberList.JSON_PROPERTY_LIST_RATING,
  SubscriberList.JSON_PROPERTY_EMAIL_TYPE_OPTION,
  SubscriberList.JSON_PROPERTY_SUBSCRIBE_URL_SHORT,
  SubscriberList.JSON_PROPERTY_SUBSCRIBE_URL_LONG,
  SubscriberList.JSON_PROPERTY_BEAMER_ADDRESS,
  SubscriberList.JSON_PROPERTY_VISIBILITY,
  SubscriberList.JSON_PROPERTY_DOUBLE_OPTIN,
  SubscriberList.JSON_PROPERTY_HAS_WELCOME,
  SubscriberList.JSON_PROPERTY_MARKETING_PERMISSIONS,
  SubscriberList.JSON_PROPERTY_MODULES,
  SubscriberList.JSON_PROPERTY_STATS,
  SubscriberList.JSON_PROPERTY_LINKS
})
@JsonTypeName("Subscriber_List")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class SubscriberList {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_WEB_ID = "web_id";
  private Integer webId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CONTACT = "contact";
  private ListContact contact;

  public static final String JSON_PROPERTY_PERMISSION_REMINDER = "permission_reminder";
  private String permissionReminder;

  public static final String JSON_PROPERTY_USE_ARCHIVE_BAR = "use_archive_bar";
  private Boolean useArchiveBar = false;

  public static final String JSON_PROPERTY_CAMPAIGN_DEFAULTS = "campaign_defaults";
  private CampaignDefaults campaignDefaults;

  public static final String JSON_PROPERTY_NOTIFY_ON_SUBSCRIBE = "notify_on_subscribe";
  private String notifyOnSubscribe = "false";

  public static final String JSON_PROPERTY_NOTIFY_ON_UNSUBSCRIBE = "notify_on_unsubscribe";
  private String notifyOnUnsubscribe = "false";

  public static final String JSON_PROPERTY_DATE_CREATED = "date_created";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_LIST_RATING = "list_rating";
  private Integer listRating;

  public static final String JSON_PROPERTY_EMAIL_TYPE_OPTION = "email_type_option";
  private Boolean emailTypeOption;

  public static final String JSON_PROPERTY_SUBSCRIBE_URL_SHORT = "subscribe_url_short";
  private String subscribeUrlShort;

  public static final String JSON_PROPERTY_SUBSCRIBE_URL_LONG = "subscribe_url_long";
  private String subscribeUrlLong;

  public static final String JSON_PROPERTY_BEAMER_ADDRESS = "beamer_address";
  private String beamerAddress;

  /**
   * Legacy - visibility settings are no longer used
   */
  public enum VisibilityEnum {
    PUB("pub"),
    
    PRV("prv");

    private String value;

    VisibilityEnum(String value) {
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
    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VISIBILITY = "visibility";
  private VisibilityEnum visibility;

  public static final String JSON_PROPERTY_DOUBLE_OPTIN = "double_optin";
  private Boolean doubleOptin = false;

  public static final String JSON_PROPERTY_HAS_WELCOME = "has_welcome";
  private Boolean hasWelcome = false;

  public static final String JSON_PROPERTY_MARKETING_PERMISSIONS = "marketing_permissions";
  private Boolean marketingPermissions = false;

  public static final String JSON_PROPERTY_MODULES = "modules";
  private List<String> modules = new ArrayList<>();

  public static final String JSON_PROPERTY_STATS = "stats";
  private Statistics stats;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links = new ArrayList<>();

  public SubscriberList() {
  }

  @JsonCreator
  public SubscriberList(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_WEB_ID) Integer webId, 
    @JsonProperty(JSON_PROPERTY_DATE_CREATED) OffsetDateTime dateCreated, 
    @JsonProperty(JSON_PROPERTY_LIST_RATING) Integer listRating, 
    @JsonProperty(JSON_PROPERTY_SUBSCRIBE_URL_SHORT) String subscribeUrlShort, 
    @JsonProperty(JSON_PROPERTY_SUBSCRIBE_URL_LONG) String subscribeUrlLong, 
    @JsonProperty(JSON_PROPERTY_BEAMER_ADDRESS) String beamerAddress, 
    @JsonProperty(JSON_PROPERTY_MODULES) List<String> modules, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.id = id;
    this.webId = webId;
    this.dateCreated = dateCreated;
    this.listRating = listRating;
    this.subscribeUrlShort = subscribeUrlShort;
    this.subscribeUrlLong = subscribeUrlLong;
    this.beamerAddress = beamerAddress;
    this.modules = modules;
    this.links = links;
  }

   /**
   * A string that uniquely identifies this list.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * The ID used in the Mailchimp web application. View this list in your Mailchimp account at &#x60;https://{dc}.admin.mailchimp.com/lists/members/?id&#x3D;{web_id}&#x60;.
   * @return webId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWebId() {
    return webId;
  }




  public SubscriberList name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the list.
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


  public SubscriberList contact(ListContact contact) {
    
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

  public ListContact getContact() {
    return contact;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContact(ListContact contact) {
    this.contact = contact;
  }


  public SubscriberList permissionReminder(String permissionReminder) {
    
    this.permissionReminder = permissionReminder;
    return this;
  }

   /**
   * The [permission reminder](https://mailchimp.com/help/edit-the-permission-reminder/) for the list.
   * @return permissionReminder
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERMISSION_REMINDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPermissionReminder() {
    return permissionReminder;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSION_REMINDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermissionReminder(String permissionReminder) {
    this.permissionReminder = permissionReminder;
  }


  public SubscriberList useArchiveBar(Boolean useArchiveBar) {
    
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


  public SubscriberList campaignDefaults(CampaignDefaults campaignDefaults) {
    
    this.campaignDefaults = campaignDefaults;
    return this;
  }

   /**
   * Get campaignDefaults
   * @return campaignDefaults
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_DEFAULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignDefaults getCampaignDefaults() {
    return campaignDefaults;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_DEFAULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignDefaults(CampaignDefaults campaignDefaults) {
    this.campaignDefaults = campaignDefaults;
  }


  public SubscriberList notifyOnSubscribe(String notifyOnSubscribe) {
    
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


  public SubscriberList notifyOnUnsubscribe(String notifyOnUnsubscribe) {
    
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


   /**
   * The date and time that this list was created in ISO 8601 format.
   * @return dateCreated
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }




   /**
   * An auto-generated activity score for the list (0-5).
   * @return listRating
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getListRating() {
    return listRating;
  }




  public SubscriberList emailTypeOption(Boolean emailTypeOption) {
    
    this.emailTypeOption = emailTypeOption;
    return this;
  }

   /**
   * Whether the list supports [multiple formats for emails](https://mailchimp.com/help/change-audience-name-defaults/). When set to &#x60;true&#x60;, subscribers can choose whether they want to receive HTML or plain-text emails. When set to &#x60;false&#x60;, subscribers will receive HTML emails, with a plain-text alternative backup.
   * @return emailTypeOption
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_TYPE_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmailTypeOption() {
    return emailTypeOption;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_TYPE_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailTypeOption(Boolean emailTypeOption) {
    this.emailTypeOption = emailTypeOption;
  }


   /**
   * Our [url shortened](https://mailchimp.com/help/share-your-signup-form/) version of this list&#39;s subscribe form.
   * @return subscribeUrlShort
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIBE_URL_SHORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubscribeUrlShort() {
    return subscribeUrlShort;
  }




   /**
   * The full version of this list&#39;s subscribe form (host will vary).
   * @return subscribeUrlLong
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIBE_URL_LONG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubscribeUrlLong() {
    return subscribeUrlLong;
  }




   /**
   * The list&#39;s [Email Beamer](https://mailchimp.com/help/use-email-beamer-to-create-a-campaign/) address.
   * @return beamerAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BEAMER_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBeamerAddress() {
    return beamerAddress;
  }




  public SubscriberList visibility(VisibilityEnum visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Legacy - visibility settings are no longer used
   * @return visibility
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VisibilityEnum getVisibility() {
    return visibility;
  }


  @JsonProperty(JSON_PROPERTY_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }


  public SubscriberList doubleOptin(Boolean doubleOptin) {
    
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


  public SubscriberList hasWelcome(Boolean hasWelcome) {
    
    this.hasWelcome = hasWelcome;
    return this;
  }

   /**
   * Whether or not this list has a welcome automation connected. Welcome Automations: welcomeSeries, singleWelcome, emailFollowup.
   * @return hasWelcome
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_WELCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasWelcome() {
    return hasWelcome;
  }


  @JsonProperty(JSON_PROPERTY_HAS_WELCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasWelcome(Boolean hasWelcome) {
    this.hasWelcome = hasWelcome;
  }


  public SubscriberList marketingPermissions(Boolean marketingPermissions) {
    
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


   /**
   * Any list-specific modules installed for this list.
   * @return modules
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getModules() {
    return modules;
  }




  public SubscriberList stats(Statistics stats) {
    
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Statistics getStats() {
    return stats;
  }


  @JsonProperty(JSON_PROPERTY_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStats(Statistics stats) {
    this.stats = stats;
  }


   /**
   * A list of link types and descriptions for the API schema documents.
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ResourceLink> getLinks() {
    return links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriberList subscriberList = (SubscriberList) o;
    return Objects.equals(this.id, subscriberList.id) &&
        Objects.equals(this.webId, subscriberList.webId) &&
        Objects.equals(this.name, subscriberList.name) &&
        Objects.equals(this.contact, subscriberList.contact) &&
        Objects.equals(this.permissionReminder, subscriberList.permissionReminder) &&
        Objects.equals(this.useArchiveBar, subscriberList.useArchiveBar) &&
        Objects.equals(this.campaignDefaults, subscriberList.campaignDefaults) &&
        Objects.equals(this.notifyOnSubscribe, subscriberList.notifyOnSubscribe) &&
        Objects.equals(this.notifyOnUnsubscribe, subscriberList.notifyOnUnsubscribe) &&
        Objects.equals(this.dateCreated, subscriberList.dateCreated) &&
        Objects.equals(this.listRating, subscriberList.listRating) &&
        Objects.equals(this.emailTypeOption, subscriberList.emailTypeOption) &&
        Objects.equals(this.subscribeUrlShort, subscriberList.subscribeUrlShort) &&
        Objects.equals(this.subscribeUrlLong, subscriberList.subscribeUrlLong) &&
        Objects.equals(this.beamerAddress, subscriberList.beamerAddress) &&
        Objects.equals(this.visibility, subscriberList.visibility) &&
        Objects.equals(this.doubleOptin, subscriberList.doubleOptin) &&
        Objects.equals(this.hasWelcome, subscriberList.hasWelcome) &&
        Objects.equals(this.marketingPermissions, subscriberList.marketingPermissions) &&
        Objects.equals(this.modules, subscriberList.modules) &&
        Objects.equals(this.stats, subscriberList.stats) &&
        Objects.equals(this.links, subscriberList.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, webId, name, contact, permissionReminder, useArchiveBar, campaignDefaults, notifyOnSubscribe, notifyOnUnsubscribe, dateCreated, listRating, emailTypeOption, subscribeUrlShort, subscribeUrlLong, beamerAddress, visibility, doubleOptin, hasWelcome, marketingPermissions, modules, stats, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriberList {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    webId: ").append(toIndentedString(webId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    permissionReminder: ").append(toIndentedString(permissionReminder)).append("\n");
    sb.append("    useArchiveBar: ").append(toIndentedString(useArchiveBar)).append("\n");
    sb.append("    campaignDefaults: ").append(toIndentedString(campaignDefaults)).append("\n");
    sb.append("    notifyOnSubscribe: ").append(toIndentedString(notifyOnSubscribe)).append("\n");
    sb.append("    notifyOnUnsubscribe: ").append(toIndentedString(notifyOnUnsubscribe)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    listRating: ").append(toIndentedString(listRating)).append("\n");
    sb.append("    emailTypeOption: ").append(toIndentedString(emailTypeOption)).append("\n");
    sb.append("    subscribeUrlShort: ").append(toIndentedString(subscribeUrlShort)).append("\n");
    sb.append("    subscribeUrlLong: ").append(toIndentedString(subscribeUrlLong)).append("\n");
    sb.append("    beamerAddress: ").append(toIndentedString(beamerAddress)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    doubleOptin: ").append(toIndentedString(doubleOptin)).append("\n");
    sb.append("    hasWelcome: ").append(toIndentedString(hasWelcome)).append("\n");
    sb.append("    marketingPermissions: ").append(toIndentedString(marketingPermissions)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

