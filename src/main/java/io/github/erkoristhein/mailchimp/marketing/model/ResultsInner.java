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
import io.github.erkoristhein.mailchimp.marketing.model.Campaign;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ResultsInner
 */
@JsonPropertyOrder({
  ResultsInner.JSON_PROPERTY_CAMPAIGN,
  ResultsInner.JSON_PROPERTY_SNIPPET
})
@JsonTypeName("Results_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class ResultsInner {
  public static final String JSON_PROPERTY_CAMPAIGN = "campaign";
  private Campaign campaign;

  public static final String JSON_PROPERTY_SNIPPET = "snippet";
  private String snippet;

  public ResultsInner() {
  }

  public ResultsInner campaign(Campaign campaign) {
    
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Campaign getCampaign() {
    return campaign;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaign(Campaign campaign) {
    this.campaign = campaign;
  }


  public ResultsInner snippet(String snippet) {
    
    this.snippet = snippet;
    return this;
  }

   /**
   * Get snippet
   * @return snippet
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNIPPET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSnippet() {
    return snippet;
  }


  @JsonProperty(JSON_PROPERTY_SNIPPET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnippet(String snippet) {
    this.snippet = snippet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultsInner resultsInner = (ResultsInner) o;
    return Objects.equals(this.campaign, resultsInner.campaign) &&
        Objects.equals(this.snippet, resultsInner.snippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, snippet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultsInner {\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
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
