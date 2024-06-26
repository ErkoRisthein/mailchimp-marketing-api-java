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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An object representing all segmentation options. This object should contain a &#x60;saved_segment_id&#x60; to use an existing segment, or you can create a new segment by including both &#x60;match&#x60; and &#x60;conditions&#x60; options.
 */
@JsonPropertyOrder({
  SegmentOptions1.JSON_PROPERTY_SAVED_SEGMENT_ID,
  SegmentOptions1.JSON_PROPERTY_PREBUILT_SEGMENT_ID,
  SegmentOptions1.JSON_PROPERTY_MATCH,
  SegmentOptions1.JSON_PROPERTY_CONDITIONS
})
@JsonTypeName("Segment_Options_1")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class SegmentOptions1 {
  public static final String JSON_PROPERTY_SAVED_SEGMENT_ID = "saved_segment_id";
  private Integer savedSegmentId;

  public static final String JSON_PROPERTY_PREBUILT_SEGMENT_ID = "prebuilt_segment_id";
  private String prebuiltSegmentId;

  /**
   * Segment match type.
   */
  public enum MatchEnum {
    ANY("any"),
    
    ALL("all");

    private String value;

    MatchEnum(String value) {
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
    public static MatchEnum fromValue(String value) {
      for (MatchEnum b : MatchEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MATCH = "match";
  private MatchEnum match;

  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  private List<Object> conditions = new ArrayList<>();

  public SegmentOptions1() {
  }

  public SegmentOptions1 savedSegmentId(Integer savedSegmentId) {
    
    this.savedSegmentId = savedSegmentId;
    return this;
  }

   /**
   * The id for an existing saved segment.
   * @return savedSegmentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAVED_SEGMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSavedSegmentId() {
    return savedSegmentId;
  }


  @JsonProperty(JSON_PROPERTY_SAVED_SEGMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSavedSegmentId(Integer savedSegmentId) {
    this.savedSegmentId = savedSegmentId;
  }


  public SegmentOptions1 prebuiltSegmentId(String prebuiltSegmentId) {
    
    this.prebuiltSegmentId = prebuiltSegmentId;
    return this;
  }

   /**
   * The prebuilt segment id, if a prebuilt segment has been designated for this campaign.
   * @return prebuiltSegmentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREBUILT_SEGMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrebuiltSegmentId() {
    return prebuiltSegmentId;
  }


  @JsonProperty(JSON_PROPERTY_PREBUILT_SEGMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrebuiltSegmentId(String prebuiltSegmentId) {
    this.prebuiltSegmentId = prebuiltSegmentId;
  }


  public SegmentOptions1 match(MatchEnum match) {
    
    this.match = match;
    return this;
  }

   /**
   * Segment match type.
   * @return match
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MatchEnum getMatch() {
    return match;
  }


  @JsonProperty(JSON_PROPERTY_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatch(MatchEnum match) {
    this.match = match;
  }


  public SegmentOptions1 conditions(List<Object> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public SegmentOptions1 addConditionsItem(Object conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Segment match conditions. There are multiple possible types, see the [condition types documentation](https://mailchimp.com/developer/marketing/docs/alternative-schemas/#segment-condition-schemas).
   * @return conditions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getConditions() {
    return conditions;
  }


  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConditions(List<Object> conditions) {
    this.conditions = conditions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentOptions1 segmentOptions1 = (SegmentOptions1) o;
    return Objects.equals(this.savedSegmentId, segmentOptions1.savedSegmentId) &&
        Objects.equals(this.prebuiltSegmentId, segmentOptions1.prebuiltSegmentId) &&
        Objects.equals(this.match, segmentOptions1.match) &&
        Objects.equals(this.conditions, segmentOptions1.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savedSegmentId, prebuiltSegmentId, match, conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentOptions1 {\n");
    sb.append("    savedSegmentId: ").append(toIndentedString(savedSegmentId)).append("\n");
    sb.append("    prebuiltSegmentId: ").append(toIndentedString(prebuiltSegmentId)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

