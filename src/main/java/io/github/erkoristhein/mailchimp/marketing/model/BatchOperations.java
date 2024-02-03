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
import io.github.erkoristhein.mailchimp.marketing.model.Batch;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A summary of batch requests that have been made.
 */
@JsonPropertyOrder({
  BatchOperations.JSON_PROPERTY_BATCHES,
  BatchOperations.JSON_PROPERTY_TOTAL_ITEMS,
  BatchOperations.JSON_PROPERTY_LINKS
})
@JsonTypeName("Batch_Operations")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class BatchOperations {
  public static final String JSON_PROPERTY_BATCHES = "batches";
  private List<Batch> batches;

  public static final String JSON_PROPERTY_TOTAL_ITEMS = "total_items";
  private Integer totalItems;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links;

  public BatchOperations() {
  }

  @JsonCreator
  public BatchOperations(
    @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS) Integer totalItems, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.totalItems = totalItems;
    this.links = links;
  }

  public BatchOperations batches(List<Batch> batches) {
    
    this.batches = batches;
    return this;
  }

  public BatchOperations addBatchesItem(Batch batchesItem) {
    if (this.batches == null) {
      this.batches = new ArrayList<>();
    }
    this.batches.add(batchesItem);
    return this;
  }

   /**
   * An array of objects representing batch calls.
   * @return batches
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Batch> getBatches() {
    return batches;
  }


  @JsonProperty(JSON_PROPERTY_BATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBatches(List<Batch> batches) {
    this.batches = batches;
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
    BatchOperations batchOperations = (BatchOperations) o;
    return Objects.equals(this.batches, batchOperations.batches) &&
        Objects.equals(this.totalItems, batchOperations.totalItems) &&
        Objects.equals(this.links, batchOperations.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batches, totalItems, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchOperations {\n");
    sb.append("    batches: ").append(toIndentedString(batches)).append("\n");
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

