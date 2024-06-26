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
import io.github.erkoristhein.mailchimp.marketing.model.SegmentOptions1;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * List settings for the campaign.
 */
@JsonPropertyOrder({
  List3.JSON_PROPERTY_LIST_ID,
  List3.JSON_PROPERTY_LIST_IS_ACTIVE,
  List3.JSON_PROPERTY_LIST_NAME,
  List3.JSON_PROPERTY_SEGMENT_TEXT,
  List3.JSON_PROPERTY_RECIPIENT_COUNT,
  List3.JSON_PROPERTY_SEGMENT_OPTS
})
@JsonTypeName("List_3")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class List3 {
  public static final String JSON_PROPERTY_LIST_ID = "list_id";
  private String listId;

  public static final String JSON_PROPERTY_LIST_IS_ACTIVE = "list_is_active";
  private Boolean listIsActive;

  public static final String JSON_PROPERTY_LIST_NAME = "list_name";
  private String listName;

  public static final String JSON_PROPERTY_SEGMENT_TEXT = "segment_text";
  private String segmentText;

  public static final String JSON_PROPERTY_RECIPIENT_COUNT = "recipient_count";
  private Integer recipientCount;

  public static final String JSON_PROPERTY_SEGMENT_OPTS = "segment_opts";
  private SegmentOptions1 segmentOpts;

  public List3() {
  }

  @JsonCreator
  public List3(
    @JsonProperty(JSON_PROPERTY_LIST_IS_ACTIVE) Boolean listIsActive, 
    @JsonProperty(JSON_PROPERTY_LIST_NAME) String listName, 
    @JsonProperty(JSON_PROPERTY_SEGMENT_TEXT) String segmentText, 
    @JsonProperty(JSON_PROPERTY_RECIPIENT_COUNT) Integer recipientCount
  ) {
    this();
    this.listIsActive = listIsActive;
    this.listName = listName;
    this.segmentText = segmentText;
    this.recipientCount = recipientCount;
  }

  public List3 listId(String listId) {
    
    this.listId = listId;
    return this;
  }

   /**
   * The unique list id.
   * @return listId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getListId() {
    return listId;
  }


  @JsonProperty(JSON_PROPERTY_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListId(String listId) {
    this.listId = listId;
  }


   /**
   * The status of the list used, namely if it&#39;s deleted or disabled.
   * @return listIsActive
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getListIsActive() {
    return listIsActive;
  }




   /**
   * The name of the list.
   * @return listName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getListName() {
    return listName;
  }




   /**
   * A description of the [segment](https://mailchimp.com/help/create-and-send-to-a-segment/) used for the campaign. Formatted as a string marked up with HTML.
   * @return segmentText
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEGMENT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSegmentText() {
    return segmentText;
  }




   /**
   * Count of the recipients on the associated list. Formatted as an integer.
   * @return recipientCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRecipientCount() {
    return recipientCount;
  }




  public List3 segmentOpts(SegmentOptions1 segmentOpts) {
    
    this.segmentOpts = segmentOpts;
    return this;
  }

   /**
   * Get segmentOpts
   * @return segmentOpts
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEGMENT_OPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SegmentOptions1 getSegmentOpts() {
    return segmentOpts;
  }


  @JsonProperty(JSON_PROPERTY_SEGMENT_OPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSegmentOpts(SegmentOptions1 segmentOpts) {
    this.segmentOpts = segmentOpts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    List3 list3 = (List3) o;
    return Objects.equals(this.listId, list3.listId) &&
        Objects.equals(this.listIsActive, list3.listIsActive) &&
        Objects.equals(this.listName, list3.listName) &&
        Objects.equals(this.segmentText, list3.segmentText) &&
        Objects.equals(this.recipientCount, list3.recipientCount) &&
        Objects.equals(this.segmentOpts, list3.segmentOpts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listId, listIsActive, listName, segmentText, recipientCount, segmentOpts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class List3 {\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    listIsActive: ").append(toIndentedString(listIsActive)).append("\n");
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
    sb.append("    segmentText: ").append(toIndentedString(segmentText)).append("\n");
    sb.append("    recipientCount: ").append(toIndentedString(recipientCount)).append("\n");
    sb.append("    segmentOpts: ").append(toIndentedString(segmentOpts)).append("\n");
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

