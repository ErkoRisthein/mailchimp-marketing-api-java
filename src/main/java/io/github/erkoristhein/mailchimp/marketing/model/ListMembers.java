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
import io.github.erkoristhein.mailchimp.marketing.model.Location1;
import io.github.erkoristhein.mailchimp.marketing.model.Notes;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import io.github.erkoristhein.mailchimp.marketing.model.SubscriberStats;
import io.github.erkoristhein.mailchimp.marketing.model.TagsInner;
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
  ListMembers.JSON_PROPERTY_ID,
  ListMembers.JSON_PROPERTY_EMAIL_ADDRESS,
  ListMembers.JSON_PROPERTY_UNIQUE_EMAIL_ID,
  ListMembers.JSON_PROPERTY_EMAIL_TYPE,
  ListMembers.JSON_PROPERTY_STATUS,
  ListMembers.JSON_PROPERTY_MERGE_FIELDS,
  ListMembers.JSON_PROPERTY_INTERESTS,
  ListMembers.JSON_PROPERTY_STATS,
  ListMembers.JSON_PROPERTY_IP_SIGNUP,
  ListMembers.JSON_PROPERTY_TIMESTAMP_SIGNUP,
  ListMembers.JSON_PROPERTY_IP_OPT,
  ListMembers.JSON_PROPERTY_TIMESTAMP_OPT,
  ListMembers.JSON_PROPERTY_MEMBER_RATING,
  ListMembers.JSON_PROPERTY_LAST_CHANGED,
  ListMembers.JSON_PROPERTY_LANGUAGE,
  ListMembers.JSON_PROPERTY_VIP,
  ListMembers.JSON_PROPERTY_EMAIL_CLIENT,
  ListMembers.JSON_PROPERTY_LOCATION,
  ListMembers.JSON_PROPERTY_LAST_NOTE,
  ListMembers.JSON_PROPERTY_TAGS_COUNT,
  ListMembers.JSON_PROPERTY_TAGS,
  ListMembers.JSON_PROPERTY_LIST_ID,
  ListMembers.JSON_PROPERTY_LINKS
})
@JsonTypeName("List_Members")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class ListMembers {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "email_address";
  private String emailAddress;

  public static final String JSON_PROPERTY_UNIQUE_EMAIL_ID = "unique_email_id";
  private String uniqueEmailId;

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

  public static final String JSON_PROPERTY_STATS = "stats";
  private SubscriberStats stats;

  public static final String JSON_PROPERTY_IP_SIGNUP = "ip_signup";
  private String ipSignup;

  public static final String JSON_PROPERTY_TIMESTAMP_SIGNUP = "timestamp_signup";
  private OffsetDateTime timestampSignup;

  public static final String JSON_PROPERTY_IP_OPT = "ip_opt";
  private String ipOpt;

  public static final String JSON_PROPERTY_TIMESTAMP_OPT = "timestamp_opt";
  private OffsetDateTime timestampOpt;

  public static final String JSON_PROPERTY_MEMBER_RATING = "member_rating";
  private Integer memberRating;

  public static final String JSON_PROPERTY_LAST_CHANGED = "last_changed";
  private OffsetDateTime lastChanged;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_VIP = "vip";
  private Boolean vip;

  public static final String JSON_PROPERTY_EMAIL_CLIENT = "email_client";
  private String emailClient;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private Location1 location;

  public static final String JSON_PROPERTY_LAST_NOTE = "last_note";
  private Notes lastNote;

  public static final String JSON_PROPERTY_TAGS_COUNT = "tags_count";
  private Integer tagsCount;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<TagsInner> tags;

  public static final String JSON_PROPERTY_LIST_ID = "list_id";
  private String listId;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links;

  public ListMembers() {
  }

  @JsonCreator
  public ListMembers(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_UNIQUE_EMAIL_ID) String uniqueEmailId, 
    @JsonProperty(JSON_PROPERTY_IP_SIGNUP) String ipSignup, 
    @JsonProperty(JSON_PROPERTY_TIMESTAMP_SIGNUP) OffsetDateTime timestampSignup, 
    @JsonProperty(JSON_PROPERTY_IP_OPT) String ipOpt, 
    @JsonProperty(JSON_PROPERTY_TIMESTAMP_OPT) OffsetDateTime timestampOpt, 
    @JsonProperty(JSON_PROPERTY_MEMBER_RATING) Integer memberRating, 
    @JsonProperty(JSON_PROPERTY_LAST_CHANGED) OffsetDateTime lastChanged, 
    @JsonProperty(JSON_PROPERTY_EMAIL_CLIENT) String emailClient, 
    @JsonProperty(JSON_PROPERTY_TAGS_COUNT) Integer tagsCount, 
    @JsonProperty(JSON_PROPERTY_LIST_ID) String listId, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.id = id;
    this.uniqueEmailId = uniqueEmailId;
    this.ipSignup = ipSignup;
    this.timestampSignup = timestampSignup;
    this.ipOpt = ipOpt;
    this.timestampOpt = timestampOpt;
    this.memberRating = memberRating;
    this.lastChanged = lastChanged;
    this.emailClient = emailClient;
    this.tagsCount = tagsCount;
    this.listId = listId;
    this.links = links;
  }

   /**
   * The MD5 hash of the lowercase version of the list member&#39;s email address.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public ListMembers emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Email address for a subscriber.
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


   /**
   * An identifier for the address across all of Mailchimp.
   * @return uniqueEmailId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIQUE_EMAIL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniqueEmailId() {
    return uniqueEmailId;
  }




  public ListMembers emailType(String emailType) {
    
    this.emailType = emailType;
    return this;
  }

   /**
   * Type of email this member asked to get (&#39;html&#39; or &#39;text&#39;).
   * @return emailType
  **/
  @javax.annotation.Nullable
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


  public ListMembers status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Subscriber&#39;s current status.
   * @return status
  **/
  @javax.annotation.Nullable
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


  public ListMembers mergeFields(Map<String, Object> mergeFields) {
    
    this.mergeFields = mergeFields;
    return this;
  }

  public ListMembers putMergeFieldsItem(String key, Object mergeFieldsItem) {
    if (this.mergeFields == null) {
      this.mergeFields = new HashMap<>();
    }
    this.mergeFields.put(key, mergeFieldsItem);
    return this;
  }

   /**
   * An individual merge var and value for a member.
   * @return mergeFields
  **/
  @javax.annotation.Nullable
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


  public ListMembers interests(Map<String, Boolean> interests) {
    
    this.interests = interests;
    return this;
  }

  public ListMembers putInterestsItem(String key, Boolean interestsItem) {
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
  @javax.annotation.Nullable
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


  public ListMembers stats(SubscriberStats stats) {
    
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriberStats getStats() {
    return stats;
  }


  @JsonProperty(JSON_PROPERTY_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStats(SubscriberStats stats) {
    this.stats = stats;
  }


   /**
   * IP address the subscriber signed up from.
   * @return ipSignup
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_SIGNUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpSignup() {
    return ipSignup;
  }




   /**
   * The date and time the subscriber signed up for the list in ISO 8601 format.
   * @return timestampSignup
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_SIGNUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimestampSignup() {
    return timestampSignup;
  }




   /**
   * The IP address the subscriber used to confirm their opt-in status.
   * @return ipOpt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_OPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpOpt() {
    return ipOpt;
  }




   /**
   * The date and time the subscriber confirmed their opt-in status in ISO 8601 format.
   * @return timestampOpt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_OPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimestampOpt() {
    return timestampOpt;
  }




   /**
   * Star rating for this member, between 1 and 5.
   * @return memberRating
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMBER_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMemberRating() {
    return memberRating;
  }




   /**
   * The date and time the member&#39;s info was last changed in ISO 8601 format.
   * @return lastChanged
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_CHANGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastChanged() {
    return lastChanged;
  }




  public ListMembers language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * If set/detected, the [subscriber&#39;s language](https://mailchimp.com/help/view-and-edit-contact-languages/).
   * @return language
  **/
  @javax.annotation.Nullable
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


  public ListMembers vip(Boolean vip) {
    
    this.vip = vip;
    return this;
  }

   /**
   * [VIP status](https://mailchimp.com/help/designate-and-send-to-vip-contacts/) for subscriber.
   * @return vip
  **/
  @javax.annotation.Nullable
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


   /**
   * The list member&#39;s email client.
   * @return emailClient
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_CLIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailClient() {
    return emailClient;
  }




  public ListMembers location(Location1 location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Location1 getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(Location1 location) {
    this.location = location;
  }


  public ListMembers lastNote(Notes lastNote) {
    
    this.lastNote = lastNote;
    return this;
  }

   /**
   * Get lastNote
   * @return lastNote
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Notes getLastNote() {
    return lastNote;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastNote(Notes lastNote) {
    this.lastNote = lastNote;
  }


   /**
   * The number of tags applied to this member.
   * @return tagsCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTagsCount() {
    return tagsCount;
  }




  public ListMembers tags(List<TagsInner> tags) {
    
    this.tags = tags;
    return this;
  }

  public ListMembers addTagsItem(TagsInner tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags applied to this member.
   * @return tags
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TagsInner> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<TagsInner> tags) {
    this.tags = tags;
  }


   /**
   * The list id.
   * @return listId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getListId() {
    return listId;
  }




   /**
   * A list of link types and descriptions for the API schema documents.
   * @return links
  **/
  @javax.annotation.Nullable
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
    ListMembers listMembers = (ListMembers) o;
    return Objects.equals(this.id, listMembers.id) &&
        Objects.equals(this.emailAddress, listMembers.emailAddress) &&
        Objects.equals(this.uniqueEmailId, listMembers.uniqueEmailId) &&
        Objects.equals(this.emailType, listMembers.emailType) &&
        Objects.equals(this.status, listMembers.status) &&
        Objects.equals(this.mergeFields, listMembers.mergeFields) &&
        Objects.equals(this.interests, listMembers.interests) &&
        Objects.equals(this.stats, listMembers.stats) &&
        Objects.equals(this.ipSignup, listMembers.ipSignup) &&
        Objects.equals(this.timestampSignup, listMembers.timestampSignup) &&
        Objects.equals(this.ipOpt, listMembers.ipOpt) &&
        Objects.equals(this.timestampOpt, listMembers.timestampOpt) &&
        Objects.equals(this.memberRating, listMembers.memberRating) &&
        Objects.equals(this.lastChanged, listMembers.lastChanged) &&
        Objects.equals(this.language, listMembers.language) &&
        Objects.equals(this.vip, listMembers.vip) &&
        Objects.equals(this.emailClient, listMembers.emailClient) &&
        Objects.equals(this.location, listMembers.location) &&
        Objects.equals(this.lastNote, listMembers.lastNote) &&
        Objects.equals(this.tagsCount, listMembers.tagsCount) &&
        Objects.equals(this.tags, listMembers.tags) &&
        Objects.equals(this.listId, listMembers.listId) &&
        Objects.equals(this.links, listMembers.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, emailAddress, uniqueEmailId, emailType, status, mergeFields, interests, stats, ipSignup, timestampSignup, ipOpt, timestampOpt, memberRating, lastChanged, language, vip, emailClient, location, lastNote, tagsCount, tags, listId, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMembers {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    uniqueEmailId: ").append(toIndentedString(uniqueEmailId)).append("\n");
    sb.append("    emailType: ").append(toIndentedString(emailType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    mergeFields: ").append(toIndentedString(mergeFields)).append("\n");
    sb.append("    interests: ").append(toIndentedString(interests)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    ipSignup: ").append(toIndentedString(ipSignup)).append("\n");
    sb.append("    timestampSignup: ").append(toIndentedString(timestampSignup)).append("\n");
    sb.append("    ipOpt: ").append(toIndentedString(ipOpt)).append("\n");
    sb.append("    timestampOpt: ").append(toIndentedString(timestampOpt)).append("\n");
    sb.append("    memberRating: ").append(toIndentedString(memberRating)).append("\n");
    sb.append("    lastChanged: ").append(toIndentedString(lastChanged)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
    sb.append("    emailClient: ").append(toIndentedString(emailClient)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    lastNote: ").append(toIndentedString(lastNote)).append("\n");
    sb.append("    tagsCount: ").append(toIndentedString(tagsCount)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
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
