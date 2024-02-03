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
import io.github.erkoristhein.mailchimp.marketing.model.SurveyQuestionAnswer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetReportingSurveysIdQuestionsIdAnswers200Response
 */
@JsonPropertyOrder({
  GetReportingSurveysIdQuestionsIdAnswers200Response.JSON_PROPERTY_ANSWERS,
  GetReportingSurveysIdQuestionsIdAnswers200Response.JSON_PROPERTY_TOTAL_ITEMS,
  GetReportingSurveysIdQuestionsIdAnswers200Response.JSON_PROPERTY_LINKS
})
@JsonTypeName("getReportingSurveysIdQuestionsIdAnswers_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class GetReportingSurveysIdQuestionsIdAnswers200Response {
  public static final String JSON_PROPERTY_ANSWERS = "answers";
  private List<SurveyQuestionAnswer> answers;

  public static final String JSON_PROPERTY_TOTAL_ITEMS = "total_items";
  private Integer totalItems;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links;

  public GetReportingSurveysIdQuestionsIdAnswers200Response() {
  }

  @JsonCreator
  public GetReportingSurveysIdQuestionsIdAnswers200Response(
    @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS) Integer totalItems, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.totalItems = totalItems;
    this.links = links;
  }

  public GetReportingSurveysIdQuestionsIdAnswers200Response answers(List<SurveyQuestionAnswer> answers) {
    
    this.answers = answers;
    return this;
  }

  public GetReportingSurveysIdQuestionsIdAnswers200Response addAnswersItem(SurveyQuestionAnswer answersItem) {
    if (this.answers == null) {
      this.answers = new ArrayList<>();
    }
    this.answers.add(answersItem);
    return this;
  }

   /**
   * An array of answers for a question on the survey.
   * @return answers
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANSWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SurveyQuestionAnswer> getAnswers() {
    return answers;
  }


  @JsonProperty(JSON_PROPERTY_ANSWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnswers(List<SurveyQuestionAnswer> answers) {
    this.answers = answers;
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
    GetReportingSurveysIdQuestionsIdAnswers200Response getReportingSurveysIdQuestionsIdAnswers200Response = (GetReportingSurveysIdQuestionsIdAnswers200Response) o;
    return Objects.equals(this.answers, getReportingSurveysIdQuestionsIdAnswers200Response.answers) &&
        Objects.equals(this.totalItems, getReportingSurveysIdQuestionsIdAnswers200Response.totalItems) &&
        Objects.equals(this.links, getReportingSurveysIdQuestionsIdAnswers200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answers, totalItems, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReportingSurveysIdQuestionsIdAnswers200Response {\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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
