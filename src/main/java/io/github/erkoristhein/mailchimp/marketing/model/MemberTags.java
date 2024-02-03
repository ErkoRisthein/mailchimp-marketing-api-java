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
import io.github.erkoristhein.mailchimp.marketing.model.MemberTag;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A list of tags assigned to a list member.
 */
@JsonPropertyOrder({
  MemberTags.JSON_PROPERTY_TAGS,
  MemberTags.JSON_PROPERTY_IS_SYNCING
})
@JsonTypeName("Member_Tags")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class MemberTags {
  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<MemberTag> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_IS_SYNCING = "is_syncing";
  private Boolean isSyncing;

  public MemberTags() {
  }

  public MemberTags tags(List<MemberTag> tags) {
    
    this.tags = tags;
    return this;
  }

  public MemberTags addTagsItem(MemberTag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of tags assigned to the list member.
   * @return tags
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<MemberTag> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTags(List<MemberTag> tags) {
    this.tags = tags;
  }


  public MemberTags isSyncing(Boolean isSyncing) {
    
    this.isSyncing = isSyncing;
    return this;
  }

   /**
   * When is_syncing is true, automations based on the tags in the request will not fire
   * @return isSyncing
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_SYNCING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsSyncing() {
    return isSyncing;
  }


  @JsonProperty(JSON_PROPERTY_IS_SYNCING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsSyncing(Boolean isSyncing) {
    this.isSyncing = isSyncing;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberTags memberTags = (MemberTags) o;
    return Objects.equals(this.tags, memberTags.tags) &&
        Objects.equals(this.isSyncing, memberTags.isSyncing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, isSyncing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberTags {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    isSyncing: ").append(toIndentedString(isSyncing)).append("\n");
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
