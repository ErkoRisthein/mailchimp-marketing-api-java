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
import io.github.erkoristhein.mailchimp.marketing.model.Location;
import io.github.erkoristhein.mailchimp.marketing.model.MarketingPermission1;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Individuals who are currently or have been previously subscribed to this list, including members who have bounced or unsubscribed.
 */
@JsonPropertyOrder({
  AddListMembers2.JSON_PROPERTY_EMAIL_ADDRESS,
  AddListMembers2.JSON_PROPERTY_STATUS_IF_NEW,
  AddListMembers2.JSON_PROPERTY_EMAIL_TYPE,
  AddListMembers2.JSON_PROPERTY_STATUS,
  AddListMembers2.JSON_PROPERTY_MERGE_FIELDS,
  AddListMembers2.JSON_PROPERTY_INTERESTS,
  AddListMembers2.JSON_PROPERTY_LANGUAGE,
  AddListMembers2.JSON_PROPERTY_VIP,
  AddListMembers2.JSON_PROPERTY_LOCATION,
  AddListMembers2.JSON_PROPERTY_MARKETING_PERMISSIONS,
  AddListMembers2.JSON_PROPERTY_IP_SIGNUP,
  AddListMembers2.JSON_PROPERTY_TIMESTAMP_SIGNUP,
  AddListMembers2.JSON_PROPERTY_IP_OPT,
  AddListMembers2.JSON_PROPERTY_TIMESTAMP_OPT
})
@JsonTypeName("Add_List_Members_2")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class AddListMembers2 {
  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "email_address";
  private String emailAddress;

  /**
   * Subscriber&#39;s status. This value is required only if the email address is not already present on the list.
   */
  public enum StatusIfNewEnum {
    SUBSCRIBED("subscribed"),
    
    UNSUBSCRIBED("unsubscribed"),
    
    CLEANED("cleaned"),
    
    PENDING("pending"),
    
    TRANSACTIONAL("transactional");

    private String value;

    StatusIfNewEnum(String value) {
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
    public static StatusIfNewEnum fromValue(String value) {
      for (StatusIfNewEnum b : StatusIfNewEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS_IF_NEW = "status_if_new";
  private StatusIfNewEnum statusIfNew;

  public static final String JSON_PROPERTY_EMAIL_TYPE = "email_type";
  private String emailType;

  /**
   * Subscriber&#39;s current status.
   */
  public enum StatusEnum {
    SUBSCRIBED("subscribed"),
    
    UNSUBSCRIBED("unsubscribed"),
    
    CLEANED("cleaned"),
    
    PENDING("pending"),
    
    TRANSACTIONAL("transactional");

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

  public static final String JSON_PROPERTY_MERGE_FIELDS = "merge_fields";
  private Map<String, Object> mergeFields = new HashMap<>();

  public static final String JSON_PROPERTY_INTERESTS = "interests";
  private Map<String, Boolean> interests = new HashMap<>();

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_VIP = "vip";
  private Boolean vip;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private Location location;

  public static final String JSON_PROPERTY_MARKETING_PERMISSIONS = "marketing_permissions";
  private List<MarketingPermission1> marketingPermissions = new ArrayList<>();

  public static final String JSON_PROPERTY_IP_SIGNUP = "ip_signup";
  private String ipSignup;

  public static final String JSON_PROPERTY_TIMESTAMP_SIGNUP = "timestamp_signup";
  private OffsetDateTime timestampSignup;

  public static final String JSON_PROPERTY_IP_OPT = "ip_opt";
  private String ipOpt;

  public static final String JSON_PROPERTY_TIMESTAMP_OPT = "timestamp_opt";
  private OffsetDateTime timestampOpt;

  public AddListMembers2() {
  }

  public AddListMembers2 emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Email address for a subscriber. This value is required only if the email address is not already present on the list.
   * @return emailAddress
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmailAddress() {
    return emailAddress;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public AddListMembers2 statusIfNew(StatusIfNewEnum statusIfNew) {
    
    this.statusIfNew = statusIfNew;
    return this;
  }

   /**
   * Subscriber&#39;s status. This value is required only if the email address is not already present on the list.
   * @return statusIfNew
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS_IF_NEW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusIfNewEnum getStatusIfNew() {
    return statusIfNew;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_IF_NEW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatusIfNew(StatusIfNewEnum statusIfNew) {
    this.statusIfNew = statusIfNew;
  }


  public AddListMembers2 emailType(String emailType) {
    
    this.emailType = emailType;
    return this;
  }

   /**
   * Type of email this member asked to get (&#39;html&#39; or &#39;text&#39;).
   * @return emailType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailType() {
    return emailType;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailType(String emailType) {
    this.emailType = emailType;
  }


  public AddListMembers2 status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Subscriber&#39;s current status.
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public AddListMembers2 mergeFields(Map<String, Object> mergeFields) {
    
    this.mergeFields = mergeFields;
    return this;
  }

  public AddListMembers2 putMergeFieldsItem(String key, Object mergeFieldsItem) {
    if (this.mergeFields == null) {
      this.mergeFields = new HashMap<>();
    }
    this.mergeFields.put(key, mergeFieldsItem);
    return this;
  }

   /**
   * A dictionary of merge fields where the keys are the merge tags. See the [Merge Fields documentation](https://mailchimp.com/developer/marketing/docs/merge-fields/#structure) for more about the structure.
   * @return mergeFields
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERGE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getMergeFields() {
    return mergeFields;
  }


  @JsonProperty(JSON_PROPERTY_MERGE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMergeFields(Map<String, Object> mergeFields) {
    this.mergeFields = mergeFields;
  }


  public AddListMembers2 interests(Map<String, Boolean> interests) {
    
    this.interests = interests;
    return this;
  }

  public AddListMembers2 putInterestsItem(String key, Boolean interestsItem) {
    if (this.interests == null) {
      this.interests = new HashMap<>();
    }
    this.interests.put(key, interestsItem);
    return this;
  }

   /**
   * The key of this object&#39;s properties is the ID of the interest in question.
   * @return interests
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Boolean> getInterests() {
    return interests;
  }


  @JsonProperty(JSON_PROPERTY_INTERESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterests(Map<String, Boolean> interests) {
    this.interests = interests;
  }


  public AddListMembers2 language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * If set/detected, the [subscriber&#39;s language](https://mailchimp.com/help/view-and-edit-contact-languages/).
   * @return language
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }


  public AddListMembers2 vip(Boolean vip) {
    
    this.vip = vip;
    return this;
  }

   /**
   * [VIP status](https://mailchimp.com/help/designate-and-send-to-vip-contacts/) for subscriber.
   * @return vip
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVip() {
    return vip;
  }


  @JsonProperty(JSON_PROPERTY_VIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVip(Boolean vip) {
    this.vip = vip;
  }


  public AddListMembers2 location(Location location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Location getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(Location location) {
    this.location = location;
  }


  public AddListMembers2 marketingPermissions(List<MarketingPermission1> marketingPermissions) {
    
    this.marketingPermissions = marketingPermissions;
    return this;
  }

  public AddListMembers2 addMarketingPermissionsItem(MarketingPermission1 marketingPermissionsItem) {
    if (this.marketingPermissions == null) {
      this.marketingPermissions = new ArrayList<>();
    }
    this.marketingPermissions.add(marketingPermissionsItem);
    return this;
  }

   /**
   * The marketing permissions for the subscriber.
   * @return marketingPermissions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARKETING_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MarketingPermission1> getMarketingPermissions() {
    return marketingPermissions;
  }


  @JsonProperty(JSON_PROPERTY_MARKETING_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketingPermissions(List<MarketingPermission1> marketingPermissions) {
    this.marketingPermissions = marketingPermissions;
  }


  public AddListMembers2 ipSignup(String ipSignup) {
    
    this.ipSignup = ipSignup;
    return this;
  }

   /**
   * IP address the subscriber signed up from.
   * @return ipSignup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_SIGNUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpSignup() {
    return ipSignup;
  }


  @JsonProperty(JSON_PROPERTY_IP_SIGNUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpSignup(String ipSignup) {
    this.ipSignup = ipSignup;
  }


  public AddListMembers2 timestampSignup(OffsetDateTime timestampSignup) {
    
    this.timestampSignup = timestampSignup;
    return this;
  }

   /**
   * The date and time the subscriber signed up for the list in ISO 8601 format.
   * @return timestampSignup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_SIGNUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimestampSignup() {
    return timestampSignup;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP_SIGNUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestampSignup(OffsetDateTime timestampSignup) {
    this.timestampSignup = timestampSignup;
  }


  public AddListMembers2 ipOpt(String ipOpt) {
    
    this.ipOpt = ipOpt;
    return this;
  }

   /**
   * The IP address the subscriber used to confirm their opt-in status.
   * @return ipOpt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_OPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpOpt() {
    return ipOpt;
  }


  @JsonProperty(JSON_PROPERTY_IP_OPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpOpt(String ipOpt) {
    this.ipOpt = ipOpt;
  }


  public AddListMembers2 timestampOpt(OffsetDateTime timestampOpt) {
    
    this.timestampOpt = timestampOpt;
    return this;
  }

   /**
   * The date and time the subscriber confirmed their opt-in status in ISO 8601 format.
   * @return timestampOpt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_OPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimestampOpt() {
    return timestampOpt;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP_OPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestampOpt(OffsetDateTime timestampOpt) {
    this.timestampOpt = timestampOpt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddListMembers2 addListMembers2 = (AddListMembers2) o;
    return Objects.equals(this.emailAddress, addListMembers2.emailAddress) &&
        Objects.equals(this.statusIfNew, addListMembers2.statusIfNew) &&
        Objects.equals(this.emailType, addListMembers2.emailType) &&
        Objects.equals(this.status, addListMembers2.status) &&
        Objects.equals(this.mergeFields, addListMembers2.mergeFields) &&
        Objects.equals(this.interests, addListMembers2.interests) &&
        Objects.equals(this.language, addListMembers2.language) &&
        Objects.equals(this.vip, addListMembers2.vip) &&
        Objects.equals(this.location, addListMembers2.location) &&
        Objects.equals(this.marketingPermissions, addListMembers2.marketingPermissions) &&
        Objects.equals(this.ipSignup, addListMembers2.ipSignup) &&
        Objects.equals(this.timestampSignup, addListMembers2.timestampSignup) &&
        Objects.equals(this.ipOpt, addListMembers2.ipOpt) &&
        Objects.equals(this.timestampOpt, addListMembers2.timestampOpt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, statusIfNew, emailType, status, mergeFields, interests, language, vip, location, marketingPermissions, ipSignup, timestampSignup, ipOpt, timestampOpt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddListMembers2 {\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    statusIfNew: ").append(toIndentedString(statusIfNew)).append("\n");
    sb.append("    emailType: ").append(toIndentedString(emailType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    mergeFields: ").append(toIndentedString(mergeFields)).append("\n");
    sb.append("    interests: ").append(toIndentedString(interests)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    marketingPermissions: ").append(toIndentedString(marketingPermissions)).append("\n");
    sb.append("    ipSignup: ").append(toIndentedString(ipSignup)).append("\n");
    sb.append("    timestampSignup: ").append(toIndentedString(timestampSignup)).append("\n");
    sb.append("    ipOpt: ").append(toIndentedString(ipOpt)).append("\n");
    sb.append("    timestampOpt: ").append(toIndentedString(timestampOpt)).append("\n");
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

