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
import io.github.erkoristhein.mailchimp.marketing.model.AbuseComplaint;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A collection of abuse complaints for a specific list. An abuse complaint occurs when your recipient clicks to &#39;report spam&#39; in their email program.
 */
@JsonPropertyOrder({
  AbuseComplaints.JSON_PROPERTY_ABUSE_REPORTS,
  AbuseComplaints.JSON_PROPERTY_LIST_ID,
  AbuseComplaints.JSON_PROPERTY_TOTAL_ITEMS,
  AbuseComplaints.JSON_PROPERTY_LINKS
})
@JsonTypeName("Abuse_Complaints")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class AbuseComplaints {
  public static final String JSON_PROPERTY_ABUSE_REPORTS = "abuse_reports";
  private List<AbuseComplaint> abuseReports;

  public static final String JSON_PROPERTY_LIST_ID = "list_id";
  private String listId;

  public static final String JSON_PROPERTY_TOTAL_ITEMS = "total_items";
  private Integer totalItems;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links;

  public AbuseComplaints() {
  }

  @JsonCreator
  public AbuseComplaints(
    @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS) Integer totalItems, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.totalItems = totalItems;
    this.links = links;
  }

  public AbuseComplaints abuseReports(List<AbuseComplaint> abuseReports) {
    
    this.abuseReports = abuseReports;
    return this;
  }

  public AbuseComplaints addAbuseReportsItem(AbuseComplaint abuseReportsItem) {
    if (this.abuseReports == null) {
      this.abuseReports = new ArrayList<>();
    }
    this.abuseReports.add(abuseReportsItem);
    return this;
  }

   /**
   * An array of objects, each representing an abuse report resource.
   * @return abuseReports
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ABUSE_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AbuseComplaint> getAbuseReports() {
    return abuseReports;
  }


  @JsonProperty(JSON_PROPERTY_ABUSE_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbuseReports(List<AbuseComplaint> abuseReports) {
    this.abuseReports = abuseReports;
  }


  public AbuseComplaints listId(String listId) {
    
    this.listId = listId;
    return this;
  }

   /**
   * The list id for the abuse report.
   * @return listId
  **/
  @javax.annotation.Nullable
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
    AbuseComplaints abuseComplaints = (AbuseComplaints) o;
    return Objects.equals(this.abuseReports, abuseComplaints.abuseReports) &&
        Objects.equals(this.listId, abuseComplaints.listId) &&
        Objects.equals(this.totalItems, abuseComplaints.totalItems) &&
        Objects.equals(this.links, abuseComplaints.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abuseReports, listId, totalItems, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbuseComplaints {\n");
    sb.append("    abuseReports: ").append(toIndentedString(abuseReports)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
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
