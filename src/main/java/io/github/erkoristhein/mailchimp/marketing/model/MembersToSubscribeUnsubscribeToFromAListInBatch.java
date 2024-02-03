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
import io.github.erkoristhein.mailchimp.marketing.model.AddListMembers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Members to subscribe to or unsubscribe from a list.
 */
@JsonPropertyOrder({
  MembersToSubscribeUnsubscribeToFromAListInBatch.JSON_PROPERTY_MEMBERS,
  MembersToSubscribeUnsubscribeToFromAListInBatch.JSON_PROPERTY_SYNC_TAGS,
  MembersToSubscribeUnsubscribeToFromAListInBatch.JSON_PROPERTY_UPDATE_EXISTING
})
@JsonTypeName("Members_to_Subscribe_Unsubscribe_to_from_a_List_in_batch")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class MembersToSubscribeUnsubscribeToFromAListInBatch {
  public static final String JSON_PROPERTY_MEMBERS = "members";
  private List<AddListMembers> members = new ArrayList<>();

  public static final String JSON_PROPERTY_SYNC_TAGS = "sync_tags";
  private Boolean syncTags;

  public static final String JSON_PROPERTY_UPDATE_EXISTING = "update_existing";
  private Boolean updateExisting;

  public MembersToSubscribeUnsubscribeToFromAListInBatch() {
  }

  public MembersToSubscribeUnsubscribeToFromAListInBatch members(List<AddListMembers> members) {
    
    this.members = members;
    return this;
  }

  public MembersToSubscribeUnsubscribeToFromAListInBatch addMembersItem(AddListMembers membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * An array of objects, each representing an email address and the subscription status for a specific list. Up to 500 members may be added or updated with each API call.
   * @return members
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AddListMembers> getMembers() {
    return members;
  }


  @JsonProperty(JSON_PROPERTY_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMembers(List<AddListMembers> members) {
    this.members = members;
  }


  public MembersToSubscribeUnsubscribeToFromAListInBatch syncTags(Boolean syncTags) {
    
    this.syncTags = syncTags;
    return this;
  }

   /**
   * Whether this batch operation will replace all existing tags with tags in request.
   * @return syncTags
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNC_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSyncTags() {
    return syncTags;
  }


  @JsonProperty(JSON_PROPERTY_SYNC_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSyncTags(Boolean syncTags) {
    this.syncTags = syncTags;
  }


  public MembersToSubscribeUnsubscribeToFromAListInBatch updateExisting(Boolean updateExisting) {
    
    this.updateExisting = updateExisting;
    return this;
  }

   /**
   * Whether this batch operation will change existing members&#39; subscription status.
   * @return updateExisting
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_EXISTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUpdateExisting() {
    return updateExisting;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_EXISTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateExisting(Boolean updateExisting) {
    this.updateExisting = updateExisting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MembersToSubscribeUnsubscribeToFromAListInBatch membersToSubscribeUnsubscribeToFromAListInBatch = (MembersToSubscribeUnsubscribeToFromAListInBatch) o;
    return Objects.equals(this.members, membersToSubscribeUnsubscribeToFromAListInBatch.members) &&
        Objects.equals(this.syncTags, membersToSubscribeUnsubscribeToFromAListInBatch.syncTags) &&
        Objects.equals(this.updateExisting, membersToSubscribeUnsubscribeToFromAListInBatch.updateExisting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members, syncTags, updateExisting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembersToSubscribeUnsubscribeToFromAListInBatch {\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    syncTags: ").append(toIndentedString(syncTags)).append("\n");
    sb.append("    updateExisting: ").append(toIndentedString(updateExisting)).append("\n");
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
