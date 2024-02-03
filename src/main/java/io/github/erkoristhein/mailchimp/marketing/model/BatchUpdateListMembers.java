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
import io.github.erkoristhein.mailchimp.marketing.model.ErrorsInner;
import io.github.erkoristhein.mailchimp.marketing.model.ListMembers;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Batch update list members.
 */
@JsonPropertyOrder({
  BatchUpdateListMembers.JSON_PROPERTY_NEW_MEMBERS,
  BatchUpdateListMembers.JSON_PROPERTY_UPDATED_MEMBERS,
  BatchUpdateListMembers.JSON_PROPERTY_ERRORS,
  BatchUpdateListMembers.JSON_PROPERTY_TOTAL_CREATED,
  BatchUpdateListMembers.JSON_PROPERTY_TOTAL_UPDATED,
  BatchUpdateListMembers.JSON_PROPERTY_ERROR_COUNT,
  BatchUpdateListMembers.JSON_PROPERTY_LINKS
})
@JsonTypeName("Batch_update_List_members")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class BatchUpdateListMembers {
  public static final String JSON_PROPERTY_NEW_MEMBERS = "new_members";
  private List<ListMembers> newMembers;

  public static final String JSON_PROPERTY_UPDATED_MEMBERS = "updated_members";
  private List<ListMembers> updatedMembers;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<ErrorsInner> errors;

  public static final String JSON_PROPERTY_TOTAL_CREATED = "total_created";
  private Integer totalCreated;

  public static final String JSON_PROPERTY_TOTAL_UPDATED = "total_updated";
  private Integer totalUpdated;

  public static final String JSON_PROPERTY_ERROR_COUNT = "error_count";
  private Integer errorCount;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links;

  public BatchUpdateListMembers() {
  }

  @JsonCreator
  public BatchUpdateListMembers(
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.links = links;
  }

  public BatchUpdateListMembers newMembers(List<ListMembers> newMembers) {
    
    this.newMembers = newMembers;
    return this;
  }

  public BatchUpdateListMembers addNewMembersItem(ListMembers newMembersItem) {
    if (this.newMembers == null) {
      this.newMembers = new ArrayList<>();
    }
    this.newMembers.add(newMembersItem);
    return this;
  }

   /**
   * An array of objects, each representing a new member that was added to the list.
   * @return newMembers
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEW_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ListMembers> getNewMembers() {
    return newMembers;
  }


  @JsonProperty(JSON_PROPERTY_NEW_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewMembers(List<ListMembers> newMembers) {
    this.newMembers = newMembers;
  }


  public BatchUpdateListMembers updatedMembers(List<ListMembers> updatedMembers) {
    
    this.updatedMembers = updatedMembers;
    return this;
  }

  public BatchUpdateListMembers addUpdatedMembersItem(ListMembers updatedMembersItem) {
    if (this.updatedMembers == null) {
      this.updatedMembers = new ArrayList<>();
    }
    this.updatedMembers.add(updatedMembersItem);
    return this;
  }

   /**
   * An array of objects, each representing an existing list member whose subscription status was updated.
   * @return updatedMembers
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ListMembers> getUpdatedMembers() {
    return updatedMembers;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedMembers(List<ListMembers> updatedMembers) {
    this.updatedMembers = updatedMembers;
  }


  public BatchUpdateListMembers errors(List<ErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public BatchUpdateListMembers addErrorsItem(ErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * An array of objects, each representing an email address that could not be added to the list or updated and an error message providing more details.
   * @return errors
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ErrorsInner> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(List<ErrorsInner> errors) {
    this.errors = errors;
  }


  public BatchUpdateListMembers totalCreated(Integer totalCreated) {
    
    this.totalCreated = totalCreated;
    return this;
  }

   /**
   * The total number of items matching the query, irrespective of pagination.
   * @return totalCreated
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalCreated() {
    return totalCreated;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCreated(Integer totalCreated) {
    this.totalCreated = totalCreated;
  }


  public BatchUpdateListMembers totalUpdated(Integer totalUpdated) {
    
    this.totalUpdated = totalUpdated;
    return this;
  }

   /**
   * The total number of items matching the query, irrespective of pagination.
   * @return totalUpdated
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalUpdated() {
    return totalUpdated;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalUpdated(Integer totalUpdated) {
    this.totalUpdated = totalUpdated;
  }


  public BatchUpdateListMembers errorCount(Integer errorCount) {
    
    this.errorCount = errorCount;
    return this;
  }

   /**
   * The total number of items matching the query, irrespective of pagination.
   * @return errorCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getErrorCount() {
    return errorCount;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
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
    BatchUpdateListMembers batchUpdateListMembers = (BatchUpdateListMembers) o;
    return Objects.equals(this.newMembers, batchUpdateListMembers.newMembers) &&
        Objects.equals(this.updatedMembers, batchUpdateListMembers.updatedMembers) &&
        Objects.equals(this.errors, batchUpdateListMembers.errors) &&
        Objects.equals(this.totalCreated, batchUpdateListMembers.totalCreated) &&
        Objects.equals(this.totalUpdated, batchUpdateListMembers.totalUpdated) &&
        Objects.equals(this.errorCount, batchUpdateListMembers.errorCount) &&
        Objects.equals(this.links, batchUpdateListMembers.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newMembers, updatedMembers, errors, totalCreated, totalUpdated, errorCount, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchUpdateListMembers {\n");
    sb.append("    newMembers: ").append(toIndentedString(newMembers)).append("\n");
    sb.append("    updatedMembers: ").append(toIndentedString(updatedMembers)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    totalCreated: ").append(toIndentedString(totalCreated)).append("\n");
    sb.append("    totalUpdated: ").append(toIndentedString(totalUpdated)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
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
