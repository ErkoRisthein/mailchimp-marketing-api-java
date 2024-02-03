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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Creates an account export with the given parameters.
 */
@JsonPropertyOrder({
  CreateAnAccountExport.JSON_PROPERTY_INCLUDE_STAGES,
  CreateAnAccountExport.JSON_PROPERTY_SINCE_TIMESTAMP
})
@JsonTypeName("Create_an_account_export")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class CreateAnAccountExport {
  /**
   * Gets or Sets includeStages
   */
  public enum IncludeStagesEnum {
    AUDIENCES("audiences"),
    
    CAMPAIGNS("campaigns"),
    
    EVENTS("events"),
    
    GALLERY_FILES("gallery_files"),
    
    REPORTS("reports"),
    
    TEMPLATES("templates");

    private String value;

    IncludeStagesEnum(String value) {
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
    public static IncludeStagesEnum fromValue(String value) {
      for (IncludeStagesEnum b : IncludeStagesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INCLUDE_STAGES = "include_stages";
  private List<IncludeStagesEnum> includeStages = new ArrayList<>();

  public static final String JSON_PROPERTY_SINCE_TIMESTAMP = "since_timestamp";
  private OffsetDateTime sinceTimestamp;

  public CreateAnAccountExport() {
  }

  public CreateAnAccountExport includeStages(List<IncludeStagesEnum> includeStages) {
    
    this.includeStages = includeStages;
    return this;
  }

  public CreateAnAccountExport addIncludeStagesItem(IncludeStagesEnum includeStagesItem) {
    if (this.includeStages == null) {
      this.includeStages = new ArrayList<>();
    }
    this.includeStages.add(includeStagesItem);
    return this;
  }

   /**
   * The stages of an account export to include.
   * @return includeStages
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INCLUDE_STAGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<IncludeStagesEnum> getIncludeStages() {
    return includeStages;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_STAGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludeStages(List<IncludeStagesEnum> includeStages) {
    this.includeStages = includeStages;
  }


  public CreateAnAccountExport sinceTimestamp(OffsetDateTime sinceTimestamp) {
    
    this.sinceTimestamp = sinceTimestamp;
    return this;
  }

   /**
   * An ISO 8601 date that will limit the export to only records created after a given time. For instance, the reports stage will contain any campaign sent after the given timestamp. Audiences, however, are excluded from this limit.
   * @return sinceTimestamp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SINCE_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSinceTimestamp() {
    return sinceTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_SINCE_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSinceTimestamp(OffsetDateTime sinceTimestamp) {
    this.sinceTimestamp = sinceTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAnAccountExport createAnAccountExport = (CreateAnAccountExport) o;
    return Objects.equals(this.includeStages, createAnAccountExport.includeStages) &&
        Objects.equals(this.sinceTimestamp, createAnAccountExport.sinceTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeStages, sinceTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAnAccountExport {\n");
    sb.append("    includeStages: ").append(toIndentedString(includeStages)).append("\n");
    sb.append("    sinceTimestamp: ").append(toIndentedString(sinceTimestamp)).append("\n");
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
