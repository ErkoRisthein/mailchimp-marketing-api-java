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
  List6.JSON_PROPERTY_LIST_ID,
  List6.JSON_PROPERTY_LIST_NAME,
  List6.JSON_PROPERTY_SEGMENT_TEXT,
  List6.JSON_PROPERTY_RECIPIENT_COUNT,
  List6.JSON_PROPERTY_SEGMENT_OPTS
})
@JsonTypeName("List_6")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class List6 {
  public static final String JSON_PROPERTY_LIST_ID = "list_id";
  private String listId;

  public static final String JSON_PROPERTY_LIST_NAME = "list_name";
  private String listName;

  public static final String JSON_PROPERTY_SEGMENT_TEXT = "segment_text";
  private String segmentText;

  public static final String JSON_PROPERTY_RECIPIENT_COUNT = "recipient_count";
  private Integer recipientCount;

  public static final String JSON_PROPERTY_SEGMENT_OPTS = "segment_opts";
  private SegmentOptions1 segmentOpts;

  public List6() {
  }

  @JsonCreator
  public List6(
    @JsonProperty(JSON_PROPERTY_LIST_NAME) String listName, 
    @JsonProperty(JSON_PROPERTY_SEGMENT_TEXT) String segmentText, 
    @JsonProperty(JSON_PROPERTY_RECIPIENT_COUNT) Integer recipientCount
  ) {
    this();
    this.listName = listName;
    this.segmentText = segmentText;
    this.recipientCount = recipientCount;
  }

  public List6 listId(String listId) {
    
    this.listId = listId;
    return this;
  }

   /**
   * The unique list id.
   * @return listId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getListId() {
    return listId;
  }


  @JsonProperty(JSON_PROPERTY_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setListId(String listId) {
    this.listId = listId;
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
   * A description of the [segment](https://mailchimp.com/help/save-and-manage-segments/) used for the campaign. Formatted as a string marked up with HTML.
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




  public List6 segmentOpts(SegmentOptions1 segmentOpts) {
    
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
    List6 list6 = (List6) o;
    return Objects.equals(this.listId, list6.listId) &&
        Objects.equals(this.listName, list6.listName) &&
        Objects.equals(this.segmentText, list6.segmentText) &&
        Objects.equals(this.recipientCount, list6.recipientCount) &&
        Objects.equals(this.segmentOpts, list6.segmentOpts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listId, listName, segmentText, recipientCount, segmentOpts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class List6 {\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
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

