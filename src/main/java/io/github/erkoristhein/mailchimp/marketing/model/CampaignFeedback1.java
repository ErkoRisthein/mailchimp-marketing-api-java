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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A specific feedback message from a specific campaign.
 */
@JsonPropertyOrder({
  CampaignFeedback1.JSON_PROPERTY_BLOCK_ID,
  CampaignFeedback1.JSON_PROPERTY_MESSAGE,
  CampaignFeedback1.JSON_PROPERTY_IS_COMPLETE
})
@JsonTypeName("Campaign_Feedback_1")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class CampaignFeedback1 {
  public static final String JSON_PROPERTY_BLOCK_ID = "block_id";
  private Integer blockId;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_IS_COMPLETE = "is_complete";
  private Boolean isComplete;

  public CampaignFeedback1() {
  }

  public CampaignFeedback1 blockId(Integer blockId) {
    
    this.blockId = blockId;
    return this;
  }

   /**
   * The block id for the editable block that the feedback addresses.
   * @return blockId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBlockId() {
    return blockId;
  }


  @JsonProperty(JSON_PROPERTY_BLOCK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockId(Integer blockId) {
    this.blockId = blockId;
  }


  public CampaignFeedback1 message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * The content of the feedback.
   * @return message
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(String message) {
    this.message = message;
  }


  public CampaignFeedback1 isComplete(Boolean isComplete) {
    
    this.isComplete = isComplete;
    return this;
  }

   /**
   * The status of feedback.
   * @return isComplete
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_COMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsComplete() {
    return isComplete;
  }


  @JsonProperty(JSON_PROPERTY_IS_COMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsComplete(Boolean isComplete) {
    this.isComplete = isComplete;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignFeedback1 campaignFeedback1 = (CampaignFeedback1) o;
    return Objects.equals(this.blockId, campaignFeedback1.blockId) &&
        Objects.equals(this.message, campaignFeedback1.message) &&
        Objects.equals(this.isComplete, campaignFeedback1.isComplete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockId, message, isComplete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignFeedback1 {\n");
    sb.append("    blockId: ").append(toIndentedString(blockId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    isComplete: ").append(toIndentedString(isComplete)).append("\n");
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

