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
import io.github.erkoristhein.mailchimp.marketing.model.MemberActivity1;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A list of a member&#39;s opens activity in a specific campaign.
 */
@JsonPropertyOrder({
  OpenActivity.JSON_PROPERTY_CAMPAIGN_ID,
  OpenActivity.JSON_PROPERTY_LIST_ID,
  OpenActivity.JSON_PROPERTY_LIST_IS_ACTIVE,
  OpenActivity.JSON_PROPERTY_CONTACT_STATUS,
  OpenActivity.JSON_PROPERTY_EMAIL_ID,
  OpenActivity.JSON_PROPERTY_EMAIL_ADDRESS,
  OpenActivity.JSON_PROPERTY_MERGE_FIELDS,
  OpenActivity.JSON_PROPERTY_VIP,
  OpenActivity.JSON_PROPERTY_OPENS_COUNT,
  OpenActivity.JSON_PROPERTY_OPENS,
  OpenActivity.JSON_PROPERTY_LINKS
})
@JsonTypeName("Open_Activity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class OpenActivity {
  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaign_id";
  private String campaignId;

  public static final String JSON_PROPERTY_LIST_ID = "list_id";
  private String listId;

  public static final String JSON_PROPERTY_LIST_IS_ACTIVE = "list_is_active";
  private Boolean listIsActive;

  public static final String JSON_PROPERTY_CONTACT_STATUS = "contact_status";
  private String contactStatus;

  public static final String JSON_PROPERTY_EMAIL_ID = "email_id";
  private String emailId;

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "email_address";
  private String emailAddress;

  public static final String JSON_PROPERTY_MERGE_FIELDS = "merge_fields";
  private Map<String, Object> mergeFields = new HashMap<>();

  public static final String JSON_PROPERTY_VIP = "vip";
  private Boolean vip;

  public static final String JSON_PROPERTY_OPENS_COUNT = "opens_count";
  private Integer opensCount;

  public static final String JSON_PROPERTY_OPENS = "opens";
  private List<MemberActivity1> opens;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links;

  public OpenActivity() {
  }

  @JsonCreator
  public OpenActivity(
    @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID) String campaignId, 
    @JsonProperty(JSON_PROPERTY_LIST_ID) String listId, 
    @JsonProperty(JSON_PROPERTY_LIST_IS_ACTIVE) Boolean listIsActive, 
    @JsonProperty(JSON_PROPERTY_CONTACT_STATUS) String contactStatus, 
    @JsonProperty(JSON_PROPERTY_EMAIL_ID) String emailId, 
    @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS) String emailAddress, 
    @JsonProperty(JSON_PROPERTY_VIP) Boolean vip, 
    @JsonProperty(JSON_PROPERTY_OPENS_COUNT) Integer opensCount, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.campaignId = campaignId;
    this.listId = listId;
    this.listIsActive = listIsActive;
    this.contactStatus = contactStatus;
    this.emailId = emailId;
    this.emailAddress = emailAddress;
    this.vip = vip;
    this.opensCount = opensCount;
    this.links = links;
  }

   /**
   * The unique id for the campaign.
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignId() {
    return campaignId;
  }




   /**
   * The unique id for the list.
   * @return listId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getListId() {
    return listId;
  }




   /**
   * The status of the list used, namely if it&#39;s deleted or disabled.
   * @return listIsActive
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getListIsActive() {
    return listIsActive;
  }




   /**
   * The status of the member, namely if they are subscribed, unsubscribed, deleted, non-subscribed, transactional, pending, or need reconfirmation.
   * @return contactStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactStatus() {
    return contactStatus;
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
   * Email address for a subscriber.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }




  public OpenActivity mergeFields(Map<String, Object> mergeFields) {
    
    this.mergeFields = mergeFields;
    return this;
  }

  public OpenActivity putMergeFieldsItem(String key, Object mergeFieldsItem) {
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




   /**
   * The total number of times the this campaign was opened by the list member.
   * @return opensCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOpensCount() {
    return opensCount;
  }




  public OpenActivity opens(List<MemberActivity1> opens) {
    
    this.opens = opens;
    return this;
  }

  public OpenActivity addOpensItem(MemberActivity1 opensItem) {
    if (this.opens == null) {
      this.opens = new ArrayList<>();
    }
    this.opens.add(opensItem);
    return this;
  }

   /**
   * An array of timestamps for each time a list member opened the campaign. If a list member opens an email multiple times, this will return a separate timestamp for each open event.
   * @return opens
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MemberActivity1> getOpens() {
    return opens;
  }


  @JsonProperty(JSON_PROPERTY_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpens(List<MemberActivity1> opens) {
    this.opens = opens;
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
    OpenActivity openActivity = (OpenActivity) o;
    return Objects.equals(this.campaignId, openActivity.campaignId) &&
        Objects.equals(this.listId, openActivity.listId) &&
        Objects.equals(this.listIsActive, openActivity.listIsActive) &&
        Objects.equals(this.contactStatus, openActivity.contactStatus) &&
        Objects.equals(this.emailId, openActivity.emailId) &&
        Objects.equals(this.emailAddress, openActivity.emailAddress) &&
        Objects.equals(this.mergeFields, openActivity.mergeFields) &&
        Objects.equals(this.vip, openActivity.vip) &&
        Objects.equals(this.opensCount, openActivity.opensCount) &&
        Objects.equals(this.opens, openActivity.opens) &&
        Objects.equals(this.links, openActivity.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, listId, listIsActive, contactStatus, emailId, emailAddress, mergeFields, vip, opensCount, opens, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenActivity {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    listIsActive: ").append(toIndentedString(listIsActive)).append("\n");
    sb.append("    contactStatus: ").append(toIndentedString(contactStatus)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    mergeFields: ").append(toIndentedString(mergeFields)).append("\n");
    sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
    sb.append("    opensCount: ").append(toIndentedString(opensCount)).append("\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
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
