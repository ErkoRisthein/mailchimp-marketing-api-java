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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Choose whether the campaign should use [Batch Delivery](https://mailchimp.com/help/schedule-batch-delivery/). Cannot be set to &#x60;true&#x60; for campaigns using [Timewarp](https://mailchimp.com/help/use-timewarp/).
 */
@JsonPropertyOrder({
  BatchDelivery.JSON_PROPERTY_BATCH_DELAY,
  BatchDelivery.JSON_PROPERTY_BATCH_COUNT
})
@JsonTypeName("Batch_Delivery")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class BatchDelivery {
  public static final String JSON_PROPERTY_BATCH_DELAY = "batch_delay";
  private Integer batchDelay;

  public static final String JSON_PROPERTY_BATCH_COUNT = "batch_count";
  private Integer batchCount;

  public BatchDelivery() {
  }

  public BatchDelivery batchDelay(Integer batchDelay) {
    
    this.batchDelay = batchDelay;
    return this;
  }

   /**
   * The delay, in minutes, between batches.
   * @return batchDelay
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BATCH_DELAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getBatchDelay() {
    return batchDelay;
  }


  @JsonProperty(JSON_PROPERTY_BATCH_DELAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBatchDelay(Integer batchDelay) {
    this.batchDelay = batchDelay;
  }


  public BatchDelivery batchCount(Integer batchCount) {
    
    this.batchCount = batchCount;
    return this;
  }

   /**
   * The number of batches for the campaign send.
   * @return batchCount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BATCH_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getBatchCount() {
    return batchCount;
  }


  @JsonProperty(JSON_PROPERTY_BATCH_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBatchCount(Integer batchCount) {
    this.batchCount = batchCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchDelivery batchDelivery = (BatchDelivery) o;
    return Objects.equals(this.batchDelay, batchDelivery.batchDelay) &&
        Objects.equals(this.batchCount, batchDelivery.batchCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchDelay, batchCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchDelivery {\n");
    sb.append("    batchDelay: ").append(toIndentedString(batchDelay)).append("\n");
    sb.append("    batchCount: ").append(toIndentedString(batchCount)).append("\n");
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
