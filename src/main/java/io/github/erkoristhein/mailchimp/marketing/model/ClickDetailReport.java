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
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A list of URLs and unique IDs included in HTML and plain-text versions of a campaign.
 */
@JsonPropertyOrder({
  ClickDetailReport.JSON_PROPERTY_URLS_CLICKED,
  ClickDetailReport.JSON_PROPERTY_CAMPAIGN_ID,
  ClickDetailReport.JSON_PROPERTY_TOTAL_ITEMS,
  ClickDetailReport.JSON_PROPERTY_LINKS
})
@JsonTypeName("Click_Detail_Report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class ClickDetailReport {
  public static final String JSON_PROPERTY_URLS_CLICKED = "urls_clicked";
  private List<ClickDetailReport> urlsClicked;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaign_id";
  private String campaignId;

  public static final String JSON_PROPERTY_TOTAL_ITEMS = "total_items";
  private Integer totalItems;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links;

  public ClickDetailReport() {
  }

  @JsonCreator
  public ClickDetailReport(
    @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID) String campaignId, 
    @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS) Integer totalItems, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.campaignId = campaignId;
    this.totalItems = totalItems;
    this.links = links;
  }

  public ClickDetailReport urlsClicked(List<ClickDetailReport> urlsClicked) {
    
    this.urlsClicked = urlsClicked;
    return this;
  }

  public ClickDetailReport addUrlsClickedItem(ClickDetailReport urlsClickedItem) {
    if (this.urlsClicked == null) {
      this.urlsClicked = new ArrayList<>();
    }
    this.urlsClicked.add(urlsClickedItem);
    return this;
  }

   /**
   * An array of objects, each representing a specific URL contained in the campaign.
   * @return urlsClicked
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URLS_CLICKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ClickDetailReport> getUrlsClicked() {
    return urlsClicked;
  }


  @JsonProperty(JSON_PROPERTY_URLS_CLICKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlsClicked(List<ClickDetailReport> urlsClicked) {
    this.urlsClicked = urlsClicked;
  }


   /**
   * The campaign id.
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignId() {
    return campaignId;
  }




   /**
   * The total number of items matching the query regardless of pagination.
   * @return totalItems
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalItems() {
    return totalItems;
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
    ClickDetailReport clickDetailReport = (ClickDetailReport) o;
    return Objects.equals(this.urlsClicked, clickDetailReport.urlsClicked) &&
        Objects.equals(this.campaignId, clickDetailReport.campaignId) &&
        Objects.equals(this.totalItems, clickDetailReport.totalItems) &&
        Objects.equals(this.links, clickDetailReport.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlsClicked, campaignId, totalItems, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickDetailReport {\n");
    sb.append("    urlsClicked: ").append(toIndentedString(urlsClicked)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
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

